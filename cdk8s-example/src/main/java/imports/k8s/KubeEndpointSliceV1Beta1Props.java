package imports.k8s;

/**
 * EndpointSlice represents a subset of the endpoints that implement a service.
 * <p>
 * For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.486Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEndpointSliceV1Beta1Props")
@software.amazon.jsii.Jsii.Proxy(KubeEndpointSliceV1Beta1Props.Jsii$Proxy.class)
public interface KubeEndpointSliceV1Beta1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * addressType specifies the type of address carried by this EndpointSlice.
     * <p>
     * All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAddressType();

    /**
     * endpoints is a list of unique endpoints in this slice.
     * <p>
     * Each slice may include a maximum of 1000 endpoints.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.EndpointV1Beta1> getEndpoints();

    /**
     * Standard object's metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice.
     * <p>
     * Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EndpointPortV1Beta1> getPorts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeEndpointSliceV1Beta1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeEndpointSliceV1Beta1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeEndpointSliceV1Beta1Props> {
        private java.lang.String addressType;
        private java.util.List<imports.k8s.EndpointV1Beta1> endpoints;
        private imports.k8s.ObjectMeta metadata;
        private java.util.List<imports.k8s.EndpointPortV1Beta1> ports;

        /**
         * Sets the value of {@link KubeEndpointSliceV1Beta1Props#getAddressType}
         * @param addressType addressType specifies the type of address carried by this EndpointSlice. This parameter is required.
         *                    All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
         * @return {@code this}
         */
        public Builder addressType(java.lang.String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * Sets the value of {@link KubeEndpointSliceV1Beta1Props#getEndpoints}
         * @param endpoints endpoints is a list of unique endpoints in this slice. This parameter is required.
         *                  Each slice may include a maximum of 1000 endpoints.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder endpoints(java.util.List<? extends imports.k8s.EndpointV1Beta1> endpoints) {
            this.endpoints = (java.util.List<imports.k8s.EndpointV1Beta1>)endpoints;
            return this;
        }

        /**
         * Sets the value of {@link KubeEndpointSliceV1Beta1Props#getMetadata}
         * @param metadata Standard object's metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeEndpointSliceV1Beta1Props#getPorts}
         * @param ports ports specifies the list of network ports exposed by each endpoint in this slice.
         *              Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ports(java.util.List<? extends imports.k8s.EndpointPortV1Beta1> ports) {
            this.ports = (java.util.List<imports.k8s.EndpointPortV1Beta1>)ports;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeEndpointSliceV1Beta1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeEndpointSliceV1Beta1Props build() {
            return new Jsii$Proxy(addressType, endpoints, metadata, ports);
        }
    }

    /**
     * An implementation for {@link KubeEndpointSliceV1Beta1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeEndpointSliceV1Beta1Props {
        private final java.lang.String addressType;
        private final java.util.List<imports.k8s.EndpointV1Beta1> endpoints;
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.EndpointPortV1Beta1> ports;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.addressType = software.amazon.jsii.Kernel.get(this, "addressType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpoints = software.amazon.jsii.Kernel.get(this, "endpoints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointV1Beta1.class)));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.ports = software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointPortV1Beta1.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String addressType, final java.util.List<? extends imports.k8s.EndpointV1Beta1> endpoints, final imports.k8s.ObjectMeta metadata, final java.util.List<? extends imports.k8s.EndpointPortV1Beta1> ports) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.addressType = java.util.Objects.requireNonNull(addressType, "addressType is required");
            this.endpoints = (java.util.List<imports.k8s.EndpointV1Beta1>)java.util.Objects.requireNonNull(endpoints, "endpoints is required");
            this.metadata = metadata;
            this.ports = (java.util.List<imports.k8s.EndpointPortV1Beta1>)ports;
        }

        @Override
        public final java.lang.String getAddressType() {
            return this.addressType;
        }

        @Override
        public final java.util.List<imports.k8s.EndpointV1Beta1> getEndpoints() {
            return this.endpoints;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.EndpointPortV1Beta1> getPorts() {
            return this.ports;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("addressType", om.valueToTree(this.getAddressType()));
            data.set("endpoints", om.valueToTree(this.getEndpoints()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeEndpointSliceV1Beta1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeEndpointSliceV1Beta1Props.Jsii$Proxy that = (KubeEndpointSliceV1Beta1Props.Jsii$Proxy) o;

            if (!addressType.equals(that.addressType)) return false;
            if (!endpoints.equals(that.endpoints)) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.ports != null ? this.ports.equals(that.ports) : that.ports == null;
        }

        @Override
        public final int hashCode() {
            int result = this.addressType.hashCode();
            result = 31 * result + (this.endpoints.hashCode());
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            return result;
        }
    }
}
