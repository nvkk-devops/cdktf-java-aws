package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.721Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterLoggingInfoBrokerLogsFirehose")
@software.amazon.jsii.Jsii.Proxy(MskClusterLoggingInfoBrokerLogsFirehose.Jsii$Proxy.class)
public interface MskClusterLoggingInfoBrokerLogsFirehose extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled();

    default @org.jetbrains.annotations.Nullable java.lang.String getDeliveryStream() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterLoggingInfoBrokerLogsFirehose}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterLoggingInfoBrokerLogsFirehose}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterLoggingInfoBrokerLogsFirehose> {
        private java.lang.Boolean enabled;
        private java.lang.String deliveryStream;

        /**
         * Sets the value of {@link MskClusterLoggingInfoBrokerLogsFirehose#getEnabled}
         * @param enabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterLoggingInfoBrokerLogsFirehose#getDeliveryStream}
         * @param deliveryStream the value to be set.
         * @return {@code this}
         */
        public Builder deliveryStream(java.lang.String deliveryStream) {
            this.deliveryStream = deliveryStream;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterLoggingInfoBrokerLogsFirehose}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterLoggingInfoBrokerLogsFirehose build() {
            return new Jsii$Proxy(enabled, deliveryStream);
        }
    }

    /**
     * An implementation for {@link MskClusterLoggingInfoBrokerLogsFirehose}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterLoggingInfoBrokerLogsFirehose {
        private final java.lang.Boolean enabled;
        private final java.lang.String deliveryStream;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.deliveryStream = software.amazon.jsii.Kernel.get(this, "deliveryStream", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean enabled, final java.lang.String deliveryStream) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(enabled, "enabled is required");
            this.deliveryStream = deliveryStream;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getDeliveryStream() {
            return this.deliveryStream;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabled", om.valueToTree(this.getEnabled()));
            if (this.getDeliveryStream() != null) {
                data.set("deliveryStream", om.valueToTree(this.getDeliveryStream()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterLoggingInfoBrokerLogsFirehose"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterLoggingInfoBrokerLogsFirehose.Jsii$Proxy that = (MskClusterLoggingInfoBrokerLogsFirehose.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            return this.deliveryStream != null ? this.deliveryStream.equals(that.deliveryStream) : that.deliveryStream == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            result = 31 * result + (this.deliveryStream != null ? this.deliveryStream.hashCode() : 0);
            return result;
        }
    }
}
