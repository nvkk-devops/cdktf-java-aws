package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.604Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueSecurityConfigurationEncryptionConfiguration")
@software.amazon.jsii.Jsii.Proxy(GlueSecurityConfigurationEncryptionConfiguration.Jsii$Proxy.class)
public interface GlueSecurityConfigurationEncryptionConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * cloudwatch_encryption block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption> getCloudwatchEncryption();

    /**
     * job_bookmarks_encryption block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption> getJobBookmarksEncryption();

    /**
     * s3_encryption block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption> getS3Encryption();

    /**
     * @return a {@link Builder} of {@link GlueSecurityConfigurationEncryptionConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueSecurityConfigurationEncryptionConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueSecurityConfigurationEncryptionConfiguration> {
        private java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption> cloudwatchEncryption;
        private java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption> jobBookmarksEncryption;
        private java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption> s3Encryption;

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfiguration#getCloudwatchEncryption}
         * @param cloudwatchEncryption cloudwatch_encryption block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchEncryption(java.util.List<? extends imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption> cloudwatchEncryption) {
            this.cloudwatchEncryption = (java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption>)cloudwatchEncryption;
            return this;
        }

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfiguration#getJobBookmarksEncryption}
         * @param jobBookmarksEncryption job_bookmarks_encryption block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder jobBookmarksEncryption(java.util.List<? extends imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption> jobBookmarksEncryption) {
            this.jobBookmarksEncryption = (java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption>)jobBookmarksEncryption;
            return this;
        }

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfiguration#getS3Encryption}
         * @param s3Encryption s3_encryption block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Encryption(java.util.List<? extends imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption> s3Encryption) {
            this.s3Encryption = (java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption>)s3Encryption;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueSecurityConfigurationEncryptionConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueSecurityConfigurationEncryptionConfiguration build() {
            return new Jsii$Proxy(cloudwatchEncryption, jobBookmarksEncryption, s3Encryption);
        }
    }

    /**
     * An implementation for {@link GlueSecurityConfigurationEncryptionConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueSecurityConfigurationEncryptionConfiguration {
        private final java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption> cloudwatchEncryption;
        private final java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption> jobBookmarksEncryption;
        private final java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption> s3Encryption;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cloudwatchEncryption = software.amazon.jsii.Kernel.get(this, "cloudwatchEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption.class)));
            this.jobBookmarksEncryption = software.amazon.jsii.Kernel.get(this, "jobBookmarksEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption.class)));
            this.s3Encryption = software.amazon.jsii.Kernel.get(this, "s3Encryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption> cloudwatchEncryption, final java.util.List<? extends imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption> jobBookmarksEncryption, final java.util.List<? extends imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption> s3Encryption) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cloudwatchEncryption = (java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption>)java.util.Objects.requireNonNull(cloudwatchEncryption, "cloudwatchEncryption is required");
            this.jobBookmarksEncryption = (java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption>)java.util.Objects.requireNonNull(jobBookmarksEncryption, "jobBookmarksEncryption is required");
            this.s3Encryption = (java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption>)java.util.Objects.requireNonNull(s3Encryption, "s3Encryption is required");
        }

        @Override
        public final java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption> getCloudwatchEncryption() {
            return this.cloudwatchEncryption;
        }

        @Override
        public final java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption> getJobBookmarksEncryption() {
            return this.jobBookmarksEncryption;
        }

        @Override
        public final java.util.List<imports.aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption> getS3Encryption() {
            return this.s3Encryption;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cloudwatchEncryption", om.valueToTree(this.getCloudwatchEncryption()));
            data.set("jobBookmarksEncryption", om.valueToTree(this.getJobBookmarksEncryption()));
            data.set("s3Encryption", om.valueToTree(this.getS3Encryption()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueSecurityConfigurationEncryptionConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueSecurityConfigurationEncryptionConfiguration.Jsii$Proxy that = (GlueSecurityConfigurationEncryptionConfiguration.Jsii$Proxy) o;

            if (!cloudwatchEncryption.equals(that.cloudwatchEncryption)) return false;
            if (!jobBookmarksEncryption.equals(that.jobBookmarksEncryption)) return false;
            return this.s3Encryption.equals(that.s3Encryption);
        }

        @Override
        public final int hashCode() {
            int result = this.cloudwatchEncryption.hashCode();
            result = 31 * result + (this.jobBookmarksEncryption.hashCode());
            result = 31 * result + (this.s3Encryption.hashCode());
            return result;
        }
    }
}
