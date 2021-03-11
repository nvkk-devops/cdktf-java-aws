package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.724Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.NeptuneClusterConfig")
@software.amazon.jsii.Jsii.Proxy(NeptuneClusterConfig.Jsii$Proxy.class)
public interface NeptuneClusterConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApplyImmediately() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAvailabilityZones() {
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

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeletionProtection() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnableCloudwatchLogsExports() {
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

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIamRoles() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNeptuneClusterParameterGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNeptuneSubnetGroupName() {
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

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipFinalSnapshot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotIdentifier() {
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
    default @org.jetbrains.annotations.Nullable imports.aws.NeptuneClusterTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NeptuneClusterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NeptuneClusterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NeptuneClusterConfig> {
        private java.lang.Boolean applyImmediately;
        private java.util.List<java.lang.String> availabilityZones;
        private java.lang.Number backupRetentionPeriod;
        private java.lang.String clusterIdentifier;
        private java.lang.String clusterIdentifierPrefix;
        private java.lang.Boolean deletionProtection;
        private java.util.List<java.lang.String> enableCloudwatchLogsExports;
        private java.lang.String engine;
        private java.lang.String engineVersion;
        private java.lang.String finalSnapshotIdentifier;
        private java.lang.Boolean iamDatabaseAuthenticationEnabled;
        private java.util.List<java.lang.String> iamRoles;
        private java.lang.String kmsKeyArn;
        private java.lang.String neptuneClusterParameterGroupName;
        private java.lang.String neptuneSubnetGroupName;
        private java.lang.Number port;
        private java.lang.String preferredBackupWindow;
        private java.lang.String preferredMaintenanceWindow;
        private java.lang.String replicationSourceIdentifier;
        private java.lang.Boolean skipFinalSnapshot;
        private java.lang.String snapshotIdentifier;
        private java.lang.Boolean storageEncrypted;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.NeptuneClusterTimeouts timeouts;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link NeptuneClusterConfig#getApplyImmediately}
         * @param applyImmediately the value to be set.
         * @return {@code this}
         */
        public Builder applyImmediately(java.lang.Boolean applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getAvailabilityZones}
         * @param availabilityZones the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZones(java.util.List<java.lang.String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getBackupRetentionPeriod}
         * @param backupRetentionPeriod the value to be set.
         * @return {@code this}
         */
        public Builder backupRetentionPeriod(java.lang.Number backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getClusterIdentifier}
         * @param clusterIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder clusterIdentifier(java.lang.String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getClusterIdentifierPrefix}
         * @param clusterIdentifierPrefix the value to be set.
         * @return {@code this}
         */
        public Builder clusterIdentifierPrefix(java.lang.String clusterIdentifierPrefix) {
            this.clusterIdentifierPrefix = clusterIdentifierPrefix;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getDeletionProtection}
         * @param deletionProtection the value to be set.
         * @return {@code this}
         */
        public Builder deletionProtection(java.lang.Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getEnableCloudwatchLogsExports}
         * @param enableCloudwatchLogsExports the value to be set.
         * @return {@code this}
         */
        public Builder enableCloudwatchLogsExports(java.util.List<java.lang.String> enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getEngine}
         * @param engine the value to be set.
         * @return {@code this}
         */
        public Builder engine(java.lang.String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getEngineVersion}
         * @param engineVersion the value to be set.
         * @return {@code this}
         */
        public Builder engineVersion(java.lang.String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getFinalSnapshotIdentifier}
         * @param finalSnapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder finalSnapshotIdentifier(java.lang.String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getIamDatabaseAuthenticationEnabled}
         * @param iamDatabaseAuthenticationEnabled the value to be set.
         * @return {@code this}
         */
        public Builder iamDatabaseAuthenticationEnabled(java.lang.Boolean iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getIamRoles}
         * @param iamRoles the value to be set.
         * @return {@code this}
         */
        public Builder iamRoles(java.util.List<java.lang.String> iamRoles) {
            this.iamRoles = iamRoles;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getNeptuneClusterParameterGroupName}
         * @param neptuneClusterParameterGroupName the value to be set.
         * @return {@code this}
         */
        public Builder neptuneClusterParameterGroupName(java.lang.String neptuneClusterParameterGroupName) {
            this.neptuneClusterParameterGroupName = neptuneClusterParameterGroupName;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getNeptuneSubnetGroupName}
         * @param neptuneSubnetGroupName the value to be set.
         * @return {@code this}
         */
        public Builder neptuneSubnetGroupName(java.lang.String neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = neptuneSubnetGroupName;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getPreferredBackupWindow}
         * @param preferredBackupWindow the value to be set.
         * @return {@code this}
         */
        public Builder preferredBackupWindow(java.lang.String preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getPreferredMaintenanceWindow}
         * @param preferredMaintenanceWindow the value to be set.
         * @return {@code this}
         */
        public Builder preferredMaintenanceWindow(java.lang.String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getReplicationSourceIdentifier}
         * @param replicationSourceIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder replicationSourceIdentifier(java.lang.String replicationSourceIdentifier) {
            this.replicationSourceIdentifier = replicationSourceIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getSkipFinalSnapshot}
         * @param skipFinalSnapshot the value to be set.
         * @return {@code this}
         */
        public Builder skipFinalSnapshot(java.lang.Boolean skipFinalSnapshot) {
            this.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getSnapshotIdentifier}
         * @param snapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder snapshotIdentifier(java.lang.String snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getStorageEncrypted}
         * @param storageEncrypted the value to be set.
         * @return {@code this}
         */
        public Builder storageEncrypted(java.lang.Boolean storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.NeptuneClusterTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getDependsOn}
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
         * Sets the value of {@link NeptuneClusterConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterConfig#getProvider}
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
         * @return a new instance of {@link NeptuneClusterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NeptuneClusterConfig build() {
            return new Jsii$Proxy(applyImmediately, availabilityZones, backupRetentionPeriod, clusterIdentifier, clusterIdentifierPrefix, deletionProtection, enableCloudwatchLogsExports, engine, engineVersion, finalSnapshotIdentifier, iamDatabaseAuthenticationEnabled, iamRoles, kmsKeyArn, neptuneClusterParameterGroupName, neptuneSubnetGroupName, port, preferredBackupWindow, preferredMaintenanceWindow, replicationSourceIdentifier, skipFinalSnapshot, snapshotIdentifier, storageEncrypted, tags, timeouts, vpcSecurityGroupIds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link NeptuneClusterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NeptuneClusterConfig {
        private final java.lang.Boolean applyImmediately;
        private final java.util.List<java.lang.String> availabilityZones;
        private final java.lang.Number backupRetentionPeriod;
        private final java.lang.String clusterIdentifier;
        private final java.lang.String clusterIdentifierPrefix;
        private final java.lang.Boolean deletionProtection;
        private final java.util.List<java.lang.String> enableCloudwatchLogsExports;
        private final java.lang.String engine;
        private final java.lang.String engineVersion;
        private final java.lang.String finalSnapshotIdentifier;
        private final java.lang.Boolean iamDatabaseAuthenticationEnabled;
        private final java.util.List<java.lang.String> iamRoles;
        private final java.lang.String kmsKeyArn;
        private final java.lang.String neptuneClusterParameterGroupName;
        private final java.lang.String neptuneSubnetGroupName;
        private final java.lang.Number port;
        private final java.lang.String preferredBackupWindow;
        private final java.lang.String preferredMaintenanceWindow;
        private final java.lang.String replicationSourceIdentifier;
        private final java.lang.Boolean skipFinalSnapshot;
        private final java.lang.String snapshotIdentifier;
        private final java.lang.Boolean storageEncrypted;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.NeptuneClusterTimeouts timeouts;
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
            this.backupRetentionPeriod = software.amazon.jsii.Kernel.get(this, "backupRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.clusterIdentifier = software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterIdentifierPrefix = software.amazon.jsii.Kernel.get(this, "clusterIdentifierPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deletionProtection = software.amazon.jsii.Kernel.get(this, "deletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableCloudwatchLogsExports = software.amazon.jsii.Kernel.get(this, "enableCloudwatchLogsExports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.engine = software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineVersion = software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.finalSnapshotIdentifier = software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamDatabaseAuthenticationEnabled = software.amazon.jsii.Kernel.get(this, "iamDatabaseAuthenticationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.iamRoles = software.amazon.jsii.Kernel.get(this, "iamRoles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.neptuneClusterParameterGroupName = software.amazon.jsii.Kernel.get(this, "neptuneClusterParameterGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.neptuneSubnetGroupName = software.amazon.jsii.Kernel.get(this, "neptuneSubnetGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.preferredBackupWindow = software.amazon.jsii.Kernel.get(this, "preferredBackupWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preferredMaintenanceWindow = software.amazon.jsii.Kernel.get(this, "preferredMaintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationSourceIdentifier = software.amazon.jsii.Kernel.get(this, "replicationSourceIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.skipFinalSnapshot = software.amazon.jsii.Kernel.get(this, "skipFinalSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.snapshotIdentifier = software.amazon.jsii.Kernel.get(this, "snapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageEncrypted = software.amazon.jsii.Kernel.get(this, "storageEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.NeptuneClusterTimeouts.class));
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
        protected Jsii$Proxy(final java.lang.Boolean applyImmediately, final java.util.List<java.lang.String> availabilityZones, final java.lang.Number backupRetentionPeriod, final java.lang.String clusterIdentifier, final java.lang.String clusterIdentifierPrefix, final java.lang.Boolean deletionProtection, final java.util.List<java.lang.String> enableCloudwatchLogsExports, final java.lang.String engine, final java.lang.String engineVersion, final java.lang.String finalSnapshotIdentifier, final java.lang.Boolean iamDatabaseAuthenticationEnabled, final java.util.List<java.lang.String> iamRoles, final java.lang.String kmsKeyArn, final java.lang.String neptuneClusterParameterGroupName, final java.lang.String neptuneSubnetGroupName, final java.lang.Number port, final java.lang.String preferredBackupWindow, final java.lang.String preferredMaintenanceWindow, final java.lang.String replicationSourceIdentifier, final java.lang.Boolean skipFinalSnapshot, final java.lang.String snapshotIdentifier, final java.lang.Boolean storageEncrypted, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.NeptuneClusterTimeouts timeouts, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.applyImmediately = applyImmediately;
            this.availabilityZones = availabilityZones;
            this.backupRetentionPeriod = backupRetentionPeriod;
            this.clusterIdentifier = clusterIdentifier;
            this.clusterIdentifierPrefix = clusterIdentifierPrefix;
            this.deletionProtection = deletionProtection;
            this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
            this.engine = engine;
            this.engineVersion = engineVersion;
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            this.iamRoles = iamRoles;
            this.kmsKeyArn = kmsKeyArn;
            this.neptuneClusterParameterGroupName = neptuneClusterParameterGroupName;
            this.neptuneSubnetGroupName = neptuneSubnetGroupName;
            this.port = port;
            this.preferredBackupWindow = preferredBackupWindow;
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            this.replicationSourceIdentifier = replicationSourceIdentifier;
            this.skipFinalSnapshot = skipFinalSnapshot;
            this.snapshotIdentifier = snapshotIdentifier;
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
        public final java.lang.Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        @Override
        public final java.util.List<java.lang.String> getEnableCloudwatchLogsExports() {
            return this.enableCloudwatchLogsExports;
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
        public final java.util.List<java.lang.String> getIamRoles() {
            return this.iamRoles;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.lang.String getNeptuneClusterParameterGroupName() {
            return this.neptuneClusterParameterGroupName;
        }

        @Override
        public final java.lang.String getNeptuneSubnetGroupName() {
            return this.neptuneSubnetGroupName;
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
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.NeptuneClusterTimeouts getTimeouts() {
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
            if (this.getBackupRetentionPeriod() != null) {
                data.set("backupRetentionPeriod", om.valueToTree(this.getBackupRetentionPeriod()));
            }
            if (this.getClusterIdentifier() != null) {
                data.set("clusterIdentifier", om.valueToTree(this.getClusterIdentifier()));
            }
            if (this.getClusterIdentifierPrefix() != null) {
                data.set("clusterIdentifierPrefix", om.valueToTree(this.getClusterIdentifierPrefix()));
            }
            if (this.getDeletionProtection() != null) {
                data.set("deletionProtection", om.valueToTree(this.getDeletionProtection()));
            }
            if (this.getEnableCloudwatchLogsExports() != null) {
                data.set("enableCloudwatchLogsExports", om.valueToTree(this.getEnableCloudwatchLogsExports()));
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
            if (this.getIamRoles() != null) {
                data.set("iamRoles", om.valueToTree(this.getIamRoles()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getNeptuneClusterParameterGroupName() != null) {
                data.set("neptuneClusterParameterGroupName", om.valueToTree(this.getNeptuneClusterParameterGroupName()));
            }
            if (this.getNeptuneSubnetGroupName() != null) {
                data.set("neptuneSubnetGroupName", om.valueToTree(this.getNeptuneSubnetGroupName()));
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
            if (this.getSkipFinalSnapshot() != null) {
                data.set("skipFinalSnapshot", om.valueToTree(this.getSkipFinalSnapshot()));
            }
            if (this.getSnapshotIdentifier() != null) {
                data.set("snapshotIdentifier", om.valueToTree(this.getSnapshotIdentifier()));
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
            struct.set("fqn", om.valueToTree("aws.NeptuneClusterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NeptuneClusterConfig.Jsii$Proxy that = (NeptuneClusterConfig.Jsii$Proxy) o;

            if (this.applyImmediately != null ? !this.applyImmediately.equals(that.applyImmediately) : that.applyImmediately != null) return false;
            if (this.availabilityZones != null ? !this.availabilityZones.equals(that.availabilityZones) : that.availabilityZones != null) return false;
            if (this.backupRetentionPeriod != null ? !this.backupRetentionPeriod.equals(that.backupRetentionPeriod) : that.backupRetentionPeriod != null) return false;
            if (this.clusterIdentifier != null ? !this.clusterIdentifier.equals(that.clusterIdentifier) : that.clusterIdentifier != null) return false;
            if (this.clusterIdentifierPrefix != null ? !this.clusterIdentifierPrefix.equals(that.clusterIdentifierPrefix) : that.clusterIdentifierPrefix != null) return false;
            if (this.deletionProtection != null ? !this.deletionProtection.equals(that.deletionProtection) : that.deletionProtection != null) return false;
            if (this.enableCloudwatchLogsExports != null ? !this.enableCloudwatchLogsExports.equals(that.enableCloudwatchLogsExports) : that.enableCloudwatchLogsExports != null) return false;
            if (this.engine != null ? !this.engine.equals(that.engine) : that.engine != null) return false;
            if (this.engineVersion != null ? !this.engineVersion.equals(that.engineVersion) : that.engineVersion != null) return false;
            if (this.finalSnapshotIdentifier != null ? !this.finalSnapshotIdentifier.equals(that.finalSnapshotIdentifier) : that.finalSnapshotIdentifier != null) return false;
            if (this.iamDatabaseAuthenticationEnabled != null ? !this.iamDatabaseAuthenticationEnabled.equals(that.iamDatabaseAuthenticationEnabled) : that.iamDatabaseAuthenticationEnabled != null) return false;
            if (this.iamRoles != null ? !this.iamRoles.equals(that.iamRoles) : that.iamRoles != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.neptuneClusterParameterGroupName != null ? !this.neptuneClusterParameterGroupName.equals(that.neptuneClusterParameterGroupName) : that.neptuneClusterParameterGroupName != null) return false;
            if (this.neptuneSubnetGroupName != null ? !this.neptuneSubnetGroupName.equals(that.neptuneSubnetGroupName) : that.neptuneSubnetGroupName != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.preferredBackupWindow != null ? !this.preferredBackupWindow.equals(that.preferredBackupWindow) : that.preferredBackupWindow != null) return false;
            if (this.preferredMaintenanceWindow != null ? !this.preferredMaintenanceWindow.equals(that.preferredMaintenanceWindow) : that.preferredMaintenanceWindow != null) return false;
            if (this.replicationSourceIdentifier != null ? !this.replicationSourceIdentifier.equals(that.replicationSourceIdentifier) : that.replicationSourceIdentifier != null) return false;
            if (this.skipFinalSnapshot != null ? !this.skipFinalSnapshot.equals(that.skipFinalSnapshot) : that.skipFinalSnapshot != null) return false;
            if (this.snapshotIdentifier != null ? !this.snapshotIdentifier.equals(that.snapshotIdentifier) : that.snapshotIdentifier != null) return false;
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
            result = 31 * result + (this.backupRetentionPeriod != null ? this.backupRetentionPeriod.hashCode() : 0);
            result = 31 * result + (this.clusterIdentifier != null ? this.clusterIdentifier.hashCode() : 0);
            result = 31 * result + (this.clusterIdentifierPrefix != null ? this.clusterIdentifierPrefix.hashCode() : 0);
            result = 31 * result + (this.deletionProtection != null ? this.deletionProtection.hashCode() : 0);
            result = 31 * result + (this.enableCloudwatchLogsExports != null ? this.enableCloudwatchLogsExports.hashCode() : 0);
            result = 31 * result + (this.engine != null ? this.engine.hashCode() : 0);
            result = 31 * result + (this.engineVersion != null ? this.engineVersion.hashCode() : 0);
            result = 31 * result + (this.finalSnapshotIdentifier != null ? this.finalSnapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.iamDatabaseAuthenticationEnabled != null ? this.iamDatabaseAuthenticationEnabled.hashCode() : 0);
            result = 31 * result + (this.iamRoles != null ? this.iamRoles.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.neptuneClusterParameterGroupName != null ? this.neptuneClusterParameterGroupName.hashCode() : 0);
            result = 31 * result + (this.neptuneSubnetGroupName != null ? this.neptuneSubnetGroupName.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.preferredBackupWindow != null ? this.preferredBackupWindow.hashCode() : 0);
            result = 31 * result + (this.preferredMaintenanceWindow != null ? this.preferredMaintenanceWindow.hashCode() : 0);
            result = 31 * result + (this.replicationSourceIdentifier != null ? this.replicationSourceIdentifier.hashCode() : 0);
            result = 31 * result + (this.skipFinalSnapshot != null ? this.skipFinalSnapshot.hashCode() : 0);
            result = 31 * result + (this.snapshotIdentifier != null ? this.snapshotIdentifier.hashCode() : 0);
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
