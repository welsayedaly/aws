package imports.k8s;

/**
 * EndpointPort represents a Port used by an EndpointSlice.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.418Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EndpointPortV1Beta1")
@software.amazon.jsii.Jsii.Proxy(EndpointPortV1Beta1.Jsii$Proxy.class)
public interface EndpointPortV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * The application protocol for this port.
     * <p>
     * This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAppProtocol() {
        return null;
    }

    /**
     * The name of this port.
     * <p>
     * All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
     * <p>
     * Default: empty string.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * The port number of the endpoint.
     * <p>
     * If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * The IP protocol for this port.
     * <p>
     * Must be UDP, TCP, or SCTP. Default is TCP.
     * <p>
     * Default: TCP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointPortV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointPortV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EndpointPortV1Beta1> {
        private java.lang.String appProtocol;
        private java.lang.String name;
        private java.lang.Number port;
        private java.lang.String protocol;

        /**
         * Sets the value of {@link EndpointPortV1Beta1#getAppProtocol}
         * @param appProtocol The application protocol for this port.
         *                    This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
         * @return {@code this}
         */
        public Builder appProtocol(java.lang.String appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPortV1Beta1#getName}
         * @param name The name of this port.
         *             All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPortV1Beta1#getPort}
         * @param port The port number of the endpoint.
         *             If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPortV1Beta1#getProtocol}
         * @param protocol The IP protocol for this port.
         *                 Must be UDP, TCP, or SCTP. Default is TCP.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointPortV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EndpointPortV1Beta1 build() {
            return new Jsii$Proxy(appProtocol, name, port, protocol);
        }
    }

    /**
     * An implementation for {@link EndpointPortV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointPortV1Beta1 {
        private final java.lang.String appProtocol;
        private final java.lang.String name;
        private final java.lang.Number port;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.appProtocol = software.amazon.jsii.Kernel.get(this, "appProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String appProtocol, final java.lang.String name, final java.lang.Number port, final java.lang.String protocol) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.appProtocol = appProtocol;
            this.name = name;
            this.port = port;
            this.protocol = protocol;
        }

        @Override
        public final java.lang.String getAppProtocol() {
            return this.appProtocol;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAppProtocol() != null) {
                data.set("appProtocol", om.valueToTree(this.getAppProtocol()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointPortV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointPortV1Beta1.Jsii$Proxy that = (EndpointPortV1Beta1.Jsii$Proxy) o;

            if (this.appProtocol != null ? !this.appProtocol.equals(that.appProtocol) : that.appProtocol != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            return this.protocol != null ? this.protocol.equals(that.protocol) : that.protocol == null;
        }

        @Override
        public final int hashCode() {
            int result = this.appProtocol != null ? this.appProtocol.hashCode() : 0;
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            return result;
        }
    }
}
