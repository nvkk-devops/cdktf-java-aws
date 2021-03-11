package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.059Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingGroup")
public class AutoscalingGroup extends com.hashicorp.cdktf.TerraformResource {

    protected AutoscalingGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AutoscalingGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AutoscalingGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAvailabilityZones() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZones", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultCooldown() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultCooldown", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDesiredCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetDesiredCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabledMetrics() {
        software.amazon.jsii.Kernel.call(this, "resetEnabledMetrics", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceDelete() {
        software.amazon.jsii.Kernel.call(this, "resetForceDelete", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckGracePeriod() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckGracePeriod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckType() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInitialLifecycleHook() {
        software.amazon.jsii.Kernel.call(this, "resetInitialLifecycleHook", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchTemplate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancers() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxInstanceLifetime() {
        software.amazon.jsii.Kernel.call(this, "resetMaxInstanceLifetime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricsGranularity() {
        software.amazon.jsii.Kernel.call(this, "resetMetricsGranularity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinElbCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetMinElbCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMixedInstancesPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetMixedInstancesPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlacementGroup() {
        software.amazon.jsii.Kernel.call(this, "resetPlacementGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProtectFromScaleIn() {
        software.amazon.jsii.Kernel.call(this, "resetProtectFromScaleIn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceLinkedRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetServiceLinkedRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuspendedProcesses() {
        software.amazon.jsii.Kernel.call(this, "resetSuspendedProcesses", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTag() {
        software.amazon.jsii.Kernel.call(this, "resetTag", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetGroupArns() {
        software.amazon.jsii.Kernel.call(this, "resetTargetGroupArns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminationPolicies() {
        software.amazon.jsii.Kernel.call(this, "resetTerminationPolicies", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcZoneIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetVpcZoneIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForCapacityTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForCapacityTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForElbCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForElbCapacity", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "maxSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "minSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAvailabilityZonesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "availabilityZonesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultCooldownInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultCooldownInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDesiredCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "desiredCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledMetricsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "enabledMetricsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDeleteInput() {
        return software.amazon.jsii.Kernel.get(this, "forceDeleteInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckGracePeriodInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriodInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook> getInitialLifecycleHookInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook>)(software.amazon.jsii.Kernel.get(this, "initialLifecycleHookInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupInitialLifecycleHook.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLaunchConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "launchConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupLaunchTemplate> getLaunchTemplateInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AutoscalingGroupLaunchTemplate>)(software.amazon.jsii.Kernel.get(this, "launchTemplateInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupLaunchTemplate.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "loadBalancersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxInstanceLifetimeInput() {
        return software.amazon.jsii.Kernel.get(this, "maxInstanceLifetimeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricsGranularityInput() {
        return software.amazon.jsii.Kernel.get(this, "metricsGranularityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinElbCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "minElbCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy> getMixedInstancesPolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy>)(software.amazon.jsii.Kernel.get(this, "mixedInstancesPolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupMixedInstancesPolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlacementGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "placementGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getProtectFromScaleInInput() {
        return software.amazon.jsii.Kernel.get(this, "protectFromScaleInInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceLinkedRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceLinkedRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSuspendedProcessesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "suspendedProcessesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupTag> getTagInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AutoscalingGroupTag>)(software.amazon.jsii.Kernel.get(this, "tagInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupTag.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTargetGroupArnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "targetGroupArnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTerminationPoliciesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "terminationPoliciesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AutoscalingGroupTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcZoneIdentifierInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcZoneIdentifierInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWaitForCapacityTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForCapacityTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getWaitForElbCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForElbCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAvailabilityZones() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAvailabilityZones(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZones", java.util.Objects.requireNonNull(value, "availabilityZones is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultCooldown() {
        return software.amazon.jsii.Kernel.get(this, "defaultCooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultCooldown(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultCooldown", java.util.Objects.requireNonNull(value, "defaultCooldown is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDesiredCapacity() {
        return software.amazon.jsii.Kernel.get(this, "desiredCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDesiredCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "desiredCapacity", java.util.Objects.requireNonNull(value, "desiredCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEnabledMetrics() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "enabledMetrics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setEnabledMetrics(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "enabledMetrics", java.util.Objects.requireNonNull(value, "enabledMetrics is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getForceDelete() {
        return software.amazon.jsii.Kernel.get(this, "forceDelete", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setForceDelete(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceDelete", java.util.Objects.requireNonNull(value, "forceDelete is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckGracePeriod() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckGracePeriod(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckGracePeriod", java.util.Objects.requireNonNull(value, "healthCheckGracePeriod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthCheckType() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthCheckType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckType", java.util.Objects.requireNonNull(value, "healthCheckType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook> getInitialLifecycleHook() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "initialLifecycleHook", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupInitialLifecycleHook.class))));
    }

    public void setInitialLifecycleHook(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook> value) {
        software.amazon.jsii.Kernel.set(this, "initialLifecycleHook", java.util.Objects.requireNonNull(value, "initialLifecycleHook is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLaunchConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "launchConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLaunchConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "launchConfiguration", java.util.Objects.requireNonNull(value, "launchConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupLaunchTemplate> getLaunchTemplate() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "launchTemplate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupLaunchTemplate.class))));
    }

    public void setLaunchTemplate(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupLaunchTemplate> value) {
        software.amazon.jsii.Kernel.set(this, "launchTemplate", java.util.Objects.requireNonNull(value, "launchTemplate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLoadBalancers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loadBalancers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLoadBalancers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancers", java.util.Objects.requireNonNull(value, "loadBalancers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxInstanceLifetime() {
        return software.amazon.jsii.Kernel.get(this, "maxInstanceLifetime", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxInstanceLifetime(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxInstanceLifetime", java.util.Objects.requireNonNull(value, "maxInstanceLifetime is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxSize() {
        return software.amazon.jsii.Kernel.get(this, "maxSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxSize", java.util.Objects.requireNonNull(value, "maxSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMetricsGranularity() {
        return software.amazon.jsii.Kernel.get(this, "metricsGranularity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetricsGranularity(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metricsGranularity", java.util.Objects.requireNonNull(value, "metricsGranularity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinElbCapacity() {
        return software.amazon.jsii.Kernel.get(this, "minElbCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinElbCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minElbCapacity", java.util.Objects.requireNonNull(value, "minElbCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinSize() {
        return software.amazon.jsii.Kernel.get(this, "minSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minSize", java.util.Objects.requireNonNull(value, "minSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy> getMixedInstancesPolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "mixedInstancesPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupMixedInstancesPolicy.class))));
    }

    public void setMixedInstancesPolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy> value) {
        software.amazon.jsii.Kernel.set(this, "mixedInstancesPolicy", java.util.Objects.requireNonNull(value, "mixedInstancesPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlacementGroup() {
        return software.amazon.jsii.Kernel.get(this, "placementGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlacementGroup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "placementGroup", java.util.Objects.requireNonNull(value, "placementGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getProtectFromScaleIn() {
        return software.amazon.jsii.Kernel.get(this, "protectFromScaleIn", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setProtectFromScaleIn(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "protectFromScaleIn", java.util.Objects.requireNonNull(value, "protectFromScaleIn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceLinkedRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceLinkedRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceLinkedRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceLinkedRoleArn", java.util.Objects.requireNonNull(value, "serviceLinkedRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSuspendedProcesses() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "suspendedProcesses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSuspendedProcesses(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "suspendedProcesses", java.util.Objects.requireNonNull(value, "suspendedProcesses is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupTag> getTag() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "tag", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupTag.class))));
    }

    public void setTag(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingGroupTag> value) {
        software.amazon.jsii.Kernel.set(this, "tag", java.util.Objects.requireNonNull(value, "tag is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTargetGroupArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetGroupArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTargetGroupArns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "targetGroupArns", java.util.Objects.requireNonNull(value, "targetGroupArns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTerminationPolicies() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "terminationPolicies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTerminationPolicies(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "terminationPolicies", java.util.Objects.requireNonNull(value, "terminationPolicies is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AutoscalingGroupTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.AutoscalingGroupTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVpcZoneIdentifier() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcZoneIdentifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVpcZoneIdentifier(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcZoneIdentifier", java.util.Objects.requireNonNull(value, "vpcZoneIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWaitForCapacityTimeout() {
        return software.amazon.jsii.Kernel.get(this, "waitForCapacityTimeout", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWaitForCapacityTimeout(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "waitForCapacityTimeout", java.util.Objects.requireNonNull(value, "waitForCapacityTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getWaitForElbCapacity() {
        return software.amazon.jsii.Kernel.get(this, "waitForElbCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setWaitForElbCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "waitForElbCapacity", java.util.Objects.requireNonNull(value, "waitForElbCapacity is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AutoscalingGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AutoscalingGroup> {
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
        private final imports.aws.AutoscalingGroupConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AutoscalingGroupConfig.Builder();
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
         * @param maxSize This parameter is required.
         */
        public Builder maxSize(final java.lang.Number maxSize) {
            this.config.maxSize(maxSize);
            return this;
        }

        /**
         * @return {@code this}
         * @param minSize This parameter is required.
         */
        public Builder minSize(final java.lang.Number minSize) {
            this.config.minSize(minSize);
            return this;
        }

        /**
         * @return {@code this}
         * @param availabilityZones This parameter is required.
         */
        public Builder availabilityZones(final java.util.List<java.lang.String> availabilityZones) {
            this.config.availabilityZones(availabilityZones);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultCooldown This parameter is required.
         */
        public Builder defaultCooldown(final java.lang.Number defaultCooldown) {
            this.config.defaultCooldown(defaultCooldown);
            return this;
        }

        /**
         * @return {@code this}
         * @param desiredCapacity This parameter is required.
         */
        public Builder desiredCapacity(final java.lang.Number desiredCapacity) {
            this.config.desiredCapacity(desiredCapacity);
            return this;
        }

        /**
         * @return {@code this}
         * @param enabledMetrics This parameter is required.
         */
        public Builder enabledMetrics(final java.util.List<java.lang.String> enabledMetrics) {
            this.config.enabledMetrics(enabledMetrics);
            return this;
        }

        /**
         * @return {@code this}
         * @param forceDelete This parameter is required.
         */
        public Builder forceDelete(final java.lang.Boolean forceDelete) {
            this.config.forceDelete(forceDelete);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckGracePeriod This parameter is required.
         */
        public Builder healthCheckGracePeriod(final java.lang.Number healthCheckGracePeriod) {
            this.config.healthCheckGracePeriod(healthCheckGracePeriod);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckType This parameter is required.
         */
        public Builder healthCheckType(final java.lang.String healthCheckType) {
            this.config.healthCheckType(healthCheckType);
            return this;
        }

        /**
         * initial_lifecycle_hook block.
         * <p>
         * @return {@code this}
         * @param initialLifecycleHook initial_lifecycle_hook block. This parameter is required.
         */
        public Builder initialLifecycleHook(final java.util.List<? extends imports.aws.AutoscalingGroupInitialLifecycleHook> initialLifecycleHook) {
            this.config.initialLifecycleHook(initialLifecycleHook);
            return this;
        }

        /**
         * @return {@code this}
         * @param launchConfiguration This parameter is required.
         */
        public Builder launchConfiguration(final java.lang.String launchConfiguration) {
            this.config.launchConfiguration(launchConfiguration);
            return this;
        }

        /**
         * launch_template block.
         * <p>
         * @return {@code this}
         * @param launchTemplate launch_template block. This parameter is required.
         */
        public Builder launchTemplate(final java.util.List<? extends imports.aws.AutoscalingGroupLaunchTemplate> launchTemplate) {
            this.config.launchTemplate(launchTemplate);
            return this;
        }

        /**
         * @return {@code this}
         * @param loadBalancers This parameter is required.
         */
        public Builder loadBalancers(final java.util.List<java.lang.String> loadBalancers) {
            this.config.loadBalancers(loadBalancers);
            return this;
        }

        /**
         * @return {@code this}
         * @param maxInstanceLifetime This parameter is required.
         */
        public Builder maxInstanceLifetime(final java.lang.Number maxInstanceLifetime) {
            this.config.maxInstanceLifetime(maxInstanceLifetime);
            return this;
        }

        /**
         * @return {@code this}
         * @param metricsGranularity This parameter is required.
         */
        public Builder metricsGranularity(final java.lang.String metricsGranularity) {
            this.config.metricsGranularity(metricsGranularity);
            return this;
        }

        /**
         * @return {@code this}
         * @param minElbCapacity This parameter is required.
         */
        public Builder minElbCapacity(final java.lang.Number minElbCapacity) {
            this.config.minElbCapacity(minElbCapacity);
            return this;
        }

        /**
         * mixed_instances_policy block.
         * <p>
         * @return {@code this}
         * @param mixedInstancesPolicy mixed_instances_policy block. This parameter is required.
         */
        public Builder mixedInstancesPolicy(final java.util.List<? extends imports.aws.AutoscalingGroupMixedInstancesPolicy> mixedInstancesPolicy) {
            this.config.mixedInstancesPolicy(mixedInstancesPolicy);
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
         * @param namePrefix This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config.namePrefix(namePrefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param placementGroup This parameter is required.
         */
        public Builder placementGroup(final java.lang.String placementGroup) {
            this.config.placementGroup(placementGroup);
            return this;
        }

        /**
         * @return {@code this}
         * @param protectFromScaleIn This parameter is required.
         */
        public Builder protectFromScaleIn(final java.lang.Boolean protectFromScaleIn) {
            this.config.protectFromScaleIn(protectFromScaleIn);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceLinkedRoleArn This parameter is required.
         */
        public Builder serviceLinkedRoleArn(final java.lang.String serviceLinkedRoleArn) {
            this.config.serviceLinkedRoleArn(serviceLinkedRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param suspendedProcesses This parameter is required.
         */
        public Builder suspendedProcesses(final java.util.List<java.lang.String> suspendedProcesses) {
            this.config.suspendedProcesses(suspendedProcesses);
            return this;
        }

        /**
         * tag block.
         * <p>
         * @return {@code this}
         * @param tag tag block. This parameter is required.
         */
        public Builder tag(final java.util.List<? extends imports.aws.AutoscalingGroupTag> tag) {
            this.config.tag(tag);
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
         * @param targetGroupArns This parameter is required.
         */
        public Builder targetGroupArns(final java.util.List<java.lang.String> targetGroupArns) {
            this.config.targetGroupArns(targetGroupArns);
            return this;
        }

        /**
         * @return {@code this}
         * @param terminationPolicies This parameter is required.
         */
        public Builder terminationPolicies(final java.util.List<java.lang.String> terminationPolicies) {
            this.config.terminationPolicies(terminationPolicies);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.AutoscalingGroupTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpcZoneIdentifier This parameter is required.
         */
        public Builder vpcZoneIdentifier(final java.util.List<java.lang.String> vpcZoneIdentifier) {
            this.config.vpcZoneIdentifier(vpcZoneIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param waitForCapacityTimeout This parameter is required.
         */
        public Builder waitForCapacityTimeout(final java.lang.String waitForCapacityTimeout) {
            this.config.waitForCapacityTimeout(waitForCapacityTimeout);
            return this;
        }

        /**
         * @return {@code this}
         * @param waitForElbCapacity This parameter is required.
         */
        public Builder waitForElbCapacity(final java.lang.Number waitForElbCapacity) {
            this.config.waitForElbCapacity(waitForElbCapacity);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AutoscalingGroup}.
         */
        @Override
        public imports.aws.AutoscalingGroup build() {
            return new imports.aws.AutoscalingGroup(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
