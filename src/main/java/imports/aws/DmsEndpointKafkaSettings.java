package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.443Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsEndpointKafkaSettings")
@software.amazon.jsii.Jsii.Proxy(DmsEndpointKafkaSettings.Jsii$Proxy.class)
public interface DmsEndpointKafkaSettings extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBroker();

    default @org.jetbrains.annotations.Nullable java.lang.String getTopic() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsEndpointKafkaSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsEndpointKafkaSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsEndpointKafkaSettings> {
        private java.lang.String broker;
        private java.lang.String topic;

        /**
         * Sets the value of {@link DmsEndpointKafkaSettings#getBroker}
         * @param broker the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder broker(java.lang.String broker) {
            this.broker = broker;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointKafkaSettings#getTopic}
         * @param topic the value to be set.
         * @return {@code this}
         */
        public Builder topic(java.lang.String topic) {
            this.topic = topic;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DmsEndpointKafkaSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsEndpointKafkaSettings build() {
            return new Jsii$Proxy(broker, topic);
        }
    }

    /**
     * An implementation for {@link DmsEndpointKafkaSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsEndpointKafkaSettings {
        private final java.lang.String broker;
        private final java.lang.String topic;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.broker = software.amazon.jsii.Kernel.get(this, "broker", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.topic = software.amazon.jsii.Kernel.get(this, "topic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String broker, final java.lang.String topic) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.broker = java.util.Objects.requireNonNull(broker, "broker is required");
            this.topic = topic;
        }

        @Override
        public final java.lang.String getBroker() {
            return this.broker;
        }

        @Override
        public final java.lang.String getTopic() {
            return this.topic;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("broker", om.valueToTree(this.getBroker()));
            if (this.getTopic() != null) {
                data.set("topic", om.valueToTree(this.getTopic()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DmsEndpointKafkaSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsEndpointKafkaSettings.Jsii$Proxy that = (DmsEndpointKafkaSettings.Jsii$Proxy) o;

            if (!broker.equals(that.broker)) return false;
            return this.topic != null ? this.topic.equals(that.topic) : that.topic == null;
        }

        @Override
        public final int hashCode() {
            int result = this.broker.hashCode();
            result = 31 * result + (this.topic != null ? this.topic.hashCode() : 0);
            return result;
        }
    }
}
