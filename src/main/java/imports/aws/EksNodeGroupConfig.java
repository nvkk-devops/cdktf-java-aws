package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.534Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksNodeGroupConfig")
@software.amazon.jsii.Jsii.Proxy(EksNodeGroupConfig.Jsii$Proxy.class)
public interface EksNodeGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getClusterName();

    @org.jetbrains.annotations.NotNull java.lang.String getNodeGroupName();

    @org.jetbrains.annotations.NotNull java.lang.String getNodeRoleArn();

    /**
     * scaling_config block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksNodeGroupScalingConfig> getScalingConfig();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds();

    default @org.jetbrains.annotations.Nullable java.lang.String getAmiType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDiskSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceUpdateVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInstanceTypes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReleaseVersion() {
        return null;
    }

    /**
     * remote_access block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EksNodeGroupRemoteAccess> getRemoteAccess() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.EksNodeGroupTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EksNodeGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksNodeGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksNodeGroupConfig> {
        private java.lang.String clusterName;
        private java.lang.String nodeGroupName;
        private java.lang.String nodeRoleArn;
        private java.util.List<imports.aws.EksNodeGroupScalingConfig> scalingConfig;
        private java.util.List<java.lang.String> subnetIds;
        private java.lang.String amiType;
        private java.lang.Number diskSize;
        private java.lang.Boolean forceUpdateVersion;
        private java.util.List<java.lang.String> instanceTypes;
        private java.util.Map<java.lang.String, java.lang.String> labels;
        private java.lang.String releaseVersion;
        private java.util.List<imports.aws.EksNodeGroupRemoteAccess> remoteAccess;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.EksNodeGroupTimeouts timeouts;
        private java.lang.String version;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EksNodeGroupConfig#getClusterName}
         * @param clusterName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterName(java.lang.String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getNodeGroupName}
         * @param nodeGroupName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder nodeGroupName(java.lang.String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getNodeRoleArn}
         * @param nodeRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder nodeRoleArn(java.lang.String nodeRoleArn) {
            this.nodeRoleArn = nodeRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getScalingConfig}
         * @param scalingConfig scaling_config block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder scalingConfig(java.util.List<? extends imports.aws.EksNodeGroupScalingConfig> scalingConfig) {
            this.scalingConfig = (java.util.List<imports.aws.EksNodeGroupScalingConfig>)scalingConfig;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getSubnetIds}
         * @param subnetIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetIds(java.util.List<java.lang.String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getAmiType}
         * @param amiType the value to be set.
         * @return {@code this}
         */
        public Builder amiType(java.lang.String amiType) {
            this.amiType = amiType;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getDiskSize}
         * @param diskSize the value to be set.
         * @return {@code this}
         */
        public Builder diskSize(java.lang.Number diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getForceUpdateVersion}
         * @param forceUpdateVersion the value to be set.
         * @return {@code this}
         */
        public Builder forceUpdateVersion(java.lang.Boolean forceUpdateVersion) {
            this.forceUpdateVersion = forceUpdateVersion;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getInstanceTypes}
         * @param instanceTypes the value to be set.
         * @return {@code this}
         */
        public Builder instanceTypes(java.util.List<java.lang.String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getLabels}
         * @param labels the value to be set.
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getReleaseVersion}
         * @param releaseVersion the value to be set.
         * @return {@code this}
         */
        public Builder releaseVersion(java.lang.String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getRemoteAccess}
         * @param remoteAccess remote_access block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder remoteAccess(java.util.List<? extends imports.aws.EksNodeGroupRemoteAccess> remoteAccess) {
            this.remoteAccess = (java.util.List<imports.aws.EksNodeGroupRemoteAccess>)remoteAccess;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.EksNodeGroupTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getVersion}
         * @param version the value to be set.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getDependsOn}
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
         * Sets the value of {@link EksNodeGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupConfig#getProvider}
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
         * @return a new instance of {@link EksNodeGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksNodeGroupConfig build() {
            return new Jsii$Proxy(clusterName, nodeGroupName, nodeRoleArn, scalingConfig, subnetIds, amiType, diskSize, forceUpdateVersion, instanceTypes, labels, releaseVersion, remoteAccess, tags, timeouts, version, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EksNodeGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksNodeGroupConfig {
        private final java.lang.String clusterName;
        private final java.lang.String nodeGroupName;
        private final java.lang.String nodeRoleArn;
        private final java.util.List<imports.aws.EksNodeGroupScalingConfig> scalingConfig;
        private final java.util.List<java.lang.String> subnetIds;
        private final java.lang.String amiType;
        private final java.lang.Number diskSize;
        private final java.lang.Boolean forceUpdateVersion;
        private final java.util.List<java.lang.String> instanceTypes;
        private final java.util.Map<java.lang.String, java.lang.String> labels;
        private final java.lang.String releaseVersion;
        private final java.util.List<imports.aws.EksNodeGroupRemoteAccess> remoteAccess;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.EksNodeGroupTimeouts timeouts;
        private final java.lang.String version;
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
            this.clusterName = software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeGroupName = software.amazon.jsii.Kernel.get(this, "nodeGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeRoleArn = software.amazon.jsii.Kernel.get(this, "nodeRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scalingConfig = software.amazon.jsii.Kernel.get(this, "scalingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupScalingConfig.class)));
            this.subnetIds = software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.amiType = software.amazon.jsii.Kernel.get(this, "amiType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.diskSize = software.amazon.jsii.Kernel.get(this, "diskSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.forceUpdateVersion = software.amazon.jsii.Kernel.get(this, "forceUpdateVersion", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.instanceTypes = software.amazon.jsii.Kernel.get(this, "instanceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.labels = software.amazon.jsii.Kernel.get(this, "labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.releaseVersion = software.amazon.jsii.Kernel.get(this, "releaseVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.remoteAccess = software.amazon.jsii.Kernel.get(this, "remoteAccess", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupRemoteAccess.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupTimeouts.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String clusterName, final java.lang.String nodeGroupName, final java.lang.String nodeRoleArn, final java.util.List<? extends imports.aws.EksNodeGroupScalingConfig> scalingConfig, final java.util.List<java.lang.String> subnetIds, final java.lang.String amiType, final java.lang.Number diskSize, final java.lang.Boolean forceUpdateVersion, final java.util.List<java.lang.String> instanceTypes, final java.util.Map<java.lang.String, java.lang.String> labels, final java.lang.String releaseVersion, final java.util.List<? extends imports.aws.EksNodeGroupRemoteAccess> remoteAccess, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.EksNodeGroupTimeouts timeouts, final java.lang.String version, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterName = java.util.Objects.requireNonNull(clusterName, "clusterName is required");
            this.nodeGroupName = java.util.Objects.requireNonNull(nodeGroupName, "nodeGroupName is required");
            this.nodeRoleArn = java.util.Objects.requireNonNull(nodeRoleArn, "nodeRoleArn is required");
            this.scalingConfig = (java.util.List<imports.aws.EksNodeGroupScalingConfig>)java.util.Objects.requireNonNull(scalingConfig, "scalingConfig is required");
            this.subnetIds = java.util.Objects.requireNonNull(subnetIds, "subnetIds is required");
            this.amiType = amiType;
            this.diskSize = diskSize;
            this.forceUpdateVersion = forceUpdateVersion;
            this.instanceTypes = instanceTypes;
            this.labels = labels;
            this.releaseVersion = releaseVersion;
            this.remoteAccess = (java.util.List<imports.aws.EksNodeGroupRemoteAccess>)remoteAccess;
            this.tags = tags;
            this.timeouts = timeouts;
            this.version = version;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getClusterName() {
            return this.clusterName;
        }

        @Override
        public final java.lang.String getNodeGroupName() {
            return this.nodeGroupName;
        }

        @Override
        public final java.lang.String getNodeRoleArn() {
            return this.nodeRoleArn;
        }

        @Override
        public final java.util.List<imports.aws.EksNodeGroupScalingConfig> getScalingConfig() {
            return this.scalingConfig;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetIds() {
            return this.subnetIds;
        }

        @Override
        public final java.lang.String getAmiType() {
            return this.amiType;
        }

        @Override
        public final java.lang.Number getDiskSize() {
            return this.diskSize;
        }

        @Override
        public final java.lang.Boolean getForceUpdateVersion() {
            return this.forceUpdateVersion;
        }

        @Override
        public final java.util.List<java.lang.String> getInstanceTypes() {
            return this.instanceTypes;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLabels() {
            return this.labels;
        }

        @Override
        public final java.lang.String getReleaseVersion() {
            return this.releaseVersion;
        }

        @Override
        public final java.util.List<imports.aws.EksNodeGroupRemoteAccess> getRemoteAccess() {
            return this.remoteAccess;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.EksNodeGroupTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
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

            data.set("clusterName", om.valueToTree(this.getClusterName()));
            data.set("nodeGroupName", om.valueToTree(this.getNodeGroupName()));
            data.set("nodeRoleArn", om.valueToTree(this.getNodeRoleArn()));
            data.set("scalingConfig", om.valueToTree(this.getScalingConfig()));
            data.set("subnetIds", om.valueToTree(this.getSubnetIds()));
            if (this.getAmiType() != null) {
                data.set("amiType", om.valueToTree(this.getAmiType()));
            }
            if (this.getDiskSize() != null) {
                data.set("diskSize", om.valueToTree(this.getDiskSize()));
            }
            if (this.getForceUpdateVersion() != null) {
                data.set("forceUpdateVersion", om.valueToTree(this.getForceUpdateVersion()));
            }
            if (this.getInstanceTypes() != null) {
                data.set("instanceTypes", om.valueToTree(this.getInstanceTypes()));
            }
            if (this.getLabels() != null) {
                data.set("labels", om.valueToTree(this.getLabels()));
            }
            if (this.getReleaseVersion() != null) {
                data.set("releaseVersion", om.valueToTree(this.getReleaseVersion()));
            }
            if (this.getRemoteAccess() != null) {
                data.set("remoteAccess", om.valueToTree(this.getRemoteAccess()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
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
            struct.set("fqn", om.valueToTree("aws.EksNodeGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksNodeGroupConfig.Jsii$Proxy that = (EksNodeGroupConfig.Jsii$Proxy) o;

            if (!clusterName.equals(that.clusterName)) return false;
            if (!nodeGroupName.equals(that.nodeGroupName)) return false;
            if (!nodeRoleArn.equals(that.nodeRoleArn)) return false;
            if (!scalingConfig.equals(that.scalingConfig)) return false;
            if (!subnetIds.equals(that.subnetIds)) return false;
            if (this.amiType != null ? !this.amiType.equals(that.amiType) : that.amiType != null) return false;
            if (this.diskSize != null ? !this.diskSize.equals(that.diskSize) : that.diskSize != null) return false;
            if (this.forceUpdateVersion != null ? !this.forceUpdateVersion.equals(that.forceUpdateVersion) : that.forceUpdateVersion != null) return false;
            if (this.instanceTypes != null ? !this.instanceTypes.equals(that.instanceTypes) : that.instanceTypes != null) return false;
            if (this.labels != null ? !this.labels.equals(that.labels) : that.labels != null) return false;
            if (this.releaseVersion != null ? !this.releaseVersion.equals(that.releaseVersion) : that.releaseVersion != null) return false;
            if (this.remoteAccess != null ? !this.remoteAccess.equals(that.remoteAccess) : that.remoteAccess != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clusterName.hashCode();
            result = 31 * result + (this.nodeGroupName.hashCode());
            result = 31 * result + (this.nodeRoleArn.hashCode());
            result = 31 * result + (this.scalingConfig.hashCode());
            result = 31 * result + (this.subnetIds.hashCode());
            result = 31 * result + (this.amiType != null ? this.amiType.hashCode() : 0);
            result = 31 * result + (this.diskSize != null ? this.diskSize.hashCode() : 0);
            result = 31 * result + (this.forceUpdateVersion != null ? this.forceUpdateVersion.hashCode() : 0);
            result = 31 * result + (this.instanceTypes != null ? this.instanceTypes.hashCode() : 0);
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            result = 31 * result + (this.releaseVersion != null ? this.releaseVersion.hashCode() : 0);
            result = 31 * result + (this.remoteAccess != null ? this.remoteAccess.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
