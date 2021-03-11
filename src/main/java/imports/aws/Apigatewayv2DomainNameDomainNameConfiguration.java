package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.012Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2DomainNameDomainNameConfiguration")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2DomainNameDomainNameConfiguration.Jsii$Proxy.class)
public interface Apigatewayv2DomainNameDomainNameConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getCertificateArn();

    @org.jetbrains.annotations.NotNull java.lang.String getEndpointType();

    @org.jetbrains.annotations.NotNull java.lang.String getSecurityPolicy();

    /**
     * @return a {@link Builder} of {@link Apigatewayv2DomainNameDomainNameConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2DomainNameDomainNameConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2DomainNameDomainNameConfiguration> {
        private java.lang.String certificateArn;
        private java.lang.String endpointType;
        private java.lang.String securityPolicy;

        /**
         * Sets the value of {@link Apigatewayv2DomainNameDomainNameConfiguration#getCertificateArn}
         * @param certificateArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder certificateArn(java.lang.String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2DomainNameDomainNameConfiguration#getEndpointType}
         * @param endpointType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder endpointType(java.lang.String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2DomainNameDomainNameConfiguration#getSecurityPolicy}
         * @param securityPolicy the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder securityPolicy(java.lang.String securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Apigatewayv2DomainNameDomainNameConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2DomainNameDomainNameConfiguration build() {
            return new Jsii$Proxy(certificateArn, endpointType, securityPolicy);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2DomainNameDomainNameConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2DomainNameDomainNameConfiguration {
        private final java.lang.String certificateArn;
        private final java.lang.String endpointType;
        private final java.lang.String securityPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.certificateArn = software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpointType = software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityPolicy = software.amazon.jsii.Kernel.get(this, "securityPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String certificateArn, final java.lang.String endpointType, final java.lang.String securityPolicy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificateArn = java.util.Objects.requireNonNull(certificateArn, "certificateArn is required");
            this.endpointType = java.util.Objects.requireNonNull(endpointType, "endpointType is required");
            this.securityPolicy = java.util.Objects.requireNonNull(securityPolicy, "securityPolicy is required");
        }

        @Override
        public final java.lang.String getCertificateArn() {
            return this.certificateArn;
        }

        @Override
        public final java.lang.String getEndpointType() {
            return this.endpointType;
        }

        @Override
        public final java.lang.String getSecurityPolicy() {
            return this.securityPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("certificateArn", om.valueToTree(this.getCertificateArn()));
            data.set("endpointType", om.valueToTree(this.getEndpointType()));
            data.set("securityPolicy", om.valueToTree(this.getSecurityPolicy()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2DomainNameDomainNameConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2DomainNameDomainNameConfiguration.Jsii$Proxy that = (Apigatewayv2DomainNameDomainNameConfiguration.Jsii$Proxy) o;

            if (!certificateArn.equals(that.certificateArn)) return false;
            if (!endpointType.equals(that.endpointType)) return false;
            return this.securityPolicy.equals(that.securityPolicy);
        }

        @Override
        public final int hashCode() {
            int result = this.certificateArn.hashCode();
            result = 31 * result + (this.endpointType.hashCode());
            result = 31 * result + (this.securityPolicy.hashCode());
            return result;
        }
    }
}
