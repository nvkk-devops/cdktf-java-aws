package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.010Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2AuthorizerJwtConfiguration")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2AuthorizerJwtConfiguration.Jsii$Proxy.class)
public interface Apigatewayv2AuthorizerJwtConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAudience() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIssuer() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2AuthorizerJwtConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2AuthorizerJwtConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2AuthorizerJwtConfiguration> {
        private java.util.List<java.lang.String> audience;
        private java.lang.String issuer;

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerJwtConfiguration#getAudience}
         * @param audience the value to be set.
         * @return {@code this}
         */
        public Builder audience(java.util.List<java.lang.String> audience) {
            this.audience = audience;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerJwtConfiguration#getIssuer}
         * @param issuer the value to be set.
         * @return {@code this}
         */
        public Builder issuer(java.lang.String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Apigatewayv2AuthorizerJwtConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2AuthorizerJwtConfiguration build() {
            return new Jsii$Proxy(audience, issuer);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2AuthorizerJwtConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2AuthorizerJwtConfiguration {
        private final java.util.List<java.lang.String> audience;
        private final java.lang.String issuer;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.audience = software.amazon.jsii.Kernel.get(this, "audience", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.issuer = software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> audience, final java.lang.String issuer) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.audience = audience;
            this.issuer = issuer;
        }

        @Override
        public final java.util.List<java.lang.String> getAudience() {
            return this.audience;
        }

        @Override
        public final java.lang.String getIssuer() {
            return this.issuer;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAudience() != null) {
                data.set("audience", om.valueToTree(this.getAudience()));
            }
            if (this.getIssuer() != null) {
                data.set("issuer", om.valueToTree(this.getIssuer()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2AuthorizerJwtConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2AuthorizerJwtConfiguration.Jsii$Proxy that = (Apigatewayv2AuthorizerJwtConfiguration.Jsii$Proxy) o;

            if (this.audience != null ? !this.audience.equals(that.audience) : that.audience != null) return false;
            return this.issuer != null ? this.issuer.equals(that.issuer) : that.issuer == null;
        }

        @Override
        public final int hashCode() {
            int result = this.audience != null ? this.audience.hashCode() : 0;
            result = 31 * result + (this.issuer != null ? this.issuer.hashCode() : 0);
            return result;
        }
    }
}
