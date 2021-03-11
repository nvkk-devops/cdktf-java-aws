package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.691Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateConfig")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateConfig.Jsii$Proxy.class)
public interface LaunchTemplateConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * block_device_mappings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings> getBlockDeviceMappings() {
        return null;
    }

    /**
     * capacity_reservation_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification> getCapacityReservationSpecification() {
        return null;
    }

    /**
     * cpu_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateCpuOptions> getCpuOptions() {
        return null;
    }

    /**
     * credit_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateCreditSpecification> getCreditSpecification() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableApiTermination() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEbsOptimized() {
        return null;
    }

    /**
     * elastic_gpu_specifications block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications> getElasticGpuSpecifications() {
        return null;
    }

    /**
     * elastic_inference_accelerator block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator> getElasticInferenceAccelerator() {
        return null;
    }

    /**
     * hibernation_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateHibernationOptions> getHibernationOptions() {
        return null;
    }

    /**
     * iam_instance_profile block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateIamInstanceProfile> getIamInstanceProfile() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getImageId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceInitiatedShutdownBehavior() {
        return null;
    }

    /**
     * instance_market_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions> getInstanceMarketOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKernelId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKeyName() {
        return null;
    }

    /**
     * license_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateLicenseSpecification> getLicenseSpecification() {
        return null;
    }

    /**
     * metadata_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateMetadataOptions> getMetadataOptions() {
        return null;
    }

    /**
     * monitoring block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateMonitoring> getMonitoring() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    /**
     * network_interfaces block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateNetworkInterfaces> getNetworkInterfaces() {
        return null;
    }

    /**
     * placement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplatePlacement> getPlacement() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRamDiskId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupNames() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * tag_specifications block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateTagSpecifications> getTagSpecifications() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUpdateDefaultVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserData() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateConfig> {
        private java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings> blockDeviceMappings;
        private java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification> capacityReservationSpecification;
        private java.util.List<imports.aws.LaunchTemplateCpuOptions> cpuOptions;
        private java.util.List<imports.aws.LaunchTemplateCreditSpecification> creditSpecification;
        private java.lang.Number defaultVersion;
        private java.lang.String description;
        private java.lang.Boolean disableApiTermination;
        private java.lang.String ebsOptimized;
        private java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications> elasticGpuSpecifications;
        private java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerator;
        private java.util.List<imports.aws.LaunchTemplateHibernationOptions> hibernationOptions;
        private java.util.List<imports.aws.LaunchTemplateIamInstanceProfile> iamInstanceProfile;
        private java.lang.String imageId;
        private java.lang.String instanceInitiatedShutdownBehavior;
        private java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions> instanceMarketOptions;
        private java.lang.String instanceType;
        private java.lang.String kernelId;
        private java.lang.String keyName;
        private java.util.List<imports.aws.LaunchTemplateLicenseSpecification> licenseSpecification;
        private java.util.List<imports.aws.LaunchTemplateMetadataOptions> metadataOptions;
        private java.util.List<imports.aws.LaunchTemplateMonitoring> monitoring;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.util.List<imports.aws.LaunchTemplateNetworkInterfaces> networkInterfaces;
        private java.util.List<imports.aws.LaunchTemplatePlacement> placement;
        private java.lang.String ramDiskId;
        private java.util.List<java.lang.String> securityGroupNames;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.LaunchTemplateTagSpecifications> tagSpecifications;
        private java.lang.Boolean updateDefaultVersion;
        private java.lang.String userData;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LaunchTemplateConfig#getBlockDeviceMappings}
         * @param blockDeviceMappings block_device_mappings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder blockDeviceMappings(java.util.List<? extends imports.aws.LaunchTemplateBlockDeviceMappings> blockDeviceMappings) {
            this.blockDeviceMappings = (java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings>)blockDeviceMappings;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getCapacityReservationSpecification}
         * @param capacityReservationSpecification capacity_reservation_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder capacityReservationSpecification(java.util.List<? extends imports.aws.LaunchTemplateCapacityReservationSpecification> capacityReservationSpecification) {
            this.capacityReservationSpecification = (java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification>)capacityReservationSpecification;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getCpuOptions}
         * @param cpuOptions cpu_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cpuOptions(java.util.List<? extends imports.aws.LaunchTemplateCpuOptions> cpuOptions) {
            this.cpuOptions = (java.util.List<imports.aws.LaunchTemplateCpuOptions>)cpuOptions;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getCreditSpecification}
         * @param creditSpecification credit_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder creditSpecification(java.util.List<? extends imports.aws.LaunchTemplateCreditSpecification> creditSpecification) {
            this.creditSpecification = (java.util.List<imports.aws.LaunchTemplateCreditSpecification>)creditSpecification;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getDefaultVersion}
         * @param defaultVersion the value to be set.
         * @return {@code this}
         */
        public Builder defaultVersion(java.lang.Number defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getDisableApiTermination}
         * @param disableApiTermination the value to be set.
         * @return {@code this}
         */
        public Builder disableApiTermination(java.lang.Boolean disableApiTermination) {
            this.disableApiTermination = disableApiTermination;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getEbsOptimized}
         * @param ebsOptimized the value to be set.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.String ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getElasticGpuSpecifications}
         * @param elasticGpuSpecifications elastic_gpu_specifications block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elasticGpuSpecifications(java.util.List<? extends imports.aws.LaunchTemplateElasticGpuSpecifications> elasticGpuSpecifications) {
            this.elasticGpuSpecifications = (java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications>)elasticGpuSpecifications;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getElasticInferenceAccelerator}
         * @param elasticInferenceAccelerator elastic_inference_accelerator block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elasticInferenceAccelerator(java.util.List<? extends imports.aws.LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerator) {
            this.elasticInferenceAccelerator = (java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator>)elasticInferenceAccelerator;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getHibernationOptions}
         * @param hibernationOptions hibernation_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder hibernationOptions(java.util.List<? extends imports.aws.LaunchTemplateHibernationOptions> hibernationOptions) {
            this.hibernationOptions = (java.util.List<imports.aws.LaunchTemplateHibernationOptions>)hibernationOptions;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getIamInstanceProfile}
         * @param iamInstanceProfile iam_instance_profile block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder iamInstanceProfile(java.util.List<? extends imports.aws.LaunchTemplateIamInstanceProfile> iamInstanceProfile) {
            this.iamInstanceProfile = (java.util.List<imports.aws.LaunchTemplateIamInstanceProfile>)iamInstanceProfile;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getImageId}
         * @param imageId the value to be set.
         * @return {@code this}
         */
        public Builder imageId(java.lang.String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getInstanceInitiatedShutdownBehavior}
         * @param instanceInitiatedShutdownBehavior the value to be set.
         * @return {@code this}
         */
        public Builder instanceInitiatedShutdownBehavior(java.lang.String instanceInitiatedShutdownBehavior) {
            this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getInstanceMarketOptions}
         * @param instanceMarketOptions instance_market_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder instanceMarketOptions(java.util.List<? extends imports.aws.LaunchTemplateInstanceMarketOptions> instanceMarketOptions) {
            this.instanceMarketOptions = (java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions>)instanceMarketOptions;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getInstanceType}
         * @param instanceType the value to be set.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getKernelId}
         * @param kernelId the value to be set.
         * @return {@code this}
         */
        public Builder kernelId(java.lang.String kernelId) {
            this.kernelId = kernelId;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getKeyName}
         * @param keyName the value to be set.
         * @return {@code this}
         */
        public Builder keyName(java.lang.String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getLicenseSpecification}
         * @param licenseSpecification license_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder licenseSpecification(java.util.List<? extends imports.aws.LaunchTemplateLicenseSpecification> licenseSpecification) {
            this.licenseSpecification = (java.util.List<imports.aws.LaunchTemplateLicenseSpecification>)licenseSpecification;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getMetadataOptions}
         * @param metadataOptions metadata_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder metadataOptions(java.util.List<? extends imports.aws.LaunchTemplateMetadataOptions> metadataOptions) {
            this.metadataOptions = (java.util.List<imports.aws.LaunchTemplateMetadataOptions>)metadataOptions;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getMonitoring}
         * @param monitoring monitoring block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder monitoring(java.util.List<? extends imports.aws.LaunchTemplateMonitoring> monitoring) {
            this.monitoring = (java.util.List<imports.aws.LaunchTemplateMonitoring>)monitoring;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getNetworkInterfaces}
         * @param networkInterfaces network_interfaces block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder networkInterfaces(java.util.List<? extends imports.aws.LaunchTemplateNetworkInterfaces> networkInterfaces) {
            this.networkInterfaces = (java.util.List<imports.aws.LaunchTemplateNetworkInterfaces>)networkInterfaces;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getPlacement}
         * @param placement placement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder placement(java.util.List<? extends imports.aws.LaunchTemplatePlacement> placement) {
            this.placement = (java.util.List<imports.aws.LaunchTemplatePlacement>)placement;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getRamDiskId}
         * @param ramDiskId the value to be set.
         * @return {@code this}
         */
        public Builder ramDiskId(java.lang.String ramDiskId) {
            this.ramDiskId = ramDiskId;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getSecurityGroupNames}
         * @param securityGroupNames the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupNames(java.util.List<java.lang.String> securityGroupNames) {
            this.securityGroupNames = securityGroupNames;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getTagSpecifications}
         * @param tagSpecifications tag_specifications block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tagSpecifications(java.util.List<? extends imports.aws.LaunchTemplateTagSpecifications> tagSpecifications) {
            this.tagSpecifications = (java.util.List<imports.aws.LaunchTemplateTagSpecifications>)tagSpecifications;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getUpdateDefaultVersion}
         * @param updateDefaultVersion the value to be set.
         * @return {@code this}
         */
        public Builder updateDefaultVersion(java.lang.Boolean updateDefaultVersion) {
            this.updateDefaultVersion = updateDefaultVersion;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getUserData}
         * @param userData the value to be set.
         * @return {@code this}
         */
        public Builder userData(java.lang.String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getDependsOn}
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
         * Sets the value of {@link LaunchTemplateConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateConfig#getProvider}
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
         * @return a new instance of {@link LaunchTemplateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateConfig build() {
            return new Jsii$Proxy(blockDeviceMappings, capacityReservationSpecification, cpuOptions, creditSpecification, defaultVersion, description, disableApiTermination, ebsOptimized, elasticGpuSpecifications, elasticInferenceAccelerator, hibernationOptions, iamInstanceProfile, imageId, instanceInitiatedShutdownBehavior, instanceMarketOptions, instanceType, kernelId, keyName, licenseSpecification, metadataOptions, monitoring, name, namePrefix, networkInterfaces, placement, ramDiskId, securityGroupNames, tags, tagSpecifications, updateDefaultVersion, userData, vpcSecurityGroupIds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateConfig {
        private final java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings> blockDeviceMappings;
        private final java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification> capacityReservationSpecification;
        private final java.util.List<imports.aws.LaunchTemplateCpuOptions> cpuOptions;
        private final java.util.List<imports.aws.LaunchTemplateCreditSpecification> creditSpecification;
        private final java.lang.Number defaultVersion;
        private final java.lang.String description;
        private final java.lang.Boolean disableApiTermination;
        private final java.lang.String ebsOptimized;
        private final java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications> elasticGpuSpecifications;
        private final java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerator;
        private final java.util.List<imports.aws.LaunchTemplateHibernationOptions> hibernationOptions;
        private final java.util.List<imports.aws.LaunchTemplateIamInstanceProfile> iamInstanceProfile;
        private final java.lang.String imageId;
        private final java.lang.String instanceInitiatedShutdownBehavior;
        private final java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions> instanceMarketOptions;
        private final java.lang.String instanceType;
        private final java.lang.String kernelId;
        private final java.lang.String keyName;
        private final java.util.List<imports.aws.LaunchTemplateLicenseSpecification> licenseSpecification;
        private final java.util.List<imports.aws.LaunchTemplateMetadataOptions> metadataOptions;
        private final java.util.List<imports.aws.LaunchTemplateMonitoring> monitoring;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.util.List<imports.aws.LaunchTemplateNetworkInterfaces> networkInterfaces;
        private final java.util.List<imports.aws.LaunchTemplatePlacement> placement;
        private final java.lang.String ramDiskId;
        private final java.util.List<java.lang.String> securityGroupNames;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.LaunchTemplateTagSpecifications> tagSpecifications;
        private final java.lang.Boolean updateDefaultVersion;
        private final java.lang.String userData;
        private final java.util.List<java.lang.String> vpcSecurityGroupIds;
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
            this.blockDeviceMappings = software.amazon.jsii.Kernel.get(this, "blockDeviceMappings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateBlockDeviceMappings.class)));
            this.capacityReservationSpecification = software.amazon.jsii.Kernel.get(this, "capacityReservationSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCapacityReservationSpecification.class)));
            this.cpuOptions = software.amazon.jsii.Kernel.get(this, "cpuOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCpuOptions.class)));
            this.creditSpecification = software.amazon.jsii.Kernel.get(this, "creditSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCreditSpecification.class)));
            this.defaultVersion = software.amazon.jsii.Kernel.get(this, "defaultVersion", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.disableApiTermination = software.amazon.jsii.Kernel.get(this, "disableApiTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.elasticGpuSpecifications = software.amazon.jsii.Kernel.get(this, "elasticGpuSpecifications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateElasticGpuSpecifications.class)));
            this.elasticInferenceAccelerator = software.amazon.jsii.Kernel.get(this, "elasticInferenceAccelerator", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateElasticInferenceAccelerator.class)));
            this.hibernationOptions = software.amazon.jsii.Kernel.get(this, "hibernationOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateHibernationOptions.class)));
            this.iamInstanceProfile = software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateIamInstanceProfile.class)));
            this.imageId = software.amazon.jsii.Kernel.get(this, "imageId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceInitiatedShutdownBehavior = software.amazon.jsii.Kernel.get(this, "instanceInitiatedShutdownBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceMarketOptions = software.amazon.jsii.Kernel.get(this, "instanceMarketOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateInstanceMarketOptions.class)));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kernelId = software.amazon.jsii.Kernel.get(this, "kernelId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyName = software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.licenseSpecification = software.amazon.jsii.Kernel.get(this, "licenseSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateLicenseSpecification.class)));
            this.metadataOptions = software.amazon.jsii.Kernel.get(this, "metadataOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateMetadataOptions.class)));
            this.monitoring = software.amazon.jsii.Kernel.get(this, "monitoring", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateMonitoring.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkInterfaces = software.amazon.jsii.Kernel.get(this, "networkInterfaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateNetworkInterfaces.class)));
            this.placement = software.amazon.jsii.Kernel.get(this, "placement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplatePlacement.class)));
            this.ramDiskId = software.amazon.jsii.Kernel.get(this, "ramDiskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupNames = software.amazon.jsii.Kernel.get(this, "securityGroupNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagSpecifications = software.amazon.jsii.Kernel.get(this, "tagSpecifications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateTagSpecifications.class)));
            this.updateDefaultVersion = software.amazon.jsii.Kernel.get(this, "updateDefaultVersion", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.userData = software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.LaunchTemplateBlockDeviceMappings> blockDeviceMappings, final java.util.List<? extends imports.aws.LaunchTemplateCapacityReservationSpecification> capacityReservationSpecification, final java.util.List<? extends imports.aws.LaunchTemplateCpuOptions> cpuOptions, final java.util.List<? extends imports.aws.LaunchTemplateCreditSpecification> creditSpecification, final java.lang.Number defaultVersion, final java.lang.String description, final java.lang.Boolean disableApiTermination, final java.lang.String ebsOptimized, final java.util.List<? extends imports.aws.LaunchTemplateElasticGpuSpecifications> elasticGpuSpecifications, final java.util.List<? extends imports.aws.LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerator, final java.util.List<? extends imports.aws.LaunchTemplateHibernationOptions> hibernationOptions, final java.util.List<? extends imports.aws.LaunchTemplateIamInstanceProfile> iamInstanceProfile, final java.lang.String imageId, final java.lang.String instanceInitiatedShutdownBehavior, final java.util.List<? extends imports.aws.LaunchTemplateInstanceMarketOptions> instanceMarketOptions, final java.lang.String instanceType, final java.lang.String kernelId, final java.lang.String keyName, final java.util.List<? extends imports.aws.LaunchTemplateLicenseSpecification> licenseSpecification, final java.util.List<? extends imports.aws.LaunchTemplateMetadataOptions> metadataOptions, final java.util.List<? extends imports.aws.LaunchTemplateMonitoring> monitoring, final java.lang.String name, final java.lang.String namePrefix, final java.util.List<? extends imports.aws.LaunchTemplateNetworkInterfaces> networkInterfaces, final java.util.List<? extends imports.aws.LaunchTemplatePlacement> placement, final java.lang.String ramDiskId, final java.util.List<java.lang.String> securityGroupNames, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.LaunchTemplateTagSpecifications> tagSpecifications, final java.lang.Boolean updateDefaultVersion, final java.lang.String userData, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blockDeviceMappings = (java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings>)blockDeviceMappings;
            this.capacityReservationSpecification = (java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification>)capacityReservationSpecification;
            this.cpuOptions = (java.util.List<imports.aws.LaunchTemplateCpuOptions>)cpuOptions;
            this.creditSpecification = (java.util.List<imports.aws.LaunchTemplateCreditSpecification>)creditSpecification;
            this.defaultVersion = defaultVersion;
            this.description = description;
            this.disableApiTermination = disableApiTermination;
            this.ebsOptimized = ebsOptimized;
            this.elasticGpuSpecifications = (java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications>)elasticGpuSpecifications;
            this.elasticInferenceAccelerator = (java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator>)elasticInferenceAccelerator;
            this.hibernationOptions = (java.util.List<imports.aws.LaunchTemplateHibernationOptions>)hibernationOptions;
            this.iamInstanceProfile = (java.util.List<imports.aws.LaunchTemplateIamInstanceProfile>)iamInstanceProfile;
            this.imageId = imageId;
            this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
            this.instanceMarketOptions = (java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions>)instanceMarketOptions;
            this.instanceType = instanceType;
            this.kernelId = kernelId;
            this.keyName = keyName;
            this.licenseSpecification = (java.util.List<imports.aws.LaunchTemplateLicenseSpecification>)licenseSpecification;
            this.metadataOptions = (java.util.List<imports.aws.LaunchTemplateMetadataOptions>)metadataOptions;
            this.monitoring = (java.util.List<imports.aws.LaunchTemplateMonitoring>)monitoring;
            this.name = name;
            this.namePrefix = namePrefix;
            this.networkInterfaces = (java.util.List<imports.aws.LaunchTemplateNetworkInterfaces>)networkInterfaces;
            this.placement = (java.util.List<imports.aws.LaunchTemplatePlacement>)placement;
            this.ramDiskId = ramDiskId;
            this.securityGroupNames = securityGroupNames;
            this.tags = tags;
            this.tagSpecifications = (java.util.List<imports.aws.LaunchTemplateTagSpecifications>)tagSpecifications;
            this.updateDefaultVersion = updateDefaultVersion;
            this.userData = userData;
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings> getBlockDeviceMappings() {
            return this.blockDeviceMappings;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification> getCapacityReservationSpecification() {
            return this.capacityReservationSpecification;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateCpuOptions> getCpuOptions() {
            return this.cpuOptions;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateCreditSpecification> getCreditSpecification() {
            return this.creditSpecification;
        }

        @Override
        public final java.lang.Number getDefaultVersion() {
            return this.defaultVersion;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Boolean getDisableApiTermination() {
            return this.disableApiTermination;
        }

        @Override
        public final java.lang.String getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications> getElasticGpuSpecifications() {
            return this.elasticGpuSpecifications;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator> getElasticInferenceAccelerator() {
            return this.elasticInferenceAccelerator;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateHibernationOptions> getHibernationOptions() {
            return this.hibernationOptions;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateIamInstanceProfile> getIamInstanceProfile() {
            return this.iamInstanceProfile;
        }

        @Override
        public final java.lang.String getImageId() {
            return this.imageId;
        }

        @Override
        public final java.lang.String getInstanceInitiatedShutdownBehavior() {
            return this.instanceInitiatedShutdownBehavior;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions> getInstanceMarketOptions() {
            return this.instanceMarketOptions;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.String getKernelId() {
            return this.kernelId;
        }

        @Override
        public final java.lang.String getKeyName() {
            return this.keyName;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateLicenseSpecification> getLicenseSpecification() {
            return this.licenseSpecification;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateMetadataOptions> getMetadataOptions() {
            return this.metadataOptions;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateMonitoring> getMonitoring() {
            return this.monitoring;
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
        public final java.util.List<imports.aws.LaunchTemplateNetworkInterfaces> getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplatePlacement> getPlacement() {
            return this.placement;
        }

        @Override
        public final java.lang.String getRamDiskId() {
            return this.ramDiskId;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupNames() {
            return this.securityGroupNames;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateTagSpecifications> getTagSpecifications() {
            return this.tagSpecifications;
        }

        @Override
        public final java.lang.Boolean getUpdateDefaultVersion() {
            return this.updateDefaultVersion;
        }

        @Override
        public final java.lang.String getUserData() {
            return this.userData;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSecurityGroupIds() {
            return this.vpcSecurityGroupIds;
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

            if (this.getBlockDeviceMappings() != null) {
                data.set("blockDeviceMappings", om.valueToTree(this.getBlockDeviceMappings()));
            }
            if (this.getCapacityReservationSpecification() != null) {
                data.set("capacityReservationSpecification", om.valueToTree(this.getCapacityReservationSpecification()));
            }
            if (this.getCpuOptions() != null) {
                data.set("cpuOptions", om.valueToTree(this.getCpuOptions()));
            }
            if (this.getCreditSpecification() != null) {
                data.set("creditSpecification", om.valueToTree(this.getCreditSpecification()));
            }
            if (this.getDefaultVersion() != null) {
                data.set("defaultVersion", om.valueToTree(this.getDefaultVersion()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDisableApiTermination() != null) {
                data.set("disableApiTermination", om.valueToTree(this.getDisableApiTermination()));
            }
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getElasticGpuSpecifications() != null) {
                data.set("elasticGpuSpecifications", om.valueToTree(this.getElasticGpuSpecifications()));
            }
            if (this.getElasticInferenceAccelerator() != null) {
                data.set("elasticInferenceAccelerator", om.valueToTree(this.getElasticInferenceAccelerator()));
            }
            if (this.getHibernationOptions() != null) {
                data.set("hibernationOptions", om.valueToTree(this.getHibernationOptions()));
            }
            if (this.getIamInstanceProfile() != null) {
                data.set("iamInstanceProfile", om.valueToTree(this.getIamInstanceProfile()));
            }
            if (this.getImageId() != null) {
                data.set("imageId", om.valueToTree(this.getImageId()));
            }
            if (this.getInstanceInitiatedShutdownBehavior() != null) {
                data.set("instanceInitiatedShutdownBehavior", om.valueToTree(this.getInstanceInitiatedShutdownBehavior()));
            }
            if (this.getInstanceMarketOptions() != null) {
                data.set("instanceMarketOptions", om.valueToTree(this.getInstanceMarketOptions()));
            }
            if (this.getInstanceType() != null) {
                data.set("instanceType", om.valueToTree(this.getInstanceType()));
            }
            if (this.getKernelId() != null) {
                data.set("kernelId", om.valueToTree(this.getKernelId()));
            }
            if (this.getKeyName() != null) {
                data.set("keyName", om.valueToTree(this.getKeyName()));
            }
            if (this.getLicenseSpecification() != null) {
                data.set("licenseSpecification", om.valueToTree(this.getLicenseSpecification()));
            }
            if (this.getMetadataOptions() != null) {
                data.set("metadataOptions", om.valueToTree(this.getMetadataOptions()));
            }
            if (this.getMonitoring() != null) {
                data.set("monitoring", om.valueToTree(this.getMonitoring()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getNetworkInterfaces() != null) {
                data.set("networkInterfaces", om.valueToTree(this.getNetworkInterfaces()));
            }
            if (this.getPlacement() != null) {
                data.set("placement", om.valueToTree(this.getPlacement()));
            }
            if (this.getRamDiskId() != null) {
                data.set("ramDiskId", om.valueToTree(this.getRamDiskId()));
            }
            if (this.getSecurityGroupNames() != null) {
                data.set("securityGroupNames", om.valueToTree(this.getSecurityGroupNames()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagSpecifications() != null) {
                data.set("tagSpecifications", om.valueToTree(this.getTagSpecifications()));
            }
            if (this.getUpdateDefaultVersion() != null) {
                data.set("updateDefaultVersion", om.valueToTree(this.getUpdateDefaultVersion()));
            }
            if (this.getUserData() != null) {
                data.set("userData", om.valueToTree(this.getUserData()));
            }
            if (this.getVpcSecurityGroupIds() != null) {
                data.set("vpcSecurityGroupIds", om.valueToTree(this.getVpcSecurityGroupIds()));
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
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateConfig.Jsii$Proxy that = (LaunchTemplateConfig.Jsii$Proxy) o;

            if (this.blockDeviceMappings != null ? !this.blockDeviceMappings.equals(that.blockDeviceMappings) : that.blockDeviceMappings != null) return false;
            if (this.capacityReservationSpecification != null ? !this.capacityReservationSpecification.equals(that.capacityReservationSpecification) : that.capacityReservationSpecification != null) return false;
            if (this.cpuOptions != null ? !this.cpuOptions.equals(that.cpuOptions) : that.cpuOptions != null) return false;
            if (this.creditSpecification != null ? !this.creditSpecification.equals(that.creditSpecification) : that.creditSpecification != null) return false;
            if (this.defaultVersion != null ? !this.defaultVersion.equals(that.defaultVersion) : that.defaultVersion != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.disableApiTermination != null ? !this.disableApiTermination.equals(that.disableApiTermination) : that.disableApiTermination != null) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.elasticGpuSpecifications != null ? !this.elasticGpuSpecifications.equals(that.elasticGpuSpecifications) : that.elasticGpuSpecifications != null) return false;
            if (this.elasticInferenceAccelerator != null ? !this.elasticInferenceAccelerator.equals(that.elasticInferenceAccelerator) : that.elasticInferenceAccelerator != null) return false;
            if (this.hibernationOptions != null ? !this.hibernationOptions.equals(that.hibernationOptions) : that.hibernationOptions != null) return false;
            if (this.iamInstanceProfile != null ? !this.iamInstanceProfile.equals(that.iamInstanceProfile) : that.iamInstanceProfile != null) return false;
            if (this.imageId != null ? !this.imageId.equals(that.imageId) : that.imageId != null) return false;
            if (this.instanceInitiatedShutdownBehavior != null ? !this.instanceInitiatedShutdownBehavior.equals(that.instanceInitiatedShutdownBehavior) : that.instanceInitiatedShutdownBehavior != null) return false;
            if (this.instanceMarketOptions != null ? !this.instanceMarketOptions.equals(that.instanceMarketOptions) : that.instanceMarketOptions != null) return false;
            if (this.instanceType != null ? !this.instanceType.equals(that.instanceType) : that.instanceType != null) return false;
            if (this.kernelId != null ? !this.kernelId.equals(that.kernelId) : that.kernelId != null) return false;
            if (this.keyName != null ? !this.keyName.equals(that.keyName) : that.keyName != null) return false;
            if (this.licenseSpecification != null ? !this.licenseSpecification.equals(that.licenseSpecification) : that.licenseSpecification != null) return false;
            if (this.metadataOptions != null ? !this.metadataOptions.equals(that.metadataOptions) : that.metadataOptions != null) return false;
            if (this.monitoring != null ? !this.monitoring.equals(that.monitoring) : that.monitoring != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.networkInterfaces != null ? !this.networkInterfaces.equals(that.networkInterfaces) : that.networkInterfaces != null) return false;
            if (this.placement != null ? !this.placement.equals(that.placement) : that.placement != null) return false;
            if (this.ramDiskId != null ? !this.ramDiskId.equals(that.ramDiskId) : that.ramDiskId != null) return false;
            if (this.securityGroupNames != null ? !this.securityGroupNames.equals(that.securityGroupNames) : that.securityGroupNames != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagSpecifications != null ? !this.tagSpecifications.equals(that.tagSpecifications) : that.tagSpecifications != null) return false;
            if (this.updateDefaultVersion != null ? !this.updateDefaultVersion.equals(that.updateDefaultVersion) : that.updateDefaultVersion != null) return false;
            if (this.userData != null ? !this.userData.equals(that.userData) : that.userData != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blockDeviceMappings != null ? this.blockDeviceMappings.hashCode() : 0;
            result = 31 * result + (this.capacityReservationSpecification != null ? this.capacityReservationSpecification.hashCode() : 0);
            result = 31 * result + (this.cpuOptions != null ? this.cpuOptions.hashCode() : 0);
            result = 31 * result + (this.creditSpecification != null ? this.creditSpecification.hashCode() : 0);
            result = 31 * result + (this.defaultVersion != null ? this.defaultVersion.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.disableApiTermination != null ? this.disableApiTermination.hashCode() : 0);
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.elasticGpuSpecifications != null ? this.elasticGpuSpecifications.hashCode() : 0);
            result = 31 * result + (this.elasticInferenceAccelerator != null ? this.elasticInferenceAccelerator.hashCode() : 0);
            result = 31 * result + (this.hibernationOptions != null ? this.hibernationOptions.hashCode() : 0);
            result = 31 * result + (this.iamInstanceProfile != null ? this.iamInstanceProfile.hashCode() : 0);
            result = 31 * result + (this.imageId != null ? this.imageId.hashCode() : 0);
            result = 31 * result + (this.instanceInitiatedShutdownBehavior != null ? this.instanceInitiatedShutdownBehavior.hashCode() : 0);
            result = 31 * result + (this.instanceMarketOptions != null ? this.instanceMarketOptions.hashCode() : 0);
            result = 31 * result + (this.instanceType != null ? this.instanceType.hashCode() : 0);
            result = 31 * result + (this.kernelId != null ? this.kernelId.hashCode() : 0);
            result = 31 * result + (this.keyName != null ? this.keyName.hashCode() : 0);
            result = 31 * result + (this.licenseSpecification != null ? this.licenseSpecification.hashCode() : 0);
            result = 31 * result + (this.metadataOptions != null ? this.metadataOptions.hashCode() : 0);
            result = 31 * result + (this.monitoring != null ? this.monitoring.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.networkInterfaces != null ? this.networkInterfaces.hashCode() : 0);
            result = 31 * result + (this.placement != null ? this.placement.hashCode() : 0);
            result = 31 * result + (this.ramDiskId != null ? this.ramDiskId.hashCode() : 0);
            result = 31 * result + (this.securityGroupNames != null ? this.securityGroupNames.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagSpecifications != null ? this.tagSpecifications.hashCode() : 0);
            result = 31 * result + (this.updateDefaultVersion != null ? this.updateDefaultVersion.hashCode() : 0);
            result = 31 * result + (this.userData != null ? this.userData.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
