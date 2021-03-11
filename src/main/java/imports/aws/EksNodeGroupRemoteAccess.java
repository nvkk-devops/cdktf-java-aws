package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.541Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksNodeGroupRemoteAccess")
@software.amazon.jsii.Jsii.Proxy(EksNodeGroupRemoteAccess.Jsii$Proxy.class)
public interface EksNodeGroupRemoteAccess extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getEc2SshKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSourceSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EksNodeGroupRemoteAccess}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksNodeGroupRemoteAccess}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksNodeGroupRemoteAccess> {
        private java.lang.String ec2SshKey;
        private java.util.List<java.lang.String> sourceSecurityGroupIds;

        /**
         * Sets the value of {@link EksNodeGroupRemoteAccess#getEc2SshKey}
         * @param ec2SshKey the value to be set.
         * @return {@code this}
         */
        public Builder ec2SshKey(java.lang.String ec2SshKey) {
            this.ec2SshKey = ec2SshKey;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupRemoteAccess#getSourceSecurityGroupIds}
         * @param sourceSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder sourceSecurityGroupIds(java.util.List<java.lang.String> sourceSecurityGroupIds) {
            this.sourceSecurityGroupIds = sourceSecurityGroupIds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EksNodeGroupRemoteAccess}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksNodeGroupRemoteAccess build() {
            return new Jsii$Proxy(ec2SshKey, sourceSecurityGroupIds);
        }
    }

    /**
     * An implementation for {@link EksNodeGroupRemoteAccess}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksNodeGroupRemoteAccess {
        private final java.lang.String ec2SshKey;
        private final java.util.List<java.lang.String> sourceSecurityGroupIds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ec2SshKey = software.amazon.jsii.Kernel.get(this, "ec2SshKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "sourceSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String ec2SshKey, final java.util.List<java.lang.String> sourceSecurityGroupIds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ec2SshKey = ec2SshKey;
            this.sourceSecurityGroupIds = sourceSecurityGroupIds;
        }

        @Override
        public final java.lang.String getEc2SshKey() {
            return this.ec2SshKey;
        }

        @Override
        public final java.util.List<java.lang.String> getSourceSecurityGroupIds() {
            return this.sourceSecurityGroupIds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEc2SshKey() != null) {
                data.set("ec2SshKey", om.valueToTree(this.getEc2SshKey()));
            }
            if (this.getSourceSecurityGroupIds() != null) {
                data.set("sourceSecurityGroupIds", om.valueToTree(this.getSourceSecurityGroupIds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EksNodeGroupRemoteAccess"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksNodeGroupRemoteAccess.Jsii$Proxy that = (EksNodeGroupRemoteAccess.Jsii$Proxy) o;

            if (this.ec2SshKey != null ? !this.ec2SshKey.equals(that.ec2SshKey) : that.ec2SshKey != null) return false;
            return this.sourceSecurityGroupIds != null ? this.sourceSecurityGroupIds.equals(that.sourceSecurityGroupIds) : that.sourceSecurityGroupIds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ec2SshKey != null ? this.ec2SshKey.hashCode() : 0;
            result = 31 * result + (this.sourceSecurityGroupIds != null ? this.sourceSecurityGroupIds.hashCode() : 0);
            return result;
        }
    }
}
