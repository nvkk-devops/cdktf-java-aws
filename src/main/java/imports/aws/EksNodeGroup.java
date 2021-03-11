package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.533Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksNodeGroup")
public class EksNodeGroup extends com.hashicorp.cdktf.TerraformResource {

    protected EksNodeGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EksNodeGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public EksNodeGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.EksNodeGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAmiType() {
        software.amazon.jsii.Kernel.call(this, "resetAmiType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDiskSize() {
        software.amazon.jsii.Kernel.call(this, "resetDiskSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceUpdateVersion() {
        software.amazon.jsii.Kernel.call(this, "resetForceUpdateVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceTypes() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLabels() {
        software.amazon.jsii.Kernel.call(this, "resetLabels", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReleaseVersion() {
        software.amazon.jsii.Kernel.call(this, "resetReleaseVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRemoteAccess() {
        software.amazon.jsii.Kernel.call(this, "resetRemoteAccess", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetVersion", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.EksNodeGroupResources resources(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "resources", software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupResources.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksNodeGroupScalingConfig> getScalingConfigInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "scalingConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupScalingConfig.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIdsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnetIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAmiTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "amiTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDiskSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "diskSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getForceUpdateVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "forceUpdateVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInstanceTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "instanceTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabelsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "labelsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReleaseVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "releaseVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EksNodeGroupRemoteAccess> getRemoteAccessInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EksNodeGroupRemoteAccess>)(software.amazon.jsii.Kernel.get(this, "remoteAccessInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupRemoteAccess.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.EksNodeGroupTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAmiType() {
        return software.amazon.jsii.Kernel.get(this, "amiType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAmiType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "amiType", java.util.Objects.requireNonNull(value, "amiType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterName() {
        return software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterName", java.util.Objects.requireNonNull(value, "clusterName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDiskSize() {
        return software.amazon.jsii.Kernel.get(this, "diskSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDiskSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "diskSize", java.util.Objects.requireNonNull(value, "diskSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getForceUpdateVersion() {
        return software.amazon.jsii.Kernel.get(this, "forceUpdateVersion", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setForceUpdateVersion(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceUpdateVersion", java.util.Objects.requireNonNull(value, "forceUpdateVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getInstanceTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "instanceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setInstanceTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "instanceTypes", java.util.Objects.requireNonNull(value, "instanceTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLabels(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "labels", java.util.Objects.requireNonNull(value, "labels is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeGroupName() {
        return software.amazon.jsii.Kernel.get(this, "nodeGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNodeGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nodeGroupName", java.util.Objects.requireNonNull(value, "nodeGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "nodeRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNodeRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nodeRoleArn", java.util.Objects.requireNonNull(value, "nodeRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReleaseVersion() {
        return software.amazon.jsii.Kernel.get(this, "releaseVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReleaseVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "releaseVersion", java.util.Objects.requireNonNull(value, "releaseVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksNodeGroupRemoteAccess> getRemoteAccess() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "remoteAccess", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupRemoteAccess.class))));
    }

    public void setRemoteAccess(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksNodeGroupRemoteAccess> value) {
        software.amazon.jsii.Kernel.set(this, "remoteAccess", java.util.Objects.requireNonNull(value, "remoteAccess is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksNodeGroupScalingConfig> getScalingConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "scalingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupScalingConfig.class))));
    }

    public void setScalingConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksNodeGroupScalingConfig> value) {
        software.amazon.jsii.Kernel.set(this, "scalingConfig", java.util.Objects.requireNonNull(value, "scalingConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubnetIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subnetIds", java.util.Objects.requireNonNull(value, "subnetIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.EksNodeGroupTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.EksNodeGroupTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.EksNodeGroupTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.EksNodeGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.EksNodeGroup> {
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
        private final imports.aws.EksNodeGroupConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.EksNodeGroupConfig.Builder();
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
         * @param clusterName This parameter is required.
         */
        public Builder clusterName(final java.lang.String clusterName) {
            this.config.clusterName(clusterName);
            return this;
        }

        /**
         * @return {@code this}
         * @param nodeGroupName This parameter is required.
         */
        public Builder nodeGroupName(final java.lang.String nodeGroupName) {
            this.config.nodeGroupName(nodeGroupName);
            return this;
        }

        /**
         * @return {@code this}
         * @param nodeRoleArn This parameter is required.
         */
        public Builder nodeRoleArn(final java.lang.String nodeRoleArn) {
            this.config.nodeRoleArn(nodeRoleArn);
            return this;
        }

        /**
         * scaling_config block.
         * <p>
         * @return {@code this}
         * @param scalingConfig scaling_config block. This parameter is required.
         */
        public Builder scalingConfig(final java.util.List<? extends imports.aws.EksNodeGroupScalingConfig> scalingConfig) {
            this.config.scalingConfig(scalingConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param subnetIds This parameter is required.
         */
        public Builder subnetIds(final java.util.List<java.lang.String> subnetIds) {
            this.config.subnetIds(subnetIds);
            return this;
        }

        /**
         * @return {@code this}
         * @param amiType This parameter is required.
         */
        public Builder amiType(final java.lang.String amiType) {
            this.config.amiType(amiType);
            return this;
        }

        /**
         * @return {@code this}
         * @param diskSize This parameter is required.
         */
        public Builder diskSize(final java.lang.Number diskSize) {
            this.config.diskSize(diskSize);
            return this;
        }

        /**
         * @return {@code this}
         * @param forceUpdateVersion This parameter is required.
         */
        public Builder forceUpdateVersion(final java.lang.Boolean forceUpdateVersion) {
            this.config.forceUpdateVersion(forceUpdateVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceTypes This parameter is required.
         */
        public Builder instanceTypes(final java.util.List<java.lang.String> instanceTypes) {
            this.config.instanceTypes(instanceTypes);
            return this;
        }

        /**
         * @return {@code this}
         * @param labels This parameter is required.
         */
        public Builder labels(final java.util.Map<java.lang.String, java.lang.String> labels) {
            this.config.labels(labels);
            return this;
        }

        /**
         * @return {@code this}
         * @param releaseVersion This parameter is required.
         */
        public Builder releaseVersion(final java.lang.String releaseVersion) {
            this.config.releaseVersion(releaseVersion);
            return this;
        }

        /**
         * remote_access block.
         * <p>
         * @return {@code this}
         * @param remoteAccess remote_access block. This parameter is required.
         */
        public Builder remoteAccess(final java.util.List<? extends imports.aws.EksNodeGroupRemoteAccess> remoteAccess) {
            this.config.remoteAccess(remoteAccess);
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
        public Builder timeouts(final imports.aws.EksNodeGroupTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @return {@code this}
         * @param version This parameter is required.
         */
        public Builder version(final java.lang.String version) {
            this.config.version(version);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.EksNodeGroup}.
         */
        @Override
        public imports.aws.EksNodeGroup build() {
            return new imports.aws.EksNodeGroup(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
