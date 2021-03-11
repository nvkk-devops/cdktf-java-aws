package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.650Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationInputsSchema")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationInputsSchema.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationInputsSchema extends software.amazon.jsii.JsiiSerializable {

    /**
     * record_columns block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns> getRecordColumns();

    /**
     * record_format block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat> getRecordFormat();

    default @org.jetbrains.annotations.Nullable java.lang.String getRecordEncoding() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationInputsSchema}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationInputsSchema}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationInputsSchema> {
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns> recordColumns;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat> recordFormat;
        private java.lang.String recordEncoding;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchema#getRecordColumns}
         * @param recordColumns record_columns block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder recordColumns(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns> recordColumns) {
            this.recordColumns = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns>)recordColumns;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchema#getRecordFormat}
         * @param recordFormat record_format block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder recordFormat(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat> recordFormat) {
            this.recordFormat = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat>)recordFormat;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchema#getRecordEncoding}
         * @param recordEncoding the value to be set.
         * @return {@code this}
         */
        public Builder recordEncoding(java.lang.String recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationInputsSchema}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationInputsSchema build() {
            return new Jsii$Proxy(recordColumns, recordFormat, recordEncoding);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationInputsSchema}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationInputsSchema {
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns> recordColumns;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat> recordFormat;
        private final java.lang.String recordEncoding;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.recordColumns = software.amazon.jsii.Kernel.get(this, "recordColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns.class)));
            this.recordFormat = software.amazon.jsii.Kernel.get(this, "recordFormat", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat.class)));
            this.recordEncoding = software.amazon.jsii.Kernel.get(this, "recordEncoding", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns> recordColumns, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat> recordFormat, final java.lang.String recordEncoding) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.recordColumns = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns>)java.util.Objects.requireNonNull(recordColumns, "recordColumns is required");
            this.recordFormat = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat>)java.util.Objects.requireNonNull(recordFormat, "recordFormat is required");
            this.recordEncoding = recordEncoding;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns> getRecordColumns() {
            return this.recordColumns;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchemaRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

        @Override
        public final java.lang.String getRecordEncoding() {
            return this.recordEncoding;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("recordColumns", om.valueToTree(this.getRecordColumns()));
            data.set("recordFormat", om.valueToTree(this.getRecordFormat()));
            if (this.getRecordEncoding() != null) {
                data.set("recordEncoding", om.valueToTree(this.getRecordEncoding()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationInputsSchema"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationInputsSchema.Jsii$Proxy that = (KinesisAnalyticsApplicationInputsSchema.Jsii$Proxy) o;

            if (!recordColumns.equals(that.recordColumns)) return false;
            if (!recordFormat.equals(that.recordFormat)) return false;
            return this.recordEncoding != null ? this.recordEncoding.equals(that.recordEncoding) : that.recordEncoding == null;
        }

        @Override
        public final int hashCode() {
            int result = this.recordColumns.hashCode();
            result = 31 * result + (this.recordFormat.hashCode());
            result = 31 * result + (this.recordEncoding != null ? this.recordEncoding.hashCode() : 0);
            return result;
        }
    }
}
