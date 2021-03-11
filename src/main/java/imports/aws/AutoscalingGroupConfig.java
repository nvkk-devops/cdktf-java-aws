package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.061Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingGroupConfig")
@software.amazon.jsii.Jsii.Proxy(AutoscalingGroupConfig.Jsii$Proxy.class)
public interface AutoscalingGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Number getMaxSize();

    @org.jetbrains.annotations.NotNull java.lang.Number getMinSize();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAvailabilityZones() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultCooldown() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDesiredCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledMetrics() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDelete() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckGracePeriod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckType() {
        return null;
    }

    /**
     * initial_lifecycle_hook block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook> getInitialLifecycleHook() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLaunchConfiguration() {
        return null;
    }

    /**
     * launch_template block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupLaunchTemplate> getLaunchTemplate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxInstanceLifetime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMetricsGranularity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinElbCapacity() {
        return null;
    }

    /**
     * mixed_instances_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy> getMixedInstancesPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlacementGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getProtectFromScaleIn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceLinkedRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSuspendedProcesses() {
        return null;
    }

    /**
     * tag block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingGroupTag> getTag() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTargetGroupArns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTerminationPolicies() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AutoscalingGroupTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcZoneIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWaitForCapacityTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getWaitForElbCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingGroupConfig> {
        private java.lang.Number maxSize;
        private java.lang.Number minSize;
        private java.util.List<java.lang.String> availabilityZones;
        private java.lang.Number defaultCooldown;
        private java.lang.Number desiredCapacity;
        private java.util.List<java.lang.String> enabledMetrics;
        private java.lang.Boolean forceDelete;
        private java.lang.Number healthCheckGracePeriod;
        private java.lang.String healthCheckType;
        private java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook> initialLifecycleHook;
        private java.lang.String launchConfiguration;
        private java.util.List<imports.aws.AutoscalingGroupLaunchTemplate> launchTemplate;
        private java.util.List<java.lang.String> loadBalancers;
        private java.lang.Number maxInstanceLifetime;
        private java.lang.String metricsGranularity;
        private java.lang.Number minElbCapacity;
        private java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy> mixedInstancesPolicy;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.lang.String placementGroup;
        private java.lang.Boolean protectFromScaleIn;
        private java.lang.String serviceLinkedRoleArn;
        private java.util.List<java.lang.String> suspendedProcesses;
        private java.util.List<imports.aws.AutoscalingGroupTag> tag;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<java.lang.String> targetGroupArns;
        private java.util.List<java.lang.String> terminationPolicies;
        private imports.aws.AutoscalingGroupTimeouts timeouts;
        private java.util.List<java.lang.String> vpcZoneIdentifier;
        private java.lang.String waitForCapacityTimeout;
        private java.lang.Number waitForElbCapacity;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getMaxSize}
         * @param maxSize the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder maxSize(java.lang.Number maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getMinSize}
         * @param minSize the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder minSize(java.lang.Number minSize) {
            this.minSize = minSize;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getAvailabilityZones}
         * @param availabilityZones the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZones(java.util.List<java.lang.String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getDefaultCooldown}
         * @param defaultCooldown the value to be set.
         * @return {@code this}
         */
        public Builder defaultCooldown(java.lang.Number defaultCooldown) {
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getDesiredCapacity}
         * @param desiredCapacity the value to be set.
         * @return {@code this}
         */
        public Builder desiredCapacity(java.lang.Number desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getEnabledMetrics}
         * @param enabledMetrics the value to be set.
         * @return {@code this}
         */
        public Builder enabledMetrics(java.util.List<java.lang.String> enabledMetrics) {
            this.enabledMetrics = enabledMetrics;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getForceDelete}
         * @param forceDelete the value to be set.
         * @return {@code this}
         */
        public Builder forceDelete(java.lang.Boolean forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getHealthCheckGracePeriod}
         * @param healthCheckGracePeriod the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckGracePeriod(java.lang.Number healthCheckGracePeriod) {
            this.healthCheckGracePeriod = healthCheckGracePeriod;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getHealthCheckType}
         * @param healthCheckType the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckType(java.lang.String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getInitialLifecycleHook}
         * @param initialLifecycleHook initial_lifecycle_hook block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder initialLifecycleHook(java.util.List<? extends imports.aws.AutoscalingGroupInitialLifecycleHook> initialLifecycleHook) {
            this.initialLifecycleHook = (java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook>)initialLifecycleHook;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getLaunchConfiguration}
         * @param launchConfiguration the value to be set.
         * @return {@code this}
         */
        public Builder launchConfiguration(java.lang.String launchConfiguration) {
            this.launchConfiguration = launchConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getLaunchTemplate}
         * @param launchTemplate launch_template block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder launchTemplate(java.util.List<? extends imports.aws.AutoscalingGroupLaunchTemplate> launchTemplate) {
            this.launchTemplate = (java.util.List<imports.aws.AutoscalingGroupLaunchTemplate>)launchTemplate;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getLoadBalancers}
         * @param loadBalancers the value to be set.
         * @return {@code this}
         */
        public Builder loadBalancers(java.util.List<java.lang.String> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getMaxInstanceLifetime}
         * @param maxInstanceLifetime the value to be set.
         * @return {@code this}
         */
        public Builder maxInstanceLifetime(java.lang.Number maxInstanceLifetime) {
            this.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getMetricsGranularity}
         * @param metricsGranularity the value to be set.
         * @return {@code this}
         */
        public Builder metricsGranularity(java.lang.String metricsGranularity) {
            this.metricsGranularity = metricsGranularity;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getMinElbCapacity}
         * @param minElbCapacity the value to be set.
         * @return {@code this}
         */
        public Builder minElbCapacity(java.lang.Number minElbCapacity) {
            this.minElbCapacity = minElbCapacity;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getMixedInstancesPolicy}
         * @param mixedInstancesPolicy mixed_instances_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder mixedInstancesPolicy(java.util.List<? extends imports.aws.AutoscalingGroupMixedInstancesPolicy> mixedInstancesPolicy) {
            this.mixedInstancesPolicy = (java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy>)mixedInstancesPolicy;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getPlacementGroup}
         * @param placementGroup the value to be set.
         * @return {@code this}
         */
        public Builder placementGroup(java.lang.String placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getProtectFromScaleIn}
         * @param protectFromScaleIn the value to be set.
         * @return {@code this}
         */
        public Builder protectFromScaleIn(java.lang.Boolean protectFromScaleIn) {
            this.protectFromScaleIn = protectFromScaleIn;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getServiceLinkedRoleArn}
         * @param serviceLinkedRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder serviceLinkedRoleArn(java.lang.String serviceLinkedRoleArn) {
            this.serviceLinkedRoleArn = serviceLinkedRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getSuspendedProcesses}
         * @param suspendedProcesses the value to be set.
         * @return {@code this}
         */
        public Builder suspendedProcesses(java.util.List<java.lang.String> suspendedProcesses) {
            this.suspendedProcesses = suspendedProcesses;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getTag}
         * @param tag tag block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tag(java.util.List<? extends imports.aws.AutoscalingGroupTag> tag) {
            this.tag = (java.util.List<imports.aws.AutoscalingGroupTag>)tag;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getTargetGroupArns}
         * @param targetGroupArns the value to be set.
         * @return {@code this}
         */
        public Builder targetGroupArns(java.util.List<java.lang.String> targetGroupArns) {
            this.targetGroupArns = targetGroupArns;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getTerminationPolicies}
         * @param terminationPolicies the value to be set.
         * @return {@code this}
         */
        public Builder terminationPolicies(java.util.List<java.lang.String> terminationPolicies) {
            this.terminationPolicies = terminationPolicies;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.AutoscalingGroupTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getVpcZoneIdentifier}
         * @param vpcZoneIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder vpcZoneIdentifier(java.util.List<java.lang.String> vpcZoneIdentifier) {
            this.vpcZoneIdentifier = vpcZoneIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getWaitForCapacityTimeout}
         * @param waitForCapacityTimeout the value to be set.
         * @return {@code this}
         */
        public Builder waitForCapacityTimeout(java.lang.String waitForCapacityTimeout) {
            this.waitForCapacityTimeout = waitForCapacityTimeout;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getWaitForElbCapacity}
         * @param waitForElbCapacity the value to be set.
         * @return {@code this}
         */
        public Builder waitForElbCapacity(java.lang.Number waitForElbCapacity) {
            this.waitForElbCapacity = waitForElbCapacity;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getDependsOn}
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
         * Sets the value of {@link AutoscalingGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupConfig#getProvider}
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
         * @return a new instance of {@link AutoscalingGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingGroupConfig build() {
            return new Jsii$Proxy(maxSize, minSize, availabilityZones, defaultCooldown, desiredCapacity, enabledMetrics, forceDelete, healthCheckGracePeriod, healthCheckType, initialLifecycleHook, launchConfiguration, launchTemplate, loadBalancers, maxInstanceLifetime, metricsGranularity, minElbCapacity, mixedInstancesPolicy, name, namePrefix, placementGroup, protectFromScaleIn, serviceLinkedRoleArn, suspendedProcesses, tag, tags, targetGroupArns, terminationPolicies, timeouts, vpcZoneIdentifier, waitForCapacityTimeout, waitForElbCapacity, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AutoscalingGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingGroupConfig {
        private final java.lang.Number maxSize;
        private final java.lang.Number minSize;
        private final java.util.List<java.lang.String> availabilityZones;
        private final java.lang.Number defaultCooldown;
        private final java.lang.Number desiredCapacity;
        private final java.util.List<java.lang.String> enabledMetrics;
        private final java.lang.Boolean forceDelete;
        private final java.lang.Number healthCheckGracePeriod;
        private final java.lang.String healthCheckType;
        private final java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook> initialLifecycleHook;
        private final java.lang.String launchConfiguration;
        private final java.util.List<imports.aws.AutoscalingGroupLaunchTemplate> launchTemplate;
        private final java.util.List<java.lang.String> loadBalancers;
        private final java.lang.Number maxInstanceLifetime;
        private final java.lang.String metricsGranularity;
        private final java.lang.Number minElbCapacity;
        private final java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy> mixedInstancesPolicy;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.String placementGroup;
        private final java.lang.Boolean protectFromScaleIn;
        private final java.lang.String serviceLinkedRoleArn;
        private final java.util.List<java.lang.String> suspendedProcesses;
        private final java.util.List<imports.aws.AutoscalingGroupTag> tag;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<java.lang.String> targetGroupArns;
        private final java.util.List<java.lang.String> terminationPolicies;
        private final imports.aws.AutoscalingGroupTimeouts timeouts;
        private final java.util.List<java.lang.String> vpcZoneIdentifier;
        private final java.lang.String waitForCapacityTimeout;
        private final java.lang.Number waitForElbCapacity;
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
            this.maxSize = software.amazon.jsii.Kernel.get(this, "maxSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minSize = software.amazon.jsii.Kernel.get(this, "minSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.availabilityZones = software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.defaultCooldown = software.amazon.jsii.Kernel.get(this, "defaultCooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.desiredCapacity = software.amazon.jsii.Kernel.get(this, "desiredCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.enabledMetrics = software.amazon.jsii.Kernel.get(this, "enabledMetrics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.forceDelete = software.amazon.jsii.Kernel.get(this, "forceDelete", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.healthCheckGracePeriod = software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.healthCheckType = software.amazon.jsii.Kernel.get(this, "healthCheckType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.initialLifecycleHook = software.amazon.jsii.Kernel.get(this, "initialLifecycleHook", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupInitialLifecycleHook.class)));
            this.launchConfiguration = software.amazon.jsii.Kernel.get(this, "launchConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchTemplate = software.amazon.jsii.Kernel.get(this, "launchTemplate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupLaunchTemplate.class)));
            this.loadBalancers = software.amazon.jsii.Kernel.get(this, "loadBalancers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.maxInstanceLifetime = software.amazon.jsii.Kernel.get(this, "maxInstanceLifetime", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.metricsGranularity = software.amazon.jsii.Kernel.get(this, "metricsGranularity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minElbCapacity = software.amazon.jsii.Kernel.get(this, "minElbCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.mixedInstancesPolicy = software.amazon.jsii.Kernel.get(this, "mixedInstancesPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupMixedInstancesPolicy.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.placementGroup = software.amazon.jsii.Kernel.get(this, "placementGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protectFromScaleIn = software.amazon.jsii.Kernel.get(this, "protectFromScaleIn", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.serviceLinkedRoleArn = software.amazon.jsii.Kernel.get(this, "serviceLinkedRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.suspendedProcesses = software.amazon.jsii.Kernel.get(this, "suspendedProcesses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tag = software.amazon.jsii.Kernel.get(this, "tag", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupTag.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.targetGroupArns = software.amazon.jsii.Kernel.get(this, "targetGroupArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.terminationPolicies = software.amazon.jsii.Kernel.get(this, "terminationPolicies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingGroupTimeouts.class));
            this.vpcZoneIdentifier = software.amazon.jsii.Kernel.get(this, "vpcZoneIdentifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.waitForCapacityTimeout = software.amazon.jsii.Kernel.get(this, "waitForCapacityTimeout", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.waitForElbCapacity = software.amazon.jsii.Kernel.get(this, "waitForElbCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number maxSize, final java.lang.Number minSize, final java.util.List<java.lang.String> availabilityZones, final java.lang.Number defaultCooldown, final java.lang.Number desiredCapacity, final java.util.List<java.lang.String> enabledMetrics, final java.lang.Boolean forceDelete, final java.lang.Number healthCheckGracePeriod, final java.lang.String healthCheckType, final java.util.List<? extends imports.aws.AutoscalingGroupInitialLifecycleHook> initialLifecycleHook, final java.lang.String launchConfiguration, final java.util.List<? extends imports.aws.AutoscalingGroupLaunchTemplate> launchTemplate, final java.util.List<java.lang.String> loadBalancers, final java.lang.Number maxInstanceLifetime, final java.lang.String metricsGranularity, final java.lang.Number minElbCapacity, final java.util.List<? extends imports.aws.AutoscalingGroupMixedInstancesPolicy> mixedInstancesPolicy, final java.lang.String name, final java.lang.String namePrefix, final java.lang.String placementGroup, final java.lang.Boolean protectFromScaleIn, final java.lang.String serviceLinkedRoleArn, final java.util.List<java.lang.String> suspendedProcesses, final java.util.List<? extends imports.aws.AutoscalingGroupTag> tag, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<java.lang.String> targetGroupArns, final java.util.List<java.lang.String> terminationPolicies, final imports.aws.AutoscalingGroupTimeouts timeouts, final java.util.List<java.lang.String> vpcZoneIdentifier, final java.lang.String waitForCapacityTimeout, final java.lang.Number waitForElbCapacity, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxSize = java.util.Objects.requireNonNull(maxSize, "maxSize is required");
            this.minSize = java.util.Objects.requireNonNull(minSize, "minSize is required");
            this.availabilityZones = availabilityZones;
            this.defaultCooldown = defaultCooldown;
            this.desiredCapacity = desiredCapacity;
            this.enabledMetrics = enabledMetrics;
            this.forceDelete = forceDelete;
            this.healthCheckGracePeriod = healthCheckGracePeriod;
            this.healthCheckType = healthCheckType;
            this.initialLifecycleHook = (java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook>)initialLifecycleHook;
            this.launchConfiguration = launchConfiguration;
            this.launchTemplate = (java.util.List<imports.aws.AutoscalingGroupLaunchTemplate>)launchTemplate;
            this.loadBalancers = loadBalancers;
            this.maxInstanceLifetime = maxInstanceLifetime;
            this.metricsGranularity = metricsGranularity;
            this.minElbCapacity = minElbCapacity;
            this.mixedInstancesPolicy = (java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy>)mixedInstancesPolicy;
            this.name = name;
            this.namePrefix = namePrefix;
            this.placementGroup = placementGroup;
            this.protectFromScaleIn = protectFromScaleIn;
            this.serviceLinkedRoleArn = serviceLinkedRoleArn;
            this.suspendedProcesses = suspendedProcesses;
            this.tag = (java.util.List<imports.aws.AutoscalingGroupTag>)tag;
            this.tags = tags;
            this.targetGroupArns = targetGroupArns;
            this.terminationPolicies = terminationPolicies;
            this.timeouts = timeouts;
            this.vpcZoneIdentifier = vpcZoneIdentifier;
            this.waitForCapacityTimeout = waitForCapacityTimeout;
            this.waitForElbCapacity = waitForElbCapacity;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getMaxSize() {
            return this.maxSize;
        }

        @Override
        public final java.lang.Number getMinSize() {
            return this.minSize;
        }

        @Override
        public final java.util.List<java.lang.String> getAvailabilityZones() {
            return this.availabilityZones;
        }

        @Override
        public final java.lang.Number getDefaultCooldown() {
            return this.defaultCooldown;
        }

        @Override
        public final java.lang.Number getDesiredCapacity() {
            return this.desiredCapacity;
        }

        @Override
        public final java.util.List<java.lang.String> getEnabledMetrics() {
            return this.enabledMetrics;
        }

        @Override
        public final java.lang.Boolean getForceDelete() {
            return this.forceDelete;
        }

        @Override
        public final java.lang.Number getHealthCheckGracePeriod() {
            return this.healthCheckGracePeriod;
        }

        @Override
        public final java.lang.String getHealthCheckType() {
            return this.healthCheckType;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingGroupInitialLifecycleHook> getInitialLifecycleHook() {
            return this.initialLifecycleHook;
        }

        @Override
        public final java.lang.String getLaunchConfiguration() {
            return this.launchConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingGroupLaunchTemplate> getLaunchTemplate() {
            return this.launchTemplate;
        }

        @Override
        public final java.util.List<java.lang.String> getLoadBalancers() {
            return this.loadBalancers;
        }

        @Override
        public final java.lang.Number getMaxInstanceLifetime() {
            return this.maxInstanceLifetime;
        }

        @Override
        public final java.lang.String getMetricsGranularity() {
            return this.metricsGranularity;
        }

        @Override
        public final java.lang.Number getMinElbCapacity() {
            return this.minElbCapacity;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingGroupMixedInstancesPolicy> getMixedInstancesPolicy() {
            return this.mixedInstancesPolicy;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.String getPlacementGroup() {
            return this.placementGroup;
        }

        @Override
        public final java.lang.Boolean getProtectFromScaleIn() {
            return this.protectFromScaleIn;
        }

        @Override
        public final java.lang.String getServiceLinkedRoleArn() {
            return this.serviceLinkedRoleArn;
        }

        @Override
        public final java.util.List<java.lang.String> getSuspendedProcesses() {
            return this.suspendedProcesses;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingGroupTag> getTag() {
            return this.tag;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<java.lang.String> getTargetGroupArns() {
            return this.targetGroupArns;
        }

        @Override
        public final java.util.List<java.lang.String> getTerminationPolicies() {
            return this.terminationPolicies;
        }

        @Override
        public final imports.aws.AutoscalingGroupTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcZoneIdentifier() {
            return this.vpcZoneIdentifier;
        }

        @Override
        public final java.lang.String getWaitForCapacityTimeout() {
            return this.waitForCapacityTimeout;
        }

        @Override
        public final java.lang.Number getWaitForElbCapacity() {
            return this.waitForElbCapacity;
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

            data.set("maxSize", om.valueToTree(this.getMaxSize()));
            data.set("minSize", om.valueToTree(this.getMinSize()));
            if (this.getAvailabilityZones() != null) {
                data.set("availabilityZones", om.valueToTree(this.getAvailabilityZones()));
            }
            if (this.getDefaultCooldown() != null) {
                data.set("defaultCooldown", om.valueToTree(this.getDefaultCooldown()));
            }
            if (this.getDesiredCapacity() != null) {
                data.set("desiredCapacity", om.valueToTree(this.getDesiredCapacity()));
            }
            if (this.getEnabledMetrics() != null) {
                data.set("enabledMetrics", om.valueToTree(this.getEnabledMetrics()));
            }
            if (this.getForceDelete() != null) {
                data.set("forceDelete", om.valueToTree(this.getForceDelete()));
            }
            if (this.getHealthCheckGracePeriod() != null) {
                data.set("healthCheckGracePeriod", om.valueToTree(this.getHealthCheckGracePeriod()));
            }
            if (this.getHealthCheckType() != null) {
                data.set("healthCheckType", om.valueToTree(this.getHealthCheckType()));
            }
            if (this.getInitialLifecycleHook() != null) {
                data.set("initialLifecycleHook", om.valueToTree(this.getInitialLifecycleHook()));
            }
            if (this.getLaunchConfiguration() != null) {
                data.set("launchConfiguration", om.valueToTree(this.getLaunchConfiguration()));
            }
            if (this.getLaunchTemplate() != null) {
                data.set("launchTemplate", om.valueToTree(this.getLaunchTemplate()));
            }
            if (this.getLoadBalancers() != null) {
                data.set("loadBalancers", om.valueToTree(this.getLoadBalancers()));
            }
            if (this.getMaxInstanceLifetime() != null) {
                data.set("maxInstanceLifetime", om.valueToTree(this.getMaxInstanceLifetime()));
            }
            if (this.getMetricsGranularity() != null) {
                data.set("metricsGranularity", om.valueToTree(this.getMetricsGranularity()));
            }
            if (this.getMinElbCapacity() != null) {
                data.set("minElbCapacity", om.valueToTree(this.getMinElbCapacity()));
            }
            if (this.getMixedInstancesPolicy() != null) {
                data.set("mixedInstancesPolicy", om.valueToTree(this.getMixedInstancesPolicy()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getPlacementGroup() != null) {
                data.set("placementGroup", om.valueToTree(this.getPlacementGroup()));
            }
            if (this.getProtectFromScaleIn() != null) {
                data.set("protectFromScaleIn", om.valueToTree(this.getProtectFromScaleIn()));
            }
            if (this.getServiceLinkedRoleArn() != null) {
                data.set("serviceLinkedRoleArn", om.valueToTree(this.getServiceLinkedRoleArn()));
            }
            if (this.getSuspendedProcesses() != null) {
                data.set("suspendedProcesses", om.valueToTree(this.getSuspendedProcesses()));
            }
            if (this.getTag() != null) {
                data.set("tag", om.valueToTree(this.getTag()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTargetGroupArns() != null) {
                data.set("targetGroupArns", om.valueToTree(this.getTargetGroupArns()));
            }
            if (this.getTerminationPolicies() != null) {
                data.set("terminationPolicies", om.valueToTree(this.getTerminationPolicies()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVpcZoneIdentifier() != null) {
                data.set("vpcZoneIdentifier", om.valueToTree(this.getVpcZoneIdentifier()));
            }
            if (this.getWaitForCapacityTimeout() != null) {
                data.set("waitForCapacityTimeout", om.valueToTree(this.getWaitForCapacityTimeout()));
            }
            if (this.getWaitForElbCapacity() != null) {
                data.set("waitForElbCapacity", om.valueToTree(this.getWaitForElbCapacity()));
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
            struct.set("fqn", om.valueToTree("aws.AutoscalingGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingGroupConfig.Jsii$Proxy that = (AutoscalingGroupConfig.Jsii$Proxy) o;

            if (!maxSize.equals(that.maxSize)) return false;
            if (!minSize.equals(that.minSize)) return false;
            if (this.availabilityZones != null ? !this.availabilityZones.equals(that.availabilityZones) : that.availabilityZones != null) return false;
            if (this.defaultCooldown != null ? !this.defaultCooldown.equals(that.defaultCooldown) : that.defaultCooldown != null) return false;
            if (this.desiredCapacity != null ? !this.desiredCapacity.equals(that.desiredCapacity) : that.desiredCapacity != null) return false;
            if (this.enabledMetrics != null ? !this.enabledMetrics.equals(that.enabledMetrics) : that.enabledMetrics != null) return false;
            if (this.forceDelete != null ? !this.forceDelete.equals(that.forceDelete) : that.forceDelete != null) return false;
            if (this.healthCheckGracePeriod != null ? !this.healthCheckGracePeriod.equals(that.healthCheckGracePeriod) : that.healthCheckGracePeriod != null) return false;
            if (this.healthCheckType != null ? !this.healthCheckType.equals(that.healthCheckType) : that.healthCheckType != null) return false;
            if (this.initialLifecycleHook != null ? !this.initialLifecycleHook.equals(that.initialLifecycleHook) : that.initialLifecycleHook != null) return false;
            if (this.launchConfiguration != null ? !this.launchConfiguration.equals(that.launchConfiguration) : that.launchConfiguration != null) return false;
            if (this.launchTemplate != null ? !this.launchTemplate.equals(that.launchTemplate) : that.launchTemplate != null) return false;
            if (this.loadBalancers != null ? !this.loadBalancers.equals(that.loadBalancers) : that.loadBalancers != null) return false;
            if (this.maxInstanceLifetime != null ? !this.maxInstanceLifetime.equals(that.maxInstanceLifetime) : that.maxInstanceLifetime != null) return false;
            if (this.metricsGranularity != null ? !this.metricsGranularity.equals(that.metricsGranularity) : that.metricsGranularity != null) return false;
            if (this.minElbCapacity != null ? !this.minElbCapacity.equals(that.minElbCapacity) : that.minElbCapacity != null) return false;
            if (this.mixedInstancesPolicy != null ? !this.mixedInstancesPolicy.equals(that.mixedInstancesPolicy) : that.mixedInstancesPolicy != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.placementGroup != null ? !this.placementGroup.equals(that.placementGroup) : that.placementGroup != null) return false;
            if (this.protectFromScaleIn != null ? !this.protectFromScaleIn.equals(that.protectFromScaleIn) : that.protectFromScaleIn != null) return false;
            if (this.serviceLinkedRoleArn != null ? !this.serviceLinkedRoleArn.equals(that.serviceLinkedRoleArn) : that.serviceLinkedRoleArn != null) return false;
            if (this.suspendedProcesses != null ? !this.suspendedProcesses.equals(that.suspendedProcesses) : that.suspendedProcesses != null) return false;
            if (this.tag != null ? !this.tag.equals(that.tag) : that.tag != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.targetGroupArns != null ? !this.targetGroupArns.equals(that.targetGroupArns) : that.targetGroupArns != null) return false;
            if (this.terminationPolicies != null ? !this.terminationPolicies.equals(that.terminationPolicies) : that.terminationPolicies != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.vpcZoneIdentifier != null ? !this.vpcZoneIdentifier.equals(that.vpcZoneIdentifier) : that.vpcZoneIdentifier != null) return false;
            if (this.waitForCapacityTimeout != null ? !this.waitForCapacityTimeout.equals(that.waitForCapacityTimeout) : that.waitForCapacityTimeout != null) return false;
            if (this.waitForElbCapacity != null ? !this.waitForElbCapacity.equals(that.waitForElbCapacity) : that.waitForElbCapacity != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxSize.hashCode();
            result = 31 * result + (this.minSize.hashCode());
            result = 31 * result + (this.availabilityZones != null ? this.availabilityZones.hashCode() : 0);
            result = 31 * result + (this.defaultCooldown != null ? this.defaultCooldown.hashCode() : 0);
            result = 31 * result + (this.desiredCapacity != null ? this.desiredCapacity.hashCode() : 0);
            result = 31 * result + (this.enabledMetrics != null ? this.enabledMetrics.hashCode() : 0);
            result = 31 * result + (this.forceDelete != null ? this.forceDelete.hashCode() : 0);
            result = 31 * result + (this.healthCheckGracePeriod != null ? this.healthCheckGracePeriod.hashCode() : 0);
            result = 31 * result + (this.healthCheckType != null ? this.healthCheckType.hashCode() : 0);
            result = 31 * result + (this.initialLifecycleHook != null ? this.initialLifecycleHook.hashCode() : 0);
            result = 31 * result + (this.launchConfiguration != null ? this.launchConfiguration.hashCode() : 0);
            result = 31 * result + (this.launchTemplate != null ? this.launchTemplate.hashCode() : 0);
            result = 31 * result + (this.loadBalancers != null ? this.loadBalancers.hashCode() : 0);
            result = 31 * result + (this.maxInstanceLifetime != null ? this.maxInstanceLifetime.hashCode() : 0);
            result = 31 * result + (this.metricsGranularity != null ? this.metricsGranularity.hashCode() : 0);
            result = 31 * result + (this.minElbCapacity != null ? this.minElbCapacity.hashCode() : 0);
            result = 31 * result + (this.mixedInstancesPolicy != null ? this.mixedInstancesPolicy.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.placementGroup != null ? this.placementGroup.hashCode() : 0);
            result = 31 * result + (this.protectFromScaleIn != null ? this.protectFromScaleIn.hashCode() : 0);
            result = 31 * result + (this.serviceLinkedRoleArn != null ? this.serviceLinkedRoleArn.hashCode() : 0);
            result = 31 * result + (this.suspendedProcesses != null ? this.suspendedProcesses.hashCode() : 0);
            result = 31 * result + (this.tag != null ? this.tag.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.targetGroupArns != null ? this.targetGroupArns.hashCode() : 0);
            result = 31 * result + (this.terminationPolicies != null ? this.terminationPolicies.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.vpcZoneIdentifier != null ? this.vpcZoneIdentifier.hashCode() : 0);
            result = 31 * result + (this.waitForCapacityTimeout != null ? this.waitForCapacityTimeout.hashCode() : 0);
            result = 31 * result + (this.waitForElbCapacity != null ? this.waitForElbCapacity.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
