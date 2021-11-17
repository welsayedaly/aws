package imports.k8s;

/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.556Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ObjectMetricSourceV2Beta1")
@software.amazon.jsii.Jsii.Proxy(ObjectMetricSourceV2Beta1.Jsii$Proxy.class)
public interface ObjectMetricSourceV2Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * metricName is the name of the metric in question.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMetricName();

    /**
     * target is the described Kubernetes object.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CrossVersionObjectReferenceV2Beta1 getTarget();

    /**
     * targetValue is the target value of the metric (as a quantity).
     */
    @org.jetbrains.annotations.NotNull imports.k8s.Quantity getTargetValue();

    /**
     * averageValue is the target value of the average of the metric across all relevant pods (as a quantity).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getAverageValue() {
        return null;
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ObjectMetricSourceV2Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ObjectMetricSourceV2Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ObjectMetricSourceV2Beta1> {
        private java.lang.String metricName;
        private imports.k8s.CrossVersionObjectReferenceV2Beta1 target;
        private imports.k8s.Quantity targetValue;
        private imports.k8s.Quantity averageValue;
        private imports.k8s.LabelSelector selector;

        /**
         * Sets the value of {@link ObjectMetricSourceV2Beta1#getMetricName}
         * @param metricName metricName is the name of the metric in question. This parameter is required.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMetricSourceV2Beta1#getTarget}
         * @param target target is the described Kubernetes object. This parameter is required.
         * @return {@code this}
         */
        public Builder target(imports.k8s.CrossVersionObjectReferenceV2Beta1 target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMetricSourceV2Beta1#getTargetValue}
         * @param targetValue targetValue is the target value of the metric (as a quantity). This parameter is required.
         * @return {@code this}
         */
        public Builder targetValue(imports.k8s.Quantity targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMetricSourceV2Beta1#getAverageValue}
         * @param averageValue averageValue is the target value of the average of the metric across all relevant pods (as a quantity).
         * @return {@code this}
         */
        public Builder averageValue(imports.k8s.Quantity averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMetricSourceV2Beta1#getSelector}
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ObjectMetricSourceV2Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ObjectMetricSourceV2Beta1 build() {
            return new Jsii$Proxy(metricName, target, targetValue, averageValue, selector);
        }
    }

    /**
     * An implementation for {@link ObjectMetricSourceV2Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ObjectMetricSourceV2Beta1 {
        private final java.lang.String metricName;
        private final imports.k8s.CrossVersionObjectReferenceV2Beta1 target;
        private final imports.k8s.Quantity targetValue;
        private final imports.k8s.Quantity averageValue;
        private final imports.k8s.LabelSelector selector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.k8s.CrossVersionObjectReferenceV2Beta1.class));
            this.targetValue = software.amazon.jsii.Kernel.get(this, "targetValue", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
            this.averageValue = software.amazon.jsii.Kernel.get(this, "averageValue", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String metricName, final imports.k8s.CrossVersionObjectReferenceV2Beta1 target, final imports.k8s.Quantity targetValue, final imports.k8s.Quantity averageValue, final imports.k8s.LabelSelector selector) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metricName = java.util.Objects.requireNonNull(metricName, "metricName is required");
            this.target = java.util.Objects.requireNonNull(target, "target is required");
            this.targetValue = java.util.Objects.requireNonNull(targetValue, "targetValue is required");
            this.averageValue = averageValue;
            this.selector = selector;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final imports.k8s.CrossVersionObjectReferenceV2Beta1 getTarget() {
            return this.target;
        }

        @Override
        public final imports.k8s.Quantity getTargetValue() {
            return this.targetValue;
        }

        @Override
        public final imports.k8s.Quantity getAverageValue() {
            return this.averageValue;
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
            data.set("target", om.valueToTree(this.getTarget()));
            data.set("targetValue", om.valueToTree(this.getTargetValue()));
            if (this.getAverageValue() != null) {
                data.set("averageValue", om.valueToTree(this.getAverageValue()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ObjectMetricSourceV2Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ObjectMetricSourceV2Beta1.Jsii$Proxy that = (ObjectMetricSourceV2Beta1.Jsii$Proxy) o;

            if (!metricName.equals(that.metricName)) return false;
            if (!target.equals(that.target)) return false;
            if (!targetValue.equals(that.targetValue)) return false;
            if (this.averageValue != null ? !this.averageValue.equals(that.averageValue) : that.averageValue != null) return false;
            return this.selector != null ? this.selector.equals(that.selector) : that.selector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metricName.hashCode();
            result = 31 * result + (this.target.hashCode());
            result = 31 * result + (this.targetValue.hashCode());
            result = 31 * result + (this.averageValue != null ? this.averageValue.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            return result;
        }
    }
}
