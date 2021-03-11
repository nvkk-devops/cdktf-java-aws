package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.620Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IamUserLoginProfile")
public class IamUserLoginProfile extends com.hashicorp.cdktf.TerraformResource {

    protected IamUserLoginProfile(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IamUserLoginProfile(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public IamUserLoginProfile(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.IamUserLoginProfileConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetPasswordLength() {
        software.amazon.jsii.Kernel.call(this, "resetPasswordLength", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPasswordResetRequired() {
        software.amazon.jsii.Kernel.call(this, "resetPasswordResetRequired", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncryptedPassword() {
        return software.amazon.jsii.Kernel.get(this, "encryptedPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyFingerprint() {
        return software.amazon.jsii.Kernel.get(this, "keyFingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPgpKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "pgpKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserInput() {
        return software.amazon.jsii.Kernel.get(this, "userInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPasswordLengthInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordLengthInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPasswordResetRequiredInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordResetRequiredInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPasswordLength() {
        return software.amazon.jsii.Kernel.get(this, "passwordLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPasswordLength(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "passwordLength", java.util.Objects.requireNonNull(value, "passwordLength is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getPasswordResetRequired() {
        return software.amazon.jsii.Kernel.get(this, "passwordResetRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPasswordResetRequired(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "passwordResetRequired", java.util.Objects.requireNonNull(value, "passwordResetRequired is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPgpKey() {
        return software.amazon.jsii.Kernel.get(this, "pgpKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPgpKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pgpKey", java.util.Objects.requireNonNull(value, "pgpKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUser() {
        return software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUser(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "user", java.util.Objects.requireNonNull(value, "user is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.IamUserLoginProfile}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.IamUserLoginProfile> {
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
        private final imports.aws.IamUserLoginProfileConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.IamUserLoginProfileConfig.Builder();
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
         * @param pgpKey This parameter is required.
         */
        public Builder pgpKey(final java.lang.String pgpKey) {
            this.config.pgpKey(pgpKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param user This parameter is required.
         */
        public Builder user(final java.lang.String user) {
            this.config.user(user);
            return this;
        }

        /**
         * @return {@code this}
         * @param passwordLength This parameter is required.
         */
        public Builder passwordLength(final java.lang.Number passwordLength) {
            this.config.passwordLength(passwordLength);
            return this;
        }

        /**
         * @return {@code this}
         * @param passwordResetRequired This parameter is required.
         */
        public Builder passwordResetRequired(final java.lang.Boolean passwordResetRequired) {
            this.config.passwordResetRequired(passwordResetRequired);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.IamUserLoginProfile}.
         */
        @Override
        public imports.aws.IamUserLoginProfile build() {
            return new imports.aws.IamUserLoginProfile(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
