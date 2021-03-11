package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.652Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends software.amazon.jsii.JsiiSerializable {

    /**
     * mapping_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> getMappingParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat> {
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> mappingParameters;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat#getMappingParameters}
         * @param mappingParameters mapping_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder mappingParameters(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> mappingParameters) {
            this.mappingParameters = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters>)mappingParameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat build() {
            return new Jsii$Proxy(mappingParameters);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> mappingParameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.mappingParameters = software.amazon.jsii.Kernel.get(this, "mappingParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> mappingParameters) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.mappingParameters = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters>)mappingParameters;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> getMappingParameters() {
            return this.mappingParameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMappingParameters() != null) {
                data.set("mappingParameters", om.valueToTree(this.getMappingParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat.Jsii$Proxy that = (KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat.Jsii$Proxy) o;

            return this.mappingParameters != null ? this.mappingParameters.equals(that.mappingParameters) : that.mappingParameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.mappingParameters != null ? this.mappingParameters.hashCode() : 0;
            return result;
        }
    }
}
