package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.720Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterClientAuthenticationTls")
@software.amazon.jsii.Jsii.Proxy(MskClusterClientAuthenticationTls.Jsii$Proxy.class)
public interface MskClusterClientAuthenticationTls extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCertificateAuthorityArns() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterClientAuthenticationTls}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterClientAuthenticationTls}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterClientAuthenticationTls> {
        private java.util.List<java.lang.String> certificateAuthorityArns;

        /**
         * Sets the value of {@link MskClusterClientAuthenticationTls#getCertificateAuthorityArns}
         * @param certificateAuthorityArns the value to be set.
         * @return {@code this}
         */
        public Builder certificateAuthorityArns(java.util.List<java.lang.String> certificateAuthorityArns) {
            this.certificateAuthorityArns = certificateAuthorityArns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterClientAuthenticationTls}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterClientAuthenticationTls build() {
            return new Jsii$Proxy(certificateAuthorityArns);
        }
    }

    /**
     * An implementation for {@link MskClusterClientAuthenticationTls}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterClientAuthenticationTls {
        private final java.util.List<java.lang.String> certificateAuthorityArns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.certificateAuthorityArns = software.amazon.jsii.Kernel.get(this, "certificateAuthorityArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> certificateAuthorityArns) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificateAuthorityArns = certificateAuthorityArns;
        }

        @Override
        public final java.util.List<java.lang.String> getCertificateAuthorityArns() {
            return this.certificateAuthorityArns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCertificateAuthorityArns() != null) {
                data.set("certificateAuthorityArns", om.valueToTree(this.getCertificateAuthorityArns()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterClientAuthenticationTls"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterClientAuthenticationTls.Jsii$Proxy that = (MskClusterClientAuthenticationTls.Jsii$Proxy) o;

            return this.certificateAuthorityArns != null ? this.certificateAuthorityArns.equals(that.certificateAuthorityArns) : that.certificateAuthorityArns == null;
        }

        @Override
        public final int hashCode() {
            int result = this.certificateAuthorityArns != null ? this.certificateAuthorityArns.hashCode() : 0;
            return result;
        }
    }
}
