package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.993Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayStage")
public class ApiGatewayStage extends com.hashicorp.cdktf.TerraformResource {

    protected ApiGatewayStage(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayStage(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ApiGatewayStage(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ApiGatewayStageConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccessLogSettings() {
        software.amazon.jsii.Kernel.call(this, "resetAccessLogSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCacheClusterEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetCacheClusterEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCacheClusterSize() {
        software.amazon.jsii.Kernel.call(this, "resetCacheClusterSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientCertificateId() {
        software.amazon.jsii.Kernel.call(this, "resetClientCertificateId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDocumentationVersion() {
        software.amazon.jsii.Kernel.call(this, "resetDocumentationVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVariables() {
        software.amazon.jsii.Kernel.call(this, "resetVariables", software.amazon.jsii.NativeType.VOID);
    }

    public void resetXrayTracingEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetXrayTracingEnabled", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentIdInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRestApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "restApiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStageNameInput() {
        return software.amazon.jsii.Kernel.get(this, "stageNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayStageAccessLogSettings> getAccessLogSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ApiGatewayStageAccessLogSettings>)(software.amazon.jsii.Kernel.get(this, "accessLogSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayStageAccessLogSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCacheClusterEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "cacheClusterEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCacheClusterSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "cacheClusterSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCertificateIdInput() {
        return software.amazon.jsii.Kernel.get(this, "clientCertificateIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDocumentationVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "documentationVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVariablesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "variablesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getXrayTracingEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "xrayTracingEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayStageAccessLogSettings> getAccessLogSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accessLogSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayStageAccessLogSettings.class))));
    }

    public void setAccessLogSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayStageAccessLogSettings> value) {
        software.amazon.jsii.Kernel.set(this, "accessLogSettings", java.util.Objects.requireNonNull(value, "accessLogSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getCacheClusterEnabled() {
        return software.amazon.jsii.Kernel.get(this, "cacheClusterEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCacheClusterEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "cacheClusterEnabled", java.util.Objects.requireNonNull(value, "cacheClusterEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCacheClusterSize() {
        return software.amazon.jsii.Kernel.get(this, "cacheClusterSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCacheClusterSize(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cacheClusterSize", java.util.Objects.requireNonNull(value, "cacheClusterSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientCertificateId() {
        return software.amazon.jsii.Kernel.get(this, "clientCertificateId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientCertificateId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientCertificateId", java.util.Objects.requireNonNull(value, "clientCertificateId is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentationVersion() {
        return software.amazon.jsii.Kernel.get(this, "documentationVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDocumentationVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "documentationVersion", java.util.Objects.requireNonNull(value, "documentationVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestApiId() {
        return software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restApiId", java.util.Objects.requireNonNull(value, "restApiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStageName() {
        return software.amazon.jsii.Kernel.get(this, "stageName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStageName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stageName", java.util.Objects.requireNonNull(value, "stageName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getVariables() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "variables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVariables(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "variables", java.util.Objects.requireNonNull(value, "variables is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getXrayTracingEnabled() {
        return software.amazon.jsii.Kernel.get(this, "xrayTracingEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setXrayTracingEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "xrayTracingEnabled", java.util.Objects.requireNonNull(value, "xrayTracingEnabled is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ApiGatewayStage}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ApiGatewayStage> {
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
        private final imports.aws.ApiGatewayStageConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ApiGatewayStageConfig.Builder();
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
         * @param deploymentId This parameter is required.
         */
        public Builder deploymentId(final java.lang.String deploymentId) {
            this.config.deploymentId(deploymentId);
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
         * @param stageName This parameter is required.
         */
        public Builder stageName(final java.lang.String stageName) {
            this.config.stageName(stageName);
            return this;
        }

        /**
         * access_log_settings block.
         * <p>
         * @return {@code this}
         * @param accessLogSettings access_log_settings block. This parameter is required.
         */
        public Builder accessLogSettings(final java.util.List<? extends imports.aws.ApiGatewayStageAccessLogSettings> accessLogSettings) {
            this.config.accessLogSettings(accessLogSettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param cacheClusterEnabled This parameter is required.
         */
        public Builder cacheClusterEnabled(final java.lang.Boolean cacheClusterEnabled) {
            this.config.cacheClusterEnabled(cacheClusterEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param cacheClusterSize This parameter is required.
         */
        public Builder cacheClusterSize(final java.lang.String cacheClusterSize) {
            this.config.cacheClusterSize(cacheClusterSize);
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
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * @return {@code this}
         * @param documentationVersion This parameter is required.
         */
        public Builder documentationVersion(final java.lang.String documentationVersion) {
            this.config.documentationVersion(documentationVersion);
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
         * @return {@code this}
         * @param variables This parameter is required.
         */
        public Builder variables(final java.util.Map<java.lang.String, java.lang.String> variables) {
            this.config.variables(variables);
            return this;
        }

        /**
         * @return {@code this}
         * @param xrayTracingEnabled This parameter is required.
         */
        public Builder xrayTracingEnabled(final java.lang.Boolean xrayTracingEnabled) {
            this.config.xrayTracingEnabled(xrayTracingEnabled);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ApiGatewayStage}.
         */
        @Override
        public imports.aws.ApiGatewayStage build() {
            return new imports.aws.ApiGatewayStage(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
