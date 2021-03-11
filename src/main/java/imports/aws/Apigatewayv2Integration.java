package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.012Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2Integration")
public class Apigatewayv2Integration extends com.hashicorp.cdktf.TerraformResource {

    protected Apigatewayv2Integration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2Integration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Apigatewayv2Integration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Apigatewayv2IntegrationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetConnectionId() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionType() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentHandlingStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetContentHandlingStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCredentialsArn() {
        software.amazon.jsii.Kernel.call(this, "resetCredentialsArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIntegrationMethod() {
        software.amazon.jsii.Kernel.call(this, "resetIntegrationMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIntegrationUri() {
        software.amazon.jsii.Kernel.call(this, "resetIntegrationUri", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPassthroughBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetPassthroughBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPayloadFormatVersion() {
        software.amazon.jsii.Kernel.call(this, "resetPayloadFormatVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestTemplates() {
        software.amazon.jsii.Kernel.call(this, "resetRequestTemplates", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTemplateSelectionExpression() {
        software.amazon.jsii.Kernel.call(this, "resetTemplateSelectionExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeoutMilliseconds() {
        software.amazon.jsii.Kernel.call(this, "resetTimeoutMilliseconds", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationResponseSelectionExpression() {
        return software.amazon.jsii.Kernel.get(this, "integrationResponseSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "integrationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentHandlingStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "contentHandlingStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCredentialsArnInput() {
        return software.amazon.jsii.Kernel.get(this, "credentialsArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIntegrationMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "integrationMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIntegrationUriInput() {
        return software.amazon.jsii.Kernel.get(this, "integrationUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPassthroughBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "passthroughBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPayloadFormatVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "payloadFormatVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestTemplatesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "requestTemplatesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTemplateSelectionExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "templateSelectionExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutMillisecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutMillisecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionId() {
        return software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectionId", java.util.Objects.requireNonNull(value, "connectionId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionType() {
        return software.amazon.jsii.Kernel.get(this, "connectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectionType", java.util.Objects.requireNonNull(value, "connectionType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentHandlingStrategy() {
        return software.amazon.jsii.Kernel.get(this, "contentHandlingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentHandlingStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentHandlingStrategy", java.util.Objects.requireNonNull(value, "contentHandlingStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCredentialsArn() {
        return software.amazon.jsii.Kernel.get(this, "credentialsArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCredentialsArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "credentialsArn", java.util.Objects.requireNonNull(value, "credentialsArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationMethod() {
        return software.amazon.jsii.Kernel.get(this, "integrationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIntegrationMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "integrationMethod", java.util.Objects.requireNonNull(value, "integrationMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationType() {
        return software.amazon.jsii.Kernel.get(this, "integrationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIntegrationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "integrationType", java.util.Objects.requireNonNull(value, "integrationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationUri() {
        return software.amazon.jsii.Kernel.get(this, "integrationUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIntegrationUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "integrationUri", java.util.Objects.requireNonNull(value, "integrationUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassthroughBehavior() {
        return software.amazon.jsii.Kernel.get(this, "passthroughBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassthroughBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "passthroughBehavior", java.util.Objects.requireNonNull(value, "passthroughBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPayloadFormatVersion() {
        return software.amazon.jsii.Kernel.get(this, "payloadFormatVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPayloadFormatVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "payloadFormatVersion", java.util.Objects.requireNonNull(value, "payloadFormatVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRequestTemplates() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "requestTemplates", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRequestTemplates(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "requestTemplates", java.util.Objects.requireNonNull(value, "requestTemplates is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTemplateSelectionExpression() {
        return software.amazon.jsii.Kernel.get(this, "templateSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTemplateSelectionExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "templateSelectionExpression", java.util.Objects.requireNonNull(value, "templateSelectionExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeoutMilliseconds() {
        return software.amazon.jsii.Kernel.get(this, "timeoutMilliseconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeoutMilliseconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeoutMilliseconds", java.util.Objects.requireNonNull(value, "timeoutMilliseconds is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Apigatewayv2Integration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Apigatewayv2Integration> {
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
        private final imports.aws.Apigatewayv2IntegrationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Apigatewayv2IntegrationConfig.Builder();
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
         * @param integrationType This parameter is required.
         */
        public Builder integrationType(final java.lang.String integrationType) {
            this.config.integrationType(integrationType);
            return this;
        }

        /**
         * @return {@code this}
         * @param connectionId This parameter is required.
         */
        public Builder connectionId(final java.lang.String connectionId) {
            this.config.connectionId(connectionId);
            return this;
        }

        /**
         * @return {@code this}
         * @param connectionType This parameter is required.
         */
        public Builder connectionType(final java.lang.String connectionType) {
            this.config.connectionType(connectionType);
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
         * @param credentialsArn This parameter is required.
         */
        public Builder credentialsArn(final java.lang.String credentialsArn) {
            this.config.credentialsArn(credentialsArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * @return {@code this}
         * @param integrationMethod This parameter is required.
         */
        public Builder integrationMethod(final java.lang.String integrationMethod) {
            this.config.integrationMethod(integrationMethod);
            return this;
        }

        /**
         * @return {@code this}
         * @param integrationUri This parameter is required.
         */
        public Builder integrationUri(final java.lang.String integrationUri) {
            this.config.integrationUri(integrationUri);
            return this;
        }

        /**
         * @return {@code this}
         * @param passthroughBehavior This parameter is required.
         */
        public Builder passthroughBehavior(final java.lang.String passthroughBehavior) {
            this.config.passthroughBehavior(passthroughBehavior);
            return this;
        }

        /**
         * @return {@code this}
         * @param payloadFormatVersion This parameter is required.
         */
        public Builder payloadFormatVersion(final java.lang.String payloadFormatVersion) {
            this.config.payloadFormatVersion(payloadFormatVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestTemplates This parameter is required.
         */
        public Builder requestTemplates(final java.util.Map<java.lang.String, java.lang.String> requestTemplates) {
            this.config.requestTemplates(requestTemplates);
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
         * @return {@code this}
         * @param timeoutMilliseconds This parameter is required.
         */
        public Builder timeoutMilliseconds(final java.lang.Number timeoutMilliseconds) {
            this.config.timeoutMilliseconds(timeoutMilliseconds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Apigatewayv2Integration}.
         */
        @Override
        public imports.aws.Apigatewayv2Integration build() {
            return new imports.aws.Apigatewayv2Integration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
