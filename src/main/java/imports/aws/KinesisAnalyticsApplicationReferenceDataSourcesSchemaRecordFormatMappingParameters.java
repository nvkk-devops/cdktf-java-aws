package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.652Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters extends software.amazon.jsii.JsiiSerializable {

    /**
     * csv block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv> getCsv() {
        return null;
    }

    /**
     * json block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson> getJson() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> {
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv> csv;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson> json;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters#getCsv}
         * @param csv csv block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder csv(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv> csv) {
            this.csv = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv>)csv;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters#getJson}
         * @param json json block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder json(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson> json) {
            this.json = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson>)json;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters build() {
            return new Jsii$Proxy(csv, json);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters {
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv> csv;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson> json;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.csv = software.amazon.jsii.Kernel.get(this, "csv", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv.class)));
            this.json = software.amazon.jsii.Kernel.get(this, "json", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv> csv, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson> json) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.csv = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv>)csv;
            this.json = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson>)json;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv> getCsv() {
            return this.csv;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson> getJson() {
            return this.json;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCsv() != null) {
                data.set("csv", om.valueToTree(this.getCsv()));
            }
            if (this.getJson() != null) {
                data.set("json", om.valueToTree(this.getJson()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters.Jsii$Proxy that = (KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters.Jsii$Proxy) o;

            if (this.csv != null ? !this.csv.equals(that.csv) : that.csv != null) return false;
            return this.json != null ? this.json.equals(that.json) : that.json == null;
        }

        @Override
        public final int hashCode() {
            int result = this.csv != null ? this.csv.hashCode() : 0;
            result = 31 * result + (this.json != null ? this.json.hashCode() : 0);
            return result;
        }
    }
}
