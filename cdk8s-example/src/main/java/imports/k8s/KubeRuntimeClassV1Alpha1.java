package imports.k8s;

/**
 * RuntimeClass defines a class of container runtime supported in the cluster.
 * <p>
 * The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.529Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeRuntimeClassV1Alpha1")
public class KubeRuntimeClassV1Alpha1 extends org.cdk8s.ApiObject {

    protected KubeRuntimeClassV1Alpha1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeRuntimeClassV1Alpha1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeRuntimeClassV1Alpha1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.node.v1alpha1.RuntimeClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeRuntimeClassV1Alpha1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeRuntimeClassV1Alpha1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.node.v1alpha1.RuntimeClass".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeRuntimeClassV1Alpha1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeRuntimeClassV1Alpha1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.node.v1alpha1.RuntimeClass".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeRuntimeClassV1Alpha1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeRuntimeClassV1Alpha1> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param id a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.k8s.KubeRuntimeClassV1Alpha1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeRuntimeClassV1Alpha1Props.Builder();
        }

        /**
         * Specification of the RuntimeClass More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
         * <p>
         * @return {@code this}
         * @param spec Specification of the RuntimeClass More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status. This parameter is required.
         */
        public Builder spec(final imports.k8s.RuntimeClassSpecV1Alpha1 spec) {
            this.props.spec(spec);
            return this;
        }

        /**
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeRuntimeClassV1Alpha1}.
         */
        @Override
        public imports.k8s.KubeRuntimeClassV1Alpha1 build() {
            return new imports.k8s.KubeRuntimeClassV1Alpha1(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
