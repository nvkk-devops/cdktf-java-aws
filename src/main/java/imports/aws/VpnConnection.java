package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.923Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpnConnection")
public class VpnConnection extends com.hashicorp.cdktf.TerraformResource {

    protected VpnConnection(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpnConnection(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public VpnConnection(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.VpnConnectionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetStaticRoutesOnly() {
        software.amazon.jsii.Kernel.call(this, "resetStaticRoutesOnly", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTransitGatewayId() {
        software.amazon.jsii.Kernel.call(this, "resetTransitGatewayId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTunnel1InsideCidr() {
        software.amazon.jsii.Kernel.call(this, "resetTunnel1InsideCidr", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTunnel1PresharedKey() {
        software.amazon.jsii.Kernel.call(this, "resetTunnel1PresharedKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTunnel2InsideCidr() {
        software.amazon.jsii.Kernel.call(this, "resetTunnel2InsideCidr", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTunnel2PresharedKey() {
        software.amazon.jsii.Kernel.call(this, "resetTunnel2PresharedKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpnGatewayId() {
        software.amazon.jsii.Kernel.call(this, "resetVpnGatewayId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.VpnConnectionRoutes routes(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "routes", software.amazon.jsii.NativeType.forClass(imports.aws.VpnConnectionRoutes.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.VpnConnectionVgwTelemetry vgwTelemetry(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "vgwTelemetry", software.amazon.jsii.NativeType.forClass(imports.aws.VpnConnectionVgwTelemetry.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomerGatewayConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "customerGatewayConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomerGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "customerGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTransitGatewayAttachmentId() {
        return software.amazon.jsii.Kernel.get(this, "transitGatewayAttachmentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel1Address() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1Address", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel1BgpAsn() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1BgpAsn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTunnel1BgpHoldtime() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1BgpHoldtime", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel1CgwInsideAddress() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1CgwInsideAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel1VgwInsideAddress() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1VgwInsideAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel2Address() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2Address", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel2BgpAsn() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2BgpAsn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTunnel2BgpHoldtime() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2BgpHoldtime", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel2CgwInsideAddress() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2CgwInsideAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel2VgwInsideAddress() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2VgwInsideAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getStaticRoutesOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "staticRoutesOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTransitGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "transitGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTunnel1InsideCidrInput() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1InsideCidrInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTunnel1PresharedKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1PresharedKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTunnel2InsideCidrInput() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2InsideCidrInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTunnel2PresharedKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2PresharedKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpnGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpnGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomerGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "customerGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomerGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customerGatewayId", java.util.Objects.requireNonNull(value, "customerGatewayId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getStaticRoutesOnly() {
        return software.amazon.jsii.Kernel.get(this, "staticRoutesOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setStaticRoutesOnly(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "staticRoutesOnly", java.util.Objects.requireNonNull(value, "staticRoutesOnly is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTransitGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "transitGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTransitGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "transitGatewayId", java.util.Objects.requireNonNull(value, "transitGatewayId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel1InsideCidr() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1InsideCidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTunnel1InsideCidr(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tunnel1InsideCidr", java.util.Objects.requireNonNull(value, "tunnel1InsideCidr is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel1PresharedKey() {
        return software.amazon.jsii.Kernel.get(this, "tunnel1PresharedKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTunnel1PresharedKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tunnel1PresharedKey", java.util.Objects.requireNonNull(value, "tunnel1PresharedKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel2InsideCidr() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2InsideCidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTunnel2InsideCidr(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tunnel2InsideCidr", java.util.Objects.requireNonNull(value, "tunnel2InsideCidr is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTunnel2PresharedKey() {
        return software.amazon.jsii.Kernel.get(this, "tunnel2PresharedKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTunnel2PresharedKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tunnel2PresharedKey", java.util.Objects.requireNonNull(value, "tunnel2PresharedKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpnGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "vpnGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpnGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpnGatewayId", java.util.Objects.requireNonNull(value, "vpnGatewayId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.VpnConnection}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.VpnConnection> {
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
        private final imports.aws.VpnConnectionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.VpnConnectionConfig.Builder();
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
         * @param customerGatewayId This parameter is required.
         */
        public Builder customerGatewayId(final java.lang.String customerGatewayId) {
            this.config.customerGatewayId(customerGatewayId);
            return this;
        }

        /**
         * @return {@code this}
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @return {@code this}
         * @param staticRoutesOnly This parameter is required.
         */
        public Builder staticRoutesOnly(final java.lang.Boolean staticRoutesOnly) {
            this.config.staticRoutesOnly(staticRoutesOnly);
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
         * @return {@code this}
         * @param transitGatewayId This parameter is required.
         */
        public Builder transitGatewayId(final java.lang.String transitGatewayId) {
            this.config.transitGatewayId(transitGatewayId);
            return this;
        }

        /**
         * @return {@code this}
         * @param tunnel1InsideCidr This parameter is required.
         */
        public Builder tunnel1InsideCidr(final java.lang.String tunnel1InsideCidr) {
            this.config.tunnel1InsideCidr(tunnel1InsideCidr);
            return this;
        }

        /**
         * @return {@code this}
         * @param tunnel1PresharedKey This parameter is required.
         */
        public Builder tunnel1PresharedKey(final java.lang.String tunnel1PresharedKey) {
            this.config.tunnel1PresharedKey(tunnel1PresharedKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param tunnel2InsideCidr This parameter is required.
         */
        public Builder tunnel2InsideCidr(final java.lang.String tunnel2InsideCidr) {
            this.config.tunnel2InsideCidr(tunnel2InsideCidr);
            return this;
        }

        /**
         * @return {@code this}
         * @param tunnel2PresharedKey This parameter is required.
         */
        public Builder tunnel2PresharedKey(final java.lang.String tunnel2PresharedKey) {
            this.config.tunnel2PresharedKey(tunnel2PresharedKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpnGatewayId This parameter is required.
         */
        public Builder vpnGatewayId(final java.lang.String vpnGatewayId) {
            this.config.vpnGatewayId(vpnGatewayId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.VpnConnection}.
         */
        @Override
        public imports.aws.VpnConnection build() {
            return new imports.aws.VpnConnection(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
