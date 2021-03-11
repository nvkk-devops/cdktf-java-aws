package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.807Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RedshiftClusterLogging")
@software.amazon.jsii.Jsii.Proxy(RedshiftClusterLogging.Jsii$Proxy.class)
public interface RedshiftClusterLogging extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnable();

    default @org.jetbrains.annotations.Nullable java.lang.String getBucketName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3KeyPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RedshiftClusterLogging}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RedshiftClusterLogging}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RedshiftClusterLogging> {
        private java.lang.Boolean enable;
        private java.lang.String bucketName;
        private java.lang.String s3KeyPrefix;

        /**
         * Sets the value of {@link RedshiftClusterLogging#getEnable}
         * @param enable the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enable(java.lang.Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterLogging#getBucketName}
         * @param bucketName the value to be set.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterLogging#getS3KeyPrefix}
         * @param s3KeyPrefix the value to be set.
         * @return {@code this}
         */
        public Builder s3KeyPrefix(java.lang.String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RedshiftClusterLogging}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RedshiftClusterLogging build() {
            return new Jsii$Proxy(enable, bucketName, s3KeyPrefix);
        }
    }

    /**
     * An implementation for {@link RedshiftClusterLogging}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RedshiftClusterLogging {
        private final java.lang.Boolean enable;
        private final java.lang.String bucketName;
        private final java.lang.String s3KeyPrefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enable = software.amazon.jsii.Kernel.get(this, "enable", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3KeyPrefix = software.amazon.jsii.Kernel.get(this, "s3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean enable, final java.lang.String bucketName, final java.lang.String s3KeyPrefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enable = java.util.Objects.requireNonNull(enable, "enable is required");
            this.bucketName = bucketName;
            this.s3KeyPrefix = s3KeyPrefix;
        }

        @Override
        public final java.lang.Boolean getEnable() {
            return this.enable;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getS3KeyPrefix() {
            return this.s3KeyPrefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enable", om.valueToTree(this.getEnable()));
            if (this.getBucketName() != null) {
                data.set("bucketName", om.valueToTree(this.getBucketName()));
            }
            if (this.getS3KeyPrefix() != null) {
                data.set("s3KeyPrefix", om.valueToTree(this.getS3KeyPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.RedshiftClusterLogging"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RedshiftClusterLogging.Jsii$Proxy that = (RedshiftClusterLogging.Jsii$Proxy) o;

            if (!enable.equals(that.enable)) return false;
            if (this.bucketName != null ? !this.bucketName.equals(that.bucketName) : that.bucketName != null) return false;
            return this.s3KeyPrefix != null ? this.s3KeyPrefix.equals(that.s3KeyPrefix) : that.s3KeyPrefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enable.hashCode();
            result = 31 * result + (this.bucketName != null ? this.bucketName.hashCode() : 0);
            result = 31 * result + (this.s3KeyPrefix != null ? this.s3KeyPrefix.hashCode() : 0);
            return result;
        }
    }
}
