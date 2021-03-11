package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.915Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcConfig")
@software.amazon.jsii.Jsii.Proxy(VpcConfig.Jsii$Proxy.class)
public interface VpcConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getCidrBlock();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAssignGeneratedIpv6CidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableClassiclink() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableClassiclinkDnsSupport() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableDnsHostnames() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableDnsSupport() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceTenancy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcConfig> {
        private java.lang.String cidrBlock;
        private java.lang.Boolean assignGeneratedIpv6CidrBlock;
        private java.lang.Boolean enableClassiclink;
        private java.lang.Boolean enableClassiclinkDnsSupport;
        private java.lang.Boolean enableDnsHostnames;
        private java.lang.Boolean enableDnsSupport;
        private java.lang.String instanceTenancy;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link VpcConfig#getCidrBlock}
         * @param cidrBlock the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder cidrBlock(java.lang.String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getAssignGeneratedIpv6CidrBlock}
         * @param assignGeneratedIpv6CidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder assignGeneratedIpv6CidrBlock(java.lang.Boolean assignGeneratedIpv6CidrBlock) {
            this.assignGeneratedIpv6CidrBlock = assignGeneratedIpv6CidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getEnableClassiclink}
         * @param enableClassiclink the value to be set.
         * @return {@code this}
         */
        public Builder enableClassiclink(java.lang.Boolean enableClassiclink) {
            this.enableClassiclink = enableClassiclink;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getEnableClassiclinkDnsSupport}
         * @param enableClassiclinkDnsSupport the value to be set.
         * @return {@code this}
         */
        public Builder enableClassiclinkDnsSupport(java.lang.Boolean enableClassiclinkDnsSupport) {
            this.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getEnableDnsHostnames}
         * @param enableDnsHostnames the value to be set.
         * @return {@code this}
         */
        public Builder enableDnsHostnames(java.lang.Boolean enableDnsHostnames) {
            this.enableDnsHostnames = enableDnsHostnames;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getEnableDnsSupport}
         * @param enableDnsSupport the value to be set.
         * @return {@code this}
         */
        public Builder enableDnsSupport(java.lang.Boolean enableDnsSupport) {
            this.enableDnsSupport = enableDnsSupport;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getInstanceTenancy}
         * @param instanceTenancy the value to be set.
         * @return {@code this}
         */
        public Builder instanceTenancy(java.lang.String instanceTenancy) {
            this.instanceTenancy = instanceTenancy;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getDependsOn}
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
         * Sets the value of {@link VpcConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VpcConfig#getProvider}
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
         * @return a new instance of {@link VpcConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcConfig build() {
            return new Jsii$Proxy(cidrBlock, assignGeneratedIpv6CidrBlock, enableClassiclink, enableClassiclinkDnsSupport, enableDnsHostnames, enableDnsSupport, instanceTenancy, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link VpcConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcConfig {
        private final java.lang.String cidrBlock;
        private final java.lang.Boolean assignGeneratedIpv6CidrBlock;
        private final java.lang.Boolean enableClassiclink;
        private final java.lang.Boolean enableClassiclinkDnsSupport;
        private final java.lang.Boolean enableDnsHostnames;
        private final java.lang.Boolean enableDnsSupport;
        private final java.lang.String instanceTenancy;
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
            this.cidrBlock = software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.assignGeneratedIpv6CidrBlock = software.amazon.jsii.Kernel.get(this, "assignGeneratedIpv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableClassiclink = software.amazon.jsii.Kernel.get(this, "enableClassiclink", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableClassiclinkDnsSupport = software.amazon.jsii.Kernel.get(this, "enableClassiclinkDnsSupport", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableDnsHostnames = software.amazon.jsii.Kernel.get(this, "enableDnsHostnames", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableDnsSupport = software.amazon.jsii.Kernel.get(this, "enableDnsSupport", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.instanceTenancy = software.amazon.jsii.Kernel.get(this, "instanceTenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String cidrBlock, final java.lang.Boolean assignGeneratedIpv6CidrBlock, final java.lang.Boolean enableClassiclink, final java.lang.Boolean enableClassiclinkDnsSupport, final java.lang.Boolean enableDnsHostnames, final java.lang.Boolean enableDnsSupport, final java.lang.String instanceTenancy, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidrBlock = java.util.Objects.requireNonNull(cidrBlock, "cidrBlock is required");
            this.assignGeneratedIpv6CidrBlock = assignGeneratedIpv6CidrBlock;
            this.enableClassiclink = enableClassiclink;
            this.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
            this.enableDnsHostnames = enableDnsHostnames;
            this.enableDnsSupport = enableDnsSupport;
            this.instanceTenancy = instanceTenancy;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getCidrBlock() {
            return this.cidrBlock;
        }

        @Override
        public final java.lang.Boolean getAssignGeneratedIpv6CidrBlock() {
            return this.assignGeneratedIpv6CidrBlock;
        }

        @Override
        public final java.lang.Boolean getEnableClassiclink() {
            return this.enableClassiclink;
        }

        @Override
        public final java.lang.Boolean getEnableClassiclinkDnsSupport() {
            return this.enableClassiclinkDnsSupport;
        }

        @Override
        public final java.lang.Boolean getEnableDnsHostnames() {
            return this.enableDnsHostnames;
        }

        @Override
        public final java.lang.Boolean getEnableDnsSupport() {
            return this.enableDnsSupport;
        }

        @Override
        public final java.lang.String getInstanceTenancy() {
            return this.instanceTenancy;
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

            data.set("cidrBlock", om.valueToTree(this.getCidrBlock()));
            if (this.getAssignGeneratedIpv6CidrBlock() != null) {
                data.set("assignGeneratedIpv6CidrBlock", om.valueToTree(this.getAssignGeneratedIpv6CidrBlock()));
            }
            if (this.getEnableClassiclink() != null) {
                data.set("enableClassiclink", om.valueToTree(this.getEnableClassiclink()));
            }
            if (this.getEnableClassiclinkDnsSupport() != null) {
                data.set("enableClassiclinkDnsSupport", om.valueToTree(this.getEnableClassiclinkDnsSupport()));
            }
            if (this.getEnableDnsHostnames() != null) {
                data.set("enableDnsHostnames", om.valueToTree(this.getEnableDnsHostnames()));
            }
            if (this.getEnableDnsSupport() != null) {
                data.set("enableDnsSupport", om.valueToTree(this.getEnableDnsSupport()));
            }
            if (this.getInstanceTenancy() != null) {
                data.set("instanceTenancy", om.valueToTree(this.getInstanceTenancy()));
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
            struct.set("fqn", om.valueToTree("aws.VpcConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcConfig.Jsii$Proxy that = (VpcConfig.Jsii$Proxy) o;

            if (!cidrBlock.equals(that.cidrBlock)) return false;
            if (this.assignGeneratedIpv6CidrBlock != null ? !this.assignGeneratedIpv6CidrBlock.equals(that.assignGeneratedIpv6CidrBlock) : that.assignGeneratedIpv6CidrBlock != null) return false;
            if (this.enableClassiclink != null ? !this.enableClassiclink.equals(that.enableClassiclink) : that.enableClassiclink != null) return false;
            if (this.enableClassiclinkDnsSupport != null ? !this.enableClassiclinkDnsSupport.equals(that.enableClassiclinkDnsSupport) : that.enableClassiclinkDnsSupport != null) return false;
            if (this.enableDnsHostnames != null ? !this.enableDnsHostnames.equals(that.enableDnsHostnames) : that.enableDnsHostnames != null) return false;
            if (this.enableDnsSupport != null ? !this.enableDnsSupport.equals(that.enableDnsSupport) : that.enableDnsSupport != null) return false;
            if (this.instanceTenancy != null ? !this.instanceTenancy.equals(that.instanceTenancy) : that.instanceTenancy != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cidrBlock.hashCode();
            result = 31 * result + (this.assignGeneratedIpv6CidrBlock != null ? this.assignGeneratedIpv6CidrBlock.hashCode() : 0);
            result = 31 * result + (this.enableClassiclink != null ? this.enableClassiclink.hashCode() : 0);
            result = 31 * result + (this.enableClassiclinkDnsSupport != null ? this.enableClassiclinkDnsSupport.hashCode() : 0);
            result = 31 * result + (this.enableDnsHostnames != null ? this.enableDnsHostnames.hashCode() : 0);
            result = 31 * result + (this.enableDnsSupport != null ? this.enableDnsSupport.hashCode() : 0);
            result = 31 * result + (this.instanceTenancy != null ? this.instanceTenancy.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
