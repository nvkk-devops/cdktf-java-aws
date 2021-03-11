package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.611Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IamAccountPasswordPolicy")
public class IamAccountPasswordPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected IamAccountPasswordPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IamAccountPasswordPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public IamAccountPasswordPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.IamAccountPasswordPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public IamAccountPasswordPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAllowUsersToChangePassword() {
        software.amazon.jsii.Kernel.call(this, "resetAllowUsersToChangePassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHardExpiry() {
        software.amazon.jsii.Kernel.call(this, "resetHardExpiry", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxPasswordAge() {
        software.amazon.jsii.Kernel.call(this, "resetMaxPasswordAge", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinimumPasswordLength() {
        software.amazon.jsii.Kernel.call(this, "resetMinimumPasswordLength", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPasswordReusePrevention() {
        software.amazon.jsii.Kernel.call(this, "resetPasswordReusePrevention", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequireLowercaseCharacters() {
        software.amazon.jsii.Kernel.call(this, "resetRequireLowercaseCharacters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequireNumbers() {
        software.amazon.jsii.Kernel.call(this, "resetRequireNumbers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequireSymbols() {
        software.amazon.jsii.Kernel.call(this, "resetRequireSymbols", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequireUppercaseCharacters() {
        software.amazon.jsii.Kernel.call(this, "resetRequireUppercaseCharacters", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getExpirePasswords() {
        return software.amazon.jsii.Kernel.get(this, "expirePasswords", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowUsersToChangePasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "allowUsersToChangePasswordInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getHardExpiryInput() {
        return software.amazon.jsii.Kernel.get(this, "hardExpiryInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxPasswordAgeInput() {
        return software.amazon.jsii.Kernel.get(this, "maxPasswordAgeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinimumPasswordLengthInput() {
        return software.amazon.jsii.Kernel.get(this, "minimumPasswordLengthInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPasswordReusePreventionInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordReusePreventionInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireLowercaseCharactersInput() {
        return software.amazon.jsii.Kernel.get(this, "requireLowercaseCharactersInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireNumbersInput() {
        return software.amazon.jsii.Kernel.get(this, "requireNumbersInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireSymbolsInput() {
        return software.amazon.jsii.Kernel.get(this, "requireSymbolsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireUppercaseCharactersInput() {
        return software.amazon.jsii.Kernel.get(this, "requireUppercaseCharactersInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowUsersToChangePassword() {
        return software.amazon.jsii.Kernel.get(this, "allowUsersToChangePassword", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowUsersToChangePassword(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowUsersToChangePassword", java.util.Objects.requireNonNull(value, "allowUsersToChangePassword is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getHardExpiry() {
        return software.amazon.jsii.Kernel.get(this, "hardExpiry", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setHardExpiry(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "hardExpiry", java.util.Objects.requireNonNull(value, "hardExpiry is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxPasswordAge() {
        return software.amazon.jsii.Kernel.get(this, "maxPasswordAge", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxPasswordAge(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxPasswordAge", java.util.Objects.requireNonNull(value, "maxPasswordAge is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinimumPasswordLength() {
        return software.amazon.jsii.Kernel.get(this, "minimumPasswordLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinimumPasswordLength(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minimumPasswordLength", java.util.Objects.requireNonNull(value, "minimumPasswordLength is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPasswordReusePrevention() {
        return software.amazon.jsii.Kernel.get(this, "passwordReusePrevention", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPasswordReusePrevention(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "passwordReusePrevention", java.util.Objects.requireNonNull(value, "passwordReusePrevention is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRequireLowercaseCharacters() {
        return software.amazon.jsii.Kernel.get(this, "requireLowercaseCharacters", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRequireLowercaseCharacters(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requireLowercaseCharacters", java.util.Objects.requireNonNull(value, "requireLowercaseCharacters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRequireNumbers() {
        return software.amazon.jsii.Kernel.get(this, "requireNumbers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRequireNumbers(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requireNumbers", java.util.Objects.requireNonNull(value, "requireNumbers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRequireSymbols() {
        return software.amazon.jsii.Kernel.get(this, "requireSymbols", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRequireSymbols(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requireSymbols", java.util.Objects.requireNonNull(value, "requireSymbols is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRequireUppercaseCharacters() {
        return software.amazon.jsii.Kernel.get(this, "requireUppercaseCharacters", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRequireUppercaseCharacters(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requireUppercaseCharacters", java.util.Objects.requireNonNull(value, "requireUppercaseCharacters is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.IamAccountPasswordPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.IamAccountPasswordPolicy> {
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
        private imports.aws.IamAccountPasswordPolicyConfig.Builder config;

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
         * @param allowUsersToChangePassword This parameter is required.
         */
        public Builder allowUsersToChangePassword(final java.lang.Boolean allowUsersToChangePassword) {
            this.config().allowUsersToChangePassword(allowUsersToChangePassword);
            return this;
        }

        /**
         * @return {@code this}
         * @param hardExpiry This parameter is required.
         */
        public Builder hardExpiry(final java.lang.Boolean hardExpiry) {
            this.config().hardExpiry(hardExpiry);
            return this;
        }

        /**
         * @return {@code this}
         * @param maxPasswordAge This parameter is required.
         */
        public Builder maxPasswordAge(final java.lang.Number maxPasswordAge) {
            this.config().maxPasswordAge(maxPasswordAge);
            return this;
        }

        /**
         * @return {@code this}
         * @param minimumPasswordLength This parameter is required.
         */
        public Builder minimumPasswordLength(final java.lang.Number minimumPasswordLength) {
            this.config().minimumPasswordLength(minimumPasswordLength);
            return this;
        }

        /**
         * @return {@code this}
         * @param passwordReusePrevention This parameter is required.
         */
        public Builder passwordReusePrevention(final java.lang.Number passwordReusePrevention) {
            this.config().passwordReusePrevention(passwordReusePrevention);
            return this;
        }

        /**
         * @return {@code this}
         * @param requireLowercaseCharacters This parameter is required.
         */
        public Builder requireLowercaseCharacters(final java.lang.Boolean requireLowercaseCharacters) {
            this.config().requireLowercaseCharacters(requireLowercaseCharacters);
            return this;
        }

        /**
         * @return {@code this}
         * @param requireNumbers This parameter is required.
         */
        public Builder requireNumbers(final java.lang.Boolean requireNumbers) {
            this.config().requireNumbers(requireNumbers);
            return this;
        }

        /**
         * @return {@code this}
         * @param requireSymbols This parameter is required.
         */
        public Builder requireSymbols(final java.lang.Boolean requireSymbols) {
            this.config().requireSymbols(requireSymbols);
            return this;
        }

        /**
         * @return {@code this}
         * @param requireUppercaseCharacters This parameter is required.
         */
        public Builder requireUppercaseCharacters(final java.lang.Boolean requireUppercaseCharacters) {
            this.config().requireUppercaseCharacters(requireUppercaseCharacters);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.IamAccountPasswordPolicy}.
         */
        @Override
        public imports.aws.IamAccountPasswordPolicy build() {
            return new imports.aws.IamAccountPasswordPolicy(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.IamAccountPasswordPolicyConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.IamAccountPasswordPolicyConfig.Builder();
            }
            return this.config;
        }
    }
}
