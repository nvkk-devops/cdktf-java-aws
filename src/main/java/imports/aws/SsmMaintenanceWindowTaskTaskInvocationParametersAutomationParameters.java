package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.896Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters")
@software.amazon.jsii.Jsii.Proxy(SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters.Jsii$Proxy.class)
public interface SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getDocumentVersion() {
        return null;
    }

    /**
     * parameter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> getParameter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters> {
        private java.lang.String documentVersion;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameter;

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters#getDocumentVersion}
         * @param documentVersion the value to be set.
         * @return {@code this}
         */
        public Builder documentVersion(java.lang.String documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters#getParameter}
         * @param parameter parameter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder parameter(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameter) {
            this.parameter = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter>)parameter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters build() {
            return new Jsii$Proxy(documentVersion, parameter);
        }
    }

    /**
     * An implementation for {@link SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
        private final java.lang.String documentVersion;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.documentVersion = software.amazon.jsii.Kernel.get(this, "documentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameter = software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String documentVersion, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.documentVersion = documentVersion;
            this.parameter = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter>)parameter;
        }

        @Override
        public final java.lang.String getDocumentVersion() {
            return this.documentVersion;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> getParameter() {
            return this.parameter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDocumentVersion() != null) {
                data.set("documentVersion", om.valueToTree(this.getDocumentVersion()));
            }
            if (this.getParameter() != null) {
                data.set("parameter", om.valueToTree(this.getParameter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters.Jsii$Proxy that = (SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters.Jsii$Proxy) o;

            if (this.documentVersion != null ? !this.documentVersion.equals(that.documentVersion) : that.documentVersion != null) return false;
            return this.parameter != null ? this.parameter.equals(that.parameter) : that.parameter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.documentVersion != null ? this.documentVersion.hashCode() : 0;
            result = 31 * result + (this.parameter != null ? this.parameter.hashCode() : 0);
            return result;
        }
    }
}
