package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.428Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DefaultVpc")
public class DefaultVpc extends com.hashicorp.cdktf.TerraformResource {

    protected DefaultVpc(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DefaultVpc(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DefaultVpc(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DefaultVpcConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DefaultVpc(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetEnableClassiclink() {
        software.amazon.jsii.Kernel.call(this, "resetEnableClassiclink", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableClassiclinkDnsSupport() {
        software.amazon.jsii.Kernel.call(this, "resetEnableClassiclinkDnsSupport", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableDnsHostnames() {
        software.amazon.jsii.Kernel.call(this, "resetEnableDnsHostnames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableDnsSupport() {
        software.amazon.jsii.Kernel.call(this, "resetEnableDnsSupport", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAssignGeneratedIpv6CidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "assignGeneratedIpv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultNetworkAclId() {
        return software.amazon.jsii.Kernel.get(this, "defaultNetworkAclId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultRouteTableId() {
        return software.amazon.jsii.Kernel.get(this, "defaultRouteTableId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultSecurityGroupId() {
        return software.amazon.jsii.Kernel.get(this, "defaultSecurityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDhcpOptionsId() {
        return software.amazon.jsii.Kernel.get(this, "dhcpOptionsId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceTenancy() {
        return software.amazon.jsii.Kernel.get(this, "instanceTenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpv6AssociationId() {
        return software.amazon.jsii.Kernel.get(this, "ipv6AssociationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpv6CidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "ipv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMainRouteTableId() {
        return software.amazon.jsii.Kernel.get(this, "mainRouteTableId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableClassiclinkDnsSupportInput() {
        return software.amazon.jsii.Kernel.get(this, "enableClassiclinkDnsSupportInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableClassiclinkInput() {
        return software.amazon.jsii.Kernel.get(this, "enableClassiclinkInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableDnsHostnamesInput() {
        return software.amazon.jsii.Kernel.get(this, "enableDnsHostnamesInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableDnsSupportInput() {
        return software.amazon.jsii.Kernel.get(this, "enableDnsSupportInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableClassiclink() {
        return software.amazon.jsii.Kernel.get(this, "enableClassiclink", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableClassiclink(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableClassiclink", java.util.Objects.requireNonNull(value, "enableClassiclink is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableClassiclinkDnsSupport() {
        return software.amazon.jsii.Kernel.get(this, "enableClassiclinkDnsSupport", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableClassiclinkDnsSupport(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableClassiclinkDnsSupport", java.util.Objects.requireNonNull(value, "enableClassiclinkDnsSupport is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableDnsHostnames() {
        return software.amazon.jsii.Kernel.get(this, "enableDnsHostnames", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableDnsHostnames(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableDnsHostnames", java.util.Objects.requireNonNull(value, "enableDnsHostnames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableDnsSupport() {
        return software.amazon.jsii.Kernel.get(this, "enableDnsSupport", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableDnsSupport(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableDnsSupport", java.util.Objects.requireNonNull(value, "enableDnsSupport is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DefaultVpc}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DefaultVpc> {
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
        private imports.aws.DefaultVpcConfig.Builder config;

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
         * @param enableClassiclink This parameter is required.
         */
        public Builder enableClassiclink(final java.lang.Boolean enableClassiclink) {
            this.config().enableClassiclink(enableClassiclink);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableClassiclinkDnsSupport This parameter is required.
         */
        public Builder enableClassiclinkDnsSupport(final java.lang.Boolean enableClassiclinkDnsSupport) {
            this.config().enableClassiclinkDnsSupport(enableClassiclinkDnsSupport);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableDnsHostnames This parameter is required.
         */
        public Builder enableDnsHostnames(final java.lang.Boolean enableDnsHostnames) {
            this.config().enableDnsHostnames(enableDnsHostnames);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableDnsSupport This parameter is required.
         */
        public Builder enableDnsSupport(final java.lang.Boolean enableDnsSupport) {
            this.config().enableDnsSupport(enableDnsSupport);
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
         * @returns a newly built instance of {@link imports.aws.DefaultVpc}.
         */
        @Override
        public imports.aws.DefaultVpc build() {
            return new imports.aws.DefaultVpc(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DefaultVpcConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DefaultVpcConfig.Builder();
            }
            return this.config;
        }
    }
}
