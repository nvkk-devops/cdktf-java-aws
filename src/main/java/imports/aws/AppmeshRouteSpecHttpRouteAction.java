package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.035Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpecHttpRouteAction")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteAction.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * weighted_target block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget> getWeightedTarget();

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteAction> {
        private java.util.List<imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget> weightedTarget;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteAction#getWeightedTarget}
         * @param weightedTarget weighted_target block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder weightedTarget(java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget> weightedTarget) {
            this.weightedTarget = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget>)weightedTarget;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteAction build() {
            return new Jsii$Proxy(weightedTarget);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteAction {
        private final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget> weightedTarget;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.weightedTarget = software.amazon.jsii.Kernel.get(this, "weightedTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget> weightedTarget) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.weightedTarget = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget>)java.util.Objects.requireNonNull(weightedTarget, "weightedTarget is required");
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteActionWeightedTarget> getWeightedTarget() {
            return this.weightedTarget;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("weightedTarget", om.valueToTree(this.getWeightedTarget()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpecHttpRouteAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteAction.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteAction.Jsii$Proxy) o;

            return this.weightedTarget.equals(that.weightedTarget);
        }

        @Override
        public final int hashCode() {
            int result = this.weightedTarget.hashCode();
            return result;
        }
    }
}
