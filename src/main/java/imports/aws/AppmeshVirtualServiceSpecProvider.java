package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.041Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualServiceSpecProvider")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualServiceSpecProvider.Jsii$Proxy.class)
public interface AppmeshVirtualServiceSpecProvider extends software.amazon.jsii.JsiiSerializable {

    /**
     * virtual_node block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode> getVirtualNode() {
        return null;
    }

    /**
     * virtual_router block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter> getVirtualRouter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualServiceSpecProvider}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualServiceSpecProvider}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualServiceSpecProvider> {
        private java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode> virtualNode;
        private java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter> virtualRouter;

        /**
         * Sets the value of {@link AppmeshVirtualServiceSpecProvider#getVirtualNode}
         * @param virtualNode virtual_node block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder virtualNode(java.util.List<? extends imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode> virtualNode) {
            this.virtualNode = (java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode>)virtualNode;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualServiceSpecProvider#getVirtualRouter}
         * @param virtualRouter virtual_router block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder virtualRouter(java.util.List<? extends imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter> virtualRouter) {
            this.virtualRouter = (java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter>)virtualRouter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualServiceSpecProvider}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualServiceSpecProvider build() {
            return new Jsii$Proxy(virtualNode, virtualRouter);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualServiceSpecProvider}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualServiceSpecProvider {
        private final java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode> virtualNode;
        private final java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter> virtualRouter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.virtualNode = software.amazon.jsii.Kernel.get(this, "virtualNode", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode.class)));
            this.virtualRouter = software.amazon.jsii.Kernel.get(this, "virtualRouter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode> virtualNode, final java.util.List<? extends imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter> virtualRouter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.virtualNode = (java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode>)virtualNode;
            this.virtualRouter = (java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter>)virtualRouter;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualNode> getVirtualNode() {
            return this.virtualNode;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualServiceSpecProviderVirtualRouter> getVirtualRouter() {
            return this.virtualRouter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getVirtualNode() != null) {
                data.set("virtualNode", om.valueToTree(this.getVirtualNode()));
            }
            if (this.getVirtualRouter() != null) {
                data.set("virtualRouter", om.valueToTree(this.getVirtualRouter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualServiceSpecProvider"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualServiceSpecProvider.Jsii$Proxy that = (AppmeshVirtualServiceSpecProvider.Jsii$Proxy) o;

            if (this.virtualNode != null ? !this.virtualNode.equals(that.virtualNode) : that.virtualNode != null) return false;
            return this.virtualRouter != null ? this.virtualRouter.equals(that.virtualRouter) : that.virtualRouter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.virtualNode != null ? this.virtualNode.hashCode() : 0;
            result = 31 * result + (this.virtualRouter != null ? this.virtualRouter.hashCode() : 0);
            return result;
        }
    }
}
