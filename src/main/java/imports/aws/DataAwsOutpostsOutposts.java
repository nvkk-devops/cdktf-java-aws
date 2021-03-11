package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.344Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsOutpostsOutposts")
public class DataAwsOutpostsOutposts extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsOutpostsOutposts(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsOutpostsOutposts(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsOutpostsOutposts(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsOutpostsOutpostsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsOutpostsOutposts(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAvailabilityZone() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAvailabilityZoneId() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZoneId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSiteId() {
        software.amazon.jsii.Kernel.call(this, "resetSiteId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "arns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneIdInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSiteIdInput() {
        return software.amazon.jsii.Kernel.get(this, "siteIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZone", java.util.Objects.requireNonNull(value, "availabilityZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZoneId() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZoneId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZoneId", java.util.Objects.requireNonNull(value, "availabilityZoneId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSiteId() {
        return software.amazon.jsii.Kernel.get(this, "siteId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSiteId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "siteId", java.util.Objects.requireNonNull(value, "siteId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsOutpostsOutposts}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsOutpostsOutposts> {
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
        private imports.aws.DataAwsOutpostsOutpostsConfig.Builder config;

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
         * @param availabilityZone This parameter is required.
         */
        public Builder availabilityZone(final java.lang.String availabilityZone) {
            this.config().availabilityZone(availabilityZone);
            return this;
        }

        /**
         * @return {@code this}
         * @param availabilityZoneId This parameter is required.
         */
        public Builder availabilityZoneId(final java.lang.String availabilityZoneId) {
            this.config().availabilityZoneId(availabilityZoneId);
            return this;
        }

        /**
         * @return {@code this}
         * @param siteId This parameter is required.
         */
        public Builder siteId(final java.lang.String siteId) {
            this.config().siteId(siteId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsOutpostsOutposts}.
         */
        @Override
        public imports.aws.DataAwsOutpostsOutposts build() {
            return new imports.aws.DataAwsOutpostsOutposts(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsOutpostsOutpostsConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsOutpostsOutpostsConfig.Builder();
            }
            return this.config;
        }
    }
}
