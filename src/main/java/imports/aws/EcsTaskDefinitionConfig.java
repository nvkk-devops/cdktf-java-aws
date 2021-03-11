package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.517Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsTaskDefinitionConfig")
@software.amazon.jsii.Jsii.Proxy(EcsTaskDefinitionConfig.Jsii$Proxy.class)
public interface EcsTaskDefinitionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getContainerDefinitions();

    @org.jetbrains.annotations.NotNull java.lang.String getFamily();

    default @org.jetbrains.annotations.Nullable java.lang.String getCpu() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getExecutionRoleArn() {
        return null;
    }

    /**
     * inference_accelerator block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator> getInferenceAccelerator() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIpcMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMemory() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNetworkMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPidMode() {
        return null;
    }

    /**
     * placement_constraints block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints> getPlacementConstraints() {
        return null;
    }

    /**
     * proxy_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration> getProxyConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRequiresCompatibilities() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTaskRoleArn() {
        return null;
    }

    /**
     * volume block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionVolume> getVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsTaskDefinitionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsTaskDefinitionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsTaskDefinitionConfig> {
        private java.lang.String containerDefinitions;
        private java.lang.String family;
        private java.lang.String cpu;
        private java.lang.String executionRoleArn;
        private java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator> inferenceAccelerator;
        private java.lang.String ipcMode;
        private java.lang.String memory;
        private java.lang.String networkMode;
        private java.lang.String pidMode;
        private java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints> placementConstraints;
        private java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration> proxyConfiguration;
        private java.util.List<java.lang.String> requiresCompatibilities;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String taskRoleArn;
        private java.util.List<imports.aws.EcsTaskDefinitionVolume> volume;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getContainerDefinitions}
         * @param containerDefinitions the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder containerDefinitions(java.lang.String containerDefinitions) {
            this.containerDefinitions = containerDefinitions;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getFamily}
         * @param family the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder family(java.lang.String family) {
            this.family = family;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getCpu}
         * @param cpu the value to be set.
         * @return {@code this}
         */
        public Builder cpu(java.lang.String cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getExecutionRoleArn}
         * @param executionRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder executionRoleArn(java.lang.String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getInferenceAccelerator}
         * @param inferenceAccelerator inference_accelerator block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder inferenceAccelerator(java.util.List<? extends imports.aws.EcsTaskDefinitionInferenceAccelerator> inferenceAccelerator) {
            this.inferenceAccelerator = (java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator>)inferenceAccelerator;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getIpcMode}
         * @param ipcMode the value to be set.
         * @return {@code this}
         */
        public Builder ipcMode(java.lang.String ipcMode) {
            this.ipcMode = ipcMode;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getMemory}
         * @param memory the value to be set.
         * @return {@code this}
         */
        public Builder memory(java.lang.String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getNetworkMode}
         * @param networkMode the value to be set.
         * @return {@code this}
         */
        public Builder networkMode(java.lang.String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getPidMode}
         * @param pidMode the value to be set.
         * @return {@code this}
         */
        public Builder pidMode(java.lang.String pidMode) {
            this.pidMode = pidMode;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getPlacementConstraints}
         * @param placementConstraints placement_constraints block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder placementConstraints(java.util.List<? extends imports.aws.EcsTaskDefinitionPlacementConstraints> placementConstraints) {
            this.placementConstraints = (java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints>)placementConstraints;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getProxyConfiguration}
         * @param proxyConfiguration proxy_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder proxyConfiguration(java.util.List<? extends imports.aws.EcsTaskDefinitionProxyConfiguration> proxyConfiguration) {
            this.proxyConfiguration = (java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration>)proxyConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getRequiresCompatibilities}
         * @param requiresCompatibilities the value to be set.
         * @return {@code this}
         */
        public Builder requiresCompatibilities(java.util.List<java.lang.String> requiresCompatibilities) {
            this.requiresCompatibilities = requiresCompatibilities;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getTaskRoleArn}
         * @param taskRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder taskRoleArn(java.lang.String taskRoleArn) {
            this.taskRoleArn = taskRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getVolume}
         * @param volume volume block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volume(java.util.List<? extends imports.aws.EcsTaskDefinitionVolume> volume) {
            this.volume = (java.util.List<imports.aws.EcsTaskDefinitionVolume>)volume;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getDependsOn}
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
         * Sets the value of {@link EcsTaskDefinitionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionConfig#getProvider}
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
         * @return a new instance of {@link EcsTaskDefinitionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsTaskDefinitionConfig build() {
            return new Jsii$Proxy(containerDefinitions, family, cpu, executionRoleArn, inferenceAccelerator, ipcMode, memory, networkMode, pidMode, placementConstraints, proxyConfiguration, requiresCompatibilities, tags, taskRoleArn, volume, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EcsTaskDefinitionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsTaskDefinitionConfig {
        private final java.lang.String containerDefinitions;
        private final java.lang.String family;
        private final java.lang.String cpu;
        private final java.lang.String executionRoleArn;
        private final java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator> inferenceAccelerator;
        private final java.lang.String ipcMode;
        private final java.lang.String memory;
        private final java.lang.String networkMode;
        private final java.lang.String pidMode;
        private final java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints> placementConstraints;
        private final java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration> proxyConfiguration;
        private final java.util.List<java.lang.String> requiresCompatibilities;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String taskRoleArn;
        private final java.util.List<imports.aws.EcsTaskDefinitionVolume> volume;
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
            this.containerDefinitions = software.amazon.jsii.Kernel.get(this, "containerDefinitions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.family = software.amazon.jsii.Kernel.get(this, "family", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cpu = software.amazon.jsii.Kernel.get(this, "cpu", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.executionRoleArn = software.amazon.jsii.Kernel.get(this, "executionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inferenceAccelerator = software.amazon.jsii.Kernel.get(this, "inferenceAccelerator", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionInferenceAccelerator.class)));
            this.ipcMode = software.amazon.jsii.Kernel.get(this, "ipcMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.memory = software.amazon.jsii.Kernel.get(this, "memory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkMode = software.amazon.jsii.Kernel.get(this, "networkMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pidMode = software.amazon.jsii.Kernel.get(this, "pidMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.placementConstraints = software.amazon.jsii.Kernel.get(this, "placementConstraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionPlacementConstraints.class)));
            this.proxyConfiguration = software.amazon.jsii.Kernel.get(this, "proxyConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionProxyConfiguration.class)));
            this.requiresCompatibilities = software.amazon.jsii.Kernel.get(this, "requiresCompatibilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.taskRoleArn = software.amazon.jsii.Kernel.get(this, "taskRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volume = software.amazon.jsii.Kernel.get(this, "volume", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionVolume.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String containerDefinitions, final java.lang.String family, final java.lang.String cpu, final java.lang.String executionRoleArn, final java.util.List<? extends imports.aws.EcsTaskDefinitionInferenceAccelerator> inferenceAccelerator, final java.lang.String ipcMode, final java.lang.String memory, final java.lang.String networkMode, final java.lang.String pidMode, final java.util.List<? extends imports.aws.EcsTaskDefinitionPlacementConstraints> placementConstraints, final java.util.List<? extends imports.aws.EcsTaskDefinitionProxyConfiguration> proxyConfiguration, final java.util.List<java.lang.String> requiresCompatibilities, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String taskRoleArn, final java.util.List<? extends imports.aws.EcsTaskDefinitionVolume> volume, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.containerDefinitions = java.util.Objects.requireNonNull(containerDefinitions, "containerDefinitions is required");
            this.family = java.util.Objects.requireNonNull(family, "family is required");
            this.cpu = cpu;
            this.executionRoleArn = executionRoleArn;
            this.inferenceAccelerator = (java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator>)inferenceAccelerator;
            this.ipcMode = ipcMode;
            this.memory = memory;
            this.networkMode = networkMode;
            this.pidMode = pidMode;
            this.placementConstraints = (java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints>)placementConstraints;
            this.proxyConfiguration = (java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration>)proxyConfiguration;
            this.requiresCompatibilities = requiresCompatibilities;
            this.tags = tags;
            this.taskRoleArn = taskRoleArn;
            this.volume = (java.util.List<imports.aws.EcsTaskDefinitionVolume>)volume;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getContainerDefinitions() {
            return this.containerDefinitions;
        }

        @Override
        public final java.lang.String getFamily() {
            return this.family;
        }

        @Override
        public final java.lang.String getCpu() {
            return this.cpu;
        }

        @Override
        public final java.lang.String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        @Override
        public final java.util.List<imports.aws.EcsTaskDefinitionInferenceAccelerator> getInferenceAccelerator() {
            return this.inferenceAccelerator;
        }

        @Override
        public final java.lang.String getIpcMode() {
            return this.ipcMode;
        }

        @Override
        public final java.lang.String getMemory() {
            return this.memory;
        }

        @Override
        public final java.lang.String getNetworkMode() {
            return this.networkMode;
        }

        @Override
        public final java.lang.String getPidMode() {
            return this.pidMode;
        }

        @Override
        public final java.util.List<imports.aws.EcsTaskDefinitionPlacementConstraints> getPlacementConstraints() {
            return this.placementConstraints;
        }

        @Override
        public final java.util.List<imports.aws.EcsTaskDefinitionProxyConfiguration> getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        @Override
        public final java.util.List<java.lang.String> getRequiresCompatibilities() {
            return this.requiresCompatibilities;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTaskRoleArn() {
            return this.taskRoleArn;
        }

        @Override
        public final java.util.List<imports.aws.EcsTaskDefinitionVolume> getVolume() {
            return this.volume;
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

            data.set("containerDefinitions", om.valueToTree(this.getContainerDefinitions()));
            data.set("family", om.valueToTree(this.getFamily()));
            if (this.getCpu() != null) {
                data.set("cpu", om.valueToTree(this.getCpu()));
            }
            if (this.getExecutionRoleArn() != null) {
                data.set("executionRoleArn", om.valueToTree(this.getExecutionRoleArn()));
            }
            if (this.getInferenceAccelerator() != null) {
                data.set("inferenceAccelerator", om.valueToTree(this.getInferenceAccelerator()));
            }
            if (this.getIpcMode() != null) {
                data.set("ipcMode", om.valueToTree(this.getIpcMode()));
            }
            if (this.getMemory() != null) {
                data.set("memory", om.valueToTree(this.getMemory()));
            }
            if (this.getNetworkMode() != null) {
                data.set("networkMode", om.valueToTree(this.getNetworkMode()));
            }
            if (this.getPidMode() != null) {
                data.set("pidMode", om.valueToTree(this.getPidMode()));
            }
            if (this.getPlacementConstraints() != null) {
                data.set("placementConstraints", om.valueToTree(this.getPlacementConstraints()));
            }
            if (this.getProxyConfiguration() != null) {
                data.set("proxyConfiguration", om.valueToTree(this.getProxyConfiguration()));
            }
            if (this.getRequiresCompatibilities() != null) {
                data.set("requiresCompatibilities", om.valueToTree(this.getRequiresCompatibilities()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTaskRoleArn() != null) {
                data.set("taskRoleArn", om.valueToTree(this.getTaskRoleArn()));
            }
            if (this.getVolume() != null) {
                data.set("volume", om.valueToTree(this.getVolume()));
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
            struct.set("fqn", om.valueToTree("aws.EcsTaskDefinitionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsTaskDefinitionConfig.Jsii$Proxy that = (EcsTaskDefinitionConfig.Jsii$Proxy) o;

            if (!containerDefinitions.equals(that.containerDefinitions)) return false;
            if (!family.equals(that.family)) return false;
            if (this.cpu != null ? !this.cpu.equals(that.cpu) : that.cpu != null) return false;
            if (this.executionRoleArn != null ? !this.executionRoleArn.equals(that.executionRoleArn) : that.executionRoleArn != null) return false;
            if (this.inferenceAccelerator != null ? !this.inferenceAccelerator.equals(that.inferenceAccelerator) : that.inferenceAccelerator != null) return false;
            if (this.ipcMode != null ? !this.ipcMode.equals(that.ipcMode) : that.ipcMode != null) return false;
            if (this.memory != null ? !this.memory.equals(that.memory) : that.memory != null) return false;
            if (this.networkMode != null ? !this.networkMode.equals(that.networkMode) : that.networkMode != null) return false;
            if (this.pidMode != null ? !this.pidMode.equals(that.pidMode) : that.pidMode != null) return false;
            if (this.placementConstraints != null ? !this.placementConstraints.equals(that.placementConstraints) : that.placementConstraints != null) return false;
            if (this.proxyConfiguration != null ? !this.proxyConfiguration.equals(that.proxyConfiguration) : that.proxyConfiguration != null) return false;
            if (this.requiresCompatibilities != null ? !this.requiresCompatibilities.equals(that.requiresCompatibilities) : that.requiresCompatibilities != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.taskRoleArn != null ? !this.taskRoleArn.equals(that.taskRoleArn) : that.taskRoleArn != null) return false;
            if (this.volume != null ? !this.volume.equals(that.volume) : that.volume != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.containerDefinitions.hashCode();
            result = 31 * result + (this.family.hashCode());
            result = 31 * result + (this.cpu != null ? this.cpu.hashCode() : 0);
            result = 31 * result + (this.executionRoleArn != null ? this.executionRoleArn.hashCode() : 0);
            result = 31 * result + (this.inferenceAccelerator != null ? this.inferenceAccelerator.hashCode() : 0);
            result = 31 * result + (this.ipcMode != null ? this.ipcMode.hashCode() : 0);
            result = 31 * result + (this.memory != null ? this.memory.hashCode() : 0);
            result = 31 * result + (this.networkMode != null ? this.networkMode.hashCode() : 0);
            result = 31 * result + (this.pidMode != null ? this.pidMode.hashCode() : 0);
            result = 31 * result + (this.placementConstraints != null ? this.placementConstraints.hashCode() : 0);
            result = 31 * result + (this.proxyConfiguration != null ? this.proxyConfiguration.hashCode() : 0);
            result = 31 * result + (this.requiresCompatibilities != null ? this.requiresCompatibilities.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.taskRoleArn != null ? this.taskRoleArn.hashCode() : 0);
            result = 31 * result + (this.volume != null ? this.volume.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
