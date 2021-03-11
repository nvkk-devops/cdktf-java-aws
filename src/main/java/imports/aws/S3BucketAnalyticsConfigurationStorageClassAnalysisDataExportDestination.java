package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.831Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination")
@software.amazon.jsii.Jsii.Proxy(S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination.Jsii$Proxy.class)
public interface S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination extends software.amazon.jsii.JsiiSerializable {

    /**
     * s3_bucket_destination block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination> getS3BucketDestination();

    /**
     * @return a {@link Builder} of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination> {
        private java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination> s3BucketDestination;

        /**
         * Sets the value of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination#getS3BucketDestination}
         * @param s3BucketDestination s3_bucket_destination block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3BucketDestination(java.util.List<? extends imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination> s3BucketDestination) {
            this.s3BucketDestination = (java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination>)s3BucketDestination;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination build() {
            return new Jsii$Proxy(s3BucketDestination);
        }
    }

    /**
     * An implementation for {@link S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination {
        private final java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination> s3BucketDestination;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3BucketDestination = software.amazon.jsii.Kernel.get(this, "s3BucketDestination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination> s3BucketDestination) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3BucketDestination = (java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination>)java.util.Objects.requireNonNull(s3BucketDestination, "s3BucketDestination is required");
        }

        @Override
        public final java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination> getS3BucketDestination() {
            return this.s3BucketDestination;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("s3BucketDestination", om.valueToTree(this.getS3BucketDestination()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination.Jsii$Proxy that = (S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportDestination.Jsii$Proxy) o;

            return this.s3BucketDestination.equals(that.s3BucketDestination);
        }

        @Override
        public final int hashCode() {
            int result = this.s3BucketDestination.hashCode();
            return result;
        }
    }
}
