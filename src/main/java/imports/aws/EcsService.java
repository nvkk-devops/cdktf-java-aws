package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.513Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsService")
public class EcsService extends com.hashicorp.cdktf.TerraformResource {

    protected EcsService(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsService(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public EcsService(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.EcsServiceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCapacityProviderStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCluster() {
        software.amazon.jsii.Kernel.call(this, "resetCluster", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentController() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentController", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentMaximumPercent() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentMaximumPercent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentMinimumHealthyPercent() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentMinimumHealthyPercent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDesiredCount() {
        software.amazon.jsii.Kernel.call(this, "resetDesiredCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableEcsManagedTags() {
        software.amazon.jsii.Kernel.call(this, "resetEnableEcsManagedTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceNewDeployment() {
        software.amazon.jsii.Kernel.call(this, "resetForceNewDeployment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckGracePeriodSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckGracePeriodSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIamRole() {
        software.amazon.jsii.Kernel.call(this, "resetIamRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchType() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancer() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetworkConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetNetworkConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrderedPlacementStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetOrderedPlacementStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlacementConstraints() {
        software.amazon.jsii.Kernel.call(this, "resetPlacementConstraints", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlacementStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetPlacementStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlatformVersion() {
        software.amazon.jsii.Kernel.call(this, "resetPlatformVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPropagateTags() {
        software.amazon.jsii.Kernel.call(this, "resetPropagateTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchedulingStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetSchedulingStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceRegistries() {
        software.amazon.jsii.Kernel.call(this, "resetServiceRegistries", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTaskDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetTaskDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceCapacityProviderStrategy> getCapacityProviderStrategyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServiceCapacityProviderStrategy>)(software.amazon.jsii.Kernel.get(this, "capacityProviderStrategyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceCapacityProviderStrategy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceDeploymentController> getDeploymentControllerInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServiceDeploymentController>)(software.amazon.jsii.Kernel.get(this, "deploymentControllerInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceDeploymentController.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMaximumPercentInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMaximumPercentInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMinimumHealthyPercentInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMinimumHealthyPercentInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDesiredCountInput() {
        return software.amazon.jsii.Kernel.get(this, "desiredCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableEcsManagedTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "enableEcsManagedTagsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getForceNewDeploymentInput() {
        return software.amazon.jsii.Kernel.get(this, "forceNewDeploymentInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckGracePeriodSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriodSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLaunchTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "launchTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceLoadBalancer> getLoadBalancerInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServiceLoadBalancer>)(software.amazon.jsii.Kernel.get(this, "loadBalancerInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceLoadBalancer.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceNetworkConfiguration> getNetworkConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServiceNetworkConfiguration>)(software.amazon.jsii.Kernel.get(this, "networkConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceNetworkConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy> getOrderedPlacementStrategyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy>)(software.amazon.jsii.Kernel.get(this, "orderedPlacementStrategyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceOrderedPlacementStrategy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServicePlacementConstraints> getPlacementConstraintsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServicePlacementConstraints>)(software.amazon.jsii.Kernel.get(this, "placementConstraintsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServicePlacementConstraints.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServicePlacementStrategy> getPlacementStrategyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServicePlacementStrategy>)(software.amazon.jsii.Kernel.get(this, "placementStrategyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServicePlacementStrategy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlatformVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "platformVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPropagateTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "propagateTagsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchedulingStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "schedulingStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceServiceRegistries> getServiceRegistriesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsServiceServiceRegistries>)(software.amazon.jsii.Kernel.get(this, "serviceRegistriesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceServiceRegistries.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTaskDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "taskDefinitionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.EcsServiceTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceCapacityProviderStrategy> getCapacityProviderStrategy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "capacityProviderStrategy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceCapacityProviderStrategy.class))));
    }

    public void setCapacityProviderStrategy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceCapacityProviderStrategy> value) {
        software.amazon.jsii.Kernel.set(this, "capacityProviderStrategy", java.util.Objects.requireNonNull(value, "capacityProviderStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCluster() {
        return software.amazon.jsii.Kernel.get(this, "cluster", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCluster(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cluster", java.util.Objects.requireNonNull(value, "cluster is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceDeploymentController> getDeploymentController() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "deploymentController", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceDeploymentController.class))));
    }

    public void setDeploymentController(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceDeploymentController> value) {
        software.amazon.jsii.Kernel.set(this, "deploymentController", java.util.Objects.requireNonNull(value, "deploymentController is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeploymentMaximumPercent() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMaximumPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeploymentMaximumPercent(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deploymentMaximumPercent", java.util.Objects.requireNonNull(value, "deploymentMaximumPercent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeploymentMinimumHealthyPercent() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMinimumHealthyPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeploymentMinimumHealthyPercent(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deploymentMinimumHealthyPercent", java.util.Objects.requireNonNull(value, "deploymentMinimumHealthyPercent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDesiredCount() {
        return software.amazon.jsii.Kernel.get(this, "desiredCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDesiredCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "desiredCount", java.util.Objects.requireNonNull(value, "desiredCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableEcsManagedTags() {
        return software.amazon.jsii.Kernel.get(this, "enableEcsManagedTags", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableEcsManagedTags(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableEcsManagedTags", java.util.Objects.requireNonNull(value, "enableEcsManagedTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getForceNewDeployment() {
        return software.amazon.jsii.Kernel.get(this, "forceNewDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setForceNewDeployment(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceNewDeployment", java.util.Objects.requireNonNull(value, "forceNewDeployment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckGracePeriodSeconds() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckGracePeriodSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckGracePeriodSeconds", java.util.Objects.requireNonNull(value, "healthCheckGracePeriodSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRole() {
        return software.amazon.jsii.Kernel.get(this, "iamRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRole", java.util.Objects.requireNonNull(value, "iamRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLaunchType() {
        return software.amazon.jsii.Kernel.get(this, "launchType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLaunchType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "launchType", java.util.Objects.requireNonNull(value, "launchType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceLoadBalancer> getLoadBalancer() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loadBalancer", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceLoadBalancer.class))));
    }

    public void setLoadBalancer(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceLoadBalancer> value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancer", java.util.Objects.requireNonNull(value, "loadBalancer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceNetworkConfiguration> getNetworkConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceNetworkConfiguration.class))));
    }

    public void setNetworkConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceNetworkConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "networkConfiguration", java.util.Objects.requireNonNull(value, "networkConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy> getOrderedPlacementStrategy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "orderedPlacementStrategy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceOrderedPlacementStrategy.class))));
    }

    public void setOrderedPlacementStrategy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy> value) {
        software.amazon.jsii.Kernel.set(this, "orderedPlacementStrategy", java.util.Objects.requireNonNull(value, "orderedPlacementStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServicePlacementConstraints> getPlacementConstraints() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "placementConstraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServicePlacementConstraints.class))));
    }

    public void setPlacementConstraints(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServicePlacementConstraints> value) {
        software.amazon.jsii.Kernel.set(this, "placementConstraints", java.util.Objects.requireNonNull(value, "placementConstraints is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServicePlacementStrategy> getPlacementStrategy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "placementStrategy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServicePlacementStrategy.class))));
    }

    public void setPlacementStrategy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServicePlacementStrategy> value) {
        software.amazon.jsii.Kernel.set(this, "placementStrategy", java.util.Objects.requireNonNull(value, "placementStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformVersion() {
        return software.amazon.jsii.Kernel.get(this, "platformVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlatformVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "platformVersion", java.util.Objects.requireNonNull(value, "platformVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPropagateTags() {
        return software.amazon.jsii.Kernel.get(this, "propagateTags", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPropagateTags(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "propagateTags", java.util.Objects.requireNonNull(value, "propagateTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchedulingStrategy() {
        return software.amazon.jsii.Kernel.get(this, "schedulingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchedulingStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schedulingStrategy", java.util.Objects.requireNonNull(value, "schedulingStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceServiceRegistries> getServiceRegistries() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "serviceRegistries", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceServiceRegistries.class))));
    }

    public void setServiceRegistries(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsServiceServiceRegistries> value) {
        software.amazon.jsii.Kernel.set(this, "serviceRegistries", java.util.Objects.requireNonNull(value, "serviceRegistries is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTaskDefinition() {
        return software.amazon.jsii.Kernel.get(this, "taskDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTaskDefinition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "taskDefinition", java.util.Objects.requireNonNull(value, "taskDefinition is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.EcsServiceTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.EcsServiceTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.EcsService}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.EcsService> {
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
        private final imports.aws.EcsServiceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.EcsServiceConfig.Builder();
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
         * capacity_provider_strategy block.
         * <p>
         * @return {@code this}
         * @param capacityProviderStrategy capacity_provider_strategy block. This parameter is required.
         */
        public Builder capacityProviderStrategy(final java.util.List<? extends imports.aws.EcsServiceCapacityProviderStrategy> capacityProviderStrategy) {
            this.config.capacityProviderStrategy(capacityProviderStrategy);
            return this;
        }

        /**
         * @return {@code this}
         * @param cluster This parameter is required.
         */
        public Builder cluster(final java.lang.String cluster) {
            this.config.cluster(cluster);
            return this;
        }

        /**
         * deployment_controller block.
         * <p>
         * @return {@code this}
         * @param deploymentController deployment_controller block. This parameter is required.
         */
        public Builder deploymentController(final java.util.List<? extends imports.aws.EcsServiceDeploymentController> deploymentController) {
            this.config.deploymentController(deploymentController);
            return this;
        }

        /**
         * @return {@code this}
         * @param deploymentMaximumPercent This parameter is required.
         */
        public Builder deploymentMaximumPercent(final java.lang.Number deploymentMaximumPercent) {
            this.config.deploymentMaximumPercent(deploymentMaximumPercent);
            return this;
        }

        /**
         * @return {@code this}
         * @param deploymentMinimumHealthyPercent This parameter is required.
         */
        public Builder deploymentMinimumHealthyPercent(final java.lang.Number deploymentMinimumHealthyPercent) {
            this.config.deploymentMinimumHealthyPercent(deploymentMinimumHealthyPercent);
            return this;
        }

        /**
         * @return {@code this}
         * @param desiredCount This parameter is required.
         */
        public Builder desiredCount(final java.lang.Number desiredCount) {
            this.config.desiredCount(desiredCount);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableEcsManagedTags This parameter is required.
         */
        public Builder enableEcsManagedTags(final java.lang.Boolean enableEcsManagedTags) {
            this.config.enableEcsManagedTags(enableEcsManagedTags);
            return this;
        }

        /**
         * @return {@code this}
         * @param forceNewDeployment This parameter is required.
         */
        public Builder forceNewDeployment(final java.lang.Boolean forceNewDeployment) {
            this.config.forceNewDeployment(forceNewDeployment);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckGracePeriodSeconds This parameter is required.
         */
        public Builder healthCheckGracePeriodSeconds(final java.lang.Number healthCheckGracePeriodSeconds) {
            this.config.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds);
            return this;
        }

        /**
         * @return {@code this}
         * @param iamRole This parameter is required.
         */
        public Builder iamRole(final java.lang.String iamRole) {
            this.config.iamRole(iamRole);
            return this;
        }

        /**
         * @return {@code this}
         * @param launchType This parameter is required.
         */
        public Builder launchType(final java.lang.String launchType) {
            this.config.launchType(launchType);
            return this;
        }

        /**
         * load_balancer block.
         * <p>
         * @return {@code this}
         * @param loadBalancer load_balancer block. This parameter is required.
         */
        public Builder loadBalancer(final java.util.List<? extends imports.aws.EcsServiceLoadBalancer> loadBalancer) {
            this.config.loadBalancer(loadBalancer);
            return this;
        }

        /**
         * network_configuration block.
         * <p>
         * @return {@code this}
         * @param networkConfiguration network_configuration block. This parameter is required.
         */
        public Builder networkConfiguration(final java.util.List<? extends imports.aws.EcsServiceNetworkConfiguration> networkConfiguration) {
            this.config.networkConfiguration(networkConfiguration);
            return this;
        }

        /**
         * ordered_placement_strategy block.
         * <p>
         * @return {@code this}
         * @param orderedPlacementStrategy ordered_placement_strategy block. This parameter is required.
         */
        public Builder orderedPlacementStrategy(final java.util.List<? extends imports.aws.EcsServiceOrderedPlacementStrategy> orderedPlacementStrategy) {
            this.config.orderedPlacementStrategy(orderedPlacementStrategy);
            return this;
        }

        /**
         * placement_constraints block.
         * <p>
         * @return {@code this}
         * @param placementConstraints placement_constraints block. This parameter is required.
         */
        public Builder placementConstraints(final java.util.List<? extends imports.aws.EcsServicePlacementConstraints> placementConstraints) {
            this.config.placementConstraints(placementConstraints);
            return this;
        }

        /**
         * placement_strategy block.
         * <p>
         * @return {@code this}
         * @param placementStrategy placement_strategy block. This parameter is required.
         */
        public Builder placementStrategy(final java.util.List<? extends imports.aws.EcsServicePlacementStrategy> placementStrategy) {
            this.config.placementStrategy(placementStrategy);
            return this;
        }

        /**
         * @return {@code this}
         * @param platformVersion This parameter is required.
         */
        public Builder platformVersion(final java.lang.String platformVersion) {
            this.config.platformVersion(platformVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param propagateTags This parameter is required.
         */
        public Builder propagateTags(final java.lang.String propagateTags) {
            this.config.propagateTags(propagateTags);
            return this;
        }

        /**
         * @return {@code this}
         * @param schedulingStrategy This parameter is required.
         */
        public Builder schedulingStrategy(final java.lang.String schedulingStrategy) {
            this.config.schedulingStrategy(schedulingStrategy);
            return this;
        }

        /**
         * service_registries block.
         * <p>
         * @return {@code this}
         * @param serviceRegistries service_registries block. This parameter is required.
         */
        public Builder serviceRegistries(final java.util.List<? extends imports.aws.EcsServiceServiceRegistries> serviceRegistries) {
            this.config.serviceRegistries(serviceRegistries);
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
         * @param taskDefinition This parameter is required.
         */
        public Builder taskDefinition(final java.lang.String taskDefinition) {
            this.config.taskDefinition(taskDefinition);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.EcsServiceTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.EcsService}.
         */
        @Override
        public imports.aws.EcsService build() {
            return new imports.aws.EcsService(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
