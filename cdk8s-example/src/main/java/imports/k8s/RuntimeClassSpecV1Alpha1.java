package imports.k8s;

/**
 * RuntimeClassSpec is a specification of a RuntimeClass.
 * <p>
 * It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.585Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RuntimeClassSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(RuntimeClassSpecV1Alpha1.Jsii$Proxy.class)
public interface RuntimeClassSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
     * <p>
     * The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRuntimeHandler();

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
     * <p>
     * For more details, see https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md This field is beta-level as of Kubernetes v1.18, and is only honored by servers that enable the PodOverhead feature.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.OverheadV1Alpha1 getOverhead() {
        return null;
    }

    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
     * <p>
     * If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SchedulingV1Alpha1 getScheduling() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RuntimeClassSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RuntimeClassSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RuntimeClassSpecV1Alpha1> {
        private java.lang.String runtimeHandler;
        private imports.k8s.OverheadV1Alpha1 overhead;
        private imports.k8s.SchedulingV1Alpha1 scheduling;

        /**
         * Sets the value of {@link RuntimeClassSpecV1Alpha1#getRuntimeHandler}
         * @param runtimeHandler RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. This parameter is required.
         *                       The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
         * @return {@code this}
         */
        public Builder runtimeHandler(java.lang.String runtimeHandler) {
            this.runtimeHandler = runtimeHandler;
            return this;
        }

        /**
         * Sets the value of {@link RuntimeClassSpecV1Alpha1#getOverhead}
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
         *                 For more details, see https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md This field is beta-level as of Kubernetes v1.18, and is only honored by servers that enable the PodOverhead feature.
         * @return {@code this}
         */
        public Builder overhead(imports.k8s.OverheadV1Alpha1 overhead) {
            this.overhead = overhead;
            return this;
        }

        /**
         * Sets the value of {@link RuntimeClassSpecV1Alpha1#getScheduling}
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
         *                   If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * @return {@code this}
         */
        public Builder scheduling(imports.k8s.SchedulingV1Alpha1 scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RuntimeClassSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RuntimeClassSpecV1Alpha1 build() {
            return new Jsii$Proxy(runtimeHandler, overhead, scheduling);
        }
    }

    /**
     * An implementation for {@link RuntimeClassSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RuntimeClassSpecV1Alpha1 {
        private final java.lang.String runtimeHandler;
        private final imports.k8s.OverheadV1Alpha1 overhead;
        private final imports.k8s.SchedulingV1Alpha1 scheduling;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.runtimeHandler = software.amazon.jsii.Kernel.get(this, "runtimeHandler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.overhead = software.amazon.jsii.Kernel.get(this, "overhead", software.amazon.jsii.NativeType.forClass(imports.k8s.OverheadV1Alpha1.class));
            this.scheduling = software.amazon.jsii.Kernel.get(this, "scheduling", software.amazon.jsii.NativeType.forClass(imports.k8s.SchedulingV1Alpha1.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String runtimeHandler, final imports.k8s.OverheadV1Alpha1 overhead, final imports.k8s.SchedulingV1Alpha1 scheduling) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.runtimeHandler = java.util.Objects.requireNonNull(runtimeHandler, "runtimeHandler is required");
            this.overhead = overhead;
            this.scheduling = scheduling;
        }

        @Override
        public final java.lang.String getRuntimeHandler() {
            return this.runtimeHandler;
        }

        @Override
        public final imports.k8s.OverheadV1Alpha1 getOverhead() {
            return this.overhead;
        }

        @Override
        public final imports.k8s.SchedulingV1Alpha1 getScheduling() {
            return this.scheduling;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("runtimeHandler", om.valueToTree(this.getRuntimeHandler()));
            if (this.getOverhead() != null) {
                data.set("overhead", om.valueToTree(this.getOverhead()));
            }
            if (this.getScheduling() != null) {
                data.set("scheduling", om.valueToTree(this.getScheduling()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RuntimeClassSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RuntimeClassSpecV1Alpha1.Jsii$Proxy that = (RuntimeClassSpecV1Alpha1.Jsii$Proxy) o;

            if (!runtimeHandler.equals(that.runtimeHandler)) return false;
            if (this.overhead != null ? !this.overhead.equals(that.overhead) : that.overhead != null) return false;
            return this.scheduling != null ? this.scheduling.equals(that.scheduling) : that.scheduling == null;
        }

        @Override
        public final int hashCode() {
            int result = this.runtimeHandler.hashCode();
            result = 31 * result + (this.overhead != null ? this.overhead.hashCode() : 0);
            result = 31 * result + (this.scheduling != null ? this.scheduling.hashCode() : 0);
            return result;
        }
    }
}
