package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.175Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentGroup")
public class CodedeployDeploymentGroup extends com.hashicorp.cdktf.TerraformResource {

    protected CodedeployDeploymentGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CodedeployDeploymentGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CodedeployDeploymentGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAlarmConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAlarmConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoRollbackConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAutoRollbackConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoscalingGroups() {
        software.amazon.jsii.Kernel.call(this, "resetAutoscalingGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlueGreenDeploymentConfig() {
        software.amazon.jsii.Kernel.call(this, "resetBlueGreenDeploymentConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentConfigName() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentConfigName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentStyle() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentStyle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEc2TagFilter() {
        software.amazon.jsii.Kernel.call(this, "resetEc2TagFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEc2TagSet() {
        software.amazon.jsii.Kernel.call(this, "resetEc2TagSet", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEcsService() {
        software.amazon.jsii.Kernel.call(this, "resetEcsService", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancerInfo() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancerInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOnPremisesInstanceTagFilter() {
        software.amazon.jsii.Kernel.call(this, "resetOnPremisesInstanceTagFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTriggerConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetTriggerConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAppNameInput() {
        return software.amazon.jsii.Kernel.get(this, "appNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration> getAlarmConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration>)(software.amazon.jsii.Kernel.get(this, "alarmConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupAlarmConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> getAutoRollbackConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration>)(software.amazon.jsii.Kernel.get(this, "autoRollbackConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAutoscalingGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "autoscalingGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> getBlueGreenDeploymentConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig>)(software.amazon.jsii.Kernel.get(this, "blueGreenDeploymentConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeploymentConfigNameInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle> getDeploymentStyleInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle>)(software.amazon.jsii.Kernel.get(this, "deploymentStyleInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupDeploymentStyle.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter> getEc2TagFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter>)(software.amazon.jsii.Kernel.get(this, "ec2TagFilterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEc2TagFilter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet> getEc2TagSetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet>)(software.amazon.jsii.Kernel.get(this, "ec2TagSetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEc2TagSet.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupEcsService> getEcsServiceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupEcsService>)(software.amazon.jsii.Kernel.get(this, "ecsServiceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEcsService.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> getLoadBalancerInfoInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo>)(software.amazon.jsii.Kernel.get(this, "loadBalancerInfoInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfo.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> getOnPremisesInstanceTagFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter>)(software.amazon.jsii.Kernel.get(this, "onPremisesInstanceTagFilterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration> getTriggerConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration>)(software.amazon.jsii.Kernel.get(this, "triggerConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupTriggerConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration> getAlarmConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "alarmConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupAlarmConfiguration.class))));
    }

    public void setAlarmConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "alarmConfiguration", java.util.Objects.requireNonNull(value, "alarmConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAppName() {
        return software.amazon.jsii.Kernel.get(this, "appName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAppName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "appName", java.util.Objects.requireNonNull(value, "appName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> getAutoRollbackConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "autoRollbackConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration.class))));
    }

    public void setAutoRollbackConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "autoRollbackConfiguration", java.util.Objects.requireNonNull(value, "autoRollbackConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAutoscalingGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "autoscalingGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAutoscalingGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "autoscalingGroups", java.util.Objects.requireNonNull(value, "autoscalingGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> getBlueGreenDeploymentConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "blueGreenDeploymentConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig.class))));
    }

    public void setBlueGreenDeploymentConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> value) {
        software.amazon.jsii.Kernel.set(this, "blueGreenDeploymentConfig", java.util.Objects.requireNonNull(value, "blueGreenDeploymentConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentConfigName() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentConfigName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentConfigName", java.util.Objects.requireNonNull(value, "deploymentConfigName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentGroupName() {
        return software.amazon.jsii.Kernel.get(this, "deploymentGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentGroupName", java.util.Objects.requireNonNull(value, "deploymentGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle> getDeploymentStyle() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "deploymentStyle", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupDeploymentStyle.class))));
    }

    public void setDeploymentStyle(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle> value) {
        software.amazon.jsii.Kernel.set(this, "deploymentStyle", java.util.Objects.requireNonNull(value, "deploymentStyle is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter> getEc2TagFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ec2TagFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEc2TagFilter.class))));
    }

    public void setEc2TagFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter> value) {
        software.amazon.jsii.Kernel.set(this, "ec2TagFilter", java.util.Objects.requireNonNull(value, "ec2TagFilter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet> getEc2TagSet() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ec2TagSet", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEc2TagSet.class))));
    }

    public void setEc2TagSet(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet> value) {
        software.amazon.jsii.Kernel.set(this, "ec2TagSet", java.util.Objects.requireNonNull(value, "ec2TagSet is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupEcsService> getEcsService() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ecsService", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEcsService.class))));
    }

    public void setEcsService(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupEcsService> value) {
        software.amazon.jsii.Kernel.set(this, "ecsService", java.util.Objects.requireNonNull(value, "ecsService is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> getLoadBalancerInfo() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loadBalancerInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfo.class))));
    }

    public void setLoadBalancerInfo(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerInfo", java.util.Objects.requireNonNull(value, "loadBalancerInfo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> getOnPremisesInstanceTagFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "onPremisesInstanceTagFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter.class))));
    }

    public void setOnPremisesInstanceTagFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> value) {
        software.amazon.jsii.Kernel.set(this, "onPremisesInstanceTagFilter", java.util.Objects.requireNonNull(value, "onPremisesInstanceTagFilter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRoleArn", java.util.Objects.requireNonNull(value, "serviceRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration> getTriggerConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "triggerConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupTriggerConfiguration.class))));
    }

    public void setTriggerConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "triggerConfiguration", java.util.Objects.requireNonNull(value, "triggerConfiguration is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CodedeployDeploymentGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CodedeployDeploymentGroup> {
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
        private final imports.aws.CodedeployDeploymentGroupConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CodedeployDeploymentGroupConfig.Builder();
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
         * @param appName This parameter is required.
         */
        public Builder appName(final java.lang.String appName) {
            this.config.appName(appName);
            return this;
        }

        /**
         * @return {@code this}
         * @param deploymentGroupName This parameter is required.
         */
        public Builder deploymentGroupName(final java.lang.String deploymentGroupName) {
            this.config.deploymentGroupName(deploymentGroupName);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceRoleArn This parameter is required.
         */
        public Builder serviceRoleArn(final java.lang.String serviceRoleArn) {
            this.config.serviceRoleArn(serviceRoleArn);
            return this;
        }

        /**
         * alarm_configuration block.
         * <p>
         * @return {@code this}
         * @param alarmConfiguration alarm_configuration block. This parameter is required.
         */
        public Builder alarmConfiguration(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupAlarmConfiguration> alarmConfiguration) {
            this.config.alarmConfiguration(alarmConfiguration);
            return this;
        }

        /**
         * auto_rollback_configuration block.
         * <p>
         * @return {@code this}
         * @param autoRollbackConfiguration auto_rollback_configuration block. This parameter is required.
         */
        public Builder autoRollbackConfiguration(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration) {
            this.config.autoRollbackConfiguration(autoRollbackConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoscalingGroups This parameter is required.
         */
        public Builder autoscalingGroups(final java.util.List<java.lang.String> autoscalingGroups) {
            this.config.autoscalingGroups(autoscalingGroups);
            return this;
        }

        /**
         * blue_green_deployment_config block.
         * <p>
         * @return {@code this}
         * @param blueGreenDeploymentConfig blue_green_deployment_config block. This parameter is required.
         */
        public Builder blueGreenDeploymentConfig(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig) {
            this.config.blueGreenDeploymentConfig(blueGreenDeploymentConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param deploymentConfigName This parameter is required.
         */
        public Builder deploymentConfigName(final java.lang.String deploymentConfigName) {
            this.config.deploymentConfigName(deploymentConfigName);
            return this;
        }

        /**
         * deployment_style block.
         * <p>
         * @return {@code this}
         * @param deploymentStyle deployment_style block. This parameter is required.
         */
        public Builder deploymentStyle(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupDeploymentStyle> deploymentStyle) {
            this.config.deploymentStyle(deploymentStyle);
            return this;
        }

        /**
         * ec2_tag_filter block.
         * <p>
         * @return {@code this}
         * @param ec2TagFilter ec2_tag_filter block. This parameter is required.
         */
        public Builder ec2TagFilter(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupEc2TagFilter> ec2TagFilter) {
            this.config.ec2TagFilter(ec2TagFilter);
            return this;
        }

        /**
         * ec2_tag_set block.
         * <p>
         * @return {@code this}
         * @param ec2TagSet ec2_tag_set block. This parameter is required.
         */
        public Builder ec2TagSet(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupEc2TagSet> ec2TagSet) {
            this.config.ec2TagSet(ec2TagSet);
            return this;
        }

        /**
         * ecs_service block.
         * <p>
         * @return {@code this}
         * @param ecsService ecs_service block. This parameter is required.
         */
        public Builder ecsService(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupEcsService> ecsService) {
            this.config.ecsService(ecsService);
            return this;
        }

        /**
         * load_balancer_info block.
         * <p>
         * @return {@code this}
         * @param loadBalancerInfo load_balancer_info block. This parameter is required.
         */
        public Builder loadBalancerInfo(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> loadBalancerInfo) {
            this.config.loadBalancerInfo(loadBalancerInfo);
            return this;
        }

        /**
         * on_premises_instance_tag_filter block.
         * <p>
         * @return {@code this}
         * @param onPremisesInstanceTagFilter on_premises_instance_tag_filter block. This parameter is required.
         */
        public Builder onPremisesInstanceTagFilter(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> onPremisesInstanceTagFilter) {
            this.config.onPremisesInstanceTagFilter(onPremisesInstanceTagFilter);
            return this;
        }

        /**
         * trigger_configuration block.
         * <p>
         * @return {@code this}
         * @param triggerConfiguration trigger_configuration block. This parameter is required.
         */
        public Builder triggerConfiguration(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupTriggerConfiguration> triggerConfiguration) {
            this.config.triggerConfiguration(triggerConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CodedeployDeploymentGroup}.
         */
        @Override
        public imports.aws.CodedeployDeploymentGroup build() {
            return new imports.aws.CodedeployDeploymentGroup(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
