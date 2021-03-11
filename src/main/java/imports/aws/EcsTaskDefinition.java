package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.516Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsTaskDefinition")
public class EcsTaskDefinition extends com.hashicorp.cdktf.TerraformResource {

    protected EcsTaskDefinition(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsTaskDefinition(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public EcsTaskDefinition(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.EcsTaskDefinitionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCpu() {
        software.amazon.jsii.Kernel.call(this, "resetCpu", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExecutionRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetExecutionRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInferenceAccelerator() {
        software.amazon.jsii.Kernel.call(this, "resetInferenceAccelerator", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpcMode() {
        software.amazon.jsii.Kernel.call(this, "resetIpcMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMemory() {
        software.amazon.jsii.Kernel.call(this, "resetMemory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetworkMode() {
        software.amazon.jsii.Kernel.call(this, "resetNetworkMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPidMode() {
        software.amazon.jsii.Kernel.call(this, "resetPidMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlacementConstraints() {
        software.amazon.jsii.Kernel.call(this, "resetPlacementConstraints", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProxyConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetProxyConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequiresCompatibilities() {
        software.amazon.jsii.Kernel.call(this, "resetRequiresCompatibilities", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTaskRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetTaskRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolume() {
        software.amazon.jsii.Kernel.call(this, "resetVolume", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContainerDefinitionsInput() {
        return software.amazon.jsii.Kernel.get(this, "containerDefinitionsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFamilyInput() {
        return software.amazon.jsii.Kernel.get(this, "familyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRevision() {
        return software.amazon.jsii.Kernel.get(this, "revision", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCpuInput() {
        return software.amazon.jsii.Kernel.get(this, "cpuInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExecutionRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator> getInferenceAcceleratorInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator>)(software.amazon.jsii.Kernel.get(this, "inferenceAcceleratorInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionInferenceAccelerator.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpcModeInput() {
        return software.amazon.jsii.Kernel.get(this, "ipcModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMemoryInput() {
        return software.amazon.jsii.Kernel.get(this, "memoryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNetworkModeInput() {
        return software.amazon.jsii.Kernel.get(this, "networkModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPidModeInput() {
        return software.amazon.jsii.Kernel.get(this, "pidModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints> getPlacementConstraintsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints>)(software.amazon.jsii.Kernel.get(this, "placementConstraintsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionPlacementConstraints.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration> getProxyConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration>)(software.amazon.jsii.Kernel.get(this, "proxyConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionProxyConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRequiresCompatibilitiesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "requiresCompatibilitiesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTaskRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "taskRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionVolume> getVolumeInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EcsTaskDefinitionVolume>)(software.amazon.jsii.Kernel.get(this, "volumeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionVolume.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContainerDefinitions() {
        return software.amazon.jsii.Kernel.get(this, "containerDefinitions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContainerDefinitions(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "containerDefinitions", java.util.Objects.requireNonNull(value, "containerDefinitions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCpu() {
        return software.amazon.jsii.Kernel.get(this, "cpu", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCpu(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cpu", java.util.Objects.requireNonNull(value, "cpu is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExecutionRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "executionRoleArn", java.util.Objects.requireNonNull(value, "executionRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFamily() {
        return software.amazon.jsii.Kernel.get(this, "family", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFamily(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "family", java.util.Objects.requireNonNull(value, "family is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator> getInferenceAccelerator() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "inferenceAccelerator", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionInferenceAccelerator.class))));
    }

    public void setInferenceAccelerator(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator> value) {
        software.amazon.jsii.Kernel.set(this, "inferenceAccelerator", java.util.Objects.requireNonNull(value, "inferenceAccelerator is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpcMode() {
        return software.amazon.jsii.Kernel.get(this, "ipcMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpcMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipcMode", java.util.Objects.requireNonNull(value, "ipcMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMemory() {
        return software.amazon.jsii.Kernel.get(this, "memory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMemory(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "memory", java.util.Objects.requireNonNull(value, "memory is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkMode() {
        return software.amazon.jsii.Kernel.get(this, "networkMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNetworkMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "networkMode", java.util.Objects.requireNonNull(value, "networkMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPidMode() {
        return software.amazon.jsii.Kernel.get(this, "pidMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPidMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pidMode", java.util.Objects.requireNonNull(value, "pidMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints> getPlacementConstraints() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "placementConstraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionPlacementConstraints.class))));
    }

    public void setPlacementConstraints(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints> value) {
        software.amazon.jsii.Kernel.set(this, "placementConstraints", java.util.Objects.requireNonNull(value, "placementConstraints is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration> getProxyConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "proxyConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionProxyConfiguration.class))));
    }

    public void setProxyConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "proxyConfiguration", java.util.Objects.requireNonNull(value, "proxyConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRequiresCompatibilities() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "requiresCompatibilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRequiresCompatibilities(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "requiresCompatibilities", java.util.Objects.requireNonNull(value, "requiresCompatibilities is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTaskRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "taskRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTaskRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "taskRoleArn", java.util.Objects.requireNonNull(value, "taskRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionVolume> getVolume() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "volume", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionVolume.class))));
    }

    public void setVolume(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EcsTaskDefinitionVolume> value) {
        software.amazon.jsii.Kernel.set(this, "volume", java.util.Objects.requireNonNull(value, "volume is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.EcsTaskDefinition}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.EcsTaskDefinition> {
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
        private final imports.aws.EcsTaskDefinitionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.EcsTaskDefinitionConfig.Builder();
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
         * @param containerDefinitions This parameter is required.
         */
        public Builder containerDefinitions(final java.lang.String containerDefinitions) {
            this.config.containerDefinitions(containerDefinitions);
            return this;
        }

        /**
         * @return {@code this}
         * @param family This parameter is required.
         */
        public Builder family(final java.lang.String family) {
            this.config.family(family);
            return this;
        }

        /**
         * @return {@code this}
         * @param cpu This parameter is required.
         */
        public Builder cpu(final java.lang.String cpu) {
            this.config.cpu(cpu);
            return this;
        }

        /**
         * @return {@code this}
         * @param executionRoleArn This parameter is required.
         */
        public Builder executionRoleArn(final java.lang.String executionRoleArn) {
            this.config.executionRoleArn(executionRoleArn);
            return this;
        }

        /**
         * inference_accelerator block.
         * <p>
         * @return {@code this}
         * @param inferenceAccelerator inference_accelerator block. This parameter is required.
         */
        public Builder inferenceAccelerator(final java.util.List<? extends imports.aws.EcsTaskDefinitionInferenceAccelerator> inferenceAccelerator) {
            this.config.inferenceAccelerator(inferenceAccelerator);
            return this;
        }

        /**
         * @return {@code this}
         * @param ipcMode This parameter is required.
         */
        public Builder ipcMode(final java.lang.String ipcMode) {
            this.config.ipcMode(ipcMode);
            return this;
        }

        /**
         * @return {@code this}
         * @param memory This parameter is required.
         */
        public Builder memory(final java.lang.String memory) {
            this.config.memory(memory);
            return this;
        }

        /**
         * @return {@code this}
         * @param networkMode This parameter is required.
         */
        public Builder networkMode(final java.lang.String networkMode) {
            this.config.networkMode(networkMode);
            return this;
        }

        /**
         * @return {@code this}
         * @param pidMode This parameter is required.
         */
        public Builder pidMode(final java.lang.String pidMode) {
            this.config.pidMode(pidMode);
            return this;
        }

        /**
         * placement_constraints block.
         * <p>
         * @return {@code this}
         * @param placementConstraints placement_constraints block. This parameter is required.
         */
        public Builder placementConstraints(final java.util.List<? extends imports.aws.EcsTaskDefinitionPlacementConstraints> placementConstraints) {
            this.config.placementConstraints(placementConstraints);
            return this;
        }

        /**
         * proxy_configuration block.
         * <p>
         * @return {@code this}
         * @param proxyConfiguration proxy_configuration block. This parameter is required.
         */
        public Builder proxyConfiguration(final java.util.List<? extends imports.aws.EcsTaskDefinitionProxyConfiguration> proxyConfiguration) {
            this.config.proxyConfiguration(proxyConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param requiresCompatibilities This parameter is required.
         */
        public Builder requiresCompatibilities(final java.util.List<java.lang.String> requiresCompatibilities) {
            this.config.requiresCompatibilities(requiresCompatibilities);
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
         * @return {@code this}
         * @param taskRoleArn This parameter is required.
         */
        public Builder taskRoleArn(final java.lang.String taskRoleArn) {
            this.config.taskRoleArn(taskRoleArn);
            return this;
        }

        /**
         * volume block.
         * <p>
         * @return {@code this}
         * @param volume volume block. This parameter is required.
         */
        public Builder volume(final java.util.List<? extends imports.aws.EcsTaskDefinitionVolume> volume) {
            this.config.volume(volume);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.EcsTaskDefinition}.
         */
        @Override
        public imports.aws.EcsTaskDefinition build() {
            return new imports.aws.EcsTaskDefinition(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
