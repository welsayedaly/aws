package imports.k8s;

/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 * <p>
 * The values will be averaged together before being compared to the target value.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.579Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodsMetricSourceV2Beta1")
@software.amazon.jsii.Jsii.Proxy(PodsMetricSourceV2Beta1.Jsii$Proxy.class)
public interface PodsMetricSourceV2Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * metricName is the name of the metric in question.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMetricName();

    /**
     * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity).
     */
    @org.jetbrains.annotations.NotNull imports.k8s.Quantity getTargetAverageValue();

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodsMetricSourceV2Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodsMetricSourceV2Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodsMetricSourceV2Beta1> {
        private java.lang.String metricName;
        private imports.k8s.Quantity targetAverageValue;
        private imports.k8s.LabelSelector selector;

        /**
         * Sets the value of {@link PodsMetricSourceV2Beta1#getMetricName}
         * @param metricName metricName is the name of the metric in question. This parameter is required.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link PodsMetricSourceV2Beta1#getTargetAverageValue}
         * @param targetAverageValue targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity). This parameter is required.
         * @return {@code this}
         */
        public Builder targetAverageValue(imports.k8s.Quantity targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }

        /**
         * Sets the value of {@link PodsMetricSourceV2Beta1#getSelector}
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodsMetricSourceV2Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodsMetricSourceV2Beta1 build() {
            return new Jsii$Proxy(metricName, targetAverageValue, selector);
        }
    }

    /**
     * An implementation for {@link PodsMetricSourceV2Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodsMetricSourceV2Beta1 {
        private final java.lang.String metricName;
        private final imports.k8s.Quantity targetAverageValue;
        private final imports.k8s.LabelSelector selector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetAverageValue = software.amazon.jsii.Kernel.get(this, "targetAverageValue", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String metricName, final imports.k8s.Quantity targetAverageValue, final imports.k8s.LabelSelector selector) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metricName = java.util.Objects.requireNonNull(metricName, "metricName is required");
            this.targetAverageValue = java.util.Objects.requireNonNull(targetAverageValue, "targetAverageValue is required");
            this.selector = selector;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final imports.k8s.Quantity getTargetAverageValue() {
            return this.targetAverageValue;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metricName", om.valueToTree(this.getMetricName()));
            data.set("targetAverageValue", om.valueToTree(this.getTargetAverageValue()));
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodsMetricSourceV2Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodsMetricSourceV2Beta1.Jsii$Proxy that = (PodsMetricSourceV2Beta1.Jsii$Proxy) o;

            if (!metricName.equals(that.metricName)) return false;
            if (!targetAverageValue.equals(that.targetAverageValue)) return false;
            return this.selector != null ? this.selector.equals(that.selector) : that.selector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metricName.hashCode();
            result = 31 * result + (this.targetAverageValue.hashCode());
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            return result;
        }
    }
}
