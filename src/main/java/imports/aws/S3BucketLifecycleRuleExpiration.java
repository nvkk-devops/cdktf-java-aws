package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.833Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketLifecycleRuleExpiration")
@software.amazon.jsii.Jsii.Proxy(S3BucketLifecycleRuleExpiration.Jsii$Proxy.class)
public interface S3BucketLifecycleRuleExpiration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getDate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDays() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExpiredObjectDeleteMarker() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketLifecycleRuleExpiration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketLifecycleRuleExpiration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketLifecycleRuleExpiration> {
        private java.lang.String date;
        private java.lang.Number days;
        private java.lang.Boolean expiredObjectDeleteMarker;

        /**
         * Sets the value of {@link S3BucketLifecycleRuleExpiration#getDate}
         * @param date the value to be set.
         * @return {@code this}
         */
        public Builder date(java.lang.String date) {
            this.date = date;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRuleExpiration#getDays}
         * @param days the value to be set.
         * @return {@code this}
         */
        public Builder days(java.lang.Number days) {
            this.days = days;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRuleExpiration#getExpiredObjectDeleteMarker}
         * @param expiredObjectDeleteMarker the value to be set.
         * @return {@code this}
         */
        public Builder expiredObjectDeleteMarker(java.lang.Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketLifecycleRuleExpiration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketLifecycleRuleExpiration build() {
            return new Jsii$Proxy(date, days, expiredObjectDeleteMarker);
        }
    }

    /**
     * An implementation for {@link S3BucketLifecycleRuleExpiration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketLifecycleRuleExpiration {
        private final java.lang.String date;
        private final java.lang.Number days;
        private final java.lang.Boolean expiredObjectDeleteMarker;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.date = software.amazon.jsii.Kernel.get(this, "date", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.days = software.amazon.jsii.Kernel.get(this, "days", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.expiredObjectDeleteMarker = software.amazon.jsii.Kernel.get(this, "expiredObjectDeleteMarker", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String date, final java.lang.Number days, final java.lang.Boolean expiredObjectDeleteMarker) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.date = date;
            this.days = days;
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
        }

        @Override
        public final java.lang.String getDate() {
            return this.date;
        }

        @Override
        public final java.lang.Number getDays() {
            return this.days;
        }

        @Override
        public final java.lang.Boolean getExpiredObjectDeleteMarker() {
            return this.expiredObjectDeleteMarker;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDate() != null) {
                data.set("date", om.valueToTree(this.getDate()));
            }
            if (this.getDays() != null) {
                data.set("days", om.valueToTree(this.getDays()));
            }
            if (this.getExpiredObjectDeleteMarker() != null) {
                data.set("expiredObjectDeleteMarker", om.valueToTree(this.getExpiredObjectDeleteMarker()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketLifecycleRuleExpiration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketLifecycleRuleExpiration.Jsii$Proxy that = (S3BucketLifecycleRuleExpiration.Jsii$Proxy) o;

            if (this.date != null ? !this.date.equals(that.date) : that.date != null) return false;
            if (this.days != null ? !this.days.equals(that.days) : that.days != null) return false;
            return this.expiredObjectDeleteMarker != null ? this.expiredObjectDeleteMarker.equals(that.expiredObjectDeleteMarker) : that.expiredObjectDeleteMarker == null;
        }

        @Override
        public final int hashCode() {
            int result = this.date != null ? this.date.hashCode() : 0;
            result = 31 * result + (this.days != null ? this.days.hashCode() : 0);
            result = 31 * result + (this.expiredObjectDeleteMarker != null ? this.expiredObjectDeleteMarker.hashCode() : 0);
            return result;
        }
    }
}
