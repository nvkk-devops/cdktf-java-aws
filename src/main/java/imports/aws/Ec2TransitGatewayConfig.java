package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.495Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2TransitGatewayConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2TransitGatewayConfig.Jsii$Proxy.class)
public interface Ec2TransitGatewayConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.Number getAmazonSideAsn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAutoAcceptSharedAttachments() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRouteTableAssociation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRouteTablePropagation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDnsSupport() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpnEcmpSupport() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2TransitGatewayConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2TransitGatewayConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2TransitGatewayConfig> {
        private java.lang.Number amazonSideAsn;
        private java.lang.String autoAcceptSharedAttachments;
        private java.lang.String defaultRouteTableAssociation;
        private java.lang.String defaultRouteTablePropagation;
        private java.lang.String description;
        private java.lang.String dnsSupport;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String vpnEcmpSupport;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getAmazonSideAsn}
         * @param amazonSideAsn the value to be set.
         * @return {@code this}
         */
        public Builder amazonSideAsn(java.lang.Number amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getAutoAcceptSharedAttachments}
         * @param autoAcceptSharedAttachments the value to be set.
         * @return {@code this}
         */
        public Builder autoAcceptSharedAttachments(java.lang.String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getDefaultRouteTableAssociation}
         * @param defaultRouteTableAssociation the value to be set.
         * @return {@code this}
         */
        public Builder defaultRouteTableAssociation(java.lang.String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = defaultRouteTableAssociation;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getDefaultRouteTablePropagation}
         * @param defaultRouteTablePropagation the value to be set.
         * @return {@code this}
         */
        public Builder defaultRouteTablePropagation(java.lang.String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = defaultRouteTablePropagation;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getDnsSupport}
         * @param dnsSupport the value to be set.
         * @return {@code this}
         */
        public Builder dnsSupport(java.lang.String dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getVpnEcmpSupport}
         * @param vpnEcmpSupport the value to be set.
         * @return {@code this}
         */
        public Builder vpnEcmpSupport(java.lang.String vpnEcmpSupport) {
            this.vpnEcmpSupport = vpnEcmpSupport;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getDependsOn}
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
         * Sets the value of {@link Ec2TransitGatewayConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayConfig#getProvider}
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
         * @return a new instance of {@link Ec2TransitGatewayConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2TransitGatewayConfig build() {
            return new Jsii$Proxy(amazonSideAsn, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, tags, vpnEcmpSupport, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2TransitGatewayConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2TransitGatewayConfig {
        private final java.lang.Number amazonSideAsn;
        private final java.lang.String autoAcceptSharedAttachments;
        private final java.lang.String defaultRouteTableAssociation;
        private final java.lang.String defaultRouteTablePropagation;
        private final java.lang.String description;
        private final java.lang.String dnsSupport;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String vpnEcmpSupport;
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
            this.amazonSideAsn = software.amazon.jsii.Kernel.get(this, "amazonSideAsn", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.autoAcceptSharedAttachments = software.amazon.jsii.Kernel.get(this, "autoAcceptSharedAttachments", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultRouteTableAssociation = software.amazon.jsii.Kernel.get(this, "defaultRouteTableAssociation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultRouteTablePropagation = software.amazon.jsii.Kernel.get(this, "defaultRouteTablePropagation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dnsSupport = software.amazon.jsii.Kernel.get(this, "dnsSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpnEcmpSupport = software.amazon.jsii.Kernel.get(this, "vpnEcmpSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number amazonSideAsn, final java.lang.String autoAcceptSharedAttachments, final java.lang.String defaultRouteTableAssociation, final java.lang.String defaultRouteTablePropagation, final java.lang.String description, final java.lang.String dnsSupport, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String vpnEcmpSupport, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.amazonSideAsn = amazonSideAsn;
            this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            this.defaultRouteTableAssociation = defaultRouteTableAssociation;
            this.defaultRouteTablePropagation = defaultRouteTablePropagation;
            this.description = description;
            this.dnsSupport = dnsSupport;
            this.tags = tags;
            this.vpnEcmpSupport = vpnEcmpSupport;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getAmazonSideAsn() {
            return this.amazonSideAsn;
        }

        @Override
        public final java.lang.String getAutoAcceptSharedAttachments() {
            return this.autoAcceptSharedAttachments;
        }

        @Override
        public final java.lang.String getDefaultRouteTableAssociation() {
            return this.defaultRouteTableAssociation;
        }

        @Override
        public final java.lang.String getDefaultRouteTablePropagation() {
            return this.defaultRouteTablePropagation;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getDnsSupport() {
            return this.dnsSupport;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getVpnEcmpSupport() {
            return this.vpnEcmpSupport;
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

            if (this.getAmazonSideAsn() != null) {
                data.set("amazonSideAsn", om.valueToTree(this.getAmazonSideAsn()));
            }
            if (this.getAutoAcceptSharedAttachments() != null) {
                data.set("autoAcceptSharedAttachments", om.valueToTree(this.getAutoAcceptSharedAttachments()));
            }
            if (this.getDefaultRouteTableAssociation() != null) {
                data.set("defaultRouteTableAssociation", om.valueToTree(this.getDefaultRouteTableAssociation()));
            }
            if (this.getDefaultRouteTablePropagation() != null) {
                data.set("defaultRouteTablePropagation", om.valueToTree(this.getDefaultRouteTablePropagation()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDnsSupport() != null) {
                data.set("dnsSupport", om.valueToTree(this.getDnsSupport()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVpnEcmpSupport() != null) {
                data.set("vpnEcmpSupport", om.valueToTree(this.getVpnEcmpSupport()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2TransitGatewayConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2TransitGatewayConfig.Jsii$Proxy that = (Ec2TransitGatewayConfig.Jsii$Proxy) o;

            if (this.amazonSideAsn != null ? !this.amazonSideAsn.equals(that.amazonSideAsn) : that.amazonSideAsn != null) return false;
            if (this.autoAcceptSharedAttachments != null ? !this.autoAcceptSharedAttachments.equals(that.autoAcceptSharedAttachments) : that.autoAcceptSharedAttachments != null) return false;
            if (this.defaultRouteTableAssociation != null ? !this.defaultRouteTableAssociation.equals(that.defaultRouteTableAssociation) : that.defaultRouteTableAssociation != null) return false;
            if (this.defaultRouteTablePropagation != null ? !this.defaultRouteTablePropagation.equals(that.defaultRouteTablePropagation) : that.defaultRouteTablePropagation != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dnsSupport != null ? !this.dnsSupport.equals(that.dnsSupport) : that.dnsSupport != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.vpnEcmpSupport != null ? !this.vpnEcmpSupport.equals(that.vpnEcmpSupport) : that.vpnEcmpSupport != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.amazonSideAsn != null ? this.amazonSideAsn.hashCode() : 0;
            result = 31 * result + (this.autoAcceptSharedAttachments != null ? this.autoAcceptSharedAttachments.hashCode() : 0);
            result = 31 * result + (this.defaultRouteTableAssociation != null ? this.defaultRouteTableAssociation.hashCode() : 0);
            result = 31 * result + (this.defaultRouteTablePropagation != null ? this.defaultRouteTablePropagation.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dnsSupport != null ? this.dnsSupport.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.vpnEcmpSupport != null ? this.vpnEcmpSupport.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
