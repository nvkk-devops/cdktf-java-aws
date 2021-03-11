package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.173Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentConfig")
public class CodedeployDeploymentConfig extends com.hashicorp.cdktf.TerraformResource {

    protected CodedeployDeploymentConfig(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentConfig(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CodedeployDeploymentConfig(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CodedeployDeploymentConfigConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetComputePlatform() {
        software.amazon.jsii.Kernel.call(this, "resetComputePlatform", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinimumHealthyHosts() {
        software.amazon.jsii.Kernel.call(this, "resetMinimumHealthyHosts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTrafficRoutingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetTrafficRoutingConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentConfigId() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentConfigNameInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getComputePlatformInput() {
        return software.amazon.jsii.Kernel.get(this, "computePlatformInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> getMinimumHealthyHostsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts>)(software.amazon.jsii.Kernel.get(this, "minimumHealthyHostsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> getTrafficRoutingConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig>)(software.amazon.jsii.Kernel.get(this, "trafficRoutingConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComputePlatform() {
        return software.amazon.jsii.Kernel.get(this, "computePlatform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComputePlatform(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "computePlatform", java.util.Objects.requireNonNull(value, "computePlatform is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentConfigName() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentConfigName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentConfigName", java.util.Objects.requireNonNull(value, "deploymentConfigName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> getMinimumHealthyHosts() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "minimumHealthyHosts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts.class))));
    }

    public void setMinimumHealthyHosts(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> value) {
        software.amazon.jsii.Kernel.set(this, "minimumHealthyHosts", java.util.Objects.requireNonNull(value, "minimumHealthyHosts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> getTrafficRoutingConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "trafficRoutingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig.class))));
    }

    public void setTrafficRoutingConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> value) {
        software.amazon.jsii.Kernel.set(this, "trafficRoutingConfig", java.util.Objects.requireNonNull(value, "trafficRoutingConfig is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CodedeployDeploymentConfig}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CodedeployDeploymentConfig> {
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
        private final imports.aws.CodedeployDeploymentConfigConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CodedeployDeploymentConfigConfig.Builder();
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
         * @param deploymentConfigName This parameter is required.
         */
        public Builder deploymentConfigName(final java.lang.String deploymentConfigName) {
            this.config.deploymentConfigName(deploymentConfigName);
            return this;
        }

        /**
         * @return {@code this}
         * @param computePlatform This parameter is required.
         */
        public Builder computePlatform(final java.lang.String computePlatform) {
            this.config.computePlatform(computePlatform);
            return this;
        }

        /**
         * minimum_healthy_hosts block.
         * <p>
         * @return {@code this}
         * @param minimumHealthyHosts minimum_healthy_hosts block. This parameter is required.
         */
        public Builder minimumHealthyHosts(final java.util.List<? extends imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> minimumHealthyHosts) {
            this.config.minimumHealthyHosts(minimumHealthyHosts);
            return this;
        }

        /**
         * traffic_routing_config block.
         * <p>
         * @return {@code this}
         * @param trafficRoutingConfig traffic_routing_config block. This parameter is required.
         */
        public Builder trafficRoutingConfig(final java.util.List<? extends imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> trafficRoutingConfig) {
            this.config.trafficRoutingConfig(trafficRoutingConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CodedeployDeploymentConfig}.
         */
        @Override
        public imports.aws.CodedeployDeploymentConfig build() {
            return new imports.aws.CodedeployDeploymentConfig(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
