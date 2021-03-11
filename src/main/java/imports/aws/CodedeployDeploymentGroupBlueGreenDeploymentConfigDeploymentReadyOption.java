package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.176Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption.Jsii$Proxy.class)
public interface CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getActionOnTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getWaitTimeInMinutes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> {
        private java.lang.String actionOnTimeout;
        private java.lang.Number waitTimeInMinutes;

        /**
         * Sets the value of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption#getActionOnTimeout}
         * @param actionOnTimeout the value to be set.
         * @return {@code this}
         */
        public Builder actionOnTimeout(java.lang.String actionOnTimeout) {
            this.actionOnTimeout = actionOnTimeout;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption#getWaitTimeInMinutes}
         * @param waitTimeInMinutes the value to be set.
         * @return {@code this}
         */
        public Builder waitTimeInMinutes(java.lang.Number waitTimeInMinutes) {
            this.waitTimeInMinutes = waitTimeInMinutes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption build() {
            return new Jsii$Proxy(actionOnTimeout, waitTimeInMinutes);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption {
        private final java.lang.String actionOnTimeout;
        private final java.lang.Number waitTimeInMinutes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.actionOnTimeout = software.amazon.jsii.Kernel.get(this, "actionOnTimeout", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.waitTimeInMinutes = software.amazon.jsii.Kernel.get(this, "waitTimeInMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String actionOnTimeout, final java.lang.Number waitTimeInMinutes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.actionOnTimeout = actionOnTimeout;
            this.waitTimeInMinutes = waitTimeInMinutes;
        }

        @Override
        public final java.lang.String getActionOnTimeout() {
            return this.actionOnTimeout;
        }

        @Override
        public final java.lang.Number getWaitTimeInMinutes() {
            return this.waitTimeInMinutes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getActionOnTimeout() != null) {
                data.set("actionOnTimeout", om.valueToTree(this.getActionOnTimeout()));
            }
            if (this.getWaitTimeInMinutes() != null) {
                data.set("waitTimeInMinutes", om.valueToTree(this.getWaitTimeInMinutes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption.Jsii$Proxy that = (CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption.Jsii$Proxy) o;

            if (this.actionOnTimeout != null ? !this.actionOnTimeout.equals(that.actionOnTimeout) : that.actionOnTimeout != null) return false;
            return this.waitTimeInMinutes != null ? this.waitTimeInMinutes.equals(that.waitTimeInMinutes) : that.waitTimeInMinutes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.actionOnTimeout != null ? this.actionOnTimeout.hashCode() : 0;
            result = 31 * result + (this.waitTimeInMinutes != null ? this.waitTimeInMinutes.hashCode() : 0);
            return result;
        }
    }
}
