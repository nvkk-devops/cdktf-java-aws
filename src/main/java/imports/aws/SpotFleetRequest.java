package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.881Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotFleetRequest")
public class SpotFleetRequest extends com.hashicorp.cdktf.TerraformResource {

    protected SpotFleetRequest(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SpotFleetRequest(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SpotFleetRequest(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SpotFleetRequestConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllocationStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetAllocationStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExcessCapacityTerminationPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetExcessCapacityTerminationPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFleetType() {
        software.amazon.jsii.Kernel.call(this, "resetFleetType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceInterruptionBehaviour() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceInterruptionBehaviour", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstancePoolsToUseCount() {
        software.amazon.jsii.Kernel.call(this, "resetInstancePoolsToUseCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchTemplateConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchTemplateConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancers() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplaceUnhealthyInstances() {
        software.amazon.jsii.Kernel.call(this, "resetReplaceUnhealthyInstances", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpotPrice() {
        software.amazon.jsii.Kernel.call(this, "resetSpotPrice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetGroupArns() {
        software.amazon.jsii.Kernel.call(this, "resetTargetGroupArns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminateInstancesWithExpiration() {
        software.amazon.jsii.Kernel.call(this, "resetTerminateInstancesWithExpiration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValidFrom() {
        software.amazon.jsii.Kernel.call(this, "resetValidFrom", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValidUntil() {
        software.amazon.jsii.Kernel.call(this, "resetValidUntil", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForFulfillment() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForFulfillment", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientToken() {
        return software.amazon.jsii.Kernel.get(this, "clientToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamFleetRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "iamFleetRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSpotRequestState() {
        return software.amazon.jsii.Kernel.get(this, "spotRequestState", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTargetCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "targetCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAllocationStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "allocationStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExcessCapacityTerminationPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "excessCapacityTerminationPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFleetTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "fleetTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceInterruptionBehaviourInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceInterruptionBehaviourInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInstancePoolsToUseCountInput() {
        return software.amazon.jsii.Kernel.get(this, "instancePoolsToUseCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchSpecification> getLaunchSpecificationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SpotFleetRequestLaunchSpecification>)(software.amazon.jsii.Kernel.get(this, "launchSpecificationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchSpecification.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig> getLaunchTemplateConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig>)(software.amazon.jsii.Kernel.get(this, "launchTemplateConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchTemplateConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "loadBalancersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getReplaceUnhealthyInstancesInput() {
        return software.amazon.jsii.Kernel.get(this, "replaceUnhealthyInstancesInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotPriceInput() {
        return software.amazon.jsii.Kernel.get(this, "spotPriceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTargetGroupArnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "targetGroupArnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminateInstancesWithExpirationInput() {
        return software.amazon.jsii.Kernel.get(this, "terminateInstancesWithExpirationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.SpotFleetRequestTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValidFromInput() {
        return software.amazon.jsii.Kernel.get(this, "validFromInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValidUntilInput() {
        return software.amazon.jsii.Kernel.get(this, "validUntilInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getWaitForFulfillmentInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForFulfillmentInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAllocationStrategy() {
        return software.amazon.jsii.Kernel.get(this, "allocationStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAllocationStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "allocationStrategy", java.util.Objects.requireNonNull(value, "allocationStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExcessCapacityTerminationPolicy() {
        return software.amazon.jsii.Kernel.get(this, "excessCapacityTerminationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExcessCapacityTerminationPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "excessCapacityTerminationPolicy", java.util.Objects.requireNonNull(value, "excessCapacityTerminationPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFleetType() {
        return software.amazon.jsii.Kernel.get(this, "fleetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFleetType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fleetType", java.util.Objects.requireNonNull(value, "fleetType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamFleetRole() {
        return software.amazon.jsii.Kernel.get(this, "iamFleetRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamFleetRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamFleetRole", java.util.Objects.requireNonNull(value, "iamFleetRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceInterruptionBehaviour() {
        return software.amazon.jsii.Kernel.get(this, "instanceInterruptionBehaviour", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceInterruptionBehaviour(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceInterruptionBehaviour", java.util.Objects.requireNonNull(value, "instanceInterruptionBehaviour is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInstancePoolsToUseCount() {
        return software.amazon.jsii.Kernel.get(this, "instancePoolsToUseCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInstancePoolsToUseCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "instancePoolsToUseCount", java.util.Objects.requireNonNull(value, "instancePoolsToUseCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SpotFleetRequestLaunchSpecification> getLaunchSpecification() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "launchSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchSpecification.class))));
    }

    public void setLaunchSpecification(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SpotFleetRequestLaunchSpecification> value) {
        software.amazon.jsii.Kernel.set(this, "launchSpecification", java.util.Objects.requireNonNull(value, "launchSpecification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "launchTemplateConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchTemplateConfig.class))));
    }

    public void setLaunchTemplateConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig> value) {
        software.amazon.jsii.Kernel.set(this, "launchTemplateConfig", java.util.Objects.requireNonNull(value, "launchTemplateConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLoadBalancers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loadBalancers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLoadBalancers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancers", java.util.Objects.requireNonNull(value, "loadBalancers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getReplaceUnhealthyInstances() {
        return software.amazon.jsii.Kernel.get(this, "replaceUnhealthyInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setReplaceUnhealthyInstances(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "replaceUnhealthyInstances", java.util.Objects.requireNonNull(value, "replaceUnhealthyInstances is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSpotPrice() {
        return software.amazon.jsii.Kernel.get(this, "spotPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotPrice(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotPrice", java.util.Objects.requireNonNull(value, "spotPrice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTargetCapacity() {
        return software.amazon.jsii.Kernel.get(this, "targetCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTargetCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "targetCapacity", java.util.Objects.requireNonNull(value, "targetCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTargetGroupArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetGroupArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTargetGroupArns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "targetGroupArns", java.util.Objects.requireNonNull(value, "targetGroupArns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getTerminateInstancesWithExpiration() {
        return software.amazon.jsii.Kernel.get(this, "terminateInstancesWithExpiration", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setTerminateInstancesWithExpiration(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "terminateInstancesWithExpiration", java.util.Objects.requireNonNull(value, "terminateInstancesWithExpiration is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.SpotFleetRequestTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.SpotFleetRequestTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getValidFrom() {
        return software.amazon.jsii.Kernel.get(this, "validFrom", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValidFrom(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "validFrom", java.util.Objects.requireNonNull(value, "validFrom is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getValidUntil() {
        return software.amazon.jsii.Kernel.get(this, "validUntil", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValidUntil(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "validUntil", java.util.Objects.requireNonNull(value, "validUntil is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getWaitForFulfillment() {
        return software.amazon.jsii.Kernel.get(this, "waitForFulfillment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setWaitForFulfillment(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "waitForFulfillment", java.util.Objects.requireNonNull(value, "waitForFulfillment is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SpotFleetRequest}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SpotFleetRequest> {
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
        private final imports.aws.SpotFleetRequestConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SpotFleetRequestConfig.Builder();
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
         * @param iamFleetRole This parameter is required.
         */
        public Builder iamFleetRole(final java.lang.String iamFleetRole) {
            this.config.iamFleetRole(iamFleetRole);
            return this;
        }

        /**
         * @return {@code this}
         * @param targetCapacity This parameter is required.
         */
        public Builder targetCapacity(final java.lang.Number targetCapacity) {
            this.config.targetCapacity(targetCapacity);
            return this;
        }

        /**
         * @return {@code this}
         * @param allocationStrategy This parameter is required.
         */
        public Builder allocationStrategy(final java.lang.String allocationStrategy) {
            this.config.allocationStrategy(allocationStrategy);
            return this;
        }

        /**
         * @return {@code this}
         * @param excessCapacityTerminationPolicy This parameter is required.
         */
        public Builder excessCapacityTerminationPolicy(final java.lang.String excessCapacityTerminationPolicy) {
            this.config.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param fleetType This parameter is required.
         */
        public Builder fleetType(final java.lang.String fleetType) {
            this.config.fleetType(fleetType);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceInterruptionBehaviour This parameter is required.
         */
        public Builder instanceInterruptionBehaviour(final java.lang.String instanceInterruptionBehaviour) {
            this.config.instanceInterruptionBehaviour(instanceInterruptionBehaviour);
            return this;
        }

        /**
         * @return {@code this}
         * @param instancePoolsToUseCount This parameter is required.
         */
        public Builder instancePoolsToUseCount(final java.lang.Number instancePoolsToUseCount) {
            this.config.instancePoolsToUseCount(instancePoolsToUseCount);
            return this;
        }

        /**
         * launch_specification block.
         * <p>
         * @return {@code this}
         * @param launchSpecification launch_specification block. This parameter is required.
         */
        public Builder launchSpecification(final java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecification> launchSpecification) {
            this.config.launchSpecification(launchSpecification);
            return this;
        }

        /**
         * launch_template_config block.
         * <p>
         * @return {@code this}
         * @param launchTemplateConfig launch_template_config block. This parameter is required.
         */
        public Builder launchTemplateConfig(final java.util.List<? extends imports.aws.SpotFleetRequestLaunchTemplateConfig> launchTemplateConfig) {
            this.config.launchTemplateConfig(launchTemplateConfig);
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
         * @param replaceUnhealthyInstances This parameter is required.
         */
        public Builder replaceUnhealthyInstances(final java.lang.Boolean replaceUnhealthyInstances) {
            this.config.replaceUnhealthyInstances(replaceUnhealthyInstances);
            return this;
        }

        /**
         * @return {@code this}
         * @param spotPrice This parameter is required.
         */
        public Builder spotPrice(final java.lang.String spotPrice) {
            this.config.spotPrice(spotPrice);
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
         * @param terminateInstancesWithExpiration This parameter is required.
         */
        public Builder terminateInstancesWithExpiration(final java.lang.Boolean terminateInstancesWithExpiration) {
            this.config.terminateInstancesWithExpiration(terminateInstancesWithExpiration);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.SpotFleetRequestTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @return {@code this}
         * @param validFrom This parameter is required.
         */
        public Builder validFrom(final java.lang.String validFrom) {
            this.config.validFrom(validFrom);
            return this;
        }

        /**
         * @return {@code this}
         * @param validUntil This parameter is required.
         */
        public Builder validUntil(final java.lang.String validUntil) {
            this.config.validUntil(validUntil);
            return this;
        }

        /**
         * @return {@code this}
         * @param waitForFulfillment This parameter is required.
         */
        public Builder waitForFulfillment(final java.lang.Boolean waitForFulfillment) {
            this.config.waitForFulfillment(waitForFulfillment);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SpotFleetRequest}.
         */
        @Override
        public imports.aws.SpotFleetRequest build() {
            return new imports.aws.SpotFleetRequest(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
