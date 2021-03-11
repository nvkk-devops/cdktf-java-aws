package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.427Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DefaultSecurityGroupIngress")
@software.amazon.jsii.Jsii.Proxy(DefaultSecurityGroupIngress.Jsii$Proxy.class)
public interface DefaultSecurityGroupIngress extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCidrBlocks() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getFromPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpv6CidrBlocks() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPrefixListIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSelfAttribute() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getToPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DefaultSecurityGroupIngress}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DefaultSecurityGroupIngress}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DefaultSecurityGroupIngress> {
        private java.util.List<java.lang.String> cidrBlocks;
        private java.lang.String description;
        private java.lang.Number fromPort;
        private java.util.List<java.lang.String> ipv6CidrBlocks;
        private java.util.List<java.lang.String> prefixListIds;
        private java.lang.String protocol;
        private java.util.List<java.lang.String> securityGroups;
        private java.lang.Boolean selfAttribute;
        private java.lang.Number toPort;

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getCidrBlocks}
         * @param cidrBlocks the value to be set.
         * @return {@code this}
         */
        public Builder cidrBlocks(java.util.List<java.lang.String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getFromPort}
         * @param fromPort the value to be set.
         * @return {@code this}
         */
        public Builder fromPort(java.lang.Number fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getIpv6CidrBlocks}
         * @param ipv6CidrBlocks the value to be set.
         * @return {@code this}
         */
        public Builder ipv6CidrBlocks(java.util.List<java.lang.String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getPrefixListIds}
         * @param prefixListIds the value to be set.
         * @return {@code this}
         */
        public Builder prefixListIds(java.util.List<java.lang.String> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getProtocol}
         * @param protocol the value to be set.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getSelfAttribute}
         * @param selfAttribute the value to be set.
         * @return {@code this}
         */
        public Builder selfAttribute(java.lang.Boolean selfAttribute) {
            this.selfAttribute = selfAttribute;
            return this;
        }

        /**
         * Sets the value of {@link DefaultSecurityGroupIngress#getToPort}
         * @param toPort the value to be set.
         * @return {@code this}
         */
        public Builder toPort(java.lang.Number toPort) {
            this.toPort = toPort;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DefaultSecurityGroupIngress}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DefaultSecurityGroupIngress build() {
            return new Jsii$Proxy(cidrBlocks, description, fromPort, ipv6CidrBlocks, prefixListIds, protocol, securityGroups, selfAttribute, toPort);
        }
    }

    /**
     * An implementation for {@link DefaultSecurityGroupIngress}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DefaultSecurityGroupIngress {
        private final java.util.List<java.lang.String> cidrBlocks;
        private final java.lang.String description;
        private final java.lang.Number fromPort;
        private final java.util.List<java.lang.String> ipv6CidrBlocks;
        private final java.util.List<java.lang.String> prefixListIds;
        private final java.lang.String protocol;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.lang.Boolean selfAttribute;
        private final java.lang.Number toPort;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cidrBlocks = software.amazon.jsii.Kernel.get(this, "cidrBlocks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fromPort = software.amazon.jsii.Kernel.get(this, "fromPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv6CidrBlocks = software.amazon.jsii.Kernel.get(this, "ipv6CidrBlocks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.prefixListIds = software.amazon.jsii.Kernel.get(this, "prefixListIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.selfAttribute = software.amazon.jsii.Kernel.get(this, "selfAttribute", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.toPort = software.amazon.jsii.Kernel.get(this, "toPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> cidrBlocks, final java.lang.String description, final java.lang.Number fromPort, final java.util.List<java.lang.String> ipv6CidrBlocks, final java.util.List<java.lang.String> prefixListIds, final java.lang.String protocol, final java.util.List<java.lang.String> securityGroups, final java.lang.Boolean selfAttribute, final java.lang.Number toPort) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidrBlocks = cidrBlocks;
            this.description = description;
            this.fromPort = fromPort;
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            this.prefixListIds = prefixListIds;
            this.protocol = protocol;
            this.securityGroups = securityGroups;
            this.selfAttribute = selfAttribute;
            this.toPort = toPort;
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
        public final java.lang.Number getFromPort() {
            return this.fromPort;
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
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.lang.Boolean getSelfAttribute() {
            return this.selfAttribute;
        }

        @Override
        public final java.lang.Number getToPort() {
            return this.toPort;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCidrBlocks() != null) {
                data.set("cidrBlocks", om.valueToTree(this.getCidrBlocks()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getFromPort() != null) {
                data.set("fromPort", om.valueToTree(this.getFromPort()));
            }
            if (this.getIpv6CidrBlocks() != null) {
                data.set("ipv6CidrBlocks", om.valueToTree(this.getIpv6CidrBlocks()));
            }
            if (this.getPrefixListIds() != null) {
                data.set("prefixListIds", om.valueToTree(this.getPrefixListIds()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }
            if (this.getSelfAttribute() != null) {
                data.set("selfAttribute", om.valueToTree(this.getSelfAttribute()));
            }
            if (this.getToPort() != null) {
                data.set("toPort", om.valueToTree(this.getToPort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DefaultSecurityGroupIngress"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DefaultSecurityGroupIngress.Jsii$Proxy that = (DefaultSecurityGroupIngress.Jsii$Proxy) o;

            if (this.cidrBlocks != null ? !this.cidrBlocks.equals(that.cidrBlocks) : that.cidrBlocks != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.fromPort != null ? !this.fromPort.equals(that.fromPort) : that.fromPort != null) return false;
            if (this.ipv6CidrBlocks != null ? !this.ipv6CidrBlocks.equals(that.ipv6CidrBlocks) : that.ipv6CidrBlocks != null) return false;
            if (this.prefixListIds != null ? !this.prefixListIds.equals(that.prefixListIds) : that.prefixListIds != null) return false;
            if (this.protocol != null ? !this.protocol.equals(that.protocol) : that.protocol != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            if (this.selfAttribute != null ? !this.selfAttribute.equals(that.selfAttribute) : that.selfAttribute != null) return false;
            return this.toPort != null ? this.toPort.equals(that.toPort) : that.toPort == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cidrBlocks != null ? this.cidrBlocks.hashCode() : 0;
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.fromPort != null ? this.fromPort.hashCode() : 0);
            result = 31 * result + (this.ipv6CidrBlocks != null ? this.ipv6CidrBlocks.hashCode() : 0);
            result = 31 * result + (this.prefixListIds != null ? this.prefixListIds.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.selfAttribute != null ? this.selfAttribute.hashCode() : 0);
            result = 31 * result + (this.toPort != null ? this.toPort.hashCode() : 0);
            return result;
        }
    }
}
