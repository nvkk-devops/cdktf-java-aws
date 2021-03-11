package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.922Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcPeeringConnectionAccepterRequester")
@software.amazon.jsii.Jsii.Proxy(VpcPeeringConnectionAccepterRequester.Jsii$Proxy.class)
public interface VpcPeeringConnectionAccepterRequester extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowClassicLinkToRemoteVpc() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowRemoteVpcDnsResolution() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowVpcToRemoteClassicLink() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcPeeringConnectionAccepterRequester}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcPeeringConnectionAccepterRequester}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcPeeringConnectionAccepterRequester> {
        private java.lang.Boolean allowClassicLinkToRemoteVpc;
        private java.lang.Boolean allowRemoteVpcDnsResolution;
        private java.lang.Boolean allowVpcToRemoteClassicLink;

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepterRequester#getAllowClassicLinkToRemoteVpc}
         * @param allowClassicLinkToRemoteVpc the value to be set.
         * @return {@code this}
         */
        public Builder allowClassicLinkToRemoteVpc(java.lang.Boolean allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepterRequester#getAllowRemoteVpcDnsResolution}
         * @param allowRemoteVpcDnsResolution the value to be set.
         * @return {@code this}
         */
        public Builder allowRemoteVpcDnsResolution(java.lang.Boolean allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepterRequester#getAllowVpcToRemoteClassicLink}
         * @param allowVpcToRemoteClassicLink the value to be set.
         * @return {@code this}
         */
        public Builder allowVpcToRemoteClassicLink(java.lang.Boolean allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VpcPeeringConnectionAccepterRequester}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcPeeringConnectionAccepterRequester build() {
            return new Jsii$Proxy(allowClassicLinkToRemoteVpc, allowRemoteVpcDnsResolution, allowVpcToRemoteClassicLink);
        }
    }

    /**
     * An implementation for {@link VpcPeeringConnectionAccepterRequester}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcPeeringConnectionAccepterRequester {
        private final java.lang.Boolean allowClassicLinkToRemoteVpc;
        private final java.lang.Boolean allowRemoteVpcDnsResolution;
        private final java.lang.Boolean allowVpcToRemoteClassicLink;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowClassicLinkToRemoteVpc = software.amazon.jsii.Kernel.get(this, "allowClassicLinkToRemoteVpc", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.allowRemoteVpcDnsResolution = software.amazon.jsii.Kernel.get(this, "allowRemoteVpcDnsResolution", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.allowVpcToRemoteClassicLink = software.amazon.jsii.Kernel.get(this, "allowVpcToRemoteClassicLink", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean allowClassicLinkToRemoteVpc, final java.lang.Boolean allowRemoteVpcDnsResolution, final java.lang.Boolean allowVpcToRemoteClassicLink) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
        }

        @Override
        public final java.lang.Boolean getAllowClassicLinkToRemoteVpc() {
            return this.allowClassicLinkToRemoteVpc;
        }

        @Override
        public final java.lang.Boolean getAllowRemoteVpcDnsResolution() {
            return this.allowRemoteVpcDnsResolution;
        }

        @Override
        public final java.lang.Boolean getAllowVpcToRemoteClassicLink() {
            return this.allowVpcToRemoteClassicLink;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowClassicLinkToRemoteVpc() != null) {
                data.set("allowClassicLinkToRemoteVpc", om.valueToTree(this.getAllowClassicLinkToRemoteVpc()));
            }
            if (this.getAllowRemoteVpcDnsResolution() != null) {
                data.set("allowRemoteVpcDnsResolution", om.valueToTree(this.getAllowRemoteVpcDnsResolution()));
            }
            if (this.getAllowVpcToRemoteClassicLink() != null) {
                data.set("allowVpcToRemoteClassicLink", om.valueToTree(this.getAllowVpcToRemoteClassicLink()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.VpcPeeringConnectionAccepterRequester"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcPeeringConnectionAccepterRequester.Jsii$Proxy that = (VpcPeeringConnectionAccepterRequester.Jsii$Proxy) o;

            if (this.allowClassicLinkToRemoteVpc != null ? !this.allowClassicLinkToRemoteVpc.equals(that.allowClassicLinkToRemoteVpc) : that.allowClassicLinkToRemoteVpc != null) return false;
            if (this.allowRemoteVpcDnsResolution != null ? !this.allowRemoteVpcDnsResolution.equals(that.allowRemoteVpcDnsResolution) : that.allowRemoteVpcDnsResolution != null) return false;
            return this.allowVpcToRemoteClassicLink != null ? this.allowVpcToRemoteClassicLink.equals(that.allowVpcToRemoteClassicLink) : that.allowVpcToRemoteClassicLink == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowClassicLinkToRemoteVpc != null ? this.allowClassicLinkToRemoteVpc.hashCode() : 0;
            result = 31 * result + (this.allowRemoteVpcDnsResolution != null ? this.allowRemoteVpcDnsResolution.hashCode() : 0);
            result = 31 * result + (this.allowVpcToRemoteClassicLink != null ? this.allowVpcToRemoteClassicLink.hashCode() : 0);
            return result;
        }
    }
}
