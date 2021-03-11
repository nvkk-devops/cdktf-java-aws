package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationInputsSchemaRecordColumns.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationInputsSchemaRecordColumns extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getSqlType();

    default @org.jetbrains.annotations.Nullable java.lang.String getMapping() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationInputsSchemaRecordColumns}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationInputsSchemaRecordColumns}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationInputsSchemaRecordColumns> {
        private java.lang.String name;
        private java.lang.String sqlType;
        private java.lang.String mapping;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordColumns#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordColumns#getSqlType}
         * @param sqlType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sqlType(java.lang.String sqlType) {
            this.sqlType = sqlType;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputsSchemaRecordColumns#getMapping}
         * @param mapping the value to be set.
         * @return {@code this}
         */
        public Builder mapping(java.lang.String mapping) {
            this.mapping = mapping;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationInputsSchemaRecordColumns}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationInputsSchemaRecordColumns build() {
            return new Jsii$Proxy(name, sqlType, mapping);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationInputsSchemaRecordColumns}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationInputsSchemaRecordColumns {
        private final java.lang.String name;
        private final java.lang.String sqlType;
        private final java.lang.String mapping;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sqlType = software.amazon.jsii.Kernel.get(this, "sqlType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mapping = software.amazon.jsii.Kernel.get(this, "mapping", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String sqlType, final java.lang.String mapping) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.sqlType = java.util.Objects.requireNonNull(sqlType, "sqlType is required");
            this.mapping = mapping;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getSqlType() {
            return this.sqlType;
        }

        @Override
        public final java.lang.String getMapping() {
            return this.mapping;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("sqlType", om.valueToTree(this.getSqlType()));
            if (this.getMapping() != null) {
                data.set("mapping", om.valueToTree(this.getMapping()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationInputsSchemaRecordColumns"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationInputsSchemaRecordColumns.Jsii$Proxy that = (KinesisAnalyticsApplicationInputsSchemaRecordColumns.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!sqlType.equals(that.sqlType)) return false;
            return this.mapping != null ? this.mapping.equals(that.mapping) : that.mapping == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.sqlType.hashCode());
            result = 31 * result + (this.mapping != null ? this.mapping.hashCode() : 0);
            return result;
        }
    }
}
