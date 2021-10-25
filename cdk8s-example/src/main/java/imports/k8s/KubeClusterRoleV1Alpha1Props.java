package imports.k8s;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 * <p>
 * Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.22.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.463Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeClusterRoleV1Alpha1Props")
@software.amazon.jsii.Jsii.Proxy(KubeClusterRoleV1Alpha1Props.Jsii$Proxy.class)
public interface KubeClusterRoleV1Alpha1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * <p>
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.AggregationRuleV1Alpha1 getAggregationRule() {
        return null;
    }

    /**
     * Standard object's metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Rules holds all the PolicyRules for this ClusterRole.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.PolicyRuleV1Alpha1> getRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeClusterRoleV1Alpha1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeClusterRoleV1Alpha1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeClusterRoleV1Alpha1Props> {
        private imports.k8s.AggregationRuleV1Alpha1 aggregationRule;
        private imports.k8s.ObjectMeta metadata;
        private java.util.List<imports.k8s.PolicyRuleV1Alpha1> rules;

        /**
         * Sets the value of {@link KubeClusterRoleV1Alpha1Props#getAggregationRule}
         * @param aggregationRule AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
         *                        If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
         * @return {@code this}
         */
        public Builder aggregationRule(imports.k8s.AggregationRuleV1Alpha1 aggregationRule) {
            this.aggregationRule = aggregationRule;
            return this;
        }

        /**
         * Sets the value of {@link KubeClusterRoleV1Alpha1Props#getMetadata}
         * @param metadata Standard object's metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeClusterRoleV1Alpha1Props#getRules}
         * @param rules Rules holds all the PolicyRules for this ClusterRole.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.k8s.PolicyRuleV1Alpha1> rules) {
            this.rules = (java.util.List<imports.k8s.PolicyRuleV1Alpha1>)rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeClusterRoleV1Alpha1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeClusterRoleV1Alpha1Props build() {
            return new Jsii$Proxy(aggregationRule, metadata, rules);
        }
    }

    /**
     * An implementation for {@link KubeClusterRoleV1Alpha1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeClusterRoleV1Alpha1Props {
        private final imports.k8s.AggregationRuleV1Alpha1 aggregationRule;
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.PolicyRuleV1Alpha1> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.aggregationRule = software.amazon.jsii.Kernel.get(this, "aggregationRule", software.amazon.jsii.NativeType.forClass(imports.k8s.AggregationRuleV1Alpha1.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.PolicyRuleV1Alpha1.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final imports.k8s.AggregationRuleV1Alpha1 aggregationRule, final imports.k8s.ObjectMeta metadata, final java.util.List<? extends imports.k8s.PolicyRuleV1Alpha1> rules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.aggregationRule = aggregationRule;
            this.metadata = metadata;
            this.rules = (java.util.List<imports.k8s.PolicyRuleV1Alpha1>)rules;
        }

        @Override
        public final imports.k8s.AggregationRuleV1Alpha1 getAggregationRule() {
            return this.aggregationRule;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.PolicyRuleV1Alpha1> getRules() {
            return this.rules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAggregationRule() != null) {
                data.set("aggregationRule", om.valueToTree(this.getAggregationRule()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeClusterRoleV1Alpha1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeClusterRoleV1Alpha1Props.Jsii$Proxy that = (KubeClusterRoleV1Alpha1Props.Jsii$Proxy) o;

            if (this.aggregationRule != null ? !this.aggregationRule.equals(that.aggregationRule) : that.aggregationRule != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.rules != null ? this.rules.equals(that.rules) : that.rules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.aggregationRule != null ? this.aggregationRule.hashCode() : 0;
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            return result;
        }
    }
}
