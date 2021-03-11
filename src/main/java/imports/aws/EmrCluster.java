package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.561Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EmrCluster")
public class EmrCluster extends com.hashicorp.cdktf.TerraformResource {

    protected EmrCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EmrCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public EmrCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.EmrClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAdditionalInfo() {
        software.amazon.jsii.Kernel.call(this, "resetAdditionalInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetApplications() {
        software.amazon.jsii.Kernel.call(this, "resetApplications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoscalingRole() {
        software.amazon.jsii.Kernel.call(this, "resetAutoscalingRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBootstrapAction() {
        software.amazon.jsii.Kernel.call(this, "resetBootstrapAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigurations() {
        software.amazon.jsii.Kernel.call(this, "resetConfigurations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigurationsJson() {
        software.amazon.jsii.Kernel.call(this, "resetConfigurationsJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCoreInstanceCount() {
        software.amazon.jsii.Kernel.call(this, "resetCoreInstanceCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCoreInstanceGroup() {
        software.amazon.jsii.Kernel.call(this, "resetCoreInstanceGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCoreInstanceType() {
        software.amazon.jsii.Kernel.call(this, "resetCoreInstanceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomAmiId() {
        software.amazon.jsii.Kernel.call(this, "resetCustomAmiId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsRootVolumeSize() {
        software.amazon.jsii.Kernel.call(this, "resetEbsRootVolumeSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEc2Attributes() {
        software.amazon.jsii.Kernel.call(this, "resetEc2Attributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceGroup() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKeepJobFlowAliveWhenNoSteps() {
        software.amazon.jsii.Kernel.call(this, "resetKeepJobFlowAliveWhenNoSteps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKerberosAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetKerberosAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogUri() {
        software.amazon.jsii.Kernel.call(this, "resetLogUri", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMasterInstanceGroup() {
        software.amazon.jsii.Kernel.call(this, "resetMasterInstanceGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMasterInstanceType() {
        software.amazon.jsii.Kernel.call(this, "resetMasterInstanceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScaleDownBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetScaleDownBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStep() {
        software.amazon.jsii.Kernel.call(this, "resetStep", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStepConcurrencyLevel() {
        software.amazon.jsii.Kernel.call(this, "resetStepConcurrencyLevel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminationProtection() {
        software.amazon.jsii.Kernel.call(this, "resetTerminationProtection", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVisibleToAllUsers() {
        software.amazon.jsii.Kernel.call(this, "resetVisibleToAllUsers", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterState() {
        return software.amazon.jsii.Kernel.get(this, "clusterState", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterPublicDns() {
        return software.amazon.jsii.Kernel.get(this, "masterPublicDns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReleaseLabelInput() {
        return software.amazon.jsii.Kernel.get(this, "releaseLabelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAdditionalInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "additionalInfoInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApplicationsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "applicationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAutoscalingRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "autoscalingRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterBootstrapAction> getBootstrapActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EmrClusterBootstrapAction>)(software.amazon.jsii.Kernel.get(this, "bootstrapActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterBootstrapAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationsInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationsJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationsJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCoreInstanceCountInput() {
        return software.amazon.jsii.Kernel.get(this, "coreInstanceCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterCoreInstanceGroup> getCoreInstanceGroupInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EmrClusterCoreInstanceGroup>)(software.amazon.jsii.Kernel.get(this, "coreInstanceGroupInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterCoreInstanceGroup.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCoreInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "coreInstanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomAmiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "customAmiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getEbsRootVolumeSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "ebsRootVolumeSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterEc2Attributes> getEc2AttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EmrClusterEc2Attributes>)(software.amazon.jsii.Kernel.get(this, "ec2AttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterEc2Attributes.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterInstanceGroup> getInstanceGroupInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EmrClusterInstanceGroup>)(software.amazon.jsii.Kernel.get(this, "instanceGroupInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterInstanceGroup.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getKeepJobFlowAliveWhenNoStepsInput() {
        return software.amazon.jsii.Kernel.get(this, "keepJobFlowAliveWhenNoStepsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterKerberosAttributes> getKerberosAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EmrClusterKerberosAttributes>)(software.amazon.jsii.Kernel.get(this, "kerberosAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterKerberosAttributes.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLogUriInput() {
        return software.amazon.jsii.Kernel.get(this, "logUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterMasterInstanceGroup> getMasterInstanceGroupInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EmrClusterMasterInstanceGroup>)(software.amazon.jsii.Kernel.get(this, "masterInstanceGroupInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterMasterInstanceGroup.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMasterInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "masterInstanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScaleDownBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "scaleDownBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecurityConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "securityConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getStepConcurrencyLevelInput() {
        return software.amazon.jsii.Kernel.get(this, "stepConcurrencyLevelInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterStep> getStepInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EmrClusterStep>)(software.amazon.jsii.Kernel.get(this, "stepInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterStep.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminationProtectionInput() {
        return software.amazon.jsii.Kernel.get(this, "terminationProtectionInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getVisibleToAllUsersInput() {
        return software.amazon.jsii.Kernel.get(this, "visibleToAllUsersInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAdditionalInfo() {
        return software.amazon.jsii.Kernel.get(this, "additionalInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAdditionalInfo(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "additionalInfo", java.util.Objects.requireNonNull(value, "additionalInfo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getApplications() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "applications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setApplications(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "applications", java.util.Objects.requireNonNull(value, "applications is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingRole() {
        return software.amazon.jsii.Kernel.get(this, "autoscalingRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutoscalingRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "autoscalingRole", java.util.Objects.requireNonNull(value, "autoscalingRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterBootstrapAction> getBootstrapAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "bootstrapAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterBootstrapAction.class))));
    }

    public void setBootstrapAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterBootstrapAction> value) {
        software.amazon.jsii.Kernel.set(this, "bootstrapAction", java.util.Objects.requireNonNull(value, "bootstrapAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurations() {
        return software.amazon.jsii.Kernel.get(this, "configurations", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigurations(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configurations", java.util.Objects.requireNonNull(value, "configurations is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationsJson() {
        return software.amazon.jsii.Kernel.get(this, "configurationsJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigurationsJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configurationsJson", java.util.Objects.requireNonNull(value, "configurationsJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCoreInstanceCount() {
        return software.amazon.jsii.Kernel.get(this, "coreInstanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCoreInstanceCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "coreInstanceCount", java.util.Objects.requireNonNull(value, "coreInstanceCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterCoreInstanceGroup> getCoreInstanceGroup() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "coreInstanceGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterCoreInstanceGroup.class))));
    }

    public void setCoreInstanceGroup(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterCoreInstanceGroup> value) {
        software.amazon.jsii.Kernel.set(this, "coreInstanceGroup", java.util.Objects.requireNonNull(value, "coreInstanceGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCoreInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "coreInstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCoreInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "coreInstanceType", java.util.Objects.requireNonNull(value, "coreInstanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomAmiId() {
        return software.amazon.jsii.Kernel.get(this, "customAmiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomAmiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customAmiId", java.util.Objects.requireNonNull(value, "customAmiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsRootVolumeSize() {
        return software.amazon.jsii.Kernel.get(this, "ebsRootVolumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEbsRootVolumeSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ebsRootVolumeSize", java.util.Objects.requireNonNull(value, "ebsRootVolumeSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterEc2Attributes> getEc2Attributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ec2Attributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterEc2Attributes.class))));
    }

    public void setEc2Attributes(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterEc2Attributes> value) {
        software.amazon.jsii.Kernel.set(this, "ec2Attributes", java.util.Objects.requireNonNull(value, "ec2Attributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterInstanceGroup> getInstanceGroup() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "instanceGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterInstanceGroup.class))));
    }

    public void setInstanceGroup(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterInstanceGroup> value) {
        software.amazon.jsii.Kernel.set(this, "instanceGroup", java.util.Objects.requireNonNull(value, "instanceGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getKeepJobFlowAliveWhenNoSteps() {
        return software.amazon.jsii.Kernel.get(this, "keepJobFlowAliveWhenNoSteps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setKeepJobFlowAliveWhenNoSteps(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "keepJobFlowAliveWhenNoSteps", java.util.Objects.requireNonNull(value, "keepJobFlowAliveWhenNoSteps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterKerberosAttributes> getKerberosAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "kerberosAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterKerberosAttributes.class))));
    }

    public void setKerberosAttributes(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterKerberosAttributes> value) {
        software.amazon.jsii.Kernel.set(this, "kerberosAttributes", java.util.Objects.requireNonNull(value, "kerberosAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLogUri() {
        return software.amazon.jsii.Kernel.get(this, "logUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLogUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "logUri", java.util.Objects.requireNonNull(value, "logUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterMasterInstanceGroup> getMasterInstanceGroup() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "masterInstanceGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterMasterInstanceGroup.class))));
    }

    public void setMasterInstanceGroup(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterMasterInstanceGroup> value) {
        software.amazon.jsii.Kernel.set(this, "masterInstanceGroup", java.util.Objects.requireNonNull(value, "masterInstanceGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "masterInstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMasterInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "masterInstanceType", java.util.Objects.requireNonNull(value, "masterInstanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReleaseLabel() {
        return software.amazon.jsii.Kernel.get(this, "releaseLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReleaseLabel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "releaseLabel", java.util.Objects.requireNonNull(value, "releaseLabel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScaleDownBehavior() {
        return software.amazon.jsii.Kernel.get(this, "scaleDownBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setScaleDownBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "scaleDownBehavior", java.util.Objects.requireNonNull(value, "scaleDownBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecurityConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "securityConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecurityConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "securityConfiguration", java.util.Objects.requireNonNull(value, "securityConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRole() {
        return software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRole", java.util.Objects.requireNonNull(value, "serviceRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterStep> getStep() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "step", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterStep.class))));
    }

    public void setStep(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EmrClusterStep> value) {
        software.amazon.jsii.Kernel.set(this, "step", java.util.Objects.requireNonNull(value, "step is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getStepConcurrencyLevel() {
        return software.amazon.jsii.Kernel.get(this, "stepConcurrencyLevel", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setStepConcurrencyLevel(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "stepConcurrencyLevel", java.util.Objects.requireNonNull(value, "stepConcurrencyLevel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getTerminationProtection() {
        return software.amazon.jsii.Kernel.get(this, "terminationProtection", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setTerminationProtection(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "terminationProtection", java.util.Objects.requireNonNull(value, "terminationProtection is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getVisibleToAllUsers() {
        return software.amazon.jsii.Kernel.get(this, "visibleToAllUsers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setVisibleToAllUsers(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "visibleToAllUsers", java.util.Objects.requireNonNull(value, "visibleToAllUsers is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.EmrCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.EmrCluster> {
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
        private final imports.aws.EmrClusterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.EmrClusterConfig.Builder();
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
         * @param releaseLabel This parameter is required.
         */
        public Builder releaseLabel(final java.lang.String releaseLabel) {
            this.config.releaseLabel(releaseLabel);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceRole This parameter is required.
         */
        public Builder serviceRole(final java.lang.String serviceRole) {
            this.config.serviceRole(serviceRole);
            return this;
        }

        /**
         * @return {@code this}
         * @param additionalInfo This parameter is required.
         */
        public Builder additionalInfo(final java.lang.String additionalInfo) {
            this.config.additionalInfo(additionalInfo);
            return this;
        }

        /**
         * @return {@code this}
         * @param applications This parameter is required.
         */
        public Builder applications(final java.util.List<java.lang.String> applications) {
            this.config.applications(applications);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoscalingRole This parameter is required.
         */
        public Builder autoscalingRole(final java.lang.String autoscalingRole) {
            this.config.autoscalingRole(autoscalingRole);
            return this;
        }

        /**
         * bootstrap_action block.
         * <p>
         * @return {@code this}
         * @param bootstrapAction bootstrap_action block. This parameter is required.
         */
        public Builder bootstrapAction(final java.util.List<? extends imports.aws.EmrClusterBootstrapAction> bootstrapAction) {
            this.config.bootstrapAction(bootstrapAction);
            return this;
        }

        /**
         * @return {@code this}
         * @param configurations This parameter is required.
         */
        public Builder configurations(final java.lang.String configurations) {
            this.config.configurations(configurations);
            return this;
        }

        /**
         * @return {@code this}
         * @param configurationsJson This parameter is required.
         */
        public Builder configurationsJson(final java.lang.String configurationsJson) {
            this.config.configurationsJson(configurationsJson);
            return this;
        }

        /**
         * @return {@code this}
         * @param coreInstanceCount This parameter is required.
         */
        public Builder coreInstanceCount(final java.lang.Number coreInstanceCount) {
            this.config.coreInstanceCount(coreInstanceCount);
            return this;
        }

        /**
         * core_instance_group block.
         * <p>
         * @return {@code this}
         * @param coreInstanceGroup core_instance_group block. This parameter is required.
         */
        public Builder coreInstanceGroup(final java.util.List<? extends imports.aws.EmrClusterCoreInstanceGroup> coreInstanceGroup) {
            this.config.coreInstanceGroup(coreInstanceGroup);
            return this;
        }

        /**
         * @return {@code this}
         * @param coreInstanceType This parameter is required.
         */
        public Builder coreInstanceType(final java.lang.String coreInstanceType) {
            this.config.coreInstanceType(coreInstanceType);
            return this;
        }

        /**
         * @return {@code this}
         * @param customAmiId This parameter is required.
         */
        public Builder customAmiId(final java.lang.String customAmiId) {
            this.config.customAmiId(customAmiId);
            return this;
        }

        /**
         * @return {@code this}
         * @param ebsRootVolumeSize This parameter is required.
         */
        public Builder ebsRootVolumeSize(final java.lang.Number ebsRootVolumeSize) {
            this.config.ebsRootVolumeSize(ebsRootVolumeSize);
            return this;
        }

        /**
         * ec2_attributes block.
         * <p>
         * @return {@code this}
         * @param ec2Attributes ec2_attributes block. This parameter is required.
         */
        public Builder ec2Attributes(final java.util.List<? extends imports.aws.EmrClusterEc2Attributes> ec2Attributes) {
            this.config.ec2Attributes(ec2Attributes);
            return this;
        }

        /**
         * instance_group block.
         * <p>
         * @return {@code this}
         * @param instanceGroup instance_group block. This parameter is required.
         */
        public Builder instanceGroup(final java.util.List<? extends imports.aws.EmrClusterInstanceGroup> instanceGroup) {
            this.config.instanceGroup(instanceGroup);
            return this;
        }

        /**
         * @return {@code this}
         * @param keepJobFlowAliveWhenNoSteps This parameter is required.
         */
        public Builder keepJobFlowAliveWhenNoSteps(final java.lang.Boolean keepJobFlowAliveWhenNoSteps) {
            this.config.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps);
            return this;
        }

        /**
         * kerberos_attributes block.
         * <p>
         * @return {@code this}
         * @param kerberosAttributes kerberos_attributes block. This parameter is required.
         */
        public Builder kerberosAttributes(final java.util.List<? extends imports.aws.EmrClusterKerberosAttributes> kerberosAttributes) {
            this.config.kerberosAttributes(kerberosAttributes);
            return this;
        }

        /**
         * @return {@code this}
         * @param logUri This parameter is required.
         */
        public Builder logUri(final java.lang.String logUri) {
            this.config.logUri(logUri);
            return this;
        }

        /**
         * master_instance_group block.
         * <p>
         * @return {@code this}
         * @param masterInstanceGroup master_instance_group block. This parameter is required.
         */
        public Builder masterInstanceGroup(final java.util.List<? extends imports.aws.EmrClusterMasterInstanceGroup> masterInstanceGroup) {
            this.config.masterInstanceGroup(masterInstanceGroup);
            return this;
        }

        /**
         * @return {@code this}
         * @param masterInstanceType This parameter is required.
         */
        public Builder masterInstanceType(final java.lang.String masterInstanceType) {
            this.config.masterInstanceType(masterInstanceType);
            return this;
        }

        /**
         * @return {@code this}
         * @param scaleDownBehavior This parameter is required.
         */
        public Builder scaleDownBehavior(final java.lang.String scaleDownBehavior) {
            this.config.scaleDownBehavior(scaleDownBehavior);
            return this;
        }

        /**
         * @return {@code this}
         * @param securityConfiguration This parameter is required.
         */
        public Builder securityConfiguration(final java.lang.String securityConfiguration) {
            this.config.securityConfiguration(securityConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param step This parameter is required.
         */
        public Builder step(final java.util.List<? extends imports.aws.EmrClusterStep> step) {
            this.config.step(step);
            return this;
        }

        /**
         * @return {@code this}
         * @param stepConcurrencyLevel This parameter is required.
         */
        public Builder stepConcurrencyLevel(final java.lang.Number stepConcurrencyLevel) {
            this.config.stepConcurrencyLevel(stepConcurrencyLevel);
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
         * @param terminationProtection This parameter is required.
         */
        public Builder terminationProtection(final java.lang.Boolean terminationProtection) {
            this.config.terminationProtection(terminationProtection);
            return this;
        }

        /**
         * @return {@code this}
         * @param visibleToAllUsers This parameter is required.
         */
        public Builder visibleToAllUsers(final java.lang.Boolean visibleToAllUsers) {
            this.config.visibleToAllUsers(visibleToAllUsers);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.EmrCluster}.
         */
        @Override
        public imports.aws.EmrCluster build() {
            return new imports.aws.EmrCluster(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
