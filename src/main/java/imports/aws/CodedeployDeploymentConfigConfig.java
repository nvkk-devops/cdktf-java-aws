package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.174Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentConfigConfig")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentConfigConfig.Jsii$Proxy.class)
public interface CodedeployDeploymentConfigConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDeploymentConfigName();

    default @org.jetbrains.annotations.Nullable java.lang.String getComputePlatform() {
        return null;
    }

    /**
     * minimum_healthy_hosts block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> getMinimumHealthyHosts() {
        return null;
    }

    /**
     * traffic_routing_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> getTrafficRoutingConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentConfigConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentConfigConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentConfigConfig> {
        private java.lang.String deploymentConfigName;
        private java.lang.String computePlatform;
        private java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> minimumHealthyHosts;
        private java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> trafficRoutingConfig;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getDeploymentConfigName}
         * @param deploymentConfigName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder deploymentConfigName(java.lang.String deploymentConfigName) {
            this.deploymentConfigName = deploymentConfigName;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getComputePlatform}
         * @param computePlatform the value to be set.
         * @return {@code this}
         */
        public Builder computePlatform(java.lang.String computePlatform) {
            this.computePlatform = computePlatform;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getMinimumHealthyHosts}
         * @param minimumHealthyHosts minimum_healthy_hosts block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder minimumHealthyHosts(java.util.List<? extends imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> minimumHealthyHosts) {
            this.minimumHealthyHosts = (java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts>)minimumHealthyHosts;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getTrafficRoutingConfig}
         * @param trafficRoutingConfig traffic_routing_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder trafficRoutingConfig(java.util.List<? extends imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> trafficRoutingConfig) {
            this.trafficRoutingConfig = (java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig>)trafficRoutingConfig;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getDependsOn}
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
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigConfig#getProvider}
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
         * @return a new instance of {@link CodedeployDeploymentConfigConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentConfigConfig build() {
            return new Jsii$Proxy(deploymentConfigName, computePlatform, minimumHealthyHosts, trafficRoutingConfig, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentConfigConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentConfigConfig {
        private final java.lang.String deploymentConfigName;
        private final java.lang.String computePlatform;
        private final java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> minimumHealthyHosts;
        private final java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> trafficRoutingConfig;
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
            this.deploymentConfigName = software.amazon.jsii.Kernel.get(this, "deploymentConfigName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.computePlatform = software.amazon.jsii.Kernel.get(this, "computePlatform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minimumHealthyHosts = software.amazon.jsii.Kernel.get(this, "minimumHealthyHosts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts.class)));
            this.trafficRoutingConfig = software.amazon.jsii.Kernel.get(this, "trafficRoutingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String deploymentConfigName, final java.lang.String computePlatform, final java.util.List<? extends imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> minimumHealthyHosts, final java.util.List<? extends imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> trafficRoutingConfig, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deploymentConfigName = java.util.Objects.requireNonNull(deploymentConfigName, "deploymentConfigName is required");
            this.computePlatform = computePlatform;
            this.minimumHealthyHosts = (java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts>)minimumHealthyHosts;
            this.trafficRoutingConfig = (java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig>)trafficRoutingConfig;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDeploymentConfigName() {
            return this.deploymentConfigName;
        }

        @Override
        public final java.lang.String getComputePlatform() {
            return this.computePlatform;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentConfigMinimumHealthyHosts> getMinimumHealthyHosts() {
            return this.minimumHealthyHosts;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfig> getTrafficRoutingConfig() {
            return this.trafficRoutingConfig;
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

            data.set("deploymentConfigName", om.valueToTree(this.getDeploymentConfigName()));
            if (this.getComputePlatform() != null) {
                data.set("computePlatform", om.valueToTree(this.getComputePlatform()));
            }
            if (this.getMinimumHealthyHosts() != null) {
                data.set("minimumHealthyHosts", om.valueToTree(this.getMinimumHealthyHosts()));
            }
            if (this.getTrafficRoutingConfig() != null) {
                data.set("trafficRoutingConfig", om.valueToTree(this.getTrafficRoutingConfig()));
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
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentConfigConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentConfigConfig.Jsii$Proxy that = (CodedeployDeploymentConfigConfig.Jsii$Proxy) o;

            if (!deploymentConfigName.equals(that.deploymentConfigName)) return false;
            if (this.computePlatform != null ? !this.computePlatform.equals(that.computePlatform) : that.computePlatform != null) return false;
            if (this.minimumHealthyHosts != null ? !this.minimumHealthyHosts.equals(that.minimumHealthyHosts) : that.minimumHealthyHosts != null) return false;
            if (this.trafficRoutingConfig != null ? !this.trafficRoutingConfig.equals(that.trafficRoutingConfig) : that.trafficRoutingConfig != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deploymentConfigName.hashCode();
            result = 31 * result + (this.computePlatform != null ? this.computePlatform.hashCode() : 0);
            result = 31 * result + (this.minimumHealthyHosts != null ? this.minimumHealthyHosts.hashCode() : 0);
            result = 31 * result + (this.trafficRoutingConfig != null ? this.trafficRoutingConfig.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
