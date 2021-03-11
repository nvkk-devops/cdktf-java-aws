package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.768Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksStack")
public class OpsworksStack extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksStack(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksStack(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public OpsworksStack(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.OpsworksStackConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAgentVersion() {
        software.amazon.jsii.Kernel.call(this, "resetAgentVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBerkshelfVersion() {
        software.amazon.jsii.Kernel.call(this, "resetBerkshelfVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetColor() {
        software.amazon.jsii.Kernel.call(this, "resetColor", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigurationManagerName() {
        software.amazon.jsii.Kernel.call(this, "resetConfigurationManagerName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigurationManagerVersion() {
        software.amazon.jsii.Kernel.call(this, "resetConfigurationManagerVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomCookbooksSource() {
        software.amazon.jsii.Kernel.call(this, "resetCustomCookbooksSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomJson() {
        software.amazon.jsii.Kernel.call(this, "resetCustomJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultAvailabilityZone() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultAvailabilityZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultOs() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultOs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultRootDeviceType() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultRootDeviceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultSshKeyName() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultSshKeyName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultSubnetId() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultSubnetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostnameTheme() {
        software.amazon.jsii.Kernel.call(this, "resetHostnameTheme", software.amazon.jsii.NativeType.VOID);
    }

    public void resetManageBerkshelf() {
        software.amazon.jsii.Kernel.call(this, "resetManageBerkshelf", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseCustomCookbooks() {
        software.amazon.jsii.Kernel.call(this, "resetUseCustomCookbooks", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseOpsworksSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetUseOpsworksSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcId() {
        software.amazon.jsii.Kernel.call(this, "resetVpcId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultInstanceProfileArnInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultInstanceProfileArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "stackEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAgentVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "agentVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBerkshelfVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "berkshelfVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getColorInput() {
        return software.amazon.jsii.Kernel.get(this, "colorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationManagerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationManagerNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationManagerVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationManagerVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksStackCustomCookbooksSource> getCustomCookbooksSourceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksStackCustomCookbooksSource>)(software.amazon.jsii.Kernel.get(this, "customCookbooksSourceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksStackCustomCookbooksSource.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "customJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultAvailabilityZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultAvailabilityZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultOsInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultOsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultRootDeviceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultRootDeviceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultSshKeyNameInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultSshKeyNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultSubnetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultSubnetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostnameThemeInput() {
        return software.amazon.jsii.Kernel.get(this, "hostnameThemeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getManageBerkshelfInput() {
        return software.amazon.jsii.Kernel.get(this, "manageBerkshelfInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUseCustomCookbooksInput() {
        return software.amazon.jsii.Kernel.get(this, "useCustomCookbooksInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUseOpsworksSecurityGroupsInput() {
        return software.amazon.jsii.Kernel.get(this, "useOpsworksSecurityGroupsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAgentVersion() {
        return software.amazon.jsii.Kernel.get(this, "agentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAgentVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "agentVersion", java.util.Objects.requireNonNull(value, "agentVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBerkshelfVersion() {
        return software.amazon.jsii.Kernel.get(this, "berkshelfVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBerkshelfVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "berkshelfVersion", java.util.Objects.requireNonNull(value, "berkshelfVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getColor() {
        return software.amazon.jsii.Kernel.get(this, "color", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setColor(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "color", java.util.Objects.requireNonNull(value, "color is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationManagerName() {
        return software.amazon.jsii.Kernel.get(this, "configurationManagerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigurationManagerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configurationManagerName", java.util.Objects.requireNonNull(value, "configurationManagerName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationManagerVersion() {
        return software.amazon.jsii.Kernel.get(this, "configurationManagerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigurationManagerVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configurationManagerVersion", java.util.Objects.requireNonNull(value, "configurationManagerVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksStackCustomCookbooksSource> getCustomCookbooksSource() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customCookbooksSource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksStackCustomCookbooksSource.class))));
    }

    public void setCustomCookbooksSource(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksStackCustomCookbooksSource> value) {
        software.amazon.jsii.Kernel.set(this, "customCookbooksSource", java.util.Objects.requireNonNull(value, "customCookbooksSource is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomJson() {
        return software.amazon.jsii.Kernel.get(this, "customJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customJson", java.util.Objects.requireNonNull(value, "customJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "defaultAvailabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultAvailabilityZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultAvailabilityZone", java.util.Objects.requireNonNull(value, "defaultAvailabilityZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultInstanceProfileArn() {
        return software.amazon.jsii.Kernel.get(this, "defaultInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultInstanceProfileArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultInstanceProfileArn", java.util.Objects.requireNonNull(value, "defaultInstanceProfileArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultOs() {
        return software.amazon.jsii.Kernel.get(this, "defaultOs", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultOs(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultOs", java.util.Objects.requireNonNull(value, "defaultOs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultRootDeviceType() {
        return software.amazon.jsii.Kernel.get(this, "defaultRootDeviceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultRootDeviceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultRootDeviceType", java.util.Objects.requireNonNull(value, "defaultRootDeviceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultSshKeyName() {
        return software.amazon.jsii.Kernel.get(this, "defaultSshKeyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultSshKeyName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultSshKeyName", java.util.Objects.requireNonNull(value, "defaultSshKeyName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultSubnetId() {
        return software.amazon.jsii.Kernel.get(this, "defaultSubnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultSubnetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultSubnetId", java.util.Objects.requireNonNull(value, "defaultSubnetId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostnameTheme() {
        return software.amazon.jsii.Kernel.get(this, "hostnameTheme", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostnameTheme(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostnameTheme", java.util.Objects.requireNonNull(value, "hostnameTheme is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getManageBerkshelf() {
        return software.amazon.jsii.Kernel.get(this, "manageBerkshelf", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setManageBerkshelf(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "manageBerkshelf", java.util.Objects.requireNonNull(value, "manageBerkshelf is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRoleArn", java.util.Objects.requireNonNull(value, "serviceRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getUseCustomCookbooks() {
        return software.amazon.jsii.Kernel.get(this, "useCustomCookbooks", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUseCustomCookbooks(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useCustomCookbooks", java.util.Objects.requireNonNull(value, "useCustomCookbooks is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getUseOpsworksSecurityGroups() {
        return software.amazon.jsii.Kernel.get(this, "useOpsworksSecurityGroups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUseOpsworksSecurityGroups(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useOpsworksSecurityGroups", java.util.Objects.requireNonNull(value, "useOpsworksSecurityGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.OpsworksStack}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.OpsworksStack> {
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
        private final imports.aws.OpsworksStackConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.OpsworksStackConfig.Builder();
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
         * @param defaultInstanceProfileArn This parameter is required.
         */
        public Builder defaultInstanceProfileArn(final java.lang.String defaultInstanceProfileArn) {
            this.config.defaultInstanceProfileArn(defaultInstanceProfileArn);
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
         * @param region This parameter is required.
         */
        public Builder region(final java.lang.String region) {
            this.config.region(region);
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
         * @return {@code this}
         * @param agentVersion This parameter is required.
         */
        public Builder agentVersion(final java.lang.String agentVersion) {
            this.config.agentVersion(agentVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param berkshelfVersion This parameter is required.
         */
        public Builder berkshelfVersion(final java.lang.String berkshelfVersion) {
            this.config.berkshelfVersion(berkshelfVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param color This parameter is required.
         */
        public Builder color(final java.lang.String color) {
            this.config.color(color);
            return this;
        }

        /**
         * @return {@code this}
         * @param configurationManagerName This parameter is required.
         */
        public Builder configurationManagerName(final java.lang.String configurationManagerName) {
            this.config.configurationManagerName(configurationManagerName);
            return this;
        }

        /**
         * @return {@code this}
         * @param configurationManagerVersion This parameter is required.
         */
        public Builder configurationManagerVersion(final java.lang.String configurationManagerVersion) {
            this.config.configurationManagerVersion(configurationManagerVersion);
            return this;
        }

        /**
         * custom_cookbooks_source block.
         * <p>
         * @return {@code this}
         * @param customCookbooksSource custom_cookbooks_source block. This parameter is required.
         */
        public Builder customCookbooksSource(final java.util.List<? extends imports.aws.OpsworksStackCustomCookbooksSource> customCookbooksSource) {
            this.config.customCookbooksSource(customCookbooksSource);
            return this;
        }

        /**
         * @return {@code this}
         * @param customJson This parameter is required.
         */
        public Builder customJson(final java.lang.String customJson) {
            this.config.customJson(customJson);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultAvailabilityZone This parameter is required.
         */
        public Builder defaultAvailabilityZone(final java.lang.String defaultAvailabilityZone) {
            this.config.defaultAvailabilityZone(defaultAvailabilityZone);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultOs This parameter is required.
         */
        public Builder defaultOs(final java.lang.String defaultOs) {
            this.config.defaultOs(defaultOs);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultRootDeviceType This parameter is required.
         */
        public Builder defaultRootDeviceType(final java.lang.String defaultRootDeviceType) {
            this.config.defaultRootDeviceType(defaultRootDeviceType);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultSshKeyName This parameter is required.
         */
        public Builder defaultSshKeyName(final java.lang.String defaultSshKeyName) {
            this.config.defaultSshKeyName(defaultSshKeyName);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultSubnetId This parameter is required.
         */
        public Builder defaultSubnetId(final java.lang.String defaultSubnetId) {
            this.config.defaultSubnetId(defaultSubnetId);
            return this;
        }

        /**
         * @return {@code this}
         * @param hostnameTheme This parameter is required.
         */
        public Builder hostnameTheme(final java.lang.String hostnameTheme) {
            this.config.hostnameTheme(hostnameTheme);
            return this;
        }

        /**
         * @return {@code this}
         * @param manageBerkshelf This parameter is required.
         */
        public Builder manageBerkshelf(final java.lang.Boolean manageBerkshelf) {
            this.config.manageBerkshelf(manageBerkshelf);
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
         * @param useCustomCookbooks This parameter is required.
         */
        public Builder useCustomCookbooks(final java.lang.Boolean useCustomCookbooks) {
            this.config.useCustomCookbooks(useCustomCookbooks);
            return this;
        }

        /**
         * @return {@code this}
         * @param useOpsworksSecurityGroups This parameter is required.
         */
        public Builder useOpsworksSecurityGroups(final java.lang.Boolean useOpsworksSecurityGroups) {
            this.config.useOpsworksSecurityGroups(useOpsworksSecurityGroups);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpcId This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config.vpcId(vpcId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.OpsworksStack}.
         */
        @Override
        public imports.aws.OpsworksStack build() {
            return new imports.aws.OpsworksStack(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
