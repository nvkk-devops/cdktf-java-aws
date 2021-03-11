package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.543Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticBeanstalkEnvironment")
public class ElasticBeanstalkEnvironment extends com.hashicorp.cdktf.TerraformResource {

    protected ElasticBeanstalkEnvironment(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElasticBeanstalkEnvironment(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ElasticBeanstalkEnvironment(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ElasticBeanstalkEnvironmentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ElasticBeanstalkEnvironmentAllSettings allSettings(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "allSettings", software.amazon.jsii.NativeType.forClass(imports.aws.ElasticBeanstalkEnvironmentAllSettings.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    public void resetCnamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetCnamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlatformArn() {
        software.amazon.jsii.Kernel.call(this, "resetPlatformArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPollInterval() {
        software.amazon.jsii.Kernel.call(this, "resetPollInterval", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSetting() {
        software.amazon.jsii.Kernel.call(this, "resetSetting", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSolutionStackName() {
        software.amazon.jsii.Kernel.call(this, "resetSolutionStackName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTemplateName() {
        software.amazon.jsii.Kernel.call(this, "resetTemplateName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTier() {
        software.amazon.jsii.Kernel.call(this, "resetTier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersionLabel() {
        software.amazon.jsii.Kernel.call(this, "resetVersionLabel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForReadyTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForReadyTimeout", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAutoscalingGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "autoscalingGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCname() {
        return software.amazon.jsii.Kernel.get(this, "cname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointUrl() {
        return software.amazon.jsii.Kernel.get(this, "endpointUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getInstances() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "instances", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLaunchConfigurations() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "launchConfigurations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLoadBalancers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loadBalancers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getQueues() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "queues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTriggers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "triggers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCnamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "cnamePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlatformArnInput() {
        return software.amazon.jsii.Kernel.get(this, "platformArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPollIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "pollIntervalInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting> getSettingInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting>)(software.amazon.jsii.Kernel.get(this, "settingInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticBeanstalkEnvironmentSetting.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSolutionStackNameInput() {
        return software.amazon.jsii.Kernel.get(this, "solutionStackNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTemplateNameInput() {
        return software.amazon.jsii.Kernel.get(this, "templateNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTierInput() {
        return software.amazon.jsii.Kernel.get(this, "tierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionLabelInput() {
        return software.amazon.jsii.Kernel.get(this, "versionLabelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWaitForReadyTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForReadyTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplication() {
        return software.amazon.jsii.Kernel.get(this, "application", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplication(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "application", java.util.Objects.requireNonNull(value, "application is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCnamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "cnamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCnamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cnamePrefix", java.util.Objects.requireNonNull(value, "cnamePrefix is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformArn() {
        return software.amazon.jsii.Kernel.get(this, "platformArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlatformArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "platformArn", java.util.Objects.requireNonNull(value, "platformArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPollInterval() {
        return software.amazon.jsii.Kernel.get(this, "pollInterval", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPollInterval(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pollInterval", java.util.Objects.requireNonNull(value, "pollInterval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting> getSetting() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "setting", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticBeanstalkEnvironmentSetting.class))));
    }

    public void setSetting(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting> value) {
        software.amazon.jsii.Kernel.set(this, "setting", java.util.Objects.requireNonNull(value, "setting is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSolutionStackName() {
        return software.amazon.jsii.Kernel.get(this, "solutionStackName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSolutionStackName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "solutionStackName", java.util.Objects.requireNonNull(value, "solutionStackName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTemplateName() {
        return software.amazon.jsii.Kernel.get(this, "templateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTemplateName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "templateName", java.util.Objects.requireNonNull(value, "templateName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTier() {
        return software.amazon.jsii.Kernel.get(this, "tier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tier", java.util.Objects.requireNonNull(value, "tier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionLabel() {
        return software.amazon.jsii.Kernel.get(this, "versionLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersionLabel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "versionLabel", java.util.Objects.requireNonNull(value, "versionLabel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWaitForReadyTimeout() {
        return software.amazon.jsii.Kernel.get(this, "waitForReadyTimeout", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWaitForReadyTimeout(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "waitForReadyTimeout", java.util.Objects.requireNonNull(value, "waitForReadyTimeout is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ElasticBeanstalkEnvironment}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ElasticBeanstalkEnvironment> {
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
        private final imports.aws.ElasticBeanstalkEnvironmentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ElasticBeanstalkEnvironmentConfig.Builder();
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
         * @param application This parameter is required.
         */
        public Builder application(final java.lang.String application) {
            this.config.application(application);
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
         * @param cnamePrefix This parameter is required.
         */
        public Builder cnamePrefix(final java.lang.String cnamePrefix) {
            this.config.cnamePrefix(cnamePrefix);
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
         * @param platformArn This parameter is required.
         */
        public Builder platformArn(final java.lang.String platformArn) {
            this.config.platformArn(platformArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param pollInterval This parameter is required.
         */
        public Builder pollInterval(final java.lang.String pollInterval) {
            this.config.pollInterval(pollInterval);
            return this;
        }

        /**
         * setting block.
         * <p>
         * @return {@code this}
         * @param setting setting block. This parameter is required.
         */
        public Builder setting(final java.util.List<? extends imports.aws.ElasticBeanstalkEnvironmentSetting> setting) {
            this.config.setting(setting);
            return this;
        }

        /**
         * @return {@code this}
         * @param solutionStackName This parameter is required.
         */
        public Builder solutionStackName(final java.lang.String solutionStackName) {
            this.config.solutionStackName(solutionStackName);
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
         * @param templateName This parameter is required.
         */
        public Builder templateName(final java.lang.String templateName) {
            this.config.templateName(templateName);
            return this;
        }

        /**
         * @return {@code this}
         * @param tier This parameter is required.
         */
        public Builder tier(final java.lang.String tier) {
            this.config.tier(tier);
            return this;
        }

        /**
         * @return {@code this}
         * @param versionLabel This parameter is required.
         */
        public Builder versionLabel(final java.lang.String versionLabel) {
            this.config.versionLabel(versionLabel);
            return this;
        }

        /**
         * @return {@code this}
         * @param waitForReadyTimeout This parameter is required.
         */
        public Builder waitForReadyTimeout(final java.lang.String waitForReadyTimeout) {
            this.config.waitForReadyTimeout(waitForReadyTimeout);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ElasticBeanstalkEnvironment}.
         */
        @Override
        public imports.aws.ElasticBeanstalkEnvironment build() {
            return new imports.aws.ElasticBeanstalkEnvironment(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
