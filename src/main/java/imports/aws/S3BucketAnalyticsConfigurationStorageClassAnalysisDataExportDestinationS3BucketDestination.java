package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.831Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination")
@software.amazon.jsii.Jsii.Proxy(S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination.Jsii$Proxy.class)
public interface S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBucketArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getBucketAccountId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination> {
        private java.lang.String bucketArn;
        private java.lang.String bucketAccountId;
        private java.lang.String format;
        private java.lang.String prefix;

        /**
         * Sets the value of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination#getBucketArn}
         * @param bucketArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketArn(java.lang.String bucketArn) {
            this.bucketArn = bucketArn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination#getBucketAccountId}
         * @param bucketAccountId the value to be set.
         * @return {@code this}
         */
        public Builder bucketAccountId(java.lang.String bucketAccountId) {
            this.bucketAccountId = bucketAccountId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination#getFormat}
         * @param format the value to be set.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination build() {
            return new Jsii$Proxy(bucketArn, bucketAccountId, format, prefix);
        }
    }

    /**
     * An implementation for {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
        private final java.lang.String bucketArn;
        private final java.lang.String bucketAccountId;
        private final java.lang.String format;
        private final java.lang.String prefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketArn = software.amazon.jsii.Kernel.get(this, "bucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketAccountId = software.amazon.jsii.Kernel.get(this, "bucketAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String bucketArn, final java.lang.String bucketAccountId, final java.lang.String format, final java.lang.String prefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketArn = java.util.Objects.requireNonNull(bucketArn, "bucketArn is required");
            this.bucketAccountId = bucketAccountId;
            this.format = format;
            this.prefix = prefix;
        }

        @Override
        public final java.lang.String getBucketArn() {
            return this.bucketArn;
        }

        @Override
        public final java.lang.String getBucketAccountId() {
            return this.bucketAccountId;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucketArn", om.valueToTree(this.getBucketArn()));
            if (this.getBucketAccountId() != null) {
                data.set("bucketAccountId", om.valueToTree(this.getBucketAccountId()));
            }
            if (this.getFormat() != null) {
                data.set("format", om.valueToTree(this.getFormat()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination.Jsii$Proxy that = (S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination.Jsii$Proxy) o;

            if (!bucketArn.equals(that.bucketArn)) return false;
            if (this.bucketAccountId != null ? !this.bucketAccountId.equals(that.bucketAccountId) : that.bucketAccountId != null) return false;
            if (this.format != null ? !this.format.equals(that.format) : that.format != null) return false;
            return this.prefix != null ? this.prefix.equals(that.prefix) : that.prefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketArn.hashCode();
            result = 31 * result + (this.bucketAccountId != null ? this.bucketAccountId.hashCode() : 0);
            result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            return result;
        }
    }
}
