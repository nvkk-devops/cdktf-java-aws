package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.826Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RouteConfig")
@software.amazon.jsii.Jsii.Proxy(RouteConfig.Jsii$Proxy.class)
public interface RouteConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getRouteTableId();

    default @org.jetbrains.annotations.Nullable java.lang.String getDestinationCidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDestinationIpv6CidrBlock() {
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

    default @org.jetbrains.annotations.Nullable java.lang.String getNatGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNetworkInterfaceId() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.RouteTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTransitGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcPeeringConnectionId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RouteConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RouteConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RouteConfig> {
        private java.lang.String routeTableId;
        private java.lang.String destinationCidrBlock;
        private java.lang.String destinationIpv6CidrBlock;
        private java.lang.String egressOnlyGatewayId;
        private java.lang.String gatewayId;
        private java.lang.String instanceId;
        private java.lang.String natGatewayId;
        private java.lang.String networkInterfaceId;
        private imports.aws.RouteTimeouts timeouts;
        private java.lang.String transitGatewayId;
        private java.lang.String vpcPeeringConnectionId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link RouteConfig#getRouteTableId}
         * @param routeTableId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder routeTableId(java.lang.String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getDestinationCidrBlock}
         * @param destinationCidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder destinationCidrBlock(java.lang.String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getDestinationIpv6CidrBlock}
         * @param destinationIpv6CidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder destinationIpv6CidrBlock(java.lang.String destinationIpv6CidrBlock) {
            this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getEgressOnlyGatewayId}
         * @param egressOnlyGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder egressOnlyGatewayId(java.lang.String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = egressOnlyGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getGatewayId}
         * @param gatewayId the value to be set.
         * @return {@code this}
         */
        public Builder gatewayId(java.lang.String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getInstanceId}
         * @param instanceId the value to be set.
         * @return {@code this}
         */
        public Builder instanceId(java.lang.String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getNatGatewayId}
         * @param natGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder natGatewayId(java.lang.String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getNetworkInterfaceId}
         * @param networkInterfaceId the value to be set.
         * @return {@code this}
         */
        public Builder networkInterfaceId(java.lang.String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.RouteTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getTransitGatewayId}
         * @param transitGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder transitGatewayId(java.lang.String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getVpcPeeringConnectionId}
         * @param vpcPeeringConnectionId the value to be set.
         * @return {@code this}
         */
        public Builder vpcPeeringConnectionId(java.lang.String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getDependsOn}
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
         * Sets the value of {@link RouteConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link RouteConfig#getProvider}
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
         * @return a new instance of {@link RouteConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RouteConfig build() {
            return new Jsii$Proxy(routeTableId, destinationCidrBlock, destinationIpv6CidrBlock, egressOnlyGatewayId, gatewayId, instanceId, natGatewayId, networkInterfaceId, timeouts, transitGatewayId, vpcPeeringConnectionId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link RouteConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RouteConfig {
        private final java.lang.String routeTableId;
        private final java.lang.String destinationCidrBlock;
        private final java.lang.String destinationIpv6CidrBlock;
        private final java.lang.String egressOnlyGatewayId;
        private final java.lang.String gatewayId;
        private final java.lang.String instanceId;
        private final java.lang.String natGatewayId;
        private final java.lang.String networkInterfaceId;
        private final imports.aws.RouteTimeouts timeouts;
        private final java.lang.String transitGatewayId;
        private final java.lang.String vpcPeeringConnectionId;
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
            this.routeTableId = software.amazon.jsii.Kernel.get(this, "routeTableId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationCidrBlock = software.amazon.jsii.Kernel.get(this, "destinationCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationIpv6CidrBlock = software.amazon.jsii.Kernel.get(this, "destinationIpv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.egressOnlyGatewayId = software.amazon.jsii.Kernel.get(this, "egressOnlyGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gatewayId = software.amazon.jsii.Kernel.get(this, "gatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceId = software.amazon.jsii.Kernel.get(this, "instanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.natGatewayId = software.amazon.jsii.Kernel.get(this, "natGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkInterfaceId = software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.RouteTimeouts.class));
            this.transitGatewayId = software.amazon.jsii.Kernel.get(this, "transitGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcPeeringConnectionId = software.amazon.jsii.Kernel.get(this, "vpcPeeringConnectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String routeTableId, final java.lang.String destinationCidrBlock, final java.lang.String destinationIpv6CidrBlock, final java.lang.String egressOnlyGatewayId, final java.lang.String gatewayId, final java.lang.String instanceId, final java.lang.String natGatewayId, final java.lang.String networkInterfaceId, final imports.aws.RouteTimeouts timeouts, final java.lang.String transitGatewayId, final java.lang.String vpcPeeringConnectionId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.routeTableId = java.util.Objects.requireNonNull(routeTableId, "routeTableId is required");
            this.destinationCidrBlock = destinationCidrBlock;
            this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
            this.egressOnlyGatewayId = egressOnlyGatewayId;
            this.gatewayId = gatewayId;
            this.instanceId = instanceId;
            this.natGatewayId = natGatewayId;
            this.networkInterfaceId = networkInterfaceId;
            this.timeouts = timeouts;
            this.transitGatewayId = transitGatewayId;
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getRouteTableId() {
            return this.routeTableId;
        }

        @Override
        public final java.lang.String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        @Override
        public final java.lang.String getDestinationIpv6CidrBlock() {
            return this.destinationIpv6CidrBlock;
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
        public final java.lang.String getNatGatewayId() {
            return this.natGatewayId;
        }

        @Override
        public final java.lang.String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        @Override
        public final imports.aws.RouteTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("routeTableId", om.valueToTree(this.getRouteTableId()));
            if (this.getDestinationCidrBlock() != null) {
                data.set("destinationCidrBlock", om.valueToTree(this.getDestinationCidrBlock()));
            }
            if (this.getDestinationIpv6CidrBlock() != null) {
                data.set("destinationIpv6CidrBlock", om.valueToTree(this.getDestinationIpv6CidrBlock()));
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
            if (this.getNatGatewayId() != null) {
                data.set("natGatewayId", om.valueToTree(this.getNatGatewayId()));
            }
            if (this.getNetworkInterfaceId() != null) {
                data.set("networkInterfaceId", om.valueToTree(this.getNetworkInterfaceId()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getTransitGatewayId() != null) {
                data.set("transitGatewayId", om.valueToTree(this.getTransitGatewayId()));
            }
            if (this.getVpcPeeringConnectionId() != null) {
                data.set("vpcPeeringConnectionId", om.valueToTree(this.getVpcPeeringConnectionId()));
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
            struct.set("fqn", om.valueToTree("aws.RouteConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RouteConfig.Jsii$Proxy that = (RouteConfig.Jsii$Proxy) o;

            if (!routeTableId.equals(that.routeTableId)) return false;
            if (this.destinationCidrBlock != null ? !this.destinationCidrBlock.equals(that.destinationCidrBlock) : that.destinationCidrBlock != null) return false;
            if (this.destinationIpv6CidrBlock != null ? !this.destinationIpv6CidrBlock.equals(that.destinationIpv6CidrBlock) : that.destinationIpv6CidrBlock != null) return false;
            if (this.egressOnlyGatewayId != null ? !this.egressOnlyGatewayId.equals(that.egressOnlyGatewayId) : that.egressOnlyGatewayId != null) return false;
            if (this.gatewayId != null ? !this.gatewayId.equals(that.gatewayId) : that.gatewayId != null) return false;
            if (this.instanceId != null ? !this.instanceId.equals(that.instanceId) : that.instanceId != null) return false;
            if (this.natGatewayId != null ? !this.natGatewayId.equals(that.natGatewayId) : that.natGatewayId != null) return false;
            if (this.networkInterfaceId != null ? !this.networkInterfaceId.equals(that.networkInterfaceId) : that.networkInterfaceId != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.transitGatewayId != null ? !this.transitGatewayId.equals(that.transitGatewayId) : that.transitGatewayId != null) return false;
            if (this.vpcPeeringConnectionId != null ? !this.vpcPeeringConnectionId.equals(that.vpcPeeringConnectionId) : that.vpcPeeringConnectionId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.routeTableId.hashCode();
            result = 31 * result + (this.destinationCidrBlock != null ? this.destinationCidrBlock.hashCode() : 0);
            result = 31 * result + (this.destinationIpv6CidrBlock != null ? this.destinationIpv6CidrBlock.hashCode() : 0);
            result = 31 * result + (this.egressOnlyGatewayId != null ? this.egressOnlyGatewayId.hashCode() : 0);
            result = 31 * result + (this.gatewayId != null ? this.gatewayId.hashCode() : 0);
            result = 31 * result + (this.instanceId != null ? this.instanceId.hashCode() : 0);
            result = 31 * result + (this.natGatewayId != null ? this.natGatewayId.hashCode() : 0);
            result = 31 * result + (this.networkInterfaceId != null ? this.networkInterfaceId.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.transitGatewayId != null ? this.transitGatewayId.hashCode() : 0);
            result = 31 * result + (this.vpcPeeringConnectionId != null ? this.vpcPeeringConnectionId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
