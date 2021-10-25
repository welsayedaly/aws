package imports.k8s;

/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.417Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EndpointHintsV1Beta1")
@software.amazon.jsii.Jsii.Proxy(EndpointHintsV1Beta1.Jsii$Proxy.class)
public interface EndpointHintsV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
     * <p>
     * May contain a maximum of 8 entries.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ForZoneV1Beta1> getForZones() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointHintsV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointHintsV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EndpointHintsV1Beta1> {
        private java.util.List<imports.k8s.ForZoneV1Beta1> forZones;

        /**
         * Sets the value of {@link EndpointHintsV1Beta1#getForZones}
         * @param forZones forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
         *                 May contain a maximum of 8 entries.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder forZones(java.util.List<? extends imports.k8s.ForZoneV1Beta1> forZones) {
            this.forZones = (java.util.List<imports.k8s.ForZoneV1Beta1>)forZones;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointHintsV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EndpointHintsV1Beta1 build() {
            return new Jsii$Proxy(forZones);
        }
    }

    /**
     * An implementation for {@link EndpointHintsV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointHintsV1Beta1 {
        private final java.util.List<imports.k8s.ForZoneV1Beta1> forZones;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.forZones = software.amazon.jsii.Kernel.get(this, "forZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ForZoneV1Beta1.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.k8s.ForZoneV1Beta1> forZones) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.forZones = (java.util.List<imports.k8s.ForZoneV1Beta1>)forZones;
        }

        @Override
        public final java.util.List<imports.k8s.ForZoneV1Beta1> getForZones() {
            return this.forZones;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getForZones() != null) {
                data.set("forZones", om.valueToTree(this.getForZones()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointHintsV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointHintsV1Beta1.Jsii$Proxy that = (EndpointHintsV1Beta1.Jsii$Proxy) o;

            return this.forZones != null ? this.forZones.equals(that.forZones) : that.forZones == null;
        }

        @Override
        public final int hashCode() {
            int result = this.forZones != null ? this.forZones.hashCode() : 0;
            return result;
        }
    }
}
