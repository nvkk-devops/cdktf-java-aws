package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.202Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigConfigurationAggregator")
public class ConfigConfigurationAggregator extends com.hashicorp.cdktf.TerraformResource {

    protected ConfigConfigurationAggregator(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConfigConfigurationAggregator(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ConfigConfigurationAggregator(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ConfigConfigurationAggregatorConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccountAggregationSource() {
        software.amazon.jsii.Kernel.call(this, "resetAccountAggregationSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrganizationAggregationSource() {
        software.amazon.jsii.Kernel.call(this, "resetOrganizationAggregationSource", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ConfigConfigurationAggregatorAccountAggregationSource> getAccountAggregationSourceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ConfigConfigurationAggregatorAccountAggregationSource>)(software.amazon.jsii.Kernel.get(this, "accountAggregationSourceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ConfigConfigurationAggregatorAccountAggregationSource.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ConfigConfigurationAggregatorOrganizationAggregationSource> getOrganizationAggregationSourceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ConfigConfigurationAggregatorOrganizationAggregationSource>)(software.amazon.jsii.Kernel.get(this, "organizationAggregationSourceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ConfigConfigurationAggregatorOrganizationAggregationSource.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ConfigConfigurationAggregatorAccountAggregationSource> getAccountAggregationSource() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accountAggregationSource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ConfigConfigurationAggregatorAccountAggregationSource.class))));
    }

    public void setAccountAggregationSource(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ConfigConfigurationAggregatorAccountAggregationSource> value) {
        software.amazon.jsii.Kernel.set(this, "accountAggregationSource", java.util.Objects.requireNonNull(value, "accountAggregationSource is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ConfigConfigurationAggregatorOrganizationAggregationSource> getOrganizationAggregationSource() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "organizationAggregationSource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ConfigConfigurationAggregatorOrganizationAggregationSource.class))));
    }

    public void setOrganizationAggregationSource(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ConfigConfigurationAggregatorOrganizationAggregationSource> value) {
        software.amazon.jsii.Kernel.set(this, "organizationAggregationSource", java.util.Objects.requireNonNull(value, "organizationAggregationSource is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ConfigConfigurationAggregator}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ConfigConfigurationAggregator> {
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
        private final imports.aws.ConfigConfigurationAggregatorConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ConfigConfigurationAggregatorConfig.Builder();
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
         * account_aggregation_source block.
         * <p>
         * @return {@code this}
         * @param accountAggregationSource account_aggregation_source block. This parameter is required.
         */
        public Builder accountAggregationSource(final java.util.List<? extends imports.aws.ConfigConfigurationAggregatorAccountAggregationSource> accountAggregationSource) {
            this.config.accountAggregationSource(accountAggregationSource);
            return this;
        }

        /**
         * organization_aggregation_source block.
         * <p>
         * @return {@code this}
         * @param organizationAggregationSource organization_aggregation_source block. This parameter is required.
         */
        public Builder organizationAggregationSource(final java.util.List<? extends imports.aws.ConfigConfigurationAggregatorOrganizationAggregationSource> organizationAggregationSource) {
            this.config.organizationAggregationSource(organizationAggregationSource);
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
         * @returns a newly built instance of {@link imports.aws.ConfigConfigurationAggregator}.
         */
        @Override
        public imports.aws.ConfigConfigurationAggregator build() {
            return new imports.aws.ConfigConfigurationAggregator(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
