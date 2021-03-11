package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.579Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.FsxWindowsFileSystemConfig")
@software.amazon.jsii.Jsii.Proxy(FsxWindowsFileSystemConfig.Jsii$Proxy.class)
public interface FsxWindowsFileSystemConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Number getStorageCapacity();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds();

    @org.jetbrains.annotations.NotNull java.lang.Number getThroughputCapacity();

    default @org.jetbrains.annotations.Nullable java.lang.String getActiveDirectoryId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getAutomaticBackupRetentionDays() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCopyTagsToBackups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDailyAutomaticBackupStartTime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIds() {
        return null;
    }

    /**
     * self_managed_active_directory block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory> getSelfManagedActiveDirectory() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSkipFinalBackup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.FsxWindowsFileSystemTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWeeklyMaintenanceStartTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FsxWindowsFileSystemConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FsxWindowsFileSystemConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FsxWindowsFileSystemConfig> {
        private java.lang.Number storageCapacity;
        private java.util.List<java.lang.String> subnetIds;
        private java.lang.Number throughputCapacity;
        private java.lang.String activeDirectoryId;
        private java.lang.Number automaticBackupRetentionDays;
        private java.lang.Boolean copyTagsToBackups;
        private java.lang.String dailyAutomaticBackupStartTime;
        private java.lang.String kmsKeyId;
        private java.util.List<java.lang.String> securityGroupIds;
        private java.util.List<imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory> selfManagedActiveDirectory;
        private java.lang.Boolean skipFinalBackup;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.FsxWindowsFileSystemTimeouts timeouts;
        private java.lang.String weeklyMaintenanceStartTime;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getStorageCapacity}
         * @param storageCapacity the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder storageCapacity(java.lang.Number storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getSubnetIds}
         * @param subnetIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetIds(java.util.List<java.lang.String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getThroughputCapacity}
         * @param throughputCapacity the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder throughputCapacity(java.lang.Number throughputCapacity) {
            this.throughputCapacity = throughputCapacity;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getActiveDirectoryId}
         * @param activeDirectoryId the value to be set.
         * @return {@code this}
         */
        public Builder activeDirectoryId(java.lang.String activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getAutomaticBackupRetentionDays}
         * @param automaticBackupRetentionDays the value to be set.
         * @return {@code this}
         */
        public Builder automaticBackupRetentionDays(java.lang.Number automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getCopyTagsToBackups}
         * @param copyTagsToBackups the value to be set.
         * @return {@code this}
         */
        public Builder copyTagsToBackups(java.lang.Boolean copyTagsToBackups) {
            this.copyTagsToBackups = copyTagsToBackups;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getDailyAutomaticBackupStartTime}
         * @param dailyAutomaticBackupStartTime the value to be set.
         * @return {@code this}
         */
        public Builder dailyAutomaticBackupStartTime(java.lang.String dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getSecurityGroupIds}
         * @param securityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupIds(java.util.List<java.lang.String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getSelfManagedActiveDirectory}
         * @param selfManagedActiveDirectory self_managed_active_directory block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder selfManagedActiveDirectory(java.util.List<? extends imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory> selfManagedActiveDirectory) {
            this.selfManagedActiveDirectory = (java.util.List<imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory>)selfManagedActiveDirectory;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getSkipFinalBackup}
         * @param skipFinalBackup the value to be set.
         * @return {@code this}
         */
        public Builder skipFinalBackup(java.lang.Boolean skipFinalBackup) {
            this.skipFinalBackup = skipFinalBackup;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.FsxWindowsFileSystemTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getWeeklyMaintenanceStartTime}
         * @param weeklyMaintenanceStartTime the value to be set.
         * @return {@code this}
         */
        public Builder weeklyMaintenanceStartTime(java.lang.String weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getDependsOn}
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
         * Sets the value of {@link FsxWindowsFileSystemConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemConfig#getProvider}
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
         * @return a new instance of {@link FsxWindowsFileSystemConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FsxWindowsFileSystemConfig build() {
            return new Jsii$Proxy(storageCapacity, subnetIds, throughputCapacity, activeDirectoryId, automaticBackupRetentionDays, copyTagsToBackups, dailyAutomaticBackupStartTime, kmsKeyId, securityGroupIds, selfManagedActiveDirectory, skipFinalBackup, tags, timeouts, weeklyMaintenanceStartTime, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link FsxWindowsFileSystemConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FsxWindowsFileSystemConfig {
        private final java.lang.Number storageCapacity;
        private final java.util.List<java.lang.String> subnetIds;
        private final java.lang.Number throughputCapacity;
        private final java.lang.String activeDirectoryId;
        private final java.lang.Number automaticBackupRetentionDays;
        private final java.lang.Boolean copyTagsToBackups;
        private final java.lang.String dailyAutomaticBackupStartTime;
        private final java.lang.String kmsKeyId;
        private final java.util.List<java.lang.String> securityGroupIds;
        private final java.util.List<imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory> selfManagedActiveDirectory;
        private final java.lang.Boolean skipFinalBackup;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.FsxWindowsFileSystemTimeouts timeouts;
        private final java.lang.String weeklyMaintenanceStartTime;
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
            this.storageCapacity = software.amazon.jsii.Kernel.get(this, "storageCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.subnetIds = software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.throughputCapacity = software.amazon.jsii.Kernel.get(this, "throughputCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.activeDirectoryId = software.amazon.jsii.Kernel.get(this, "activeDirectoryId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.automaticBackupRetentionDays = software.amazon.jsii.Kernel.get(this, "automaticBackupRetentionDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.copyTagsToBackups = software.amazon.jsii.Kernel.get(this, "copyTagsToBackups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.dailyAutomaticBackupStartTime = software.amazon.jsii.Kernel.get(this, "dailyAutomaticBackupStartTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupIds = software.amazon.jsii.Kernel.get(this, "securityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.selfManagedActiveDirectory = software.amazon.jsii.Kernel.get(this, "selfManagedActiveDirectory", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory.class)));
            this.skipFinalBackup = software.amazon.jsii.Kernel.get(this, "skipFinalBackup", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.FsxWindowsFileSystemTimeouts.class));
            this.weeklyMaintenanceStartTime = software.amazon.jsii.Kernel.get(this, "weeklyMaintenanceStartTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number storageCapacity, final java.util.List<java.lang.String> subnetIds, final java.lang.Number throughputCapacity, final java.lang.String activeDirectoryId, final java.lang.Number automaticBackupRetentionDays, final java.lang.Boolean copyTagsToBackups, final java.lang.String dailyAutomaticBackupStartTime, final java.lang.String kmsKeyId, final java.util.List<java.lang.String> securityGroupIds, final java.util.List<? extends imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory> selfManagedActiveDirectory, final java.lang.Boolean skipFinalBackup, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.FsxWindowsFileSystemTimeouts timeouts, final java.lang.String weeklyMaintenanceStartTime, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.storageCapacity = java.util.Objects.requireNonNull(storageCapacity, "storageCapacity is required");
            this.subnetIds = java.util.Objects.requireNonNull(subnetIds, "subnetIds is required");
            this.throughputCapacity = java.util.Objects.requireNonNull(throughputCapacity, "throughputCapacity is required");
            this.activeDirectoryId = activeDirectoryId;
            this.automaticBackupRetentionDays = automaticBackupRetentionDays;
            this.copyTagsToBackups = copyTagsToBackups;
            this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            this.kmsKeyId = kmsKeyId;
            this.securityGroupIds = securityGroupIds;
            this.selfManagedActiveDirectory = (java.util.List<imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory>)selfManagedActiveDirectory;
            this.skipFinalBackup = skipFinalBackup;
            this.tags = tags;
            this.timeouts = timeouts;
            this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getStorageCapacity() {
            return this.storageCapacity;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetIds() {
            return this.subnetIds;
        }

        @Override
        public final java.lang.Number getThroughputCapacity() {
            return this.throughputCapacity;
        }

        @Override
        public final java.lang.String getActiveDirectoryId() {
            return this.activeDirectoryId;
        }

        @Override
        public final java.lang.Number getAutomaticBackupRetentionDays() {
            return this.automaticBackupRetentionDays;
        }

        @Override
        public final java.lang.Boolean getCopyTagsToBackups() {
            return this.copyTagsToBackups;
        }

        @Override
        public final java.lang.String getDailyAutomaticBackupStartTime() {
            return this.dailyAutomaticBackupStartTime;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        @Override
        public final java.util.List<imports.aws.FsxWindowsFileSystemSelfManagedActiveDirectory> getSelfManagedActiveDirectory() {
            return this.selfManagedActiveDirectory;
        }

        @Override
        public final java.lang.Boolean getSkipFinalBackup() {
            return this.skipFinalBackup;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.FsxWindowsFileSystemTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getWeeklyMaintenanceStartTime() {
            return this.weeklyMaintenanceStartTime;
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

            data.set("storageCapacity", om.valueToTree(this.getStorageCapacity()));
            data.set("subnetIds", om.valueToTree(this.getSubnetIds()));
            data.set("throughputCapacity", om.valueToTree(this.getThroughputCapacity()));
            if (this.getActiveDirectoryId() != null) {
                data.set("activeDirectoryId", om.valueToTree(this.getActiveDirectoryId()));
            }
            if (this.getAutomaticBackupRetentionDays() != null) {
                data.set("automaticBackupRetentionDays", om.valueToTree(this.getAutomaticBackupRetentionDays()));
            }
            if (this.getCopyTagsToBackups() != null) {
                data.set("copyTagsToBackups", om.valueToTree(this.getCopyTagsToBackups()));
            }
            if (this.getDailyAutomaticBackupStartTime() != null) {
                data.set("dailyAutomaticBackupStartTime", om.valueToTree(this.getDailyAutomaticBackupStartTime()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getSecurityGroupIds() != null) {
                data.set("securityGroupIds", om.valueToTree(this.getSecurityGroupIds()));
            }
            if (this.getSelfManagedActiveDirectory() != null) {
                data.set("selfManagedActiveDirectory", om.valueToTree(this.getSelfManagedActiveDirectory()));
            }
            if (this.getSkipFinalBackup() != null) {
                data.set("skipFinalBackup", om.valueToTree(this.getSkipFinalBackup()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getWeeklyMaintenanceStartTime() != null) {
                data.set("weeklyMaintenanceStartTime", om.valueToTree(this.getWeeklyMaintenanceStartTime()));
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
            struct.set("fqn", om.valueToTree("aws.FsxWindowsFileSystemConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FsxWindowsFileSystemConfig.Jsii$Proxy that = (FsxWindowsFileSystemConfig.Jsii$Proxy) o;

            if (!storageCapacity.equals(that.storageCapacity)) return false;
            if (!subnetIds.equals(that.subnetIds)) return false;
            if (!throughputCapacity.equals(that.throughputCapacity)) return false;
            if (this.activeDirectoryId != null ? !this.activeDirectoryId.equals(that.activeDirectoryId) : that.activeDirectoryId != null) return false;
            if (this.automaticBackupRetentionDays != null ? !this.automaticBackupRetentionDays.equals(that.automaticBackupRetentionDays) : that.automaticBackupRetentionDays != null) return false;
            if (this.copyTagsToBackups != null ? !this.copyTagsToBackups.equals(that.copyTagsToBackups) : that.copyTagsToBackups != null) return false;
            if (this.dailyAutomaticBackupStartTime != null ? !this.dailyAutomaticBackupStartTime.equals(that.dailyAutomaticBackupStartTime) : that.dailyAutomaticBackupStartTime != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.securityGroupIds != null ? !this.securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null) return false;
            if (this.selfManagedActiveDirectory != null ? !this.selfManagedActiveDirectory.equals(that.selfManagedActiveDirectory) : that.selfManagedActiveDirectory != null) return false;
            if (this.skipFinalBackup != null ? !this.skipFinalBackup.equals(that.skipFinalBackup) : that.skipFinalBackup != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.weeklyMaintenanceStartTime != null ? !this.weeklyMaintenanceStartTime.equals(that.weeklyMaintenanceStartTime) : that.weeklyMaintenanceStartTime != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.storageCapacity.hashCode();
            result = 31 * result + (this.subnetIds.hashCode());
            result = 31 * result + (this.throughputCapacity.hashCode());
            result = 31 * result + (this.activeDirectoryId != null ? this.activeDirectoryId.hashCode() : 0);
            result = 31 * result + (this.automaticBackupRetentionDays != null ? this.automaticBackupRetentionDays.hashCode() : 0);
            result = 31 * result + (this.copyTagsToBackups != null ? this.copyTagsToBackups.hashCode() : 0);
            result = 31 * result + (this.dailyAutomaticBackupStartTime != null ? this.dailyAutomaticBackupStartTime.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.securityGroupIds != null ? this.securityGroupIds.hashCode() : 0);
            result = 31 * result + (this.selfManagedActiveDirectory != null ? this.selfManagedActiveDirectory.hashCode() : 0);
            result = 31 * result + (this.skipFinalBackup != null ? this.skipFinalBackup.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.weeklyMaintenanceStartTime != null ? this.weeklyMaintenanceStartTime.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
