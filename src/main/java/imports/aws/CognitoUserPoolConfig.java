package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.197Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolConfig.Jsii$Proxy.class)
public interface CognitoUserPoolConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * admin_create_user_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig> getAdminCreateUserConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAliasAttributes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAutoVerifiedAttributes() {
        return null;
    }

    /**
     * device_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration> getDeviceConfiguration() {
        return null;
    }

    /**
     * email_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolEmailConfiguration> getEmailConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailVerificationMessage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailVerificationSubject() {
        return null;
    }

    /**
     * lambda_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolLambdaConfig> getLambdaConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMfaConfiguration() {
        return null;
    }

    /**
     * password_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolPasswordPolicy> getPasswordPolicy() {
        return null;
    }

    /**
     * schema block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSchema> getSchema() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSmsAuthenticationMessage() {
        return null;
    }

    /**
     * sms_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSmsConfiguration> getSmsConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSmsVerificationMessage() {
        return null;
    }

    /**
     * software_token_mfa_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> getSoftwareTokenMfaConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsernameAttributes() {
        return null;
    }

    /**
     * username_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration> getUsernameConfiguration() {
        return null;
    }

    /**
     * user_pool_add_ons block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns> getUserPoolAddOns() {
        return null;
    }

    /**
     * verification_message_template block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate> getVerificationMessageTemplate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolConfig> {
        private java.lang.String name;
        private java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig> adminCreateUserConfig;
        private java.util.List<java.lang.String> aliasAttributes;
        private java.util.List<java.lang.String> autoVerifiedAttributes;
        private java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration> deviceConfiguration;
        private java.util.List<imports.aws.CognitoUserPoolEmailConfiguration> emailConfiguration;
        private java.lang.String emailVerificationMessage;
        private java.lang.String emailVerificationSubject;
        private java.util.List<imports.aws.CognitoUserPoolLambdaConfig> lambdaConfig;
        private java.lang.String mfaConfiguration;
        private java.util.List<imports.aws.CognitoUserPoolPasswordPolicy> passwordPolicy;
        private java.util.List<imports.aws.CognitoUserPoolSchema> schema;
        private java.lang.String smsAuthenticationMessage;
        private java.util.List<imports.aws.CognitoUserPoolSmsConfiguration> smsConfiguration;
        private java.lang.String smsVerificationMessage;
        private java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> softwareTokenMfaConfiguration;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<java.lang.String> usernameAttributes;
        private java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration> usernameConfiguration;
        private java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns> userPoolAddOns;
        private java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate> verificationMessageTemplate;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getAdminCreateUserConfig}
         * @param adminCreateUserConfig admin_create_user_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder adminCreateUserConfig(java.util.List<? extends imports.aws.CognitoUserPoolAdminCreateUserConfig> adminCreateUserConfig) {
            this.adminCreateUserConfig = (java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig>)adminCreateUserConfig;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getAliasAttributes}
         * @param aliasAttributes the value to be set.
         * @return {@code this}
         */
        public Builder aliasAttributes(java.util.List<java.lang.String> aliasAttributes) {
            this.aliasAttributes = aliasAttributes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getAutoVerifiedAttributes}
         * @param autoVerifiedAttributes the value to be set.
         * @return {@code this}
         */
        public Builder autoVerifiedAttributes(java.util.List<java.lang.String> autoVerifiedAttributes) {
            this.autoVerifiedAttributes = autoVerifiedAttributes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getDeviceConfiguration}
         * @param deviceConfiguration device_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder deviceConfiguration(java.util.List<? extends imports.aws.CognitoUserPoolDeviceConfiguration> deviceConfiguration) {
            this.deviceConfiguration = (java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration>)deviceConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getEmailConfiguration}
         * @param emailConfiguration email_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder emailConfiguration(java.util.List<? extends imports.aws.CognitoUserPoolEmailConfiguration> emailConfiguration) {
            this.emailConfiguration = (java.util.List<imports.aws.CognitoUserPoolEmailConfiguration>)emailConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getEmailVerificationMessage}
         * @param emailVerificationMessage the value to be set.
         * @return {@code this}
         */
        public Builder emailVerificationMessage(java.lang.String emailVerificationMessage) {
            this.emailVerificationMessage = emailVerificationMessage;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getEmailVerificationSubject}
         * @param emailVerificationSubject the value to be set.
         * @return {@code this}
         */
        public Builder emailVerificationSubject(java.lang.String emailVerificationSubject) {
            this.emailVerificationSubject = emailVerificationSubject;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getLambdaConfig}
         * @param lambdaConfig lambda_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambdaConfig(java.util.List<? extends imports.aws.CognitoUserPoolLambdaConfig> lambdaConfig) {
            this.lambdaConfig = (java.util.List<imports.aws.CognitoUserPoolLambdaConfig>)lambdaConfig;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getMfaConfiguration}
         * @param mfaConfiguration the value to be set.
         * @return {@code this}
         */
        public Builder mfaConfiguration(java.lang.String mfaConfiguration) {
            this.mfaConfiguration = mfaConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getPasswordPolicy}
         * @param passwordPolicy password_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder passwordPolicy(java.util.List<? extends imports.aws.CognitoUserPoolPasswordPolicy> passwordPolicy) {
            this.passwordPolicy = (java.util.List<imports.aws.CognitoUserPoolPasswordPolicy>)passwordPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getSchema}
         * @param schema schema block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schema(java.util.List<? extends imports.aws.CognitoUserPoolSchema> schema) {
            this.schema = (java.util.List<imports.aws.CognitoUserPoolSchema>)schema;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getSmsAuthenticationMessage}
         * @param smsAuthenticationMessage the value to be set.
         * @return {@code this}
         */
        public Builder smsAuthenticationMessage(java.lang.String smsAuthenticationMessage) {
            this.smsAuthenticationMessage = smsAuthenticationMessage;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getSmsConfiguration}
         * @param smsConfiguration sms_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder smsConfiguration(java.util.List<? extends imports.aws.CognitoUserPoolSmsConfiguration> smsConfiguration) {
            this.smsConfiguration = (java.util.List<imports.aws.CognitoUserPoolSmsConfiguration>)smsConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getSmsVerificationMessage}
         * @param smsVerificationMessage the value to be set.
         * @return {@code this}
         */
        public Builder smsVerificationMessage(java.lang.String smsVerificationMessage) {
            this.smsVerificationMessage = smsVerificationMessage;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getSoftwareTokenMfaConfiguration}
         * @param softwareTokenMfaConfiguration software_token_mfa_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder softwareTokenMfaConfiguration(java.util.List<? extends imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> softwareTokenMfaConfiguration) {
            this.softwareTokenMfaConfiguration = (java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration>)softwareTokenMfaConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getUsernameAttributes}
         * @param usernameAttributes the value to be set.
         * @return {@code this}
         */
        public Builder usernameAttributes(java.util.List<java.lang.String> usernameAttributes) {
            this.usernameAttributes = usernameAttributes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getUsernameConfiguration}
         * @param usernameConfiguration username_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder usernameConfiguration(java.util.List<? extends imports.aws.CognitoUserPoolUsernameConfiguration> usernameConfiguration) {
            this.usernameConfiguration = (java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration>)usernameConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getUserPoolAddOns}
         * @param userPoolAddOns user_pool_add_ons block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder userPoolAddOns(java.util.List<? extends imports.aws.CognitoUserPoolUserPoolAddOns> userPoolAddOns) {
            this.userPoolAddOns = (java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns>)userPoolAddOns;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getVerificationMessageTemplate}
         * @param verificationMessageTemplate verification_message_template block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder verificationMessageTemplate(java.util.List<? extends imports.aws.CognitoUserPoolVerificationMessageTemplate> verificationMessageTemplate) {
            this.verificationMessageTemplate = (java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate>)verificationMessageTemplate;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getDependsOn}
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
         * Sets the value of {@link CognitoUserPoolConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolConfig#getProvider}
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
         * @return a new instance of {@link CognitoUserPoolConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolConfig build() {
            return new Jsii$Proxy(name, adminCreateUserConfig, aliasAttributes, autoVerifiedAttributes, deviceConfiguration, emailConfiguration, emailVerificationMessage, emailVerificationSubject, lambdaConfig, mfaConfiguration, passwordPolicy, schema, smsAuthenticationMessage, smsConfiguration, smsVerificationMessage, softwareTokenMfaConfiguration, tags, usernameAttributes, usernameConfiguration, userPoolAddOns, verificationMessageTemplate, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolConfig {
        private final java.lang.String name;
        private final java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig> adminCreateUserConfig;
        private final java.util.List<java.lang.String> aliasAttributes;
        private final java.util.List<java.lang.String> autoVerifiedAttributes;
        private final java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration> deviceConfiguration;
        private final java.util.List<imports.aws.CognitoUserPoolEmailConfiguration> emailConfiguration;
        private final java.lang.String emailVerificationMessage;
        private final java.lang.String emailVerificationSubject;
        private final java.util.List<imports.aws.CognitoUserPoolLambdaConfig> lambdaConfig;
        private final java.lang.String mfaConfiguration;
        private final java.util.List<imports.aws.CognitoUserPoolPasswordPolicy> passwordPolicy;
        private final java.util.List<imports.aws.CognitoUserPoolSchema> schema;
        private final java.lang.String smsAuthenticationMessage;
        private final java.util.List<imports.aws.CognitoUserPoolSmsConfiguration> smsConfiguration;
        private final java.lang.String smsVerificationMessage;
        private final java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> softwareTokenMfaConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<java.lang.String> usernameAttributes;
        private final java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration> usernameConfiguration;
        private final java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns> userPoolAddOns;
        private final java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate> verificationMessageTemplate;
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
            this.adminCreateUserConfig = software.amazon.jsii.Kernel.get(this, "adminCreateUserConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolAdminCreateUserConfig.class)));
            this.aliasAttributes = software.amazon.jsii.Kernel.get(this, "aliasAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.autoVerifiedAttributes = software.amazon.jsii.Kernel.get(this, "autoVerifiedAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.deviceConfiguration = software.amazon.jsii.Kernel.get(this, "deviceConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolDeviceConfiguration.class)));
            this.emailConfiguration = software.amazon.jsii.Kernel.get(this, "emailConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolEmailConfiguration.class)));
            this.emailVerificationMessage = software.amazon.jsii.Kernel.get(this, "emailVerificationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailVerificationSubject = software.amazon.jsii.Kernel.get(this, "emailVerificationSubject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaConfig = software.amazon.jsii.Kernel.get(this, "lambdaConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolLambdaConfig.class)));
            this.mfaConfiguration = software.amazon.jsii.Kernel.get(this, "mfaConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.passwordPolicy = software.amazon.jsii.Kernel.get(this, "passwordPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolPasswordPolicy.class)));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSchema.class)));
            this.smsAuthenticationMessage = software.amazon.jsii.Kernel.get(this, "smsAuthenticationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.smsConfiguration = software.amazon.jsii.Kernel.get(this, "smsConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSmsConfiguration.class)));
            this.smsVerificationMessage = software.amazon.jsii.Kernel.get(this, "smsVerificationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.softwareTokenMfaConfiguration = software.amazon.jsii.Kernel.get(this, "softwareTokenMfaConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.usernameAttributes = software.amazon.jsii.Kernel.get(this, "usernameAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.usernameConfiguration = software.amazon.jsii.Kernel.get(this, "usernameConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolUsernameConfiguration.class)));
            this.userPoolAddOns = software.amazon.jsii.Kernel.get(this, "userPoolAddOns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolUserPoolAddOns.class)));
            this.verificationMessageTemplate = software.amazon.jsii.Kernel.get(this, "verificationMessageTemplate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolVerificationMessageTemplate.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.CognitoUserPoolAdminCreateUserConfig> adminCreateUserConfig, final java.util.List<java.lang.String> aliasAttributes, final java.util.List<java.lang.String> autoVerifiedAttributes, final java.util.List<? extends imports.aws.CognitoUserPoolDeviceConfiguration> deviceConfiguration, final java.util.List<? extends imports.aws.CognitoUserPoolEmailConfiguration> emailConfiguration, final java.lang.String emailVerificationMessage, final java.lang.String emailVerificationSubject, final java.util.List<? extends imports.aws.CognitoUserPoolLambdaConfig> lambdaConfig, final java.lang.String mfaConfiguration, final java.util.List<? extends imports.aws.CognitoUserPoolPasswordPolicy> passwordPolicy, final java.util.List<? extends imports.aws.CognitoUserPoolSchema> schema, final java.lang.String smsAuthenticationMessage, final java.util.List<? extends imports.aws.CognitoUserPoolSmsConfiguration> smsConfiguration, final java.lang.String smsVerificationMessage, final java.util.List<? extends imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> softwareTokenMfaConfiguration, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<java.lang.String> usernameAttributes, final java.util.List<? extends imports.aws.CognitoUserPoolUsernameConfiguration> usernameConfiguration, final java.util.List<? extends imports.aws.CognitoUserPoolUserPoolAddOns> userPoolAddOns, final java.util.List<? extends imports.aws.CognitoUserPoolVerificationMessageTemplate> verificationMessageTemplate, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.adminCreateUserConfig = (java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig>)adminCreateUserConfig;
            this.aliasAttributes = aliasAttributes;
            this.autoVerifiedAttributes = autoVerifiedAttributes;
            this.deviceConfiguration = (java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration>)deviceConfiguration;
            this.emailConfiguration = (java.util.List<imports.aws.CognitoUserPoolEmailConfiguration>)emailConfiguration;
            this.emailVerificationMessage = emailVerificationMessage;
            this.emailVerificationSubject = emailVerificationSubject;
            this.lambdaConfig = (java.util.List<imports.aws.CognitoUserPoolLambdaConfig>)lambdaConfig;
            this.mfaConfiguration = mfaConfiguration;
            this.passwordPolicy = (java.util.List<imports.aws.CognitoUserPoolPasswordPolicy>)passwordPolicy;
            this.schema = (java.util.List<imports.aws.CognitoUserPoolSchema>)schema;
            this.smsAuthenticationMessage = smsAuthenticationMessage;
            this.smsConfiguration = (java.util.List<imports.aws.CognitoUserPoolSmsConfiguration>)smsConfiguration;
            this.smsVerificationMessage = smsVerificationMessage;
            this.softwareTokenMfaConfiguration = (java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration>)softwareTokenMfaConfiguration;
            this.tags = tags;
            this.usernameAttributes = usernameAttributes;
            this.usernameConfiguration = (java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration>)usernameConfiguration;
            this.userPoolAddOns = (java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns>)userPoolAddOns;
            this.verificationMessageTemplate = (java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate>)verificationMessageTemplate;
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
        public final java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig> getAdminCreateUserConfig() {
            return this.adminCreateUserConfig;
        }

        @Override
        public final java.util.List<java.lang.String> getAliasAttributes() {
            return this.aliasAttributes;
        }

        @Override
        public final java.util.List<java.lang.String> getAutoVerifiedAttributes() {
            return this.autoVerifiedAttributes;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration> getDeviceConfiguration() {
            return this.deviceConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolEmailConfiguration> getEmailConfiguration() {
            return this.emailConfiguration;
        }

        @Override
        public final java.lang.String getEmailVerificationMessage() {
            return this.emailVerificationMessage;
        }

        @Override
        public final java.lang.String getEmailVerificationSubject() {
            return this.emailVerificationSubject;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolLambdaConfig> getLambdaConfig() {
            return this.lambdaConfig;
        }

        @Override
        public final java.lang.String getMfaConfiguration() {
            return this.mfaConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolPasswordPolicy> getPasswordPolicy() {
            return this.passwordPolicy;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolSchema> getSchema() {
            return this.schema;
        }

        @Override
        public final java.lang.String getSmsAuthenticationMessage() {
            return this.smsAuthenticationMessage;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolSmsConfiguration> getSmsConfiguration() {
            return this.smsConfiguration;
        }

        @Override
        public final java.lang.String getSmsVerificationMessage() {
            return this.smsVerificationMessage;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> getSoftwareTokenMfaConfiguration() {
            return this.softwareTokenMfaConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<java.lang.String> getUsernameAttributes() {
            return this.usernameAttributes;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration> getUsernameConfiguration() {
            return this.usernameConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns> getUserPoolAddOns() {
            return this.userPoolAddOns;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate> getVerificationMessageTemplate() {
            return this.verificationMessageTemplate;
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
            if (this.getAdminCreateUserConfig() != null) {
                data.set("adminCreateUserConfig", om.valueToTree(this.getAdminCreateUserConfig()));
            }
            if (this.getAliasAttributes() != null) {
                data.set("aliasAttributes", om.valueToTree(this.getAliasAttributes()));
            }
            if (this.getAutoVerifiedAttributes() != null) {
                data.set("autoVerifiedAttributes", om.valueToTree(this.getAutoVerifiedAttributes()));
            }
            if (this.getDeviceConfiguration() != null) {
                data.set("deviceConfiguration", om.valueToTree(this.getDeviceConfiguration()));
            }
            if (this.getEmailConfiguration() != null) {
                data.set("emailConfiguration", om.valueToTree(this.getEmailConfiguration()));
            }
            if (this.getEmailVerificationMessage() != null) {
                data.set("emailVerificationMessage", om.valueToTree(this.getEmailVerificationMessage()));
            }
            if (this.getEmailVerificationSubject() != null) {
                data.set("emailVerificationSubject", om.valueToTree(this.getEmailVerificationSubject()));
            }
            if (this.getLambdaConfig() != null) {
                data.set("lambdaConfig", om.valueToTree(this.getLambdaConfig()));
            }
            if (this.getMfaConfiguration() != null) {
                data.set("mfaConfiguration", om.valueToTree(this.getMfaConfiguration()));
            }
            if (this.getPasswordPolicy() != null) {
                data.set("passwordPolicy", om.valueToTree(this.getPasswordPolicy()));
            }
            if (this.getSchema() != null) {
                data.set("schema", om.valueToTree(this.getSchema()));
            }
            if (this.getSmsAuthenticationMessage() != null) {
                data.set("smsAuthenticationMessage", om.valueToTree(this.getSmsAuthenticationMessage()));
            }
            if (this.getSmsConfiguration() != null) {
                data.set("smsConfiguration", om.valueToTree(this.getSmsConfiguration()));
            }
            if (this.getSmsVerificationMessage() != null) {
                data.set("smsVerificationMessage", om.valueToTree(this.getSmsVerificationMessage()));
            }
            if (this.getSoftwareTokenMfaConfiguration() != null) {
                data.set("softwareTokenMfaConfiguration", om.valueToTree(this.getSoftwareTokenMfaConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUsernameAttributes() != null) {
                data.set("usernameAttributes", om.valueToTree(this.getUsernameAttributes()));
            }
            if (this.getUsernameConfiguration() != null) {
                data.set("usernameConfiguration", om.valueToTree(this.getUsernameConfiguration()));
            }
            if (this.getUserPoolAddOns() != null) {
                data.set("userPoolAddOns", om.valueToTree(this.getUserPoolAddOns()));
            }
            if (this.getVerificationMessageTemplate() != null) {
                data.set("verificationMessageTemplate", om.valueToTree(this.getVerificationMessageTemplate()));
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
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolConfig.Jsii$Proxy that = (CognitoUserPoolConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.adminCreateUserConfig != null ? !this.adminCreateUserConfig.equals(that.adminCreateUserConfig) : that.adminCreateUserConfig != null) return false;
            if (this.aliasAttributes != null ? !this.aliasAttributes.equals(that.aliasAttributes) : that.aliasAttributes != null) return false;
            if (this.autoVerifiedAttributes != null ? !this.autoVerifiedAttributes.equals(that.autoVerifiedAttributes) : that.autoVerifiedAttributes != null) return false;
            if (this.deviceConfiguration != null ? !this.deviceConfiguration.equals(that.deviceConfiguration) : that.deviceConfiguration != null) return false;
            if (this.emailConfiguration != null ? !this.emailConfiguration.equals(that.emailConfiguration) : that.emailConfiguration != null) return false;
            if (this.emailVerificationMessage != null ? !this.emailVerificationMessage.equals(that.emailVerificationMessage) : that.emailVerificationMessage != null) return false;
            if (this.emailVerificationSubject != null ? !this.emailVerificationSubject.equals(that.emailVerificationSubject) : that.emailVerificationSubject != null) return false;
            if (this.lambdaConfig != null ? !this.lambdaConfig.equals(that.lambdaConfig) : that.lambdaConfig != null) return false;
            if (this.mfaConfiguration != null ? !this.mfaConfiguration.equals(that.mfaConfiguration) : that.mfaConfiguration != null) return false;
            if (this.passwordPolicy != null ? !this.passwordPolicy.equals(that.passwordPolicy) : that.passwordPolicy != null) return false;
            if (this.schema != null ? !this.schema.equals(that.schema) : that.schema != null) return false;
            if (this.smsAuthenticationMessage != null ? !this.smsAuthenticationMessage.equals(that.smsAuthenticationMessage) : that.smsAuthenticationMessage != null) return false;
            if (this.smsConfiguration != null ? !this.smsConfiguration.equals(that.smsConfiguration) : that.smsConfiguration != null) return false;
            if (this.smsVerificationMessage != null ? !this.smsVerificationMessage.equals(that.smsVerificationMessage) : that.smsVerificationMessage != null) return false;
            if (this.softwareTokenMfaConfiguration != null ? !this.softwareTokenMfaConfiguration.equals(that.softwareTokenMfaConfiguration) : that.softwareTokenMfaConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.usernameAttributes != null ? !this.usernameAttributes.equals(that.usernameAttributes) : that.usernameAttributes != null) return false;
            if (this.usernameConfiguration != null ? !this.usernameConfiguration.equals(that.usernameConfiguration) : that.usernameConfiguration != null) return false;
            if (this.userPoolAddOns != null ? !this.userPoolAddOns.equals(that.userPoolAddOns) : that.userPoolAddOns != null) return false;
            if (this.verificationMessageTemplate != null ? !this.verificationMessageTemplate.equals(that.verificationMessageTemplate) : that.verificationMessageTemplate != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.adminCreateUserConfig != null ? this.adminCreateUserConfig.hashCode() : 0);
            result = 31 * result + (this.aliasAttributes != null ? this.aliasAttributes.hashCode() : 0);
            result = 31 * result + (this.autoVerifiedAttributes != null ? this.autoVerifiedAttributes.hashCode() : 0);
            result = 31 * result + (this.deviceConfiguration != null ? this.deviceConfiguration.hashCode() : 0);
            result = 31 * result + (this.emailConfiguration != null ? this.emailConfiguration.hashCode() : 0);
            result = 31 * result + (this.emailVerificationMessage != null ? this.emailVerificationMessage.hashCode() : 0);
            result = 31 * result + (this.emailVerificationSubject != null ? this.emailVerificationSubject.hashCode() : 0);
            result = 31 * result + (this.lambdaConfig != null ? this.lambdaConfig.hashCode() : 0);
            result = 31 * result + (this.mfaConfiguration != null ? this.mfaConfiguration.hashCode() : 0);
            result = 31 * result + (this.passwordPolicy != null ? this.passwordPolicy.hashCode() : 0);
            result = 31 * result + (this.schema != null ? this.schema.hashCode() : 0);
            result = 31 * result + (this.smsAuthenticationMessage != null ? this.smsAuthenticationMessage.hashCode() : 0);
            result = 31 * result + (this.smsConfiguration != null ? this.smsConfiguration.hashCode() : 0);
            result = 31 * result + (this.smsVerificationMessage != null ? this.smsVerificationMessage.hashCode() : 0);
            result = 31 * result + (this.softwareTokenMfaConfiguration != null ? this.softwareTokenMfaConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.usernameAttributes != null ? this.usernameAttributes.hashCode() : 0);
            result = 31 * result + (this.usernameConfiguration != null ? this.usernameConfiguration.hashCode() : 0);
            result = 31 * result + (this.userPoolAddOns != null ? this.userPoolAddOns.hashCode() : 0);
            result = 31 * result + (this.verificationMessageTemplate != null ? this.verificationMessageTemplate.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
