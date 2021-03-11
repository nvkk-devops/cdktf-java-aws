package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.607Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GuarddutyInviteAccepter")
public class GuarddutyInviteAccepter extends com.hashicorp.cdktf.TerraformResource {

    protected GuarddutyInviteAccepter(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GuarddutyInviteAccepter(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GuarddutyInviteAccepter(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GuarddutyInviteAccepterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDetectorIdInput() {
        return software.amazon.jsii.Kernel.get(this, "detectorIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "masterAccountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.GuarddutyInviteAccepterTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.GuarddutyInviteAccepterTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDetectorId() {
        return software.amazon.jsii.Kernel.get(this, "detectorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDetectorId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "detectorId", java.util.Objects.requireNonNull(value, "detectorId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterAccountId() {
        return software.amazon.jsii.Kernel.get(this, "masterAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMasterAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "masterAccountId", java.util.Objects.requireNonNull(value, "masterAccountId is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.GuarddutyInviteAccepterTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.GuarddutyInviteAccepterTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.GuarddutyInviteAccepterTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GuarddutyInviteAccepter}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GuarddutyInviteAccepter> {
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
        private final imports.aws.GuarddutyInviteAccepterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GuarddutyInviteAccepterConfig.Builder();
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
         * @param detectorId This parameter is required.
         */
        public Builder detectorId(final java.lang.String detectorId) {
            this.config.detectorId(detectorId);
            return this;
        }

        /**
         * @return {@code this}
         * @param masterAccountId This parameter is required.
         */
        public Builder masterAccountId(final java.lang.String masterAccountId) {
            this.config.masterAccountId(masterAccountId);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.GuarddutyInviteAccepterTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GuarddutyInviteAccepter}.
         */
        @Override
        public imports.aws.GuarddutyInviteAccepter build() {
            return new imports.aws.GuarddutyInviteAccepter(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
