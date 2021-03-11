package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.931Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration")
@software.amazon.jsii.Jsii.Proxy(AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration.Jsii$Proxy.class)
public interface AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getExpirationInDays();

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomCname() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3BucketName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> {
        private java.lang.Number expirationInDays;
        private java.lang.String customCname;
        private java.lang.Boolean enabled;
        private java.lang.String s3BucketName;

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration#getExpirationInDays}
         * @param expirationInDays the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder expirationInDays(java.lang.Number expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration#getCustomCname}
         * @param customCname the value to be set.
         * @return {@code this}
         */
        public Builder customCname(java.lang.String customCname) {
            this.customCname = customCname;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration#getS3BucketName}
         * @param s3BucketName the value to be set.
         * @return {@code this}
         */
        public Builder s3BucketName(java.lang.String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration build() {
            return new Jsii$Proxy(expirationInDays, customCname, enabled, s3BucketName);
        }
    }

    /**
     * An implementation for {@link AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration {
        private final java.lang.Number expirationInDays;
        private final java.lang.String customCname;
        private final java.lang.Boolean enabled;
        private final java.lang.String s3BucketName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.expirationInDays = software.amazon.jsii.Kernel.get(this, "expirationInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.customCname = software.amazon.jsii.Kernel.get(this, "customCname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.s3BucketName = software.amazon.jsii.Kernel.get(this, "s3BucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number expirationInDays, final java.lang.String customCname, final java.lang.Boolean enabled, final java.lang.String s3BucketName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.expirationInDays = java.util.Objects.requireNonNull(expirationInDays, "expirationInDays is required");
            this.customCname = customCname;
            this.enabled = enabled;
            this.s3BucketName = s3BucketName;
        }

        @Override
        public final java.lang.Number getExpirationInDays() {
            return this.expirationInDays;
        }

        @Override
        public final java.lang.String getCustomCname() {
            return this.customCname;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getS3BucketName() {
            return this.s3BucketName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("expirationInDays", om.valueToTree(this.getExpirationInDays()));
            if (this.getCustomCname() != null) {
                data.set("customCname", om.valueToTree(this.getCustomCname()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getS3BucketName() != null) {
                data.set("s3BucketName", om.valueToTree(this.getS3BucketName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration.Jsii$Proxy that = (AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration.Jsii$Proxy) o;

            if (!expirationInDays.equals(that.expirationInDays)) return false;
            if (this.customCname != null ? !this.customCname.equals(that.customCname) : that.customCname != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            return this.s3BucketName != null ? this.s3BucketName.equals(that.s3BucketName) : that.s3BucketName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.expirationInDays.hashCode();
            result = 31 * result + (this.customCname != null ? this.customCname.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.s3BucketName != null ? this.s3BucketName.hashCode() : 0);
            return result;
        }
    }
}
