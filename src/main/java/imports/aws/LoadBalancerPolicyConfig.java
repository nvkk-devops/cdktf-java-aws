package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.708Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LoadBalancerPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(LoadBalancerPolicyConfig.Jsii$Proxy.class)
public interface LoadBalancerPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerName();

    @org.jetbrains.annotations.NotNull java.lang.String getPolicyName();

    @org.jetbrains.annotations.NotNull java.lang.String getPolicyTypeName();

    /**
     * policy_attribute block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute> getPolicyAttribute() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LoadBalancerPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LoadBalancerPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LoadBalancerPolicyConfig> {
        private java.lang.String loadBalancerName;
        private java.lang.String policyName;
        private java.lang.String policyTypeName;
        private java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute> policyAttribute;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LoadBalancerPolicyConfig#getLoadBalancerName}
         * @param loadBalancerName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder loadBalancerName(java.lang.String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerPolicyConfig#getPolicyName}
         * @param policyName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder policyName(java.lang.String policyName) {
            this.policyName = policyName;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerPolicyConfig#getPolicyTypeName}
         * @param policyTypeName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder policyTypeName(java.lang.String policyTypeName) {
            this.policyTypeName = policyTypeName;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerPolicyConfig#getPolicyAttribute}
         * @param policyAttribute policy_attribute block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder policyAttribute(java.util.List<? extends imports.aws.LoadBalancerPolicyPolicyAttribute> policyAttribute) {
            this.policyAttribute = (java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute>)policyAttribute;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerPolicyConfig#getDependsOn}
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
         * Sets the value of {@link LoadBalancerPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LoadBalancerPolicyConfig#getProvider}
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
         * @return a new instance of {@link LoadBalancerPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LoadBalancerPolicyConfig build() {
            return new Jsii$Proxy(loadBalancerName, policyName, policyTypeName, policyAttribute, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LoadBalancerPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LoadBalancerPolicyConfig {
        private final java.lang.String loadBalancerName;
        private final java.lang.String policyName;
        private final java.lang.String policyTypeName;
        private final java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute> policyAttribute;
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
            this.loadBalancerName = software.amazon.jsii.Kernel.get(this, "loadBalancerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyName = software.amazon.jsii.Kernel.get(this, "policyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyTypeName = software.amazon.jsii.Kernel.get(this, "policyTypeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyAttribute = software.amazon.jsii.Kernel.get(this, "policyAttribute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LoadBalancerPolicyPolicyAttribute.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String loadBalancerName, final java.lang.String policyName, final java.lang.String policyTypeName, final java.util.List<? extends imports.aws.LoadBalancerPolicyPolicyAttribute> policyAttribute, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.loadBalancerName = java.util.Objects.requireNonNull(loadBalancerName, "loadBalancerName is required");
            this.policyName = java.util.Objects.requireNonNull(policyName, "policyName is required");
            this.policyTypeName = java.util.Objects.requireNonNull(policyTypeName, "policyTypeName is required");
            this.policyAttribute = (java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute>)policyAttribute;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        @Override
        public final java.lang.String getPolicyName() {
            return this.policyName;
        }

        @Override
        public final java.lang.String getPolicyTypeName() {
            return this.policyTypeName;
        }

        @Override
        public final java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute> getPolicyAttribute() {
            return this.policyAttribute;
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

            data.set("loadBalancerName", om.valueToTree(this.getLoadBalancerName()));
            data.set("policyName", om.valueToTree(this.getPolicyName()));
            data.set("policyTypeName", om.valueToTree(this.getPolicyTypeName()));
            if (this.getPolicyAttribute() != null) {
                data.set("policyAttribute", om.valueToTree(this.getPolicyAttribute()));
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
            struct.set("fqn", om.valueToTree("aws.LoadBalancerPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LoadBalancerPolicyConfig.Jsii$Proxy that = (LoadBalancerPolicyConfig.Jsii$Proxy) o;

            if (!loadBalancerName.equals(that.loadBalancerName)) return false;
            if (!policyName.equals(that.policyName)) return false;
            if (!policyTypeName.equals(that.policyTypeName)) return false;
            if (this.policyAttribute != null ? !this.policyAttribute.equals(that.policyAttribute) : that.policyAttribute != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.loadBalancerName.hashCode();
            result = 31 * result + (this.policyName.hashCode());
            result = 31 * result + (this.policyTypeName.hashCode());
            result = 31 * result + (this.policyAttribute != null ? this.policyAttribute.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
