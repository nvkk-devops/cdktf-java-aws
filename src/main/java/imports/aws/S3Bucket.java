package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.829Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3Bucket")
public class S3Bucket extends com.hashicorp.cdktf.TerraformResource {

    protected S3Bucket(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3Bucket(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public S3Bucket(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.S3BucketConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public S3Bucket(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAccelerationStatus() {
        software.amazon.jsii.Kernel.call(this, "resetAccelerationStatus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAcl() {
        software.amazon.jsii.Kernel.call(this, "resetAcl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBucket() {
        software.amazon.jsii.Kernel.call(this, "resetBucket", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBucketPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetBucketPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCorsRule() {
        software.amazon.jsii.Kernel.call(this, "resetCorsRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceDestroy() {
        software.amazon.jsii.Kernel.call(this, "resetForceDestroy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGrant() {
        software.amazon.jsii.Kernel.call(this, "resetGrant", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostedZoneId() {
        software.amazon.jsii.Kernel.call(this, "resetHostedZoneId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLifecycleRule() {
        software.amazon.jsii.Kernel.call(this, "resetLifecycleRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogging() {
        software.amazon.jsii.Kernel.call(this, "resetLogging", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectLockConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetObjectLockConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplicationConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetReplicationConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestPayer() {
        software.amazon.jsii.Kernel.call(this, "resetRequestPayer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryptionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryptionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersioning() {
        software.amazon.jsii.Kernel.call(this, "resetVersioning", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebsite() {
        software.amazon.jsii.Kernel.call(this, "resetWebsite", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebsiteDomain() {
        software.amazon.jsii.Kernel.call(this, "resetWebsiteDomain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebsiteEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetWebsiteEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketDomainName() {
        return software.amazon.jsii.Kernel.get(this, "bucketDomainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketRegionalDomainName() {
        return software.amazon.jsii.Kernel.get(this, "bucketRegionalDomainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccelerationStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "accelerationStatusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAclInput() {
        return software.amazon.jsii.Kernel.get(this, "aclInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketCorsRule> getCorsRuleInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketCorsRule>)(software.amazon.jsii.Kernel.get(this, "corsRuleInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketCorsRule.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroyInput() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroyInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketGrant> getGrantInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketGrant>)(software.amazon.jsii.Kernel.get(this, "grantInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketGrant.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostedZoneIdInput() {
        return software.amazon.jsii.Kernel.get(this, "hostedZoneIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLifecycleRule> getLifecycleRuleInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketLifecycleRule>)(software.amazon.jsii.Kernel.get(this, "lifecycleRuleInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLifecycleRule.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLogging> getLoggingInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketLogging>)(software.amazon.jsii.Kernel.get(this, "loggingInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLogging.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketObjectLockConfiguration> getObjectLockConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketObjectLockConfiguration>)(software.amazon.jsii.Kernel.get(this, "objectLockConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketObjectLockConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "policyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketReplicationConfiguration> getReplicationConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketReplicationConfiguration>)(software.amazon.jsii.Kernel.get(this, "replicationConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRequestPayerInput() {
        return software.amazon.jsii.Kernel.get(this, "requestPayerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration> getServerSideEncryptionConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration>)(software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketServerSideEncryptionConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketVersioning> getVersioningInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketVersioning>)(software.amazon.jsii.Kernel.get(this, "versioningInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketVersioning.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWebsiteDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "websiteDomainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWebsiteEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "websiteEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketWebsite> getWebsiteInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketWebsite>)(software.amazon.jsii.Kernel.get(this, "websiteInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketWebsite.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccelerationStatus() {
        return software.amazon.jsii.Kernel.get(this, "accelerationStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccelerationStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accelerationStatus", java.util.Objects.requireNonNull(value, "accelerationStatus is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcl() {
        return software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAcl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "acl", java.util.Objects.requireNonNull(value, "acl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketPrefix() {
        return software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketPrefix", java.util.Objects.requireNonNull(value, "bucketPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketCorsRule> getCorsRule() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "corsRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketCorsRule.class))));
    }

    public void setCorsRule(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketCorsRule> value) {
        software.amazon.jsii.Kernel.set(this, "corsRule", java.util.Objects.requireNonNull(value, "corsRule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getForceDestroy() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setForceDestroy(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceDestroy", java.util.Objects.requireNonNull(value, "forceDestroy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketGrant> getGrant() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "grant", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketGrant.class))));
    }

    public void setGrant(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketGrant> value) {
        software.amazon.jsii.Kernel.set(this, "grant", java.util.Objects.requireNonNull(value, "grant is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostedZoneId() {
        return software.amazon.jsii.Kernel.get(this, "hostedZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostedZoneId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostedZoneId", java.util.Objects.requireNonNull(value, "hostedZoneId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketLifecycleRule> getLifecycleRule() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lifecycleRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLifecycleRule.class))));
    }

    public void setLifecycleRule(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketLifecycleRule> value) {
        software.amazon.jsii.Kernel.set(this, "lifecycleRule", java.util.Objects.requireNonNull(value, "lifecycleRule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketLogging> getLogging() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLogging.class))));
    }

    public void setLogging(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketLogging> value) {
        software.amazon.jsii.Kernel.set(this, "logging", java.util.Objects.requireNonNull(value, "logging is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketObjectLockConfiguration> getObjectLockConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "objectLockConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketObjectLockConfiguration.class))));
    }

    public void setObjectLockConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketObjectLockConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "objectLockConfiguration", java.util.Objects.requireNonNull(value, "objectLockConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", java.util.Objects.requireNonNull(value, "policy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketReplicationConfiguration> getReplicationConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "replicationConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfiguration.class))));
    }

    public void setReplicationConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketReplicationConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "replicationConfiguration", java.util.Objects.requireNonNull(value, "replicationConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestPayer() {
        return software.amazon.jsii.Kernel.get(this, "requestPayer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestPayer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestPayer", java.util.Objects.requireNonNull(value, "requestPayer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration> getServerSideEncryptionConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketServerSideEncryptionConfiguration.class))));
    }

    public void setServerSideEncryptionConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "serverSideEncryptionConfiguration", java.util.Objects.requireNonNull(value, "serverSideEncryptionConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketVersioning> getVersioning() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "versioning", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketVersioning.class))));
    }

    public void setVersioning(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketVersioning> value) {
        software.amazon.jsii.Kernel.set(this, "versioning", java.util.Objects.requireNonNull(value, "versioning is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketWebsite> getWebsite() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "website", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketWebsite.class))));
    }

    public void setWebsite(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketWebsite> value) {
        software.amazon.jsii.Kernel.set(this, "website", java.util.Objects.requireNonNull(value, "website is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWebsiteDomain() {
        return software.amazon.jsii.Kernel.get(this, "websiteDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWebsiteDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "websiteDomain", java.util.Objects.requireNonNull(value, "websiteDomain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWebsiteEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "websiteEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWebsiteEndpoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "websiteEndpoint", java.util.Objects.requireNonNull(value, "websiteEndpoint is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.S3Bucket}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.S3Bucket> {
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
        private imports.aws.S3BucketConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param accelerationStatus This parameter is required.
         */
        public Builder accelerationStatus(final java.lang.String accelerationStatus) {
            this.config().accelerationStatus(accelerationStatus);
            return this;
        }

        /**
         * @return {@code this}
         * @param acl This parameter is required.
         */
        public Builder acl(final java.lang.String acl) {
            this.config().acl(acl);
            return this;
        }

        /**
         * @return {@code this}
         * @param bucket This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config().bucket(bucket);
            return this;
        }

        /**
         * @return {@code this}
         * @param bucketPrefix This parameter is required.
         */
        public Builder bucketPrefix(final java.lang.String bucketPrefix) {
            this.config().bucketPrefix(bucketPrefix);
            return this;
        }

        /**
         * cors_rule block.
         * <p>
         * @return {@code this}
         * @param corsRule cors_rule block. This parameter is required.
         */
        public Builder corsRule(final java.util.List<? extends imports.aws.S3BucketCorsRule> corsRule) {
            this.config().corsRule(corsRule);
            return this;
        }

        /**
         * @return {@code this}
         * @param forceDestroy This parameter is required.
         */
        public Builder forceDestroy(final java.lang.Boolean forceDestroy) {
            this.config().forceDestroy(forceDestroy);
            return this;
        }

        /**
         * grant block.
         * <p>
         * @return {@code this}
         * @param grant grant block. This parameter is required.
         */
        public Builder grant(final java.util.List<? extends imports.aws.S3BucketGrant> grant) {
            this.config().grant(grant);
            return this;
        }

        /**
         * @return {@code this}
         * @param hostedZoneId This parameter is required.
         */
        public Builder hostedZoneId(final java.lang.String hostedZoneId) {
            this.config().hostedZoneId(hostedZoneId);
            return this;
        }

        /**
         * lifecycle_rule block.
         * <p>
         * @return {@code this}
         * @param lifecycleRule lifecycle_rule block. This parameter is required.
         */
        public Builder lifecycleRule(final java.util.List<? extends imports.aws.S3BucketLifecycleRule> lifecycleRule) {
            this.config().lifecycleRule(lifecycleRule);
            return this;
        }

        /**
         * logging block.
         * <p>
         * @return {@code this}
         * @param logging logging block. This parameter is required.
         */
        public Builder logging(final java.util.List<? extends imports.aws.S3BucketLogging> logging) {
            this.config().logging(logging);
            return this;
        }

        /**
         * object_lock_configuration block.
         * <p>
         * @return {@code this}
         * @param objectLockConfiguration object_lock_configuration block. This parameter is required.
         */
        public Builder objectLockConfiguration(final java.util.List<? extends imports.aws.S3BucketObjectLockConfiguration> objectLockConfiguration) {
            this.config().objectLockConfiguration(objectLockConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param policy This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config().policy(policy);
            return this;
        }

        /**
         * @return {@code this}
         * @param region This parameter is required.
         */
        public Builder region(final java.lang.String region) {
            this.config().region(region);
            return this;
        }

        /**
         * replication_configuration block.
         * <p>
         * @return {@code this}
         * @param replicationConfiguration replication_configuration block. This parameter is required.
         */
        public Builder replicationConfiguration(final java.util.List<? extends imports.aws.S3BucketReplicationConfiguration> replicationConfiguration) {
            this.config().replicationConfiguration(replicationConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestPayer This parameter is required.
         */
        public Builder requestPayer(final java.lang.String requestPayer) {
            this.config().requestPayer(requestPayer);
            return this;
        }

        /**
         * server_side_encryption_configuration block.
         * <p>
         * @return {@code this}
         * @param serverSideEncryptionConfiguration server_side_encryption_configuration block. This parameter is required.
         */
        public Builder serverSideEncryptionConfiguration(final java.util.List<? extends imports.aws.S3BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration) {
            this.config().serverSideEncryptionConfiguration(serverSideEncryptionConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * versioning block.
         * <p>
         * @return {@code this}
         * @param versioning versioning block. This parameter is required.
         */
        public Builder versioning(final java.util.List<? extends imports.aws.S3BucketVersioning> versioning) {
            this.config().versioning(versioning);
            return this;
        }

        /**
         * website block.
         * <p>
         * @return {@code this}
         * @param website website block. This parameter is required.
         */
        public Builder website(final java.util.List<? extends imports.aws.S3BucketWebsite> website) {
            this.config().website(website);
            return this;
        }

        /**
         * @return {@code this}
         * @param websiteDomain This parameter is required.
         */
        public Builder websiteDomain(final java.lang.String websiteDomain) {
            this.config().websiteDomain(websiteDomain);
            return this;
        }

        /**
         * @return {@code this}
         * @param websiteEndpoint This parameter is required.
         */
        public Builder websiteEndpoint(final java.lang.String websiteEndpoint) {
            this.config().websiteEndpoint(websiteEndpoint);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.S3Bucket}.
         */
        @Override
        public imports.aws.S3Bucket build() {
            return new imports.aws.S3Bucket(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.S3BucketConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.S3BucketConfig.Builder();
            }
            return this.config;
        }
    }
}
