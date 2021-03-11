package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.750Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksJavaAppLayerConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksJavaAppLayerConfig.Jsii$Proxy.class)
public interface OpsworksJavaAppLayerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getStackId();

    default @org.jetbrains.annotations.Nullable java.lang.String getAppServer() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAppServerVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoAssignElasticIps() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoAssignPublicIps() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoHealing() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomConfigureRecipes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomDeployRecipes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomInstanceProfileArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomJson() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSecurityGroupIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSetupRecipes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomShutdownRecipes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomUndeployRecipes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDrainElbOnShutdown() {
        return null;
    }

    /**
     * ebs_volume block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksJavaAppLayerEbsVolume> getEbsVolume() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getElasticLoadBalancer() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInstallUpdatesOnBoot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getInstanceShutdownTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getJvmOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getJvmType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getJvmVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSystemPackages() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseEbsOptimizedInstances() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksJavaAppLayerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksJavaAppLayerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksJavaAppLayerConfig> {
        private java.lang.String stackId;
        private java.lang.String appServer;
        private java.lang.String appServerVersion;
        private java.lang.Boolean autoAssignElasticIps;
        private java.lang.Boolean autoAssignPublicIps;
        private java.lang.Boolean autoHealing;
        private java.util.List<java.lang.String> customConfigureRecipes;
        private java.util.List<java.lang.String> customDeployRecipes;
        private java.lang.String customInstanceProfileArn;
        private java.lang.String customJson;
        private java.util.List<java.lang.String> customSecurityGroupIds;
        private java.util.List<java.lang.String> customSetupRecipes;
        private java.util.List<java.lang.String> customShutdownRecipes;
        private java.util.List<java.lang.String> customUndeployRecipes;
        private java.lang.Boolean drainElbOnShutdown;
        private java.util.List<imports.aws.OpsworksJavaAppLayerEbsVolume> ebsVolume;
        private java.lang.String elasticLoadBalancer;
        private java.lang.Boolean installUpdatesOnBoot;
        private java.lang.Number instanceShutdownTimeout;
        private java.lang.String jvmOptions;
        private java.lang.String jvmType;
        private java.lang.String jvmVersion;
        private java.lang.String name;
        private java.util.List<java.lang.String> systemPackages;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean useEbsOptimizedInstances;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getStackId}
         * @param stackId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stackId(java.lang.String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAppServer}
         * @param appServer the value to be set.
         * @return {@code this}
         */
        public Builder appServer(java.lang.String appServer) {
            this.appServer = appServer;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAppServerVersion}
         * @param appServerVersion the value to be set.
         * @return {@code this}
         */
        public Builder appServerVersion(java.lang.String appServerVersion) {
            this.appServerVersion = appServerVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoAssignElasticIps}
         * @param autoAssignElasticIps the value to be set.
         * @return {@code this}
         */
        public Builder autoAssignElasticIps(java.lang.Boolean autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoAssignPublicIps}
         * @param autoAssignPublicIps the value to be set.
         * @return {@code this}
         */
        public Builder autoAssignPublicIps(java.lang.Boolean autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoHealing}
         * @param autoHealing the value to be set.
         * @return {@code this}
         */
        public Builder autoHealing(java.lang.Boolean autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomConfigureRecipes}
         * @param customConfigureRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customConfigureRecipes(java.util.List<java.lang.String> customConfigureRecipes) {
            this.customConfigureRecipes = customConfigureRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomDeployRecipes}
         * @param customDeployRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customDeployRecipes(java.util.List<java.lang.String> customDeployRecipes) {
            this.customDeployRecipes = customDeployRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomInstanceProfileArn}
         * @param customInstanceProfileArn the value to be set.
         * @return {@code this}
         */
        public Builder customInstanceProfileArn(java.lang.String customInstanceProfileArn) {
            this.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomJson}
         * @param customJson the value to be set.
         * @return {@code this}
         */
        public Builder customJson(java.lang.String customJson) {
            this.customJson = customJson;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomSecurityGroupIds}
         * @param customSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder customSecurityGroupIds(java.util.List<java.lang.String> customSecurityGroupIds) {
            this.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomSetupRecipes}
         * @param customSetupRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customSetupRecipes(java.util.List<java.lang.String> customSetupRecipes) {
            this.customSetupRecipes = customSetupRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomShutdownRecipes}
         * @param customShutdownRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customShutdownRecipes(java.util.List<java.lang.String> customShutdownRecipes) {
            this.customShutdownRecipes = customShutdownRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomUndeployRecipes}
         * @param customUndeployRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customUndeployRecipes(java.util.List<java.lang.String> customUndeployRecipes) {
            this.customUndeployRecipes = customUndeployRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getDrainElbOnShutdown}
         * @param drainElbOnShutdown the value to be set.
         * @return {@code this}
         */
        public Builder drainElbOnShutdown(java.lang.Boolean drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getEbsVolume}
         * @param ebsVolume ebs_volume block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsVolume(java.util.List<? extends imports.aws.OpsworksJavaAppLayerEbsVolume> ebsVolume) {
            this.ebsVolume = (java.util.List<imports.aws.OpsworksJavaAppLayerEbsVolume>)ebsVolume;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getElasticLoadBalancer}
         * @param elasticLoadBalancer the value to be set.
         * @return {@code this}
         */
        public Builder elasticLoadBalancer(java.lang.String elasticLoadBalancer) {
            this.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getInstallUpdatesOnBoot}
         * @param installUpdatesOnBoot the value to be set.
         * @return {@code this}
         */
        public Builder installUpdatesOnBoot(java.lang.Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getInstanceShutdownTimeout}
         * @param instanceShutdownTimeout the value to be set.
         * @return {@code this}
         */
        public Builder instanceShutdownTimeout(java.lang.Number instanceShutdownTimeout) {
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getJvmOptions}
         * @param jvmOptions the value to be set.
         * @return {@code this}
         */
        public Builder jvmOptions(java.lang.String jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getJvmType}
         * @param jvmType the value to be set.
         * @return {@code this}
         */
        public Builder jvmType(java.lang.String jvmType) {
            this.jvmType = jvmType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getJvmVersion}
         * @param jvmVersion the value to be set.
         * @return {@code this}
         */
        public Builder jvmVersion(java.lang.String jvmVersion) {
            this.jvmVersion = jvmVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getSystemPackages}
         * @param systemPackages the value to be set.
         * @return {@code this}
         */
        public Builder systemPackages(java.util.List<java.lang.String> systemPackages) {
            this.systemPackages = systemPackages;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getUseEbsOptimizedInstances}
         * @param useEbsOptimizedInstances the value to be set.
         * @return {@code this}
         */
        public Builder useEbsOptimizedInstances(java.lang.Boolean useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getProvider}
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
         * @return a new instance of {@link OpsworksJavaAppLayerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksJavaAppLayerConfig build() {
            return new Jsii$Proxy(stackId, appServer, appServerVersion, autoAssignElasticIps, autoAssignPublicIps, autoHealing, customConfigureRecipes, customDeployRecipes, customInstanceProfileArn, customJson, customSecurityGroupIds, customSetupRecipes, customShutdownRecipes, customUndeployRecipes, drainElbOnShutdown, ebsVolume, elasticLoadBalancer, installUpdatesOnBoot, instanceShutdownTimeout, jvmOptions, jvmType, jvmVersion, name, systemPackages, tags, useEbsOptimizedInstances, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OpsworksJavaAppLayerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksJavaAppLayerConfig {
        private final java.lang.String stackId;
        private final java.lang.String appServer;
        private final java.lang.String appServerVersion;
        private final java.lang.Boolean autoAssignElasticIps;
        private final java.lang.Boolean autoAssignPublicIps;
        private final java.lang.Boolean autoHealing;
        private final java.util.List<java.lang.String> customConfigureRecipes;
        private final java.util.List<java.lang.String> customDeployRecipes;
        private final java.lang.String customInstanceProfileArn;
        private final java.lang.String customJson;
        private final java.util.List<java.lang.String> customSecurityGroupIds;
        private final java.util.List<java.lang.String> customSetupRecipes;
        private final java.util.List<java.lang.String> customShutdownRecipes;
        private final java.util.List<java.lang.String> customUndeployRecipes;
        private final java.lang.Boolean drainElbOnShutdown;
        private final java.util.List<imports.aws.OpsworksJavaAppLayerEbsVolume> ebsVolume;
        private final java.lang.String elasticLoadBalancer;
        private final java.lang.Boolean installUpdatesOnBoot;
        private final java.lang.Number instanceShutdownTimeout;
        private final java.lang.String jvmOptions;
        private final java.lang.String jvmType;
        private final java.lang.String jvmVersion;
        private final java.lang.String name;
        private final java.util.List<java.lang.String> systemPackages;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Boolean useEbsOptimizedInstances;
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
            this.stackId = software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.appServer = software.amazon.jsii.Kernel.get(this, "appServer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.appServerVersion = software.amazon.jsii.Kernel.get(this, "appServerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.autoAssignElasticIps = software.amazon.jsii.Kernel.get(this, "autoAssignElasticIps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoAssignPublicIps = software.amazon.jsii.Kernel.get(this, "autoAssignPublicIps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoHealing = software.amazon.jsii.Kernel.get(this, "autoHealing", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.customConfigureRecipes = software.amazon.jsii.Kernel.get(this, "customConfigureRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customDeployRecipes = software.amazon.jsii.Kernel.get(this, "customDeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customInstanceProfileArn = software.amazon.jsii.Kernel.get(this, "customInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customJson = software.amazon.jsii.Kernel.get(this, "customJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "customSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customSetupRecipes = software.amazon.jsii.Kernel.get(this, "customSetupRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customShutdownRecipes = software.amazon.jsii.Kernel.get(this, "customShutdownRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customUndeployRecipes = software.amazon.jsii.Kernel.get(this, "customUndeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.drainElbOnShutdown = software.amazon.jsii.Kernel.get(this, "drainElbOnShutdown", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ebsVolume = software.amazon.jsii.Kernel.get(this, "ebsVolume", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksJavaAppLayerEbsVolume.class)));
            this.elasticLoadBalancer = software.amazon.jsii.Kernel.get(this, "elasticLoadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.installUpdatesOnBoot = software.amazon.jsii.Kernel.get(this, "installUpdatesOnBoot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.instanceShutdownTimeout = software.amazon.jsii.Kernel.get(this, "instanceShutdownTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.jvmOptions = software.amazon.jsii.Kernel.get(this, "jvmOptions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jvmType = software.amazon.jsii.Kernel.get(this, "jvmType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jvmVersion = software.amazon.jsii.Kernel.get(this, "jvmVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.systemPackages = software.amazon.jsii.Kernel.get(this, "systemPackages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.useEbsOptimizedInstances = software.amazon.jsii.Kernel.get(this, "useEbsOptimizedInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String stackId, final java.lang.String appServer, final java.lang.String appServerVersion, final java.lang.Boolean autoAssignElasticIps, final java.lang.Boolean autoAssignPublicIps, final java.lang.Boolean autoHealing, final java.util.List<java.lang.String> customConfigureRecipes, final java.util.List<java.lang.String> customDeployRecipes, final java.lang.String customInstanceProfileArn, final java.lang.String customJson, final java.util.List<java.lang.String> customSecurityGroupIds, final java.util.List<java.lang.String> customSetupRecipes, final java.util.List<java.lang.String> customShutdownRecipes, final java.util.List<java.lang.String> customUndeployRecipes, final java.lang.Boolean drainElbOnShutdown, final java.util.List<? extends imports.aws.OpsworksJavaAppLayerEbsVolume> ebsVolume, final java.lang.String elasticLoadBalancer, final java.lang.Boolean installUpdatesOnBoot, final java.lang.Number instanceShutdownTimeout, final java.lang.String jvmOptions, final java.lang.String jvmType, final java.lang.String jvmVersion, final java.lang.String name, final java.util.List<java.lang.String> systemPackages, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean useEbsOptimizedInstances, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.stackId = java.util.Objects.requireNonNull(stackId, "stackId is required");
            this.appServer = appServer;
            this.appServerVersion = appServerVersion;
            this.autoAssignElasticIps = autoAssignElasticIps;
            this.autoAssignPublicIps = autoAssignPublicIps;
            this.autoHealing = autoHealing;
            this.customConfigureRecipes = customConfigureRecipes;
            this.customDeployRecipes = customDeployRecipes;
            this.customInstanceProfileArn = customInstanceProfileArn;
            this.customJson = customJson;
            this.customSecurityGroupIds = customSecurityGroupIds;
            this.customSetupRecipes = customSetupRecipes;
            this.customShutdownRecipes = customShutdownRecipes;
            this.customUndeployRecipes = customUndeployRecipes;
            this.drainElbOnShutdown = drainElbOnShutdown;
            this.ebsVolume = (java.util.List<imports.aws.OpsworksJavaAppLayerEbsVolume>)ebsVolume;
            this.elasticLoadBalancer = elasticLoadBalancer;
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            this.jvmOptions = jvmOptions;
            this.jvmType = jvmType;
            this.jvmVersion = jvmVersion;
            this.name = name;
            this.systemPackages = systemPackages;
            this.tags = tags;
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getStackId() {
            return this.stackId;
        }

        @Override
        public final java.lang.String getAppServer() {
            return this.appServer;
        }

        @Override
        public final java.lang.String getAppServerVersion() {
            return this.appServerVersion;
        }

        @Override
        public final java.lang.Boolean getAutoAssignElasticIps() {
            return this.autoAssignElasticIps;
        }

        @Override
        public final java.lang.Boolean getAutoAssignPublicIps() {
            return this.autoAssignPublicIps;
        }

        @Override
        public final java.lang.Boolean getAutoHealing() {
            return this.autoHealing;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomConfigureRecipes() {
            return this.customConfigureRecipes;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomDeployRecipes() {
            return this.customDeployRecipes;
        }

        @Override
        public final java.lang.String getCustomInstanceProfileArn() {
            return this.customInstanceProfileArn;
        }

        @Override
        public final java.lang.String getCustomJson() {
            return this.customJson;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomSecurityGroupIds() {
            return this.customSecurityGroupIds;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomSetupRecipes() {
            return this.customSetupRecipes;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomShutdownRecipes() {
            return this.customShutdownRecipes;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomUndeployRecipes() {
            return this.customUndeployRecipes;
        }

        @Override
        public final java.lang.Boolean getDrainElbOnShutdown() {
            return this.drainElbOnShutdown;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksJavaAppLayerEbsVolume> getEbsVolume() {
            return this.ebsVolume;
        }

        @Override
        public final java.lang.String getElasticLoadBalancer() {
            return this.elasticLoadBalancer;
        }

        @Override
        public final java.lang.Boolean getInstallUpdatesOnBoot() {
            return this.installUpdatesOnBoot;
        }

        @Override
        public final java.lang.Number getInstanceShutdownTimeout() {
            return this.instanceShutdownTimeout;
        }

        @Override
        public final java.lang.String getJvmOptions() {
            return this.jvmOptions;
        }

        @Override
        public final java.lang.String getJvmType() {
            return this.jvmType;
        }

        @Override
        public final java.lang.String getJvmVersion() {
            return this.jvmVersion;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getSystemPackages() {
            return this.systemPackages;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Boolean getUseEbsOptimizedInstances() {
            return this.useEbsOptimizedInstances;
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

            data.set("stackId", om.valueToTree(this.getStackId()));
            if (this.getAppServer() != null) {
                data.set("appServer", om.valueToTree(this.getAppServer()));
            }
            if (this.getAppServerVersion() != null) {
                data.set("appServerVersion", om.valueToTree(this.getAppServerVersion()));
            }
            if (this.getAutoAssignElasticIps() != null) {
                data.set("autoAssignElasticIps", om.valueToTree(this.getAutoAssignElasticIps()));
            }
            if (this.getAutoAssignPublicIps() != null) {
                data.set("autoAssignPublicIps", om.valueToTree(this.getAutoAssignPublicIps()));
            }
            if (this.getAutoHealing() != null) {
                data.set("autoHealing", om.valueToTree(this.getAutoHealing()));
            }
            if (this.getCustomConfigureRecipes() != null) {
                data.set("customConfigureRecipes", om.valueToTree(this.getCustomConfigureRecipes()));
            }
            if (this.getCustomDeployRecipes() != null) {
                data.set("customDeployRecipes", om.valueToTree(this.getCustomDeployRecipes()));
            }
            if (this.getCustomInstanceProfileArn() != null) {
                data.set("customInstanceProfileArn", om.valueToTree(this.getCustomInstanceProfileArn()));
            }
            if (this.getCustomJson() != null) {
                data.set("customJson", om.valueToTree(this.getCustomJson()));
            }
            if (this.getCustomSecurityGroupIds() != null) {
                data.set("customSecurityGroupIds", om.valueToTree(this.getCustomSecurityGroupIds()));
            }
            if (this.getCustomSetupRecipes() != null) {
                data.set("customSetupRecipes", om.valueToTree(this.getCustomSetupRecipes()));
            }
            if (this.getCustomShutdownRecipes() != null) {
                data.set("customShutdownRecipes", om.valueToTree(this.getCustomShutdownRecipes()));
            }
            if (this.getCustomUndeployRecipes() != null) {
                data.set("customUndeployRecipes", om.valueToTree(this.getCustomUndeployRecipes()));
            }
            if (this.getDrainElbOnShutdown() != null) {
                data.set("drainElbOnShutdown", om.valueToTree(this.getDrainElbOnShutdown()));
            }
            if (this.getEbsVolume() != null) {
                data.set("ebsVolume", om.valueToTree(this.getEbsVolume()));
            }
            if (this.getElasticLoadBalancer() != null) {
                data.set("elasticLoadBalancer", om.valueToTree(this.getElasticLoadBalancer()));
            }
            if (this.getInstallUpdatesOnBoot() != null) {
                data.set("installUpdatesOnBoot", om.valueToTree(this.getInstallUpdatesOnBoot()));
            }
            if (this.getInstanceShutdownTimeout() != null) {
                data.set("instanceShutdownTimeout", om.valueToTree(this.getInstanceShutdownTimeout()));
            }
            if (this.getJvmOptions() != null) {
                data.set("jvmOptions", om.valueToTree(this.getJvmOptions()));
            }
            if (this.getJvmType() != null) {
                data.set("jvmType", om.valueToTree(this.getJvmType()));
            }
            if (this.getJvmVersion() != null) {
                data.set("jvmVersion", om.valueToTree(this.getJvmVersion()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getSystemPackages() != null) {
                data.set("systemPackages", om.valueToTree(this.getSystemPackages()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUseEbsOptimizedInstances() != null) {
                data.set("useEbsOptimizedInstances", om.valueToTree(this.getUseEbsOptimizedInstances()));
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
            struct.set("fqn", om.valueToTree("aws.OpsworksJavaAppLayerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksJavaAppLayerConfig.Jsii$Proxy that = (OpsworksJavaAppLayerConfig.Jsii$Proxy) o;

            if (!stackId.equals(that.stackId)) return false;
            if (this.appServer != null ? !this.appServer.equals(that.appServer) : that.appServer != null) return false;
            if (this.appServerVersion != null ? !this.appServerVersion.equals(that.appServerVersion) : that.appServerVersion != null) return false;
            if (this.autoAssignElasticIps != null ? !this.autoAssignElasticIps.equals(that.autoAssignElasticIps) : that.autoAssignElasticIps != null) return false;
            if (this.autoAssignPublicIps != null ? !this.autoAssignPublicIps.equals(that.autoAssignPublicIps) : that.autoAssignPublicIps != null) return false;
            if (this.autoHealing != null ? !this.autoHealing.equals(that.autoHealing) : that.autoHealing != null) return false;
            if (this.customConfigureRecipes != null ? !this.customConfigureRecipes.equals(that.customConfigureRecipes) : that.customConfigureRecipes != null) return false;
            if (this.customDeployRecipes != null ? !this.customDeployRecipes.equals(that.customDeployRecipes) : that.customDeployRecipes != null) return false;
            if (this.customInstanceProfileArn != null ? !this.customInstanceProfileArn.equals(that.customInstanceProfileArn) : that.customInstanceProfileArn != null) return false;
            if (this.customJson != null ? !this.customJson.equals(that.customJson) : that.customJson != null) return false;
            if (this.customSecurityGroupIds != null ? !this.customSecurityGroupIds.equals(that.customSecurityGroupIds) : that.customSecurityGroupIds != null) return false;
            if (this.customSetupRecipes != null ? !this.customSetupRecipes.equals(that.customSetupRecipes) : that.customSetupRecipes != null) return false;
            if (this.customShutdownRecipes != null ? !this.customShutdownRecipes.equals(that.customShutdownRecipes) : that.customShutdownRecipes != null) return false;
            if (this.customUndeployRecipes != null ? !this.customUndeployRecipes.equals(that.customUndeployRecipes) : that.customUndeployRecipes != null) return false;
            if (this.drainElbOnShutdown != null ? !this.drainElbOnShutdown.equals(that.drainElbOnShutdown) : that.drainElbOnShutdown != null) return false;
            if (this.ebsVolume != null ? !this.ebsVolume.equals(that.ebsVolume) : that.ebsVolume != null) return false;
            if (this.elasticLoadBalancer != null ? !this.elasticLoadBalancer.equals(that.elasticLoadBalancer) : that.elasticLoadBalancer != null) return false;
            if (this.installUpdatesOnBoot != null ? !this.installUpdatesOnBoot.equals(that.installUpdatesOnBoot) : that.installUpdatesOnBoot != null) return false;
            if (this.instanceShutdownTimeout != null ? !this.instanceShutdownTimeout.equals(that.instanceShutdownTimeout) : that.instanceShutdownTimeout != null) return false;
            if (this.jvmOptions != null ? !this.jvmOptions.equals(that.jvmOptions) : that.jvmOptions != null) return false;
            if (this.jvmType != null ? !this.jvmType.equals(that.jvmType) : that.jvmType != null) return false;
            if (this.jvmVersion != null ? !this.jvmVersion.equals(that.jvmVersion) : that.jvmVersion != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.systemPackages != null ? !this.systemPackages.equals(that.systemPackages) : that.systemPackages != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.useEbsOptimizedInstances != null ? !this.useEbsOptimizedInstances.equals(that.useEbsOptimizedInstances) : that.useEbsOptimizedInstances != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.stackId.hashCode();
            result = 31 * result + (this.appServer != null ? this.appServer.hashCode() : 0);
            result = 31 * result + (this.appServerVersion != null ? this.appServerVersion.hashCode() : 0);
            result = 31 * result + (this.autoAssignElasticIps != null ? this.autoAssignElasticIps.hashCode() : 0);
            result = 31 * result + (this.autoAssignPublicIps != null ? this.autoAssignPublicIps.hashCode() : 0);
            result = 31 * result + (this.autoHealing != null ? this.autoHealing.hashCode() : 0);
            result = 31 * result + (this.customConfigureRecipes != null ? this.customConfigureRecipes.hashCode() : 0);
            result = 31 * result + (this.customDeployRecipes != null ? this.customDeployRecipes.hashCode() : 0);
            result = 31 * result + (this.customInstanceProfileArn != null ? this.customInstanceProfileArn.hashCode() : 0);
            result = 31 * result + (this.customJson != null ? this.customJson.hashCode() : 0);
            result = 31 * result + (this.customSecurityGroupIds != null ? this.customSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.customSetupRecipes != null ? this.customSetupRecipes.hashCode() : 0);
            result = 31 * result + (this.customShutdownRecipes != null ? this.customShutdownRecipes.hashCode() : 0);
            result = 31 * result + (this.customUndeployRecipes != null ? this.customUndeployRecipes.hashCode() : 0);
            result = 31 * result + (this.drainElbOnShutdown != null ? this.drainElbOnShutdown.hashCode() : 0);
            result = 31 * result + (this.ebsVolume != null ? this.ebsVolume.hashCode() : 0);
            result = 31 * result + (this.elasticLoadBalancer != null ? this.elasticLoadBalancer.hashCode() : 0);
            result = 31 * result + (this.installUpdatesOnBoot != null ? this.installUpdatesOnBoot.hashCode() : 0);
            result = 31 * result + (this.instanceShutdownTimeout != null ? this.instanceShutdownTimeout.hashCode() : 0);
            result = 31 * result + (this.jvmOptions != null ? this.jvmOptions.hashCode() : 0);
            result = 31 * result + (this.jvmType != null ? this.jvmType.hashCode() : 0);
            result = 31 * result + (this.jvmVersion != null ? this.jvmVersion.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.systemPackages != null ? this.systemPackages.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.useEbsOptimizedInstances != null ? this.useEbsOptimizedInstances.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
