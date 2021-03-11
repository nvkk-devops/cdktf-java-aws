package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.082Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AwsProviderConfig")
@software.amazon.jsii.Jsii.Proxy(AwsProviderConfig.Jsii$Proxy.class)
public interface AwsProviderConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * The region where AWS operations will take place.
     * <p>
     * Examples
     * are us-east-1, us-west-2, etc.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRegion();

    /**
     * The access key for API operations.
     * <p>
     * You can retrieve this
     * from the 'Security &amp; Credentials' section of the AWS console.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccessKey() {
        return null;
    }

    /**
     * Alias name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedAccountIds() {
        return null;
    }

    /**
     * assume_role block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderAssumeRole> getAssumeRole() {
        return null;
    }

    /**
     * endpoints block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderEndpoints> getEndpoints() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenAccountIds() {
        return null;
    }

    /**
     * ignore_tags block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderIgnoreTags> getIgnoreTags() {
        return null;
    }

    /**
     * Explicitly allow the provider to perform "insecure" SSL requests.
     * <p>
     * If omitted,default value is <code>false</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInsecure() {
        return null;
    }

    /**
     * The maximum number of times an AWS API request is being executed.
     * <p>
     * If the API request still fails, an error is
     * thrown.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetries() {
        return null;
    }

    /**
     * The profile for API operations.
     * <p>
     * If not set, the default profile
     * created with <code>aws configure</code> will be used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProfile() {
        return null;
    }

    /**
     * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ForcePathStyle() {
        return null;
    }

    /**
     * The secret key for API operations.
     * <p>
     * You can retrieve this
     * from the 'Security &amp; Credentials' section of the AWS console.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretKey() {
        return null;
    }

    /**
     * The path to the shared credentials file.
     * <p>
     * If not set
     * this defaults to ~/.aws/credentials.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSharedCredentialsFile() {
        return null;
    }

    /**
     * Skip the credentials validation via STS API.
     * <p>
     * Used for AWS API implementations that do not have STS available/implemented.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipCredentialsValidation() {
        return null;
    }

    /**
     * Skip getting the supported EC2 platforms.
     * <p>
     * Used by users that don't have ec2:DescribeAccountAttributes permissions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipGetEc2Platforms() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipMetadataApiCheck() {
        return null;
    }

    /**
     * Skip static validation of region name.
     * <p>
     * Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipRegionValidation() {
        return null;
    }

    /**
     * Skip requesting the account ID.
     * <p>
     * Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipRequestingAccountId() {
        return null;
    }

    /**
     * session token.
     * <p>
     * A session token is only required if you are
     * using temporary security credentials.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AwsProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AwsProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AwsProviderConfig> {
        private java.lang.String region;
        private java.lang.String accessKey;
        private java.lang.String alias;
        private java.util.List<java.lang.String> allowedAccountIds;
        private java.util.List<imports.aws.AwsProviderAssumeRole> assumeRole;
        private java.util.List<imports.aws.AwsProviderEndpoints> endpoints;
        private java.util.List<java.lang.String> forbiddenAccountIds;
        private java.util.List<imports.aws.AwsProviderIgnoreTags> ignoreTags;
        private java.lang.Boolean insecure;
        private java.lang.Number maxRetries;
        private java.lang.String profile;
        private java.lang.Boolean s3ForcePathStyle;
        private java.lang.String secretKey;
        private java.lang.String sharedCredentialsFile;
        private java.lang.Boolean skipCredentialsValidation;
        private java.lang.Boolean skipGetEc2Platforms;
        private java.lang.Boolean skipMetadataApiCheck;
        private java.lang.Boolean skipRegionValidation;
        private java.lang.Boolean skipRequestingAccountId;
        private java.lang.String token;

        /**
         * Sets the value of {@link AwsProviderConfig#getRegion}
         * @param region The region where AWS operations will take place. This parameter is required.
         *               Examples
         *               are us-east-1, us-west-2, etc.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAccessKey}
         * @param accessKey The access key for API operations.
         *                  You can retrieve this
         *                  from the 'Security &amp; Credentials' section of the AWS console.
         * @return {@code this}
         */
        public Builder accessKey(java.lang.String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAlias}
         * @param alias Alias name.
         * @return {@code this}
         */
        public Builder alias(java.lang.String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAllowedAccountIds}
         * @param allowedAccountIds the value to be set.
         * @return {@code this}
         */
        public Builder allowedAccountIds(java.util.List<java.lang.String> allowedAccountIds) {
            this.allowedAccountIds = allowedAccountIds;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAssumeRole}
         * @param assumeRole assume_role block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder assumeRole(java.util.List<? extends imports.aws.AwsProviderAssumeRole> assumeRole) {
            this.assumeRole = (java.util.List<imports.aws.AwsProviderAssumeRole>)assumeRole;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getEndpoints}
         * @param endpoints endpoints block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder endpoints(java.util.List<? extends imports.aws.AwsProviderEndpoints> endpoints) {
            this.endpoints = (java.util.List<imports.aws.AwsProviderEndpoints>)endpoints;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getForbiddenAccountIds}
         * @param forbiddenAccountIds the value to be set.
         * @return {@code this}
         */
        public Builder forbiddenAccountIds(java.util.List<java.lang.String> forbiddenAccountIds) {
            this.forbiddenAccountIds = forbiddenAccountIds;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getIgnoreTags}
         * @param ignoreTags ignore_tags block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ignoreTags(java.util.List<? extends imports.aws.AwsProviderIgnoreTags> ignoreTags) {
            this.ignoreTags = (java.util.List<imports.aws.AwsProviderIgnoreTags>)ignoreTags;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getInsecure}
         * @param insecure Explicitly allow the provider to perform "insecure" SSL requests.
         *                 If omitted,default value is <code>false</code>
         * @return {@code this}
         */
        public Builder insecure(java.lang.Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getMaxRetries}
         * @param maxRetries The maximum number of times an AWS API request is being executed.
         *                   If the API request still fails, an error is
         *                   thrown.
         * @return {@code this}
         */
        public Builder maxRetries(java.lang.Number maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getProfile}
         * @param profile The profile for API operations.
         *                If not set, the default profile
         *                created with <code>aws configure</code> will be used.
         * @return {@code this}
         */
        public Builder profile(java.lang.String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getS3ForcePathStyle}
         * @param s3ForcePathStyle Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         * @return {@code this}
         */
        public Builder s3ForcePathStyle(java.lang.Boolean s3ForcePathStyle) {
            this.s3ForcePathStyle = s3ForcePathStyle;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSecretKey}
         * @param secretKey The secret key for API operations.
         *                  You can retrieve this
         *                  from the 'Security &amp; Credentials' section of the AWS console.
         * @return {@code this}
         */
        public Builder secretKey(java.lang.String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSharedCredentialsFile}
         * @param sharedCredentialsFile The path to the shared credentials file.
         *                              If not set
         *                              this defaults to ~/.aws/credentials.
         * @return {@code this}
         */
        public Builder sharedCredentialsFile(java.lang.String sharedCredentialsFile) {
            this.sharedCredentialsFile = sharedCredentialsFile;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipCredentialsValidation}
         * @param skipCredentialsValidation Skip the credentials validation via STS API.
         *                                  Used for AWS API implementations that do not have STS available/implemented.
         * @return {@code this}
         */
        public Builder skipCredentialsValidation(java.lang.Boolean skipCredentialsValidation) {
            this.skipCredentialsValidation = skipCredentialsValidation;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipGetEc2Platforms}
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms.
         *                            Used by users that don't have ec2:DescribeAccountAttributes permissions.
         * @return {@code this}
         */
        public Builder skipGetEc2Platforms(java.lang.Boolean skipGetEc2Platforms) {
            this.skipGetEc2Platforms = skipGetEc2Platforms;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipMetadataApiCheck}
         * @param skipMetadataApiCheck the value to be set.
         * @return {@code this}
         */
        public Builder skipMetadataApiCheck(java.lang.Boolean skipMetadataApiCheck) {
            this.skipMetadataApiCheck = skipMetadataApiCheck;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipRegionValidation}
         * @param skipRegionValidation Skip static validation of region name.
         *                             Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
         * @return {@code this}
         */
        public Builder skipRegionValidation(java.lang.Boolean skipRegionValidation) {
            this.skipRegionValidation = skipRegionValidation;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipRequestingAccountId}
         * @param skipRequestingAccountId Skip requesting the account ID.
         *                                Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         * @return {@code this}
         */
        public Builder skipRequestingAccountId(java.lang.Boolean skipRequestingAccountId) {
            this.skipRequestingAccountId = skipRequestingAccountId;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getToken}
         * @param token session token.
         *              A session token is only required if you are
         *              using temporary security credentials.
         * @return {@code this}
         */
        public Builder token(java.lang.String token) {
            this.token = token;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AwsProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AwsProviderConfig build() {
            return new Jsii$Proxy(region, accessKey, alias, allowedAccountIds, assumeRole, endpoints, forbiddenAccountIds, ignoreTags, insecure, maxRetries, profile, s3ForcePathStyle, secretKey, sharedCredentialsFile, skipCredentialsValidation, skipGetEc2Platforms, skipMetadataApiCheck, skipRegionValidation, skipRequestingAccountId, token);
        }
    }

    /**
     * An implementation for {@link AwsProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AwsProviderConfig {
        private final java.lang.String region;
        private final java.lang.String accessKey;
        private final java.lang.String alias;
        private final java.util.List<java.lang.String> allowedAccountIds;
        private final java.util.List<imports.aws.AwsProviderAssumeRole> assumeRole;
        private final java.util.List<imports.aws.AwsProviderEndpoints> endpoints;
        private final java.util.List<java.lang.String> forbiddenAccountIds;
        private final java.util.List<imports.aws.AwsProviderIgnoreTags> ignoreTags;
        private final java.lang.Boolean insecure;
        private final java.lang.Number maxRetries;
        private final java.lang.String profile;
        private final java.lang.Boolean s3ForcePathStyle;
        private final java.lang.String secretKey;
        private final java.lang.String sharedCredentialsFile;
        private final java.lang.Boolean skipCredentialsValidation;
        private final java.lang.Boolean skipGetEc2Platforms;
        private final java.lang.Boolean skipMetadataApiCheck;
        private final java.lang.Boolean skipRegionValidation;
        private final java.lang.Boolean skipRequestingAccountId;
        private final java.lang.String token;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessKey = software.amazon.jsii.Kernel.get(this, "accessKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowedAccountIds = software.amazon.jsii.Kernel.get(this, "allowedAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.assumeRole = software.amazon.jsii.Kernel.get(this, "assumeRole", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRole.class)));
            this.endpoints = software.amazon.jsii.Kernel.get(this, "endpoints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderEndpoints.class)));
            this.forbiddenAccountIds = software.amazon.jsii.Kernel.get(this, "forbiddenAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ignoreTags = software.amazon.jsii.Kernel.get(this, "ignoreTags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderIgnoreTags.class)));
            this.insecure = software.amazon.jsii.Kernel.get(this, "insecure", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.maxRetries = software.amazon.jsii.Kernel.get(this, "maxRetries", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.profile = software.amazon.jsii.Kernel.get(this, "profile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ForcePathStyle = software.amazon.jsii.Kernel.get(this, "s3ForcePathStyle", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.secretKey = software.amazon.jsii.Kernel.get(this, "secretKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sharedCredentialsFile = software.amazon.jsii.Kernel.get(this, "sharedCredentialsFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.skipCredentialsValidation = software.amazon.jsii.Kernel.get(this, "skipCredentialsValidation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.skipGetEc2Platforms = software.amazon.jsii.Kernel.get(this, "skipGetEc2Platforms", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.skipMetadataApiCheck = software.amazon.jsii.Kernel.get(this, "skipMetadataApiCheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.skipRegionValidation = software.amazon.jsii.Kernel.get(this, "skipRegionValidation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.skipRequestingAccountId = software.amazon.jsii.Kernel.get(this, "skipRequestingAccountId", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.token = software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String region, final java.lang.String accessKey, final java.lang.String alias, final java.util.List<java.lang.String> allowedAccountIds, final java.util.List<? extends imports.aws.AwsProviderAssumeRole> assumeRole, final java.util.List<? extends imports.aws.AwsProviderEndpoints> endpoints, final java.util.List<java.lang.String> forbiddenAccountIds, final java.util.List<? extends imports.aws.AwsProviderIgnoreTags> ignoreTags, final java.lang.Boolean insecure, final java.lang.Number maxRetries, final java.lang.String profile, final java.lang.Boolean s3ForcePathStyle, final java.lang.String secretKey, final java.lang.String sharedCredentialsFile, final java.lang.Boolean skipCredentialsValidation, final java.lang.Boolean skipGetEc2Platforms, final java.lang.Boolean skipMetadataApiCheck, final java.lang.Boolean skipRegionValidation, final java.lang.Boolean skipRequestingAccountId, final java.lang.String token) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.region = java.util.Objects.requireNonNull(region, "region is required");
            this.accessKey = accessKey;
            this.alias = alias;
            this.allowedAccountIds = allowedAccountIds;
            this.assumeRole = (java.util.List<imports.aws.AwsProviderAssumeRole>)assumeRole;
            this.endpoints = (java.util.List<imports.aws.AwsProviderEndpoints>)endpoints;
            this.forbiddenAccountIds = forbiddenAccountIds;
            this.ignoreTags = (java.util.List<imports.aws.AwsProviderIgnoreTags>)ignoreTags;
            this.insecure = insecure;
            this.maxRetries = maxRetries;
            this.profile = profile;
            this.s3ForcePathStyle = s3ForcePathStyle;
            this.secretKey = secretKey;
            this.sharedCredentialsFile = sharedCredentialsFile;
            this.skipCredentialsValidation = skipCredentialsValidation;
            this.skipGetEc2Platforms = skipGetEc2Platforms;
            this.skipMetadataApiCheck = skipMetadataApiCheck;
            this.skipRegionValidation = skipRegionValidation;
            this.skipRequestingAccountId = skipRequestingAccountId;
            this.token = token;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getAccessKey() {
            return this.accessKey;
        }

        @Override
        public final java.lang.String getAlias() {
            return this.alias;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedAccountIds() {
            return this.allowedAccountIds;
        }

        @Override
        public final java.util.List<imports.aws.AwsProviderAssumeRole> getAssumeRole() {
            return this.assumeRole;
        }

        @Override
        public final java.util.List<imports.aws.AwsProviderEndpoints> getEndpoints() {
            return this.endpoints;
        }

        @Override
        public final java.util.List<java.lang.String> getForbiddenAccountIds() {
            return this.forbiddenAccountIds;
        }

        @Override
        public final java.util.List<imports.aws.AwsProviderIgnoreTags> getIgnoreTags() {
            return this.ignoreTags;
        }

        @Override
        public final java.lang.Boolean getInsecure() {
            return this.insecure;
        }

        @Override
        public final java.lang.Number getMaxRetries() {
            return this.maxRetries;
        }

        @Override
        public final java.lang.String getProfile() {
            return this.profile;
        }

        @Override
        public final java.lang.Boolean getS3ForcePathStyle() {
            return this.s3ForcePathStyle;
        }

        @Override
        public final java.lang.String getSecretKey() {
            return this.secretKey;
        }

        @Override
        public final java.lang.String getSharedCredentialsFile() {
            return this.sharedCredentialsFile;
        }

        @Override
        public final java.lang.Boolean getSkipCredentialsValidation() {
            return this.skipCredentialsValidation;
        }

        @Override
        public final java.lang.Boolean getSkipGetEc2Platforms() {
            return this.skipGetEc2Platforms;
        }

        @Override
        public final java.lang.Boolean getSkipMetadataApiCheck() {
            return this.skipMetadataApiCheck;
        }

        @Override
        public final java.lang.Boolean getSkipRegionValidation() {
            return this.skipRegionValidation;
        }

        @Override
        public final java.lang.Boolean getSkipRequestingAccountId() {
            return this.skipRequestingAccountId;
        }

        @Override
        public final java.lang.String getToken() {
            return this.token;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("region", om.valueToTree(this.getRegion()));
            if (this.getAccessKey() != null) {
                data.set("accessKey", om.valueToTree(this.getAccessKey()));
            }
            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getAllowedAccountIds() != null) {
                data.set("allowedAccountIds", om.valueToTree(this.getAllowedAccountIds()));
            }
            if (this.getAssumeRole() != null) {
                data.set("assumeRole", om.valueToTree(this.getAssumeRole()));
            }
            if (this.getEndpoints() != null) {
                data.set("endpoints", om.valueToTree(this.getEndpoints()));
            }
            if (this.getForbiddenAccountIds() != null) {
                data.set("forbiddenAccountIds", om.valueToTree(this.getForbiddenAccountIds()));
            }
            if (this.getIgnoreTags() != null) {
                data.set("ignoreTags", om.valueToTree(this.getIgnoreTags()));
            }
            if (this.getInsecure() != null) {
                data.set("insecure", om.valueToTree(this.getInsecure()));
            }
            if (this.getMaxRetries() != null) {
                data.set("maxRetries", om.valueToTree(this.getMaxRetries()));
            }
            if (this.getProfile() != null) {
                data.set("profile", om.valueToTree(this.getProfile()));
            }
            if (this.getS3ForcePathStyle() != null) {
                data.set("s3ForcePathStyle", om.valueToTree(this.getS3ForcePathStyle()));
            }
            if (this.getSecretKey() != null) {
                data.set("secretKey", om.valueToTree(this.getSecretKey()));
            }
            if (this.getSharedCredentialsFile() != null) {
                data.set("sharedCredentialsFile", om.valueToTree(this.getSharedCredentialsFile()));
            }
            if (this.getSkipCredentialsValidation() != null) {
                data.set("skipCredentialsValidation", om.valueToTree(this.getSkipCredentialsValidation()));
            }
            if (this.getSkipGetEc2Platforms() != null) {
                data.set("skipGetEc2Platforms", om.valueToTree(this.getSkipGetEc2Platforms()));
            }
            if (this.getSkipMetadataApiCheck() != null) {
                data.set("skipMetadataApiCheck", om.valueToTree(this.getSkipMetadataApiCheck()));
            }
            if (this.getSkipRegionValidation() != null) {
                data.set("skipRegionValidation", om.valueToTree(this.getSkipRegionValidation()));
            }
            if (this.getSkipRequestingAccountId() != null) {
                data.set("skipRequestingAccountId", om.valueToTree(this.getSkipRequestingAccountId()));
            }
            if (this.getToken() != null) {
                data.set("token", om.valueToTree(this.getToken()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AwsProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AwsProviderConfig.Jsii$Proxy that = (AwsProviderConfig.Jsii$Proxy) o;

            if (!region.equals(that.region)) return false;
            if (this.accessKey != null ? !this.accessKey.equals(that.accessKey) : that.accessKey != null) return false;
            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.allowedAccountIds != null ? !this.allowedAccountIds.equals(that.allowedAccountIds) : that.allowedAccountIds != null) return false;
            if (this.assumeRole != null ? !this.assumeRole.equals(that.assumeRole) : that.assumeRole != null) return false;
            if (this.endpoints != null ? !this.endpoints.equals(that.endpoints) : that.endpoints != null) return false;
            if (this.forbiddenAccountIds != null ? !this.forbiddenAccountIds.equals(that.forbiddenAccountIds) : that.forbiddenAccountIds != null) return false;
            if (this.ignoreTags != null ? !this.ignoreTags.equals(that.ignoreTags) : that.ignoreTags != null) return false;
            if (this.insecure != null ? !this.insecure.equals(that.insecure) : that.insecure != null) return false;
            if (this.maxRetries != null ? !this.maxRetries.equals(that.maxRetries) : that.maxRetries != null) return false;
            if (this.profile != null ? !this.profile.equals(that.profile) : that.profile != null) return false;
            if (this.s3ForcePathStyle != null ? !this.s3ForcePathStyle.equals(that.s3ForcePathStyle) : that.s3ForcePathStyle != null) return false;
            if (this.secretKey != null ? !this.secretKey.equals(that.secretKey) : that.secretKey != null) return false;
            if (this.sharedCredentialsFile != null ? !this.sharedCredentialsFile.equals(that.sharedCredentialsFile) : that.sharedCredentialsFile != null) return false;
            if (this.skipCredentialsValidation != null ? !this.skipCredentialsValidation.equals(that.skipCredentialsValidation) : that.skipCredentialsValidation != null) return false;
            if (this.skipGetEc2Platforms != null ? !this.skipGetEc2Platforms.equals(that.skipGetEc2Platforms) : that.skipGetEc2Platforms != null) return false;
            if (this.skipMetadataApiCheck != null ? !this.skipMetadataApiCheck.equals(that.skipMetadataApiCheck) : that.skipMetadataApiCheck != null) return false;
            if (this.skipRegionValidation != null ? !this.skipRegionValidation.equals(that.skipRegionValidation) : that.skipRegionValidation != null) return false;
            if (this.skipRequestingAccountId != null ? !this.skipRequestingAccountId.equals(that.skipRequestingAccountId) : that.skipRequestingAccountId != null) return false;
            return this.token != null ? this.token.equals(that.token) : that.token == null;
        }

        @Override
        public final int hashCode() {
            int result = this.region.hashCode();
            result = 31 * result + (this.accessKey != null ? this.accessKey.hashCode() : 0);
            result = 31 * result + (this.alias != null ? this.alias.hashCode() : 0);
            result = 31 * result + (this.allowedAccountIds != null ? this.allowedAccountIds.hashCode() : 0);
            result = 31 * result + (this.assumeRole != null ? this.assumeRole.hashCode() : 0);
            result = 31 * result + (this.endpoints != null ? this.endpoints.hashCode() : 0);
            result = 31 * result + (this.forbiddenAccountIds != null ? this.forbiddenAccountIds.hashCode() : 0);
            result = 31 * result + (this.ignoreTags != null ? this.ignoreTags.hashCode() : 0);
            result = 31 * result + (this.insecure != null ? this.insecure.hashCode() : 0);
            result = 31 * result + (this.maxRetries != null ? this.maxRetries.hashCode() : 0);
            result = 31 * result + (this.profile != null ? this.profile.hashCode() : 0);
            result = 31 * result + (this.s3ForcePathStyle != null ? this.s3ForcePathStyle.hashCode() : 0);
            result = 31 * result + (this.secretKey != null ? this.secretKey.hashCode() : 0);
            result = 31 * result + (this.sharedCredentialsFile != null ? this.sharedCredentialsFile.hashCode() : 0);
            result = 31 * result + (this.skipCredentialsValidation != null ? this.skipCredentialsValidation.hashCode() : 0);
            result = 31 * result + (this.skipGetEc2Platforms != null ? this.skipGetEc2Platforms.hashCode() : 0);
            result = 31 * result + (this.skipMetadataApiCheck != null ? this.skipMetadataApiCheck.hashCode() : 0);
            result = 31 * result + (this.skipRegionValidation != null ? this.skipRegionValidation.hashCode() : 0);
            result = 31 * result + (this.skipRequestingAccountId != null ? this.skipRequestingAccountId.hashCode() : 0);
            result = 31 * result + (this.token != null ? this.token.hashCode() : 0);
            return result;
        }
    }
}
