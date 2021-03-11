package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.966Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayAuthorizerConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayAuthorizerConfig.Jsii$Proxy.class)
public interface ApiGatewayAuthorizerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getRestApiId();

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerCredentials() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getAuthorizerResultTtlInSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerUri() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIdentitySource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIdentityValidationExpression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getProviderArns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayAuthorizerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayAuthorizerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayAuthorizerConfig> {
        private java.lang.String name;
        private java.lang.String restApiId;
        private java.lang.String authorizerCredentials;
        private java.lang.Number authorizerResultTtlInSeconds;
        private java.lang.String authorizerUri;
        private java.lang.String identitySource;
        private java.lang.String identityValidationExpression;
        private java.util.List<java.lang.String> providerArns;
        private java.lang.String type;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getRestApiId}
         * @param restApiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder restApiId(java.lang.String restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getAuthorizerCredentials}
         * @param authorizerCredentials the value to be set.
         * @return {@code this}
         */
        public Builder authorizerCredentials(java.lang.String authorizerCredentials) {
            this.authorizerCredentials = authorizerCredentials;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getAuthorizerResultTtlInSeconds}
         * @param authorizerResultTtlInSeconds the value to be set.
         * @return {@code this}
         */
        public Builder authorizerResultTtlInSeconds(java.lang.Number authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getAuthorizerUri}
         * @param authorizerUri the value to be set.
         * @return {@code this}
         */
        public Builder authorizerUri(java.lang.String authorizerUri) {
            this.authorizerUri = authorizerUri;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getIdentitySource}
         * @param identitySource the value to be set.
         * @return {@code this}
         */
        public Builder identitySource(java.lang.String identitySource) {
            this.identitySource = identitySource;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getIdentityValidationExpression}
         * @param identityValidationExpression the value to be set.
         * @return {@code this}
         */
        public Builder identityValidationExpression(java.lang.String identityValidationExpression) {
            this.identityValidationExpression = identityValidationExpression;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getProviderArns}
         * @param providerArns the value to be set.
         * @return {@code this}
         */
        public Builder providerArns(java.util.List<java.lang.String> providerArns) {
            this.providerArns = providerArns;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getDependsOn}
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
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayAuthorizerConfig#getProvider}
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
         * @return a new instance of {@link ApiGatewayAuthorizerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayAuthorizerConfig build() {
            return new Jsii$Proxy(name, restApiId, authorizerCredentials, authorizerResultTtlInSeconds, authorizerUri, identitySource, identityValidationExpression, providerArns, type, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayAuthorizerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayAuthorizerConfig {
        private final java.lang.String name;
        private final java.lang.String restApiId;
        private final java.lang.String authorizerCredentials;
        private final java.lang.Number authorizerResultTtlInSeconds;
        private final java.lang.String authorizerUri;
        private final java.lang.String identitySource;
        private final java.lang.String identityValidationExpression;
        private final java.util.List<java.lang.String> providerArns;
        private final java.lang.String type;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restApiId = software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authorizerCredentials = software.amazon.jsii.Kernel.get(this, "authorizerCredentials", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authorizerResultTtlInSeconds = software.amazon.jsii.Kernel.get(this, "authorizerResultTtlInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.authorizerUri = software.amazon.jsii.Kernel.get(this, "authorizerUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identitySource = software.amazon.jsii.Kernel.get(this, "identitySource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identityValidationExpression = software.amazon.jsii.Kernel.get(this, "identityValidationExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.providerArns = software.amazon.jsii.Kernel.get(this, "providerArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String restApiId, final java.lang.String authorizerCredentials, final java.lang.Number authorizerResultTtlInSeconds, final java.lang.String authorizerUri, final java.lang.String identitySource, final java.lang.String identityValidationExpression, final java.util.List<java.lang.String> providerArns, final java.lang.String type, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.restApiId = java.util.Objects.requireNonNull(restApiId, "restApiId is required");
            this.authorizerCredentials = authorizerCredentials;
            this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            this.authorizerUri = authorizerUri;
            this.identitySource = identitySource;
            this.identityValidationExpression = identityValidationExpression;
            this.providerArns = providerArns;
            this.type = type;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRestApiId() {
            return this.restApiId;
        }

        @Override
        public final java.lang.String getAuthorizerCredentials() {
            return this.authorizerCredentials;
        }

        @Override
        public final java.lang.Number getAuthorizerResultTtlInSeconds() {
            return this.authorizerResultTtlInSeconds;
        }

        @Override
        public final java.lang.String getAuthorizerUri() {
            return this.authorizerUri;
        }

        @Override
        public final java.lang.String getIdentitySource() {
            return this.identitySource;
        }

        @Override
        public final java.lang.String getIdentityValidationExpression() {
            return this.identityValidationExpression;
        }

        @Override
        public final java.util.List<java.lang.String> getProviderArns() {
            return this.providerArns;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("restApiId", om.valueToTree(this.getRestApiId()));
            if (this.getAuthorizerCredentials() != null) {
                data.set("authorizerCredentials", om.valueToTree(this.getAuthorizerCredentials()));
            }
            if (this.getAuthorizerResultTtlInSeconds() != null) {
                data.set("authorizerResultTtlInSeconds", om.valueToTree(this.getAuthorizerResultTtlInSeconds()));
            }
            if (this.getAuthorizerUri() != null) {
                data.set("authorizerUri", om.valueToTree(this.getAuthorizerUri()));
            }
            if (this.getIdentitySource() != null) {
                data.set("identitySource", om.valueToTree(this.getIdentitySource()));
            }
            if (this.getIdentityValidationExpression() != null) {
                data.set("identityValidationExpression", om.valueToTree(this.getIdentityValidationExpression()));
            }
            if (this.getProviderArns() != null) {
                data.set("providerArns", om.valueToTree(this.getProviderArns()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
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
            struct.set("fqn", om.valueToTree("aws.ApiGatewayAuthorizerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayAuthorizerConfig.Jsii$Proxy that = (ApiGatewayAuthorizerConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!restApiId.equals(that.restApiId)) return false;
            if (this.authorizerCredentials != null ? !this.authorizerCredentials.equals(that.authorizerCredentials) : that.authorizerCredentials != null) return false;
            if (this.authorizerResultTtlInSeconds != null ? !this.authorizerResultTtlInSeconds.equals(that.authorizerResultTtlInSeconds) : that.authorizerResultTtlInSeconds != null) return false;
            if (this.authorizerUri != null ? !this.authorizerUri.equals(that.authorizerUri) : that.authorizerUri != null) return false;
            if (this.identitySource != null ? !this.identitySource.equals(that.identitySource) : that.identitySource != null) return false;
            if (this.identityValidationExpression != null ? !this.identityValidationExpression.equals(that.identityValidationExpression) : that.identityValidationExpression != null) return false;
            if (this.providerArns != null ? !this.providerArns.equals(that.providerArns) : that.providerArns != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.restApiId.hashCode());
            result = 31 * result + (this.authorizerCredentials != null ? this.authorizerCredentials.hashCode() : 0);
            result = 31 * result + (this.authorizerResultTtlInSeconds != null ? this.authorizerResultTtlInSeconds.hashCode() : 0);
            result = 31 * result + (this.authorizerUri != null ? this.authorizerUri.hashCode() : 0);
            result = 31 * result + (this.identitySource != null ? this.identitySource.hashCode() : 0);
            result = 31 * result + (this.identityValidationExpression != null ? this.identityValidationExpression.hashCode() : 0);
            result = 31 * result + (this.providerArns != null ? this.providerArns.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
