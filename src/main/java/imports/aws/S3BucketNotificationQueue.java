package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.835Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketNotificationQueue")
@software.amazon.jsii.Jsii.Proxy(S3BucketNotificationQueue.Jsii$Proxy.class)
public interface S3BucketNotificationQueue extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEvents();

    @org.jetbrains.annotations.NotNull java.lang.String getQueueArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getFilterPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFilterSuffix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketNotificationQueue}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketNotificationQueue}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketNotificationQueue> {
        private java.util.List<java.lang.String> events;
        private java.lang.String queueArn;
        private java.lang.String filterPrefix;
        private java.lang.String filterSuffix;
        private java.lang.String id;

        /**
         * Sets the value of {@link S3BucketNotificationQueue#getEvents}
         * @param events the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder events(java.util.List<java.lang.String> events) {
            this.events = events;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationQueue#getQueueArn}
         * @param queueArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder queueArn(java.lang.String queueArn) {
            this.queueArn = queueArn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationQueue#getFilterPrefix}
         * @param filterPrefix the value to be set.
         * @return {@code this}
         */
        public Builder filterPrefix(java.lang.String filterPrefix) {
            this.filterPrefix = filterPrefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationQueue#getFilterSuffix}
         * @param filterSuffix the value to be set.
         * @return {@code this}
         */
        public Builder filterSuffix(java.lang.String filterSuffix) {
            this.filterSuffix = filterSuffix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationQueue#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketNotificationQueue}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketNotificationQueue build() {
            return new Jsii$Proxy(events, queueArn, filterPrefix, filterSuffix, id);
        }
    }

    /**
     * An implementation for {@link S3BucketNotificationQueue}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketNotificationQueue {
        private final java.util.List<java.lang.String> events;
        private final java.lang.String queueArn;
        private final java.lang.String filterPrefix;
        private final java.lang.String filterSuffix;
        private final java.lang.String id;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.events = software.amazon.jsii.Kernel.get(this, "events", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.queueArn = software.amazon.jsii.Kernel.get(this, "queueArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filterPrefix = software.amazon.jsii.Kernel.get(this, "filterPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filterSuffix = software.amazon.jsii.Kernel.get(this, "filterSuffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> events, final java.lang.String queueArn, final java.lang.String filterPrefix, final java.lang.String filterSuffix, final java.lang.String id) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.events = java.util.Objects.requireNonNull(events, "events is required");
            this.queueArn = java.util.Objects.requireNonNull(queueArn, "queueArn is required");
            this.filterPrefix = filterPrefix;
            this.filterSuffix = filterSuffix;
            this.id = id;
        }

        @Override
        public final java.util.List<java.lang.String> getEvents() {
            return this.events;
        }

        @Override
        public final java.lang.String getQueueArn() {
            return this.queueArn;
        }

        @Override
        public final java.lang.String getFilterPrefix() {
            return this.filterPrefix;
        }

        @Override
        public final java.lang.String getFilterSuffix() {
            return this.filterSuffix;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("events", om.valueToTree(this.getEvents()));
            data.set("queueArn", om.valueToTree(this.getQueueArn()));
            if (this.getFilterPrefix() != null) {
                data.set("filterPrefix", om.valueToTree(this.getFilterPrefix()));
            }
            if (this.getFilterSuffix() != null) {
                data.set("filterSuffix", om.valueToTree(this.getFilterSuffix()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketNotificationQueue"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketNotificationQueue.Jsii$Proxy that = (S3BucketNotificationQueue.Jsii$Proxy) o;

            if (!events.equals(that.events)) return false;
            if (!queueArn.equals(that.queueArn)) return false;
            if (this.filterPrefix != null ? !this.filterPrefix.equals(that.filterPrefix) : that.filterPrefix != null) return false;
            if (this.filterSuffix != null ? !this.filterSuffix.equals(that.filterSuffix) : that.filterSuffix != null) return false;
            return this.id != null ? this.id.equals(that.id) : that.id == null;
        }

        @Override
        public final int hashCode() {
            int result = this.events.hashCode();
            result = 31 * result + (this.queueArn.hashCode());
            result = 31 * result + (this.filterPrefix != null ? this.filterPrefix.hashCode() : 0);
            result = 31 * result + (this.filterSuffix != null ? this.filterSuffix.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            return result;
        }
    }
}
