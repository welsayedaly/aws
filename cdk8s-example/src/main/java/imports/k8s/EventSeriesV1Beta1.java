package imports.k8s;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.39.0 (build 8af72c2)", date = "2021-10-15T13:35:33.424Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EventSeriesV1Beta1")
@software.amazon.jsii.Jsii.Proxy(EventSeriesV1Beta1.Jsii$Proxy.class)
public interface EventSeriesV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getCount();

    /**
     * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
     */
    @org.jetbrains.annotations.NotNull java.time.Instant getLastObservedTime();

    /**
     * @return a {@link Builder} of {@link EventSeriesV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventSeriesV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EventSeriesV1Beta1> {
        private java.lang.Number count;
        private java.time.Instant lastObservedTime;

        /**
         * Sets the value of {@link EventSeriesV1Beta1#getCount}
         * @param count count is the number of occurrences in this series up to the last heartbeat time. This parameter is required.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EventSeriesV1Beta1#getLastObservedTime}
         * @param lastObservedTime lastObservedTime is the time when last Event from the series was seen before last heartbeat. This parameter is required.
         * @return {@code this}
         */
        public Builder lastObservedTime(java.time.Instant lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventSeriesV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EventSeriesV1Beta1 build() {
            return new Jsii$Proxy(count, lastObservedTime);
        }
    }

    /**
     * An implementation for {@link EventSeriesV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventSeriesV1Beta1 {
        private final java.lang.Number count;
        private final java.time.Instant lastObservedTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.lastObservedTime = software.amazon.jsii.Kernel.get(this, "lastObservedTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number count, final java.time.Instant lastObservedTime) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = java.util.Objects.requireNonNull(count, "count is required");
            this.lastObservedTime = java.util.Objects.requireNonNull(lastObservedTime, "lastObservedTime is required");
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.time.Instant getLastObservedTime() {
            return this.lastObservedTime;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("count", om.valueToTree(this.getCount()));
            data.set("lastObservedTime", om.valueToTree(this.getLastObservedTime()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EventSeriesV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventSeriesV1Beta1.Jsii$Proxy that = (EventSeriesV1Beta1.Jsii$Proxy) o;

            if (!count.equals(that.count)) return false;
            return this.lastObservedTime.equals(that.lastObservedTime);
        }

        @Override
        public final int hashCode() {
            int result = this.count.hashCode();
            result = 31 * result + (this.lastObservedTime.hashCode());
            return result;
        }
    }
}
