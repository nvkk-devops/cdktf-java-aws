package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.806Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RedshiftClusterConfig")
@software.amazon.jsii.Jsii.Proxy(RedshiftClusterConfig.Jsii$Proxy.class)
public interface RedshiftClusterConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier();

    @org.jetbrains.annotations.NotNull java.lang.String getNodeType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowVersionUpgrade() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getAutomatedSnapshotRetentionPeriod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBucketName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterParameterGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterPublicKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterRevisionNumber() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClusterSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterSubnetGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDatabaseName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getElasticIp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableLogging() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEndpoint() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnhancedVpcRouting() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFinalSnapshotIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIamRoles() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    /**
     * logging block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.RedshiftClusterLogging> getLogging() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMasterPassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMasterUsername() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfNodes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOwnerAccount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreferredMaintenanceWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPubliclyAccessible() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3KeyPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipFinalSnapshot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotClusterIdentifier() {
        return null;
    }

    /**
     * snapshot_copy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.RedshiftClusterSnapshotCopy> getSnapshotCopy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.RedshiftClusterTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RedshiftClusterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RedshiftClusterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RedshiftClusterConfig> {
        private java.lang.String clusterIdentifier;
        private java.lang.String nodeType;
        private java.lang.Boolean allowVersionUpgrade;
        private java.lang.Number automatedSnapshotRetentionPeriod;
        private java.lang.String availabilityZone;
        private java.lang.String bucketName;
        private java.lang.String clusterParameterGroupName;
        private java.lang.String clusterPublicKey;
        private java.lang.String clusterRevisionNumber;
        private java.util.List<java.lang.String> clusterSecurityGroups;
        private java.lang.String clusterSubnetGroupName;
        private java.lang.String clusterType;
        private java.lang.String clusterVersion;
        private java.lang.String databaseName;
        private java.lang.String elasticIp;
        private java.lang.Boolean enableLogging;
        private java.lang.Boolean encrypted;
        private java.lang.String endpoint;
        private java.lang.Boolean enhancedVpcRouting;
        private java.lang.String finalSnapshotIdentifier;
        private java.util.List<java.lang.String> iamRoles;
        private java.lang.String kmsKeyId;
        private java.util.List<imports.aws.RedshiftClusterLogging> logging;
        private java.lang.String masterPassword;
        private java.lang.String masterUsername;
        private java.lang.Number numberOfNodes;
        private java.lang.String ownerAccount;
        private java.lang.Number port;
        private java.lang.String preferredMaintenanceWindow;
        private java.lang.Boolean publiclyAccessible;
        private java.lang.String s3KeyPrefix;
        private java.lang.Boolean skipFinalSnapshot;
        private java.lang.String snapshotClusterIdentifier;
        private java.util.List<imports.aws.RedshiftClusterSnapshotCopy> snapshotCopy;
        private java.lang.String snapshotIdentifier;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.RedshiftClusterTimeouts timeouts;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterIdentifier}
         * @param clusterIdentifier the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterIdentifier(java.lang.String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getNodeType}
         * @param nodeType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder nodeType(java.lang.String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getAllowVersionUpgrade}
         * @param allowVersionUpgrade the value to be set.
         * @return {@code this}
         */
        public Builder allowVersionUpgrade(java.lang.Boolean allowVersionUpgrade) {
            this.allowVersionUpgrade = allowVersionUpgrade;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getAutomatedSnapshotRetentionPeriod}
         * @param automatedSnapshotRetentionPeriod the value to be set.
         * @return {@code this}
         */
        public Builder automatedSnapshotRetentionPeriod(java.lang.Number automatedSnapshotRetentionPeriod) {
            this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getBucketName}
         * @param bucketName the value to be set.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterParameterGroupName}
         * @param clusterParameterGroupName the value to be set.
         * @return {@code this}
         */
        public Builder clusterParameterGroupName(java.lang.String clusterParameterGroupName) {
            this.clusterParameterGroupName = clusterParameterGroupName;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterPublicKey}
         * @param clusterPublicKey the value to be set.
         * @return {@code this}
         */
        public Builder clusterPublicKey(java.lang.String clusterPublicKey) {
            this.clusterPublicKey = clusterPublicKey;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterRevisionNumber}
         * @param clusterRevisionNumber the value to be set.
         * @return {@code this}
         */
        public Builder clusterRevisionNumber(java.lang.String clusterRevisionNumber) {
            this.clusterRevisionNumber = clusterRevisionNumber;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterSecurityGroups}
         * @param clusterSecurityGroups the value to be set.
         * @return {@code this}
         */
        public Builder clusterSecurityGroups(java.util.List<java.lang.String> clusterSecurityGroups) {
            this.clusterSecurityGroups = clusterSecurityGroups;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterSubnetGroupName}
         * @param clusterSubnetGroupName the value to be set.
         * @return {@code this}
         */
        public Builder clusterSubnetGroupName(java.lang.String clusterSubnetGroupName) {
            this.clusterSubnetGroupName = clusterSubnetGroupName;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterType}
         * @param clusterType the value to be set.
         * @return {@code this}
         */
        public Builder clusterType(java.lang.String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getClusterVersion}
         * @param clusterVersion the value to be set.
         * @return {@code this}
         */
        public Builder clusterVersion(java.lang.String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getDatabaseName}
         * @param databaseName the value to be set.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getElasticIp}
         * @param elasticIp the value to be set.
         * @return {@code this}
         */
        public Builder elasticIp(java.lang.String elasticIp) {
            this.elasticIp = elasticIp;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getEnableLogging}
         * @param enableLogging the value to be set.
         * @return {@code this}
         */
        public Builder enableLogging(java.lang.Boolean enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getEncrypted}
         * @param encrypted the value to be set.
         * @return {@code this}
         */
        public Builder encrypted(java.lang.Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getEndpoint}
         * @param endpoint the value to be set.
         * @return {@code this}
         */
        public Builder endpoint(java.lang.String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getEnhancedVpcRouting}
         * @param enhancedVpcRouting the value to be set.
         * @return {@code this}
         */
        public Builder enhancedVpcRouting(java.lang.Boolean enhancedVpcRouting) {
            this.enhancedVpcRouting = enhancedVpcRouting;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getFinalSnapshotIdentifier}
         * @param finalSnapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder finalSnapshotIdentifier(java.lang.String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getIamRoles}
         * @param iamRoles the value to be set.
         * @return {@code this}
         */
        public Builder iamRoles(java.util.List<java.lang.String> iamRoles) {
            this.iamRoles = iamRoles;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getLogging}
         * @param logging logging block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder logging(java.util.List<? extends imports.aws.RedshiftClusterLogging> logging) {
            this.logging = (java.util.List<imports.aws.RedshiftClusterLogging>)logging;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getMasterPassword}
         * @param masterPassword the value to be set.
         * @return {@code this}
         */
        public Builder masterPassword(java.lang.String masterPassword) {
            this.masterPassword = masterPassword;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getMasterUsername}
         * @param masterUsername the value to be set.
         * @return {@code this}
         */
        public Builder masterUsername(java.lang.String masterUsername) {
            this.masterUsername = masterUsername;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getNumberOfNodes}
         * @param numberOfNodes the value to be set.
         * @return {@code this}
         */
        public Builder numberOfNodes(java.lang.Number numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getOwnerAccount}
         * @param ownerAccount the value to be set.
         * @return {@code this}
         */
        public Builder ownerAccount(java.lang.String ownerAccount) {
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getPreferredMaintenanceWindow}
         * @param preferredMaintenanceWindow the value to be set.
         * @return {@code this}
         */
        public Builder preferredMaintenanceWindow(java.lang.String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getPubliclyAccessible}
         * @param publiclyAccessible the value to be set.
         * @return {@code this}
         */
        public Builder publiclyAccessible(java.lang.Boolean publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getS3KeyPrefix}
         * @param s3KeyPrefix the value to be set.
         * @return {@code this}
         */
        public Builder s3KeyPrefix(java.lang.String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getSkipFinalSnapshot}
         * @param skipFinalSnapshot the value to be set.
         * @return {@code this}
         */
        public Builder skipFinalSnapshot(java.lang.Boolean skipFinalSnapshot) {
            this.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getSnapshotClusterIdentifier}
         * @param snapshotClusterIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder snapshotClusterIdentifier(java.lang.String snapshotClusterIdentifier) {
            this.snapshotClusterIdentifier = snapshotClusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getSnapshotCopy}
         * @param snapshotCopy snapshot_copy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder snapshotCopy(java.util.List<? extends imports.aws.RedshiftClusterSnapshotCopy> snapshotCopy) {
            this.snapshotCopy = (java.util.List<imports.aws.RedshiftClusterSnapshotCopy>)snapshotCopy;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getSnapshotIdentifier}
         * @param snapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder snapshotIdentifier(java.lang.String snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.RedshiftClusterTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getDependsOn}
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
         * Sets the value of {@link RedshiftClusterConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterConfig#getProvider}
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
         * @return a new instance of {@link RedshiftClusterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RedshiftClusterConfig build() {
            return new Jsii$Proxy(clusterIdentifier, nodeType, allowVersionUpgrade, automatedSnapshotRetentionPeriod, availabilityZone, bucketName, clusterParameterGroupName, clusterPublicKey, clusterRevisionNumber, clusterSecurityGroups, clusterSubnetGroupName, clusterType, clusterVersion, databaseName, elasticIp, enableLogging, encrypted, endpoint, enhancedVpcRouting, finalSnapshotIdentifier, iamRoles, kmsKeyId, logging, masterPassword, masterUsername, numberOfNodes, ownerAccount, port, preferredMaintenanceWindow, publiclyAccessible, s3KeyPrefix, skipFinalSnapshot, snapshotClusterIdentifier, snapshotCopy, snapshotIdentifier, tags, timeouts, vpcSecurityGroupIds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link RedshiftClusterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RedshiftClusterConfig {
        private final java.lang.String clusterIdentifier;
        private final java.lang.String nodeType;
        private final java.lang.Boolean allowVersionUpgrade;
        private final java.lang.Number automatedSnapshotRetentionPeriod;
        private final java.lang.String availabilityZone;
        private final java.lang.String bucketName;
        private final java.lang.String clusterParameterGroupName;
        private final java.lang.String clusterPublicKey;
        private final java.lang.String clusterRevisionNumber;
        private final java.util.List<java.lang.String> clusterSecurityGroups;
        private final java.lang.String clusterSubnetGroupName;
        private final java.lang.String clusterType;
        private final java.lang.String clusterVersion;
        private final java.lang.String databaseName;
        private final java.lang.String elasticIp;
        private final java.lang.Boolean enableLogging;
        private final java.lang.Boolean encrypted;
        private final java.lang.String endpoint;
        private final java.lang.Boolean enhancedVpcRouting;
        private final java.lang.String finalSnapshotIdentifier;
        private final java.util.List<java.lang.String> iamRoles;
        private final java.lang.String kmsKeyId;
        private final java.util.List<imports.aws.RedshiftClusterLogging> logging;
        private final java.lang.String masterPassword;
        private final java.lang.String masterUsername;
        private final java.lang.Number numberOfNodes;
        private final java.lang.String ownerAccount;
        private final java.lang.Number port;
        private final java.lang.String preferredMaintenanceWindow;
        private final java.lang.Boolean publiclyAccessible;
        private final java.lang.String s3KeyPrefix;
        private final java.lang.Boolean skipFinalSnapshot;
        private final java.lang.String snapshotClusterIdentifier;
        private final java.util.List<imports.aws.RedshiftClusterSnapshotCopy> snapshotCopy;
        private final java.lang.String snapshotIdentifier;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.RedshiftClusterTimeouts timeouts;
        private final java.util.List<java.lang.String> vpcSecurityGroupIds;
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
            this.clusterIdentifier = software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeType = software.amazon.jsii.Kernel.get(this, "nodeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowVersionUpgrade = software.amazon.jsii.Kernel.get(this, "allowVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.automatedSnapshotRetentionPeriod = software.amazon.jsii.Kernel.get(this, "automatedSnapshotRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterParameterGroupName = software.amazon.jsii.Kernel.get(this, "clusterParameterGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterPublicKey = software.amazon.jsii.Kernel.get(this, "clusterPublicKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterRevisionNumber = software.amazon.jsii.Kernel.get(this, "clusterRevisionNumber", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterSecurityGroups = software.amazon.jsii.Kernel.get(this, "clusterSecurityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.clusterSubnetGroupName = software.amazon.jsii.Kernel.get(this, "clusterSubnetGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterType = software.amazon.jsii.Kernel.get(this, "clusterType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterVersion = software.amazon.jsii.Kernel.get(this, "clusterVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.elasticIp = software.amazon.jsii.Kernel.get(this, "elasticIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableLogging = software.amazon.jsii.Kernel.get(this, "enableLogging", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.encrypted = software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.endpoint = software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enhancedVpcRouting = software.amazon.jsii.Kernel.get(this, "enhancedVpcRouting", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.finalSnapshotIdentifier = software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamRoles = software.amazon.jsii.Kernel.get(this, "iamRoles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logging = software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterLogging.class)));
            this.masterPassword = software.amazon.jsii.Kernel.get(this, "masterPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.masterUsername = software.amazon.jsii.Kernel.get(this, "masterUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.numberOfNodes = software.amazon.jsii.Kernel.get(this, "numberOfNodes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ownerAccount = software.amazon.jsii.Kernel.get(this, "ownerAccount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.preferredMaintenanceWindow = software.amazon.jsii.Kernel.get(this, "preferredMaintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publiclyAccessible = software.amazon.jsii.Kernel.get(this, "publiclyAccessible", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.s3KeyPrefix = software.amazon.jsii.Kernel.get(this, "s3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.skipFinalSnapshot = software.amazon.jsii.Kernel.get(this, "skipFinalSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.snapshotClusterIdentifier = software.amazon.jsii.Kernel.get(this, "snapshotClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.snapshotCopy = software.amazon.jsii.Kernel.get(this, "snapshotCopy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterSnapshotCopy.class)));
            this.snapshotIdentifier = software.amazon.jsii.Kernel.get(this, "snapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterTimeouts.class));
            this.vpcSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String clusterIdentifier, final java.lang.String nodeType, final java.lang.Boolean allowVersionUpgrade, final java.lang.Number automatedSnapshotRetentionPeriod, final java.lang.String availabilityZone, final java.lang.String bucketName, final java.lang.String clusterParameterGroupName, final java.lang.String clusterPublicKey, final java.lang.String clusterRevisionNumber, final java.util.List<java.lang.String> clusterSecurityGroups, final java.lang.String clusterSubnetGroupName, final java.lang.String clusterType, final java.lang.String clusterVersion, final java.lang.String databaseName, final java.lang.String elasticIp, final java.lang.Boolean enableLogging, final java.lang.Boolean encrypted, final java.lang.String endpoint, final java.lang.Boolean enhancedVpcRouting, final java.lang.String finalSnapshotIdentifier, final java.util.List<java.lang.String> iamRoles, final java.lang.String kmsKeyId, final java.util.List<? extends imports.aws.RedshiftClusterLogging> logging, final java.lang.String masterPassword, final java.lang.String masterUsername, final java.lang.Number numberOfNodes, final java.lang.String ownerAccount, final java.lang.Number port, final java.lang.String preferredMaintenanceWindow, final java.lang.Boolean publiclyAccessible, final java.lang.String s3KeyPrefix, final java.lang.Boolean skipFinalSnapshot, final java.lang.String snapshotClusterIdentifier, final java.util.List<? extends imports.aws.RedshiftClusterSnapshotCopy> snapshotCopy, final java.lang.String snapshotIdentifier, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.RedshiftClusterTimeouts timeouts, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterIdentifier = java.util.Objects.requireNonNull(clusterIdentifier, "clusterIdentifier is required");
            this.nodeType = java.util.Objects.requireNonNull(nodeType, "nodeType is required");
            this.allowVersionUpgrade = allowVersionUpgrade;
            this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
            this.availabilityZone = availabilityZone;
            this.bucketName = bucketName;
            this.clusterParameterGroupName = clusterParameterGroupName;
            this.clusterPublicKey = clusterPublicKey;
            this.clusterRevisionNumber = clusterRevisionNumber;
            this.clusterSecurityGroups = clusterSecurityGroups;
            this.clusterSubnetGroupName = clusterSubnetGroupName;
            this.clusterType = clusterType;
            this.clusterVersion = clusterVersion;
            this.databaseName = databaseName;
            this.elasticIp = elasticIp;
            this.enableLogging = enableLogging;
            this.encrypted = encrypted;
            this.endpoint = endpoint;
            this.enhancedVpcRouting = enhancedVpcRouting;
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            this.iamRoles = iamRoles;
            this.kmsKeyId = kmsKeyId;
            this.logging = (java.util.List<imports.aws.RedshiftClusterLogging>)logging;
            this.masterPassword = masterPassword;
            this.masterUsername = masterUsername;
            this.numberOfNodes = numberOfNodes;
            this.ownerAccount = ownerAccount;
            this.port = port;
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            this.publiclyAccessible = publiclyAccessible;
            this.s3KeyPrefix = s3KeyPrefix;
            this.skipFinalSnapshot = skipFinalSnapshot;
            this.snapshotClusterIdentifier = snapshotClusterIdentifier;
            this.snapshotCopy = (java.util.List<imports.aws.RedshiftClusterSnapshotCopy>)snapshotCopy;
            this.snapshotIdentifier = snapshotIdentifier;
            this.tags = tags;
            this.timeouts = timeouts;
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getClusterIdentifier() {
            return this.clusterIdentifier;
        }

        @Override
        public final java.lang.String getNodeType() {
            return this.nodeType;
        }

        @Override
        public final java.lang.Boolean getAllowVersionUpgrade() {
            return this.allowVersionUpgrade;
        }

        @Override
        public final java.lang.Number getAutomatedSnapshotRetentionPeriod() {
            return this.automatedSnapshotRetentionPeriod;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getClusterParameterGroupName() {
            return this.clusterParameterGroupName;
        }

        @Override
        public final java.lang.String getClusterPublicKey() {
            return this.clusterPublicKey;
        }

        @Override
        public final java.lang.String getClusterRevisionNumber() {
            return this.clusterRevisionNumber;
        }

        @Override
        public final java.util.List<java.lang.String> getClusterSecurityGroups() {
            return this.clusterSecurityGroups;
        }

        @Override
        public final java.lang.String getClusterSubnetGroupName() {
            return this.clusterSubnetGroupName;
        }

        @Override
        public final java.lang.String getClusterType() {
            return this.clusterType;
        }

        @Override
        public final java.lang.String getClusterVersion() {
            return this.clusterVersion;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.lang.String getElasticIp() {
            return this.elasticIp;
        }

        @Override
        public final java.lang.Boolean getEnableLogging() {
            return this.enableLogging;
        }

        @Override
        public final java.lang.Boolean getEncrypted() {
            return this.encrypted;
        }

        @Override
        public final java.lang.String getEndpoint() {
            return this.endpoint;
        }

        @Override
        public final java.lang.Boolean getEnhancedVpcRouting() {
            return this.enhancedVpcRouting;
        }

        @Override
        public final java.lang.String getFinalSnapshotIdentifier() {
            return this.finalSnapshotIdentifier;
        }

        @Override
        public final java.util.List<java.lang.String> getIamRoles() {
            return this.iamRoles;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.util.List<imports.aws.RedshiftClusterLogging> getLogging() {
            return this.logging;
        }

        @Override
        public final java.lang.String getMasterPassword() {
            return this.masterPassword;
        }

        @Override
        public final java.lang.String getMasterUsername() {
            return this.masterUsername;
        }

        @Override
        public final java.lang.Number getNumberOfNodes() {
            return this.numberOfNodes;
        }

        @Override
        public final java.lang.String getOwnerAccount() {
            return this.ownerAccount;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getPreferredMaintenanceWindow() {
            return this.preferredMaintenanceWindow;
        }

        @Override
        public final java.lang.Boolean getPubliclyAccessible() {
            return this.publiclyAccessible;
        }

        @Override
        public final java.lang.String getS3KeyPrefix() {
            return this.s3KeyPrefix;
        }

        @Override
        public final java.lang.Boolean getSkipFinalSnapshot() {
            return this.skipFinalSnapshot;
        }

        @Override
        public final java.lang.String getSnapshotClusterIdentifier() {
            return this.snapshotClusterIdentifier;
        }

        @Override
        public final java.util.List<imports.aws.RedshiftClusterSnapshotCopy> getSnapshotCopy() {
            return this.snapshotCopy;
        }

        @Override
        public final java.lang.String getSnapshotIdentifier() {
            return this.snapshotIdentifier;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.RedshiftClusterTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSecurityGroupIds() {
            return this.vpcSecurityGroupIds;
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

            data.set("clusterIdentifier", om.valueToTree(this.getClusterIdentifier()));
            data.set("nodeType", om.valueToTree(this.getNodeType()));
            if (this.getAllowVersionUpgrade() != null) {
                data.set("allowVersionUpgrade", om.valueToTree(this.getAllowVersionUpgrade()));
            }
            if (this.getAutomatedSnapshotRetentionPeriod() != null) {
                data.set("automatedSnapshotRetentionPeriod", om.valueToTree(this.getAutomatedSnapshotRetentionPeriod()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getBucketName() != null) {
                data.set("bucketName", om.valueToTree(this.getBucketName()));
            }
            if (this.getClusterParameterGroupName() != null) {
                data.set("clusterParameterGroupName", om.valueToTree(this.getClusterParameterGroupName()));
            }
            if (this.getClusterPublicKey() != null) {
                data.set("clusterPublicKey", om.valueToTree(this.getClusterPublicKey()));
            }
            if (this.getClusterRevisionNumber() != null) {
                data.set("clusterRevisionNumber", om.valueToTree(this.getClusterRevisionNumber()));
            }
            if (this.getClusterSecurityGroups() != null) {
                data.set("clusterSecurityGroups", om.valueToTree(this.getClusterSecurityGroups()));
            }
            if (this.getClusterSubnetGroupName() != null) {
                data.set("clusterSubnetGroupName", om.valueToTree(this.getClusterSubnetGroupName()));
            }
            if (this.getClusterType() != null) {
                data.set("clusterType", om.valueToTree(this.getClusterType()));
            }
            if (this.getClusterVersion() != null) {
                data.set("clusterVersion", om.valueToTree(this.getClusterVersion()));
            }
            if (this.getDatabaseName() != null) {
                data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            }
            if (this.getElasticIp() != null) {
                data.set("elasticIp", om.valueToTree(this.getElasticIp()));
            }
            if (this.getEnableLogging() != null) {
                data.set("enableLogging", om.valueToTree(this.getEnableLogging()));
            }
            if (this.getEncrypted() != null) {
                data.set("encrypted", om.valueToTree(this.getEncrypted()));
            }
            if (this.getEndpoint() != null) {
                data.set("endpoint", om.valueToTree(this.getEndpoint()));
            }
            if (this.getEnhancedVpcRouting() != null) {
                data.set("enhancedVpcRouting", om.valueToTree(this.getEnhancedVpcRouting()));
            }
            if (this.getFinalSnapshotIdentifier() != null) {
                data.set("finalSnapshotIdentifier", om.valueToTree(this.getFinalSnapshotIdentifier()));
            }
            if (this.getIamRoles() != null) {
                data.set("iamRoles", om.valueToTree(this.getIamRoles()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getLogging() != null) {
                data.set("logging", om.valueToTree(this.getLogging()));
            }
            if (this.getMasterPassword() != null) {
                data.set("masterPassword", om.valueToTree(this.getMasterPassword()));
            }
            if (this.getMasterUsername() != null) {
                data.set("masterUsername", om.valueToTree(this.getMasterUsername()));
            }
            if (this.getNumberOfNodes() != null) {
                data.set("numberOfNodes", om.valueToTree(this.getNumberOfNodes()));
            }
            if (this.getOwnerAccount() != null) {
                data.set("ownerAccount", om.valueToTree(this.getOwnerAccount()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getPreferredMaintenanceWindow() != null) {
                data.set("preferredMaintenanceWindow", om.valueToTree(this.getPreferredMaintenanceWindow()));
            }
            if (this.getPubliclyAccessible() != null) {
                data.set("publiclyAccessible", om.valueToTree(this.getPubliclyAccessible()));
            }
            if (this.getS3KeyPrefix() != null) {
                data.set("s3KeyPrefix", om.valueToTree(this.getS3KeyPrefix()));
            }
            if (this.getSkipFinalSnapshot() != null) {
                data.set("skipFinalSnapshot", om.valueToTree(this.getSkipFinalSnapshot()));
            }
            if (this.getSnapshotClusterIdentifier() != null) {
                data.set("snapshotClusterIdentifier", om.valueToTree(this.getSnapshotClusterIdentifier()));
            }
            if (this.getSnapshotCopy() != null) {
                data.set("snapshotCopy", om.valueToTree(this.getSnapshotCopy()));
            }
            if (this.getSnapshotIdentifier() != null) {
                data.set("snapshotIdentifier", om.valueToTree(this.getSnapshotIdentifier()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVpcSecurityGroupIds() != null) {
                data.set("vpcSecurityGroupIds", om.valueToTree(this.getVpcSecurityGroupIds()));
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
            struct.set("fqn", om.valueToTree("aws.RedshiftClusterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RedshiftClusterConfig.Jsii$Proxy that = (RedshiftClusterConfig.Jsii$Proxy) o;

            if (!clusterIdentifier.equals(that.clusterIdentifier)) return false;
            if (!nodeType.equals(that.nodeType)) return false;
            if (this.allowVersionUpgrade != null ? !this.allowVersionUpgrade.equals(that.allowVersionUpgrade) : that.allowVersionUpgrade != null) return false;
            if (this.automatedSnapshotRetentionPeriod != null ? !this.automatedSnapshotRetentionPeriod.equals(that.automatedSnapshotRetentionPeriod) : that.automatedSnapshotRetentionPeriod != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.bucketName != null ? !this.bucketName.equals(that.bucketName) : that.bucketName != null) return false;
            if (this.clusterParameterGroupName != null ? !this.clusterParameterGroupName.equals(that.clusterParameterGroupName) : that.clusterParameterGroupName != null) return false;
            if (this.clusterPublicKey != null ? !this.clusterPublicKey.equals(that.clusterPublicKey) : that.clusterPublicKey != null) return false;
            if (this.clusterRevisionNumber != null ? !this.clusterRevisionNumber.equals(that.clusterRevisionNumber) : that.clusterRevisionNumber != null) return false;
            if (this.clusterSecurityGroups != null ? !this.clusterSecurityGroups.equals(that.clusterSecurityGroups) : that.clusterSecurityGroups != null) return false;
            if (this.clusterSubnetGroupName != null ? !this.clusterSubnetGroupName.equals(that.clusterSubnetGroupName) : that.clusterSubnetGroupName != null) return false;
            if (this.clusterType != null ? !this.clusterType.equals(that.clusterType) : that.clusterType != null) return false;
            if (this.clusterVersion != null ? !this.clusterVersion.equals(that.clusterVersion) : that.clusterVersion != null) return false;
            if (this.databaseName != null ? !this.databaseName.equals(that.databaseName) : that.databaseName != null) return false;
            if (this.elasticIp != null ? !this.elasticIp.equals(that.elasticIp) : that.elasticIp != null) return false;
            if (this.enableLogging != null ? !this.enableLogging.equals(that.enableLogging) : that.enableLogging != null) return false;
            if (this.encrypted != null ? !this.encrypted.equals(that.encrypted) : that.encrypted != null) return false;
            if (this.endpoint != null ? !this.endpoint.equals(that.endpoint) : that.endpoint != null) return false;
            if (this.enhancedVpcRouting != null ? !this.enhancedVpcRouting.equals(that.enhancedVpcRouting) : that.enhancedVpcRouting != null) return false;
            if (this.finalSnapshotIdentifier != null ? !this.finalSnapshotIdentifier.equals(that.finalSnapshotIdentifier) : that.finalSnapshotIdentifier != null) return false;
            if (this.iamRoles != null ? !this.iamRoles.equals(that.iamRoles) : that.iamRoles != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.logging != null ? !this.logging.equals(that.logging) : that.logging != null) return false;
            if (this.masterPassword != null ? !this.masterPassword.equals(that.masterPassword) : that.masterPassword != null) return false;
            if (this.masterUsername != null ? !this.masterUsername.equals(that.masterUsername) : that.masterUsername != null) return false;
            if (this.numberOfNodes != null ? !this.numberOfNodes.equals(that.numberOfNodes) : that.numberOfNodes != null) return false;
            if (this.ownerAccount != null ? !this.ownerAccount.equals(that.ownerAccount) : that.ownerAccount != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.preferredMaintenanceWindow != null ? !this.preferredMaintenanceWindow.equals(that.preferredMaintenanceWindow) : that.preferredMaintenanceWindow != null) return false;
            if (this.publiclyAccessible != null ? !this.publiclyAccessible.equals(that.publiclyAccessible) : that.publiclyAccessible != null) return false;
            if (this.s3KeyPrefix != null ? !this.s3KeyPrefix.equals(that.s3KeyPrefix) : that.s3KeyPrefix != null) return false;
            if (this.skipFinalSnapshot != null ? !this.skipFinalSnapshot.equals(that.skipFinalSnapshot) : that.skipFinalSnapshot != null) return false;
            if (this.snapshotClusterIdentifier != null ? !this.snapshotClusterIdentifier.equals(that.snapshotClusterIdentifier) : that.snapshotClusterIdentifier != null) return false;
            if (this.snapshotCopy != null ? !this.snapshotCopy.equals(that.snapshotCopy) : that.snapshotCopy != null) return false;
            if (this.snapshotIdentifier != null ? !this.snapshotIdentifier.equals(that.snapshotIdentifier) : that.snapshotIdentifier != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clusterIdentifier.hashCode();
            result = 31 * result + (this.nodeType.hashCode());
            result = 31 * result + (this.allowVersionUpgrade != null ? this.allowVersionUpgrade.hashCode() : 0);
            result = 31 * result + (this.automatedSnapshotRetentionPeriod != null ? this.automatedSnapshotRetentionPeriod.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.bucketName != null ? this.bucketName.hashCode() : 0);
            result = 31 * result + (this.clusterParameterGroupName != null ? this.clusterParameterGroupName.hashCode() : 0);
            result = 31 * result + (this.clusterPublicKey != null ? this.clusterPublicKey.hashCode() : 0);
            result = 31 * result + (this.clusterRevisionNumber != null ? this.clusterRevisionNumber.hashCode() : 0);
            result = 31 * result + (this.clusterSecurityGroups != null ? this.clusterSecurityGroups.hashCode() : 0);
            result = 31 * result + (this.clusterSubnetGroupName != null ? this.clusterSubnetGroupName.hashCode() : 0);
            result = 31 * result + (this.clusterType != null ? this.clusterType.hashCode() : 0);
            result = 31 * result + (this.clusterVersion != null ? this.clusterVersion.hashCode() : 0);
            result = 31 * result + (this.databaseName != null ? this.databaseName.hashCode() : 0);
            result = 31 * result + (this.elasticIp != null ? this.elasticIp.hashCode() : 0);
            result = 31 * result + (this.enableLogging != null ? this.enableLogging.hashCode() : 0);
            result = 31 * result + (this.encrypted != null ? this.encrypted.hashCode() : 0);
            result = 31 * result + (this.endpoint != null ? this.endpoint.hashCode() : 0);
            result = 31 * result + (this.enhancedVpcRouting != null ? this.enhancedVpcRouting.hashCode() : 0);
            result = 31 * result + (this.finalSnapshotIdentifier != null ? this.finalSnapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.iamRoles != null ? this.iamRoles.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.logging != null ? this.logging.hashCode() : 0);
            result = 31 * result + (this.masterPassword != null ? this.masterPassword.hashCode() : 0);
            result = 31 * result + (this.masterUsername != null ? this.masterUsername.hashCode() : 0);
            result = 31 * result + (this.numberOfNodes != null ? this.numberOfNodes.hashCode() : 0);
            result = 31 * result + (this.ownerAccount != null ? this.ownerAccount.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.preferredMaintenanceWindow != null ? this.preferredMaintenanceWindow.hashCode() : 0);
            result = 31 * result + (this.publiclyAccessible != null ? this.publiclyAccessible.hashCode() : 0);
            result = 31 * result + (this.s3KeyPrefix != null ? this.s3KeyPrefix.hashCode() : 0);
            result = 31 * result + (this.skipFinalSnapshot != null ? this.skipFinalSnapshot.hashCode() : 0);
            result = 31 * result + (this.snapshotClusterIdentifier != null ? this.snapshotClusterIdentifier.hashCode() : 0);
            result = 31 * result + (this.snapshotCopy != null ? this.snapshotCopy.hashCode() : 0);
            result = 31 * result + (this.snapshotIdentifier != null ? this.snapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
