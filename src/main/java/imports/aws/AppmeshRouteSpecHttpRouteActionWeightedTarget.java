package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.035Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpecHttpRouteActionWeightedTarget")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteActionWeightedTarget.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteActionWeightedTarget extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getVirtualNode();

    @org.jetbrains.annotations.NotNull java.lang.Number getWeight();

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteActionWeightedTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteActionWeightedTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteActionWeightedTarget> {
        private java.lang.String virtualNode;
        private java.lang.Number weight;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteActionWeightedTarget#getVirtualNode}
         * @param virtualNode the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder virtualNode(java.lang.String virtualNode) {
            this.virtualNode = virtualNode;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteActionWeightedTarget#getWeight}
         * @param weight the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteActionWeightedTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteActionWeightedTarget build() {
            return new Jsii$Proxy(virtualNode, weight);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteActionWeightedTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteActionWeightedTarget {
        private final java.lang.String virtualNode;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.virtualNode = software.amazon.jsii.Kernel.get(this, "virtualNode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.weight = software.amazon.jsii.Kernel.get(this, "weight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String virtualNode, final java.lang.Number weight) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.virtualNode = java.util.Objects.requireNonNull(virtualNode, "virtualNode is required");
            this.weight = java.util.Objects.requireNonNull(weight, "weight is required");
        }

        @Override
        public final java.lang.String getVirtualNode() {
            return this.virtualNode;
        }

        @Override
        public final java.lang.Number getWeight() {
            return this.weight;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("virtualNode", om.valueToTree(this.getVirtualNode()));
            data.set("weight", om.valueToTree(this.getWeight()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpecHttpRouteActionWeightedTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteActionWeightedTarget.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteActionWeightedTarget.Jsii$Proxy) o;

            if (!virtualNode.equals(that.virtualNode)) return false;
            return this.weight.equals(that.weight);
        }

        @Override
        public final int hashCode() {
            int result = this.virtualNode.hashCode();
            result = 31 * result + (this.weight.hashCode());
            return result;
        }
    }
}
