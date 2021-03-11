package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationInputsSchemaRecordFormat.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationInputsSchemaRecordFormat extends software.amazon.jsii.JsiiSerializable {

    /**
     * mapping_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters> getMappingParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormat}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormat}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationInputsSchemaRecordFormat> {
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters> mappingParameters;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormat#getMappingParameters}
         * @param mappingParameters mapping_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder mappingParameters(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters> mappingParameters) {
            this.mappingParameters = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters>)mappingParameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormat}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationInputsSchemaRecordFormat build() {
            return new Jsii$Proxy(mappingParameters);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormat}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationInputsSchemaRecordFormat {
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters> mappingParameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.mappingParameters = software.amazon.jsii.Kernel.get(this, "mappingParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters> mappingParameters) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.mappingParameters = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters>)mappingParameters;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters> getMappingParameters() {
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
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationInputsSchemaRecordFormat.Jsii$Proxy that = (KinesisAnalyticsApplicationInputsSchemaRecordFormat.Jsii$Proxy) o;

            return this.mappingParameters != null ? this.mappingParameters.equals(that.mappingParameters) : that.mappingParameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.mappingParameters != null ? this.mappingParameters.hashCode() : 0;
            return result;
        }
    }
}
