package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.002Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2AuthorizerConfig")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2AuthorizerConfig.Jsii$Proxy.class)
public interface Apigatewayv2AuthorizerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerType();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIdentitySources();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerCredentialsArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerUri() {
        return null;
    }

    /**
     * jwt_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration> getJwtConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2AuthorizerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2AuthorizerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2AuthorizerConfig> {
        private java.lang.String apiId;
        private java.lang.String authorizerType;
        private java.util.List<java.lang.String> identitySources;
        private java.lang.String name;
        private java.lang.String authorizerCredentialsArn;
        private java.lang.String authorizerUri;
        private java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration> jwtConfiguration;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getAuthorizerType}
         * @param authorizerType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder authorizerType(java.lang.String authorizerType) {
            this.authorizerType = authorizerType;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getIdentitySources}
         * @param identitySources the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder identitySources(java.util.List<java.lang.String> identitySources) {
            this.identitySources = identitySources;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getAuthorizerCredentialsArn}
         * @param authorizerCredentialsArn the value to be set.
         * @return {@code this}
         */
        public Builder authorizerCredentialsArn(java.lang.String authorizerCredentialsArn) {
            this.authorizerCredentialsArn = authorizerCredentialsArn;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getAuthorizerUri}
         * @param authorizerUri the value to be set.
         * @return {@code this}
         */
        public Builder authorizerUri(java.lang.String authorizerUri) {
            this.authorizerUri = authorizerUri;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getJwtConfiguration}
         * @param jwtConfiguration jwt_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder jwtConfiguration(java.util.List<? extends imports.aws.Apigatewayv2AuthorizerJwtConfiguration> jwtConfiguration) {
            this.jwtConfiguration = (java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration>)jwtConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2AuthorizerConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Apigatewayv2AuthorizerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2AuthorizerConfig build() {
            return new Jsii$Proxy(apiId, authorizerType, identitySources, name, authorizerCredentialsArn, authorizerUri, jwtConfiguration, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2AuthorizerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2AuthorizerConfig {
        private final java.lang.String apiId;
        private final java.lang.String authorizerType;
        private final java.util.List<java.lang.String> identitySources;
        private final java.lang.String name;
        private final java.lang.String authorizerCredentialsArn;
        private final java.lang.String authorizerUri;
        private final java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration> jwtConfiguration;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiId = software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authorizerType = software.amazon.jsii.Kernel.get(this, "authorizerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identitySources = software.amazon.jsii.Kernel.get(this, "identitySources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authorizerCredentialsArn = software.amazon.jsii.Kernel.get(this, "authorizerCredentialsArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authorizerUri = software.amazon.jsii.Kernel.get(this, "authorizerUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jwtConfiguration = software.amazon.jsii.Kernel.get(this, "jwtConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2AuthorizerJwtConfiguration.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String authorizerType, final java.util.List<java.lang.String> identitySources, final java.lang.String name, final java.lang.String authorizerCredentialsArn, final java.lang.String authorizerUri, final java.util.List<? extends imports.aws.Apigatewayv2AuthorizerJwtConfiguration> jwtConfiguration, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.authorizerType = java.util.Objects.requireNonNull(authorizerType, "authorizerType is required");
            this.identitySources = java.util.Objects.requireNonNull(identitySources, "identitySources is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.authorizerCredentialsArn = authorizerCredentialsArn;
            this.authorizerUri = authorizerUri;
            this.jwtConfiguration = (java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration>)jwtConfiguration;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getApiId() {
            return this.apiId;
        }

        @Override
        public final java.lang.String getAuthorizerType() {
            return this.authorizerType;
        }

        @Override
        public final java.util.List<java.lang.String> getIdentitySources() {
            return this.identitySources;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getAuthorizerCredentialsArn() {
            return this.authorizerCredentialsArn;
        }

        @Override
        public final java.lang.String getAuthorizerUri() {
            return this.authorizerUri;
        }

        @Override
        public final java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration> getJwtConfiguration() {
            return this.jwtConfiguration;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiId", om.valueToTree(this.getApiId()));
            data.set("authorizerType", om.valueToTree(this.getAuthorizerType()));
            data.set("identitySources", om.valueToTree(this.getIdentitySources()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAuthorizerCredentialsArn() != null) {
                data.set("authorizerCredentialsArn", om.valueToTree(this.getAuthorizerCredentialsArn()));
            }
            if (this.getAuthorizerUri() != null) {
                data.set("authorizerUri", om.valueToTree(this.getAuthorizerUri()));
            }
            if (this.getJwtConfiguration() != null) {
                data.set("jwtConfiguration", om.valueToTree(this.getJwtConfiguration()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2AuthorizerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2AuthorizerConfig.Jsii$Proxy that = (Apigatewayv2AuthorizerConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!authorizerType.equals(that.authorizerType)) return false;
            if (!identitySources.equals(that.identitySources)) return false;
            if (!name.equals(that.name)) return false;
            if (this.authorizerCredentialsArn != null ? !this.authorizerCredentialsArn.equals(that.authorizerCredentialsArn) : that.authorizerCredentialsArn != null) return false;
            if (this.authorizerUri != null ? !this.authorizerUri.equals(that.authorizerUri) : that.authorizerUri != null) return false;
            if (this.jwtConfiguration != null ? !this.jwtConfiguration.equals(that.jwtConfiguration) : that.jwtConfiguration != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.authorizerType.hashCode());
            result = 31 * result + (this.identitySources.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.authorizerCredentialsArn != null ? this.authorizerCredentialsArn.hashCode() : 0);
            result = 31 * result + (this.authorizerUri != null ? this.authorizerUri.hashCode() : 0);
            result = 31 * result + (this.jwtConfiguration != null ? this.jwtConfiguration.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
