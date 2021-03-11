package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.581Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GameliftFleet")
public class GameliftFleet extends com.hashicorp.cdktf.TerraformResource {

    protected GameliftFleet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GameliftFleet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GameliftFleet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GameliftFleetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEc2InboundPermission() {
        software.amazon.jsii.Kernel.call(this, "resetEc2InboundPermission", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFleetType() {
        software.amazon.jsii.Kernel.call(this, "resetFleetType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricGroups() {
        software.amazon.jsii.Kernel.call(this, "resetMetricGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNewGameSessionProtectionPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetNewGameSessionProtectionPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceCreationLimitPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetResourceCreationLimitPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRuntimeConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetRuntimeConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBuildIdInput() {
        return software.amazon.jsii.Kernel.get(this, "buildIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEc2InstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "ec2InstanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLogPaths() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logPaths", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOperatingSystem() {
        return software.amazon.jsii.Kernel.get(this, "operatingSystem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftFleetEc2InboundPermission> getEc2InboundPermissionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GameliftFleetEc2InboundPermission>)(software.amazon.jsii.Kernel.get(this, "ec2InboundPermissionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetEc2InboundPermission.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFleetTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "fleetTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMetricGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "metricGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNewGameSessionProtectionPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "newGameSessionProtectionPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy> getResourceCreationLimitPolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy>)(software.amazon.jsii.Kernel.get(this, "resourceCreationLimitPolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetResourceCreationLimitPolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftFleetRuntimeConfiguration> getRuntimeConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GameliftFleetRuntimeConfiguration>)(software.amazon.jsii.Kernel.get(this, "runtimeConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetRuntimeConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.GameliftFleetTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBuildId() {
        return software.amazon.jsii.Kernel.get(this, "buildId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBuildId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "buildId", java.util.Objects.requireNonNull(value, "buildId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GameliftFleetEc2InboundPermission> getEc2InboundPermission() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ec2InboundPermission", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetEc2InboundPermission.class))));
    }

    public void setEc2InboundPermission(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GameliftFleetEc2InboundPermission> value) {
        software.amazon.jsii.Kernel.set(this, "ec2InboundPermission", java.util.Objects.requireNonNull(value, "ec2InboundPermission is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEc2InstanceType() {
        return software.amazon.jsii.Kernel.get(this, "ec2InstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEc2InstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ec2InstanceType", java.util.Objects.requireNonNull(value, "ec2InstanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFleetType() {
        return software.amazon.jsii.Kernel.get(this, "fleetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFleetType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fleetType", java.util.Objects.requireNonNull(value, "fleetType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "instanceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceRoleArn", java.util.Objects.requireNonNull(value, "instanceRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMetricGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "metricGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMetricGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "metricGroups", java.util.Objects.requireNonNull(value, "metricGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNewGameSessionProtectionPolicy() {
        return software.amazon.jsii.Kernel.get(this, "newGameSessionProtectionPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNewGameSessionProtectionPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "newGameSessionProtectionPolicy", java.util.Objects.requireNonNull(value, "newGameSessionProtectionPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy> getResourceCreationLimitPolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "resourceCreationLimitPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetResourceCreationLimitPolicy.class))));
    }

    public void setResourceCreationLimitPolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy> value) {
        software.amazon.jsii.Kernel.set(this, "resourceCreationLimitPolicy", java.util.Objects.requireNonNull(value, "resourceCreationLimitPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GameliftFleetRuntimeConfiguration> getRuntimeConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "runtimeConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetRuntimeConfiguration.class))));
    }

    public void setRuntimeConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GameliftFleetRuntimeConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "runtimeConfiguration", java.util.Objects.requireNonNull(value, "runtimeConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.GameliftFleetTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.GameliftFleetTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GameliftFleet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GameliftFleet> {
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
        private final imports.aws.GameliftFleetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GameliftFleetConfig.Builder();
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
         * @param buildId This parameter is required.
         */
        public Builder buildId(final java.lang.String buildId) {
            this.config.buildId(buildId);
            return this;
        }

        /**
         * @return {@code this}
         * @param ec2InstanceType This parameter is required.
         */
        public Builder ec2InstanceType(final java.lang.String ec2InstanceType) {
            this.config.ec2InstanceType(ec2InstanceType);
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
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * ec2_inbound_permission block.
         * <p>
         * @return {@code this}
         * @param ec2InboundPermission ec2_inbound_permission block. This parameter is required.
         */
        public Builder ec2InboundPermission(final java.util.List<? extends imports.aws.GameliftFleetEc2InboundPermission> ec2InboundPermission) {
            this.config.ec2InboundPermission(ec2InboundPermission);
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
         * @param instanceRoleArn This parameter is required.
         */
        public Builder instanceRoleArn(final java.lang.String instanceRoleArn) {
            this.config.instanceRoleArn(instanceRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param metricGroups This parameter is required.
         */
        public Builder metricGroups(final java.util.List<java.lang.String> metricGroups) {
            this.config.metricGroups(metricGroups);
            return this;
        }

        /**
         * @return {@code this}
         * @param newGameSessionProtectionPolicy This parameter is required.
         */
        public Builder newGameSessionProtectionPolicy(final java.lang.String newGameSessionProtectionPolicy) {
            this.config.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
            return this;
        }

        /**
         * resource_creation_limit_policy block.
         * <p>
         * @return {@code this}
         * @param resourceCreationLimitPolicy resource_creation_limit_policy block. This parameter is required.
         */
        public Builder resourceCreationLimitPolicy(final java.util.List<? extends imports.aws.GameliftFleetResourceCreationLimitPolicy> resourceCreationLimitPolicy) {
            this.config.resourceCreationLimitPolicy(resourceCreationLimitPolicy);
            return this;
        }

        /**
         * runtime_configuration block.
         * <p>
         * @return {@code this}
         * @param runtimeConfiguration runtime_configuration block. This parameter is required.
         */
        public Builder runtimeConfiguration(final java.util.List<? extends imports.aws.GameliftFleetRuntimeConfiguration> runtimeConfiguration) {
            this.config.runtimeConfiguration(runtimeConfiguration);
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
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.GameliftFleetTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GameliftFleet}.
         */
        @Override
        public imports.aws.GameliftFleet build() {
            return new imports.aws.GameliftFleet(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
