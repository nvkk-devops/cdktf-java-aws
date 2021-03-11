package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.828Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RouteTableRoute")
@software.amazon.jsii.Jsii.Proxy(RouteTableRoute.Jsii$Proxy.class)
public interface RouteTableRoute extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEgressOnlyGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIpv6CidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNatGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNetworkInterfaceId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTransitGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcPeeringConnectionId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RouteTableRoute}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RouteTableRoute}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RouteTableRoute> {
        private java.lang.String cidrBlock;
        private java.lang.String egressOnlyGatewayId;
        private java.lang.String gatewayId;
        private java.lang.String instanceId;
        private java.lang.String ipv6CidrBlock;
        private java.lang.String natGatewayId;
        private java.lang.String networkInterfaceId;
        private java.lang.String transitGatewayId;
        private java.lang.String vpcPeeringConnectionId;

        /**
         * Sets the value of {@link RouteTableRoute#getCidrBlock}
         * @param cidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder cidrBlock(java.lang.String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getEgressOnlyGatewayId}
         * @param egressOnlyGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder egressOnlyGatewayId(java.lang.String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = egressOnlyGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getGatewayId}
         * @param gatewayId the value to be set.
         * @return {@code this}
         */
        public Builder gatewayId(java.lang.String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getInstanceId}
         * @param instanceId the value to be set.
         * @return {@code this}
         */
        public Builder instanceId(java.lang.String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getIpv6CidrBlock}
         * @param ipv6CidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder ipv6CidrBlock(java.lang.String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getNatGatewayId}
         * @param natGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder natGatewayId(java.lang.String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getNetworkInterfaceId}
         * @param networkInterfaceId the value to be set.
         * @return {@code this}
         */
        public Builder networkInterfaceId(java.lang.String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getTransitGatewayId}
         * @param transitGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder transitGatewayId(java.lang.String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteTableRoute#getVpcPeeringConnectionId}
         * @param vpcPeeringConnectionId the value to be set.
         * @return {@code this}
         */
        public Builder vpcPeeringConnectionId(java.lang.String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RouteTableRoute}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RouteTableRoute build() {
            return new Jsii$Proxy(cidrBlock, egressOnlyGatewayId, gatewayId, instanceId, ipv6CidrBlock, natGatewayId, networkInterfaceId, transitGatewayId, vpcPeeringConnectionId);
        }
    }

    /**
     * An implementation for {@link RouteTableRoute}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RouteTableRoute {
        private final java.lang.String cidrBlock;
        private final java.lang.String egressOnlyGatewayId;
        private final java.lang.String gatewayId;
        private final java.lang.String instanceId;
        private final java.lang.String ipv6CidrBlock;
        private final java.lang.String natGatewayId;
        private final java.lang.String networkInterfaceId;
        private final java.lang.String transitGatewayId;
        private final java.lang.String vpcPeeringConnectionId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cidrBlock = software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.egressOnlyGatewayId = software.amazon.jsii.Kernel.get(this, "egressOnlyGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gatewayId = software.amazon.jsii.Kernel.get(this, "gatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceId = software.amazon.jsii.Kernel.get(this, "instanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipv6CidrBlock = software.amazon.jsii.Kernel.get(this, "ipv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.natGatewayId = software.amazon.jsii.Kernel.get(this, "natGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkInterfaceId = software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.transitGatewayId = software.amazon.jsii.Kernel.get(this, "transitGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcPeeringConnectionId = software.amazon.jsii.Kernel.get(this, "vpcPeeringConnectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String cidrBlock, final java.lang.String egressOnlyGatewayId, final java.lang.String gatewayId, final java.lang.String instanceId, final java.lang.String ipv6CidrBlock, final java.lang.String natGatewayId, final java.lang.String networkInterfaceId, final java.lang.String transitGatewayId, final java.lang.String vpcPeeringConnectionId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidrBlock = cidrBlock;
            this.egressOnlyGatewayId = egressOnlyGatewayId;
            this.gatewayId = gatewayId;
            this.instanceId = instanceId;
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.natGatewayId = natGatewayId;
            this.networkInterfaceId = networkInterfaceId;
            this.transitGatewayId = transitGatewayId;
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        }

        @Override
        public final java.lang.String getCidrBlock() {
            return this.cidrBlock;
        }

        @Override
        public final java.lang.String getEgressOnlyGatewayId() {
            return this.egressOnlyGatewayId;
        }

        @Override
        public final java.lang.String getGatewayId() {
            return this.gatewayId;
        }

        @Override
        public final java.lang.String getInstanceId() {
            return this.instanceId;
        }

        @Override
        public final java.lang.String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        @Override
        public final java.lang.String getNatGatewayId() {
            return this.natGatewayId;
        }

        @Override
        public final java.lang.String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        @Override
        public final java.lang.String getTransitGatewayId() {
            return this.transitGatewayId;
        }

        @Override
        public final java.lang.String getVpcPeeringConnectionId() {
            return this.vpcPeeringConnectionId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCidrBlock() != null) {
                data.set("cidrBlock", om.valueToTree(this.getCidrBlock()));
            }
            if (this.getEgressOnlyGatewayId() != null) {
                data.set("egressOnlyGatewayId", om.valueToTree(this.getEgressOnlyGatewayId()));
            }
            if (this.getGatewayId() != null) {
                data.set("gatewayId", om.valueToTree(this.getGatewayId()));
            }
            if (this.getInstanceId() != null) {
                data.set("instanceId", om.valueToTree(this.getInstanceId()));
            }
            if (this.getIpv6CidrBlock() != null) {
                data.set("ipv6CidrBlock", om.valueToTree(this.getIpv6CidrBlock()));
            }
            if (this.getNatGatewayId() != null) {
                data.set("natGatewayId", om.valueToTree(this.getNatGatewayId()));
            }
            if (this.getNetworkInterfaceId() != null) {
                data.set("networkInterfaceId", om.valueToTree(this.getNetworkInterfaceId()));
            }
            if (this.getTransitGatewayId() != null) {
                data.set("transitGatewayId", om.valueToTree(this.getTransitGatewayId()));
            }
            if (this.getVpcPeeringConnectionId() != null) {
                data.set("vpcPeeringConnectionId", om.valueToTree(this.getVpcPeeringConnectionId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.RouteTableRoute"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RouteTableRoute.Jsii$Proxy that = (RouteTableRoute.Jsii$Proxy) o;

            if (this.cidrBlock != null ? !this.cidrBlock.equals(that.cidrBlock) : that.cidrBlock != null) return false;
            if (this.egressOnlyGatewayId != null ? !this.egressOnlyGatewayId.equals(that.egressOnlyGatewayId) : that.egressOnlyGatewayId != null) return false;
            if (this.gatewayId != null ? !this.gatewayId.equals(that.gatewayId) : that.gatewayId != null) return false;
            if (this.instanceId != null ? !this.instanceId.equals(that.instanceId) : that.instanceId != null) return false;
            if (this.ipv6CidrBlock != null ? !this.ipv6CidrBlock.equals(that.ipv6CidrBlock) : that.ipv6CidrBlock != null) return false;
            if (this.natGatewayId != null ? !this.natGatewayId.equals(that.natGatewayId) : that.natGatewayId != null) return false;
            if (this.networkInterfaceId != null ? !this.networkInterfaceId.equals(that.networkInterfaceId) : that.networkInterfaceId != null) return false;
            if (this.transitGatewayId != null ? !this.transitGatewayId.equals(that.transitGatewayId) : that.transitGatewayId != null) return false;
            return this.vpcPeeringConnectionId != null ? this.vpcPeeringConnectionId.equals(that.vpcPeeringConnectionId) : that.vpcPeeringConnectionId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cidrBlock != null ? this.cidrBlock.hashCode() : 0;
            result = 31 * result + (this.egressOnlyGatewayId != null ? this.egressOnlyGatewayId.hashCode() : 0);
            result = 31 * result + (this.gatewayId != null ? this.gatewayId.hashCode() : 0);
            result = 31 * result + (this.instanceId != null ? this.instanceId.hashCode() : 0);
            result = 31 * result + (this.ipv6CidrBlock != null ? this.ipv6CidrBlock.hashCode() : 0);
            result = 31 * result + (this.natGatewayId != null ? this.natGatewayId.hashCode() : 0);
            result = 31 * result + (this.networkInterfaceId != null ? this.networkInterfaceId.hashCode() : 0);
            result = 31 * result + (this.transitGatewayId != null ? this.transitGatewayId.hashCode() : 0);
            result = 31 * result + (this.vpcPeeringConnectionId != null ? this.vpcPeeringConnectionId.hashCode() : 0);
            return result;
        }
    }
}
