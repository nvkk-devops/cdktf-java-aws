package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.586Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlobalacceleratorEndpointGroup")
public class GlobalacceleratorEndpointGroup extends com.hashicorp.cdktf.TerraformResource {

    protected GlobalacceleratorEndpointGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlobalacceleratorEndpointGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GlobalacceleratorEndpointGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GlobalacceleratorEndpointGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetEndpointConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpointGroupRegion() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointGroupRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckIntervalSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckIntervalSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckPath() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckPort() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckProtocol() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckProtocol", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThresholdCount() {
        software.amazon.jsii.Kernel.call(this, "resetThresholdCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTrafficDialPercentage() {
        software.amazon.jsii.Kernel.call(this, "resetTrafficDialPercentage", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getListenerArnInput() {
        return software.amazon.jsii.Kernel.get(this, "listenerArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> getEndpointConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration>)(software.amazon.jsii.Kernel.get(this, "endpointConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointGroupRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointGroupRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckIntervalSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckIntervalSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckPathInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckPortInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckProtocolInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckProtocolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getThresholdCountInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTrafficDialPercentageInput() {
        return software.amazon.jsii.Kernel.get(this, "trafficDialPercentageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> getEndpointConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "endpointConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration.class))));
    }

    public void setEndpointConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "endpointConfiguration", java.util.Objects.requireNonNull(value, "endpointConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointGroupRegion() {
        return software.amazon.jsii.Kernel.get(this, "endpointGroupRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointGroupRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointGroupRegion", java.util.Objects.requireNonNull(value, "endpointGroupRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckIntervalSeconds() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckIntervalSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckIntervalSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckIntervalSeconds", java.util.Objects.requireNonNull(value, "healthCheckIntervalSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthCheckPath() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthCheckPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckPath", java.util.Objects.requireNonNull(value, "healthCheckPath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckPort() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckPort", java.util.Objects.requireNonNull(value, "healthCheckPort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthCheckProtocol() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthCheckProtocol(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckProtocol", java.util.Objects.requireNonNull(value, "healthCheckProtocol is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getListenerArn() {
        return software.amazon.jsii.Kernel.get(this, "listenerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setListenerArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "listenerArn", java.util.Objects.requireNonNull(value, "listenerArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getThresholdCount() {
        return software.amazon.jsii.Kernel.get(this, "thresholdCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setThresholdCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "thresholdCount", java.util.Objects.requireNonNull(value, "thresholdCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTrafficDialPercentage() {
        return software.amazon.jsii.Kernel.get(this, "trafficDialPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTrafficDialPercentage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "trafficDialPercentage", java.util.Objects.requireNonNull(value, "trafficDialPercentage is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GlobalacceleratorEndpointGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GlobalacceleratorEndpointGroup> {
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
        private final imports.aws.GlobalacceleratorEndpointGroupConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GlobalacceleratorEndpointGroupConfig.Builder();
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
         * @param listenerArn This parameter is required.
         */
        public Builder listenerArn(final java.lang.String listenerArn) {
            this.config.listenerArn(listenerArn);
            return this;
        }

        /**
         * endpoint_configuration block.
         * <p>
         * @return {@code this}
         * @param endpointConfiguration endpoint_configuration block. This parameter is required.
         */
        public Builder endpointConfiguration(final java.util.List<? extends imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> endpointConfiguration) {
            this.config.endpointConfiguration(endpointConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param endpointGroupRegion This parameter is required.
         */
        public Builder endpointGroupRegion(final java.lang.String endpointGroupRegion) {
            this.config.endpointGroupRegion(endpointGroupRegion);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckIntervalSeconds This parameter is required.
         */
        public Builder healthCheckIntervalSeconds(final java.lang.Number healthCheckIntervalSeconds) {
            this.config.healthCheckIntervalSeconds(healthCheckIntervalSeconds);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckPath This parameter is required.
         */
        public Builder healthCheckPath(final java.lang.String healthCheckPath) {
            this.config.healthCheckPath(healthCheckPath);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckPort This parameter is required.
         */
        public Builder healthCheckPort(final java.lang.Number healthCheckPort) {
            this.config.healthCheckPort(healthCheckPort);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckProtocol This parameter is required.
         */
        public Builder healthCheckProtocol(final java.lang.String healthCheckProtocol) {
            this.config.healthCheckProtocol(healthCheckProtocol);
            return this;
        }

        /**
         * @return {@code this}
         * @param thresholdCount This parameter is required.
         */
        public Builder thresholdCount(final java.lang.Number thresholdCount) {
            this.config.thresholdCount(thresholdCount);
            return this;
        }

        /**
         * @return {@code this}
         * @param trafficDialPercentage This parameter is required.
         */
        public Builder trafficDialPercentage(final java.lang.Number trafficDialPercentage) {
            this.config.trafficDialPercentage(trafficDialPercentage);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GlobalacceleratorEndpointGroup}.
         */
        @Override
        public imports.aws.GlobalacceleratorEndpointGroup build() {
            return new imports.aws.GlobalacceleratorEndpointGroup(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
