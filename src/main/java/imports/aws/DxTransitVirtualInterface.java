package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.473Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DxTransitVirtualInterface")
public class DxTransitVirtualInterface extends com.hashicorp.cdktf.TerraformResource {

    protected DxTransitVirtualInterface(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DxTransitVirtualInterface(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DxTransitVirtualInterface(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DxTransitVirtualInterfaceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAmazonAddress() {
        software.amazon.jsii.Kernel.call(this, "resetAmazonAddress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBgpAuthKey() {
        software.amazon.jsii.Kernel.call(this, "resetBgpAuthKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomerAddress() {
        software.amazon.jsii.Kernel.call(this, "resetCustomerAddress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMtu() {
        software.amazon.jsii.Kernel.call(this, "resetMtu", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAddressFamilyInput() {
        return software.amazon.jsii.Kernel.get(this, "addressFamilyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAmazonSideAsn() {
        return software.amazon.jsii.Kernel.get(this, "amazonSideAsn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAwsDevice() {
        return software.amazon.jsii.Kernel.get(this, "awsDevice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBgpAsnInput() {
        return software.amazon.jsii.Kernel.get(this, "bgpAsnInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "dxGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getJumboFrameCapable() {
        return software.amazon.jsii.Kernel.get(this, "jumboFrameCapable", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVlanInput() {
        return software.amazon.jsii.Kernel.get(this, "vlanInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAmazonAddressInput() {
        return software.amazon.jsii.Kernel.get(this, "amazonAddressInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBgpAuthKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "bgpAuthKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomerAddressInput() {
        return software.amazon.jsii.Kernel.get(this, "customerAddressInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMtuInput() {
        return software.amazon.jsii.Kernel.get(this, "mtuInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DxTransitVirtualInterfaceTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.DxTransitVirtualInterfaceTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAddressFamily() {
        return software.amazon.jsii.Kernel.get(this, "addressFamily", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAddressFamily(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "addressFamily", java.util.Objects.requireNonNull(value, "addressFamily is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAmazonAddress() {
        return software.amazon.jsii.Kernel.get(this, "amazonAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAmazonAddress(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "amazonAddress", java.util.Objects.requireNonNull(value, "amazonAddress is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBgpAsn() {
        return software.amazon.jsii.Kernel.get(this, "bgpAsn", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBgpAsn(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "bgpAsn", java.util.Objects.requireNonNull(value, "bgpAsn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBgpAuthKey() {
        return software.amazon.jsii.Kernel.get(this, "bgpAuthKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBgpAuthKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bgpAuthKey", java.util.Objects.requireNonNull(value, "bgpAuthKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionId() {
        return software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectionId", java.util.Objects.requireNonNull(value, "connectionId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomerAddress() {
        return software.amazon.jsii.Kernel.get(this, "customerAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomerAddress(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customerAddress", java.util.Objects.requireNonNull(value, "customerAddress is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "dxGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDxGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dxGatewayId", java.util.Objects.requireNonNull(value, "dxGatewayId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMtu() {
        return software.amazon.jsii.Kernel.get(this, "mtu", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMtu(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "mtu", java.util.Objects.requireNonNull(value, "mtu is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DxTransitVirtualInterfaceTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DxTransitVirtualInterfaceTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.DxTransitVirtualInterfaceTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVlan() {
        return software.amazon.jsii.Kernel.get(this, "vlan", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setVlan(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "vlan", java.util.Objects.requireNonNull(value, "vlan is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DxTransitVirtualInterface}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DxTransitVirtualInterface> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.DxTransitVirtualInterfaceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DxTransitVirtualInterfaceConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param addressFamily This parameter is required.
         */
        public Builder addressFamily(final java.lang.String addressFamily) {
            this.config.addressFamily(addressFamily);
            return this;
        }

        /**
         * @return {@code this}
         * @param bgpAsn This parameter is required.
         */
        public Builder bgpAsn(final java.lang.Number bgpAsn) {
            this.config.bgpAsn(bgpAsn);
            return this;
        }

        /**
         * @return {@code this}
         * @param connectionId This parameter is required.
         */
        public Builder connectionId(final java.lang.String connectionId) {
            this.config.connectionId(connectionId);
            return this;
        }

        /**
         * @return {@code this}
         * @param dxGatewayId This parameter is required.
         */
        public Builder dxGatewayId(final java.lang.String dxGatewayId) {
            this.config.dxGatewayId(dxGatewayId);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param vlan This parameter is required.
         */
        public Builder vlan(final java.lang.Number vlan) {
            this.config.vlan(vlan);
            return this;
        }

        /**
         * @return {@code this}
         * @param amazonAddress This parameter is required.
         */
        public Builder amazonAddress(final java.lang.String amazonAddress) {
            this.config.amazonAddress(amazonAddress);
            return this;
        }

        /**
         * @return {@code this}
         * @param bgpAuthKey This parameter is required.
         */
        public Builder bgpAuthKey(final java.lang.String bgpAuthKey) {
            this.config.bgpAuthKey(bgpAuthKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param customerAddress This parameter is required.
         */
        public Builder customerAddress(final java.lang.String customerAddress) {
            this.config.customerAddress(customerAddress);
            return this;
        }

        /**
         * @return {@code this}
         * @param mtu This parameter is required.
         */
        public Builder mtu(final java.lang.Number mtu) {
            this.config.mtu(mtu);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.DxTransitVirtualInterfaceTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DxTransitVirtualInterface}.
         */
        @Override
        public imports.aws.DxTransitVirtualInterface build() {
            return new imports.aws.DxTransitVirtualInterface(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
