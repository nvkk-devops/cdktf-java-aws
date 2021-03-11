package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.058Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AthenaWorkgroupConfigurationResultConfiguration")
@software.amazon.jsii.Jsii.Proxy(AthenaWorkgroupConfigurationResultConfiguration.Jsii$Proxy.class)
public interface AthenaWorkgroupConfigurationResultConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * encryption_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration> getEncryptionConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOutputLocation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AthenaWorkgroupConfigurationResultConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AthenaWorkgroupConfigurationResultConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AthenaWorkgroupConfigurationResultConfiguration> {
        private java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration> encryptionConfiguration;
        private java.lang.String outputLocation;

        /**
         * Sets the value of {@link AthenaWorkgroupConfigurationResultConfiguration#getEncryptionConfiguration}
         * @param encryptionConfiguration encryption_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryptionConfiguration(java.util.List<? extends imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration> encryptionConfiguration) {
            this.encryptionConfiguration = (java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration>)encryptionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AthenaWorkgroupConfigurationResultConfiguration#getOutputLocation}
         * @param outputLocation the value to be set.
         * @return {@code this}
         */
        public Builder outputLocation(java.lang.String outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AthenaWorkgroupConfigurationResultConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AthenaWorkgroupConfigurationResultConfiguration build() {
            return new Jsii$Proxy(encryptionConfiguration, outputLocation);
        }
    }

    /**
     * An implementation for {@link AthenaWorkgroupConfigurationResultConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AthenaWorkgroupConfigurationResultConfiguration {
        private final java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration> encryptionConfiguration;
        private final java.lang.String outputLocation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.encryptionConfiguration = software.amazon.jsii.Kernel.get(this, "encryptionConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration.class)));
            this.outputLocation = software.amazon.jsii.Kernel.get(this, "outputLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration> encryptionConfiguration, final java.lang.String outputLocation) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.encryptionConfiguration = (java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration>)encryptionConfiguration;
            this.outputLocation = outputLocation;
        }

        @Override
        public final java.util.List<imports.aws.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration> getEncryptionConfiguration() {
            return this.encryptionConfiguration;
        }

        @Override
        public final java.lang.String getOutputLocation() {
            return this.outputLocation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEncryptionConfiguration() != null) {
                data.set("encryptionConfiguration", om.valueToTree(this.getEncryptionConfiguration()));
            }
            if (this.getOutputLocation() != null) {
                data.set("outputLocation", om.valueToTree(this.getOutputLocation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AthenaWorkgroupConfigurationResultConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AthenaWorkgroupConfigurationResultConfiguration.Jsii$Proxy that = (AthenaWorkgroupConfigurationResultConfiguration.Jsii$Proxy) o;

            if (this.encryptionConfiguration != null ? !this.encryptionConfiguration.equals(that.encryptionConfiguration) : that.encryptionConfiguration != null) return false;
            return this.outputLocation != null ? this.outputLocation.equals(that.outputLocation) : that.outputLocation == null;
        }

        @Override
        public final int hashCode() {
            int result = this.encryptionConfiguration != null ? this.encryptionConfiguration.hashCode() : 0;
            result = 31 * result + (this.outputLocation != null ? this.outputLocation.hashCode() : 0);
            return result;
        }
    }
}
