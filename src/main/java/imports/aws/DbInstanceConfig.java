package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.417Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DbInstanceConfig")
@software.amazon.jsii.Jsii.Proxy(DbInstanceConfig.Jsii$Proxy.class)
public interface DbInstanceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceClass();

    default @org.jetbrains.annotations.Nullable java.lang.Number getAllocatedStorage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowMajorVersionUpgrade() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApplyImmediately() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoMinorVersionUpgrade() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBackupRetentionPeriod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBackupWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCaCertIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCharacterSetName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCopyTagsToSnapshot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDbSubnetGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteAutomatedBackups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeletionProtection() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDomain() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDomainIamRoleName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledCloudwatchLogsExports() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngine() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngineVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFinalSnapshotIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIamDatabaseAuthenticationEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIdentifierPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIops() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLicenseModel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaintenanceWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxAllocatedStorage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMonitoringInterval() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMonitoringRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMultiAz() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOptionGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getParameterGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPerformanceInsightsEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPerformanceInsightsKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPerformanceInsightsRetentionPeriod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPubliclyAccessible() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReplicateSourceDb() {
        return null;
    }

    /**
     * s3_import block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DbInstanceS3Import> getS3Import() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupNames() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipFinalSnapshot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStorageEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStorageType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DbInstanceTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTimezone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DbInstanceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DbInstanceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DbInstanceConfig> {
        private java.lang.String instanceClass;
        private java.lang.Number allocatedStorage;
        private java.lang.Boolean allowMajorVersionUpgrade;
        private java.lang.Boolean applyImmediately;
        private java.lang.Boolean autoMinorVersionUpgrade;
        private java.lang.String availabilityZone;
        private java.lang.Number backupRetentionPeriod;
        private java.lang.String backupWindow;
        private java.lang.String caCertIdentifier;
        private java.lang.String characterSetName;
        private java.lang.Boolean copyTagsToSnapshot;
        private java.lang.String dbSubnetGroupName;
        private java.lang.Boolean deleteAutomatedBackups;
        private java.lang.Boolean deletionProtection;
        private java.lang.String domain;
        private java.lang.String domainIamRoleName;
        private java.util.List<java.lang.String> enabledCloudwatchLogsExports;
        private java.lang.String engine;
        private java.lang.String engineVersion;
        private java.lang.String finalSnapshotIdentifier;
        private java.lang.Boolean iamDatabaseAuthenticationEnabled;
        private java.lang.String identifier;
        private java.lang.String identifierPrefix;
        private java.lang.Number iops;
        private java.lang.String kmsKeyId;
        private java.lang.String licenseModel;
        private java.lang.String maintenanceWindow;
        private java.lang.Number maxAllocatedStorage;
        private java.lang.Number monitoringInterval;
        private java.lang.String monitoringRoleArn;
        private java.lang.Boolean multiAz;
        private java.lang.String name;
        private java.lang.String optionGroupName;
        private java.lang.String parameterGroupName;
        private java.lang.String password;
        private java.lang.Boolean performanceInsightsEnabled;
        private java.lang.String performanceInsightsKmsKeyId;
        private java.lang.Number performanceInsightsRetentionPeriod;
        private java.lang.Number port;
        private java.lang.Boolean publiclyAccessible;
        private java.lang.String replicateSourceDb;
        private java.util.List<imports.aws.DbInstanceS3Import> s3Import;
        private java.util.List<java.lang.String> securityGroupNames;
        private java.lang.Boolean skipFinalSnapshot;
        private java.lang.String snapshotIdentifier;
        private java.lang.Boolean storageEncrypted;
        private java.lang.String storageType;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.DbInstanceTimeouts timeouts;
        private java.lang.String timezone;
        private java.lang.String username;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DbInstanceConfig#getInstanceClass}
         * @param instanceClass the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceClass(java.lang.String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getAllocatedStorage}
         * @param allocatedStorage the value to be set.
         * @return {@code this}
         */
        public Builder allocatedStorage(java.lang.Number allocatedStorage) {
            this.allocatedStorage = allocatedStorage;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getAllowMajorVersionUpgrade}
         * @param allowMajorVersionUpgrade the value to be set.
         * @return {@code this}
         */
        public Builder allowMajorVersionUpgrade(java.lang.Boolean allowMajorVersionUpgrade) {
            this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getApplyImmediately}
         * @param applyImmediately the value to be set.
         * @return {@code this}
         */
        public Builder applyImmediately(java.lang.Boolean applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getAutoMinorVersionUpgrade}
         * @param autoMinorVersionUpgrade the value to be set.
         * @return {@code this}
         */
        public Builder autoMinorVersionUpgrade(java.lang.Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getBackupRetentionPeriod}
         * @param backupRetentionPeriod the value to be set.
         * @return {@code this}
         */
        public Builder backupRetentionPeriod(java.lang.Number backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getBackupWindow}
         * @param backupWindow the value to be set.
         * @return {@code this}
         */
        public Builder backupWindow(java.lang.String backupWindow) {
            this.backupWindow = backupWindow;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getCaCertIdentifier}
         * @param caCertIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder caCertIdentifier(java.lang.String caCertIdentifier) {
            this.caCertIdentifier = caCertIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getCharacterSetName}
         * @param characterSetName the value to be set.
         * @return {@code this}
         */
        public Builder characterSetName(java.lang.String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getCopyTagsToSnapshot}
         * @param copyTagsToSnapshot the value to be set.
         * @return {@code this}
         */
        public Builder copyTagsToSnapshot(java.lang.Boolean copyTagsToSnapshot) {
            this.copyTagsToSnapshot = copyTagsToSnapshot;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getDbSubnetGroupName}
         * @param dbSubnetGroupName the value to be set.
         * @return {@code this}
         */
        public Builder dbSubnetGroupName(java.lang.String dbSubnetGroupName) {
            this.dbSubnetGroupName = dbSubnetGroupName;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getDeleteAutomatedBackups}
         * @param deleteAutomatedBackups the value to be set.
         * @return {@code this}
         */
        public Builder deleteAutomatedBackups(java.lang.Boolean deleteAutomatedBackups) {
            this.deleteAutomatedBackups = deleteAutomatedBackups;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getDeletionProtection}
         * @param deletionProtection the value to be set.
         * @return {@code this}
         */
        public Builder deletionProtection(java.lang.Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getDomain}
         * @param domain the value to be set.
         * @return {@code this}
         */
        public Builder domain(java.lang.String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getDomainIamRoleName}
         * @param domainIamRoleName the value to be set.
         * @return {@code this}
         */
        public Builder domainIamRoleName(java.lang.String domainIamRoleName) {
            this.domainIamRoleName = domainIamRoleName;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getEnabledCloudwatchLogsExports}
         * @param enabledCloudwatchLogsExports the value to be set.
         * @return {@code this}
         */
        public Builder enabledCloudwatchLogsExports(java.util.List<java.lang.String> enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getEngine}
         * @param engine the value to be set.
         * @return {@code this}
         */
        public Builder engine(java.lang.String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getEngineVersion}
         * @param engineVersion the value to be set.
         * @return {@code this}
         */
        public Builder engineVersion(java.lang.String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getFinalSnapshotIdentifier}
         * @param finalSnapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder finalSnapshotIdentifier(java.lang.String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getIamDatabaseAuthenticationEnabled}
         * @param iamDatabaseAuthenticationEnabled the value to be set.
         * @return {@code this}
         */
        public Builder iamDatabaseAuthenticationEnabled(java.lang.Boolean iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getIdentifier}
         * @param identifier the value to be set.
         * @return {@code this}
         */
        public Builder identifier(java.lang.String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getIdentifierPrefix}
         * @param identifierPrefix the value to be set.
         * @return {@code this}
         */
        public Builder identifierPrefix(java.lang.String identifierPrefix) {
            this.identifierPrefix = identifierPrefix;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getIops}
         * @param iops the value to be set.
         * @return {@code this}
         */
        public Builder iops(java.lang.Number iops) {
            this.iops = iops;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getLicenseModel}
         * @param licenseModel the value to be set.
         * @return {@code this}
         */
        public Builder licenseModel(java.lang.String licenseModel) {
            this.licenseModel = licenseModel;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getMaintenanceWindow}
         * @param maintenanceWindow the value to be set.
         * @return {@code this}
         */
        public Builder maintenanceWindow(java.lang.String maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getMaxAllocatedStorage}
         * @param maxAllocatedStorage the value to be set.
         * @return {@code this}
         */
        public Builder maxAllocatedStorage(java.lang.Number maxAllocatedStorage) {
            this.maxAllocatedStorage = maxAllocatedStorage;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getMonitoringInterval}
         * @param monitoringInterval the value to be set.
         * @return {@code this}
         */
        public Builder monitoringInterval(java.lang.Number monitoringInterval) {
            this.monitoringInterval = monitoringInterval;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getMonitoringRoleArn}
         * @param monitoringRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder monitoringRoleArn(java.lang.String monitoringRoleArn) {
            this.monitoringRoleArn = monitoringRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getMultiAz}
         * @param multiAz the value to be set.
         * @return {@code this}
         */
        public Builder multiAz(java.lang.Boolean multiAz) {
            this.multiAz = multiAz;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getOptionGroupName}
         * @param optionGroupName the value to be set.
         * @return {@code this}
         */
        public Builder optionGroupName(java.lang.String optionGroupName) {
            this.optionGroupName = optionGroupName;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getParameterGroupName}
         * @param parameterGroupName the value to be set.
         * @return {@code this}
         */
        public Builder parameterGroupName(java.lang.String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getPassword}
         * @param password the value to be set.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getPerformanceInsightsEnabled}
         * @param performanceInsightsEnabled the value to be set.
         * @return {@code this}
         */
        public Builder performanceInsightsEnabled(java.lang.Boolean performanceInsightsEnabled) {
            this.performanceInsightsEnabled = performanceInsightsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getPerformanceInsightsKmsKeyId}
         * @param performanceInsightsKmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder performanceInsightsKmsKeyId(java.lang.String performanceInsightsKmsKeyId) {
            this.performanceInsightsKmsKeyId = performanceInsightsKmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getPerformanceInsightsRetentionPeriod}
         * @param performanceInsightsRetentionPeriod the value to be set.
         * @return {@code this}
         */
        public Builder performanceInsightsRetentionPeriod(java.lang.Number performanceInsightsRetentionPeriod) {
            this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getPubliclyAccessible}
         * @param publiclyAccessible the value to be set.
         * @return {@code this}
         */
        public Builder publiclyAccessible(java.lang.Boolean publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getReplicateSourceDb}
         * @param replicateSourceDb the value to be set.
         * @return {@code this}
         */
        public Builder replicateSourceDb(java.lang.String replicateSourceDb) {
            this.replicateSourceDb = replicateSourceDb;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getS3Import}
         * @param s3Import s3_import block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Import(java.util.List<? extends imports.aws.DbInstanceS3Import> s3Import) {
            this.s3Import = (java.util.List<imports.aws.DbInstanceS3Import>)s3Import;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getSecurityGroupNames}
         * @param securityGroupNames the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupNames(java.util.List<java.lang.String> securityGroupNames) {
            this.securityGroupNames = securityGroupNames;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getSkipFinalSnapshot}
         * @param skipFinalSnapshot the value to be set.
         * @return {@code this}
         */
        public Builder skipFinalSnapshot(java.lang.Boolean skipFinalSnapshot) {
            this.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getSnapshotIdentifier}
         * @param snapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder snapshotIdentifier(java.lang.String snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getStorageEncrypted}
         * @param storageEncrypted the value to be set.
         * @return {@code this}
         */
        public Builder storageEncrypted(java.lang.Boolean storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getStorageType}
         * @param storageType the value to be set.
         * @return {@code this}
         */
        public Builder storageType(java.lang.String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DbInstanceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getTimezone}
         * @param timezone the value to be set.
         * @return {@code this}
         */
        public Builder timezone(java.lang.String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getUsername}
         * @param username the value to be set.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getDependsOn}
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
         * Sets the value of {@link DbInstanceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceConfig#getProvider}
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
         * @return a new instance of {@link DbInstanceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DbInstanceConfig build() {
            return new Jsii$Proxy(instanceClass, allocatedStorage, allowMajorVersionUpgrade, applyImmediately, autoMinorVersionUpgrade, availabilityZone, backupRetentionPeriod, backupWindow, caCertIdentifier, characterSetName, copyTagsToSnapshot, dbSubnetGroupName, deleteAutomatedBackups, deletionProtection, domain, domainIamRoleName, enabledCloudwatchLogsExports, engine, engineVersion, finalSnapshotIdentifier, iamDatabaseAuthenticationEnabled, identifier, identifierPrefix, iops, kmsKeyId, licenseModel, maintenanceWindow, maxAllocatedStorage, monitoringInterval, monitoringRoleArn, multiAz, name, optionGroupName, parameterGroupName, password, performanceInsightsEnabled, performanceInsightsKmsKeyId, performanceInsightsRetentionPeriod, port, publiclyAccessible, replicateSourceDb, s3Import, securityGroupNames, skipFinalSnapshot, snapshotIdentifier, storageEncrypted, storageType, tags, timeouts, timezone, username, vpcSecurityGroupIds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DbInstanceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DbInstanceConfig {
        private final java.lang.String instanceClass;
        private final java.lang.Number allocatedStorage;
        private final java.lang.Boolean allowMajorVersionUpgrade;
        private final java.lang.Boolean applyImmediately;
        private final java.lang.Boolean autoMinorVersionUpgrade;
        private final java.lang.String availabilityZone;
        private final java.lang.Number backupRetentionPeriod;
        private final java.lang.String backupWindow;
        private final java.lang.String caCertIdentifier;
        private final java.lang.String characterSetName;
        private final java.lang.Boolean copyTagsToSnapshot;
        private final java.lang.String dbSubnetGroupName;
        private final java.lang.Boolean deleteAutomatedBackups;
        private final java.lang.Boolean deletionProtection;
        private final java.lang.String domain;
        private final java.lang.String domainIamRoleName;
        private final java.util.List<java.lang.String> enabledCloudwatchLogsExports;
        private final java.lang.String engine;
        private final java.lang.String engineVersion;
        private final java.lang.String finalSnapshotIdentifier;
        private final java.lang.Boolean iamDatabaseAuthenticationEnabled;
        private final java.lang.String identifier;
        private final java.lang.String identifierPrefix;
        private final java.lang.Number iops;
        private final java.lang.String kmsKeyId;
        private final java.lang.String licenseModel;
        private final java.lang.String maintenanceWindow;
        private final java.lang.Number maxAllocatedStorage;
        private final java.lang.Number monitoringInterval;
        private final java.lang.String monitoringRoleArn;
        private final java.lang.Boolean multiAz;
        private final java.lang.String name;
        private final java.lang.String optionGroupName;
        private final java.lang.String parameterGroupName;
        private final java.lang.String password;
        private final java.lang.Boolean performanceInsightsEnabled;
        private final java.lang.String performanceInsightsKmsKeyId;
        private final java.lang.Number performanceInsightsRetentionPeriod;
        private final java.lang.Number port;
        private final java.lang.Boolean publiclyAccessible;
        private final java.lang.String replicateSourceDb;
        private final java.util.List<imports.aws.DbInstanceS3Import> s3Import;
        private final java.util.List<java.lang.String> securityGroupNames;
        private final java.lang.Boolean skipFinalSnapshot;
        private final java.lang.String snapshotIdentifier;
        private final java.lang.Boolean storageEncrypted;
        private final java.lang.String storageType;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.DbInstanceTimeouts timeouts;
        private final java.lang.String timezone;
        private final java.lang.String username;
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
            this.instanceClass = software.amazon.jsii.Kernel.get(this, "instanceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allocatedStorage = software.amazon.jsii.Kernel.get(this, "allocatedStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.allowMajorVersionUpgrade = software.amazon.jsii.Kernel.get(this, "allowMajorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.applyImmediately = software.amazon.jsii.Kernel.get(this, "applyImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoMinorVersionUpgrade = software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.backupRetentionPeriod = software.amazon.jsii.Kernel.get(this, "backupRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.backupWindow = software.amazon.jsii.Kernel.get(this, "backupWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.caCertIdentifier = software.amazon.jsii.Kernel.get(this, "caCertIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.characterSetName = software.amazon.jsii.Kernel.get(this, "characterSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.copyTagsToSnapshot = software.amazon.jsii.Kernel.get(this, "copyTagsToSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.dbSubnetGroupName = software.amazon.jsii.Kernel.get(this, "dbSubnetGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deleteAutomatedBackups = software.amazon.jsii.Kernel.get(this, "deleteAutomatedBackups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.deletionProtection = software.amazon.jsii.Kernel.get(this, "deletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.domain = software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.domainIamRoleName = software.amazon.jsii.Kernel.get(this, "domainIamRoleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabledCloudwatchLogsExports = software.amazon.jsii.Kernel.get(this, "enabledCloudwatchLogsExports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.engine = software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineVersion = software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.finalSnapshotIdentifier = software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamDatabaseAuthenticationEnabled = software.amazon.jsii.Kernel.get(this, "iamDatabaseAuthenticationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.identifier = software.amazon.jsii.Kernel.get(this, "identifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identifierPrefix = software.amazon.jsii.Kernel.get(this, "identifierPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iops = software.amazon.jsii.Kernel.get(this, "iops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.licenseModel = software.amazon.jsii.Kernel.get(this, "licenseModel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maintenanceWindow = software.amazon.jsii.Kernel.get(this, "maintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxAllocatedStorage = software.amazon.jsii.Kernel.get(this, "maxAllocatedStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.monitoringInterval = software.amazon.jsii.Kernel.get(this, "monitoringInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.monitoringRoleArn = software.amazon.jsii.Kernel.get(this, "monitoringRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.multiAz = software.amazon.jsii.Kernel.get(this, "multiAz", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.optionGroupName = software.amazon.jsii.Kernel.get(this, "optionGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameterGroupName = software.amazon.jsii.Kernel.get(this, "parameterGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.performanceInsightsEnabled = software.amazon.jsii.Kernel.get(this, "performanceInsightsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.performanceInsightsKmsKeyId = software.amazon.jsii.Kernel.get(this, "performanceInsightsKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.performanceInsightsRetentionPeriod = software.amazon.jsii.Kernel.get(this, "performanceInsightsRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.publiclyAccessible = software.amazon.jsii.Kernel.get(this, "publiclyAccessible", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.replicateSourceDb = software.amazon.jsii.Kernel.get(this, "replicateSourceDb", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Import = software.amazon.jsii.Kernel.get(this, "s3Import", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DbInstanceS3Import.class)));
            this.securityGroupNames = software.amazon.jsii.Kernel.get(this, "securityGroupNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.skipFinalSnapshot = software.amazon.jsii.Kernel.get(this, "skipFinalSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.snapshotIdentifier = software.amazon.jsii.Kernel.get(this, "snapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageEncrypted = software.amazon.jsii.Kernel.get(this, "storageEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.storageType = software.amazon.jsii.Kernel.get(this, "storageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DbInstanceTimeouts.class));
            this.timezone = software.amazon.jsii.Kernel.get(this, "timezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String instanceClass, final java.lang.Number allocatedStorage, final java.lang.Boolean allowMajorVersionUpgrade, final java.lang.Boolean applyImmediately, final java.lang.Boolean autoMinorVersionUpgrade, final java.lang.String availabilityZone, final java.lang.Number backupRetentionPeriod, final java.lang.String backupWindow, final java.lang.String caCertIdentifier, final java.lang.String characterSetName, final java.lang.Boolean copyTagsToSnapshot, final java.lang.String dbSubnetGroupName, final java.lang.Boolean deleteAutomatedBackups, final java.lang.Boolean deletionProtection, final java.lang.String domain, final java.lang.String domainIamRoleName, final java.util.List<java.lang.String> enabledCloudwatchLogsExports, final java.lang.String engine, final java.lang.String engineVersion, final java.lang.String finalSnapshotIdentifier, final java.lang.Boolean iamDatabaseAuthenticationEnabled, final java.lang.String identifier, final java.lang.String identifierPrefix, final java.lang.Number iops, final java.lang.String kmsKeyId, final java.lang.String licenseModel, final java.lang.String maintenanceWindow, final java.lang.Number maxAllocatedStorage, final java.lang.Number monitoringInterval, final java.lang.String monitoringRoleArn, final java.lang.Boolean multiAz, final java.lang.String name, final java.lang.String optionGroupName, final java.lang.String parameterGroupName, final java.lang.String password, final java.lang.Boolean performanceInsightsEnabled, final java.lang.String performanceInsightsKmsKeyId, final java.lang.Number performanceInsightsRetentionPeriod, final java.lang.Number port, final java.lang.Boolean publiclyAccessible, final java.lang.String replicateSourceDb, final java.util.List<? extends imports.aws.DbInstanceS3Import> s3Import, final java.util.List<java.lang.String> securityGroupNames, final java.lang.Boolean skipFinalSnapshot, final java.lang.String snapshotIdentifier, final java.lang.Boolean storageEncrypted, final java.lang.String storageType, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.DbInstanceTimeouts timeouts, final java.lang.String timezone, final java.lang.String username, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instanceClass = java.util.Objects.requireNonNull(instanceClass, "instanceClass is required");
            this.allocatedStorage = allocatedStorage;
            this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
            this.applyImmediately = applyImmediately;
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            this.availabilityZone = availabilityZone;
            this.backupRetentionPeriod = backupRetentionPeriod;
            this.backupWindow = backupWindow;
            this.caCertIdentifier = caCertIdentifier;
            this.characterSetName = characterSetName;
            this.copyTagsToSnapshot = copyTagsToSnapshot;
            this.dbSubnetGroupName = dbSubnetGroupName;
            this.deleteAutomatedBackups = deleteAutomatedBackups;
            this.deletionProtection = deletionProtection;
            this.domain = domain;
            this.domainIamRoleName = domainIamRoleName;
            this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
            this.engine = engine;
            this.engineVersion = engineVersion;
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            this.identifier = identifier;
            this.identifierPrefix = identifierPrefix;
            this.iops = iops;
            this.kmsKeyId = kmsKeyId;
            this.licenseModel = licenseModel;
            this.maintenanceWindow = maintenanceWindow;
            this.maxAllocatedStorage = maxAllocatedStorage;
            this.monitoringInterval = monitoringInterval;
            this.monitoringRoleArn = monitoringRoleArn;
            this.multiAz = multiAz;
            this.name = name;
            this.optionGroupName = optionGroupName;
            this.parameterGroupName = parameterGroupName;
            this.password = password;
            this.performanceInsightsEnabled = performanceInsightsEnabled;
            this.performanceInsightsKmsKeyId = performanceInsightsKmsKeyId;
            this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
            this.port = port;
            this.publiclyAccessible = publiclyAccessible;
            this.replicateSourceDb = replicateSourceDb;
            this.s3Import = (java.util.List<imports.aws.DbInstanceS3Import>)s3Import;
            this.securityGroupNames = securityGroupNames;
            this.skipFinalSnapshot = skipFinalSnapshot;
            this.snapshotIdentifier = snapshotIdentifier;
            this.storageEncrypted = storageEncrypted;
            this.storageType = storageType;
            this.tags = tags;
            this.timeouts = timeouts;
            this.timezone = timezone;
            this.username = username;
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getInstanceClass() {
            return this.instanceClass;
        }

        @Override
        public final java.lang.Number getAllocatedStorage() {
            return this.allocatedStorage;
        }

        @Override
        public final java.lang.Boolean getAllowMajorVersionUpgrade() {
            return this.allowMajorVersionUpgrade;
        }

        @Override
        public final java.lang.Boolean getApplyImmediately() {
            return this.applyImmediately;
        }

        @Override
        public final java.lang.Boolean getAutoMinorVersionUpgrade() {
            return this.autoMinorVersionUpgrade;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.Number getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        @Override
        public final java.lang.String getBackupWindow() {
            return this.backupWindow;
        }

        @Override
        public final java.lang.String getCaCertIdentifier() {
            return this.caCertIdentifier;
        }

        @Override
        public final java.lang.String getCharacterSetName() {
            return this.characterSetName;
        }

        @Override
        public final java.lang.Boolean getCopyTagsToSnapshot() {
            return this.copyTagsToSnapshot;
        }

        @Override
        public final java.lang.String getDbSubnetGroupName() {
            return this.dbSubnetGroupName;
        }

        @Override
        public final java.lang.Boolean getDeleteAutomatedBackups() {
            return this.deleteAutomatedBackups;
        }

        @Override
        public final java.lang.Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        @Override
        public final java.lang.String getDomain() {
            return this.domain;
        }

        @Override
        public final java.lang.String getDomainIamRoleName() {
            return this.domainIamRoleName;
        }

        @Override
        public final java.util.List<java.lang.String> getEnabledCloudwatchLogsExports() {
            return this.enabledCloudwatchLogsExports;
        }

        @Override
        public final java.lang.String getEngine() {
            return this.engine;
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
        public final java.lang.Boolean getIamDatabaseAuthenticationEnabled() {
            return this.iamDatabaseAuthenticationEnabled;
        }

        @Override
        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        @Override
        public final java.lang.String getIdentifierPrefix() {
            return this.identifierPrefix;
        }

        @Override
        public final java.lang.Number getIops() {
            return this.iops;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.String getLicenseModel() {
            return this.licenseModel;
        }

        @Override
        public final java.lang.String getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

        @Override
        public final java.lang.Number getMaxAllocatedStorage() {
            return this.maxAllocatedStorage;
        }

        @Override
        public final java.lang.Number getMonitoringInterval() {
            return this.monitoringInterval;
        }

        @Override
        public final java.lang.String getMonitoringRoleArn() {
            return this.monitoringRoleArn;
        }

        @Override
        public final java.lang.Boolean getMultiAz() {
            return this.multiAz;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getOptionGroupName() {
            return this.optionGroupName;
        }

        @Override
        public final java.lang.String getParameterGroupName() {
            return this.parameterGroupName;
        }

        @Override
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.Boolean getPerformanceInsightsEnabled() {
            return this.performanceInsightsEnabled;
        }

        @Override
        public final java.lang.String getPerformanceInsightsKmsKeyId() {
            return this.performanceInsightsKmsKeyId;
        }

        @Override
        public final java.lang.Number getPerformanceInsightsRetentionPeriod() {
            return this.performanceInsightsRetentionPeriod;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.Boolean getPubliclyAccessible() {
            return this.publiclyAccessible;
        }

        @Override
        public final java.lang.String getReplicateSourceDb() {
            return this.replicateSourceDb;
        }

        @Override
        public final java.util.List<imports.aws.DbInstanceS3Import> getS3Import() {
            return this.s3Import;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupNames() {
            return this.securityGroupNames;
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
        public final java.lang.Boolean getStorageEncrypted() {
            return this.storageEncrypted;
        }

        @Override
        public final java.lang.String getStorageType() {
            return this.storageType;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.DbInstanceTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getTimezone() {
            return this.timezone;
        }

        @Override
        public final java.lang.String getUsername() {
            return this.username;
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

            data.set("instanceClass", om.valueToTree(this.getInstanceClass()));
            if (this.getAllocatedStorage() != null) {
                data.set("allocatedStorage", om.valueToTree(this.getAllocatedStorage()));
            }
            if (this.getAllowMajorVersionUpgrade() != null) {
                data.set("allowMajorVersionUpgrade", om.valueToTree(this.getAllowMajorVersionUpgrade()));
            }
            if (this.getApplyImmediately() != null) {
                data.set("applyImmediately", om.valueToTree(this.getApplyImmediately()));
            }
            if (this.getAutoMinorVersionUpgrade() != null) {
                data.set("autoMinorVersionUpgrade", om.valueToTree(this.getAutoMinorVersionUpgrade()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getBackupRetentionPeriod() != null) {
                data.set("backupRetentionPeriod", om.valueToTree(this.getBackupRetentionPeriod()));
            }
            if (this.getBackupWindow() != null) {
                data.set("backupWindow", om.valueToTree(this.getBackupWindow()));
            }
            if (this.getCaCertIdentifier() != null) {
                data.set("caCertIdentifier", om.valueToTree(this.getCaCertIdentifier()));
            }
            if (this.getCharacterSetName() != null) {
                data.set("characterSetName", om.valueToTree(this.getCharacterSetName()));
            }
            if (this.getCopyTagsToSnapshot() != null) {
                data.set("copyTagsToSnapshot", om.valueToTree(this.getCopyTagsToSnapshot()));
            }
            if (this.getDbSubnetGroupName() != null) {
                data.set("dbSubnetGroupName", om.valueToTree(this.getDbSubnetGroupName()));
            }
            if (this.getDeleteAutomatedBackups() != null) {
                data.set("deleteAutomatedBackups", om.valueToTree(this.getDeleteAutomatedBackups()));
            }
            if (this.getDeletionProtection() != null) {
                data.set("deletionProtection", om.valueToTree(this.getDeletionProtection()));
            }
            if (this.getDomain() != null) {
                data.set("domain", om.valueToTree(this.getDomain()));
            }
            if (this.getDomainIamRoleName() != null) {
                data.set("domainIamRoleName", om.valueToTree(this.getDomainIamRoleName()));
            }
            if (this.getEnabledCloudwatchLogsExports() != null) {
                data.set("enabledCloudwatchLogsExports", om.valueToTree(this.getEnabledCloudwatchLogsExports()));
            }
            if (this.getEngine() != null) {
                data.set("engine", om.valueToTree(this.getEngine()));
            }
            if (this.getEngineVersion() != null) {
                data.set("engineVersion", om.valueToTree(this.getEngineVersion()));
            }
            if (this.getFinalSnapshotIdentifier() != null) {
                data.set("finalSnapshotIdentifier", om.valueToTree(this.getFinalSnapshotIdentifier()));
            }
            if (this.getIamDatabaseAuthenticationEnabled() != null) {
                data.set("iamDatabaseAuthenticationEnabled", om.valueToTree(this.getIamDatabaseAuthenticationEnabled()));
            }
            if (this.getIdentifier() != null) {
                data.set("identifier", om.valueToTree(this.getIdentifier()));
            }
            if (this.getIdentifierPrefix() != null) {
                data.set("identifierPrefix", om.valueToTree(this.getIdentifierPrefix()));
            }
            if (this.getIops() != null) {
                data.set("iops", om.valueToTree(this.getIops()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getLicenseModel() != null) {
                data.set("licenseModel", om.valueToTree(this.getLicenseModel()));
            }
            if (this.getMaintenanceWindow() != null) {
                data.set("maintenanceWindow", om.valueToTree(this.getMaintenanceWindow()));
            }
            if (this.getMaxAllocatedStorage() != null) {
                data.set("maxAllocatedStorage", om.valueToTree(this.getMaxAllocatedStorage()));
            }
            if (this.getMonitoringInterval() != null) {
                data.set("monitoringInterval", om.valueToTree(this.getMonitoringInterval()));
            }
            if (this.getMonitoringRoleArn() != null) {
                data.set("monitoringRoleArn", om.valueToTree(this.getMonitoringRoleArn()));
            }
            if (this.getMultiAz() != null) {
                data.set("multiAz", om.valueToTree(this.getMultiAz()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptionGroupName() != null) {
                data.set("optionGroupName", om.valueToTree(this.getOptionGroupName()));
            }
            if (this.getParameterGroupName() != null) {
                data.set("parameterGroupName", om.valueToTree(this.getParameterGroupName()));
            }
            if (this.getPassword() != null) {
                data.set("password", om.valueToTree(this.getPassword()));
            }
            if (this.getPerformanceInsightsEnabled() != null) {
                data.set("performanceInsightsEnabled", om.valueToTree(this.getPerformanceInsightsEnabled()));
            }
            if (this.getPerformanceInsightsKmsKeyId() != null) {
                data.set("performanceInsightsKmsKeyId", om.valueToTree(this.getPerformanceInsightsKmsKeyId()));
            }
            if (this.getPerformanceInsightsRetentionPeriod() != null) {
                data.set("performanceInsightsRetentionPeriod", om.valueToTree(this.getPerformanceInsightsRetentionPeriod()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getPubliclyAccessible() != null) {
                data.set("publiclyAccessible", om.valueToTree(this.getPubliclyAccessible()));
            }
            if (this.getReplicateSourceDb() != null) {
                data.set("replicateSourceDb", om.valueToTree(this.getReplicateSourceDb()));
            }
            if (this.getS3Import() != null) {
                data.set("s3Import", om.valueToTree(this.getS3Import()));
            }
            if (this.getSecurityGroupNames() != null) {
                data.set("securityGroupNames", om.valueToTree(this.getSecurityGroupNames()));
            }
            if (this.getSkipFinalSnapshot() != null) {
                data.set("skipFinalSnapshot", om.valueToTree(this.getSkipFinalSnapshot()));
            }
            if (this.getSnapshotIdentifier() != null) {
                data.set("snapshotIdentifier", om.valueToTree(this.getSnapshotIdentifier()));
            }
            if (this.getStorageEncrypted() != null) {
                data.set("storageEncrypted", om.valueToTree(this.getStorageEncrypted()));
            }
            if (this.getStorageType() != null) {
                data.set("storageType", om.valueToTree(this.getStorageType()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getTimezone() != null) {
                data.set("timezone", om.valueToTree(this.getTimezone()));
            }
            if (this.getUsername() != null) {
                data.set("username", om.valueToTree(this.getUsername()));
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
            struct.set("fqn", om.valueToTree("aws.DbInstanceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DbInstanceConfig.Jsii$Proxy that = (DbInstanceConfig.Jsii$Proxy) o;

            if (!instanceClass.equals(that.instanceClass)) return false;
            if (this.allocatedStorage != null ? !this.allocatedStorage.equals(that.allocatedStorage) : that.allocatedStorage != null) return false;
            if (this.allowMajorVersionUpgrade != null ? !this.allowMajorVersionUpgrade.equals(that.allowMajorVersionUpgrade) : that.allowMajorVersionUpgrade != null) return false;
            if (this.applyImmediately != null ? !this.applyImmediately.equals(that.applyImmediately) : that.applyImmediately != null) return false;
            if (this.autoMinorVersionUpgrade != null ? !this.autoMinorVersionUpgrade.equals(that.autoMinorVersionUpgrade) : that.autoMinorVersionUpgrade != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.backupRetentionPeriod != null ? !this.backupRetentionPeriod.equals(that.backupRetentionPeriod) : that.backupRetentionPeriod != null) return false;
            if (this.backupWindow != null ? !this.backupWindow.equals(that.backupWindow) : that.backupWindow != null) return false;
            if (this.caCertIdentifier != null ? !this.caCertIdentifier.equals(that.caCertIdentifier) : that.caCertIdentifier != null) return false;
            if (this.characterSetName != null ? !this.characterSetName.equals(that.characterSetName) : that.characterSetName != null) return false;
            if (this.copyTagsToSnapshot != null ? !this.copyTagsToSnapshot.equals(that.copyTagsToSnapshot) : that.copyTagsToSnapshot != null) return false;
            if (this.dbSubnetGroupName != null ? !this.dbSubnetGroupName.equals(that.dbSubnetGroupName) : that.dbSubnetGroupName != null) return false;
            if (this.deleteAutomatedBackups != null ? !this.deleteAutomatedBackups.equals(that.deleteAutomatedBackups) : that.deleteAutomatedBackups != null) return false;
            if (this.deletionProtection != null ? !this.deletionProtection.equals(that.deletionProtection) : that.deletionProtection != null) return false;
            if (this.domain != null ? !this.domain.equals(that.domain) : that.domain != null) return false;
            if (this.domainIamRoleName != null ? !this.domainIamRoleName.equals(that.domainIamRoleName) : that.domainIamRoleName != null) return false;
            if (this.enabledCloudwatchLogsExports != null ? !this.enabledCloudwatchLogsExports.equals(that.enabledCloudwatchLogsExports) : that.enabledCloudwatchLogsExports != null) return false;
            if (this.engine != null ? !this.engine.equals(that.engine) : that.engine != null) return false;
            if (this.engineVersion != null ? !this.engineVersion.equals(that.engineVersion) : that.engineVersion != null) return false;
            if (this.finalSnapshotIdentifier != null ? !this.finalSnapshotIdentifier.equals(that.finalSnapshotIdentifier) : that.finalSnapshotIdentifier != null) return false;
            if (this.iamDatabaseAuthenticationEnabled != null ? !this.iamDatabaseAuthenticationEnabled.equals(that.iamDatabaseAuthenticationEnabled) : that.iamDatabaseAuthenticationEnabled != null) return false;
            if (this.identifier != null ? !this.identifier.equals(that.identifier) : that.identifier != null) return false;
            if (this.identifierPrefix != null ? !this.identifierPrefix.equals(that.identifierPrefix) : that.identifierPrefix != null) return false;
            if (this.iops != null ? !this.iops.equals(that.iops) : that.iops != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.licenseModel != null ? !this.licenseModel.equals(that.licenseModel) : that.licenseModel != null) return false;
            if (this.maintenanceWindow != null ? !this.maintenanceWindow.equals(that.maintenanceWindow) : that.maintenanceWindow != null) return false;
            if (this.maxAllocatedStorage != null ? !this.maxAllocatedStorage.equals(that.maxAllocatedStorage) : that.maxAllocatedStorage != null) return false;
            if (this.monitoringInterval != null ? !this.monitoringInterval.equals(that.monitoringInterval) : that.monitoringInterval != null) return false;
            if (this.monitoringRoleArn != null ? !this.monitoringRoleArn.equals(that.monitoringRoleArn) : that.monitoringRoleArn != null) return false;
            if (this.multiAz != null ? !this.multiAz.equals(that.multiAz) : that.multiAz != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.optionGroupName != null ? !this.optionGroupName.equals(that.optionGroupName) : that.optionGroupName != null) return false;
            if (this.parameterGroupName != null ? !this.parameterGroupName.equals(that.parameterGroupName) : that.parameterGroupName != null) return false;
            if (this.password != null ? !this.password.equals(that.password) : that.password != null) return false;
            if (this.performanceInsightsEnabled != null ? !this.performanceInsightsEnabled.equals(that.performanceInsightsEnabled) : that.performanceInsightsEnabled != null) return false;
            if (this.performanceInsightsKmsKeyId != null ? !this.performanceInsightsKmsKeyId.equals(that.performanceInsightsKmsKeyId) : that.performanceInsightsKmsKeyId != null) return false;
            if (this.performanceInsightsRetentionPeriod != null ? !this.performanceInsightsRetentionPeriod.equals(that.performanceInsightsRetentionPeriod) : that.performanceInsightsRetentionPeriod != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.publiclyAccessible != null ? !this.publiclyAccessible.equals(that.publiclyAccessible) : that.publiclyAccessible != null) return false;
            if (this.replicateSourceDb != null ? !this.replicateSourceDb.equals(that.replicateSourceDb) : that.replicateSourceDb != null) return false;
            if (this.s3Import != null ? !this.s3Import.equals(that.s3Import) : that.s3Import != null) return false;
            if (this.securityGroupNames != null ? !this.securityGroupNames.equals(that.securityGroupNames) : that.securityGroupNames != null) return false;
            if (this.skipFinalSnapshot != null ? !this.skipFinalSnapshot.equals(that.skipFinalSnapshot) : that.skipFinalSnapshot != null) return false;
            if (this.snapshotIdentifier != null ? !this.snapshotIdentifier.equals(that.snapshotIdentifier) : that.snapshotIdentifier != null) return false;
            if (this.storageEncrypted != null ? !this.storageEncrypted.equals(that.storageEncrypted) : that.storageEncrypted != null) return false;
            if (this.storageType != null ? !this.storageType.equals(that.storageType) : that.storageType != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.timezone != null ? !this.timezone.equals(that.timezone) : that.timezone != null) return false;
            if (this.username != null ? !this.username.equals(that.username) : that.username != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instanceClass.hashCode();
            result = 31 * result + (this.allocatedStorage != null ? this.allocatedStorage.hashCode() : 0);
            result = 31 * result + (this.allowMajorVersionUpgrade != null ? this.allowMajorVersionUpgrade.hashCode() : 0);
            result = 31 * result + (this.applyImmediately != null ? this.applyImmediately.hashCode() : 0);
            result = 31 * result + (this.autoMinorVersionUpgrade != null ? this.autoMinorVersionUpgrade.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.backupRetentionPeriod != null ? this.backupRetentionPeriod.hashCode() : 0);
            result = 31 * result + (this.backupWindow != null ? this.backupWindow.hashCode() : 0);
            result = 31 * result + (this.caCertIdentifier != null ? this.caCertIdentifier.hashCode() : 0);
            result = 31 * result + (this.characterSetName != null ? this.characterSetName.hashCode() : 0);
            result = 31 * result + (this.copyTagsToSnapshot != null ? this.copyTagsToSnapshot.hashCode() : 0);
            result = 31 * result + (this.dbSubnetGroupName != null ? this.dbSubnetGroupName.hashCode() : 0);
            result = 31 * result + (this.deleteAutomatedBackups != null ? this.deleteAutomatedBackups.hashCode() : 0);
            result = 31 * result + (this.deletionProtection != null ? this.deletionProtection.hashCode() : 0);
            result = 31 * result + (this.domain != null ? this.domain.hashCode() : 0);
            result = 31 * result + (this.domainIamRoleName != null ? this.domainIamRoleName.hashCode() : 0);
            result = 31 * result + (this.enabledCloudwatchLogsExports != null ? this.enabledCloudwatchLogsExports.hashCode() : 0);
            result = 31 * result + (this.engine != null ? this.engine.hashCode() : 0);
            result = 31 * result + (this.engineVersion != null ? this.engineVersion.hashCode() : 0);
            result = 31 * result + (this.finalSnapshotIdentifier != null ? this.finalSnapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.iamDatabaseAuthenticationEnabled != null ? this.iamDatabaseAuthenticationEnabled.hashCode() : 0);
            result = 31 * result + (this.identifier != null ? this.identifier.hashCode() : 0);
            result = 31 * result + (this.identifierPrefix != null ? this.identifierPrefix.hashCode() : 0);
            result = 31 * result + (this.iops != null ? this.iops.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.licenseModel != null ? this.licenseModel.hashCode() : 0);
            result = 31 * result + (this.maintenanceWindow != null ? this.maintenanceWindow.hashCode() : 0);
            result = 31 * result + (this.maxAllocatedStorage != null ? this.maxAllocatedStorage.hashCode() : 0);
            result = 31 * result + (this.monitoringInterval != null ? this.monitoringInterval.hashCode() : 0);
            result = 31 * result + (this.monitoringRoleArn != null ? this.monitoringRoleArn.hashCode() : 0);
            result = 31 * result + (this.multiAz != null ? this.multiAz.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.optionGroupName != null ? this.optionGroupName.hashCode() : 0);
            result = 31 * result + (this.parameterGroupName != null ? this.parameterGroupName.hashCode() : 0);
            result = 31 * result + (this.password != null ? this.password.hashCode() : 0);
            result = 31 * result + (this.performanceInsightsEnabled != null ? this.performanceInsightsEnabled.hashCode() : 0);
            result = 31 * result + (this.performanceInsightsKmsKeyId != null ? this.performanceInsightsKmsKeyId.hashCode() : 0);
            result = 31 * result + (this.performanceInsightsRetentionPeriod != null ? this.performanceInsightsRetentionPeriod.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.publiclyAccessible != null ? this.publiclyAccessible.hashCode() : 0);
            result = 31 * result + (this.replicateSourceDb != null ? this.replicateSourceDb.hashCode() : 0);
            result = 31 * result + (this.s3Import != null ? this.s3Import.hashCode() : 0);
            result = 31 * result + (this.securityGroupNames != null ? this.securityGroupNames.hashCode() : 0);
            result = 31 * result + (this.skipFinalSnapshot != null ? this.skipFinalSnapshot.hashCode() : 0);
            result = 31 * result + (this.snapshotIdentifier != null ? this.snapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.storageEncrypted != null ? this.storageEncrypted.hashCode() : 0);
            result = 31 * result + (this.storageType != null ? this.storageType.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.timezone != null ? this.timezone.hashCode() : 0);
            result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
