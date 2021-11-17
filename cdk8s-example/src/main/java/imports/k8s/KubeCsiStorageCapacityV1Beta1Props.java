package imports.k8s;

/**
 * CSIStorageCapacity stores the result of one CSI GetCapacity call.
 * <p>
 * For a given StorageClass, this describes the available capacity in a particular topology segment.  This can be used when considering where to instantiate new PersistentVolumes.
 * <p>
 * For example this can express things like: - StorageClass "standard" has "1234 GiB" available in "topology.kubernetes.io/zone=us-east1" - StorageClass "localssd" has "10 GiB" available in "kubernetes.io/hostname=knode-abc123"
 * <p>
 * The following three cases all imply that no capacity is available for a certain combination: - no object exists with suitable topology and storage class name - such an object exists, but the capacity is unset - such an object exists, but the capacity is zero
 * <p>
 * The producer of these objects can decide which approach is more suitable.
 * <p>
 * They are consumed by the kube-scheduler if the CSIStorageCapacity beta feature gate is enabled there and a CSI driver opts into capacity-aware scheduling with CSIDriver.StorageCapacity.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.473Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeCsiStorageCapacityV1Beta1Props")
@software.amazon.jsii.Jsii.Proxy(KubeCsiStorageCapacityV1Beta1Props.Jsii$Proxy.class)
public interface KubeCsiStorageCapacityV1Beta1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * The name of the StorageClass that the reported capacity applies to.
     * <p>
     * It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStorageClassName();

    /**
     * Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * <p>
     * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable and treated like zero capacity.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getCapacity() {
        return null;
    }

    /**
     * MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * <p>
     * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getMaximumVolumeSize() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-<uuid>, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
     * <p>
     * Objects are namespaced.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * NodeTopology defines which nodes have access to the storage for which capacity was reported.
     * <p>
     * If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getNodeTopology() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeCsiStorageCapacityV1Beta1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeCsiStorageCapacityV1Beta1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeCsiStorageCapacityV1Beta1Props> {
        private java.lang.String storageClassName;
        private imports.k8s.Quantity capacity;
        private imports.k8s.Quantity maximumVolumeSize;
        private imports.k8s.ObjectMeta metadata;
        private imports.k8s.LabelSelector nodeTopology;

        /**
         * Sets the value of {@link KubeCsiStorageCapacityV1Beta1Props#getStorageClassName}
         * @param storageClassName The name of the StorageClass that the reported capacity applies to. This parameter is required.
         *                         It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link KubeCsiStorageCapacityV1Beta1Props#getCapacity}
         * @param capacity Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         *                 The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable and treated like zero capacity.
         * @return {@code this}
         */
        public Builder capacity(imports.k8s.Quantity capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * Sets the value of {@link KubeCsiStorageCapacityV1Beta1Props#getMaximumVolumeSize}
         * @param maximumVolumeSize MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         *                          This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
         * @return {@code this}
         */
        public Builder maximumVolumeSize(imports.k8s.Quantity maximumVolumeSize) {
            this.maximumVolumeSize = maximumVolumeSize;
            return this;
        }

        /**
         * Sets the value of {@link KubeCsiStorageCapacityV1Beta1Props#getMetadata}
         * @param metadata Standard object's metadata.
         *                 The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-<uuid>, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
         *                 <p>
         *                 Objects are namespaced.
         *                 <p>
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeCsiStorageCapacityV1Beta1Props#getNodeTopology}
         * @param nodeTopology NodeTopology defines which nodes have access to the storage for which capacity was reported.
         *                     If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
         * @return {@code this}
         */
        public Builder nodeTopology(imports.k8s.LabelSelector nodeTopology) {
            this.nodeTopology = nodeTopology;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeCsiStorageCapacityV1Beta1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeCsiStorageCapacityV1Beta1Props build() {
            return new Jsii$Proxy(storageClassName, capacity, maximumVolumeSize, metadata, nodeTopology);
        }
    }

    /**
     * An implementation for {@link KubeCsiStorageCapacityV1Beta1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeCsiStorageCapacityV1Beta1Props {
        private final java.lang.String storageClassName;
        private final imports.k8s.Quantity capacity;
        private final imports.k8s.Quantity maximumVolumeSize;
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.LabelSelector nodeTopology;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.storageClassName = software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.capacity = software.amazon.jsii.Kernel.get(this, "capacity", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
            this.maximumVolumeSize = software.amazon.jsii.Kernel.get(this, "maximumVolumeSize", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.nodeTopology = software.amazon.jsii.Kernel.get(this, "nodeTopology", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String storageClassName, final imports.k8s.Quantity capacity, final imports.k8s.Quantity maximumVolumeSize, final imports.k8s.ObjectMeta metadata, final imports.k8s.LabelSelector nodeTopology) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.storageClassName = java.util.Objects.requireNonNull(storageClassName, "storageClassName is required");
            this.capacity = capacity;
            this.maximumVolumeSize = maximumVolumeSize;
            this.metadata = metadata;
            this.nodeTopology = nodeTopology;
        }

        @Override
        public final java.lang.String getStorageClassName() {
            return this.storageClassName;
        }

        @Override
        public final imports.k8s.Quantity getCapacity() {
            return this.capacity;
        }

        @Override
        public final imports.k8s.Quantity getMaximumVolumeSize() {
            return this.maximumVolumeSize;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.LabelSelector getNodeTopology() {
            return this.nodeTopology;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("storageClassName", om.valueToTree(this.getStorageClassName()));
            if (this.getCapacity() != null) {
                data.set("capacity", om.valueToTree(this.getCapacity()));
            }
            if (this.getMaximumVolumeSize() != null) {
                data.set("maximumVolumeSize", om.valueToTree(this.getMaximumVolumeSize()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getNodeTopology() != null) {
                data.set("nodeTopology", om.valueToTree(this.getNodeTopology()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeCsiStorageCapacityV1Beta1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeCsiStorageCapacityV1Beta1Props.Jsii$Proxy that = (KubeCsiStorageCapacityV1Beta1Props.Jsii$Proxy) o;

            if (!storageClassName.equals(that.storageClassName)) return false;
            if (this.capacity != null ? !this.capacity.equals(that.capacity) : that.capacity != null) return false;
            if (this.maximumVolumeSize != null ? !this.maximumVolumeSize.equals(that.maximumVolumeSize) : that.maximumVolumeSize != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.nodeTopology != null ? this.nodeTopology.equals(that.nodeTopology) : that.nodeTopology == null;
        }

        @Override
        public final int hashCode() {
            int result = this.storageClassName.hashCode();
            result = 31 * result + (this.capacity != null ? this.capacity.hashCode() : 0);
            result = 31 * result + (this.maximumVolumeSize != null ? this.maximumVolumeSize.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.nodeTopology != null ? this.nodeTopology.hashCode() : 0);
            return result;
        }
    }
}
