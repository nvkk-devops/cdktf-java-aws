package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.981Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayMethod")
public class ApiGatewayMethod extends com.hashicorp.cdktf.TerraformResource {

    protected ApiGatewayMethod(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayMethod(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ApiGatewayMethod(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ApiGatewayMethodConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetApiKeyRequired() {
        software.amazon.jsii.Kernel.call(this, "resetApiKeyRequired", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizationScopes() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizationScopes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizerId() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestModels() {
        software.amazon.jsii.Kernel.call(this, "resetRequestModels", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestParameters() {
        software.amazon.jsii.Kernel.call(this, "resetRequestParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestParametersInJson() {
        software.amazon.jsii.Kernel.call(this, "resetRequestParametersInJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestValidatorId() {
        software.amazon.jsii.Kernel.call(this, "resetRequestValidatorId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "httpMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "restApiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getApiKeyRequiredInput() {
        return software.amazon.jsii.Kernel.get(this, "apiKeyRequiredInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAuthorizationScopesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "authorizationScopesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestModelsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "requestModelsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRequestParametersInJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "requestParametersInJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Boolean> getRequestParametersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Boolean>)(software.amazon.jsii.Kernel.get(this, "requestParametersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRequestValidatorIdInput() {
        return software.amazon.jsii.Kernel.get(this, "requestValidatorIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getApiKeyRequired() {
        return software.amazon.jsii.Kernel.get(this, "apiKeyRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setApiKeyRequired(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "apiKeyRequired", java.util.Objects.requireNonNull(value, "apiKeyRequired is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorization() {
        return software.amazon.jsii.Kernel.get(this, "authorization", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorization(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorization", java.util.Objects.requireNonNull(value, "authorization is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAuthorizationScopes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "authorizationScopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAuthorizationScopes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "authorizationScopes", java.util.Objects.requireNonNull(value, "authorizationScopes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerId() {
        return software.amazon.jsii.Kernel.get(this, "authorizerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerId", java.util.Objects.requireNonNull(value, "authorizerId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpMethod() {
        return software.amazon.jsii.Kernel.get(this, "httpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpMethod", java.util.Objects.requireNonNull(value, "httpMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRequestModels() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "requestModels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRequestModels(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "requestModels", java.util.Objects.requireNonNull(value, "requestModels is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Boolean> getRequestParameters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "requestParameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class))));
    }

    public void setRequestParameters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Boolean> value) {
        software.amazon.jsii.Kernel.set(this, "requestParameters", java.util.Objects.requireNonNull(value, "requestParameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestParametersInJson() {
        return software.amazon.jsii.Kernel.get(this, "requestParametersInJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestParametersInJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestParametersInJson", java.util.Objects.requireNonNull(value, "requestParametersInJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestValidatorId() {
        return software.amazon.jsii.Kernel.get(this, "requestValidatorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestValidatorId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestValidatorId", java.util.Objects.requireNonNull(value, "requestValidatorId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceId() {
        return software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceId", java.util.Objects.requireNonNull(value, "resourceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestApiId() {
        return software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restApiId", java.util.Objects.requireNonNull(value, "restApiId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ApiGatewayMethod}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ApiGatewayMethod> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.ApiGatewayMethodConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ApiGatewayMethodConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param authorization This parameter is required.
         */
        public Builder authorization(final java.lang.String authorization) {
            this.config.authorization(authorization);
            return this;
        }

        /**
         * @return {@code this}
         * @param httpMethod This parameter is required.
         */
        public Builder httpMethod(final java.lang.String httpMethod) {
            this.config.httpMethod(httpMethod);
            return this;
        }

        /**
         * @return {@code this}
         * @param resourceId This parameter is required.
         */
        public Builder resourceId(final java.lang.String resourceId) {
            this.config.resourceId(resourceId);
            return this;
        }

        /**
         * @return {@code this}
         * @param restApiId This parameter is required.
         */
        public Builder restApiId(final java.lang.String restApiId) {
            this.config.restApiId(restApiId);
            return this;
        }

        /**
         * @return {@code this}
         * @param apiKeyRequired This parameter is required.
         */
        public Builder apiKeyRequired(final java.lang.Boolean apiKeyRequired) {
            this.config.apiKeyRequired(apiKeyRequired);
            return this;
        }

        /**
         * @return {@code this}
         * @param authorizationScopes This parameter is required.
         */
        public Builder authorizationScopes(final java.util.List<java.lang.String> authorizationScopes) {
            this.config.authorizationScopes(authorizationScopes);
            return this;
        }

        /**
         * @return {@code this}
         * @param authorizerId This parameter is required.
         */
        public Builder authorizerId(final java.lang.String authorizerId) {
            this.config.authorizerId(authorizerId);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestModels This parameter is required.
         */
        public Builder requestModels(final java.util.Map<java.lang.String, java.lang.String> requestModels) {
            this.config.requestModels(requestModels);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestParameters This parameter is required.
         */
        public Builder requestParameters(final java.util.Map<java.lang.String, ? extends java.lang.Boolean> requestParameters) {
            this.config.requestParameters(requestParameters);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestParametersInJson This parameter is required.
         */
        public Builder requestParametersInJson(final java.lang.String requestParametersInJson) {
            this.config.requestParametersInJson(requestParametersInJson);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestValidatorId This parameter is required.
         */
        public Builder requestValidatorId(final java.lang.String requestValidatorId) {
            this.config.requestValidatorId(requestValidatorId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ApiGatewayMethod}.
         */
        @Override
        public imports.aws.ApiGatewayMethod build() {
            return new imports.aws.ApiGatewayMethod(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
