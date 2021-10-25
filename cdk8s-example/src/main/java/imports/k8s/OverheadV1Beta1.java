package imports.k8s;

/**
 * Overhead structure represents the resource overhead associated with running a pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.557Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.OverheadV1Beta1")
@software.amazon.jsii.Jsii.Proxy(OverheadV1Beta1.Jsii$Proxy.class)
public interface OverheadV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * PodFixed represents the fixed resource overhead associated with running a pod.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getPodFixed() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OverheadV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OverheadV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OverheadV1Beta1> {
        private java.util.Map<java.lang.String, imports.k8s.Quantity> podFixed;

        /**
         * Sets the value of {@link OverheadV1Beta1#getPodFixed}
         * @param podFixed PodFixed represents the fixed resource overhead associated with running a pod.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder podFixed(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> podFixed) {
            this.podFixed = (java.util.Map<java.lang.String, imports.k8s.Quantity>)podFixed;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OverheadV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OverheadV1Beta1 build() {
            return new Jsii$Proxy(podFixed);
        }
    }

    /**
     * An implementation for {@link OverheadV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OverheadV1Beta1 {
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> podFixed;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podFixed = software.amazon.jsii.Kernel.get(this, "podFixed", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> podFixed) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podFixed = (java.util.Map<java.lang.String, imports.k8s.Quantity>)podFixed;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getPodFixed() {
            return this.podFixed;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPodFixed() != null) {
                data.set("podFixed", om.valueToTree(this.getPodFixed()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.OverheadV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OverheadV1Beta1.Jsii$Proxy that = (OverheadV1Beta1.Jsii$Proxy) o;

            return this.podFixed != null ? this.podFixed.equals(that.podFixed) : that.podFixed == null;
        }

        @Override
        public final int hashCode() {
            int result = this.podFixed != null ? this.podFixed.hashCode() : 0;
            return result;
        }
    }
}
