package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.019Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2Stage")
public class Apigatewayv2Stage extends com.hashicorp.cdktf.TerraformResource {

    protected Apigatewayv2Stage(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2Stage(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Apigatewayv2Stage(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Apigatewayv2StageConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccessLogSettings() {
        software.amazon.jsii.Kernel.call(this, "resetAccessLogSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoDeploy() {
        software.amazon.jsii.Kernel.call(this, "resetAutoDeploy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientCertificateId() {
        software.amazon.jsii.Kernel.call(this, "resetClientCertificateId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultRouteSettings() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultRouteSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentId() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRouteSettings() {
        software.amazon.jsii.Kernel.call(this, "resetRouteSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStageVariables() {
        software.amazon.jsii.Kernel.call(this, "resetStageVariables", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionArn() {
        return software.amazon.jsii.Kernel.get(this, "executionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInvokeUrl() {
        return software.amazon.jsii.Kernel.get(this, "invokeUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings> getAccessLogSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings>)(software.amazon.jsii.Kernel.get(this, "accessLogSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageAccessLogSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoDeployInput() {
        return software.amazon.jsii.Kernel.get(this, "autoDeployInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCertificateIdInput() {
        return software.amazon.jsii.Kernel.get(this, "clientCertificateIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings> getDefaultRouteSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings>)(software.amazon.jsii.Kernel.get(this, "defaultRouteSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageDefaultRouteSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeploymentIdInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2StageRouteSettings> getRouteSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Apigatewayv2StageRouteSettings>)(software.amazon.jsii.Kernel.get(this, "routeSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageRouteSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getStageVariablesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "stageVariablesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings> getAccessLogSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accessLogSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageAccessLogSettings.class))));
    }

    public void setAccessLogSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings> value) {
        software.amazon.jsii.Kernel.set(this, "accessLogSettings", java.util.Objects.requireNonNull(value, "accessLogSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAutoDeploy() {
        return software.amazon.jsii.Kernel.get(this, "autoDeploy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAutoDeploy(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoDeploy", java.util.Objects.requireNonNull(value, "autoDeploy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientCertificateId() {
        return software.amazon.jsii.Kernel.get(this, "clientCertificateId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientCertificateId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientCertificateId", java.util.Objects.requireNonNull(value, "clientCertificateId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings> getDefaultRouteSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "defaultRouteSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageDefaultRouteSettings.class))));
    }

    public void setDefaultRouteSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings> value) {
        software.amazon.jsii.Kernel.set(this, "defaultRouteSettings", java.util.Objects.requireNonNull(value, "defaultRouteSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentId() {
        return software.amazon.jsii.Kernel.get(this, "deploymentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentId", java.util.Objects.requireNonNull(value, "deploymentId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2StageRouteSettings> getRouteSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "routeSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageRouteSettings.class))));
    }

    public void setRouteSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2StageRouteSettings> value) {
        software.amazon.jsii.Kernel.set(this, "routeSettings", java.util.Objects.requireNonNull(value, "routeSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getStageVariables() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "stageVariables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStageVariables(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "stageVariables", java.util.Objects.requireNonNull(value, "stageVariables is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Apigatewayv2Stage}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Apigatewayv2Stage> {
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
        private final imports.aws.Apigatewayv2StageConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Apigatewayv2StageConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * access_log_settings block.
         * <p>
         * @return {@code this}
         * @param accessLogSettings access_log_settings block. This parameter is required.
         */
        public Builder accessLogSettings(final java.util.List<? extends imports.aws.Apigatewayv2StageAccessLogSettings> accessLogSettings) {
            this.config.accessLogSettings(accessLogSettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoDeploy This parameter is required.
         */
        public Builder autoDeploy(final java.lang.Boolean autoDeploy) {
            this.config.autoDeploy(autoDeploy);
            return this;
        }

        /**
         * @return {@code this}
         * @param clientCertificateId This parameter is required.
         */
        public Builder clientCertificateId(final java.lang.String clientCertificateId) {
            this.config.clientCertificateId(clientCertificateId);
            return this;
        }

        /**
         * default_route_settings block.
         * <p>
         * @return {@code this}
         * @param defaultRouteSettings default_route_settings block. This parameter is required.
         */
        public Builder defaultRouteSettings(final java.util.List<? extends imports.aws.Apigatewayv2StageDefaultRouteSettings> defaultRouteSettings) {
            this.config.defaultRouteSettings(defaultRouteSettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param deploymentId This parameter is required.
         */
        public Builder deploymentId(final java.lang.String deploymentId) {
            this.config.deploymentId(deploymentId);
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
         * route_settings block.
         * <p>
         * @return {@code this}
         * @param routeSettings route_settings block. This parameter is required.
         */
        public Builder routeSettings(final java.util.List<? extends imports.aws.Apigatewayv2StageRouteSettings> routeSettings) {
            this.config.routeSettings(routeSettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param stageVariables This parameter is required.
         */
        public Builder stageVariables(final java.util.Map<java.lang.String, java.lang.String> stageVariables) {
            this.config.stageVariables(stageVariables);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Apigatewayv2Stage}.
         */
        @Override
        public imports.aws.Apigatewayv2Stage build() {
            return new imports.aws.Apigatewayv2Stage(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
