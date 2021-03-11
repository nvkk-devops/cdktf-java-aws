package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.189Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoIdentityPool")
public class CognitoIdentityPool extends com.hashicorp.cdktf.TerraformResource {

    protected CognitoIdentityPool(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoIdentityPool(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CognitoIdentityPool(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CognitoIdentityPoolConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllowUnauthenticatedIdentities() {
        software.amazon.jsii.Kernel.call(this, "resetAllowUnauthenticatedIdentities", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCognitoIdentityProviders() {
        software.amazon.jsii.Kernel.call(this, "resetCognitoIdentityProviders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeveloperProviderName() {
        software.amazon.jsii.Kernel.call(this, "resetDeveloperProviderName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOpenidConnectProviderArns() {
        software.amazon.jsii.Kernel.call(this, "resetOpenidConnectProviderArns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSamlProviderArns() {
        software.amazon.jsii.Kernel.call(this, "resetSamlProviderArns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSupportedLoginProviders() {
        software.amazon.jsii.Kernel.call(this, "resetSupportedLoginProviders", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentityPoolNameInput() {
        return software.amazon.jsii.Kernel.get(this, "identityPoolNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowUnauthenticatedIdentitiesInput() {
        return software.amazon.jsii.Kernel.get(this, "allowUnauthenticatedIdentitiesInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders> getCognitoIdentityProvidersInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders>)(software.amazon.jsii.Kernel.get(this, "cognitoIdentityProvidersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoIdentityPoolCognitoIdentityProviders.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeveloperProviderNameInput() {
        return software.amazon.jsii.Kernel.get(this, "developerProviderNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOpenidConnectProviderArnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "openidConnectProviderArnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSamlProviderArnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "samlProviderArnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSupportedLoginProvidersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "supportedLoginProvidersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowUnauthenticatedIdentities() {
        return software.amazon.jsii.Kernel.get(this, "allowUnauthenticatedIdentities", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowUnauthenticatedIdentities(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowUnauthenticatedIdentities", java.util.Objects.requireNonNull(value, "allowUnauthenticatedIdentities is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders> getCognitoIdentityProviders() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cognitoIdentityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoIdentityPoolCognitoIdentityProviders.class))));
    }

    public void setCognitoIdentityProviders(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders> value) {
        software.amazon.jsii.Kernel.set(this, "cognitoIdentityProviders", java.util.Objects.requireNonNull(value, "cognitoIdentityProviders is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeveloperProviderName() {
        return software.amazon.jsii.Kernel.get(this, "developerProviderName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeveloperProviderName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "developerProviderName", java.util.Objects.requireNonNull(value, "developerProviderName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentityPoolName() {
        return software.amazon.jsii.Kernel.get(this, "identityPoolName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentityPoolName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identityPoolName", java.util.Objects.requireNonNull(value, "identityPoolName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOpenidConnectProviderArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "openidConnectProviderArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setOpenidConnectProviderArns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "openidConnectProviderArns", java.util.Objects.requireNonNull(value, "openidConnectProviderArns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSamlProviderArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "samlProviderArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSamlProviderArns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "samlProviderArns", java.util.Objects.requireNonNull(value, "samlProviderArns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getSupportedLoginProviders() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "supportedLoginProviders", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSupportedLoginProviders(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "supportedLoginProviders", java.util.Objects.requireNonNull(value, "supportedLoginProviders is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CognitoIdentityPool}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CognitoIdentityPool> {
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
        private final imports.aws.CognitoIdentityPoolConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CognitoIdentityPoolConfig.Builder();
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
         * @param identityPoolName This parameter is required.
         */
        public Builder identityPoolName(final java.lang.String identityPoolName) {
            this.config.identityPoolName(identityPoolName);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowUnauthenticatedIdentities This parameter is required.
         */
        public Builder allowUnauthenticatedIdentities(final java.lang.Boolean allowUnauthenticatedIdentities) {
            this.config.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities);
            return this;
        }

        /**
         * cognito_identity_providers block.
         * <p>
         * @return {@code this}
         * @param cognitoIdentityProviders cognito_identity_providers block. This parameter is required.
         */
        public Builder cognitoIdentityProviders(final java.util.List<? extends imports.aws.CognitoIdentityPoolCognitoIdentityProviders> cognitoIdentityProviders) {
            this.config.cognitoIdentityProviders(cognitoIdentityProviders);
            return this;
        }

        /**
         * @return {@code this}
         * @param developerProviderName This parameter is required.
         */
        public Builder developerProviderName(final java.lang.String developerProviderName) {
            this.config.developerProviderName(developerProviderName);
            return this;
        }

        /**
         * @return {@code this}
         * @param openidConnectProviderArns This parameter is required.
         */
        public Builder openidConnectProviderArns(final java.util.List<java.lang.String> openidConnectProviderArns) {
            this.config.openidConnectProviderArns(openidConnectProviderArns);
            return this;
        }

        /**
         * @return {@code this}
         * @param samlProviderArns This parameter is required.
         */
        public Builder samlProviderArns(final java.util.List<java.lang.String> samlProviderArns) {
            this.config.samlProviderArns(samlProviderArns);
            return this;
        }

        /**
         * @return {@code this}
         * @param supportedLoginProviders This parameter is required.
         */
        public Builder supportedLoginProviders(final java.util.Map<java.lang.String, java.lang.String> supportedLoginProviders) {
            this.config.supportedLoginProviders(supportedLoginProviders);
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
         * @returns a newly built instance of {@link imports.aws.CognitoIdentityPool}.
         */
        @Override
        public imports.aws.CognitoIdentityPool build() {
            return new imports.aws.CognitoIdentityPool(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
