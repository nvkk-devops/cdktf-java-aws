package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.058Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AthenaWorkgroupConfiguration")
@software.amazon.jsii.Jsii.Proxy(AthenaWorkgroupConfiguration.Jsii$Proxy.class)
public interface AthenaWorkgroupConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getBytesScannedCutoffPerQuery() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnforceWorkgroupConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPublishCloudwatchMetricsEnabled() {
        return null;
    }

    /**
     * result_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfiguration> getResultConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AthenaWorkgroupConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AthenaWorkgroupConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AthenaWorkgroupConfiguration> {
        private java.lang.Number bytesScannedCutoffPerQuery;
        private java.lang.Boolean enforceWorkgroupConfiguration;
        private java.lang.Boolean publishCloudwatchMetricsEnabled;
        private java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfiguration> resultConfiguration;

        /**
         * Sets the value of {@link AthenaWorkgroupConfiguration#getBytesScannedCutoffPerQuery}
         * @param bytesScannedCutoffPerQuery the value to be set.
         * @return {@code this}
         */
        public Builder bytesScannedCutoffPerQuery(java.lang.Number bytesScannedCutoffPerQuery) {
            this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            return this;
        }

        /**
         * Sets the value of {@link AthenaWorkgroupConfiguration#getEnforceWorkgroupConfiguration}
         * @param enforceWorkgroupConfiguration the value to be set.
         * @return {@code this}
         */
        public Builder enforceWorkgroupConfiguration(java.lang.Boolean enforceWorkgroupConfiguration) {
            this.enforceWorkgroupConfiguration = enforceWorkgroupConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AthenaWorkgroupConfiguration#getPublishCloudwatchMetricsEnabled}
         * @param publishCloudwatchMetricsEnabled the value to be set.
         * @return {@code this}
         */
        public Builder publishCloudwatchMetricsEnabled(java.lang.Boolean publishCloudwatchMetricsEnabled) {
            this.publishCloudwatchMetricsEnabled = publishCloudwatchMetricsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link AthenaWorkgroupConfiguration#getResultConfiguration}
         * @param resultConfiguration result_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder resultConfiguration(java.util.List<? extends imports.aws.AthenaWorkgroupConfigurationResultConfiguration> resultConfiguration) {
            this.resultConfiguration = (java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfiguration>)resultConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AthenaWorkgroupConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AthenaWorkgroupConfiguration build() {
            return new Jsii$Proxy(bytesScannedCutoffPerQuery, enforceWorkgroupConfiguration, publishCloudwatchMetricsEnabled, resultConfiguration);
        }
    }

    /**
     * An implementation for {@link AthenaWorkgroupConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AthenaWorkgroupConfiguration {
        private final java.lang.Number bytesScannedCutoffPerQuery;
        private final java.lang.Boolean enforceWorkgroupConfiguration;
        private final java.lang.Boolean publishCloudwatchMetricsEnabled;
        private final java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfiguration> resultConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bytesScannedCutoffPerQuery = software.amazon.jsii.Kernel.get(this, "bytesScannedCutoffPerQuery", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.enforceWorkgroupConfiguration = software.amazon.jsii.Kernel.get(this, "enforceWorkgroupConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.publishCloudwatchMetricsEnabled = software.amazon.jsii.Kernel.get(this, "publishCloudwatchMetricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.resultConfiguration = software.amazon.jsii.Kernel.get(this, "resultConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AthenaWorkgroupConfigurationResultConfiguration.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number bytesScannedCutoffPerQuery, final java.lang.Boolean enforceWorkgroupConfiguration, final java.lang.Boolean publishCloudwatchMetricsEnabled, final java.util.List<? extends imports.aws.AthenaWorkgroupConfigurationResultConfiguration> resultConfiguration) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            this.enforceWorkgroupConfiguration = enforceWorkgroupConfiguration;
            this.publishCloudwatchMetricsEnabled = publishCloudwatchMetricsEnabled;
            this.resultConfiguration = (java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfiguration>)resultConfiguration;
        }

        @Override
        public final java.lang.Number getBytesScannedCutoffPerQuery() {
            return this.bytesScannedCutoffPerQuery;
        }

        @Override
        public final java.lang.Boolean getEnforceWorkgroupConfiguration() {
            return this.enforceWorkgroupConfiguration;
        }

        @Override
        public final java.lang.Boolean getPublishCloudwatchMetricsEnabled() {
            return this.publishCloudwatchMetricsEnabled;
        }

        @Override
        public final java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfiguration> getResultConfiguration() {
            return this.resultConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBytesScannedCutoffPerQuery() != null) {
                data.set("bytesScannedCutoffPerQuery", om.valueToTree(this.getBytesScannedCutoffPerQuery()));
            }
            if (this.getEnforceWorkgroupConfiguration() != null) {
                data.set("enforceWorkgroupConfiguration", om.valueToTree(this.getEnforceWorkgroupConfiguration()));
            }
            if (this.getPublishCloudwatchMetricsEnabled() != null) {
                data.set("publishCloudwatchMetricsEnabled", om.valueToTree(this.getPublishCloudwatchMetricsEnabled()));
            }
            if (this.getResultConfiguration() != null) {
                data.set("resultConfiguration", om.valueToTree(this.getResultConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AthenaWorkgroupConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AthenaWorkgroupConfiguration.Jsii$Proxy that = (AthenaWorkgroupConfiguration.Jsii$Proxy) o;

            if (this.bytesScannedCutoffPerQuery != null ? !this.bytesScannedCutoffPerQuery.equals(that.bytesScannedCutoffPerQuery) : that.bytesScannedCutoffPerQuery != null) return false;
            if (this.enforceWorkgroupConfiguration != null ? !this.enforceWorkgroupConfiguration.equals(that.enforceWorkgroupConfiguration) : that.enforceWorkgroupConfiguration != null) return false;
            if (this.publishCloudwatchMetricsEnabled != null ? !this.publishCloudwatchMetricsEnabled.equals(that.publishCloudwatchMetricsEnabled) : that.publishCloudwatchMetricsEnabled != null) return false;
            return this.resultConfiguration != null ? this.resultConfiguration.equals(that.resultConfiguration) : that.resultConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bytesScannedCutoffPerQuery != null ? this.bytesScannedCutoffPerQuery.hashCode() : 0;
            result = 31 * result + (this.enforceWorkgroupConfiguration != null ? this.enforceWorkgroupConfiguration.hashCode() : 0);
            result = 31 * result + (this.publishCloudwatchMetricsEnabled != null ? this.publishCloudwatchMetricsEnabled.hashCode() : 0);
            result = 31 * result + (this.resultConfiguration != null ? this.resultConfiguration.hashCode() : 0);
            return result;
        }
    }
}
