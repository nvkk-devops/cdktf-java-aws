package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.831Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketAnalyticsConfigurationStorageClassAnalysis")
@software.amazon.jsii.Jsii.Proxy(S3BucketAnalyticsConfigurationStorageClassAnalysis.Jsii$Proxy.class)
public interface S3BucketAnalyticsConfigurationStorageClassAnalysis extends software.amazon.jsii.JsiiSerializable {

    /**
     * data_export block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport> getDataExport();

    /**
     * @return a {@link Builder} of {@link S3BucketAnalyticsConfigurationStorageClassAnalysis}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketAnalyticsConfigurationStorageClassAnalysis}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketAnalyticsConfigurationStorageClassAnalysis> {
        private java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport> dataExport;

        /**
         * Sets the value of {@link S3BucketAnalyticsConfigurationStorageClassAnalysis#getDataExport}
         * @param dataExport data_export block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dataExport(java.util.List<? extends imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport> dataExport) {
            this.dataExport = (java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport>)dataExport;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketAnalyticsConfigurationStorageClassAnalysis}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketAnalyticsConfigurationStorageClassAnalysis build() {
            return new Jsii$Proxy(dataExport);
        }
    }

    /**
     * An implementation for {@link S3BucketAnalyticsConfigurationStorageClassAnalysis}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketAnalyticsConfigurationStorageClassAnalysis {
        private final java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport> dataExport;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dataExport = software.amazon.jsii.Kernel.get(this, "dataExport", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport> dataExport) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dataExport = (java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport>)java.util.Objects.requireNonNull(dataExport, "dataExport is required");
        }

        @Override
        public final java.util.List<imports.aws.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport> getDataExport() {
            return this.dataExport;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("dataExport", om.valueToTree(this.getDataExport()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketAnalyticsConfigurationStorageClassAnalysis"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketAnalyticsConfigurationStorageClassAnalysis.Jsii$Proxy that = (S3BucketAnalyticsConfigurationStorageClassAnalysis.Jsii$Proxy) o;

            return this.dataExport.equals(that.dataExport);
        }

        @Override
        public final int hashCode() {
            int result = this.dataExport.hashCode();
            return result;
        }
    }
}
