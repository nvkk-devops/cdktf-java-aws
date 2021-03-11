package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.176Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentGroupBlueGreenDeploymentConfig.Jsii$Proxy.class)
public interface CodedeployDeploymentGroupBlueGreenDeploymentConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * deployment_ready_option block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> getDeploymentReadyOption() {
        return null;
    }

    /**
     * green_fleet_provisioning_option block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption> getGreenFleetProvisioningOption() {
        return null;
    }

    /**
     * terminate_blue_instances_on_deployment_success block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess> getTerminateBlueInstancesOnDeploymentSuccess() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentGroupBlueGreenDeploymentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentGroupBlueGreenDeploymentConfig> {
        private java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> deploymentReadyOption;
        private java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption> greenFleetProvisioningOption;
        private java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess> terminateBlueInstancesOnDeploymentSuccess;

        /**
         * Sets the value of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfig#getDeploymentReadyOption}
         * @param deploymentReadyOption deployment_ready_option block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder deploymentReadyOption(java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> deploymentReadyOption) {
            this.deploymentReadyOption = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption>)deploymentReadyOption;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfig#getGreenFleetProvisioningOption}
         * @param greenFleetProvisioningOption green_fleet_provisioning_option block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder greenFleetProvisioningOption(java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption> greenFleetProvisioningOption) {
            this.greenFleetProvisioningOption = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption>)greenFleetProvisioningOption;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfig#getTerminateBlueInstancesOnDeploymentSuccess}
         * @param terminateBlueInstancesOnDeploymentSuccess terminate_blue_instances_on_deployment_success block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder terminateBlueInstancesOnDeploymentSuccess(java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess> terminateBlueInstancesOnDeploymentSuccess) {
            this.terminateBlueInstancesOnDeploymentSuccess = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess>)terminateBlueInstancesOnDeploymentSuccess;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentGroupBlueGreenDeploymentConfig build() {
            return new Jsii$Proxy(deploymentReadyOption, greenFleetProvisioningOption, terminateBlueInstancesOnDeploymentSuccess);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentGroupBlueGreenDeploymentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentGroupBlueGreenDeploymentConfig {
        private final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> deploymentReadyOption;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption> greenFleetProvisioningOption;
        private final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess> terminateBlueInstancesOnDeploymentSuccess;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deploymentReadyOption = software.amazon.jsii.Kernel.get(this, "deploymentReadyOption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption.class)));
            this.greenFleetProvisioningOption = software.amazon.jsii.Kernel.get(this, "greenFleetProvisioningOption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption.class)));
            this.terminateBlueInstancesOnDeploymentSuccess = software.amazon.jsii.Kernel.get(this, "terminateBlueInstancesOnDeploymentSuccess", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> deploymentReadyOption, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption> greenFleetProvisioningOption, final java.util.List<? extends imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess> terminateBlueInstancesOnDeploymentSuccess) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deploymentReadyOption = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption>)deploymentReadyOption;
            this.greenFleetProvisioningOption = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption>)greenFleetProvisioningOption;
            this.terminateBlueInstancesOnDeploymentSuccess = (java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess>)terminateBlueInstancesOnDeploymentSuccess;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> getDeploymentReadyOption() {
            return this.deploymentReadyOption;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption> getGreenFleetProvisioningOption() {
            return this.greenFleetProvisioningOption;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess> getTerminateBlueInstancesOnDeploymentSuccess() {
            return this.terminateBlueInstancesOnDeploymentSuccess;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeploymentReadyOption() != null) {
                data.set("deploymentReadyOption", om.valueToTree(this.getDeploymentReadyOption()));
            }
            if (this.getGreenFleetProvisioningOption() != null) {
                data.set("greenFleetProvisioningOption", om.valueToTree(this.getGreenFleetProvisioningOption()));
            }
            if (this.getTerminateBlueInstancesOnDeploymentSuccess() != null) {
                data.set("terminateBlueInstancesOnDeploymentSuccess", om.valueToTree(this.getTerminateBlueInstancesOnDeploymentSuccess()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentGroupBlueGreenDeploymentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentGroupBlueGreenDeploymentConfig.Jsii$Proxy that = (CodedeployDeploymentGroupBlueGreenDeploymentConfig.Jsii$Proxy) o;

            if (this.deploymentReadyOption != null ? !this.deploymentReadyOption.equals(that.deploymentReadyOption) : that.deploymentReadyOption != null) return false;
            if (this.greenFleetProvisioningOption != null ? !this.greenFleetProvisioningOption.equals(that.greenFleetProvisioningOption) : that.greenFleetProvisioningOption != null) return false;
            return this.terminateBlueInstancesOnDeploymentSuccess != null ? this.terminateBlueInstancesOnDeploymentSuccess.equals(that.terminateBlueInstancesOnDeploymentSuccess) : that.terminateBlueInstancesOnDeploymentSuccess == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deploymentReadyOption != null ? this.deploymentReadyOption.hashCode() : 0;
            result = 31 * result + (this.greenFleetProvisioningOption != null ? this.greenFleetProvisioningOption.hashCode() : 0);
            result = 31 * result + (this.terminateBlueInstancesOnDeploymentSuccess != null ? this.terminateBlueInstancesOnDeploymentSuccess.hashCode() : 0);
            return result;
        }
    }
}
