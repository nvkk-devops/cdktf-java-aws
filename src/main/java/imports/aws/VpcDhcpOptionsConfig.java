package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.916Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcDhcpOptionsConfig")
@software.amazon.jsii.Jsii.Proxy(VpcDhcpOptionsConfig.Jsii$Proxy.class)
public interface VpcDhcpOptionsConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getDomainName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDomainNameServers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNetbiosNameServers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNetbiosNodeType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNtpServers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcDhcpOptionsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcDhcpOptionsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcDhcpOptionsConfig> {
        private java.lang.String domainName;
        private java.util.List<java.lang.String> domainNameServers;
        private java.util.List<java.lang.String> netbiosNameServers;
        private java.lang.String netbiosNodeType;
        private java.util.List<java.lang.String> ntpServers;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getDomainName}
         * @param domainName the value to be set.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getDomainNameServers}
         * @param domainNameServers the value to be set.
         * @return {@code this}
         */
        public Builder domainNameServers(java.util.List<java.lang.String> domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getNetbiosNameServers}
         * @param netbiosNameServers the value to be set.
         * @return {@code this}
         */
        public Builder netbiosNameServers(java.util.List<java.lang.String> netbiosNameServers) {
            this.netbiosNameServers = netbiosNameServers;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getNetbiosNodeType}
         * @param netbiosNodeType the value to be set.
         * @return {@code this}
         */
        public Builder netbiosNodeType(java.lang.String netbiosNodeType) {
            this.netbiosNodeType = netbiosNodeType;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getNtpServers}
         * @param ntpServers the value to be set.
         * @return {@code this}
         */
        public Builder ntpServers(java.util.List<java.lang.String> ntpServers) {
            this.ntpServers = ntpServers;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getDependsOn}
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
         * Sets the value of {@link VpcDhcpOptionsConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VpcDhcpOptionsConfig#getProvider}
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
         * @return a new instance of {@link VpcDhcpOptionsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcDhcpOptionsConfig build() {
            return new Jsii$Proxy(domainName, domainNameServers, netbiosNameServers, netbiosNodeType, ntpServers, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link VpcDhcpOptionsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcDhcpOptionsConfig {
        private final java.lang.String domainName;
        private final java.util.List<java.lang.String> domainNameServers;
        private final java.util.List<java.lang.String> netbiosNameServers;
        private final java.lang.String netbiosNodeType;
        private final java.util.List<java.lang.String> ntpServers;
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
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.domainNameServers = software.amazon.jsii.Kernel.get(this, "domainNameServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.netbiosNameServers = software.amazon.jsii.Kernel.get(this, "netbiosNameServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.netbiosNodeType = software.amazon.jsii.Kernel.get(this, "netbiosNodeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ntpServers = software.amazon.jsii.Kernel.get(this, "ntpServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
        protected Jsii$Proxy(final java.lang.String domainName, final java.util.List<java.lang.String> domainNameServers, final java.util.List<java.lang.String> netbiosNameServers, final java.lang.String netbiosNodeType, final java.util.List<java.lang.String> ntpServers, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.domainName = domainName;
            this.domainNameServers = domainNameServers;
            this.netbiosNameServers = netbiosNameServers;
            this.netbiosNodeType = netbiosNodeType;
            this.ntpServers = ntpServers;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDomainName() {
            return this.domainName;
        }

        @Override
        public final java.util.List<java.lang.String> getDomainNameServers() {
            return this.domainNameServers;
        }

        @Override
        public final java.util.List<java.lang.String> getNetbiosNameServers() {
            return this.netbiosNameServers;
        }

        @Override
        public final java.lang.String getNetbiosNodeType() {
            return this.netbiosNodeType;
        }

        @Override
        public final java.util.List<java.lang.String> getNtpServers() {
            return this.ntpServers;
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

            if (this.getDomainName() != null) {
                data.set("domainName", om.valueToTree(this.getDomainName()));
            }
            if (this.getDomainNameServers() != null) {
                data.set("domainNameServers", om.valueToTree(this.getDomainNameServers()));
            }
            if (this.getNetbiosNameServers() != null) {
                data.set("netbiosNameServers", om.valueToTree(this.getNetbiosNameServers()));
            }
            if (this.getNetbiosNodeType() != null) {
                data.set("netbiosNodeType", om.valueToTree(this.getNetbiosNodeType()));
            }
            if (this.getNtpServers() != null) {
                data.set("ntpServers", om.valueToTree(this.getNtpServers()));
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
            struct.set("fqn", om.valueToTree("aws.VpcDhcpOptionsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcDhcpOptionsConfig.Jsii$Proxy that = (VpcDhcpOptionsConfig.Jsii$Proxy) o;

            if (this.domainName != null ? !this.domainName.equals(that.domainName) : that.domainName != null) return false;
            if (this.domainNameServers != null ? !this.domainNameServers.equals(that.domainNameServers) : that.domainNameServers != null) return false;
            if (this.netbiosNameServers != null ? !this.netbiosNameServers.equals(that.netbiosNameServers) : that.netbiosNameServers != null) return false;
            if (this.netbiosNodeType != null ? !this.netbiosNodeType.equals(that.netbiosNodeType) : that.netbiosNodeType != null) return false;
            if (this.ntpServers != null ? !this.ntpServers.equals(that.ntpServers) : that.ntpServers != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.domainName != null ? this.domainName.hashCode() : 0;
            result = 31 * result + (this.domainNameServers != null ? this.domainNameServers.hashCode() : 0);
            result = 31 * result + (this.netbiosNameServers != null ? this.netbiosNameServers.hashCode() : 0);
            result = 31 * result + (this.netbiosNodeType != null ? this.netbiosNodeType.hashCode() : 0);
            result = 31 * result + (this.ntpServers != null ? this.ntpServers.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
