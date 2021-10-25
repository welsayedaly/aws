package imports.k8s;

/**
 * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.520Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePriorityClassV1Alpha1Props")
@software.amazon.jsii.Jsii.Proxy(KubePriorityClassV1Alpha1Props.Jsii$Proxy.class)
public interface KubePriorityClassV1Alpha1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * The value of this priority class.
     * <p>
     * This is the actual priority that pods receive when they have the name of this class in their pod spec.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getValue();

    /**
     * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class.
     * <p>
     * Only one PriorityClass can be marked as <code>globalDefault</code>. However, if more than one PriorityClasses exists with their <code>globalDefault</code> field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getGlobalDefault() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * <p>
     * One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * <p>
     * Default: PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPreemptionPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubePriorityClassV1Alpha1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubePriorityClassV1Alpha1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubePriorityClassV1Alpha1Props> {
        private java.lang.Number value;
        private java.lang.String description;
        private java.lang.Boolean globalDefault;
        private imports.k8s.ObjectMeta metadata;
        private java.lang.String preemptionPolicy;

        /**
         * Sets the value of {@link KubePriorityClassV1Alpha1Props#getValue}
         * @param value The value of this priority class. This parameter is required.
         *              This is the actual priority that pods receive when they have the name of this class in their pod spec.
         * @return {@code this}
         */
        public Builder value(java.lang.Number value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassV1Alpha1Props#getDescription}
         * @param description description is an arbitrary string that usually provides guidelines on when this priority class should be used.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassV1Alpha1Props#getGlobalDefault}
         * @param globalDefault globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class.
         *                      Only one PriorityClass can be marked as <code>globalDefault</code>. However, if more than one PriorityClasses exists with their <code>globalDefault</code> field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
         * @return {@code this}
         */
        public Builder globalDefault(java.lang.Boolean globalDefault) {
            this.globalDefault = globalDefault;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassV1Alpha1Props#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassV1Alpha1Props#getPreemptionPolicy}
         * @param preemptionPolicy PreemptionPolicy is the Policy for preempting pods with lower priority.
         *                         One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
         * @return {@code this}
         */
        public Builder preemptionPolicy(java.lang.String preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubePriorityClassV1Alpha1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubePriorityClassV1Alpha1Props build() {
            return new Jsii$Proxy(value, description, globalDefault, metadata, preemptionPolicy);
        }
    }

    /**
     * An implementation for {@link KubePriorityClassV1Alpha1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubePriorityClassV1Alpha1Props {
        private final java.lang.Number value;
        private final java.lang.String description;
        private final java.lang.Boolean globalDefault;
        private final imports.k8s.ObjectMeta metadata;
        private final java.lang.String preemptionPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.globalDefault = software.amazon.jsii.Kernel.get(this, "globalDefault", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.preemptionPolicy = software.amazon.jsii.Kernel.get(this, "preemptionPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number value, final java.lang.String description, final java.lang.Boolean globalDefault, final imports.k8s.ObjectMeta metadata, final java.lang.String preemptionPolicy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.value = java.util.Objects.requireNonNull(value, "value is required");
            this.description = description;
            this.globalDefault = globalDefault;
            this.metadata = metadata;
            this.preemptionPolicy = preemptionPolicy;
        }

        @Override
        public final java.lang.Number getValue() {
            return this.value;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Boolean getGlobalDefault() {
            return this.globalDefault;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.lang.String getPreemptionPolicy() {
            return this.preemptionPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("value", om.valueToTree(this.getValue()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getGlobalDefault() != null) {
                data.set("globalDefault", om.valueToTree(this.getGlobalDefault()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getPreemptionPolicy() != null) {
                data.set("preemptionPolicy", om.valueToTree(this.getPreemptionPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubePriorityClassV1Alpha1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubePriorityClassV1Alpha1Props.Jsii$Proxy that = (KubePriorityClassV1Alpha1Props.Jsii$Proxy) o;

            if (!value.equals(that.value)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.globalDefault != null ? !this.globalDefault.equals(that.globalDefault) : that.globalDefault != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.preemptionPolicy != null ? this.preemptionPolicy.equals(that.preemptionPolicy) : that.preemptionPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.value.hashCode();
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.globalDefault != null ? this.globalDefault.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.preemptionPolicy != null ? this.preemptionPolicy.hashCode() : 0);
            return result;
        }
    }
}
