package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.887Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotInstanceRequestConfig")
@software.amazon.jsii.Jsii.Proxy(SpotInstanceRequestConfig.Jsii$Proxy.class)
public interface SpotInstanceRequestConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAmi();

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAssociatePublicIpAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBlockDurationMinutes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getCpuCoreCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getCpuThreadsPerCore() {
        return null;
    }

    /**
     * credit_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotInstanceRequestCreditSpecification> getCreditSpecification() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableApiTermination() {
        return null;
    }

    /**
     * ebs_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotInstanceRequestEbsBlockDevice> getEbsBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimized() {
        return null;
    }

    /**
     * ephemeral_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotInstanceRequestEphemeralBlockDevice> getEphemeralBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getFetchPasswordData() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHibernation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHostId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIamInstanceProfile() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceInitiatedShutdownBehavior() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceInterruptionBehaviour() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIpv6AddressCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpv6Addresses() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKeyName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLaunchGroup() {
        return null;
    }

    /**
     * metadata_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotInstanceRequestMetadataOptions> getMetadataOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMonitoring() {
        return null;
    }

    /**
     * network_interface block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotInstanceRequestNetworkInterface> getNetworkInterface() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlacementGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateIp() {
        return null;
    }

    /**
     * root_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotInstanceRequestRootBlockDevice> getRootBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSourceDestCheck() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotPrice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTenancy() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.SpotInstanceRequestTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserData() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserDataBase64() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getValidFrom() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getValidUntil() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getWaitForFulfillment() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotInstanceRequestConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotInstanceRequestConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotInstanceRequestConfig> {
        private java.lang.String ami;
        private java.lang.String instanceType;
        private java.lang.Boolean associatePublicIpAddress;
        private java.lang.String availabilityZone;
        private java.lang.Number blockDurationMinutes;
        private java.lang.Number cpuCoreCount;
        private java.lang.Number cpuThreadsPerCore;
        private java.util.List<imports.aws.SpotInstanceRequestCreditSpecification> creditSpecification;
        private java.lang.Boolean disableApiTermination;
        private java.util.List<imports.aws.SpotInstanceRequestEbsBlockDevice> ebsBlockDevice;
        private java.lang.Boolean ebsOptimized;
        private java.util.List<imports.aws.SpotInstanceRequestEphemeralBlockDevice> ephemeralBlockDevice;
        private java.lang.Boolean fetchPasswordData;
        private java.lang.Boolean hibernation;
        private java.lang.String hostId;
        private java.lang.String iamInstanceProfile;
        private java.lang.String instanceInitiatedShutdownBehavior;
        private java.lang.String instanceInterruptionBehaviour;
        private java.lang.Number ipv6AddressCount;
        private java.util.List<java.lang.String> ipv6Addresses;
        private java.lang.String keyName;
        private java.lang.String launchGroup;
        private java.util.List<imports.aws.SpotInstanceRequestMetadataOptions> metadataOptions;
        private java.lang.Boolean monitoring;
        private java.util.List<imports.aws.SpotInstanceRequestNetworkInterface> networkInterface;
        private java.lang.String placementGroup;
        private java.lang.String privateIp;
        private java.util.List<imports.aws.SpotInstanceRequestRootBlockDevice> rootBlockDevice;
        private java.util.List<java.lang.String> securityGroups;
        private java.lang.Boolean sourceDestCheck;
        private java.lang.String spotPrice;
        private java.lang.String spotType;
        private java.lang.String subnetId;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String tenancy;
        private imports.aws.SpotInstanceRequestTimeouts timeouts;
        private java.lang.String userData;
        private java.lang.String userDataBase64;
        private java.lang.String validFrom;
        private java.lang.String validUntil;
        private java.util.Map<java.lang.String, java.lang.String> volumeTags;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.Boolean waitForFulfillment;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getAmi}
         * @param ami the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ami(java.lang.String ami) {
            this.ami = ami;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getInstanceType}
         * @param instanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getAssociatePublicIpAddress}
         * @param associatePublicIpAddress the value to be set.
         * @return {@code this}
         */
        public Builder associatePublicIpAddress(java.lang.Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getBlockDurationMinutes}
         * @param blockDurationMinutes the value to be set.
         * @return {@code this}
         */
        public Builder blockDurationMinutes(java.lang.Number blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getCpuCoreCount}
         * @param cpuCoreCount the value to be set.
         * @return {@code this}
         */
        public Builder cpuCoreCount(java.lang.Number cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getCpuThreadsPerCore}
         * @param cpuThreadsPerCore the value to be set.
         * @return {@code this}
         */
        public Builder cpuThreadsPerCore(java.lang.Number cpuThreadsPerCore) {
            this.cpuThreadsPerCore = cpuThreadsPerCore;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getCreditSpecification}
         * @param creditSpecification credit_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder creditSpecification(java.util.List<? extends imports.aws.SpotInstanceRequestCreditSpecification> creditSpecification) {
            this.creditSpecification = (java.util.List<imports.aws.SpotInstanceRequestCreditSpecification>)creditSpecification;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getDisableApiTermination}
         * @param disableApiTermination the value to be set.
         * @return {@code this}
         */
        public Builder disableApiTermination(java.lang.Boolean disableApiTermination) {
            this.disableApiTermination = disableApiTermination;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getEbsBlockDevice}
         * @param ebsBlockDevice ebs_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends imports.aws.SpotInstanceRequestEbsBlockDevice> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<imports.aws.SpotInstanceRequestEbsBlockDevice>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getEbsOptimized}
         * @param ebsOptimized the value to be set.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice ephemeral_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends imports.aws.SpotInstanceRequestEphemeralBlockDevice> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<imports.aws.SpotInstanceRequestEphemeralBlockDevice>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getFetchPasswordData}
         * @param fetchPasswordData the value to be set.
         * @return {@code this}
         */
        public Builder fetchPasswordData(java.lang.Boolean fetchPasswordData) {
            this.fetchPasswordData = fetchPasswordData;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getHibernation}
         * @param hibernation the value to be set.
         * @return {@code this}
         */
        public Builder hibernation(java.lang.Boolean hibernation) {
            this.hibernation = hibernation;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getHostId}
         * @param hostId the value to be set.
         * @return {@code this}
         */
        public Builder hostId(java.lang.String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getIamInstanceProfile}
         * @param iamInstanceProfile the value to be set.
         * @return {@code this}
         */
        public Builder iamInstanceProfile(java.lang.String iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getInstanceInitiatedShutdownBehavior}
         * @param instanceInitiatedShutdownBehavior the value to be set.
         * @return {@code this}
         */
        public Builder instanceInitiatedShutdownBehavior(java.lang.String instanceInitiatedShutdownBehavior) {
            this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getInstanceInterruptionBehaviour}
         * @param instanceInterruptionBehaviour the value to be set.
         * @return {@code this}
         */
        public Builder instanceInterruptionBehaviour(java.lang.String instanceInterruptionBehaviour) {
            this.instanceInterruptionBehaviour = instanceInterruptionBehaviour;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getIpv6AddressCount}
         * @param ipv6AddressCount the value to be set.
         * @return {@code this}
         */
        public Builder ipv6AddressCount(java.lang.Number ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getIpv6Addresses}
         * @param ipv6Addresses the value to be set.
         * @return {@code this}
         */
        public Builder ipv6Addresses(java.util.List<java.lang.String> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getKeyName}
         * @param keyName the value to be set.
         * @return {@code this}
         */
        public Builder keyName(java.lang.String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getLaunchGroup}
         * @param launchGroup the value to be set.
         * @return {@code this}
         */
        public Builder launchGroup(java.lang.String launchGroup) {
            this.launchGroup = launchGroup;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getMetadataOptions}
         * @param metadataOptions metadata_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder metadataOptions(java.util.List<? extends imports.aws.SpotInstanceRequestMetadataOptions> metadataOptions) {
            this.metadataOptions = (java.util.List<imports.aws.SpotInstanceRequestMetadataOptions>)metadataOptions;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getMonitoring}
         * @param monitoring the value to be set.
         * @return {@code this}
         */
        public Builder monitoring(java.lang.Boolean monitoring) {
            this.monitoring = monitoring;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getNetworkInterface}
         * @param networkInterface network_interface block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder networkInterface(java.util.List<? extends imports.aws.SpotInstanceRequestNetworkInterface> networkInterface) {
            this.networkInterface = (java.util.List<imports.aws.SpotInstanceRequestNetworkInterface>)networkInterface;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getPlacementGroup}
         * @param placementGroup the value to be set.
         * @return {@code this}
         */
        public Builder placementGroup(java.lang.String placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getPrivateIp}
         * @param privateIp the value to be set.
         * @return {@code this}
         */
        public Builder privateIp(java.lang.String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getRootBlockDevice}
         * @param rootBlockDevice root_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rootBlockDevice(java.util.List<? extends imports.aws.SpotInstanceRequestRootBlockDevice> rootBlockDevice) {
            this.rootBlockDevice = (java.util.List<imports.aws.SpotInstanceRequestRootBlockDevice>)rootBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getSourceDestCheck}
         * @param sourceDestCheck the value to be set.
         * @return {@code this}
         */
        public Builder sourceDestCheck(java.lang.Boolean sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getSpotPrice}
         * @param spotPrice the value to be set.
         * @return {@code this}
         */
        public Builder spotPrice(java.lang.String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getSpotType}
         * @param spotType the value to be set.
         * @return {@code this}
         */
        public Builder spotType(java.lang.String spotType) {
            this.spotType = spotType;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getSubnetId}
         * @param subnetId the value to be set.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getTenancy}
         * @param tenancy the value to be set.
         * @return {@code this}
         */
        public Builder tenancy(java.lang.String tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.SpotInstanceRequestTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getUserData}
         * @param userData the value to be set.
         * @return {@code this}
         */
        public Builder userData(java.lang.String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getUserDataBase64}
         * @param userDataBase64 the value to be set.
         * @return {@code this}
         */
        public Builder userDataBase64(java.lang.String userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getValidFrom}
         * @param validFrom the value to be set.
         * @return {@code this}
         */
        public Builder validFrom(java.lang.String validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getValidUntil}
         * @param validUntil the value to be set.
         * @return {@code this}
         */
        public Builder validUntil(java.lang.String validUntil) {
            this.validUntil = validUntil;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getVolumeTags}
         * @param volumeTags the value to be set.
         * @return {@code this}
         */
        public Builder volumeTags(java.util.Map<java.lang.String, java.lang.String> volumeTags) {
            this.volumeTags = volumeTags;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getWaitForFulfillment}
         * @param waitForFulfillment the value to be set.
         * @return {@code this}
         */
        public Builder waitForFulfillment(java.lang.Boolean waitForFulfillment) {
            this.waitForFulfillment = waitForFulfillment;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getDependsOn}
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
         * Sets the value of {@link SpotInstanceRequestConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestConfig#getProvider}
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
         * @return a new instance of {@link SpotInstanceRequestConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotInstanceRequestConfig build() {
            return new Jsii$Proxy(ami, instanceType, associatePublicIpAddress, availabilityZone, blockDurationMinutes, cpuCoreCount, cpuThreadsPerCore, creditSpecification, disableApiTermination, ebsBlockDevice, ebsOptimized, ephemeralBlockDevice, fetchPasswordData, hibernation, hostId, iamInstanceProfile, instanceInitiatedShutdownBehavior, instanceInterruptionBehaviour, ipv6AddressCount, ipv6Addresses, keyName, launchGroup, metadataOptions, monitoring, networkInterface, placementGroup, privateIp, rootBlockDevice, securityGroups, sourceDestCheck, spotPrice, spotType, subnetId, tags, tenancy, timeouts, userData, userDataBase64, validFrom, validUntil, volumeTags, vpcSecurityGroupIds, waitForFulfillment, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SpotInstanceRequestConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotInstanceRequestConfig {
        private final java.lang.String ami;
        private final java.lang.String instanceType;
        private final java.lang.Boolean associatePublicIpAddress;
        private final java.lang.String availabilityZone;
        private final java.lang.Number blockDurationMinutes;
        private final java.lang.Number cpuCoreCount;
        private final java.lang.Number cpuThreadsPerCore;
        private final java.util.List<imports.aws.SpotInstanceRequestCreditSpecification> creditSpecification;
        private final java.lang.Boolean disableApiTermination;
        private final java.util.List<imports.aws.SpotInstanceRequestEbsBlockDevice> ebsBlockDevice;
        private final java.lang.Boolean ebsOptimized;
        private final java.util.List<imports.aws.SpotInstanceRequestEphemeralBlockDevice> ephemeralBlockDevice;
        private final java.lang.Boolean fetchPasswordData;
        private final java.lang.Boolean hibernation;
        private final java.lang.String hostId;
        private final java.lang.String iamInstanceProfile;
        private final java.lang.String instanceInitiatedShutdownBehavior;
        private final java.lang.String instanceInterruptionBehaviour;
        private final java.lang.Number ipv6AddressCount;
        private final java.util.List<java.lang.String> ipv6Addresses;
        private final java.lang.String keyName;
        private final java.lang.String launchGroup;
        private final java.util.List<imports.aws.SpotInstanceRequestMetadataOptions> metadataOptions;
        private final java.lang.Boolean monitoring;
        private final java.util.List<imports.aws.SpotInstanceRequestNetworkInterface> networkInterface;
        private final java.lang.String placementGroup;
        private final java.lang.String privateIp;
        private final java.util.List<imports.aws.SpotInstanceRequestRootBlockDevice> rootBlockDevice;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.lang.Boolean sourceDestCheck;
        private final java.lang.String spotPrice;
        private final java.lang.String spotType;
        private final java.lang.String subnetId;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String tenancy;
        private final imports.aws.SpotInstanceRequestTimeouts timeouts;
        private final java.lang.String userData;
        private final java.lang.String userDataBase64;
        private final java.lang.String validFrom;
        private final java.lang.String validUntil;
        private final java.util.Map<java.lang.String, java.lang.String> volumeTags;
        private final java.util.List<java.lang.String> vpcSecurityGroupIds;
        private final java.lang.Boolean waitForFulfillment;
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
            this.ami = software.amazon.jsii.Kernel.get(this, "ami", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.associatePublicIpAddress = software.amazon.jsii.Kernel.get(this, "associatePublicIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.blockDurationMinutes = software.amazon.jsii.Kernel.get(this, "blockDurationMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cpuCoreCount = software.amazon.jsii.Kernel.get(this, "cpuCoreCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cpuThreadsPerCore = software.amazon.jsii.Kernel.get(this, "cpuThreadsPerCore", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.creditSpecification = software.amazon.jsii.Kernel.get(this, "creditSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotInstanceRequestCreditSpecification.class)));
            this.disableApiTermination = software.amazon.jsii.Kernel.get(this, "disableApiTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotInstanceRequestEbsBlockDevice.class)));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotInstanceRequestEphemeralBlockDevice.class)));
            this.fetchPasswordData = software.amazon.jsii.Kernel.get(this, "fetchPasswordData", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hibernation = software.amazon.jsii.Kernel.get(this, "hibernation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hostId = software.amazon.jsii.Kernel.get(this, "hostId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamInstanceProfile = software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceInitiatedShutdownBehavior = software.amazon.jsii.Kernel.get(this, "instanceInitiatedShutdownBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceInterruptionBehaviour = software.amazon.jsii.Kernel.get(this, "instanceInterruptionBehaviour", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipv6AddressCount = software.amazon.jsii.Kernel.get(this, "ipv6AddressCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv6Addresses = software.amazon.jsii.Kernel.get(this, "ipv6Addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.keyName = software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchGroup = software.amazon.jsii.Kernel.get(this, "launchGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadataOptions = software.amazon.jsii.Kernel.get(this, "metadataOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotInstanceRequestMetadataOptions.class)));
            this.monitoring = software.amazon.jsii.Kernel.get(this, "monitoring", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.networkInterface = software.amazon.jsii.Kernel.get(this, "networkInterface", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotInstanceRequestNetworkInterface.class)));
            this.placementGroup = software.amazon.jsii.Kernel.get(this, "placementGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateIp = software.amazon.jsii.Kernel.get(this, "privateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootBlockDevice = software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotInstanceRequestRootBlockDevice.class)));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sourceDestCheck = software.amazon.jsii.Kernel.get(this, "sourceDestCheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.spotPrice = software.amazon.jsii.Kernel.get(this, "spotPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotType = software.amazon.jsii.Kernel.get(this, "spotType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tenancy = software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.SpotInstanceRequestTimeouts.class));
            this.userData = software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userDataBase64 = software.amazon.jsii.Kernel.get(this, "userDataBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.validFrom = software.amazon.jsii.Kernel.get(this, "validFrom", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.validUntil = software.amazon.jsii.Kernel.get(this, "validUntil", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeTags = software.amazon.jsii.Kernel.get(this, "volumeTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.waitForFulfillment = software.amazon.jsii.Kernel.get(this, "waitForFulfillment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String ami, final java.lang.String instanceType, final java.lang.Boolean associatePublicIpAddress, final java.lang.String availabilityZone, final java.lang.Number blockDurationMinutes, final java.lang.Number cpuCoreCount, final java.lang.Number cpuThreadsPerCore, final java.util.List<? extends imports.aws.SpotInstanceRequestCreditSpecification> creditSpecification, final java.lang.Boolean disableApiTermination, final java.util.List<? extends imports.aws.SpotInstanceRequestEbsBlockDevice> ebsBlockDevice, final java.lang.Boolean ebsOptimized, final java.util.List<? extends imports.aws.SpotInstanceRequestEphemeralBlockDevice> ephemeralBlockDevice, final java.lang.Boolean fetchPasswordData, final java.lang.Boolean hibernation, final java.lang.String hostId, final java.lang.String iamInstanceProfile, final java.lang.String instanceInitiatedShutdownBehavior, final java.lang.String instanceInterruptionBehaviour, final java.lang.Number ipv6AddressCount, final java.util.List<java.lang.String> ipv6Addresses, final java.lang.String keyName, final java.lang.String launchGroup, final java.util.List<? extends imports.aws.SpotInstanceRequestMetadataOptions> metadataOptions, final java.lang.Boolean monitoring, final java.util.List<? extends imports.aws.SpotInstanceRequestNetworkInterface> networkInterface, final java.lang.String placementGroup, final java.lang.String privateIp, final java.util.List<? extends imports.aws.SpotInstanceRequestRootBlockDevice> rootBlockDevice, final java.util.List<java.lang.String> securityGroups, final java.lang.Boolean sourceDestCheck, final java.lang.String spotPrice, final java.lang.String spotType, final java.lang.String subnetId, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String tenancy, final imports.aws.SpotInstanceRequestTimeouts timeouts, final java.lang.String userData, final java.lang.String userDataBase64, final java.lang.String validFrom, final java.lang.String validUntil, final java.util.Map<java.lang.String, java.lang.String> volumeTags, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.Boolean waitForFulfillment, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ami = java.util.Objects.requireNonNull(ami, "ami is required");
            this.instanceType = java.util.Objects.requireNonNull(instanceType, "instanceType is required");
            this.associatePublicIpAddress = associatePublicIpAddress;
            this.availabilityZone = availabilityZone;
            this.blockDurationMinutes = blockDurationMinutes;
            this.cpuCoreCount = cpuCoreCount;
            this.cpuThreadsPerCore = cpuThreadsPerCore;
            this.creditSpecification = (java.util.List<imports.aws.SpotInstanceRequestCreditSpecification>)creditSpecification;
            this.disableApiTermination = disableApiTermination;
            this.ebsBlockDevice = (java.util.List<imports.aws.SpotInstanceRequestEbsBlockDevice>)ebsBlockDevice;
            this.ebsOptimized = ebsOptimized;
            this.ephemeralBlockDevice = (java.util.List<imports.aws.SpotInstanceRequestEphemeralBlockDevice>)ephemeralBlockDevice;
            this.fetchPasswordData = fetchPasswordData;
            this.hibernation = hibernation;
            this.hostId = hostId;
            this.iamInstanceProfile = iamInstanceProfile;
            this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
            this.instanceInterruptionBehaviour = instanceInterruptionBehaviour;
            this.ipv6AddressCount = ipv6AddressCount;
            this.ipv6Addresses = ipv6Addresses;
            this.keyName = keyName;
            this.launchGroup = launchGroup;
            this.metadataOptions = (java.util.List<imports.aws.SpotInstanceRequestMetadataOptions>)metadataOptions;
            this.monitoring = monitoring;
            this.networkInterface = (java.util.List<imports.aws.SpotInstanceRequestNetworkInterface>)networkInterface;
            this.placementGroup = placementGroup;
            this.privateIp = privateIp;
            this.rootBlockDevice = (java.util.List<imports.aws.SpotInstanceRequestRootBlockDevice>)rootBlockDevice;
            this.securityGroups = securityGroups;
            this.sourceDestCheck = sourceDestCheck;
            this.spotPrice = spotPrice;
            this.spotType = spotType;
            this.subnetId = subnetId;
            this.tags = tags;
            this.tenancy = tenancy;
            this.timeouts = timeouts;
            this.userData = userData;
            this.userDataBase64 = userDataBase64;
            this.validFrom = validFrom;
            this.validUntil = validUntil;
            this.volumeTags = volumeTags;
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            this.waitForFulfillment = waitForFulfillment;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAmi() {
            return this.ami;
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
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.Number getBlockDurationMinutes() {
            return this.blockDurationMinutes;
        }

        @Override
        public final java.lang.Number getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        @Override
        public final java.lang.Number getCpuThreadsPerCore() {
            return this.cpuThreadsPerCore;
        }

        @Override
        public final java.util.List<imports.aws.SpotInstanceRequestCreditSpecification> getCreditSpecification() {
            return this.creditSpecification;
        }

        @Override
        public final java.lang.Boolean getDisableApiTermination() {
            return this.disableApiTermination;
        }

        @Override
        public final java.util.List<imports.aws.SpotInstanceRequestEbsBlockDevice> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.lang.Boolean getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.util.List<imports.aws.SpotInstanceRequestEphemeralBlockDevice> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.Boolean getFetchPasswordData() {
            return this.fetchPasswordData;
        }

        @Override
        public final java.lang.Boolean getHibernation() {
            return this.hibernation;
        }

        @Override
        public final java.lang.String getHostId() {
            return this.hostId;
        }

        @Override
        public final java.lang.String getIamInstanceProfile() {
            return this.iamInstanceProfile;
        }

        @Override
        public final java.lang.String getInstanceInitiatedShutdownBehavior() {
            return this.instanceInitiatedShutdownBehavior;
        }

        @Override
        public final java.lang.String getInstanceInterruptionBehaviour() {
            return this.instanceInterruptionBehaviour;
        }

        @Override
        public final java.lang.Number getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        @Override
        public final java.util.List<java.lang.String> getIpv6Addresses() {
            return this.ipv6Addresses;
        }

        @Override
        public final java.lang.String getKeyName() {
            return this.keyName;
        }

        @Override
        public final java.lang.String getLaunchGroup() {
            return this.launchGroup;
        }

        @Override
        public final java.util.List<imports.aws.SpotInstanceRequestMetadataOptions> getMetadataOptions() {
            return this.metadataOptions;
        }

        @Override
        public final java.lang.Boolean getMonitoring() {
            return this.monitoring;
        }

        @Override
        public final java.util.List<imports.aws.SpotInstanceRequestNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

        @Override
        public final java.lang.String getPlacementGroup() {
            return this.placementGroup;
        }

        @Override
        public final java.lang.String getPrivateIp() {
            return this.privateIp;
        }

        @Override
        public final java.util.List<imports.aws.SpotInstanceRequestRootBlockDevice> getRootBlockDevice() {
            return this.rootBlockDevice;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.lang.Boolean getSourceDestCheck() {
            return this.sourceDestCheck;
        }

        @Override
        public final java.lang.String getSpotPrice() {
            return this.spotPrice;
        }

        @Override
        public final java.lang.String getSpotType() {
            return this.spotType;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTenancy() {
            return this.tenancy;
        }

        @Override
        public final imports.aws.SpotInstanceRequestTimeouts getTimeouts() {
            return this.timeouts;
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
        public final java.lang.String getValidFrom() {
            return this.validFrom;
        }

        @Override
        public final java.lang.String getValidUntil() {
            return this.validUntil;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVolumeTags() {
            return this.volumeTags;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSecurityGroupIds() {
            return this.vpcSecurityGroupIds;
        }

        @Override
        public final java.lang.Boolean getWaitForFulfillment() {
            return this.waitForFulfillment;
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

            data.set("ami", om.valueToTree(this.getAmi()));
            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            if (this.getAssociatePublicIpAddress() != null) {
                data.set("associatePublicIpAddress", om.valueToTree(this.getAssociatePublicIpAddress()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getBlockDurationMinutes() != null) {
                data.set("blockDurationMinutes", om.valueToTree(this.getBlockDurationMinutes()));
            }
            if (this.getCpuCoreCount() != null) {
                data.set("cpuCoreCount", om.valueToTree(this.getCpuCoreCount()));
            }
            if (this.getCpuThreadsPerCore() != null) {
                data.set("cpuThreadsPerCore", om.valueToTree(this.getCpuThreadsPerCore()));
            }
            if (this.getCreditSpecification() != null) {
                data.set("creditSpecification", om.valueToTree(this.getCreditSpecification()));
            }
            if (this.getDisableApiTermination() != null) {
                data.set("disableApiTermination", om.valueToTree(this.getDisableApiTermination()));
            }
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getFetchPasswordData() != null) {
                data.set("fetchPasswordData", om.valueToTree(this.getFetchPasswordData()));
            }
            if (this.getHibernation() != null) {
                data.set("hibernation", om.valueToTree(this.getHibernation()));
            }
            if (this.getHostId() != null) {
                data.set("hostId", om.valueToTree(this.getHostId()));
            }
            if (this.getIamInstanceProfile() != null) {
                data.set("iamInstanceProfile", om.valueToTree(this.getIamInstanceProfile()));
            }
            if (this.getInstanceInitiatedShutdownBehavior() != null) {
                data.set("instanceInitiatedShutdownBehavior", om.valueToTree(this.getInstanceInitiatedShutdownBehavior()));
            }
            if (this.getInstanceInterruptionBehaviour() != null) {
                data.set("instanceInterruptionBehaviour", om.valueToTree(this.getInstanceInterruptionBehaviour()));
            }
            if (this.getIpv6AddressCount() != null) {
                data.set("ipv6AddressCount", om.valueToTree(this.getIpv6AddressCount()));
            }
            if (this.getIpv6Addresses() != null) {
                data.set("ipv6Addresses", om.valueToTree(this.getIpv6Addresses()));
            }
            if (this.getKeyName() != null) {
                data.set("keyName", om.valueToTree(this.getKeyName()));
            }
            if (this.getLaunchGroup() != null) {
                data.set("launchGroup", om.valueToTree(this.getLaunchGroup()));
            }
            if (this.getMetadataOptions() != null) {
                data.set("metadataOptions", om.valueToTree(this.getMetadataOptions()));
            }
            if (this.getMonitoring() != null) {
                data.set("monitoring", om.valueToTree(this.getMonitoring()));
            }
            if (this.getNetworkInterface() != null) {
                data.set("networkInterface", om.valueToTree(this.getNetworkInterface()));
            }
            if (this.getPlacementGroup() != null) {
                data.set("placementGroup", om.valueToTree(this.getPlacementGroup()));
            }
            if (this.getPrivateIp() != null) {
                data.set("privateIp", om.valueToTree(this.getPrivateIp()));
            }
            if (this.getRootBlockDevice() != null) {
                data.set("rootBlockDevice", om.valueToTree(this.getRootBlockDevice()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }
            if (this.getSourceDestCheck() != null) {
                data.set("sourceDestCheck", om.valueToTree(this.getSourceDestCheck()));
            }
            if (this.getSpotPrice() != null) {
                data.set("spotPrice", om.valueToTree(this.getSpotPrice()));
            }
            if (this.getSpotType() != null) {
                data.set("spotType", om.valueToTree(this.getSpotType()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTenancy() != null) {
                data.set("tenancy", om.valueToTree(this.getTenancy()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getUserData() != null) {
                data.set("userData", om.valueToTree(this.getUserData()));
            }
            if (this.getUserDataBase64() != null) {
                data.set("userDataBase64", om.valueToTree(this.getUserDataBase64()));
            }
            if (this.getValidFrom() != null) {
                data.set("validFrom", om.valueToTree(this.getValidFrom()));
            }
            if (this.getValidUntil() != null) {
                data.set("validUntil", om.valueToTree(this.getValidUntil()));
            }
            if (this.getVolumeTags() != null) {
                data.set("volumeTags", om.valueToTree(this.getVolumeTags()));
            }
            if (this.getVpcSecurityGroupIds() != null) {
                data.set("vpcSecurityGroupIds", om.valueToTree(this.getVpcSecurityGroupIds()));
            }
            if (this.getWaitForFulfillment() != null) {
                data.set("waitForFulfillment", om.valueToTree(this.getWaitForFulfillment()));
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
            struct.set("fqn", om.valueToTree("aws.SpotInstanceRequestConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotInstanceRequestConfig.Jsii$Proxy that = (SpotInstanceRequestConfig.Jsii$Proxy) o;

            if (!ami.equals(that.ami)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (this.associatePublicIpAddress != null ? !this.associatePublicIpAddress.equals(that.associatePublicIpAddress) : that.associatePublicIpAddress != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.blockDurationMinutes != null ? !this.blockDurationMinutes.equals(that.blockDurationMinutes) : that.blockDurationMinutes != null) return false;
            if (this.cpuCoreCount != null ? !this.cpuCoreCount.equals(that.cpuCoreCount) : that.cpuCoreCount != null) return false;
            if (this.cpuThreadsPerCore != null ? !this.cpuThreadsPerCore.equals(that.cpuThreadsPerCore) : that.cpuThreadsPerCore != null) return false;
            if (this.creditSpecification != null ? !this.creditSpecification.equals(that.creditSpecification) : that.creditSpecification != null) return false;
            if (this.disableApiTermination != null ? !this.disableApiTermination.equals(that.disableApiTermination) : that.disableApiTermination != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.fetchPasswordData != null ? !this.fetchPasswordData.equals(that.fetchPasswordData) : that.fetchPasswordData != null) return false;
            if (this.hibernation != null ? !this.hibernation.equals(that.hibernation) : that.hibernation != null) return false;
            if (this.hostId != null ? !this.hostId.equals(that.hostId) : that.hostId != null) return false;
            if (this.iamInstanceProfile != null ? !this.iamInstanceProfile.equals(that.iamInstanceProfile) : that.iamInstanceProfile != null) return false;
            if (this.instanceInitiatedShutdownBehavior != null ? !this.instanceInitiatedShutdownBehavior.equals(that.instanceInitiatedShutdownBehavior) : that.instanceInitiatedShutdownBehavior != null) return false;
            if (this.instanceInterruptionBehaviour != null ? !this.instanceInterruptionBehaviour.equals(that.instanceInterruptionBehaviour) : that.instanceInterruptionBehaviour != null) return false;
            if (this.ipv6AddressCount != null ? !this.ipv6AddressCount.equals(that.ipv6AddressCount) : that.ipv6AddressCount != null) return false;
            if (this.ipv6Addresses != null ? !this.ipv6Addresses.equals(that.ipv6Addresses) : that.ipv6Addresses != null) return false;
            if (this.keyName != null ? !this.keyName.equals(that.keyName) : that.keyName != null) return false;
            if (this.launchGroup != null ? !this.launchGroup.equals(that.launchGroup) : that.launchGroup != null) return false;
            if (this.metadataOptions != null ? !this.metadataOptions.equals(that.metadataOptions) : that.metadataOptions != null) return false;
            if (this.monitoring != null ? !this.monitoring.equals(that.monitoring) : that.monitoring != null) return false;
            if (this.networkInterface != null ? !this.networkInterface.equals(that.networkInterface) : that.networkInterface != null) return false;
            if (this.placementGroup != null ? !this.placementGroup.equals(that.placementGroup) : that.placementGroup != null) return false;
            if (this.privateIp != null ? !this.privateIp.equals(that.privateIp) : that.privateIp != null) return false;
            if (this.rootBlockDevice != null ? !this.rootBlockDevice.equals(that.rootBlockDevice) : that.rootBlockDevice != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            if (this.sourceDestCheck != null ? !this.sourceDestCheck.equals(that.sourceDestCheck) : that.sourceDestCheck != null) return false;
            if (this.spotPrice != null ? !this.spotPrice.equals(that.spotPrice) : that.spotPrice != null) return false;
            if (this.spotType != null ? !this.spotType.equals(that.spotType) : that.spotType != null) return false;
            if (this.subnetId != null ? !this.subnetId.equals(that.subnetId) : that.subnetId != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tenancy != null ? !this.tenancy.equals(that.tenancy) : that.tenancy != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.userData != null ? !this.userData.equals(that.userData) : that.userData != null) return false;
            if (this.userDataBase64 != null ? !this.userDataBase64.equals(that.userDataBase64) : that.userDataBase64 != null) return false;
            if (this.validFrom != null ? !this.validFrom.equals(that.validFrom) : that.validFrom != null) return false;
            if (this.validUntil != null ? !this.validUntil.equals(that.validUntil) : that.validUntil != null) return false;
            if (this.volumeTags != null ? !this.volumeTags.equals(that.volumeTags) : that.volumeTags != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            if (this.waitForFulfillment != null ? !this.waitForFulfillment.equals(that.waitForFulfillment) : that.waitForFulfillment != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ami.hashCode();
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.associatePublicIpAddress != null ? this.associatePublicIpAddress.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.blockDurationMinutes != null ? this.blockDurationMinutes.hashCode() : 0);
            result = 31 * result + (this.cpuCoreCount != null ? this.cpuCoreCount.hashCode() : 0);
            result = 31 * result + (this.cpuThreadsPerCore != null ? this.cpuThreadsPerCore.hashCode() : 0);
            result = 31 * result + (this.creditSpecification != null ? this.creditSpecification.hashCode() : 0);
            result = 31 * result + (this.disableApiTermination != null ? this.disableApiTermination.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.fetchPasswordData != null ? this.fetchPasswordData.hashCode() : 0);
            result = 31 * result + (this.hibernation != null ? this.hibernation.hashCode() : 0);
            result = 31 * result + (this.hostId != null ? this.hostId.hashCode() : 0);
            result = 31 * result + (this.iamInstanceProfile != null ? this.iamInstanceProfile.hashCode() : 0);
            result = 31 * result + (this.instanceInitiatedShutdownBehavior != null ? this.instanceInitiatedShutdownBehavior.hashCode() : 0);
            result = 31 * result + (this.instanceInterruptionBehaviour != null ? this.instanceInterruptionBehaviour.hashCode() : 0);
            result = 31 * result + (this.ipv6AddressCount != null ? this.ipv6AddressCount.hashCode() : 0);
            result = 31 * result + (this.ipv6Addresses != null ? this.ipv6Addresses.hashCode() : 0);
            result = 31 * result + (this.keyName != null ? this.keyName.hashCode() : 0);
            result = 31 * result + (this.launchGroup != null ? this.launchGroup.hashCode() : 0);
            result = 31 * result + (this.metadataOptions != null ? this.metadataOptions.hashCode() : 0);
            result = 31 * result + (this.monitoring != null ? this.monitoring.hashCode() : 0);
            result = 31 * result + (this.networkInterface != null ? this.networkInterface.hashCode() : 0);
            result = 31 * result + (this.placementGroup != null ? this.placementGroup.hashCode() : 0);
            result = 31 * result + (this.privateIp != null ? this.privateIp.hashCode() : 0);
            result = 31 * result + (this.rootBlockDevice != null ? this.rootBlockDevice.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.sourceDestCheck != null ? this.sourceDestCheck.hashCode() : 0);
            result = 31 * result + (this.spotPrice != null ? this.spotPrice.hashCode() : 0);
            result = 31 * result + (this.spotType != null ? this.spotType.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tenancy != null ? this.tenancy.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.userData != null ? this.userData.hashCode() : 0);
            result = 31 * result + (this.userDataBase64 != null ? this.userDataBase64.hashCode() : 0);
            result = 31 * result + (this.validFrom != null ? this.validFrom.hashCode() : 0);
            result = 31 * result + (this.validUntil != null ? this.validUntil.hashCode() : 0);
            result = 31 * result + (this.volumeTags != null ? this.volumeTags.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.waitForFulfillment != null ? this.waitForFulfillment.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
