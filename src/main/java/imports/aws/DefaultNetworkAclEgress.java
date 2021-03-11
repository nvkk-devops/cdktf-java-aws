package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.425Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DefaultNetworkAclEgress")
@software.amazon.jsii.Jsii.Proxy(DefaultNetworkAclEgress.Jsii$Proxy.class)
public interface DefaultNetworkAclEgress extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAction();

    @org.jetbrains.annotations.NotNull java.lang.Number getFromPort();

    @org.jetbrains.annotations.NotNull java.lang.String getProtocol();

    @org.jetbrains.annotations.NotNull java.lang.Number getRuleNo();

    @org.jetbrains.annotations.NotNull java.lang.Number getToPort();

    default @org.jetbrains.annotations.Nullable java.lang.String getCidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIcmpCode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIcmpType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIpv6CidrBlock() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DefaultNetworkAclEgress}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DefaultNetworkAclEgress}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DefaultNetworkAclEgress> {
        private java.lang.String action;
        private java.lang.Number fromPort;
        private java.lang.String protocol;
        private java.lang.Number ruleNo;
        private java.lang.Number toPort;
        private java.lang.String cidrBlock;
        private java.lang.Number icmpCode;
        private java.lang.Number icmpType;
        private java.lang.String ipv6CidrBlock;

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getAction}
         * @param action the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder action(java.lang.String action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getFromPort}
         * @param fromPort the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder fromPort(java.lang.Number fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getProtocol}
         * @param protocol the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getRuleNo}
         * @param ruleNo the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleNo(java.lang.Number ruleNo) {
            this.ruleNo = ruleNo;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getToPort}
         * @param toPort the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder toPort(java.lang.Number toPort) {
            this.toPort = toPort;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getCidrBlock}
         * @param cidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder cidrBlock(java.lang.String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getIcmpCode}
         * @param icmpCode the value to be set.
         * @return {@code this}
         */
        public Builder icmpCode(java.lang.Number icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getIcmpType}
         * @param icmpType the value to be set.
         * @return {@code this}
         */
        public Builder icmpType(java.lang.Number icmpType) {
            this.icmpType = icmpType;
            return this;
        }

        /**
         * Sets the value of {@link DefaultNetworkAclEgress#getIpv6CidrBlock}
         * @param ipv6CidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder ipv6CidrBlock(java.lang.String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DefaultNetworkAclEgress}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DefaultNetworkAclEgress build() {
            return new Jsii$Proxy(action, fromPort, protocol, ruleNo, toPort, cidrBlock, icmpCode, icmpType, ipv6CidrBlock);
        }
    }

    /**
     * An implementation for {@link DefaultNetworkAclEgress}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DefaultNetworkAclEgress {
        private final java.lang.String action;
        private final java.lang.Number fromPort;
        private final java.lang.String protocol;
        private final java.lang.Number ruleNo;
        private final java.lang.Number toPort;
        private final java.lang.String cidrBlock;
        private final java.lang.Number icmpCode;
        private final java.lang.Number icmpType;
        private final java.lang.String ipv6CidrBlock;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fromPort = software.amazon.jsii.Kernel.get(this, "fromPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleNo = software.amazon.jsii.Kernel.get(this, "ruleNo", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.toPort = software.amazon.jsii.Kernel.get(this, "toPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cidrBlock = software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.icmpCode = software.amazon.jsii.Kernel.get(this, "icmpCode", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.icmpType = software.amazon.jsii.Kernel.get(this, "icmpType", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv6CidrBlock = software.amazon.jsii.Kernel.get(this, "ipv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String action, final java.lang.Number fromPort, final java.lang.String protocol, final java.lang.Number ruleNo, final java.lang.Number toPort, final java.lang.String cidrBlock, final java.lang.Number icmpCode, final java.lang.Number icmpType, final java.lang.String ipv6CidrBlock) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = java.util.Objects.requireNonNull(action, "action is required");
            this.fromPort = java.util.Objects.requireNonNull(fromPort, "fromPort is required");
            this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
            this.ruleNo = java.util.Objects.requireNonNull(ruleNo, "ruleNo is required");
            this.toPort = java.util.Objects.requireNonNull(toPort, "toPort is required");
            this.cidrBlock = cidrBlock;
            this.icmpCode = icmpCode;
            this.icmpType = icmpType;
            this.ipv6CidrBlock = ipv6CidrBlock;
        }

        @Override
        public final java.lang.String getAction() {
            return this.action;
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
        public final java.lang.Number getRuleNo() {
            return this.ruleNo;
        }

        @Override
        public final java.lang.Number getToPort() {
            return this.toPort;
        }

        @Override
        public final java.lang.String getCidrBlock() {
            return this.cidrBlock;
        }

        @Override
        public final java.lang.Number getIcmpCode() {
            return this.icmpCode;
        }

        @Override
        public final java.lang.Number getIcmpType() {
            return this.icmpType;
        }

        @Override
        public final java.lang.String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            data.set("fromPort", om.valueToTree(this.getFromPort()));
            data.set("protocol", om.valueToTree(this.getProtocol()));
            data.set("ruleNo", om.valueToTree(this.getRuleNo()));
            data.set("toPort", om.valueToTree(this.getToPort()));
            if (this.getCidrBlock() != null) {
                data.set("cidrBlock", om.valueToTree(this.getCidrBlock()));
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

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DefaultNetworkAclEgress"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DefaultNetworkAclEgress.Jsii$Proxy that = (DefaultNetworkAclEgress.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!fromPort.equals(that.fromPort)) return false;
            if (!protocol.equals(that.protocol)) return false;
            if (!ruleNo.equals(that.ruleNo)) return false;
            if (!toPort.equals(that.toPort)) return false;
            if (this.cidrBlock != null ? !this.cidrBlock.equals(that.cidrBlock) : that.cidrBlock != null) return false;
            if (this.icmpCode != null ? !this.icmpCode.equals(that.icmpCode) : that.icmpCode != null) return false;
            if (this.icmpType != null ? !this.icmpType.equals(that.icmpType) : that.icmpType != null) return false;
            return this.ipv6CidrBlock != null ? this.ipv6CidrBlock.equals(that.ipv6CidrBlock) : that.ipv6CidrBlock == null;
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.fromPort.hashCode());
            result = 31 * result + (this.protocol.hashCode());
            result = 31 * result + (this.ruleNo.hashCode());
            result = 31 * result + (this.toPort.hashCode());
            result = 31 * result + (this.cidrBlock != null ? this.cidrBlock.hashCode() : 0);
            result = 31 * result + (this.icmpCode != null ? this.icmpCode.hashCode() : 0);
            result = 31 * result + (this.icmpType != null ? this.icmpType.hashCode() : 0);
            result = 31 * result + (this.ipv6CidrBlock != null ? this.ipv6CidrBlock.hashCode() : 0);
            return result;
        }
    }
}
