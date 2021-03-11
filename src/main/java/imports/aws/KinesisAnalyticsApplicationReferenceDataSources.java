package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationReferenceDataSources")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationReferenceDataSources.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationReferenceDataSources extends software.amazon.jsii.JsiiSerializable {

    /**
     * s3 block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3> getS3();

    /**
     * schema block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema> getSchema();

    @org.jetbrains.annotations.NotNull java.lang.String getTableName();

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationReferenceDataSources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationReferenceDataSources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationReferenceDataSources> {
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3> s3;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema> schema;
        private java.lang.String tableName;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSources#getS3}
         * @param s3 s3 block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3> s3) {
            this.s3 = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3>)s3;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSources#getSchema}
         * @param schema schema block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schema(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema> schema) {
            this.schema = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema>)schema;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationReferenceDataSources#getTableName}
         * @param tableName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder tableName(java.lang.String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationReferenceDataSources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationReferenceDataSources build() {
            return new Jsii$Proxy(s3, schema, tableName);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationReferenceDataSources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationReferenceDataSources {
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3> s3;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema> schema;
        private final java.lang.String tableName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3 = software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3.class)));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema.class)));
            this.tableName = software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3> s3, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema> schema, final java.lang.String tableName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3 = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3>)java.util.Objects.requireNonNull(s3, "s3 is required");
            this.schema = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema>)java.util.Objects.requireNonNull(schema, "schema is required");
            this.tableName = java.util.Objects.requireNonNull(tableName, "tableName is required");
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesS3> getS3() {
            return this.s3;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSourcesSchema> getSchema() {
            return this.schema;
        }

        @Override
        public final java.lang.String getTableName() {
            return this.tableName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("s3", om.valueToTree(this.getS3()));
            data.set("schema", om.valueToTree(this.getSchema()));
            data.set("tableName", om.valueToTree(this.getTableName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationReferenceDataSources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationReferenceDataSources.Jsii$Proxy that = (KinesisAnalyticsApplicationReferenceDataSources.Jsii$Proxy) o;

            if (!s3.equals(that.s3)) return false;
            if (!schema.equals(that.schema)) return false;
            return this.tableName.equals(that.tableName);
        }

        @Override
        public final int hashCode() {
            int result = this.s3.hashCode();
            result = 31 * result + (this.schema.hashCode());
            result = 31 * result + (this.tableName.hashCode());
            return result;
        }
    }
}
