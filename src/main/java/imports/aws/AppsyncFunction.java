package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.043Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncFunction")
public class AppsyncFunction extends com.hashicorp.cdktf.TerraformResource {

    protected AppsyncFunction(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncFunction(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AppsyncFunction(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AppsyncFunctionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFunctionVersion() {
        software.amazon.jsii.Kernel.call(this, "resetFunctionVersion", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getDataSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionId() {
        return software.amazon.jsii.Kernel.get(this, "functionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestMappingTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "requestMappingTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResponseMappingTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "responseMappingTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFunctionVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "functionVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataSource() {
        return software.amazon.jsii.Kernel.get(this, "dataSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataSource(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataSource", java.util.Objects.requireNonNull(value, "dataSource is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionVersion() {
        return software.amazon.jsii.Kernel.get(this, "functionVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFunctionVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "functionVersion", java.util.Objects.requireNonNull(value, "functionVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestMappingTemplate() {
        return software.amazon.jsii.Kernel.get(this, "requestMappingTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestMappingTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestMappingTemplate", java.util.Objects.requireNonNull(value, "requestMappingTemplate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResponseMappingTemplate() {
        return software.amazon.jsii.Kernel.get(this, "responseMappingTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResponseMappingTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "responseMappingTemplate", java.util.Objects.requireNonNull(value, "responseMappingTemplate is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AppsyncFunction}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AppsyncFunction> {
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
        private final imports.aws.AppsyncFunctionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AppsyncFunctionConfig.Builder();
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
         * @param dataSource This parameter is required.
         */
        public Builder dataSource(final java.lang.String dataSource) {
            this.config.dataSource(dataSource);
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
         * @return {@code this}
         * @param requestMappingTemplate This parameter is required.
         */
        public Builder requestMappingTemplate(final java.lang.String requestMappingTemplate) {
            this.config.requestMappingTemplate(requestMappingTemplate);
            return this;
        }

        /**
         * @return {@code this}
         * @param responseMappingTemplate This parameter is required.
         */
        public Builder responseMappingTemplate(final java.lang.String responseMappingTemplate) {
            this.config.responseMappingTemplate(responseMappingTemplate);
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
         * @return {@code this}
         * @param functionVersion This parameter is required.
         */
        public Builder functionVersion(final java.lang.String functionVersion) {
            this.config.functionVersion(functionVersion);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AppsyncFunction}.
         */
        @Override
        public imports.aws.AppsyncFunction build() {
            return new imports.aws.AppsyncFunction(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
