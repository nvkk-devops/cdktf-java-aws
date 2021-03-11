package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.722Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterOpenMonitoringPrometheusJmxExporter")
@software.amazon.jsii.Jsii.Proxy(MskClusterOpenMonitoringPrometheusJmxExporter.Jsii$Proxy.class)
public interface MskClusterOpenMonitoringPrometheusJmxExporter extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabledInBroker();

    /**
     * @return a {@link Builder} of {@link MskClusterOpenMonitoringPrometheusJmxExporter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterOpenMonitoringPrometheusJmxExporter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterOpenMonitoringPrometheusJmxExporter> {
        private java.lang.Boolean enabledInBroker;

        /**
         * Sets the value of {@link MskClusterOpenMonitoringPrometheusJmxExporter#getEnabledInBroker}
         * @param enabledInBroker the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enabledInBroker(java.lang.Boolean enabledInBroker) {
            this.enabledInBroker = enabledInBroker;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterOpenMonitoringPrometheusJmxExporter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterOpenMonitoringPrometheusJmxExporter build() {
            return new Jsii$Proxy(enabledInBroker);
        }
    }

    /**
     * An implementation for {@link MskClusterOpenMonitoringPrometheusJmxExporter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterOpenMonitoringPrometheusJmxExporter {
        private final java.lang.Boolean enabledInBroker;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabledInBroker = software.amazon.jsii.Kernel.get(this, "enabledInBroker", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean enabledInBroker) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabledInBroker = java.util.Objects.requireNonNull(enabledInBroker, "enabledInBroker is required");
        }

        @Override
        public final java.lang.Boolean getEnabledInBroker() {
            return this.enabledInBroker;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabledInBroker", om.valueToTree(this.getEnabledInBroker()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterOpenMonitoringPrometheusJmxExporter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterOpenMonitoringPrometheusJmxExporter.Jsii$Proxy that = (MskClusterOpenMonitoringPrometheusJmxExporter.Jsii$Proxy) o;

            return this.enabledInBroker.equals(that.enabledInBroker);
        }

        @Override
        public final int hashCode() {
            int result = this.enabledInBroker.hashCode();
            return result;
        }
    }
}
