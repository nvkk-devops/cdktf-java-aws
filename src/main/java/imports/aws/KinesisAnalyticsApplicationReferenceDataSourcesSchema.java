package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.652Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationReferenceDataSourcesSchema.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationReferenceDataSourcesSchema extends software.amazon.jsii.JsiiSerializable {

    /**
     * record_columns block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns> getRecordColumns();

    /**
     * record_format block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat> getRecordFormat();

    default @org.jetbrains.annotations.Nullable java.lang.String getRecordEncoding() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchema}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationReferenceDataSourcesSchema}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationReferenceDataSourcesSchema> {
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns> recordColumns;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat> recordFormat;
        private java.lang.String recordEncoding;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchema#getRecordColumns}
         * @param recordColumns record_columns block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder recordColumns(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns> recordColumns) {
            this.recordColumns = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns>)recordColumns;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchema#getRecordFormat}
         * @param recordFormat record_format block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder recordFormat(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat> recordFormat) {
            this.recordFormat = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat>)recordFormat;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchema#getRecordEncoding}
         * @param recordEncoding the value to be set.
         * @return {@code this}
         */
        public Builder recordEncoding(java.lang.String recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationReferenceDataSourcesSchema}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationReferenceDataSourcesSchema build() {
            return new Jsii$Proxy(recordColumns, recordFormat, recordEncoding);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationReferenceDataSourcesSchema}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationReferenceDataSourcesSchema {
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns> recordColumns;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat> recordFormat;
        private final java.lang.String recordEncoding;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.recordColumns = software.amazon.jsii.Kernel.get(this, "recordColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns.class)));
            this.recordFormat = software.amazon.jsii.Kernel.get(this, "recordFormat", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat.class)));
            this.recordEncoding = software.amazon.jsii.Kernel.get(this, "recordEncoding", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns> recordColumns, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat> recordFormat, final java.lang.String recordEncoding) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.recordColumns = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns>)java.util.Objects.requireNonNull(recordColumns, "recordColumns is required");
            this.recordFormat = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat>)java.util.Objects.requireNonNull(recordFormat, "recordFormat is required");
            this.recordEncoding = recordEncoding;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordColumns> getRecordColumns() {
            return this.recordColumns;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormat> getRecordFormat() {
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
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationReferenceDataSourcesSchema.Jsii$Proxy that = (KinesisAnalyticsApplicationReferenceDataSourcesSchema.Jsii$Proxy) o;

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
