package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.485Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2ClientVpnEndpointAuthenticationOptions")
@software.amazon.jsii.Jsii.Proxy(Ec2ClientVpnEndpointAuthenticationOptions.Jsii$Proxy.class)
public interface Ec2ClientVpnEndpointAuthenticationOptions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.String getActiveDirectoryId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRootCertificateChainArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2ClientVpnEndpointAuthenticationOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2ClientVpnEndpointAuthenticationOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2ClientVpnEndpointAuthenticationOptions> {
        private java.lang.String type;
        private java.lang.String activeDirectoryId;
        private java.lang.String rootCertificateChainArn;

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointAuthenticationOptions#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointAuthenticationOptions#getActiveDirectoryId}
         * @param activeDirectoryId the value to be set.
         * @return {@code this}
         */
        public Builder activeDirectoryId(java.lang.String activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointAuthenticationOptions#getRootCertificateChainArn}
         * @param rootCertificateChainArn the value to be set.
         * @return {@code this}
         */
        public Builder rootCertificateChainArn(java.lang.String rootCertificateChainArn) {
            this.rootCertificateChainArn = rootCertificateChainArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Ec2ClientVpnEndpointAuthenticationOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2ClientVpnEndpointAuthenticationOptions build() {
            return new Jsii$Proxy(type, activeDirectoryId, rootCertificateChainArn);
        }
    }

    /**
     * An implementation for {@link Ec2ClientVpnEndpointAuthenticationOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2ClientVpnEndpointAuthenticationOptions {
        private final java.lang.String type;
        private final java.lang.String activeDirectoryId;
        private final java.lang.String rootCertificateChainArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.activeDirectoryId = software.amazon.jsii.Kernel.get(this, "activeDirectoryId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootCertificateChainArn = software.amazon.jsii.Kernel.get(this, "rootCertificateChainArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String type, final java.lang.String activeDirectoryId, final java.lang.String rootCertificateChainArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.activeDirectoryId = activeDirectoryId;
            this.rootCertificateChainArn = rootCertificateChainArn;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getActiveDirectoryId() {
            return this.activeDirectoryId;
        }

        @Override
        public final java.lang.String getRootCertificateChainArn() {
            return this.rootCertificateChainArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getActiveDirectoryId() != null) {
                data.set("activeDirectoryId", om.valueToTree(this.getActiveDirectoryId()));
            }
            if (this.getRootCertificateChainArn() != null) {
                data.set("rootCertificateChainArn", om.valueToTree(this.getRootCertificateChainArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Ec2ClientVpnEndpointAuthenticationOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2ClientVpnEndpointAuthenticationOptions.Jsii$Proxy that = (Ec2ClientVpnEndpointAuthenticationOptions.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.activeDirectoryId != null ? !this.activeDirectoryId.equals(that.activeDirectoryId) : that.activeDirectoryId != null) return false;
            return this.rootCertificateChainArn != null ? this.rootCertificateChainArn.equals(that.rootCertificateChainArn) : that.rootCertificateChainArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.activeDirectoryId != null ? this.activeDirectoryId.hashCode() : 0);
            result = 31 * result + (this.rootCertificateChainArn != null ? this.rootCertificateChainArn.hashCode() : 0);
            return result;
        }
    }
}
