package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.995Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayUsagePlan")
public class ApiGatewayUsagePlan extends com.hashicorp.cdktf.TerraformResource {

    protected ApiGatewayUsagePlan(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayUsagePlan(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ApiGatewayUsagePlan(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ApiGatewayUsagePlanConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetApiStages() {
        software.amazon.jsii.Kernel.call(this, "resetApiStages", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProductCode() {
        software.amazon.jsii.Kernel.call(this, "resetProductCode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQuotaSettings() {
        software.amazon.jsii.Kernel.call(this, "resetQuotaSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThrottleSettings() {
        software.amazon.jsii.Kernel.call(this, "resetThrottleSettings", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayUsagePlanApiStages> getApiStagesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ApiGatewayUsagePlanApiStages>)(software.amazon.jsii.Kernel.get(this, "apiStagesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanApiStages.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProductCodeInput() {
        return software.amazon.jsii.Kernel.get(this, "productCodeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings> getQuotaSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings>)(software.amazon.jsii.Kernel.get(this, "quotaSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanQuotaSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings> getThrottleSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings>)(software.amazon.jsii.Kernel.get(this, "throttleSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanThrottleSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayUsagePlanApiStages> getApiStages() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "apiStages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanApiStages.class))));
    }

    public void setApiStages(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayUsagePlanApiStages> value) {
        software.amazon.jsii.Kernel.set(this, "apiStages", java.util.Objects.requireNonNull(value, "apiStages is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProductCode() {
        return software.amazon.jsii.Kernel.get(this, "productCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProductCode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "productCode", java.util.Objects.requireNonNull(value, "productCode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings> getQuotaSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "quotaSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanQuotaSettings.class))));
    }

    public void setQuotaSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings> value) {
        software.amazon.jsii.Kernel.set(this, "quotaSettings", java.util.Objects.requireNonNull(value, "quotaSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings> getThrottleSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "throttleSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanThrottleSettings.class))));
    }

    public void setThrottleSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings> value) {
        software.amazon.jsii.Kernel.set(this, "throttleSettings", java.util.Objects.requireNonNull(value, "throttleSettings is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ApiGatewayUsagePlan}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ApiGatewayUsagePlan> {
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
        private final imports.aws.ApiGatewayUsagePlanConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ApiGatewayUsagePlanConfig.Builder();
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
         * api_stages block.
         * <p>
         * @return {@code this}
         * @param apiStages api_stages block. This parameter is required.
         */
        public Builder apiStages(final java.util.List<? extends imports.aws.ApiGatewayUsagePlanApiStages> apiStages) {
            this.config.apiStages(apiStages);
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
         * @param productCode This parameter is required.
         */
        public Builder productCode(final java.lang.String productCode) {
            this.config.productCode(productCode);
            return this;
        }

        /**
         * quota_settings block.
         * <p>
         * @return {@code this}
         * @param quotaSettings quota_settings block. This parameter is required.
         */
        public Builder quotaSettings(final java.util.List<? extends imports.aws.ApiGatewayUsagePlanQuotaSettings> quotaSettings) {
            this.config.quotaSettings(quotaSettings);
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
         * throttle_settings block.
         * <p>
         * @return {@code this}
         * @param throttleSettings throttle_settings block. This parameter is required.
         */
        public Builder throttleSettings(final java.util.List<? extends imports.aws.ApiGatewayUsagePlanThrottleSettings> throttleSettings) {
            this.config.throttleSettings(throttleSettings);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ApiGatewayUsagePlan}.
         */
        @Override
        public imports.aws.ApiGatewayUsagePlan build() {
            return new imports.aws.ApiGatewayUsagePlan(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
