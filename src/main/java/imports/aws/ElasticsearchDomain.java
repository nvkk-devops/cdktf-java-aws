package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.551Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomain")
public class ElasticsearchDomain extends com.hashicorp.cdktf.TerraformResource {

    protected ElasticsearchDomain(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElasticsearchDomain(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ElasticsearchDomain(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ElasticsearchDomainConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccessPolicies() {
        software.amazon.jsii.Kernel.call(this, "resetAccessPolicies", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAdvancedOptions() {
        software.amazon.jsii.Kernel.call(this, "resetAdvancedOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAdvancedSecurityOptions() {
        software.amazon.jsii.Kernel.call(this, "resetAdvancedSecurityOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterConfig() {
        software.amazon.jsii.Kernel.call(this, "resetClusterConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCognitoOptions() {
        software.amazon.jsii.Kernel.call(this, "resetCognitoOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDomainEndpointOptions() {
        software.amazon.jsii.Kernel.call(this, "resetDomainEndpointOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsOptions() {
        software.amazon.jsii.Kernel.call(this, "resetEbsOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearchVersion() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearchVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptAtRest() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptAtRest", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogPublishingOptions() {
        software.amazon.jsii.Kernel.call(this, "resetLogPublishingOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeToNodeEncryption() {
        software.amazon.jsii.Kernel.call(this, "resetNodeToNodeEncryption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotOptions() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcOptions() {
        software.amazon.jsii.Kernel.call(this, "resetVpcOptions", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainId() {
        return software.amazon.jsii.Kernel.get(this, "domainId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainNameInput() {
        return software.amazon.jsii.Kernel.get(this, "domainNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKibanaEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "kibanaEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessPoliciesInput() {
        return software.amazon.jsii.Kernel.get(this, "accessPoliciesInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAdvancedOptionsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "advancedOptionsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions> getAdvancedSecurityOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions>)(software.amazon.jsii.Kernel.get(this, "advancedSecurityOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainAdvancedSecurityOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainClusterConfig> getClusterConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainClusterConfig>)(software.amazon.jsii.Kernel.get(this, "clusterConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainClusterConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainCognitoOptions> getCognitoOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainCognitoOptions>)(software.amazon.jsii.Kernel.get(this, "cognitoOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainCognitoOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions> getDomainEndpointOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions>)(software.amazon.jsii.Kernel.get(this, "domainEndpointOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainDomainEndpointOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainEbsOptions> getEbsOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainEbsOptions>)(software.amazon.jsii.Kernel.get(this, "ebsOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainEbsOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getElasticsearchVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearchVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest> getEncryptAtRestInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest>)(software.amazon.jsii.Kernel.get(this, "encryptAtRestInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainEncryptAtRest.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions> getLogPublishingOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions>)(software.amazon.jsii.Kernel.get(this, "logPublishingOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainLogPublishingOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption> getNodeToNodeEncryptionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption>)(software.amazon.jsii.Kernel.get(this, "nodeToNodeEncryptionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainNodeToNodeEncryption.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions> getSnapshotOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions>)(software.amazon.jsii.Kernel.get(this, "snapshotOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainSnapshotOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ElasticsearchDomainTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainVpcOptions> getVpcOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElasticsearchDomainVpcOptions>)(software.amazon.jsii.Kernel.get(this, "vpcOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainVpcOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessPolicies() {
        return software.amazon.jsii.Kernel.get(this, "accessPolicies", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessPolicies(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessPolicies", java.util.Objects.requireNonNull(value, "accessPolicies is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getAdvancedOptions() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "advancedOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAdvancedOptions(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "advancedOptions", java.util.Objects.requireNonNull(value, "advancedOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions> getAdvancedSecurityOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "advancedSecurityOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainAdvancedSecurityOptions.class))));
    }

    public void setAdvancedSecurityOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions> value) {
        software.amazon.jsii.Kernel.set(this, "advancedSecurityOptions", java.util.Objects.requireNonNull(value, "advancedSecurityOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainClusterConfig> getClusterConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "clusterConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainClusterConfig.class))));
    }

    public void setClusterConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainClusterConfig> value) {
        software.amazon.jsii.Kernel.set(this, "clusterConfig", java.util.Objects.requireNonNull(value, "clusterConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainCognitoOptions> getCognitoOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cognitoOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainCognitoOptions.class))));
    }

    public void setCognitoOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainCognitoOptions> value) {
        software.amazon.jsii.Kernel.set(this, "cognitoOptions", java.util.Objects.requireNonNull(value, "cognitoOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions> getDomainEndpointOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "domainEndpointOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainDomainEndpointOptions.class))));
    }

    public void setDomainEndpointOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions> value) {
        software.amazon.jsii.Kernel.set(this, "domainEndpointOptions", java.util.Objects.requireNonNull(value, "domainEndpointOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainName", java.util.Objects.requireNonNull(value, "domainName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainEbsOptions> getEbsOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ebsOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainEbsOptions.class))));
    }

    public void setEbsOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainEbsOptions> value) {
        software.amazon.jsii.Kernel.set(this, "ebsOptions", java.util.Objects.requireNonNull(value, "ebsOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getElasticsearchVersion() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearchVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setElasticsearchVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "elasticsearchVersion", java.util.Objects.requireNonNull(value, "elasticsearchVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest> getEncryptAtRest() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "encryptAtRest", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainEncryptAtRest.class))));
    }

    public void setEncryptAtRest(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest> value) {
        software.amazon.jsii.Kernel.set(this, "encryptAtRest", java.util.Objects.requireNonNull(value, "encryptAtRest is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions> getLogPublishingOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logPublishingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainLogPublishingOptions.class))));
    }

    public void setLogPublishingOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions> value) {
        software.amazon.jsii.Kernel.set(this, "logPublishingOptions", java.util.Objects.requireNonNull(value, "logPublishingOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption> getNodeToNodeEncryption() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "nodeToNodeEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainNodeToNodeEncryption.class))));
    }

    public void setNodeToNodeEncryption(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption> value) {
        software.amazon.jsii.Kernel.set(this, "nodeToNodeEncryption", java.util.Objects.requireNonNull(value, "nodeToNodeEncryption is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions> getSnapshotOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "snapshotOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainSnapshotOptions.class))));
    }

    public void setSnapshotOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions> value) {
        software.amazon.jsii.Kernel.set(this, "snapshotOptions", java.util.Objects.requireNonNull(value, "snapshotOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ElasticsearchDomainTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.ElasticsearchDomainTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainVpcOptions> getVpcOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainVpcOptions.class))));
    }

    public void setVpcOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElasticsearchDomainVpcOptions> value) {
        software.amazon.jsii.Kernel.set(this, "vpcOptions", java.util.Objects.requireNonNull(value, "vpcOptions is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ElasticsearchDomain}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ElasticsearchDomain> {
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
        private final imports.aws.ElasticsearchDomainConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ElasticsearchDomainConfig.Builder();
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
         * @param domainName This parameter is required.
         */
        public Builder domainName(final java.lang.String domainName) {
            this.config.domainName(domainName);
            return this;
        }

        /**
         * @return {@code this}
         * @param accessPolicies This parameter is required.
         */
        public Builder accessPolicies(final java.lang.String accessPolicies) {
            this.config.accessPolicies(accessPolicies);
            return this;
        }

        /**
         * @return {@code this}
         * @param advancedOptions This parameter is required.
         */
        public Builder advancedOptions(final java.util.Map<java.lang.String, java.lang.String> advancedOptions) {
            this.config.advancedOptions(advancedOptions);
            return this;
        }

        /**
         * advanced_security_options block.
         * <p>
         * @return {@code this}
         * @param advancedSecurityOptions advanced_security_options block. This parameter is required.
         */
        public Builder advancedSecurityOptions(final java.util.List<? extends imports.aws.ElasticsearchDomainAdvancedSecurityOptions> advancedSecurityOptions) {
            this.config.advancedSecurityOptions(advancedSecurityOptions);
            return this;
        }

        /**
         * cluster_config block.
         * <p>
         * @return {@code this}
         * @param clusterConfig cluster_config block. This parameter is required.
         */
        public Builder clusterConfig(final java.util.List<? extends imports.aws.ElasticsearchDomainClusterConfig> clusterConfig) {
            this.config.clusterConfig(clusterConfig);
            return this;
        }

        /**
         * cognito_options block.
         * <p>
         * @return {@code this}
         * @param cognitoOptions cognito_options block. This parameter is required.
         */
        public Builder cognitoOptions(final java.util.List<? extends imports.aws.ElasticsearchDomainCognitoOptions> cognitoOptions) {
            this.config.cognitoOptions(cognitoOptions);
            return this;
        }

        /**
         * domain_endpoint_options block.
         * <p>
         * @return {@code this}
         * @param domainEndpointOptions domain_endpoint_options block. This parameter is required.
         */
        public Builder domainEndpointOptions(final java.util.List<? extends imports.aws.ElasticsearchDomainDomainEndpointOptions> domainEndpointOptions) {
            this.config.domainEndpointOptions(domainEndpointOptions);
            return this;
        }

        /**
         * ebs_options block.
         * <p>
         * @return {@code this}
         * @param ebsOptions ebs_options block. This parameter is required.
         */
        public Builder ebsOptions(final java.util.List<? extends imports.aws.ElasticsearchDomainEbsOptions> ebsOptions) {
            this.config.ebsOptions(ebsOptions);
            return this;
        }

        /**
         * @return {@code this}
         * @param elasticsearchVersion This parameter is required.
         */
        public Builder elasticsearchVersion(final java.lang.String elasticsearchVersion) {
            this.config.elasticsearchVersion(elasticsearchVersion);
            return this;
        }

        /**
         * encrypt_at_rest block.
         * <p>
         * @return {@code this}
         * @param encryptAtRest encrypt_at_rest block. This parameter is required.
         */
        public Builder encryptAtRest(final java.util.List<? extends imports.aws.ElasticsearchDomainEncryptAtRest> encryptAtRest) {
            this.config.encryptAtRest(encryptAtRest);
            return this;
        }

        /**
         * log_publishing_options block.
         * <p>
         * @return {@code this}
         * @param logPublishingOptions log_publishing_options block. This parameter is required.
         */
        public Builder logPublishingOptions(final java.util.List<? extends imports.aws.ElasticsearchDomainLogPublishingOptions> logPublishingOptions) {
            this.config.logPublishingOptions(logPublishingOptions);
            return this;
        }

        /**
         * node_to_node_encryption block.
         * <p>
         * @return {@code this}
         * @param nodeToNodeEncryption node_to_node_encryption block. This parameter is required.
         */
        public Builder nodeToNodeEncryption(final java.util.List<? extends imports.aws.ElasticsearchDomainNodeToNodeEncryption> nodeToNodeEncryption) {
            this.config.nodeToNodeEncryption(nodeToNodeEncryption);
            return this;
        }

        /**
         * snapshot_options block.
         * <p>
         * @return {@code this}
         * @param snapshotOptions snapshot_options block. This parameter is required.
         */
        public Builder snapshotOptions(final java.util.List<? extends imports.aws.ElasticsearchDomainSnapshotOptions> snapshotOptions) {
            this.config.snapshotOptions(snapshotOptions);
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
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.ElasticsearchDomainTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * vpc_options block.
         * <p>
         * @return {@code this}
         * @param vpcOptions vpc_options block. This parameter is required.
         */
        public Builder vpcOptions(final java.util.List<? extends imports.aws.ElasticsearchDomainVpcOptions> vpcOptions) {
            this.config.vpcOptions(vpcOptions);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ElasticsearchDomain}.
         */
        @Override
        public imports.aws.ElasticsearchDomain build() {
            return new imports.aws.ElasticsearchDomain(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
