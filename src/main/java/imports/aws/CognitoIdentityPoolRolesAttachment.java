package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.190Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoIdentityPoolRolesAttachment")
public class CognitoIdentityPoolRolesAttachment extends com.hashicorp.cdktf.TerraformResource {

    protected CognitoIdentityPoolRolesAttachment(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoIdentityPoolRolesAttachment(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CognitoIdentityPoolRolesAttachment(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CognitoIdentityPoolRolesAttachmentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetRoleMapping() {
        software.amazon.jsii.Kernel.call(this, "resetRoleMapping", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentityPoolIdInput() {
        return software.amazon.jsii.Kernel.get(this, "identityPoolIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRolesInput() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "rolesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMapping> getRoleMappingInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMapping>)(software.amazon.jsii.Kernel.get(this, "roleMappingInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoIdentityPoolRolesAttachmentRoleMapping.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentityPoolId() {
        return software.amazon.jsii.Kernel.get(this, "identityPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentityPoolId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identityPoolId", java.util.Objects.requireNonNull(value, "identityPoolId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMapping> getRoleMapping() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "roleMapping", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoIdentityPoolRolesAttachmentRoleMapping.class))));
    }

    public void setRoleMapping(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMapping> value) {
        software.amazon.jsii.Kernel.set(this, "roleMapping", java.util.Objects.requireNonNull(value, "roleMapping is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRoles() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "roles", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRoles(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "roles", java.util.Objects.requireNonNull(value, "roles is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CognitoIdentityPoolRolesAttachment}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CognitoIdentityPoolRolesAttachment> {
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
        private final imports.aws.CognitoIdentityPoolRolesAttachmentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CognitoIdentityPoolRolesAttachmentConfig.Builder();
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
         * @param identityPoolId This parameter is required.
         */
        public Builder identityPoolId(final java.lang.String identityPoolId) {
            this.config.identityPoolId(identityPoolId);
            return this;
        }

        /**
         * @return {@code this}
         * @param roles This parameter is required.
         */
        public Builder roles(final java.util.Map<java.lang.String, java.lang.String> roles) {
            this.config.roles(roles);
            return this;
        }

        /**
         * role_mapping block.
         * <p>
         * @return {@code this}
         * @param roleMapping role_mapping block. This parameter is required.
         */
        public Builder roleMapping(final java.util.List<? extends imports.aws.CognitoIdentityPoolRolesAttachmentRoleMapping> roleMapping) {
            this.config.roleMapping(roleMapping);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CognitoIdentityPoolRolesAttachment}.
         */
        @Override
        public imports.aws.CognitoIdentityPoolRolesAttachment build() {
            return new imports.aws.CognitoIdentityPoolRolesAttachment(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
