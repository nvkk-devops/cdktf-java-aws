package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.040Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualRouterSpecListenerPortMapping")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualRouterSpecListenerPortMapping.Jsii$Proxy.class)
public interface AppmeshVirtualRouterSpecListenerPortMapping extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getPort();

    @org.jetbrains.annotations.NotNull java.lang.String getProtocol();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualRouterSpecListenerPortMapping}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualRouterSpecListenerPortMapping}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualRouterSpecListenerPortMapping> {
        private java.lang.Number port;
        private java.lang.String protocol;

        /**
         * Sets the value of {@link AppmeshVirtualRouterSpecListenerPortMapping#getPort}
         * @param port the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualRouterSpecListenerPortMapping#getProtocol}
         * @param protocol the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualRouterSpecListenerPortMapping}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualRouterSpecListenerPortMapping build() {
            return new Jsii$Proxy(port, protocol);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualRouterSpecListenerPortMapping}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualRouterSpecListenerPortMapping {
        private final java.lang.Number port;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number port, final java.lang.String protocol) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(port, "port is required");
            this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            data.set("protocol", om.valueToTree(this.getProtocol()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualRouterSpecListenerPortMapping"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualRouterSpecListenerPortMapping.Jsii$Proxy that = (AppmeshVirtualRouterSpecListenerPortMapping.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            return this.protocol.equals(that.protocol);
        }

        @Override
        public final int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.protocol.hashCode());
            return result;
        }
    }
}
