package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.920Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcPeeringConnection")
public class VpcPeeringConnection extends com.hashicorp.cdktf.TerraformResource {

    protected VpcPeeringConnection(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpcPeeringConnection(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public VpcPeeringConnection(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.VpcPeeringConnectionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccepter() {
        software.amazon.jsii.Kernel.call(this, "resetAccepter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoAccept() {
        software.amazon.jsii.Kernel.call(this, "resetAutoAccept", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerOwnerId() {
        software.amazon.jsii.Kernel.call(this, "resetPeerOwnerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerRegion() {
        software.amazon.jsii.Kernel.call(this, "resetPeerRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequester() {
        software.amazon.jsii.Kernel.call(this, "resetRequester", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getAcceptStatus() {
        return software.amazon.jsii.Kernel.get(this, "acceptStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "peerVpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionAccepter> getAccepterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.VpcPeeringConnectionAccepter>)(software.amazon.jsii.Kernel.get(this, "accepterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionAccepter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoAcceptInput() {
        return software.amazon.jsii.Kernel.get(this, "autoAcceptInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerOwnerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "peerOwnerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "peerRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionRequester> getRequesterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.VpcPeeringConnectionRequester>)(software.amazon.jsii.Kernel.get(this, "requesterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionRequester.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.VpcPeeringConnectionTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionAccepter> getAccepter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accepter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionAccepter.class))));
    }

    public void setAccepter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionAccepter> value) {
        software.amazon.jsii.Kernel.set(this, "accepter", java.util.Objects.requireNonNull(value, "accepter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAutoAccept() {
        return software.amazon.jsii.Kernel.get(this, "autoAccept", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAutoAccept(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoAccept", java.util.Objects.requireNonNull(value, "autoAccept is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "peerOwnerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeerOwnerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "peerOwnerId", java.util.Objects.requireNonNull(value, "peerOwnerId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerRegion() {
        return software.amazon.jsii.Kernel.get(this, "peerRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeerRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "peerRegion", java.util.Objects.requireNonNull(value, "peerRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerVpcId() {
        return software.amazon.jsii.Kernel.get(this, "peerVpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeerVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "peerVpcId", java.util.Objects.requireNonNull(value, "peerVpcId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionRequester> getRequester() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "requester", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionRequester.class))));
    }

    public void setRequester(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionRequester> value) {
        software.amazon.jsii.Kernel.set(this, "requester", java.util.Objects.requireNonNull(value, "requester is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.VpcPeeringConnectionTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.VpcPeeringConnectionTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.VpcPeeringConnection}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.VpcPeeringConnection> {
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
        private final imports.aws.VpcPeeringConnectionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.VpcPeeringConnectionConfig.Builder();
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
         * @param peerVpcId This parameter is required.
         */
        public Builder peerVpcId(final java.lang.String peerVpcId) {
            this.config.peerVpcId(peerVpcId);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpcId This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config.vpcId(vpcId);
            return this;
        }

        /**
         * accepter block.
         * <p>
         * @return {@code this}
         * @param accepter accepter block. This parameter is required.
         */
        public Builder accepter(final java.util.List<? extends imports.aws.VpcPeeringConnectionAccepter> accepter) {
            this.config.accepter(accepter);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoAccept This parameter is required.
         */
        public Builder autoAccept(final java.lang.Boolean autoAccept) {
            this.config.autoAccept(autoAccept);
            return this;
        }

        /**
         * @return {@code this}
         * @param peerOwnerId This parameter is required.
         */
        public Builder peerOwnerId(final java.lang.String peerOwnerId) {
            this.config.peerOwnerId(peerOwnerId);
            return this;
        }

        /**
         * @return {@code this}
         * @param peerRegion This parameter is required.
         */
        public Builder peerRegion(final java.lang.String peerRegion) {
            this.config.peerRegion(peerRegion);
            return this;
        }

        /**
         * requester block.
         * <p>
         * @return {@code this}
         * @param requester requester block. This parameter is required.
         */
        public Builder requester(final java.util.List<? extends imports.aws.VpcPeeringConnectionRequester> requester) {
            this.config.requester(requester);
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
        public Builder timeouts(final imports.aws.VpcPeeringConnectionTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.VpcPeeringConnection}.
         */
        @Override
        public imports.aws.VpcPeeringConnection build() {
            return new imports.aws.VpcPeeringConnection(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
