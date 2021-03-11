package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.744Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksHaproxyLayer")
public class OpsworksHaproxyLayer extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksHaproxyLayer(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksHaproxyLayer(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public OpsworksHaproxyLayer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.OpsworksHaproxyLayerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAutoAssignElasticIps() {
        software.amazon.jsii.Kernel.call(this, "resetAutoAssignElasticIps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoAssignPublicIps() {
        software.amazon.jsii.Kernel.call(this, "resetAutoAssignPublicIps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoHealing() {
        software.amazon.jsii.Kernel.call(this, "resetAutoHealing", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomConfigureRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomConfigureRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomDeployRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomDeployRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomInstanceProfileArn() {
        software.amazon.jsii.Kernel.call(this, "resetCustomInstanceProfileArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomJson() {
        software.amazon.jsii.Kernel.call(this, "resetCustomJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomSecurityGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetCustomSecurityGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomSetupRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomSetupRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomShutdownRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomShutdownRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomUndeployRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomUndeployRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDrainElbOnShutdown() {
        software.amazon.jsii.Kernel.call(this, "resetDrainElbOnShutdown", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsVolume() {
        software.amazon.jsii.Kernel.call(this, "resetEbsVolume", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticLoadBalancer() {
        software.amazon.jsii.Kernel.call(this, "resetElasticLoadBalancer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthcheckMethod() {
        software.amazon.jsii.Kernel.call(this, "resetHealthcheckMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthcheckUrl() {
        software.amazon.jsii.Kernel.call(this, "resetHealthcheckUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstallUpdatesOnBoot() {
        software.amazon.jsii.Kernel.call(this, "resetInstallUpdatesOnBoot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceShutdownTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceShutdownTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetStatsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatsUrl() {
        software.amazon.jsii.Kernel.call(this, "resetStatsUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatsUser() {
        software.amazon.jsii.Kernel.call(this, "resetStatsUser", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSystemPackages() {
        software.amazon.jsii.Kernel.call(this, "resetSystemPackages", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseEbsOptimizedInstances() {
        software.amazon.jsii.Kernel.call(this, "resetUseEbsOptimizedInstances", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackIdInput() {
        return software.amazon.jsii.Kernel.get(this, "stackIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatsPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "statsPasswordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoAssignElasticIpsInput() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignElasticIpsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoAssignPublicIpsInput() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignPublicIpsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoHealingInput() {
        return software.amazon.jsii.Kernel.get(this, "autoHealingInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomConfigureRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customConfigureRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomDeployRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customDeployRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomInstanceProfileArnInput() {
        return software.amazon.jsii.Kernel.get(this, "customInstanceProfileArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "customJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSecurityGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customSecurityGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSetupRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customSetupRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomShutdownRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customShutdownRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomUndeployRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customUndeployRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDrainElbOnShutdownInput() {
        return software.amazon.jsii.Kernel.get(this, "drainElbOnShutdownInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksHaproxyLayerEbsVolume> getEbsVolumeInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksHaproxyLayerEbsVolume>)(software.amazon.jsii.Kernel.get(this, "ebsVolumeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksHaproxyLayerEbsVolume.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getElasticLoadBalancerInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticLoadBalancerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthcheckMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "healthcheckMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthcheckUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "healthcheckUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInstallUpdatesOnBootInput() {
        return software.amazon.jsii.Kernel.get(this, "installUpdatesOnBootInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInstanceShutdownTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceShutdownTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getStatsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "statsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatsUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "statsUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatsUserInput() {
        return software.amazon.jsii.Kernel.get(this, "statsUserInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSystemPackagesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "systemPackagesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUseEbsOptimizedInstancesInput() {
        return software.amazon.jsii.Kernel.get(this, "useEbsOptimizedInstancesInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAutoAssignElasticIps() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignElasticIps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAutoAssignElasticIps(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoAssignElasticIps", java.util.Objects.requireNonNull(value, "autoAssignElasticIps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAutoAssignPublicIps() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignPublicIps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAutoAssignPublicIps(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoAssignPublicIps", java.util.Objects.requireNonNull(value, "autoAssignPublicIps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAutoHealing() {
        return software.amazon.jsii.Kernel.get(this, "autoHealing", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAutoHealing(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoHealing", java.util.Objects.requireNonNull(value, "autoHealing is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomConfigureRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customConfigureRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomConfigureRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customConfigureRecipes", java.util.Objects.requireNonNull(value, "customConfigureRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomDeployRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customDeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomDeployRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customDeployRecipes", java.util.Objects.requireNonNull(value, "customDeployRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomInstanceProfileArn() {
        return software.amazon.jsii.Kernel.get(this, "customInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomInstanceProfileArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customInstanceProfileArn", java.util.Objects.requireNonNull(value, "customInstanceProfileArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomJson() {
        return software.amazon.jsii.Kernel.get(this, "customJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customJson", java.util.Objects.requireNonNull(value, "customJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomSecurityGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customSecurityGroupIds", java.util.Objects.requireNonNull(value, "customSecurityGroupIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomSetupRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customSetupRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomSetupRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customSetupRecipes", java.util.Objects.requireNonNull(value, "customSetupRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomShutdownRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customShutdownRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomShutdownRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customShutdownRecipes", java.util.Objects.requireNonNull(value, "customShutdownRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomUndeployRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customUndeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomUndeployRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customUndeployRecipes", java.util.Objects.requireNonNull(value, "customUndeployRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getDrainElbOnShutdown() {
        return software.amazon.jsii.Kernel.get(this, "drainElbOnShutdown", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDrainElbOnShutdown(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "drainElbOnShutdown", java.util.Objects.requireNonNull(value, "drainElbOnShutdown is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksHaproxyLayerEbsVolume> getEbsVolume() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ebsVolume", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksHaproxyLayerEbsVolume.class))));
    }

    public void setEbsVolume(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksHaproxyLayerEbsVolume> value) {
        software.amazon.jsii.Kernel.set(this, "ebsVolume", java.util.Objects.requireNonNull(value, "ebsVolume is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getElasticLoadBalancer() {
        return software.amazon.jsii.Kernel.get(this, "elasticLoadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setElasticLoadBalancer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "elasticLoadBalancer", java.util.Objects.requireNonNull(value, "elasticLoadBalancer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthcheckMethod() {
        return software.amazon.jsii.Kernel.get(this, "healthcheckMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthcheckMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthcheckMethod", java.util.Objects.requireNonNull(value, "healthcheckMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthcheckUrl() {
        return software.amazon.jsii.Kernel.get(this, "healthcheckUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthcheckUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthcheckUrl", java.util.Objects.requireNonNull(value, "healthcheckUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getInstallUpdatesOnBoot() {
        return software.amazon.jsii.Kernel.get(this, "installUpdatesOnBoot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setInstallUpdatesOnBoot(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "installUpdatesOnBoot", java.util.Objects.requireNonNull(value, "installUpdatesOnBoot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInstanceShutdownTimeout() {
        return software.amazon.jsii.Kernel.get(this, "instanceShutdownTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInstanceShutdownTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "instanceShutdownTimeout", java.util.Objects.requireNonNull(value, "instanceShutdownTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackId() {
        return software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStackId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stackId", java.util.Objects.requireNonNull(value, "stackId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getStatsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "statsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setStatsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "statsEnabled", java.util.Objects.requireNonNull(value, "statsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatsPassword() {
        return software.amazon.jsii.Kernel.get(this, "statsPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatsPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "statsPassword", java.util.Objects.requireNonNull(value, "statsPassword is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatsUrl() {
        return software.amazon.jsii.Kernel.get(this, "statsUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatsUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "statsUrl", java.util.Objects.requireNonNull(value, "statsUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatsUser() {
        return software.amazon.jsii.Kernel.get(this, "statsUser", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatsUser(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "statsUser", java.util.Objects.requireNonNull(value, "statsUser is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSystemPackages() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "systemPackages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSystemPackages(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "systemPackages", java.util.Objects.requireNonNull(value, "systemPackages is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getUseEbsOptimizedInstances() {
        return software.amazon.jsii.Kernel.get(this, "useEbsOptimizedInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUseEbsOptimizedInstances(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useEbsOptimizedInstances", java.util.Objects.requireNonNull(value, "useEbsOptimizedInstances is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.OpsworksHaproxyLayer}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.OpsworksHaproxyLayer> {
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
        private final imports.aws.OpsworksHaproxyLayerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.OpsworksHaproxyLayerConfig.Builder();
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
         * @param stackId This parameter is required.
         */
        public Builder stackId(final java.lang.String stackId) {
            this.config.stackId(stackId);
            return this;
        }

        /**
         * @return {@code this}
         * @param statsPassword This parameter is required.
         */
        public Builder statsPassword(final java.lang.String statsPassword) {
            this.config.statsPassword(statsPassword);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoAssignElasticIps This parameter is required.
         */
        public Builder autoAssignElasticIps(final java.lang.Boolean autoAssignElasticIps) {
            this.config.autoAssignElasticIps(autoAssignElasticIps);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoAssignPublicIps This parameter is required.
         */
        public Builder autoAssignPublicIps(final java.lang.Boolean autoAssignPublicIps) {
            this.config.autoAssignPublicIps(autoAssignPublicIps);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoHealing This parameter is required.
         */
        public Builder autoHealing(final java.lang.Boolean autoHealing) {
            this.config.autoHealing(autoHealing);
            return this;
        }

        /**
         * @return {@code this}
         * @param customConfigureRecipes This parameter is required.
         */
        public Builder customConfigureRecipes(final java.util.List<java.lang.String> customConfigureRecipes) {
            this.config.customConfigureRecipes(customConfigureRecipes);
            return this;
        }

        /**
         * @return {@code this}
         * @param customDeployRecipes This parameter is required.
         */
        public Builder customDeployRecipes(final java.util.List<java.lang.String> customDeployRecipes) {
            this.config.customDeployRecipes(customDeployRecipes);
            return this;
        }

        /**
         * @return {@code this}
         * @param customInstanceProfileArn This parameter is required.
         */
        public Builder customInstanceProfileArn(final java.lang.String customInstanceProfileArn) {
            this.config.customInstanceProfileArn(customInstanceProfileArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param customJson This parameter is required.
         */
        public Builder customJson(final java.lang.String customJson) {
            this.config.customJson(customJson);
            return this;
        }

        /**
         * @return {@code this}
         * @param customSecurityGroupIds This parameter is required.
         */
        public Builder customSecurityGroupIds(final java.util.List<java.lang.String> customSecurityGroupIds) {
            this.config.customSecurityGroupIds(customSecurityGroupIds);
            return this;
        }

        /**
         * @return {@code this}
         * @param customSetupRecipes This parameter is required.
         */
        public Builder customSetupRecipes(final java.util.List<java.lang.String> customSetupRecipes) {
            this.config.customSetupRecipes(customSetupRecipes);
            return this;
        }

        /**
         * @return {@code this}
         * @param customShutdownRecipes This parameter is required.
         */
        public Builder customShutdownRecipes(final java.util.List<java.lang.String> customShutdownRecipes) {
            this.config.customShutdownRecipes(customShutdownRecipes);
            return this;
        }

        /**
         * @return {@code this}
         * @param customUndeployRecipes This parameter is required.
         */
        public Builder customUndeployRecipes(final java.util.List<java.lang.String> customUndeployRecipes) {
            this.config.customUndeployRecipes(customUndeployRecipes);
            return this;
        }

        /**
         * @return {@code this}
         * @param drainElbOnShutdown This parameter is required.
         */
        public Builder drainElbOnShutdown(final java.lang.Boolean drainElbOnShutdown) {
            this.config.drainElbOnShutdown(drainElbOnShutdown);
            return this;
        }

        /**
         * ebs_volume block.
         * <p>
         * @return {@code this}
         * @param ebsVolume ebs_volume block. This parameter is required.
         */
        public Builder ebsVolume(final java.util.List<? extends imports.aws.OpsworksHaproxyLayerEbsVolume> ebsVolume) {
            this.config.ebsVolume(ebsVolume);
            return this;
        }

        /**
         * @return {@code this}
         * @param elasticLoadBalancer This parameter is required.
         */
        public Builder elasticLoadBalancer(final java.lang.String elasticLoadBalancer) {
            this.config.elasticLoadBalancer(elasticLoadBalancer);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthcheckMethod This parameter is required.
         */
        public Builder healthcheckMethod(final java.lang.String healthcheckMethod) {
            this.config.healthcheckMethod(healthcheckMethod);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthcheckUrl This parameter is required.
         */
        public Builder healthcheckUrl(final java.lang.String healthcheckUrl) {
            this.config.healthcheckUrl(healthcheckUrl);
            return this;
        }

        /**
         * @return {@code this}
         * @param installUpdatesOnBoot This parameter is required.
         */
        public Builder installUpdatesOnBoot(final java.lang.Boolean installUpdatesOnBoot) {
            this.config.installUpdatesOnBoot(installUpdatesOnBoot);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceShutdownTimeout This parameter is required.
         */
        public Builder instanceShutdownTimeout(final java.lang.Number instanceShutdownTimeout) {
            this.config.instanceShutdownTimeout(instanceShutdownTimeout);
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
         * @param statsEnabled This parameter is required.
         */
        public Builder statsEnabled(final java.lang.Boolean statsEnabled) {
            this.config.statsEnabled(statsEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param statsUrl This parameter is required.
         */
        public Builder statsUrl(final java.lang.String statsUrl) {
            this.config.statsUrl(statsUrl);
            return this;
        }

        /**
         * @return {@code this}
         * @param statsUser This parameter is required.
         */
        public Builder statsUser(final java.lang.String statsUser) {
            this.config.statsUser(statsUser);
            return this;
        }

        /**
         * @return {@code this}
         * @param systemPackages This parameter is required.
         */
        public Builder systemPackages(final java.util.List<java.lang.String> systemPackages) {
            this.config.systemPackages(systemPackages);
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
         * @param useEbsOptimizedInstances This parameter is required.
         */
        public Builder useEbsOptimizedInstances(final java.lang.Boolean useEbsOptimizedInstances) {
            this.config.useEbsOptimizedInstances(useEbsOptimizedInstances);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.OpsworksHaproxyLayer}.
         */
        @Override
        public imports.aws.OpsworksHaproxyLayer build() {
            return new imports.aws.OpsworksHaproxyLayer(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
