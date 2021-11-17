package com.extra.something.app;

import software.constructs.Construct;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import imports.k8s.IntOrString;
import imports.k8s.LabelSelector;
import imports.k8s.ObjectMeta;
import imports.k8s.PodTemplateSpec;
import imports.k8s.KubeService;
import imports.k8s.KubeServiceProps;
import imports.k8s.ServicePort;
import imports.k8s.ServiceSpec;
import imports.k8s.DeploymentSpec;
import imports.k8s.PodSpec;
import imports.k8s.Container;
import imports.k8s.ContainerPort;
import imports.k8s.KubeDeployment;
import imports.k8s.KubeDeploymentProps;

public class Main extends Chart
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartProps options) {
        super(scope, id, options);

        // Defining a LoadBalancer Service
        final String serviceType = "LoadBalancer";
        final Map<String, String> selector = new HashMap<>();
        selector.put("app", "hello-k8s");
        final List<ServicePort> servicePorts = new ArrayList<>();
        final ServicePort servicePort = new ServicePort.Builder()
                .port(80)
                .targetPort(IntOrString.fromNumber(8080))
                .build();
        servicePorts.add(servicePort);
        final ServiceSpec serviceSpec = new ServiceSpec.Builder()
                .type(serviceType)
                .selector(selector)
                .ports(servicePorts)
                .build();
        final KubeServiceProps serviceProps = new KubeServiceProps.Builder()
                .spec(serviceSpec)
                .build();

        // notice that there is no assigment neccesary when creating resources.
        // simply instantiating the resource is enough because it adds it to the construct tree via
        // the first argument, which is always the parent construct.
        // its a little confusing at first glance, but this is an inherent aspect of the constructs
        // programming model, and you will encounter it many times.
        // you can still perform an assignment of course, if you need to access
        // atrtibutes of the resource in other parts of the code.

        new KubeService(this, "service", serviceProps);

        // Defining a Deployment
        final LabelSelector labelSelector = new LabelSelector.Builder().matchLabels(selector).build();
        final ObjectMeta objectMeta = new ObjectMeta.Builder().labels(selector).build();
        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort containerPort = new ContainerPort.Builder()
                .containerPort(8080)
                .build();
        containerPorts.add(containerPort);
        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
                .name("hello-kubernetes")
                .image("paulbouwer/hello-kubernetes:1.7")
                .ports(containerPorts)
                .build();
        containers.add(container);
        final PodSpec podSpec = new PodSpec.Builder()
                .containers(containers)
                .build();
        final PodTemplateSpec podTemplateSpec = new PodTemplateSpec.Builder()
                .metadata(objectMeta)
                .spec(podSpec)
                .build();
        final DeploymentSpec deploymentSpec = new DeploymentSpec.Builder()
                .replicas(1)
                .selector(labelSelector)
                .template(podTemplateSpec)
                .build();
        final KubeDeploymentProps deploymentProps = new KubeDeploymentProps.Builder()
                .spec(deploymentSpec)
                .build();

        new KubeDeployment(this, "deployment", deploymentProps);

    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "hello");
        app.synth();
    }
}