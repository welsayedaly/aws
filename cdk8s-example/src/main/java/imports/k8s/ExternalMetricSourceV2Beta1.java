package imports.k8s;

/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
 * <p>
 * Exactly one "target" type should be set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.424Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ExternalMetricSourceV2Beta1")
@software.amazon.jsii.Jsii.Proxy(ExternalMetricSourceV2Beta1.Jsii$Proxy.class)
public interface ExternalMetricSourceV2Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * metricName is the name of the metric in question.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMetricName();

    /**
     * metricSelector is used to identify a specific time series within a given metric.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getMetricSelector() {
        return null;
    }

    /**
     * targetAverageValue is the target per-pod value of global metric (as a quantity).
     * <p>
     * Mutually exclusive with TargetValue.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getTargetAverageValue() {
        return null;
    }

    /**
     * targetValue is the target value of the metric (as a quantity).
     * <p>
     * Mutually exclusive with TargetAverageValue.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getTargetValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ExternalMetricSourceV2Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ExternalMetricSourceV2Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ExternalMetricSourceV2Beta1> {
        private java.lang.String metricName;
        private imports.k8s.LabelSelector metricSelector;
        private imports.k8s.Quantity targetAverageValue;
        private imports.k8s.Quantity targetValue;

        /**
         * Sets the value of {@link ExternalMetricSourceV2Beta1#getMetricName}
         * @param metricName metricName is the name of the metric in question. This parameter is required.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link ExternalMetricSourceV2Beta1#getMetricSelector}
         * @param metricSelector metricSelector is used to identify a specific time series within a given metric.
         * @return {@code this}
         */
        public Builder metricSelector(imports.k8s.LabelSelector metricSelector) {
            this.metricSelector = metricSelector;
            return this;
        }

        /**
         * Sets the value of {@link ExternalMetricSourceV2Beta1#getTargetAverageValue}
         * @param targetAverageValue targetAverageValue is the target per-pod value of global metric (as a quantity).
         *                           Mutually exclusive with TargetValue.
         * @return {@code this}
         */
        public Builder targetAverageValue(imports.k8s.Quantity targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }

        /**
         * Sets the value of {@link ExternalMetricSourceV2Beta1#getTargetValue}
         * @param targetValue targetValue is the target value of the metric (as a quantity).
         *                    Mutually exclusive with TargetAverageValue.
         * @return {@code this}
         */
        public Builder targetValue(imports.k8s.Quantity targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ExternalMetricSourceV2Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ExternalMetricSourceV2Beta1 build() {
            return new Jsii$Proxy(metricName, metricSelector, targetAverageValue, targetValue);
        }
    }

    /**
     * An implementation for {@link ExternalMetricSourceV2Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ExternalMetricSourceV2Beta1 {
        private final java.lang.String metricName;
        private final imports.k8s.LabelSelector metricSelector;
        private final imports.k8s.Quantity targetAverageValue;
        private final imports.k8s.Quantity targetValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricSelector = software.amazon.jsii.Kernel.get(this, "metricSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.targetAverageValue = software.amazon.jsii.Kernel.get(this, "targetAverageValue", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
            this.targetValue = software.amazon.jsii.Kernel.get(this, "targetValue", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String metricName, final imports.k8s.LabelSelector metricSelector, final imports.k8s.Quantity targetAverageValue, final imports.k8s.Quantity targetValue) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metricName = java.util.Objects.requireNonNull(metricName, "metricName is required");
            this.metricSelector = metricSelector;
            this.targetAverageValue = targetAverageValue;
            this.targetValue = targetValue;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final imports.k8s.LabelSelector getMetricSelector() {
            return this.metricSelector;
        }

        @Override
        public final imports.k8s.Quantity getTargetAverageValue() {
            return this.targetAverageValue;
        }

        @Override
        public final imports.k8s.Quantity getTargetValue() {
            return this.targetValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metricName", om.valueToTree(this.getMetricName()));
            if (this.getMetricSelector() != null) {
                data.set("metricSelector", om.valueToTree(this.getMetricSelector()));
            }
            if (this.getTargetAverageValue() != null) {
                data.set("targetAverageValue", om.valueToTree(this.getTargetAverageValue()));
            }
            if (this.getTargetValue() != null) {
                data.set("targetValue", om.valueToTree(this.getTargetValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ExternalMetricSourceV2Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ExternalMetricSourceV2Beta1.Jsii$Proxy that = (ExternalMetricSourceV2Beta1.Jsii$Proxy) o;

            if (!metricName.equals(that.metricName)) return false;
            if (this.metricSelector != null ? !this.metricSelector.equals(that.metricSelector) : that.metricSelector != null) return false;
            if (this.targetAverageValue != null ? !this.targetAverageValue.equals(that.targetAverageValue) : that.targetAverageValue != null) return false;
            return this.targetValue != null ? this.targetValue.equals(that.targetValue) : that.targetValue == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metricName.hashCode();
            result = 31 * result + (this.metricSelector != null ? this.metricSelector.hashCode() : 0);
            result = 31 * result + (this.targetAverageValue != null ? this.targetAverageValue.hashCode() : 0);
            result = 31 * result + (this.targetValue != null ? this.targetValue.hashCode() : 0);
            return result;
        }
    }
}
