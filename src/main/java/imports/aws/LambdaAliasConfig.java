package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.672Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaAliasConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaAliasConfig.Jsii$Proxy.class)
public interface LambdaAliasConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getFunctionName();

    @org.jetbrains.annotations.NotNull java.lang.String getFunctionVersion();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * routing_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaAliasRoutingConfig> getRoutingConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaAliasConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaAliasConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaAliasConfig> {
        private java.lang.String functionName;
        private java.lang.String functionVersion;
        private java.lang.String name;
        private java.lang.String description;
        private java.util.List<imports.aws.LambdaAliasRoutingConfig> routingConfig;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LambdaAliasConfig#getFunctionName}
         * @param functionName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder functionName(java.lang.String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaAliasConfig#getFunctionVersion}
         * @param functionVersion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder functionVersion(java.lang.String functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }

        /**
         * Sets the value of {@link LambdaAliasConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link LambdaAliasConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LambdaAliasConfig#getRoutingConfig}
         * @param routingConfig routing_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder routingConfig(java.util.List<? extends imports.aws.LambdaAliasRoutingConfig> routingConfig) {
            this.routingConfig = (java.util.List<imports.aws.LambdaAliasRoutingConfig>)routingConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaAliasConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LambdaAliasConfig#getDependsOn}
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
         * Sets the value of {@link LambdaAliasConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LambdaAliasConfig#getProvider}
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
         * @return a new instance of {@link LambdaAliasConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaAliasConfig build() {
            return new Jsii$Proxy(functionName, functionVersion, name, description, routingConfig, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LambdaAliasConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaAliasConfig {
        private final java.lang.String functionName;
        private final java.lang.String functionVersion;
        private final java.lang.String name;
        private final java.lang.String description;
        private final java.util.List<imports.aws.LambdaAliasRoutingConfig> routingConfig;
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
            this.functionName = software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.functionVersion = software.amazon.jsii.Kernel.get(this, "functionVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.routingConfig = software.amazon.jsii.Kernel.get(this, "routingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaAliasRoutingConfig.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String functionName, final java.lang.String functionVersion, final java.lang.String name, final java.lang.String description, final java.util.List<? extends imports.aws.LambdaAliasRoutingConfig> routingConfig, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.functionName = java.util.Objects.requireNonNull(functionName, "functionName is required");
            this.functionVersion = java.util.Objects.requireNonNull(functionVersion, "functionVersion is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.description = description;
            this.routingConfig = (java.util.List<imports.aws.LambdaAliasRoutingConfig>)routingConfig;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getFunctionName() {
            return this.functionName;
        }

        @Override
        public final java.lang.String getFunctionVersion() {
            return this.functionVersion;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.LambdaAliasRoutingConfig> getRoutingConfig() {
            return this.routingConfig;
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

            data.set("functionName", om.valueToTree(this.getFunctionName()));
            data.set("functionVersion", om.valueToTree(this.getFunctionVersion()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getRoutingConfig() != null) {
                data.set("routingConfig", om.valueToTree(this.getRoutingConfig()));
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
            struct.set("fqn", om.valueToTree("aws.LambdaAliasConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaAliasConfig.Jsii$Proxy that = (LambdaAliasConfig.Jsii$Proxy) o;

            if (!functionName.equals(that.functionName)) return false;
            if (!functionVersion.equals(that.functionVersion)) return false;
            if (!name.equals(that.name)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.routingConfig != null ? !this.routingConfig.equals(that.routingConfig) : that.routingConfig != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.functionName.hashCode();
            result = 31 * result + (this.functionVersion.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.routingConfig != null ? this.routingConfig.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
