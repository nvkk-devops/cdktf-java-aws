package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.862Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesEventDestination")
public class SesEventDestination extends com.hashicorp.cdktf.TerraformResource {

    protected SesEventDestination(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesEventDestination(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SesEventDestination(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SesEventDestinationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCloudwatchDestination() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchDestination", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisDestination() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisDestination", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnsDestination() {
        software.amazon.jsii.Kernel.call(this, "resetSnsDestination", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationSetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationSetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMatchingTypesInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "matchingTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesEventDestinationCloudwatchDestination> getCloudwatchDestinationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesEventDestinationCloudwatchDestination>)(software.amazon.jsii.Kernel.get(this, "cloudwatchDestinationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationCloudwatchDestination.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesEventDestinationKinesisDestination> getKinesisDestinationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesEventDestinationKinesisDestination>)(software.amazon.jsii.Kernel.get(this, "kinesisDestinationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationKinesisDestination.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesEventDestinationSnsDestination> getSnsDestinationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesEventDestinationSnsDestination>)(software.amazon.jsii.Kernel.get(this, "snsDestinationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationSnsDestination.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesEventDestinationCloudwatchDestination> getCloudwatchDestination() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cloudwatchDestination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationCloudwatchDestination.class))));
    }

    public void setCloudwatchDestination(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesEventDestinationCloudwatchDestination> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchDestination", java.util.Objects.requireNonNull(value, "cloudwatchDestination is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationSetName() {
        return software.amazon.jsii.Kernel.get(this, "configurationSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigurationSetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configurationSetName", java.util.Objects.requireNonNull(value, "configurationSetName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesEventDestinationKinesisDestination> getKinesisDestination() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "kinesisDestination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationKinesisDestination.class))));
    }

    public void setKinesisDestination(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesEventDestinationKinesisDestination> value) {
        software.amazon.jsii.Kernel.set(this, "kinesisDestination", java.util.Objects.requireNonNull(value, "kinesisDestination is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMatchingTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "matchingTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMatchingTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "matchingTypes", java.util.Objects.requireNonNull(value, "matchingTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesEventDestinationSnsDestination> getSnsDestination() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "snsDestination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationSnsDestination.class))));
    }

    public void setSnsDestination(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesEventDestinationSnsDestination> value) {
        software.amazon.jsii.Kernel.set(this, "snsDestination", java.util.Objects.requireNonNull(value, "snsDestination is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SesEventDestination}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SesEventDestination> {
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
        private final imports.aws.SesEventDestinationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SesEventDestinationConfig.Builder();
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
         * @param configurationSetName This parameter is required.
         */
        public Builder configurationSetName(final java.lang.String configurationSetName) {
            this.config.configurationSetName(configurationSetName);
            return this;
        }

        /**
         * @return {@code this}
         * @param matchingTypes This parameter is required.
         */
        public Builder matchingTypes(final java.util.List<java.lang.String> matchingTypes) {
            this.config.matchingTypes(matchingTypes);
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
         * cloudwatch_destination block.
         * <p>
         * @return {@code this}
         * @param cloudwatchDestination cloudwatch_destination block. This parameter is required.
         */
        public Builder cloudwatchDestination(final java.util.List<? extends imports.aws.SesEventDestinationCloudwatchDestination> cloudwatchDestination) {
            this.config.cloudwatchDestination(cloudwatchDestination);
            return this;
        }

        /**
         * @return {@code this}
         * @param enabled This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * kinesis_destination block.
         * <p>
         * @return {@code this}
         * @param kinesisDestination kinesis_destination block. This parameter is required.
         */
        public Builder kinesisDestination(final java.util.List<? extends imports.aws.SesEventDestinationKinesisDestination> kinesisDestination) {
            this.config.kinesisDestination(kinesisDestination);
            return this;
        }

        /**
         * sns_destination block.
         * <p>
         * @return {@code this}
         * @param snsDestination sns_destination block. This parameter is required.
         */
        public Builder snsDestination(final java.util.List<? extends imports.aws.SesEventDestinationSnsDestination> snsDestination) {
            this.config.snsDestination(snsDestination);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SesEventDestination}.
         */
        @Override
        public imports.aws.SesEventDestination build() {
            return new imports.aws.SesEventDestination(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
