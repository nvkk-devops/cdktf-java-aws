package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.767Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksRailsAppLayerConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksRailsAppLayerConfig.Jsii$Proxy.class)
public interface OpsworksRailsAppLayerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getStackId();

    default @org.jetbrains.annotations.Nullable java.lang.String getAppServer() {
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

    default @org.jetbrains.annotations.Nullable java.lang.String getBundlerVersion() {
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
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksRailsAppLayerEbsVolume> getEbsVolume() {
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

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getManageBundler() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPassengerVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRubygemsVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRubyVersion() {
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
     * @return a {@link Builder} of {@link OpsworksRailsAppLayerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksRailsAppLayerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksRailsAppLayerConfig> {
        private java.lang.String stackId;
        private java.lang.String appServer;
        private java.lang.Boolean autoAssignElasticIps;
        private java.lang.Boolean autoAssignPublicIps;
        private java.lang.Boolean autoHealing;
        private java.lang.String bundlerVersion;
        private java.util.List<java.lang.String> customConfigureRecipes;
        private java.util.List<java.lang.String> customDeployRecipes;
        private java.lang.String customInstanceProfileArn;
        private java.lang.String customJson;
        private java.util.List<java.lang.String> customSecurityGroupIds;
        private java.util.List<java.lang.String> customSetupRecipes;
        private java.util.List<java.lang.String> customShutdownRecipes;
        private java.util.List<java.lang.String> customUndeployRecipes;
        private java.lang.Boolean drainElbOnShutdown;
        private java.util.List<imports.aws.OpsworksRailsAppLayerEbsVolume> ebsVolume;
        private java.lang.String elasticLoadBalancer;
        private java.lang.Boolean installUpdatesOnBoot;
        private java.lang.Number instanceShutdownTimeout;
        private java.lang.Boolean manageBundler;
        private java.lang.String name;
        private java.lang.String passengerVersion;
        private java.lang.String rubygemsVersion;
        private java.lang.String rubyVersion;
        private java.util.List<java.lang.String> systemPackages;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean useEbsOptimizedInstances;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getStackId}
         * @param stackId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stackId(java.lang.String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getAppServer}
         * @param appServer the value to be set.
         * @return {@code this}
         */
        public Builder appServer(java.lang.String appServer) {
            this.appServer = appServer;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getAutoAssignElasticIps}
         * @param autoAssignElasticIps the value to be set.
         * @return {@code this}
         */
        public Builder autoAssignElasticIps(java.lang.Boolean autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getAutoAssignPublicIps}
         * @param autoAssignPublicIps the value to be set.
         * @return {@code this}
         */
        public Builder autoAssignPublicIps(java.lang.Boolean autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getAutoHealing}
         * @param autoHealing the value to be set.
         * @return {@code this}
         */
        public Builder autoHealing(java.lang.Boolean autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getBundlerVersion}
         * @param bundlerVersion the value to be set.
         * @return {@code this}
         */
        public Builder bundlerVersion(java.lang.String bundlerVersion) {
            this.bundlerVersion = bundlerVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomConfigureRecipes}
         * @param customConfigureRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customConfigureRecipes(java.util.List<java.lang.String> customConfigureRecipes) {
            this.customConfigureRecipes = customConfigureRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomDeployRecipes}
         * @param customDeployRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customDeployRecipes(java.util.List<java.lang.String> customDeployRecipes) {
            this.customDeployRecipes = customDeployRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomInstanceProfileArn}
         * @param customInstanceProfileArn the value to be set.
         * @return {@code this}
         */
        public Builder customInstanceProfileArn(java.lang.String customInstanceProfileArn) {
            this.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomJson}
         * @param customJson the value to be set.
         * @return {@code this}
         */
        public Builder customJson(java.lang.String customJson) {
            this.customJson = customJson;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomSecurityGroupIds}
         * @param customSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder customSecurityGroupIds(java.util.List<java.lang.String> customSecurityGroupIds) {
            this.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomSetupRecipes}
         * @param customSetupRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customSetupRecipes(java.util.List<java.lang.String> customSetupRecipes) {
            this.customSetupRecipes = customSetupRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomShutdownRecipes}
         * @param customShutdownRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customShutdownRecipes(java.util.List<java.lang.String> customShutdownRecipes) {
            this.customShutdownRecipes = customShutdownRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCustomUndeployRecipes}
         * @param customUndeployRecipes the value to be set.
         * @return {@code this}
         */
        public Builder customUndeployRecipes(java.util.List<java.lang.String> customUndeployRecipes) {
            this.customUndeployRecipes = customUndeployRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getDrainElbOnShutdown}
         * @param drainElbOnShutdown the value to be set.
         * @return {@code this}
         */
        public Builder drainElbOnShutdown(java.lang.Boolean drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getEbsVolume}
         * @param ebsVolume ebs_volume block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsVolume(java.util.List<? extends imports.aws.OpsworksRailsAppLayerEbsVolume> ebsVolume) {
            this.ebsVolume = (java.util.List<imports.aws.OpsworksRailsAppLayerEbsVolume>)ebsVolume;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getElasticLoadBalancer}
         * @param elasticLoadBalancer the value to be set.
         * @return {@code this}
         */
        public Builder elasticLoadBalancer(java.lang.String elasticLoadBalancer) {
            this.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getInstallUpdatesOnBoot}
         * @param installUpdatesOnBoot the value to be set.
         * @return {@code this}
         */
        public Builder installUpdatesOnBoot(java.lang.Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getInstanceShutdownTimeout}
         * @param instanceShutdownTimeout the value to be set.
         * @return {@code this}
         */
        public Builder instanceShutdownTimeout(java.lang.Number instanceShutdownTimeout) {
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getManageBundler}
         * @param manageBundler the value to be set.
         * @return {@code this}
         */
        public Builder manageBundler(java.lang.Boolean manageBundler) {
            this.manageBundler = manageBundler;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getPassengerVersion}
         * @param passengerVersion the value to be set.
         * @return {@code this}
         */
        public Builder passengerVersion(java.lang.String passengerVersion) {
            this.passengerVersion = passengerVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getRubygemsVersion}
         * @param rubygemsVersion the value to be set.
         * @return {@code this}
         */
        public Builder rubygemsVersion(java.lang.String rubygemsVersion) {
            this.rubygemsVersion = rubygemsVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getRubyVersion}
         * @param rubyVersion the value to be set.
         * @return {@code this}
         */
        public Builder rubyVersion(java.lang.String rubyVersion) {
            this.rubyVersion = rubyVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getSystemPackages}
         * @param systemPackages the value to be set.
         * @return {@code this}
         */
        public Builder systemPackages(java.util.List<java.lang.String> systemPackages) {
            this.systemPackages = systemPackages;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getUseEbsOptimizedInstances}
         * @param useEbsOptimizedInstances the value to be set.
         * @return {@code this}
         */
        public Builder useEbsOptimizedInstances(java.lang.Boolean useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRailsAppLayerConfig#getProvider}
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
         * @return a new instance of {@link OpsworksRailsAppLayerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksRailsAppLayerConfig build() {
            return new Jsii$Proxy(stackId, appServer, autoAssignElasticIps, autoAssignPublicIps, autoHealing, bundlerVersion, customConfigureRecipes, customDeployRecipes, customInstanceProfileArn, customJson, customSecurityGroupIds, customSetupRecipes, customShutdownRecipes, customUndeployRecipes, drainElbOnShutdown, ebsVolume, elasticLoadBalancer, installUpdatesOnBoot, instanceShutdownTimeout, manageBundler, name, passengerVersion, rubygemsVersion, rubyVersion, systemPackages, tags, useEbsOptimizedInstances, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OpsworksRailsAppLayerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksRailsAppLayerConfig {
        private final java.lang.String stackId;
        private final java.lang.String appServer;
        private final java.lang.Boolean autoAssignElasticIps;
        private final java.lang.Boolean autoAssignPublicIps;
        private final java.lang.Boolean autoHealing;
        private final java.lang.String bundlerVersion;
        private final java.util.List<java.lang.String> customConfigureRecipes;
        private final java.util.List<java.lang.String> customDeployRecipes;
        private final java.lang.String customInstanceProfileArn;
        private final java.lang.String customJson;
        private final java.util.List<java.lang.String> customSecurityGroupIds;
        private final java.util.List<java.lang.String> customSetupRecipes;
        private final java.util.List<java.lang.String> customShutdownRecipes;
        private final java.util.List<java.lang.String> customUndeployRecipes;
        private final java.lang.Boolean drainElbOnShutdown;
        private final java.util.List<imports.aws.OpsworksRailsAppLayerEbsVolume> ebsVolume;
        private final java.lang.String elasticLoadBalancer;
        private final java.lang.Boolean installUpdatesOnBoot;
        private final java.lang.Number instanceShutdownTimeout;
        private final java.lang.Boolean manageBundler;
        private final java.lang.String name;
        private final java.lang.String passengerVersion;
        private final java.lang.String rubygemsVersion;
        private final java.lang.String rubyVersion;
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
            this.autoAssignElasticIps = software.amazon.jsii.Kernel.get(this, "autoAssignElasticIps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoAssignPublicIps = software.amazon.jsii.Kernel.get(this, "autoAssignPublicIps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoHealing = software.amazon.jsii.Kernel.get(this, "autoHealing", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.bundlerVersion = software.amazon.jsii.Kernel.get(this, "bundlerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customConfigureRecipes = software.amazon.jsii.Kernel.get(this, "customConfigureRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customDeployRecipes = software.amazon.jsii.Kernel.get(this, "customDeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customInstanceProfileArn = software.amazon.jsii.Kernel.get(this, "customInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customJson = software.amazon.jsii.Kernel.get(this, "customJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "customSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customSetupRecipes = software.amazon.jsii.Kernel.get(this, "customSetupRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customShutdownRecipes = software.amazon.jsii.Kernel.get(this, "customShutdownRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customUndeployRecipes = software.amazon.jsii.Kernel.get(this, "customUndeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.drainElbOnShutdown = software.amazon.jsii.Kernel.get(this, "drainElbOnShutdown", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ebsVolume = software.amazon.jsii.Kernel.get(this, "ebsVolume", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksRailsAppLayerEbsVolume.class)));
            this.elasticLoadBalancer = software.amazon.jsii.Kernel.get(this, "elasticLoadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.installUpdatesOnBoot = software.amazon.jsii.Kernel.get(this, "installUpdatesOnBoot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.instanceShutdownTimeout = software.amazon.jsii.Kernel.get(this, "instanceShutdownTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.manageBundler = software.amazon.jsii.Kernel.get(this, "manageBundler", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.passengerVersion = software.amazon.jsii.Kernel.get(this, "passengerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rubygemsVersion = software.amazon.jsii.Kernel.get(this, "rubygemsVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rubyVersion = software.amazon.jsii.Kernel.get(this, "rubyVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String stackId, final java.lang.String appServer, final java.lang.Boolean autoAssignElasticIps, final java.lang.Boolean autoAssignPublicIps, final java.lang.Boolean autoHealing, final java.lang.String bundlerVersion, final java.util.List<java.lang.String> customConfigureRecipes, final java.util.List<java.lang.String> customDeployRecipes, final java.lang.String customInstanceProfileArn, final java.lang.String customJson, final java.util.List<java.lang.String> customSecurityGroupIds, final java.util.List<java.lang.String> customSetupRecipes, final java.util.List<java.lang.String> customShutdownRecipes, final java.util.List<java.lang.String> customUndeployRecipes, final java.lang.Boolean drainElbOnShutdown, final java.util.List<? extends imports.aws.OpsworksRailsAppLayerEbsVolume> ebsVolume, final java.lang.String elasticLoadBalancer, final java.lang.Boolean installUpdatesOnBoot, final java.lang.Number instanceShutdownTimeout, final java.lang.Boolean manageBundler, final java.lang.String name, final java.lang.String passengerVersion, final java.lang.String rubygemsVersion, final java.lang.String rubyVersion, final java.util.List<java.lang.String> systemPackages, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean useEbsOptimizedInstances, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.stackId = java.util.Objects.requireNonNull(stackId, "stackId is required");
            this.appServer = appServer;
            this.autoAssignElasticIps = autoAssignElasticIps;
            this.autoAssignPublicIps = autoAssignPublicIps;
            this.autoHealing = autoHealing;
            this.bundlerVersion = bundlerVersion;
            this.customConfigureRecipes = customConfigureRecipes;
            this.customDeployRecipes = customDeployRecipes;
            this.customInstanceProfileArn = customInstanceProfileArn;
            this.customJson = customJson;
            this.customSecurityGroupIds = customSecurityGroupIds;
            this.customSetupRecipes = customSetupRecipes;
            this.customShutdownRecipes = customShutdownRecipes;
            this.customUndeployRecipes = customUndeployRecipes;
            this.drainElbOnShutdown = drainElbOnShutdown;
            this.ebsVolume = (java.util.List<imports.aws.OpsworksRailsAppLayerEbsVolume>)ebsVolume;
            this.elasticLoadBalancer = elasticLoadBalancer;
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            this.manageBundler = manageBundler;
            this.name = name;
            this.passengerVersion = passengerVersion;
            this.rubygemsVersion = rubygemsVersion;
            this.rubyVersion = rubyVersion;
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
        public final java.lang.String getBundlerVersion() {
            return this.bundlerVersion;
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
        public final java.util.List<imports.aws.OpsworksRailsAppLayerEbsVolume> getEbsVolume() {
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
        public final java.lang.Boolean getManageBundler() {
            return this.manageBundler;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getPassengerVersion() {
            return this.passengerVersion;
        }

        @Override
        public final java.lang.String getRubygemsVersion() {
            return this.rubygemsVersion;
        }

        @Override
        public final java.lang.String getRubyVersion() {
            return this.rubyVersion;
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
            if (this.getAutoAssignElasticIps() != null) {
                data.set("autoAssignElasticIps", om.valueToTree(this.getAutoAssignElasticIps()));
            }
            if (this.getAutoAssignPublicIps() != null) {
                data.set("autoAssignPublicIps", om.valueToTree(this.getAutoAssignPublicIps()));
            }
            if (this.getAutoHealing() != null) {
                data.set("autoHealing", om.valueToTree(this.getAutoHealing()));
            }
            if (this.getBundlerVersion() != null) {
                data.set("bundlerVersion", om.valueToTree(this.getBundlerVersion()));
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
            if (this.getManageBundler() != null) {
                data.set("manageBundler", om.valueToTree(this.getManageBundler()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getPassengerVersion() != null) {
                data.set("passengerVersion", om.valueToTree(this.getPassengerVersion()));
            }
            if (this.getRubygemsVersion() != null) {
                data.set("rubygemsVersion", om.valueToTree(this.getRubygemsVersion()));
            }
            if (this.getRubyVersion() != null) {
                data.set("rubyVersion", om.valueToTree(this.getRubyVersion()));
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
            struct.set("fqn", om.valueToTree("aws.OpsworksRailsAppLayerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksRailsAppLayerConfig.Jsii$Proxy that = (OpsworksRailsAppLayerConfig.Jsii$Proxy) o;

            if (!stackId.equals(that.stackId)) return false;
            if (this.appServer != null ? !this.appServer.equals(that.appServer) : that.appServer != null) return false;
            if (this.autoAssignElasticIps != null ? !this.autoAssignElasticIps.equals(that.autoAssignElasticIps) : that.autoAssignElasticIps != null) return false;
            if (this.autoAssignPublicIps != null ? !this.autoAssignPublicIps.equals(that.autoAssignPublicIps) : that.autoAssignPublicIps != null) return false;
            if (this.autoHealing != null ? !this.autoHealing.equals(that.autoHealing) : that.autoHealing != null) return false;
            if (this.bundlerVersion != null ? !this.bundlerVersion.equals(that.bundlerVersion) : that.bundlerVersion != null) return false;
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
            if (this.manageBundler != null ? !this.manageBundler.equals(that.manageBundler) : that.manageBundler != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.passengerVersion != null ? !this.passengerVersion.equals(that.passengerVersion) : that.passengerVersion != null) return false;
            if (this.rubygemsVersion != null ? !this.rubygemsVersion.equals(that.rubygemsVersion) : that.rubygemsVersion != null) return false;
            if (this.rubyVersion != null ? !this.rubyVersion.equals(that.rubyVersion) : that.rubyVersion != null) return false;
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
            result = 31 * result + (this.autoAssignElasticIps != null ? this.autoAssignElasticIps.hashCode() : 0);
            result = 31 * result + (this.autoAssignPublicIps != null ? this.autoAssignPublicIps.hashCode() : 0);
            result = 31 * result + (this.autoHealing != null ? this.autoHealing.hashCode() : 0);
            result = 31 * result + (this.bundlerVersion != null ? this.bundlerVersion.hashCode() : 0);
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
            result = 31 * result + (this.manageBundler != null ? this.manageBundler.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.passengerVersion != null ? this.passengerVersion.hashCode() : 0);
            result = 31 * result + (this.rubygemsVersion != null ? this.rubygemsVersion.hashCode() : 0);
            result = 31 * result + (this.rubyVersion != null ? this.rubyVersion.hashCode() : 0);
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
