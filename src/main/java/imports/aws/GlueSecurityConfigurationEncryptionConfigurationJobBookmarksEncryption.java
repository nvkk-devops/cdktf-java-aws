package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.604Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption")
@software.amazon.jsii.Jsii.Proxy(GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption.Jsii$Proxy.class)
public interface GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getJobBookmarksEncryptionMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption> {
        private java.lang.String jobBookmarksEncryptionMode;
        private java.lang.String kmsKeyArn;

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption#getJobBookmarksEncryptionMode}
         * @param jobBookmarksEncryptionMode the value to be set.
         * @return {@code this}
         */
        public Builder jobBookmarksEncryptionMode(java.lang.String jobBookmarksEncryptionMode) {
            this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
            return this;
        }

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption build() {
            return new Jsii$Proxy(jobBookmarksEncryptionMode, kmsKeyArn);
        }
    }

    /**
     * An implementation for {@link GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption {
        private final java.lang.String jobBookmarksEncryptionMode;
        private final java.lang.String kmsKeyArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jobBookmarksEncryptionMode = software.amazon.jsii.Kernel.get(this, "jobBookmarksEncryptionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String jobBookmarksEncryptionMode, final java.lang.String kmsKeyArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
            this.kmsKeyArn = kmsKeyArn;
        }

        @Override
        public final java.lang.String getJobBookmarksEncryptionMode() {
            return this.jobBookmarksEncryptionMode;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getJobBookmarksEncryptionMode() != null) {
                data.set("jobBookmarksEncryptionMode", om.valueToTree(this.getJobBookmarksEncryptionMode()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption.Jsii$Proxy that = (GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption.Jsii$Proxy) o;

            if (this.jobBookmarksEncryptionMode != null ? !this.jobBookmarksEncryptionMode.equals(that.jobBookmarksEncryptionMode) : that.jobBookmarksEncryptionMode != null) return false;
            return this.kmsKeyArn != null ? this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.jobBookmarksEncryptionMode != null ? this.jobBookmarksEncryptionMode.hashCode() : 0;
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            return result;
        }
    }
}
