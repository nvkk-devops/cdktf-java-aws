package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.805Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RedshiftCluster")
public class RedshiftCluster extends com.hashicorp.cdktf.TerraformResource {

    protected RedshiftCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RedshiftCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public RedshiftCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.RedshiftClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllowVersionUpgrade() {
        software.amazon.jsii.Kernel.call(this, "resetAllowVersionUpgrade", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutomatedSnapshotRetentionPeriod() {
        software.amazon.jsii.Kernel.call(this, "resetAutomatedSnapshotRetentionPeriod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAvailabilityZone() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBucketName() {
        software.amazon.jsii.Kernel.call(this, "resetBucketName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterParameterGroupName() {
        software.amazon.jsii.Kernel.call(this, "resetClusterParameterGroupName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterPublicKey() {
        software.amazon.jsii.Kernel.call(this, "resetClusterPublicKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterRevisionNumber() {
        software.amazon.jsii.Kernel.call(this, "resetClusterRevisionNumber", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetClusterSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterSubnetGroupName() {
        software.amazon.jsii.Kernel.call(this, "resetClusterSubnetGroupName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterType() {
        software.amazon.jsii.Kernel.call(this, "resetClusterType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterVersion() {
        software.amazon.jsii.Kernel.call(this, "resetClusterVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDatabaseName() {
        software.amazon.jsii.Kernel.call(this, "resetDatabaseName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticIp() {
        software.amazon.jsii.Kernel.call(this, "resetElasticIp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableLogging() {
        software.amazon.jsii.Kernel.call(this, "resetEnableLogging", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncrypted() {
        software.amazon.jsii.Kernel.call(this, "resetEncrypted", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnhancedVpcRouting() {
        software.amazon.jsii.Kernel.call(this, "resetEnhancedVpcRouting", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFinalSnapshotIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetFinalSnapshotIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIamRoles() {
        software.amazon.jsii.Kernel.call(this, "resetIamRoles", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogging() {
        software.amazon.jsii.Kernel.call(this, "resetLogging", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMasterPassword() {
        software.amazon.jsii.Kernel.call(this, "resetMasterPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMasterUsername() {
        software.amazon.jsii.Kernel.call(this, "resetMasterUsername", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNumberOfNodes() {
        software.amazon.jsii.Kernel.call(this, "resetNumberOfNodes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOwnerAccount() {
        software.amazon.jsii.Kernel.call(this, "resetOwnerAccount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreferredMaintenanceWindow() {
        software.amazon.jsii.Kernel.call(this, "resetPreferredMaintenanceWindow", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPubliclyAccessible() {
        software.amazon.jsii.Kernel.call(this, "resetPubliclyAccessible", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3KeyPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetS3KeyPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipFinalSnapshot() {
        software.amazon.jsii.Kernel.call(this, "resetSkipFinalSnapshot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotClusterIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotClusterIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotCopy() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotCopy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcSecurityGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetVpcSecurityGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowVersionUpgradeInput() {
        return software.amazon.jsii.Kernel.get(this, "allowVersionUpgradeInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAutomatedSnapshotRetentionPeriodInput() {
        return software.amazon.jsii.Kernel.get(this, "automatedSnapshotRetentionPeriodInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketNameInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterParameterGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterParameterGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterPublicKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterPublicKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterRevisionNumberInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterRevisionNumberInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClusterSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "clusterSecurityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterSubnetGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterSubnetGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getElasticIpInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticIpInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableLoggingInput() {
        return software.amazon.jsii.Kernel.get(this, "enableLoggingInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnhancedVpcRoutingInput() {
        return software.amazon.jsii.Kernel.get(this, "enhancedVpcRoutingInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFinalSnapshotIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIamRolesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "iamRolesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.RedshiftClusterLogging> getLoggingInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.RedshiftClusterLogging>)(software.amazon.jsii.Kernel.get(this, "loggingInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterLogging.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMasterPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "masterPasswordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMasterUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "masterUsernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfNodesInput() {
        return software.amazon.jsii.Kernel.get(this, "numberOfNodesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnerAccountInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerAccountInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPreferredMaintenanceWindowInput() {
        return software.amazon.jsii.Kernel.get(this, "preferredMaintenanceWindowInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPubliclyAccessibleInput() {
        return software.amazon.jsii.Kernel.get(this, "publiclyAccessibleInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3KeyPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "s3KeyPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipFinalSnapshotInput() {
        return software.amazon.jsii.Kernel.get(this, "skipFinalSnapshotInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnapshotClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "snapshotClusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.RedshiftClusterSnapshotCopy> getSnapshotCopyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.RedshiftClusterSnapshotCopy>)(software.amazon.jsii.Kernel.get(this, "snapshotCopyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterSnapshotCopy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnapshotIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "snapshotIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.RedshiftClusterTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowVersionUpgrade() {
        return software.amazon.jsii.Kernel.get(this, "allowVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowVersionUpgrade(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowVersionUpgrade", java.util.Objects.requireNonNull(value, "allowVersionUpgrade is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAutomatedSnapshotRetentionPeriod() {
        return software.amazon.jsii.Kernel.get(this, "automatedSnapshotRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAutomatedSnapshotRetentionPeriod(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "automatedSnapshotRetentionPeriod", java.util.Objects.requireNonNull(value, "automatedSnapshotRetentionPeriod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZone", java.util.Objects.requireNonNull(value, "availabilityZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketName() {
        return software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketName", java.util.Objects.requireNonNull(value, "bucketName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterIdentifier", java.util.Objects.requireNonNull(value, "clusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterParameterGroupName() {
        return software.amazon.jsii.Kernel.get(this, "clusterParameterGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterParameterGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterParameterGroupName", java.util.Objects.requireNonNull(value, "clusterParameterGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterPublicKey() {
        return software.amazon.jsii.Kernel.get(this, "clusterPublicKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterPublicKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterPublicKey", java.util.Objects.requireNonNull(value, "clusterPublicKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterRevisionNumber() {
        return software.amazon.jsii.Kernel.get(this, "clusterRevisionNumber", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterRevisionNumber(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterRevisionNumber", java.util.Objects.requireNonNull(value, "clusterRevisionNumber is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClusterSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "clusterSecurityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setClusterSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "clusterSecurityGroups", java.util.Objects.requireNonNull(value, "clusterSecurityGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterSubnetGroupName() {
        return software.amazon.jsii.Kernel.get(this, "clusterSubnetGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterSubnetGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterSubnetGroupName", java.util.Objects.requireNonNull(value, "clusterSubnetGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterType() {
        return software.amazon.jsii.Kernel.get(this, "clusterType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterType", java.util.Objects.requireNonNull(value, "clusterType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterVersion() {
        return software.amazon.jsii.Kernel.get(this, "clusterVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterVersion", java.util.Objects.requireNonNull(value, "clusterVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "databaseName", java.util.Objects.requireNonNull(value, "databaseName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getElasticIp() {
        return software.amazon.jsii.Kernel.get(this, "elasticIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setElasticIp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "elasticIp", java.util.Objects.requireNonNull(value, "elasticIp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableLogging() {
        return software.amazon.jsii.Kernel.get(this, "enableLogging", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableLogging(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableLogging", java.util.Objects.requireNonNull(value, "enableLogging is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "encrypted", java.util.Objects.requireNonNull(value, "encrypted is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpoint", java.util.Objects.requireNonNull(value, "endpoint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnhancedVpcRouting() {
        return software.amazon.jsii.Kernel.get(this, "enhancedVpcRouting", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnhancedVpcRouting(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enhancedVpcRouting", java.util.Objects.requireNonNull(value, "enhancedVpcRouting is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFinalSnapshotIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFinalSnapshotIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "finalSnapshotIdentifier", java.util.Objects.requireNonNull(value, "finalSnapshotIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIamRoles() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "iamRoles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIamRoles(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "iamRoles", java.util.Objects.requireNonNull(value, "iamRoles is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.RedshiftClusterLogging> getLogging() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterLogging.class))));
    }

    public void setLogging(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.RedshiftClusterLogging> value) {
        software.amazon.jsii.Kernel.set(this, "logging", java.util.Objects.requireNonNull(value, "logging is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterPassword() {
        return software.amazon.jsii.Kernel.get(this, "masterPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMasterPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "masterPassword", java.util.Objects.requireNonNull(value, "masterPassword is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterUsername() {
        return software.amazon.jsii.Kernel.get(this, "masterUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMasterUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "masterUsername", java.util.Objects.requireNonNull(value, "masterUsername is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeType() {
        return software.amazon.jsii.Kernel.get(this, "nodeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNodeType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nodeType", java.util.Objects.requireNonNull(value, "nodeType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfNodes() {
        return software.amazon.jsii.Kernel.get(this, "numberOfNodes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfNodes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfNodes", java.util.Objects.requireNonNull(value, "numberOfNodes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerAccount() {
        return software.amazon.jsii.Kernel.get(this, "ownerAccount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwnerAccount(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ownerAccount", java.util.Objects.requireNonNull(value, "ownerAccount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "port", java.util.Objects.requireNonNull(value, "port is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPreferredMaintenanceWindow() {
        return software.amazon.jsii.Kernel.get(this, "preferredMaintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPreferredMaintenanceWindow(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "preferredMaintenanceWindow", java.util.Objects.requireNonNull(value, "preferredMaintenanceWindow is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getPubliclyAccessible() {
        return software.amazon.jsii.Kernel.get(this, "publiclyAccessible", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPubliclyAccessible(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publiclyAccessible", java.util.Objects.requireNonNull(value, "publiclyAccessible is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3KeyPrefix() {
        return software.amazon.jsii.Kernel.get(this, "s3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3KeyPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3KeyPrefix", java.util.Objects.requireNonNull(value, "s3KeyPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getSkipFinalSnapshot() {
        return software.amazon.jsii.Kernel.get(this, "skipFinalSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSkipFinalSnapshot(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipFinalSnapshot", java.util.Objects.requireNonNull(value, "skipFinalSnapshot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "snapshotClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnapshotClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snapshotClusterIdentifier", java.util.Objects.requireNonNull(value, "snapshotClusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.RedshiftClusterSnapshotCopy> getSnapshotCopy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "snapshotCopy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterSnapshotCopy.class))));
    }

    public void setSnapshotCopy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.RedshiftClusterSnapshotCopy> value) {
        software.amazon.jsii.Kernel.set(this, "snapshotCopy", java.util.Objects.requireNonNull(value, "snapshotCopy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "snapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnapshotIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snapshotIdentifier", java.util.Objects.requireNonNull(value, "snapshotIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.RedshiftClusterTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.RedshiftClusterTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.RedshiftClusterTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVpcSecurityGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSecurityGroupIds", java.util.Objects.requireNonNull(value, "vpcSecurityGroupIds is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.RedshiftCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.RedshiftCluster> {
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
        private final imports.aws.RedshiftClusterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.RedshiftClusterConfig.Builder();
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
         * @param clusterIdentifier This parameter is required.
         */
        public Builder clusterIdentifier(final java.lang.String clusterIdentifier) {
            this.config.clusterIdentifier(clusterIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param nodeType This parameter is required.
         */
        public Builder nodeType(final java.lang.String nodeType) {
            this.config.nodeType(nodeType);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowVersionUpgrade This parameter is required.
         */
        public Builder allowVersionUpgrade(final java.lang.Boolean allowVersionUpgrade) {
            this.config.allowVersionUpgrade(allowVersionUpgrade);
            return this;
        }

        /**
         * @return {@code this}
         * @param automatedSnapshotRetentionPeriod This parameter is required.
         */
        public Builder automatedSnapshotRetentionPeriod(final java.lang.Number automatedSnapshotRetentionPeriod) {
            this.config.automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod);
            return this;
        }

        /**
         * @return {@code this}
         * @param availabilityZone This parameter is required.
         */
        public Builder availabilityZone(final java.lang.String availabilityZone) {
            this.config.availabilityZone(availabilityZone);
            return this;
        }

        /**
         * @return {@code this}
         * @param bucketName This parameter is required.
         */
        public Builder bucketName(final java.lang.String bucketName) {
            this.config.bucketName(bucketName);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterParameterGroupName This parameter is required.
         */
        public Builder clusterParameterGroupName(final java.lang.String clusterParameterGroupName) {
            this.config.clusterParameterGroupName(clusterParameterGroupName);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterPublicKey This parameter is required.
         */
        public Builder clusterPublicKey(final java.lang.String clusterPublicKey) {
            this.config.clusterPublicKey(clusterPublicKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterRevisionNumber This parameter is required.
         */
        public Builder clusterRevisionNumber(final java.lang.String clusterRevisionNumber) {
            this.config.clusterRevisionNumber(clusterRevisionNumber);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterSecurityGroups This parameter is required.
         */
        public Builder clusterSecurityGroups(final java.util.List<java.lang.String> clusterSecurityGroups) {
            this.config.clusterSecurityGroups(clusterSecurityGroups);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterSubnetGroupName This parameter is required.
         */
        public Builder clusterSubnetGroupName(final java.lang.String clusterSubnetGroupName) {
            this.config.clusterSubnetGroupName(clusterSubnetGroupName);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterType This parameter is required.
         */
        public Builder clusterType(final java.lang.String clusterType) {
            this.config.clusterType(clusterType);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterVersion This parameter is required.
         */
        public Builder clusterVersion(final java.lang.String clusterVersion) {
            this.config.clusterVersion(clusterVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param databaseName This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * @return {@code this}
         * @param elasticIp This parameter is required.
         */
        public Builder elasticIp(final java.lang.String elasticIp) {
            this.config.elasticIp(elasticIp);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableLogging This parameter is required.
         */
        public Builder enableLogging(final java.lang.Boolean enableLogging) {
            this.config.enableLogging(enableLogging);
            return this;
        }

        /**
         * @return {@code this}
         * @param encrypted This parameter is required.
         */
        public Builder encrypted(final java.lang.Boolean encrypted) {
            this.config.encrypted(encrypted);
            return this;
        }

        /**
         * @return {@code this}
         * @param endpoint This parameter is required.
         */
        public Builder endpoint(final java.lang.String endpoint) {
            this.config.endpoint(endpoint);
            return this;
        }

        /**
         * @return {@code this}
         * @param enhancedVpcRouting This parameter is required.
         */
        public Builder enhancedVpcRouting(final java.lang.Boolean enhancedVpcRouting) {
            this.config.enhancedVpcRouting(enhancedVpcRouting);
            return this;
        }

        /**
         * @return {@code this}
         * @param finalSnapshotIdentifier This parameter is required.
         */
        public Builder finalSnapshotIdentifier(final java.lang.String finalSnapshotIdentifier) {
            this.config.finalSnapshotIdentifier(finalSnapshotIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param iamRoles This parameter is required.
         */
        public Builder iamRoles(final java.util.List<java.lang.String> iamRoles) {
            this.config.iamRoles(iamRoles);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsKeyId This parameter is required.
         */
        public Builder kmsKeyId(final java.lang.String kmsKeyId) {
            this.config.kmsKeyId(kmsKeyId);
            return this;
        }

        /**
         * logging block.
         * <p>
         * @return {@code this}
         * @param logging logging block. This parameter is required.
         */
        public Builder logging(final java.util.List<? extends imports.aws.RedshiftClusterLogging> logging) {
            this.config.logging(logging);
            return this;
        }

        /**
         * @return {@code this}
         * @param masterPassword This parameter is required.
         */
        public Builder masterPassword(final java.lang.String masterPassword) {
            this.config.masterPassword(masterPassword);
            return this;
        }

        /**
         * @return {@code this}
         * @param masterUsername This parameter is required.
         */
        public Builder masterUsername(final java.lang.String masterUsername) {
            this.config.masterUsername(masterUsername);
            return this;
        }

        /**
         * @return {@code this}
         * @param numberOfNodes This parameter is required.
         */
        public Builder numberOfNodes(final java.lang.Number numberOfNodes) {
            this.config.numberOfNodes(numberOfNodes);
            return this;
        }

        /**
         * @return {@code this}
         * @param ownerAccount This parameter is required.
         */
        public Builder ownerAccount(final java.lang.String ownerAccount) {
            this.config.ownerAccount(ownerAccount);
            return this;
        }

        /**
         * @return {@code this}
         * @param port This parameter is required.
         */
        public Builder port(final java.lang.Number port) {
            this.config.port(port);
            return this;
        }

        /**
         * @return {@code this}
         * @param preferredMaintenanceWindow This parameter is required.
         */
        public Builder preferredMaintenanceWindow(final java.lang.String preferredMaintenanceWindow) {
            this.config.preferredMaintenanceWindow(preferredMaintenanceWindow);
            return this;
        }

        /**
         * @return {@code this}
         * @param publiclyAccessible This parameter is required.
         */
        public Builder publiclyAccessible(final java.lang.Boolean publiclyAccessible) {
            this.config.publiclyAccessible(publiclyAccessible);
            return this;
        }

        /**
         * @return {@code this}
         * @param s3KeyPrefix This parameter is required.
         */
        public Builder s3KeyPrefix(final java.lang.String s3KeyPrefix) {
            this.config.s3KeyPrefix(s3KeyPrefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param skipFinalSnapshot This parameter is required.
         */
        public Builder skipFinalSnapshot(final java.lang.Boolean skipFinalSnapshot) {
            this.config.skipFinalSnapshot(skipFinalSnapshot);
            return this;
        }

        /**
         * @return {@code this}
         * @param snapshotClusterIdentifier This parameter is required.
         */
        public Builder snapshotClusterIdentifier(final java.lang.String snapshotClusterIdentifier) {
            this.config.snapshotClusterIdentifier(snapshotClusterIdentifier);
            return this;
        }

        /**
         * snapshot_copy block.
         * <p>
         * @return {@code this}
         * @param snapshotCopy snapshot_copy block. This parameter is required.
         */
        public Builder snapshotCopy(final java.util.List<? extends imports.aws.RedshiftClusterSnapshotCopy> snapshotCopy) {
            this.config.snapshotCopy(snapshotCopy);
            return this;
        }

        /**
         * @return {@code this}
         * @param snapshotIdentifier This parameter is required.
         */
        public Builder snapshotIdentifier(final java.lang.String snapshotIdentifier) {
            this.config.snapshotIdentifier(snapshotIdentifier);
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
        public Builder timeouts(final imports.aws.RedshiftClusterTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpcSecurityGroupIds This parameter is required.
         */
        public Builder vpcSecurityGroupIds(final java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.config.vpcSecurityGroupIds(vpcSecurityGroupIds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.RedshiftCluster}.
         */
        @Override
        public imports.aws.RedshiftCluster build() {
            return new imports.aws.RedshiftCluster(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
