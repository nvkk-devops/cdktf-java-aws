package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.854Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SecurityGroupRuleConfig")
@software.amazon.jsii.Jsii.Proxy(SecurityGroupRuleConfig.Jsii$Proxy.class)
public interface SecurityGroupRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Number getFromPort();

    @org.jetbrains.annotations.NotNull java.lang.String getProtocol();

    @org.jetbrains.annotations.NotNull java.lang.String getSecurityGroupId();

    @org.jetbrains.annotations.NotNull java.lang.Number getToPort();

    /**
     * Type of rule, ingress (inbound) or egress (outbound).
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCidrBlocks() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpv6CidrBlocks() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPrefixListIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSelfAttribute() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceSecurityGroupId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecurityGroupRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecurityGroupRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecurityGroupRuleConfig> {
        private java.lang.Number fromPort;
        private java.lang.String protocol;
        private java.lang.String securityGroupId;
        private java.lang.Number toPort;
        private java.lang.String type;
        private java.util.List<java.lang.String> cidrBlocks;
        private java.lang.String description;
        private java.util.List<java.lang.String> ipv6CidrBlocks;
        private java.util.List<java.lang.String> prefixListIds;
        private java.lang.Boolean selfAttribute;
        private java.lang.String sourceSecurityGroupId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getFromPort}
         * @param fromPort the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder fromPort(java.lang.Number fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getProtocol}
         * @param protocol the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getSecurityGroupId}
         * @param securityGroupId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder securityGroupId(java.lang.String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getToPort}
         * @param toPort the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder toPort(java.lang.Number toPort) {
            this.toPort = toPort;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getType}
         * @param type Type of rule, ingress (inbound) or egress (outbound). This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getCidrBlocks}
         * @param cidrBlocks the value to be set.
         * @return {@code this}
         */
        public Builder cidrBlocks(java.util.List<java.lang.String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getIpv6CidrBlocks}
         * @param ipv6CidrBlocks the value to be set.
         * @return {@code this}
         */
        public Builder ipv6CidrBlocks(java.util.List<java.lang.String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getPrefixListIds}
         * @param prefixListIds the value to be set.
         * @return {@code this}
         */
        public Builder prefixListIds(java.util.List<java.lang.String> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getSelfAttribute}
         * @param selfAttribute the value to be set.
         * @return {@code this}
         */
        public Builder selfAttribute(java.lang.Boolean selfAttribute) {
            this.selfAttribute = selfAttribute;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getSourceSecurityGroupId}
         * @param sourceSecurityGroupId the value to be set.
         * @return {@code this}
         */
        public Builder sourceSecurityGroupId(java.lang.String sourceSecurityGroupId) {
            this.sourceSecurityGroupId = sourceSecurityGroupId;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getDependsOn}
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
         * Sets the value of {@link SecurityGroupRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupRuleConfig#getProvider}
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
         * @return a new instance of {@link SecurityGroupRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecurityGroupRuleConfig build() {
            return new Jsii$Proxy(fromPort, protocol, securityGroupId, toPort, type, cidrBlocks, description, ipv6CidrBlocks, prefixListIds, selfAttribute, sourceSecurityGroupId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SecurityGroupRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecurityGroupRuleConfig {
        private final java.lang.Number fromPort;
        private final java.lang.String protocol;
        private final java.lang.String securityGroupId;
        private final java.lang.Number toPort;
        private final java.lang.String type;
        private final java.util.List<java.lang.String> cidrBlocks;
        private final java.lang.String description;
        private final java.util.List<java.lang.String> ipv6CidrBlocks;
        private final java.util.List<java.lang.String> prefixListIds;
        private final java.lang.Boolean selfAttribute;
        private final java.lang.String sourceSecurityGroupId;
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
            this.fromPort = software.amazon.jsii.Kernel.get(this, "fromPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupId = software.amazon.jsii.Kernel.get(this, "securityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.toPort = software.amazon.jsii.Kernel.get(this, "toPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cidrBlocks = software.amazon.jsii.Kernel.get(this, "cidrBlocks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipv6CidrBlocks = software.amazon.jsii.Kernel.get(this, "ipv6CidrBlocks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.prefixListIds = software.amazon.jsii.Kernel.get(this, "prefixListIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.selfAttribute = software.amazon.jsii.Kernel.get(this, "selfAttribute", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.sourceSecurityGroupId = software.amazon.jsii.Kernel.get(this, "sourceSecurityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number fromPort, final java.lang.String protocol, final java.lang.String securityGroupId, final java.lang.Number toPort, final java.lang.String type, final java.util.List<java.lang.String> cidrBlocks, final java.lang.String description, final java.util.List<java.lang.String> ipv6CidrBlocks, final java.util.List<java.lang.String> prefixListIds, final java.lang.Boolean selfAttribute, final java.lang.String sourceSecurityGroupId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fromPort = java.util.Objects.requireNonNull(fromPort, "fromPort is required");
            this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
            this.securityGroupId = java.util.Objects.requireNonNull(securityGroupId, "securityGroupId is required");
            this.toPort = java.util.Objects.requireNonNull(toPort, "toPort is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.cidrBlocks = cidrBlocks;
            this.description = description;
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            this.prefixListIds = prefixListIds;
            this.selfAttribute = selfAttribute;
            this.sourceSecurityGroupId = sourceSecurityGroupId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getFromPort() {
            return this.fromPort;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.String getSecurityGroupId() {
            return this.securityGroupId;
        }

        @Override
        public final java.lang.Number getToPort() {
            return this.toPort;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<java.lang.String> getCidrBlocks() {
            return this.cidrBlocks;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<java.lang.String> getIpv6CidrBlocks() {
            return this.ipv6CidrBlocks;
        }

        @Override
        public final java.util.List<java.lang.String> getPrefixListIds() {
            return this.prefixListIds;
        }

        @Override
        public final java.lang.Boolean getSelfAttribute() {
            return this.selfAttribute;
        }

        @Override
        public final java.lang.String getSourceSecurityGroupId() {
            return this.sourceSecurityGroupId;
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

            data.set("fromPort", om.valueToTree(this.getFromPort()));
            data.set("protocol", om.valueToTree(this.getProtocol()));
            data.set("securityGroupId", om.valueToTree(this.getSecurityGroupId()));
            data.set("toPort", om.valueToTree(this.getToPort()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getCidrBlocks() != null) {
                data.set("cidrBlocks", om.valueToTree(this.getCidrBlocks()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getIpv6CidrBlocks() != null) {
                data.set("ipv6CidrBlocks", om.valueToTree(this.getIpv6CidrBlocks()));
            }
            if (this.getPrefixListIds() != null) {
                data.set("prefixListIds", om.valueToTree(this.getPrefixListIds()));
            }
            if (this.getSelfAttribute() != null) {
                data.set("selfAttribute", om.valueToTree(this.getSelfAttribute()));
            }
            if (this.getSourceSecurityGroupId() != null) {
                data.set("sourceSecurityGroupId", om.valueToTree(this.getSourceSecurityGroupId()));
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
            struct.set("fqn", om.valueToTree("aws.SecurityGroupRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecurityGroupRuleConfig.Jsii$Proxy that = (SecurityGroupRuleConfig.Jsii$Proxy) o;

            if (!fromPort.equals(that.fromPort)) return false;
            if (!protocol.equals(that.protocol)) return false;
            if (!securityGroupId.equals(that.securityGroupId)) return false;
            if (!toPort.equals(that.toPort)) return false;
            if (!type.equals(that.type)) return false;
            if (this.cidrBlocks != null ? !this.cidrBlocks.equals(that.cidrBlocks) : that.cidrBlocks != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.ipv6CidrBlocks != null ? !this.ipv6CidrBlocks.equals(that.ipv6CidrBlocks) : that.ipv6CidrBlocks != null) return false;
            if (this.prefixListIds != null ? !this.prefixListIds.equals(that.prefixListIds) : that.prefixListIds != null) return false;
            if (this.selfAttribute != null ? !this.selfAttribute.equals(that.selfAttribute) : that.selfAttribute != null) return false;
            if (this.sourceSecurityGroupId != null ? !this.sourceSecurityGroupId.equals(that.sourceSecurityGroupId) : that.sourceSecurityGroupId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fromPort.hashCode();
            result = 31 * result + (this.protocol.hashCode());
            result = 31 * result + (this.securityGroupId.hashCode());
            result = 31 * result + (this.toPort.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.cidrBlocks != null ? this.cidrBlocks.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.ipv6CidrBlocks != null ? this.ipv6CidrBlocks.hashCode() : 0);
            result = 31 * result + (this.prefixListIds != null ? this.prefixListIds.hashCode() : 0);
            result = 31 * result + (this.selfAttribute != null ? this.selfAttribute.hashCode() : 0);
            result = 31 * result + (this.sourceSecurityGroupId != null ? this.sourceSecurityGroupId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
