package imports.k8s;

/**
 * Endpoint represents a single logical "backend" implementing a service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.418Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EndpointV1Beta1")
@software.amazon.jsii.Jsii.Proxy(EndpointV1Beta1.Jsii$Proxy.class)
public interface EndpointV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * addresses of this endpoint.
     * <p>
     * The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAddresses();

    /**
     * conditions contains information about the current status of the endpoint.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EndpointConditionsV1Beta1 getConditions() {
        return null;
    }

    /**
     * hints contains information associated with how an endpoint should be consumed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EndpointHintsV1Beta1 getHints() {
        return null;
    }

    /**
     * hostname of this endpoint.
     * <p>
     * This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostname() {
        return null;
    }

    /**
     * nodeName represents the name of the Node hosting this endpoint.
     * <p>
     * This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeName() {
        return null;
    }

    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectReference getTargetRef() {
        return null;
    }

    /**
     * topology contains arbitrary topology information associated with the endpoint.
     * <p>
     * These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
     * where the endpoint is located. This should match the corresponding
     * node label.
     * <p>
     * <ul>
     * <li>topology.kubernetes.io/zone: the value indicates the zone where the
     * endpoint is located. This should match the corresponding node label.</li>
     * <li>topology.kubernetes.io/region: the value indicates the region where the
     * endpoint is located. This should match the corresponding node label.
     * This field is deprecated and will be removed in future api versions.</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTopology() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EndpointV1Beta1> {
        private java.util.List<java.lang.String> addresses;
        private imports.k8s.EndpointConditionsV1Beta1 conditions;
        private imports.k8s.EndpointHintsV1Beta1 hints;
        private java.lang.String hostname;
        private java.lang.String nodeName;
        private imports.k8s.ObjectReference targetRef;
        private java.util.Map<java.lang.String, java.lang.String> topology;

        /**
         * Sets the value of {@link EndpointV1Beta1#getAddresses}
         * @param addresses addresses of this endpoint. This parameter is required.
         *                  The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
         * @return {@code this}
         */
        public Builder addresses(java.util.List<java.lang.String> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Sets the value of {@link EndpointV1Beta1#getConditions}
         * @param conditions conditions contains information about the current status of the endpoint.
         * @return {@code this}
         */
        public Builder conditions(imports.k8s.EndpointConditionsV1Beta1 conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * Sets the value of {@link EndpointV1Beta1#getHints}
         * @param hints hints contains information associated with how an endpoint should be consumed.
         * @return {@code this}
         */
        public Builder hints(imports.k8s.EndpointHintsV1Beta1 hints) {
            this.hints = hints;
            return this;
        }

        /**
         * Sets the value of {@link EndpointV1Beta1#getHostname}
         * @param hostname hostname of this endpoint.
         *                 This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link EndpointV1Beta1#getNodeName}
         * @param nodeName nodeName represents the name of the Node hosting this endpoint.
         *                 This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
         * @return {@code this}
         */
        public Builder nodeName(java.lang.String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Sets the value of {@link EndpointV1Beta1#getTargetRef}
         * @param targetRef targetRef is a reference to a Kubernetes object that represents this endpoint.
         * @return {@code this}
         */
        public Builder targetRef(imports.k8s.ObjectReference targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        /**
         * Sets the value of {@link EndpointV1Beta1#getTopology}
         * @param topology topology contains arbitrary topology information associated with the endpoint.
         *                 These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
         *                 where the endpoint is located. This should match the corresponding
         *                 node label.
         *                 <p>
         *                 <ul>
         *                 <li>topology.kubernetes.io/zone: the value indicates the zone where the
         *                 endpoint is located. This should match the corresponding node label.</li>
         *                 <li>topology.kubernetes.io/region: the value indicates the region where the
         *                 endpoint is located. This should match the corresponding node label.
         *                 This field is deprecated and will be removed in future api versions.</li>
         *                 </ul>
         * @return {@code this}
         */
        public Builder topology(java.util.Map<java.lang.String, java.lang.String> topology) {
            this.topology = topology;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EndpointV1Beta1 build() {
            return new Jsii$Proxy(addresses, conditions, hints, hostname, nodeName, targetRef, topology);
        }
    }

    /**
     * An implementation for {@link EndpointV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointV1Beta1 {
        private final java.util.List<java.lang.String> addresses;
        private final imports.k8s.EndpointConditionsV1Beta1 conditions;
        private final imports.k8s.EndpointHintsV1Beta1 hints;
        private final java.lang.String hostname;
        private final java.lang.String nodeName;
        private final imports.k8s.ObjectReference targetRef;
        private final java.util.Map<java.lang.String, java.lang.String> topology;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.addresses = software.amazon.jsii.Kernel.get(this, "addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.conditions = software.amazon.jsii.Kernel.get(this, "conditions", software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointConditionsV1Beta1.class));
            this.hints = software.amazon.jsii.Kernel.get(this, "hints", software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointHintsV1Beta1.class));
            this.hostname = software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeName = software.amazon.jsii.Kernel.get(this, "nodeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetRef = software.amazon.jsii.Kernel.get(this, "targetRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class));
            this.topology = software.amazon.jsii.Kernel.get(this, "topology", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> addresses, final imports.k8s.EndpointConditionsV1Beta1 conditions, final imports.k8s.EndpointHintsV1Beta1 hints, final java.lang.String hostname, final java.lang.String nodeName, final imports.k8s.ObjectReference targetRef, final java.util.Map<java.lang.String, java.lang.String> topology) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.addresses = java.util.Objects.requireNonNull(addresses, "addresses is required");
            this.conditions = conditions;
            this.hints = hints;
            this.hostname = hostname;
            this.nodeName = nodeName;
            this.targetRef = targetRef;
            this.topology = topology;
        }

        @Override
        public final java.util.List<java.lang.String> getAddresses() {
            return this.addresses;
        }

        @Override
        public final imports.k8s.EndpointConditionsV1Beta1 getConditions() {
            return this.conditions;
        }

        @Override
        public final imports.k8s.EndpointHintsV1Beta1 getHints() {
            return this.hints;
        }

        @Override
        public final java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public final java.lang.String getNodeName() {
            return this.nodeName;
        }

        @Override
        public final imports.k8s.ObjectReference getTargetRef() {
            return this.targetRef;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTopology() {
            return this.topology;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("addresses", om.valueToTree(this.getAddresses()));
            if (this.getConditions() != null) {
                data.set("conditions", om.valueToTree(this.getConditions()));
            }
            if (this.getHints() != null) {
                data.set("hints", om.valueToTree(this.getHints()));
            }
            if (this.getHostname() != null) {
                data.set("hostname", om.valueToTree(this.getHostname()));
            }
            if (this.getNodeName() != null) {
                data.set("nodeName", om.valueToTree(this.getNodeName()));
            }
            if (this.getTargetRef() != null) {
                data.set("targetRef", om.valueToTree(this.getTargetRef()));
            }
            if (this.getTopology() != null) {
                data.set("topology", om.valueToTree(this.getTopology()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointV1Beta1.Jsii$Proxy that = (EndpointV1Beta1.Jsii$Proxy) o;

            if (!addresses.equals(that.addresses)) return false;
            if (this.conditions != null ? !this.conditions.equals(that.conditions) : that.conditions != null) return false;
            if (this.hints != null ? !this.hints.equals(that.hints) : that.hints != null) return false;
            if (this.hostname != null ? !this.hostname.equals(that.hostname) : that.hostname != null) return false;
            if (this.nodeName != null ? !this.nodeName.equals(that.nodeName) : that.nodeName != null) return false;
            if (this.targetRef != null ? !this.targetRef.equals(that.targetRef) : that.targetRef != null) return false;
            return this.topology != null ? this.topology.equals(that.topology) : that.topology == null;
        }

        @Override
        public final int hashCode() {
            int result = this.addresses.hashCode();
            result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
            result = 31 * result + (this.hints != null ? this.hints.hashCode() : 0);
            result = 31 * result + (this.hostname != null ? this.hostname.hashCode() : 0);
            result = 31 * result + (this.nodeName != null ? this.nodeName.hashCode() : 0);
            result = 31 * result + (this.targetRef != null ? this.targetRef.hashCode() : 0);
            result = 31 * result + (this.topology != null ? this.topology.hashCode() : 0);
            return result;
        }
    }
}
