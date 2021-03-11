package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.054Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncResolver")
public class AppsyncResolver extends com.hashicorp.cdktf.TerraformResource {

    protected AppsyncResolver(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncResolver(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AppsyncResolver(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AppsyncResolverConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCachingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetCachingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataSource() {
        software.amazon.jsii.Kernel.call(this, "resetDataSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKind() {
        software.amazon.jsii.Kernel.call(this, "resetKind", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPipelineConfig() {
        software.amazon.jsii.Kernel.call(this, "resetPipelineConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "requestTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResponseTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "responseTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncResolverCachingConfig> getCachingConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncResolverCachingConfig>)(software.amazon.jsii.Kernel.get(this, "cachingConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncResolverCachingConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKindInput() {
        return software.amazon.jsii.Kernel.get(this, "kindInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncResolverPipelineConfig> getPipelineConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncResolverPipelineConfig>)(software.amazon.jsii.Kernel.get(this, "pipelineConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncResolverPipelineConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncResolverCachingConfig> getCachingConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cachingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncResolverCachingConfig.class))));
    }

    public void setCachingConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncResolverCachingConfig> value) {
        software.amazon.jsii.Kernel.set(this, "cachingConfig", java.util.Objects.requireNonNull(value, "cachingConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataSource() {
        return software.amazon.jsii.Kernel.get(this, "dataSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataSource(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataSource", java.util.Objects.requireNonNull(value, "dataSource is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getField() {
        return software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setField(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "field", java.util.Objects.requireNonNull(value, "field is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKind() {
        return software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKind(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kind", java.util.Objects.requireNonNull(value, "kind is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncResolverPipelineConfig> getPipelineConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "pipelineConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncResolverPipelineConfig.class))));
    }

    public void setPipelineConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncResolverPipelineConfig> value) {
        software.amazon.jsii.Kernel.set(this, "pipelineConfig", java.util.Objects.requireNonNull(value, "pipelineConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestTemplate() {
        return software.amazon.jsii.Kernel.get(this, "requestTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestTemplate", java.util.Objects.requireNonNull(value, "requestTemplate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResponseTemplate() {
        return software.amazon.jsii.Kernel.get(this, "responseTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResponseTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "responseTemplate", java.util.Objects.requireNonNull(value, "responseTemplate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AppsyncResolver}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AppsyncResolver> {
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
        private final imports.aws.AppsyncResolverConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AppsyncResolverConfig.Builder();
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
         * @param apiId This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
            return this;
        }

        /**
         * @return {@code this}
         * @param field This parameter is required.
         */
        public Builder field(final java.lang.String field) {
            this.config.field(field);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestTemplate This parameter is required.
         */
        public Builder requestTemplate(final java.lang.String requestTemplate) {
            this.config.requestTemplate(requestTemplate);
            return this;
        }

        /**
         * @return {@code this}
         * @param responseTemplate This parameter is required.
         */
        public Builder responseTemplate(final java.lang.String responseTemplate) {
            this.config.responseTemplate(responseTemplate);
            return this;
        }

        /**
         * @return {@code this}
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * caching_config block.
         * <p>
         * @return {@code this}
         * @param cachingConfig caching_config block. This parameter is required.
         */
        public Builder cachingConfig(final java.util.List<? extends imports.aws.AppsyncResolverCachingConfig> cachingConfig) {
            this.config.cachingConfig(cachingConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param dataSource This parameter is required.
         */
        public Builder dataSource(final java.lang.String dataSource) {
            this.config.dataSource(dataSource);
            return this;
        }

        /**
         * @return {@code this}
         * @param kind This parameter is required.
         */
        public Builder kind(final java.lang.String kind) {
            this.config.kind(kind);
            return this;
        }

        /**
         * pipeline_config block.
         * <p>
         * @return {@code this}
         * @param pipelineConfig pipeline_config block. This parameter is required.
         */
        public Builder pipelineConfig(final java.util.List<? extends imports.aws.AppsyncResolverPipelineConfig> pipelineConfig) {
            this.config.pipelineConfig(pipelineConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AppsyncResolver}.
         */
        @Override
        public imports.aws.AppsyncResolver build() {
            return new imports.aws.AppsyncResolver(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
