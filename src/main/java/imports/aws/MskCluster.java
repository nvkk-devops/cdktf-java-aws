package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.720Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskCluster")
public class MskCluster extends com.hashicorp.cdktf.TerraformResource {

    protected MskCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public MskCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.MskClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetClientAuthentication() {
        software.amazon.jsii.Kernel.call(this, "resetClientAuthentication", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigurationInfo() {
        software.amazon.jsii.Kernel.call(this, "resetConfigurationInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionInfo() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnhancedMonitoring() {
        software.amazon.jsii.Kernel.call(this, "resetEnhancedMonitoring", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoggingInfo() {
        software.amazon.jsii.Kernel.call(this, "resetLoggingInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOpenMonitoring() {
        software.amazon.jsii.Kernel.call(this, "resetOpenMonitoring", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokers() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokers", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokersTls() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokersTls", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo> getBrokerNodeGroupInfoInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "brokerNodeGroupInfoInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterBrokerNodeGroupInfo.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCurrentVersion() {
        return software.amazon.jsii.Kernel.get(this, "currentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKafkaVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "kafkaVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfBrokerNodesInput() {
        return software.amazon.jsii.Kernel.get(this, "numberOfBrokerNodesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZookeeperConnectString() {
        return software.amazon.jsii.Kernel.get(this, "zookeeperConnectString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterClientAuthentication> getClientAuthenticationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.MskClusterClientAuthentication>)(software.amazon.jsii.Kernel.get(this, "clientAuthenticationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterClientAuthentication.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterConfigurationInfo> getConfigurationInfoInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.MskClusterConfigurationInfo>)(software.amazon.jsii.Kernel.get(this, "configurationInfoInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterConfigurationInfo.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterEncryptionInfo> getEncryptionInfoInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.MskClusterEncryptionInfo>)(software.amazon.jsii.Kernel.get(this, "encryptionInfoInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterEncryptionInfo.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEnhancedMonitoringInput() {
        return software.amazon.jsii.Kernel.get(this, "enhancedMonitoringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterLoggingInfo> getLoggingInfoInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.MskClusterLoggingInfo>)(software.amazon.jsii.Kernel.get(this, "loggingInfoInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterLoggingInfo.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterOpenMonitoring> getOpenMonitoringInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.MskClusterOpenMonitoring>)(software.amazon.jsii.Kernel.get(this, "openMonitoringInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterOpenMonitoring.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo> getBrokerNodeGroupInfo() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "brokerNodeGroupInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterBrokerNodeGroupInfo.class))));
    }

    public void setBrokerNodeGroupInfo(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo> value) {
        software.amazon.jsii.Kernel.set(this, "brokerNodeGroupInfo", java.util.Objects.requireNonNull(value, "brokerNodeGroupInfo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterClientAuthentication> getClientAuthentication() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "clientAuthentication", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterClientAuthentication.class))));
    }

    public void setClientAuthentication(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterClientAuthentication> value) {
        software.amazon.jsii.Kernel.set(this, "clientAuthentication", java.util.Objects.requireNonNull(value, "clientAuthentication is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterName() {
        return software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterName", java.util.Objects.requireNonNull(value, "clusterName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterConfigurationInfo> getConfigurationInfo() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "configurationInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterConfigurationInfo.class))));
    }

    public void setConfigurationInfo(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterConfigurationInfo> value) {
        software.amazon.jsii.Kernel.set(this, "configurationInfo", java.util.Objects.requireNonNull(value, "configurationInfo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterEncryptionInfo> getEncryptionInfo() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "encryptionInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterEncryptionInfo.class))));
    }

    public void setEncryptionInfo(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterEncryptionInfo> value) {
        software.amazon.jsii.Kernel.set(this, "encryptionInfo", java.util.Objects.requireNonNull(value, "encryptionInfo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEnhancedMonitoring() {
        return software.amazon.jsii.Kernel.get(this, "enhancedMonitoring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEnhancedMonitoring(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "enhancedMonitoring", java.util.Objects.requireNonNull(value, "enhancedMonitoring is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKafkaVersion() {
        return software.amazon.jsii.Kernel.get(this, "kafkaVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKafkaVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kafkaVersion", java.util.Objects.requireNonNull(value, "kafkaVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterLoggingInfo> getLoggingInfo() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loggingInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterLoggingInfo.class))));
    }

    public void setLoggingInfo(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterLoggingInfo> value) {
        software.amazon.jsii.Kernel.set(this, "loggingInfo", java.util.Objects.requireNonNull(value, "loggingInfo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfBrokerNodes() {
        return software.amazon.jsii.Kernel.get(this, "numberOfBrokerNodes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfBrokerNodes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfBrokerNodes", java.util.Objects.requireNonNull(value, "numberOfBrokerNodes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterOpenMonitoring> getOpenMonitoring() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "openMonitoring", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterOpenMonitoring.class))));
    }

    public void setOpenMonitoring(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterOpenMonitoring> value) {
        software.amazon.jsii.Kernel.set(this, "openMonitoring", java.util.Objects.requireNonNull(value, "openMonitoring is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.MskCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.MskCluster> {
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
        private final imports.aws.MskClusterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.MskClusterConfig.Builder();
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
         * broker_node_group_info block.
         * <p>
         * @return {@code this}
         * @param brokerNodeGroupInfo broker_node_group_info block. This parameter is required.
         */
        public Builder brokerNodeGroupInfo(final java.util.List<? extends imports.aws.MskClusterBrokerNodeGroupInfo> brokerNodeGroupInfo) {
            this.config.brokerNodeGroupInfo(brokerNodeGroupInfo);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterName This parameter is required.
         */
        public Builder clusterName(final java.lang.String clusterName) {
            this.config.clusterName(clusterName);
            return this;
        }

        /**
         * @return {@code this}
         * @param kafkaVersion This parameter is required.
         */
        public Builder kafkaVersion(final java.lang.String kafkaVersion) {
            this.config.kafkaVersion(kafkaVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param numberOfBrokerNodes This parameter is required.
         */
        public Builder numberOfBrokerNodes(final java.lang.Number numberOfBrokerNodes) {
            this.config.numberOfBrokerNodes(numberOfBrokerNodes);
            return this;
        }

        /**
         * client_authentication block.
         * <p>
         * @return {@code this}
         * @param clientAuthentication client_authentication block. This parameter is required.
         */
        public Builder clientAuthentication(final java.util.List<? extends imports.aws.MskClusterClientAuthentication> clientAuthentication) {
            this.config.clientAuthentication(clientAuthentication);
            return this;
        }

        /**
         * configuration_info block.
         * <p>
         * @return {@code this}
         * @param configurationInfo configuration_info block. This parameter is required.
         */
        public Builder configurationInfo(final java.util.List<? extends imports.aws.MskClusterConfigurationInfo> configurationInfo) {
            this.config.configurationInfo(configurationInfo);
            return this;
        }

        /**
         * encryption_info block.
         * <p>
         * @return {@code this}
         * @param encryptionInfo encryption_info block. This parameter is required.
         */
        public Builder encryptionInfo(final java.util.List<? extends imports.aws.MskClusterEncryptionInfo> encryptionInfo) {
            this.config.encryptionInfo(encryptionInfo);
            return this;
        }

        /**
         * @return {@code this}
         * @param enhancedMonitoring This parameter is required.
         */
        public Builder enhancedMonitoring(final java.lang.String enhancedMonitoring) {
            this.config.enhancedMonitoring(enhancedMonitoring);
            return this;
        }

        /**
         * logging_info block.
         * <p>
         * @return {@code this}
         * @param loggingInfo logging_info block. This parameter is required.
         */
        public Builder loggingInfo(final java.util.List<? extends imports.aws.MskClusterLoggingInfo> loggingInfo) {
            this.config.loggingInfo(loggingInfo);
            return this;
        }

        /**
         * open_monitoring block.
         * <p>
         * @return {@code this}
         * @param openMonitoring open_monitoring block. This parameter is required.
         */
        public Builder openMonitoring(final java.util.List<? extends imports.aws.MskClusterOpenMonitoring> openMonitoring) {
            this.config.openMonitoring(openMonitoring);
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
         * @returns a newly built instance of {@link imports.aws.MskCluster}.
         */
        @Override
        public imports.aws.MskCluster build() {
            return new imports.aws.MskCluster(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
