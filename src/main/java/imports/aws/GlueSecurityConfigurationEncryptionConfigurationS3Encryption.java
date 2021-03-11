package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.605Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption")
@software.amazon.jsii.Jsii.Proxy(GlueSecurityConfigurationEncryptionConfigurationS3Encryption.Jsii$Proxy.class)
public interface GlueSecurityConfigurationEncryptionConfigurationS3Encryption extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3EncryptionMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueSecurityConfigurationEncryptionConfigurationS3Encryption}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueSecurityConfigurationEncryptionConfigurationS3Encryption}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueSecurityConfigurationEncryptionConfigurationS3Encryption> {
        private java.lang.String kmsKeyArn;
        private java.lang.String s3EncryptionMode;

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfigurationS3Encryption#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfigurationS3Encryption#getS3EncryptionMode}
         * @param s3EncryptionMode the value to be set.
         * @return {@code this}
         */
        public Builder s3EncryptionMode(java.lang.String s3EncryptionMode) {
            this.s3EncryptionMode = s3EncryptionMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueSecurityConfigurationEncryptionConfigurationS3Encryption}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueSecurityConfigurationEncryptionConfigurationS3Encryption build() {
            return new Jsii$Proxy(kmsKeyArn, s3EncryptionMode);
        }
    }

    /**
     * An implementation for {@link GlueSecurityConfigurationEncryptionConfigurationS3Encryption}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueSecurityConfigurationEncryptionConfigurationS3Encryption {
        private final java.lang.String kmsKeyArn;
        private final java.lang.String s3EncryptionMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3EncryptionMode = software.amazon.jsii.Kernel.get(this, "s3EncryptionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String kmsKeyArn, final java.lang.String s3EncryptionMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kmsKeyArn = kmsKeyArn;
            this.s3EncryptionMode = s3EncryptionMode;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.lang.String getS3EncryptionMode() {
            return this.s3EncryptionMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getS3EncryptionMode() != null) {
                data.set("s3EncryptionMode", om.valueToTree(this.getS3EncryptionMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueSecurityConfigurationEncryptionConfigurationS3Encryption"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueSecurityConfigurationEncryptionConfigurationS3Encryption.Jsii$Proxy that = (GlueSecurityConfigurationEncryptionConfigurationS3Encryption.Jsii$Proxy) o;

            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            return this.s3EncryptionMode != null ? this.s3EncryptionMode.equals(that.s3EncryptionMode) : that.s3EncryptionMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0;
            result = 31 * result + (this.s3EncryptionMode != null ? this.s3EncryptionMode.hashCode() : 0);
            return result;
        }
    }
}
