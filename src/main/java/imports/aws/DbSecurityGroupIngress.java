package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.423Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DbSecurityGroupIngress")
@software.amazon.jsii.Jsii.Proxy(DbSecurityGroupIngress.Jsii$Proxy.class)
public interface DbSecurityGroupIngress extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCidr() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecurityGroupId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecurityGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecurityGroupOwnerId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DbSecurityGroupIngress}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DbSecurityGroupIngress}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DbSecurityGroupIngress> {
        private java.lang.String cidr;
        private java.lang.String securityGroupId;
        private java.lang.String securityGroupName;
        private java.lang.String securityGroupOwnerId;

        /**
         * Sets the value of {@link DbSecurityGroupIngress#getCidr}
         * @param cidr the value to be set.
         * @return {@code this}
         */
        public Builder cidr(java.lang.String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * Sets the value of {@link DbSecurityGroupIngress#getSecurityGroupId}
         * @param securityGroupId the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupId(java.lang.String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Sets the value of {@link DbSecurityGroupIngress#getSecurityGroupName}
         * @param securityGroupName the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupName(java.lang.String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * Sets the value of {@link DbSecurityGroupIngress#getSecurityGroupOwnerId}
         * @param securityGroupOwnerId the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupOwnerId(java.lang.String securityGroupOwnerId) {
            this.securityGroupOwnerId = securityGroupOwnerId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DbSecurityGroupIngress}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DbSecurityGroupIngress build() {
            return new Jsii$Proxy(cidr, securityGroupId, securityGroupName, securityGroupOwnerId);
        }
    }

    /**
     * An implementation for {@link DbSecurityGroupIngress}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DbSecurityGroupIngress {
        private final java.lang.String cidr;
        private final java.lang.String securityGroupId;
        private final java.lang.String securityGroupName;
        private final java.lang.String securityGroupOwnerId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cidr = software.amazon.jsii.Kernel.get(this, "cidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupId = software.amazon.jsii.Kernel.get(this, "securityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupName = software.amazon.jsii.Kernel.get(this, "securityGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupOwnerId = software.amazon.jsii.Kernel.get(this, "securityGroupOwnerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String cidr, final java.lang.String securityGroupId, final java.lang.String securityGroupName, final java.lang.String securityGroupOwnerId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidr = cidr;
            this.securityGroupId = securityGroupId;
            this.securityGroupName = securityGroupName;
            this.securityGroupOwnerId = securityGroupOwnerId;
        }

        @Override
        public final java.lang.String getCidr() {
            return this.cidr;
        }

        @Override
        public final java.lang.String getSecurityGroupId() {
            return this.securityGroupId;
        }

        @Override
        public final java.lang.String getSecurityGroupName() {
            return this.securityGroupName;
        }

        @Override
        public final java.lang.String getSecurityGroupOwnerId() {
            return this.securityGroupOwnerId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCidr() != null) {
                data.set("cidr", om.valueToTree(this.getCidr()));
            }
            if (this.getSecurityGroupId() != null) {
                data.set("securityGroupId", om.valueToTree(this.getSecurityGroupId()));
            }
            if (this.getSecurityGroupName() != null) {
                data.set("securityGroupName", om.valueToTree(this.getSecurityGroupName()));
            }
            if (this.getSecurityGroupOwnerId() != null) {
                data.set("securityGroupOwnerId", om.valueToTree(this.getSecurityGroupOwnerId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DbSecurityGroupIngress"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DbSecurityGroupIngress.Jsii$Proxy that = (DbSecurityGroupIngress.Jsii$Proxy) o;

            if (this.cidr != null ? !this.cidr.equals(that.cidr) : that.cidr != null) return false;
            if (this.securityGroupId != null ? !this.securityGroupId.equals(that.securityGroupId) : that.securityGroupId != null) return false;
            if (this.securityGroupName != null ? !this.securityGroupName.equals(that.securityGroupName) : that.securityGroupName != null) return false;
            return this.securityGroupOwnerId != null ? this.securityGroupOwnerId.equals(that.securityGroupOwnerId) : that.securityGroupOwnerId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cidr != null ? this.cidr.hashCode() : 0;
            result = 31 * result + (this.securityGroupId != null ? this.securityGroupId.hashCode() : 0);
            result = 31 * result + (this.securityGroupName != null ? this.securityGroupName.hashCode() : 0);
            result = 31 * result + (this.securityGroupOwnerId != null ? this.securityGroupOwnerId.hashCode() : 0);
            return result;
        }
    }
}
