package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.924Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpnConnectionConfig")
@software.amazon.jsii.Jsii.Proxy(VpnConnectionConfig.Jsii$Proxy.class)
public interface VpnConnectionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getCustomerGatewayId();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStaticRoutesOnly() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTransitGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTunnel1InsideCidr() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTunnel1PresharedKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTunnel2InsideCidr() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTunnel2PresharedKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpnGatewayId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpnConnectionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpnConnectionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpnConnectionConfig> {
        private java.lang.String customerGatewayId;
        private java.lang.String type;
        private java.lang.Boolean staticRoutesOnly;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String transitGatewayId;
        private java.lang.String tunnel1InsideCidr;
        private java.lang.String tunnel1PresharedKey;
        private java.lang.String tunnel2InsideCidr;
        private java.lang.String tunnel2PresharedKey;
        private java.lang.String vpnGatewayId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link VpnConnectionConfig#getCustomerGatewayId}
         * @param customerGatewayId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder customerGatewayId(java.lang.String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getStaticRoutesOnly}
         * @param staticRoutesOnly the value to be set.
         * @return {@code this}
         */
        public Builder staticRoutesOnly(java.lang.Boolean staticRoutesOnly) {
            this.staticRoutesOnly = staticRoutesOnly;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getTransitGatewayId}
         * @param transitGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder transitGatewayId(java.lang.String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getTunnel1InsideCidr}
         * @param tunnel1InsideCidr the value to be set.
         * @return {@code this}
         */
        public Builder tunnel1InsideCidr(java.lang.String tunnel1InsideCidr) {
            this.tunnel1InsideCidr = tunnel1InsideCidr;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getTunnel1PresharedKey}
         * @param tunnel1PresharedKey the value to be set.
         * @return {@code this}
         */
        public Builder tunnel1PresharedKey(java.lang.String tunnel1PresharedKey) {
            this.tunnel1PresharedKey = tunnel1PresharedKey;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getTunnel2InsideCidr}
         * @param tunnel2InsideCidr the value to be set.
         * @return {@code this}
         */
        public Builder tunnel2InsideCidr(java.lang.String tunnel2InsideCidr) {
            this.tunnel2InsideCidr = tunnel2InsideCidr;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getTunnel2PresharedKey}
         * @param tunnel2PresharedKey the value to be set.
         * @return {@code this}
         */
        public Builder tunnel2PresharedKey(java.lang.String tunnel2PresharedKey) {
            this.tunnel2PresharedKey = tunnel2PresharedKey;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getVpnGatewayId}
         * @param vpnGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder vpnGatewayId(java.lang.String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getDependsOn}
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
         * Sets the value of {@link VpnConnectionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VpnConnectionConfig#getProvider}
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
         * @return a new instance of {@link VpnConnectionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpnConnectionConfig build() {
            return new Jsii$Proxy(customerGatewayId, type, staticRoutesOnly, tags, transitGatewayId, tunnel1InsideCidr, tunnel1PresharedKey, tunnel2InsideCidr, tunnel2PresharedKey, vpnGatewayId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link VpnConnectionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpnConnectionConfig {
        private final java.lang.String customerGatewayId;
        private final java.lang.String type;
        private final java.lang.Boolean staticRoutesOnly;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String transitGatewayId;
        private final java.lang.String tunnel1InsideCidr;
        private final java.lang.String tunnel1PresharedKey;
        private final java.lang.String tunnel2InsideCidr;
        private final java.lang.String tunnel2PresharedKey;
        private final java.lang.String vpnGatewayId;
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
            this.customerGatewayId = software.amazon.jsii.Kernel.get(this, "customerGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.staticRoutesOnly = software.amazon.jsii.Kernel.get(this, "staticRoutesOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.transitGatewayId = software.amazon.jsii.Kernel.get(this, "transitGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tunnel1InsideCidr = software.amazon.jsii.Kernel.get(this, "tunnel1InsideCidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tunnel1PresharedKey = software.amazon.jsii.Kernel.get(this, "tunnel1PresharedKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tunnel2InsideCidr = software.amazon.jsii.Kernel.get(this, "tunnel2InsideCidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tunnel2PresharedKey = software.amazon.jsii.Kernel.get(this, "tunnel2PresharedKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpnGatewayId = software.amazon.jsii.Kernel.get(this, "vpnGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String customerGatewayId, final java.lang.String type, final java.lang.Boolean staticRoutesOnly, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String transitGatewayId, final java.lang.String tunnel1InsideCidr, final java.lang.String tunnel1PresharedKey, final java.lang.String tunnel2InsideCidr, final java.lang.String tunnel2PresharedKey, final java.lang.String vpnGatewayId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.customerGatewayId = java.util.Objects.requireNonNull(customerGatewayId, "customerGatewayId is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.staticRoutesOnly = staticRoutesOnly;
            this.tags = tags;
            this.transitGatewayId = transitGatewayId;
            this.tunnel1InsideCidr = tunnel1InsideCidr;
            this.tunnel1PresharedKey = tunnel1PresharedKey;
            this.tunnel2InsideCidr = tunnel2InsideCidr;
            this.tunnel2PresharedKey = tunnel2PresharedKey;
            this.vpnGatewayId = vpnGatewayId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Boolean getStaticRoutesOnly() {
            return this.staticRoutesOnly;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTransitGatewayId() {
            return this.transitGatewayId;
        }

        @Override
        public final java.lang.String getTunnel1InsideCidr() {
            return this.tunnel1InsideCidr;
        }

        @Override
        public final java.lang.String getTunnel1PresharedKey() {
            return this.tunnel1PresharedKey;
        }

        @Override
        public final java.lang.String getTunnel2InsideCidr() {
            return this.tunnel2InsideCidr;
        }

        @Override
        public final java.lang.String getTunnel2PresharedKey() {
            return this.tunnel2PresharedKey;
        }

        @Override
        public final java.lang.String getVpnGatewayId() {
            return this.vpnGatewayId;
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

            data.set("customerGatewayId", om.valueToTree(this.getCustomerGatewayId()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getStaticRoutesOnly() != null) {
                data.set("staticRoutesOnly", om.valueToTree(this.getStaticRoutesOnly()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTransitGatewayId() != null) {
                data.set("transitGatewayId", om.valueToTree(this.getTransitGatewayId()));
            }
            if (this.getTunnel1InsideCidr() != null) {
                data.set("tunnel1InsideCidr", om.valueToTree(this.getTunnel1InsideCidr()));
            }
            if (this.getTunnel1PresharedKey() != null) {
                data.set("tunnel1PresharedKey", om.valueToTree(this.getTunnel1PresharedKey()));
            }
            if (this.getTunnel2InsideCidr() != null) {
                data.set("tunnel2InsideCidr", om.valueToTree(this.getTunnel2InsideCidr()));
            }
            if (this.getTunnel2PresharedKey() != null) {
                data.set("tunnel2PresharedKey", om.valueToTree(this.getTunnel2PresharedKey()));
            }
            if (this.getVpnGatewayId() != null) {
                data.set("vpnGatewayId", om.valueToTree(this.getVpnGatewayId()));
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
            struct.set("fqn", om.valueToTree("aws.VpnConnectionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpnConnectionConfig.Jsii$Proxy that = (VpnConnectionConfig.Jsii$Proxy) o;

            if (!customerGatewayId.equals(that.customerGatewayId)) return false;
            if (!type.equals(that.type)) return false;
            if (this.staticRoutesOnly != null ? !this.staticRoutesOnly.equals(that.staticRoutesOnly) : that.staticRoutesOnly != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.transitGatewayId != null ? !this.transitGatewayId.equals(that.transitGatewayId) : that.transitGatewayId != null) return false;
            if (this.tunnel1InsideCidr != null ? !this.tunnel1InsideCidr.equals(that.tunnel1InsideCidr) : that.tunnel1InsideCidr != null) return false;
            if (this.tunnel1PresharedKey != null ? !this.tunnel1PresharedKey.equals(that.tunnel1PresharedKey) : that.tunnel1PresharedKey != null) return false;
            if (this.tunnel2InsideCidr != null ? !this.tunnel2InsideCidr.equals(that.tunnel2InsideCidr) : that.tunnel2InsideCidr != null) return false;
            if (this.tunnel2PresharedKey != null ? !this.tunnel2PresharedKey.equals(that.tunnel2PresharedKey) : that.tunnel2PresharedKey != null) return false;
            if (this.vpnGatewayId != null ? !this.vpnGatewayId.equals(that.vpnGatewayId) : that.vpnGatewayId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.customerGatewayId.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.staticRoutesOnly != null ? this.staticRoutesOnly.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.transitGatewayId != null ? this.transitGatewayId.hashCode() : 0);
            result = 31 * result + (this.tunnel1InsideCidr != null ? this.tunnel1InsideCidr.hashCode() : 0);
            result = 31 * result + (this.tunnel1PresharedKey != null ? this.tunnel1PresharedKey.hashCode() : 0);
            result = 31 * result + (this.tunnel2InsideCidr != null ? this.tunnel2InsideCidr.hashCode() : 0);
            result = 31 * result + (this.tunnel2PresharedKey != null ? this.tunnel2PresharedKey.hashCode() : 0);
            result = 31 * result + (this.vpnGatewayId != null ? this.vpnGatewayId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
