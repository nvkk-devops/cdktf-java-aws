package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.585Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlacierVaultLock")
public class GlacierVaultLock extends com.hashicorp.cdktf.TerraformResource {

    protected GlacierVaultLock(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlacierVaultLock(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GlacierVaultLock(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GlacierVaultLockConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetIgnoreDeletionError() {
        software.amazon.jsii.Kernel.call(this, "resetIgnoreDeletionError", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getCompleteLockInput() {
        return software.amazon.jsii.Kernel.get(this, "completeLockInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "policyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVaultNameInput() {
        return software.amazon.jsii.Kernel.get(this, "vaultNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreDeletionErrorInput() {
        return software.amazon.jsii.Kernel.get(this, "ignoreDeletionErrorInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getCompleteLock() {
        return software.amazon.jsii.Kernel.get(this, "completeLock", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCompleteLock(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "completeLock", java.util.Objects.requireNonNull(value, "completeLock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIgnoreDeletionError() {
        return software.amazon.jsii.Kernel.get(this, "ignoreDeletionError", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIgnoreDeletionError(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ignoreDeletionError", java.util.Objects.requireNonNull(value, "ignoreDeletionError is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", java.util.Objects.requireNonNull(value, "policy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVaultName() {
        return software.amazon.jsii.Kernel.get(this, "vaultName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVaultName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vaultName", java.util.Objects.requireNonNull(value, "vaultName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GlacierVaultLock}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GlacierVaultLock> {
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
        private final imports.aws.GlacierVaultLockConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GlacierVaultLockConfig.Builder();
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
         * @param completeLock This parameter is required.
         */
        public Builder completeLock(final java.lang.Boolean completeLock) {
            this.config.completeLock(completeLock);
            return this;
        }

        /**
         * @return {@code this}
         * @param policy This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config.policy(policy);
            return this;
        }

        /**
         * @return {@code this}
         * @param vaultName This parameter is required.
         */
        public Builder vaultName(final java.lang.String vaultName) {
            this.config.vaultName(vaultName);
            return this;
        }

        /**
         * @return {@code this}
         * @param ignoreDeletionError This parameter is required.
         */
        public Builder ignoreDeletionError(final java.lang.Boolean ignoreDeletionError) {
            this.config.ignoreDeletionError(ignoreDeletionError);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GlacierVaultLock}.
         */
        @Override
        public imports.aws.GlacierVaultLock build() {
            return new imports.aws.GlacierVaultLock(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
