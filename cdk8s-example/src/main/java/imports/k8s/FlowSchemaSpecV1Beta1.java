package imports.k8s;

/**
 * FlowSchemaSpec describes how the FlowSchema's specification looks like.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.426Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.FlowSchemaSpecV1Beta1")
@software.amazon.jsii.Jsii.Proxy(FlowSchemaSpecV1Beta1.Jsii$Proxy.class)
public interface FlowSchemaSpecV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster.
     * <p>
     * If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.PriorityLevelConfigurationReferenceV1Beta1 getPriorityLevelConfiguration();

    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema.
     * <p>
     * <code>nil</code> specifies that the distinguisher is disabled and thus will always be the empty string.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FlowDistinguisherMethodV1Beta1 getDistinguisherMethod() {
        return null;
    }

    /**
     * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
     * <p>
     * The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMatchingPrecedence() {
        return null;
    }

    /**
     * `rules` describes which requests will match this flow schema.
     * <p>
     * This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.PolicyRulesWithSubjectsV1Beta1> getRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FlowSchemaSpecV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FlowSchemaSpecV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FlowSchemaSpecV1Beta1> {
        private imports.k8s.PriorityLevelConfigurationReferenceV1Beta1 priorityLevelConfiguration;
        private imports.k8s.FlowDistinguisherMethodV1Beta1 distinguisherMethod;
        private java.lang.Number matchingPrecedence;
        private java.util.List<imports.k8s.PolicyRulesWithSubjectsV1Beta1> rules;

        /**
         * Sets the value of {@link FlowSchemaSpecV1Beta1#getPriorityLevelConfiguration}
         * @param priorityLevelConfiguration `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. This parameter is required.
         *                                   If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
         * @return {@code this}
         */
        public Builder priorityLevelConfiguration(imports.k8s.PriorityLevelConfigurationReferenceV1Beta1 priorityLevelConfiguration) {
            this.priorityLevelConfiguration = priorityLevelConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link FlowSchemaSpecV1Beta1#getDistinguisherMethod}
         * @param distinguisherMethod `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema.
         *                            <code>nil</code> specifies that the distinguisher is disabled and thus will always be the empty string.
         * @return {@code this}
         */
        public Builder distinguisherMethod(imports.k8s.FlowDistinguisherMethodV1Beta1 distinguisherMethod) {
            this.distinguisherMethod = distinguisherMethod;
            return this;
        }

        /**
         * Sets the value of {@link FlowSchemaSpecV1Beta1#getMatchingPrecedence}
         * @param matchingPrecedence `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
         *                           The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
         * @return {@code this}
         */
        public Builder matchingPrecedence(java.lang.Number matchingPrecedence) {
            this.matchingPrecedence = matchingPrecedence;
            return this;
        }

        /**
         * Sets the value of {@link FlowSchemaSpecV1Beta1#getRules}
         * @param rules `rules` describes which requests will match this flow schema.
         *              This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.k8s.PolicyRulesWithSubjectsV1Beta1> rules) {
            this.rules = (java.util.List<imports.k8s.PolicyRulesWithSubjectsV1Beta1>)rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FlowSchemaSpecV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FlowSchemaSpecV1Beta1 build() {
            return new Jsii$Proxy(priorityLevelConfiguration, distinguisherMethod, matchingPrecedence, rules);
        }
    }

    /**
     * An implementation for {@link FlowSchemaSpecV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FlowSchemaSpecV1Beta1 {
        private final imports.k8s.PriorityLevelConfigurationReferenceV1Beta1 priorityLevelConfiguration;
        private final imports.k8s.FlowDistinguisherMethodV1Beta1 distinguisherMethod;
        private final java.lang.Number matchingPrecedence;
        private final java.util.List<imports.k8s.PolicyRulesWithSubjectsV1Beta1> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.priorityLevelConfiguration = software.amazon.jsii.Kernel.get(this, "priorityLevelConfiguration", software.amazon.jsii.NativeType.forClass(imports.k8s.PriorityLevelConfigurationReferenceV1Beta1.class));
            this.distinguisherMethod = software.amazon.jsii.Kernel.get(this, "distinguisherMethod", software.amazon.jsii.NativeType.forClass(imports.k8s.FlowDistinguisherMethodV1Beta1.class));
            this.matchingPrecedence = software.amazon.jsii.Kernel.get(this, "matchingPrecedence", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.PolicyRulesWithSubjectsV1Beta1.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final imports.k8s.PriorityLevelConfigurationReferenceV1Beta1 priorityLevelConfiguration, final imports.k8s.FlowDistinguisherMethodV1Beta1 distinguisherMethod, final java.lang.Number matchingPrecedence, final java.util.List<? extends imports.k8s.PolicyRulesWithSubjectsV1Beta1> rules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.priorityLevelConfiguration = java.util.Objects.requireNonNull(priorityLevelConfiguration, "priorityLevelConfiguration is required");
            this.distinguisherMethod = distinguisherMethod;
            this.matchingPrecedence = matchingPrecedence;
            this.rules = (java.util.List<imports.k8s.PolicyRulesWithSubjectsV1Beta1>)rules;
        }

        @Override
        public final imports.k8s.PriorityLevelConfigurationReferenceV1Beta1 getPriorityLevelConfiguration() {
            return this.priorityLevelConfiguration;
        }

        @Override
        public final imports.k8s.FlowDistinguisherMethodV1Beta1 getDistinguisherMethod() {
            return this.distinguisherMethod;
        }

        @Override
        public final java.lang.Number getMatchingPrecedence() {
            return this.matchingPrecedence;
        }

        @Override
        public final java.util.List<imports.k8s.PolicyRulesWithSubjectsV1Beta1> getRules() {
            return this.rules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("priorityLevelConfiguration", om.valueToTree(this.getPriorityLevelConfiguration()));
            if (this.getDistinguisherMethod() != null) {
                data.set("distinguisherMethod", om.valueToTree(this.getDistinguisherMethod()));
            }
            if (this.getMatchingPrecedence() != null) {
                data.set("matchingPrecedence", om.valueToTree(this.getMatchingPrecedence()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FlowSchemaSpecV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FlowSchemaSpecV1Beta1.Jsii$Proxy that = (FlowSchemaSpecV1Beta1.Jsii$Proxy) o;

            if (!priorityLevelConfiguration.equals(that.priorityLevelConfiguration)) return false;
            if (this.distinguisherMethod != null ? !this.distinguisherMethod.equals(that.distinguisherMethod) : that.distinguisherMethod != null) return false;
            if (this.matchingPrecedence != null ? !this.matchingPrecedence.equals(that.matchingPrecedence) : that.matchingPrecedence != null) return false;
            return this.rules != null ? this.rules.equals(that.rules) : that.rules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.priorityLevelConfiguration.hashCode();
            result = 31 * result + (this.distinguisherMethod != null ? this.distinguisherMethod.hashCode() : 0);
            result = 31 * result + (this.matchingPrecedence != null ? this.matchingPrecedence.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            return result;
        }
    }
}
