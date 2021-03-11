package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.018Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2RouteResponse")
public class Apigatewayv2RouteResponse extends com.hashicorp.cdktf.TerraformResource {

    protected Apigatewayv2RouteResponse(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2RouteResponse(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Apigatewayv2RouteResponse(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Apigatewayv2RouteResponseConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetModelSelectionExpression() {
        software.amazon.jsii.Kernel.call(this, "resetModelSelectionExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResponseModels() {
        software.amazon.jsii.Kernel.call(this, "resetResponseModels", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRouteIdInput() {
        return software.amazon.jsii.Kernel.get(this, "routeIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRouteResponseKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "routeResponseKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModelSelectionExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "modelSelectionExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getResponseModelsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "responseModelsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getModelSelectionExpression() {
        return software.amazon.jsii.Kernel.get(this, "modelSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setModelSelectionExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "modelSelectionExpression", java.util.Objects.requireNonNull(value, "modelSelectionExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getResponseModels() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "responseModels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResponseModels(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "responseModels", java.util.Objects.requireNonNull(value, "responseModels is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRouteId() {
        return software.amazon.jsii.Kernel.get(this, "routeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRouteId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "routeId", java.util.Objects.requireNonNull(value, "routeId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRouteResponseKey() {
        return software.amazon.jsii.Kernel.get(this, "routeResponseKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRouteResponseKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "routeResponseKey", java.util.Objects.requireNonNull(value, "routeResponseKey is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Apigatewayv2RouteResponse}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Apigatewayv2RouteResponse> {
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
        private final imports.aws.Apigatewayv2RouteResponseConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Apigatewayv2RouteResponseConfig.Builder();
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
         * @param routeId This parameter is required.
         */
        public Builder routeId(final java.lang.String routeId) {
            this.config.routeId(routeId);
            return this;
        }

        /**
         * @return {@code this}
         * @param routeResponseKey This parameter is required.
         */
        public Builder routeResponseKey(final java.lang.String routeResponseKey) {
            this.config.routeResponseKey(routeResponseKey);
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
         * @param responseModels This parameter is required.
         */
        public Builder responseModels(final java.util.Map<java.lang.String, java.lang.String> responseModels) {
            this.config.responseModels(responseModels);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Apigatewayv2RouteResponse}.
         */
        @Override
        public imports.aws.Apigatewayv2RouteResponse build() {
            return new imports.aws.Apigatewayv2RouteResponse(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
