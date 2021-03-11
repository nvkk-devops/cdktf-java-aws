package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.170Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildWebhook")
public class CodebuildWebhook extends com.hashicorp.cdktf.TerraformResource {

    protected CodebuildWebhook(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildWebhook(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CodebuildWebhook(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CodebuildWebhookConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBranchFilter() {
        software.amazon.jsii.Kernel.call(this, "resetBranchFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilterGroup() {
        software.amazon.jsii.Kernel.call(this, "resetFilterGroup", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPayloadUrl() {
        return software.amazon.jsii.Kernel.get(this, "payloadUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProjectNameInput() {
        return software.amazon.jsii.Kernel.get(this, "projectNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBranchFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "branchFilterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildWebhookFilterGroup> getFilterGroupInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CodebuildWebhookFilterGroup>)(software.amazon.jsii.Kernel.get(this, "filterGroupInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildWebhookFilterGroup.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBranchFilter() {
        return software.amazon.jsii.Kernel.get(this, "branchFilter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBranchFilter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "branchFilter", java.util.Objects.requireNonNull(value, "branchFilter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildWebhookFilterGroup> getFilterGroup() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filterGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildWebhookFilterGroup.class))));
    }

    public void setFilterGroup(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodebuildWebhookFilterGroup> value) {
        software.amazon.jsii.Kernel.set(this, "filterGroup", java.util.Objects.requireNonNull(value, "filterGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProjectName() {
        return software.amazon.jsii.Kernel.get(this, "projectName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProjectName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "projectName", java.util.Objects.requireNonNull(value, "projectName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CodebuildWebhook}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CodebuildWebhook> {
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
        private final imports.aws.CodebuildWebhookConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CodebuildWebhookConfig.Builder();
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
         * @param projectName This parameter is required.
         */
        public Builder projectName(final java.lang.String projectName) {
            this.config.projectName(projectName);
            return this;
        }

        /**
         * @return {@code this}
         * @param branchFilter This parameter is required.
         */
        public Builder branchFilter(final java.lang.String branchFilter) {
            this.config.branchFilter(branchFilter);
            return this;
        }

        /**
         * filter_group block.
         * <p>
         * @return {@code this}
         * @param filterGroup filter_group block. This parameter is required.
         */
        public Builder filterGroup(final java.util.List<? extends imports.aws.CodebuildWebhookFilterGroup> filterGroup) {
            this.config.filterGroup(filterGroup);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CodebuildWebhook}.
         */
        @Override
        public imports.aws.CodebuildWebhook build() {
            return new imports.aws.CodebuildWebhook(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
