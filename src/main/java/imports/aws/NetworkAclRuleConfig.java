package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.731Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.NetworkAclRuleConfig")
@software.amazon.jsii.Jsii.Proxy(NetworkAclRuleConfig.Jsii$Proxy.class)
public interface NetworkAclRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getNetworkAclId();

    @org.jetbrains.annotations.NotNull java.lang.String getProtocol();

    @org.jetbrains.annotations.NotNull java.lang.String getRuleAction();

    @org.jetbrains.annotations.NotNull java.lang.Number getRuleNumber();

    default @org.jetbrains.annotations.Nullable java.lang.String getCidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEgress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getFromPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIcmpCode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIcmpType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIpv6CidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getToPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkAclRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkAclRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkAclRuleConfig> {
        private java.lang.String networkAclId;
        private java.lang.String protocol;
        private java.lang.String ruleAction;
        private java.lang.Number ruleNumber;
        private java.lang.String cidrBlock;
        private java.lang.Boolean egress;
        private java.lang.Number fromPort;
        private java.lang.String icmpCode;
        private java.lang.String icmpType;
        private java.lang.String ipv6CidrBlock;
        private java.lang.Number toPort;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getNetworkAclId}
         * @param networkAclId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder networkAclId(java.lang.String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getProtocol}
         * @param protocol the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getRuleAction}
         * @param ruleAction the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleAction(java.lang.String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getRuleNumber}
         * @param ruleNumber the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleNumber(java.lang.Number ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getCidrBlock}
         * @param cidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder cidrBlock(java.lang.String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getEgress}
         * @param egress the value to be set.
         * @return {@code this}
         */
        public Builder egress(java.lang.Boolean egress) {
            this.egress = egress;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getFromPort}
         * @param fromPort the value to be set.
         * @return {@code this}
         */
        public Builder fromPort(java.lang.Number fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getIcmpCode}
         * @param icmpCode the value to be set.
         * @return {@code this}
         */
        public Builder icmpCode(java.lang.String icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getIcmpType}
         * @param icmpType the value to be set.
         * @return {@code this}
         */
        public Builder icmpType(java.lang.String icmpType) {
            this.icmpType = icmpType;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getIpv6CidrBlock}
         * @param ipv6CidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder ipv6CidrBlock(java.lang.String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getToPort}
         * @param toPort the value to be set.
         * @return {@code this}
         */
        public Builder toPort(java.lang.Number toPort) {
            this.toPort = toPort;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getDependsOn}
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
         * Sets the value of {@link NetworkAclRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link NetworkAclRuleConfig#getProvider}
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
         * @return a new instance of {@link NetworkAclRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkAclRuleConfig build() {
            return new Jsii$Proxy(networkAclId, protocol, ruleAction, ruleNumber, cidrBlock, egress, fromPort, icmpCode, icmpType, ipv6CidrBlock, toPort, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link NetworkAclRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkAclRuleConfig {
        private final java.lang.String networkAclId;
        private final java.lang.String protocol;
        private final java.lang.String ruleAction;
        private final java.lang.Number ruleNumber;
        private final java.lang.String cidrBlock;
        private final java.lang.Boolean egress;
        private final java.lang.Number fromPort;
        private final java.lang.String icmpCode;
        private final java.lang.String icmpType;
        private final java.lang.String ipv6CidrBlock;
        private final java.lang.Number toPort;
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
            this.networkAclId = software.amazon.jsii.Kernel.get(this, "networkAclId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleAction = software.amazon.jsii.Kernel.get(this, "ruleAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleNumber = software.amazon.jsii.Kernel.get(this, "ruleNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cidrBlock = software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.egress = software.amazon.jsii.Kernel.get(this, "egress", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.fromPort = software.amazon.jsii.Kernel.get(this, "fromPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.icmpCode = software.amazon.jsii.Kernel.get(this, "icmpCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.icmpType = software.amazon.jsii.Kernel.get(this, "icmpType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipv6CidrBlock = software.amazon.jsii.Kernel.get(this, "ipv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.toPort = software.amazon.jsii.Kernel.get(this, "toPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String networkAclId, final java.lang.String protocol, final java.lang.String ruleAction, final java.lang.Number ruleNumber, final java.lang.String cidrBlock, final java.lang.Boolean egress, final java.lang.Number fromPort, final java.lang.String icmpCode, final java.lang.String icmpType, final java.lang.String ipv6CidrBlock, final java.lang.Number toPort, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.networkAclId = java.util.Objects.requireNonNull(networkAclId, "networkAclId is required");
            this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
            this.ruleAction = java.util.Objects.requireNonNull(ruleAction, "ruleAction is required");
            this.ruleNumber = java.util.Objects.requireNonNull(ruleNumber, "ruleNumber is required");
            this.cidrBlock = cidrBlock;
            this.egress = egress;
            this.fromPort = fromPort;
            this.icmpCode = icmpCode;
            this.icmpType = icmpType;
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.toPort = toPort;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getNetworkAclId() {
            return this.networkAclId;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.String getRuleAction() {
            return this.ruleAction;
        }

        @Override
        public final java.lang.Number getRuleNumber() {
            return this.ruleNumber;
        }

        @Override
        public final java.lang.String getCidrBlock() {
            return this.cidrBlock;
        }

        @Override
        public final java.lang.Boolean getEgress() {
            return this.egress;
        }

        @Override
        public final java.lang.Number getFromPort() {
            return this.fromPort;
        }

        @Override
        public final java.lang.String getIcmpCode() {
            return this.icmpCode;
        }

        @Override
        public final java.lang.String getIcmpType() {
            return this.icmpType;
        }

        @Override
        public final java.lang.String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        @Override
        public final java.lang.Number getToPort() {
            return this.toPort;
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

            data.set("networkAclId", om.valueToTree(this.getNetworkAclId()));
            data.set("protocol", om.valueToTree(this.getProtocol()));
            data.set("ruleAction", om.valueToTree(this.getRuleAction()));
            data.set("ruleNumber", om.valueToTree(this.getRuleNumber()));
            if (this.getCidrBlock() != null) {
                data.set("cidrBlock", om.valueToTree(this.getCidrBlock()));
            }
            if (this.getEgress() != null) {
                data.set("egress", om.valueToTree(this.getEgress()));
            }
            if (this.getFromPort() != null) {
                data.set("fromPort", om.valueToTree(this.getFromPort()));
            }
            if (this.getIcmpCode() != null) {
                data.set("icmpCode", om.valueToTree(this.getIcmpCode()));
            }
            if (this.getIcmpType() != null) {
                data.set("icmpType", om.valueToTree(this.getIcmpType()));
            }
            if (this.getIpv6CidrBlock() != null) {
                data.set("ipv6CidrBlock", om.valueToTree(this.getIpv6CidrBlock()));
            }
            if (this.getToPort() != null) {
                data.set("toPort", om.valueToTree(this.getToPort()));
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
            struct.set("fqn", om.valueToTree("aws.NetworkAclRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkAclRuleConfig.Jsii$Proxy that = (NetworkAclRuleConfig.Jsii$Proxy) o;

            if (!networkAclId.equals(that.networkAclId)) return false;
            if (!protocol.equals(that.protocol)) return false;
            if (!ruleAction.equals(that.ruleAction)) return false;
            if (!ruleNumber.equals(that.ruleNumber)) return false;
            if (this.cidrBlock != null ? !this.cidrBlock.equals(that.cidrBlock) : that.cidrBlock != null) return false;
            if (this.egress != null ? !this.egress.equals(that.egress) : that.egress != null) return false;
            if (this.fromPort != null ? !this.fromPort.equals(that.fromPort) : that.fromPort != null) return false;
            if (this.icmpCode != null ? !this.icmpCode.equals(that.icmpCode) : that.icmpCode != null) return false;
            if (this.icmpType != null ? !this.icmpType.equals(that.icmpType) : that.icmpType != null) return false;
            if (this.ipv6CidrBlock != null ? !this.ipv6CidrBlock.equals(that.ipv6CidrBlock) : that.ipv6CidrBlock != null) return false;
            if (this.toPort != null ? !this.toPort.equals(that.toPort) : that.toPort != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.networkAclId.hashCode();
            result = 31 * result + (this.protocol.hashCode());
            result = 31 * result + (this.ruleAction.hashCode());
            result = 31 * result + (this.ruleNumber.hashCode());
            result = 31 * result + (this.cidrBlock != null ? this.cidrBlock.hashCode() : 0);
            result = 31 * result + (this.egress != null ? this.egress.hashCode() : 0);
            result = 31 * result + (this.fromPort != null ? this.fromPort.hashCode() : 0);
            result = 31 * result + (this.icmpCode != null ? this.icmpCode.hashCode() : 0);
            result = 31 * result + (this.icmpType != null ? this.icmpType.hashCode() : 0);
            result = 31 * result + (this.ipv6CidrBlock != null ? this.ipv6CidrBlock.hashCode() : 0);
            result = 31 * result + (this.toPort != null ? this.toPort.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
