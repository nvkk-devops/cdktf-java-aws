package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.799Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RdsClusterConfig")
@software.amazon.jsii.Jsii.Proxy(RdsClusterConfig.Jsii$Proxy.class)
public interface RdsClusterConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApplyImmediately() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAvailabilityZones() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBacktrackWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBackupRetentionPeriod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClusterIdentifierPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClusterMembers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCopyTagsToSnapshot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDatabaseName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDbClusterParameterGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDbSubnetGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeletionProtection() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledCloudwatchLogsExports() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableHttpEndpoint() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngine() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngineMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngineVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFinalSnapshotIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGlobalClusterIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIamDatabaseAuthenticationEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIamRoles() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMasterPassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMasterUsername() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreferredBackupWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreferredMaintenanceWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReplicationSourceIdentifier() {
        return null;
    }

    /**
     * s3_import block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.RdsClusterS3Import> getS3Import() {
        return null;
    }

    /**
     * scaling_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.RdsClusterScalingConfiguration> getScalingConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipFinalSnapshot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceRegion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStorageEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.RdsClusterTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RdsClusterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RdsClusterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RdsClusterConfig> {
        private java.lang.Boolean applyImmediately;
        private java.util.List<java.lang.String> availabilityZones;
        private java.lang.Number backtrackWindow;
        private java.lang.Number backupRetentionPeriod;
        private java.lang.String clusterIdentifier;
        private java.lang.String clusterIdentifierPrefix;
        private java.util.List<java.lang.String> clusterMembers;
        private java.lang.Boolean copyTagsToSnapshot;
        private java.lang.String databaseName;
        private java.lang.String dbClusterParameterGroupName;
        private java.lang.String dbSubnetGroupName;
        private java.lang.Boolean deletionProtection;
        private java.util.List<java.lang.String> enabledCloudwatchLogsExports;
        private java.lang.Boolean enableHttpEndpoint;
        private java.lang.String engine;
        private java.lang.String engineMode;
        private java.lang.String engineVersion;
        private java.lang.String finalSnapshotIdentifier;
        private java.lang.String globalClusterIdentifier;
        private java.lang.Boolean iamDatabaseAuthenticationEnabled;
        private java.util.List<java.lang.String> iamRoles;
        private java.lang.String kmsKeyId;
        private java.lang.String masterPassword;
        private java.lang.String masterUsername;
        private java.lang.Number port;
        private java.lang.String preferredBackupWindow;
        private java.lang.String preferredMaintenanceWindow;
        private java.lang.String replicationSourceIdentifier;
        private java.util.List<imports.aws.RdsClusterS3Import> s3Import;
        private java.util.List<imports.aws.RdsClusterScalingConfiguration> scalingConfiguration;
        private java.lang.Boolean skipFinalSnapshot;
        private java.lang.String snapshotIdentifier;
        private java.lang.String sourceRegion;
        private java.lang.Boolean storageEncrypted;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.RdsClusterTimeouts timeouts;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link RdsClusterConfig#getApplyImmediately}
         * @param applyImmediately the value to be set.
         * @return {@code this}
         */
        public Builder applyImmediately(java.lang.Boolean applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getAvailabilityZones}
         * @param availabilityZones the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZones(java.util.List<java.lang.String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getBacktrackWindow}
         * @param backtrackWindow the value to be set.
         * @return {@code this}
         */
        public Builder backtrackWindow(java.lang.Number backtrackWindow) {
            this.backtrackWindow = backtrackWindow;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getBackupRetentionPeriod}
         * @param backupRetentionPeriod the value to be set.
         * @return {@code this}
         */
        public Builder backupRetentionPeriod(java.lang.Number backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getClusterIdentifier}
         * @param clusterIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder clusterIdentifier(java.lang.String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getClusterIdentifierPrefix}
         * @param clusterIdentifierPrefix the value to be set.
         * @return {@code this}
         */
        public Builder clusterIdentifierPrefix(java.lang.String clusterIdentifierPrefix) {
            this.clusterIdentifierPrefix = clusterIdentifierPrefix;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getClusterMembers}
         * @param clusterMembers the value to be set.
         * @return {@code this}
         */
        public Builder clusterMembers(java.util.List<java.lang.String> clusterMembers) {
            this.clusterMembers = clusterMembers;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getCopyTagsToSnapshot}
         * @param copyTagsToSnapshot the value to be set.
         * @return {@code this}
         */
        public Builder copyTagsToSnapshot(java.lang.Boolean copyTagsToSnapshot) {
            this.copyTagsToSnapshot = copyTagsToSnapshot;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getDatabaseName}
         * @param databaseName the value to be set.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getDbClusterParameterGroupName}
         * @param dbClusterParameterGroupName the value to be set.
         * @return {@code this}
         */
        public Builder dbClusterParameterGroupName(java.lang.String dbClusterParameterGroupName) {
            this.dbClusterParameterGroupName = dbClusterParameterGroupName;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getDbSubnetGroupName}
         * @param dbSubnetGroupName the value to be set.
         * @return {@code this}
         */
        public Builder dbSubnetGroupName(java.lang.String dbSubnetGroupName) {
            this.dbSubnetGroupName = dbSubnetGroupName;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getDeletionProtection}
         * @param deletionProtection the value to be set.
         * @return {@code this}
         */
        public Builder deletionProtection(java.lang.Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getEnabledCloudwatchLogsExports}
         * @param enabledCloudwatchLogsExports the value to be set.
         * @return {@code this}
         */
        public Builder enabledCloudwatchLogsExports(java.util.List<java.lang.String> enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getEnableHttpEndpoint}
         * @param enableHttpEndpoint the value to be set.
         * @return {@code this}
         */
        public Builder enableHttpEndpoint(java.lang.Boolean enableHttpEndpoint) {
            this.enableHttpEndpoint = enableHttpEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getEngine}
         * @param engine the value to be set.
         * @return {@code this}
         */
        public Builder engine(java.lang.String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getEngineMode}
         * @param engineMode the value to be set.
         * @return {@code this}
         */
        public Builder engineMode(java.lang.String engineMode) {
            this.engineMode = engineMode;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getEngineVersion}
         * @param engineVersion the value to be set.
         * @return {@code this}
         */
        public Builder engineVersion(java.lang.String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getFinalSnapshotIdentifier}
         * @param finalSnapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder finalSnapshotIdentifier(java.lang.String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getGlobalClusterIdentifier}
         * @param globalClusterIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder globalClusterIdentifier(java.lang.String globalClusterIdentifier) {
            this.globalClusterIdentifier = globalClusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getIamDatabaseAuthenticationEnabled}
         * @param iamDatabaseAuthenticationEnabled the value to be set.
         * @return {@code this}
         */
        public Builder iamDatabaseAuthenticationEnabled(java.lang.Boolean iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getIamRoles}
         * @param iamRoles the value to be set.
         * @return {@code this}
         */
        public Builder iamRoles(java.util.List<java.lang.String> iamRoles) {
            this.iamRoles = iamRoles;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getMasterPassword}
         * @param masterPassword the value to be set.
         * @return {@code this}
         */
        public Builder masterPassword(java.lang.String masterPassword) {
            this.masterPassword = masterPassword;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getMasterUsername}
         * @param masterUsername the value to be set.
         * @return {@code this}
         */
        public Builder masterUsername(java.lang.String masterUsername) {
            this.masterUsername = masterUsername;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getPreferredBackupWindow}
         * @param preferredBackupWindow the value to be set.
         * @return {@code this}
         */
        public Builder preferredBackupWindow(java.lang.String preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getPreferredMaintenanceWindow}
         * @param preferredMaintenanceWindow the value to be set.
         * @return {@code this}
         */
        public Builder preferredMaintenanceWindow(java.lang.String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getReplicationSourceIdentifier}
         * @param replicationSourceIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder replicationSourceIdentifier(java.lang.String replicationSourceIdentifier) {
            this.replicationSourceIdentifier = replicationSourceIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getS3Import}
         * @param s3Import s3_import block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Import(java.util.List<? extends imports.aws.RdsClusterS3Import> s3Import) {
            this.s3Import = (java.util.List<imports.aws.RdsClusterS3Import>)s3Import;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getScalingConfiguration}
         * @param scalingConfiguration scaling_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder scalingConfiguration(java.util.List<? extends imports.aws.RdsClusterScalingConfiguration> scalingConfiguration) {
            this.scalingConfiguration = (java.util.List<imports.aws.RdsClusterScalingConfiguration>)scalingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getSkipFinalSnapshot}
         * @param skipFinalSnapshot the value to be set.
         * @return {@code this}
         */
        public Builder skipFinalSnapshot(java.lang.Boolean skipFinalSnapshot) {
            this.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getSnapshotIdentifier}
         * @param snapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder snapshotIdentifier(java.lang.String snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getSourceRegion}
         * @param sourceRegion the value to be set.
         * @return {@code this}
         */
        public Builder sourceRegion(java.lang.String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getStorageEncrypted}
         * @param storageEncrypted the value to be set.
         * @return {@code this}
         */
        public Builder storageEncrypted(java.lang.Boolean storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.RdsClusterTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getDependsOn}
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
         * Sets the value of {@link RdsClusterConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterConfig#getProvider}
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
         * @return a new instance of {@link RdsClusterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RdsClusterConfig build() {
            return new Jsii$Proxy(applyImmediately, availabilityZones, backtrackWindow, backupRetentionPeriod, clusterIdentifier, clusterIdentifierPrefix, clusterMembers, copyTagsToSnapshot, databaseName, dbClusterParameterGroupName, dbSubnetGroupName, deletionProtection, enabledCloudwatchLogsExports, enableHttpEndpoint, engine, engineMode, engineVersion, finalSnapshotIdentifier, globalClusterIdentifier, iamDatabaseAuthenticationEnabled, iamRoles, kmsKeyId, masterPassword, masterUsername, port, preferredBackupWindow, preferredMaintenanceWindow, replicationSourceIdentifier, s3Import, scalingConfiguration, skipFinalSnapshot, snapshotIdentifier, sourceRegion, storageEncrypted, tags, timeouts, vpcSecurityGroupIds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link RdsClusterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RdsClusterConfig {
        private final java.lang.Boolean applyImmediately;
        private final java.util.List<java.lang.String> availabilityZones;
        private final java.lang.Number backtrackWindow;
        private final java.lang.Number backupRetentionPeriod;
        private final java.lang.String clusterIdentifier;
        private final java.lang.String clusterIdentifierPrefix;
        private final java.util.List<java.lang.String> clusterMembers;
        private final java.lang.Boolean copyTagsToSnapshot;
        private final java.lang.String databaseName;
        private final java.lang.String dbClusterParameterGroupName;
        private final java.lang.String dbSubnetGroupName;
        private final java.lang.Boolean deletionProtection;
        private final java.util.List<java.lang.String> enabledCloudwatchLogsExports;
        private final java.lang.Boolean enableHttpEndpoint;
        private final java.lang.String engine;
        private final java.lang.String engineMode;
        private final java.lang.String engineVersion;
        private final java.lang.String finalSnapshotIdentifier;
        private final java.lang.String globalClusterIdentifier;
        private final java.lang.Boolean iamDatabaseAuthenticationEnabled;
        private final java.util.List<java.lang.String> iamRoles;
        private final java.lang.String kmsKeyId;
        private final java.lang.String masterPassword;
        private final java.lang.String masterUsername;
        private final java.lang.Number port;
        private final java.lang.String preferredBackupWindow;
        private final java.lang.String preferredMaintenanceWindow;
        private final java.lang.String replicationSourceIdentifier;
        private final java.util.List<imports.aws.RdsClusterS3Import> s3Import;
        private final java.util.List<imports.aws.RdsClusterScalingConfiguration> scalingConfiguration;
        private final java.lang.Boolean skipFinalSnapshot;
        private final java.lang.String snapshotIdentifier;
        private final java.lang.String sourceRegion;
        private final java.lang.Boolean storageEncrypted;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.RdsClusterTimeouts timeouts;
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
            this.applyImmediately = software.amazon.jsii.Kernel.get(this, "applyImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.availabilityZones = software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.backtrackWindow = software.amazon.jsii.Kernel.get(this, "backtrackWindow", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.backupRetentionPeriod = software.amazon.jsii.Kernel.get(this, "backupRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.clusterIdentifier = software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterIdentifierPrefix = software.amazon.jsii.Kernel.get(this, "clusterIdentifierPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterMembers = software.amazon.jsii.Kernel.get(this, "clusterMembers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.copyTagsToSnapshot = software.amazon.jsii.Kernel.get(this, "copyTagsToSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dbClusterParameterGroupName = software.amazon.jsii.Kernel.get(this, "dbClusterParameterGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dbSubnetGroupName = software.amazon.jsii.Kernel.get(this, "dbSubnetGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deletionProtection = software.amazon.jsii.Kernel.get(this, "deletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enabledCloudwatchLogsExports = software.amazon.jsii.Kernel.get(this, "enabledCloudwatchLogsExports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.enableHttpEndpoint = software.amazon.jsii.Kernel.get(this, "enableHttpEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.engine = software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineMode = software.amazon.jsii.Kernel.get(this, "engineMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineVersion = software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.finalSnapshotIdentifier = software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.globalClusterIdentifier = software.amazon.jsii.Kernel.get(this, "globalClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamDatabaseAuthenticationEnabled = software.amazon.jsii.Kernel.get(this, "iamDatabaseAuthenticationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.iamRoles = software.amazon.jsii.Kernel.get(this, "iamRoles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.masterPassword = software.amazon.jsii.Kernel.get(this, "masterPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.masterUsername = software.amazon.jsii.Kernel.get(this, "masterUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.preferredBackupWindow = software.amazon.jsii.Kernel.get(this, "preferredBackupWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preferredMaintenanceWindow = software.amazon.jsii.Kernel.get(this, "preferredMaintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationSourceIdentifier = software.amazon.jsii.Kernel.get(this, "replicationSourceIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Import = software.amazon.jsii.Kernel.get(this, "s3Import", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RdsClusterS3Import.class)));
            this.scalingConfiguration = software.amazon.jsii.Kernel.get(this, "scalingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.RdsClusterScalingConfiguration.class)));
            this.skipFinalSnapshot = software.amazon.jsii.Kernel.get(this, "skipFinalSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.snapshotIdentifier = software.amazon.jsii.Kernel.get(this, "snapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceRegion = software.amazon.jsii.Kernel.get(this, "sourceRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageEncrypted = software.amazon.jsii.Kernel.get(this, "storageEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.RdsClusterTimeouts.class));
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
        protected Jsii$Proxy(final java.lang.Boolean applyImmediately, final java.util.List<java.lang.String> availabilityZones, final java.lang.Number backtrackWindow, final java.lang.Number backupRetentionPeriod, final java.lang.String clusterIdentifier, final java.lang.String clusterIdentifierPrefix, final java.util.List<java.lang.String> clusterMembers, final java.lang.Boolean copyTagsToSnapshot, final java.lang.String databaseName, final java.lang.String dbClusterParameterGroupName, final java.lang.String dbSubnetGroupName, final java.lang.Boolean deletionProtection, final java.util.List<java.lang.String> enabledCloudwatchLogsExports, final java.lang.Boolean enableHttpEndpoint, final java.lang.String engine, final java.lang.String engineMode, final java.lang.String engineVersion, final java.lang.String finalSnapshotIdentifier, final java.lang.String globalClusterIdentifier, final java.lang.Boolean iamDatabaseAuthenticationEnabled, final java.util.List<java.lang.String> iamRoles, final java.lang.String kmsKeyId, final java.lang.String masterPassword, final java.lang.String masterUsername, final java.lang.Number port, final java.lang.String preferredBackupWindow, final java.lang.String preferredMaintenanceWindow, final java.lang.String replicationSourceIdentifier, final java.util.List<? extends imports.aws.RdsClusterS3Import> s3Import, final java.util.List<? extends imports.aws.RdsClusterScalingConfiguration> scalingConfiguration, final java.lang.Boolean skipFinalSnapshot, final java.lang.String snapshotIdentifier, final java.lang.String sourceRegion, final java.lang.Boolean storageEncrypted, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.RdsClusterTimeouts timeouts, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.applyImmediately = applyImmediately;
            this.availabilityZones = availabilityZones;
            this.backtrackWindow = backtrackWindow;
            this.backupRetentionPeriod = backupRetentionPeriod;
            this.clusterIdentifier = clusterIdentifier;
            this.clusterIdentifierPrefix = clusterIdentifierPrefix;
            this.clusterMembers = clusterMembers;
            this.copyTagsToSnapshot = copyTagsToSnapshot;
            this.databaseName = databaseName;
            this.dbClusterParameterGroupName = dbClusterParameterGroupName;
            this.dbSubnetGroupName = dbSubnetGroupName;
            this.deletionProtection = deletionProtection;
            this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
            this.enableHttpEndpoint = enableHttpEndpoint;
            this.engine = engine;
            this.engineMode = engineMode;
            this.engineVersion = engineVersion;
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            this.globalClusterIdentifier = globalClusterIdentifier;
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            this.iamRoles = iamRoles;
            this.kmsKeyId = kmsKeyId;
            this.masterPassword = masterPassword;
            this.masterUsername = masterUsername;
            this.port = port;
            this.preferredBackupWindow = preferredBackupWindow;
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            this.replicationSourceIdentifier = replicationSourceIdentifier;
            this.s3Import = (java.util.List<imports.aws.RdsClusterS3Import>)s3Import;
            this.scalingConfiguration = (java.util.List<imports.aws.RdsClusterScalingConfiguration>)scalingConfiguration;
            this.skipFinalSnapshot = skipFinalSnapshot;
            this.snapshotIdentifier = snapshotIdentifier;
            this.sourceRegion = sourceRegion;
            this.storageEncrypted = storageEncrypted;
            this.tags = tags;
            this.timeouts = timeouts;
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Boolean getApplyImmediately() {
            return this.applyImmediately;
        }

        @Override
        public final java.util.List<java.lang.String> getAvailabilityZones() {
            return this.availabilityZones;
        }

        @Override
        public final java.lang.Number getBacktrackWindow() {
            return this.backtrackWindow;
        }

        @Override
        public final java.lang.Number getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        @Override
        public final java.lang.String getClusterIdentifier() {
            return this.clusterIdentifier;
        }

        @Override
        public final java.lang.String getClusterIdentifierPrefix() {
            return this.clusterIdentifierPrefix;
        }

        @Override
        public final java.util.List<java.lang.String> getClusterMembers() {
            return this.clusterMembers;
        }

        @Override
        public final java.lang.Boolean getCopyTagsToSnapshot() {
            return this.copyTagsToSnapshot;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.lang.String getDbClusterParameterGroupName() {
            return this.dbClusterParameterGroupName;
        }

        @Override
        public final java.lang.String getDbSubnetGroupName() {
            return this.dbSubnetGroupName;
        }

        @Override
        public final java.lang.Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        @Override
        public final java.util.List<java.lang.String> getEnabledCloudwatchLogsExports() {
            return this.enabledCloudwatchLogsExports;
        }

        @Override
        public final java.lang.Boolean getEnableHttpEndpoint() {
            return this.enableHttpEndpoint;
        }

        @Override
        public final java.lang.String getEngine() {
            return this.engine;
        }

        @Override
        public final java.lang.String getEngineMode() {
            return this.engineMode;
        }

        @Override
        public final java.lang.String getEngineVersion() {
            return this.engineVersion;
        }

        @Override
        public final java.lang.String getFinalSnapshotIdentifier() {
            return this.finalSnapshotIdentifier;
        }

        @Override
        public final java.lang.String getGlobalClusterIdentifier() {
            return this.globalClusterIdentifier;
        }

        @Override
        public final java.lang.Boolean getIamDatabaseAuthenticationEnabled() {
            return this.iamDatabaseAuthenticationEnabled;
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
        public final java.lang.String getMasterPassword() {
            return this.masterPassword;
        }

        @Override
        public final java.lang.String getMasterUsername() {
            return this.masterUsername;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getPreferredBackupWindow() {
            return this.preferredBackupWindow;
        }

        @Override
        public final java.lang.String getPreferredMaintenanceWindow() {
            return this.preferredMaintenanceWindow;
        }

        @Override
        public final java.lang.String getReplicationSourceIdentifier() {
            return this.replicationSourceIdentifier;
        }

        @Override
        public final java.util.List<imports.aws.RdsClusterS3Import> getS3Import() {
            return this.s3Import;
        }

        @Override
        public final java.util.List<imports.aws.RdsClusterScalingConfiguration> getScalingConfiguration() {
            return this.scalingConfiguration;
        }

        @Override
        public final java.lang.Boolean getSkipFinalSnapshot() {
            return this.skipFinalSnapshot;
        }

        @Override
        public final java.lang.String getSnapshotIdentifier() {
            return this.snapshotIdentifier;
        }

        @Override
        public final java.lang.String getSourceRegion() {
            return this.sourceRegion;
        }

        @Override
        public final java.lang.Boolean getStorageEncrypted() {
            return this.storageEncrypted;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.RdsClusterTimeouts getTimeouts() {
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

            if (this.getApplyImmediately() != null) {
                data.set("applyImmediately", om.valueToTree(this.getApplyImmediately()));
            }
            if (this.getAvailabilityZones() != null) {
                data.set("availabilityZones", om.valueToTree(this.getAvailabilityZones()));
            }
            if (this.getBacktrackWindow() != null) {
                data.set("backtrackWindow", om.valueToTree(this.getBacktrackWindow()));
            }
            if (this.getBackupRetentionPeriod() != null) {
                data.set("backupRetentionPeriod", om.valueToTree(this.getBackupRetentionPeriod()));
            }
            if (this.getClusterIdentifier() != null) {
                data.set("clusterIdentifier", om.valueToTree(this.getClusterIdentifier()));
            }
            if (this.getClusterIdentifierPrefix() != null) {
                data.set("clusterIdentifierPrefix", om.valueToTree(this.getClusterIdentifierPrefix()));
            }
            if (this.getClusterMembers() != null) {
                data.set("clusterMembers", om.valueToTree(this.getClusterMembers()));
            }
            if (this.getCopyTagsToSnapshot() != null) {
                data.set("copyTagsToSnapshot", om.valueToTree(this.getCopyTagsToSnapshot()));
            }
            if (this.getDatabaseName() != null) {
                data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            }
            if (this.getDbClusterParameterGroupName() != null) {
                data.set("dbClusterParameterGroupName", om.valueToTree(this.getDbClusterParameterGroupName()));
            }
            if (this.getDbSubnetGroupName() != null) {
                data.set("dbSubnetGroupName", om.valueToTree(this.getDbSubnetGroupName()));
            }
            if (this.getDeletionProtection() != null) {
                data.set("deletionProtection", om.valueToTree(this.getDeletionProtection()));
            }
            if (this.getEnabledCloudwatchLogsExports() != null) {
                data.set("enabledCloudwatchLogsExports", om.valueToTree(this.getEnabledCloudwatchLogsExports()));
            }
            if (this.getEnableHttpEndpoint() != null) {
                data.set("enableHttpEndpoint", om.valueToTree(this.getEnableHttpEndpoint()));
            }
            if (this.getEngine() != null) {
                data.set("engine", om.valueToTree(this.getEngine()));
            }
            if (this.getEngineMode() != null) {
                data.set("engineMode", om.valueToTree(this.getEngineMode()));
            }
            if (this.getEngineVersion() != null) {
                data.set("engineVersion", om.valueToTree(this.getEngineVersion()));
            }
            if (this.getFinalSnapshotIdentifier() != null) {
                data.set("finalSnapshotIdentifier", om.valueToTree(this.getFinalSnapshotIdentifier()));
            }
            if (this.getGlobalClusterIdentifier() != null) {
                data.set("globalClusterIdentifier", om.valueToTree(this.getGlobalClusterIdentifier()));
            }
            if (this.getIamDatabaseAuthenticationEnabled() != null) {
                data.set("iamDatabaseAuthenticationEnabled", om.valueToTree(this.getIamDatabaseAuthenticationEnabled()));
            }
            if (this.getIamRoles() != null) {
                data.set("iamRoles", om.valueToTree(this.getIamRoles()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getMasterPassword() != null) {
                data.set("masterPassword", om.valueToTree(this.getMasterPassword()));
            }
            if (this.getMasterUsername() != null) {
                data.set("masterUsername", om.valueToTree(this.getMasterUsername()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getPreferredBackupWindow() != null) {
                data.set("preferredBackupWindow", om.valueToTree(this.getPreferredBackupWindow()));
            }
            if (this.getPreferredMaintenanceWindow() != null) {
                data.set("preferredMaintenanceWindow", om.valueToTree(this.getPreferredMaintenanceWindow()));
            }
            if (this.getReplicationSourceIdentifier() != null) {
                data.set("replicationSourceIdentifier", om.valueToTree(this.getReplicationSourceIdentifier()));
            }
            if (this.getS3Import() != null) {
                data.set("s3Import", om.valueToTree(this.getS3Import()));
            }
            if (this.getScalingConfiguration() != null) {
                data.set("scalingConfiguration", om.valueToTree(this.getScalingConfiguration()));
            }
            if (this.getSkipFinalSnapshot() != null) {
                data.set("skipFinalSnapshot", om.valueToTree(this.getSkipFinalSnapshot()));
            }
            if (this.getSnapshotIdentifier() != null) {
                data.set("snapshotIdentifier", om.valueToTree(this.getSnapshotIdentifier()));
            }
            if (this.getSourceRegion() != null) {
                data.set("sourceRegion", om.valueToTree(this.getSourceRegion()));
            }
            if (this.getStorageEncrypted() != null) {
                data.set("storageEncrypted", om.valueToTree(this.getStorageEncrypted()));
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
            struct.set("fqn", om.valueToTree("aws.RdsClusterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RdsClusterConfig.Jsii$Proxy that = (RdsClusterConfig.Jsii$Proxy) o;

            if (this.applyImmediately != null ? !this.applyImmediately.equals(that.applyImmediately) : that.applyImmediately != null) return false;
            if (this.availabilityZones != null ? !this.availabilityZones.equals(that.availabilityZones) : that.availabilityZones != null) return false;
            if (this.backtrackWindow != null ? !this.backtrackWindow.equals(that.backtrackWindow) : that.backtrackWindow != null) return false;
            if (this.backupRetentionPeriod != null ? !this.backupRetentionPeriod.equals(that.backupRetentionPeriod) : that.backupRetentionPeriod != null) return false;
            if (this.clusterIdentifier != null ? !this.clusterIdentifier.equals(that.clusterIdentifier) : that.clusterIdentifier != null) return false;
            if (this.clusterIdentifierPrefix != null ? !this.clusterIdentifierPrefix.equals(that.clusterIdentifierPrefix) : that.clusterIdentifierPrefix != null) return false;
            if (this.clusterMembers != null ? !this.clusterMembers.equals(that.clusterMembers) : that.clusterMembers != null) return false;
            if (this.copyTagsToSnapshot != null ? !this.copyTagsToSnapshot.equals(that.copyTagsToSnapshot) : that.copyTagsToSnapshot != null) return false;
            if (this.databaseName != null ? !this.databaseName.equals(that.databaseName) : that.databaseName != null) return false;
            if (this.dbClusterParameterGroupName != null ? !this.dbClusterParameterGroupName.equals(that.dbClusterParameterGroupName) : that.dbClusterParameterGroupName != null) return false;
            if (this.dbSubnetGroupName != null ? !this.dbSubnetGroupName.equals(that.dbSubnetGroupName) : that.dbSubnetGroupName != null) return false;
            if (this.deletionProtection != null ? !this.deletionProtection.equals(that.deletionProtection) : that.deletionProtection != null) return false;
            if (this.enabledCloudwatchLogsExports != null ? !this.enabledCloudwatchLogsExports.equals(that.enabledCloudwatchLogsExports) : that.enabledCloudwatchLogsExports != null) return false;
            if (this.enableHttpEndpoint != null ? !this.enableHttpEndpoint.equals(that.enableHttpEndpoint) : that.enableHttpEndpoint != null) return false;
            if (this.engine != null ? !this.engine.equals(that.engine) : that.engine != null) return false;
            if (this.engineMode != null ? !this.engineMode.equals(that.engineMode) : that.engineMode != null) return false;
            if (this.engineVersion != null ? !this.engineVersion.equals(that.engineVersion) : that.engineVersion != null) return false;
            if (this.finalSnapshotIdentifier != null ? !this.finalSnapshotIdentifier.equals(that.finalSnapshotIdentifier) : that.finalSnapshotIdentifier != null) return false;
            if (this.globalClusterIdentifier != null ? !this.globalClusterIdentifier.equals(that.globalClusterIdentifier) : that.globalClusterIdentifier != null) return false;
            if (this.iamDatabaseAuthenticationEnabled != null ? !this.iamDatabaseAuthenticationEnabled.equals(that.iamDatabaseAuthenticationEnabled) : that.iamDatabaseAuthenticationEnabled != null) return false;
            if (this.iamRoles != null ? !this.iamRoles.equals(that.iamRoles) : that.iamRoles != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.masterPassword != null ? !this.masterPassword.equals(that.masterPassword) : that.masterPassword != null) return false;
            if (this.masterUsername != null ? !this.masterUsername.equals(that.masterUsername) : that.masterUsername != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.preferredBackupWindow != null ? !this.preferredBackupWindow.equals(that.preferredBackupWindow) : that.preferredBackupWindow != null) return false;
            if (this.preferredMaintenanceWindow != null ? !this.preferredMaintenanceWindow.equals(that.preferredMaintenanceWindow) : that.preferredMaintenanceWindow != null) return false;
            if (this.replicationSourceIdentifier != null ? !this.replicationSourceIdentifier.equals(that.replicationSourceIdentifier) : that.replicationSourceIdentifier != null) return false;
            if (this.s3Import != null ? !this.s3Import.equals(that.s3Import) : that.s3Import != null) return false;
            if (this.scalingConfiguration != null ? !this.scalingConfiguration.equals(that.scalingConfiguration) : that.scalingConfiguration != null) return false;
            if (this.skipFinalSnapshot != null ? !this.skipFinalSnapshot.equals(that.skipFinalSnapshot) : that.skipFinalSnapshot != null) return false;
            if (this.snapshotIdentifier != null ? !this.snapshotIdentifier.equals(that.snapshotIdentifier) : that.snapshotIdentifier != null) return false;
            if (this.sourceRegion != null ? !this.sourceRegion.equals(that.sourceRegion) : that.sourceRegion != null) return false;
            if (this.storageEncrypted != null ? !this.storageEncrypted.equals(that.storageEncrypted) : that.storageEncrypted != null) return false;
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
            int result = this.applyImmediately != null ? this.applyImmediately.hashCode() : 0;
            result = 31 * result + (this.availabilityZones != null ? this.availabilityZones.hashCode() : 0);
            result = 31 * result + (this.backtrackWindow != null ? this.backtrackWindow.hashCode() : 0);
            result = 31 * result + (this.backupRetentionPeriod != null ? this.backupRetentionPeriod.hashCode() : 0);
            result = 31 * result + (this.clusterIdentifier != null ? this.clusterIdentifier.hashCode() : 0);
            result = 31 * result + (this.clusterIdentifierPrefix != null ? this.clusterIdentifierPrefix.hashCode() : 0);
            result = 31 * result + (this.clusterMembers != null ? this.clusterMembers.hashCode() : 0);
            result = 31 * result + (this.copyTagsToSnapshot != null ? this.copyTagsToSnapshot.hashCode() : 0);
            result = 31 * result + (this.databaseName != null ? this.databaseName.hashCode() : 0);
            result = 31 * result + (this.dbClusterParameterGroupName != null ? this.dbClusterParameterGroupName.hashCode() : 0);
            result = 31 * result + (this.dbSubnetGroupName != null ? this.dbSubnetGroupName.hashCode() : 0);
            result = 31 * result + (this.deletionProtection != null ? this.deletionProtection.hashCode() : 0);
            result = 31 * result + (this.enabledCloudwatchLogsExports != null ? this.enabledCloudwatchLogsExports.hashCode() : 0);
            result = 31 * result + (this.enableHttpEndpoint != null ? this.enableHttpEndpoint.hashCode() : 0);
            result = 31 * result + (this.engine != null ? this.engine.hashCode() : 0);
            result = 31 * result + (this.engineMode != null ? this.engineMode.hashCode() : 0);
            result = 31 * result + (this.engineVersion != null ? this.engineVersion.hashCode() : 0);
            result = 31 * result + (this.finalSnapshotIdentifier != null ? this.finalSnapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.globalClusterIdentifier != null ? this.globalClusterIdentifier.hashCode() : 0);
            result = 31 * result + (this.iamDatabaseAuthenticationEnabled != null ? this.iamDatabaseAuthenticationEnabled.hashCode() : 0);
            result = 31 * result + (this.iamRoles != null ? this.iamRoles.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.masterPassword != null ? this.masterPassword.hashCode() : 0);
            result = 31 * result + (this.masterUsername != null ? this.masterUsername.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.preferredBackupWindow != null ? this.preferredBackupWindow.hashCode() : 0);
            result = 31 * result + (this.preferredMaintenanceWindow != null ? this.preferredMaintenanceWindow.hashCode() : 0);
            result = 31 * result + (this.replicationSourceIdentifier != null ? this.replicationSourceIdentifier.hashCode() : 0);
            result = 31 * result + (this.s3Import != null ? this.s3Import.hashCode() : 0);
            result = 31 * result + (this.scalingConfiguration != null ? this.scalingConfiguration.hashCode() : 0);
            result = 31 * result + (this.skipFinalSnapshot != null ? this.skipFinalSnapshot.hashCode() : 0);
            result = 31 * result + (this.snapshotIdentifier != null ? this.snapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.sourceRegion != null ? this.sourceRegion.hashCode() : 0);
            result = 31 * result + (this.storageEncrypted != null ? this.storageEncrypted.hashCode() : 0);
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
