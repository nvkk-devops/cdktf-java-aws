package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.720Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterClientAuthentication")
@software.amazon.jsii.Jsii.Proxy(MskClusterClientAuthentication.Jsii$Proxy.class)
public interface MskClusterClientAuthentication extends software.amazon.jsii.JsiiSerializable {

    /**
     * tls block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterClientAuthenticationTls> getTls() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterClientAuthentication}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterClientAuthentication}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterClientAuthentication> {
        private java.util.List<imports.aws.MskClusterClientAuthenticationTls> tls;

        /**
         * Sets the value of {@link MskClusterClientAuthentication#getTls}
         * @param tls tls block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tls(java.util.List<? extends imports.aws.MskClusterClientAuthenticationTls> tls) {
            this.tls = (java.util.List<imports.aws.MskClusterClientAuthenticationTls>)tls;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterClientAuthentication}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterClientAuthentication build() {
            return new Jsii$Proxy(tls);
        }
    }

    /**
     * An implementation for {@link MskClusterClientAuthentication}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterClientAuthentication {
        private final java.util.List<imports.aws.MskClusterClientAuthenticationTls> tls;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.tls = software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterClientAuthenticationTls.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.MskClusterClientAuthenticationTls> tls) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.tls = (java.util.List<imports.aws.MskClusterClientAuthenticationTls>)tls;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterClientAuthenticationTls> getTls() {
            return this.tls;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTls() != null) {
                data.set("tls", om.valueToTree(this.getTls()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterClientAuthentication"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterClientAuthentication.Jsii$Proxy that = (MskClusterClientAuthentication.Jsii$Proxy) o;

            return this.tls != null ? this.tls.equals(that.tls) : that.tls == null;
        }

        @Override
        public final int hashCode() {
            int result = this.tls != null ? this.tls.hashCode() : 0;
            return result;
        }
    }
}
