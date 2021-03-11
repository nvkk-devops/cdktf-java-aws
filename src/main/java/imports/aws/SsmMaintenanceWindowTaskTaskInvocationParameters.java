package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.895Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmMaintenanceWindowTaskTaskInvocationParameters")
@software.amazon.jsii.Jsii.Proxy(SsmMaintenanceWindowTaskTaskInvocationParameters.Jsii$Proxy.class)
public interface SsmMaintenanceWindowTaskTaskInvocationParameters extends software.amazon.jsii.JsiiSerializable {

    /**
     * automation_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters> getAutomationParameters() {
        return null;
    }

    /**
     * lambda_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters> getLambdaParameters() {
        return null;
    }

    /**
     * run_command_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters> getRunCommandParameters() {
        return null;
    }

    /**
     * step_functions_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters> getStepFunctionsParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmMaintenanceWindowTaskTaskInvocationParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmMaintenanceWindowTaskTaskInvocationParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmMaintenanceWindowTaskTaskInvocationParameters> {
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters> automationParameters;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters> lambdaParameters;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters> runCommandParameters;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters> stepFunctionsParameters;

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParameters#getAutomationParameters}
         * @param automationParameters automation_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder automationParameters(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters> automationParameters) {
            this.automationParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters>)automationParameters;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParameters#getLambdaParameters}
         * @param lambdaParameters lambda_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambdaParameters(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters> lambdaParameters) {
            this.lambdaParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters>)lambdaParameters;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParameters#getRunCommandParameters}
         * @param runCommandParameters run_command_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder runCommandParameters(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters> runCommandParameters) {
            this.runCommandParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters>)runCommandParameters;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParameters#getStepFunctionsParameters}
         * @param stepFunctionsParameters step_functions_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stepFunctionsParameters(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters> stepFunctionsParameters) {
            this.stepFunctionsParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters>)stepFunctionsParameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SsmMaintenanceWindowTaskTaskInvocationParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmMaintenanceWindowTaskTaskInvocationParameters build() {
            return new Jsii$Proxy(automationParameters, lambdaParameters, runCommandParameters, stepFunctionsParameters);
        }
    }

    /**
     * An implementation for {@link SsmMaintenanceWindowTaskTaskInvocationParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmMaintenanceWindowTaskTaskInvocationParameters {
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters> automationParameters;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters> lambdaParameters;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters> runCommandParameters;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters> stepFunctionsParameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.automationParameters = software.amazon.jsii.Kernel.get(this, "automationParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters.class)));
            this.lambdaParameters = software.amazon.jsii.Kernel.get(this, "lambdaParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters.class)));
            this.runCommandParameters = software.amazon.jsii.Kernel.get(this, "runCommandParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters.class)));
            this.stepFunctionsParameters = software.amazon.jsii.Kernel.get(this, "stepFunctionsParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters> automationParameters, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters> lambdaParameters, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters> runCommandParameters, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters> stepFunctionsParameters) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.automationParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters>)automationParameters;
            this.lambdaParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters>)lambdaParameters;
            this.runCommandParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters>)runCommandParameters;
            this.stepFunctionsParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters>)stepFunctionsParameters;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters> getAutomationParameters() {
            return this.automationParameters;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersLambdaParameters> getLambdaParameters() {
            return this.lambdaParameters;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters> getRunCommandParameters() {
            return this.runCommandParameters;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters> getStepFunctionsParameters() {
            return this.stepFunctionsParameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAutomationParameters() != null) {
                data.set("automationParameters", om.valueToTree(this.getAutomationParameters()));
            }
            if (this.getLambdaParameters() != null) {
                data.set("lambdaParameters", om.valueToTree(this.getLambdaParameters()));
            }
            if (this.getRunCommandParameters() != null) {
                data.set("runCommandParameters", om.valueToTree(this.getRunCommandParameters()));
            }
            if (this.getStepFunctionsParameters() != null) {
                data.set("stepFunctionsParameters", om.valueToTree(this.getStepFunctionsParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SsmMaintenanceWindowTaskTaskInvocationParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmMaintenanceWindowTaskTaskInvocationParameters.Jsii$Proxy that = (SsmMaintenanceWindowTaskTaskInvocationParameters.Jsii$Proxy) o;

            if (this.automationParameters != null ? !this.automationParameters.equals(that.automationParameters) : that.automationParameters != null) return false;
            if (this.lambdaParameters != null ? !this.lambdaParameters.equals(that.lambdaParameters) : that.lambdaParameters != null) return false;
            if (this.runCommandParameters != null ? !this.runCommandParameters.equals(that.runCommandParameters) : that.runCommandParameters != null) return false;
            return this.stepFunctionsParameters != null ? this.stepFunctionsParameters.equals(that.stepFunctionsParameters) : that.stepFunctionsParameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.automationParameters != null ? this.automationParameters.hashCode() : 0;
            result = 31 * result + (this.lambdaParameters != null ? this.lambdaParameters.hashCode() : 0);
            result = 31 * result + (this.runCommandParameters != null ? this.runCommandParameters.hashCode() : 0);
            result = 31 * result + (this.stepFunctionsParameters != null ? this.stepFunctionsParameters.hashCode() : 0);
            return result;
        }
    }
}
