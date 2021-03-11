package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.553Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomainConfig")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainConfig.Jsii$Proxy.class)
public interface ElasticsearchDomainConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDomainName();

    default @org.jetbrains.annotations.Nullable java.lang.String getAccessPolicies() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAdvancedOptions() {
        return null;
    }

    /**
     * advanced_security_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions> getAdvancedSecurityOptions() {
        return null;
    }

    /**
     * cluster_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainClusterConfig> getClusterConfig() {
        return null;
    }

    /**
     * cognito_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainCognitoOptions> getCognitoOptions() {
        return null;
    }

    /**
     * domain_endpoint_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions> getDomainEndpointOptions() {
        return null;
    }

    /**
     * ebs_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainEbsOptions> getEbsOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getElasticsearchVersion() {
        return null;
    }

    /**
     * encrypt_at_rest block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest> getEncryptAtRest() {
        return null;
    }

    /**
     * log_publishing_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions> getLogPublishingOptions() {
        return null;
    }

    /**
     * node_to_node_encryption block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption> getNodeToNodeEncryption() {
        return null;
    }

    /**
     * snapshot_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions> getSnapshotOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ElasticsearchDomainTimeouts getTimeouts() {
        return null;
    }

    /**
     * vpc_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainVpcOptions> getVpcOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainConfig> {
        private java.lang.String domainName;
        private java.lang.String accessPolicies;
        private java.util.Map<java.lang.String, java.lang.String> advancedOptions;
        private java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions> advancedSecurityOptions;
        private java.util.List<imports.aws.ElasticsearchDomainClusterConfig> clusterConfig;
        private java.util.List<imports.aws.ElasticsearchDomainCognitoOptions> cognitoOptions;
        private java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions> domainEndpointOptions;
        private java.util.List<imports.aws.ElasticsearchDomainEbsOptions> ebsOptions;
        private java.lang.String elasticsearchVersion;
        private java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest> encryptAtRest;
        private java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions> logPublishingOptions;
        private java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption> nodeToNodeEncryption;
        private java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions> snapshotOptions;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.ElasticsearchDomainTimeouts timeouts;
        private java.util.List<imports.aws.ElasticsearchDomainVpcOptions> vpcOptions;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getDomainName}
         * @param domainName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getAccessPolicies}
         * @param accessPolicies the value to be set.
         * @return {@code this}
         */
        public Builder accessPolicies(java.lang.String accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getAdvancedOptions}
         * @param advancedOptions the value to be set.
         * @return {@code this}
         */
        public Builder advancedOptions(java.util.Map<java.lang.String, java.lang.String> advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getAdvancedSecurityOptions}
         * @param advancedSecurityOptions advanced_security_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder advancedSecurityOptions(java.util.List<? extends imports.aws.ElasticsearchDomainAdvancedSecurityOptions> advancedSecurityOptions) {
            this.advancedSecurityOptions = (java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions>)advancedSecurityOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getClusterConfig}
         * @param clusterConfig cluster_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder clusterConfig(java.util.List<? extends imports.aws.ElasticsearchDomainClusterConfig> clusterConfig) {
            this.clusterConfig = (java.util.List<imports.aws.ElasticsearchDomainClusterConfig>)clusterConfig;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getCognitoOptions}
         * @param cognitoOptions cognito_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cognitoOptions(java.util.List<? extends imports.aws.ElasticsearchDomainCognitoOptions> cognitoOptions) {
            this.cognitoOptions = (java.util.List<imports.aws.ElasticsearchDomainCognitoOptions>)cognitoOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getDomainEndpointOptions}
         * @param domainEndpointOptions domain_endpoint_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder domainEndpointOptions(java.util.List<? extends imports.aws.ElasticsearchDomainDomainEndpointOptions> domainEndpointOptions) {
            this.domainEndpointOptions = (java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions>)domainEndpointOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getEbsOptions}
         * @param ebsOptions ebs_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsOptions(java.util.List<? extends imports.aws.ElasticsearchDomainEbsOptions> ebsOptions) {
            this.ebsOptions = (java.util.List<imports.aws.ElasticsearchDomainEbsOptions>)ebsOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getElasticsearchVersion}
         * @param elasticsearchVersion the value to be set.
         * @return {@code this}
         */
        public Builder elasticsearchVersion(java.lang.String elasticsearchVersion) {
            this.elasticsearchVersion = elasticsearchVersion;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getEncryptAtRest}
         * @param encryptAtRest encrypt_at_rest block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryptAtRest(java.util.List<? extends imports.aws.ElasticsearchDomainEncryptAtRest> encryptAtRest) {
            this.encryptAtRest = (java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest>)encryptAtRest;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getLogPublishingOptions}
         * @param logPublishingOptions log_publishing_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder logPublishingOptions(java.util.List<? extends imports.aws.ElasticsearchDomainLogPublishingOptions> logPublishingOptions) {
            this.logPublishingOptions = (java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions>)logPublishingOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getNodeToNodeEncryption}
         * @param nodeToNodeEncryption node_to_node_encryption block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder nodeToNodeEncryption(java.util.List<? extends imports.aws.ElasticsearchDomainNodeToNodeEncryption> nodeToNodeEncryption) {
            this.nodeToNodeEncryption = (java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption>)nodeToNodeEncryption;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getSnapshotOptions}
         * @param snapshotOptions snapshot_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder snapshotOptions(java.util.List<? extends imports.aws.ElasticsearchDomainSnapshotOptions> snapshotOptions) {
            this.snapshotOptions = (java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions>)snapshotOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.ElasticsearchDomainTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getVpcOptions}
         * @param vpcOptions vpc_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder vpcOptions(java.util.List<? extends imports.aws.ElasticsearchDomainVpcOptions> vpcOptions) {
            this.vpcOptions = (java.util.List<imports.aws.ElasticsearchDomainVpcOptions>)vpcOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getDependsOn}
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
         * Sets the value of {@link ElasticsearchDomainConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainConfig#getProvider}
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
         * @return a new instance of {@link ElasticsearchDomainConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainConfig build() {
            return new Jsii$Proxy(domainName, accessPolicies, advancedOptions, advancedSecurityOptions, clusterConfig, cognitoOptions, domainEndpointOptions, ebsOptions, elasticsearchVersion, encryptAtRest, logPublishingOptions, nodeToNodeEncryption, snapshotOptions, tags, timeouts, vpcOptions, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainConfig {
        private final java.lang.String domainName;
        private final java.lang.String accessPolicies;
        private final java.util.Map<java.lang.String, java.lang.String> advancedOptions;
        private final java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions> advancedSecurityOptions;
        private final java.util.List<imports.aws.ElasticsearchDomainClusterConfig> clusterConfig;
        private final java.util.List<imports.aws.ElasticsearchDomainCognitoOptions> cognitoOptions;
        private final java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions> domainEndpointOptions;
        private final java.util.List<imports.aws.ElasticsearchDomainEbsOptions> ebsOptions;
        private final java.lang.String elasticsearchVersion;
        private final java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest> encryptAtRest;
        private final java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions> logPublishingOptions;
        private final java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption> nodeToNodeEncryption;
        private final java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions> snapshotOptions;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.ElasticsearchDomainTimeouts timeouts;
        private final java.util.List<imports.aws.ElasticsearchDomainVpcOptions> vpcOptions;
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
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessPolicies = software.amazon.jsii.Kernel.get(this, "accessPolicies", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.advancedOptions = software.amazon.jsii.Kernel.get(this, "advancedOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.advancedSecurityOptions = software.amazon.jsii.Kernel.get(this, "advancedSecurityOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainAdvancedSecurityOptions.class)));
            this.clusterConfig = software.amazon.jsii.Kernel.get(this, "clusterConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainClusterConfig.class)));
            this.cognitoOptions = software.amazon.jsii.Kernel.get(this, "cognitoOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainCognitoOptions.class)));
            this.domainEndpointOptions = software.amazon.jsii.Kernel.get(this, "domainEndpointOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainDomainEndpointOptions.class)));
            this.ebsOptions = software.amazon.jsii.Kernel.get(this, "ebsOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainEbsOptions.class)));
            this.elasticsearchVersion = software.amazon.jsii.Kernel.get(this, "elasticsearchVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryptAtRest = software.amazon.jsii.Kernel.get(this, "encryptAtRest", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainEncryptAtRest.class)));
            this.logPublishingOptions = software.amazon.jsii.Kernel.get(this, "logPublishingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainLogPublishingOptions.class)));
            this.nodeToNodeEncryption = software.amazon.jsii.Kernel.get(this, "nodeToNodeEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainNodeToNodeEncryption.class)));
            this.snapshotOptions = software.amazon.jsii.Kernel.get(this, "snapshotOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainSnapshotOptions.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainTimeouts.class));
            this.vpcOptions = software.amazon.jsii.Kernel.get(this, "vpcOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainVpcOptions.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String domainName, final java.lang.String accessPolicies, final java.util.Map<java.lang.String, java.lang.String> advancedOptions, final java.util.List<? extends imports.aws.ElasticsearchDomainAdvancedSecurityOptions> advancedSecurityOptions, final java.util.List<? extends imports.aws.ElasticsearchDomainClusterConfig> clusterConfig, final java.util.List<? extends imports.aws.ElasticsearchDomainCognitoOptions> cognitoOptions, final java.util.List<? extends imports.aws.ElasticsearchDomainDomainEndpointOptions> domainEndpointOptions, final java.util.List<? extends imports.aws.ElasticsearchDomainEbsOptions> ebsOptions, final java.lang.String elasticsearchVersion, final java.util.List<? extends imports.aws.ElasticsearchDomainEncryptAtRest> encryptAtRest, final java.util.List<? extends imports.aws.ElasticsearchDomainLogPublishingOptions> logPublishingOptions, final java.util.List<? extends imports.aws.ElasticsearchDomainNodeToNodeEncryption> nodeToNodeEncryption, final java.util.List<? extends imports.aws.ElasticsearchDomainSnapshotOptions> snapshotOptions, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.ElasticsearchDomainTimeouts timeouts, final java.util.List<? extends imports.aws.ElasticsearchDomainVpcOptions> vpcOptions, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.domainName = java.util.Objects.requireNonNull(domainName, "domainName is required");
            this.accessPolicies = accessPolicies;
            this.advancedOptions = advancedOptions;
            this.advancedSecurityOptions = (java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions>)advancedSecurityOptions;
            this.clusterConfig = (java.util.List<imports.aws.ElasticsearchDomainClusterConfig>)clusterConfig;
            this.cognitoOptions = (java.util.List<imports.aws.ElasticsearchDomainCognitoOptions>)cognitoOptions;
            this.domainEndpointOptions = (java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions>)domainEndpointOptions;
            this.ebsOptions = (java.util.List<imports.aws.ElasticsearchDomainEbsOptions>)ebsOptions;
            this.elasticsearchVersion = elasticsearchVersion;
            this.encryptAtRest = (java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest>)encryptAtRest;
            this.logPublishingOptions = (java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions>)logPublishingOptions;
            this.nodeToNodeEncryption = (java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption>)nodeToNodeEncryption;
            this.snapshotOptions = (java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions>)snapshotOptions;
            this.tags = tags;
            this.timeouts = timeouts;
            this.vpcOptions = (java.util.List<imports.aws.ElasticsearchDomainVpcOptions>)vpcOptions;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDomainName() {
            return this.domainName;
        }

        @Override
        public final java.lang.String getAccessPolicies() {
            return this.accessPolicies;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getAdvancedOptions() {
            return this.advancedOptions;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptions> getAdvancedSecurityOptions() {
            return this.advancedSecurityOptions;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainClusterConfig> getClusterConfig() {
            return this.clusterConfig;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainCognitoOptions> getCognitoOptions() {
            return this.cognitoOptions;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainDomainEndpointOptions> getDomainEndpointOptions() {
            return this.domainEndpointOptions;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainEbsOptions> getEbsOptions() {
            return this.ebsOptions;
        }

        @Override
        public final java.lang.String getElasticsearchVersion() {
            return this.elasticsearchVersion;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainEncryptAtRest> getEncryptAtRest() {
            return this.encryptAtRest;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainLogPublishingOptions> getLogPublishingOptions() {
            return this.logPublishingOptions;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainNodeToNodeEncryption> getNodeToNodeEncryption() {
            return this.nodeToNodeEncryption;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainSnapshotOptions> getSnapshotOptions() {
            return this.snapshotOptions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.ElasticsearchDomainTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainVpcOptions> getVpcOptions() {
            return this.vpcOptions;
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

            data.set("domainName", om.valueToTree(this.getDomainName()));
            if (this.getAccessPolicies() != null) {
                data.set("accessPolicies", om.valueToTree(this.getAccessPolicies()));
            }
            if (this.getAdvancedOptions() != null) {
                data.set("advancedOptions", om.valueToTree(this.getAdvancedOptions()));
            }
            if (this.getAdvancedSecurityOptions() != null) {
                data.set("advancedSecurityOptions", om.valueToTree(this.getAdvancedSecurityOptions()));
            }
            if (this.getClusterConfig() != null) {
                data.set("clusterConfig", om.valueToTree(this.getClusterConfig()));
            }
            if (this.getCognitoOptions() != null) {
                data.set("cognitoOptions", om.valueToTree(this.getCognitoOptions()));
            }
            if (this.getDomainEndpointOptions() != null) {
                data.set("domainEndpointOptions", om.valueToTree(this.getDomainEndpointOptions()));
            }
            if (this.getEbsOptions() != null) {
                data.set("ebsOptions", om.valueToTree(this.getEbsOptions()));
            }
            if (this.getElasticsearchVersion() != null) {
                data.set("elasticsearchVersion", om.valueToTree(this.getElasticsearchVersion()));
            }
            if (this.getEncryptAtRest() != null) {
                data.set("encryptAtRest", om.valueToTree(this.getEncryptAtRest()));
            }
            if (this.getLogPublishingOptions() != null) {
                data.set("logPublishingOptions", om.valueToTree(this.getLogPublishingOptions()));
            }
            if (this.getNodeToNodeEncryption() != null) {
                data.set("nodeToNodeEncryption", om.valueToTree(this.getNodeToNodeEncryption()));
            }
            if (this.getSnapshotOptions() != null) {
                data.set("snapshotOptions", om.valueToTree(this.getSnapshotOptions()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVpcOptions() != null) {
                data.set("vpcOptions", om.valueToTree(this.getVpcOptions()));
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
            struct.set("fqn", om.valueToTree("aws.ElasticsearchDomainConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainConfig.Jsii$Proxy that = (ElasticsearchDomainConfig.Jsii$Proxy) o;

            if (!domainName.equals(that.domainName)) return false;
            if (this.accessPolicies != null ? !this.accessPolicies.equals(that.accessPolicies) : that.accessPolicies != null) return false;
            if (this.advancedOptions != null ? !this.advancedOptions.equals(that.advancedOptions) : that.advancedOptions != null) return false;
            if (this.advancedSecurityOptions != null ? !this.advancedSecurityOptions.equals(that.advancedSecurityOptions) : that.advancedSecurityOptions != null) return false;
            if (this.clusterConfig != null ? !this.clusterConfig.equals(that.clusterConfig) : that.clusterConfig != null) return false;
            if (this.cognitoOptions != null ? !this.cognitoOptions.equals(that.cognitoOptions) : that.cognitoOptions != null) return false;
            if (this.domainEndpointOptions != null ? !this.domainEndpointOptions.equals(that.domainEndpointOptions) : that.domainEndpointOptions != null) return false;
            if (this.ebsOptions != null ? !this.ebsOptions.equals(that.ebsOptions) : that.ebsOptions != null) return false;
            if (this.elasticsearchVersion != null ? !this.elasticsearchVersion.equals(that.elasticsearchVersion) : that.elasticsearchVersion != null) return false;
            if (this.encryptAtRest != null ? !this.encryptAtRest.equals(that.encryptAtRest) : that.encryptAtRest != null) return false;
            if (this.logPublishingOptions != null ? !this.logPublishingOptions.equals(that.logPublishingOptions) : that.logPublishingOptions != null) return false;
            if (this.nodeToNodeEncryption != null ? !this.nodeToNodeEncryption.equals(that.nodeToNodeEncryption) : that.nodeToNodeEncryption != null) return false;
            if (this.snapshotOptions != null ? !this.snapshotOptions.equals(that.snapshotOptions) : that.snapshotOptions != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.vpcOptions != null ? !this.vpcOptions.equals(that.vpcOptions) : that.vpcOptions != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.domainName.hashCode();
            result = 31 * result + (this.accessPolicies != null ? this.accessPolicies.hashCode() : 0);
            result = 31 * result + (this.advancedOptions != null ? this.advancedOptions.hashCode() : 0);
            result = 31 * result + (this.advancedSecurityOptions != null ? this.advancedSecurityOptions.hashCode() : 0);
            result = 31 * result + (this.clusterConfig != null ? this.clusterConfig.hashCode() : 0);
            result = 31 * result + (this.cognitoOptions != null ? this.cognitoOptions.hashCode() : 0);
            result = 31 * result + (this.domainEndpointOptions != null ? this.domainEndpointOptions.hashCode() : 0);
            result = 31 * result + (this.ebsOptions != null ? this.ebsOptions.hashCode() : 0);
            result = 31 * result + (this.elasticsearchVersion != null ? this.elasticsearchVersion.hashCode() : 0);
            result = 31 * result + (this.encryptAtRest != null ? this.encryptAtRest.hashCode() : 0);
            result = 31 * result + (this.logPublishingOptions != null ? this.logPublishingOptions.hashCode() : 0);
            result = 31 * result + (this.nodeToNodeEncryption != null ? this.nodeToNodeEncryption.hashCode() : 0);
            result = 31 * result + (this.snapshotOptions != null ? this.snapshotOptions.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.vpcOptions != null ? this.vpcOptions.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
