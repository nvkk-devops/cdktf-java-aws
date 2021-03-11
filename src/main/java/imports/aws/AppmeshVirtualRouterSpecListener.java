package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.040Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualRouterSpecListener")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualRouterSpecListener.Jsii$Proxy.class)
public interface AppmeshVirtualRouterSpecListener extends software.amazon.jsii.JsiiSerializable {

    /**
     * port_mapping block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppmeshVirtualRouterSpecListenerPortMapping> getPortMapping();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualRouterSpecListener}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualRouterSpecListener}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualRouterSpecListener> {
        private java.util.List<imports.aws.AppmeshVirtualRouterSpecListenerPortMapping> portMapping;

        /**
         * Sets the value of {@link AppmeshVirtualRouterSpecListener#getPortMapping}
         * @param portMapping port_mapping block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder portMapping(java.util.List<? extends imports.aws.AppmeshVirtualRouterSpecListenerPortMapping> portMapping) {
            this.portMapping = (java.util.List<imports.aws.AppmeshVirtualRouterSpecListenerPortMapping>)portMapping;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualRouterSpecListener}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualRouterSpecListener build() {
            return new Jsii$Proxy(portMapping);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualRouterSpecListener}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualRouterSpecListener {
        private final java.util.List<imports.aws.AppmeshVirtualRouterSpecListenerPortMapping> portMapping;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.portMapping = software.amazon.jsii.Kernel.get(this, "portMapping", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualRouterSpecListenerPortMapping.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualRouterSpecListenerPortMapping> portMapping) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.portMapping = (java.util.List<imports.aws.AppmeshVirtualRouterSpecListenerPortMapping>)java.util.Objects.requireNonNull(portMapping, "portMapping is required");
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualRouterSpecListenerPortMapping> getPortMapping() {
            return this.portMapping;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("portMapping", om.valueToTree(this.getPortMapping()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualRouterSpecListener"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualRouterSpecListener.Jsii$Proxy that = (AppmeshVirtualRouterSpecListener.Jsii$Proxy) o;

            return this.portMapping.equals(that.portMapping);
        }

        @Override
        public final int hashCode() {
            int result = this.portMapping.hashCode();
            return result;
        }
    }
}
