package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.650Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationConfig")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationConfig.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * cloudwatch_logging_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * inputs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputs> getInputs() {
        return null;
    }

    /**
     * outputs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs> getOutputs() {
        return null;
    }

    /**
     * reference_data_sources block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources> getReferenceDataSources() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationConfig> {
        private java.lang.String name;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private java.lang.String code;
        private java.lang.String description;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputs> inputs;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs> outputs;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources> referenceDataSources;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getCloudwatchLoggingOptions}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLoggingOptions(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getCode}
         * @param code the value to be set.
         * @return {@code this}
         */
        public Builder code(java.lang.String code) {
            this.code = code;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getInputs}
         * @param inputs inputs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder inputs(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputs> inputs) {
            this.inputs = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputs>)inputs;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getOutputs}
         * @param outputs outputs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder outputs(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputs> outputs) {
            this.outputs = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs>)outputs;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getReferenceDataSources}
         * @param referenceDataSources reference_data_sources block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder referenceDataSources(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSources> referenceDataSources) {
            this.referenceDataSources = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources>)referenceDataSources;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getDependsOn}
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
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationConfig#getProvider}
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
         * @return a new instance of {@link KinesisAnalyticsApplicationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationConfig build() {
            return new Jsii$Proxy(name, cloudwatchLoggingOptions, code, description, inputs, outputs, referenceDataSources, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationConfig {
        private final java.lang.String name;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private final java.lang.String code;
        private final java.lang.String description;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputs> inputs;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs> outputs;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources> referenceDataSources;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLoggingOptions = software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions.class)));
            this.code = software.amazon.jsii.Kernel.get(this, "code", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inputs = software.amazon.jsii.Kernel.get(this, "inputs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputs.class)));
            this.outputs = software.amazon.jsii.Kernel.get(this, "outputs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationOutputs.class)));
            this.referenceDataSources = software.amazon.jsii.Kernel.get(this, "referenceDataSources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationReferenceDataSources.class)));
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
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions, final java.lang.String code, final java.lang.String description, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputs> inputs, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputs> outputs, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationReferenceDataSources> referenceDataSources, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            this.code = code;
            this.description = description;
            this.inputs = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputs>)inputs;
            this.outputs = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs>)outputs;
            this.referenceDataSources = (java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources>)referenceDataSources;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
            return this.cloudwatchLoggingOptions;
        }

        @Override
        public final java.lang.String getCode() {
            return this.code;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputs> getInputs() {
            return this.inputs;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputs> getOutputs() {
            return this.outputs;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationReferenceDataSources> getReferenceDataSources() {
            return this.referenceDataSources;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getCloudwatchLoggingOptions() != null) {
                data.set("cloudwatchLoggingOptions", om.valueToTree(this.getCloudwatchLoggingOptions()));
            }
            if (this.getCode() != null) {
                data.set("code", om.valueToTree(this.getCode()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getInputs() != null) {
                data.set("inputs", om.valueToTree(this.getInputs()));
            }
            if (this.getOutputs() != null) {
                data.set("outputs", om.valueToTree(this.getOutputs()));
            }
            if (this.getReferenceDataSources() != null) {
                data.set("referenceDataSources", om.valueToTree(this.getReferenceDataSources()));
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
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationConfig.Jsii$Proxy that = (KinesisAnalyticsApplicationConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.cloudwatchLoggingOptions != null ? !this.cloudwatchLoggingOptions.equals(that.cloudwatchLoggingOptions) : that.cloudwatchLoggingOptions != null) return false;
            if (this.code != null ? !this.code.equals(that.code) : that.code != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.inputs != null ? !this.inputs.equals(that.inputs) : that.inputs != null) return false;
            if (this.outputs != null ? !this.outputs.equals(that.outputs) : that.outputs != null) return false;
            if (this.referenceDataSources != null ? !this.referenceDataSources.equals(that.referenceDataSources) : that.referenceDataSources != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.cloudwatchLoggingOptions != null ? this.cloudwatchLoggingOptions.hashCode() : 0);
            result = 31 * result + (this.code != null ? this.code.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.inputs != null ? this.inputs.hashCode() : 0);
            result = 31 * result + (this.outputs != null ? this.outputs.hashCode() : 0);
            result = 31 * result + (this.referenceDataSources != null ? this.referenceDataSources.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
