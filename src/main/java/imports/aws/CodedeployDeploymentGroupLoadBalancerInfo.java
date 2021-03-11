package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.178Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentGroupLoadBalancerInfo")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentGroupLoadBalancerInfo.Jsii$Proxy.class)
public interface CodedeployDeploymentGroupLoadBalancerInfo extends software.amazon.jsii.JsiiSerializable {

    /**
     * elb_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo> getElbInfo() {
        return null;
    }

    /**
     * target_group_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo> getTargetGroupInfo() {
        return null;
    }

    /**
     * target_group_pair_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo> getTargetGroupPairInfo() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentGroupLoadBalancerInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentGroupLoadBalancerInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentGroupLoadBalancerInfo> {
        private java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo> elbInfo;
        private java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfo;
        private java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo> targetGroupPairInfo;

        /**
         * Sets the value of {@link CodedeployDeploymentGroupLoadBalancerInfo#getElbInfo}
         * @param elbInfo elb_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elbInfo(java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo> elbInfo) {
            this.elbInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo>)elbInfo;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupLoadBalancerInfo#getTargetGroupInfo}
         * @param targetGroupInfo target_group_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetGroupInfo(java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfo) {
            this.targetGroupInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo>)targetGroupInfo;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupLoadBalancerInfo#getTargetGroupPairInfo}
         * @param targetGroupPairInfo target_group_pair_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetGroupPairInfo(java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo> targetGroupPairInfo) {
            this.targetGroupPairInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo>)targetGroupPairInfo;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentGroupLoadBalancerInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentGroupLoadBalancerInfo build() {
            return new Jsii$Proxy(elbInfo, targetGroupInfo, targetGroupPairInfo);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentGroupLoadBalancerInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentGroupLoadBalancerInfo {
        private final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo> elbInfo;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfo;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo> targetGroupPairInfo;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.elbInfo = software.amazon.jsii.Kernel.get(this, "elbInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo.class)));
            this.targetGroupInfo = software.amazon.jsii.Kernel.get(this, "targetGroupInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo.class)));
            this.targetGroupPairInfo = software.amazon.jsii.Kernel.get(this, "targetGroupPairInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo> elbInfo, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfo, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo> targetGroupPairInfo) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.elbInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo>)elbInfo;
            this.targetGroupInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo>)targetGroupInfo;
            this.targetGroupPairInfo = (java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo>)targetGroupPairInfo;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoElbInfo> getElbInfo() {
            return this.elbInfo;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfo> getTargetGroupInfo() {
            return this.targetGroupInfo;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo> getTargetGroupPairInfo() {
            return this.targetGroupPairInfo;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getElbInfo() != null) {
                data.set("elbInfo", om.valueToTree(this.getElbInfo()));
            }
            if (this.getTargetGroupInfo() != null) {
                data.set("targetGroupInfo", om.valueToTree(this.getTargetGroupInfo()));
            }
            if (this.getTargetGroupPairInfo() != null) {
                data.set("targetGroupPairInfo", om.valueToTree(this.getTargetGroupPairInfo()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentGroupLoadBalancerInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentGroupLoadBalancerInfo.Jsii$Proxy that = (CodedeployDeploymentGroupLoadBalancerInfo.Jsii$Proxy) o;

            if (this.elbInfo != null ? !this.elbInfo.equals(that.elbInfo) : that.elbInfo != null) return false;
            if (this.targetGroupInfo != null ? !this.targetGroupInfo.equals(that.targetGroupInfo) : that.targetGroupInfo != null) return false;
            return this.targetGroupPairInfo != null ? this.targetGroupPairInfo.equals(that.targetGroupPairInfo) : that.targetGroupPairInfo == null;
        }

        @Override
        public final int hashCode() {
            int result = this.elbInfo != null ? this.elbInfo.hashCode() : 0;
            result = 31 * result + (this.targetGroupInfo != null ? this.targetGroupInfo.hashCode() : 0);
            result = 31 * result + (this.targetGroupPairInfo != null ? this.targetGroupPairInfo.hashCode() : 0);
            return result;
        }
    }
}
