package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.748Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksInstanceConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksInstanceConfig.Jsii$Proxy.class)
public interface OpsworksInstanceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLayerIds();

    @org.jetbrains.annotations.NotNull java.lang.String getStackId();

    default @org.jetbrains.annotations.Nullable java.lang.String getAgentVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAmiId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getArchitecture() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAutoScalingType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCreatedAt() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteEbs() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteEip() {
        return null;
    }

    /**
     * ebs_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice> getEbsBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimized() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEcsClusterArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getElasticIp() {
        return null;
    }

    /**
     * ephemeral_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice> getEphemeralBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHostname() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInfrastructureClass() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInstallUpdatesOnBoot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceProfileArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLastServiceErrorId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOs() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlatform() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateDns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateIp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPublicDns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPublicIp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegisteredBy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReportedAgentVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReportedOsFamily() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReportedOsName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReportedOsVersion() {
        return null;
    }

    /**
     * root_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksInstanceRootBlockDevice> getRootBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRootDeviceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRootDeviceVolumeId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSshHostDsaKeyFingerprint() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSshHostRsaKeyFingerprint() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSshKeyName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getState() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTenancy() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.OpsworksInstanceTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVirtualizationType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksInstanceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksInstanceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksInstanceConfig> {
        private java.util.List<java.lang.String> layerIds;
        private java.lang.String stackId;
        private java.lang.String agentVersion;
        private java.lang.String amiId;
        private java.lang.String architecture;
        private java.lang.String autoScalingType;
        private java.lang.String availabilityZone;
        private java.lang.String createdAt;
        private java.lang.Boolean deleteEbs;
        private java.lang.Boolean deleteEip;
        private java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice> ebsBlockDevice;
        private java.lang.Boolean ebsOptimized;
        private java.lang.String ecsClusterArn;
        private java.lang.String elasticIp;
        private java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice> ephemeralBlockDevice;
        private java.lang.String hostname;
        private java.lang.String infrastructureClass;
        private java.lang.Boolean installUpdatesOnBoot;
        private java.lang.String instanceProfileArn;
        private java.lang.String instanceType;
        private java.lang.String lastServiceErrorId;
        private java.lang.String os;
        private java.lang.String platform;
        private java.lang.String privateDns;
        private java.lang.String privateIp;
        private java.lang.String publicDns;
        private java.lang.String publicIp;
        private java.lang.String registeredBy;
        private java.lang.String reportedAgentVersion;
        private java.lang.String reportedOsFamily;
        private java.lang.String reportedOsName;
        private java.lang.String reportedOsVersion;
        private java.util.List<imports.aws.OpsworksInstanceRootBlockDevice> rootBlockDevice;
        private java.lang.String rootDeviceType;
        private java.lang.String rootDeviceVolumeId;
        private java.util.List<java.lang.String> securityGroupIds;
        private java.lang.String sshHostDsaKeyFingerprint;
        private java.lang.String sshHostRsaKeyFingerprint;
        private java.lang.String sshKeyName;
        private java.lang.String state;
        private java.lang.String status;
        private java.lang.String subnetId;
        private java.lang.String tenancy;
        private imports.aws.OpsworksInstanceTimeouts timeouts;
        private java.lang.String virtualizationType;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getLayerIds}
         * @param layerIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder layerIds(java.util.List<java.lang.String> layerIds) {
            this.layerIds = layerIds;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getStackId}
         * @param stackId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stackId(java.lang.String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getAgentVersion}
         * @param agentVersion the value to be set.
         * @return {@code this}
         */
        public Builder agentVersion(java.lang.String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getAmiId}
         * @param amiId the value to be set.
         * @return {@code this}
         */
        public Builder amiId(java.lang.String amiId) {
            this.amiId = amiId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getArchitecture}
         * @param architecture the value to be set.
         * @return {@code this}
         */
        public Builder architecture(java.lang.String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getAutoScalingType}
         * @param autoScalingType the value to be set.
         * @return {@code this}
         */
        public Builder autoScalingType(java.lang.String autoScalingType) {
            this.autoScalingType = autoScalingType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getCreatedAt}
         * @param createdAt the value to be set.
         * @return {@code this}
         */
        public Builder createdAt(java.lang.String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getDeleteEbs}
         * @param deleteEbs the value to be set.
         * @return {@code this}
         */
        public Builder deleteEbs(java.lang.Boolean deleteEbs) {
            this.deleteEbs = deleteEbs;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getDeleteEip}
         * @param deleteEip the value to be set.
         * @return {@code this}
         */
        public Builder deleteEip(java.lang.Boolean deleteEip) {
            this.deleteEip = deleteEip;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getEbsBlockDevice}
         * @param ebsBlockDevice ebs_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends imports.aws.OpsworksInstanceEbsBlockDevice> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getEbsOptimized}
         * @param ebsOptimized the value to be set.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getEcsClusterArn}
         * @param ecsClusterArn the value to be set.
         * @return {@code this}
         */
        public Builder ecsClusterArn(java.lang.String ecsClusterArn) {
            this.ecsClusterArn = ecsClusterArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getElasticIp}
         * @param elasticIp the value to be set.
         * @return {@code this}
         */
        public Builder elasticIp(java.lang.String elasticIp) {
            this.elasticIp = elasticIp;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice ephemeral_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends imports.aws.OpsworksInstanceEphemeralBlockDevice> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getHostname}
         * @param hostname the value to be set.
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getInfrastructureClass}
         * @param infrastructureClass the value to be set.
         * @return {@code this}
         */
        public Builder infrastructureClass(java.lang.String infrastructureClass) {
            this.infrastructureClass = infrastructureClass;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getInstallUpdatesOnBoot}
         * @param installUpdatesOnBoot the value to be set.
         * @return {@code this}
         */
        public Builder installUpdatesOnBoot(java.lang.Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getInstanceProfileArn}
         * @param instanceProfileArn the value to be set.
         * @return {@code this}
         */
        public Builder instanceProfileArn(java.lang.String instanceProfileArn) {
            this.instanceProfileArn = instanceProfileArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getInstanceType}
         * @param instanceType the value to be set.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getLastServiceErrorId}
         * @param lastServiceErrorId the value to be set.
         * @return {@code this}
         */
        public Builder lastServiceErrorId(java.lang.String lastServiceErrorId) {
            this.lastServiceErrorId = lastServiceErrorId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getOs}
         * @param os the value to be set.
         * @return {@code this}
         */
        public Builder os(java.lang.String os) {
            this.os = os;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getPlatform}
         * @param platform the value to be set.
         * @return {@code this}
         */
        public Builder platform(java.lang.String platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getPrivateDns}
         * @param privateDns the value to be set.
         * @return {@code this}
         */
        public Builder privateDns(java.lang.String privateDns) {
            this.privateDns = privateDns;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getPrivateIp}
         * @param privateIp the value to be set.
         * @return {@code this}
         */
        public Builder privateIp(java.lang.String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getPublicDns}
         * @param publicDns the value to be set.
         * @return {@code this}
         */
        public Builder publicDns(java.lang.String publicDns) {
            this.publicDns = publicDns;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getPublicIp}
         * @param publicIp the value to be set.
         * @return {@code this}
         */
        public Builder publicIp(java.lang.String publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getRegisteredBy}
         * @param registeredBy the value to be set.
         * @return {@code this}
         */
        public Builder registeredBy(java.lang.String registeredBy) {
            this.registeredBy = registeredBy;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getReportedAgentVersion}
         * @param reportedAgentVersion the value to be set.
         * @return {@code this}
         */
        public Builder reportedAgentVersion(java.lang.String reportedAgentVersion) {
            this.reportedAgentVersion = reportedAgentVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getReportedOsFamily}
         * @param reportedOsFamily the value to be set.
         * @return {@code this}
         */
        public Builder reportedOsFamily(java.lang.String reportedOsFamily) {
            this.reportedOsFamily = reportedOsFamily;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getReportedOsName}
         * @param reportedOsName the value to be set.
         * @return {@code this}
         */
        public Builder reportedOsName(java.lang.String reportedOsName) {
            this.reportedOsName = reportedOsName;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getReportedOsVersion}
         * @param reportedOsVersion the value to be set.
         * @return {@code this}
         */
        public Builder reportedOsVersion(java.lang.String reportedOsVersion) {
            this.reportedOsVersion = reportedOsVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getRootBlockDevice}
         * @param rootBlockDevice root_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rootBlockDevice(java.util.List<? extends imports.aws.OpsworksInstanceRootBlockDevice> rootBlockDevice) {
            this.rootBlockDevice = (java.util.List<imports.aws.OpsworksInstanceRootBlockDevice>)rootBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getRootDeviceType}
         * @param rootDeviceType the value to be set.
         * @return {@code this}
         */
        public Builder rootDeviceType(java.lang.String rootDeviceType) {
            this.rootDeviceType = rootDeviceType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getRootDeviceVolumeId}
         * @param rootDeviceVolumeId the value to be set.
         * @return {@code this}
         */
        public Builder rootDeviceVolumeId(java.lang.String rootDeviceVolumeId) {
            this.rootDeviceVolumeId = rootDeviceVolumeId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getSecurityGroupIds}
         * @param securityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupIds(java.util.List<java.lang.String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getSshHostDsaKeyFingerprint}
         * @param sshHostDsaKeyFingerprint the value to be set.
         * @return {@code this}
         */
        public Builder sshHostDsaKeyFingerprint(java.lang.String sshHostDsaKeyFingerprint) {
            this.sshHostDsaKeyFingerprint = sshHostDsaKeyFingerprint;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getSshHostRsaKeyFingerprint}
         * @param sshHostRsaKeyFingerprint the value to be set.
         * @return {@code this}
         */
        public Builder sshHostRsaKeyFingerprint(java.lang.String sshHostRsaKeyFingerprint) {
            this.sshHostRsaKeyFingerprint = sshHostRsaKeyFingerprint;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getSshKeyName}
         * @param sshKeyName the value to be set.
         * @return {@code this}
         */
        public Builder sshKeyName(java.lang.String sshKeyName) {
            this.sshKeyName = sshKeyName;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getState}
         * @param state the value to be set.
         * @return {@code this}
         */
        public Builder state(java.lang.String state) {
            this.state = state;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getSubnetId}
         * @param subnetId the value to be set.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getTenancy}
         * @param tenancy the value to be set.
         * @return {@code this}
         */
        public Builder tenancy(java.lang.String tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.OpsworksInstanceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getVirtualizationType}
         * @param virtualizationType the value to be set.
         * @return {@code this}
         */
        public Builder virtualizationType(java.lang.String virtualizationType) {
            this.virtualizationType = virtualizationType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksInstanceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksInstanceConfig#getProvider}
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
         * @return a new instance of {@link OpsworksInstanceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksInstanceConfig build() {
            return new Jsii$Proxy(layerIds, stackId, agentVersion, amiId, architecture, autoScalingType, availabilityZone, createdAt, deleteEbs, deleteEip, ebsBlockDevice, ebsOptimized, ecsClusterArn, elasticIp, ephemeralBlockDevice, hostname, infrastructureClass, installUpdatesOnBoot, instanceProfileArn, instanceType, lastServiceErrorId, os, platform, privateDns, privateIp, publicDns, publicIp, registeredBy, reportedAgentVersion, reportedOsFamily, reportedOsName, reportedOsVersion, rootBlockDevice, rootDeviceType, rootDeviceVolumeId, securityGroupIds, sshHostDsaKeyFingerprint, sshHostRsaKeyFingerprint, sshKeyName, state, status, subnetId, tenancy, timeouts, virtualizationType, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OpsworksInstanceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksInstanceConfig {
        private final java.util.List<java.lang.String> layerIds;
        private final java.lang.String stackId;
        private final java.lang.String agentVersion;
        private final java.lang.String amiId;
        private final java.lang.String architecture;
        private final java.lang.String autoScalingType;
        private final java.lang.String availabilityZone;
        private final java.lang.String createdAt;
        private final java.lang.Boolean deleteEbs;
        private final java.lang.Boolean deleteEip;
        private final java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice> ebsBlockDevice;
        private final java.lang.Boolean ebsOptimized;
        private final java.lang.String ecsClusterArn;
        private final java.lang.String elasticIp;
        private final java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice> ephemeralBlockDevice;
        private final java.lang.String hostname;
        private final java.lang.String infrastructureClass;
        private final java.lang.Boolean installUpdatesOnBoot;
        private final java.lang.String instanceProfileArn;
        private final java.lang.String instanceType;
        private final java.lang.String lastServiceErrorId;
        private final java.lang.String os;
        private final java.lang.String platform;
        private final java.lang.String privateDns;
        private final java.lang.String privateIp;
        private final java.lang.String publicDns;
        private final java.lang.String publicIp;
        private final java.lang.String registeredBy;
        private final java.lang.String reportedAgentVersion;
        private final java.lang.String reportedOsFamily;
        private final java.lang.String reportedOsName;
        private final java.lang.String reportedOsVersion;
        private final java.util.List<imports.aws.OpsworksInstanceRootBlockDevice> rootBlockDevice;
        private final java.lang.String rootDeviceType;
        private final java.lang.String rootDeviceVolumeId;
        private final java.util.List<java.lang.String> securityGroupIds;
        private final java.lang.String sshHostDsaKeyFingerprint;
        private final java.lang.String sshHostRsaKeyFingerprint;
        private final java.lang.String sshKeyName;
        private final java.lang.String state;
        private final java.lang.String status;
        private final java.lang.String subnetId;
        private final java.lang.String tenancy;
        private final imports.aws.OpsworksInstanceTimeouts timeouts;
        private final java.lang.String virtualizationType;
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
            this.layerIds = software.amazon.jsii.Kernel.get(this, "layerIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.stackId = software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.agentVersion = software.amazon.jsii.Kernel.get(this, "agentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.amiId = software.amazon.jsii.Kernel.get(this, "amiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.architecture = software.amazon.jsii.Kernel.get(this, "architecture", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.autoScalingType = software.amazon.jsii.Kernel.get(this, "autoScalingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.createdAt = software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deleteEbs = software.amazon.jsii.Kernel.get(this, "deleteEbs", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.deleteEip = software.amazon.jsii.Kernel.get(this, "deleteEip", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceEbsBlockDevice.class)));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ecsClusterArn = software.amazon.jsii.Kernel.get(this, "ecsClusterArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.elasticIp = software.amazon.jsii.Kernel.get(this, "elasticIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceEphemeralBlockDevice.class)));
            this.hostname = software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.infrastructureClass = software.amazon.jsii.Kernel.get(this, "infrastructureClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.installUpdatesOnBoot = software.amazon.jsii.Kernel.get(this, "installUpdatesOnBoot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.instanceProfileArn = software.amazon.jsii.Kernel.get(this, "instanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lastServiceErrorId = software.amazon.jsii.Kernel.get(this, "lastServiceErrorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.os = software.amazon.jsii.Kernel.get(this, "os", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.platform = software.amazon.jsii.Kernel.get(this, "platform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateDns = software.amazon.jsii.Kernel.get(this, "privateDns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateIp = software.amazon.jsii.Kernel.get(this, "privateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publicDns = software.amazon.jsii.Kernel.get(this, "publicDns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publicIp = software.amazon.jsii.Kernel.get(this, "publicIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.registeredBy = software.amazon.jsii.Kernel.get(this, "registeredBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportedAgentVersion = software.amazon.jsii.Kernel.get(this, "reportedAgentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportedOsFamily = software.amazon.jsii.Kernel.get(this, "reportedOsFamily", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportedOsName = software.amazon.jsii.Kernel.get(this, "reportedOsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportedOsVersion = software.amazon.jsii.Kernel.get(this, "reportedOsVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootBlockDevice = software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceRootBlockDevice.class)));
            this.rootDeviceType = software.amazon.jsii.Kernel.get(this, "rootDeviceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootDeviceVolumeId = software.amazon.jsii.Kernel.get(this, "rootDeviceVolumeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupIds = software.amazon.jsii.Kernel.get(this, "securityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sshHostDsaKeyFingerprint = software.amazon.jsii.Kernel.get(this, "sshHostDsaKeyFingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sshHostRsaKeyFingerprint = software.amazon.jsii.Kernel.get(this, "sshHostRsaKeyFingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sshKeyName = software.amazon.jsii.Kernel.get(this, "sshKeyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.state = software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tenancy = software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksInstanceTimeouts.class));
            this.virtualizationType = software.amazon.jsii.Kernel.get(this, "virtualizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> layerIds, final java.lang.String stackId, final java.lang.String agentVersion, final java.lang.String amiId, final java.lang.String architecture, final java.lang.String autoScalingType, final java.lang.String availabilityZone, final java.lang.String createdAt, final java.lang.Boolean deleteEbs, final java.lang.Boolean deleteEip, final java.util.List<? extends imports.aws.OpsworksInstanceEbsBlockDevice> ebsBlockDevice, final java.lang.Boolean ebsOptimized, final java.lang.String ecsClusterArn, final java.lang.String elasticIp, final java.util.List<? extends imports.aws.OpsworksInstanceEphemeralBlockDevice> ephemeralBlockDevice, final java.lang.String hostname, final java.lang.String infrastructureClass, final java.lang.Boolean installUpdatesOnBoot, final java.lang.String instanceProfileArn, final java.lang.String instanceType, final java.lang.String lastServiceErrorId, final java.lang.String os, final java.lang.String platform, final java.lang.String privateDns, final java.lang.String privateIp, final java.lang.String publicDns, final java.lang.String publicIp, final java.lang.String registeredBy, final java.lang.String reportedAgentVersion, final java.lang.String reportedOsFamily, final java.lang.String reportedOsName, final java.lang.String reportedOsVersion, final java.util.List<? extends imports.aws.OpsworksInstanceRootBlockDevice> rootBlockDevice, final java.lang.String rootDeviceType, final java.lang.String rootDeviceVolumeId, final java.util.List<java.lang.String> securityGroupIds, final java.lang.String sshHostDsaKeyFingerprint, final java.lang.String sshHostRsaKeyFingerprint, final java.lang.String sshKeyName, final java.lang.String state, final java.lang.String status, final java.lang.String subnetId, final java.lang.String tenancy, final imports.aws.OpsworksInstanceTimeouts timeouts, final java.lang.String virtualizationType, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.layerIds = java.util.Objects.requireNonNull(layerIds, "layerIds is required");
            this.stackId = java.util.Objects.requireNonNull(stackId, "stackId is required");
            this.agentVersion = agentVersion;
            this.amiId = amiId;
            this.architecture = architecture;
            this.autoScalingType = autoScalingType;
            this.availabilityZone = availabilityZone;
            this.createdAt = createdAt;
            this.deleteEbs = deleteEbs;
            this.deleteEip = deleteEip;
            this.ebsBlockDevice = (java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice>)ebsBlockDevice;
            this.ebsOptimized = ebsOptimized;
            this.ecsClusterArn = ecsClusterArn;
            this.elasticIp = elasticIp;
            this.ephemeralBlockDevice = (java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice>)ephemeralBlockDevice;
            this.hostname = hostname;
            this.infrastructureClass = infrastructureClass;
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            this.instanceProfileArn = instanceProfileArn;
            this.instanceType = instanceType;
            this.lastServiceErrorId = lastServiceErrorId;
            this.os = os;
            this.platform = platform;
            this.privateDns = privateDns;
            this.privateIp = privateIp;
            this.publicDns = publicDns;
            this.publicIp = publicIp;
            this.registeredBy = registeredBy;
            this.reportedAgentVersion = reportedAgentVersion;
            this.reportedOsFamily = reportedOsFamily;
            this.reportedOsName = reportedOsName;
            this.reportedOsVersion = reportedOsVersion;
            this.rootBlockDevice = (java.util.List<imports.aws.OpsworksInstanceRootBlockDevice>)rootBlockDevice;
            this.rootDeviceType = rootDeviceType;
            this.rootDeviceVolumeId = rootDeviceVolumeId;
            this.securityGroupIds = securityGroupIds;
            this.sshHostDsaKeyFingerprint = sshHostDsaKeyFingerprint;
            this.sshHostRsaKeyFingerprint = sshHostRsaKeyFingerprint;
            this.sshKeyName = sshKeyName;
            this.state = state;
            this.status = status;
            this.subnetId = subnetId;
            this.tenancy = tenancy;
            this.timeouts = timeouts;
            this.virtualizationType = virtualizationType;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getLayerIds() {
            return this.layerIds;
        }

        @Override
        public final java.lang.String getStackId() {
            return this.stackId;
        }

        @Override
        public final java.lang.String getAgentVersion() {
            return this.agentVersion;
        }

        @Override
        public final java.lang.String getAmiId() {
            return this.amiId;
        }

        @Override
        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        @Override
        public final java.lang.String getAutoScalingType() {
            return this.autoScalingType;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.String getCreatedAt() {
            return this.createdAt;
        }

        @Override
        public final java.lang.Boolean getDeleteEbs() {
            return this.deleteEbs;
        }

        @Override
        public final java.lang.Boolean getDeleteEip() {
            return this.deleteEip;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksInstanceEbsBlockDevice> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.lang.Boolean getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.lang.String getEcsClusterArn() {
            return this.ecsClusterArn;
        }

        @Override
        public final java.lang.String getElasticIp() {
            return this.elasticIp;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksInstanceEphemeralBlockDevice> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public final java.lang.String getInfrastructureClass() {
            return this.infrastructureClass;
        }

        @Override
        public final java.lang.Boolean getInstallUpdatesOnBoot() {
            return this.installUpdatesOnBoot;
        }

        @Override
        public final java.lang.String getInstanceProfileArn() {
            return this.instanceProfileArn;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.String getLastServiceErrorId() {
            return this.lastServiceErrorId;
        }

        @Override
        public final java.lang.String getOs() {
            return this.os;
        }

        @Override
        public final java.lang.String getPlatform() {
            return this.platform;
        }

        @Override
        public final java.lang.String getPrivateDns() {
            return this.privateDns;
        }

        @Override
        public final java.lang.String getPrivateIp() {
            return this.privateIp;
        }

        @Override
        public final java.lang.String getPublicDns() {
            return this.publicDns;
        }

        @Override
        public final java.lang.String getPublicIp() {
            return this.publicIp;
        }

        @Override
        public final java.lang.String getRegisteredBy() {
            return this.registeredBy;
        }

        @Override
        public final java.lang.String getReportedAgentVersion() {
            return this.reportedAgentVersion;
        }

        @Override
        public final java.lang.String getReportedOsFamily() {
            return this.reportedOsFamily;
        }

        @Override
        public final java.lang.String getReportedOsName() {
            return this.reportedOsName;
        }

        @Override
        public final java.lang.String getReportedOsVersion() {
            return this.reportedOsVersion;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksInstanceRootBlockDevice> getRootBlockDevice() {
            return this.rootBlockDevice;
        }

        @Override
        public final java.lang.String getRootDeviceType() {
            return this.rootDeviceType;
        }

        @Override
        public final java.lang.String getRootDeviceVolumeId() {
            return this.rootDeviceVolumeId;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        @Override
        public final java.lang.String getSshHostDsaKeyFingerprint() {
            return this.sshHostDsaKeyFingerprint;
        }

        @Override
        public final java.lang.String getSshHostRsaKeyFingerprint() {
            return this.sshHostRsaKeyFingerprint;
        }

        @Override
        public final java.lang.String getSshKeyName() {
            return this.sshKeyName;
        }

        @Override
        public final java.lang.String getState() {
            return this.state;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        public final java.lang.String getTenancy() {
            return this.tenancy;
        }

        @Override
        public final imports.aws.OpsworksInstanceTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getVirtualizationType() {
            return this.virtualizationType;
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

            data.set("layerIds", om.valueToTree(this.getLayerIds()));
            data.set("stackId", om.valueToTree(this.getStackId()));
            if (this.getAgentVersion() != null) {
                data.set("agentVersion", om.valueToTree(this.getAgentVersion()));
            }
            if (this.getAmiId() != null) {
                data.set("amiId", om.valueToTree(this.getAmiId()));
            }
            if (this.getArchitecture() != null) {
                data.set("architecture", om.valueToTree(this.getArchitecture()));
            }
            if (this.getAutoScalingType() != null) {
                data.set("autoScalingType", om.valueToTree(this.getAutoScalingType()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getCreatedAt() != null) {
                data.set("createdAt", om.valueToTree(this.getCreatedAt()));
            }
            if (this.getDeleteEbs() != null) {
                data.set("deleteEbs", om.valueToTree(this.getDeleteEbs()));
            }
            if (this.getDeleteEip() != null) {
                data.set("deleteEip", om.valueToTree(this.getDeleteEip()));
            }
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getEcsClusterArn() != null) {
                data.set("ecsClusterArn", om.valueToTree(this.getEcsClusterArn()));
            }
            if (this.getElasticIp() != null) {
                data.set("elasticIp", om.valueToTree(this.getElasticIp()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getHostname() != null) {
                data.set("hostname", om.valueToTree(this.getHostname()));
            }
            if (this.getInfrastructureClass() != null) {
                data.set("infrastructureClass", om.valueToTree(this.getInfrastructureClass()));
            }
            if (this.getInstallUpdatesOnBoot() != null) {
                data.set("installUpdatesOnBoot", om.valueToTree(this.getInstallUpdatesOnBoot()));
            }
            if (this.getInstanceProfileArn() != null) {
                data.set("instanceProfileArn", om.valueToTree(this.getInstanceProfileArn()));
            }
            if (this.getInstanceType() != null) {
                data.set("instanceType", om.valueToTree(this.getInstanceType()));
            }
            if (this.getLastServiceErrorId() != null) {
                data.set("lastServiceErrorId", om.valueToTree(this.getLastServiceErrorId()));
            }
            if (this.getOs() != null) {
                data.set("os", om.valueToTree(this.getOs()));
            }
            if (this.getPlatform() != null) {
                data.set("platform", om.valueToTree(this.getPlatform()));
            }
            if (this.getPrivateDns() != null) {
                data.set("privateDns", om.valueToTree(this.getPrivateDns()));
            }
            if (this.getPrivateIp() != null) {
                data.set("privateIp", om.valueToTree(this.getPrivateIp()));
            }
            if (this.getPublicDns() != null) {
                data.set("publicDns", om.valueToTree(this.getPublicDns()));
            }
            if (this.getPublicIp() != null) {
                data.set("publicIp", om.valueToTree(this.getPublicIp()));
            }
            if (this.getRegisteredBy() != null) {
                data.set("registeredBy", om.valueToTree(this.getRegisteredBy()));
            }
            if (this.getReportedAgentVersion() != null) {
                data.set("reportedAgentVersion", om.valueToTree(this.getReportedAgentVersion()));
            }
            if (this.getReportedOsFamily() != null) {
                data.set("reportedOsFamily", om.valueToTree(this.getReportedOsFamily()));
            }
            if (this.getReportedOsName() != null) {
                data.set("reportedOsName", om.valueToTree(this.getReportedOsName()));
            }
            if (this.getReportedOsVersion() != null) {
                data.set("reportedOsVersion", om.valueToTree(this.getReportedOsVersion()));
            }
            if (this.getRootBlockDevice() != null) {
                data.set("rootBlockDevice", om.valueToTree(this.getRootBlockDevice()));
            }
            if (this.getRootDeviceType() != null) {
                data.set("rootDeviceType", om.valueToTree(this.getRootDeviceType()));
            }
            if (this.getRootDeviceVolumeId() != null) {
                data.set("rootDeviceVolumeId", om.valueToTree(this.getRootDeviceVolumeId()));
            }
            if (this.getSecurityGroupIds() != null) {
                data.set("securityGroupIds", om.valueToTree(this.getSecurityGroupIds()));
            }
            if (this.getSshHostDsaKeyFingerprint() != null) {
                data.set("sshHostDsaKeyFingerprint", om.valueToTree(this.getSshHostDsaKeyFingerprint()));
            }
            if (this.getSshHostRsaKeyFingerprint() != null) {
                data.set("sshHostRsaKeyFingerprint", om.valueToTree(this.getSshHostRsaKeyFingerprint()));
            }
            if (this.getSshKeyName() != null) {
                data.set("sshKeyName", om.valueToTree(this.getSshKeyName()));
            }
            if (this.getState() != null) {
                data.set("state", om.valueToTree(this.getState()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }
            if (this.getTenancy() != null) {
                data.set("tenancy", om.valueToTree(this.getTenancy()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVirtualizationType() != null) {
                data.set("virtualizationType", om.valueToTree(this.getVirtualizationType()));
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
            struct.set("fqn", om.valueToTree("aws.OpsworksInstanceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksInstanceConfig.Jsii$Proxy that = (OpsworksInstanceConfig.Jsii$Proxy) o;

            if (!layerIds.equals(that.layerIds)) return false;
            if (!stackId.equals(that.stackId)) return false;
            if (this.agentVersion != null ? !this.agentVersion.equals(that.agentVersion) : that.agentVersion != null) return false;
            if (this.amiId != null ? !this.amiId.equals(that.amiId) : that.amiId != null) return false;
            if (this.architecture != null ? !this.architecture.equals(that.architecture) : that.architecture != null) return false;
            if (this.autoScalingType != null ? !this.autoScalingType.equals(that.autoScalingType) : that.autoScalingType != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.createdAt != null ? !this.createdAt.equals(that.createdAt) : that.createdAt != null) return false;
            if (this.deleteEbs != null ? !this.deleteEbs.equals(that.deleteEbs) : that.deleteEbs != null) return false;
            if (this.deleteEip != null ? !this.deleteEip.equals(that.deleteEip) : that.deleteEip != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.ecsClusterArn != null ? !this.ecsClusterArn.equals(that.ecsClusterArn) : that.ecsClusterArn != null) return false;
            if (this.elasticIp != null ? !this.elasticIp.equals(that.elasticIp) : that.elasticIp != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.hostname != null ? !this.hostname.equals(that.hostname) : that.hostname != null) return false;
            if (this.infrastructureClass != null ? !this.infrastructureClass.equals(that.infrastructureClass) : that.infrastructureClass != null) return false;
            if (this.installUpdatesOnBoot != null ? !this.installUpdatesOnBoot.equals(that.installUpdatesOnBoot) : that.installUpdatesOnBoot != null) return false;
            if (this.instanceProfileArn != null ? !this.instanceProfileArn.equals(that.instanceProfileArn) : that.instanceProfileArn != null) return false;
            if (this.instanceType != null ? !this.instanceType.equals(that.instanceType) : that.instanceType != null) return false;
            if (this.lastServiceErrorId != null ? !this.lastServiceErrorId.equals(that.lastServiceErrorId) : that.lastServiceErrorId != null) return false;
            if (this.os != null ? !this.os.equals(that.os) : that.os != null) return false;
            if (this.platform != null ? !this.platform.equals(that.platform) : that.platform != null) return false;
            if (this.privateDns != null ? !this.privateDns.equals(that.privateDns) : that.privateDns != null) return false;
            if (this.privateIp != null ? !this.privateIp.equals(that.privateIp) : that.privateIp != null) return false;
            if (this.publicDns != null ? !this.publicDns.equals(that.publicDns) : that.publicDns != null) return false;
            if (this.publicIp != null ? !this.publicIp.equals(that.publicIp) : that.publicIp != null) return false;
            if (this.registeredBy != null ? !this.registeredBy.equals(that.registeredBy) : that.registeredBy != null) return false;
            if (this.reportedAgentVersion != null ? !this.reportedAgentVersion.equals(that.reportedAgentVersion) : that.reportedAgentVersion != null) return false;
            if (this.reportedOsFamily != null ? !this.reportedOsFamily.equals(that.reportedOsFamily) : that.reportedOsFamily != null) return false;
            if (this.reportedOsName != null ? !this.reportedOsName.equals(that.reportedOsName) : that.reportedOsName != null) return false;
            if (this.reportedOsVersion != null ? !this.reportedOsVersion.equals(that.reportedOsVersion) : that.reportedOsVersion != null) return false;
            if (this.rootBlockDevice != null ? !this.rootBlockDevice.equals(that.rootBlockDevice) : that.rootBlockDevice != null) return false;
            if (this.rootDeviceType != null ? !this.rootDeviceType.equals(that.rootDeviceType) : that.rootDeviceType != null) return false;
            if (this.rootDeviceVolumeId != null ? !this.rootDeviceVolumeId.equals(that.rootDeviceVolumeId) : that.rootDeviceVolumeId != null) return false;
            if (this.securityGroupIds != null ? !this.securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null) return false;
            if (this.sshHostDsaKeyFingerprint != null ? !this.sshHostDsaKeyFingerprint.equals(that.sshHostDsaKeyFingerprint) : that.sshHostDsaKeyFingerprint != null) return false;
            if (this.sshHostRsaKeyFingerprint != null ? !this.sshHostRsaKeyFingerprint.equals(that.sshHostRsaKeyFingerprint) : that.sshHostRsaKeyFingerprint != null) return false;
            if (this.sshKeyName != null ? !this.sshKeyName.equals(that.sshKeyName) : that.sshKeyName != null) return false;
            if (this.state != null ? !this.state.equals(that.state) : that.state != null) return false;
            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            if (this.subnetId != null ? !this.subnetId.equals(that.subnetId) : that.subnetId != null) return false;
            if (this.tenancy != null ? !this.tenancy.equals(that.tenancy) : that.tenancy != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.virtualizationType != null ? !this.virtualizationType.equals(that.virtualizationType) : that.virtualizationType != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.layerIds.hashCode();
            result = 31 * result + (this.stackId.hashCode());
            result = 31 * result + (this.agentVersion != null ? this.agentVersion.hashCode() : 0);
            result = 31 * result + (this.amiId != null ? this.amiId.hashCode() : 0);
            result = 31 * result + (this.architecture != null ? this.architecture.hashCode() : 0);
            result = 31 * result + (this.autoScalingType != null ? this.autoScalingType.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.createdAt != null ? this.createdAt.hashCode() : 0);
            result = 31 * result + (this.deleteEbs != null ? this.deleteEbs.hashCode() : 0);
            result = 31 * result + (this.deleteEip != null ? this.deleteEip.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.ecsClusterArn != null ? this.ecsClusterArn.hashCode() : 0);
            result = 31 * result + (this.elasticIp != null ? this.elasticIp.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.hostname != null ? this.hostname.hashCode() : 0);
            result = 31 * result + (this.infrastructureClass != null ? this.infrastructureClass.hashCode() : 0);
            result = 31 * result + (this.installUpdatesOnBoot != null ? this.installUpdatesOnBoot.hashCode() : 0);
            result = 31 * result + (this.instanceProfileArn != null ? this.instanceProfileArn.hashCode() : 0);
            result = 31 * result + (this.instanceType != null ? this.instanceType.hashCode() : 0);
            result = 31 * result + (this.lastServiceErrorId != null ? this.lastServiceErrorId.hashCode() : 0);
            result = 31 * result + (this.os != null ? this.os.hashCode() : 0);
            result = 31 * result + (this.platform != null ? this.platform.hashCode() : 0);
            result = 31 * result + (this.privateDns != null ? this.privateDns.hashCode() : 0);
            result = 31 * result + (this.privateIp != null ? this.privateIp.hashCode() : 0);
            result = 31 * result + (this.publicDns != null ? this.publicDns.hashCode() : 0);
            result = 31 * result + (this.publicIp != null ? this.publicIp.hashCode() : 0);
            result = 31 * result + (this.registeredBy != null ? this.registeredBy.hashCode() : 0);
            result = 31 * result + (this.reportedAgentVersion != null ? this.reportedAgentVersion.hashCode() : 0);
            result = 31 * result + (this.reportedOsFamily != null ? this.reportedOsFamily.hashCode() : 0);
            result = 31 * result + (this.reportedOsName != null ? this.reportedOsName.hashCode() : 0);
            result = 31 * result + (this.reportedOsVersion != null ? this.reportedOsVersion.hashCode() : 0);
            result = 31 * result + (this.rootBlockDevice != null ? this.rootBlockDevice.hashCode() : 0);
            result = 31 * result + (this.rootDeviceType != null ? this.rootDeviceType.hashCode() : 0);
            result = 31 * result + (this.rootDeviceVolumeId != null ? this.rootDeviceVolumeId.hashCode() : 0);
            result = 31 * result + (this.securityGroupIds != null ? this.securityGroupIds.hashCode() : 0);
            result = 31 * result + (this.sshHostDsaKeyFingerprint != null ? this.sshHostDsaKeyFingerprint.hashCode() : 0);
            result = 31 * result + (this.sshHostRsaKeyFingerprint != null ? this.sshHostRsaKeyFingerprint.hashCode() : 0);
            result = 31 * result + (this.sshKeyName != null ? this.sshKeyName.hashCode() : 0);
            result = 31 * result + (this.state != null ? this.state.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            result = 31 * result + (this.tenancy != null ? this.tenancy.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.virtualizationType != null ? this.virtualizationType.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
