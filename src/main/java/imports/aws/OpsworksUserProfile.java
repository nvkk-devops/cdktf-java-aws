package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.772Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksUserProfile")
public class OpsworksUserProfile extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksUserProfile(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksUserProfile(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public OpsworksUserProfile(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.OpsworksUserProfileConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllowSelfManagement() {
        software.amazon.jsii.Kernel.call(this, "resetAllowSelfManagement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSshPublicKey() {
        software.amazon.jsii.Kernel.call(this, "resetSshPublicKey", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "sshUsernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserArnInput() {
        return software.amazon.jsii.Kernel.get(this, "userArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowSelfManagementInput() {
        return software.amazon.jsii.Kernel.get(this, "allowSelfManagementInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSshPublicKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "sshPublicKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowSelfManagement() {
        return software.amazon.jsii.Kernel.get(this, "allowSelfManagement", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowSelfManagement(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowSelfManagement", java.util.Objects.requireNonNull(value, "allowSelfManagement is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshPublicKey() {
        return software.amazon.jsii.Kernel.get(this, "sshPublicKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSshPublicKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sshPublicKey", java.util.Objects.requireNonNull(value, "sshPublicKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshUsername() {
        return software.amazon.jsii.Kernel.get(this, "sshUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSshUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sshUsername", java.util.Objects.requireNonNull(value, "sshUsername is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserArn() {
        return software.amazon.jsii.Kernel.get(this, "userArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userArn", java.util.Objects.requireNonNull(value, "userArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.OpsworksUserProfile}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.OpsworksUserProfile> {
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
        private final imports.aws.OpsworksUserProfileConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.OpsworksUserProfileConfig.Builder();
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
         * @param sshUsername This parameter is required.
         */
        public Builder sshUsername(final java.lang.String sshUsername) {
            this.config.sshUsername(sshUsername);
            return this;
        }

        /**
         * @return {@code this}
         * @param userArn This parameter is required.
         */
        public Builder userArn(final java.lang.String userArn) {
            this.config.userArn(userArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowSelfManagement This parameter is required.
         */
        public Builder allowSelfManagement(final java.lang.Boolean allowSelfManagement) {
            this.config.allowSelfManagement(allowSelfManagement);
            return this;
        }

        /**
         * @return {@code this}
         * @param sshPublicKey This parameter is required.
         */
        public Builder sshPublicKey(final java.lang.String sshPublicKey) {
            this.config.sshPublicKey(sshPublicKey);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.OpsworksUserProfile}.
         */
        @Override
        public imports.aws.OpsworksUserProfile build() {
            return new imports.aws.OpsworksUserProfile(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
