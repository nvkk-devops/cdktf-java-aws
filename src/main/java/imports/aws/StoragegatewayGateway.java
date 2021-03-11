package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.906Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.StoragegatewayGateway")
public class StoragegatewayGateway extends com.hashicorp.cdktf.TerraformResource {

    protected StoragegatewayGateway(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StoragegatewayGateway(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public StoragegatewayGateway(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.StoragegatewayGatewayConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetActivationKey() {
        software.amazon.jsii.Kernel.call(this, "resetActivationKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchLogGroupArn() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchLogGroupArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGatewayIpAddress() {
        software.amazon.jsii.Kernel.call(this, "resetGatewayIpAddress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGatewayType() {
        software.amazon.jsii.Kernel.call(this, "resetGatewayType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGatewayVpcEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetGatewayVpcEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMediumChangerType() {
        software.amazon.jsii.Kernel.call(this, "resetMediumChangerType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmbActiveDirectorySettings() {
        software.amazon.jsii.Kernel.call(this, "resetSmbActiveDirectorySettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmbGuestPassword() {
        software.amazon.jsii.Kernel.call(this, "resetSmbGuestPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTapeDriveType() {
        software.amazon.jsii.Kernel.call(this, "resetTapeDriveType", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "gatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayNameInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayTimezoneInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayTimezoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getActivationKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "activationKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroupArnInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGatewayIpAddressInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayIpAddressInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGatewayTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGatewayVpcEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayVpcEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMediumChangerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "mediumChangerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> getSmbActiveDirectorySettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings>)(software.amazon.jsii.Kernel.get(this, "smbActiveDirectorySettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSmbGuestPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "smbGuestPasswordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTapeDriveTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "tapeDriveTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.StoragegatewayGatewayTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayGatewayTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getActivationKey() {
        return software.amazon.jsii.Kernel.get(this, "activationKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setActivationKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "activationKey", java.util.Objects.requireNonNull(value, "activationKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchLogGroupArn() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchLogGroupArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogGroupArn", java.util.Objects.requireNonNull(value, "cloudwatchLogGroupArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "gatewayIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGatewayIpAddress(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "gatewayIpAddress", java.util.Objects.requireNonNull(value, "gatewayIpAddress is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayName() {
        return software.amazon.jsii.Kernel.get(this, "gatewayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGatewayName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "gatewayName", java.util.Objects.requireNonNull(value, "gatewayName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayTimezone() {
        return software.amazon.jsii.Kernel.get(this, "gatewayTimezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGatewayTimezone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "gatewayTimezone", java.util.Objects.requireNonNull(value, "gatewayTimezone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayType() {
        return software.amazon.jsii.Kernel.get(this, "gatewayType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGatewayType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "gatewayType", java.util.Objects.requireNonNull(value, "gatewayType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayVpcEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "gatewayVpcEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGatewayVpcEndpoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "gatewayVpcEndpoint", java.util.Objects.requireNonNull(value, "gatewayVpcEndpoint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMediumChangerType() {
        return software.amazon.jsii.Kernel.get(this, "mediumChangerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMediumChangerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mediumChangerType", java.util.Objects.requireNonNull(value, "mediumChangerType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> getSmbActiveDirectorySettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "smbActiveDirectorySettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings.class))));
    }

    public void setSmbActiveDirectorySettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> value) {
        software.amazon.jsii.Kernel.set(this, "smbActiveDirectorySettings", java.util.Objects.requireNonNull(value, "smbActiveDirectorySettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSmbGuestPassword() {
        return software.amazon.jsii.Kernel.get(this, "smbGuestPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSmbGuestPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "smbGuestPassword", java.util.Objects.requireNonNull(value, "smbGuestPassword is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTapeDriveType() {
        return software.amazon.jsii.Kernel.get(this, "tapeDriveType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTapeDriveType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tapeDriveType", java.util.Objects.requireNonNull(value, "tapeDriveType is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.StoragegatewayGatewayTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayGatewayTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.StoragegatewayGatewayTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.StoragegatewayGateway}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.StoragegatewayGateway> {
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
        private final imports.aws.StoragegatewayGatewayConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.StoragegatewayGatewayConfig.Builder();
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
         * @param gatewayName This parameter is required.
         */
        public Builder gatewayName(final java.lang.String gatewayName) {
            this.config.gatewayName(gatewayName);
            return this;
        }

        /**
         * @return {@code this}
         * @param gatewayTimezone This parameter is required.
         */
        public Builder gatewayTimezone(final java.lang.String gatewayTimezone) {
            this.config.gatewayTimezone(gatewayTimezone);
            return this;
        }

        /**
         * @return {@code this}
         * @param activationKey This parameter is required.
         */
        public Builder activationKey(final java.lang.String activationKey) {
            this.config.activationKey(activationKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param cloudwatchLogGroupArn This parameter is required.
         */
        public Builder cloudwatchLogGroupArn(final java.lang.String cloudwatchLogGroupArn) {
            this.config.cloudwatchLogGroupArn(cloudwatchLogGroupArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param gatewayIpAddress This parameter is required.
         */
        public Builder gatewayIpAddress(final java.lang.String gatewayIpAddress) {
            this.config.gatewayIpAddress(gatewayIpAddress);
            return this;
        }

        /**
         * @return {@code this}
         * @param gatewayType This parameter is required.
         */
        public Builder gatewayType(final java.lang.String gatewayType) {
            this.config.gatewayType(gatewayType);
            return this;
        }

        /**
         * @return {@code this}
         * @param gatewayVpcEndpoint This parameter is required.
         */
        public Builder gatewayVpcEndpoint(final java.lang.String gatewayVpcEndpoint) {
            this.config.gatewayVpcEndpoint(gatewayVpcEndpoint);
            return this;
        }

        /**
         * @return {@code this}
         * @param mediumChangerType This parameter is required.
         */
        public Builder mediumChangerType(final java.lang.String mediumChangerType) {
            this.config.mediumChangerType(mediumChangerType);
            return this;
        }

        /**
         * smb_active_directory_settings block.
         * <p>
         * @return {@code this}
         * @param smbActiveDirectorySettings smb_active_directory_settings block. This parameter is required.
         */
        public Builder smbActiveDirectorySettings(final java.util.List<? extends imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> smbActiveDirectorySettings) {
            this.config.smbActiveDirectorySettings(smbActiveDirectorySettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param smbGuestPassword This parameter is required.
         */
        public Builder smbGuestPassword(final java.lang.String smbGuestPassword) {
            this.config.smbGuestPassword(smbGuestPassword);
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
         * @param tapeDriveType This parameter is required.
         */
        public Builder tapeDriveType(final java.lang.String tapeDriveType) {
            this.config.tapeDriveType(tapeDriveType);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.StoragegatewayGatewayTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.StoragegatewayGateway}.
         */
        @Override
        public imports.aws.StoragegatewayGateway build() {
            return new imports.aws.StoragegatewayGateway(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
