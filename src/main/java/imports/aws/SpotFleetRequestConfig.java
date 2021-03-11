package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.882Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotFleetRequestConfig")
@software.amazon.jsii.Jsii.Proxy(SpotFleetRequestConfig.Jsii$Proxy.class)
public interface SpotFleetRequestConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getIamFleetRole();

    @org.jetbrains.annotations.NotNull java.lang.Number getTargetCapacity();

    default @org.jetbrains.annotations.Nullable java.lang.String getAllocationStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getExcessCapacityTerminationPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFleetType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceInterruptionBehaviour() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getInstancePoolsToUseCount() {
        return null;
    }

    /**
     * launch_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchSpecification> getLaunchSpecification() {
        return null;
    }

    /**
     * launch_template_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReplaceUnhealthyInstances() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotPrice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTargetGroupArns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminateInstancesWithExpiration() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.SpotFleetRequestTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getValidFrom() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getValidUntil() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getWaitForFulfillment() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotFleetRequestConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotFleetRequestConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotFleetRequestConfig> {
        private java.lang.String iamFleetRole;
        private java.lang.Number targetCapacity;
        private java.lang.String allocationStrategy;
        private java.lang.String excessCapacityTerminationPolicy;
        private java.lang.String fleetType;
        private java.lang.String instanceInterruptionBehaviour;
        private java.lang.Number instancePoolsToUseCount;
        private java.util.List<imports.aws.SpotFleetRequestLaunchSpecification> launchSpecification;
        private java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig> launchTemplateConfig;
        private java.util.List<java.lang.String> loadBalancers;
        private java.lang.Boolean replaceUnhealthyInstances;
        private java.lang.String spotPrice;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<java.lang.String> targetGroupArns;
        private java.lang.Boolean terminateInstancesWithExpiration;
        private imports.aws.SpotFleetRequestTimeouts timeouts;
        private java.lang.String validFrom;
        private java.lang.String validUntil;
        private java.lang.Boolean waitForFulfillment;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getIamFleetRole}
         * @param iamFleetRole the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder iamFleetRole(java.lang.String iamFleetRole) {
            this.iamFleetRole = iamFleetRole;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getTargetCapacity}
         * @param targetCapacity the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetCapacity(java.lang.Number targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getAllocationStrategy}
         * @param allocationStrategy the value to be set.
         * @return {@code this}
         */
        public Builder allocationStrategy(java.lang.String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getExcessCapacityTerminationPolicy}
         * @param excessCapacityTerminationPolicy the value to be set.
         * @return {@code this}
         */
        public Builder excessCapacityTerminationPolicy(java.lang.String excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getFleetType}
         * @param fleetType the value to be set.
         * @return {@code this}
         */
        public Builder fleetType(java.lang.String fleetType) {
            this.fleetType = fleetType;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getInstanceInterruptionBehaviour}
         * @param instanceInterruptionBehaviour the value to be set.
         * @return {@code this}
         */
        public Builder instanceInterruptionBehaviour(java.lang.String instanceInterruptionBehaviour) {
            this.instanceInterruptionBehaviour = instanceInterruptionBehaviour;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getInstancePoolsToUseCount}
         * @param instancePoolsToUseCount the value to be set.
         * @return {@code this}
         */
        public Builder instancePoolsToUseCount(java.lang.Number instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getLaunchSpecification}
         * @param launchSpecification launch_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder launchSpecification(java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecification> launchSpecification) {
            this.launchSpecification = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecification>)launchSpecification;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getLaunchTemplateConfig}
         * @param launchTemplateConfig launch_template_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder launchTemplateConfig(java.util.List<? extends imports.aws.SpotFleetRequestLaunchTemplateConfig> launchTemplateConfig) {
            this.launchTemplateConfig = (java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig>)launchTemplateConfig;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getLoadBalancers}
         * @param loadBalancers the value to be set.
         * @return {@code this}
         */
        public Builder loadBalancers(java.util.List<java.lang.String> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getReplaceUnhealthyInstances}
         * @param replaceUnhealthyInstances the value to be set.
         * @return {@code this}
         */
        public Builder replaceUnhealthyInstances(java.lang.Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getSpotPrice}
         * @param spotPrice the value to be set.
         * @return {@code this}
         */
        public Builder spotPrice(java.lang.String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getTargetGroupArns}
         * @param targetGroupArns the value to be set.
         * @return {@code this}
         */
        public Builder targetGroupArns(java.util.List<java.lang.String> targetGroupArns) {
            this.targetGroupArns = targetGroupArns;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getTerminateInstancesWithExpiration}
         * @param terminateInstancesWithExpiration the value to be set.
         * @return {@code this}
         */
        public Builder terminateInstancesWithExpiration(java.lang.Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.SpotFleetRequestTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getValidFrom}
         * @param validFrom the value to be set.
         * @return {@code this}
         */
        public Builder validFrom(java.lang.String validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getValidUntil}
         * @param validUntil the value to be set.
         * @return {@code this}
         */
        public Builder validUntil(java.lang.String validUntil) {
            this.validUntil = validUntil;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getWaitForFulfillment}
         * @param waitForFulfillment the value to be set.
         * @return {@code this}
         */
        public Builder waitForFulfillment(java.lang.Boolean waitForFulfillment) {
            this.waitForFulfillment = waitForFulfillment;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getDependsOn}
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
         * Sets the value of {@link SpotFleetRequestConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestConfig#getProvider}
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
         * @return a new instance of {@link SpotFleetRequestConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotFleetRequestConfig build() {
            return new Jsii$Proxy(iamFleetRole, targetCapacity, allocationStrategy, excessCapacityTerminationPolicy, fleetType, instanceInterruptionBehaviour, instancePoolsToUseCount, launchSpecification, launchTemplateConfig, loadBalancers, replaceUnhealthyInstances, spotPrice, tags, targetGroupArns, terminateInstancesWithExpiration, timeouts, validFrom, validUntil, waitForFulfillment, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SpotFleetRequestConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotFleetRequestConfig {
        private final java.lang.String iamFleetRole;
        private final java.lang.Number targetCapacity;
        private final java.lang.String allocationStrategy;
        private final java.lang.String excessCapacityTerminationPolicy;
        private final java.lang.String fleetType;
        private final java.lang.String instanceInterruptionBehaviour;
        private final java.lang.Number instancePoolsToUseCount;
        private final java.util.List<imports.aws.SpotFleetRequestLaunchSpecification> launchSpecification;
        private final java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig> launchTemplateConfig;
        private final java.util.List<java.lang.String> loadBalancers;
        private final java.lang.Boolean replaceUnhealthyInstances;
        private final java.lang.String spotPrice;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<java.lang.String> targetGroupArns;
        private final java.lang.Boolean terminateInstancesWithExpiration;
        private final imports.aws.SpotFleetRequestTimeouts timeouts;
        private final java.lang.String validFrom;
        private final java.lang.String validUntil;
        private final java.lang.Boolean waitForFulfillment;
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
            this.iamFleetRole = software.amazon.jsii.Kernel.get(this, "iamFleetRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetCapacity = software.amazon.jsii.Kernel.get(this, "targetCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.allocationStrategy = software.amazon.jsii.Kernel.get(this, "allocationStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excessCapacityTerminationPolicy = software.amazon.jsii.Kernel.get(this, "excessCapacityTerminationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fleetType = software.amazon.jsii.Kernel.get(this, "fleetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceInterruptionBehaviour = software.amazon.jsii.Kernel.get(this, "instanceInterruptionBehaviour", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instancePoolsToUseCount = software.amazon.jsii.Kernel.get(this, "instancePoolsToUseCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.launchSpecification = software.amazon.jsii.Kernel.get(this, "launchSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchSpecification.class)));
            this.launchTemplateConfig = software.amazon.jsii.Kernel.get(this, "launchTemplateConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchTemplateConfig.class)));
            this.loadBalancers = software.amazon.jsii.Kernel.get(this, "loadBalancers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.replaceUnhealthyInstances = software.amazon.jsii.Kernel.get(this, "replaceUnhealthyInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.spotPrice = software.amazon.jsii.Kernel.get(this, "spotPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.targetGroupArns = software.amazon.jsii.Kernel.get(this, "targetGroupArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.terminateInstancesWithExpiration = software.amazon.jsii.Kernel.get(this, "terminateInstancesWithExpiration", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestTimeouts.class));
            this.validFrom = software.amazon.jsii.Kernel.get(this, "validFrom", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.validUntil = software.amazon.jsii.Kernel.get(this, "validUntil", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.waitForFulfillment = software.amazon.jsii.Kernel.get(this, "waitForFulfillment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String iamFleetRole, final java.lang.Number targetCapacity, final java.lang.String allocationStrategy, final java.lang.String excessCapacityTerminationPolicy, final java.lang.String fleetType, final java.lang.String instanceInterruptionBehaviour, final java.lang.Number instancePoolsToUseCount, final java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecification> launchSpecification, final java.util.List<? extends imports.aws.SpotFleetRequestLaunchTemplateConfig> launchTemplateConfig, final java.util.List<java.lang.String> loadBalancers, final java.lang.Boolean replaceUnhealthyInstances, final java.lang.String spotPrice, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<java.lang.String> targetGroupArns, final java.lang.Boolean terminateInstancesWithExpiration, final imports.aws.SpotFleetRequestTimeouts timeouts, final java.lang.String validFrom, final java.lang.String validUntil, final java.lang.Boolean waitForFulfillment, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.iamFleetRole = java.util.Objects.requireNonNull(iamFleetRole, "iamFleetRole is required");
            this.targetCapacity = java.util.Objects.requireNonNull(targetCapacity, "targetCapacity is required");
            this.allocationStrategy = allocationStrategy;
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            this.fleetType = fleetType;
            this.instanceInterruptionBehaviour = instanceInterruptionBehaviour;
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            this.launchSpecification = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecification>)launchSpecification;
            this.launchTemplateConfig = (java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig>)launchTemplateConfig;
            this.loadBalancers = loadBalancers;
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            this.spotPrice = spotPrice;
            this.tags = tags;
            this.targetGroupArns = targetGroupArns;
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            this.timeouts = timeouts;
            this.validFrom = validFrom;
            this.validUntil = validUntil;
            this.waitForFulfillment = waitForFulfillment;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getIamFleetRole() {
            return this.iamFleetRole;
        }

        @Override
        public final java.lang.Number getTargetCapacity() {
            return this.targetCapacity;
        }

        @Override
        public final java.lang.String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        @Override
        public final java.lang.String getExcessCapacityTerminationPolicy() {
            return this.excessCapacityTerminationPolicy;
        }

        @Override
        public final java.lang.String getFleetType() {
            return this.fleetType;
        }

        @Override
        public final java.lang.String getInstanceInterruptionBehaviour() {
            return this.instanceInterruptionBehaviour;
        }

        @Override
        public final java.lang.Number getInstancePoolsToUseCount() {
            return this.instancePoolsToUseCount;
        }

        @Override
        public final java.util.List<imports.aws.SpotFleetRequestLaunchSpecification> getLaunchSpecification() {
            return this.launchSpecification;
        }

        @Override
        public final java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
            return this.launchTemplateConfig;
        }

        @Override
        public final java.util.List<java.lang.String> getLoadBalancers() {
            return this.loadBalancers;
        }

        @Override
        public final java.lang.Boolean getReplaceUnhealthyInstances() {
            return this.replaceUnhealthyInstances;
        }

        @Override
        public final java.lang.String getSpotPrice() {
            return this.spotPrice;
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
        public final java.lang.Boolean getTerminateInstancesWithExpiration() {
            return this.terminateInstancesWithExpiration;
        }

        @Override
        public final imports.aws.SpotFleetRequestTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getValidFrom() {
            return this.validFrom;
        }

        @Override
        public final java.lang.String getValidUntil() {
            return this.validUntil;
        }

        @Override
        public final java.lang.Boolean getWaitForFulfillment() {
            return this.waitForFulfillment;
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

            data.set("iamFleetRole", om.valueToTree(this.getIamFleetRole()));
            data.set("targetCapacity", om.valueToTree(this.getTargetCapacity()));
            if (this.getAllocationStrategy() != null) {
                data.set("allocationStrategy", om.valueToTree(this.getAllocationStrategy()));
            }
            if (this.getExcessCapacityTerminationPolicy() != null) {
                data.set("excessCapacityTerminationPolicy", om.valueToTree(this.getExcessCapacityTerminationPolicy()));
            }
            if (this.getFleetType() != null) {
                data.set("fleetType", om.valueToTree(this.getFleetType()));
            }
            if (this.getInstanceInterruptionBehaviour() != null) {
                data.set("instanceInterruptionBehaviour", om.valueToTree(this.getInstanceInterruptionBehaviour()));
            }
            if (this.getInstancePoolsToUseCount() != null) {
                data.set("instancePoolsToUseCount", om.valueToTree(this.getInstancePoolsToUseCount()));
            }
            if (this.getLaunchSpecification() != null) {
                data.set("launchSpecification", om.valueToTree(this.getLaunchSpecification()));
            }
            if (this.getLaunchTemplateConfig() != null) {
                data.set("launchTemplateConfig", om.valueToTree(this.getLaunchTemplateConfig()));
            }
            if (this.getLoadBalancers() != null) {
                data.set("loadBalancers", om.valueToTree(this.getLoadBalancers()));
            }
            if (this.getReplaceUnhealthyInstances() != null) {
                data.set("replaceUnhealthyInstances", om.valueToTree(this.getReplaceUnhealthyInstances()));
            }
            if (this.getSpotPrice() != null) {
                data.set("spotPrice", om.valueToTree(this.getSpotPrice()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTargetGroupArns() != null) {
                data.set("targetGroupArns", om.valueToTree(this.getTargetGroupArns()));
            }
            if (this.getTerminateInstancesWithExpiration() != null) {
                data.set("terminateInstancesWithExpiration", om.valueToTree(this.getTerminateInstancesWithExpiration()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getValidFrom() != null) {
                data.set("validFrom", om.valueToTree(this.getValidFrom()));
            }
            if (this.getValidUntil() != null) {
                data.set("validUntil", om.valueToTree(this.getValidUntil()));
            }
            if (this.getWaitForFulfillment() != null) {
                data.set("waitForFulfillment", om.valueToTree(this.getWaitForFulfillment()));
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
            struct.set("fqn", om.valueToTree("aws.SpotFleetRequestConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotFleetRequestConfig.Jsii$Proxy that = (SpotFleetRequestConfig.Jsii$Proxy) o;

            if (!iamFleetRole.equals(that.iamFleetRole)) return false;
            if (!targetCapacity.equals(that.targetCapacity)) return false;
            if (this.allocationStrategy != null ? !this.allocationStrategy.equals(that.allocationStrategy) : that.allocationStrategy != null) return false;
            if (this.excessCapacityTerminationPolicy != null ? !this.excessCapacityTerminationPolicy.equals(that.excessCapacityTerminationPolicy) : that.excessCapacityTerminationPolicy != null) return false;
            if (this.fleetType != null ? !this.fleetType.equals(that.fleetType) : that.fleetType != null) return false;
            if (this.instanceInterruptionBehaviour != null ? !this.instanceInterruptionBehaviour.equals(that.instanceInterruptionBehaviour) : that.instanceInterruptionBehaviour != null) return false;
            if (this.instancePoolsToUseCount != null ? !this.instancePoolsToUseCount.equals(that.instancePoolsToUseCount) : that.instancePoolsToUseCount != null) return false;
            if (this.launchSpecification != null ? !this.launchSpecification.equals(that.launchSpecification) : that.launchSpecification != null) return false;
            if (this.launchTemplateConfig != null ? !this.launchTemplateConfig.equals(that.launchTemplateConfig) : that.launchTemplateConfig != null) return false;
            if (this.loadBalancers != null ? !this.loadBalancers.equals(that.loadBalancers) : that.loadBalancers != null) return false;
            if (this.replaceUnhealthyInstances != null ? !this.replaceUnhealthyInstances.equals(that.replaceUnhealthyInstances) : that.replaceUnhealthyInstances != null) return false;
            if (this.spotPrice != null ? !this.spotPrice.equals(that.spotPrice) : that.spotPrice != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.targetGroupArns != null ? !this.targetGroupArns.equals(that.targetGroupArns) : that.targetGroupArns != null) return false;
            if (this.terminateInstancesWithExpiration != null ? !this.terminateInstancesWithExpiration.equals(that.terminateInstancesWithExpiration) : that.terminateInstancesWithExpiration != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.validFrom != null ? !this.validFrom.equals(that.validFrom) : that.validFrom != null) return false;
            if (this.validUntil != null ? !this.validUntil.equals(that.validUntil) : that.validUntil != null) return false;
            if (this.waitForFulfillment != null ? !this.waitForFulfillment.equals(that.waitForFulfillment) : that.waitForFulfillment != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.iamFleetRole.hashCode();
            result = 31 * result + (this.targetCapacity.hashCode());
            result = 31 * result + (this.allocationStrategy != null ? this.allocationStrategy.hashCode() : 0);
            result = 31 * result + (this.excessCapacityTerminationPolicy != null ? this.excessCapacityTerminationPolicy.hashCode() : 0);
            result = 31 * result + (this.fleetType != null ? this.fleetType.hashCode() : 0);
            result = 31 * result + (this.instanceInterruptionBehaviour != null ? this.instanceInterruptionBehaviour.hashCode() : 0);
            result = 31 * result + (this.instancePoolsToUseCount != null ? this.instancePoolsToUseCount.hashCode() : 0);
            result = 31 * result + (this.launchSpecification != null ? this.launchSpecification.hashCode() : 0);
            result = 31 * result + (this.launchTemplateConfig != null ? this.launchTemplateConfig.hashCode() : 0);
            result = 31 * result + (this.loadBalancers != null ? this.loadBalancers.hashCode() : 0);
            result = 31 * result + (this.replaceUnhealthyInstances != null ? this.replaceUnhealthyInstances.hashCode() : 0);
            result = 31 * result + (this.spotPrice != null ? this.spotPrice.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.targetGroupArns != null ? this.targetGroupArns.hashCode() : 0);
            result = 31 * result + (this.terminateInstancesWithExpiration != null ? this.terminateInstancesWithExpiration.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.validFrom != null ? this.validFrom.hashCode() : 0);
            result = 31 * result + (this.validUntil != null ? this.validUntil.hashCode() : 0);
            result = 31 * result + (this.waitForFulfillment != null ? this.waitForFulfillment.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
