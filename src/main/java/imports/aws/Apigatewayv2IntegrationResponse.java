package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.014Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2IntegrationResponse")
public class Apigatewayv2IntegrationResponse extends com.hashicorp.cdktf.TerraformResource {

    protected Apigatewayv2IntegrationResponse(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2IntegrationResponse(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Apigatewayv2IntegrationResponse(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Apigatewayv2IntegrationResponseConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetContentHandlingStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetContentHandlingStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResponseTemplates() {
        software.amazon.jsii.Kernel.call(this, "resetResponseTemplates", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTemplateSelectionExpression() {
        software.amazon.jsii.Kernel.call(this, "resetTemplateSelectionExpression", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationIdInput() {
        return software.amazon.jsii.Kernel.get(this, "integrationIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationResponseKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "integrationResponseKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentHandlingStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "contentHandlingStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getResponseTemplatesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "responseTemplatesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTemplateSelectionExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "templateSelectionExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentHandlingStrategy() {
        return software.amazon.jsii.Kernel.get(this, "contentHandlingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentHandlingStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentHandlingStrategy", java.util.Objects.requireNonNull(value, "contentHandlingStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationId() {
        return software.amazon.jsii.Kernel.get(this, "integrationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIntegrationId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "integrationId", java.util.Objects.requireNonNull(value, "integrationId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationResponseKey() {
        return software.amazon.jsii.Kernel.get(this, "integrationResponseKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIntegrationResponseKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "integrationResponseKey", java.util.Objects.requireNonNull(value, "integrationResponseKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getResponseTemplates() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "responseTemplates", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResponseTemplates(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "responseTemplates", java.util.Objects.requireNonNull(value, "responseTemplates is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTemplateSelectionExpression() {
        return software.amazon.jsii.Kernel.get(this, "templateSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTemplateSelectionExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "templateSelectionExpression", java.util.Objects.requireNonNull(value, "templateSelectionExpression is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Apigatewayv2IntegrationResponse}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Apigatewayv2IntegrationResponse> {
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
        private final imports.aws.Apigatewayv2IntegrationResponseConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Apigatewayv2IntegrationResponseConfig.Builder();
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
         * @param integrationId This parameter is required.
         */
        public Builder integrationId(final java.lang.String integrationId) {
            this.config.integrationId(integrationId);
            return this;
        }

        /**
         * @return {@code this}
         * @param integrationResponseKey This parameter is required.
         */
        public Builder integrationResponseKey(final java.lang.String integrationResponseKey) {
            this.config.integrationResponseKey(integrationResponseKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param contentHandlingStrategy This parameter is required.
         */
        public Builder contentHandlingStrategy(final java.lang.String contentHandlingStrategy) {
            this.config.contentHandlingStrategy(contentHandlingStrategy);
            return this;
        }

        /**
         * @return {@code this}
         * @param responseTemplates This parameter is required.
         */
        public Builder responseTemplates(final java.util.Map<java.lang.String, java.lang.String> responseTemplates) {
            this.config.responseTemplates(responseTemplates);
            return this;
        }

        /**
         * @return {@code this}
         * @param templateSelectionExpression This parameter is required.
         */
        public Builder templateSelectionExpression(final java.lang.String templateSelectionExpression) {
            this.config.templateSelectionExpression(templateSelectionExpression);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Apigatewayv2IntegrationResponse}.
         */
        @Override
        public imports.aws.Apigatewayv2IntegrationResponse build() {
            return new imports.aws.Apigatewayv2IntegrationResponse(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
