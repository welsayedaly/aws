package imports.k8s;

/**
 * ClusterRoleList is a collection of ClusterRoles.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.461Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeClusterRoleListProps")
@software.amazon.jsii.Jsii.Proxy(KubeClusterRoleListProps.Jsii$Proxy.class)
public interface KubeClusterRoleListProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Items is a list of ClusterRoles.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.KubeClusterRoleProps> getItems();

    /**
     * Standard object's metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ListMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeClusterRoleListProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeClusterRoleListProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeClusterRoleListProps> {
        private java.util.List<imports.k8s.KubeClusterRoleProps> items;
        private imports.k8s.ListMeta metadata;

        /**
         * Sets the value of {@link KubeClusterRoleListProps#getItems}
         * @param items Items is a list of ClusterRoles. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder items(java.util.List<? extends imports.k8s.KubeClusterRoleProps> items) {
            this.items = (java.util.List<imports.k8s.KubeClusterRoleProps>)items;
            return this;
        }

        /**
         * Sets the value of {@link KubeClusterRoleListProps#getMetadata}
         * @param metadata Standard object's metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeClusterRoleListProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeClusterRoleListProps build() {
            return new Jsii$Proxy(items, metadata);
        }
    }

    /**
     * An implementation for {@link KubeClusterRoleListProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeClusterRoleListProps {
        private final java.util.List<imports.k8s.KubeClusterRoleProps> items;
        private final imports.k8s.ListMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.KubeClusterRoleProps.class)));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ListMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.k8s.KubeClusterRoleProps> items, final imports.k8s.ListMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = (java.util.List<imports.k8s.KubeClusterRoleProps>)java.util.Objects.requireNonNull(items, "items is required");
            this.metadata = metadata;
        }

        @Override
        public final java.util.List<imports.k8s.KubeClusterRoleProps> getItems() {
            return this.items;
        }

        @Override
        public final imports.k8s.ListMeta getMetadata() {
            return this.metadata;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("items", om.valueToTree(this.getItems()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeClusterRoleListProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeClusterRoleListProps.Jsii$Proxy that = (KubeClusterRoleListProps.Jsii$Proxy) o;

            if (!items.equals(that.items)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.items.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
