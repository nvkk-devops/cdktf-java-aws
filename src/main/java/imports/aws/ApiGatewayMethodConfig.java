package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.982Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayMethodConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayMethodConfig.Jsii$Proxy.class)
public interface ApiGatewayMethodConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAuthorization();

    @org.jetbrains.annotations.NotNull java.lang.String getHttpMethod();

    @org.jetbrains.annotations.NotNull java.lang.String getResourceId();

    @org.jetbrains.annotations.NotNull java.lang.String getRestApiId();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApiKeyRequired() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAuthorizationScopes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestModels() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Boolean> getRequestParameters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRequestParametersInJson() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRequestValidatorId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayMethodConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayMethodConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayMethodConfig> {
        private java.lang.String authorization;
        private java.lang.String httpMethod;
        private java.lang.String resourceId;
        private java.lang.String restApiId;
        private java.lang.Boolean apiKeyRequired;
        private java.util.List<java.lang.String> authorizationScopes;
        private java.lang.String authorizerId;
        private java.util.Map<java.lang.String, java.lang.String> requestModels;
        private java.util.Map<java.lang.String, java.lang.Boolean> requestParameters;
        private java.lang.String requestParametersInJson;
        private java.lang.String requestValidatorId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getAuthorization}
         * @param authorization the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder authorization(java.lang.String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getHttpMethod}
         * @param httpMethod the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder httpMethod(java.lang.String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getResourceId}
         * @param resourceId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceId(java.lang.String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getRestApiId}
         * @param restApiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder restApiId(java.lang.String restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getApiKeyRequired}
         * @param apiKeyRequired the value to be set.
         * @return {@code this}
         */
        public Builder apiKeyRequired(java.lang.Boolean apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getAuthorizationScopes}
         * @param authorizationScopes the value to be set.
         * @return {@code this}
         */
        public Builder authorizationScopes(java.util.List<java.lang.String> authorizationScopes) {
            this.authorizationScopes = authorizationScopes;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getAuthorizerId}
         * @param authorizerId the value to be set.
         * @return {@code this}
         */
        public Builder authorizerId(java.lang.String authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getRequestModels}
         * @param requestModels the value to be set.
         * @return {@code this}
         */
        public Builder requestModels(java.util.Map<java.lang.String, java.lang.String> requestModels) {
            this.requestModels = requestModels;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getRequestParameters}
         * @param requestParameters the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requestParameters(java.util.Map<java.lang.String, ? extends java.lang.Boolean> requestParameters) {
            this.requestParameters = (java.util.Map<java.lang.String, java.lang.Boolean>)requestParameters;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getRequestParametersInJson}
         * @param requestParametersInJson the value to be set.
         * @return {@code this}
         */
        public Builder requestParametersInJson(java.lang.String requestParametersInJson) {
            this.requestParametersInJson = requestParametersInJson;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getRequestValidatorId}
         * @param requestValidatorId the value to be set.
         * @return {@code this}
         */
        public Builder requestValidatorId(java.lang.String requestValidatorId) {
            this.requestValidatorId = requestValidatorId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getDependsOn}
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
         * Sets the value of {@link ApiGatewayMethodConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodConfig#getProvider}
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
         * @return a new instance of {@link ApiGatewayMethodConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayMethodConfig build() {
            return new Jsii$Proxy(authorization, httpMethod, resourceId, restApiId, apiKeyRequired, authorizationScopes, authorizerId, requestModels, requestParameters, requestParametersInJson, requestValidatorId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayMethodConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayMethodConfig {
        private final java.lang.String authorization;
        private final java.lang.String httpMethod;
        private final java.lang.String resourceId;
        private final java.lang.String restApiId;
        private final java.lang.Boolean apiKeyRequired;
        private final java.util.List<java.lang.String> authorizationScopes;
        private final java.lang.String authorizerId;
        private final java.util.Map<java.lang.String, java.lang.String> requestModels;
        private final java.util.Map<java.lang.String, java.lang.Boolean> requestParameters;
        private final java.lang.String requestParametersInJson;
        private final java.lang.String requestValidatorId;
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
            this.authorization = software.amazon.jsii.Kernel.get(this, "authorization", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpMethod = software.amazon.jsii.Kernel.get(this, "httpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceId = software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restApiId = software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.apiKeyRequired = software.amazon.jsii.Kernel.get(this, "apiKeyRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.authorizationScopes = software.amazon.jsii.Kernel.get(this, "authorizationScopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.authorizerId = software.amazon.jsii.Kernel.get(this, "authorizerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requestModels = software.amazon.jsii.Kernel.get(this, "requestModels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.requestParameters = software.amazon.jsii.Kernel.get(this, "requestParameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class)));
            this.requestParametersInJson = software.amazon.jsii.Kernel.get(this, "requestParametersInJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requestValidatorId = software.amazon.jsii.Kernel.get(this, "requestValidatorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String authorization, final java.lang.String httpMethod, final java.lang.String resourceId, final java.lang.String restApiId, final java.lang.Boolean apiKeyRequired, final java.util.List<java.lang.String> authorizationScopes, final java.lang.String authorizerId, final java.util.Map<java.lang.String, java.lang.String> requestModels, final java.util.Map<java.lang.String, ? extends java.lang.Boolean> requestParameters, final java.lang.String requestParametersInJson, final java.lang.String requestValidatorId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authorization = java.util.Objects.requireNonNull(authorization, "authorization is required");
            this.httpMethod = java.util.Objects.requireNonNull(httpMethod, "httpMethod is required");
            this.resourceId = java.util.Objects.requireNonNull(resourceId, "resourceId is required");
            this.restApiId = java.util.Objects.requireNonNull(restApiId, "restApiId is required");
            this.apiKeyRequired = apiKeyRequired;
            this.authorizationScopes = authorizationScopes;
            this.authorizerId = authorizerId;
            this.requestModels = requestModels;
            this.requestParameters = (java.util.Map<java.lang.String, java.lang.Boolean>)requestParameters;
            this.requestParametersInJson = requestParametersInJson;
            this.requestValidatorId = requestValidatorId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAuthorization() {
            return this.authorization;
        }

        @Override
        public final java.lang.String getHttpMethod() {
            return this.httpMethod;
        }

        @Override
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        @Override
        public final java.lang.String getRestApiId() {
            return this.restApiId;
        }

        @Override
        public final java.lang.Boolean getApiKeyRequired() {
            return this.apiKeyRequired;
        }

        @Override
        public final java.util.List<java.lang.String> getAuthorizationScopes() {
            return this.authorizationScopes;
        }

        @Override
        public final java.lang.String getAuthorizerId() {
            return this.authorizerId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRequestModels() {
            return this.requestModels;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Boolean> getRequestParameters() {
            return this.requestParameters;
        }

        @Override
        public final java.lang.String getRequestParametersInJson() {
            return this.requestParametersInJson;
        }

        @Override
        public final java.lang.String getRequestValidatorId() {
            return this.requestValidatorId;
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

            data.set("authorization", om.valueToTree(this.getAuthorization()));
            data.set("httpMethod", om.valueToTree(this.getHttpMethod()));
            data.set("resourceId", om.valueToTree(this.getResourceId()));
            data.set("restApiId", om.valueToTree(this.getRestApiId()));
            if (this.getApiKeyRequired() != null) {
                data.set("apiKeyRequired", om.valueToTree(this.getApiKeyRequired()));
            }
            if (this.getAuthorizationScopes() != null) {
                data.set("authorizationScopes", om.valueToTree(this.getAuthorizationScopes()));
            }
            if (this.getAuthorizerId() != null) {
                data.set("authorizerId", om.valueToTree(this.getAuthorizerId()));
            }
            if (this.getRequestModels() != null) {
                data.set("requestModels", om.valueToTree(this.getRequestModels()));
            }
            if (this.getRequestParameters() != null) {
                data.set("requestParameters", om.valueToTree(this.getRequestParameters()));
            }
            if (this.getRequestParametersInJson() != null) {
                data.set("requestParametersInJson", om.valueToTree(this.getRequestParametersInJson()));
            }
            if (this.getRequestValidatorId() != null) {
                data.set("requestValidatorId", om.valueToTree(this.getRequestValidatorId()));
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
            struct.set("fqn", om.valueToTree("aws.ApiGatewayMethodConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayMethodConfig.Jsii$Proxy that = (ApiGatewayMethodConfig.Jsii$Proxy) o;

            if (!authorization.equals(that.authorization)) return false;
            if (!httpMethod.equals(that.httpMethod)) return false;
            if (!resourceId.equals(that.resourceId)) return false;
            if (!restApiId.equals(that.restApiId)) return false;
            if (this.apiKeyRequired != null ? !this.apiKeyRequired.equals(that.apiKeyRequired) : that.apiKeyRequired != null) return false;
            if (this.authorizationScopes != null ? !this.authorizationScopes.equals(that.authorizationScopes) : that.authorizationScopes != null) return false;
            if (this.authorizerId != null ? !this.authorizerId.equals(that.authorizerId) : that.authorizerId != null) return false;
            if (this.requestModels != null ? !this.requestModels.equals(that.requestModels) : that.requestModels != null) return false;
            if (this.requestParameters != null ? !this.requestParameters.equals(that.requestParameters) : that.requestParameters != null) return false;
            if (this.requestParametersInJson != null ? !this.requestParametersInJson.equals(that.requestParametersInJson) : that.requestParametersInJson != null) return false;
            if (this.requestValidatorId != null ? !this.requestValidatorId.equals(that.requestValidatorId) : that.requestValidatorId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.authorization.hashCode();
            result = 31 * result + (this.httpMethod.hashCode());
            result = 31 * result + (this.resourceId.hashCode());
            result = 31 * result + (this.restApiId.hashCode());
            result = 31 * result + (this.apiKeyRequired != null ? this.apiKeyRequired.hashCode() : 0);
            result = 31 * result + (this.authorizationScopes != null ? this.authorizationScopes.hashCode() : 0);
            result = 31 * result + (this.authorizerId != null ? this.authorizerId.hashCode() : 0);
            result = 31 * result + (this.requestModels != null ? this.requestModels.hashCode() : 0);
            result = 31 * result + (this.requestParameters != null ? this.requestParameters.hashCode() : 0);
            result = 31 * result + (this.requestParametersInJson != null ? this.requestParametersInJson.hashCode() : 0);
            result = 31 * result + (this.requestValidatorId != null ? this.requestValidatorId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
