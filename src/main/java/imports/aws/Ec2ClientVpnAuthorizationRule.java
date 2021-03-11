package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.484Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2ClientVpnAuthorizationRule")
public class Ec2ClientVpnAuthorizationRule extends com.hashicorp.cdktf.TerraformResource {

    protected Ec2ClientVpnAuthorizationRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2ClientVpnAuthorizationRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Ec2ClientVpnAuthorizationRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Ec2ClientVpnAuthorizationRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccessGroupId() {
        software.amazon.jsii.Kernel.call(this, "resetAccessGroupId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizeAllGroups() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizeAllGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientVpnEndpointIdInput() {
        return software.amazon.jsii.Kernel.get(this, "clientVpnEndpointIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetNetworkCidrInput() {
        return software.amazon.jsii.Kernel.get(this, "targetNetworkCidrInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessGroupIdInput() {
        return software.amazon.jsii.Kernel.get(this, "accessGroupIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAuthorizeAllGroupsInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizeAllGroupsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessGroupId() {
        return software.amazon.jsii.Kernel.get(this, "accessGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessGroupId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessGroupId", java.util.Objects.requireNonNull(value, "accessGroupId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAuthorizeAllGroups() {
        return software.amazon.jsii.Kernel.get(this, "authorizeAllGroups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAuthorizeAllGroups(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "authorizeAllGroups", java.util.Objects.requireNonNull(value, "authorizeAllGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientVpnEndpointId() {
        return software.amazon.jsii.Kernel.get(this, "clientVpnEndpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientVpnEndpointId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientVpnEndpointId", java.util.Objects.requireNonNull(value, "clientVpnEndpointId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetNetworkCidr() {
        return software.amazon.jsii.Kernel.get(this, "targetNetworkCidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetNetworkCidr(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetNetworkCidr", java.util.Objects.requireNonNull(value, "targetNetworkCidr is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Ec2ClientVpnAuthorizationRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Ec2ClientVpnAuthorizationRule> {
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
        private final imports.aws.Ec2ClientVpnAuthorizationRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Ec2ClientVpnAuthorizationRuleConfig.Builder();
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
         * @param clientVpnEndpointId This parameter is required.
         */
        public Builder clientVpnEndpointId(final java.lang.String clientVpnEndpointId) {
            this.config.clientVpnEndpointId(clientVpnEndpointId);
            return this;
        }

        /**
         * @return {@code this}
         * @param targetNetworkCidr This parameter is required.
         */
        public Builder targetNetworkCidr(final java.lang.String targetNetworkCidr) {
            this.config.targetNetworkCidr(targetNetworkCidr);
            return this;
        }

        /**
         * @return {@code this}
         * @param accessGroupId This parameter is required.
         */
        public Builder accessGroupId(final java.lang.String accessGroupId) {
            this.config.accessGroupId(accessGroupId);
            return this;
        }

        /**
         * @return {@code this}
         * @param authorizeAllGroups This parameter is required.
         */
        public Builder authorizeAllGroups(final java.lang.Boolean authorizeAllGroups) {
            this.config.authorizeAllGroups(authorizeAllGroups);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Ec2ClientVpnAuthorizationRule}.
         */
        @Override
        public imports.aws.Ec2ClientVpnAuthorizationRule build() {
            return new imports.aws.Ec2ClientVpnAuthorizationRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
