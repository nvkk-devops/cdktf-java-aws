package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.746Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksInstance")
public class OpsworksInstance extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksInstance(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksInstance(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public OpsworksInstance(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.OpsworksInstanceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAgentVersion() {
        software.amazon.jsii.Kernel.call(this, "resetAgentVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAmiId() {
        software.amazon.jsii.Kernel.call(this, "resetAmiId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetArchitecture() {
        software.amazon.jsii.Kernel.call(this, "resetArchitecture", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoScalingType() {
        software.amazon.jsii.Kernel.call(this, "resetAutoScalingType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAvailabilityZone() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreatedAt() {
        software.amazon.jsii.Kernel.call(this, "resetCreatedAt", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeleteEbs() {
        software.amazon.jsii.Kernel.call(this, "resetDeleteEbs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeleteEip() {
        software.amazon.jsii.Kernel.call(this, "resetDeleteEip", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsBlockDevice() {
        software.amazon.jsii.Kernel.call(this, "resetEbsBlockDevice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsOptimized() {
        software.amazon.jsii.Kernel.call(this, "resetEbsOptimized", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEcsClusterArn() {
        software.amazon.jsii.Kernel.call(this, "resetEcsClusterArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticIp() {
        software.amazon.jsii.Kernel.call(this, "resetElasticIp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEphemeralBlockDevice() {
        software.amazon.jsii.Kernel.call(this, "resetEphemeralBlockDevice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostname() {
        software.amazon.jsii.Kernel.call(this, "resetHostname", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInfrastructureClass() {
        software.amazon.jsii.Kernel.call(this, "resetInfrastructureClass", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstallUpdatesOnBoot() {
        software.amazon.jsii.Kernel.call(this, "resetInstallUpdatesOnBoot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceProfileArn() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceProfileArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceType() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLastServiceErrorId() {
        software.amazon.jsii.Kernel.call(this, "resetLastServiceErrorId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOs() {
        software.amazon.jsii.Kernel.call(this, "resetOs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlatform() {
        software.amazon.jsii.Kernel.call(this, "resetPlatform", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateDns() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateDns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateIp() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateIp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPublicDns() {
        software.amazon.jsii.Kernel.call(this, "resetPublicDns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPublicIp() {
        software.amazon.jsii.Kernel.call(this, "resetPublicIp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegisteredBy() {
        software.amazon.jsii.Kernel.call(this, "resetRegisteredBy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReportedAgentVersion() {
        software.amazon.jsii.Kernel.call(this, "resetReportedAgentVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReportedOsFamily() {
        software.amazon.jsii.Kernel.call(this, "resetReportedOsFamily", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReportedOsName() {
        software.amazon.jsii.Kernel.call(this, "resetReportedOsName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReportedOsVersion() {
        software.amazon.jsii.Kernel.call(this, "resetReportedOsVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRootBlockDevice() {
        software.amazon.jsii.Kernel.call(this, "resetRootBlockDevice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRootDeviceType() {
        software.amazon.jsii.Kernel.call(this, "resetRootDeviceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRootDeviceVolumeId() {
        software.amazon.jsii.Kernel.call(this, "resetRootDeviceVolumeId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSshHostDsaKeyFingerprint() {
        software.amazon.jsii.Kernel.call(this, "resetSshHostDsaKeyFingerprint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSshHostRsaKeyFingerprint() {
        software.amazon.jsii.Kernel.call(this, "resetSshHostRsaKeyFingerprint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSshKeyName() {
        software.amazon.jsii.Kernel.call(this, "resetSshKeyName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetState() {
        software.amazon.jsii.Kernel.call(this, "resetState", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatus() {
        software.amazon.jsii.Kernel.call(this, "resetStatus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnetId() {
        software.amazon.jsii.Kernel.call(this, "resetSubnetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTenancy() {
        software.amazon.jsii.Kernel.call(this, "resetTenancy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVirtualizationType() {
        software.amazon.jsii.Kernel.call(this, "resetVirtualizationType", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEc2InstanceId() {
        return software.amazon.jsii.Kernel.get(this, "ec2InstanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLayerIdsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "layerIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackIdInput() {
        return software.amazon.jsii.Kernel.get(this, "stackIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAgentVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "agentVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAmiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "amiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getArchitectureInput() {
        return software.amazon.jsii.Kernel.get(this, "architectureInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAutoScalingTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "autoScalingTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCreatedAtInput() {
        return software.amazon.jsii.Kernel.get(this, "createdAtInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteEbsInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteEbsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteEipInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteEipInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice> getEbsBlockDeviceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice>)(software.amazon.jsii.Kernel.get(this, "ebsBlockDeviceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceEbsBlockDevice.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimizedInput() {
        return software.amazon.jsii.Kernel.get(this, "ebsOptimizedInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEcsClusterArnInput() {
        return software.amazon.jsii.Kernel.get(this, "ecsClusterArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getElasticIpInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticIpInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice> getEphemeralBlockDeviceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice>)(software.amazon.jsii.Kernel.get(this, "ephemeralBlockDeviceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceEphemeralBlockDevice.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostnameInput() {
        return software.amazon.jsii.Kernel.get(this, "hostnameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInfrastructureClassInput() {
        return software.amazon.jsii.Kernel.get(this, "infrastructureClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInstallUpdatesOnBootInput() {
        return software.amazon.jsii.Kernel.get(this, "installUpdatesOnBootInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceProfileArnInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceProfileArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLastServiceErrorIdInput() {
        return software.amazon.jsii.Kernel.get(this, "lastServiceErrorIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOsInput() {
        return software.amazon.jsii.Kernel.get(this, "osInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlatformInput() {
        return software.amazon.jsii.Kernel.get(this, "platformInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateDnsInput() {
        return software.amazon.jsii.Kernel.get(this, "privateDnsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateIpInput() {
        return software.amazon.jsii.Kernel.get(this, "privateIpInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPublicDnsInput() {
        return software.amazon.jsii.Kernel.get(this, "publicDnsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPublicIpInput() {
        return software.amazon.jsii.Kernel.get(this, "publicIpInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegisteredByInput() {
        return software.amazon.jsii.Kernel.get(this, "registeredByInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReportedAgentVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "reportedAgentVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReportedOsFamilyInput() {
        return software.amazon.jsii.Kernel.get(this, "reportedOsFamilyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReportedOsNameInput() {
        return software.amazon.jsii.Kernel.get(this, "reportedOsNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReportedOsVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "reportedOsVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksInstanceRootBlockDevice> getRootBlockDeviceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.OpsworksInstanceRootBlockDevice>)(software.amazon.jsii.Kernel.get(this, "rootBlockDeviceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceRootBlockDevice.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRootDeviceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRootDeviceVolumeIdInput() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceVolumeIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSshHostDsaKeyFingerprintInput() {
        return software.amazon.jsii.Kernel.get(this, "sshHostDsaKeyFingerprintInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSshHostRsaKeyFingerprintInput() {
        return software.amazon.jsii.Kernel.get(this, "sshHostRsaKeyFingerprintInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSshKeyNameInput() {
        return software.amazon.jsii.Kernel.get(this, "sshKeyNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStateInput() {
        return software.amazon.jsii.Kernel.get(this, "stateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubnetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "subnetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTenancyInput() {
        return software.amazon.jsii.Kernel.get(this, "tenancyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.OpsworksInstanceTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVirtualizationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "virtualizationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAgentVersion() {
        return software.amazon.jsii.Kernel.get(this, "agentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAgentVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "agentVersion", java.util.Objects.requireNonNull(value, "agentVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAmiId() {
        return software.amazon.jsii.Kernel.get(this, "amiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAmiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "amiId", java.util.Objects.requireNonNull(value, "amiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArchitecture() {
        return software.amazon.jsii.Kernel.get(this, "architecture", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArchitecture(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "architecture", java.util.Objects.requireNonNull(value, "architecture is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoScalingType() {
        return software.amazon.jsii.Kernel.get(this, "autoScalingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutoScalingType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "autoScalingType", java.util.Objects.requireNonNull(value, "autoScalingType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZone", java.util.Objects.requireNonNull(value, "availabilityZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedAt() {
        return software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCreatedAt(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "createdAt", java.util.Objects.requireNonNull(value, "createdAt is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getDeleteEbs() {
        return software.amazon.jsii.Kernel.get(this, "deleteEbs", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDeleteEbs(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deleteEbs", java.util.Objects.requireNonNull(value, "deleteEbs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getDeleteEip() {
        return software.amazon.jsii.Kernel.get(this, "deleteEip", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDeleteEip(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deleteEip", java.util.Objects.requireNonNull(value, "deleteEip is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice> getEbsBlockDevice() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceEbsBlockDevice.class))));
    }

    public void setEbsBlockDevice(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice> value) {
        software.amazon.jsii.Kernel.set(this, "ebsBlockDevice", java.util.Objects.requireNonNull(value, "ebsBlockDevice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEbsOptimized() {
        return software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEbsOptimized(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ebsOptimized", java.util.Objects.requireNonNull(value, "ebsOptimized is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEcsClusterArn() {
        return software.amazon.jsii.Kernel.get(this, "ecsClusterArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEcsClusterArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ecsClusterArn", java.util.Objects.requireNonNull(value, "ecsClusterArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getElasticIp() {
        return software.amazon.jsii.Kernel.get(this, "elasticIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setElasticIp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "elasticIp", java.util.Objects.requireNonNull(value, "elasticIp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice> getEphemeralBlockDevice() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceEphemeralBlockDevice.class))));
    }

    public void setEphemeralBlockDevice(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice> value) {
        software.amazon.jsii.Kernel.set(this, "ephemeralBlockDevice", java.util.Objects.requireNonNull(value, "ephemeralBlockDevice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostname() {
        return software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostname(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostname", java.util.Objects.requireNonNull(value, "hostname is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInfrastructureClass() {
        return software.amazon.jsii.Kernel.get(this, "infrastructureClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInfrastructureClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "infrastructureClass", java.util.Objects.requireNonNull(value, "infrastructureClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getInstallUpdatesOnBoot() {
        return software.amazon.jsii.Kernel.get(this, "installUpdatesOnBoot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setInstallUpdatesOnBoot(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "installUpdatesOnBoot", java.util.Objects.requireNonNull(value, "installUpdatesOnBoot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceProfileArn() {
        return software.amazon.jsii.Kernel.get(this, "instanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceProfileArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceProfileArn", java.util.Objects.requireNonNull(value, "instanceProfileArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", java.util.Objects.requireNonNull(value, "instanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastServiceErrorId() {
        return software.amazon.jsii.Kernel.get(this, "lastServiceErrorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLastServiceErrorId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lastServiceErrorId", java.util.Objects.requireNonNull(value, "lastServiceErrorId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLayerIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "layerIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLayerIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "layerIds", java.util.Objects.requireNonNull(value, "layerIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOs() {
        return software.amazon.jsii.Kernel.get(this, "os", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOs(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "os", java.util.Objects.requireNonNull(value, "os is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatform() {
        return software.amazon.jsii.Kernel.get(this, "platform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlatform(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "platform", java.util.Objects.requireNonNull(value, "platform is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateDns() {
        return software.amazon.jsii.Kernel.get(this, "privateDns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateDns(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateDns", java.util.Objects.requireNonNull(value, "privateDns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateIp() {
        return software.amazon.jsii.Kernel.get(this, "privateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateIp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateIp", java.util.Objects.requireNonNull(value, "privateIp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicDns() {
        return software.amazon.jsii.Kernel.get(this, "publicDns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPublicDns(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "publicDns", java.util.Objects.requireNonNull(value, "publicDns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicIp() {
        return software.amazon.jsii.Kernel.get(this, "publicIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPublicIp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "publicIp", java.util.Objects.requireNonNull(value, "publicIp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegisteredBy() {
        return software.amazon.jsii.Kernel.get(this, "registeredBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegisteredBy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "registeredBy", java.util.Objects.requireNonNull(value, "registeredBy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReportedAgentVersion() {
        return software.amazon.jsii.Kernel.get(this, "reportedAgentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReportedAgentVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reportedAgentVersion", java.util.Objects.requireNonNull(value, "reportedAgentVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReportedOsFamily() {
        return software.amazon.jsii.Kernel.get(this, "reportedOsFamily", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReportedOsFamily(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reportedOsFamily", java.util.Objects.requireNonNull(value, "reportedOsFamily is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReportedOsName() {
        return software.amazon.jsii.Kernel.get(this, "reportedOsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReportedOsName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reportedOsName", java.util.Objects.requireNonNull(value, "reportedOsName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReportedOsVersion() {
        return software.amazon.jsii.Kernel.get(this, "reportedOsVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReportedOsVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reportedOsVersion", java.util.Objects.requireNonNull(value, "reportedOsVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksInstanceRootBlockDevice> getRootBlockDevice() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceRootBlockDevice.class))));
    }

    public void setRootBlockDevice(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.OpsworksInstanceRootBlockDevice> value) {
        software.amazon.jsii.Kernel.set(this, "rootBlockDevice", java.util.Objects.requireNonNull(value, "rootBlockDevice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootDeviceType() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRootDeviceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rootDeviceType", java.util.Objects.requireNonNull(value, "rootDeviceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootDeviceVolumeId() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceVolumeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRootDeviceVolumeId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rootDeviceVolumeId", java.util.Objects.requireNonNull(value, "rootDeviceVolumeId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroupIds", java.util.Objects.requireNonNull(value, "securityGroupIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshHostDsaKeyFingerprint() {
        return software.amazon.jsii.Kernel.get(this, "sshHostDsaKeyFingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSshHostDsaKeyFingerprint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sshHostDsaKeyFingerprint", java.util.Objects.requireNonNull(value, "sshHostDsaKeyFingerprint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshHostRsaKeyFingerprint() {
        return software.amazon.jsii.Kernel.get(this, "sshHostRsaKeyFingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSshHostRsaKeyFingerprint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sshHostRsaKeyFingerprint", java.util.Objects.requireNonNull(value, "sshHostRsaKeyFingerprint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshKeyName() {
        return software.amazon.jsii.Kernel.get(this, "sshKeyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSshKeyName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sshKeyName", java.util.Objects.requireNonNull(value, "sshKeyName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackId() {
        return software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStackId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stackId", java.util.Objects.requireNonNull(value, "stackId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setState(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "state", java.util.Objects.requireNonNull(value, "state is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubnetId() {
        return software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubnetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subnetId", java.util.Objects.requireNonNull(value, "subnetId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTenancy() {
        return software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTenancy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tenancy", java.util.Objects.requireNonNull(value, "tenancy is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.OpsworksInstanceTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.OpsworksInstanceTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVirtualizationType() {
        return software.amazon.jsii.Kernel.get(this, "virtualizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVirtualizationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "virtualizationType", java.util.Objects.requireNonNull(value, "virtualizationType is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.OpsworksInstance}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.OpsworksInstance> {
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
        private final imports.aws.OpsworksInstanceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.OpsworksInstanceConfig.Builder();
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
         * @param layerIds This parameter is required.
         */
        public Builder layerIds(final java.util.List<java.lang.String> layerIds) {
            this.config.layerIds(layerIds);
            return this;
        }

        /**
         * @return {@code this}
         * @param stackId This parameter is required.
         */
        public Builder stackId(final java.lang.String stackId) {
            this.config.stackId(stackId);
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
         * @param amiId This parameter is required.
         */
        public Builder amiId(final java.lang.String amiId) {
            this.config.amiId(amiId);
            return this;
        }

        /**
         * @return {@code this}
         * @param architecture This parameter is required.
         */
        public Builder architecture(final java.lang.String architecture) {
            this.config.architecture(architecture);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoScalingType This parameter is required.
         */
        public Builder autoScalingType(final java.lang.String autoScalingType) {
            this.config.autoScalingType(autoScalingType);
            return this;
        }

        /**
         * @return {@code this}
         * @param availabilityZone This parameter is required.
         */
        public Builder availabilityZone(final java.lang.String availabilityZone) {
            this.config.availabilityZone(availabilityZone);
            return this;
        }

        /**
         * @return {@code this}
         * @param createdAt This parameter is required.
         */
        public Builder createdAt(final java.lang.String createdAt) {
            this.config.createdAt(createdAt);
            return this;
        }

        /**
         * @return {@code this}
         * @param deleteEbs This parameter is required.
         */
        public Builder deleteEbs(final java.lang.Boolean deleteEbs) {
            this.config.deleteEbs(deleteEbs);
            return this;
        }

        /**
         * @return {@code this}
         * @param deleteEip This parameter is required.
         */
        public Builder deleteEip(final java.lang.Boolean deleteEip) {
            this.config.deleteEip(deleteEip);
            return this;
        }

        /**
         * ebs_block_device block.
         * <p>
         * @return {@code this}
         * @param ebsBlockDevice ebs_block_device block. This parameter is required.
         */
        public Builder ebsBlockDevice(final java.util.List<? extends imports.aws.OpsworksInstanceEbsBlockDevice> ebsBlockDevice) {
            this.config.ebsBlockDevice(ebsBlockDevice);
            return this;
        }

        /**
         * @return {@code this}
         * @param ebsOptimized This parameter is required.
         */
        public Builder ebsOptimized(final java.lang.Boolean ebsOptimized) {
            this.config.ebsOptimized(ebsOptimized);
            return this;
        }

        /**
         * @return {@code this}
         * @param ecsClusterArn This parameter is required.
         */
        public Builder ecsClusterArn(final java.lang.String ecsClusterArn) {
            this.config.ecsClusterArn(ecsClusterArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param elasticIp This parameter is required.
         */
        public Builder elasticIp(final java.lang.String elasticIp) {
            this.config.elasticIp(elasticIp);
            return this;
        }

        /**
         * ephemeral_block_device block.
         * <p>
         * @return {@code this}
         * @param ephemeralBlockDevice ephemeral_block_device block. This parameter is required.
         */
        public Builder ephemeralBlockDevice(final java.util.List<? extends imports.aws.OpsworksInstanceEphemeralBlockDevice> ephemeralBlockDevice) {
            this.config.ephemeralBlockDevice(ephemeralBlockDevice);
            return this;
        }

        /**
         * @return {@code this}
         * @param hostname This parameter is required.
         */
        public Builder hostname(final java.lang.String hostname) {
            this.config.hostname(hostname);
            return this;
        }

        /**
         * @return {@code this}
         * @param infrastructureClass This parameter is required.
         */
        public Builder infrastructureClass(final java.lang.String infrastructureClass) {
            this.config.infrastructureClass(infrastructureClass);
            return this;
        }

        /**
         * @return {@code this}
         * @param installUpdatesOnBoot This parameter is required.
         */
        public Builder installUpdatesOnBoot(final java.lang.Boolean installUpdatesOnBoot) {
            this.config.installUpdatesOnBoot(installUpdatesOnBoot);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceProfileArn This parameter is required.
         */
        public Builder instanceProfileArn(final java.lang.String instanceProfileArn) {
            this.config.instanceProfileArn(instanceProfileArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceType This parameter is required.
         */
        public Builder instanceType(final java.lang.String instanceType) {
            this.config.instanceType(instanceType);
            return this;
        }

        /**
         * @return {@code this}
         * @param lastServiceErrorId This parameter is required.
         */
        public Builder lastServiceErrorId(final java.lang.String lastServiceErrorId) {
            this.config.lastServiceErrorId(lastServiceErrorId);
            return this;
        }

        /**
         * @return {@code this}
         * @param os This parameter is required.
         */
        public Builder os(final java.lang.String os) {
            this.config.os(os);
            return this;
        }

        /**
         * @return {@code this}
         * @param platform This parameter is required.
         */
        public Builder platform(final java.lang.String platform) {
            this.config.platform(platform);
            return this;
        }

        /**
         * @return {@code this}
         * @param privateDns This parameter is required.
         */
        public Builder privateDns(final java.lang.String privateDns) {
            this.config.privateDns(privateDns);
            return this;
        }

        /**
         * @return {@code this}
         * @param privateIp This parameter is required.
         */
        public Builder privateIp(final java.lang.String privateIp) {
            this.config.privateIp(privateIp);
            return this;
        }

        /**
         * @return {@code this}
         * @param publicDns This parameter is required.
         */
        public Builder publicDns(final java.lang.String publicDns) {
            this.config.publicDns(publicDns);
            return this;
        }

        /**
         * @return {@code this}
         * @param publicIp This parameter is required.
         */
        public Builder publicIp(final java.lang.String publicIp) {
            this.config.publicIp(publicIp);
            return this;
        }

        /**
         * @return {@code this}
         * @param registeredBy This parameter is required.
         */
        public Builder registeredBy(final java.lang.String registeredBy) {
            this.config.registeredBy(registeredBy);
            return this;
        }

        /**
         * @return {@code this}
         * @param reportedAgentVersion This parameter is required.
         */
        public Builder reportedAgentVersion(final java.lang.String reportedAgentVersion) {
            this.config.reportedAgentVersion(reportedAgentVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param reportedOsFamily This parameter is required.
         */
        public Builder reportedOsFamily(final java.lang.String reportedOsFamily) {
            this.config.reportedOsFamily(reportedOsFamily);
            return this;
        }

        /**
         * @return {@code this}
         * @param reportedOsName This parameter is required.
         */
        public Builder reportedOsName(final java.lang.String reportedOsName) {
            this.config.reportedOsName(reportedOsName);
            return this;
        }

        /**
         * @return {@code this}
         * @param reportedOsVersion This parameter is required.
         */
        public Builder reportedOsVersion(final java.lang.String reportedOsVersion) {
            this.config.reportedOsVersion(reportedOsVersion);
            return this;
        }

        /**
         * root_block_device block.
         * <p>
         * @return {@code this}
         * @param rootBlockDevice root_block_device block. This parameter is required.
         */
        public Builder rootBlockDevice(final java.util.List<? extends imports.aws.OpsworksInstanceRootBlockDevice> rootBlockDevice) {
            this.config.rootBlockDevice(rootBlockDevice);
            return this;
        }

        /**
         * @return {@code this}
         * @param rootDeviceType This parameter is required.
         */
        public Builder rootDeviceType(final java.lang.String rootDeviceType) {
            this.config.rootDeviceType(rootDeviceType);
            return this;
        }

        /**
         * @return {@code this}
         * @param rootDeviceVolumeId This parameter is required.
         */
        public Builder rootDeviceVolumeId(final java.lang.String rootDeviceVolumeId) {
            this.config.rootDeviceVolumeId(rootDeviceVolumeId);
            return this;
        }

        /**
         * @return {@code this}
         * @param securityGroupIds This parameter is required.
         */
        public Builder securityGroupIds(final java.util.List<java.lang.String> securityGroupIds) {
            this.config.securityGroupIds(securityGroupIds);
            return this;
        }

        /**
         * @return {@code this}
         * @param sshHostDsaKeyFingerprint This parameter is required.
         */
        public Builder sshHostDsaKeyFingerprint(final java.lang.String sshHostDsaKeyFingerprint) {
            this.config.sshHostDsaKeyFingerprint(sshHostDsaKeyFingerprint);
            return this;
        }

        /**
         * @return {@code this}
         * @param sshHostRsaKeyFingerprint This parameter is required.
         */
        public Builder sshHostRsaKeyFingerprint(final java.lang.String sshHostRsaKeyFingerprint) {
            this.config.sshHostRsaKeyFingerprint(sshHostRsaKeyFingerprint);
            return this;
        }

        /**
         * @return {@code this}
         * @param sshKeyName This parameter is required.
         */
        public Builder sshKeyName(final java.lang.String sshKeyName) {
            this.config.sshKeyName(sshKeyName);
            return this;
        }

        /**
         * @return {@code this}
         * @param state This parameter is required.
         */
        public Builder state(final java.lang.String state) {
            this.config.state(state);
            return this;
        }

        /**
         * @return {@code this}
         * @param status This parameter is required.
         */
        public Builder status(final java.lang.String status) {
            this.config.status(status);
            return this;
        }

        /**
         * @return {@code this}
         * @param subnetId This parameter is required.
         */
        public Builder subnetId(final java.lang.String subnetId) {
            this.config.subnetId(subnetId);
            return this;
        }

        /**
         * @return {@code this}
         * @param tenancy This parameter is required.
         */
        public Builder tenancy(final java.lang.String tenancy) {
            this.config.tenancy(tenancy);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.OpsworksInstanceTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @return {@code this}
         * @param virtualizationType This parameter is required.
         */
        public Builder virtualizationType(final java.lang.String virtualizationType) {
            this.config.virtualizationType(virtualizationType);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.OpsworksInstance}.
         */
        @Override
        public imports.aws.OpsworksInstance build() {
            return new imports.aws.OpsworksInstance(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
