package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.722Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterOpenMonitoringPrometheus")
@software.amazon.jsii.Jsii.Proxy(MskClusterOpenMonitoringPrometheus.Jsii$Proxy.class)
public interface MskClusterOpenMonitoringPrometheus extends software.amazon.jsii.JsiiSerializable {

    /**
     * jmx_exporter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter> getJmxExporter() {
        return null;
    }

    /**
     * node_exporter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter> getNodeExporter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterOpenMonitoringPrometheus}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterOpenMonitoringPrometheus}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterOpenMonitoringPrometheus> {
        private java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter> jmxExporter;
        private java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter> nodeExporter;

        /**
         * Sets the value of {@link MskClusterOpenMonitoringPrometheus#getJmxExporter}
         * @param jmxExporter jmx_exporter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder jmxExporter(java.util.List<? extends imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter> jmxExporter) {
            this.jmxExporter = (java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter>)jmxExporter;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterOpenMonitoringPrometheus#getNodeExporter}
         * @param nodeExporter node_exporter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder nodeExporter(java.util.List<? extends imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter> nodeExporter) {
            this.nodeExporter = (java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter>)nodeExporter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterOpenMonitoringPrometheus}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterOpenMonitoringPrometheus build() {
            return new Jsii$Proxy(jmxExporter, nodeExporter);
        }
    }

    /**
     * An implementation for {@link MskClusterOpenMonitoringPrometheus}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterOpenMonitoringPrometheus {
        private final java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter> jmxExporter;
        private final java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter> nodeExporter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jmxExporter = software.amazon.jsii.Kernel.get(this, "jmxExporter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter.class)));
            this.nodeExporter = software.amazon.jsii.Kernel.get(this, "nodeExporter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter> jmxExporter, final java.util.List<? extends imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter> nodeExporter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jmxExporter = (java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter>)jmxExporter;
            this.nodeExporter = (java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter>)nodeExporter;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusJmxExporter> getJmxExporter() {
            return this.jmxExporter;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterOpenMonitoringPrometheusNodeExporter> getNodeExporter() {
            return this.nodeExporter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getJmxExporter() != null) {
                data.set("jmxExporter", om.valueToTree(this.getJmxExporter()));
            }
            if (this.getNodeExporter() != null) {
                data.set("nodeExporter", om.valueToTree(this.getNodeExporter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterOpenMonitoringPrometheus"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterOpenMonitoringPrometheus.Jsii$Proxy that = (MskClusterOpenMonitoringPrometheus.Jsii$Proxy) o;

            if (this.jmxExporter != null ? !this.jmxExporter.equals(that.jmxExporter) : that.jmxExporter != null) return false;
            return this.nodeExporter != null ? this.nodeExporter.equals(that.nodeExporter) : that.nodeExporter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.jmxExporter != null ? this.jmxExporter.hashCode() : 0;
            result = 31 * result + (this.nodeExporter != null ? this.nodeExporter.hashCode() : 0);
            return result;
        }
    }
}
