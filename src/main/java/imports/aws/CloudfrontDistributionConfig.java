package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.120Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionConfig")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionConfig.Jsii$Proxy.class)
public interface CloudfrontDistributionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * default_cache_behavior block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior> getDefaultCacheBehavior();

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled();

    /**
     * origin block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOrigin> getOrigin();

    /**
     * restrictions block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionRestrictions> getRestrictions();

    /**
     * viewer_certificate block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionViewerCertificate> getViewerCertificate();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAliases() {
        return null;
    }

    /**
     * cache_behavior block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionCacheBehavior> getCacheBehavior() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getComment() {
        return null;
    }

    /**
     * custom_error_response block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse> getCustomErrorResponse() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRootObject() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHttpVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIsIpv6Enabled() {
        return null;
    }

    /**
     * logging_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionLoggingConfig> getLoggingConfig() {
        return null;
    }

    /**
     * ordered_cache_behavior block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior> getOrderedCacheBehavior() {
        return null;
    }

    /**
     * origin_group block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionOriginGroup> getOriginGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPriceClass() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRetainOnDelete() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getWaitForDeployment() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWebAclId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionConfig> {
        private java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior> defaultCacheBehavior;
        private java.lang.Boolean enabled;
        private java.util.List<imports.aws.CloudfrontDistributionOrigin> origin;
        private java.util.List<imports.aws.CloudfrontDistributionRestrictions> restrictions;
        private java.util.List<imports.aws.CloudfrontDistributionViewerCertificate> viewerCertificate;
        private java.util.List<java.lang.String> aliases;
        private java.util.List<imports.aws.CloudfrontDistributionCacheBehavior> cacheBehavior;
        private java.lang.String comment;
        private java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse> customErrorResponse;
        private java.lang.String defaultRootObject;
        private java.lang.String httpVersion;
        private java.lang.Boolean isIpv6Enabled;
        private java.util.List<imports.aws.CloudfrontDistributionLoggingConfig> loggingConfig;
        private java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior> orderedCacheBehavior;
        private java.util.List<imports.aws.CloudfrontDistributionOriginGroup> originGroup;
        private java.lang.String priceClass;
        private java.lang.Boolean retainOnDelete;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean waitForDeployment;
        private java.lang.String webAclId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getDefaultCacheBehavior}
         * @param defaultCacheBehavior default_cache_behavior block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder defaultCacheBehavior(java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehavior> defaultCacheBehavior) {
            this.defaultCacheBehavior = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior>)defaultCacheBehavior;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getEnabled}
         * @param enabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOrigin}
         * @param origin origin block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder origin(java.util.List<? extends imports.aws.CloudfrontDistributionOrigin> origin) {
            this.origin = (java.util.List<imports.aws.CloudfrontDistributionOrigin>)origin;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getRestrictions}
         * @param restrictions restrictions block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder restrictions(java.util.List<? extends imports.aws.CloudfrontDistributionRestrictions> restrictions) {
            this.restrictions = (java.util.List<imports.aws.CloudfrontDistributionRestrictions>)restrictions;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getViewerCertificate}
         * @param viewerCertificate viewer_certificate block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder viewerCertificate(java.util.List<? extends imports.aws.CloudfrontDistributionViewerCertificate> viewerCertificate) {
            this.viewerCertificate = (java.util.List<imports.aws.CloudfrontDistributionViewerCertificate>)viewerCertificate;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getAliases}
         * @param aliases the value to be set.
         * @return {@code this}
         */
        public Builder aliases(java.util.List<java.lang.String> aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getCacheBehavior}
         * @param cacheBehavior cache_behavior block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cacheBehavior(java.util.List<? extends imports.aws.CloudfrontDistributionCacheBehavior> cacheBehavior) {
            this.cacheBehavior = (java.util.List<imports.aws.CloudfrontDistributionCacheBehavior>)cacheBehavior;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getComment}
         * @param comment the value to be set.
         * @return {@code this}
         */
        public Builder comment(java.lang.String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getCustomErrorResponse}
         * @param customErrorResponse custom_error_response block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder customErrorResponse(java.util.List<? extends imports.aws.CloudfrontDistributionCustomErrorResponse> customErrorResponse) {
            this.customErrorResponse = (java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse>)customErrorResponse;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getDefaultRootObject}
         * @param defaultRootObject the value to be set.
         * @return {@code this}
         */
        public Builder defaultRootObject(java.lang.String defaultRootObject) {
            this.defaultRootObject = defaultRootObject;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getHttpVersion}
         * @param httpVersion the value to be set.
         * @return {@code this}
         */
        public Builder httpVersion(java.lang.String httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getIsIpv6Enabled}
         * @param isIpv6Enabled the value to be set.
         * @return {@code this}
         */
        public Builder isIpv6Enabled(java.lang.Boolean isIpv6Enabled) {
            this.isIpv6Enabled = isIpv6Enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getLoggingConfig}
         * @param loggingConfig logging_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder loggingConfig(java.util.List<? extends imports.aws.CloudfrontDistributionLoggingConfig> loggingConfig) {
            this.loggingConfig = (java.util.List<imports.aws.CloudfrontDistributionLoggingConfig>)loggingConfig;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOrderedCacheBehavior}
         * @param orderedCacheBehavior ordered_cache_behavior block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder orderedCacheBehavior(java.util.List<? extends imports.aws.CloudfrontDistributionOrderedCacheBehavior> orderedCacheBehavior) {
            this.orderedCacheBehavior = (java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior>)orderedCacheBehavior;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOriginGroup}
         * @param originGroup origin_group block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder originGroup(java.util.List<? extends imports.aws.CloudfrontDistributionOriginGroup> originGroup) {
            this.originGroup = (java.util.List<imports.aws.CloudfrontDistributionOriginGroup>)originGroup;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getPriceClass}
         * @param priceClass the value to be set.
         * @return {@code this}
         */
        public Builder priceClass(java.lang.String priceClass) {
            this.priceClass = priceClass;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getRetainOnDelete}
         * @param retainOnDelete the value to be set.
         * @return {@code this}
         */
        public Builder retainOnDelete(java.lang.Boolean retainOnDelete) {
            this.retainOnDelete = retainOnDelete;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getWaitForDeployment}
         * @param waitForDeployment the value to be set.
         * @return {@code this}
         */
        public Builder waitForDeployment(java.lang.Boolean waitForDeployment) {
            this.waitForDeployment = waitForDeployment;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getWebAclId}
         * @param webAclId the value to be set.
         * @return {@code this}
         */
        public Builder webAclId(java.lang.String webAclId) {
            this.webAclId = webAclId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getDependsOn}
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
         * Sets the value of {@link CloudfrontDistributionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getProvider}
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
         * @return a new instance of {@link CloudfrontDistributionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionConfig build() {
            return new Jsii$Proxy(defaultCacheBehavior, enabled, origin, restrictions, viewerCertificate, aliases, cacheBehavior, comment, customErrorResponse, defaultRootObject, httpVersion, isIpv6Enabled, loggingConfig, orderedCacheBehavior, originGroup, priceClass, retainOnDelete, tags, waitForDeployment, webAclId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionConfig {
        private final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior> defaultCacheBehavior;
        private final java.lang.Boolean enabled;
        private final java.util.List<imports.aws.CloudfrontDistributionOrigin> origin;
        private final java.util.List<imports.aws.CloudfrontDistributionRestrictions> restrictions;
        private final java.util.List<imports.aws.CloudfrontDistributionViewerCertificate> viewerCertificate;
        private final java.util.List<java.lang.String> aliases;
        private final java.util.List<imports.aws.CloudfrontDistributionCacheBehavior> cacheBehavior;
        private final java.lang.String comment;
        private final java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse> customErrorResponse;
        private final java.lang.String defaultRootObject;
        private final java.lang.String httpVersion;
        private final java.lang.Boolean isIpv6Enabled;
        private final java.util.List<imports.aws.CloudfrontDistributionLoggingConfig> loggingConfig;
        private final java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior> orderedCacheBehavior;
        private final java.util.List<imports.aws.CloudfrontDistributionOriginGroup> originGroup;
        private final java.lang.String priceClass;
        private final java.lang.Boolean retainOnDelete;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Boolean waitForDeployment;
        private final java.lang.String webAclId;
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
            this.defaultCacheBehavior = software.amazon.jsii.Kernel.get(this, "defaultCacheBehavior", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionDefaultCacheBehavior.class)));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.origin = software.amazon.jsii.Kernel.get(this, "origin", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOrigin.class)));
            this.restrictions = software.amazon.jsii.Kernel.get(this, "restrictions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionRestrictions.class)));
            this.viewerCertificate = software.amazon.jsii.Kernel.get(this, "viewerCertificate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionViewerCertificate.class)));
            this.aliases = software.amazon.jsii.Kernel.get(this, "aliases", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.cacheBehavior = software.amazon.jsii.Kernel.get(this, "cacheBehavior", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionCacheBehavior.class)));
            this.comment = software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customErrorResponse = software.amazon.jsii.Kernel.get(this, "customErrorResponse", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionCustomErrorResponse.class)));
            this.defaultRootObject = software.amazon.jsii.Kernel.get(this, "defaultRootObject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpVersion = software.amazon.jsii.Kernel.get(this, "httpVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isIpv6Enabled = software.amazon.jsii.Kernel.get(this, "isIpv6Enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.loggingConfig = software.amazon.jsii.Kernel.get(this, "loggingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionLoggingConfig.class)));
            this.orderedCacheBehavior = software.amazon.jsii.Kernel.get(this, "orderedCacheBehavior", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOrderedCacheBehavior.class)));
            this.originGroup = software.amazon.jsii.Kernel.get(this, "originGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginGroup.class)));
            this.priceClass = software.amazon.jsii.Kernel.get(this, "priceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.retainOnDelete = software.amazon.jsii.Kernel.get(this, "retainOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.waitForDeployment = software.amazon.jsii.Kernel.get(this, "waitForDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.webAclId = software.amazon.jsii.Kernel.get(this, "webAclId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehavior> defaultCacheBehavior, final java.lang.Boolean enabled, final java.util.List<? extends imports.aws.CloudfrontDistributionOrigin> origin, final java.util.List<? extends imports.aws.CloudfrontDistributionRestrictions> restrictions, final java.util.List<? extends imports.aws.CloudfrontDistributionViewerCertificate> viewerCertificate, final java.util.List<java.lang.String> aliases, final java.util.List<? extends imports.aws.CloudfrontDistributionCacheBehavior> cacheBehavior, final java.lang.String comment, final java.util.List<? extends imports.aws.CloudfrontDistributionCustomErrorResponse> customErrorResponse, final java.lang.String defaultRootObject, final java.lang.String httpVersion, final java.lang.Boolean isIpv6Enabled, final java.util.List<? extends imports.aws.CloudfrontDistributionLoggingConfig> loggingConfig, final java.util.List<? extends imports.aws.CloudfrontDistributionOrderedCacheBehavior> orderedCacheBehavior, final java.util.List<? extends imports.aws.CloudfrontDistributionOriginGroup> originGroup, final java.lang.String priceClass, final java.lang.Boolean retainOnDelete, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean waitForDeployment, final java.lang.String webAclId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultCacheBehavior = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior>)java.util.Objects.requireNonNull(defaultCacheBehavior, "defaultCacheBehavior is required");
            this.enabled = java.util.Objects.requireNonNull(enabled, "enabled is required");
            this.origin = (java.util.List<imports.aws.CloudfrontDistributionOrigin>)java.util.Objects.requireNonNull(origin, "origin is required");
            this.restrictions = (java.util.List<imports.aws.CloudfrontDistributionRestrictions>)java.util.Objects.requireNonNull(restrictions, "restrictions is required");
            this.viewerCertificate = (java.util.List<imports.aws.CloudfrontDistributionViewerCertificate>)java.util.Objects.requireNonNull(viewerCertificate, "viewerCertificate is required");
            this.aliases = aliases;
            this.cacheBehavior = (java.util.List<imports.aws.CloudfrontDistributionCacheBehavior>)cacheBehavior;
            this.comment = comment;
            this.customErrorResponse = (java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse>)customErrorResponse;
            this.defaultRootObject = defaultRootObject;
            this.httpVersion = httpVersion;
            this.isIpv6Enabled = isIpv6Enabled;
            this.loggingConfig = (java.util.List<imports.aws.CloudfrontDistributionLoggingConfig>)loggingConfig;
            this.orderedCacheBehavior = (java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior>)orderedCacheBehavior;
            this.originGroup = (java.util.List<imports.aws.CloudfrontDistributionOriginGroup>)originGroup;
            this.priceClass = priceClass;
            this.retainOnDelete = retainOnDelete;
            this.tags = tags;
            this.waitForDeployment = waitForDeployment;
            this.webAclId = webAclId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior> getDefaultCacheBehavior() {
            return this.defaultCacheBehavior;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOrigin> getOrigin() {
            return this.origin;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionRestrictions> getRestrictions() {
            return this.restrictions;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionViewerCertificate> getViewerCertificate() {
            return this.viewerCertificate;
        }

        @Override
        public final java.util.List<java.lang.String> getAliases() {
            return this.aliases;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionCacheBehavior> getCacheBehavior() {
            return this.cacheBehavior;
        }

        @Override
        public final java.lang.String getComment() {
            return this.comment;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse> getCustomErrorResponse() {
            return this.customErrorResponse;
        }

        @Override
        public final java.lang.String getDefaultRootObject() {
            return this.defaultRootObject;
        }

        @Override
        public final java.lang.String getHttpVersion() {
            return this.httpVersion;
        }

        @Override
        public final java.lang.Boolean getIsIpv6Enabled() {
            return this.isIpv6Enabled;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionLoggingConfig> getLoggingConfig() {
            return this.loggingConfig;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior> getOrderedCacheBehavior() {
            return this.orderedCacheBehavior;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOriginGroup> getOriginGroup() {
            return this.originGroup;
        }

        @Override
        public final java.lang.String getPriceClass() {
            return this.priceClass;
        }

        @Override
        public final java.lang.Boolean getRetainOnDelete() {
            return this.retainOnDelete;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Boolean getWaitForDeployment() {
            return this.waitForDeployment;
        }

        @Override
        public final java.lang.String getWebAclId() {
            return this.webAclId;
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

            data.set("defaultCacheBehavior", om.valueToTree(this.getDefaultCacheBehavior()));
            data.set("enabled", om.valueToTree(this.getEnabled()));
            data.set("origin", om.valueToTree(this.getOrigin()));
            data.set("restrictions", om.valueToTree(this.getRestrictions()));
            data.set("viewerCertificate", om.valueToTree(this.getViewerCertificate()));
            if (this.getAliases() != null) {
                data.set("aliases", om.valueToTree(this.getAliases()));
            }
            if (this.getCacheBehavior() != null) {
                data.set("cacheBehavior", om.valueToTree(this.getCacheBehavior()));
            }
            if (this.getComment() != null) {
                data.set("comment", om.valueToTree(this.getComment()));
            }
            if (this.getCustomErrorResponse() != null) {
                data.set("customErrorResponse", om.valueToTree(this.getCustomErrorResponse()));
            }
            if (this.getDefaultRootObject() != null) {
                data.set("defaultRootObject", om.valueToTree(this.getDefaultRootObject()));
            }
            if (this.getHttpVersion() != null) {
                data.set("httpVersion", om.valueToTree(this.getHttpVersion()));
            }
            if (this.getIsIpv6Enabled() != null) {
                data.set("isIpv6Enabled", om.valueToTree(this.getIsIpv6Enabled()));
            }
            if (this.getLoggingConfig() != null) {
                data.set("loggingConfig", om.valueToTree(this.getLoggingConfig()));
            }
            if (this.getOrderedCacheBehavior() != null) {
                data.set("orderedCacheBehavior", om.valueToTree(this.getOrderedCacheBehavior()));
            }
            if (this.getOriginGroup() != null) {
                data.set("originGroup", om.valueToTree(this.getOriginGroup()));
            }
            if (this.getPriceClass() != null) {
                data.set("priceClass", om.valueToTree(this.getPriceClass()));
            }
            if (this.getRetainOnDelete() != null) {
                data.set("retainOnDelete", om.valueToTree(this.getRetainOnDelete()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getWaitForDeployment() != null) {
                data.set("waitForDeployment", om.valueToTree(this.getWaitForDeployment()));
            }
            if (this.getWebAclId() != null) {
                data.set("webAclId", om.valueToTree(this.getWebAclId()));
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
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionConfig.Jsii$Proxy that = (CloudfrontDistributionConfig.Jsii$Proxy) o;

            if (!defaultCacheBehavior.equals(that.defaultCacheBehavior)) return false;
            if (!enabled.equals(that.enabled)) return false;
            if (!origin.equals(that.origin)) return false;
            if (!restrictions.equals(that.restrictions)) return false;
            if (!viewerCertificate.equals(that.viewerCertificate)) return false;
            if (this.aliases != null ? !this.aliases.equals(that.aliases) : that.aliases != null) return false;
            if (this.cacheBehavior != null ? !this.cacheBehavior.equals(that.cacheBehavior) : that.cacheBehavior != null) return false;
            if (this.comment != null ? !this.comment.equals(that.comment) : that.comment != null) return false;
            if (this.customErrorResponse != null ? !this.customErrorResponse.equals(that.customErrorResponse) : that.customErrorResponse != null) return false;
            if (this.defaultRootObject != null ? !this.defaultRootObject.equals(that.defaultRootObject) : that.defaultRootObject != null) return false;
            if (this.httpVersion != null ? !this.httpVersion.equals(that.httpVersion) : that.httpVersion != null) return false;
            if (this.isIpv6Enabled != null ? !this.isIpv6Enabled.equals(that.isIpv6Enabled) : that.isIpv6Enabled != null) return false;
            if (this.loggingConfig != null ? !this.loggingConfig.equals(that.loggingConfig) : that.loggingConfig != null) return false;
            if (this.orderedCacheBehavior != null ? !this.orderedCacheBehavior.equals(that.orderedCacheBehavior) : that.orderedCacheBehavior != null) return false;
            if (this.originGroup != null ? !this.originGroup.equals(that.originGroup) : that.originGroup != null) return false;
            if (this.priceClass != null ? !this.priceClass.equals(that.priceClass) : that.priceClass != null) return false;
            if (this.retainOnDelete != null ? !this.retainOnDelete.equals(that.retainOnDelete) : that.retainOnDelete != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.waitForDeployment != null ? !this.waitForDeployment.equals(that.waitForDeployment) : that.waitForDeployment != null) return false;
            if (this.webAclId != null ? !this.webAclId.equals(that.webAclId) : that.webAclId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultCacheBehavior.hashCode();
            result = 31 * result + (this.enabled.hashCode());
            result = 31 * result + (this.origin.hashCode());
            result = 31 * result + (this.restrictions.hashCode());
            result = 31 * result + (this.viewerCertificate.hashCode());
            result = 31 * result + (this.aliases != null ? this.aliases.hashCode() : 0);
            result = 31 * result + (this.cacheBehavior != null ? this.cacheBehavior.hashCode() : 0);
            result = 31 * result + (this.comment != null ? this.comment.hashCode() : 0);
            result = 31 * result + (this.customErrorResponse != null ? this.customErrorResponse.hashCode() : 0);
            result = 31 * result + (this.defaultRootObject != null ? this.defaultRootObject.hashCode() : 0);
            result = 31 * result + (this.httpVersion != null ? this.httpVersion.hashCode() : 0);
            result = 31 * result + (this.isIpv6Enabled != null ? this.isIpv6Enabled.hashCode() : 0);
            result = 31 * result + (this.loggingConfig != null ? this.loggingConfig.hashCode() : 0);
            result = 31 * result + (this.orderedCacheBehavior != null ? this.orderedCacheBehavior.hashCode() : 0);
            result = 31 * result + (this.originGroup != null ? this.originGroup.hashCode() : 0);
            result = 31 * result + (this.priceClass != null ? this.priceClass.hashCode() : 0);
            result = 31 * result + (this.retainOnDelete != null ? this.retainOnDelete.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.waitForDeployment != null ? this.waitForDeployment.hashCode() : 0);
            result = 31 * result + (this.webAclId != null ? this.webAclId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
