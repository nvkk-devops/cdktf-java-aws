package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.104Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BatchComputeEnvironmentComputeResources")
@software.amazon.jsii.Jsii.Proxy(BatchComputeEnvironmentComputeResources.Jsii$Proxy.class)
public interface BatchComputeEnvironmentComputeResources extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceRole();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getInstanceType();

    @org.jetbrains.annotations.NotNull java.lang.Number getMaxVcpus();

    @org.jetbrains.annotations.NotNull java.lang.Number getMinVcpus();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroupIds();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnets();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.String getAllocationStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBidPercentage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDesiredVcpus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEc2KeyPair() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getImageId() {
        return null;
    }

    /**
     * launch_template block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate> getLaunchTemplate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotIamFleetRole() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BatchComputeEnvironmentComputeResources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BatchComputeEnvironmentComputeResources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BatchComputeEnvironmentComputeResources> {
        private java.lang.String instanceRole;
        private java.util.List<java.lang.String> instanceType;
        private java.lang.Number maxVcpus;
        private java.lang.Number minVcpus;
        private java.util.List<java.lang.String> securityGroupIds;
        private java.util.List<java.lang.String> subnets;
        private java.lang.String type;
        private java.lang.String allocationStrategy;
        private java.lang.Number bidPercentage;
        private java.lang.Number desiredVcpus;
        private java.lang.String ec2KeyPair;
        private java.lang.String imageId;
        private java.util.List<imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate> launchTemplate;
        private java.lang.String spotIamFleetRole;
        private java.util.Map<java.lang.String, java.lang.String> tags;

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getInstanceRole}
         * @param instanceRole the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceRole(java.lang.String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getInstanceType}
         * @param instanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.util.List<java.lang.String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getMaxVcpus}
         * @param maxVcpus the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder maxVcpus(java.lang.Number maxVcpus) {
            this.maxVcpus = maxVcpus;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getMinVcpus}
         * @param minVcpus the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder minVcpus(java.lang.Number minVcpus) {
            this.minVcpus = minVcpus;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getSecurityGroupIds}
         * @param securityGroupIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder securityGroupIds(java.util.List<java.lang.String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getSubnets}
         * @param subnets the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnets(java.util.List<java.lang.String> subnets) {
            this.subnets = subnets;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getAllocationStrategy}
         * @param allocationStrategy the value to be set.
         * @return {@code this}
         */
        public Builder allocationStrategy(java.lang.String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getBidPercentage}
         * @param bidPercentage the value to be set.
         * @return {@code this}
         */
        public Builder bidPercentage(java.lang.Number bidPercentage) {
            this.bidPercentage = bidPercentage;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getDesiredVcpus}
         * @param desiredVcpus the value to be set.
         * @return {@code this}
         */
        public Builder desiredVcpus(java.lang.Number desiredVcpus) {
            this.desiredVcpus = desiredVcpus;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getEc2KeyPair}
         * @param ec2KeyPair the value to be set.
         * @return {@code this}
         */
        public Builder ec2KeyPair(java.lang.String ec2KeyPair) {
            this.ec2KeyPair = ec2KeyPair;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getImageId}
         * @param imageId the value to be set.
         * @return {@code this}
         */
        public Builder imageId(java.lang.String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getLaunchTemplate}
         * @param launchTemplate launch_template block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder launchTemplate(java.util.List<? extends imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate> launchTemplate) {
            this.launchTemplate = (java.util.List<imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate>)launchTemplate;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getSpotIamFleetRole}
         * @param spotIamFleetRole the value to be set.
         * @return {@code this}
         */
        public Builder spotIamFleetRole(java.lang.String spotIamFleetRole) {
            this.spotIamFleetRole = spotIamFleetRole;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentComputeResources#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BatchComputeEnvironmentComputeResources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BatchComputeEnvironmentComputeResources build() {
            return new Jsii$Proxy(instanceRole, instanceType, maxVcpus, minVcpus, securityGroupIds, subnets, type, allocationStrategy, bidPercentage, desiredVcpus, ec2KeyPair, imageId, launchTemplate, spotIamFleetRole, tags);
        }
    }

    /**
     * An implementation for {@link BatchComputeEnvironmentComputeResources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BatchComputeEnvironmentComputeResources {
        private final java.lang.String instanceRole;
        private final java.util.List<java.lang.String> instanceType;
        private final java.lang.Number maxVcpus;
        private final java.lang.Number minVcpus;
        private final java.util.List<java.lang.String> securityGroupIds;
        private final java.util.List<java.lang.String> subnets;
        private final java.lang.String type;
        private final java.lang.String allocationStrategy;
        private final java.lang.Number bidPercentage;
        private final java.lang.Number desiredVcpus;
        private final java.lang.String ec2KeyPair;
        private final java.lang.String imageId;
        private final java.util.List<imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate> launchTemplate;
        private final java.lang.String spotIamFleetRole;
        private final java.util.Map<java.lang.String, java.lang.String> tags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.instanceRole = software.amazon.jsii.Kernel.get(this, "instanceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.maxVcpus = software.amazon.jsii.Kernel.get(this, "maxVcpus", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minVcpus = software.amazon.jsii.Kernel.get(this, "minVcpus", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.securityGroupIds = software.amazon.jsii.Kernel.get(this, "securityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.subnets = software.amazon.jsii.Kernel.get(this, "subnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allocationStrategy = software.amazon.jsii.Kernel.get(this, "allocationStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bidPercentage = software.amazon.jsii.Kernel.get(this, "bidPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.desiredVcpus = software.amazon.jsii.Kernel.get(this, "desiredVcpus", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ec2KeyPair = software.amazon.jsii.Kernel.get(this, "ec2KeyPair", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.imageId = software.amazon.jsii.Kernel.get(this, "imageId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchTemplate = software.amazon.jsii.Kernel.get(this, "launchTemplate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate.class)));
            this.spotIamFleetRole = software.amazon.jsii.Kernel.get(this, "spotIamFleetRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String instanceRole, final java.util.List<java.lang.String> instanceType, final java.lang.Number maxVcpus, final java.lang.Number minVcpus, final java.util.List<java.lang.String> securityGroupIds, final java.util.List<java.lang.String> subnets, final java.lang.String type, final java.lang.String allocationStrategy, final java.lang.Number bidPercentage, final java.lang.Number desiredVcpus, final java.lang.String ec2KeyPair, final java.lang.String imageId, final java.util.List<? extends imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate> launchTemplate, final java.lang.String spotIamFleetRole, final java.util.Map<java.lang.String, java.lang.String> tags) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instanceRole = java.util.Objects.requireNonNull(instanceRole, "instanceRole is required");
            this.instanceType = java.util.Objects.requireNonNull(instanceType, "instanceType is required");
            this.maxVcpus = java.util.Objects.requireNonNull(maxVcpus, "maxVcpus is required");
            this.minVcpus = java.util.Objects.requireNonNull(minVcpus, "minVcpus is required");
            this.securityGroupIds = java.util.Objects.requireNonNull(securityGroupIds, "securityGroupIds is required");
            this.subnets = java.util.Objects.requireNonNull(subnets, "subnets is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.allocationStrategy = allocationStrategy;
            this.bidPercentage = bidPercentage;
            this.desiredVcpus = desiredVcpus;
            this.ec2KeyPair = ec2KeyPair;
            this.imageId = imageId;
            this.launchTemplate = (java.util.List<imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate>)launchTemplate;
            this.spotIamFleetRole = spotIamFleetRole;
            this.tags = tags;
        }

        @Override
        public final java.lang.String getInstanceRole() {
            return this.instanceRole;
        }

        @Override
        public final java.util.List<java.lang.String> getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.Number getMaxVcpus() {
            return this.maxVcpus;
        }

        @Override
        public final java.lang.Number getMinVcpus() {
            return this.minVcpus;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnets() {
            return this.subnets;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        @Override
        public final java.lang.Number getBidPercentage() {
            return this.bidPercentage;
        }

        @Override
        public final java.lang.Number getDesiredVcpus() {
            return this.desiredVcpus;
        }

        @Override
        public final java.lang.String getEc2KeyPair() {
            return this.ec2KeyPair;
        }

        @Override
        public final java.lang.String getImageId() {
            return this.imageId;
        }

        @Override
        public final java.util.List<imports.aws.BatchComputeEnvironmentComputeResourcesLaunchTemplate> getLaunchTemplate() {
            return this.launchTemplate;
        }

        @Override
        public final java.lang.String getSpotIamFleetRole() {
            return this.spotIamFleetRole;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("instanceRole", om.valueToTree(this.getInstanceRole()));
            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            data.set("maxVcpus", om.valueToTree(this.getMaxVcpus()));
            data.set("minVcpus", om.valueToTree(this.getMinVcpus()));
            data.set("securityGroupIds", om.valueToTree(this.getSecurityGroupIds()));
            data.set("subnets", om.valueToTree(this.getSubnets()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getAllocationStrategy() != null) {
                data.set("allocationStrategy", om.valueToTree(this.getAllocationStrategy()));
            }
            if (this.getBidPercentage() != null) {
                data.set("bidPercentage", om.valueToTree(this.getBidPercentage()));
            }
            if (this.getDesiredVcpus() != null) {
                data.set("desiredVcpus", om.valueToTree(this.getDesiredVcpus()));
            }
            if (this.getEc2KeyPair() != null) {
                data.set("ec2KeyPair", om.valueToTree(this.getEc2KeyPair()));
            }
            if (this.getImageId() != null) {
                data.set("imageId", om.valueToTree(this.getImageId()));
            }
            if (this.getLaunchTemplate() != null) {
                data.set("launchTemplate", om.valueToTree(this.getLaunchTemplate()));
            }
            if (this.getSpotIamFleetRole() != null) {
                data.set("spotIamFleetRole", om.valueToTree(this.getSpotIamFleetRole()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.BatchComputeEnvironmentComputeResources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BatchComputeEnvironmentComputeResources.Jsii$Proxy that = (BatchComputeEnvironmentComputeResources.Jsii$Proxy) o;

            if (!instanceRole.equals(that.instanceRole)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (!maxVcpus.equals(that.maxVcpus)) return false;
            if (!minVcpus.equals(that.minVcpus)) return false;
            if (!securityGroupIds.equals(that.securityGroupIds)) return false;
            if (!subnets.equals(that.subnets)) return false;
            if (!type.equals(that.type)) return false;
            if (this.allocationStrategy != null ? !this.allocationStrategy.equals(that.allocationStrategy) : that.allocationStrategy != null) return false;
            if (this.bidPercentage != null ? !this.bidPercentage.equals(that.bidPercentage) : that.bidPercentage != null) return false;
            if (this.desiredVcpus != null ? !this.desiredVcpus.equals(that.desiredVcpus) : that.desiredVcpus != null) return false;
            if (this.ec2KeyPair != null ? !this.ec2KeyPair.equals(that.ec2KeyPair) : that.ec2KeyPair != null) return false;
            if (this.imageId != null ? !this.imageId.equals(that.imageId) : that.imageId != null) return false;
            if (this.launchTemplate != null ? !this.launchTemplate.equals(that.launchTemplate) : that.launchTemplate != null) return false;
            if (this.spotIamFleetRole != null ? !this.spotIamFleetRole.equals(that.spotIamFleetRole) : that.spotIamFleetRole != null) return false;
            return this.tags != null ? this.tags.equals(that.tags) : that.tags == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instanceRole.hashCode();
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.maxVcpus.hashCode());
            result = 31 * result + (this.minVcpus.hashCode());
            result = 31 * result + (this.securityGroupIds.hashCode());
            result = 31 * result + (this.subnets.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.allocationStrategy != null ? this.allocationStrategy.hashCode() : 0);
            result = 31 * result + (this.bidPercentage != null ? this.bidPercentage.hashCode() : 0);
            result = 31 * result + (this.desiredVcpus != null ? this.desiredVcpus.hashCode() : 0);
            result = 31 * result + (this.ec2KeyPair != null ? this.ec2KeyPair.hashCode() : 0);
            result = 31 * result + (this.imageId != null ? this.imageId.hashCode() : 0);
            result = 31 * result + (this.launchTemplate != null ? this.launchTemplate.hashCode() : 0);
            result = 31 * result + (this.spotIamFleetRole != null ? this.spotIamFleetRole.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            return result;
        }
    }
}
