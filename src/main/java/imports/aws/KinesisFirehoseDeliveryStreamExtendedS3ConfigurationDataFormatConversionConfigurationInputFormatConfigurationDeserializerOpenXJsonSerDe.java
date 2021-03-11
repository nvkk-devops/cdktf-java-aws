package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.656Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCaseInsensitive() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getColumnToJsonKeyMappings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getConvertDotsInJsonKeysToUnderscores() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe> {
        private java.lang.Boolean caseInsensitive;
        private java.util.Map<java.lang.String, java.lang.String> columnToJsonKeyMappings;
        private java.lang.Boolean convertDotsInJsonKeysToUnderscores;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe#getCaseInsensitive}
         * @param caseInsensitive the value to be set.
         * @return {@code this}
         */
        public Builder caseInsensitive(java.lang.Boolean caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe#getColumnToJsonKeyMappings}
         * @param columnToJsonKeyMappings the value to be set.
         * @return {@code this}
         */
        public Builder columnToJsonKeyMappings(java.util.Map<java.lang.String, java.lang.String> columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = columnToJsonKeyMappings;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe#getConvertDotsInJsonKeysToUnderscores}
         * @param convertDotsInJsonKeysToUnderscores the value to be set.
         * @return {@code this}
         */
        public Builder convertDotsInJsonKeysToUnderscores(java.lang.Boolean convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe build() {
            return new Jsii$Proxy(caseInsensitive, columnToJsonKeyMappings, convertDotsInJsonKeysToUnderscores);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe {
        private final java.lang.Boolean caseInsensitive;
        private final java.util.Map<java.lang.String, java.lang.String> columnToJsonKeyMappings;
        private final java.lang.Boolean convertDotsInJsonKeysToUnderscores;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.caseInsensitive = software.amazon.jsii.Kernel.get(this, "caseInsensitive", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.columnToJsonKeyMappings = software.amazon.jsii.Kernel.get(this, "columnToJsonKeyMappings", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.convertDotsInJsonKeysToUnderscores = software.amazon.jsii.Kernel.get(this, "convertDotsInJsonKeysToUnderscores", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean caseInsensitive, final java.util.Map<java.lang.String, java.lang.String> columnToJsonKeyMappings, final java.lang.Boolean convertDotsInJsonKeysToUnderscores) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.caseInsensitive = caseInsensitive;
            this.columnToJsonKeyMappings = columnToJsonKeyMappings;
            this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
        }

        @Override
        public final java.lang.Boolean getCaseInsensitive() {
            return this.caseInsensitive;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getColumnToJsonKeyMappings() {
            return this.columnToJsonKeyMappings;
        }

        @Override
        public final java.lang.Boolean getConvertDotsInJsonKeysToUnderscores() {
            return this.convertDotsInJsonKeysToUnderscores;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCaseInsensitive() != null) {
                data.set("caseInsensitive", om.valueToTree(this.getCaseInsensitive()));
            }
            if (this.getColumnToJsonKeyMappings() != null) {
                data.set("columnToJsonKeyMappings", om.valueToTree(this.getColumnToJsonKeyMappings()));
            }
            if (this.getConvertDotsInJsonKeysToUnderscores() != null) {
                data.set("convertDotsInJsonKeysToUnderscores", om.valueToTree(this.getConvertDotsInJsonKeysToUnderscores()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe.Jsii$Proxy) o;

            if (this.caseInsensitive != null ? !this.caseInsensitive.equals(that.caseInsensitive) : that.caseInsensitive != null) return false;
            if (this.columnToJsonKeyMappings != null ? !this.columnToJsonKeyMappings.equals(that.columnToJsonKeyMappings) : that.columnToJsonKeyMappings != null) return false;
            return this.convertDotsInJsonKeysToUnderscores != null ? this.convertDotsInJsonKeysToUnderscores.equals(that.convertDotsInJsonKeysToUnderscores) : that.convertDotsInJsonKeysToUnderscores == null;
        }

        @Override
        public final int hashCode() {
            int result = this.caseInsensitive != null ? this.caseInsensitive.hashCode() : 0;
            result = 31 * result + (this.columnToJsonKeyMappings != null ? this.columnToJsonKeyMappings.hashCode() : 0);
            result = 31 * result + (this.convertDotsInJsonKeysToUnderscores != null ? this.convertDotsInJsonKeysToUnderscores.hashCode() : 0);
            return result;
        }
    }
}
