package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.165Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProject")
public class CodebuildProject extends com.hashicorp.cdktf.TerraformResource {

    protected CodebuildProject(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildProject(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CodebuildProject(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CodebuildProjectConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBadgeEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetBadgeEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBuildTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetBuildTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCache() {
        software.amazon.jsii.Kernel.call(this, "resetCache", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionKey() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogsConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLogsConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueuedTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetQueuedTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecondaryArtifacts() {
        software.amazon.jsii.Kernel.call(this, "resetSecondaryArtifacts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecondarySources() {
        software.amazon.jsii.Kernel.call(this, "resetSecondarySources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceVersion() {
        software.amazon.jsii.Kernel.call(this, "resetSourceVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcConfig() {
        software.amazon.jsii.Kernel.call(this, "resetVpcConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectArtifacts> getArtifactsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "artifactsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectArtifacts.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBadgeUrl() {
        return software.amazon.jsii.Kernel.get(this, "badgeUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectEnvironment> getEnvironmentInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "environmentInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectEnvironment.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSource> getSourceInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "sourceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSource.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBadgeEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "badgeEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBuildTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "buildTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectCache> getCacheInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodebuildProjectCache>)(software.amazon.jsii.Kernel.get(this, "cacheInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectCache.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEncryptionKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectLogsConfig> getLogsConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodebuildProjectLogsConfig>)(software.amazon.jsii.Kernel.get(this, "logsConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectLogsConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getQueuedTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "queuedTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts> getSecondaryArtifactsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts>)(software.amazon.jsii.Kernel.get(this, "secondaryArtifactsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSecondaryArtifacts.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectSecondarySources> getSecondarySourcesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodebuildProjectSecondarySources>)(software.amazon.jsii.Kernel.get(this, "secondarySourcesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSecondarySources.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectVpcConfig> getVpcConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodebuildProjectVpcConfig>)(software.amazon.jsii.Kernel.get(this, "vpcConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectVpcConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectArtifacts> getArtifacts() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "artifacts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectArtifacts.class))));
    }

    public void setArtifacts(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectArtifacts> value) {
        software.amazon.jsii.Kernel.set(this, "artifacts", java.util.Objects.requireNonNull(value, "artifacts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getBadgeEnabled() {
        return software.amazon.jsii.Kernel.get(this, "badgeEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBadgeEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "badgeEnabled", java.util.Objects.requireNonNull(value, "badgeEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBuildTimeout() {
        return software.amazon.jsii.Kernel.get(this, "buildTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBuildTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "buildTimeout", java.util.Objects.requireNonNull(value, "buildTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectCache> getCache() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cache", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectCache.class))));
    }

    public void setCache(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectCache> value) {
        software.amazon.jsii.Kernel.set(this, "cache", java.util.Objects.requireNonNull(value, "cache is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncryptionKey() {
        return software.amazon.jsii.Kernel.get(this, "encryptionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEncryptionKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "encryptionKey", java.util.Objects.requireNonNull(value, "encryptionKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectEnvironment> getEnvironment() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectEnvironment.class))));
    }

    public void setEnvironment(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectEnvironment> value) {
        software.amazon.jsii.Kernel.set(this, "environment", java.util.Objects.requireNonNull(value, "environment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectLogsConfig> getLogsConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logsConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectLogsConfig.class))));
    }

    public void setLogsConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectLogsConfig> value) {
        software.amazon.jsii.Kernel.set(this, "logsConfig", java.util.Objects.requireNonNull(value, "logsConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getQueuedTimeout() {
        return software.amazon.jsii.Kernel.get(this, "queuedTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setQueuedTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "queuedTimeout", java.util.Objects.requireNonNull(value, "queuedTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts> getSecondaryArtifacts() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "secondaryArtifacts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSecondaryArtifacts.class))));
    }

    public void setSecondaryArtifacts(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts> value) {
        software.amazon.jsii.Kernel.set(this, "secondaryArtifacts", java.util.Objects.requireNonNull(value, "secondaryArtifacts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSecondarySources> getSecondarySources() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "secondarySources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSecondarySources.class))));
    }

    public void setSecondarySources(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSecondarySources> value) {
        software.amazon.jsii.Kernel.set(this, "secondarySources", java.util.Objects.requireNonNull(value, "secondarySources is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRole() {
        return software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRole", java.util.Objects.requireNonNull(value, "serviceRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSource> getSource() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSource.class))));
    }

    public void setSource(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSource> value) {
        software.amazon.jsii.Kernel.set(this, "source", java.util.Objects.requireNonNull(value, "source is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceVersion() {
        return software.amazon.jsii.Kernel.get(this, "sourceVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceVersion", java.util.Objects.requireNonNull(value, "sourceVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectVpcConfig> getVpcConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectVpcConfig.class))));
    }

    public void setVpcConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectVpcConfig> value) {
        software.amazon.jsii.Kernel.set(this, "vpcConfig", java.util.Objects.requireNonNull(value, "vpcConfig is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CodebuildProject}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CodebuildProject> {
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
        private final imports.aws.CodebuildProjectConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CodebuildProjectConfig.Builder();
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
         * artifacts block.
         * <p>
         * @return {@code this}
         * @param artifacts artifacts block. This parameter is required.
         */
        public Builder artifacts(final java.util.List<? extends imports.aws.CodebuildProjectArtifacts> artifacts) {
            this.config.artifacts(artifacts);
            return this;
        }

        /**
         * environment block.
         * <p>
         * @return {@code this}
         * @param environment environment block. This parameter is required.
         */
        public Builder environment(final java.util.List<? extends imports.aws.CodebuildProjectEnvironment> environment) {
            this.config.environment(environment);
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
         * @param serviceRole This parameter is required.
         */
        public Builder serviceRole(final java.lang.String serviceRole) {
            this.config.serviceRole(serviceRole);
            return this;
        }

        /**
         * source block.
         * <p>
         * @return {@code this}
         * @param source source block. This parameter is required.
         */
        public Builder source(final java.util.List<? extends imports.aws.CodebuildProjectSource> source) {
            this.config.source(source);
            return this;
        }

        /**
         * @return {@code this}
         * @param badgeEnabled This parameter is required.
         */
        public Builder badgeEnabled(final java.lang.Boolean badgeEnabled) {
            this.config.badgeEnabled(badgeEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param buildTimeout This parameter is required.
         */
        public Builder buildTimeout(final java.lang.Number buildTimeout) {
            this.config.buildTimeout(buildTimeout);
            return this;
        }

        /**
         * cache block.
         * <p>
         * @return {@code this}
         * @param cache cache block. This parameter is required.
         */
        public Builder cache(final java.util.List<? extends imports.aws.CodebuildProjectCache> cache) {
            this.config.cache(cache);
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
         * @param encryptionKey This parameter is required.
         */
        public Builder encryptionKey(final java.lang.String encryptionKey) {
            this.config.encryptionKey(encryptionKey);
            return this;
        }

        /**
         * logs_config block.
         * <p>
         * @return {@code this}
         * @param logsConfig logs_config block. This parameter is required.
         */
        public Builder logsConfig(final java.util.List<? extends imports.aws.CodebuildProjectLogsConfig> logsConfig) {
            this.config.logsConfig(logsConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param queuedTimeout This parameter is required.
         */
        public Builder queuedTimeout(final java.lang.Number queuedTimeout) {
            this.config.queuedTimeout(queuedTimeout);
            return this;
        }

        /**
         * secondary_artifacts block.
         * <p>
         * @return {@code this}
         * @param secondaryArtifacts secondary_artifacts block. This parameter is required.
         */
        public Builder secondaryArtifacts(final java.util.List<? extends imports.aws.CodebuildProjectSecondaryArtifacts> secondaryArtifacts) {
            this.config.secondaryArtifacts(secondaryArtifacts);
            return this;
        }

        /**
         * secondary_sources block.
         * <p>
         * @return {@code this}
         * @param secondarySources secondary_sources block. This parameter is required.
         */
        public Builder secondarySources(final java.util.List<? extends imports.aws.CodebuildProjectSecondarySources> secondarySources) {
            this.config.secondarySources(secondarySources);
            return this;
        }

        /**
         * @return {@code this}
         * @param sourceVersion This parameter is required.
         */
        public Builder sourceVersion(final java.lang.String sourceVersion) {
            this.config.sourceVersion(sourceVersion);
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
         * vpc_config block.
         * <p>
         * @return {@code this}
         * @param vpcConfig vpc_config block. This parameter is required.
         */
        public Builder vpcConfig(final java.util.List<? extends imports.aws.CodebuildProjectVpcConfig> vpcConfig) {
            this.config.vpcConfig(vpcConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CodebuildProject}.
         */
        @Override
        public imports.aws.CodebuildProject build() {
            return new imports.aws.CodebuildProject(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
