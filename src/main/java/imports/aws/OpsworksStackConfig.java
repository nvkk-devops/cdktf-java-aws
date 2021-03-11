package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.769Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksStackConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksStackConfig.Jsii$Proxy.class)
public interface OpsworksStackConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDefaultInstanceProfileArn();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getRegion();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getAgentVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBerkshelfVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getColor() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConfigurationManagerName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConfigurationManagerVersion() {
        return null;
    }

    /**
     * custom_cookbooks_source block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksStackCustomCookbooksSource> getCustomCookbooksSource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomJson() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultOs() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRootDeviceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultSshKeyName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultSubnetId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHostnameTheme() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getManageBerkshelf() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseCustomCookbooks() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseOpsworksSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksStackConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksStackConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksStackConfig> {
        private java.lang.String defaultInstanceProfileArn;
        private java.lang.String name;
        private java.lang.String region;
        private java.lang.String serviceRoleArn;
        private java.lang.String agentVersion;
        private java.lang.String berkshelfVersion;
        private java.lang.String color;
        private java.lang.String configurationManagerName;
        private java.lang.String configurationManagerVersion;
        private java.util.List<imports.aws.OpsworksStackCustomCookbooksSource> customCookbooksSource;
        private java.lang.String customJson;
        private java.lang.String defaultAvailabilityZone;
        private java.lang.String defaultOs;
        private java.lang.String defaultRootDeviceType;
        private java.lang.String defaultSshKeyName;
        private java.lang.String defaultSubnetId;
        private java.lang.String hostnameTheme;
        private java.lang.Boolean manageBerkshelf;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean useCustomCookbooks;
        private java.lang.Boolean useOpsworksSecurityGroups;
        private java.lang.String vpcId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OpsworksStackConfig#getDefaultInstanceProfileArn}
         * @param defaultInstanceProfileArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder defaultInstanceProfileArn(java.lang.String defaultInstanceProfileArn) {
            this.defaultInstanceProfileArn = defaultInstanceProfileArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getRegion}
         * @param region the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getServiceRoleArn}
         * @param serviceRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceRoleArn(java.lang.String serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getAgentVersion}
         * @param agentVersion the value to be set.
         * @return {@code this}
         */
        public Builder agentVersion(java.lang.String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getBerkshelfVersion}
         * @param berkshelfVersion the value to be set.
         * @return {@code this}
         */
        public Builder berkshelfVersion(java.lang.String berkshelfVersion) {
            this.berkshelfVersion = berkshelfVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getColor}
         * @param color the value to be set.
         * @return {@code this}
         */
        public Builder color(java.lang.String color) {
            this.color = color;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getConfigurationManagerName}
         * @param configurationManagerName the value to be set.
         * @return {@code this}
         */
        public Builder configurationManagerName(java.lang.String configurationManagerName) {
            this.configurationManagerName = configurationManagerName;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getConfigurationManagerVersion}
         * @param configurationManagerVersion the value to be set.
         * @return {@code this}
         */
        public Builder configurationManagerVersion(java.lang.String configurationManagerVersion) {
            this.configurationManagerVersion = configurationManagerVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getCustomCookbooksSource}
         * @param customCookbooksSource custom_cookbooks_source block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder customCookbooksSource(java.util.List<? extends imports.aws.OpsworksStackCustomCookbooksSource> customCookbooksSource) {
            this.customCookbooksSource = (java.util.List<imports.aws.OpsworksStackCustomCookbooksSource>)customCookbooksSource;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getCustomJson}
         * @param customJson the value to be set.
         * @return {@code this}
         */
        public Builder customJson(java.lang.String customJson) {
            this.customJson = customJson;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getDefaultAvailabilityZone}
         * @param defaultAvailabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder defaultAvailabilityZone(java.lang.String defaultAvailabilityZone) {
            this.defaultAvailabilityZone = defaultAvailabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getDefaultOs}
         * @param defaultOs the value to be set.
         * @return {@code this}
         */
        public Builder defaultOs(java.lang.String defaultOs) {
            this.defaultOs = defaultOs;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getDefaultRootDeviceType}
         * @param defaultRootDeviceType the value to be set.
         * @return {@code this}
         */
        public Builder defaultRootDeviceType(java.lang.String defaultRootDeviceType) {
            this.defaultRootDeviceType = defaultRootDeviceType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getDefaultSshKeyName}
         * @param defaultSshKeyName the value to be set.
         * @return {@code this}
         */
        public Builder defaultSshKeyName(java.lang.String defaultSshKeyName) {
            this.defaultSshKeyName = defaultSshKeyName;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getDefaultSubnetId}
         * @param defaultSubnetId the value to be set.
         * @return {@code this}
         */
        public Builder defaultSubnetId(java.lang.String defaultSubnetId) {
            this.defaultSubnetId = defaultSubnetId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getHostnameTheme}
         * @param hostnameTheme the value to be set.
         * @return {@code this}
         */
        public Builder hostnameTheme(java.lang.String hostnameTheme) {
            this.hostnameTheme = hostnameTheme;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getManageBerkshelf}
         * @param manageBerkshelf the value to be set.
         * @return {@code this}
         */
        public Builder manageBerkshelf(java.lang.Boolean manageBerkshelf) {
            this.manageBerkshelf = manageBerkshelf;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getUseCustomCookbooks}
         * @param useCustomCookbooks the value to be set.
         * @return {@code this}
         */
        public Builder useCustomCookbooks(java.lang.Boolean useCustomCookbooks) {
            this.useCustomCookbooks = useCustomCookbooks;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getUseOpsworksSecurityGroups}
         * @param useOpsworksSecurityGroups the value to be set.
         * @return {@code this}
         */
        public Builder useOpsworksSecurityGroups(java.lang.Boolean useOpsworksSecurityGroups) {
            this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getVpcId}
         * @param vpcId the value to be set.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksStackConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackConfig#getProvider}
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
         * @return a new instance of {@link OpsworksStackConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksStackConfig build() {
            return new Jsii$Proxy(defaultInstanceProfileArn, name, region, serviceRoleArn, agentVersion, berkshelfVersion, color, configurationManagerName, configurationManagerVersion, customCookbooksSource, customJson, defaultAvailabilityZone, defaultOs, defaultRootDeviceType, defaultSshKeyName, defaultSubnetId, hostnameTheme, manageBerkshelf, tags, useCustomCookbooks, useOpsworksSecurityGroups, vpcId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OpsworksStackConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksStackConfig {
        private final java.lang.String defaultInstanceProfileArn;
        private final java.lang.String name;
        private final java.lang.String region;
        private final java.lang.String serviceRoleArn;
        private final java.lang.String agentVersion;
        private final java.lang.String berkshelfVersion;
        private final java.lang.String color;
        private final java.lang.String configurationManagerName;
        private final java.lang.String configurationManagerVersion;
        private final java.util.List<imports.aws.OpsworksStackCustomCookbooksSource> customCookbooksSource;
        private final java.lang.String customJson;
        private final java.lang.String defaultAvailabilityZone;
        private final java.lang.String defaultOs;
        private final java.lang.String defaultRootDeviceType;
        private final java.lang.String defaultSshKeyName;
        private final java.lang.String defaultSubnetId;
        private final java.lang.String hostnameTheme;
        private final java.lang.Boolean manageBerkshelf;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Boolean useCustomCookbooks;
        private final java.lang.Boolean useOpsworksSecurityGroups;
        private final java.lang.String vpcId;
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
            this.defaultInstanceProfileArn = software.amazon.jsii.Kernel.get(this, "defaultInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceRoleArn = software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.agentVersion = software.amazon.jsii.Kernel.get(this, "agentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.berkshelfVersion = software.amazon.jsii.Kernel.get(this, "berkshelfVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.color = software.amazon.jsii.Kernel.get(this, "color", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configurationManagerName = software.amazon.jsii.Kernel.get(this, "configurationManagerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configurationManagerVersion = software.amazon.jsii.Kernel.get(this, "configurationManagerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customCookbooksSource = software.amazon.jsii.Kernel.get(this, "customCookbooksSource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksStackCustomCookbooksSource.class)));
            this.customJson = software.amazon.jsii.Kernel.get(this, "customJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultAvailabilityZone = software.amazon.jsii.Kernel.get(this, "defaultAvailabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultOs = software.amazon.jsii.Kernel.get(this, "defaultOs", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultRootDeviceType = software.amazon.jsii.Kernel.get(this, "defaultRootDeviceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultSshKeyName = software.amazon.jsii.Kernel.get(this, "defaultSshKeyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultSubnetId = software.amazon.jsii.Kernel.get(this, "defaultSubnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hostnameTheme = software.amazon.jsii.Kernel.get(this, "hostnameTheme", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.manageBerkshelf = software.amazon.jsii.Kernel.get(this, "manageBerkshelf", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.useCustomCookbooks = software.amazon.jsii.Kernel.get(this, "useCustomCookbooks", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.useOpsworksSecurityGroups = software.amazon.jsii.Kernel.get(this, "useOpsworksSecurityGroups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.vpcId = software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String defaultInstanceProfileArn, final java.lang.String name, final java.lang.String region, final java.lang.String serviceRoleArn, final java.lang.String agentVersion, final java.lang.String berkshelfVersion, final java.lang.String color, final java.lang.String configurationManagerName, final java.lang.String configurationManagerVersion, final java.util.List<? extends imports.aws.OpsworksStackCustomCookbooksSource> customCookbooksSource, final java.lang.String customJson, final java.lang.String defaultAvailabilityZone, final java.lang.String defaultOs, final java.lang.String defaultRootDeviceType, final java.lang.String defaultSshKeyName, final java.lang.String defaultSubnetId, final java.lang.String hostnameTheme, final java.lang.Boolean manageBerkshelf, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean useCustomCookbooks, final java.lang.Boolean useOpsworksSecurityGroups, final java.lang.String vpcId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultInstanceProfileArn = java.util.Objects.requireNonNull(defaultInstanceProfileArn, "defaultInstanceProfileArn is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.region = java.util.Objects.requireNonNull(region, "region is required");
            this.serviceRoleArn = java.util.Objects.requireNonNull(serviceRoleArn, "serviceRoleArn is required");
            this.agentVersion = agentVersion;
            this.berkshelfVersion = berkshelfVersion;
            this.color = color;
            this.configurationManagerName = configurationManagerName;
            this.configurationManagerVersion = configurationManagerVersion;
            this.customCookbooksSource = (java.util.List<imports.aws.OpsworksStackCustomCookbooksSource>)customCookbooksSource;
            this.customJson = customJson;
            this.defaultAvailabilityZone = defaultAvailabilityZone;
            this.defaultOs = defaultOs;
            this.defaultRootDeviceType = defaultRootDeviceType;
            this.defaultSshKeyName = defaultSshKeyName;
            this.defaultSubnetId = defaultSubnetId;
            this.hostnameTheme = hostnameTheme;
            this.manageBerkshelf = manageBerkshelf;
            this.tags = tags;
            this.useCustomCookbooks = useCustomCookbooks;
            this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
            this.vpcId = vpcId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDefaultInstanceProfileArn() {
            return this.defaultInstanceProfileArn;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getServiceRoleArn() {
            return this.serviceRoleArn;
        }

        @Override
        public final java.lang.String getAgentVersion() {
            return this.agentVersion;
        }

        @Override
        public final java.lang.String getBerkshelfVersion() {
            return this.berkshelfVersion;
        }

        @Override
        public final java.lang.String getColor() {
            return this.color;
        }

        @Override
        public final java.lang.String getConfigurationManagerName() {
            return this.configurationManagerName;
        }

        @Override
        public final java.lang.String getConfigurationManagerVersion() {
            return this.configurationManagerVersion;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksStackCustomCookbooksSource> getCustomCookbooksSource() {
            return this.customCookbooksSource;
        }

        @Override
        public final java.lang.String getCustomJson() {
            return this.customJson;
        }

        @Override
        public final java.lang.String getDefaultAvailabilityZone() {
            return this.defaultAvailabilityZone;
        }

        @Override
        public final java.lang.String getDefaultOs() {
            return this.defaultOs;
        }

        @Override
        public final java.lang.String getDefaultRootDeviceType() {
            return this.defaultRootDeviceType;
        }

        @Override
        public final java.lang.String getDefaultSshKeyName() {
            return this.defaultSshKeyName;
        }

        @Override
        public final java.lang.String getDefaultSubnetId() {
            return this.defaultSubnetId;
        }

        @Override
        public final java.lang.String getHostnameTheme() {
            return this.hostnameTheme;
        }

        @Override
        public final java.lang.Boolean getManageBerkshelf() {
            return this.manageBerkshelf;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Boolean getUseCustomCookbooks() {
            return this.useCustomCookbooks;
        }

        @Override
        public final java.lang.Boolean getUseOpsworksSecurityGroups() {
            return this.useOpsworksSecurityGroups;
        }

        @Override
        public final java.lang.String getVpcId() {
            return this.vpcId;
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

            data.set("defaultInstanceProfileArn", om.valueToTree(this.getDefaultInstanceProfileArn()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("region", om.valueToTree(this.getRegion()));
            data.set("serviceRoleArn", om.valueToTree(this.getServiceRoleArn()));
            if (this.getAgentVersion() != null) {
                data.set("agentVersion", om.valueToTree(this.getAgentVersion()));
            }
            if (this.getBerkshelfVersion() != null) {
                data.set("berkshelfVersion", om.valueToTree(this.getBerkshelfVersion()));
            }
            if (this.getColor() != null) {
                data.set("color", om.valueToTree(this.getColor()));
            }
            if (this.getConfigurationManagerName() != null) {
                data.set("configurationManagerName", om.valueToTree(this.getConfigurationManagerName()));
            }
            if (this.getConfigurationManagerVersion() != null) {
                data.set("configurationManagerVersion", om.valueToTree(this.getConfigurationManagerVersion()));
            }
            if (this.getCustomCookbooksSource() != null) {
                data.set("customCookbooksSource", om.valueToTree(this.getCustomCookbooksSource()));
            }
            if (this.getCustomJson() != null) {
                data.set("customJson", om.valueToTree(this.getCustomJson()));
            }
            if (this.getDefaultAvailabilityZone() != null) {
                data.set("defaultAvailabilityZone", om.valueToTree(this.getDefaultAvailabilityZone()));
            }
            if (this.getDefaultOs() != null) {
                data.set("defaultOs", om.valueToTree(this.getDefaultOs()));
            }
            if (this.getDefaultRootDeviceType() != null) {
                data.set("defaultRootDeviceType", om.valueToTree(this.getDefaultRootDeviceType()));
            }
            if (this.getDefaultSshKeyName() != null) {
                data.set("defaultSshKeyName", om.valueToTree(this.getDefaultSshKeyName()));
            }
            if (this.getDefaultSubnetId() != null) {
                data.set("defaultSubnetId", om.valueToTree(this.getDefaultSubnetId()));
            }
            if (this.getHostnameTheme() != null) {
                data.set("hostnameTheme", om.valueToTree(this.getHostnameTheme()));
            }
            if (this.getManageBerkshelf() != null) {
                data.set("manageBerkshelf", om.valueToTree(this.getManageBerkshelf()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUseCustomCookbooks() != null) {
                data.set("useCustomCookbooks", om.valueToTree(this.getUseCustomCookbooks()));
            }
            if (this.getUseOpsworksSecurityGroups() != null) {
                data.set("useOpsworksSecurityGroups", om.valueToTree(this.getUseOpsworksSecurityGroups()));
            }
            if (this.getVpcId() != null) {
                data.set("vpcId", om.valueToTree(this.getVpcId()));
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
            struct.set("fqn", om.valueToTree("aws.OpsworksStackConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksStackConfig.Jsii$Proxy that = (OpsworksStackConfig.Jsii$Proxy) o;

            if (!defaultInstanceProfileArn.equals(that.defaultInstanceProfileArn)) return false;
            if (!name.equals(that.name)) return false;
            if (!region.equals(that.region)) return false;
            if (!serviceRoleArn.equals(that.serviceRoleArn)) return false;
            if (this.agentVersion != null ? !this.agentVersion.equals(that.agentVersion) : that.agentVersion != null) return false;
            if (this.berkshelfVersion != null ? !this.berkshelfVersion.equals(that.berkshelfVersion) : that.berkshelfVersion != null) return false;
            if (this.color != null ? !this.color.equals(that.color) : that.color != null) return false;
            if (this.configurationManagerName != null ? !this.configurationManagerName.equals(that.configurationManagerName) : that.configurationManagerName != null) return false;
            if (this.configurationManagerVersion != null ? !this.configurationManagerVersion.equals(that.configurationManagerVersion) : that.configurationManagerVersion != null) return false;
            if (this.customCookbooksSource != null ? !this.customCookbooksSource.equals(that.customCookbooksSource) : that.customCookbooksSource != null) return false;
            if (this.customJson != null ? !this.customJson.equals(that.customJson) : that.customJson != null) return false;
            if (this.defaultAvailabilityZone != null ? !this.defaultAvailabilityZone.equals(that.defaultAvailabilityZone) : that.defaultAvailabilityZone != null) return false;
            if (this.defaultOs != null ? !this.defaultOs.equals(that.defaultOs) : that.defaultOs != null) return false;
            if (this.defaultRootDeviceType != null ? !this.defaultRootDeviceType.equals(that.defaultRootDeviceType) : that.defaultRootDeviceType != null) return false;
            if (this.defaultSshKeyName != null ? !this.defaultSshKeyName.equals(that.defaultSshKeyName) : that.defaultSshKeyName != null) return false;
            if (this.defaultSubnetId != null ? !this.defaultSubnetId.equals(that.defaultSubnetId) : that.defaultSubnetId != null) return false;
            if (this.hostnameTheme != null ? !this.hostnameTheme.equals(that.hostnameTheme) : that.hostnameTheme != null) return false;
            if (this.manageBerkshelf != null ? !this.manageBerkshelf.equals(that.manageBerkshelf) : that.manageBerkshelf != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.useCustomCookbooks != null ? !this.useCustomCookbooks.equals(that.useCustomCookbooks) : that.useCustomCookbooks != null) return false;
            if (this.useOpsworksSecurityGroups != null ? !this.useOpsworksSecurityGroups.equals(that.useOpsworksSecurityGroups) : that.useOpsworksSecurityGroups != null) return false;
            if (this.vpcId != null ? !this.vpcId.equals(that.vpcId) : that.vpcId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultInstanceProfileArn.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.region.hashCode());
            result = 31 * result + (this.serviceRoleArn.hashCode());
            result = 31 * result + (this.agentVersion != null ? this.agentVersion.hashCode() : 0);
            result = 31 * result + (this.berkshelfVersion != null ? this.berkshelfVersion.hashCode() : 0);
            result = 31 * result + (this.color != null ? this.color.hashCode() : 0);
            result = 31 * result + (this.configurationManagerName != null ? this.configurationManagerName.hashCode() : 0);
            result = 31 * result + (this.configurationManagerVersion != null ? this.configurationManagerVersion.hashCode() : 0);
            result = 31 * result + (this.customCookbooksSource != null ? this.customCookbooksSource.hashCode() : 0);
            result = 31 * result + (this.customJson != null ? this.customJson.hashCode() : 0);
            result = 31 * result + (this.defaultAvailabilityZone != null ? this.defaultAvailabilityZone.hashCode() : 0);
            result = 31 * result + (this.defaultOs != null ? this.defaultOs.hashCode() : 0);
            result = 31 * result + (this.defaultRootDeviceType != null ? this.defaultRootDeviceType.hashCode() : 0);
            result = 31 * result + (this.defaultSshKeyName != null ? this.defaultSshKeyName.hashCode() : 0);
            result = 31 * result + (this.defaultSubnetId != null ? this.defaultSubnetId.hashCode() : 0);
            result = 31 * result + (this.hostnameTheme != null ? this.hostnameTheme.hashCode() : 0);
            result = 31 * result + (this.manageBerkshelf != null ? this.manageBerkshelf.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.useCustomCookbooks != null ? this.useCustomCookbooks.hashCode() : 0);
            result = 31 * result + (this.useOpsworksSecurityGroups != null ? this.useOpsworksSecurityGroups.hashCode() : 0);
            result = 31 * result + (this.vpcId != null ? this.vpcId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
