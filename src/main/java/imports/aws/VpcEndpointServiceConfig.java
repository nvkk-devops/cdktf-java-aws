package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.919Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcEndpointServiceConfig")
@software.amazon.jsii.Jsii.Proxy(VpcEndpointServiceConfig.Jsii$Proxy.class)
public interface VpcEndpointServiceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getAcceptanceRequired();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getNetworkLoadBalancerArns();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedPrincipals() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcEndpointServiceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcEndpointServiceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcEndpointServiceConfig> {
        private java.lang.Boolean acceptanceRequired;
        private java.util.List<java.lang.String> networkLoadBalancerArns;
        private java.util.List<java.lang.String> allowedPrincipals;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link VpcEndpointServiceConfig#getAcceptanceRequired}
         * @param acceptanceRequired the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder acceptanceRequired(java.lang.Boolean acceptanceRequired) {
            this.acceptanceRequired = acceptanceRequired;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointServiceConfig#getNetworkLoadBalancerArns}
         * @param networkLoadBalancerArns the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder networkLoadBalancerArns(java.util.List<java.lang.String> networkLoadBalancerArns) {
            this.networkLoadBalancerArns = networkLoadBalancerArns;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointServiceConfig#getAllowedPrincipals}
         * @param allowedPrincipals the value to be set.
         * @return {@code this}
         */
        public Builder allowedPrincipals(java.util.List<java.lang.String> allowedPrincipals) {
            this.allowedPrincipals = allowedPrincipals;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointServiceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointServiceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointServiceConfig#getDependsOn}
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
         * Sets the value of {@link VpcEndpointServiceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointServiceConfig#getProvider}
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
         * @return a new instance of {@link VpcEndpointServiceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcEndpointServiceConfig build() {
            return new Jsii$Proxy(acceptanceRequired, networkLoadBalancerArns, allowedPrincipals, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link VpcEndpointServiceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcEndpointServiceConfig {
        private final java.lang.Boolean acceptanceRequired;
        private final java.util.List<java.lang.String> networkLoadBalancerArns;
        private final java.util.List<java.lang.String> allowedPrincipals;
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
            this.acceptanceRequired = software.amazon.jsii.Kernel.get(this, "acceptanceRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.networkLoadBalancerArns = software.amazon.jsii.Kernel.get(this, "networkLoadBalancerArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedPrincipals = software.amazon.jsii.Kernel.get(this, "allowedPrincipals", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
        protected Jsii$Proxy(final java.lang.Boolean acceptanceRequired, final java.util.List<java.lang.String> networkLoadBalancerArns, final java.util.List<java.lang.String> allowedPrincipals, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.acceptanceRequired = java.util.Objects.requireNonNull(acceptanceRequired, "acceptanceRequired is required");
            this.networkLoadBalancerArns = java.util.Objects.requireNonNull(networkLoadBalancerArns, "networkLoadBalancerArns is required");
            this.allowedPrincipals = allowedPrincipals;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Boolean getAcceptanceRequired() {
            return this.acceptanceRequired;
        }

        @Override
        public final java.util.List<java.lang.String> getNetworkLoadBalancerArns() {
            return this.networkLoadBalancerArns;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedPrincipals() {
            return this.allowedPrincipals;
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

            data.set("acceptanceRequired", om.valueToTree(this.getAcceptanceRequired()));
            data.set("networkLoadBalancerArns", om.valueToTree(this.getNetworkLoadBalancerArns()));
            if (this.getAllowedPrincipals() != null) {
                data.set("allowedPrincipals", om.valueToTree(this.getAllowedPrincipals()));
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
            struct.set("fqn", om.valueToTree("aws.VpcEndpointServiceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcEndpointServiceConfig.Jsii$Proxy that = (VpcEndpointServiceConfig.Jsii$Proxy) o;

            if (!acceptanceRequired.equals(that.acceptanceRequired)) return false;
            if (!networkLoadBalancerArns.equals(that.networkLoadBalancerArns)) return false;
            if (this.allowedPrincipals != null ? !this.allowedPrincipals.equals(that.allowedPrincipals) : that.allowedPrincipals != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.acceptanceRequired.hashCode();
            result = 31 * result + (this.networkLoadBalancerArns.hashCode());
            result = 31 * result + (this.allowedPrincipals != null ? this.allowedPrincipals.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
