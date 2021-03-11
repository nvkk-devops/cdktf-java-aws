package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.812Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Route53HealthCheck")
public class Route53HealthCheck extends com.hashicorp.cdktf.TerraformResource {

    protected Route53HealthCheck(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Route53HealthCheck(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Route53HealthCheck(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Route53HealthCheckConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetChildHealthchecks() {
        software.amazon.jsii.Kernel.call(this, "resetChildHealthchecks", software.amazon.jsii.NativeType.VOID);
    }

    public void resetChildHealthThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetChildHealthThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchAlarmName() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchAlarmName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchAlarmRegion() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchAlarmRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableSni() {
        software.amazon.jsii.Kernel.call(this, "resetEnableSni", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFailureThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetFailureThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFqdn() {
        software.amazon.jsii.Kernel.call(this, "resetFqdn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInsufficientDataHealthStatus() {
        software.amazon.jsii.Kernel.call(this, "resetInsufficientDataHealthStatus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInvertHealthcheck() {
        software.amazon.jsii.Kernel.call(this, "resetInvertHealthcheck", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpAddress() {
        software.amazon.jsii.Kernel.call(this, "resetIpAddress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMeasureLatency() {
        software.amazon.jsii.Kernel.call(this, "resetMeasureLatency", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReferenceName() {
        software.amazon.jsii.Kernel.call(this, "resetReferenceName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegions() {
        software.amazon.jsii.Kernel.call(this, "resetRegions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestInterval() {
        software.amazon.jsii.Kernel.call(this, "resetRequestInterval", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourcePath() {
        software.amazon.jsii.Kernel.call(this, "resetResourcePath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSearchString() {
        software.amazon.jsii.Kernel.call(this, "resetSearchString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getChildHealthchecksInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "childHealthchecksInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getChildHealthThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "childHealthThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchAlarmNameInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchAlarmRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableSniInput() {
        return software.amazon.jsii.Kernel.get(this, "enableSniInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getFailureThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "failureThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFqdnInput() {
        return software.amazon.jsii.Kernel.get(this, "fqdnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInsufficientDataHealthStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "insufficientDataHealthStatusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInvertHealthcheckInput() {
        return software.amazon.jsii.Kernel.get(this, "invertHealthcheckInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpAddressInput() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getMeasureLatencyInput() {
        return software.amazon.jsii.Kernel.get(this, "measureLatencyInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReferenceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "referenceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRegionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "regionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRequestIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "requestIntervalInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourcePathInput() {
        return software.amazon.jsii.Kernel.get(this, "resourcePathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSearchStringInput() {
        return software.amazon.jsii.Kernel.get(this, "searchStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getChildHealthchecks() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "childHealthchecks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setChildHealthchecks(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "childHealthchecks", java.util.Objects.requireNonNull(value, "childHealthchecks is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getChildHealthThreshold() {
        return software.amazon.jsii.Kernel.get(this, "childHealthThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setChildHealthThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "childHealthThreshold", java.util.Objects.requireNonNull(value, "childHealthThreshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchAlarmName() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchAlarmName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchAlarmName", java.util.Objects.requireNonNull(value, "cloudwatchAlarmName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchAlarmRegion() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchAlarmRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchAlarmRegion", java.util.Objects.requireNonNull(value, "cloudwatchAlarmRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableSni() {
        return software.amazon.jsii.Kernel.get(this, "enableSni", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableSni(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableSni", java.util.Objects.requireNonNull(value, "enableSni is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getFailureThreshold() {
        return software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setFailureThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "failureThreshold", java.util.Objects.requireNonNull(value, "failureThreshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFqdn() {
        return software.amazon.jsii.Kernel.get(this, "fqdn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFqdn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fqdn", java.util.Objects.requireNonNull(value, "fqdn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInsufficientDataHealthStatus() {
        return software.amazon.jsii.Kernel.get(this, "insufficientDataHealthStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInsufficientDataHealthStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "insufficientDataHealthStatus", java.util.Objects.requireNonNull(value, "insufficientDataHealthStatus is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getInvertHealthcheck() {
        return software.amazon.jsii.Kernel.get(this, "invertHealthcheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setInvertHealthcheck(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "invertHealthcheck", java.util.Objects.requireNonNull(value, "invertHealthcheck is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "ipAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpAddress(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipAddress", java.util.Objects.requireNonNull(value, "ipAddress is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getMeasureLatency() {
        return software.amazon.jsii.Kernel.get(this, "measureLatency", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setMeasureLatency(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "measureLatency", java.util.Objects.requireNonNull(value, "measureLatency is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "port", java.util.Objects.requireNonNull(value, "port is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReferenceName() {
        return software.amazon.jsii.Kernel.get(this, "referenceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReferenceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "referenceName", java.util.Objects.requireNonNull(value, "referenceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRegions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "regions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRegions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "regions", java.util.Objects.requireNonNull(value, "regions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRequestInterval() {
        return software.amazon.jsii.Kernel.get(this, "requestInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRequestInterval(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "requestInterval", java.util.Objects.requireNonNull(value, "requestInterval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourcePath() {
        return software.amazon.jsii.Kernel.get(this, "resourcePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourcePath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourcePath", java.util.Objects.requireNonNull(value, "resourcePath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSearchString() {
        return software.amazon.jsii.Kernel.get(this, "searchString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSearchString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "searchString", java.util.Objects.requireNonNull(value, "searchString is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Route53HealthCheck}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Route53HealthCheck> {
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
        private final imports.aws.Route53HealthCheckConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Route53HealthCheckConfig.Builder();
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
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @return {@code this}
         * @param childHealthchecks This parameter is required.
         */
        public Builder childHealthchecks(final java.util.List<java.lang.String> childHealthchecks) {
            this.config.childHealthchecks(childHealthchecks);
            return this;
        }

        /**
         * @return {@code this}
         * @param childHealthThreshold This parameter is required.
         */
        public Builder childHealthThreshold(final java.lang.Number childHealthThreshold) {
            this.config.childHealthThreshold(childHealthThreshold);
            return this;
        }

        /**
         * @return {@code this}
         * @param cloudwatchAlarmName This parameter is required.
         */
        public Builder cloudwatchAlarmName(final java.lang.String cloudwatchAlarmName) {
            this.config.cloudwatchAlarmName(cloudwatchAlarmName);
            return this;
        }

        /**
         * @return {@code this}
         * @param cloudwatchAlarmRegion This parameter is required.
         */
        public Builder cloudwatchAlarmRegion(final java.lang.String cloudwatchAlarmRegion) {
            this.config.cloudwatchAlarmRegion(cloudwatchAlarmRegion);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableSni This parameter is required.
         */
        public Builder enableSni(final java.lang.Boolean enableSni) {
            this.config.enableSni(enableSni);
            return this;
        }

        /**
         * @return {@code this}
         * @param failureThreshold This parameter is required.
         */
        public Builder failureThreshold(final java.lang.Number failureThreshold) {
            this.config.failureThreshold(failureThreshold);
            return this;
        }

        /**
         * @return {@code this}
         * @param fqdn This parameter is required.
         */
        public Builder fqdn(final java.lang.String fqdn) {
            this.config.fqdn(fqdn);
            return this;
        }

        /**
         * @return {@code this}
         * @param insufficientDataHealthStatus This parameter is required.
         */
        public Builder insufficientDataHealthStatus(final java.lang.String insufficientDataHealthStatus) {
            this.config.insufficientDataHealthStatus(insufficientDataHealthStatus);
            return this;
        }

        /**
         * @return {@code this}
         * @param invertHealthcheck This parameter is required.
         */
        public Builder invertHealthcheck(final java.lang.Boolean invertHealthcheck) {
            this.config.invertHealthcheck(invertHealthcheck);
            return this;
        }

        /**
         * @return {@code this}
         * @param ipAddress This parameter is required.
         */
        public Builder ipAddress(final java.lang.String ipAddress) {
            this.config.ipAddress(ipAddress);
            return this;
        }

        /**
         * @return {@code this}
         * @param measureLatency This parameter is required.
         */
        public Builder measureLatency(final java.lang.Boolean measureLatency) {
            this.config.measureLatency(measureLatency);
            return this;
        }

        /**
         * @return {@code this}
         * @param port This parameter is required.
         */
        public Builder port(final java.lang.Number port) {
            this.config.port(port);
            return this;
        }

        /**
         * @return {@code this}
         * @param referenceName This parameter is required.
         */
        public Builder referenceName(final java.lang.String referenceName) {
            this.config.referenceName(referenceName);
            return this;
        }

        /**
         * @return {@code this}
         * @param regions This parameter is required.
         */
        public Builder regions(final java.util.List<java.lang.String> regions) {
            this.config.regions(regions);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestInterval This parameter is required.
         */
        public Builder requestInterval(final java.lang.Number requestInterval) {
            this.config.requestInterval(requestInterval);
            return this;
        }

        /**
         * @return {@code this}
         * @param resourcePath This parameter is required.
         */
        public Builder resourcePath(final java.lang.String resourcePath) {
            this.config.resourcePath(resourcePath);
            return this;
        }

        /**
         * @return {@code this}
         * @param searchString This parameter is required.
         */
        public Builder searchString(final java.lang.String searchString) {
            this.config.searchString(searchString);
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
         * @returns a newly built instance of {@link imports.aws.Route53HealthCheck}.
         */
        @Override
        public imports.aws.Route53HealthCheck build() {
            return new imports.aws.Route53HealthCheck(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
