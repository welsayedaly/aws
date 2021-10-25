package imports.k8s;

/**
 * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.583Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceMetricSourceV2Beta1")
@software.amazon.jsii.Jsii.Proxy(ResourceMetricSourceV2Beta1.Jsii$Proxy.class)
public interface ResourceMetricSourceV2Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * name is the name of the resource in question.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTargetAverageUtilization() {
        return null;
    }

    /**
     * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getTargetAverageValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceMetricSourceV2Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceMetricSourceV2Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceMetricSourceV2Beta1> {
        private java.lang.String name;
        private java.lang.Number targetAverageUtilization;
        private imports.k8s.Quantity targetAverageValue;

        /**
         * Sets the value of {@link ResourceMetricSourceV2Beta1#getName}
         * @param name name is the name of the resource in question. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ResourceMetricSourceV2Beta1#getTargetAverageUtilization}
         * @param targetAverageUtilization targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
         * @return {@code this}
         */
        public Builder targetAverageUtilization(java.lang.Number targetAverageUtilization) {
            this.targetAverageUtilization = targetAverageUtilization;
            return this;
        }

        /**
         * Sets the value of {@link ResourceMetricSourceV2Beta1#getTargetAverageValue}
         * @param targetAverageValue targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
         * @return {@code this}
         */
        public Builder targetAverageValue(imports.k8s.Quantity targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceMetricSourceV2Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceMetricSourceV2Beta1 build() {
            return new Jsii$Proxy(name, targetAverageUtilization, targetAverageValue);
        }
    }

    /**
     * An implementation for {@link ResourceMetricSourceV2Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceMetricSourceV2Beta1 {
        private final java.lang.String name;
        private final java.lang.Number targetAverageUtilization;
        private final imports.k8s.Quantity targetAverageValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetAverageUtilization = software.amazon.jsii.Kernel.get(this, "targetAverageUtilization", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.targetAverageValue = software.amazon.jsii.Kernel.get(this, "targetAverageValue", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final java.lang.Number targetAverageUtilization, final imports.k8s.Quantity targetAverageValue) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.targetAverageUtilization = targetAverageUtilization;
            this.targetAverageValue = targetAverageValue;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getTargetAverageUtilization() {
            return this.targetAverageUtilization;
        }

        @Override
        public final imports.k8s.Quantity getTargetAverageValue() {
            return this.targetAverageValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getTargetAverageUtilization() != null) {
                data.set("targetAverageUtilization", om.valueToTree(this.getTargetAverageUtilization()));
            }
            if (this.getTargetAverageValue() != null) {
                data.set("targetAverageValue", om.valueToTree(this.getTargetAverageValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceMetricSourceV2Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceMetricSourceV2Beta1.Jsii$Proxy that = (ResourceMetricSourceV2Beta1.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.targetAverageUtilization != null ? !this.targetAverageUtilization.equals(that.targetAverageUtilization) : that.targetAverageUtilization != null) return false;
            return this.targetAverageValue != null ? this.targetAverageValue.equals(that.targetAverageValue) : that.targetAverageValue == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.targetAverageUtilization != null ? this.targetAverageUtilization.hashCode() : 0);
            result = 31 * result + (this.targetAverageValue != null ? this.targetAverageValue.hashCode() : 0);
            return result;
        }
    }
}
