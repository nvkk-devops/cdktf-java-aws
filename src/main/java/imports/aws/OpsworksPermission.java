package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.757Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksPermission")
public class OpsworksPermission extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksPermission(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksPermission(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public OpsworksPermission(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.OpsworksPermissionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllowSsh() {
        software.amazon.jsii.Kernel.call(this, "resetAllowSsh", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowSudo() {
        software.amazon.jsii.Kernel.call(this, "resetAllowSudo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLevel() {
        software.amazon.jsii.Kernel.call(this, "resetLevel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStackId() {
        software.amazon.jsii.Kernel.call(this, "resetStackId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserArnInput() {
        return software.amazon.jsii.Kernel.get(this, "userArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowSshInput() {
        return software.amazon.jsii.Kernel.get(this, "allowSshInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowSudoInput() {
        return software.amazon.jsii.Kernel.get(this, "allowSudoInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLevelInput() {
        return software.amazon.jsii.Kernel.get(this, "levelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStackIdInput() {
        return software.amazon.jsii.Kernel.get(this, "stackIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowSsh() {
        return software.amazon.jsii.Kernel.get(this, "allowSsh", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowSsh(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowSsh", java.util.Objects.requireNonNull(value, "allowSsh is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowSudo() {
        return software.amazon.jsii.Kernel.get(this, "allowSudo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowSudo(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowSudo", java.util.Objects.requireNonNull(value, "allowSudo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLevel() {
        return software.amazon.jsii.Kernel.get(this, "level", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLevel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "level", java.util.Objects.requireNonNull(value, "level is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackId() {
        return software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStackId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stackId", java.util.Objects.requireNonNull(value, "stackId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserArn() {
        return software.amazon.jsii.Kernel.get(this, "userArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userArn", java.util.Objects.requireNonNull(value, "userArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.OpsworksPermission}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.OpsworksPermission> {
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
        private final imports.aws.OpsworksPermissionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.OpsworksPermissionConfig.Builder();
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
         * @param userArn This parameter is required.
         */
        public Builder userArn(final java.lang.String userArn) {
            this.config.userArn(userArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowSsh This parameter is required.
         */
        public Builder allowSsh(final java.lang.Boolean allowSsh) {
            this.config.allowSsh(allowSsh);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowSudo This parameter is required.
         */
        public Builder allowSudo(final java.lang.Boolean allowSudo) {
            this.config.allowSudo(allowSudo);
            return this;
        }

        /**
         * @return {@code this}
         * @param level This parameter is required.
         */
        public Builder level(final java.lang.String level) {
            this.config.level(level);
            return this;
        }

        /**
         * @return {@code this}
         * @param stackId This parameter is required.
         */
        public Builder stackId(final java.lang.String stackId) {
            this.config.stackId(stackId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.OpsworksPermission}.
         */
        @Override
        public imports.aws.OpsworksPermission build() {
            return new imports.aws.OpsworksPermission(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
