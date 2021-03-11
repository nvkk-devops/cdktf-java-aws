package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.166Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectConfig")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectConfig.Jsii$Proxy.class)
public interface CodebuildProjectConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * artifacts block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectArtifacts> getArtifacts();

    /**
     * environment block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectEnvironment> getEnvironment();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceRole();

    /**
     * source block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildProjectSource> getSource();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBadgeEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBuildTimeout() {
        return null;
    }

    /**
     * cache block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectCache> getCache() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEncryptionKey() {
        return null;
    }

    /**
     * logs_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectLogsConfig> getLogsConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getQueuedTimeout() {
        return null;
    }

    /**
     * secondary_artifacts block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts> getSecondaryArtifacts() {
        return null;
    }

    /**
     * secondary_sources block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectSecondarySources> getSecondarySources() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * vpc_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectVpcConfig> getVpcConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectConfig> {
        private java.util.List<imports.aws.CodebuildProjectArtifacts> artifacts;
        private java.util.List<imports.aws.CodebuildProjectEnvironment> environment;
        private java.lang.String name;
        private java.lang.String serviceRole;
        private java.util.List<imports.aws.CodebuildProjectSource> source;
        private java.lang.Boolean badgeEnabled;
        private java.lang.Number buildTimeout;
        private java.util.List<imports.aws.CodebuildProjectCache> cache;
        private java.lang.String description;
        private java.lang.String encryptionKey;
        private java.util.List<imports.aws.CodebuildProjectLogsConfig> logsConfig;
        private java.lang.Number queuedTimeout;
        private java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts> secondaryArtifacts;
        private java.util.List<imports.aws.CodebuildProjectSecondarySources> secondarySources;
        private java.lang.String sourceVersion;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.CodebuildProjectVpcConfig> vpcConfig;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CodebuildProjectConfig#getArtifacts}
         * @param artifacts artifacts block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder artifacts(java.util.List<? extends imports.aws.CodebuildProjectArtifacts> artifacts) {
            this.artifacts = (java.util.List<imports.aws.CodebuildProjectArtifacts>)artifacts;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getEnvironment}
         * @param environment environment block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder environment(java.util.List<? extends imports.aws.CodebuildProjectEnvironment> environment) {
            this.environment = (java.util.List<imports.aws.CodebuildProjectEnvironment>)environment;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getServiceRole}
         * @param serviceRole the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceRole(java.lang.String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getSource}
         * @param source source block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder source(java.util.List<? extends imports.aws.CodebuildProjectSource> source) {
            this.source = (java.util.List<imports.aws.CodebuildProjectSource>)source;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getBadgeEnabled}
         * @param badgeEnabled the value to be set.
         * @return {@code this}
         */
        public Builder badgeEnabled(java.lang.Boolean badgeEnabled) {
            this.badgeEnabled = badgeEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getBuildTimeout}
         * @param buildTimeout the value to be set.
         * @return {@code this}
         */
        public Builder buildTimeout(java.lang.Number buildTimeout) {
            this.buildTimeout = buildTimeout;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getCache}
         * @param cache cache block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cache(java.util.List<? extends imports.aws.CodebuildProjectCache> cache) {
            this.cache = (java.util.List<imports.aws.CodebuildProjectCache>)cache;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getEncryptionKey}
         * @param encryptionKey the value to be set.
         * @return {@code this}
         */
        public Builder encryptionKey(java.lang.String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getLogsConfig}
         * @param logsConfig logs_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder logsConfig(java.util.List<? extends imports.aws.CodebuildProjectLogsConfig> logsConfig) {
            this.logsConfig = (java.util.List<imports.aws.CodebuildProjectLogsConfig>)logsConfig;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getQueuedTimeout}
         * @param queuedTimeout the value to be set.
         * @return {@code this}
         */
        public Builder queuedTimeout(java.lang.Number queuedTimeout) {
            this.queuedTimeout = queuedTimeout;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getSecondaryArtifacts}
         * @param secondaryArtifacts secondary_artifacts block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder secondaryArtifacts(java.util.List<? extends imports.aws.CodebuildProjectSecondaryArtifacts> secondaryArtifacts) {
            this.secondaryArtifacts = (java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts>)secondaryArtifacts;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getSecondarySources}
         * @param secondarySources secondary_sources block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder secondarySources(java.util.List<? extends imports.aws.CodebuildProjectSecondarySources> secondarySources) {
            this.secondarySources = (java.util.List<imports.aws.CodebuildProjectSecondarySources>)secondarySources;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getSourceVersion}
         * @param sourceVersion the value to be set.
         * @return {@code this}
         */
        public Builder sourceVersion(java.lang.String sourceVersion) {
            this.sourceVersion = sourceVersion;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getVpcConfig}
         * @param vpcConfig vpc_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder vpcConfig(java.util.List<? extends imports.aws.CodebuildProjectVpcConfig> vpcConfig) {
            this.vpcConfig = (java.util.List<imports.aws.CodebuildProjectVpcConfig>)vpcConfig;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectConfig build() {
            return new Jsii$Proxy(artifacts, environment, name, serviceRole, source, badgeEnabled, buildTimeout, cache, description, encryptionKey, logsConfig, queuedTimeout, secondaryArtifacts, secondarySources, sourceVersion, tags, vpcConfig, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectConfig {
        private final java.util.List<imports.aws.CodebuildProjectArtifacts> artifacts;
        private final java.util.List<imports.aws.CodebuildProjectEnvironment> environment;
        private final java.lang.String name;
        private final java.lang.String serviceRole;
        private final java.util.List<imports.aws.CodebuildProjectSource> source;
        private final java.lang.Boolean badgeEnabled;
        private final java.lang.Number buildTimeout;
        private final java.util.List<imports.aws.CodebuildProjectCache> cache;
        private final java.lang.String description;
        private final java.lang.String encryptionKey;
        private final java.util.List<imports.aws.CodebuildProjectLogsConfig> logsConfig;
        private final java.lang.Number queuedTimeout;
        private final java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts> secondaryArtifacts;
        private final java.util.List<imports.aws.CodebuildProjectSecondarySources> secondarySources;
        private final java.lang.String sourceVersion;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.CodebuildProjectVpcConfig> vpcConfig;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.artifacts = software.amazon.jsii.Kernel.get(this, "artifacts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectArtifacts.class)));
            this.environment = software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectEnvironment.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceRole = software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.source = software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSource.class)));
            this.badgeEnabled = software.amazon.jsii.Kernel.get(this, "badgeEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.buildTimeout = software.amazon.jsii.Kernel.get(this, "buildTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cache = software.amazon.jsii.Kernel.get(this, "cache", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectCache.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryptionKey = software.amazon.jsii.Kernel.get(this, "encryptionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logsConfig = software.amazon.jsii.Kernel.get(this, "logsConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectLogsConfig.class)));
            this.queuedTimeout = software.amazon.jsii.Kernel.get(this, "queuedTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.secondaryArtifacts = software.amazon.jsii.Kernel.get(this, "secondaryArtifacts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSecondaryArtifacts.class)));
            this.secondarySources = software.amazon.jsii.Kernel.get(this, "secondarySources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSecondarySources.class)));
            this.sourceVersion = software.amazon.jsii.Kernel.get(this, "sourceVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcConfig = software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectVpcConfig.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CodebuildProjectArtifacts> artifacts, final java.util.List<? extends imports.aws.CodebuildProjectEnvironment> environment, final java.lang.String name, final java.lang.String serviceRole, final java.util.List<? extends imports.aws.CodebuildProjectSource> source, final java.lang.Boolean badgeEnabled, final java.lang.Number buildTimeout, final java.util.List<? extends imports.aws.CodebuildProjectCache> cache, final java.lang.String description, final java.lang.String encryptionKey, final java.util.List<? extends imports.aws.CodebuildProjectLogsConfig> logsConfig, final java.lang.Number queuedTimeout, final java.util.List<? extends imports.aws.CodebuildProjectSecondaryArtifacts> secondaryArtifacts, final java.util.List<? extends imports.aws.CodebuildProjectSecondarySources> secondarySources, final java.lang.String sourceVersion, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.CodebuildProjectVpcConfig> vpcConfig, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.artifacts = (java.util.List<imports.aws.CodebuildProjectArtifacts>)java.util.Objects.requireNonNull(artifacts, "artifacts is required");
            this.environment = (java.util.List<imports.aws.CodebuildProjectEnvironment>)java.util.Objects.requireNonNull(environment, "environment is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.serviceRole = java.util.Objects.requireNonNull(serviceRole, "serviceRole is required");
            this.source = (java.util.List<imports.aws.CodebuildProjectSource>)java.util.Objects.requireNonNull(source, "source is required");
            this.badgeEnabled = badgeEnabled;
            this.buildTimeout = buildTimeout;
            this.cache = (java.util.List<imports.aws.CodebuildProjectCache>)cache;
            this.description = description;
            this.encryptionKey = encryptionKey;
            this.logsConfig = (java.util.List<imports.aws.CodebuildProjectLogsConfig>)logsConfig;
            this.queuedTimeout = queuedTimeout;
            this.secondaryArtifacts = (java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts>)secondaryArtifacts;
            this.secondarySources = (java.util.List<imports.aws.CodebuildProjectSecondarySources>)secondarySources;
            this.sourceVersion = sourceVersion;
            this.tags = tags;
            this.vpcConfig = (java.util.List<imports.aws.CodebuildProjectVpcConfig>)vpcConfig;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectArtifacts> getArtifacts() {
            return this.artifacts;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectEnvironment> getEnvironment() {
            return this.environment;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getServiceRole() {
            return this.serviceRole;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectSource> getSource() {
            return this.source;
        }

        @Override
        public final java.lang.Boolean getBadgeEnabled() {
            return this.badgeEnabled;
        }

        @Override
        public final java.lang.Number getBuildTimeout() {
            return this.buildTimeout;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectCache> getCache() {
            return this.cache;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getEncryptionKey() {
            return this.encryptionKey;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectLogsConfig> getLogsConfig() {
            return this.logsConfig;
        }

        @Override
        public final java.lang.Number getQueuedTimeout() {
            return this.queuedTimeout;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectSecondaryArtifacts> getSecondaryArtifacts() {
            return this.secondaryArtifacts;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectSecondarySources> getSecondarySources() {
            return this.secondarySources;
        }

        @Override
        public final java.lang.String getSourceVersion() {
            return this.sourceVersion;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectVpcConfig> getVpcConfig() {
            return this.vpcConfig;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("artifacts", om.valueToTree(this.getArtifacts()));
            data.set("environment", om.valueToTree(this.getEnvironment()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("serviceRole", om.valueToTree(this.getServiceRole()));
            data.set("source", om.valueToTree(this.getSource()));
            if (this.getBadgeEnabled() != null) {
                data.set("badgeEnabled", om.valueToTree(this.getBadgeEnabled()));
            }
            if (this.getBuildTimeout() != null) {
                data.set("buildTimeout", om.valueToTree(this.getBuildTimeout()));
            }
            if (this.getCache() != null) {
                data.set("cache", om.valueToTree(this.getCache()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEncryptionKey() != null) {
                data.set("encryptionKey", om.valueToTree(this.getEncryptionKey()));
            }
            if (this.getLogsConfig() != null) {
                data.set("logsConfig", om.valueToTree(this.getLogsConfig()));
            }
            if (this.getQueuedTimeout() != null) {
                data.set("queuedTimeout", om.valueToTree(this.getQueuedTimeout()));
            }
            if (this.getSecondaryArtifacts() != null) {
                data.set("secondaryArtifacts", om.valueToTree(this.getSecondaryArtifacts()));
            }
            if (this.getSecondarySources() != null) {
                data.set("secondarySources", om.valueToTree(this.getSecondarySources()));
            }
            if (this.getSourceVersion() != null) {
                data.set("sourceVersion", om.valueToTree(this.getSourceVersion()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVpcConfig() != null) {
                data.set("vpcConfig", om.valueToTree(this.getVpcConfig()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectConfig.Jsii$Proxy that = (CodebuildProjectConfig.Jsii$Proxy) o;

            if (!artifacts.equals(that.artifacts)) return false;
            if (!environment.equals(that.environment)) return false;
            if (!name.equals(that.name)) return false;
            if (!serviceRole.equals(that.serviceRole)) return false;
            if (!source.equals(that.source)) return false;
            if (this.badgeEnabled != null ? !this.badgeEnabled.equals(that.badgeEnabled) : that.badgeEnabled != null) return false;
            if (this.buildTimeout != null ? !this.buildTimeout.equals(that.buildTimeout) : that.buildTimeout != null) return false;
            if (this.cache != null ? !this.cache.equals(that.cache) : that.cache != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.encryptionKey != null ? !this.encryptionKey.equals(that.encryptionKey) : that.encryptionKey != null) return false;
            if (this.logsConfig != null ? !this.logsConfig.equals(that.logsConfig) : that.logsConfig != null) return false;
            if (this.queuedTimeout != null ? !this.queuedTimeout.equals(that.queuedTimeout) : that.queuedTimeout != null) return false;
            if (this.secondaryArtifacts != null ? !this.secondaryArtifacts.equals(that.secondaryArtifacts) : that.secondaryArtifacts != null) return false;
            if (this.secondarySources != null ? !this.secondarySources.equals(that.secondarySources) : that.secondarySources != null) return false;
            if (this.sourceVersion != null ? !this.sourceVersion.equals(that.sourceVersion) : that.sourceVersion != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.vpcConfig != null ? !this.vpcConfig.equals(that.vpcConfig) : that.vpcConfig != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.artifacts.hashCode();
            result = 31 * result + (this.environment.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.serviceRole.hashCode());
            result = 31 * result + (this.source.hashCode());
            result = 31 * result + (this.badgeEnabled != null ? this.badgeEnabled.hashCode() : 0);
            result = 31 * result + (this.buildTimeout != null ? this.buildTimeout.hashCode() : 0);
            result = 31 * result + (this.cache != null ? this.cache.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.encryptionKey != null ? this.encryptionKey.hashCode() : 0);
            result = 31 * result + (this.logsConfig != null ? this.logsConfig.hashCode() : 0);
            result = 31 * result + (this.queuedTimeout != null ? this.queuedTimeout.hashCode() : 0);
            result = 31 * result + (this.secondaryArtifacts != null ? this.secondaryArtifacts.hashCode() : 0);
            result = 31 * result + (this.secondarySources != null ? this.secondarySources.hashCode() : 0);
            result = 31 * result + (this.sourceVersion != null ? this.sourceVersion.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.vpcConfig != null ? this.vpcConfig.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
