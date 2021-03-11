package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.707Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LoadBalancerBackendServerPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(LoadBalancerBackendServerPolicyConfig.Jsii$Proxy.class)
public interface LoadBalancerBackendServerPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Number getInstancePort();

    @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerName();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyNames() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LoadBalancerBackendServerPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LoadBalancerBackendServerPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LoadBalancerBackendServerPolicyConfig> {
        private java.lang.Number instancePort;
        private java.lang.String loadBalancerName;
        private java.util.List<java.lang.String> policyNames;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LoadBalancerBackendServerPolicyConfig#getInstancePort}
         * @param instancePort the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instancePort(java.lang.Number instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerBackendServerPolicyConfig#getLoadBalancerName}
         * @param loadBalancerName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder loadBalancerName(java.lang.String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerBackendServerPolicyConfig#getPolicyNames}
         * @param policyNames the value to be set.
         * @return {@code this}
         */
        public Builder policyNames(java.util.List<java.lang.String> policyNames) {
            this.policyNames = policyNames;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerBackendServerPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerBackendServerPolicyConfig#getDependsOn}
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
         * Sets the value of {@link LoadBalancerBackendServerPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerBackendServerPolicyConfig#getProvider}
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
         * @return a new instance of {@link LoadBalancerBackendServerPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LoadBalancerBackendServerPolicyConfig build() {
            return new Jsii$Proxy(instancePort, loadBalancerName, policyNames, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LoadBalancerBackendServerPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LoadBalancerBackendServerPolicyConfig {
        private final java.lang.Number instancePort;
        private final java.lang.String loadBalancerName;
        private final java.util.List<java.lang.String> policyNames;
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
            this.instancePort = software.amazon.jsii.Kernel.get(this, "instancePort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.loadBalancerName = software.amazon.jsii.Kernel.get(this, "loadBalancerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyNames = software.amazon.jsii.Kernel.get(this, "policyNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number instancePort, final java.lang.String loadBalancerName, final java.util.List<java.lang.String> policyNames, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instancePort = java.util.Objects.requireNonNull(instancePort, "instancePort is required");
            this.loadBalancerName = java.util.Objects.requireNonNull(loadBalancerName, "loadBalancerName is required");
            this.policyNames = policyNames;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getInstancePort() {
            return this.instancePort;
        }

        @Override
        public final java.lang.String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        @Override
        public final java.util.List<java.lang.String> getPolicyNames() {
            return this.policyNames;
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

            data.set("instancePort", om.valueToTree(this.getInstancePort()));
            data.set("loadBalancerName", om.valueToTree(this.getLoadBalancerName()));
            if (this.getPolicyNames() != null) {
                data.set("policyNames", om.valueToTree(this.getPolicyNames()));
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
            struct.set("fqn", om.valueToTree("aws.LoadBalancerBackendServerPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LoadBalancerBackendServerPolicyConfig.Jsii$Proxy that = (LoadBalancerBackendServerPolicyConfig.Jsii$Proxy) o;

            if (!instancePort.equals(that.instancePort)) return false;
            if (!loadBalancerName.equals(that.loadBalancerName)) return false;
            if (this.policyNames != null ? !this.policyNames.equals(that.policyNames) : that.policyNames != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instancePort.hashCode();
            result = 31 * result + (this.loadBalancerName.hashCode());
            result = 31 * result + (this.policyNames != null ? this.policyNames.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
