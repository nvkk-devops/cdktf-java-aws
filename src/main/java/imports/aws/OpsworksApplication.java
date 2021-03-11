package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.733Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksApplication")
public class OpsworksApplication extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksApplication(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksApplication(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public OpsworksApplication(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.OpsworksApplicationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAppSource() {
        software.amazon.jsii.Kernel.call(this, "resetAppSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoBundleOnDeploy() {
        software.amazon.jsii.Kernel.call(this, "resetAutoBundleOnDeploy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAwsFlowRubySettings() {
        software.amazon.jsii.Kernel.call(this, "resetAwsFlowRubySettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataSourceArn() {
        software.amazon.jsii.Kernel.call(this, "resetDataSourceArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataSourceDatabaseName() {
        software.amazon.jsii.Kernel.call(this, "resetDataSourceDatabaseName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataSourceType() {
        software.amazon.jsii.Kernel.call(this, "resetDataSourceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDocumentRoot() {
        software.amazon.jsii.Kernel.call(this, "resetDocumentRoot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDomains() {
        software.amazon.jsii.Kernel.call(this, "resetDomains", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableSsl() {
        software.amazon.jsii.Kernel.call(this, "resetEnableSsl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnvironment() {
        software.amazon.jsii.Kernel.call(this, "resetEnvironment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRailsEnv() {
        software.amazon.jsii.Kernel.call(this, "resetRailsEnv", software.amazon.jsii.NativeType.VOID);
    }

    public void resetShortName() {
        software.amazon.jsii.Kernel.call(this, "resetShortName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSslConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSslConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackIdInput() {
        return software.amazon.jsii.Kernel.get(this, "stackIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksApplicationAppSource> getAppSourceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksApplicationAppSource>)(software.amazon.jsii.Kernel.get(this, "appSourceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationAppSource.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAutoBundleOnDeployInput() {
        return software.amazon.jsii.Kernel.get(this, "autoBundleOnDeployInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAwsFlowRubySettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "awsFlowRubySettingsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataSourceArnInput() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataSourceDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceDatabaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataSourceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDocumentRootInput() {
        return software.amazon.jsii.Kernel.get(this, "documentRootInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDomainsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "domainsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableSslInput() {
        return software.amazon.jsii.Kernel.get(this, "enableSslInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksApplicationEnvironment> getEnvironmentInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksApplicationEnvironment>)(software.amazon.jsii.Kernel.get(this, "environmentInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationEnvironment.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRailsEnvInput() {
        return software.amazon.jsii.Kernel.get(this, "railsEnvInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getShortNameInput() {
        return software.amazon.jsii.Kernel.get(this, "shortNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksApplicationSslConfiguration> getSslConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksApplicationSslConfiguration>)(software.amazon.jsii.Kernel.get(this, "sslConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationSslConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksApplicationAppSource> getAppSource() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "appSource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationAppSource.class))));
    }

    public void setAppSource(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksApplicationAppSource> value) {
        software.amazon.jsii.Kernel.set(this, "appSource", java.util.Objects.requireNonNull(value, "appSource is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoBundleOnDeploy() {
        return software.amazon.jsii.Kernel.get(this, "autoBundleOnDeploy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutoBundleOnDeploy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "autoBundleOnDeploy", java.util.Objects.requireNonNull(value, "autoBundleOnDeploy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAwsFlowRubySettings() {
        return software.amazon.jsii.Kernel.get(this, "awsFlowRubySettings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAwsFlowRubySettings(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "awsFlowRubySettings", java.util.Objects.requireNonNull(value, "awsFlowRubySettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataSourceArn() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataSourceArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataSourceArn", java.util.Objects.requireNonNull(value, "dataSourceArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataSourceDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceDatabaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataSourceDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataSourceDatabaseName", java.util.Objects.requireNonNull(value, "dataSourceDatabaseName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataSourceType() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataSourceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataSourceType", java.util.Objects.requireNonNull(value, "dataSourceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentRoot() {
        return software.amazon.jsii.Kernel.get(this, "documentRoot", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDocumentRoot(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "documentRoot", java.util.Objects.requireNonNull(value, "documentRoot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDomains() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "domains", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDomains(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "domains", java.util.Objects.requireNonNull(value, "domains is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableSsl() {
        return software.amazon.jsii.Kernel.get(this, "enableSsl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableSsl(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableSsl", java.util.Objects.requireNonNull(value, "enableSsl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksApplicationEnvironment> getEnvironment() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationEnvironment.class))));
    }

    public void setEnvironment(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksApplicationEnvironment> value) {
        software.amazon.jsii.Kernel.set(this, "environment", java.util.Objects.requireNonNull(value, "environment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRailsEnv() {
        return software.amazon.jsii.Kernel.get(this, "railsEnv", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRailsEnv(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "railsEnv", java.util.Objects.requireNonNull(value, "railsEnv is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getShortName() {
        return software.amazon.jsii.Kernel.get(this, "shortName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setShortName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "shortName", java.util.Objects.requireNonNull(value, "shortName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksApplicationSslConfiguration> getSslConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "sslConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationSslConfiguration.class))));
    }

    public void setSslConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksApplicationSslConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "sslConfiguration", java.util.Objects.requireNonNull(value, "sslConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackId() {
        return software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStackId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stackId", java.util.Objects.requireNonNull(value, "stackId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.OpsworksApplication}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.OpsworksApplication> {
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
        private final imports.aws.OpsworksApplicationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.OpsworksApplicationConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param stackId This parameter is required.
         */
        public Builder stackId(final java.lang.String stackId) {
            this.config.stackId(stackId);
            return this;
        }

        /**
         * @return {@code this}
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * app_source block.
         * <p>
         * @return {@code this}
         * @param appSource app_source block. This parameter is required.
         */
        public Builder appSource(final java.util.List<? extends imports.aws.OpsworksApplicationAppSource> appSource) {
            this.config.appSource(appSource);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoBundleOnDeploy This parameter is required.
         */
        public Builder autoBundleOnDeploy(final java.lang.String autoBundleOnDeploy) {
            this.config.autoBundleOnDeploy(autoBundleOnDeploy);
            return this;
        }

        /**
         * @return {@code this}
         * @param awsFlowRubySettings This parameter is required.
         */
        public Builder awsFlowRubySettings(final java.lang.String awsFlowRubySettings) {
            this.config.awsFlowRubySettings(awsFlowRubySettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param dataSourceArn This parameter is required.
         */
        public Builder dataSourceArn(final java.lang.String dataSourceArn) {
            this.config.dataSourceArn(dataSourceArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param dataSourceDatabaseName This parameter is required.
         */
        public Builder dataSourceDatabaseName(final java.lang.String dataSourceDatabaseName) {
            this.config.dataSourceDatabaseName(dataSourceDatabaseName);
            return this;
        }

        /**
         * @return {@code this}
         * @param dataSourceType This parameter is required.
         */
        public Builder dataSourceType(final java.lang.String dataSourceType) {
            this.config.dataSourceType(dataSourceType);
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
         * @param documentRoot This parameter is required.
         */
        public Builder documentRoot(final java.lang.String documentRoot) {
            this.config.documentRoot(documentRoot);
            return this;
        }

        /**
         * @return {@code this}
         * @param domains This parameter is required.
         */
        public Builder domains(final java.util.List<java.lang.String> domains) {
            this.config.domains(domains);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableSsl This parameter is required.
         */
        public Builder enableSsl(final java.lang.Boolean enableSsl) {
            this.config.enableSsl(enableSsl);
            return this;
        }

        /**
         * environment block.
         * <p>
         * @return {@code this}
         * @param environment environment block. This parameter is required.
         */
        public Builder environment(final java.util.List<? extends imports.aws.OpsworksApplicationEnvironment> environment) {
            this.config.environment(environment);
            return this;
        }

        /**
         * @return {@code this}
         * @param railsEnv This parameter is required.
         */
        public Builder railsEnv(final java.lang.String railsEnv) {
            this.config.railsEnv(railsEnv);
            return this;
        }

        /**
         * @return {@code this}
         * @param shortName This parameter is required.
         */
        public Builder shortName(final java.lang.String shortName) {
            this.config.shortName(shortName);
            return this;
        }

        /**
         * ssl_configuration block.
         * <p>
         * @return {@code this}
         * @param sslConfiguration ssl_configuration block. This parameter is required.
         */
        public Builder sslConfiguration(final java.util.List<? extends imports.aws.OpsworksApplicationSslConfiguration> sslConfiguration) {
            this.config.sslConfiguration(sslConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.OpsworksApplication}.
         */
        @Override
        public imports.aws.OpsworksApplication build() {
            return new imports.aws.OpsworksApplication(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
