package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.664Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * processors block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors> getProcessors() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> {
        private java.lang.Boolean enabled;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors> processors;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration#getProcessors}
         * @param processors processors block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder processors(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors> processors) {
            this.processors = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors>)processors;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration build() {
            return new Jsii$Proxy(enabled, processors);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration {
        private final java.lang.Boolean enabled;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors> processors;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.processors = software.amazon.jsii.Kernel.get(this, "processors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean enabled, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors> processors) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = enabled;
            this.processors = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors>)processors;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors> getProcessors() {
            return this.processors;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getProcessors() != null) {
                data.set("processors", om.valueToTree(this.getProcessors()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration.Jsii$Proxy) o;

            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            return this.processors != null ? this.processors.equals(that.processors) : that.processors == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled != null ? this.enabled.hashCode() : 0;
            result = 31 * result + (this.processors != null ? this.processors.hashCode() : 0);
            return result;
        }
    }
}
