package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.649Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplication")
public class KinesisAnalyticsApplication extends com.hashicorp.cdktf.TerraformResource {

    protected KinesisAnalyticsApplication(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisAnalyticsApplication(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public KinesisAnalyticsApplication(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.KinesisAnalyticsApplicationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCloudwatchLoggingOptions() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchLoggingOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCode() {
        software.amazon.jsii.Kernel.call(this, "resetCode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInputs() {
        software.amazon.jsii.Kernel.call(this, "resetInputs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutputs() {
        software.amazon.jsii.Kernel.call(this, "resetOutputs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReferenceDataSources() {
        software.amazon.jsii.Kernel.call(this, "resetReferenceDataSources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreateTimestamp() {
        return software.amazon.jsii.Kernel.get(this, "createTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastUpdateTimestamp() {
        return software.amazon.jsii.Kernel.get(this, "lastUpdateTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> getCloudwatchLoggingOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions>)(software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCodeInput() {
        return software.amazon.jsii.Kernel.get(this, "codeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputs> getInputsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisAnalyticsApplicationInputs>)(software.amazon.jsii.Kernel.get(this, "inputsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputs.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs> getOutputsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs>)(software.amazon.jsii.Kernel.get(this, "outputsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationOutputs.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources> getReferenceDataSourcesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources>)(software.amazon.jsii.Kernel.get(this, "referenceDataSourcesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSources.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions.class))));
    }

    public void setCloudwatchLoggingOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLoggingOptions", java.util.Objects.requireNonNull(value, "cloudwatchLoggingOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCode() {
        return software.amazon.jsii.Kernel.get(this, "code", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "code", java.util.Objects.requireNonNull(value, "code is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationInputs> getInputs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "inputs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputs.class))));
    }

    public void setInputs(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationInputs> value) {
        software.amazon.jsii.Kernel.set(this, "inputs", java.util.Objects.requireNonNull(value, "inputs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs> getOutputs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "outputs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationOutputs.class))));
    }

    public void setOutputs(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs> value) {
        software.amazon.jsii.Kernel.set(this, "outputs", java.util.Objects.requireNonNull(value, "outputs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources> getReferenceDataSources() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "referenceDataSources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSources.class))));
    }

    public void setReferenceDataSources(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources> value) {
        software.amazon.jsii.Kernel.set(this, "referenceDataSources", java.util.Objects.requireNonNull(value, "referenceDataSources is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.KinesisAnalyticsApplication}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.KinesisAnalyticsApplication> {
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
        private final imports.aws.KinesisAnalyticsApplicationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.KinesisAnalyticsApplicationConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * cloudwatch_logging_options block.
         * <p>
         * @return {@code this}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block. This parameter is required.
         */
        public Builder cloudwatchLoggingOptions(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions) {
            this.config.cloudwatchLoggingOptions(cloudwatchLoggingOptions);
            return this;
        }

        /**
         * @return {@code this}
         * @param code This parameter is required.
         */
        public Builder code(final java.lang.String code) {
            this.config.code(code);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * inputs block.
         * <p>
         * @return {@code this}
         * @param inputs inputs block. This parameter is required.
         */
        public Builder inputs(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputs> inputs) {
            this.config.inputs(inputs);
            return this;
        }

        /**
         * outputs block.
         * <p>
         * @return {@code this}
         * @param outputs outputs block. This parameter is required.
         */
        public Builder outputs(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputs> outputs) {
            this.config.outputs(outputs);
            return this;
        }

        /**
         * reference_data_sources block.
         * <p>
         * @return {@code this}
         * @param referenceDataSources reference_data_sources block. This parameter is required.
         */
        public Builder referenceDataSources(final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSources> referenceDataSources) {
            this.config.referenceDataSources(referenceDataSources);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.KinesisAnalyticsApplication}.
         */
        @Override
        public imports.aws.KinesisAnalyticsApplication build() {
            return new imports.aws.KinesisAnalyticsApplication(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
