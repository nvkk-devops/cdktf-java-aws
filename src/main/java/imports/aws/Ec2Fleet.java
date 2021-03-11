package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.487Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2Fleet")
public class Ec2Fleet extends com.hashicorp.cdktf.TerraformResource {

    protected Ec2Fleet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2Fleet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Ec2Fleet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Ec2FleetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetExcessCapacityTerminationPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetExcessCapacityTerminationPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOnDemandOptions() {
        software.amazon.jsii.Kernel.call(this, "resetOnDemandOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplaceUnhealthyInstances() {
        software.amazon.jsii.Kernel.call(this, "resetReplaceUnhealthyInstances", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpotOptions() {
        software.amazon.jsii.Kernel.call(this, "resetSpotOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminateInstances() {
        software.amazon.jsii.Kernel.call(this, "resetTerminateInstances", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminateInstancesWithExpiration() {
        software.amazon.jsii.Kernel.call(this, "resetTerminateInstancesWithExpiration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig> getLaunchTemplateConfigInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "launchTemplateConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetLaunchTemplateConfig.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification> getTargetCapacitySpecificationInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetCapacitySpecificationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetTargetCapacitySpecification.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExcessCapacityTerminationPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "excessCapacityTerminationPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2FleetOnDemandOptions> getOnDemandOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Ec2FleetOnDemandOptions>)(software.amazon.jsii.Kernel.get(this, "onDemandOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetOnDemandOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getReplaceUnhealthyInstancesInput() {
        return software.amazon.jsii.Kernel.get(this, "replaceUnhealthyInstancesInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2FleetSpotOptions> getSpotOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Ec2FleetSpotOptions>)(software.amazon.jsii.Kernel.get(this, "spotOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetSpotOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminateInstancesInput() {
        return software.amazon.jsii.Kernel.get(this, "terminateInstancesInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminateInstancesWithExpirationInput() {
        return software.amazon.jsii.Kernel.get(this, "terminateInstancesWithExpirationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.Ec2FleetTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExcessCapacityTerminationPolicy() {
        return software.amazon.jsii.Kernel.get(this, "excessCapacityTerminationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExcessCapacityTerminationPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "excessCapacityTerminationPolicy", java.util.Objects.requireNonNull(value, "excessCapacityTerminationPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig> getLaunchTemplateConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "launchTemplateConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetLaunchTemplateConfig.class))));
    }

    public void setLaunchTemplateConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig> value) {
        software.amazon.jsii.Kernel.set(this, "launchTemplateConfig", java.util.Objects.requireNonNull(value, "launchTemplateConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetOnDemandOptions> getOnDemandOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "onDemandOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetOnDemandOptions.class))));
    }

    public void setOnDemandOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetOnDemandOptions> value) {
        software.amazon.jsii.Kernel.set(this, "onDemandOptions", java.util.Objects.requireNonNull(value, "onDemandOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getReplaceUnhealthyInstances() {
        return software.amazon.jsii.Kernel.get(this, "replaceUnhealthyInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setReplaceUnhealthyInstances(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "replaceUnhealthyInstances", java.util.Objects.requireNonNull(value, "replaceUnhealthyInstances is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetSpotOptions> getSpotOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "spotOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetSpotOptions.class))));
    }

    public void setSpotOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetSpotOptions> value) {
        software.amazon.jsii.Kernel.set(this, "spotOptions", java.util.Objects.requireNonNull(value, "spotOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification> getTargetCapacitySpecification() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetCapacitySpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetTargetCapacitySpecification.class))));
    }

    public void setTargetCapacitySpecification(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification> value) {
        software.amazon.jsii.Kernel.set(this, "targetCapacitySpecification", java.util.Objects.requireNonNull(value, "targetCapacitySpecification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getTerminateInstances() {
        return software.amazon.jsii.Kernel.get(this, "terminateInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setTerminateInstances(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "terminateInstances", java.util.Objects.requireNonNull(value, "terminateInstances is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getTerminateInstancesWithExpiration() {
        return software.amazon.jsii.Kernel.get(this, "terminateInstancesWithExpiration", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setTerminateInstancesWithExpiration(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "terminateInstancesWithExpiration", java.util.Objects.requireNonNull(value, "terminateInstancesWithExpiration is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.Ec2FleetTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.Ec2FleetTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Ec2Fleet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Ec2Fleet> {
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
        private final imports.aws.Ec2FleetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Ec2FleetConfig.Builder();
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
         * launch_template_config block.
         * <p>
         * @return {@code this}
         * @param launchTemplateConfig launch_template_config block. This parameter is required.
         */
        public Builder launchTemplateConfig(final java.util.List<? extends imports.aws.Ec2FleetLaunchTemplateConfig> launchTemplateConfig) {
            this.config.launchTemplateConfig(launchTemplateConfig);
            return this;
        }

        /**
         * target_capacity_specification block.
         * <p>
         * @return {@code this}
         * @param targetCapacitySpecification target_capacity_specification block. This parameter is required.
         */
        public Builder targetCapacitySpecification(final java.util.List<? extends imports.aws.Ec2FleetTargetCapacitySpecification> targetCapacitySpecification) {
            this.config.targetCapacitySpecification(targetCapacitySpecification);
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
         * on_demand_options block.
         * <p>
         * @return {@code this}
         * @param onDemandOptions on_demand_options block. This parameter is required.
         */
        public Builder onDemandOptions(final java.util.List<? extends imports.aws.Ec2FleetOnDemandOptions> onDemandOptions) {
            this.config.onDemandOptions(onDemandOptions);
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
         * spot_options block.
         * <p>
         * @return {@code this}
         * @param spotOptions spot_options block. This parameter is required.
         */
        public Builder spotOptions(final java.util.List<? extends imports.aws.Ec2FleetSpotOptions> spotOptions) {
            this.config.spotOptions(spotOptions);
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
         * @param terminateInstances This parameter is required.
         */
        public Builder terminateInstances(final java.lang.Boolean terminateInstances) {
            this.config.terminateInstances(terminateInstances);
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
        public Builder timeouts(final imports.aws.Ec2FleetTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @return {@code this}
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Ec2Fleet}.
         */
        @Override
        public imports.aws.Ec2Fleet build() {
            return new imports.aws.Ec2Fleet(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
