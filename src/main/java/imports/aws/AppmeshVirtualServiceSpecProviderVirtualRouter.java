package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.041Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualServiceSpecProviderVirtualRouter")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualServiceSpecProviderVirtualRouter.Jsii$Proxy.class)
public interface AppmeshVirtualServiceSpecProviderVirtualRouter extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getVirtualRouterName();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualServiceSpecProviderVirtualRouter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualServiceSpecProviderVirtualRouter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualServiceSpecProviderVirtualRouter> {
        private java.lang.String virtualRouterName;

        /**
         * Sets the value of {@link AppmeshVirtualServiceSpecProviderVirtualRouter#getVirtualRouterName}
         * @param virtualRouterName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder virtualRouterName(java.lang.String virtualRouterName) {
            this.virtualRouterName = virtualRouterName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualServiceSpecProviderVirtualRouter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualServiceSpecProviderVirtualRouter build() {
            return new Jsii$Proxy(virtualRouterName);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualServiceSpecProviderVirtualRouter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualServiceSpecProviderVirtualRouter {
        private final java.lang.String virtualRouterName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.virtualRouterName = software.amazon.jsii.Kernel.get(this, "virtualRouterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String virtualRouterName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.virtualRouterName = java.util.Objects.requireNonNull(virtualRouterName, "virtualRouterName is required");
        }

        @Override
        public final java.lang.String getVirtualRouterName() {
            return this.virtualRouterName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("virtualRouterName", om.valueToTree(this.getVirtualRouterName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualServiceSpecProviderVirtualRouter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualServiceSpecProviderVirtualRouter.Jsii$Proxy that = (AppmeshVirtualServiceSpecProviderVirtualRouter.Jsii$Proxy) o;

            return this.virtualRouterName.equals(that.virtualRouterName);
        }

        @Override
        public final int hashCode() {
            int result = this.virtualRouterName.hashCode();
            return result;
        }
    }
}
