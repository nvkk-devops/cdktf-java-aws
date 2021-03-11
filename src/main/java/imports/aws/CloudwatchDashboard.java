package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.133Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchDashboard")
public class CloudwatchDashboard extends com.hashicorp.cdktf.TerraformResource {

    protected CloudwatchDashboard(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchDashboard(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CloudwatchDashboard(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CloudwatchDashboardConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDashboardArn() {
        return software.amazon.jsii.Kernel.get(this, "dashboardArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDashboardBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "dashboardBodyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDashboardNameInput() {
        return software.amazon.jsii.Kernel.get(this, "dashboardNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDashboardBody() {
        return software.amazon.jsii.Kernel.get(this, "dashboardBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDashboardBody(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dashboardBody", java.util.Objects.requireNonNull(value, "dashboardBody is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDashboardName() {
        return software.amazon.jsii.Kernel.get(this, "dashboardName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDashboardName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dashboardName", java.util.Objects.requireNonNull(value, "dashboardName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CloudwatchDashboard}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CloudwatchDashboard> {
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
        private final imports.aws.CloudwatchDashboardConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CloudwatchDashboardConfig.Builder();
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
         * @param dashboardBody This parameter is required.
         */
        public Builder dashboardBody(final java.lang.String dashboardBody) {
            this.config.dashboardBody(dashboardBody);
            return this;
        }

        /**
         * @return {@code this}
         * @param dashboardName This parameter is required.
         */
        public Builder dashboardName(final java.lang.String dashboardName) {
            this.config.dashboardName(dashboardName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CloudwatchDashboard}.
         */
        @Override
        public imports.aws.CloudwatchDashboard build() {
            return new imports.aws.CloudwatchDashboard(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
