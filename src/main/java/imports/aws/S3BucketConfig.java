package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.831Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketConfig")
@software.amazon.jsii.Jsii.Proxy(S3BucketConfig.Jsii$Proxy.class)
public interface S3BucketConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getAccelerationStatus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAcl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBucket() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefix() {
        return null;
    }

    /**
     * cors_rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketCorsRule> getCorsRule() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroy() {
        return null;
    }

    /**
     * grant block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketGrant> getGrant() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHostedZoneId() {
        return null;
    }

    /**
     * lifecycle_rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLifecycleRule> getLifecycleRule() {
        return null;
    }

    /**
     * logging block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLogging> getLogging() {
        return null;
    }

    /**
     * object_lock_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketObjectLockConfiguration> getObjectLockConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    /**
     * replication_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketReplicationConfiguration> getReplicationConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRequestPayer() {
        return null;
    }

    /**
     * server_side_encryption_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration> getServerSideEncryptionConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * versioning block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketVersioning> getVersioning() {
        return null;
    }

    /**
     * website block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketWebsite> getWebsite() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWebsiteDomain() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWebsiteEndpoint() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketConfig> {
        private java.lang.String accelerationStatus;
        private java.lang.String acl;
        private java.lang.String bucket;
        private java.lang.String bucketPrefix;
        private java.util.List<imports.aws.S3BucketCorsRule> corsRule;
        private java.lang.Boolean forceDestroy;
        private java.util.List<imports.aws.S3BucketGrant> grant;
        private java.lang.String hostedZoneId;
        private java.util.List<imports.aws.S3BucketLifecycleRule> lifecycleRule;
        private java.util.List<imports.aws.S3BucketLogging> logging;
        private java.util.List<imports.aws.S3BucketObjectLockConfiguration> objectLockConfiguration;
        private java.lang.String policy;
        private java.lang.String region;
        private java.util.List<imports.aws.S3BucketReplicationConfiguration> replicationConfiguration;
        private java.lang.String requestPayer;
        private java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.S3BucketVersioning> versioning;
        private java.util.List<imports.aws.S3BucketWebsite> website;
        private java.lang.String websiteDomain;
        private java.lang.String websiteEndpoint;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link S3BucketConfig#getAccelerationStatus}
         * @param accelerationStatus the value to be set.
         * @return {@code this}
         */
        public Builder accelerationStatus(java.lang.String accelerationStatus) {
            this.accelerationStatus = accelerationStatus;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAcl}
         * @param acl the value to be set.
         * @return {@code this}
         */
        public Builder acl(java.lang.String acl) {
            this.acl = acl;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getBucket}
         * @param bucket the value to be set.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getBucketPrefix}
         * @param bucketPrefix the value to be set.
         * @return {@code this}
         */
        public Builder bucketPrefix(java.lang.String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getCorsRule}
         * @param corsRule cors_rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder corsRule(java.util.List<? extends imports.aws.S3BucketCorsRule> corsRule) {
            this.corsRule = (java.util.List<imports.aws.S3BucketCorsRule>)corsRule;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getForceDestroy}
         * @param forceDestroy the value to be set.
         * @return {@code this}
         */
        public Builder forceDestroy(java.lang.Boolean forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getGrant}
         * @param grant grant block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder grant(java.util.List<? extends imports.aws.S3BucketGrant> grant) {
            this.grant = (java.util.List<imports.aws.S3BucketGrant>)grant;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getHostedZoneId}
         * @param hostedZoneId the value to be set.
         * @return {@code this}
         */
        public Builder hostedZoneId(java.lang.String hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getLifecycleRule}
         * @param lifecycleRule lifecycle_rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lifecycleRule(java.util.List<? extends imports.aws.S3BucketLifecycleRule> lifecycleRule) {
            this.lifecycleRule = (java.util.List<imports.aws.S3BucketLifecycleRule>)lifecycleRule;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getLogging}
         * @param logging logging block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder logging(java.util.List<? extends imports.aws.S3BucketLogging> logging) {
            this.logging = (java.util.List<imports.aws.S3BucketLogging>)logging;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getObjectLockConfiguration}
         * @param objectLockConfiguration object_lock_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder objectLockConfiguration(java.util.List<? extends imports.aws.S3BucketObjectLockConfiguration> objectLockConfiguration) {
            this.objectLockConfiguration = (java.util.List<imports.aws.S3BucketObjectLockConfiguration>)objectLockConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getPolicy}
         * @param policy the value to be set.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getRegion}
         * @param region the value to be set.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getReplicationConfiguration}
         * @param replicationConfiguration replication_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder replicationConfiguration(java.util.List<? extends imports.aws.S3BucketReplicationConfiguration> replicationConfiguration) {
            this.replicationConfiguration = (java.util.List<imports.aws.S3BucketReplicationConfiguration>)replicationConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getRequestPayer}
         * @param requestPayer the value to be set.
         * @return {@code this}
         */
        public Builder requestPayer(java.lang.String requestPayer) {
            this.requestPayer = requestPayer;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getServerSideEncryptionConfiguration}
         * @param serverSideEncryptionConfiguration server_side_encryption_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder serverSideEncryptionConfiguration(java.util.List<? extends imports.aws.S3BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = (java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration>)serverSideEncryptionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getVersioning}
         * @param versioning versioning block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder versioning(java.util.List<? extends imports.aws.S3BucketVersioning> versioning) {
            this.versioning = (java.util.List<imports.aws.S3BucketVersioning>)versioning;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getWebsite}
         * @param website website block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder website(java.util.List<? extends imports.aws.S3BucketWebsite> website) {
            this.website = (java.util.List<imports.aws.S3BucketWebsite>)website;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getWebsiteDomain}
         * @param websiteDomain the value to be set.
         * @return {@code this}
         */
        public Builder websiteDomain(java.lang.String websiteDomain) {
            this.websiteDomain = websiteDomain;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getWebsiteEndpoint}
         * @param websiteEndpoint the value to be set.
         * @return {@code this}
         */
        public Builder websiteEndpoint(java.lang.String websiteEndpoint) {
            this.websiteEndpoint = websiteEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getDependsOn}
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
         * Sets the value of {@link S3BucketConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getProvider}
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
         * @return a new instance of {@link S3BucketConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketConfig build() {
            return new Jsii$Proxy(accelerationStatus, acl, bucket, bucketPrefix, corsRule, forceDestroy, grant, hostedZoneId, lifecycleRule, logging, objectLockConfiguration, policy, region, replicationConfiguration, requestPayer, serverSideEncryptionConfiguration, tags, versioning, website, websiteDomain, websiteEndpoint, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link S3BucketConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketConfig {
        private final java.lang.String accelerationStatus;
        private final java.lang.String acl;
        private final java.lang.String bucket;
        private final java.lang.String bucketPrefix;
        private final java.util.List<imports.aws.S3BucketCorsRule> corsRule;
        private final java.lang.Boolean forceDestroy;
        private final java.util.List<imports.aws.S3BucketGrant> grant;
        private final java.lang.String hostedZoneId;
        private final java.util.List<imports.aws.S3BucketLifecycleRule> lifecycleRule;
        private final java.util.List<imports.aws.S3BucketLogging> logging;
        private final java.util.List<imports.aws.S3BucketObjectLockConfiguration> objectLockConfiguration;
        private final java.lang.String policy;
        private final java.lang.String region;
        private final java.util.List<imports.aws.S3BucketReplicationConfiguration> replicationConfiguration;
        private final java.lang.String requestPayer;
        private final java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.S3BucketVersioning> versioning;
        private final java.util.List<imports.aws.S3BucketWebsite> website;
        private final java.lang.String websiteDomain;
        private final java.lang.String websiteEndpoint;
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
            this.accelerationStatus = software.amazon.jsii.Kernel.get(this, "accelerationStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.acl = software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketPrefix = software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.corsRule = software.amazon.jsii.Kernel.get(this, "corsRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketCorsRule.class)));
            this.forceDestroy = software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.grant = software.amazon.jsii.Kernel.get(this, "grant", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketGrant.class)));
            this.hostedZoneId = software.amazon.jsii.Kernel.get(this, "hostedZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lifecycleRule = software.amazon.jsii.Kernel.get(this, "lifecycleRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLifecycleRule.class)));
            this.logging = software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLogging.class)));
            this.objectLockConfiguration = software.amazon.jsii.Kernel.get(this, "objectLockConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketObjectLockConfiguration.class)));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationConfiguration = software.amazon.jsii.Kernel.get(this, "replicationConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfiguration.class)));
            this.requestPayer = software.amazon.jsii.Kernel.get(this, "requestPayer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serverSideEncryptionConfiguration = software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketServerSideEncryptionConfiguration.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.versioning = software.amazon.jsii.Kernel.get(this, "versioning", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketVersioning.class)));
            this.website = software.amazon.jsii.Kernel.get(this, "website", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketWebsite.class)));
            this.websiteDomain = software.amazon.jsii.Kernel.get(this, "websiteDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.websiteEndpoint = software.amazon.jsii.Kernel.get(this, "websiteEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String accelerationStatus, final java.lang.String acl, final java.lang.String bucket, final java.lang.String bucketPrefix, final java.util.List<? extends imports.aws.S3BucketCorsRule> corsRule, final java.lang.Boolean forceDestroy, final java.util.List<? extends imports.aws.S3BucketGrant> grant, final java.lang.String hostedZoneId, final java.util.List<? extends imports.aws.S3BucketLifecycleRule> lifecycleRule, final java.util.List<? extends imports.aws.S3BucketLogging> logging, final java.util.List<? extends imports.aws.S3BucketObjectLockConfiguration> objectLockConfiguration, final java.lang.String policy, final java.lang.String region, final java.util.List<? extends imports.aws.S3BucketReplicationConfiguration> replicationConfiguration, final java.lang.String requestPayer, final java.util.List<? extends imports.aws.S3BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.S3BucketVersioning> versioning, final java.util.List<? extends imports.aws.S3BucketWebsite> website, final java.lang.String websiteDomain, final java.lang.String websiteEndpoint, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accelerationStatus = accelerationStatus;
            this.acl = acl;
            this.bucket = bucket;
            this.bucketPrefix = bucketPrefix;
            this.corsRule = (java.util.List<imports.aws.S3BucketCorsRule>)corsRule;
            this.forceDestroy = forceDestroy;
            this.grant = (java.util.List<imports.aws.S3BucketGrant>)grant;
            this.hostedZoneId = hostedZoneId;
            this.lifecycleRule = (java.util.List<imports.aws.S3BucketLifecycleRule>)lifecycleRule;
            this.logging = (java.util.List<imports.aws.S3BucketLogging>)logging;
            this.objectLockConfiguration = (java.util.List<imports.aws.S3BucketObjectLockConfiguration>)objectLockConfiguration;
            this.policy = policy;
            this.region = region;
            this.replicationConfiguration = (java.util.List<imports.aws.S3BucketReplicationConfiguration>)replicationConfiguration;
            this.requestPayer = requestPayer;
            this.serverSideEncryptionConfiguration = (java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration>)serverSideEncryptionConfiguration;
            this.tags = tags;
            this.versioning = (java.util.List<imports.aws.S3BucketVersioning>)versioning;
            this.website = (java.util.List<imports.aws.S3BucketWebsite>)website;
            this.websiteDomain = websiteDomain;
            this.websiteEndpoint = websiteEndpoint;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAccelerationStatus() {
            return this.accelerationStatus;
        }

        @Override
        public final java.lang.String getAcl() {
            return this.acl;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getBucketPrefix() {
            return this.bucketPrefix;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketCorsRule> getCorsRule() {
            return this.corsRule;
        }

        @Override
        public final java.lang.Boolean getForceDestroy() {
            return this.forceDestroy;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketGrant> getGrant() {
            return this.grant;
        }

        @Override
        public final java.lang.String getHostedZoneId() {
            return this.hostedZoneId;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketLifecycleRule> getLifecycleRule() {
            return this.lifecycleRule;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketLogging> getLogging() {
            return this.logging;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketObjectLockConfiguration> getObjectLockConfiguration() {
            return this.objectLockConfiguration;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketReplicationConfiguration> getReplicationConfiguration() {
            return this.replicationConfiguration;
        }

        @Override
        public final java.lang.String getRequestPayer() {
            return this.requestPayer;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketServerSideEncryptionConfiguration> getServerSideEncryptionConfiguration() {
            return this.serverSideEncryptionConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketVersioning> getVersioning() {
            return this.versioning;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketWebsite> getWebsite() {
            return this.website;
        }

        @Override
        public final java.lang.String getWebsiteDomain() {
            return this.websiteDomain;
        }

        @Override
        public final java.lang.String getWebsiteEndpoint() {
            return this.websiteEndpoint;
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

            if (this.getAccelerationStatus() != null) {
                data.set("accelerationStatus", om.valueToTree(this.getAccelerationStatus()));
            }
            if (this.getAcl() != null) {
                data.set("acl", om.valueToTree(this.getAcl()));
            }
            if (this.getBucket() != null) {
                data.set("bucket", om.valueToTree(this.getBucket()));
            }
            if (this.getBucketPrefix() != null) {
                data.set("bucketPrefix", om.valueToTree(this.getBucketPrefix()));
            }
            if (this.getCorsRule() != null) {
                data.set("corsRule", om.valueToTree(this.getCorsRule()));
            }
            if (this.getForceDestroy() != null) {
                data.set("forceDestroy", om.valueToTree(this.getForceDestroy()));
            }
            if (this.getGrant() != null) {
                data.set("grant", om.valueToTree(this.getGrant()));
            }
            if (this.getHostedZoneId() != null) {
                data.set("hostedZoneId", om.valueToTree(this.getHostedZoneId()));
            }
            if (this.getLifecycleRule() != null) {
                data.set("lifecycleRule", om.valueToTree(this.getLifecycleRule()));
            }
            if (this.getLogging() != null) {
                data.set("logging", om.valueToTree(this.getLogging()));
            }
            if (this.getObjectLockConfiguration() != null) {
                data.set("objectLockConfiguration", om.valueToTree(this.getObjectLockConfiguration()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getReplicationConfiguration() != null) {
                data.set("replicationConfiguration", om.valueToTree(this.getReplicationConfiguration()));
            }
            if (this.getRequestPayer() != null) {
                data.set("requestPayer", om.valueToTree(this.getRequestPayer()));
            }
            if (this.getServerSideEncryptionConfiguration() != null) {
                data.set("serverSideEncryptionConfiguration", om.valueToTree(this.getServerSideEncryptionConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVersioning() != null) {
                data.set("versioning", om.valueToTree(this.getVersioning()));
            }
            if (this.getWebsite() != null) {
                data.set("website", om.valueToTree(this.getWebsite()));
            }
            if (this.getWebsiteDomain() != null) {
                data.set("websiteDomain", om.valueToTree(this.getWebsiteDomain()));
            }
            if (this.getWebsiteEndpoint() != null) {
                data.set("websiteEndpoint", om.valueToTree(this.getWebsiteEndpoint()));
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
            struct.set("fqn", om.valueToTree("aws.S3BucketConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketConfig.Jsii$Proxy that = (S3BucketConfig.Jsii$Proxy) o;

            if (this.accelerationStatus != null ? !this.accelerationStatus.equals(that.accelerationStatus) : that.accelerationStatus != null) return false;
            if (this.acl != null ? !this.acl.equals(that.acl) : that.acl != null) return false;
            if (this.bucket != null ? !this.bucket.equals(that.bucket) : that.bucket != null) return false;
            if (this.bucketPrefix != null ? !this.bucketPrefix.equals(that.bucketPrefix) : that.bucketPrefix != null) return false;
            if (this.corsRule != null ? !this.corsRule.equals(that.corsRule) : that.corsRule != null) return false;
            if (this.forceDestroy != null ? !this.forceDestroy.equals(that.forceDestroy) : that.forceDestroy != null) return false;
            if (this.grant != null ? !this.grant.equals(that.grant) : that.grant != null) return false;
            if (this.hostedZoneId != null ? !this.hostedZoneId.equals(that.hostedZoneId) : that.hostedZoneId != null) return false;
            if (this.lifecycleRule != null ? !this.lifecycleRule.equals(that.lifecycleRule) : that.lifecycleRule != null) return false;
            if (this.logging != null ? !this.logging.equals(that.logging) : that.logging != null) return false;
            if (this.objectLockConfiguration != null ? !this.objectLockConfiguration.equals(that.objectLockConfiguration) : that.objectLockConfiguration != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            if (this.replicationConfiguration != null ? !this.replicationConfiguration.equals(that.replicationConfiguration) : that.replicationConfiguration != null) return false;
            if (this.requestPayer != null ? !this.requestPayer.equals(that.requestPayer) : that.requestPayer != null) return false;
            if (this.serverSideEncryptionConfiguration != null ? !this.serverSideEncryptionConfiguration.equals(that.serverSideEncryptionConfiguration) : that.serverSideEncryptionConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.versioning != null ? !this.versioning.equals(that.versioning) : that.versioning != null) return false;
            if (this.website != null ? !this.website.equals(that.website) : that.website != null) return false;
            if (this.websiteDomain != null ? !this.websiteDomain.equals(that.websiteDomain) : that.websiteDomain != null) return false;
            if (this.websiteEndpoint != null ? !this.websiteEndpoint.equals(that.websiteEndpoint) : that.websiteEndpoint != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accelerationStatus != null ? this.accelerationStatus.hashCode() : 0;
            result = 31 * result + (this.acl != null ? this.acl.hashCode() : 0);
            result = 31 * result + (this.bucket != null ? this.bucket.hashCode() : 0);
            result = 31 * result + (this.bucketPrefix != null ? this.bucketPrefix.hashCode() : 0);
            result = 31 * result + (this.corsRule != null ? this.corsRule.hashCode() : 0);
            result = 31 * result + (this.forceDestroy != null ? this.forceDestroy.hashCode() : 0);
            result = 31 * result + (this.grant != null ? this.grant.hashCode() : 0);
            result = 31 * result + (this.hostedZoneId != null ? this.hostedZoneId.hashCode() : 0);
            result = 31 * result + (this.lifecycleRule != null ? this.lifecycleRule.hashCode() : 0);
            result = 31 * result + (this.logging != null ? this.logging.hashCode() : 0);
            result = 31 * result + (this.objectLockConfiguration != null ? this.objectLockConfiguration.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.replicationConfiguration != null ? this.replicationConfiguration.hashCode() : 0);
            result = 31 * result + (this.requestPayer != null ? this.requestPayer.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryptionConfiguration != null ? this.serverSideEncryptionConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.versioning != null ? this.versioning.hashCode() : 0);
            result = 31 * result + (this.website != null ? this.website.hashCode() : 0);
            result = 31 * result + (this.websiteDomain != null ? this.websiteDomain.hashCode() : 0);
            result = 31 * result + (this.websiteEndpoint != null ? this.websiteEndpoint.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
