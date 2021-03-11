package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.205Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigDeliveryChannelSnapshotDeliveryProperties")
@software.amazon.jsii.Jsii.Proxy(ConfigDeliveryChannelSnapshotDeliveryProperties.Jsii$Proxy.class)
public interface ConfigDeliveryChannelSnapshotDeliveryProperties extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getDeliveryFrequency() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigDeliveryChannelSnapshotDeliveryProperties}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigDeliveryChannelSnapshotDeliveryProperties}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigDeliveryChannelSnapshotDeliveryProperties> {
        private java.lang.String deliveryFrequency;

        /**
         * Sets the value of {@link ConfigDeliveryChannelSnapshotDeliveryProperties#getDeliveryFrequency}
         * @param deliveryFrequency the value to be set.
         * @return {@code this}
         */
        public Builder deliveryFrequency(java.lang.String deliveryFrequency) {
            this.deliveryFrequency = deliveryFrequency;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigDeliveryChannelSnapshotDeliveryProperties}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigDeliveryChannelSnapshotDeliveryProperties build() {
            return new Jsii$Proxy(deliveryFrequency);
        }
    }

    /**
     * An implementation for {@link ConfigDeliveryChannelSnapshotDeliveryProperties}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigDeliveryChannelSnapshotDeliveryProperties {
        private final java.lang.String deliveryFrequency;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deliveryFrequency = software.amazon.jsii.Kernel.get(this, "deliveryFrequency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String deliveryFrequency) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deliveryFrequency = deliveryFrequency;
        }

        @Override
        public final java.lang.String getDeliveryFrequency() {
            return this.deliveryFrequency;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeliveryFrequency() != null) {
                data.set("deliveryFrequency", om.valueToTree(this.getDeliveryFrequency()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ConfigDeliveryChannelSnapshotDeliveryProperties"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigDeliveryChannelSnapshotDeliveryProperties.Jsii$Proxy that = (ConfigDeliveryChannelSnapshotDeliveryProperties.Jsii$Proxy) o;

            return this.deliveryFrequency != null ? this.deliveryFrequency.equals(that.deliveryFrequency) : that.deliveryFrequency == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deliveryFrequency != null ? this.deliveryFrequency.hashCode() : 0;
            return result;
        }
    }
}
