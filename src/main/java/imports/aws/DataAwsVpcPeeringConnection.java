package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.380Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsVpcPeeringConnection")
public class DataAwsVpcPeeringConnection extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsVpcPeeringConnection(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsVpcPeeringConnection(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsVpcPeeringConnection(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsVpcPeeringConnectionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsVpcPeeringConnection(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean accepter(final @org.jetbrains.annotations.NotNull java.lang.String key) {
        return software.amazon.jsii.Kernel.call(this, "accepter", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class), new Object[] { java.util.Objects.requireNonNull(key, "key is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean requester(final @org.jetbrains.annotations.NotNull java.lang.String key) {
        return software.amazon.jsii.Kernel.call(this, "requester", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class), new Object[] { java.util.Objects.requireNonNull(key, "key is required") });
    }

    public void resetCidrBlock() {
        software.amazon.jsii.Kernel.call(this, "resetCidrBlock", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOwnerId() {
        software.amazon.jsii.Kernel.call(this, "resetOwnerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerCidrBlock() {
        software.amazon.jsii.Kernel.call(this, "resetPeerCidrBlock", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerOwnerId() {
        software.amazon.jsii.Kernel.call(this, "resetPeerOwnerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerRegion() {
        software.amazon.jsii.Kernel.call(this, "resetPeerRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerVpcId() {
        software.amazon.jsii.Kernel.call(this, "resetPeerVpcId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatus() {
        software.amazon.jsii.Kernel.call(this, "resetStatus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcId() {
        software.amazon.jsii.Kernel.call(this, "resetVpcId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCidrBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "cidrBlockInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter> getFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter>)(software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsVpcPeeringConnectionFilter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerCidrBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "peerCidrBlockInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerOwnerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "peerOwnerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "peerRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "peerVpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cidrBlock", java.util.Objects.requireNonNull(value, "cidrBlock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter> getFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsVpcPeeringConnectionFilter.class))));
    }

    public void setFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter> value) {
        software.amazon.jsii.Kernel.set(this, "filter", java.util.Objects.requireNonNull(value, "filter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwnerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ownerId", java.util.Objects.requireNonNull(value, "ownerId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "peerCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeerCidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "peerCidrBlock", java.util.Objects.requireNonNull(value, "peerCidrBlock is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsVpcPeeringConnection}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsVpcPeeringConnection> {
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
        private imports.aws.DataAwsVpcPeeringConnectionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param cidrBlock This parameter is required.
         */
        public Builder cidrBlock(final java.lang.String cidrBlock) {
            this.config().cidrBlock(cidrBlock);
            return this;
        }

        /**
         * filter block.
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.DataAwsVpcPeeringConnectionFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * @return {@code this}
         * @param ownerId This parameter is required.
         */
        public Builder ownerId(final java.lang.String ownerId) {
            this.config().ownerId(ownerId);
            return this;
        }

        /**
         * @return {@code this}
         * @param peerCidrBlock This parameter is required.
         */
        public Builder peerCidrBlock(final java.lang.String peerCidrBlock) {
            this.config().peerCidrBlock(peerCidrBlock);
            return this;
        }

        /**
         * @return {@code this}
         * @param peerOwnerId This parameter is required.
         */
        public Builder peerOwnerId(final java.lang.String peerOwnerId) {
            this.config().peerOwnerId(peerOwnerId);
            return this;
        }

        /**
         * @return {@code this}
         * @param peerRegion This parameter is required.
         */
        public Builder peerRegion(final java.lang.String peerRegion) {
            this.config().peerRegion(peerRegion);
            return this;
        }

        /**
         * @return {@code this}
         * @param peerVpcId This parameter is required.
         */
        public Builder peerVpcId(final java.lang.String peerVpcId) {
            this.config().peerVpcId(peerVpcId);
            return this;
        }

        /**
         * @return {@code this}
         * @param region This parameter is required.
         */
        public Builder region(final java.lang.String region) {
            this.config().region(region);
            return this;
        }

        /**
         * @return {@code this}
         * @param status This parameter is required.
         */
        public Builder status(final java.lang.String status) {
            this.config().status(status);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpcId This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config().vpcId(vpcId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsVpcPeeringConnection}.
         */
        @Override
        public imports.aws.DataAwsVpcPeeringConnection build() {
            return new imports.aws.DataAwsVpcPeeringConnection(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsVpcPeeringConnectionConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsVpcPeeringConnectionConfig.Builder();
            }
            return this.config;
        }
    }
}
