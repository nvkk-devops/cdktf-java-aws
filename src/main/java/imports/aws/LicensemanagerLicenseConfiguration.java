package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.704Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LicensemanagerLicenseConfiguration")
public class LicensemanagerLicenseConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected LicensemanagerLicenseConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LicensemanagerLicenseConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LicensemanagerLicenseConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.LicensemanagerLicenseConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseCount() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseCountHardLimit() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseCountHardLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseRules() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseRules", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLicenseCountingTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountingTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getLicenseCountHardLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountHardLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getLicenseCountInput() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLicenseRulesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "licenseRulesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLicenseCount() {
        return software.amazon.jsii.Kernel.get(this, "licenseCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setLicenseCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "licenseCount", java.util.Objects.requireNonNull(value, "licenseCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getLicenseCountHardLimit() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountHardLimit", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setLicenseCountHardLimit(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "licenseCountHardLimit", java.util.Objects.requireNonNull(value, "licenseCountHardLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLicenseCountingType() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLicenseCountingType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "licenseCountingType", java.util.Objects.requireNonNull(value, "licenseCountingType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLicenseRules() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "licenseRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLicenseRules(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "licenseRules", java.util.Objects.requireNonNull(value, "licenseRules is required"));
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

    /**
     * A fluent builder for {@link imports.aws.LicensemanagerLicenseConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LicensemanagerLicenseConfiguration> {
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
        private final imports.aws.LicensemanagerLicenseConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.LicensemanagerLicenseConfigurationConfig.Builder();
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
         * @param licenseCountingType This parameter is required.
         */
        public Builder licenseCountingType(final java.lang.String licenseCountingType) {
            this.config.licenseCountingType(licenseCountingType);
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
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * @return {@code this}
         * @param licenseCount This parameter is required.
         */
        public Builder licenseCount(final java.lang.Number licenseCount) {
            this.config.licenseCount(licenseCount);
            return this;
        }

        /**
         * @return {@code this}
         * @param licenseCountHardLimit This parameter is required.
         */
        public Builder licenseCountHardLimit(final java.lang.Boolean licenseCountHardLimit) {
            this.config.licenseCountHardLimit(licenseCountHardLimit);
            return this;
        }

        /**
         * @return {@code this}
         * @param licenseRules This parameter is required.
         */
        public Builder licenseRules(final java.util.List<java.lang.String> licenseRules) {
            this.config.licenseRules(licenseRules);
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
         * @returns a newly built instance of {@link imports.aws.LicensemanagerLicenseConfiguration}.
         */
        @Override
        public imports.aws.LicensemanagerLicenseConfiguration build() {
            return new imports.aws.LicensemanagerLicenseConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
