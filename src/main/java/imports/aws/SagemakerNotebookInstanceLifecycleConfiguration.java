package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.841Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SagemakerNotebookInstanceLifecycleConfiguration")
public class SagemakerNotebookInstanceLifecycleConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected SagemakerNotebookInstanceLifecycleConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerNotebookInstanceLifecycleConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SagemakerNotebookInstanceLifecycleConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.SagemakerNotebookInstanceLifecycleConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public SagemakerNotebookInstanceLifecycleConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOnCreate() {
        software.amazon.jsii.Kernel.call(this, "resetOnCreate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOnStart() {
        software.amazon.jsii.Kernel.call(this, "resetOnStart", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOnCreateInput() {
        return software.amazon.jsii.Kernel.get(this, "onCreateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOnStartInput() {
        return software.amazon.jsii.Kernel.get(this, "onStartInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOnCreate() {
        return software.amazon.jsii.Kernel.get(this, "onCreate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOnCreate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "onCreate", java.util.Objects.requireNonNull(value, "onCreate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOnStart() {
        return software.amazon.jsii.Kernel.get(this, "onStart", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOnStart(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "onStart", java.util.Objects.requireNonNull(value, "onStart is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SagemakerNotebookInstanceLifecycleConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SagemakerNotebookInstanceLifecycleConfiguration> {
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
        private imports.aws.SagemakerNotebookInstanceLifecycleConfigurationConfig.Builder config;

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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param onCreate This parameter is required.
         */
        public Builder onCreate(final java.lang.String onCreate) {
            this.config().onCreate(onCreate);
            return this;
        }

        /**
         * @return {@code this}
         * @param onStart This parameter is required.
         */
        public Builder onStart(final java.lang.String onStart) {
            this.config().onStart(onStart);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SagemakerNotebookInstanceLifecycleConfiguration}.
         */
        @Override
        public imports.aws.SagemakerNotebookInstanceLifecycleConfiguration build() {
            return new imports.aws.SagemakerNotebookInstanceLifecycleConfiguration(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.SagemakerNotebookInstanceLifecycleConfigurationConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.SagemakerNotebookInstanceLifecycleConfigurationConfig.Builder();
            }
            return this.config;
        }
    }
}
