package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters extends software.amazon.jsii.JsiiSerializable {

    /**
     * csv block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> getCsv() {
        return null;
    }

    /**
     * json block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> getJson() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters> {
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> csv;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> json;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters#getCsv}
         * @param csv csv block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder csv(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> csv) {
            this.csv = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv>)csv;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters#getJson}
         * @param json json block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder json(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> json) {
            this.json = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson>)json;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters build() {
            return new Jsii$Proxy(csv, json);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> csv;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> json;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.csv = software.amazon.jsii.Kernel.get(this, "csv", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv.class)));
            this.json = software.amazon.jsii.Kernel.get(this, "json", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> csv, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> json) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.csv = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv>)csv;
            this.json = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson>)json;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> getCsv() {
            return this.csv;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> getJson() {
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
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters.Jsii$Proxy that = (KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters.Jsii$Proxy) o;

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
