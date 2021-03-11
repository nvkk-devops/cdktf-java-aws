package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRecordColumnDelimiter();

    @org.jetbrains.annotations.NotNull java.lang.String getRecordRowDelimiter();

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> {
        private java.lang.String recordColumnDelimiter;
        private java.lang.String recordRowDelimiter;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv#getRecordColumnDelimiter}
         * @param recordColumnDelimiter the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder recordColumnDelimiter(java.lang.String recordColumnDelimiter) {
            this.recordColumnDelimiter = recordColumnDelimiter;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv#getRecordRowDelimiter}
         * @param recordRowDelimiter the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder recordRowDelimiter(java.lang.String recordRowDelimiter) {
            this.recordRowDelimiter = recordRowDelimiter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv build() {
            return new Jsii$Proxy(recordColumnDelimiter, recordRowDelimiter);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv {
        private final java.lang.String recordColumnDelimiter;
        private final java.lang.String recordRowDelimiter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.recordColumnDelimiter = software.amazon.jsii.Kernel.get(this, "recordColumnDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.recordRowDelimiter = software.amazon.jsii.Kernel.get(this, "recordRowDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String recordColumnDelimiter, final java.lang.String recordRowDelimiter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.recordColumnDelimiter = java.util.Objects.requireNonNull(recordColumnDelimiter, "recordColumnDelimiter is required");
            this.recordRowDelimiter = java.util.Objects.requireNonNull(recordRowDelimiter, "recordRowDelimiter is required");
        }

        @Override
        public final java.lang.String getRecordColumnDelimiter() {
            return this.recordColumnDelimiter;
        }

        @Override
        public final java.lang.String getRecordRowDelimiter() {
            return this.recordRowDelimiter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("recordColumnDelimiter", om.valueToTree(this.getRecordColumnDelimiter()));
            data.set("recordRowDelimiter", om.valueToTree(this.getRecordRowDelimiter()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv.Jsii$Proxy that = (KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv.Jsii$Proxy) o;

            if (!recordColumnDelimiter.equals(that.recordColumnDelimiter)) return false;
            return this.recordRowDelimiter.equals(that.recordRowDelimiter);
        }

        @Override
        public final int hashCode() {
            int result = this.recordColumnDelimiter.hashCode();
            result = 31 * result + (this.recordRowDelimiter.hashCode());
            return result;
        }
    }
}
