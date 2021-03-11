package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.840Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SagemakerModelConfig")
@software.amazon.jsii.Jsii.Proxy(SagemakerModelConfig.Jsii$Proxy.class)
public interface SagemakerModelConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getExecutionRoleArn();

    /**
     * container block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SagemakerModelContainer> getContainer() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableNetworkIsolation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * primary_container block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SagemakerModelPrimaryContainer> getPrimaryContainer() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * vpc_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SagemakerModelVpcConfig> getVpcConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerModelConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerModelConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerModelConfig> {
        private java.lang.String executionRoleArn;
        private java.util.List<imports.aws.SagemakerModelContainer> container;
        private java.lang.Boolean enableNetworkIsolation;
        private java.lang.String name;
        private java.util.List<imports.aws.SagemakerModelPrimaryContainer> primaryContainer;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.SagemakerModelVpcConfig> vpcConfig;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SagemakerModelConfig#getExecutionRoleArn}
         * @param executionRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder executionRoleArn(java.lang.String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getContainer}
         * @param container container block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder container(java.util.List<? extends imports.aws.SagemakerModelContainer> container) {
            this.container = (java.util.List<imports.aws.SagemakerModelContainer>)container;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getEnableNetworkIsolation}
         * @param enableNetworkIsolation the value to be set.
         * @return {@code this}
         */
        public Builder enableNetworkIsolation(java.lang.Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getPrimaryContainer}
         * @param primaryContainer primary_container block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder primaryContainer(java.util.List<? extends imports.aws.SagemakerModelPrimaryContainer> primaryContainer) {
            this.primaryContainer = (java.util.List<imports.aws.SagemakerModelPrimaryContainer>)primaryContainer;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getVpcConfig}
         * @param vpcConfig vpc_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder vpcConfig(java.util.List<? extends imports.aws.SagemakerModelVpcConfig> vpcConfig) {
            this.vpcConfig = (java.util.List<imports.aws.SagemakerModelVpcConfig>)vpcConfig;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getDependsOn}
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
         * Sets the value of {@link SagemakerModelConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelConfig#getProvider}
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
         * @return a new instance of {@link SagemakerModelConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerModelConfig build() {
            return new Jsii$Proxy(executionRoleArn, container, enableNetworkIsolation, name, primaryContainer, tags, vpcConfig, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SagemakerModelConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerModelConfig {
        private final java.lang.String executionRoleArn;
        private final java.util.List<imports.aws.SagemakerModelContainer> container;
        private final java.lang.Boolean enableNetworkIsolation;
        private final java.lang.String name;
        private final java.util.List<imports.aws.SagemakerModelPrimaryContainer> primaryContainer;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.SagemakerModelVpcConfig> vpcConfig;
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
            this.executionRoleArn = software.amazon.jsii.Kernel.get(this, "executionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.container = software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelContainer.class)));
            this.enableNetworkIsolation = software.amazon.jsii.Kernel.get(this, "enableNetworkIsolation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.primaryContainer = software.amazon.jsii.Kernel.get(this, "primaryContainer", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelPrimaryContainer.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcConfig = software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SagemakerModelVpcConfig.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String executionRoleArn, final java.util.List<? extends imports.aws.SagemakerModelContainer> container, final java.lang.Boolean enableNetworkIsolation, final java.lang.String name, final java.util.List<? extends imports.aws.SagemakerModelPrimaryContainer> primaryContainer, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.SagemakerModelVpcConfig> vpcConfig, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.executionRoleArn = java.util.Objects.requireNonNull(executionRoleArn, "executionRoleArn is required");
            this.container = (java.util.List<imports.aws.SagemakerModelContainer>)container;
            this.enableNetworkIsolation = enableNetworkIsolation;
            this.name = name;
            this.primaryContainer = (java.util.List<imports.aws.SagemakerModelPrimaryContainer>)primaryContainer;
            this.tags = tags;
            this.vpcConfig = (java.util.List<imports.aws.SagemakerModelVpcConfig>)vpcConfig;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        @Override
        public final java.util.List<imports.aws.SagemakerModelContainer> getContainer() {
            return this.container;
        }

        @Override
        public final java.lang.Boolean getEnableNetworkIsolation() {
            return this.enableNetworkIsolation;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.SagemakerModelPrimaryContainer> getPrimaryContainer() {
            return this.primaryContainer;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.SagemakerModelVpcConfig> getVpcConfig() {
            return this.vpcConfig;
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

            data.set("executionRoleArn", om.valueToTree(this.getExecutionRoleArn()));
            if (this.getContainer() != null) {
                data.set("container", om.valueToTree(this.getContainer()));
            }
            if (this.getEnableNetworkIsolation() != null) {
                data.set("enableNetworkIsolation", om.valueToTree(this.getEnableNetworkIsolation()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getPrimaryContainer() != null) {
                data.set("primaryContainer", om.valueToTree(this.getPrimaryContainer()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVpcConfig() != null) {
                data.set("vpcConfig", om.valueToTree(this.getVpcConfig()));
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
            struct.set("fqn", om.valueToTree("aws.SagemakerModelConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerModelConfig.Jsii$Proxy that = (SagemakerModelConfig.Jsii$Proxy) o;

            if (!executionRoleArn.equals(that.executionRoleArn)) return false;
            if (this.container != null ? !this.container.equals(that.container) : that.container != null) return false;
            if (this.enableNetworkIsolation != null ? !this.enableNetworkIsolation.equals(that.enableNetworkIsolation) : that.enableNetworkIsolation != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.primaryContainer != null ? !this.primaryContainer.equals(that.primaryContainer) : that.primaryContainer != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.vpcConfig != null ? !this.vpcConfig.equals(that.vpcConfig) : that.vpcConfig != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.executionRoleArn.hashCode();
            result = 31 * result + (this.container != null ? this.container.hashCode() : 0);
            result = 31 * result + (this.enableNetworkIsolation != null ? this.enableNetworkIsolation.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.primaryContainer != null ? this.primaryContainer.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.vpcConfig != null ? this.vpcConfig.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
