package imports.k8s;

/**
 * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.585Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RuntimeClassStrategyOptionsV1Beta1")
@software.amazon.jsii.Jsii.Proxy(RuntimeClassStrategyOptionsV1Beta1.Jsii$Proxy.class)
public interface RuntimeClassStrategyOptionsV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod.
     * <p>
     * A value of "*" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedRuntimeClassNames();

    /**
     * defaultRuntimeClassName is the default RuntimeClassName to set on the pod.
     * <p>
     * The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRuntimeClassName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RuntimeClassStrategyOptionsV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RuntimeClassStrategyOptionsV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RuntimeClassStrategyOptionsV1Beta1> {
        private java.util.List<java.lang.String> allowedRuntimeClassNames;
        private java.lang.String defaultRuntimeClassName;

        /**
         * Sets the value of {@link RuntimeClassStrategyOptionsV1Beta1#getAllowedRuntimeClassNames}
         * @param allowedRuntimeClassNames allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod. This parameter is required.
         *                                 A value of "*" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
         * @return {@code this}
         */
        public Builder allowedRuntimeClassNames(java.util.List<java.lang.String> allowedRuntimeClassNames) {
            this.allowedRuntimeClassNames = allowedRuntimeClassNames;
            return this;
        }

        /**
         * Sets the value of {@link RuntimeClassStrategyOptionsV1Beta1#getDefaultRuntimeClassName}
         * @param defaultRuntimeClassName defaultRuntimeClassName is the default RuntimeClassName to set on the pod.
         *                                The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
         * @return {@code this}
         */
        public Builder defaultRuntimeClassName(java.lang.String defaultRuntimeClassName) {
            this.defaultRuntimeClassName = defaultRuntimeClassName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RuntimeClassStrategyOptionsV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RuntimeClassStrategyOptionsV1Beta1 build() {
            return new Jsii$Proxy(allowedRuntimeClassNames, defaultRuntimeClassName);
        }
    }

    /**
     * An implementation for {@link RuntimeClassStrategyOptionsV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RuntimeClassStrategyOptionsV1Beta1 {
        private final java.util.List<java.lang.String> allowedRuntimeClassNames;
        private final java.lang.String defaultRuntimeClassName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowedRuntimeClassNames = software.amazon.jsii.Kernel.get(this, "allowedRuntimeClassNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.defaultRuntimeClassName = software.amazon.jsii.Kernel.get(this, "defaultRuntimeClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> allowedRuntimeClassNames, final java.lang.String defaultRuntimeClassName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowedRuntimeClassNames = java.util.Objects.requireNonNull(allowedRuntimeClassNames, "allowedRuntimeClassNames is required");
            this.defaultRuntimeClassName = defaultRuntimeClassName;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedRuntimeClassNames() {
            return this.allowedRuntimeClassNames;
        }

        @Override
        public final java.lang.String getDefaultRuntimeClassName() {
            return this.defaultRuntimeClassName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("allowedRuntimeClassNames", om.valueToTree(this.getAllowedRuntimeClassNames()));
            if (this.getDefaultRuntimeClassName() != null) {
                data.set("defaultRuntimeClassName", om.valueToTree(this.getDefaultRuntimeClassName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RuntimeClassStrategyOptionsV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RuntimeClassStrategyOptionsV1Beta1.Jsii$Proxy that = (RuntimeClassStrategyOptionsV1Beta1.Jsii$Proxy) o;

            if (!allowedRuntimeClassNames.equals(that.allowedRuntimeClassNames)) return false;
            return this.defaultRuntimeClassName != null ? this.defaultRuntimeClassName.equals(that.defaultRuntimeClassName) : that.defaultRuntimeClassName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowedRuntimeClassNames.hashCode();
            result = 31 * result + (this.defaultRuntimeClassName != null ? this.defaultRuntimeClassName.hashCode() : 0);
            return result;
        }
    }
}
