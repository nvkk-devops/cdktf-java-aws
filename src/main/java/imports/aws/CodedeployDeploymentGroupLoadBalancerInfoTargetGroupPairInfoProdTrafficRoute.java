package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.178Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute.Jsii$Proxy.class)
public interface CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getListenerArns();

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute> {
        private java.util.List<java.lang.String> listenerArns;

        /**
         * Sets the value of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute#getListenerArns}
         * @param listenerArns the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder listenerArns(java.util.List<java.lang.String> listenerArns) {
            this.listenerArns = listenerArns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute build() {
            return new Jsii$Proxy(listenerArns);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute {
        private final java.util.List<java.lang.String> listenerArns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.listenerArns = software.amazon.jsii.Kernel.get(this, "listenerArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> listenerArns) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.listenerArns = java.util.Objects.requireNonNull(listenerArns, "listenerArns is required");
        }

        @Override
        public final java.util.List<java.lang.String> getListenerArns() {
            return this.listenerArns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("listenerArns", om.valueToTree(this.getListenerArns()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute.Jsii$Proxy that = (CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute.Jsii$Proxy) o;

            return this.listenerArns.equals(that.listenerArns);
        }

        @Override
        public final int hashCode() {
            int result = this.listenerArns.hashCode();
            return result;
        }
    }
}
