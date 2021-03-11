package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.455Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DxGatewayAssociation")
public class DxGatewayAssociation extends com.hashicorp.cdktf.TerraformResource {

    protected DxGatewayAssociation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DxGatewayAssociation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DxGatewayAssociation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DxGatewayAssociationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllowedPrefixes() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedPrefixes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAssociatedGatewayId() {
        software.amazon.jsii.Kernel.call(this, "resetAssociatedGatewayId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAssociatedGatewayOwnerAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetAssociatedGatewayOwnerAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProposalId() {
        software.amazon.jsii.Kernel.call(this, "resetProposalId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpnGatewayId() {
        software.amazon.jsii.Kernel.call(this, "resetVpnGatewayId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAssociatedGatewayType() {
        return software.amazon.jsii.Kernel.get(this, "associatedGatewayType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayAssociationId() {
        return software.amazon.jsii.Kernel.get(this, "dxGatewayAssociationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "dxGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayOwnerAccountId() {
        return software.amazon.jsii.Kernel.get(this, "dxGatewayOwnerAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedPrefixesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedPrefixesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAssociatedGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "associatedGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAssociatedGatewayOwnerAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "associatedGatewayOwnerAccountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProposalIdInput() {
        return software.amazon.jsii.Kernel.get(this, "proposalIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DxGatewayAssociationTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.DxGatewayAssociationTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpnGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpnGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedPrefixes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedPrefixes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedPrefixes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedPrefixes", java.util.Objects.requireNonNull(value, "allowedPrefixes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAssociatedGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "associatedGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAssociatedGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "associatedGatewayId", java.util.Objects.requireNonNull(value, "associatedGatewayId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAssociatedGatewayOwnerAccountId() {
        return software.amazon.jsii.Kernel.get(this, "associatedGatewayOwnerAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAssociatedGatewayOwnerAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "associatedGatewayOwnerAccountId", java.util.Objects.requireNonNull(value, "associatedGatewayOwnerAccountId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "dxGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDxGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dxGatewayId", java.util.Objects.requireNonNull(value, "dxGatewayId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProposalId() {
        return software.amazon.jsii.Kernel.get(this, "proposalId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProposalId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "proposalId", java.util.Objects.requireNonNull(value, "proposalId is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DxGatewayAssociationTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DxGatewayAssociationTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.DxGatewayAssociationTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpnGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "vpnGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpnGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpnGatewayId", java.util.Objects.requireNonNull(value, "vpnGatewayId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DxGatewayAssociation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DxGatewayAssociation> {
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
        private final imports.aws.DxGatewayAssociationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DxGatewayAssociationConfig.Builder();
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
         * @param dxGatewayId This parameter is required.
         */
        public Builder dxGatewayId(final java.lang.String dxGatewayId) {
            this.config.dxGatewayId(dxGatewayId);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowedPrefixes This parameter is required.
         */
        public Builder allowedPrefixes(final java.util.List<java.lang.String> allowedPrefixes) {
            this.config.allowedPrefixes(allowedPrefixes);
            return this;
        }

        /**
         * @return {@code this}
         * @param associatedGatewayId This parameter is required.
         */
        public Builder associatedGatewayId(final java.lang.String associatedGatewayId) {
            this.config.associatedGatewayId(associatedGatewayId);
            return this;
        }

        /**
         * @return {@code this}
         * @param associatedGatewayOwnerAccountId This parameter is required.
         */
        public Builder associatedGatewayOwnerAccountId(final java.lang.String associatedGatewayOwnerAccountId) {
            this.config.associatedGatewayOwnerAccountId(associatedGatewayOwnerAccountId);
            return this;
        }

        /**
         * @return {@code this}
         * @param proposalId This parameter is required.
         */
        public Builder proposalId(final java.lang.String proposalId) {
            this.config.proposalId(proposalId);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.DxGatewayAssociationTimeouts timeouts) {
            this.config.timeouts(timeouts);
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
         * @returns a newly built instance of {@link imports.aws.DxGatewayAssociation}.
         */
        @Override
        public imports.aws.DxGatewayAssociation build() {
            return new imports.aws.DxGatewayAssociation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
