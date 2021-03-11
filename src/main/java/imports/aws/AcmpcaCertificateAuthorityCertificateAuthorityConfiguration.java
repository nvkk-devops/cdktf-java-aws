package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.929Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AcmpcaCertificateAuthorityCertificateAuthorityConfiguration")
@software.amazon.jsii.Jsii.Proxy(AcmpcaCertificateAuthorityCertificateAuthorityConfiguration.Jsii$Proxy.class)
public interface AcmpcaCertificateAuthorityCertificateAuthorityConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getKeyAlgorithm();

    @org.jetbrains.annotations.NotNull java.lang.String getSigningAlgorithm();

    /**
     * subject block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject> getSubject();

    /**
     * @return a {@link Builder} of {@link AcmpcaCertificateAuthorityCertificateAuthorityConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AcmpcaCertificateAuthorityCertificateAuthorityConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AcmpcaCertificateAuthorityCertificateAuthorityConfiguration> {
        private java.lang.String keyAlgorithm;
        private java.lang.String signingAlgorithm;
        private java.util.List<imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject> subject;

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityCertificateAuthorityConfiguration#getKeyAlgorithm}
         * @param keyAlgorithm the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder keyAlgorithm(java.lang.String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityCertificateAuthorityConfiguration#getSigningAlgorithm}
         * @param signingAlgorithm the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder signingAlgorithm(java.lang.String signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityCertificateAuthorityConfiguration#getSubject}
         * @param subject subject block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder subject(java.util.List<? extends imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject> subject) {
            this.subject = (java.util.List<imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject>)subject;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AcmpcaCertificateAuthorityCertificateAuthorityConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AcmpcaCertificateAuthorityCertificateAuthorityConfiguration build() {
            return new Jsii$Proxy(keyAlgorithm, signingAlgorithm, subject);
        }
    }

    /**
     * An implementation for {@link AcmpcaCertificateAuthorityCertificateAuthorityConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AcmpcaCertificateAuthorityCertificateAuthorityConfiguration {
        private final java.lang.String keyAlgorithm;
        private final java.lang.String signingAlgorithm;
        private final java.util.List<imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject> subject;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.keyAlgorithm = software.amazon.jsii.Kernel.get(this, "keyAlgorithm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.signingAlgorithm = software.amazon.jsii.Kernel.get(this, "signingAlgorithm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subject = software.amazon.jsii.Kernel.get(this, "subject", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String keyAlgorithm, final java.lang.String signingAlgorithm, final java.util.List<? extends imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject> subject) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.keyAlgorithm = java.util.Objects.requireNonNull(keyAlgorithm, "keyAlgorithm is required");
            this.signingAlgorithm = java.util.Objects.requireNonNull(signingAlgorithm, "signingAlgorithm is required");
            this.subject = (java.util.List<imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject>)java.util.Objects.requireNonNull(subject, "subject is required");
        }

        @Override
        public final java.lang.String getKeyAlgorithm() {
            return this.keyAlgorithm;
        }

        @Override
        public final java.lang.String getSigningAlgorithm() {
            return this.signingAlgorithm;
        }

        @Override
        public final java.util.List<imports.aws.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject> getSubject() {
            return this.subject;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("keyAlgorithm", om.valueToTree(this.getKeyAlgorithm()));
            data.set("signingAlgorithm", om.valueToTree(this.getSigningAlgorithm()));
            data.set("subject", om.valueToTree(this.getSubject()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AcmpcaCertificateAuthorityCertificateAuthorityConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AcmpcaCertificateAuthorityCertificateAuthorityConfiguration.Jsii$Proxy that = (AcmpcaCertificateAuthorityCertificateAuthorityConfiguration.Jsii$Proxy) o;

            if (!keyAlgorithm.equals(that.keyAlgorithm)) return false;
            if (!signingAlgorithm.equals(that.signingAlgorithm)) return false;
            return this.subject.equals(that.subject);
        }

        @Override
        public final int hashCode() {
            int result = this.keyAlgorithm.hashCode();
            result = 31 * result + (this.signingAlgorithm.hashCode());
            result = 31 * result + (this.subject.hashCode());
            return result;
        }
    }
}
