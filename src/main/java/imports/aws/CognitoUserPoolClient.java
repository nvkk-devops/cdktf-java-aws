package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.195Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolClient")
public class CognitoUserPoolClient extends com.hashicorp.cdktf.TerraformResource {

    protected CognitoUserPoolClient(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoUserPoolClient(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CognitoUserPoolClient(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CognitoUserPoolClientConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllowedOauthFlows() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedOauthFlows", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedOauthFlowsUserPoolClient() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedOauthFlowsUserPoolClient", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedOauthScopes() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedOauthScopes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAnalyticsConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAnalyticsConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCallbackUrls() {
        software.amazon.jsii.Kernel.call(this, "resetCallbackUrls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultRedirectUri() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultRedirectUri", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExplicitAuthFlows() {
        software.amazon.jsii.Kernel.call(this, "resetExplicitAuthFlows", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGenerateSecret() {
        software.amazon.jsii.Kernel.call(this, "resetGenerateSecret", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogoutUrls() {
        software.amazon.jsii.Kernel.call(this, "resetLogoutUrls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreventUserExistenceErrors() {
        software.amazon.jsii.Kernel.call(this, "resetPreventUserExistenceErrors", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetReadAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRefreshTokenValidity() {
        software.amazon.jsii.Kernel.call(this, "resetRefreshTokenValidity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSupportedIdentityProviders() {
        software.amazon.jsii.Kernel.call(this, "resetSupportedIdentityProviders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWriteAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetWriteAttributes", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientSecret() {
        return software.amazon.jsii.Kernel.get(this, "clientSecret", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserPoolIdInput() {
        return software.amazon.jsii.Kernel.get(this, "userPoolIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOauthFlowsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedOauthFlowsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowedOauthFlowsUserPoolClientInput() {
        return software.amazon.jsii.Kernel.get(this, "allowedOauthFlowsUserPoolClientInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOauthScopesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedOauthScopesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration> getAnalyticsConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration>)(software.amazon.jsii.Kernel.get(this, "analyticsConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolClientAnalyticsConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCallbackUrlsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "callbackUrlsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultRedirectUriInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultRedirectUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExplicitAuthFlowsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "explicitAuthFlowsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getGenerateSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "generateSecretInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLogoutUrlsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "logoutUrlsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPreventUserExistenceErrorsInput() {
        return software.amazon.jsii.Kernel.get(this, "preventUserExistenceErrorsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getReadAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "readAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRefreshTokenValidityInput() {
        return software.amazon.jsii.Kernel.get(this, "refreshTokenValidityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSupportedIdentityProvidersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "supportedIdentityProvidersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getWriteAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "writeAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedOauthFlows() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedOauthFlows", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedOauthFlows(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedOauthFlows", java.util.Objects.requireNonNull(value, "allowedOauthFlows is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowedOauthFlowsUserPoolClient() {
        return software.amazon.jsii.Kernel.get(this, "allowedOauthFlowsUserPoolClient", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowedOauthFlowsUserPoolClient(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowedOauthFlowsUserPoolClient", java.util.Objects.requireNonNull(value, "allowedOauthFlowsUserPoolClient is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedOauthScopes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedOauthScopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedOauthScopes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedOauthScopes", java.util.Objects.requireNonNull(value, "allowedOauthScopes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration> getAnalyticsConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "analyticsConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolClientAnalyticsConfiguration.class))));
    }

    public void setAnalyticsConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "analyticsConfiguration", java.util.Objects.requireNonNull(value, "analyticsConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCallbackUrls() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "callbackUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCallbackUrls(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "callbackUrls", java.util.Objects.requireNonNull(value, "callbackUrls is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultRedirectUri() {
        return software.amazon.jsii.Kernel.get(this, "defaultRedirectUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultRedirectUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultRedirectUri", java.util.Objects.requireNonNull(value, "defaultRedirectUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExplicitAuthFlows() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "explicitAuthFlows", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExplicitAuthFlows(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "explicitAuthFlows", java.util.Objects.requireNonNull(value, "explicitAuthFlows is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getGenerateSecret() {
        return software.amazon.jsii.Kernel.get(this, "generateSecret", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setGenerateSecret(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "generateSecret", java.util.Objects.requireNonNull(value, "generateSecret is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLogoutUrls() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logoutUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLogoutUrls(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "logoutUrls", java.util.Objects.requireNonNull(value, "logoutUrls is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPreventUserExistenceErrors() {
        return software.amazon.jsii.Kernel.get(this, "preventUserExistenceErrors", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPreventUserExistenceErrors(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "preventUserExistenceErrors", java.util.Objects.requireNonNull(value, "preventUserExistenceErrors is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getReadAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "readAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setReadAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "readAttributes", java.util.Objects.requireNonNull(value, "readAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRefreshTokenValidity() {
        return software.amazon.jsii.Kernel.get(this, "refreshTokenValidity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRefreshTokenValidity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "refreshTokenValidity", java.util.Objects.requireNonNull(value, "refreshTokenValidity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSupportedIdentityProviders() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "supportedIdentityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSupportedIdentityProviders(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "supportedIdentityProviders", java.util.Objects.requireNonNull(value, "supportedIdentityProviders is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserPoolId() {
        return software.amazon.jsii.Kernel.get(this, "userPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserPoolId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userPoolId", java.util.Objects.requireNonNull(value, "userPoolId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getWriteAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "writeAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setWriteAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "writeAttributes", java.util.Objects.requireNonNull(value, "writeAttributes is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CognitoUserPoolClient}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CognitoUserPoolClient> {
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
        private final imports.aws.CognitoUserPoolClientConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CognitoUserPoolClientConfig.Builder();
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
         * @param userPoolId This parameter is required.
         */
        public Builder userPoolId(final java.lang.String userPoolId) {
            this.config.userPoolId(userPoolId);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowedOauthFlows This parameter is required.
         */
        public Builder allowedOauthFlows(final java.util.List<java.lang.String> allowedOauthFlows) {
            this.config.allowedOauthFlows(allowedOauthFlows);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowedOauthFlowsUserPoolClient This parameter is required.
         */
        public Builder allowedOauthFlowsUserPoolClient(final java.lang.Boolean allowedOauthFlowsUserPoolClient) {
            this.config.allowedOauthFlowsUserPoolClient(allowedOauthFlowsUserPoolClient);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowedOauthScopes This parameter is required.
         */
        public Builder allowedOauthScopes(final java.util.List<java.lang.String> allowedOauthScopes) {
            this.config.allowedOauthScopes(allowedOauthScopes);
            return this;
        }

        /**
         * analytics_configuration block.
         * <p>
         * @return {@code this}
         * @param analyticsConfiguration analytics_configuration block. This parameter is required.
         */
        public Builder analyticsConfiguration(final java.util.List<? extends imports.aws.CognitoUserPoolClientAnalyticsConfiguration> analyticsConfiguration) {
            this.config.analyticsConfiguration(analyticsConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param callbackUrls This parameter is required.
         */
        public Builder callbackUrls(final java.util.List<java.lang.String> callbackUrls) {
            this.config.callbackUrls(callbackUrls);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultRedirectUri This parameter is required.
         */
        public Builder defaultRedirectUri(final java.lang.String defaultRedirectUri) {
            this.config.defaultRedirectUri(defaultRedirectUri);
            return this;
        }

        /**
         * @return {@code this}
         * @param explicitAuthFlows This parameter is required.
         */
        public Builder explicitAuthFlows(final java.util.List<java.lang.String> explicitAuthFlows) {
            this.config.explicitAuthFlows(explicitAuthFlows);
            return this;
        }

        /**
         * @return {@code this}
         * @param generateSecret This parameter is required.
         */
        public Builder generateSecret(final java.lang.Boolean generateSecret) {
            this.config.generateSecret(generateSecret);
            return this;
        }

        /**
         * @return {@code this}
         * @param logoutUrls This parameter is required.
         */
        public Builder logoutUrls(final java.util.List<java.lang.String> logoutUrls) {
            this.config.logoutUrls(logoutUrls);
            return this;
        }

        /**
         * @return {@code this}
         * @param preventUserExistenceErrors This parameter is required.
         */
        public Builder preventUserExistenceErrors(final java.lang.String preventUserExistenceErrors) {
            this.config.preventUserExistenceErrors(preventUserExistenceErrors);
            return this;
        }

        /**
         * @return {@code this}
         * @param readAttributes This parameter is required.
         */
        public Builder readAttributes(final java.util.List<java.lang.String> readAttributes) {
            this.config.readAttributes(readAttributes);
            return this;
        }

        /**
         * @return {@code this}
         * @param refreshTokenValidity This parameter is required.
         */
        public Builder refreshTokenValidity(final java.lang.Number refreshTokenValidity) {
            this.config.refreshTokenValidity(refreshTokenValidity);
            return this;
        }

        /**
         * @return {@code this}
         * @param supportedIdentityProviders This parameter is required.
         */
        public Builder supportedIdentityProviders(final java.util.List<java.lang.String> supportedIdentityProviders) {
            this.config.supportedIdentityProviders(supportedIdentityProviders);
            return this;
        }

        /**
         * @return {@code this}
         * @param writeAttributes This parameter is required.
         */
        public Builder writeAttributes(final java.util.List<java.lang.String> writeAttributes) {
            this.config.writeAttributes(writeAttributes);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CognitoUserPoolClient}.
         */
        @Override
        public imports.aws.CognitoUserPoolClient build() {
            return new imports.aws.CognitoUserPoolClient(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
