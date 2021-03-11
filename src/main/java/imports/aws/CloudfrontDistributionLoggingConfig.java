package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.122Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionLoggingConfig")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionLoggingConfig.Jsii$Proxy.class)
public interface CloudfrontDistributionLoggingConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBucket();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeCookies() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionLoggingConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionLoggingConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionLoggingConfig> {
        private java.lang.String bucket;
        private java.lang.Boolean includeCookies;
        private java.lang.String prefix;

        /**
         * Sets the value of {@link CloudfrontDistributionLoggingConfig#getBucket}
         * @param bucket the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionLoggingConfig#getIncludeCookies}
         * @param includeCookies the value to be set.
         * @return {@code this}
         */
        public Builder includeCookies(java.lang.Boolean includeCookies) {
            this.includeCookies = includeCookies;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionLoggingConfig#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionLoggingConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionLoggingConfig build() {
            return new Jsii$Proxy(bucket, includeCookies, prefix);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionLoggingConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionLoggingConfig {
        private final java.lang.String bucket;
        private final java.lang.Boolean includeCookies;
        private final java.lang.String prefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.includeCookies = software.amazon.jsii.Kernel.get(this, "includeCookies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String bucket, final java.lang.Boolean includeCookies, final java.lang.String prefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucket = java.util.Objects.requireNonNull(bucket, "bucket is required");
            this.includeCookies = includeCookies;
            this.prefix = prefix;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.Boolean getIncludeCookies() {
            return this.includeCookies;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucket", om.valueToTree(this.getBucket()));
            if (this.getIncludeCookies() != null) {
                data.set("includeCookies", om.valueToTree(this.getIncludeCookies()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionLoggingConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionLoggingConfig.Jsii$Proxy that = (CloudfrontDistributionLoggingConfig.Jsii$Proxy) o;

            if (!bucket.equals(that.bucket)) return false;
            if (this.includeCookies != null ? !this.includeCookies.equals(that.includeCookies) : that.includeCookies != null) return false;
            return this.prefix != null ? this.prefix.equals(that.prefix) : that.prefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucket.hashCode();
            result = 31 * result + (this.includeCookies != null ? this.includeCookies.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            return result;
        }
    }
}
