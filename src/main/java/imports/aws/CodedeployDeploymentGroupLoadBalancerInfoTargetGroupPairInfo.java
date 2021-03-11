package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.178Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo.Jsii$Proxy.class)
public interface CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends software.amazon.jsii.JsiiSerializable {

    /**
     * prod_traffic_route block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute> getProdTrafficRoute();

    /**
     * target_group block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> getTargetGroup();

    /**
     * test_traffic_route block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute> getTestTrafficRoute() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo> {
        private java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute> prodTrafficRoute;
        private java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroup;
        private java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute> testTrafficRoute;

        /**
         * Sets the value of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo#getProdTrafficRoute}
         * @param prodTrafficRoute prod_traffic_route block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder prodTrafficRoute(java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute> prodTrafficRoute) {
            this.prodTrafficRoute = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute>)prodTrafficRoute;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo#getTargetGroup}
         * @param targetGroup target_group block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetGroup(java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroup) {
            this.targetGroup = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup>)targetGroup;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo#getTestTrafficRoute}
         * @param testTrafficRoute test_traffic_route block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder testTrafficRoute(java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute> testTrafficRoute) {
            this.testTrafficRoute = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute>)testTrafficRoute;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo build() {
            return new Jsii$Proxy(prodTrafficRoute, targetGroup, testTrafficRoute);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
        private final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute> prodTrafficRoute;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroup;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute> testTrafficRoute;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.prodTrafficRoute = software.amazon.jsii.Kernel.get(this, "prodTrafficRoute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute.class)));
            this.targetGroup = software.amazon.jsii.Kernel.get(this, "targetGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup.class)));
            this.testTrafficRoute = software.amazon.jsii.Kernel.get(this, "testTrafficRoute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute> prodTrafficRoute, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroup, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute> testTrafficRoute) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.prodTrafficRoute = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute>)java.util.Objects.requireNonNull(prodTrafficRoute, "prodTrafficRoute is required");
            this.targetGroup = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup>)java.util.Objects.requireNonNull(targetGroup, "targetGroup is required");
            this.testTrafficRoute = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute>)testTrafficRoute;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute> getProdTrafficRoute() {
            return this.prodTrafficRoute;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> getTargetGroup() {
            return this.targetGroup;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute> getTestTrafficRoute() {
            return this.testTrafficRoute;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("prodTrafficRoute", om.valueToTree(this.getProdTrafficRoute()));
            data.set("targetGroup", om.valueToTree(this.getTargetGroup()));
            if (this.getTestTrafficRoute() != null) {
                data.set("testTrafficRoute", om.valueToTree(this.getTestTrafficRoute()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo.Jsii$Proxy that = (CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo.Jsii$Proxy) o;

            if (!prodTrafficRoute.equals(that.prodTrafficRoute)) return false;
            if (!targetGroup.equals(that.targetGroup)) return false;
            return this.testTrafficRoute != null ? this.testTrafficRoute.equals(that.testTrafficRoute) : that.testTrafficRoute == null;
        }

        @Override
        public final int hashCode() {
            int result = this.prodTrafficRoute.hashCode();
            result = 31 * result + (this.targetGroup.hashCode());
            result = 31 * result + (this.testTrafficRoute != null ? this.testTrafficRoute.hashCode() : 0);
            return result;
        }
    }
}
