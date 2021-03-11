package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.077Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AwsProvider")
public class AwsProvider extends com.hashicorp.cdktf.TerraformProvider {

    protected AwsProvider(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AwsProvider(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AwsProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AwsProviderConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccessKey() {
        software.amazon.jsii.Kernel.call(this, "resetAccessKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAlias() {
        software.amazon.jsii.Kernel.call(this, "resetAlias", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedAccountIds() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedAccountIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAssumeRole() {
        software.amazon.jsii.Kernel.call(this, "resetAssumeRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpoints() {
        software.amazon.jsii.Kernel.call(this, "resetEndpoints", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForbiddenAccountIds() {
        software.amazon.jsii.Kernel.call(this, "resetForbiddenAccountIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIgnoreTags() {
        software.amazon.jsii.Kernel.call(this, "resetIgnoreTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInsecure() {
        software.amazon.jsii.Kernel.call(this, "resetInsecure", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxRetries() {
        software.amazon.jsii.Kernel.call(this, "resetMaxRetries", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProfile() {
        software.amazon.jsii.Kernel.call(this, "resetProfile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3ForcePathStyle() {
        software.amazon.jsii.Kernel.call(this, "resetS3ForcePathStyle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretKey() {
        software.amazon.jsii.Kernel.call(this, "resetSecretKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSharedCredentialsFile() {
        software.amazon.jsii.Kernel.call(this, "resetSharedCredentialsFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipCredentialsValidation() {
        software.amazon.jsii.Kernel.call(this, "resetSkipCredentialsValidation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipGetEc2Platforms() {
        software.amazon.jsii.Kernel.call(this, "resetSkipGetEc2Platforms", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipMetadataApiCheck() {
        software.amazon.jsii.Kernel.call(this, "resetSkipMetadataApiCheck", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipRegionValidation() {
        software.amazon.jsii.Kernel.call(this, "resetSkipRegionValidation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipRequestingAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetSkipRequestingAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetToken() {
        software.amazon.jsii.Kernel.call(this, "resetToken", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "accessKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAliasInput() {
        return software.amazon.jsii.Kernel.get(this, "aliasInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedAccountIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedAccountIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderAssumeRole> getAssumeRoleInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AwsProviderAssumeRole>)(software.amazon.jsii.Kernel.get(this, "assumeRoleInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRole.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderEndpoints> getEndpointsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AwsProviderEndpoints>)(software.amazon.jsii.Kernel.get(this, "endpointsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderEndpoints.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenAccountIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "forbiddenAccountIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderIgnoreTags> getIgnoreTagsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AwsProviderIgnoreTags>)(software.amazon.jsii.Kernel.get(this, "ignoreTagsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderIgnoreTags.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInsecureInput() {
        return software.amazon.jsii.Kernel.get(this, "insecureInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetriesInput() {
        return software.amazon.jsii.Kernel.get(this, "maxRetriesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProfileInput() {
        return software.amazon.jsii.Kernel.get(this, "profileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ForcePathStyleInput() {
        return software.amazon.jsii.Kernel.get(this, "s3ForcePathStyleInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSharedCredentialsFileInput() {
        return software.amazon.jsii.Kernel.get(this, "sharedCredentialsFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipCredentialsValidationInput() {
        return software.amazon.jsii.Kernel.get(this, "skipCredentialsValidationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipGetEc2PlatformsInput() {
        return software.amazon.jsii.Kernel.get(this, "skipGetEc2PlatformsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipMetadataApiCheckInput() {
        return software.amazon.jsii.Kernel.get(this, "skipMetadataApiCheckInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipRegionValidationInput() {
        return software.amazon.jsii.Kernel.get(this, "skipRegionValidationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipRequestingAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "skipRequestingAccountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessKey() {
        return software.amazon.jsii.Kernel.get(this, "accessKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessKey(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessKey", value);
    }

    @Override
    public @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    @Override
    public void setAlias(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alias", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedAccountIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setAllowedAccountIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedAccountIds", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderAssumeRole> getAssumeRole() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AwsProviderAssumeRole>)(software.amazon.jsii.Kernel.get(this, "assumeRole", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRole.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setAssumeRole(final @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderAssumeRole> value) {
        software.amazon.jsii.Kernel.set(this, "assumeRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderEndpoints> getEndpoints() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AwsProviderEndpoints>)(software.amazon.jsii.Kernel.get(this, "endpoints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderEndpoints.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setEndpoints(final @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderEndpoints> value) {
        software.amazon.jsii.Kernel.set(this, "endpoints", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenAccountIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "forbiddenAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setForbiddenAccountIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "forbiddenAccountIds", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderIgnoreTags> getIgnoreTags() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AwsProviderIgnoreTags>)(software.amazon.jsii.Kernel.get(this, "ignoreTags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderIgnoreTags.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setIgnoreTags(final @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderIgnoreTags> value) {
        software.amazon.jsii.Kernel.set(this, "ignoreTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInsecure() {
        return software.amazon.jsii.Kernel.get(this, "insecure", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setInsecure(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "insecure", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetries() {
        return software.amazon.jsii.Kernel.get(this, "maxRetries", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxRetries(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxRetries", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProfile() {
        return software.amazon.jsii.Kernel.get(this, "profile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProfile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "profile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ForcePathStyle() {
        return software.amazon.jsii.Kernel.get(this, "s3ForcePathStyle", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setS3ForcePathStyle(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "s3ForcePathStyle", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretKey() {
        return software.amazon.jsii.Kernel.get(this, "secretKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretKey(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretKey", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSharedCredentialsFile() {
        return software.amazon.jsii.Kernel.get(this, "sharedCredentialsFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSharedCredentialsFile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sharedCredentialsFile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipCredentialsValidation() {
        return software.amazon.jsii.Kernel.get(this, "skipCredentialsValidation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSkipCredentialsValidation(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipCredentialsValidation", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipGetEc2Platforms() {
        return software.amazon.jsii.Kernel.get(this, "skipGetEc2Platforms", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSkipGetEc2Platforms(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipGetEc2Platforms", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipMetadataApiCheck() {
        return software.amazon.jsii.Kernel.get(this, "skipMetadataApiCheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSkipMetadataApiCheck(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipMetadataApiCheck", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipRegionValidation() {
        return software.amazon.jsii.Kernel.get(this, "skipRegionValidation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSkipRegionValidation(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipRegionValidation", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipRequestingAccountId() {
        return software.amazon.jsii.Kernel.get(this, "skipRequestingAccountId", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSkipRequestingAccountId(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipRequestingAccountId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getToken() {
        return software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setToken(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "token", value);
    }

    /**
     * A fluent builder for {@link imports.aws.AwsProvider}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AwsProvider> {
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
        private final imports.aws.AwsProviderConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AwsProviderConfig.Builder();
        }

        /**
         * The region where AWS operations will take place.
         * <p>
         * Examples
         * are us-east-1, us-west-2, etc.
         * <p>
         * @return {@code this}
         * @param region The region where AWS operations will take place. This parameter is required.
         */
        public Builder region(final java.lang.String region) {
            this.config.region(region);
            return this;
        }

        /**
         * The access key for API operations.
         * <p>
         * You can retrieve this
         * from the 'Security &amp; Credentials' section of the AWS console.
         * <p>
         * @return {@code this}
         * @param accessKey The access key for API operations. This parameter is required.
         */
        public Builder accessKey(final java.lang.String accessKey) {
            this.config.accessKey(accessKey);
            return this;
        }

        /**
         * Alias name.
         * <p>
         * @return {@code this}
         * @param alias Alias name. This parameter is required.
         */
        public Builder alias(final java.lang.String alias) {
            this.config.alias(alias);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowedAccountIds This parameter is required.
         */
        public Builder allowedAccountIds(final java.util.List<java.lang.String> allowedAccountIds) {
            this.config.allowedAccountIds(allowedAccountIds);
            return this;
        }

        /**
         * assume_role block.
         * <p>
         * @return {@code this}
         * @param assumeRole assume_role block. This parameter is required.
         */
        public Builder assumeRole(final java.util.List<? extends imports.aws.AwsProviderAssumeRole> assumeRole) {
            this.config.assumeRole(assumeRole);
            return this;
        }

        /**
         * endpoints block.
         * <p>
         * @return {@code this}
         * @param endpoints endpoints block. This parameter is required.
         */
        public Builder endpoints(final java.util.List<? extends imports.aws.AwsProviderEndpoints> endpoints) {
            this.config.endpoints(endpoints);
            return this;
        }

        /**
         * @return {@code this}
         * @param forbiddenAccountIds This parameter is required.
         */
        public Builder forbiddenAccountIds(final java.util.List<java.lang.String> forbiddenAccountIds) {
            this.config.forbiddenAccountIds(forbiddenAccountIds);
            return this;
        }

        /**
         * ignore_tags block.
         * <p>
         * @return {@code this}
         * @param ignoreTags ignore_tags block. This parameter is required.
         */
        public Builder ignoreTags(final java.util.List<? extends imports.aws.AwsProviderIgnoreTags> ignoreTags) {
            this.config.ignoreTags(ignoreTags);
            return this;
        }

        /**
         * Explicitly allow the provider to perform "insecure" SSL requests.
         * <p>
         * If omitted,default value is <code>false</code>
         * <p>
         * @return {@code this}
         * @param insecure Explicitly allow the provider to perform "insecure" SSL requests. This parameter is required.
         */
        public Builder insecure(final java.lang.Boolean insecure) {
            this.config.insecure(insecure);
            return this;
        }

        /**
         * The maximum number of times an AWS API request is being executed.
         * <p>
         * If the API request still fails, an error is
         * thrown.
         * <p>
         * @return {@code this}
         * @param maxRetries The maximum number of times an AWS API request is being executed. This parameter is required.
         */
        public Builder maxRetries(final java.lang.Number maxRetries) {
            this.config.maxRetries(maxRetries);
            return this;
        }

        /**
         * The profile for API operations.
         * <p>
         * If not set, the default profile
         * created with <code>aws configure</code> will be used.
         * <p>
         * @return {@code this}
         * @param profile The profile for API operations. This parameter is required.
         */
        public Builder profile(final java.lang.String profile) {
            this.config.profile(profile);
            return this;
        }

        /**
         * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         * <p>
         * @return {@code this}
         * @param s3ForcePathStyle Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service. This parameter is required.
         */
        public Builder s3ForcePathStyle(final java.lang.Boolean s3ForcePathStyle) {
            this.config.s3ForcePathStyle(s3ForcePathStyle);
            return this;
        }

        /**
         * The secret key for API operations.
         * <p>
         * You can retrieve this
         * from the 'Security &amp; Credentials' section of the AWS console.
         * <p>
         * @return {@code this}
         * @param secretKey The secret key for API operations. This parameter is required.
         */
        public Builder secretKey(final java.lang.String secretKey) {
            this.config.secretKey(secretKey);
            return this;
        }

        /**
         * The path to the shared credentials file.
         * <p>
         * If not set
         * this defaults to ~/.aws/credentials.
         * <p>
         * @return {@code this}
         * @param sharedCredentialsFile The path to the shared credentials file. This parameter is required.
         */
        public Builder sharedCredentialsFile(final java.lang.String sharedCredentialsFile) {
            this.config.sharedCredentialsFile(sharedCredentialsFile);
            return this;
        }

        /**
         * Skip the credentials validation via STS API.
         * <p>
         * Used for AWS API implementations that do not have STS available/implemented.
         * <p>
         * @return {@code this}
         * @param skipCredentialsValidation Skip the credentials validation via STS API. This parameter is required.
         */
        public Builder skipCredentialsValidation(final java.lang.Boolean skipCredentialsValidation) {
            this.config.skipCredentialsValidation(skipCredentialsValidation);
            return this;
        }

        /**
         * Skip getting the supported EC2 platforms.
         * <p>
         * Used by users that don't have ec2:DescribeAccountAttributes permissions.
         * <p>
         * @return {@code this}
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms. This parameter is required.
         */
        public Builder skipGetEc2Platforms(final java.lang.Boolean skipGetEc2Platforms) {
            this.config.skipGetEc2Platforms(skipGetEc2Platforms);
            return this;
        }

        /**
         * @return {@code this}
         * @param skipMetadataApiCheck This parameter is required.
         */
        public Builder skipMetadataApiCheck(final java.lang.Boolean skipMetadataApiCheck) {
            this.config.skipMetadataApiCheck(skipMetadataApiCheck);
            return this;
        }

        /**
         * Skip static validation of region name.
         * <p>
         * Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
         * <p>
         * @return {@code this}
         * @param skipRegionValidation Skip static validation of region name. This parameter is required.
         */
        public Builder skipRegionValidation(final java.lang.Boolean skipRegionValidation) {
            this.config.skipRegionValidation(skipRegionValidation);
            return this;
        }

        /**
         * Skip requesting the account ID.
         * <p>
         * Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         * <p>
         * @return {@code this}
         * @param skipRequestingAccountId Skip requesting the account ID. This parameter is required.
         */
        public Builder skipRequestingAccountId(final java.lang.Boolean skipRequestingAccountId) {
            this.config.skipRequestingAccountId(skipRequestingAccountId);
            return this;
        }

        /**
         * session token.
         * <p>
         * A session token is only required if you are
         * using temporary security credentials.
         * <p>
         * @return {@code this}
         * @param token session token. This parameter is required.
         */
        public Builder token(final java.lang.String token) {
            this.config.token(token);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AwsProvider}.
         */
        @Override
        public imports.aws.AwsProvider build() {
            return new imports.aws.AwsProvider(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
