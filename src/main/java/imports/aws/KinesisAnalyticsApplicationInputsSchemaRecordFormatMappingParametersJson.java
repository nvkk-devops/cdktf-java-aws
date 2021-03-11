package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRecordRowPath();

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> {
        private java.lang.String recordRowPath;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson#getRecordRowPath}
         * @param recordRowPath the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder recordRowPath(java.lang.String recordRowPath) {
            this.recordRowPath = recordRowPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson build() {
            return new Jsii$Proxy(recordRowPath);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson {
        private final java.lang.String recordRowPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.recordRowPath = software.amazon.jsii.Kernel.get(this, "recordRowPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String recordRowPath) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.recordRowPath = java.util.Objects.requireNonNull(recordRowPath, "recordRowPath is required");
        }

        @Override
        public final java.lang.String getRecordRowPath() {
            return this.recordRowPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("recordRowPath", om.valueToTree(this.getRecordRowPath()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson.Jsii$Proxy that = (KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson.Jsii$Proxy) o;

            return this.recordRowPath.equals(that.recordRowPath);
        }

        @Override
        public final int hashCode() {
            int result = this.recordRowPath.hashCode();
            return result;
        }
    }
}
