package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.512Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsCluster")
public class EcsCluster extends com.hashicorp.cdktf.TerraformResource {

    protected EcsCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public EcsCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.EcsClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCapacityProviders() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityProviders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultCapacityProviderStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSetting() {
        software.amazon.jsii.Kernel.call(this, "resetSetting", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCapacityProvidersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "capacityProvidersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsClusterDefaultCapacityProviderStrategy> getDefaultCapacityProviderStrategyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsClusterDefaultCapacityProviderStrategy>)(software.amazon.jsii.Kernel.get(this, "defaultCapacityProviderStrategyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsClusterDefaultCapacityProviderStrategy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsClusterSetting> getSettingInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsClusterSetting>)(software.amazon.jsii.Kernel.get(this, "settingInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsClusterSetting.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCapacityProviders() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "capacityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCapacityProviders(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "capacityProviders", java.util.Objects.requireNonNull(value, "capacityProviders is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsClusterDefaultCapacityProviderStrategy> getDefaultCapacityProviderStrategy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "defaultCapacityProviderStrategy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsClusterDefaultCapacityProviderStrategy.class))));
    }

    public void setDefaultCapacityProviderStrategy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsClusterDefaultCapacityProviderStrategy> value) {
        software.amazon.jsii.Kernel.set(this, "defaultCapacityProviderStrategy", java.util.Objects.requireNonNull(value, "defaultCapacityProviderStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsClusterSetting> getSetting() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "setting", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsClusterSetting.class))));
    }

    public void setSetting(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsClusterSetting> value) {
        software.amazon.jsii.Kernel.set(this, "setting", java.util.Objects.requireNonNull(value, "setting is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.EcsCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.EcsCluster> {
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
        private final imports.aws.EcsClusterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.EcsClusterConfig.Builder();
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
         * @return {@code this}
         * @param capacityProviders This parameter is required.
         */
        public Builder capacityProviders(final java.util.List<java.lang.String> capacityProviders) {
            this.config.capacityProviders(capacityProviders);
            return this;
        }

        /**
         * default_capacity_provider_strategy block.
         * <p>
         * @return {@code this}
         * @param defaultCapacityProviderStrategy default_capacity_provider_strategy block. This parameter is required.
         */
        public Builder defaultCapacityProviderStrategy(final java.util.List<? extends imports.aws.EcsClusterDefaultCapacityProviderStrategy> defaultCapacityProviderStrategy) {
            this.config.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
            return this;
        }

        /**
         * setting block.
         * <p>
         * @return {@code this}
         * @param setting setting block. This parameter is required.
         */
        public Builder setting(final java.util.List<? extends imports.aws.EcsClusterSetting> setting) {
            this.config.setting(setting);
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
         * @returns a newly built instance of {@link imports.aws.EcsCluster}.
         */
        @Override
        public imports.aws.EcsCluster build() {
            return new imports.aws.EcsCluster(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
