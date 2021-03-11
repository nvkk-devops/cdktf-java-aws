package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.514Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsServiceConfig")
@software.amazon.jsii.Jsii.Proxy(EcsServiceConfig.Jsii$Proxy.class)
public interface EcsServiceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * capacity_provider_strategy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceCapacityProviderStrategy> getCapacityProviderStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCluster() {
        return null;
    }

    /**
     * deployment_controller block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceDeploymentController> getDeploymentController() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMaximumPercent() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMinimumHealthyPercent() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDesiredCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableEcsManagedTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceNewDeployment() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckGracePeriodSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIamRole() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLaunchType() {
        return null;
    }

    /**
     * load_balancer block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceLoadBalancer> getLoadBalancer() {
        return null;
    }

    /**
     * network_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceNetworkConfiguration> getNetworkConfiguration() {
        return null;
    }

    /**
     * ordered_placement_strategy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy> getOrderedPlacementStrategy() {
        return null;
    }

    /**
     * placement_constraints block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServicePlacementConstraints> getPlacementConstraints() {
        return null;
    }

    /**
     * placement_strategy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServicePlacementStrategy> getPlacementStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlatformVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPropagateTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSchedulingStrategy() {
        return null;
    }

    /**
     * service_registries block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsServiceServiceRegistries> getServiceRegistries() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTaskDefinition() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.EcsServiceTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsServiceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsServiceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsServiceConfig> {
        private java.lang.String name;
        private java.util.List<imports.aws.EcsServiceCapacityProviderStrategy> capacityProviderStrategy;
        private java.lang.String cluster;
        private java.util.List<imports.aws.EcsServiceDeploymentController> deploymentController;
        private java.lang.Number deploymentMaximumPercent;
        private java.lang.Number deploymentMinimumHealthyPercent;
        private java.lang.Number desiredCount;
        private java.lang.Boolean enableEcsManagedTags;
        private java.lang.Boolean forceNewDeployment;
        private java.lang.Number healthCheckGracePeriodSeconds;
        private java.lang.String iamRole;
        private java.lang.String launchType;
        private java.util.List<imports.aws.EcsServiceLoadBalancer> loadBalancer;
        private java.util.List<imports.aws.EcsServiceNetworkConfiguration> networkConfiguration;
        private java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy> orderedPlacementStrategy;
        private java.util.List<imports.aws.EcsServicePlacementConstraints> placementConstraints;
        private java.util.List<imports.aws.EcsServicePlacementStrategy> placementStrategy;
        private java.lang.String platformVersion;
        private java.lang.String propagateTags;
        private java.lang.String schedulingStrategy;
        private java.util.List<imports.aws.EcsServiceServiceRegistries> serviceRegistries;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String taskDefinition;
        private imports.aws.EcsServiceTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EcsServiceConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getCapacityProviderStrategy}
         * @param capacityProviderStrategy capacity_provider_strategy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder capacityProviderStrategy(java.util.List<? extends imports.aws.EcsServiceCapacityProviderStrategy> capacityProviderStrategy) {
            this.capacityProviderStrategy = (java.util.List<imports.aws.EcsServiceCapacityProviderStrategy>)capacityProviderStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getCluster}
         * @param cluster the value to be set.
         * @return {@code this}
         */
        public Builder cluster(java.lang.String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDeploymentController}
         * @param deploymentController deployment_controller block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder deploymentController(java.util.List<? extends imports.aws.EcsServiceDeploymentController> deploymentController) {
            this.deploymentController = (java.util.List<imports.aws.EcsServiceDeploymentController>)deploymentController;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDeploymentMaximumPercent}
         * @param deploymentMaximumPercent the value to be set.
         * @return {@code this}
         */
        public Builder deploymentMaximumPercent(java.lang.Number deploymentMaximumPercent) {
            this.deploymentMaximumPercent = deploymentMaximumPercent;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDeploymentMinimumHealthyPercent}
         * @param deploymentMinimumHealthyPercent the value to be set.
         * @return {@code this}
         */
        public Builder deploymentMinimumHealthyPercent(java.lang.Number deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDesiredCount}
         * @param desiredCount the value to be set.
         * @return {@code this}
         */
        public Builder desiredCount(java.lang.Number desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getEnableEcsManagedTags}
         * @param enableEcsManagedTags the value to be set.
         * @return {@code this}
         */
        public Builder enableEcsManagedTags(java.lang.Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getForceNewDeployment}
         * @param forceNewDeployment the value to be set.
         * @return {@code this}
         */
        public Builder forceNewDeployment(java.lang.Boolean forceNewDeployment) {
            this.forceNewDeployment = forceNewDeployment;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getHealthCheckGracePeriodSeconds}
         * @param healthCheckGracePeriodSeconds the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckGracePeriodSeconds(java.lang.Number healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getIamRole}
         * @param iamRole the value to be set.
         * @return {@code this}
         */
        public Builder iamRole(java.lang.String iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getLaunchType}
         * @param launchType the value to be set.
         * @return {@code this}
         */
        public Builder launchType(java.lang.String launchType) {
            this.launchType = launchType;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getLoadBalancer}
         * @param loadBalancer load_balancer block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder loadBalancer(java.util.List<? extends imports.aws.EcsServiceLoadBalancer> loadBalancer) {
            this.loadBalancer = (java.util.List<imports.aws.EcsServiceLoadBalancer>)loadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getNetworkConfiguration}
         * @param networkConfiguration network_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder networkConfiguration(java.util.List<? extends imports.aws.EcsServiceNetworkConfiguration> networkConfiguration) {
            this.networkConfiguration = (java.util.List<imports.aws.EcsServiceNetworkConfiguration>)networkConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getOrderedPlacementStrategy}
         * @param orderedPlacementStrategy ordered_placement_strategy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder orderedPlacementStrategy(java.util.List<? extends imports.aws.EcsServiceOrderedPlacementStrategy> orderedPlacementStrategy) {
            this.orderedPlacementStrategy = (java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy>)orderedPlacementStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPlacementConstraints}
         * @param placementConstraints placement_constraints block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder placementConstraints(java.util.List<? extends imports.aws.EcsServicePlacementConstraints> placementConstraints) {
            this.placementConstraints = (java.util.List<imports.aws.EcsServicePlacementConstraints>)placementConstraints;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPlacementStrategy}
         * @param placementStrategy placement_strategy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder placementStrategy(java.util.List<? extends imports.aws.EcsServicePlacementStrategy> placementStrategy) {
            this.placementStrategy = (java.util.List<imports.aws.EcsServicePlacementStrategy>)placementStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPlatformVersion}
         * @param platformVersion the value to be set.
         * @return {@code this}
         */
        public Builder platformVersion(java.lang.String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPropagateTags}
         * @param propagateTags the value to be set.
         * @return {@code this}
         */
        public Builder propagateTags(java.lang.String propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getSchedulingStrategy}
         * @param schedulingStrategy the value to be set.
         * @return {@code this}
         */
        public Builder schedulingStrategy(java.lang.String schedulingStrategy) {
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getServiceRegistries}
         * @param serviceRegistries service_registries block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder serviceRegistries(java.util.List<? extends imports.aws.EcsServiceServiceRegistries> serviceRegistries) {
            this.serviceRegistries = (java.util.List<imports.aws.EcsServiceServiceRegistries>)serviceRegistries;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getTaskDefinition}
         * @param taskDefinition the value to be set.
         * @return {@code this}
         */
        public Builder taskDefinition(java.lang.String taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.EcsServiceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDependsOn}
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
         * Sets the value of {@link EcsServiceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getProvider}
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
         * @return a new instance of {@link EcsServiceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsServiceConfig build() {
            return new Jsii$Proxy(name, capacityProviderStrategy, cluster, deploymentController, deploymentMaximumPercent, deploymentMinimumHealthyPercent, desiredCount, enableEcsManagedTags, forceNewDeployment, healthCheckGracePeriodSeconds, iamRole, launchType, loadBalancer, networkConfiguration, orderedPlacementStrategy, placementConstraints, placementStrategy, platformVersion, propagateTags, schedulingStrategy, serviceRegistries, tags, taskDefinition, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EcsServiceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsServiceConfig {
        private final java.lang.String name;
        private final java.util.List<imports.aws.EcsServiceCapacityProviderStrategy> capacityProviderStrategy;
        private final java.lang.String cluster;
        private final java.util.List<imports.aws.EcsServiceDeploymentController> deploymentController;
        private final java.lang.Number deploymentMaximumPercent;
        private final java.lang.Number deploymentMinimumHealthyPercent;
        private final java.lang.Number desiredCount;
        private final java.lang.Boolean enableEcsManagedTags;
        private final java.lang.Boolean forceNewDeployment;
        private final java.lang.Number healthCheckGracePeriodSeconds;
        private final java.lang.String iamRole;
        private final java.lang.String launchType;
        private final java.util.List<imports.aws.EcsServiceLoadBalancer> loadBalancer;
        private final java.util.List<imports.aws.EcsServiceNetworkConfiguration> networkConfiguration;
        private final java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy> orderedPlacementStrategy;
        private final java.util.List<imports.aws.EcsServicePlacementConstraints> placementConstraints;
        private final java.util.List<imports.aws.EcsServicePlacementStrategy> placementStrategy;
        private final java.lang.String platformVersion;
        private final java.lang.String propagateTags;
        private final java.lang.String schedulingStrategy;
        private final java.util.List<imports.aws.EcsServiceServiceRegistries> serviceRegistries;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String taskDefinition;
        private final imports.aws.EcsServiceTimeouts timeouts;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.capacityProviderStrategy = software.amazon.jsii.Kernel.get(this, "capacityProviderStrategy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceCapacityProviderStrategy.class)));
            this.cluster = software.amazon.jsii.Kernel.get(this, "cluster", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deploymentController = software.amazon.jsii.Kernel.get(this, "deploymentController", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceDeploymentController.class)));
            this.deploymentMaximumPercent = software.amazon.jsii.Kernel.get(this, "deploymentMaximumPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.deploymentMinimumHealthyPercent = software.amazon.jsii.Kernel.get(this, "deploymentMinimumHealthyPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.desiredCount = software.amazon.jsii.Kernel.get(this, "desiredCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.enableEcsManagedTags = software.amazon.jsii.Kernel.get(this, "enableEcsManagedTags", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.forceNewDeployment = software.amazon.jsii.Kernel.get(this, "forceNewDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.healthCheckGracePeriodSeconds = software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.iamRole = software.amazon.jsii.Kernel.get(this, "iamRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchType = software.amazon.jsii.Kernel.get(this, "launchType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancer = software.amazon.jsii.Kernel.get(this, "loadBalancer", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceLoadBalancer.class)));
            this.networkConfiguration = software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceNetworkConfiguration.class)));
            this.orderedPlacementStrategy = software.amazon.jsii.Kernel.get(this, "orderedPlacementStrategy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceOrderedPlacementStrategy.class)));
            this.placementConstraints = software.amazon.jsii.Kernel.get(this, "placementConstraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServicePlacementConstraints.class)));
            this.placementStrategy = software.amazon.jsii.Kernel.get(this, "placementStrategy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServicePlacementStrategy.class)));
            this.platformVersion = software.amazon.jsii.Kernel.get(this, "platformVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.propagateTags = software.amazon.jsii.Kernel.get(this, "propagateTags", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schedulingStrategy = software.amazon.jsii.Kernel.get(this, "schedulingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceRegistries = software.amazon.jsii.Kernel.get(this, "serviceRegistries", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceServiceRegistries.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.taskDefinition = software.amazon.jsii.Kernel.get(this, "taskDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.EcsServiceTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.EcsServiceCapacityProviderStrategy> capacityProviderStrategy, final java.lang.String cluster, final java.util.List<? extends imports.aws.EcsServiceDeploymentController> deploymentController, final java.lang.Number deploymentMaximumPercent, final java.lang.Number deploymentMinimumHealthyPercent, final java.lang.Number desiredCount, final java.lang.Boolean enableEcsManagedTags, final java.lang.Boolean forceNewDeployment, final java.lang.Number healthCheckGracePeriodSeconds, final java.lang.String iamRole, final java.lang.String launchType, final java.util.List<? extends imports.aws.EcsServiceLoadBalancer> loadBalancer, final java.util.List<? extends imports.aws.EcsServiceNetworkConfiguration> networkConfiguration, final java.util.List<? extends imports.aws.EcsServiceOrderedPlacementStrategy> orderedPlacementStrategy, final java.util.List<? extends imports.aws.EcsServicePlacementConstraints> placementConstraints, final java.util.List<? extends imports.aws.EcsServicePlacementStrategy> placementStrategy, final java.lang.String platformVersion, final java.lang.String propagateTags, final java.lang.String schedulingStrategy, final java.util.List<? extends imports.aws.EcsServiceServiceRegistries> serviceRegistries, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String taskDefinition, final imports.aws.EcsServiceTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.capacityProviderStrategy = (java.util.List<imports.aws.EcsServiceCapacityProviderStrategy>)capacityProviderStrategy;
            this.cluster = cluster;
            this.deploymentController = (java.util.List<imports.aws.EcsServiceDeploymentController>)deploymentController;
            this.deploymentMaximumPercent = deploymentMaximumPercent;
            this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
            this.desiredCount = desiredCount;
            this.enableEcsManagedTags = enableEcsManagedTags;
            this.forceNewDeployment = forceNewDeployment;
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            this.iamRole = iamRole;
            this.launchType = launchType;
            this.loadBalancer = (java.util.List<imports.aws.EcsServiceLoadBalancer>)loadBalancer;
            this.networkConfiguration = (java.util.List<imports.aws.EcsServiceNetworkConfiguration>)networkConfiguration;
            this.orderedPlacementStrategy = (java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy>)orderedPlacementStrategy;
            this.placementConstraints = (java.util.List<imports.aws.EcsServicePlacementConstraints>)placementConstraints;
            this.placementStrategy = (java.util.List<imports.aws.EcsServicePlacementStrategy>)placementStrategy;
            this.platformVersion = platformVersion;
            this.propagateTags = propagateTags;
            this.schedulingStrategy = schedulingStrategy;
            this.serviceRegistries = (java.util.List<imports.aws.EcsServiceServiceRegistries>)serviceRegistries;
            this.tags = tags;
            this.taskDefinition = taskDefinition;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.EcsServiceCapacityProviderStrategy> getCapacityProviderStrategy() {
            return this.capacityProviderStrategy;
        }

        @Override
        public final java.lang.String getCluster() {
            return this.cluster;
        }

        @Override
        public final java.util.List<imports.aws.EcsServiceDeploymentController> getDeploymentController() {
            return this.deploymentController;
        }

        @Override
        public final java.lang.Number getDeploymentMaximumPercent() {
            return this.deploymentMaximumPercent;
        }

        @Override
        public final java.lang.Number getDeploymentMinimumHealthyPercent() {
            return this.deploymentMinimumHealthyPercent;
        }

        @Override
        public final java.lang.Number getDesiredCount() {
            return this.desiredCount;
        }

        @Override
        public final java.lang.Boolean getEnableEcsManagedTags() {
            return this.enableEcsManagedTags;
        }

        @Override
        public final java.lang.Boolean getForceNewDeployment() {
            return this.forceNewDeployment;
        }

        @Override
        public final java.lang.Number getHealthCheckGracePeriodSeconds() {
            return this.healthCheckGracePeriodSeconds;
        }

        @Override
        public final java.lang.String getIamRole() {
            return this.iamRole;
        }

        @Override
        public final java.lang.String getLaunchType() {
            return this.launchType;
        }

        @Override
        public final java.util.List<imports.aws.EcsServiceLoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

        @Override
        public final java.util.List<imports.aws.EcsServiceNetworkConfiguration> getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.EcsServiceOrderedPlacementStrategy> getOrderedPlacementStrategy() {
            return this.orderedPlacementStrategy;
        }

        @Override
        public final java.util.List<imports.aws.EcsServicePlacementConstraints> getPlacementConstraints() {
            return this.placementConstraints;
        }

        @Override
        public final java.util.List<imports.aws.EcsServicePlacementStrategy> getPlacementStrategy() {
            return this.placementStrategy;
        }

        @Override
        public final java.lang.String getPlatformVersion() {
            return this.platformVersion;
        }

        @Override
        public final java.lang.String getPropagateTags() {
            return this.propagateTags;
        }

        @Override
        public final java.lang.String getSchedulingStrategy() {
            return this.schedulingStrategy;
        }

        @Override
        public final java.util.List<imports.aws.EcsServiceServiceRegistries> getServiceRegistries() {
            return this.serviceRegistries;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTaskDefinition() {
            return this.taskDefinition;
        }

        @Override
        public final imports.aws.EcsServiceTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getCapacityProviderStrategy() != null) {
                data.set("capacityProviderStrategy", om.valueToTree(this.getCapacityProviderStrategy()));
            }
            if (this.getCluster() != null) {
                data.set("cluster", om.valueToTree(this.getCluster()));
            }
            if (this.getDeploymentController() != null) {
                data.set("deploymentController", om.valueToTree(this.getDeploymentController()));
            }
            if (this.getDeploymentMaximumPercent() != null) {
                data.set("deploymentMaximumPercent", om.valueToTree(this.getDeploymentMaximumPercent()));
            }
            if (this.getDeploymentMinimumHealthyPercent() != null) {
                data.set("deploymentMinimumHealthyPercent", om.valueToTree(this.getDeploymentMinimumHealthyPercent()));
            }
            if (this.getDesiredCount() != null) {
                data.set("desiredCount", om.valueToTree(this.getDesiredCount()));
            }
            if (this.getEnableEcsManagedTags() != null) {
                data.set("enableEcsManagedTags", om.valueToTree(this.getEnableEcsManagedTags()));
            }
            if (this.getForceNewDeployment() != null) {
                data.set("forceNewDeployment", om.valueToTree(this.getForceNewDeployment()));
            }
            if (this.getHealthCheckGracePeriodSeconds() != null) {
                data.set("healthCheckGracePeriodSeconds", om.valueToTree(this.getHealthCheckGracePeriodSeconds()));
            }
            if (this.getIamRole() != null) {
                data.set("iamRole", om.valueToTree(this.getIamRole()));
            }
            if (this.getLaunchType() != null) {
                data.set("launchType", om.valueToTree(this.getLaunchType()));
            }
            if (this.getLoadBalancer() != null) {
                data.set("loadBalancer", om.valueToTree(this.getLoadBalancer()));
            }
            if (this.getNetworkConfiguration() != null) {
                data.set("networkConfiguration", om.valueToTree(this.getNetworkConfiguration()));
            }
            if (this.getOrderedPlacementStrategy() != null) {
                data.set("orderedPlacementStrategy", om.valueToTree(this.getOrderedPlacementStrategy()));
            }
            if (this.getPlacementConstraints() != null) {
                data.set("placementConstraints", om.valueToTree(this.getPlacementConstraints()));
            }
            if (this.getPlacementStrategy() != null) {
                data.set("placementStrategy", om.valueToTree(this.getPlacementStrategy()));
            }
            if (this.getPlatformVersion() != null) {
                data.set("platformVersion", om.valueToTree(this.getPlatformVersion()));
            }
            if (this.getPropagateTags() != null) {
                data.set("propagateTags", om.valueToTree(this.getPropagateTags()));
            }
            if (this.getSchedulingStrategy() != null) {
                data.set("schedulingStrategy", om.valueToTree(this.getSchedulingStrategy()));
            }
            if (this.getServiceRegistries() != null) {
                data.set("serviceRegistries", om.valueToTree(this.getServiceRegistries()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTaskDefinition() != null) {
                data.set("taskDefinition", om.valueToTree(this.getTaskDefinition()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
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
            struct.set("fqn", om.valueToTree("aws.EcsServiceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsServiceConfig.Jsii$Proxy that = (EcsServiceConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.capacityProviderStrategy != null ? !this.capacityProviderStrategy.equals(that.capacityProviderStrategy) : that.capacityProviderStrategy != null) return false;
            if (this.cluster != null ? !this.cluster.equals(that.cluster) : that.cluster != null) return false;
            if (this.deploymentController != null ? !this.deploymentController.equals(that.deploymentController) : that.deploymentController != null) return false;
            if (this.deploymentMaximumPercent != null ? !this.deploymentMaximumPercent.equals(that.deploymentMaximumPercent) : that.deploymentMaximumPercent != null) return false;
            if (this.deploymentMinimumHealthyPercent != null ? !this.deploymentMinimumHealthyPercent.equals(that.deploymentMinimumHealthyPercent) : that.deploymentMinimumHealthyPercent != null) return false;
            if (this.desiredCount != null ? !this.desiredCount.equals(that.desiredCount) : that.desiredCount != null) return false;
            if (this.enableEcsManagedTags != null ? !this.enableEcsManagedTags.equals(that.enableEcsManagedTags) : that.enableEcsManagedTags != null) return false;
            if (this.forceNewDeployment != null ? !this.forceNewDeployment.equals(that.forceNewDeployment) : that.forceNewDeployment != null) return false;
            if (this.healthCheckGracePeriodSeconds != null ? !this.healthCheckGracePeriodSeconds.equals(that.healthCheckGracePeriodSeconds) : that.healthCheckGracePeriodSeconds != null) return false;
            if (this.iamRole != null ? !this.iamRole.equals(that.iamRole) : that.iamRole != null) return false;
            if (this.launchType != null ? !this.launchType.equals(that.launchType) : that.launchType != null) return false;
            if (this.loadBalancer != null ? !this.loadBalancer.equals(that.loadBalancer) : that.loadBalancer != null) return false;
            if (this.networkConfiguration != null ? !this.networkConfiguration.equals(that.networkConfiguration) : that.networkConfiguration != null) return false;
            if (this.orderedPlacementStrategy != null ? !this.orderedPlacementStrategy.equals(that.orderedPlacementStrategy) : that.orderedPlacementStrategy != null) return false;
            if (this.placementConstraints != null ? !this.placementConstraints.equals(that.placementConstraints) : that.placementConstraints != null) return false;
            if (this.placementStrategy != null ? !this.placementStrategy.equals(that.placementStrategy) : that.placementStrategy != null) return false;
            if (this.platformVersion != null ? !this.platformVersion.equals(that.platformVersion) : that.platformVersion != null) return false;
            if (this.propagateTags != null ? !this.propagateTags.equals(that.propagateTags) : that.propagateTags != null) return false;
            if (this.schedulingStrategy != null ? !this.schedulingStrategy.equals(that.schedulingStrategy) : that.schedulingStrategy != null) return false;
            if (this.serviceRegistries != null ? !this.serviceRegistries.equals(that.serviceRegistries) : that.serviceRegistries != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.taskDefinition != null ? !this.taskDefinition.equals(that.taskDefinition) : that.taskDefinition != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.capacityProviderStrategy != null ? this.capacityProviderStrategy.hashCode() : 0);
            result = 31 * result + (this.cluster != null ? this.cluster.hashCode() : 0);
            result = 31 * result + (this.deploymentController != null ? this.deploymentController.hashCode() : 0);
            result = 31 * result + (this.deploymentMaximumPercent != null ? this.deploymentMaximumPercent.hashCode() : 0);
            result = 31 * result + (this.deploymentMinimumHealthyPercent != null ? this.deploymentMinimumHealthyPercent.hashCode() : 0);
            result = 31 * result + (this.desiredCount != null ? this.desiredCount.hashCode() : 0);
            result = 31 * result + (this.enableEcsManagedTags != null ? this.enableEcsManagedTags.hashCode() : 0);
            result = 31 * result + (this.forceNewDeployment != null ? this.forceNewDeployment.hashCode() : 0);
            result = 31 * result + (this.healthCheckGracePeriodSeconds != null ? this.healthCheckGracePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.iamRole != null ? this.iamRole.hashCode() : 0);
            result = 31 * result + (this.launchType != null ? this.launchType.hashCode() : 0);
            result = 31 * result + (this.loadBalancer != null ? this.loadBalancer.hashCode() : 0);
            result = 31 * result + (this.networkConfiguration != null ? this.networkConfiguration.hashCode() : 0);
            result = 31 * result + (this.orderedPlacementStrategy != null ? this.orderedPlacementStrategy.hashCode() : 0);
            result = 31 * result + (this.placementConstraints != null ? this.placementConstraints.hashCode() : 0);
            result = 31 * result + (this.placementStrategy != null ? this.placementStrategy.hashCode() : 0);
            result = 31 * result + (this.platformVersion != null ? this.platformVersion.hashCode() : 0);
            result = 31 * result + (this.propagateTags != null ? this.propagateTags.hashCode() : 0);
            result = 31 * result + (this.schedulingStrategy != null ? this.schedulingStrategy.hashCode() : 0);
            result = 31 * result + (this.serviceRegistries != null ? this.serviceRegistries.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.taskDefinition != null ? this.taskDefinition.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
