package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.718Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MqBrokerConfig")
@software.amazon.jsii.Jsii.Proxy(MqBrokerConfig.Jsii$Proxy.class)
public interface MqBrokerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getBrokerName();

    @org.jetbrains.annotations.NotNull java.lang.String getEngineType();

    @org.jetbrains.annotations.NotNull java.lang.String getEngineVersion();

    @org.jetbrains.annotations.NotNull java.lang.String getHostInstanceType();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups();

    /**
     * user block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MqBrokerUser> getUser();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApplyImmediately() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoMinorVersionUpgrade() {
        return null;
    }

    /**
     * configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MqBrokerConfiguration> getConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeploymentMode() {
        return null;
    }

    /**
     * encryption_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MqBrokerEncryptionOptions> getEncryptionOptions() {
        return null;
    }

    /**
     * logs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MqBrokerLogs> getLogs() {
        return null;
    }

    /**
     * maintenance_window_start_time block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MqBrokerMaintenanceWindowStartTime> getMaintenanceWindowStartTime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPubliclyAccessible() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MqBrokerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MqBrokerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MqBrokerConfig> {
        private java.lang.String brokerName;
        private java.lang.String engineType;
        private java.lang.String engineVersion;
        private java.lang.String hostInstanceType;
        private java.util.List<java.lang.String> securityGroups;
        private java.util.List<imports.aws.MqBrokerUser> user;
        private java.lang.Boolean applyImmediately;
        private java.lang.Boolean autoMinorVersionUpgrade;
        private java.util.List<imports.aws.MqBrokerConfiguration> configuration;
        private java.lang.String deploymentMode;
        private java.util.List<imports.aws.MqBrokerEncryptionOptions> encryptionOptions;
        private java.util.List<imports.aws.MqBrokerLogs> logs;
        private java.util.List<imports.aws.MqBrokerMaintenanceWindowStartTime> maintenanceWindowStartTime;
        private java.lang.Boolean publiclyAccessible;
        private java.util.List<java.lang.String> subnetIds;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link MqBrokerConfig#getBrokerName}
         * @param brokerName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder brokerName(java.lang.String brokerName) {
            this.brokerName = brokerName;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getEngineType}
         * @param engineType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder engineType(java.lang.String engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getEngineVersion}
         * @param engineVersion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder engineVersion(java.lang.String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getHostInstanceType}
         * @param hostInstanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hostInstanceType(java.lang.String hostInstanceType) {
            this.hostInstanceType = hostInstanceType;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getSecurityGroups}
         * @param securityGroups the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getUser}
         * @param user user block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder user(java.util.List<? extends imports.aws.MqBrokerUser> user) {
            this.user = (java.util.List<imports.aws.MqBrokerUser>)user;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getApplyImmediately}
         * @param applyImmediately the value to be set.
         * @return {@code this}
         */
        public Builder applyImmediately(java.lang.Boolean applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getAutoMinorVersionUpgrade}
         * @param autoMinorVersionUpgrade the value to be set.
         * @return {@code this}
         */
        public Builder autoMinorVersionUpgrade(java.lang.Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getConfiguration}
         * @param configuration configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder configuration(java.util.List<? extends imports.aws.MqBrokerConfiguration> configuration) {
            this.configuration = (java.util.List<imports.aws.MqBrokerConfiguration>)configuration;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getDeploymentMode}
         * @param deploymentMode the value to be set.
         * @return {@code this}
         */
        public Builder deploymentMode(java.lang.String deploymentMode) {
            this.deploymentMode = deploymentMode;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getEncryptionOptions}
         * @param encryptionOptions encryption_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryptionOptions(java.util.List<? extends imports.aws.MqBrokerEncryptionOptions> encryptionOptions) {
            this.encryptionOptions = (java.util.List<imports.aws.MqBrokerEncryptionOptions>)encryptionOptions;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getLogs}
         * @param logs logs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder logs(java.util.List<? extends imports.aws.MqBrokerLogs> logs) {
            this.logs = (java.util.List<imports.aws.MqBrokerLogs>)logs;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getMaintenanceWindowStartTime}
         * @param maintenanceWindowStartTime maintenance_window_start_time block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder maintenanceWindowStartTime(java.util.List<? extends imports.aws.MqBrokerMaintenanceWindowStartTime> maintenanceWindowStartTime) {
            this.maintenanceWindowStartTime = (java.util.List<imports.aws.MqBrokerMaintenanceWindowStartTime>)maintenanceWindowStartTime;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getPubliclyAccessible}
         * @param publiclyAccessible the value to be set.
         * @return {@code this}
         */
        public Builder publiclyAccessible(java.lang.Boolean publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getSubnetIds}
         * @param subnetIds the value to be set.
         * @return {@code this}
         */
        public Builder subnetIds(java.util.List<java.lang.String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getDependsOn}
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
         * Sets the value of {@link MqBrokerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerConfig#getProvider}
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
         * @return a new instance of {@link MqBrokerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MqBrokerConfig build() {
            return new Jsii$Proxy(brokerName, engineType, engineVersion, hostInstanceType, securityGroups, user, applyImmediately, autoMinorVersionUpgrade, configuration, deploymentMode, encryptionOptions, logs, maintenanceWindowStartTime, publiclyAccessible, subnetIds, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link MqBrokerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MqBrokerConfig {
        private final java.lang.String brokerName;
        private final java.lang.String engineType;
        private final java.lang.String engineVersion;
        private final java.lang.String hostInstanceType;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.util.List<imports.aws.MqBrokerUser> user;
        private final java.lang.Boolean applyImmediately;
        private final java.lang.Boolean autoMinorVersionUpgrade;
        private final java.util.List<imports.aws.MqBrokerConfiguration> configuration;
        private final java.lang.String deploymentMode;
        private final java.util.List<imports.aws.MqBrokerEncryptionOptions> encryptionOptions;
        private final java.util.List<imports.aws.MqBrokerLogs> logs;
        private final java.util.List<imports.aws.MqBrokerMaintenanceWindowStartTime> maintenanceWindowStartTime;
        private final java.lang.Boolean publiclyAccessible;
        private final java.util.List<java.lang.String> subnetIds;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.brokerName = software.amazon.jsii.Kernel.get(this, "brokerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineType = software.amazon.jsii.Kernel.get(this, "engineType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineVersion = software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hostInstanceType = software.amazon.jsii.Kernel.get(this, "hostInstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MqBrokerUser.class)));
            this.applyImmediately = software.amazon.jsii.Kernel.get(this, "applyImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoMinorVersionUpgrade = software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.configuration = software.amazon.jsii.Kernel.get(this, "configuration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MqBrokerConfiguration.class)));
            this.deploymentMode = software.amazon.jsii.Kernel.get(this, "deploymentMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryptionOptions = software.amazon.jsii.Kernel.get(this, "encryptionOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MqBrokerEncryptionOptions.class)));
            this.logs = software.amazon.jsii.Kernel.get(this, "logs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MqBrokerLogs.class)));
            this.maintenanceWindowStartTime = software.amazon.jsii.Kernel.get(this, "maintenanceWindowStartTime", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MqBrokerMaintenanceWindowStartTime.class)));
            this.publiclyAccessible = software.amazon.jsii.Kernel.get(this, "publiclyAccessible", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.subnetIds = software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String brokerName, final java.lang.String engineType, final java.lang.String engineVersion, final java.lang.String hostInstanceType, final java.util.List<java.lang.String> securityGroups, final java.util.List<? extends imports.aws.MqBrokerUser> user, final java.lang.Boolean applyImmediately, final java.lang.Boolean autoMinorVersionUpgrade, final java.util.List<? extends imports.aws.MqBrokerConfiguration> configuration, final java.lang.String deploymentMode, final java.util.List<? extends imports.aws.MqBrokerEncryptionOptions> encryptionOptions, final java.util.List<? extends imports.aws.MqBrokerLogs> logs, final java.util.List<? extends imports.aws.MqBrokerMaintenanceWindowStartTime> maintenanceWindowStartTime, final java.lang.Boolean publiclyAccessible, final java.util.List<java.lang.String> subnetIds, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.brokerName = java.util.Objects.requireNonNull(brokerName, "brokerName is required");
            this.engineType = java.util.Objects.requireNonNull(engineType, "engineType is required");
            this.engineVersion = java.util.Objects.requireNonNull(engineVersion, "engineVersion is required");
            this.hostInstanceType = java.util.Objects.requireNonNull(hostInstanceType, "hostInstanceType is required");
            this.securityGroups = java.util.Objects.requireNonNull(securityGroups, "securityGroups is required");
            this.user = (java.util.List<imports.aws.MqBrokerUser>)java.util.Objects.requireNonNull(user, "user is required");
            this.applyImmediately = applyImmediately;
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            this.configuration = (java.util.List<imports.aws.MqBrokerConfiguration>)configuration;
            this.deploymentMode = deploymentMode;
            this.encryptionOptions = (java.util.List<imports.aws.MqBrokerEncryptionOptions>)encryptionOptions;
            this.logs = (java.util.List<imports.aws.MqBrokerLogs>)logs;
            this.maintenanceWindowStartTime = (java.util.List<imports.aws.MqBrokerMaintenanceWindowStartTime>)maintenanceWindowStartTime;
            this.publiclyAccessible = publiclyAccessible;
            this.subnetIds = subnetIds;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getBrokerName() {
            return this.brokerName;
        }

        @Override
        public final java.lang.String getEngineType() {
            return this.engineType;
        }

        @Override
        public final java.lang.String getEngineVersion() {
            return this.engineVersion;
        }

        @Override
        public final java.lang.String getHostInstanceType() {
            return this.hostInstanceType;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.util.List<imports.aws.MqBrokerUser> getUser() {
            return this.user;
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
        public final java.util.List<imports.aws.MqBrokerConfiguration> getConfiguration() {
            return this.configuration;
        }

        @Override
        public final java.lang.String getDeploymentMode() {
            return this.deploymentMode;
        }

        @Override
        public final java.util.List<imports.aws.MqBrokerEncryptionOptions> getEncryptionOptions() {
            return this.encryptionOptions;
        }

        @Override
        public final java.util.List<imports.aws.MqBrokerLogs> getLogs() {
            return this.logs;
        }

        @Override
        public final java.util.List<imports.aws.MqBrokerMaintenanceWindowStartTime> getMaintenanceWindowStartTime() {
            return this.maintenanceWindowStartTime;
        }

        @Override
        public final java.lang.Boolean getPubliclyAccessible() {
            return this.publiclyAccessible;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetIds() {
            return this.subnetIds;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("brokerName", om.valueToTree(this.getBrokerName()));
            data.set("engineType", om.valueToTree(this.getEngineType()));
            data.set("engineVersion", om.valueToTree(this.getEngineVersion()));
            data.set("hostInstanceType", om.valueToTree(this.getHostInstanceType()));
            data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            data.set("user", om.valueToTree(this.getUser()));
            if (this.getApplyImmediately() != null) {
                data.set("applyImmediately", om.valueToTree(this.getApplyImmediately()));
            }
            if (this.getAutoMinorVersionUpgrade() != null) {
                data.set("autoMinorVersionUpgrade", om.valueToTree(this.getAutoMinorVersionUpgrade()));
            }
            if (this.getConfiguration() != null) {
                data.set("configuration", om.valueToTree(this.getConfiguration()));
            }
            if (this.getDeploymentMode() != null) {
                data.set("deploymentMode", om.valueToTree(this.getDeploymentMode()));
            }
            if (this.getEncryptionOptions() != null) {
                data.set("encryptionOptions", om.valueToTree(this.getEncryptionOptions()));
            }
            if (this.getLogs() != null) {
                data.set("logs", om.valueToTree(this.getLogs()));
            }
            if (this.getMaintenanceWindowStartTime() != null) {
                data.set("maintenanceWindowStartTime", om.valueToTree(this.getMaintenanceWindowStartTime()));
            }
            if (this.getPubliclyAccessible() != null) {
                data.set("publiclyAccessible", om.valueToTree(this.getPubliclyAccessible()));
            }
            if (this.getSubnetIds() != null) {
                data.set("subnetIds", om.valueToTree(this.getSubnetIds()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.MqBrokerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MqBrokerConfig.Jsii$Proxy that = (MqBrokerConfig.Jsii$Proxy) o;

            if (!brokerName.equals(that.brokerName)) return false;
            if (!engineType.equals(that.engineType)) return false;
            if (!engineVersion.equals(that.engineVersion)) return false;
            if (!hostInstanceType.equals(that.hostInstanceType)) return false;
            if (!securityGroups.equals(that.securityGroups)) return false;
            if (!user.equals(that.user)) return false;
            if (this.applyImmediately != null ? !this.applyImmediately.equals(that.applyImmediately) : that.applyImmediately != null) return false;
            if (this.autoMinorVersionUpgrade != null ? !this.autoMinorVersionUpgrade.equals(that.autoMinorVersionUpgrade) : that.autoMinorVersionUpgrade != null) return false;
            if (this.configuration != null ? !this.configuration.equals(that.configuration) : that.configuration != null) return false;
            if (this.deploymentMode != null ? !this.deploymentMode.equals(that.deploymentMode) : that.deploymentMode != null) return false;
            if (this.encryptionOptions != null ? !this.encryptionOptions.equals(that.encryptionOptions) : that.encryptionOptions != null) return false;
            if (this.logs != null ? !this.logs.equals(that.logs) : that.logs != null) return false;
            if (this.maintenanceWindowStartTime != null ? !this.maintenanceWindowStartTime.equals(that.maintenanceWindowStartTime) : that.maintenanceWindowStartTime != null) return false;
            if (this.publiclyAccessible != null ? !this.publiclyAccessible.equals(that.publiclyAccessible) : that.publiclyAccessible != null) return false;
            if (this.subnetIds != null ? !this.subnetIds.equals(that.subnetIds) : that.subnetIds != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.brokerName.hashCode();
            result = 31 * result + (this.engineType.hashCode());
            result = 31 * result + (this.engineVersion.hashCode());
            result = 31 * result + (this.hostInstanceType.hashCode());
            result = 31 * result + (this.securityGroups.hashCode());
            result = 31 * result + (this.user.hashCode());
            result = 31 * result + (this.applyImmediately != null ? this.applyImmediately.hashCode() : 0);
            result = 31 * result + (this.autoMinorVersionUpgrade != null ? this.autoMinorVersionUpgrade.hashCode() : 0);
            result = 31 * result + (this.configuration != null ? this.configuration.hashCode() : 0);
            result = 31 * result + (this.deploymentMode != null ? this.deploymentMode.hashCode() : 0);
            result = 31 * result + (this.encryptionOptions != null ? this.encryptionOptions.hashCode() : 0);
            result = 31 * result + (this.logs != null ? this.logs.hashCode() : 0);
            result = 31 * result + (this.maintenanceWindowStartTime != null ? this.maintenanceWindowStartTime.hashCode() : 0);
            result = 31 * result + (this.publiclyAccessible != null ? this.publiclyAccessible.hashCode() : 0);
            result = 31 * result + (this.subnetIds != null ? this.subnetIds.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
