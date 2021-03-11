package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.682Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplate")
public class LaunchTemplate extends com.hashicorp.cdktf.TerraformResource {

    protected LaunchTemplate(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LaunchTemplate(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LaunchTemplate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.LaunchTemplateConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public LaunchTemplate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetBlockDeviceMappings() {
        software.amazon.jsii.Kernel.call(this, "resetBlockDeviceMappings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCapacityReservationSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityReservationSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCpuOptions() {
        software.amazon.jsii.Kernel.call(this, "resetCpuOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreditSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetCreditSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultVersion() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisableApiTermination() {
        software.amazon.jsii.Kernel.call(this, "resetDisableApiTermination", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsOptimized() {
        software.amazon.jsii.Kernel.call(this, "resetEbsOptimized", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticGpuSpecifications() {
        software.amazon.jsii.Kernel.call(this, "resetElasticGpuSpecifications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticInferenceAccelerator() {
        software.amazon.jsii.Kernel.call(this, "resetElasticInferenceAccelerator", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHibernationOptions() {
        software.amazon.jsii.Kernel.call(this, "resetHibernationOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIamInstanceProfile() {
        software.amazon.jsii.Kernel.call(this, "resetIamInstanceProfile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImageId() {
        software.amazon.jsii.Kernel.call(this, "resetImageId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceInitiatedShutdownBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceInitiatedShutdownBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceMarketOptions() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceMarketOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceType() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKernelId() {
        software.amazon.jsii.Kernel.call(this, "resetKernelId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKeyName() {
        software.amazon.jsii.Kernel.call(this, "resetKeyName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetadataOptions() {
        software.amazon.jsii.Kernel.call(this, "resetMetadataOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMonitoring() {
        software.amazon.jsii.Kernel.call(this, "resetMonitoring", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetworkInterfaces() {
        software.amazon.jsii.Kernel.call(this, "resetNetworkInterfaces", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlacement() {
        software.amazon.jsii.Kernel.call(this, "resetPlacement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRamDiskId() {
        software.amazon.jsii.Kernel.call(this, "resetRamDiskId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroupNames() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroupNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagSpecifications() {
        software.amazon.jsii.Kernel.call(this, "resetTagSpecifications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUpdateDefaultVersion() {
        software.amazon.jsii.Kernel.call(this, "resetUpdateDefaultVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserData() {
        software.amazon.jsii.Kernel.call(this, "resetUserData", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcSecurityGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetVpcSecurityGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLatestVersion() {
        return software.amazon.jsii.Kernel.get(this, "latestVersion", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings> getBlockDeviceMappingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings>)(software.amazon.jsii.Kernel.get(this, "blockDeviceMappingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateBlockDeviceMappings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification> getCapacityReservationSpecificationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification>)(software.amazon.jsii.Kernel.get(this, "capacityReservationSpecificationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCapacityReservationSpecification.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateCpuOptions> getCpuOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateCpuOptions>)(software.amazon.jsii.Kernel.get(this, "cpuOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCpuOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateCreditSpecification> getCreditSpecificationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateCreditSpecification>)(software.amazon.jsii.Kernel.get(this, "creditSpecificationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCreditSpecification.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableApiTerminationInput() {
        return software.amazon.jsii.Kernel.get(this, "disableApiTerminationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEbsOptimizedInput() {
        return software.amazon.jsii.Kernel.get(this, "ebsOptimizedInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications> getElasticGpuSpecificationsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications>)(software.amazon.jsii.Kernel.get(this, "elasticGpuSpecificationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateElasticGpuSpecifications.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator> getElasticInferenceAcceleratorInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator>)(software.amazon.jsii.Kernel.get(this, "elasticInferenceAcceleratorInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateElasticInferenceAccelerator.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateHibernationOptions> getHibernationOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateHibernationOptions>)(software.amazon.jsii.Kernel.get(this, "hibernationOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateHibernationOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateIamInstanceProfile> getIamInstanceProfileInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateIamInstanceProfile>)(software.amazon.jsii.Kernel.get(this, "iamInstanceProfileInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateIamInstanceProfile.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageIdInput() {
        return software.amazon.jsii.Kernel.get(this, "imageIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceInitiatedShutdownBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceInitiatedShutdownBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions> getInstanceMarketOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions>)(software.amazon.jsii.Kernel.get(this, "instanceMarketOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateInstanceMarketOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKernelIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kernelIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyNameInput() {
        return software.amazon.jsii.Kernel.get(this, "keyNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateLicenseSpecification> getLicenseSpecificationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateLicenseSpecification>)(software.amazon.jsii.Kernel.get(this, "licenseSpecificationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateLicenseSpecification.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateMetadataOptions> getMetadataOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateMetadataOptions>)(software.amazon.jsii.Kernel.get(this, "metadataOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateMetadataOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateMonitoring> getMonitoringInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateMonitoring>)(software.amazon.jsii.Kernel.get(this, "monitoringInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateMonitoring.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateNetworkInterfaces> getNetworkInterfacesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateNetworkInterfaces>)(software.amazon.jsii.Kernel.get(this, "networkInterfacesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateNetworkInterfaces.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplatePlacement> getPlacementInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplatePlacement>)(software.amazon.jsii.Kernel.get(this, "placementInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplatePlacement.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRamDiskIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ramDiskIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateTagSpecifications> getTagSpecificationsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LaunchTemplateTagSpecifications>)(software.amazon.jsii.Kernel.get(this, "tagSpecificationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateTagSpecifications.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUpdateDefaultVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "updateDefaultVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserDataInput() {
        return software.amazon.jsii.Kernel.get(this, "userDataInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings> getBlockDeviceMappings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "blockDeviceMappings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateBlockDeviceMappings.class))));
    }

    public void setBlockDeviceMappings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateBlockDeviceMappings> value) {
        software.amazon.jsii.Kernel.set(this, "blockDeviceMappings", java.util.Objects.requireNonNull(value, "blockDeviceMappings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification> getCapacityReservationSpecification() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "capacityReservationSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCapacityReservationSpecification.class))));
    }

    public void setCapacityReservationSpecification(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecification> value) {
        software.amazon.jsii.Kernel.set(this, "capacityReservationSpecification", java.util.Objects.requireNonNull(value, "capacityReservationSpecification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateCpuOptions> getCpuOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cpuOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCpuOptions.class))));
    }

    public void setCpuOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateCpuOptions> value) {
        software.amazon.jsii.Kernel.set(this, "cpuOptions", java.util.Objects.requireNonNull(value, "cpuOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateCreditSpecification> getCreditSpecification() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "creditSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCreditSpecification.class))));
    }

    public void setCreditSpecification(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateCreditSpecification> value) {
        software.amazon.jsii.Kernel.set(this, "creditSpecification", java.util.Objects.requireNonNull(value, "creditSpecification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultVersion() {
        return software.amazon.jsii.Kernel.get(this, "defaultVersion", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultVersion(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultVersion", java.util.Objects.requireNonNull(value, "defaultVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getDisableApiTermination() {
        return software.amazon.jsii.Kernel.get(this, "disableApiTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDisableApiTermination(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableApiTermination", java.util.Objects.requireNonNull(value, "disableApiTermination is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEbsOptimized() {
        return software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEbsOptimized(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ebsOptimized", java.util.Objects.requireNonNull(value, "ebsOptimized is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications> getElasticGpuSpecifications() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "elasticGpuSpecifications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateElasticGpuSpecifications.class))));
    }

    public void setElasticGpuSpecifications(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateElasticGpuSpecifications> value) {
        software.amazon.jsii.Kernel.set(this, "elasticGpuSpecifications", java.util.Objects.requireNonNull(value, "elasticGpuSpecifications is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator> getElasticInferenceAccelerator() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "elasticInferenceAccelerator", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateElasticInferenceAccelerator.class))));
    }

    public void setElasticInferenceAccelerator(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateElasticInferenceAccelerator> value) {
        software.amazon.jsii.Kernel.set(this, "elasticInferenceAccelerator", java.util.Objects.requireNonNull(value, "elasticInferenceAccelerator is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateHibernationOptions> getHibernationOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "hibernationOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateHibernationOptions.class))));
    }

    public void setHibernationOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateHibernationOptions> value) {
        software.amazon.jsii.Kernel.set(this, "hibernationOptions", java.util.Objects.requireNonNull(value, "hibernationOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateIamInstanceProfile> getIamInstanceProfile() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateIamInstanceProfile.class))));
    }

    public void setIamInstanceProfile(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateIamInstanceProfile> value) {
        software.amazon.jsii.Kernel.set(this, "iamInstanceProfile", java.util.Objects.requireNonNull(value, "iamInstanceProfile is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageId() {
        return software.amazon.jsii.Kernel.get(this, "imageId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageId", java.util.Objects.requireNonNull(value, "imageId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceInitiatedShutdownBehavior() {
        return software.amazon.jsii.Kernel.get(this, "instanceInitiatedShutdownBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceInitiatedShutdownBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceInitiatedShutdownBehavior", java.util.Objects.requireNonNull(value, "instanceInitiatedShutdownBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions> getInstanceMarketOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "instanceMarketOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateInstanceMarketOptions.class))));
    }

    public void setInstanceMarketOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateInstanceMarketOptions> value) {
        software.amazon.jsii.Kernel.set(this, "instanceMarketOptions", java.util.Objects.requireNonNull(value, "instanceMarketOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", java.util.Objects.requireNonNull(value, "instanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKernelId() {
        return software.amazon.jsii.Kernel.get(this, "kernelId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKernelId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kernelId", java.util.Objects.requireNonNull(value, "kernelId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyName() {
        return software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyName", java.util.Objects.requireNonNull(value, "keyName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateLicenseSpecification> getLicenseSpecification() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "licenseSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateLicenseSpecification.class))));
    }

    public void setLicenseSpecification(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateLicenseSpecification> value) {
        software.amazon.jsii.Kernel.set(this, "licenseSpecification", java.util.Objects.requireNonNull(value, "licenseSpecification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateMetadataOptions> getMetadataOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "metadataOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateMetadataOptions.class))));
    }

    public void setMetadataOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateMetadataOptions> value) {
        software.amazon.jsii.Kernel.set(this, "metadataOptions", java.util.Objects.requireNonNull(value, "metadataOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateMonitoring> getMonitoring() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "monitoring", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateMonitoring.class))));
    }

    public void setMonitoring(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateMonitoring> value) {
        software.amazon.jsii.Kernel.set(this, "monitoring", java.util.Objects.requireNonNull(value, "monitoring is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateNetworkInterfaces> getNetworkInterfaces() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "networkInterfaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateNetworkInterfaces.class))));
    }

    public void setNetworkInterfaces(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateNetworkInterfaces> value) {
        software.amazon.jsii.Kernel.set(this, "networkInterfaces", java.util.Objects.requireNonNull(value, "networkInterfaces is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplatePlacement> getPlacement() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "placement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplatePlacement.class))));
    }

    public void setPlacement(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplatePlacement> value) {
        software.amazon.jsii.Kernel.set(this, "placement", java.util.Objects.requireNonNull(value, "placement is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRamDiskId() {
        return software.amazon.jsii.Kernel.get(this, "ramDiskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRamDiskId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ramDiskId", java.util.Objects.requireNonNull(value, "ramDiskId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroupNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroupNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroupNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroupNames", java.util.Objects.requireNonNull(value, "securityGroupNames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateTagSpecifications> getTagSpecifications() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "tagSpecifications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateTagSpecifications.class))));
    }

    public void setTagSpecifications(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LaunchTemplateTagSpecifications> value) {
        software.amazon.jsii.Kernel.set(this, "tagSpecifications", java.util.Objects.requireNonNull(value, "tagSpecifications is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getUpdateDefaultVersion() {
        return software.amazon.jsii.Kernel.get(this, "updateDefaultVersion", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUpdateDefaultVersion(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "updateDefaultVersion", java.util.Objects.requireNonNull(value, "updateDefaultVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserData() {
        return software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserData(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userData", java.util.Objects.requireNonNull(value, "userData is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVpcSecurityGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSecurityGroupIds", java.util.Objects.requireNonNull(value, "vpcSecurityGroupIds is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.LaunchTemplate}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LaunchTemplate> {
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
        private imports.aws.LaunchTemplateConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * block_device_mappings block.
         * <p>
         * @return {@code this}
         * @param blockDeviceMappings block_device_mappings block. This parameter is required.
         */
        public Builder blockDeviceMappings(final java.util.List<? extends imports.aws.LaunchTemplateBlockDeviceMappings> blockDeviceMappings) {
            this.config().blockDeviceMappings(blockDeviceMappings);
            return this;
        }

        /**
         * capacity_reservation_specification block.
         * <p>
         * @return {@code this}
         * @param capacityReservationSpecification capacity_reservation_specification block. This parameter is required.
         */
        public Builder capacityReservationSpecification(final java.util.List<? extends imports.aws.LaunchTemplateCapacityReservationSpecification> capacityReservationSpecification) {
            this.config().capacityReservationSpecification(capacityReservationSpecification);
            return this;
        }

        /**
         * cpu_options block.
         * <p>
         * @return {@code this}
         * @param cpuOptions cpu_options block. This parameter is required.
         */
        public Builder cpuOptions(final java.util.List<? extends imports.aws.LaunchTemplateCpuOptions> cpuOptions) {
            this.config().cpuOptions(cpuOptions);
            return this;
        }

        /**
         * credit_specification block.
         * <p>
         * @return {@code this}
         * @param creditSpecification credit_specification block. This parameter is required.
         */
        public Builder creditSpecification(final java.util.List<? extends imports.aws.LaunchTemplateCreditSpecification> creditSpecification) {
            this.config().creditSpecification(creditSpecification);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultVersion This parameter is required.
         */
        public Builder defaultVersion(final java.lang.Number defaultVersion) {
            this.config().defaultVersion(defaultVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config().description(description);
            return this;
        }

        /**
         * @return {@code this}
         * @param disableApiTermination This parameter is required.
         */
        public Builder disableApiTermination(final java.lang.Boolean disableApiTermination) {
            this.config().disableApiTermination(disableApiTermination);
            return this;
        }

        /**
         * @return {@code this}
         * @param ebsOptimized This parameter is required.
         */
        public Builder ebsOptimized(final java.lang.String ebsOptimized) {
            this.config().ebsOptimized(ebsOptimized);
            return this;
        }

        /**
         * elastic_gpu_specifications block.
         * <p>
         * @return {@code this}
         * @param elasticGpuSpecifications elastic_gpu_specifications block. This parameter is required.
         */
        public Builder elasticGpuSpecifications(final java.util.List<? extends imports.aws.LaunchTemplateElasticGpuSpecifications> elasticGpuSpecifications) {
            this.config().elasticGpuSpecifications(elasticGpuSpecifications);
            return this;
        }

        /**
         * elastic_inference_accelerator block.
         * <p>
         * @return {@code this}
         * @param elasticInferenceAccelerator elastic_inference_accelerator block. This parameter is required.
         */
        public Builder elasticInferenceAccelerator(final java.util.List<? extends imports.aws.LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerator) {
            this.config().elasticInferenceAccelerator(elasticInferenceAccelerator);
            return this;
        }

        /**
         * hibernation_options block.
         * <p>
         * @return {@code this}
         * @param hibernationOptions hibernation_options block. This parameter is required.
         */
        public Builder hibernationOptions(final java.util.List<? extends imports.aws.LaunchTemplateHibernationOptions> hibernationOptions) {
            this.config().hibernationOptions(hibernationOptions);
            return this;
        }

        /**
         * iam_instance_profile block.
         * <p>
         * @return {@code this}
         * @param iamInstanceProfile iam_instance_profile block. This parameter is required.
         */
        public Builder iamInstanceProfile(final java.util.List<? extends imports.aws.LaunchTemplateIamInstanceProfile> iamInstanceProfile) {
            this.config().iamInstanceProfile(iamInstanceProfile);
            return this;
        }

        /**
         * @return {@code this}
         * @param imageId This parameter is required.
         */
        public Builder imageId(final java.lang.String imageId) {
            this.config().imageId(imageId);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceInitiatedShutdownBehavior This parameter is required.
         */
        public Builder instanceInitiatedShutdownBehavior(final java.lang.String instanceInitiatedShutdownBehavior) {
            this.config().instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
            return this;
        }

        /**
         * instance_market_options block.
         * <p>
         * @return {@code this}
         * @param instanceMarketOptions instance_market_options block. This parameter is required.
         */
        public Builder instanceMarketOptions(final java.util.List<? extends imports.aws.LaunchTemplateInstanceMarketOptions> instanceMarketOptions) {
            this.config().instanceMarketOptions(instanceMarketOptions);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceType This parameter is required.
         */
        public Builder instanceType(final java.lang.String instanceType) {
            this.config().instanceType(instanceType);
            return this;
        }

        /**
         * @return {@code this}
         * @param kernelId This parameter is required.
         */
        public Builder kernelId(final java.lang.String kernelId) {
            this.config().kernelId(kernelId);
            return this;
        }

        /**
         * @return {@code this}
         * @param keyName This parameter is required.
         */
        public Builder keyName(final java.lang.String keyName) {
            this.config().keyName(keyName);
            return this;
        }

        /**
         * license_specification block.
         * <p>
         * @return {@code this}
         * @param licenseSpecification license_specification block. This parameter is required.
         */
        public Builder licenseSpecification(final java.util.List<? extends imports.aws.LaunchTemplateLicenseSpecification> licenseSpecification) {
            this.config().licenseSpecification(licenseSpecification);
            return this;
        }

        /**
         * metadata_options block.
         * <p>
         * @return {@code this}
         * @param metadataOptions metadata_options block. This parameter is required.
         */
        public Builder metadataOptions(final java.util.List<? extends imports.aws.LaunchTemplateMetadataOptions> metadataOptions) {
            this.config().metadataOptions(metadataOptions);
            return this;
        }

        /**
         * monitoring block.
         * <p>
         * @return {@code this}
         * @param monitoring monitoring block. This parameter is required.
         */
        public Builder monitoring(final java.util.List<? extends imports.aws.LaunchTemplateMonitoring> monitoring) {
            this.config().monitoring(monitoring);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param namePrefix This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config().namePrefix(namePrefix);
            return this;
        }

        /**
         * network_interfaces block.
         * <p>
         * @return {@code this}
         * @param networkInterfaces network_interfaces block. This parameter is required.
         */
        public Builder networkInterfaces(final java.util.List<? extends imports.aws.LaunchTemplateNetworkInterfaces> networkInterfaces) {
            this.config().networkInterfaces(networkInterfaces);
            return this;
        }

        /**
         * placement block.
         * <p>
         * @return {@code this}
         * @param placement placement block. This parameter is required.
         */
        public Builder placement(final java.util.List<? extends imports.aws.LaunchTemplatePlacement> placement) {
            this.config().placement(placement);
            return this;
        }

        /**
         * @return {@code this}
         * @param ramDiskId This parameter is required.
         */
        public Builder ramDiskId(final java.lang.String ramDiskId) {
            this.config().ramDiskId(ramDiskId);
            return this;
        }

        /**
         * @return {@code this}
         * @param securityGroupNames This parameter is required.
         */
        public Builder securityGroupNames(final java.util.List<java.lang.String> securityGroupNames) {
            this.config().securityGroupNames(securityGroupNames);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * tag_specifications block.
         * <p>
         * @return {@code this}
         * @param tagSpecifications tag_specifications block. This parameter is required.
         */
        public Builder tagSpecifications(final java.util.List<? extends imports.aws.LaunchTemplateTagSpecifications> tagSpecifications) {
            this.config().tagSpecifications(tagSpecifications);
            return this;
        }

        /**
         * @return {@code this}
         * @param updateDefaultVersion This parameter is required.
         */
        public Builder updateDefaultVersion(final java.lang.Boolean updateDefaultVersion) {
            this.config().updateDefaultVersion(updateDefaultVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param userData This parameter is required.
         */
        public Builder userData(final java.lang.String userData) {
            this.config().userData(userData);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpcSecurityGroupIds This parameter is required.
         */
        public Builder vpcSecurityGroupIds(final java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.config().vpcSecurityGroupIds(vpcSecurityGroupIds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.LaunchTemplate}.
         */
        @Override
        public imports.aws.LaunchTemplate build() {
            return new imports.aws.LaunchTemplate(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.LaunchTemplateConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.LaunchTemplateConfig.Builder();
            }
            return this.config;
        }
    }
}
