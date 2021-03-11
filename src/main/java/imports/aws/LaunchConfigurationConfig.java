package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.681Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchConfigurationConfig")
@software.amazon.jsii.Jsii.Proxy(LaunchConfigurationConfig.Jsii$Proxy.class)
public interface LaunchConfigurationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getImageId();

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAssociatePublicIpAddress() {
        return null;
    }

    /**
     * ebs_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchConfigurationEbsBlockDevice> getEbsBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimized() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableMonitoring() {
        return null;
    }

    /**
     * ephemeral_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchConfigurationEphemeralBlockDevice> getEphemeralBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIamInstanceProfile() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKeyName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlacementTenancy() {
        return null;
    }

    /**
     * root_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchConfigurationRootBlockDevice> getRootBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotPrice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserData() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserDataBase64() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcClassicLinkId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcClassicLinkSecurityGroups() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchConfigurationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchConfigurationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchConfigurationConfig> {
        private java.lang.String imageId;
        private java.lang.String instanceType;
        private java.lang.Boolean associatePublicIpAddress;
        private java.util.List<imports.aws.LaunchConfigurationEbsBlockDevice> ebsBlockDevice;
        private java.lang.Boolean ebsOptimized;
        private java.lang.Boolean enableMonitoring;
        private java.util.List<imports.aws.LaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevice;
        private java.lang.String iamInstanceProfile;
        private java.lang.String keyName;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.lang.String placementTenancy;
        private java.util.List<imports.aws.LaunchConfigurationRootBlockDevice> rootBlockDevice;
        private java.util.List<java.lang.String> securityGroups;
        private java.lang.String spotPrice;
        private java.lang.String userData;
        private java.lang.String userDataBase64;
        private java.lang.String vpcClassicLinkId;
        private java.util.List<java.lang.String> vpcClassicLinkSecurityGroups;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getImageId}
         * @param imageId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder imageId(java.lang.String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getInstanceType}
         * @param instanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getAssociatePublicIpAddress}
         * @param associatePublicIpAddress the value to be set.
         * @return {@code this}
         */
        public Builder associatePublicIpAddress(java.lang.Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getEbsBlockDevice}
         * @param ebsBlockDevice ebs_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends imports.aws.LaunchConfigurationEbsBlockDevice> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<imports.aws.LaunchConfigurationEbsBlockDevice>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getEbsOptimized}
         * @param ebsOptimized the value to be set.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getEnableMonitoring}
         * @param enableMonitoring the value to be set.
         * @return {@code this}
         */
        public Builder enableMonitoring(java.lang.Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice ephemeral_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends imports.aws.LaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<imports.aws.LaunchConfigurationEphemeralBlockDevice>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getIamInstanceProfile}
         * @param iamInstanceProfile the value to be set.
         * @return {@code this}
         */
        public Builder iamInstanceProfile(java.lang.String iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getKeyName}
         * @param keyName the value to be set.
         * @return {@code this}
         */
        public Builder keyName(java.lang.String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getPlacementTenancy}
         * @param placementTenancy the value to be set.
         * @return {@code this}
         */
        public Builder placementTenancy(java.lang.String placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getRootBlockDevice}
         * @param rootBlockDevice root_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rootBlockDevice(java.util.List<? extends imports.aws.LaunchConfigurationRootBlockDevice> rootBlockDevice) {
            this.rootBlockDevice = (java.util.List<imports.aws.LaunchConfigurationRootBlockDevice>)rootBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getSpotPrice}
         * @param spotPrice the value to be set.
         * @return {@code this}
         */
        public Builder spotPrice(java.lang.String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getUserData}
         * @param userData the value to be set.
         * @return {@code this}
         */
        public Builder userData(java.lang.String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getUserDataBase64}
         * @param userDataBase64 the value to be set.
         * @return {@code this}
         */
        public Builder userDataBase64(java.lang.String userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getVpcClassicLinkId}
         * @param vpcClassicLinkId the value to be set.
         * @return {@code this}
         */
        public Builder vpcClassicLinkId(java.lang.String vpcClassicLinkId) {
            this.vpcClassicLinkId = vpcClassicLinkId;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getVpcClassicLinkSecurityGroups}
         * @param vpcClassicLinkSecurityGroups the value to be set.
         * @return {@code this}
         */
        public Builder vpcClassicLinkSecurityGroups(java.util.List<java.lang.String> vpcClassicLinkSecurityGroups) {
            this.vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getDependsOn}
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
         * Sets the value of {@link LaunchConfigurationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LaunchConfigurationConfig#getProvider}
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
         * @return a new instance of {@link LaunchConfigurationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchConfigurationConfig build() {
            return new Jsii$Proxy(imageId, instanceType, associatePublicIpAddress, ebsBlockDevice, ebsOptimized, enableMonitoring, ephemeralBlockDevice, iamInstanceProfile, keyName, name, namePrefix, placementTenancy, rootBlockDevice, securityGroups, spotPrice, userData, userDataBase64, vpcClassicLinkId, vpcClassicLinkSecurityGroups, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LaunchConfigurationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchConfigurationConfig {
        private final java.lang.String imageId;
        private final java.lang.String instanceType;
        private final java.lang.Boolean associatePublicIpAddress;
        private final java.util.List<imports.aws.LaunchConfigurationEbsBlockDevice> ebsBlockDevice;
        private final java.lang.Boolean ebsOptimized;
        private final java.lang.Boolean enableMonitoring;
        private final java.util.List<imports.aws.LaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevice;
        private final java.lang.String iamInstanceProfile;
        private final java.lang.String keyName;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.String placementTenancy;
        private final java.util.List<imports.aws.LaunchConfigurationRootBlockDevice> rootBlockDevice;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.lang.String spotPrice;
        private final java.lang.String userData;
        private final java.lang.String userDataBase64;
        private final java.lang.String vpcClassicLinkId;
        private final java.util.List<java.lang.String> vpcClassicLinkSecurityGroups;
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
            this.imageId = software.amazon.jsii.Kernel.get(this, "imageId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.associatePublicIpAddress = software.amazon.jsii.Kernel.get(this, "associatePublicIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchConfigurationEbsBlockDevice.class)));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableMonitoring = software.amazon.jsii.Kernel.get(this, "enableMonitoring", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchConfigurationEphemeralBlockDevice.class)));
            this.iamInstanceProfile = software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyName = software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.placementTenancy = software.amazon.jsii.Kernel.get(this, "placementTenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootBlockDevice = software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchConfigurationRootBlockDevice.class)));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.spotPrice = software.amazon.jsii.Kernel.get(this, "spotPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userData = software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userDataBase64 = software.amazon.jsii.Kernel.get(this, "userDataBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcClassicLinkId = software.amazon.jsii.Kernel.get(this, "vpcClassicLinkId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcClassicLinkSecurityGroups = software.amazon.jsii.Kernel.get(this, "vpcClassicLinkSecurityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String imageId, final java.lang.String instanceType, final java.lang.Boolean associatePublicIpAddress, final java.util.List<? extends imports.aws.LaunchConfigurationEbsBlockDevice> ebsBlockDevice, final java.lang.Boolean ebsOptimized, final java.lang.Boolean enableMonitoring, final java.util.List<? extends imports.aws.LaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevice, final java.lang.String iamInstanceProfile, final java.lang.String keyName, final java.lang.String name, final java.lang.String namePrefix, final java.lang.String placementTenancy, final java.util.List<? extends imports.aws.LaunchConfigurationRootBlockDevice> rootBlockDevice, final java.util.List<java.lang.String> securityGroups, final java.lang.String spotPrice, final java.lang.String userData, final java.lang.String userDataBase64, final java.lang.String vpcClassicLinkId, final java.util.List<java.lang.String> vpcClassicLinkSecurityGroups, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.imageId = java.util.Objects.requireNonNull(imageId, "imageId is required");
            this.instanceType = java.util.Objects.requireNonNull(instanceType, "instanceType is required");
            this.associatePublicIpAddress = associatePublicIpAddress;
            this.ebsBlockDevice = (java.util.List<imports.aws.LaunchConfigurationEbsBlockDevice>)ebsBlockDevice;
            this.ebsOptimized = ebsOptimized;
            this.enableMonitoring = enableMonitoring;
            this.ephemeralBlockDevice = (java.util.List<imports.aws.LaunchConfigurationEphemeralBlockDevice>)ephemeralBlockDevice;
            this.iamInstanceProfile = iamInstanceProfile;
            this.keyName = keyName;
            this.name = name;
            this.namePrefix = namePrefix;
            this.placementTenancy = placementTenancy;
            this.rootBlockDevice = (java.util.List<imports.aws.LaunchConfigurationRootBlockDevice>)rootBlockDevice;
            this.securityGroups = securityGroups;
            this.spotPrice = spotPrice;
            this.userData = userData;
            this.userDataBase64 = userDataBase64;
            this.vpcClassicLinkId = vpcClassicLinkId;
            this.vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getImageId() {
            return this.imageId;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.Boolean getAssociatePublicIpAddress() {
            return this.associatePublicIpAddress;
        }

        @Override
        public final java.util.List<imports.aws.LaunchConfigurationEbsBlockDevice> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.lang.Boolean getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.lang.Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        @Override
        public final java.util.List<imports.aws.LaunchConfigurationEphemeralBlockDevice> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.String getIamInstanceProfile() {
            return this.iamInstanceProfile;
        }

        @Override
        public final java.lang.String getKeyName() {
            return this.keyName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.String getPlacementTenancy() {
            return this.placementTenancy;
        }

        @Override
        public final java.util.List<imports.aws.LaunchConfigurationRootBlockDevice> getRootBlockDevice() {
            return this.rootBlockDevice;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.lang.String getSpotPrice() {
            return this.spotPrice;
        }

        @Override
        public final java.lang.String getUserData() {
            return this.userData;
        }

        @Override
        public final java.lang.String getUserDataBase64() {
            return this.userDataBase64;
        }

        @Override
        public final java.lang.String getVpcClassicLinkId() {
            return this.vpcClassicLinkId;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcClassicLinkSecurityGroups() {
            return this.vpcClassicLinkSecurityGroups;
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

            data.set("imageId", om.valueToTree(this.getImageId()));
            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            if (this.getAssociatePublicIpAddress() != null) {
                data.set("associatePublicIpAddress", om.valueToTree(this.getAssociatePublicIpAddress()));
            }
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getEnableMonitoring() != null) {
                data.set("enableMonitoring", om.valueToTree(this.getEnableMonitoring()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getIamInstanceProfile() != null) {
                data.set("iamInstanceProfile", om.valueToTree(this.getIamInstanceProfile()));
            }
            if (this.getKeyName() != null) {
                data.set("keyName", om.valueToTree(this.getKeyName()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getPlacementTenancy() != null) {
                data.set("placementTenancy", om.valueToTree(this.getPlacementTenancy()));
            }
            if (this.getRootBlockDevice() != null) {
                data.set("rootBlockDevice", om.valueToTree(this.getRootBlockDevice()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }
            if (this.getSpotPrice() != null) {
                data.set("spotPrice", om.valueToTree(this.getSpotPrice()));
            }
            if (this.getUserData() != null) {
                data.set("userData", om.valueToTree(this.getUserData()));
            }
            if (this.getUserDataBase64() != null) {
                data.set("userDataBase64", om.valueToTree(this.getUserDataBase64()));
            }
            if (this.getVpcClassicLinkId() != null) {
                data.set("vpcClassicLinkId", om.valueToTree(this.getVpcClassicLinkId()));
            }
            if (this.getVpcClassicLinkSecurityGroups() != null) {
                data.set("vpcClassicLinkSecurityGroups", om.valueToTree(this.getVpcClassicLinkSecurityGroups()));
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
            struct.set("fqn", om.valueToTree("aws.LaunchConfigurationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchConfigurationConfig.Jsii$Proxy that = (LaunchConfigurationConfig.Jsii$Proxy) o;

            if (!imageId.equals(that.imageId)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (this.associatePublicIpAddress != null ? !this.associatePublicIpAddress.equals(that.associatePublicIpAddress) : that.associatePublicIpAddress != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.enableMonitoring != null ? !this.enableMonitoring.equals(that.enableMonitoring) : that.enableMonitoring != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.iamInstanceProfile != null ? !this.iamInstanceProfile.equals(that.iamInstanceProfile) : that.iamInstanceProfile != null) return false;
            if (this.keyName != null ? !this.keyName.equals(that.keyName) : that.keyName != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.placementTenancy != null ? !this.placementTenancy.equals(that.placementTenancy) : that.placementTenancy != null) return false;
            if (this.rootBlockDevice != null ? !this.rootBlockDevice.equals(that.rootBlockDevice) : that.rootBlockDevice != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            if (this.spotPrice != null ? !this.spotPrice.equals(that.spotPrice) : that.spotPrice != null) return false;
            if (this.userData != null ? !this.userData.equals(that.userData) : that.userData != null) return false;
            if (this.userDataBase64 != null ? !this.userDataBase64.equals(that.userDataBase64) : that.userDataBase64 != null) return false;
            if (this.vpcClassicLinkId != null ? !this.vpcClassicLinkId.equals(that.vpcClassicLinkId) : that.vpcClassicLinkId != null) return false;
            if (this.vpcClassicLinkSecurityGroups != null ? !this.vpcClassicLinkSecurityGroups.equals(that.vpcClassicLinkSecurityGroups) : that.vpcClassicLinkSecurityGroups != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.imageId.hashCode();
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.associatePublicIpAddress != null ? this.associatePublicIpAddress.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.enableMonitoring != null ? this.enableMonitoring.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.iamInstanceProfile != null ? this.iamInstanceProfile.hashCode() : 0);
            result = 31 * result + (this.keyName != null ? this.keyName.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.placementTenancy != null ? this.placementTenancy.hashCode() : 0);
            result = 31 * result + (this.rootBlockDevice != null ? this.rootBlockDevice.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.spotPrice != null ? this.spotPrice.hashCode() : 0);
            result = 31 * result + (this.userData != null ? this.userData.hashCode() : 0);
            result = 31 * result + (this.userDataBase64 != null ? this.userDataBase64.hashCode() : 0);
            result = 31 * result + (this.vpcClassicLinkId != null ? this.vpcClassicLinkId.hashCode() : 0);
            result = 31 * result + (this.vpcClassicLinkSecurityGroups != null ? this.vpcClassicLinkSecurityGroups.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
