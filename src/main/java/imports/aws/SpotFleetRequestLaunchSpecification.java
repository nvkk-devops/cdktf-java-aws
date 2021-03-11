package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.883Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotFleetRequestLaunchSpecification")
@software.amazon.jsii.Jsii.Proxy(SpotFleetRequestLaunchSpecification.Jsii$Proxy.class)
public interface SpotFleetRequestLaunchSpecification extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAmi();

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAssociatePublicIpAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    /**
     * ebs_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice> getEbsBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimized() {
        return null;
    }

    /**
     * ephemeral_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> getEphemeralBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIamInstanceProfile() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIamInstanceProfileArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKeyName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMonitoring() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlacementGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlacementTenancy() {
        return null;
    }

    /**
     * root_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice> getRootBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotPrice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserData() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWeightedCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotFleetRequestLaunchSpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotFleetRequestLaunchSpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotFleetRequestLaunchSpecification> {
        private java.lang.String ami;
        private java.lang.String instanceType;
        private java.lang.Boolean associatePublicIpAddress;
        private java.lang.String availabilityZone;
        private java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevice;
        private java.lang.Boolean ebsOptimized;
        private java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevice;
        private java.lang.String iamInstanceProfile;
        private java.lang.String iamInstanceProfileArn;
        private java.lang.String keyName;
        private java.lang.Boolean monitoring;
        private java.lang.String placementGroup;
        private java.lang.String placementTenancy;
        private java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevice;
        private java.lang.String spotPrice;
        private java.lang.String subnetId;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String userData;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.String weightedCapacity;

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getAmi}
         * @param ami the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ami(java.lang.String ami) {
            this.ami = ami;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getInstanceType}
         * @param instanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getAssociatePublicIpAddress}
         * @param associatePublicIpAddress the value to be set.
         * @return {@code this}
         */
        public Builder associatePublicIpAddress(java.lang.Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getEbsBlockDevice}
         * @param ebsBlockDevice ebs_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getEbsOptimized}
         * @param ebsOptimized the value to be set.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice ephemeral_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getIamInstanceProfile}
         * @param iamInstanceProfile the value to be set.
         * @return {@code this}
         */
        public Builder iamInstanceProfile(java.lang.String iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getIamInstanceProfileArn}
         * @param iamInstanceProfileArn the value to be set.
         * @return {@code this}
         */
        public Builder iamInstanceProfileArn(java.lang.String iamInstanceProfileArn) {
            this.iamInstanceProfileArn = iamInstanceProfileArn;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getKeyName}
         * @param keyName the value to be set.
         * @return {@code this}
         */
        public Builder keyName(java.lang.String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getMonitoring}
         * @param monitoring the value to be set.
         * @return {@code this}
         */
        public Builder monitoring(java.lang.Boolean monitoring) {
            this.monitoring = monitoring;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getPlacementGroup}
         * @param placementGroup the value to be set.
         * @return {@code this}
         */
        public Builder placementGroup(java.lang.String placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getPlacementTenancy}
         * @param placementTenancy the value to be set.
         * @return {@code this}
         */
        public Builder placementTenancy(java.lang.String placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getRootBlockDevice}
         * @param rootBlockDevice root_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rootBlockDevice(java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevice) {
            this.rootBlockDevice = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice>)rootBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getSpotPrice}
         * @param spotPrice the value to be set.
         * @return {@code this}
         */
        public Builder spotPrice(java.lang.String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getSubnetId}
         * @param subnetId the value to be set.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getUserData}
         * @param userData the value to be set.
         * @return {@code this}
         */
        public Builder userData(java.lang.String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecification#getWeightedCapacity}
         * @param weightedCapacity the value to be set.
         * @return {@code this}
         */
        public Builder weightedCapacity(java.lang.String weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SpotFleetRequestLaunchSpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotFleetRequestLaunchSpecification build() {
            return new Jsii$Proxy(ami, instanceType, associatePublicIpAddress, availabilityZone, ebsBlockDevice, ebsOptimized, ephemeralBlockDevice, iamInstanceProfile, iamInstanceProfileArn, keyName, monitoring, placementGroup, placementTenancy, rootBlockDevice, spotPrice, subnetId, tags, userData, vpcSecurityGroupIds, weightedCapacity);
        }
    }

    /**
     * An implementation for {@link SpotFleetRequestLaunchSpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotFleetRequestLaunchSpecification {
        private final java.lang.String ami;
        private final java.lang.String instanceType;
        private final java.lang.Boolean associatePublicIpAddress;
        private final java.lang.String availabilityZone;
        private final java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevice;
        private final java.lang.Boolean ebsOptimized;
        private final java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevice;
        private final java.lang.String iamInstanceProfile;
        private final java.lang.String iamInstanceProfileArn;
        private final java.lang.String keyName;
        private final java.lang.Boolean monitoring;
        private final java.lang.String placementGroup;
        private final java.lang.String placementTenancy;
        private final java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevice;
        private final java.lang.String spotPrice;
        private final java.lang.String subnetId;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String userData;
        private final java.util.List<java.lang.String> vpcSecurityGroupIds;
        private final java.lang.String weightedCapacity;

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
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice.class)));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice.class)));
            this.iamInstanceProfile = software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamInstanceProfileArn = software.amazon.jsii.Kernel.get(this, "iamInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyName = software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.monitoring = software.amazon.jsii.Kernel.get(this, "monitoring", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.placementGroup = software.amazon.jsii.Kernel.get(this, "placementGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.placementTenancy = software.amazon.jsii.Kernel.get(this, "placementTenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootBlockDevice = software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice.class)));
            this.spotPrice = software.amazon.jsii.Kernel.get(this, "spotPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.userData = software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.weightedCapacity = software.amazon.jsii.Kernel.get(this, "weightedCapacity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String ami, final java.lang.String instanceType, final java.lang.Boolean associatePublicIpAddress, final java.lang.String availabilityZone, final java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevice, final java.lang.Boolean ebsOptimized, final java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevice, final java.lang.String iamInstanceProfile, final java.lang.String iamInstanceProfileArn, final java.lang.String keyName, final java.lang.Boolean monitoring, final java.lang.String placementGroup, final java.lang.String placementTenancy, final java.util.List<? extends imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevice, final java.lang.String spotPrice, final java.lang.String subnetId, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String userData, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.String weightedCapacity) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ami = java.util.Objects.requireNonNull(ami, "ami is required");
            this.instanceType = java.util.Objects.requireNonNull(instanceType, "instanceType is required");
            this.associatePublicIpAddress = associatePublicIpAddress;
            this.availabilityZone = availabilityZone;
            this.ebsBlockDevice = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice>)ebsBlockDevice;
            this.ebsOptimized = ebsOptimized;
            this.ephemeralBlockDevice = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice>)ephemeralBlockDevice;
            this.iamInstanceProfile = iamInstanceProfile;
            this.iamInstanceProfileArn = iamInstanceProfileArn;
            this.keyName = keyName;
            this.monitoring = monitoring;
            this.placementGroup = placementGroup;
            this.placementTenancy = placementTenancy;
            this.rootBlockDevice = (java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice>)rootBlockDevice;
            this.spotPrice = spotPrice;
            this.subnetId = subnetId;
            this.tags = tags;
            this.userData = userData;
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            this.weightedCapacity = weightedCapacity;
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
        public final java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.lang.Boolean getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.String getIamInstanceProfile() {
            return this.iamInstanceProfile;
        }

        @Override
        public final java.lang.String getIamInstanceProfileArn() {
            return this.iamInstanceProfileArn;
        }

        @Override
        public final java.lang.String getKeyName() {
            return this.keyName;
        }

        @Override
        public final java.lang.Boolean getMonitoring() {
            return this.monitoring;
        }

        @Override
        public final java.lang.String getPlacementGroup() {
            return this.placementGroup;
        }

        @Override
        public final java.lang.String getPlacementTenancy() {
            return this.placementTenancy;
        }

        @Override
        public final java.util.List<imports.aws.SpotFleetRequestLaunchSpecificationRootBlockDevice> getRootBlockDevice() {
            return this.rootBlockDevice;
        }

        @Override
        public final java.lang.String getSpotPrice() {
            return this.spotPrice;
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
        public final java.lang.String getUserData() {
            return this.userData;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSecurityGroupIds() {
            return this.vpcSecurityGroupIds;
        }

        @Override
        public final java.lang.String getWeightedCapacity() {
            return this.weightedCapacity;
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
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getIamInstanceProfile() != null) {
                data.set("iamInstanceProfile", om.valueToTree(this.getIamInstanceProfile()));
            }
            if (this.getIamInstanceProfileArn() != null) {
                data.set("iamInstanceProfileArn", om.valueToTree(this.getIamInstanceProfileArn()));
            }
            if (this.getKeyName() != null) {
                data.set("keyName", om.valueToTree(this.getKeyName()));
            }
            if (this.getMonitoring() != null) {
                data.set("monitoring", om.valueToTree(this.getMonitoring()));
            }
            if (this.getPlacementGroup() != null) {
                data.set("placementGroup", om.valueToTree(this.getPlacementGroup()));
            }
            if (this.getPlacementTenancy() != null) {
                data.set("placementTenancy", om.valueToTree(this.getPlacementTenancy()));
            }
            if (this.getRootBlockDevice() != null) {
                data.set("rootBlockDevice", om.valueToTree(this.getRootBlockDevice()));
            }
            if (this.getSpotPrice() != null) {
                data.set("spotPrice", om.valueToTree(this.getSpotPrice()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUserData() != null) {
                data.set("userData", om.valueToTree(this.getUserData()));
            }
            if (this.getVpcSecurityGroupIds() != null) {
                data.set("vpcSecurityGroupIds", om.valueToTree(this.getVpcSecurityGroupIds()));
            }
            if (this.getWeightedCapacity() != null) {
                data.set("weightedCapacity", om.valueToTree(this.getWeightedCapacity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SpotFleetRequestLaunchSpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotFleetRequestLaunchSpecification.Jsii$Proxy that = (SpotFleetRequestLaunchSpecification.Jsii$Proxy) o;

            if (!ami.equals(that.ami)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (this.associatePublicIpAddress != null ? !this.associatePublicIpAddress.equals(that.associatePublicIpAddress) : that.associatePublicIpAddress != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.iamInstanceProfile != null ? !this.iamInstanceProfile.equals(that.iamInstanceProfile) : that.iamInstanceProfile != null) return false;
            if (this.iamInstanceProfileArn != null ? !this.iamInstanceProfileArn.equals(that.iamInstanceProfileArn) : that.iamInstanceProfileArn != null) return false;
            if (this.keyName != null ? !this.keyName.equals(that.keyName) : that.keyName != null) return false;
            if (this.monitoring != null ? !this.monitoring.equals(that.monitoring) : that.monitoring != null) return false;
            if (this.placementGroup != null ? !this.placementGroup.equals(that.placementGroup) : that.placementGroup != null) return false;
            if (this.placementTenancy != null ? !this.placementTenancy.equals(that.placementTenancy) : that.placementTenancy != null) return false;
            if (this.rootBlockDevice != null ? !this.rootBlockDevice.equals(that.rootBlockDevice) : that.rootBlockDevice != null) return false;
            if (this.spotPrice != null ? !this.spotPrice.equals(that.spotPrice) : that.spotPrice != null) return false;
            if (this.subnetId != null ? !this.subnetId.equals(that.subnetId) : that.subnetId != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.userData != null ? !this.userData.equals(that.userData) : that.userData != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            return this.weightedCapacity != null ? this.weightedCapacity.equals(that.weightedCapacity) : that.weightedCapacity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ami.hashCode();
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.associatePublicIpAddress != null ? this.associatePublicIpAddress.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.iamInstanceProfile != null ? this.iamInstanceProfile.hashCode() : 0);
            result = 31 * result + (this.iamInstanceProfileArn != null ? this.iamInstanceProfileArn.hashCode() : 0);
            result = 31 * result + (this.keyName != null ? this.keyName.hashCode() : 0);
            result = 31 * result + (this.monitoring != null ? this.monitoring.hashCode() : 0);
            result = 31 * result + (this.placementGroup != null ? this.placementGroup.hashCode() : 0);
            result = 31 * result + (this.placementTenancy != null ? this.placementTenancy.hashCode() : 0);
            result = 31 * result + (this.rootBlockDevice != null ? this.rootBlockDevice.hashCode() : 0);
            result = 31 * result + (this.spotPrice != null ? this.spotPrice.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.userData != null ? this.userData.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.weightedCapacity != null ? this.weightedCapacity.hashCode() : 0);
            return result;
        }
    }
}
