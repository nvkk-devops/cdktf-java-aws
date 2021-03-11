package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.241Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WorklinkFleet")
public class WorklinkFleet extends com.hashicorp.cdktf.TerraformResource {

    protected WorklinkFleet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WorklinkFleet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public WorklinkFleet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.WorklinkFleetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAuditStreamArn() {
        software.amazon.jsii.Kernel.call(this, "resetAuditStreamArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeviceCaCertificate() {
        software.amazon.jsii.Kernel.call(this, "resetDeviceCaCertificate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisplayName() {
        software.amazon.jsii.Kernel.call(this, "resetDisplayName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdentityProvider() {
        software.amazon.jsii.Kernel.call(this, "resetIdentityProvider", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetwork() {
        software.amazon.jsii.Kernel.call(this, "resetNetwork", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOptimizeForEndUserLocation() {
        software.amazon.jsii.Kernel.call(this, "resetOptimizeForEndUserLocation", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCompanyCode() {
        return software.amazon.jsii.Kernel.get(this, "companyCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedTime() {
        return software.amazon.jsii.Kernel.get(this, "createdTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastUpdatedTime() {
        return software.amazon.jsii.Kernel.get(this, "lastUpdatedTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuditStreamArnInput() {
        return software.amazon.jsii.Kernel.get(this, "auditStreamArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeviceCaCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "deviceCaCertificateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDisplayNameInput() {
        return software.amazon.jsii.Kernel.get(this, "displayNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WorklinkFleetIdentityProvider> getIdentityProviderInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.WorklinkFleetIdentityProvider>)(software.amazon.jsii.Kernel.get(this, "identityProviderInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorklinkFleetIdentityProvider.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WorklinkFleetNetwork> getNetworkInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.WorklinkFleetNetwork>)(software.amazon.jsii.Kernel.get(this, "networkInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorklinkFleetNetwork.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getOptimizeForEndUserLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "optimizeForEndUserLocationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuditStreamArn() {
        return software.amazon.jsii.Kernel.get(this, "auditStreamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuditStreamArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "auditStreamArn", java.util.Objects.requireNonNull(value, "auditStreamArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeviceCaCertificate() {
        return software.amazon.jsii.Kernel.get(this, "deviceCaCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeviceCaCertificate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deviceCaCertificate", java.util.Objects.requireNonNull(value, "deviceCaCertificate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDisplayName() {
        return software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDisplayName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "displayName", java.util.Objects.requireNonNull(value, "displayName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WorklinkFleetIdentityProvider> getIdentityProvider() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "identityProvider", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorklinkFleetIdentityProvider.class))));
    }

    public void setIdentityProvider(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WorklinkFleetIdentityProvider> value) {
        software.amazon.jsii.Kernel.set(this, "identityProvider", java.util.Objects.requireNonNull(value, "identityProvider is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WorklinkFleetNetwork> getNetwork() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "network", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorklinkFleetNetwork.class))));
    }

    public void setNetwork(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WorklinkFleetNetwork> value) {
        software.amazon.jsii.Kernel.set(this, "network", java.util.Objects.requireNonNull(value, "network is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getOptimizeForEndUserLocation() {
        return software.amazon.jsii.Kernel.get(this, "optimizeForEndUserLocation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setOptimizeForEndUserLocation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "optimizeForEndUserLocation", java.util.Objects.requireNonNull(value, "optimizeForEndUserLocation is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.WorklinkFleet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.WorklinkFleet> {
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
        private final imports.aws.WorklinkFleetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.WorklinkFleetConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param auditStreamArn This parameter is required.
         */
        public Builder auditStreamArn(final java.lang.String auditStreamArn) {
            this.config.auditStreamArn(auditStreamArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param deviceCaCertificate This parameter is required.
         */
        public Builder deviceCaCertificate(final java.lang.String deviceCaCertificate) {
            this.config.deviceCaCertificate(deviceCaCertificate);
            return this;
        }

        /**
         * @return {@code this}
         * @param displayName This parameter is required.
         */
        public Builder displayName(final java.lang.String displayName) {
            this.config.displayName(displayName);
            return this;
        }

        /**
         * identity_provider block.
         * <p>
         * @return {@code this}
         * @param identityProvider identity_provider block. This parameter is required.
         */
        public Builder identityProvider(final java.util.List<? extends imports.aws.WorklinkFleetIdentityProvider> identityProvider) {
            this.config.identityProvider(identityProvider);
            return this;
        }

        /**
         * network block.
         * <p>
         * @return {@code this}
         * @param network network block. This parameter is required.
         */
        public Builder network(final java.util.List<? extends imports.aws.WorklinkFleetNetwork> network) {
            this.config.network(network);
            return this;
        }

        /**
         * @return {@code this}
         * @param optimizeForEndUserLocation This parameter is required.
         */
        public Builder optimizeForEndUserLocation(final java.lang.Boolean optimizeForEndUserLocation) {
            this.config.optimizeForEndUserLocation(optimizeForEndUserLocation);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.WorklinkFleet}.
         */
        @Override
        public imports.aws.WorklinkFleet build() {
            return new imports.aws.WorklinkFleet(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
