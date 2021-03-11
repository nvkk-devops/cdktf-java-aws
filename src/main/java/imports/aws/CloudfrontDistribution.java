package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.117Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistribution")
public class CloudfrontDistribution extends com.hashicorp.cdktf.TerraformResource {

    protected CloudfrontDistribution(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistribution(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CloudfrontDistribution(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CloudfrontDistributionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String activeTrustedSigners(final @org.jetbrains.annotations.NotNull java.lang.String key) {
        return software.amazon.jsii.Kernel.call(this, "activeTrustedSigners", software.amazon.jsii.NativeType.forClass(java.lang.String.class), new Object[] { java.util.Objects.requireNonNull(key, "key is required") });
    }

    public void resetAliases() {
        software.amazon.jsii.Kernel.call(this, "resetAliases", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCacheBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetCacheBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetComment() {
        software.amazon.jsii.Kernel.call(this, "resetComment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomErrorResponse() {
        software.amazon.jsii.Kernel.call(this, "resetCustomErrorResponse", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultRootObject() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultRootObject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpVersion() {
        software.amazon.jsii.Kernel.call(this, "resetHttpVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsIpv6Enabled() {
        software.amazon.jsii.Kernel.call(this, "resetIsIpv6Enabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoggingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLoggingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrderedCacheBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetOrderedCacheBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOriginGroup() {
        software.amazon.jsii.Kernel.call(this, "resetOriginGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPriceClass() {
        software.amazon.jsii.Kernel.call(this, "resetPriceClass", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetainOnDelete() {
        software.amazon.jsii.Kernel.call(this, "resetRetainOnDelete", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForDeployment() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForDeployment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebAclId() {
        software.amazon.jsii.Kernel.call(this, "resetWebAclId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCallerReference() {
        return software.amazon.jsii.Kernel.get(this, "callerReference", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior> getDefaultCacheBehaviorInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "defaultCacheBehaviorInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionDefaultCacheBehavior.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEtag() {
        return software.amazon.jsii.Kernel.get(this, "etag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostedZoneId() {
        return software.amazon.jsii.Kernel.get(this, "hostedZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInProgressValidationBatches() {
        return software.amazon.jsii.Kernel.get(this, "inProgressValidationBatches", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModifiedTime() {
        return software.amazon.jsii.Kernel.get(this, "lastModifiedTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOrigin> getOriginInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "originInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOrigin.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionRestrictions> getRestrictionsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "restrictionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionRestrictions.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionViewerCertificate> getViewerCertificateInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "viewerCertificateInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionViewerCertificate.class))));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAliasesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "aliasesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionCacheBehavior> getCacheBehaviorInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudfrontDistributionCacheBehavior>)(software.amazon.jsii.Kernel.get(this, "cacheBehaviorInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionCacheBehavior.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCommentInput() {
        return software.amazon.jsii.Kernel.get(this, "commentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse> getCustomErrorResponseInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse>)(software.amazon.jsii.Kernel.get(this, "customErrorResponseInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionCustomErrorResponse.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultRootObjectInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultRootObjectInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "httpVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIsIpv6EnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "isIpv6EnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionLoggingConfig> getLoggingConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudfrontDistributionLoggingConfig>)(software.amazon.jsii.Kernel.get(this, "loggingConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionLoggingConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior> getOrderedCacheBehaviorInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior>)(software.amazon.jsii.Kernel.get(this, "orderedCacheBehaviorInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOrderedCacheBehavior.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionOriginGroup> getOriginGroupInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudfrontDistributionOriginGroup>)(software.amazon.jsii.Kernel.get(this, "originGroupInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginGroup.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPriceClassInput() {
        return software.amazon.jsii.Kernel.get(this, "priceClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRetainOnDeleteInput() {
        return software.amazon.jsii.Kernel.get(this, "retainOnDeleteInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getWaitForDeploymentInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForDeploymentInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWebAclIdInput() {
        return software.amazon.jsii.Kernel.get(this, "webAclIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAliases() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "aliases", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAliases(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "aliases", java.util.Objects.requireNonNull(value, "aliases is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionCacheBehavior> getCacheBehavior() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cacheBehavior", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionCacheBehavior.class))));
    }

    public void setCacheBehavior(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionCacheBehavior> value) {
        software.amazon.jsii.Kernel.set(this, "cacheBehavior", java.util.Objects.requireNonNull(value, "cacheBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComment() {
        return software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComment(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "comment", java.util.Objects.requireNonNull(value, "comment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse> getCustomErrorResponse() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customErrorResponse", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionCustomErrorResponse.class))));
    }

    public void setCustomErrorResponse(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionCustomErrorResponse> value) {
        software.amazon.jsii.Kernel.set(this, "customErrorResponse", java.util.Objects.requireNonNull(value, "customErrorResponse is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior> getDefaultCacheBehavior() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "defaultCacheBehavior", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionDefaultCacheBehavior.class))));
    }

    public void setDefaultCacheBehavior(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehavior> value) {
        software.amazon.jsii.Kernel.set(this, "defaultCacheBehavior", java.util.Objects.requireNonNull(value, "defaultCacheBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultRootObject() {
        return software.amazon.jsii.Kernel.get(this, "defaultRootObject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultRootObject(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultRootObject", java.util.Objects.requireNonNull(value, "defaultRootObject is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpVersion() {
        return software.amazon.jsii.Kernel.get(this, "httpVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpVersion", java.util.Objects.requireNonNull(value, "httpVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIsIpv6Enabled() {
        return software.amazon.jsii.Kernel.get(this, "isIpv6Enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIsIpv6Enabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isIpv6Enabled", java.util.Objects.requireNonNull(value, "isIpv6Enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionLoggingConfig> getLoggingConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loggingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionLoggingConfig.class))));
    }

    public void setLoggingConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionLoggingConfig> value) {
        software.amazon.jsii.Kernel.set(this, "loggingConfig", java.util.Objects.requireNonNull(value, "loggingConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior> getOrderedCacheBehavior() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "orderedCacheBehavior", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOrderedCacheBehavior.class))));
    }

    public void setOrderedCacheBehavior(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOrderedCacheBehavior> value) {
        software.amazon.jsii.Kernel.set(this, "orderedCacheBehavior", java.util.Objects.requireNonNull(value, "orderedCacheBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOrigin> getOrigin() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "origin", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOrigin.class))));
    }

    public void setOrigin(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOrigin> value) {
        software.amazon.jsii.Kernel.set(this, "origin", java.util.Objects.requireNonNull(value, "origin is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOriginGroup> getOriginGroup() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "originGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginGroup.class))));
    }

    public void setOriginGroup(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOriginGroup> value) {
        software.amazon.jsii.Kernel.set(this, "originGroup", java.util.Objects.requireNonNull(value, "originGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPriceClass() {
        return software.amazon.jsii.Kernel.get(this, "priceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPriceClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "priceClass", java.util.Objects.requireNonNull(value, "priceClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionRestrictions> getRestrictions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "restrictions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionRestrictions.class))));
    }

    public void setRestrictions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionRestrictions> value) {
        software.amazon.jsii.Kernel.set(this, "restrictions", java.util.Objects.requireNonNull(value, "restrictions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRetainOnDelete() {
        return software.amazon.jsii.Kernel.get(this, "retainOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRetainOnDelete(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "retainOnDelete", java.util.Objects.requireNonNull(value, "retainOnDelete is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionViewerCertificate> getViewerCertificate() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "viewerCertificate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionViewerCertificate.class))));
    }

    public void setViewerCertificate(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionViewerCertificate> value) {
        software.amazon.jsii.Kernel.set(this, "viewerCertificate", java.util.Objects.requireNonNull(value, "viewerCertificate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getWaitForDeployment() {
        return software.amazon.jsii.Kernel.get(this, "waitForDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setWaitForDeployment(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "waitForDeployment", java.util.Objects.requireNonNull(value, "waitForDeployment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWebAclId() {
        return software.amazon.jsii.Kernel.get(this, "webAclId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWebAclId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "webAclId", java.util.Objects.requireNonNull(value, "webAclId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CloudfrontDistribution}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CloudfrontDistribution> {
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
        private final imports.aws.CloudfrontDistributionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CloudfrontDistributionConfig.Builder();
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
         * default_cache_behavior block.
         * <p>
         * @return {@code this}
         * @param defaultCacheBehavior default_cache_behavior block. This parameter is required.
         */
        public Builder defaultCacheBehavior(final java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehavior> defaultCacheBehavior) {
            this.config.defaultCacheBehavior(defaultCacheBehavior);
            return this;
        }

        /**
         * @return {@code this}
         * @param enabled This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * origin block.
         * <p>
         * @return {@code this}
         * @param origin origin block. This parameter is required.
         */
        public Builder origin(final java.util.List<? extends imports.aws.CloudfrontDistributionOrigin> origin) {
            this.config.origin(origin);
            return this;
        }

        /**
         * restrictions block.
         * <p>
         * @return {@code this}
         * @param restrictions restrictions block. This parameter is required.
         */
        public Builder restrictions(final java.util.List<? extends imports.aws.CloudfrontDistributionRestrictions> restrictions) {
            this.config.restrictions(restrictions);
            return this;
        }

        /**
         * viewer_certificate block.
         * <p>
         * @return {@code this}
         * @param viewerCertificate viewer_certificate block. This parameter is required.
         */
        public Builder viewerCertificate(final java.util.List<? extends imports.aws.CloudfrontDistributionViewerCertificate> viewerCertificate) {
            this.config.viewerCertificate(viewerCertificate);
            return this;
        }

        /**
         * @return {@code this}
         * @param aliases This parameter is required.
         */
        public Builder aliases(final java.util.List<java.lang.String> aliases) {
            this.config.aliases(aliases);
            return this;
        }

        /**
         * cache_behavior block.
         * <p>
         * @return {@code this}
         * @param cacheBehavior cache_behavior block. This parameter is required.
         */
        public Builder cacheBehavior(final java.util.List<? extends imports.aws.CloudfrontDistributionCacheBehavior> cacheBehavior) {
            this.config.cacheBehavior(cacheBehavior);
            return this;
        }

        /**
         * @return {@code this}
         * @param comment This parameter is required.
         */
        public Builder comment(final java.lang.String comment) {
            this.config.comment(comment);
            return this;
        }

        /**
         * custom_error_response block.
         * <p>
         * @return {@code this}
         * @param customErrorResponse custom_error_response block. This parameter is required.
         */
        public Builder customErrorResponse(final java.util.List<? extends imports.aws.CloudfrontDistributionCustomErrorResponse> customErrorResponse) {
            this.config.customErrorResponse(customErrorResponse);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultRootObject This parameter is required.
         */
        public Builder defaultRootObject(final java.lang.String defaultRootObject) {
            this.config.defaultRootObject(defaultRootObject);
            return this;
        }

        /**
         * @return {@code this}
         * @param httpVersion This parameter is required.
         */
        public Builder httpVersion(final java.lang.String httpVersion) {
            this.config.httpVersion(httpVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param isIpv6Enabled This parameter is required.
         */
        public Builder isIpv6Enabled(final java.lang.Boolean isIpv6Enabled) {
            this.config.isIpv6Enabled(isIpv6Enabled);
            return this;
        }

        /**
         * logging_config block.
         * <p>
         * @return {@code this}
         * @param loggingConfig logging_config block. This parameter is required.
         */
        public Builder loggingConfig(final java.util.List<? extends imports.aws.CloudfrontDistributionLoggingConfig> loggingConfig) {
            this.config.loggingConfig(loggingConfig);
            return this;
        }

        /**
         * ordered_cache_behavior block.
         * <p>
         * @return {@code this}
         * @param orderedCacheBehavior ordered_cache_behavior block. This parameter is required.
         */
        public Builder orderedCacheBehavior(final java.util.List<? extends imports.aws.CloudfrontDistributionOrderedCacheBehavior> orderedCacheBehavior) {
            this.config.orderedCacheBehavior(orderedCacheBehavior);
            return this;
        }

        /**
         * origin_group block.
         * <p>
         * @return {@code this}
         * @param originGroup origin_group block. This parameter is required.
         */
        public Builder originGroup(final java.util.List<? extends imports.aws.CloudfrontDistributionOriginGroup> originGroup) {
            this.config.originGroup(originGroup);
            return this;
        }

        /**
         * @return {@code this}
         * @param priceClass This parameter is required.
         */
        public Builder priceClass(final java.lang.String priceClass) {
            this.config.priceClass(priceClass);
            return this;
        }

        /**
         * @return {@code this}
         * @param retainOnDelete This parameter is required.
         */
        public Builder retainOnDelete(final java.lang.Boolean retainOnDelete) {
            this.config.retainOnDelete(retainOnDelete);
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
         * @param waitForDeployment This parameter is required.
         */
        public Builder waitForDeployment(final java.lang.Boolean waitForDeployment) {
            this.config.waitForDeployment(waitForDeployment);
            return this;
        }

        /**
         * @return {@code this}
         * @param webAclId This parameter is required.
         */
        public Builder webAclId(final java.lang.String webAclId) {
            this.config.webAclId(webAclId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CloudfrontDistribution}.
         */
        @Override
        public imports.aws.CloudfrontDistribution build() {
            return new imports.aws.CloudfrontDistribution(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
