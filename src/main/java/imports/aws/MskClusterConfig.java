package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.721Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterConfig")
@software.amazon.jsii.Jsii.Proxy(MskClusterConfig.Jsii$Proxy.class)
public interface MskClusterConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * broker_node_group_info block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo> getBrokerNodeGroupInfo();

    @org.jetbrains.annotations.NotNull java.lang.String getClusterName();

    @org.jetbrains.annotations.NotNull java.lang.String getKafkaVersion();

    @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfBrokerNodes();

    /**
     * client_authentication block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterClientAuthentication> getClientAuthentication() {
        return null;
    }

    /**
     * configuration_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterConfigurationInfo> getConfigurationInfo() {
        return null;
    }

    /**
     * encryption_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterEncryptionInfo> getEncryptionInfo() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEnhancedMonitoring() {
        return null;
    }

    /**
     * logging_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterLoggingInfo> getLoggingInfo() {
        return null;
    }

    /**
     * open_monitoring block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterOpenMonitoring> getOpenMonitoring() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterConfig> {
        private java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo> brokerNodeGroupInfo;
        private java.lang.String clusterName;
        private java.lang.String kafkaVersion;
        private java.lang.Number numberOfBrokerNodes;
        private java.util.List<imports.aws.MskClusterClientAuthentication> clientAuthentication;
        private java.util.List<imports.aws.MskClusterConfigurationInfo> configurationInfo;
        private java.util.List<imports.aws.MskClusterEncryptionInfo> encryptionInfo;
        private java.lang.String enhancedMonitoring;
        private java.util.List<imports.aws.MskClusterLoggingInfo> loggingInfo;
        private java.util.List<imports.aws.MskClusterOpenMonitoring> openMonitoring;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link MskClusterConfig#getBrokerNodeGroupInfo}
         * @param brokerNodeGroupInfo broker_node_group_info block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder brokerNodeGroupInfo(java.util.List<? extends imports.aws.MskClusterBrokerNodeGroupInfo> brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = (java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo>)brokerNodeGroupInfo;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getClusterName}
         * @param clusterName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterName(java.lang.String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getKafkaVersion}
         * @param kafkaVersion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder kafkaVersion(java.lang.String kafkaVersion) {
            this.kafkaVersion = kafkaVersion;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getNumberOfBrokerNodes}
         * @param numberOfBrokerNodes the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder numberOfBrokerNodes(java.lang.Number numberOfBrokerNodes) {
            this.numberOfBrokerNodes = numberOfBrokerNodes;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getClientAuthentication}
         * @param clientAuthentication client_authentication block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder clientAuthentication(java.util.List<? extends imports.aws.MskClusterClientAuthentication> clientAuthentication) {
            this.clientAuthentication = (java.util.List<imports.aws.MskClusterClientAuthentication>)clientAuthentication;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getConfigurationInfo}
         * @param configurationInfo configuration_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder configurationInfo(java.util.List<? extends imports.aws.MskClusterConfigurationInfo> configurationInfo) {
            this.configurationInfo = (java.util.List<imports.aws.MskClusterConfigurationInfo>)configurationInfo;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getEncryptionInfo}
         * @param encryptionInfo encryption_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryptionInfo(java.util.List<? extends imports.aws.MskClusterEncryptionInfo> encryptionInfo) {
            this.encryptionInfo = (java.util.List<imports.aws.MskClusterEncryptionInfo>)encryptionInfo;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getEnhancedMonitoring}
         * @param enhancedMonitoring the value to be set.
         * @return {@code this}
         */
        public Builder enhancedMonitoring(java.lang.String enhancedMonitoring) {
            this.enhancedMonitoring = enhancedMonitoring;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getLoggingInfo}
         * @param loggingInfo logging_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder loggingInfo(java.util.List<? extends imports.aws.MskClusterLoggingInfo> loggingInfo) {
            this.loggingInfo = (java.util.List<imports.aws.MskClusterLoggingInfo>)loggingInfo;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getOpenMonitoring}
         * @param openMonitoring open_monitoring block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder openMonitoring(java.util.List<? extends imports.aws.MskClusterOpenMonitoring> openMonitoring) {
            this.openMonitoring = (java.util.List<imports.aws.MskClusterOpenMonitoring>)openMonitoring;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getDependsOn}
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
         * Sets the value of {@link MskClusterConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterConfig#getProvider}
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
         * @return a new instance of {@link MskClusterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterConfig build() {
            return new Jsii$Proxy(brokerNodeGroupInfo, clusterName, kafkaVersion, numberOfBrokerNodes, clientAuthentication, configurationInfo, encryptionInfo, enhancedMonitoring, loggingInfo, openMonitoring, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link MskClusterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterConfig {
        private final java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo> brokerNodeGroupInfo;
        private final java.lang.String clusterName;
        private final java.lang.String kafkaVersion;
        private final java.lang.Number numberOfBrokerNodes;
        private final java.util.List<imports.aws.MskClusterClientAuthentication> clientAuthentication;
        private final java.util.List<imports.aws.MskClusterConfigurationInfo> configurationInfo;
        private final java.util.List<imports.aws.MskClusterEncryptionInfo> encryptionInfo;
        private final java.lang.String enhancedMonitoring;
        private final java.util.List<imports.aws.MskClusterLoggingInfo> loggingInfo;
        private final java.util.List<imports.aws.MskClusterOpenMonitoring> openMonitoring;
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
            this.brokerNodeGroupInfo = software.amazon.jsii.Kernel.get(this, "brokerNodeGroupInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterBrokerNodeGroupInfo.class)));
            this.clusterName = software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kafkaVersion = software.amazon.jsii.Kernel.get(this, "kafkaVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.numberOfBrokerNodes = software.amazon.jsii.Kernel.get(this, "numberOfBrokerNodes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.clientAuthentication = software.amazon.jsii.Kernel.get(this, "clientAuthentication", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterClientAuthentication.class)));
            this.configurationInfo = software.amazon.jsii.Kernel.get(this, "configurationInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterConfigurationInfo.class)));
            this.encryptionInfo = software.amazon.jsii.Kernel.get(this, "encryptionInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterEncryptionInfo.class)));
            this.enhancedMonitoring = software.amazon.jsii.Kernel.get(this, "enhancedMonitoring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingInfo = software.amazon.jsii.Kernel.get(this, "loggingInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterLoggingInfo.class)));
            this.openMonitoring = software.amazon.jsii.Kernel.get(this, "openMonitoring", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterOpenMonitoring.class)));
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
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.MskClusterBrokerNodeGroupInfo> brokerNodeGroupInfo, final java.lang.String clusterName, final java.lang.String kafkaVersion, final java.lang.Number numberOfBrokerNodes, final java.util.List<? extends imports.aws.MskClusterClientAuthentication> clientAuthentication, final java.util.List<? extends imports.aws.MskClusterConfigurationInfo> configurationInfo, final java.util.List<? extends imports.aws.MskClusterEncryptionInfo> encryptionInfo, final java.lang.String enhancedMonitoring, final java.util.List<? extends imports.aws.MskClusterLoggingInfo> loggingInfo, final java.util.List<? extends imports.aws.MskClusterOpenMonitoring> openMonitoring, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.brokerNodeGroupInfo = (java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo>)java.util.Objects.requireNonNull(brokerNodeGroupInfo, "brokerNodeGroupInfo is required");
            this.clusterName = java.util.Objects.requireNonNull(clusterName, "clusterName is required");
            this.kafkaVersion = java.util.Objects.requireNonNull(kafkaVersion, "kafkaVersion is required");
            this.numberOfBrokerNodes = java.util.Objects.requireNonNull(numberOfBrokerNodes, "numberOfBrokerNodes is required");
            this.clientAuthentication = (java.util.List<imports.aws.MskClusterClientAuthentication>)clientAuthentication;
            this.configurationInfo = (java.util.List<imports.aws.MskClusterConfigurationInfo>)configurationInfo;
            this.encryptionInfo = (java.util.List<imports.aws.MskClusterEncryptionInfo>)encryptionInfo;
            this.enhancedMonitoring = enhancedMonitoring;
            this.loggingInfo = (java.util.List<imports.aws.MskClusterLoggingInfo>)loggingInfo;
            this.openMonitoring = (java.util.List<imports.aws.MskClusterOpenMonitoring>)openMonitoring;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterBrokerNodeGroupInfo> getBrokerNodeGroupInfo() {
            return this.brokerNodeGroupInfo;
        }

        @Override
        public final java.lang.String getClusterName() {
            return this.clusterName;
        }

        @Override
        public final java.lang.String getKafkaVersion() {
            return this.kafkaVersion;
        }

        @Override
        public final java.lang.Number getNumberOfBrokerNodes() {
            return this.numberOfBrokerNodes;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterClientAuthentication> getClientAuthentication() {
            return this.clientAuthentication;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterConfigurationInfo> getConfigurationInfo() {
            return this.configurationInfo;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterEncryptionInfo> getEncryptionInfo() {
            return this.encryptionInfo;
        }

        @Override
        public final java.lang.String getEnhancedMonitoring() {
            return this.enhancedMonitoring;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterLoggingInfo> getLoggingInfo() {
            return this.loggingInfo;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterOpenMonitoring> getOpenMonitoring() {
            return this.openMonitoring;
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

            data.set("brokerNodeGroupInfo", om.valueToTree(this.getBrokerNodeGroupInfo()));
            data.set("clusterName", om.valueToTree(this.getClusterName()));
            data.set("kafkaVersion", om.valueToTree(this.getKafkaVersion()));
            data.set("numberOfBrokerNodes", om.valueToTree(this.getNumberOfBrokerNodes()));
            if (this.getClientAuthentication() != null) {
                data.set("clientAuthentication", om.valueToTree(this.getClientAuthentication()));
            }
            if (this.getConfigurationInfo() != null) {
                data.set("configurationInfo", om.valueToTree(this.getConfigurationInfo()));
            }
            if (this.getEncryptionInfo() != null) {
                data.set("encryptionInfo", om.valueToTree(this.getEncryptionInfo()));
            }
            if (this.getEnhancedMonitoring() != null) {
                data.set("enhancedMonitoring", om.valueToTree(this.getEnhancedMonitoring()));
            }
            if (this.getLoggingInfo() != null) {
                data.set("loggingInfo", om.valueToTree(this.getLoggingInfo()));
            }
            if (this.getOpenMonitoring() != null) {
                data.set("openMonitoring", om.valueToTree(this.getOpenMonitoring()));
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
            struct.set("fqn", om.valueToTree("aws.MskClusterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterConfig.Jsii$Proxy that = (MskClusterConfig.Jsii$Proxy) o;

            if (!brokerNodeGroupInfo.equals(that.brokerNodeGroupInfo)) return false;
            if (!clusterName.equals(that.clusterName)) return false;
            if (!kafkaVersion.equals(that.kafkaVersion)) return false;
            if (!numberOfBrokerNodes.equals(that.numberOfBrokerNodes)) return false;
            if (this.clientAuthentication != null ? !this.clientAuthentication.equals(that.clientAuthentication) : that.clientAuthentication != null) return false;
            if (this.configurationInfo != null ? !this.configurationInfo.equals(that.configurationInfo) : that.configurationInfo != null) return false;
            if (this.encryptionInfo != null ? !this.encryptionInfo.equals(that.encryptionInfo) : that.encryptionInfo != null) return false;
            if (this.enhancedMonitoring != null ? !this.enhancedMonitoring.equals(that.enhancedMonitoring) : that.enhancedMonitoring != null) return false;
            if (this.loggingInfo != null ? !this.loggingInfo.equals(that.loggingInfo) : that.loggingInfo != null) return false;
            if (this.openMonitoring != null ? !this.openMonitoring.equals(that.openMonitoring) : that.openMonitoring != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.brokerNodeGroupInfo.hashCode();
            result = 31 * result + (this.clusterName.hashCode());
            result = 31 * result + (this.kafkaVersion.hashCode());
            result = 31 * result + (this.numberOfBrokerNodes.hashCode());
            result = 31 * result + (this.clientAuthentication != null ? this.clientAuthentication.hashCode() : 0);
            result = 31 * result + (this.configurationInfo != null ? this.configurationInfo.hashCode() : 0);
            result = 31 * result + (this.encryptionInfo != null ? this.encryptionInfo.hashCode() : 0);
            result = 31 * result + (this.enhancedMonitoring != null ? this.enhancedMonitoring.hashCode() : 0);
            result = 31 * result + (this.loggingInfo != null ? this.loggingInfo.hashCode() : 0);
            result = 31 * result + (this.openMonitoring != null ? this.openMonitoring.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
