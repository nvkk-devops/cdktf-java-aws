package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.180Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodepipelineStageAction")
@software.amazon.jsii.Jsii.Proxy(CodepipelineStageAction.Jsii$Proxy.class)
public interface CodepipelineStageAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getCategory();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getOwner();

    @org.jetbrains.annotations.NotNull java.lang.String getProvider();

    @org.jetbrains.annotations.NotNull java.lang.String getVersion();

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInputArtifacts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOutputArtifacts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRunOrder() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodepipelineStageAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodepipelineStageAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodepipelineStageAction> {
        private java.lang.String category;
        private java.lang.String name;
        private java.lang.String owner;
        private java.lang.String provider;
        private java.lang.String version;
        private java.util.Map<java.lang.String, java.lang.String> configuration;
        private java.util.List<java.lang.String> inputArtifacts;
        private java.lang.String namespace;
        private java.util.List<java.lang.String> outputArtifacts;
        private java.lang.String region;
        private java.lang.String roleArn;
        private java.lang.Number runOrder;

        /**
         * Sets the value of {@link CodepipelineStageAction#getCategory}
         * @param category the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder category(java.lang.String category) {
            this.category = category;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getOwner}
         * @param owner the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder owner(java.lang.String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getProvider}
         * @param provider the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder provider(java.lang.String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getVersion}
         * @param version the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getConfiguration}
         * @param configuration the value to be set.
         * @return {@code this}
         */
        public Builder configuration(java.util.Map<java.lang.String, java.lang.String> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getInputArtifacts}
         * @param inputArtifacts the value to be set.
         * @return {@code this}
         */
        public Builder inputArtifacts(java.util.List<java.lang.String> inputArtifacts) {
            this.inputArtifacts = inputArtifacts;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getNamespace}
         * @param namespace the value to be set.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getOutputArtifacts}
         * @param outputArtifacts the value to be set.
         * @return {@code this}
         */
        public Builder outputArtifacts(java.util.List<java.lang.String> outputArtifacts) {
            this.outputArtifacts = outputArtifacts;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getRegion}
         * @param region the value to be set.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getRoleArn}
         * @param roleArn the value to be set.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineStageAction#getRunOrder}
         * @param runOrder the value to be set.
         * @return {@code this}
         */
        public Builder runOrder(java.lang.Number runOrder) {
            this.runOrder = runOrder;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodepipelineStageAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodepipelineStageAction build() {
            return new Jsii$Proxy(category, name, owner, provider, version, configuration, inputArtifacts, namespace, outputArtifacts, region, roleArn, runOrder);
        }
    }

    /**
     * An implementation for {@link CodepipelineStageAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodepipelineStageAction {
        private final java.lang.String category;
        private final java.lang.String name;
        private final java.lang.String owner;
        private final java.lang.String provider;
        private final java.lang.String version;
        private final java.util.Map<java.lang.String, java.lang.String> configuration;
        private final java.util.List<java.lang.String> inputArtifacts;
        private final java.lang.String namespace;
        private final java.util.List<java.lang.String> outputArtifacts;
        private final java.lang.String region;
        private final java.lang.String roleArn;
        private final java.lang.Number runOrder;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.category = software.amazon.jsii.Kernel.get(this, "category", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configuration = software.amazon.jsii.Kernel.get(this, "configuration", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.inputArtifacts = software.amazon.jsii.Kernel.get(this, "inputArtifacts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.outputArtifacts = software.amazon.jsii.Kernel.get(this, "outputArtifacts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runOrder = software.amazon.jsii.Kernel.get(this, "runOrder", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String category, final java.lang.String name, final java.lang.String owner, final java.lang.String provider, final java.lang.String version, final java.util.Map<java.lang.String, java.lang.String> configuration, final java.util.List<java.lang.String> inputArtifacts, final java.lang.String namespace, final java.util.List<java.lang.String> outputArtifacts, final java.lang.String region, final java.lang.String roleArn, final java.lang.Number runOrder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.category = java.util.Objects.requireNonNull(category, "category is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.owner = java.util.Objects.requireNonNull(owner, "owner is required");
            this.provider = java.util.Objects.requireNonNull(provider, "provider is required");
            this.version = java.util.Objects.requireNonNull(version, "version is required");
            this.configuration = configuration;
            this.inputArtifacts = inputArtifacts;
            this.namespace = namespace;
            this.outputArtifacts = outputArtifacts;
            this.region = region;
            this.roleArn = roleArn;
            this.runOrder = runOrder;
        }

        @Override
        public final java.lang.String getCategory() {
            return this.category;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getOwner() {
            return this.owner;
        }

        @Override
        public final java.lang.String getProvider() {
            return this.provider;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getConfiguration() {
            return this.configuration;
        }

        @Override
        public final java.util.List<java.lang.String> getInputArtifacts() {
            return this.inputArtifacts;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.util.List<java.lang.String> getOutputArtifacts() {
            return this.outputArtifacts;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.Number getRunOrder() {
            return this.runOrder;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("category", om.valueToTree(this.getCategory()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("owner", om.valueToTree(this.getOwner()));
            data.set("provider", om.valueToTree(this.getProvider()));
            data.set("version", om.valueToTree(this.getVersion()));
            if (this.getConfiguration() != null) {
                data.set("configuration", om.valueToTree(this.getConfiguration()));
            }
            if (this.getInputArtifacts() != null) {
                data.set("inputArtifacts", om.valueToTree(this.getInputArtifacts()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getOutputArtifacts() != null) {
                data.set("outputArtifacts", om.valueToTree(this.getOutputArtifacts()));
            }
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getRoleArn() != null) {
                data.set("roleArn", om.valueToTree(this.getRoleArn()));
            }
            if (this.getRunOrder() != null) {
                data.set("runOrder", om.valueToTree(this.getRunOrder()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodepipelineStageAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodepipelineStageAction.Jsii$Proxy that = (CodepipelineStageAction.Jsii$Proxy) o;

            if (!category.equals(that.category)) return false;
            if (!name.equals(that.name)) return false;
            if (!owner.equals(that.owner)) return false;
            if (!provider.equals(that.provider)) return false;
            if (!version.equals(that.version)) return false;
            if (this.configuration != null ? !this.configuration.equals(that.configuration) : that.configuration != null) return false;
            if (this.inputArtifacts != null ? !this.inputArtifacts.equals(that.inputArtifacts) : that.inputArtifacts != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.outputArtifacts != null ? !this.outputArtifacts.equals(that.outputArtifacts) : that.outputArtifacts != null) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            if (this.roleArn != null ? !this.roleArn.equals(that.roleArn) : that.roleArn != null) return false;
            return this.runOrder != null ? this.runOrder.equals(that.runOrder) : that.runOrder == null;
        }

        @Override
        public final int hashCode() {
            int result = this.category.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.owner.hashCode());
            result = 31 * result + (this.provider.hashCode());
            result = 31 * result + (this.version.hashCode());
            result = 31 * result + (this.configuration != null ? this.configuration.hashCode() : 0);
            result = 31 * result + (this.inputArtifacts != null ? this.inputArtifacts.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.outputArtifacts != null ? this.outputArtifacts.hashCode() : 0);
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.roleArn != null ? this.roleArn.hashCode() : 0);
            result = 31 * result + (this.runOrder != null ? this.runOrder.hashCode() : 0);
            return result;
        }
    }
}
