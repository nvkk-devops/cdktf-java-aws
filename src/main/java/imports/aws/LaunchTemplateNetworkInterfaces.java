package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.693Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateNetworkInterfaces")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateNetworkInterfaces.Jsii$Proxy.class)
public interface LaunchTemplateNetworkInterfaces extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAssociatePublicIpAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteOnTermination() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDeviceIndex() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIpv4AddressCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpv4Addresses() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIpv6AddressCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpv6Addresses() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNetworkInterfaceId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateIpAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateNetworkInterfaces}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateNetworkInterfaces}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateNetworkInterfaces> {
        private java.lang.String associatePublicIpAddress;
        private java.lang.Boolean deleteOnTermination;
        private java.lang.String description;
        private java.lang.Number deviceIndex;
        private java.lang.Number ipv4AddressCount;
        private java.util.List<java.lang.String> ipv4Addresses;
        private java.lang.Number ipv6AddressCount;
        private java.util.List<java.lang.String> ipv6Addresses;
        private java.lang.String networkInterfaceId;
        private java.lang.String privateIpAddress;
        private java.util.List<java.lang.String> securityGroups;
        private java.lang.String subnetId;

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getAssociatePublicIpAddress}
         * @param associatePublicIpAddress the value to be set.
         * @return {@code this}
         */
        public Builder associatePublicIpAddress(java.lang.String associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getDeleteOnTermination}
         * @param deleteOnTermination the value to be set.
         * @return {@code this}
         */
        public Builder deleteOnTermination(java.lang.Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getDeviceIndex}
         * @param deviceIndex the value to be set.
         * @return {@code this}
         */
        public Builder deviceIndex(java.lang.Number deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getIpv4AddressCount}
         * @param ipv4AddressCount the value to be set.
         * @return {@code this}
         */
        public Builder ipv4AddressCount(java.lang.Number ipv4AddressCount) {
            this.ipv4AddressCount = ipv4AddressCount;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getIpv4Addresses}
         * @param ipv4Addresses the value to be set.
         * @return {@code this}
         */
        public Builder ipv4Addresses(java.util.List<java.lang.String> ipv4Addresses) {
            this.ipv4Addresses = ipv4Addresses;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getIpv6AddressCount}
         * @param ipv6AddressCount the value to be set.
         * @return {@code this}
         */
        public Builder ipv6AddressCount(java.lang.Number ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getIpv6Addresses}
         * @param ipv6Addresses the value to be set.
         * @return {@code this}
         */
        public Builder ipv6Addresses(java.util.List<java.lang.String> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getNetworkInterfaceId}
         * @param networkInterfaceId the value to be set.
         * @return {@code this}
         */
        public Builder networkInterfaceId(java.lang.String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getPrivateIpAddress}
         * @param privateIpAddress the value to be set.
         * @return {@code this}
         */
        public Builder privateIpAddress(java.lang.String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateNetworkInterfaces#getSubnetId}
         * @param subnetId the value to be set.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateNetworkInterfaces}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateNetworkInterfaces build() {
            return new Jsii$Proxy(associatePublicIpAddress, deleteOnTermination, description, deviceIndex, ipv4AddressCount, ipv4Addresses, ipv6AddressCount, ipv6Addresses, networkInterfaceId, privateIpAddress, securityGroups, subnetId);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateNetworkInterfaces}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateNetworkInterfaces {
        private final java.lang.String associatePublicIpAddress;
        private final java.lang.Boolean deleteOnTermination;
        private final java.lang.String description;
        private final java.lang.Number deviceIndex;
        private final java.lang.Number ipv4AddressCount;
        private final java.util.List<java.lang.String> ipv4Addresses;
        private final java.lang.Number ipv6AddressCount;
        private final java.util.List<java.lang.String> ipv6Addresses;
        private final java.lang.String networkInterfaceId;
        private final java.lang.String privateIpAddress;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.lang.String subnetId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.associatePublicIpAddress = software.amazon.jsii.Kernel.get(this, "associatePublicIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deleteOnTermination = software.amazon.jsii.Kernel.get(this, "deleteOnTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deviceIndex = software.amazon.jsii.Kernel.get(this, "deviceIndex", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv4AddressCount = software.amazon.jsii.Kernel.get(this, "ipv4AddressCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv4Addresses = software.amazon.jsii.Kernel.get(this, "ipv4Addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ipv6AddressCount = software.amazon.jsii.Kernel.get(this, "ipv6AddressCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv6Addresses = software.amazon.jsii.Kernel.get(this, "ipv6Addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.networkInterfaceId = software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateIpAddress = software.amazon.jsii.Kernel.get(this, "privateIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String associatePublicIpAddress, final java.lang.Boolean deleteOnTermination, final java.lang.String description, final java.lang.Number deviceIndex, final java.lang.Number ipv4AddressCount, final java.util.List<java.lang.String> ipv4Addresses, final java.lang.Number ipv6AddressCount, final java.util.List<java.lang.String> ipv6Addresses, final java.lang.String networkInterfaceId, final java.lang.String privateIpAddress, final java.util.List<java.lang.String> securityGroups, final java.lang.String subnetId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.associatePublicIpAddress = associatePublicIpAddress;
            this.deleteOnTermination = deleteOnTermination;
            this.description = description;
            this.deviceIndex = deviceIndex;
            this.ipv4AddressCount = ipv4AddressCount;
            this.ipv4Addresses = ipv4Addresses;
            this.ipv6AddressCount = ipv6AddressCount;
            this.ipv6Addresses = ipv6Addresses;
            this.networkInterfaceId = networkInterfaceId;
            this.privateIpAddress = privateIpAddress;
            this.securityGroups = securityGroups;
            this.subnetId = subnetId;
        }

        @Override
        public final java.lang.String getAssociatePublicIpAddress() {
            return this.associatePublicIpAddress;
        }

        @Override
        public final java.lang.Boolean getDeleteOnTermination() {
            return this.deleteOnTermination;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Number getDeviceIndex() {
            return this.deviceIndex;
        }

        @Override
        public final java.lang.Number getIpv4AddressCount() {
            return this.ipv4AddressCount;
        }

        @Override
        public final java.util.List<java.lang.String> getIpv4Addresses() {
            return this.ipv4Addresses;
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
        public final java.lang.String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        @Override
        public final java.lang.String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAssociatePublicIpAddress() != null) {
                data.set("associatePublicIpAddress", om.valueToTree(this.getAssociatePublicIpAddress()));
            }
            if (this.getDeleteOnTermination() != null) {
                data.set("deleteOnTermination", om.valueToTree(this.getDeleteOnTermination()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDeviceIndex() != null) {
                data.set("deviceIndex", om.valueToTree(this.getDeviceIndex()));
            }
            if (this.getIpv4AddressCount() != null) {
                data.set("ipv4AddressCount", om.valueToTree(this.getIpv4AddressCount()));
            }
            if (this.getIpv4Addresses() != null) {
                data.set("ipv4Addresses", om.valueToTree(this.getIpv4Addresses()));
            }
            if (this.getIpv6AddressCount() != null) {
                data.set("ipv6AddressCount", om.valueToTree(this.getIpv6AddressCount()));
            }
            if (this.getIpv6Addresses() != null) {
                data.set("ipv6Addresses", om.valueToTree(this.getIpv6Addresses()));
            }
            if (this.getNetworkInterfaceId() != null) {
                data.set("networkInterfaceId", om.valueToTree(this.getNetworkInterfaceId()));
            }
            if (this.getPrivateIpAddress() != null) {
                data.set("privateIpAddress", om.valueToTree(this.getPrivateIpAddress()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateNetworkInterfaces"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateNetworkInterfaces.Jsii$Proxy that = (LaunchTemplateNetworkInterfaces.Jsii$Proxy) o;

            if (this.associatePublicIpAddress != null ? !this.associatePublicIpAddress.equals(that.associatePublicIpAddress) : that.associatePublicIpAddress != null) return false;
            if (this.deleteOnTermination != null ? !this.deleteOnTermination.equals(that.deleteOnTermination) : that.deleteOnTermination != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.deviceIndex != null ? !this.deviceIndex.equals(that.deviceIndex) : that.deviceIndex != null) return false;
            if (this.ipv4AddressCount != null ? !this.ipv4AddressCount.equals(that.ipv4AddressCount) : that.ipv4AddressCount != null) return false;
            if (this.ipv4Addresses != null ? !this.ipv4Addresses.equals(that.ipv4Addresses) : that.ipv4Addresses != null) return false;
            if (this.ipv6AddressCount != null ? !this.ipv6AddressCount.equals(that.ipv6AddressCount) : that.ipv6AddressCount != null) return false;
            if (this.ipv6Addresses != null ? !this.ipv6Addresses.equals(that.ipv6Addresses) : that.ipv6Addresses != null) return false;
            if (this.networkInterfaceId != null ? !this.networkInterfaceId.equals(that.networkInterfaceId) : that.networkInterfaceId != null) return false;
            if (this.privateIpAddress != null ? !this.privateIpAddress.equals(that.privateIpAddress) : that.privateIpAddress != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            return this.subnetId != null ? this.subnetId.equals(that.subnetId) : that.subnetId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.associatePublicIpAddress != null ? this.associatePublicIpAddress.hashCode() : 0;
            result = 31 * result + (this.deleteOnTermination != null ? this.deleteOnTermination.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.deviceIndex != null ? this.deviceIndex.hashCode() : 0);
            result = 31 * result + (this.ipv4AddressCount != null ? this.ipv4AddressCount.hashCode() : 0);
            result = 31 * result + (this.ipv4Addresses != null ? this.ipv4Addresses.hashCode() : 0);
            result = 31 * result + (this.ipv6AddressCount != null ? this.ipv6AddressCount.hashCode() : 0);
            result = 31 * result + (this.ipv6Addresses != null ? this.ipv6Addresses.hashCode() : 0);
            result = 31 * result + (this.networkInterfaceId != null ? this.networkInterfaceId.hashCode() : 0);
            result = 31 * result + (this.privateIpAddress != null ? this.privateIpAddress.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            return result;
        }
    }
}
