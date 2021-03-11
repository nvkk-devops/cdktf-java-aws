package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.044Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncGraphqlApi")
public class AppsyncGraphqlApi extends com.hashicorp.cdktf.TerraformResource {

    protected AppsyncGraphqlApi(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncGraphqlApi(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AppsyncGraphqlApi(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AppsyncGraphqlApiConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAdditionalAuthenticationProvider() {
        software.amazon.jsii.Kernel.call(this, "resetAdditionalAuthenticationProvider", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLogConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOpenidConnectConfig() {
        software.amazon.jsii.Kernel.call(this, "resetOpenidConnectConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchema() {
        software.amazon.jsii.Kernel.call(this, "resetSchema", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserPoolConfig() {
        software.amazon.jsii.Kernel.call(this, "resetUserPoolConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetXrayEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetXrayEnabled", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String uris(final @org.jetbrains.annotations.NotNull java.lang.String key) {
        return software.amazon.jsii.Kernel.call(this, "uris", software.amazon.jsii.NativeType.forClass(java.lang.String.class), new Object[] { java.util.Objects.requireNonNull(key, "key is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> getAdditionalAuthenticationProviderInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider>)(software.amazon.jsii.Kernel.get(this, "additionalAuthenticationProviderInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiLogConfig> getLogConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncGraphqlApiLogConfig>)(software.amazon.jsii.Kernel.get(this, "logConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiLogConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig> getOpenidConnectConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig>)(software.amazon.jsii.Kernel.get(this, "openidConnectConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiOpenidConnectConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchemaInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig> getUserPoolConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig>)(software.amazon.jsii.Kernel.get(this, "userPoolConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiUserPoolConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getXrayEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "xrayEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> getAdditionalAuthenticationProvider() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "additionalAuthenticationProvider", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider.class))));
    }

    public void setAdditionalAuthenticationProvider(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> value) {
        software.amazon.jsii.Kernel.set(this, "additionalAuthenticationProvider", java.util.Objects.requireNonNull(value, "additionalAuthenticationProvider is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType() {
        return software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthenticationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authenticationType", java.util.Objects.requireNonNull(value, "authenticationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiLogConfig> getLogConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiLogConfig.class))));
    }

    public void setLogConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiLogConfig> value) {
        software.amazon.jsii.Kernel.set(this, "logConfig", java.util.Objects.requireNonNull(value, "logConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig> getOpenidConnectConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "openidConnectConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiOpenidConnectConfig.class))));
    }

    public void setOpenidConnectConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig> value) {
        software.amazon.jsii.Kernel.set(this, "openidConnectConfig", java.util.Objects.requireNonNull(value, "openidConnectConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchema() {
        return software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchema(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schema", java.util.Objects.requireNonNull(value, "schema is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig> getUserPoolConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "userPoolConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiUserPoolConfig.class))));
    }

    public void setUserPoolConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig> value) {
        software.amazon.jsii.Kernel.set(this, "userPoolConfig", java.util.Objects.requireNonNull(value, "userPoolConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getXrayEnabled() {
        return software.amazon.jsii.Kernel.get(this, "xrayEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setXrayEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "xrayEnabled", java.util.Objects.requireNonNull(value, "xrayEnabled is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AppsyncGraphqlApi}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AppsyncGraphqlApi> {
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
        private final imports.aws.AppsyncGraphqlApiConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AppsyncGraphqlApiConfig.Builder();
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
         * @param authenticationType This parameter is required.
         */
        public Builder authenticationType(final java.lang.String authenticationType) {
            this.config.authenticationType(authenticationType);
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
         * additional_authentication_provider block.
         * <p>
         * @return {@code this}
         * @param additionalAuthenticationProvider additional_authentication_provider block. This parameter is required.
         */
        public Builder additionalAuthenticationProvider(final java.util.List<? extends imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> additionalAuthenticationProvider) {
            this.config.additionalAuthenticationProvider(additionalAuthenticationProvider);
            return this;
        }

        /**
         * log_config block.
         * <p>
         * @return {@code this}
         * @param logConfig log_config block. This parameter is required.
         */
        public Builder logConfig(final java.util.List<? extends imports.aws.AppsyncGraphqlApiLogConfig> logConfig) {
            this.config.logConfig(logConfig);
            return this;
        }

        /**
         * openid_connect_config block.
         * <p>
         * @return {@code this}
         * @param openidConnectConfig openid_connect_config block. This parameter is required.
         */
        public Builder openidConnectConfig(final java.util.List<? extends imports.aws.AppsyncGraphqlApiOpenidConnectConfig> openidConnectConfig) {
            this.config.openidConnectConfig(openidConnectConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param schema This parameter is required.
         */
        public Builder schema(final java.lang.String schema) {
            this.config.schema(schema);
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
         * user_pool_config block.
         * <p>
         * @return {@code this}
         * @param userPoolConfig user_pool_config block. This parameter is required.
         */
        public Builder userPoolConfig(final java.util.List<? extends imports.aws.AppsyncGraphqlApiUserPoolConfig> userPoolConfig) {
            this.config.userPoolConfig(userPoolConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param xrayEnabled This parameter is required.
         */
        public Builder xrayEnabled(final java.lang.Boolean xrayEnabled) {
            this.config.xrayEnabled(xrayEnabled);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AppsyncGraphqlApi}.
         */
        @Override
        public imports.aws.AppsyncGraphqlApi build() {
            return new imports.aws.AppsyncGraphqlApi(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
