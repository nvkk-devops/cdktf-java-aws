package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.549Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticacheReplicationGroupConfig")
@software.amazon.jsii.Jsii.Proxy(ElasticacheReplicationGroupConfig.Jsii$Proxy.class)
public interface ElasticacheReplicationGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getReplicationGroupDescription();

    @org.jetbrains.annotations.NotNull java.lang.String getReplicationGroupId();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApplyImmediately() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAtRestEncryptionEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthToken() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutomaticFailoverEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoMinorVersionUpgrade() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAvailabilityZones() {
        return null;
    }

    /**
     * cluster_mode block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticacheReplicationGroupClusterMode> getClusterMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngine() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngineVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaintenanceWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNodeType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNotificationTopicArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberCacheClusters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getParameterGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupNames() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSnapshotArns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getSnapshotRetentionLimit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ElasticacheReplicationGroupTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTransitEncryptionEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticacheReplicationGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticacheReplicationGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticacheReplicationGroupConfig> {
        private java.lang.String replicationGroupDescription;
        private java.lang.String replicationGroupId;
        private java.lang.Boolean applyImmediately;
        private java.lang.Boolean atRestEncryptionEnabled;
        private java.lang.String authToken;
        private java.lang.Boolean automaticFailoverEnabled;
        private java.lang.Boolean autoMinorVersionUpgrade;
        private java.util.List<java.lang.String> availabilityZones;
        private java.util.List<imports.aws.ElasticacheReplicationGroupClusterMode> clusterMode;
        private java.lang.String engine;
        private java.lang.String engineVersion;
        private java.lang.String kmsKeyId;
        private java.lang.String maintenanceWindow;
        private java.lang.String nodeType;
        private java.lang.String notificationTopicArn;
        private java.lang.Number numberCacheClusters;
        private java.lang.String parameterGroupName;
        private java.lang.Number port;
        private java.util.List<java.lang.String> securityGroupIds;
        private java.util.List<java.lang.String> securityGroupNames;
        private java.util.List<java.lang.String> snapshotArns;
        private java.lang.String snapshotName;
        private java.lang.Number snapshotRetentionLimit;
        private java.lang.String snapshotWindow;
        private java.lang.String subnetGroupName;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.ElasticacheReplicationGroupTimeouts timeouts;
        private java.lang.Boolean transitEncryptionEnabled;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getReplicationGroupDescription}
         * @param replicationGroupDescription the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder replicationGroupDescription(java.lang.String replicationGroupDescription) {
            this.replicationGroupDescription = replicationGroupDescription;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getReplicationGroupId}
         * @param replicationGroupId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder replicationGroupId(java.lang.String replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getApplyImmediately}
         * @param applyImmediately the value to be set.
         * @return {@code this}
         */
        public Builder applyImmediately(java.lang.Boolean applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getAtRestEncryptionEnabled}
         * @param atRestEncryptionEnabled the value to be set.
         * @return {@code this}
         */
        public Builder atRestEncryptionEnabled(java.lang.Boolean atRestEncryptionEnabled) {
            this.atRestEncryptionEnabled = atRestEncryptionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getAuthToken}
         * @param authToken the value to be set.
         * @return {@code this}
         */
        public Builder authToken(java.lang.String authToken) {
            this.authToken = authToken;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getAutomaticFailoverEnabled}
         * @param automaticFailoverEnabled the value to be set.
         * @return {@code this}
         */
        public Builder automaticFailoverEnabled(java.lang.Boolean automaticFailoverEnabled) {
            this.automaticFailoverEnabled = automaticFailoverEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getAutoMinorVersionUpgrade}
         * @param autoMinorVersionUpgrade the value to be set.
         * @return {@code this}
         */
        public Builder autoMinorVersionUpgrade(java.lang.Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getAvailabilityZones}
         * @param availabilityZones the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZones(java.util.List<java.lang.String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getClusterMode}
         * @param clusterMode cluster_mode block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder clusterMode(java.util.List<? extends imports.aws.ElasticacheReplicationGroupClusterMode> clusterMode) {
            this.clusterMode = (java.util.List<imports.aws.ElasticacheReplicationGroupClusterMode>)clusterMode;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getEngine}
         * @param engine the value to be set.
         * @return {@code this}
         */
        public Builder engine(java.lang.String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getEngineVersion}
         * @param engineVersion the value to be set.
         * @return {@code this}
         */
        public Builder engineVersion(java.lang.String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getMaintenanceWindow}
         * @param maintenanceWindow the value to be set.
         * @return {@code this}
         */
        public Builder maintenanceWindow(java.lang.String maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getNodeType}
         * @param nodeType the value to be set.
         * @return {@code this}
         */
        public Builder nodeType(java.lang.String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getNotificationTopicArn}
         * @param notificationTopicArn the value to be set.
         * @return {@code this}
         */
        public Builder notificationTopicArn(java.lang.String notificationTopicArn) {
            this.notificationTopicArn = notificationTopicArn;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getNumberCacheClusters}
         * @param numberCacheClusters the value to be set.
         * @return {@code this}
         */
        public Builder numberCacheClusters(java.lang.Number numberCacheClusters) {
            this.numberCacheClusters = numberCacheClusters;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getParameterGroupName}
         * @param parameterGroupName the value to be set.
         * @return {@code this}
         */
        public Builder parameterGroupName(java.lang.String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getSecurityGroupIds}
         * @param securityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupIds(java.util.List<java.lang.String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getSecurityGroupNames}
         * @param securityGroupNames the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupNames(java.util.List<java.lang.String> securityGroupNames) {
            this.securityGroupNames = securityGroupNames;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getSnapshotArns}
         * @param snapshotArns the value to be set.
         * @return {@code this}
         */
        public Builder snapshotArns(java.util.List<java.lang.String> snapshotArns) {
            this.snapshotArns = snapshotArns;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getSnapshotName}
         * @param snapshotName the value to be set.
         * @return {@code this}
         */
        public Builder snapshotName(java.lang.String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getSnapshotRetentionLimit}
         * @param snapshotRetentionLimit the value to be set.
         * @return {@code this}
         */
        public Builder snapshotRetentionLimit(java.lang.Number snapshotRetentionLimit) {
            this.snapshotRetentionLimit = snapshotRetentionLimit;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getSnapshotWindow}
         * @param snapshotWindow the value to be set.
         * @return {@code this}
         */
        public Builder snapshotWindow(java.lang.String snapshotWindow) {
            this.snapshotWindow = snapshotWindow;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getSubnetGroupName}
         * @param subnetGroupName the value to be set.
         * @return {@code this}
         */
        public Builder subnetGroupName(java.lang.String subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.ElasticacheReplicationGroupTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getTransitEncryptionEnabled}
         * @param transitEncryptionEnabled the value to be set.
         * @return {@code this}
         */
        public Builder transitEncryptionEnabled(java.lang.Boolean transitEncryptionEnabled) {
            this.transitEncryptionEnabled = transitEncryptionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getDependsOn}
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
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupConfig#getProvider}
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
         * @return a new instance of {@link ElasticacheReplicationGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticacheReplicationGroupConfig build() {
            return new Jsii$Proxy(replicationGroupDescription, replicationGroupId, applyImmediately, atRestEncryptionEnabled, authToken, automaticFailoverEnabled, autoMinorVersionUpgrade, availabilityZones, clusterMode, engine, engineVersion, kmsKeyId, maintenanceWindow, nodeType, notificationTopicArn, numberCacheClusters, parameterGroupName, port, securityGroupIds, securityGroupNames, snapshotArns, snapshotName, snapshotRetentionLimit, snapshotWindow, subnetGroupName, tags, timeouts, transitEncryptionEnabled, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ElasticacheReplicationGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticacheReplicationGroupConfig {
        private final java.lang.String replicationGroupDescription;
        private final java.lang.String replicationGroupId;
        private final java.lang.Boolean applyImmediately;
        private final java.lang.Boolean atRestEncryptionEnabled;
        private final java.lang.String authToken;
        private final java.lang.Boolean automaticFailoverEnabled;
        private final java.lang.Boolean autoMinorVersionUpgrade;
        private final java.util.List<java.lang.String> availabilityZones;
        private final java.util.List<imports.aws.ElasticacheReplicationGroupClusterMode> clusterMode;
        private final java.lang.String engine;
        private final java.lang.String engineVersion;
        private final java.lang.String kmsKeyId;
        private final java.lang.String maintenanceWindow;
        private final java.lang.String nodeType;
        private final java.lang.String notificationTopicArn;
        private final java.lang.Number numberCacheClusters;
        private final java.lang.String parameterGroupName;
        private final java.lang.Number port;
        private final java.util.List<java.lang.String> securityGroupIds;
        private final java.util.List<java.lang.String> securityGroupNames;
        private final java.util.List<java.lang.String> snapshotArns;
        private final java.lang.String snapshotName;
        private final java.lang.Number snapshotRetentionLimit;
        private final java.lang.String snapshotWindow;
        private final java.lang.String subnetGroupName;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.ElasticacheReplicationGroupTimeouts timeouts;
        private final java.lang.Boolean transitEncryptionEnabled;
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
            this.replicationGroupDescription = software.amazon.jsii.Kernel.get(this, "replicationGroupDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationGroupId = software.amazon.jsii.Kernel.get(this, "replicationGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.applyImmediately = software.amazon.jsii.Kernel.get(this, "applyImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.atRestEncryptionEnabled = software.amazon.jsii.Kernel.get(this, "atRestEncryptionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.authToken = software.amazon.jsii.Kernel.get(this, "authToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.automaticFailoverEnabled = software.amazon.jsii.Kernel.get(this, "automaticFailoverEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoMinorVersionUpgrade = software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.availabilityZones = software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.clusterMode = software.amazon.jsii.Kernel.get(this, "clusterMode", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticacheReplicationGroupClusterMode.class)));
            this.engine = software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineVersion = software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maintenanceWindow = software.amazon.jsii.Kernel.get(this, "maintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeType = software.amazon.jsii.Kernel.get(this, "nodeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notificationTopicArn = software.amazon.jsii.Kernel.get(this, "notificationTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.numberCacheClusters = software.amazon.jsii.Kernel.get(this, "numberCacheClusters", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.parameterGroupName = software.amazon.jsii.Kernel.get(this, "parameterGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.securityGroupIds = software.amazon.jsii.Kernel.get(this, "securityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.securityGroupNames = software.amazon.jsii.Kernel.get(this, "securityGroupNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.snapshotArns = software.amazon.jsii.Kernel.get(this, "snapshotArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.snapshotName = software.amazon.jsii.Kernel.get(this, "snapshotName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.snapshotRetentionLimit = software.amazon.jsii.Kernel.get(this, "snapshotRetentionLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.snapshotWindow = software.amazon.jsii.Kernel.get(this, "snapshotWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subnetGroupName = software.amazon.jsii.Kernel.get(this, "subnetGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ElasticacheReplicationGroupTimeouts.class));
            this.transitEncryptionEnabled = software.amazon.jsii.Kernel.get(this, "transitEncryptionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String replicationGroupDescription, final java.lang.String replicationGroupId, final java.lang.Boolean applyImmediately, final java.lang.Boolean atRestEncryptionEnabled, final java.lang.String authToken, final java.lang.Boolean automaticFailoverEnabled, final java.lang.Boolean autoMinorVersionUpgrade, final java.util.List<java.lang.String> availabilityZones, final java.util.List<? extends imports.aws.ElasticacheReplicationGroupClusterMode> clusterMode, final java.lang.String engine, final java.lang.String engineVersion, final java.lang.String kmsKeyId, final java.lang.String maintenanceWindow, final java.lang.String nodeType, final java.lang.String notificationTopicArn, final java.lang.Number numberCacheClusters, final java.lang.String parameterGroupName, final java.lang.Number port, final java.util.List<java.lang.String> securityGroupIds, final java.util.List<java.lang.String> securityGroupNames, final java.util.List<java.lang.String> snapshotArns, final java.lang.String snapshotName, final java.lang.Number snapshotRetentionLimit, final java.lang.String snapshotWindow, final java.lang.String subnetGroupName, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.ElasticacheReplicationGroupTimeouts timeouts, final java.lang.Boolean transitEncryptionEnabled, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.replicationGroupDescription = java.util.Objects.requireNonNull(replicationGroupDescription, "replicationGroupDescription is required");
            this.replicationGroupId = java.util.Objects.requireNonNull(replicationGroupId, "replicationGroupId is required");
            this.applyImmediately = applyImmediately;
            this.atRestEncryptionEnabled = atRestEncryptionEnabled;
            this.authToken = authToken;
            this.automaticFailoverEnabled = automaticFailoverEnabled;
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            this.availabilityZones = availabilityZones;
            this.clusterMode = (java.util.List<imports.aws.ElasticacheReplicationGroupClusterMode>)clusterMode;
            this.engine = engine;
            this.engineVersion = engineVersion;
            this.kmsKeyId = kmsKeyId;
            this.maintenanceWindow = maintenanceWindow;
            this.nodeType = nodeType;
            this.notificationTopicArn = notificationTopicArn;
            this.numberCacheClusters = numberCacheClusters;
            this.parameterGroupName = parameterGroupName;
            this.port = port;
            this.securityGroupIds = securityGroupIds;
            this.securityGroupNames = securityGroupNames;
            this.snapshotArns = snapshotArns;
            this.snapshotName = snapshotName;
            this.snapshotRetentionLimit = snapshotRetentionLimit;
            this.snapshotWindow = snapshotWindow;
            this.subnetGroupName = subnetGroupName;
            this.tags = tags;
            this.timeouts = timeouts;
            this.transitEncryptionEnabled = transitEncryptionEnabled;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getReplicationGroupDescription() {
            return this.replicationGroupDescription;
        }

        @Override
        public final java.lang.String getReplicationGroupId() {
            return this.replicationGroupId;
        }

        @Override
        public final java.lang.Boolean getApplyImmediately() {
            return this.applyImmediately;
        }

        @Override
        public final java.lang.Boolean getAtRestEncryptionEnabled() {
            return this.atRestEncryptionEnabled;
        }

        @Override
        public final java.lang.String getAuthToken() {
            return this.authToken;
        }

        @Override
        public final java.lang.Boolean getAutomaticFailoverEnabled() {
            return this.automaticFailoverEnabled;
        }

        @Override
        public final java.lang.Boolean getAutoMinorVersionUpgrade() {
            return this.autoMinorVersionUpgrade;
        }

        @Override
        public final java.util.List<java.lang.String> getAvailabilityZones() {
            return this.availabilityZones;
        }

        @Override
        public final java.util.List<imports.aws.ElasticacheReplicationGroupClusterMode> getClusterMode() {
            return this.clusterMode;
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
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.String getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

        @Override
        public final java.lang.String getNodeType() {
            return this.nodeType;
        }

        @Override
        public final java.lang.String getNotificationTopicArn() {
            return this.notificationTopicArn;
        }

        @Override
        public final java.lang.Number getNumberCacheClusters() {
            return this.numberCacheClusters;
        }

        @Override
        public final java.lang.String getParameterGroupName() {
            return this.parameterGroupName;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupNames() {
            return this.securityGroupNames;
        }

        @Override
        public final java.util.List<java.lang.String> getSnapshotArns() {
            return this.snapshotArns;
        }

        @Override
        public final java.lang.String getSnapshotName() {
            return this.snapshotName;
        }

        @Override
        public final java.lang.Number getSnapshotRetentionLimit() {
            return this.snapshotRetentionLimit;
        }

        @Override
        public final java.lang.String getSnapshotWindow() {
            return this.snapshotWindow;
        }

        @Override
        public final java.lang.String getSubnetGroupName() {
            return this.subnetGroupName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.ElasticacheReplicationGroupTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Boolean getTransitEncryptionEnabled() {
            return this.transitEncryptionEnabled;
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

            data.set("replicationGroupDescription", om.valueToTree(this.getReplicationGroupDescription()));
            data.set("replicationGroupId", om.valueToTree(this.getReplicationGroupId()));
            if (this.getApplyImmediately() != null) {
                data.set("applyImmediately", om.valueToTree(this.getApplyImmediately()));
            }
            if (this.getAtRestEncryptionEnabled() != null) {
                data.set("atRestEncryptionEnabled", om.valueToTree(this.getAtRestEncryptionEnabled()));
            }
            if (this.getAuthToken() != null) {
                data.set("authToken", om.valueToTree(this.getAuthToken()));
            }
            if (this.getAutomaticFailoverEnabled() != null) {
                data.set("automaticFailoverEnabled", om.valueToTree(this.getAutomaticFailoverEnabled()));
            }
            if (this.getAutoMinorVersionUpgrade() != null) {
                data.set("autoMinorVersionUpgrade", om.valueToTree(this.getAutoMinorVersionUpgrade()));
            }
            if (this.getAvailabilityZones() != null) {
                data.set("availabilityZones", om.valueToTree(this.getAvailabilityZones()));
            }
            if (this.getClusterMode() != null) {
                data.set("clusterMode", om.valueToTree(this.getClusterMode()));
            }
            if (this.getEngine() != null) {
                data.set("engine", om.valueToTree(this.getEngine()));
            }
            if (this.getEngineVersion() != null) {
                data.set("engineVersion", om.valueToTree(this.getEngineVersion()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getMaintenanceWindow() != null) {
                data.set("maintenanceWindow", om.valueToTree(this.getMaintenanceWindow()));
            }
            if (this.getNodeType() != null) {
                data.set("nodeType", om.valueToTree(this.getNodeType()));
            }
            if (this.getNotificationTopicArn() != null) {
                data.set("notificationTopicArn", om.valueToTree(this.getNotificationTopicArn()));
            }
            if (this.getNumberCacheClusters() != null) {
                data.set("numberCacheClusters", om.valueToTree(this.getNumberCacheClusters()));
            }
            if (this.getParameterGroupName() != null) {
                data.set("parameterGroupName", om.valueToTree(this.getParameterGroupName()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getSecurityGroupIds() != null) {
                data.set("securityGroupIds", om.valueToTree(this.getSecurityGroupIds()));
            }
            if (this.getSecurityGroupNames() != null) {
                data.set("securityGroupNames", om.valueToTree(this.getSecurityGroupNames()));
            }
            if (this.getSnapshotArns() != null) {
                data.set("snapshotArns", om.valueToTree(this.getSnapshotArns()));
            }
            if (this.getSnapshotName() != null) {
                data.set("snapshotName", om.valueToTree(this.getSnapshotName()));
            }
            if (this.getSnapshotRetentionLimit() != null) {
                data.set("snapshotRetentionLimit", om.valueToTree(this.getSnapshotRetentionLimit()));
            }
            if (this.getSnapshotWindow() != null) {
                data.set("snapshotWindow", om.valueToTree(this.getSnapshotWindow()));
            }
            if (this.getSubnetGroupName() != null) {
                data.set("subnetGroupName", om.valueToTree(this.getSubnetGroupName()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getTransitEncryptionEnabled() != null) {
                data.set("transitEncryptionEnabled", om.valueToTree(this.getTransitEncryptionEnabled()));
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
            struct.set("fqn", om.valueToTree("aws.ElasticacheReplicationGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticacheReplicationGroupConfig.Jsii$Proxy that = (ElasticacheReplicationGroupConfig.Jsii$Proxy) o;

            if (!replicationGroupDescription.equals(that.replicationGroupDescription)) return false;
            if (!replicationGroupId.equals(that.replicationGroupId)) return false;
            if (this.applyImmediately != null ? !this.applyImmediately.equals(that.applyImmediately) : that.applyImmediately != null) return false;
            if (this.atRestEncryptionEnabled != null ? !this.atRestEncryptionEnabled.equals(that.atRestEncryptionEnabled) : that.atRestEncryptionEnabled != null) return false;
            if (this.authToken != null ? !this.authToken.equals(that.authToken) : that.authToken != null) return false;
            if (this.automaticFailoverEnabled != null ? !this.automaticFailoverEnabled.equals(that.automaticFailoverEnabled) : that.automaticFailoverEnabled != null) return false;
            if (this.autoMinorVersionUpgrade != null ? !this.autoMinorVersionUpgrade.equals(that.autoMinorVersionUpgrade) : that.autoMinorVersionUpgrade != null) return false;
            if (this.availabilityZones != null ? !this.availabilityZones.equals(that.availabilityZones) : that.availabilityZones != null) return false;
            if (this.clusterMode != null ? !this.clusterMode.equals(that.clusterMode) : that.clusterMode != null) return false;
            if (this.engine != null ? !this.engine.equals(that.engine) : that.engine != null) return false;
            if (this.engineVersion != null ? !this.engineVersion.equals(that.engineVersion) : that.engineVersion != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.maintenanceWindow != null ? !this.maintenanceWindow.equals(that.maintenanceWindow) : that.maintenanceWindow != null) return false;
            if (this.nodeType != null ? !this.nodeType.equals(that.nodeType) : that.nodeType != null) return false;
            if (this.notificationTopicArn != null ? !this.notificationTopicArn.equals(that.notificationTopicArn) : that.notificationTopicArn != null) return false;
            if (this.numberCacheClusters != null ? !this.numberCacheClusters.equals(that.numberCacheClusters) : that.numberCacheClusters != null) return false;
            if (this.parameterGroupName != null ? !this.parameterGroupName.equals(that.parameterGroupName) : that.parameterGroupName != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.securityGroupIds != null ? !this.securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null) return false;
            if (this.securityGroupNames != null ? !this.securityGroupNames.equals(that.securityGroupNames) : that.securityGroupNames != null) return false;
            if (this.snapshotArns != null ? !this.snapshotArns.equals(that.snapshotArns) : that.snapshotArns != null) return false;
            if (this.snapshotName != null ? !this.snapshotName.equals(that.snapshotName) : that.snapshotName != null) return false;
            if (this.snapshotRetentionLimit != null ? !this.snapshotRetentionLimit.equals(that.snapshotRetentionLimit) : that.snapshotRetentionLimit != null) return false;
            if (this.snapshotWindow != null ? !this.snapshotWindow.equals(that.snapshotWindow) : that.snapshotWindow != null) return false;
            if (this.subnetGroupName != null ? !this.subnetGroupName.equals(that.subnetGroupName) : that.subnetGroupName != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.transitEncryptionEnabled != null ? !this.transitEncryptionEnabled.equals(that.transitEncryptionEnabled) : that.transitEncryptionEnabled != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.replicationGroupDescription.hashCode();
            result = 31 * result + (this.replicationGroupId.hashCode());
            result = 31 * result + (this.applyImmediately != null ? this.applyImmediately.hashCode() : 0);
            result = 31 * result + (this.atRestEncryptionEnabled != null ? this.atRestEncryptionEnabled.hashCode() : 0);
            result = 31 * result + (this.authToken != null ? this.authToken.hashCode() : 0);
            result = 31 * result + (this.automaticFailoverEnabled != null ? this.automaticFailoverEnabled.hashCode() : 0);
            result = 31 * result + (this.autoMinorVersionUpgrade != null ? this.autoMinorVersionUpgrade.hashCode() : 0);
            result = 31 * result + (this.availabilityZones != null ? this.availabilityZones.hashCode() : 0);
            result = 31 * result + (this.clusterMode != null ? this.clusterMode.hashCode() : 0);
            result = 31 * result + (this.engine != null ? this.engine.hashCode() : 0);
            result = 31 * result + (this.engineVersion != null ? this.engineVersion.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.maintenanceWindow != null ? this.maintenanceWindow.hashCode() : 0);
            result = 31 * result + (this.nodeType != null ? this.nodeType.hashCode() : 0);
            result = 31 * result + (this.notificationTopicArn != null ? this.notificationTopicArn.hashCode() : 0);
            result = 31 * result + (this.numberCacheClusters != null ? this.numberCacheClusters.hashCode() : 0);
            result = 31 * result + (this.parameterGroupName != null ? this.parameterGroupName.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.securityGroupIds != null ? this.securityGroupIds.hashCode() : 0);
            result = 31 * result + (this.securityGroupNames != null ? this.securityGroupNames.hashCode() : 0);
            result = 31 * result + (this.snapshotArns != null ? this.snapshotArns.hashCode() : 0);
            result = 31 * result + (this.snapshotName != null ? this.snapshotName.hashCode() : 0);
            result = 31 * result + (this.snapshotRetentionLimit != null ? this.snapshotRetentionLimit.hashCode() : 0);
            result = 31 * result + (this.snapshotWindow != null ? this.snapshotWindow.hashCode() : 0);
            result = 31 * result + (this.subnetGroupName != null ? this.subnetGroupName.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.transitEncryptionEnabled != null ? this.transitEncryptionEnabled.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
