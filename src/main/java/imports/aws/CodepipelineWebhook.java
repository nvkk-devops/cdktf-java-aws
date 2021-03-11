package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.181Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodepipelineWebhook")
public class CodepipelineWebhook extends com.hashicorp.cdktf.TerraformResource {

    protected CodepipelineWebhook(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodepipelineWebhook(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CodepipelineWebhook(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CodepipelineWebhookConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAuthenticationConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAuthenticationConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodepipelineWebhookFilter> getFilterInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodepipelineWebhookFilter.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetActionInput() {
        return software.amazon.jsii.Kernel.get(this, "targetActionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetPipelineInput() {
        return software.amazon.jsii.Kernel.get(this, "targetPipelineInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration> getAuthenticationConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration>)(software.amazon.jsii.Kernel.get(this, "authenticationConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodepipelineWebhookAuthenticationConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthentication() {
        return software.amazon.jsii.Kernel.get(this, "authentication", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthentication(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authentication", java.util.Objects.requireNonNull(value, "authentication is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration> getAuthenticationConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "authenticationConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodepipelineWebhookAuthenticationConfiguration.class))));
    }

    public void setAuthenticationConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "authenticationConfiguration", java.util.Objects.requireNonNull(value, "authenticationConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodepipelineWebhookFilter> getFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodepipelineWebhookFilter.class))));
    }

    public void setFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodepipelineWebhookFilter> value) {
        software.amazon.jsii.Kernel.set(this, "filter", java.util.Objects.requireNonNull(value, "filter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetAction() {
        return software.amazon.jsii.Kernel.get(this, "targetAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetAction", java.util.Objects.requireNonNull(value, "targetAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetPipeline() {
        return software.amazon.jsii.Kernel.get(this, "targetPipeline", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetPipeline(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetPipeline", java.util.Objects.requireNonNull(value, "targetPipeline is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CodepipelineWebhook}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CodepipelineWebhook> {
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
        private final imports.aws.CodepipelineWebhookConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CodepipelineWebhookConfig.Builder();
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
         * @param authentication This parameter is required.
         */
        public Builder authentication(final java.lang.String authentication) {
            this.config.authentication(authentication);
            return this;
        }

        /**
         * filter block.
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.CodepipelineWebhookFilter> filter) {
            this.config.filter(filter);
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
         * @param targetAction This parameter is required.
         */
        public Builder targetAction(final java.lang.String targetAction) {
            this.config.targetAction(targetAction);
            return this;
        }

        /**
         * @return {@code this}
         * @param targetPipeline This parameter is required.
         */
        public Builder targetPipeline(final java.lang.String targetPipeline) {
            this.config.targetPipeline(targetPipeline);
            return this;
        }

        /**
         * authentication_configuration block.
         * <p>
         * @return {@code this}
         * @param authenticationConfiguration authentication_configuration block. This parameter is required.
         */
        public Builder authenticationConfiguration(final java.util.List<? extends imports.aws.CodepipelineWebhookAuthenticationConfiguration> authenticationConfiguration) {
            this.config.authenticationConfiguration(authenticationConfiguration);
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
         * @returns a newly built instance of {@link imports.aws.CodepipelineWebhook}.
         */
        @Override
        public imports.aws.CodepipelineWebhook build() {
            return new imports.aws.CodepipelineWebhook(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
