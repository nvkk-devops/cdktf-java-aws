package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.840Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SagemakerModel")
public class SagemakerModel extends com.hashicorp.cdktf.TerraformResource {

    protected SagemakerModel(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerModel(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SagemakerModel(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SagemakerModelConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetContainer() {
        software.amazon.jsii.Kernel.call(this, "resetContainer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableNetworkIsolation() {
        software.amazon.jsii.Kernel.call(this, "resetEnableNetworkIsolation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrimaryContainer() {
        software.amazon.jsii.Kernel.call(this, "resetPrimaryContainer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcConfig() {
        software.amazon.jsii.Kernel.call(this, "resetVpcConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SagemakerModelContainer> getContainerInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SagemakerModelContainer>)(software.amazon.jsii.Kernel.get(this, "containerInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelContainer.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableNetworkIsolationInput() {
        return software.amazon.jsii.Kernel.get(this, "enableNetworkIsolationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SagemakerModelPrimaryContainer> getPrimaryContainerInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SagemakerModelPrimaryContainer>)(software.amazon.jsii.Kernel.get(this, "primaryContainerInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelPrimaryContainer.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SagemakerModelVpcConfig> getVpcConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SagemakerModelVpcConfig>)(software.amazon.jsii.Kernel.get(this, "vpcConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelVpcConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SagemakerModelContainer> getContainer() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelContainer.class))));
    }

    public void setContainer(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SagemakerModelContainer> value) {
        software.amazon.jsii.Kernel.set(this, "container", java.util.Objects.requireNonNull(value, "container is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableNetworkIsolation() {
        return software.amazon.jsii.Kernel.get(this, "enableNetworkIsolation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableNetworkIsolation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableNetworkIsolation", java.util.Objects.requireNonNull(value, "enableNetworkIsolation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExecutionRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "executionRoleArn", java.util.Objects.requireNonNull(value, "executionRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SagemakerModelPrimaryContainer> getPrimaryContainer() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "primaryContainer", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelPrimaryContainer.class))));
    }

    public void setPrimaryContainer(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SagemakerModelPrimaryContainer> value) {
        software.amazon.jsii.Kernel.set(this, "primaryContainer", java.util.Objects.requireNonNull(value, "primaryContainer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SagemakerModelVpcConfig> getVpcConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelVpcConfig.class))));
    }

    public void setVpcConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SagemakerModelVpcConfig> value) {
        software.amazon.jsii.Kernel.set(this, "vpcConfig", java.util.Objects.requireNonNull(value, "vpcConfig is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SagemakerModel}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SagemakerModel> {
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
        private final imports.aws.SagemakerModelConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SagemakerModelConfig.Builder();
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
         * @param executionRoleArn This parameter is required.
         */
        public Builder executionRoleArn(final java.lang.String executionRoleArn) {
            this.config.executionRoleArn(executionRoleArn);
            return this;
        }

        /**
         * container block.
         * <p>
         * @return {@code this}
         * @param container container block. This parameter is required.
         */
        public Builder container(final java.util.List<? extends imports.aws.SagemakerModelContainer> container) {
            this.config.container(container);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableNetworkIsolation This parameter is required.
         */
        public Builder enableNetworkIsolation(final java.lang.Boolean enableNetworkIsolation) {
            this.config.enableNetworkIsolation(enableNetworkIsolation);
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
         * primary_container block.
         * <p>
         * @return {@code this}
         * @param primaryContainer primary_container block. This parameter is required.
         */
        public Builder primaryContainer(final java.util.List<? extends imports.aws.SagemakerModelPrimaryContainer> primaryContainer) {
            this.config.primaryContainer(primaryContainer);
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
         * vpc_config block.
         * <p>
         * @return {@code this}
         * @param vpcConfig vpc_config block. This parameter is required.
         */
        public Builder vpcConfig(final java.util.List<? extends imports.aws.SagemakerModelVpcConfig> vpcConfig) {
            this.config.vpcConfig(vpcConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SagemakerModel}.
         */
        @Override
        public imports.aws.SagemakerModel build() {
            return new imports.aws.SagemakerModel(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
