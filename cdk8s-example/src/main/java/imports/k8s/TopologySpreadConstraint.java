package imports.k8s;

/**
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.600Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.TopologySpreadConstraint")
@software.amazon.jsii.Jsii.Proxy(TopologySpreadConstraint.Jsii$Proxy.class)
public interface TopologySpreadConstraint extends software.amazon.jsii.JsiiSerializable {

    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed.
     * <p>
     * When <code>whenUnsatisfiable=DoNotSchedule</code>, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When <code>whenUnsatisfiable=ScheduleAnyway</code>, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxSkew();

    /**
     * TopologyKey is the key of node labels.
     * <p>
     * Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a "bucket", and try to put balanced number of pods into each bucket. It's a required field.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTopologyKey();

    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint.
     * <p>
     * <ul>
     * <li>DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
     * but giving higher precedence to topologies that would help reduce the
     * skew.
     * A constraint is considered "Unsatisfiable" for an incoming pod if and only if every possible node assigment for that pod would violate "MaxSkew" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it <em>more</em> imbalanced. It's a required field.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getWhenUnsatisfiable();

    /**
     * LabelSelector is used to find matching pods.
     * <p>
     * Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getLabelSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TopologySpreadConstraint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TopologySpreadConstraint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TopologySpreadConstraint> {
        private java.lang.Number maxSkew;
        private java.lang.String topologyKey;
        private java.lang.String whenUnsatisfiable;
        private imports.k8s.LabelSelector labelSelector;

        /**
         * Sets the value of {@link TopologySpreadConstraint#getMaxSkew}
         * @param maxSkew MaxSkew describes the degree to which pods may be unevenly distributed. This parameter is required.
         *                When <code>whenUnsatisfiable=DoNotSchedule</code>, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When <code>whenUnsatisfiable=ScheduleAnyway</code>, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.
         * @return {@code this}
         */
        public Builder maxSkew(java.lang.Number maxSkew) {
            this.maxSkew = maxSkew;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getTopologyKey}
         * @param topologyKey TopologyKey is the key of node labels. This parameter is required.
         *                    Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a "bucket", and try to put balanced number of pods into each bucket. It's a required field.
         * @return {@code this}
         */
        public Builder topologyKey(java.lang.String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getWhenUnsatisfiable}
         * @param whenUnsatisfiable WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. This parameter is required.
         *                          <ul>
         *                          <li>DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
         *                          but giving higher precedence to topologies that would help reduce the
         *                          skew.
         *                          A constraint is considered "Unsatisfiable" for an incoming pod if and only if every possible node assigment for that pod would violate "MaxSkew" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it <em>more</em> imbalanced. It's a required field.</li>
         *                          </ul>
         * @return {@code this}
         */
        public Builder whenUnsatisfiable(java.lang.String whenUnsatisfiable) {
            this.whenUnsatisfiable = whenUnsatisfiable;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getLabelSelector}
         * @param labelSelector LabelSelector is used to find matching pods.
         *                      Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
         * @return {@code this}
         */
        public Builder labelSelector(imports.k8s.LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TopologySpreadConstraint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TopologySpreadConstraint build() {
            return new Jsii$Proxy(maxSkew, topologyKey, whenUnsatisfiable, labelSelector);
        }
    }

    /**
     * An implementation for {@link TopologySpreadConstraint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TopologySpreadConstraint {
        private final java.lang.Number maxSkew;
        private final java.lang.String topologyKey;
        private final java.lang.String whenUnsatisfiable;
        private final imports.k8s.LabelSelector labelSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxSkew = software.amazon.jsii.Kernel.get(this, "maxSkew", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.topologyKey = software.amazon.jsii.Kernel.get(this, "topologyKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.whenUnsatisfiable = software.amazon.jsii.Kernel.get(this, "whenUnsatisfiable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.labelSelector = software.amazon.jsii.Kernel.get(this, "labelSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number maxSkew, final java.lang.String topologyKey, final java.lang.String whenUnsatisfiable, final imports.k8s.LabelSelector labelSelector) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxSkew = java.util.Objects.requireNonNull(maxSkew, "maxSkew is required");
            this.topologyKey = java.util.Objects.requireNonNull(topologyKey, "topologyKey is required");
            this.whenUnsatisfiable = java.util.Objects.requireNonNull(whenUnsatisfiable, "whenUnsatisfiable is required");
            this.labelSelector = labelSelector;
        }

        @Override
        public final java.lang.Number getMaxSkew() {
            return this.maxSkew;
        }

        @Override
        public final java.lang.String getTopologyKey() {
            return this.topologyKey;
        }

        @Override
        public final java.lang.String getWhenUnsatisfiable() {
            return this.whenUnsatisfiable;
        }

        @Override
        public final imports.k8s.LabelSelector getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxSkew", om.valueToTree(this.getMaxSkew()));
            data.set("topologyKey", om.valueToTree(this.getTopologyKey()));
            data.set("whenUnsatisfiable", om.valueToTree(this.getWhenUnsatisfiable()));
            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TopologySpreadConstraint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TopologySpreadConstraint.Jsii$Proxy that = (TopologySpreadConstraint.Jsii$Proxy) o;

            if (!maxSkew.equals(that.maxSkew)) return false;
            if (!topologyKey.equals(that.topologyKey)) return false;
            if (!whenUnsatisfiable.equals(that.whenUnsatisfiable)) return false;
            return this.labelSelector != null ? this.labelSelector.equals(that.labelSelector) : that.labelSelector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxSkew.hashCode();
            result = 31 * result + (this.topologyKey.hashCode());
            result = 31 * result + (this.whenUnsatisfiable.hashCode());
            result = 31 * result + (this.labelSelector != null ? this.labelSelector.hashCode() : 0);
            return result;
        }
    }
}
