package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.196Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolClientConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolClientConfig.Jsii$Proxy.class)
public interface CognitoUserPoolClientConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getUserPoolId();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOauthFlows() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowedOauthFlowsUserPoolClient() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOauthScopes() {
        return null;
    }

    /**
     * analytics_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration> getAnalyticsConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCallbackUrls() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRedirectUri() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExplicitAuthFlows() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getGenerateSecret() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLogoutUrls() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreventUserExistenceErrors() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getReadAttributes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRefreshTokenValidity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSupportedIdentityProviders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getWriteAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolClientConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolClientConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolClientConfig> {
        private java.lang.String name;
        private java.lang.String userPoolId;
        private java.util.List<java.lang.String> allowedOauthFlows;
        private java.lang.Boolean allowedOauthFlowsUserPoolClient;
        private java.util.List<java.lang.String> allowedOauthScopes;
        private java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration> analyticsConfiguration;
        private java.util.List<java.lang.String> callbackUrls;
        private java.lang.String defaultRedirectUri;
        private java.util.List<java.lang.String> explicitAuthFlows;
        private java.lang.Boolean generateSecret;
        private java.util.List<java.lang.String> logoutUrls;
        private java.lang.String preventUserExistenceErrors;
        private java.util.List<java.lang.String> readAttributes;
        private java.lang.Number refreshTokenValidity;
        private java.util.List<java.lang.String> supportedIdentityProviders;
        private java.util.List<java.lang.String> writeAttributes;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getUserPoolId}
         * @param userPoolId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userPoolId(java.lang.String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAllowedOauthFlows}
         * @param allowedOauthFlows the value to be set.
         * @return {@code this}
         */
        public Builder allowedOauthFlows(java.util.List<java.lang.String> allowedOauthFlows) {
            this.allowedOauthFlows = allowedOauthFlows;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAllowedOauthFlowsUserPoolClient}
         * @param allowedOauthFlowsUserPoolClient the value to be set.
         * @return {@code this}
         */
        public Builder allowedOauthFlowsUserPoolClient(java.lang.Boolean allowedOauthFlowsUserPoolClient) {
            this.allowedOauthFlowsUserPoolClient = allowedOauthFlowsUserPoolClient;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAllowedOauthScopes}
         * @param allowedOauthScopes the value to be set.
         * @return {@code this}
         */
        public Builder allowedOauthScopes(java.util.List<java.lang.String> allowedOauthScopes) {
            this.allowedOauthScopes = allowedOauthScopes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAnalyticsConfiguration}
         * @param analyticsConfiguration analytics_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder analyticsConfiguration(java.util.List<? extends imports.aws.CognitoUserPoolClientAnalyticsConfiguration> analyticsConfiguration) {
            this.analyticsConfiguration = (java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration>)analyticsConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getCallbackUrls}
         * @param callbackUrls the value to be set.
         * @return {@code this}
         */
        public Builder callbackUrls(java.util.List<java.lang.String> callbackUrls) {
            this.callbackUrls = callbackUrls;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getDefaultRedirectUri}
         * @param defaultRedirectUri the value to be set.
         * @return {@code this}
         */
        public Builder defaultRedirectUri(java.lang.String defaultRedirectUri) {
            this.defaultRedirectUri = defaultRedirectUri;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getExplicitAuthFlows}
         * @param explicitAuthFlows the value to be set.
         * @return {@code this}
         */
        public Builder explicitAuthFlows(java.util.List<java.lang.String> explicitAuthFlows) {
            this.explicitAuthFlows = explicitAuthFlows;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getGenerateSecret}
         * @param generateSecret the value to be set.
         * @return {@code this}
         */
        public Builder generateSecret(java.lang.Boolean generateSecret) {
            this.generateSecret = generateSecret;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getLogoutUrls}
         * @param logoutUrls the value to be set.
         * @return {@code this}
         */
        public Builder logoutUrls(java.util.List<java.lang.String> logoutUrls) {
            this.logoutUrls = logoutUrls;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getPreventUserExistenceErrors}
         * @param preventUserExistenceErrors the value to be set.
         * @return {@code this}
         */
        public Builder preventUserExistenceErrors(java.lang.String preventUserExistenceErrors) {
            this.preventUserExistenceErrors = preventUserExistenceErrors;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getReadAttributes}
         * @param readAttributes the value to be set.
         * @return {@code this}
         */
        public Builder readAttributes(java.util.List<java.lang.String> readAttributes) {
            this.readAttributes = readAttributes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getRefreshTokenValidity}
         * @param refreshTokenValidity the value to be set.
         * @return {@code this}
         */
        public Builder refreshTokenValidity(java.lang.Number refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getSupportedIdentityProviders}
         * @param supportedIdentityProviders the value to be set.
         * @return {@code this}
         */
        public Builder supportedIdentityProviders(java.util.List<java.lang.String> supportedIdentityProviders) {
            this.supportedIdentityProviders = supportedIdentityProviders;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getWriteAttributes}
         * @param writeAttributes the value to be set.
         * @return {@code this}
         */
        public Builder writeAttributes(java.util.List<java.lang.String> writeAttributes) {
            this.writeAttributes = writeAttributes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolClientConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolClientConfig build() {
            return new Jsii$Proxy(name, userPoolId, allowedOauthFlows, allowedOauthFlowsUserPoolClient, allowedOauthScopes, analyticsConfiguration, callbackUrls, defaultRedirectUri, explicitAuthFlows, generateSecret, logoutUrls, preventUserExistenceErrors, readAttributes, refreshTokenValidity, supportedIdentityProviders, writeAttributes, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolClientConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolClientConfig {
        private final java.lang.String name;
        private final java.lang.String userPoolId;
        private final java.util.List<java.lang.String> allowedOauthFlows;
        private final java.lang.Boolean allowedOauthFlowsUserPoolClient;
        private final java.util.List<java.lang.String> allowedOauthScopes;
        private final java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration> analyticsConfiguration;
        private final java.util.List<java.lang.String> callbackUrls;
        private final java.lang.String defaultRedirectUri;
        private final java.util.List<java.lang.String> explicitAuthFlows;
        private final java.lang.Boolean generateSecret;
        private final java.util.List<java.lang.String> logoutUrls;
        private final java.lang.String preventUserExistenceErrors;
        private final java.util.List<java.lang.String> readAttributes;
        private final java.lang.Number refreshTokenValidity;
        private final java.util.List<java.lang.String> supportedIdentityProviders;
        private final java.util.List<java.lang.String> writeAttributes;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userPoolId = software.amazon.jsii.Kernel.get(this, "userPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowedOauthFlows = software.amazon.jsii.Kernel.get(this, "allowedOauthFlows", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedOauthFlowsUserPoolClient = software.amazon.jsii.Kernel.get(this, "allowedOauthFlowsUserPoolClient", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.allowedOauthScopes = software.amazon.jsii.Kernel.get(this, "allowedOauthScopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.analyticsConfiguration = software.amazon.jsii.Kernel.get(this, "analyticsConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolClientAnalyticsConfiguration.class)));
            this.callbackUrls = software.amazon.jsii.Kernel.get(this, "callbackUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.defaultRedirectUri = software.amazon.jsii.Kernel.get(this, "defaultRedirectUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.explicitAuthFlows = software.amazon.jsii.Kernel.get(this, "explicitAuthFlows", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.generateSecret = software.amazon.jsii.Kernel.get(this, "generateSecret", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.logoutUrls = software.amazon.jsii.Kernel.get(this, "logoutUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.preventUserExistenceErrors = software.amazon.jsii.Kernel.get(this, "preventUserExistenceErrors", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readAttributes = software.amazon.jsii.Kernel.get(this, "readAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.refreshTokenValidity = software.amazon.jsii.Kernel.get(this, "refreshTokenValidity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.supportedIdentityProviders = software.amazon.jsii.Kernel.get(this, "supportedIdentityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.writeAttributes = software.amazon.jsii.Kernel.get(this, "writeAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String userPoolId, final java.util.List<java.lang.String> allowedOauthFlows, final java.lang.Boolean allowedOauthFlowsUserPoolClient, final java.util.List<java.lang.String> allowedOauthScopes, final java.util.List<? extends imports.aws.CognitoUserPoolClientAnalyticsConfiguration> analyticsConfiguration, final java.util.List<java.lang.String> callbackUrls, final java.lang.String defaultRedirectUri, final java.util.List<java.lang.String> explicitAuthFlows, final java.lang.Boolean generateSecret, final java.util.List<java.lang.String> logoutUrls, final java.lang.String preventUserExistenceErrors, final java.util.List<java.lang.String> readAttributes, final java.lang.Number refreshTokenValidity, final java.util.List<java.lang.String> supportedIdentityProviders, final java.util.List<java.lang.String> writeAttributes, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.userPoolId = java.util.Objects.requireNonNull(userPoolId, "userPoolId is required");
            this.allowedOauthFlows = allowedOauthFlows;
            this.allowedOauthFlowsUserPoolClient = allowedOauthFlowsUserPoolClient;
            this.allowedOauthScopes = allowedOauthScopes;
            this.analyticsConfiguration = (java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration>)analyticsConfiguration;
            this.callbackUrls = callbackUrls;
            this.defaultRedirectUri = defaultRedirectUri;
            this.explicitAuthFlows = explicitAuthFlows;
            this.generateSecret = generateSecret;
            this.logoutUrls = logoutUrls;
            this.preventUserExistenceErrors = preventUserExistenceErrors;
            this.readAttributes = readAttributes;
            this.refreshTokenValidity = refreshTokenValidity;
            this.supportedIdentityProviders = supportedIdentityProviders;
            this.writeAttributes = writeAttributes;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getUserPoolId() {
            return this.userPoolId;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedOauthFlows() {
            return this.allowedOauthFlows;
        }

        @Override
        public final java.lang.Boolean getAllowedOauthFlowsUserPoolClient() {
            return this.allowedOauthFlowsUserPoolClient;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedOauthScopes() {
            return this.allowedOauthScopes;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolClientAnalyticsConfiguration> getAnalyticsConfiguration() {
            return this.analyticsConfiguration;
        }

        @Override
        public final java.util.List<java.lang.String> getCallbackUrls() {
            return this.callbackUrls;
        }

        @Override
        public final java.lang.String getDefaultRedirectUri() {
            return this.defaultRedirectUri;
        }

        @Override
        public final java.util.List<java.lang.String> getExplicitAuthFlows() {
            return this.explicitAuthFlows;
        }

        @Override
        public final java.lang.Boolean getGenerateSecret() {
            return this.generateSecret;
        }

        @Override
        public final java.util.List<java.lang.String> getLogoutUrls() {
            return this.logoutUrls;
        }

        @Override
        public final java.lang.String getPreventUserExistenceErrors() {
            return this.preventUserExistenceErrors;
        }

        @Override
        public final java.util.List<java.lang.String> getReadAttributes() {
            return this.readAttributes;
        }

        @Override
        public final java.lang.Number getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        @Override
        public final java.util.List<java.lang.String> getSupportedIdentityProviders() {
            return this.supportedIdentityProviders;
        }

        @Override
        public final java.util.List<java.lang.String> getWriteAttributes() {
            return this.writeAttributes;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("userPoolId", om.valueToTree(this.getUserPoolId()));
            if (this.getAllowedOauthFlows() != null) {
                data.set("allowedOauthFlows", om.valueToTree(this.getAllowedOauthFlows()));
            }
            if (this.getAllowedOauthFlowsUserPoolClient() != null) {
                data.set("allowedOauthFlowsUserPoolClient", om.valueToTree(this.getAllowedOauthFlowsUserPoolClient()));
            }
            if (this.getAllowedOauthScopes() != null) {
                data.set("allowedOauthScopes", om.valueToTree(this.getAllowedOauthScopes()));
            }
            if (this.getAnalyticsConfiguration() != null) {
                data.set("analyticsConfiguration", om.valueToTree(this.getAnalyticsConfiguration()));
            }
            if (this.getCallbackUrls() != null) {
                data.set("callbackUrls", om.valueToTree(this.getCallbackUrls()));
            }
            if (this.getDefaultRedirectUri() != null) {
                data.set("defaultRedirectUri", om.valueToTree(this.getDefaultRedirectUri()));
            }
            if (this.getExplicitAuthFlows() != null) {
                data.set("explicitAuthFlows", om.valueToTree(this.getExplicitAuthFlows()));
            }
            if (this.getGenerateSecret() != null) {
                data.set("generateSecret", om.valueToTree(this.getGenerateSecret()));
            }
            if (this.getLogoutUrls() != null) {
                data.set("logoutUrls", om.valueToTree(this.getLogoutUrls()));
            }
            if (this.getPreventUserExistenceErrors() != null) {
                data.set("preventUserExistenceErrors", om.valueToTree(this.getPreventUserExistenceErrors()));
            }
            if (this.getReadAttributes() != null) {
                data.set("readAttributes", om.valueToTree(this.getReadAttributes()));
            }
            if (this.getRefreshTokenValidity() != null) {
                data.set("refreshTokenValidity", om.valueToTree(this.getRefreshTokenValidity()));
            }
            if (this.getSupportedIdentityProviders() != null) {
                data.set("supportedIdentityProviders", om.valueToTree(this.getSupportedIdentityProviders()));
            }
            if (this.getWriteAttributes() != null) {
                data.set("writeAttributes", om.valueToTree(this.getWriteAttributes()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolClientConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolClientConfig.Jsii$Proxy that = (CognitoUserPoolClientConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!userPoolId.equals(that.userPoolId)) return false;
            if (this.allowedOauthFlows != null ? !this.allowedOauthFlows.equals(that.allowedOauthFlows) : that.allowedOauthFlows != null) return false;
            if (this.allowedOauthFlowsUserPoolClient != null ? !this.allowedOauthFlowsUserPoolClient.equals(that.allowedOauthFlowsUserPoolClient) : that.allowedOauthFlowsUserPoolClient != null) return false;
            if (this.allowedOauthScopes != null ? !this.allowedOauthScopes.equals(that.allowedOauthScopes) : that.allowedOauthScopes != null) return false;
            if (this.analyticsConfiguration != null ? !this.analyticsConfiguration.equals(that.analyticsConfiguration) : that.analyticsConfiguration != null) return false;
            if (this.callbackUrls != null ? !this.callbackUrls.equals(that.callbackUrls) : that.callbackUrls != null) return false;
            if (this.defaultRedirectUri != null ? !this.defaultRedirectUri.equals(that.defaultRedirectUri) : that.defaultRedirectUri != null) return false;
            if (this.explicitAuthFlows != null ? !this.explicitAuthFlows.equals(that.explicitAuthFlows) : that.explicitAuthFlows != null) return false;
            if (this.generateSecret != null ? !this.generateSecret.equals(that.generateSecret) : that.generateSecret != null) return false;
            if (this.logoutUrls != null ? !this.logoutUrls.equals(that.logoutUrls) : that.logoutUrls != null) return false;
            if (this.preventUserExistenceErrors != null ? !this.preventUserExistenceErrors.equals(that.preventUserExistenceErrors) : that.preventUserExistenceErrors != null) return false;
            if (this.readAttributes != null ? !this.readAttributes.equals(that.readAttributes) : that.readAttributes != null) return false;
            if (this.refreshTokenValidity != null ? !this.refreshTokenValidity.equals(that.refreshTokenValidity) : that.refreshTokenValidity != null) return false;
            if (this.supportedIdentityProviders != null ? !this.supportedIdentityProviders.equals(that.supportedIdentityProviders) : that.supportedIdentityProviders != null) return false;
            if (this.writeAttributes != null ? !this.writeAttributes.equals(that.writeAttributes) : that.writeAttributes != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.userPoolId.hashCode());
            result = 31 * result + (this.allowedOauthFlows != null ? this.allowedOauthFlows.hashCode() : 0);
            result = 31 * result + (this.allowedOauthFlowsUserPoolClient != null ? this.allowedOauthFlowsUserPoolClient.hashCode() : 0);
            result = 31 * result + (this.allowedOauthScopes != null ? this.allowedOauthScopes.hashCode() : 0);
            result = 31 * result + (this.analyticsConfiguration != null ? this.analyticsConfiguration.hashCode() : 0);
            result = 31 * result + (this.callbackUrls != null ? this.callbackUrls.hashCode() : 0);
            result = 31 * result + (this.defaultRedirectUri != null ? this.defaultRedirectUri.hashCode() : 0);
            result = 31 * result + (this.explicitAuthFlows != null ? this.explicitAuthFlows.hashCode() : 0);
            result = 31 * result + (this.generateSecret != null ? this.generateSecret.hashCode() : 0);
            result = 31 * result + (this.logoutUrls != null ? this.logoutUrls.hashCode() : 0);
            result = 31 * result + (this.preventUserExistenceErrors != null ? this.preventUserExistenceErrors.hashCode() : 0);
            result = 31 * result + (this.readAttributes != null ? this.readAttributes.hashCode() : 0);
            result = 31 * result + (this.refreshTokenValidity != null ? this.refreshTokenValidity.hashCode() : 0);
            result = 31 * result + (this.supportedIdentityProviders != null ? this.supportedIdentityProviders.hashCode() : 0);
            result = 31 * result + (this.writeAttributes != null ? this.writeAttributes.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
