package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.172Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodecommitTrigger")
public class CodecommitTrigger extends com.hashicorp.cdktf.TerraformResource {

    protected CodecommitTrigger(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodecommitTrigger(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CodecommitTrigger(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CodecommitTriggerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationId() {
        return software.amazon.jsii.Kernel.get(this, "configurationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryNameInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodecommitTriggerTrigger> getTriggerInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "triggerInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodecommitTriggerTrigger.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryName() {
        return software.amazon.jsii.Kernel.get(this, "repositoryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryName", java.util.Objects.requireNonNull(value, "repositoryName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodecommitTriggerTrigger> getTrigger() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "trigger", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodecommitTriggerTrigger.class))));
    }

    public void setTrigger(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodecommitTriggerTrigger> value) {
        software.amazon.jsii.Kernel.set(this, "trigger", java.util.Objects.requireNonNull(value, "trigger is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CodecommitTrigger}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CodecommitTrigger> {
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
        private final imports.aws.CodecommitTriggerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CodecommitTriggerConfig.Builder();
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
         * @param repositoryName This parameter is required.
         */
        public Builder repositoryName(final java.lang.String repositoryName) {
            this.config.repositoryName(repositoryName);
            return this;
        }

        /**
         * trigger block.
         * <p>
         * @return {@code this}
         * @param trigger trigger block. This parameter is required.
         */
        public Builder trigger(final java.util.List<? extends imports.aws.CodecommitTriggerTrigger> trigger) {
            this.config.trigger(trigger);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CodecommitTrigger}.
         */
        @Override
        public imports.aws.CodecommitTrigger build() {
            return new imports.aws.CodecommitTrigger(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
