package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.665Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters> getParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors> {
        private java.lang.String type;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters> parameters;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors#getParameters}
         * @param parameters parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder parameters(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters> parameters) {
            this.parameters = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters>)parameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors build() {
            return new Jsii$Proxy(type, parameters);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors {
        private final java.lang.String type;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters> parameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String type, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters> parameters) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.parameters = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters>)parameters;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorsParameters> getParameters() {
            return this.parameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessors.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.parameters != null ? this.parameters.equals(that.parameters) : that.parameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            return result;
        }
    }
}
