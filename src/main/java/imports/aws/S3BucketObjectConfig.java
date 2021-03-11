package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.836Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketObjectConfig")
@software.amazon.jsii.Jsii.Proxy(S3BucketObjectConfig.Jsii$Proxy.class)
public interface S3BucketObjectConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getBucket();

    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    default @org.jetbrains.annotations.Nullable java.lang.String getAcl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCacheControl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContent() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContentBase64() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContentDisposition() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContentEncoding() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContentLanguage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContentType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEtag() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getObjectLockLegalHoldStatus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getObjectLockMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getObjectLockRetainUntilDate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServerSideEncryption() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClass() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWebsiteRedirect() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketObjectConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketObjectConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketObjectConfig> {
        private java.lang.String bucket;
        private java.lang.String key;
        private java.lang.String acl;
        private java.lang.String cacheControl;
        private java.lang.String content;
        private java.lang.String contentBase64;
        private java.lang.String contentDisposition;
        private java.lang.String contentEncoding;
        private java.lang.String contentLanguage;
        private java.lang.String contentType;
        private java.lang.String etag;
        private java.lang.Boolean forceDestroy;
        private java.lang.String kmsKeyId;
        private java.util.Map<java.lang.String, java.lang.String> metadata;
        private java.lang.String objectLockLegalHoldStatus;
        private java.lang.String objectLockMode;
        private java.lang.String objectLockRetainUntilDate;
        private java.lang.String serverSideEncryption;
        private java.lang.String source;
        private java.lang.String storageClass;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String websiteRedirect;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link S3BucketObjectConfig#getBucket}
         * @param bucket the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getKey}
         * @param key the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getAcl}
         * @param acl the value to be set.
         * @return {@code this}
         */
        public Builder acl(java.lang.String acl) {
            this.acl = acl;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getCacheControl}
         * @param cacheControl the value to be set.
         * @return {@code this}
         */
        public Builder cacheControl(java.lang.String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getContent}
         * @param content the value to be set.
         * @return {@code this}
         */
        public Builder content(java.lang.String content) {
            this.content = content;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getContentBase64}
         * @param contentBase64 the value to be set.
         * @return {@code this}
         */
        public Builder contentBase64(java.lang.String contentBase64) {
            this.contentBase64 = contentBase64;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getContentDisposition}
         * @param contentDisposition the value to be set.
         * @return {@code this}
         */
        public Builder contentDisposition(java.lang.String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getContentEncoding}
         * @param contentEncoding the value to be set.
         * @return {@code this}
         */
        public Builder contentEncoding(java.lang.String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getContentLanguage}
         * @param contentLanguage the value to be set.
         * @return {@code this}
         */
        public Builder contentLanguage(java.lang.String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getContentType}
         * @param contentType the value to be set.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getEtag}
         * @param etag the value to be set.
         * @return {@code this}
         */
        public Builder etag(java.lang.String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getForceDestroy}
         * @param forceDestroy the value to be set.
         * @return {@code this}
         */
        public Builder forceDestroy(java.lang.Boolean forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(java.util.Map<java.lang.String, java.lang.String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getObjectLockLegalHoldStatus}
         * @param objectLockLegalHoldStatus the value to be set.
         * @return {@code this}
         */
        public Builder objectLockLegalHoldStatus(java.lang.String objectLockLegalHoldStatus) {
            this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getObjectLockMode}
         * @param objectLockMode the value to be set.
         * @return {@code this}
         */
        public Builder objectLockMode(java.lang.String objectLockMode) {
            this.objectLockMode = objectLockMode;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getObjectLockRetainUntilDate}
         * @param objectLockRetainUntilDate the value to be set.
         * @return {@code this}
         */
        public Builder objectLockRetainUntilDate(java.lang.String objectLockRetainUntilDate) {
            this.objectLockRetainUntilDate = objectLockRetainUntilDate;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getServerSideEncryption}
         * @param serverSideEncryption the value to be set.
         * @return {@code this}
         */
        public Builder serverSideEncryption(java.lang.String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getSource}
         * @param source the value to be set.
         * @return {@code this}
         */
        public Builder source(java.lang.String source) {
            this.source = source;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getStorageClass}
         * @param storageClass the value to be set.
         * @return {@code this}
         */
        public Builder storageClass(java.lang.String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getWebsiteRedirect}
         * @param websiteRedirect the value to be set.
         * @return {@code this}
         */
        public Builder websiteRedirect(java.lang.String websiteRedirect) {
            this.websiteRedirect = websiteRedirect;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getDependsOn}
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
         * Sets the value of {@link S3BucketObjectConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectConfig#getProvider}
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
         * @return a new instance of {@link S3BucketObjectConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketObjectConfig build() {
            return new Jsii$Proxy(bucket, key, acl, cacheControl, content, contentBase64, contentDisposition, contentEncoding, contentLanguage, contentType, etag, forceDestroy, kmsKeyId, metadata, objectLockLegalHoldStatus, objectLockMode, objectLockRetainUntilDate, serverSideEncryption, source, storageClass, tags, websiteRedirect, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link S3BucketObjectConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketObjectConfig {
        private final java.lang.String bucket;
        private final java.lang.String key;
        private final java.lang.String acl;
        private final java.lang.String cacheControl;
        private final java.lang.String content;
        private final java.lang.String contentBase64;
        private final java.lang.String contentDisposition;
        private final java.lang.String contentEncoding;
        private final java.lang.String contentLanguage;
        private final java.lang.String contentType;
        private final java.lang.String etag;
        private final java.lang.Boolean forceDestroy;
        private final java.lang.String kmsKeyId;
        private final java.util.Map<java.lang.String, java.lang.String> metadata;
        private final java.lang.String objectLockLegalHoldStatus;
        private final java.lang.String objectLockMode;
        private final java.lang.String objectLockRetainUntilDate;
        private final java.lang.String serverSideEncryption;
        private final java.lang.String source;
        private final java.lang.String storageClass;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String websiteRedirect;
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
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.acl = software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cacheControl = software.amazon.jsii.Kernel.get(this, "cacheControl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.content = software.amazon.jsii.Kernel.get(this, "content", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentBase64 = software.amazon.jsii.Kernel.get(this, "contentBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentDisposition = software.amazon.jsii.Kernel.get(this, "contentDisposition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentEncoding = software.amazon.jsii.Kernel.get(this, "contentEncoding", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentLanguage = software.amazon.jsii.Kernel.get(this, "contentLanguage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.etag = software.amazon.jsii.Kernel.get(this, "etag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.forceDestroy = software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.objectLockLegalHoldStatus = software.amazon.jsii.Kernel.get(this, "objectLockLegalHoldStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.objectLockMode = software.amazon.jsii.Kernel.get(this, "objectLockMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.objectLockRetainUntilDate = software.amazon.jsii.Kernel.get(this, "objectLockRetainUntilDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serverSideEncryption = software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.source = software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageClass = software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.websiteRedirect = software.amazon.jsii.Kernel.get(this, "websiteRedirect", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bucket, final java.lang.String key, final java.lang.String acl, final java.lang.String cacheControl, final java.lang.String content, final java.lang.String contentBase64, final java.lang.String contentDisposition, final java.lang.String contentEncoding, final java.lang.String contentLanguage, final java.lang.String contentType, final java.lang.String etag, final java.lang.Boolean forceDestroy, final java.lang.String kmsKeyId, final java.util.Map<java.lang.String, java.lang.String> metadata, final java.lang.String objectLockLegalHoldStatus, final java.lang.String objectLockMode, final java.lang.String objectLockRetainUntilDate, final java.lang.String serverSideEncryption, final java.lang.String source, final java.lang.String storageClass, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String websiteRedirect, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucket = java.util.Objects.requireNonNull(bucket, "bucket is required");
            this.key = java.util.Objects.requireNonNull(key, "key is required");
            this.acl = acl;
            this.cacheControl = cacheControl;
            this.content = content;
            this.contentBase64 = contentBase64;
            this.contentDisposition = contentDisposition;
            this.contentEncoding = contentEncoding;
            this.contentLanguage = contentLanguage;
            this.contentType = contentType;
            this.etag = etag;
            this.forceDestroy = forceDestroy;
            this.kmsKeyId = kmsKeyId;
            this.metadata = metadata;
            this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
            this.objectLockMode = objectLockMode;
            this.objectLockRetainUntilDate = objectLockRetainUntilDate;
            this.serverSideEncryption = serverSideEncryption;
            this.source = source;
            this.storageClass = storageClass;
            this.tags = tags;
            this.websiteRedirect = websiteRedirect;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getAcl() {
            return this.acl;
        }

        @Override
        public final java.lang.String getCacheControl() {
            return this.cacheControl;
        }

        @Override
        public final java.lang.String getContent() {
            return this.content;
        }

        @Override
        public final java.lang.String getContentBase64() {
            return this.contentBase64;
        }

        @Override
        public final java.lang.String getContentDisposition() {
            return this.contentDisposition;
        }

        @Override
        public final java.lang.String getContentEncoding() {
            return this.contentEncoding;
        }

        @Override
        public final java.lang.String getContentLanguage() {
            return this.contentLanguage;
        }

        @Override
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.String getEtag() {
            return this.etag;
        }

        @Override
        public final java.lang.Boolean getForceDestroy() {
            return this.forceDestroy;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.lang.String getObjectLockLegalHoldStatus() {
            return this.objectLockLegalHoldStatus;
        }

        @Override
        public final java.lang.String getObjectLockMode() {
            return this.objectLockMode;
        }

        @Override
        public final java.lang.String getObjectLockRetainUntilDate() {
            return this.objectLockRetainUntilDate;
        }

        @Override
        public final java.lang.String getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        @Override
        public final java.lang.String getSource() {
            return this.source;
        }

        @Override
        public final java.lang.String getStorageClass() {
            return this.storageClass;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getWebsiteRedirect() {
            return this.websiteRedirect;
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

            data.set("bucket", om.valueToTree(this.getBucket()));
            data.set("key", om.valueToTree(this.getKey()));
            if (this.getAcl() != null) {
                data.set("acl", om.valueToTree(this.getAcl()));
            }
            if (this.getCacheControl() != null) {
                data.set("cacheControl", om.valueToTree(this.getCacheControl()));
            }
            if (this.getContent() != null) {
                data.set("content", om.valueToTree(this.getContent()));
            }
            if (this.getContentBase64() != null) {
                data.set("contentBase64", om.valueToTree(this.getContentBase64()));
            }
            if (this.getContentDisposition() != null) {
                data.set("contentDisposition", om.valueToTree(this.getContentDisposition()));
            }
            if (this.getContentEncoding() != null) {
                data.set("contentEncoding", om.valueToTree(this.getContentEncoding()));
            }
            if (this.getContentLanguage() != null) {
                data.set("contentLanguage", om.valueToTree(this.getContentLanguage()));
            }
            if (this.getContentType() != null) {
                data.set("contentType", om.valueToTree(this.getContentType()));
            }
            if (this.getEtag() != null) {
                data.set("etag", om.valueToTree(this.getEtag()));
            }
            if (this.getForceDestroy() != null) {
                data.set("forceDestroy", om.valueToTree(this.getForceDestroy()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getObjectLockLegalHoldStatus() != null) {
                data.set("objectLockLegalHoldStatus", om.valueToTree(this.getObjectLockLegalHoldStatus()));
            }
            if (this.getObjectLockMode() != null) {
                data.set("objectLockMode", om.valueToTree(this.getObjectLockMode()));
            }
            if (this.getObjectLockRetainUntilDate() != null) {
                data.set("objectLockRetainUntilDate", om.valueToTree(this.getObjectLockRetainUntilDate()));
            }
            if (this.getServerSideEncryption() != null) {
                data.set("serverSideEncryption", om.valueToTree(this.getServerSideEncryption()));
            }
            if (this.getSource() != null) {
                data.set("source", om.valueToTree(this.getSource()));
            }
            if (this.getStorageClass() != null) {
                data.set("storageClass", om.valueToTree(this.getStorageClass()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getWebsiteRedirect() != null) {
                data.set("websiteRedirect", om.valueToTree(this.getWebsiteRedirect()));
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
            struct.set("fqn", om.valueToTree("aws.S3BucketObjectConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketObjectConfig.Jsii$Proxy that = (S3BucketObjectConfig.Jsii$Proxy) o;

            if (!bucket.equals(that.bucket)) return false;
            if (!key.equals(that.key)) return false;
            if (this.acl != null ? !this.acl.equals(that.acl) : that.acl != null) return false;
            if (this.cacheControl != null ? !this.cacheControl.equals(that.cacheControl) : that.cacheControl != null) return false;
            if (this.content != null ? !this.content.equals(that.content) : that.content != null) return false;
            if (this.contentBase64 != null ? !this.contentBase64.equals(that.contentBase64) : that.contentBase64 != null) return false;
            if (this.contentDisposition != null ? !this.contentDisposition.equals(that.contentDisposition) : that.contentDisposition != null) return false;
            if (this.contentEncoding != null ? !this.contentEncoding.equals(that.contentEncoding) : that.contentEncoding != null) return false;
            if (this.contentLanguage != null ? !this.contentLanguage.equals(that.contentLanguage) : that.contentLanguage != null) return false;
            if (this.contentType != null ? !this.contentType.equals(that.contentType) : that.contentType != null) return false;
            if (this.etag != null ? !this.etag.equals(that.etag) : that.etag != null) return false;
            if (this.forceDestroy != null ? !this.forceDestroy.equals(that.forceDestroy) : that.forceDestroy != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.objectLockLegalHoldStatus != null ? !this.objectLockLegalHoldStatus.equals(that.objectLockLegalHoldStatus) : that.objectLockLegalHoldStatus != null) return false;
            if (this.objectLockMode != null ? !this.objectLockMode.equals(that.objectLockMode) : that.objectLockMode != null) return false;
            if (this.objectLockRetainUntilDate != null ? !this.objectLockRetainUntilDate.equals(that.objectLockRetainUntilDate) : that.objectLockRetainUntilDate != null) return false;
            if (this.serverSideEncryption != null ? !this.serverSideEncryption.equals(that.serverSideEncryption) : that.serverSideEncryption != null) return false;
            if (this.source != null ? !this.source.equals(that.source) : that.source != null) return false;
            if (this.storageClass != null ? !this.storageClass.equals(that.storageClass) : that.storageClass != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.websiteRedirect != null ? !this.websiteRedirect.equals(that.websiteRedirect) : that.websiteRedirect != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucket.hashCode();
            result = 31 * result + (this.key.hashCode());
            result = 31 * result + (this.acl != null ? this.acl.hashCode() : 0);
            result = 31 * result + (this.cacheControl != null ? this.cacheControl.hashCode() : 0);
            result = 31 * result + (this.content != null ? this.content.hashCode() : 0);
            result = 31 * result + (this.contentBase64 != null ? this.contentBase64.hashCode() : 0);
            result = 31 * result + (this.contentDisposition != null ? this.contentDisposition.hashCode() : 0);
            result = 31 * result + (this.contentEncoding != null ? this.contentEncoding.hashCode() : 0);
            result = 31 * result + (this.contentLanguage != null ? this.contentLanguage.hashCode() : 0);
            result = 31 * result + (this.contentType != null ? this.contentType.hashCode() : 0);
            result = 31 * result + (this.etag != null ? this.etag.hashCode() : 0);
            result = 31 * result + (this.forceDestroy != null ? this.forceDestroy.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.objectLockLegalHoldStatus != null ? this.objectLockLegalHoldStatus.hashCode() : 0);
            result = 31 * result + (this.objectLockMode != null ? this.objectLockMode.hashCode() : 0);
            result = 31 * result + (this.objectLockRetainUntilDate != null ? this.objectLockRetainUntilDate.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryption != null ? this.serverSideEncryption.hashCode() : 0);
            result = 31 * result + (this.source != null ? this.source.hashCode() : 0);
            result = 31 * result + (this.storageClass != null ? this.storageClass.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.websiteRedirect != null ? this.websiteRedirect.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
