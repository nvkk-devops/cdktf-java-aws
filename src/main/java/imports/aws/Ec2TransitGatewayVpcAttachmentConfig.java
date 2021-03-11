package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.507Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2TransitGatewayVpcAttachmentConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2TransitGatewayVpcAttachmentConfig.Jsii$Proxy.class)
public interface Ec2TransitGatewayVpcAttachmentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds();

    @org.jetbrains.annotations.NotNull java.lang.String getTransitGatewayId();

    @org.jetbrains.annotations.NotNull java.lang.String getVpcId();

    default @org.jetbrains.annotations.Nullable java.lang.String getDnsSupport() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIpv6Support() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTransitGatewayDefaultRouteTableAssociation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTransitGatewayDefaultRouteTablePropagation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2TransitGatewayVpcAttachmentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2TransitGatewayVpcAttachmentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2TransitGatewayVpcAttachmentConfig> {
        private java.util.List<java.lang.String> subnetIds;
        private java.lang.String transitGatewayId;
        private java.lang.String vpcId;
        private java.lang.String dnsSupport;
        private java.lang.String ipv6Support;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean transitGatewayDefaultRouteTableAssociation;
        private java.lang.Boolean transitGatewayDefaultRouteTablePropagation;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getSubnetIds}
         * @param subnetIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetIds(java.util.List<java.lang.String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getTransitGatewayId}
         * @param transitGatewayId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder transitGatewayId(java.lang.String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getVpcId}
         * @param vpcId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getDnsSupport}
         * @param dnsSupport the value to be set.
         * @return {@code this}
         */
        public Builder dnsSupport(java.lang.String dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getIpv6Support}
         * @param ipv6Support the value to be set.
         * @return {@code this}
         */
        public Builder ipv6Support(java.lang.String ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getTransitGatewayDefaultRouteTableAssociation}
         * @param transitGatewayDefaultRouteTableAssociation the value to be set.
         * @return {@code this}
         */
        public Builder transitGatewayDefaultRouteTableAssociation(java.lang.Boolean transitGatewayDefaultRouteTableAssociation) {
            this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getTransitGatewayDefaultRouteTablePropagation}
         * @param transitGatewayDefaultRouteTablePropagation the value to be set.
         * @return {@code this}
         */
        public Builder transitGatewayDefaultRouteTablePropagation(java.lang.Boolean transitGatewayDefaultRouteTablePropagation) {
            this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getDependsOn}
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
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayVpcAttachmentConfig#getProvider}
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
         * @return a new instance of {@link Ec2TransitGatewayVpcAttachmentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2TransitGatewayVpcAttachmentConfig build() {
            return new Jsii$Proxy(subnetIds, transitGatewayId, vpcId, dnsSupport, ipv6Support, tags, transitGatewayDefaultRouteTableAssociation, transitGatewayDefaultRouteTablePropagation, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2TransitGatewayVpcAttachmentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2TransitGatewayVpcAttachmentConfig {
        private final java.util.List<java.lang.String> subnetIds;
        private final java.lang.String transitGatewayId;
        private final java.lang.String vpcId;
        private final java.lang.String dnsSupport;
        private final java.lang.String ipv6Support;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Boolean transitGatewayDefaultRouteTableAssociation;
        private final java.lang.Boolean transitGatewayDefaultRouteTablePropagation;
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
            this.subnetIds = software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.transitGatewayId = software.amazon.jsii.Kernel.get(this, "transitGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcId = software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dnsSupport = software.amazon.jsii.Kernel.get(this, "dnsSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipv6Support = software.amazon.jsii.Kernel.get(this, "ipv6Support", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.transitGatewayDefaultRouteTableAssociation = software.amazon.jsii.Kernel.get(this, "transitGatewayDefaultRouteTableAssociation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.transitGatewayDefaultRouteTablePropagation = software.amazon.jsii.Kernel.get(this, "transitGatewayDefaultRouteTablePropagation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> subnetIds, final java.lang.String transitGatewayId, final java.lang.String vpcId, final java.lang.String dnsSupport, final java.lang.String ipv6Support, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean transitGatewayDefaultRouteTableAssociation, final java.lang.Boolean transitGatewayDefaultRouteTablePropagation, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subnetIds = java.util.Objects.requireNonNull(subnetIds, "subnetIds is required");
            this.transitGatewayId = java.util.Objects.requireNonNull(transitGatewayId, "transitGatewayId is required");
            this.vpcId = java.util.Objects.requireNonNull(vpcId, "vpcId is required");
            this.dnsSupport = dnsSupport;
            this.ipv6Support = ipv6Support;
            this.tags = tags;
            this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
            this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetIds() {
            return this.subnetIds;
        }

        @Override
        public final java.lang.String getTransitGatewayId() {
            return this.transitGatewayId;
        }

        @Override
        public final java.lang.String getVpcId() {
            return this.vpcId;
        }

        @Override
        public final java.lang.String getDnsSupport() {
            return this.dnsSupport;
        }

        @Override
        public final java.lang.String getIpv6Support() {
            return this.ipv6Support;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Boolean getTransitGatewayDefaultRouteTableAssociation() {
            return this.transitGatewayDefaultRouteTableAssociation;
        }

        @Override
        public final java.lang.Boolean getTransitGatewayDefaultRouteTablePropagation() {
            return this.transitGatewayDefaultRouteTablePropagation;
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

            data.set("subnetIds", om.valueToTree(this.getSubnetIds()));
            data.set("transitGatewayId", om.valueToTree(this.getTransitGatewayId()));
            data.set("vpcId", om.valueToTree(this.getVpcId()));
            if (this.getDnsSupport() != null) {
                data.set("dnsSupport", om.valueToTree(this.getDnsSupport()));
            }
            if (this.getIpv6Support() != null) {
                data.set("ipv6Support", om.valueToTree(this.getIpv6Support()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTransitGatewayDefaultRouteTableAssociation() != null) {
                data.set("transitGatewayDefaultRouteTableAssociation", om.valueToTree(this.getTransitGatewayDefaultRouteTableAssociation()));
            }
            if (this.getTransitGatewayDefaultRouteTablePropagation() != null) {
                data.set("transitGatewayDefaultRouteTablePropagation", om.valueToTree(this.getTransitGatewayDefaultRouteTablePropagation()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2TransitGatewayVpcAttachmentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2TransitGatewayVpcAttachmentConfig.Jsii$Proxy that = (Ec2TransitGatewayVpcAttachmentConfig.Jsii$Proxy) o;

            if (!subnetIds.equals(that.subnetIds)) return false;
            if (!transitGatewayId.equals(that.transitGatewayId)) return false;
            if (!vpcId.equals(that.vpcId)) return false;
            if (this.dnsSupport != null ? !this.dnsSupport.equals(that.dnsSupport) : that.dnsSupport != null) return false;
            if (this.ipv6Support != null ? !this.ipv6Support.equals(that.ipv6Support) : that.ipv6Support != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.transitGatewayDefaultRouteTableAssociation != null ? !this.transitGatewayDefaultRouteTableAssociation.equals(that.transitGatewayDefaultRouteTableAssociation) : that.transitGatewayDefaultRouteTableAssociation != null) return false;
            if (this.transitGatewayDefaultRouteTablePropagation != null ? !this.transitGatewayDefaultRouteTablePropagation.equals(that.transitGatewayDefaultRouteTablePropagation) : that.transitGatewayDefaultRouteTablePropagation != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.subnetIds.hashCode();
            result = 31 * result + (this.transitGatewayId.hashCode());
            result = 31 * result + (this.vpcId.hashCode());
            result = 31 * result + (this.dnsSupport != null ? this.dnsSupport.hashCode() : 0);
            result = 31 * result + (this.ipv6Support != null ? this.ipv6Support.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.transitGatewayDefaultRouteTableAssociation != null ? this.transitGatewayDefaultRouteTableAssociation.hashCode() : 0);
            result = 31 * result + (this.transitGatewayDefaultRouteTablePropagation != null ? this.transitGatewayDefaultRouteTablePropagation.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
