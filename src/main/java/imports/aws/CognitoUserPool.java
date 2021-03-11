package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.193Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPool")
public class CognitoUserPool extends com.hashicorp.cdktf.TerraformResource {

    protected CognitoUserPool(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoUserPool(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CognitoUserPool(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CognitoUserPoolConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAdminCreateUserConfig() {
        software.amazon.jsii.Kernel.call(this, "resetAdminCreateUserConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAliasAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetAliasAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoVerifiedAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetAutoVerifiedAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeviceConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetDeviceConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEmailConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailVerificationMessage() {
        software.amazon.jsii.Kernel.call(this, "resetEmailVerificationMessage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailVerificationSubject() {
        software.amazon.jsii.Kernel.call(this, "resetEmailVerificationSubject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMfaConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetMfaConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPasswordPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPasswordPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchema() {
        software.amazon.jsii.Kernel.call(this, "resetSchema", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmsAuthenticationMessage() {
        software.amazon.jsii.Kernel.call(this, "resetSmsAuthenticationMessage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmsConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSmsConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmsVerificationMessage() {
        software.amazon.jsii.Kernel.call(this, "resetSmsVerificationMessage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSoftwareTokenMfaConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSoftwareTokenMfaConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsernameAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetUsernameAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsernameConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetUsernameConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserPoolAddOns() {
        software.amazon.jsii.Kernel.call(this, "resetUserPoolAddOns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVerificationMessageTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetVerificationMessageTemplate", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreationDate() {
        return software.amazon.jsii.Kernel.get(this, "creationDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModifiedDate() {
        return software.amazon.jsii.Kernel.get(this, "lastModifiedDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig> getAdminCreateUserConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig>)(software.amazon.jsii.Kernel.get(this, "adminCreateUserConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolAdminCreateUserConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAliasAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "aliasAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAutoVerifiedAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "autoVerifiedAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration> getDeviceConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration>)(software.amazon.jsii.Kernel.get(this, "deviceConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolDeviceConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolEmailConfiguration> getEmailConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolEmailConfiguration>)(software.amazon.jsii.Kernel.get(this, "emailConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolEmailConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEmailVerificationMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationMessageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEmailVerificationSubjectInput() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationSubjectInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolLambdaConfig> getLambdaConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolLambdaConfig>)(software.amazon.jsii.Kernel.get(this, "lambdaConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolLambdaConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMfaConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "mfaConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolPasswordPolicy> getPasswordPolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolPasswordPolicy>)(software.amazon.jsii.Kernel.get(this, "passwordPolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolPasswordPolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSchema> getSchemaInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolSchema>)(software.amazon.jsii.Kernel.get(this, "schemaInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSchema.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSmsAuthenticationMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "smsAuthenticationMessageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSmsConfiguration> getSmsConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolSmsConfiguration>)(software.amazon.jsii.Kernel.get(this, "smsConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSmsConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSmsVerificationMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "smsVerificationMessageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> getSoftwareTokenMfaConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration>)(software.amazon.jsii.Kernel.get(this, "softwareTokenMfaConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsernameAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "usernameAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration> getUsernameConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration>)(software.amazon.jsii.Kernel.get(this, "usernameConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolUsernameConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns> getUserPoolAddOnsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns>)(software.amazon.jsii.Kernel.get(this, "userPoolAddOnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolUserPoolAddOns.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate> getVerificationMessageTemplateInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate>)(software.amazon.jsii.Kernel.get(this, "verificationMessageTemplateInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolVerificationMessageTemplate.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig> getAdminCreateUserConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "adminCreateUserConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolAdminCreateUserConfig.class))));
    }

    public void setAdminCreateUserConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfig> value) {
        software.amazon.jsii.Kernel.set(this, "adminCreateUserConfig", java.util.Objects.requireNonNull(value, "adminCreateUserConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAliasAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "aliasAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAliasAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "aliasAttributes", java.util.Objects.requireNonNull(value, "aliasAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAutoVerifiedAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "autoVerifiedAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAutoVerifiedAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "autoVerifiedAttributes", java.util.Objects.requireNonNull(value, "autoVerifiedAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration> getDeviceConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "deviceConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolDeviceConfiguration.class))));
    }

    public void setDeviceConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolDeviceConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "deviceConfiguration", java.util.Objects.requireNonNull(value, "deviceConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolEmailConfiguration> getEmailConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "emailConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolEmailConfiguration.class))));
    }

    public void setEmailConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolEmailConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "emailConfiguration", java.util.Objects.requireNonNull(value, "emailConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEmailVerificationMessage() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEmailVerificationMessage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "emailVerificationMessage", java.util.Objects.requireNonNull(value, "emailVerificationMessage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEmailVerificationSubject() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationSubject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEmailVerificationSubject(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "emailVerificationSubject", java.util.Objects.requireNonNull(value, "emailVerificationSubject is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolLambdaConfig> getLambdaConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lambdaConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolLambdaConfig.class))));
    }

    public void setLambdaConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolLambdaConfig> value) {
        software.amazon.jsii.Kernel.set(this, "lambdaConfig", java.util.Objects.requireNonNull(value, "lambdaConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMfaConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "mfaConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMfaConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mfaConfiguration", java.util.Objects.requireNonNull(value, "mfaConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolPasswordPolicy> getPasswordPolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "passwordPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolPasswordPolicy.class))));
    }

    public void setPasswordPolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolPasswordPolicy> value) {
        software.amazon.jsii.Kernel.set(this, "passwordPolicy", java.util.Objects.requireNonNull(value, "passwordPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolSchema> getSchema() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSchema.class))));
    }

    public void setSchema(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolSchema> value) {
        software.amazon.jsii.Kernel.set(this, "schema", java.util.Objects.requireNonNull(value, "schema is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSmsAuthenticationMessage() {
        return software.amazon.jsii.Kernel.get(this, "smsAuthenticationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSmsAuthenticationMessage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "smsAuthenticationMessage", java.util.Objects.requireNonNull(value, "smsAuthenticationMessage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolSmsConfiguration> getSmsConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "smsConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSmsConfiguration.class))));
    }

    public void setSmsConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolSmsConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "smsConfiguration", java.util.Objects.requireNonNull(value, "smsConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSmsVerificationMessage() {
        return software.amazon.jsii.Kernel.get(this, "smsVerificationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSmsVerificationMessage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "smsVerificationMessage", java.util.Objects.requireNonNull(value, "smsVerificationMessage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> getSoftwareTokenMfaConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "softwareTokenMfaConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration.class))));
    }

    public void setSoftwareTokenMfaConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "softwareTokenMfaConfiguration", java.util.Objects.requireNonNull(value, "softwareTokenMfaConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getUsernameAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "usernameAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setUsernameAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "usernameAttributes", java.util.Objects.requireNonNull(value, "usernameAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration> getUsernameConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "usernameConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolUsernameConfiguration.class))));
    }

    public void setUsernameConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolUsernameConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "usernameConfiguration", java.util.Objects.requireNonNull(value, "usernameConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns> getUserPoolAddOns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "userPoolAddOns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolUserPoolAddOns.class))));
    }

    public void setUserPoolAddOns(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolUserPoolAddOns> value) {
        software.amazon.jsii.Kernel.set(this, "userPoolAddOns", java.util.Objects.requireNonNull(value, "userPoolAddOns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate> getVerificationMessageTemplate() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "verificationMessageTemplate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolVerificationMessageTemplate.class))));
    }

    public void setVerificationMessageTemplate(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CognitoUserPoolVerificationMessageTemplate> value) {
        software.amazon.jsii.Kernel.set(this, "verificationMessageTemplate", java.util.Objects.requireNonNull(value, "verificationMessageTemplate is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CognitoUserPool}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CognitoUserPool> {
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
        private final imports.aws.CognitoUserPoolConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CognitoUserPoolConfig.Builder();
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
         * admin_create_user_config block.
         * <p>
         * @return {@code this}
         * @param adminCreateUserConfig admin_create_user_config block. This parameter is required.
         */
        public Builder adminCreateUserConfig(final java.util.List<? extends imports.aws.CognitoUserPoolAdminCreateUserConfig> adminCreateUserConfig) {
            this.config.adminCreateUserConfig(adminCreateUserConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param aliasAttributes This parameter is required.
         */
        public Builder aliasAttributes(final java.util.List<java.lang.String> aliasAttributes) {
            this.config.aliasAttributes(aliasAttributes);
            return this;
        }

        /**
         * @return {@code this}
         * @param autoVerifiedAttributes This parameter is required.
         */
        public Builder autoVerifiedAttributes(final java.util.List<java.lang.String> autoVerifiedAttributes) {
            this.config.autoVerifiedAttributes(autoVerifiedAttributes);
            return this;
        }

        /**
         * device_configuration block.
         * <p>
         * @return {@code this}
         * @param deviceConfiguration device_configuration block. This parameter is required.
         */
        public Builder deviceConfiguration(final java.util.List<? extends imports.aws.CognitoUserPoolDeviceConfiguration> deviceConfiguration) {
            this.config.deviceConfiguration(deviceConfiguration);
            return this;
        }

        /**
         * email_configuration block.
         * <p>
         * @return {@code this}
         * @param emailConfiguration email_configuration block. This parameter is required.
         */
        public Builder emailConfiguration(final java.util.List<? extends imports.aws.CognitoUserPoolEmailConfiguration> emailConfiguration) {
            this.config.emailConfiguration(emailConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param emailVerificationMessage This parameter is required.
         */
        public Builder emailVerificationMessage(final java.lang.String emailVerificationMessage) {
            this.config.emailVerificationMessage(emailVerificationMessage);
            return this;
        }

        /**
         * @return {@code this}
         * @param emailVerificationSubject This parameter is required.
         */
        public Builder emailVerificationSubject(final java.lang.String emailVerificationSubject) {
            this.config.emailVerificationSubject(emailVerificationSubject);
            return this;
        }

        /**
         * lambda_config block.
         * <p>
         * @return {@code this}
         * @param lambdaConfig lambda_config block. This parameter is required.
         */
        public Builder lambdaConfig(final java.util.List<? extends imports.aws.CognitoUserPoolLambdaConfig> lambdaConfig) {
            this.config.lambdaConfig(lambdaConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param mfaConfiguration This parameter is required.
         */
        public Builder mfaConfiguration(final java.lang.String mfaConfiguration) {
            this.config.mfaConfiguration(mfaConfiguration);
            return this;
        }

        /**
         * password_policy block.
         * <p>
         * @return {@code this}
         * @param passwordPolicy password_policy block. This parameter is required.
         */
        public Builder passwordPolicy(final java.util.List<? extends imports.aws.CognitoUserPoolPasswordPolicy> passwordPolicy) {
            this.config.passwordPolicy(passwordPolicy);
            return this;
        }

        /**
         * schema block.
         * <p>
         * @return {@code this}
         * @param schema schema block. This parameter is required.
         */
        public Builder schema(final java.util.List<? extends imports.aws.CognitoUserPoolSchema> schema) {
            this.config.schema(schema);
            return this;
        }

        /**
         * @return {@code this}
         * @param smsAuthenticationMessage This parameter is required.
         */
        public Builder smsAuthenticationMessage(final java.lang.String smsAuthenticationMessage) {
            this.config.smsAuthenticationMessage(smsAuthenticationMessage);
            return this;
        }

        /**
         * sms_configuration block.
         * <p>
         * @return {@code this}
         * @param smsConfiguration sms_configuration block. This parameter is required.
         */
        public Builder smsConfiguration(final java.util.List<? extends imports.aws.CognitoUserPoolSmsConfiguration> smsConfiguration) {
            this.config.smsConfiguration(smsConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param smsVerificationMessage This parameter is required.
         */
        public Builder smsVerificationMessage(final java.lang.String smsVerificationMessage) {
            this.config.smsVerificationMessage(smsVerificationMessage);
            return this;
        }

        /**
         * software_token_mfa_configuration block.
         * <p>
         * @return {@code this}
         * @param softwareTokenMfaConfiguration software_token_mfa_configuration block. This parameter is required.
         */
        public Builder softwareTokenMfaConfiguration(final java.util.List<? extends imports.aws.CognitoUserPoolSoftwareTokenMfaConfiguration> softwareTokenMfaConfiguration) {
            this.config.softwareTokenMfaConfiguration(softwareTokenMfaConfiguration);
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
         * @return {@code this}
         * @param usernameAttributes This parameter is required.
         */
        public Builder usernameAttributes(final java.util.List<java.lang.String> usernameAttributes) {
            this.config.usernameAttributes(usernameAttributes);
            return this;
        }

        /**
         * username_configuration block.
         * <p>
         * @return {@code this}
         * @param usernameConfiguration username_configuration block. This parameter is required.
         */
        public Builder usernameConfiguration(final java.util.List<? extends imports.aws.CognitoUserPoolUsernameConfiguration> usernameConfiguration) {
            this.config.usernameConfiguration(usernameConfiguration);
            return this;
        }

        /**
         * user_pool_add_ons block.
         * <p>
         * @return {@code this}
         * @param userPoolAddOns user_pool_add_ons block. This parameter is required.
         */
        public Builder userPoolAddOns(final java.util.List<? extends imports.aws.CognitoUserPoolUserPoolAddOns> userPoolAddOns) {
            this.config.userPoolAddOns(userPoolAddOns);
            return this;
        }

        /**
         * verification_message_template block.
         * <p>
         * @return {@code this}
         * @param verificationMessageTemplate verification_message_template block. This parameter is required.
         */
        public Builder verificationMessageTemplate(final java.util.List<? extends imports.aws.CognitoUserPoolVerificationMessageTemplate> verificationMessageTemplate) {
            this.config.verificationMessageTemplate(verificationMessageTemplate);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CognitoUserPool}.
         */
        @Override
        public imports.aws.CognitoUserPool build() {
            return new imports.aws.CognitoUserPool(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
