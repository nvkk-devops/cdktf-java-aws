package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.016Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2Route")
public class Apigatewayv2Route extends com.hashicorp.cdktf.TerraformResource {

    protected Apigatewayv2Route(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2Route(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Apigatewayv2Route(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Apigatewayv2RouteConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetApiKeyRequired() {
        software.amazon.jsii.Kernel.call(this, "resetApiKeyRequired", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizationScopes() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizationScopes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizationType() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizationType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizerId() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetModelSelectionExpression() {
        software.amazon.jsii.Kernel.call(this, "resetModelSelectionExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOperationName() {
        software.amazon.jsii.Kernel.call(this, "resetOperationName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestModels() {
        software.amazon.jsii.Kernel.call(this, "resetRequestModels", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRouteResponseSelectionExpression() {
        software.amazon.jsii.Kernel.call(this, "resetRouteResponseSelectionExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTarget() {
        software.amazon.jsii.Kernel.call(this, "resetTarget", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRouteKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "routeKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getApiKeyRequiredInput() {
        return software.amazon.jsii.Kernel.get(this, "apiKeyRequiredInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAuthorizationScopesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "authorizationScopesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModelSelectionExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "modelSelectionExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOperationNameInput() {
        return software.amazon.jsii.Kernel.get(this, "operationNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestModelsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "requestModelsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRouteResponseSelectionExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "routeResponseSelectionExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "targetInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getApiKeyRequired() {
        return software.amazon.jsii.Kernel.get(this, "apiKeyRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setApiKeyRequired(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "apiKeyRequired", java.util.Objects.requireNonNull(value, "apiKeyRequired is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAuthorizationScopes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "authorizationScopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAuthorizationScopes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "authorizationScopes", java.util.Objects.requireNonNull(value, "authorizationScopes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationType() {
        return software.amazon.jsii.Kernel.get(this, "authorizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizationType", java.util.Objects.requireNonNull(value, "authorizationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerId() {
        return software.amazon.jsii.Kernel.get(this, "authorizerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerId", java.util.Objects.requireNonNull(value, "authorizerId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getModelSelectionExpression() {
        return software.amazon.jsii.Kernel.get(this, "modelSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setModelSelectionExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "modelSelectionExpression", java.util.Objects.requireNonNull(value, "modelSelectionExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOperationName() {
        return software.amazon.jsii.Kernel.get(this, "operationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOperationName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "operationName", java.util.Objects.requireNonNull(value, "operationName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRequestModels() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "requestModels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRequestModels(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "requestModels", java.util.Objects.requireNonNull(value, "requestModels is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRouteKey() {
        return software.amazon.jsii.Kernel.get(this, "routeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRouteKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "routeKey", java.util.Objects.requireNonNull(value, "routeKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRouteResponseSelectionExpression() {
        return software.amazon.jsii.Kernel.get(this, "routeResponseSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRouteResponseSelectionExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "routeResponseSelectionExpression", java.util.Objects.requireNonNull(value, "routeResponseSelectionExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTarget() {
        return software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTarget(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "target", java.util.Objects.requireNonNull(value, "target is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Apigatewayv2Route}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Apigatewayv2Route> {
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
        private final imports.aws.Apigatewayv2RouteConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Apigatewayv2RouteConfig.Builder();
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
         * @param apiId This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
            return this;
        }

        /**
         * @return {@code this}
         * @param routeKey This parameter is required.
         */
        public Builder routeKey(final java.lang.String routeKey) {
            this.config.routeKey(routeKey);
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
         * @param authorizationType This parameter is required.
         */
        public Builder authorizationType(final java.lang.String authorizationType) {
            this.config.authorizationType(authorizationType);
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
         * @param modelSelectionExpression This parameter is required.
         */
        public Builder modelSelectionExpression(final java.lang.String modelSelectionExpression) {
            this.config.modelSelectionExpression(modelSelectionExpression);
            return this;
        }

        /**
         * @return {@code this}
         * @param operationName This parameter is required.
         */
        public Builder operationName(final java.lang.String operationName) {
            this.config.operationName(operationName);
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
         * @param routeResponseSelectionExpression This parameter is required.
         */
        public Builder routeResponseSelectionExpression(final java.lang.String routeResponseSelectionExpression) {
            this.config.routeResponseSelectionExpression(routeResponseSelectionExpression);
            return this;
        }

        /**
         * @return {@code this}
         * @param target This parameter is required.
         */
        public Builder target(final java.lang.String target) {
            this.config.target(target);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Apigatewayv2Route}.
         */
        @Override
        public imports.aws.Apigatewayv2Route build() {
            return new imports.aws.Apigatewayv2Route(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
