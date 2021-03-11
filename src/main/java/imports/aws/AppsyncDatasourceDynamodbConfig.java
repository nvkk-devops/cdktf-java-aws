package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.043Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncDatasourceDynamodbConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncDatasourceDynamodbConfig.Jsii$Proxy.class)
public interface AppsyncDatasourceDynamodbConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getTableName();

    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseCallerCredentials() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncDatasourceDynamodbConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncDatasourceDynamodbConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncDatasourceDynamodbConfig> {
        private java.lang.String tableName;
        private java.lang.String region;
        private java.lang.Boolean useCallerCredentials;

        /**
         * Sets the value of {@link AppsyncDatasourceDynamodbConfig#getTableName}
         * @param tableName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder tableName(java.lang.String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceDynamodbConfig#getRegion}
         * @param region the value to be set.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceDynamodbConfig#getUseCallerCredentials}
         * @param useCallerCredentials the value to be set.
         * @return {@code this}
         */
        public Builder useCallerCredentials(java.lang.Boolean useCallerCredentials) {
            this.useCallerCredentials = useCallerCredentials;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppsyncDatasourceDynamodbConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncDatasourceDynamodbConfig build() {
            return new Jsii$Proxy(tableName, region, useCallerCredentials);
        }
    }

    /**
     * An implementation for {@link AppsyncDatasourceDynamodbConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncDatasourceDynamodbConfig {
        private final java.lang.String tableName;
        private final java.lang.String region;
        private final java.lang.Boolean useCallerCredentials;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.tableName = software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useCallerCredentials = software.amazon.jsii.Kernel.get(this, "useCallerCredentials", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String tableName, final java.lang.String region, final java.lang.Boolean useCallerCredentials) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.tableName = java.util.Objects.requireNonNull(tableName, "tableName is required");
            this.region = region;
            this.useCallerCredentials = useCallerCredentials;
        }

        @Override
        public final java.lang.String getTableName() {
            return this.tableName;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.Boolean getUseCallerCredentials() {
            return this.useCallerCredentials;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("tableName", om.valueToTree(this.getTableName()));
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getUseCallerCredentials() != null) {
                data.set("useCallerCredentials", om.valueToTree(this.getUseCallerCredentials()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppsyncDatasourceDynamodbConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncDatasourceDynamodbConfig.Jsii$Proxy that = (AppsyncDatasourceDynamodbConfig.Jsii$Proxy) o;

            if (!tableName.equals(that.tableName)) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            return this.useCallerCredentials != null ? this.useCallerCredentials.equals(that.useCallerCredentials) : that.useCallerCredentials == null;
        }

        @Override
        public final int hashCode() {
            int result = this.tableName.hashCode();
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.useCallerCredentials != null ? this.useCallerCredentials.hashCode() : 0);
            return result;
        }
    }
}
