package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.174Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentConfigTrafficRoutingConfig")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentConfigTrafficRoutingConfig.Jsii$Proxy.class)
public interface CodedeployDeploymentConfigTrafficRoutingConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * time_based_canary block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary> getTimeBasedCanary() {
        return null;
    }

    /**
     * time_based_linear block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear> getTimeBasedLinear() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentConfigTrafficRoutingConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentConfigTrafficRoutingConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentConfigTrafficRoutingConfig> {
        private java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary> timeBasedCanary;
        private java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear> timeBasedLinear;
        private java.lang.String type;

        /**
         * Sets the value of {@link CodedeployDeploymentConfigTrafficRoutingConfig#getTimeBasedCanary}
         * @param timeBasedCanary time_based_canary block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder timeBasedCanary(java.util.List<? extends imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary> timeBasedCanary) {
            this.timeBasedCanary = (java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary>)timeBasedCanary;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigTrafficRoutingConfig#getTimeBasedLinear}
         * @param timeBasedLinear time_based_linear block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder timeBasedLinear(java.util.List<? extends imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear> timeBasedLinear) {
            this.timeBasedLinear = (java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear>)timeBasedLinear;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigTrafficRoutingConfig#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentConfigTrafficRoutingConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentConfigTrafficRoutingConfig build() {
            return new Jsii$Proxy(timeBasedCanary, timeBasedLinear, type);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentConfigTrafficRoutingConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentConfigTrafficRoutingConfig {
        private final java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary> timeBasedCanary;
        private final java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear> timeBasedLinear;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.timeBasedCanary = software.amazon.jsii.Kernel.get(this, "timeBasedCanary", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary.class)));
            this.timeBasedLinear = software.amazon.jsii.Kernel.get(this, "timeBasedLinear", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary> timeBasedCanary, final java.util.List<? extends imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear> timeBasedLinear, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.timeBasedCanary = (java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary>)timeBasedCanary;
            this.timeBasedLinear = (java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear>)timeBasedLinear;
            this.type = type;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary> getTimeBasedCanary() {
            return this.timeBasedCanary;
        }

        @Override
        public final java.util.List<imports.aws.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear> getTimeBasedLinear() {
            return this.timeBasedLinear;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTimeBasedCanary() != null) {
                data.set("timeBasedCanary", om.valueToTree(this.getTimeBasedCanary()));
            }
            if (this.getTimeBasedLinear() != null) {
                data.set("timeBasedLinear", om.valueToTree(this.getTimeBasedLinear()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentConfigTrafficRoutingConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentConfigTrafficRoutingConfig.Jsii$Proxy that = (CodedeployDeploymentConfigTrafficRoutingConfig.Jsii$Proxy) o;

            if (this.timeBasedCanary != null ? !this.timeBasedCanary.equals(that.timeBasedCanary) : that.timeBasedCanary != null) return false;
            if (this.timeBasedLinear != null ? !this.timeBasedLinear.equals(that.timeBasedLinear) : that.timeBasedLinear != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.timeBasedCanary != null ? this.timeBasedCanary.hashCode() : 0;
            result = 31 * result + (this.timeBasedLinear != null ? this.timeBasedLinear.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
