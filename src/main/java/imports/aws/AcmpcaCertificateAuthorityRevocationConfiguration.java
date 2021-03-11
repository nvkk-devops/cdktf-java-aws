package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.930Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AcmpcaCertificateAuthorityRevocationConfiguration")
@software.amazon.jsii.Jsii.Proxy(AcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy.class)
public interface AcmpcaCertificateAuthorityRevocationConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * crl_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> getCrlConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AcmpcaCertificateAuthorityRevocationConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AcmpcaCertificateAuthorityRevocationConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AcmpcaCertificateAuthorityRevocationConfiguration> {
        private java.util.List<imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfiguration;

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityRevocationConfiguration#getCrlConfiguration}
         * @param crlConfiguration crl_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder crlConfiguration(java.util.List<? extends imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfiguration) {
            this.crlConfiguration = (java.util.List<imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration>)crlConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AcmpcaCertificateAuthorityRevocationConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AcmpcaCertificateAuthorityRevocationConfiguration build() {
            return new Jsii$Proxy(crlConfiguration);
        }
    }

    /**
     * An implementation for {@link AcmpcaCertificateAuthorityRevocationConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AcmpcaCertificateAuthorityRevocationConfiguration {
        private final java.util.List<imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.crlConfiguration = software.amazon.jsii.Kernel.get(this, "crlConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfiguration) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.crlConfiguration = (java.util.List<imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration>)crlConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> getCrlConfiguration() {
            return this.crlConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCrlConfiguration() != null) {
                data.set("crlConfiguration", om.valueToTree(this.getCrlConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AcmpcaCertificateAuthorityRevocationConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy that = (AcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy) o;

            return this.crlConfiguration != null ? this.crlConfiguration.equals(that.crlConfiguration) : that.crlConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.crlConfiguration != null ? this.crlConfiguration.hashCode() : 0;
            return result;
        }
    }
}
