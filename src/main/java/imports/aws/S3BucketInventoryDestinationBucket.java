package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.833Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketInventoryDestinationBucket")
@software.amazon.jsii.Jsii.Proxy(S3BucketInventoryDestinationBucket.Jsii$Proxy.class)
public interface S3BucketInventoryDestinationBucket extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBucketArn();

    @org.jetbrains.annotations.NotNull java.lang.String getFormat();

    default @org.jetbrains.annotations.Nullable java.lang.String getAccountId() {
        return null;
    }

    /**
     * encryption block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketInventoryDestinationBucketEncryption> getEncryption() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketInventoryDestinationBucket}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketInventoryDestinationBucket}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketInventoryDestinationBucket> {
        private java.lang.String bucketArn;
        private java.lang.String format;
        private java.lang.String accountId;
        private java.util.List<imports.aws.S3BucketInventoryDestinationBucketEncryption> encryption;
        private java.lang.String prefix;

        /**
         * Sets the value of {@link S3BucketInventoryDestinationBucket#getBucketArn}
         * @param bucketArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketArn(java.lang.String bucketArn) {
            this.bucketArn = bucketArn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryDestinationBucket#getFormat}
         * @param format the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryDestinationBucket#getAccountId}
         * @param accountId the value to be set.
         * @return {@code this}
         */
        public Builder accountId(java.lang.String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryDestinationBucket#getEncryption}
         * @param encryption encryption block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryption(java.util.List<? extends imports.aws.S3BucketInventoryDestinationBucketEncryption> encryption) {
            this.encryption = (java.util.List<imports.aws.S3BucketInventoryDestinationBucketEncryption>)encryption;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryDestinationBucket#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketInventoryDestinationBucket}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketInventoryDestinationBucket build() {
            return new Jsii$Proxy(bucketArn, format, accountId, encryption, prefix);
        }
    }

    /**
     * An implementation for {@link S3BucketInventoryDestinationBucket}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketInventoryDestinationBucket {
        private final java.lang.String bucketArn;
        private final java.lang.String format;
        private final java.lang.String accountId;
        private final java.util.List<imports.aws.S3BucketInventoryDestinationBucketEncryption> encryption;
        private final java.lang.String prefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketArn = software.amazon.jsii.Kernel.get(this, "bucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accountId = software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryption = software.amazon.jsii.Kernel.get(this, "encryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketInventoryDestinationBucketEncryption.class)));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bucketArn, final java.lang.String format, final java.lang.String accountId, final java.util.List<? extends imports.aws.S3BucketInventoryDestinationBucketEncryption> encryption, final java.lang.String prefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketArn = java.util.Objects.requireNonNull(bucketArn, "bucketArn is required");
            this.format = java.util.Objects.requireNonNull(format, "format is required");
            this.accountId = accountId;
            this.encryption = (java.util.List<imports.aws.S3BucketInventoryDestinationBucketEncryption>)encryption;
            this.prefix = prefix;
        }

        @Override
        public final java.lang.String getBucketArn() {
            return this.bucketArn;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketInventoryDestinationBucketEncryption> getEncryption() {
            return this.encryption;
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

            data.set("bucketArn", om.valueToTree(this.getBucketArn()));
            data.set("format", om.valueToTree(this.getFormat()));
            if (this.getAccountId() != null) {
                data.set("accountId", om.valueToTree(this.getAccountId()));
            }
            if (this.getEncryption() != null) {
                data.set("encryption", om.valueToTree(this.getEncryption()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketInventoryDestinationBucket"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketInventoryDestinationBucket.Jsii$Proxy that = (S3BucketInventoryDestinationBucket.Jsii$Proxy) o;

            if (!bucketArn.equals(that.bucketArn)) return false;
            if (!format.equals(that.format)) return false;
            if (this.accountId != null ? !this.accountId.equals(that.accountId) : that.accountId != null) return false;
            if (this.encryption != null ? !this.encryption.equals(that.encryption) : that.encryption != null) return false;
            return this.prefix != null ? this.prefix.equals(that.prefix) : that.prefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketArn.hashCode();
            result = 31 * result + (this.format.hashCode());
            result = 31 * result + (this.accountId != null ? this.accountId.hashCode() : 0);
            result = 31 * result + (this.encryption != null ? this.encryption.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            return result;
        }
    }
}
