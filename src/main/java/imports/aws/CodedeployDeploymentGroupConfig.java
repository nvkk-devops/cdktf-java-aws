package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.176Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentGroupConfig")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentGroupConfig.Jsii$Proxy.class)
public interface CodedeployDeploymentGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAppName();

    @org.jetbrains.annotations.NotNull java.lang.String getDeploymentGroupName();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn();

    /**
     * alarm_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration> getAlarmConfiguration() {
        return null;
    }

    /**
     * auto_rollback_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> getAutoRollbackConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAutoscalingGroups() {
        return null;
    }

    /**
     * blue_green_deployment_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> getBlueGreenDeploymentConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeploymentConfigName() {
        return null;
    }

    /**
     * deployment_style block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle> getDeploymentStyle() {
        return null;
    }

    /**
     * ec2_tag_filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter> getEc2TagFilter() {
        return null;
    }

    /**
     * ec2_tag_set block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet> getEc2TagSet() {
        return null;
    }

    /**
     * ecs_service block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupEcsService> getEcsService() {
        return null;
    }

    /**
     * load_balancer_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> getLoadBalancerInfo() {
        return null;
    }

    /**
     * on_premises_instance_tag_filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> getOnPremisesInstanceTagFilter() {
        return null;
    }

    /**
     * trigger_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration> getTriggerConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentGroupConfig> {
        private java.lang.String appName;
        private java.lang.String deploymentGroupName;
        private java.lang.String serviceRoleArn;
        private java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration> alarmConfiguration;
        private java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration;
        private java.util.List<java.lang.String> autoscalingGroups;
        private java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig;
        private java.lang.String deploymentConfigName;
        private java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle> deploymentStyle;
        private java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter> ec2TagFilter;
        private java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet> ec2TagSet;
        private java.util.List<imports.aws.CodedeployDeploymentGroupEcsService> ecsService;
        private java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> loadBalancerInfo;
        private java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> onPremisesInstanceTagFilter;
        private java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration> triggerConfiguration;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getAppName}
         * @param appName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder appName(java.lang.String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getDeploymentGroupName}
         * @param deploymentGroupName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder deploymentGroupName(java.lang.String deploymentGroupName) {
            this.deploymentGroupName = deploymentGroupName;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getServiceRoleArn}
         * @param serviceRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceRoleArn(java.lang.String serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getAlarmConfiguration}
         * @param alarmConfiguration alarm_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder alarmConfiguration(java.util.List<? extends imports.aws.CodedeployDeploymentGroupAlarmConfiguration> alarmConfiguration) {
            this.alarmConfiguration = (java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration>)alarmConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getAutoRollbackConfiguration}
         * @param autoRollbackConfiguration auto_rollback_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder autoRollbackConfiguration(java.util.List<? extends imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration) {
            this.autoRollbackConfiguration = (java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration>)autoRollbackConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getAutoscalingGroups}
         * @param autoscalingGroups the value to be set.
         * @return {@code this}
         */
        public Builder autoscalingGroups(java.util.List<java.lang.String> autoscalingGroups) {
            this.autoscalingGroups = autoscalingGroups;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getBlueGreenDeploymentConfig}
         * @param blueGreenDeploymentConfig blue_green_deployment_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder blueGreenDeploymentConfig(java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig) {
            this.blueGreenDeploymentConfig = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig>)blueGreenDeploymentConfig;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getDeploymentConfigName}
         * @param deploymentConfigName the value to be set.
         * @return {@code this}
         */
        public Builder deploymentConfigName(java.lang.String deploymentConfigName) {
            this.deploymentConfigName = deploymentConfigName;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getDeploymentStyle}
         * @param deploymentStyle deployment_style block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder deploymentStyle(java.util.List<? extends imports.aws.CodedeployDeploymentGroupDeploymentStyle> deploymentStyle) {
            this.deploymentStyle = (java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle>)deploymentStyle;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getEc2TagFilter}
         * @param ec2TagFilter ec2_tag_filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ec2TagFilter(java.util.List<? extends imports.aws.CodedeployDeploymentGroupEc2TagFilter> ec2TagFilter) {
            this.ec2TagFilter = (java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter>)ec2TagFilter;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getEc2TagSet}
         * @param ec2TagSet ec2_tag_set block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ec2TagSet(java.util.List<? extends imports.aws.CodedeployDeploymentGroupEc2TagSet> ec2TagSet) {
            this.ec2TagSet = (java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet>)ec2TagSet;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getEcsService}
         * @param ecsService ecs_service block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ecsService(java.util.List<? extends imports.aws.CodedeployDeploymentGroupEcsService> ecsService) {
            this.ecsService = (java.util.List<imports.aws.CodedeployDeploymentGroupEcsService>)ecsService;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getLoadBalancerInfo}
         * @param loadBalancerInfo load_balancer_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder loadBalancerInfo(java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> loadBalancerInfo) {
            this.loadBalancerInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo>)loadBalancerInfo;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getOnPremisesInstanceTagFilter}
         * @param onPremisesInstanceTagFilter on_premises_instance_tag_filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder onPremisesInstanceTagFilter(java.util.List<? extends imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> onPremisesInstanceTagFilter) {
            this.onPremisesInstanceTagFilter = (java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter>)onPremisesInstanceTagFilter;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getTriggerConfiguration}
         * @param triggerConfiguration trigger_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder triggerConfiguration(java.util.List<? extends imports.aws.CodedeployDeploymentGroupTriggerConfiguration> triggerConfiguration) {
            this.triggerConfiguration = (java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration>)triggerConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getDependsOn}
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
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupConfig#getProvider}
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
         * @return a new instance of {@link CodedeployDeploymentGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentGroupConfig build() {
            return new Jsii$Proxy(appName, deploymentGroupName, serviceRoleArn, alarmConfiguration, autoRollbackConfiguration, autoscalingGroups, blueGreenDeploymentConfig, deploymentConfigName, deploymentStyle, ec2TagFilter, ec2TagSet, ecsService, loadBalancerInfo, onPremisesInstanceTagFilter, triggerConfiguration, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentGroupConfig {
        private final java.lang.String appName;
        private final java.lang.String deploymentGroupName;
        private final java.lang.String serviceRoleArn;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration> alarmConfiguration;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration;
        private final java.util.List<java.lang.String> autoscalingGroups;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig;
        private final java.lang.String deploymentConfigName;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle> deploymentStyle;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter> ec2TagFilter;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet> ec2TagSet;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupEcsService> ecsService;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> loadBalancerInfo;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> onPremisesInstanceTagFilter;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration> triggerConfiguration;
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
            this.appName = software.amazon.jsii.Kernel.get(this, "appName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deploymentGroupName = software.amazon.jsii.Kernel.get(this, "deploymentGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceRoleArn = software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alarmConfiguration = software.amazon.jsii.Kernel.get(this, "alarmConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupAlarmConfiguration.class)));
            this.autoRollbackConfiguration = software.amazon.jsii.Kernel.get(this, "autoRollbackConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration.class)));
            this.autoscalingGroups = software.amazon.jsii.Kernel.get(this, "autoscalingGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.blueGreenDeploymentConfig = software.amazon.jsii.Kernel.get(this, "blueGreenDeploymentConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig.class)));
            this.deploymentConfigName = software.amazon.jsii.Kernel.get(this, "deploymentConfigName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deploymentStyle = software.amazon.jsii.Kernel.get(this, "deploymentStyle", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupDeploymentStyle.class)));
            this.ec2TagFilter = software.amazon.jsii.Kernel.get(this, "ec2TagFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEc2TagFilter.class)));
            this.ec2TagSet = software.amazon.jsii.Kernel.get(this, "ec2TagSet", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEc2TagSet.class)));
            this.ecsService = software.amazon.jsii.Kernel.get(this, "ecsService", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupEcsService.class)));
            this.loadBalancerInfo = software.amazon.jsii.Kernel.get(this, "loadBalancerInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfo.class)));
            this.onPremisesInstanceTagFilter = software.amazon.jsii.Kernel.get(this, "onPremisesInstanceTagFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter.class)));
            this.triggerConfiguration = software.amazon.jsii.Kernel.get(this, "triggerConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupTriggerConfiguration.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String appName, final java.lang.String deploymentGroupName, final java.lang.String serviceRoleArn, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupAlarmConfiguration> alarmConfiguration, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration, final java.util.List<java.lang.String> autoscalingGroups, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig, final java.lang.String deploymentConfigName, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupDeploymentStyle> deploymentStyle, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupEc2TagFilter> ec2TagFilter, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupEc2TagSet> ec2TagSet, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupEcsService> ecsService, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> loadBalancerInfo, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> onPremisesInstanceTagFilter, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupTriggerConfiguration> triggerConfiguration, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.appName = java.util.Objects.requireNonNull(appName, "appName is required");
            this.deploymentGroupName = java.util.Objects.requireNonNull(deploymentGroupName, "deploymentGroupName is required");
            this.serviceRoleArn = java.util.Objects.requireNonNull(serviceRoleArn, "serviceRoleArn is required");
            this.alarmConfiguration = (java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration>)alarmConfiguration;
            this.autoRollbackConfiguration = (java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration>)autoRollbackConfiguration;
            this.autoscalingGroups = autoscalingGroups;
            this.blueGreenDeploymentConfig = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig>)blueGreenDeploymentConfig;
            this.deploymentConfigName = deploymentConfigName;
            this.deploymentStyle = (java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle>)deploymentStyle;
            this.ec2TagFilter = (java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter>)ec2TagFilter;
            this.ec2TagSet = (java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet>)ec2TagSet;
            this.ecsService = (java.util.List<imports.aws.CodedeployDeploymentGroupEcsService>)ecsService;
            this.loadBalancerInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo>)loadBalancerInfo;
            this.onPremisesInstanceTagFilter = (java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter>)onPremisesInstanceTagFilter;
            this.triggerConfiguration = (java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration>)triggerConfiguration;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAppName() {
            return this.appName;
        }

        @Override
        public final java.lang.String getDeploymentGroupName() {
            return this.deploymentGroupName;
        }

        @Override
        public final java.lang.String getServiceRoleArn() {
            return this.serviceRoleArn;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupAlarmConfiguration> getAlarmConfiguration() {
            return this.alarmConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupAutoRollbackConfiguration> getAutoRollbackConfiguration() {
            return this.autoRollbackConfiguration;
        }

        @Override
        public final java.util.List<java.lang.String> getAutoscalingGroups() {
            return this.autoscalingGroups;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig> getBlueGreenDeploymentConfig() {
            return this.blueGreenDeploymentConfig;
        }

        @Override
        public final java.lang.String getDeploymentConfigName() {
            return this.deploymentConfigName;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupDeploymentStyle> getDeploymentStyle() {
            return this.deploymentStyle;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagFilter> getEc2TagFilter() {
            return this.ec2TagFilter;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupEc2TagSet> getEc2TagSet() {
            return this.ec2TagSet;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupEcsService> getEcsService() {
            return this.ecsService;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfo> getLoadBalancerInfo() {
            return this.loadBalancerInfo;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupOnPremisesInstanceTagFilter> getOnPremisesInstanceTagFilter() {
            return this.onPremisesInstanceTagFilter;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupTriggerConfiguration> getTriggerConfiguration() {
            return this.triggerConfiguration;
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

            data.set("appName", om.valueToTree(this.getAppName()));
            data.set("deploymentGroupName", om.valueToTree(this.getDeploymentGroupName()));
            data.set("serviceRoleArn", om.valueToTree(this.getServiceRoleArn()));
            if (this.getAlarmConfiguration() != null) {
                data.set("alarmConfiguration", om.valueToTree(this.getAlarmConfiguration()));
            }
            if (this.getAutoRollbackConfiguration() != null) {
                data.set("autoRollbackConfiguration", om.valueToTree(this.getAutoRollbackConfiguration()));
            }
            if (this.getAutoscalingGroups() != null) {
                data.set("autoscalingGroups", om.valueToTree(this.getAutoscalingGroups()));
            }
            if (this.getBlueGreenDeploymentConfig() != null) {
                data.set("blueGreenDeploymentConfig", om.valueToTree(this.getBlueGreenDeploymentConfig()));
            }
            if (this.getDeploymentConfigName() != null) {
                data.set("deploymentConfigName", om.valueToTree(this.getDeploymentConfigName()));
            }
            if (this.getDeploymentStyle() != null) {
                data.set("deploymentStyle", om.valueToTree(this.getDeploymentStyle()));
            }
            if (this.getEc2TagFilter() != null) {
                data.set("ec2TagFilter", om.valueToTree(this.getEc2TagFilter()));
            }
            if (this.getEc2TagSet() != null) {
                data.set("ec2TagSet", om.valueToTree(this.getEc2TagSet()));
            }
            if (this.getEcsService() != null) {
                data.set("ecsService", om.valueToTree(this.getEcsService()));
            }
            if (this.getLoadBalancerInfo() != null) {
                data.set("loadBalancerInfo", om.valueToTree(this.getLoadBalancerInfo()));
            }
            if (this.getOnPremisesInstanceTagFilter() != null) {
                data.set("onPremisesInstanceTagFilter", om.valueToTree(this.getOnPremisesInstanceTagFilter()));
            }
            if (this.getTriggerConfiguration() != null) {
                data.set("triggerConfiguration", om.valueToTree(this.getTriggerConfiguration()));
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
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentGroupConfig.Jsii$Proxy that = (CodedeployDeploymentGroupConfig.Jsii$Proxy) o;

            if (!appName.equals(that.appName)) return false;
            if (!deploymentGroupName.equals(that.deploymentGroupName)) return false;
            if (!serviceRoleArn.equals(that.serviceRoleArn)) return false;
            if (this.alarmConfiguration != null ? !this.alarmConfiguration.equals(that.alarmConfiguration) : that.alarmConfiguration != null) return false;
            if (this.autoRollbackConfiguration != null ? !this.autoRollbackConfiguration.equals(that.autoRollbackConfiguration) : that.autoRollbackConfiguration != null) return false;
            if (this.autoscalingGroups != null ? !this.autoscalingGroups.equals(that.autoscalingGroups) : that.autoscalingGroups != null) return false;
            if (this.blueGreenDeploymentConfig != null ? !this.blueGreenDeploymentConfig.equals(that.blueGreenDeploymentConfig) : that.blueGreenDeploymentConfig != null) return false;
            if (this.deploymentConfigName != null ? !this.deploymentConfigName.equals(that.deploymentConfigName) : that.deploymentConfigName != null) return false;
            if (this.deploymentStyle != null ? !this.deploymentStyle.equals(that.deploymentStyle) : that.deploymentStyle != null) return false;
            if (this.ec2TagFilter != null ? !this.ec2TagFilter.equals(that.ec2TagFilter) : that.ec2TagFilter != null) return false;
            if (this.ec2TagSet != null ? !this.ec2TagSet.equals(that.ec2TagSet) : that.ec2TagSet != null) return false;
            if (this.ecsService != null ? !this.ecsService.equals(that.ecsService) : that.ecsService != null) return false;
            if (this.loadBalancerInfo != null ? !this.loadBalancerInfo.equals(that.loadBalancerInfo) : that.loadBalancerInfo != null) return false;
            if (this.onPremisesInstanceTagFilter != null ? !this.onPremisesInstanceTagFilter.equals(that.onPremisesInstanceTagFilter) : that.onPremisesInstanceTagFilter != null) return false;
            if (this.triggerConfiguration != null ? !this.triggerConfiguration.equals(that.triggerConfiguration) : that.triggerConfiguration != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.appName.hashCode();
            result = 31 * result + (this.deploymentGroupName.hashCode());
            result = 31 * result + (this.serviceRoleArn.hashCode());
            result = 31 * result + (this.alarmConfiguration != null ? this.alarmConfiguration.hashCode() : 0);
            result = 31 * result + (this.autoRollbackConfiguration != null ? this.autoRollbackConfiguration.hashCode() : 0);
            result = 31 * result + (this.autoscalingGroups != null ? this.autoscalingGroups.hashCode() : 0);
            result = 31 * result + (this.blueGreenDeploymentConfig != null ? this.blueGreenDeploymentConfig.hashCode() : 0);
            result = 31 * result + (this.deploymentConfigName != null ? this.deploymentConfigName.hashCode() : 0);
            result = 31 * result + (this.deploymentStyle != null ? this.deploymentStyle.hashCode() : 0);
            result = 31 * result + (this.ec2TagFilter != null ? this.ec2TagFilter.hashCode() : 0);
            result = 31 * result + (this.ec2TagSet != null ? this.ec2TagSet.hashCode() : 0);
            result = 31 * result + (this.ecsService != null ? this.ecsService.hashCode() : 0);
            result = 31 * result + (this.loadBalancerInfo != null ? this.loadBalancerInfo.hashCode() : 0);
            result = 31 * result + (this.onPremisesInstanceTagFilter != null ? this.onPremisesInstanceTagFilter.hashCode() : 0);
            result = 31 * result + (this.triggerConfiguration != null ? this.triggerConfiguration.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
