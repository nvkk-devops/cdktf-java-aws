package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.174Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear.Jsii$Proxy.class)
public interface CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getInterval() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPercentage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear> {
        private java.lang.Number interval;
        private java.lang.Number percentage;

        /**
         * Sets the value of {@link CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear#getInterval}
         * @param interval the value to be set.
         * @return {@code this}
         */
        public Builder interval(java.lang.Number interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear#getPercentage}
         * @param percentage the value to be set.
         * @return {@code this}
         */
        public Builder percentage(java.lang.Number percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear build() {
            return new Jsii$Proxy(interval, percentage);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear {
        private final java.lang.Number interval;
        private final java.lang.Number percentage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.interval = software.amazon.jsii.Kernel.get(this, "interval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.percentage = software.amazon.jsii.Kernel.get(this, "percentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number interval, final java.lang.Number percentage) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.interval = interval;
            this.percentage = percentage;
        }

        @Override
        public final java.lang.Number getInterval() {
            return this.interval;
        }

        @Override
        public final java.lang.Number getPercentage() {
            return this.percentage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getInterval() != null) {
                data.set("interval", om.valueToTree(this.getInterval()));
            }
            if (this.getPercentage() != null) {
                data.set("percentage", om.valueToTree(this.getPercentage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear.Jsii$Proxy that = (CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear.Jsii$Proxy) o;

            if (this.interval != null ? !this.interval.equals(that.interval) : that.interval != null) return false;
            return this.percentage != null ? this.percentage.equals(that.percentage) : that.percentage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.interval != null ? this.interval.hashCode() : 0;
            result = 31 * result + (this.percentage != null ? this.percentage.hashCode() : 0);
            return result;
        }
    }
}
