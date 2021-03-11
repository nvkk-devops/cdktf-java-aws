package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.158Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchLogDestinationPolicy")
public class CloudwatchLogDestinationPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected CloudwatchLogDestinationPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchLogDestinationPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CloudwatchLogDestinationPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CloudwatchLogDestinationPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "accessPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationNameInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessPolicy() {
        return software.amazon.jsii.Kernel.get(this, "accessPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessPolicy", java.util.Objects.requireNonNull(value, "accessPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationName() {
        return software.amazon.jsii.Kernel.get(this, "destinationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationName", java.util.Objects.requireNonNull(value, "destinationName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CloudwatchLogDestinationPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CloudwatchLogDestinationPolicy> {
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
        private final imports.aws.CloudwatchLogDestinationPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CloudwatchLogDestinationPolicyConfig.Builder();
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
         * @param accessPolicy This parameter is required.
         */
        public Builder accessPolicy(final java.lang.String accessPolicy) {
            this.config.accessPolicy(accessPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param destinationName This parameter is required.
         */
        public Builder destinationName(final java.lang.String destinationName) {
            this.config.destinationName(destinationName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CloudwatchLogDestinationPolicy}.
         */
        @Override
        public imports.aws.CloudwatchLogDestinationPolicy build() {
            return new imports.aws.CloudwatchLogDestinationPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
