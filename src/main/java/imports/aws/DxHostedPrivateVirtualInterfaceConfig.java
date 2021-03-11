package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.459Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DxHostedPrivateVirtualInterfaceConfig")
@software.amazon.jsii.Jsii.Proxy(DxHostedPrivateVirtualInterfaceConfig.Jsii$Proxy.class)
public interface DxHostedPrivateVirtualInterfaceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAddressFamily();

    @org.jetbrains.annotations.NotNull java.lang.Number getBgpAsn();

    @org.jetbrains.annotations.NotNull java.lang.String getConnectionId();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getOwnerAccountId();

    @org.jetbrains.annotations.NotNull java.lang.Number getVlan();

    default @org.jetbrains.annotations.Nullable java.lang.String getAmazonAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBgpAuthKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomerAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMtu() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DxHostedPrivateVirtualInterfaceTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DxHostedPrivateVirtualInterfaceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DxHostedPrivateVirtualInterfaceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DxHostedPrivateVirtualInterfaceConfig> {
        private java.lang.String addressFamily;
        private java.lang.Number bgpAsn;
        private java.lang.String connectionId;
        private java.lang.String name;
        private java.lang.String ownerAccountId;
        private java.lang.Number vlan;
        private java.lang.String amazonAddress;
        private java.lang.String bgpAuthKey;
        private java.lang.String customerAddress;
        private java.lang.Number mtu;
        private imports.aws.DxHostedPrivateVirtualInterfaceTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getAddressFamily}
         * @param addressFamily the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder addressFamily(java.lang.String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getBgpAsn}
         * @param bgpAsn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bgpAsn(java.lang.Number bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getConnectionId}
         * @param connectionId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder connectionId(java.lang.String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getOwnerAccountId}
         * @param ownerAccountId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ownerAccountId(java.lang.String ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getVlan}
         * @param vlan the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder vlan(java.lang.Number vlan) {
            this.vlan = vlan;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getAmazonAddress}
         * @param amazonAddress the value to be set.
         * @return {@code this}
         */
        public Builder amazonAddress(java.lang.String amazonAddress) {
            this.amazonAddress = amazonAddress;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getBgpAuthKey}
         * @param bgpAuthKey the value to be set.
         * @return {@code this}
         */
        public Builder bgpAuthKey(java.lang.String bgpAuthKey) {
            this.bgpAuthKey = bgpAuthKey;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getCustomerAddress}
         * @param customerAddress the value to be set.
         * @return {@code this}
         */
        public Builder customerAddress(java.lang.String customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getMtu}
         * @param mtu the value to be set.
         * @return {@code this}
         */
        public Builder mtu(java.lang.Number mtu) {
            this.mtu = mtu;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DxHostedPrivateVirtualInterfaceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getDependsOn}
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
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DxHostedPrivateVirtualInterfaceConfig#getProvider}
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
         * @return a new instance of {@link DxHostedPrivateVirtualInterfaceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DxHostedPrivateVirtualInterfaceConfig build() {
            return new Jsii$Proxy(addressFamily, bgpAsn, connectionId, name, ownerAccountId, vlan, amazonAddress, bgpAuthKey, customerAddress, mtu, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DxHostedPrivateVirtualInterfaceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DxHostedPrivateVirtualInterfaceConfig {
        private final java.lang.String addressFamily;
        private final java.lang.Number bgpAsn;
        private final java.lang.String connectionId;
        private final java.lang.String name;
        private final java.lang.String ownerAccountId;
        private final java.lang.Number vlan;
        private final java.lang.String amazonAddress;
        private final java.lang.String bgpAuthKey;
        private final java.lang.String customerAddress;
        private final java.lang.Number mtu;
        private final imports.aws.DxHostedPrivateVirtualInterfaceTimeouts timeouts;
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
            this.addressFamily = software.amazon.jsii.Kernel.get(this, "addressFamily", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bgpAsn = software.amazon.jsii.Kernel.get(this, "bgpAsn", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.connectionId = software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ownerAccountId = software.amazon.jsii.Kernel.get(this, "ownerAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vlan = software.amazon.jsii.Kernel.get(this, "vlan", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.amazonAddress = software.amazon.jsii.Kernel.get(this, "amazonAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bgpAuthKey = software.amazon.jsii.Kernel.get(this, "bgpAuthKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customerAddress = software.amazon.jsii.Kernel.get(this, "customerAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mtu = software.amazon.jsii.Kernel.get(this, "mtu", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DxHostedPrivateVirtualInterfaceTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String addressFamily, final java.lang.Number bgpAsn, final java.lang.String connectionId, final java.lang.String name, final java.lang.String ownerAccountId, final java.lang.Number vlan, final java.lang.String amazonAddress, final java.lang.String bgpAuthKey, final java.lang.String customerAddress, final java.lang.Number mtu, final imports.aws.DxHostedPrivateVirtualInterfaceTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.addressFamily = java.util.Objects.requireNonNull(addressFamily, "addressFamily is required");
            this.bgpAsn = java.util.Objects.requireNonNull(bgpAsn, "bgpAsn is required");
            this.connectionId = java.util.Objects.requireNonNull(connectionId, "connectionId is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.ownerAccountId = java.util.Objects.requireNonNull(ownerAccountId, "ownerAccountId is required");
            this.vlan = java.util.Objects.requireNonNull(vlan, "vlan is required");
            this.amazonAddress = amazonAddress;
            this.bgpAuthKey = bgpAuthKey;
            this.customerAddress = customerAddress;
            this.mtu = mtu;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAddressFamily() {
            return this.addressFamily;
        }

        @Override
        public final java.lang.Number getBgpAsn() {
            return this.bgpAsn;
        }

        @Override
        public final java.lang.String getConnectionId() {
            return this.connectionId;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getOwnerAccountId() {
            return this.ownerAccountId;
        }

        @Override
        public final java.lang.Number getVlan() {
            return this.vlan;
        }

        @Override
        public final java.lang.String getAmazonAddress() {
            return this.amazonAddress;
        }

        @Override
        public final java.lang.String getBgpAuthKey() {
            return this.bgpAuthKey;
        }

        @Override
        public final java.lang.String getCustomerAddress() {
            return this.customerAddress;
        }

        @Override
        public final java.lang.Number getMtu() {
            return this.mtu;
        }

        @Override
        public final imports.aws.DxHostedPrivateVirtualInterfaceTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("addressFamily", om.valueToTree(this.getAddressFamily()));
            data.set("bgpAsn", om.valueToTree(this.getBgpAsn()));
            data.set("connectionId", om.valueToTree(this.getConnectionId()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("ownerAccountId", om.valueToTree(this.getOwnerAccountId()));
            data.set("vlan", om.valueToTree(this.getVlan()));
            if (this.getAmazonAddress() != null) {
                data.set("amazonAddress", om.valueToTree(this.getAmazonAddress()));
            }
            if (this.getBgpAuthKey() != null) {
                data.set("bgpAuthKey", om.valueToTree(this.getBgpAuthKey()));
            }
            if (this.getCustomerAddress() != null) {
                data.set("customerAddress", om.valueToTree(this.getCustomerAddress()));
            }
            if (this.getMtu() != null) {
                data.set("mtu", om.valueToTree(this.getMtu()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
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
            struct.set("fqn", om.valueToTree("aws.DxHostedPrivateVirtualInterfaceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DxHostedPrivateVirtualInterfaceConfig.Jsii$Proxy that = (DxHostedPrivateVirtualInterfaceConfig.Jsii$Proxy) o;

            if (!addressFamily.equals(that.addressFamily)) return false;
            if (!bgpAsn.equals(that.bgpAsn)) return false;
            if (!connectionId.equals(that.connectionId)) return false;
            if (!name.equals(that.name)) return false;
            if (!ownerAccountId.equals(that.ownerAccountId)) return false;
            if (!vlan.equals(that.vlan)) return false;
            if (this.amazonAddress != null ? !this.amazonAddress.equals(that.amazonAddress) : that.amazonAddress != null) return false;
            if (this.bgpAuthKey != null ? !this.bgpAuthKey.equals(that.bgpAuthKey) : that.bgpAuthKey != null) return false;
            if (this.customerAddress != null ? !this.customerAddress.equals(that.customerAddress) : that.customerAddress != null) return false;
            if (this.mtu != null ? !this.mtu.equals(that.mtu) : that.mtu != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.addressFamily.hashCode();
            result = 31 * result + (this.bgpAsn.hashCode());
            result = 31 * result + (this.connectionId.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.ownerAccountId.hashCode());
            result = 31 * result + (this.vlan.hashCode());
            result = 31 * result + (this.amazonAddress != null ? this.amazonAddress.hashCode() : 0);
            result = 31 * result + (this.bgpAuthKey != null ? this.bgpAuthKey.hashCode() : 0);
            result = 31 * result + (this.customerAddress != null ? this.customerAddress.hashCode() : 0);
            result = 31 * result + (this.mtu != null ? this.mtu.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
