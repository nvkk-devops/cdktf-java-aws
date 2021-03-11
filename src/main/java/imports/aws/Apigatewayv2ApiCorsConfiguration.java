package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.000Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2ApiCorsConfiguration")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2ApiCorsConfiguration.Jsii$Proxy.class)
public interface Apigatewayv2ApiCorsConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowCredentials() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowHeaders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowMethods() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowOrigins() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExposeHeaders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxAge() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2ApiCorsConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2ApiCorsConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2ApiCorsConfiguration> {
        private java.lang.Boolean allowCredentials;
        private java.util.List<java.lang.String> allowHeaders;
        private java.util.List<java.lang.String> allowMethods;
        private java.util.List<java.lang.String> allowOrigins;
        private java.util.List<java.lang.String> exposeHeaders;
        private java.lang.Number maxAge;

        /**
         * Sets the value of {@link Apigatewayv2ApiCorsConfiguration#getAllowCredentials}
         * @param allowCredentials the value to be set.
         * @return {@code this}
         */
        public Builder allowCredentials(java.lang.Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiCorsConfiguration#getAllowHeaders}
         * @param allowHeaders the value to be set.
         * @return {@code this}
         */
        public Builder allowHeaders(java.util.List<java.lang.String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiCorsConfiguration#getAllowMethods}
         * @param allowMethods the value to be set.
         * @return {@code this}
         */
        public Builder allowMethods(java.util.List<java.lang.String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiCorsConfiguration#getAllowOrigins}
         * @param allowOrigins the value to be set.
         * @return {@code this}
         */
        public Builder allowOrigins(java.util.List<java.lang.String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiCorsConfiguration#getExposeHeaders}
         * @param exposeHeaders the value to be set.
         * @return {@code this}
         */
        public Builder exposeHeaders(java.util.List<java.lang.String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiCorsConfiguration#getMaxAge}
         * @param maxAge the value to be set.
         * @return {@code this}
         */
        public Builder maxAge(java.lang.Number maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Apigatewayv2ApiCorsConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2ApiCorsConfiguration build() {
            return new Jsii$Proxy(allowCredentials, allowHeaders, allowMethods, allowOrigins, exposeHeaders, maxAge);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2ApiCorsConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2ApiCorsConfiguration {
        private final java.lang.Boolean allowCredentials;
        private final java.util.List<java.lang.String> allowHeaders;
        private final java.util.List<java.lang.String> allowMethods;
        private final java.util.List<java.lang.String> allowOrigins;
        private final java.util.List<java.lang.String> exposeHeaders;
        private final java.lang.Number maxAge;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowCredentials = software.amazon.jsii.Kernel.get(this, "allowCredentials", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.allowHeaders = software.amazon.jsii.Kernel.get(this, "allowHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowMethods = software.amazon.jsii.Kernel.get(this, "allowMethods", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowOrigins = software.amazon.jsii.Kernel.get(this, "allowOrigins", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.exposeHeaders = software.amazon.jsii.Kernel.get(this, "exposeHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.maxAge = software.amazon.jsii.Kernel.get(this, "maxAge", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean allowCredentials, final java.util.List<java.lang.String> allowHeaders, final java.util.List<java.lang.String> allowMethods, final java.util.List<java.lang.String> allowOrigins, final java.util.List<java.lang.String> exposeHeaders, final java.lang.Number maxAge) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowCredentials = allowCredentials;
            this.allowHeaders = allowHeaders;
            this.allowMethods = allowMethods;
            this.allowOrigins = allowOrigins;
            this.exposeHeaders = exposeHeaders;
            this.maxAge = maxAge;
        }

        @Override
        public final java.lang.Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowHeaders() {
            return this.allowHeaders;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowMethods() {
            return this.allowMethods;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowOrigins() {
            return this.allowOrigins;
        }

        @Override
        public final java.util.List<java.lang.String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        @Override
        public final java.lang.Number getMaxAge() {
            return this.maxAge;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowCredentials() != null) {
                data.set("allowCredentials", om.valueToTree(this.getAllowCredentials()));
            }
            if (this.getAllowHeaders() != null) {
                data.set("allowHeaders", om.valueToTree(this.getAllowHeaders()));
            }
            if (this.getAllowMethods() != null) {
                data.set("allowMethods", om.valueToTree(this.getAllowMethods()));
            }
            if (this.getAllowOrigins() != null) {
                data.set("allowOrigins", om.valueToTree(this.getAllowOrigins()));
            }
            if (this.getExposeHeaders() != null) {
                data.set("exposeHeaders", om.valueToTree(this.getExposeHeaders()));
            }
            if (this.getMaxAge() != null) {
                data.set("maxAge", om.valueToTree(this.getMaxAge()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2ApiCorsConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2ApiCorsConfiguration.Jsii$Proxy that = (Apigatewayv2ApiCorsConfiguration.Jsii$Proxy) o;

            if (this.allowCredentials != null ? !this.allowCredentials.equals(that.allowCredentials) : that.allowCredentials != null) return false;
            if (this.allowHeaders != null ? !this.allowHeaders.equals(that.allowHeaders) : that.allowHeaders != null) return false;
            if (this.allowMethods != null ? !this.allowMethods.equals(that.allowMethods) : that.allowMethods != null) return false;
            if (this.allowOrigins != null ? !this.allowOrigins.equals(that.allowOrigins) : that.allowOrigins != null) return false;
            if (this.exposeHeaders != null ? !this.exposeHeaders.equals(that.exposeHeaders) : that.exposeHeaders != null) return false;
            return this.maxAge != null ? this.maxAge.equals(that.maxAge) : that.maxAge == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowCredentials != null ? this.allowCredentials.hashCode() : 0;
            result = 31 * result + (this.allowHeaders != null ? this.allowHeaders.hashCode() : 0);
            result = 31 * result + (this.allowMethods != null ? this.allowMethods.hashCode() : 0);
            result = 31 * result + (this.allowOrigins != null ? this.allowOrigins.hashCode() : 0);
            result = 31 * result + (this.exposeHeaders != null ? this.exposeHeaders.hashCode() : 0);
            result = 31 * result + (this.maxAge != null ? this.maxAge.hashCode() : 0);
            return result;
        }
    }
}
