package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.994Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayStageAccessLogSettings")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayStageAccessLogSettings.Jsii$Proxy.class)
public interface ApiGatewayStageAccessLogSettings extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDestinationArn();

    @org.jetbrains.annotations.NotNull java.lang.String getFormat();

    /**
     * @return a {@link Builder} of {@link ApiGatewayStageAccessLogSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayStageAccessLogSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayStageAccessLogSettings> {
        private java.lang.String destinationArn;
        private java.lang.String format;

        /**
         * Sets the value of {@link ApiGatewayStageAccessLogSettings#getDestinationArn}
         * @param destinationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationArn(java.lang.String destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageAccessLogSettings#getFormat}
         * @param format the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayStageAccessLogSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayStageAccessLogSettings build() {
            return new Jsii$Proxy(destinationArn, format);
        }
    }

    /**
     * An implementation for {@link ApiGatewayStageAccessLogSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayStageAccessLogSettings {
        private final java.lang.String destinationArn;
        private final java.lang.String format;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destinationArn = software.amazon.jsii.Kernel.get(this, "destinationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String destinationArn, final java.lang.String format) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destinationArn = java.util.Objects.requireNonNull(destinationArn, "destinationArn is required");
            this.format = java.util.Objects.requireNonNull(format, "format is required");
        }

        @Override
        public final java.lang.String getDestinationArn() {
            return this.destinationArn;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destinationArn", om.valueToTree(this.getDestinationArn()));
            data.set("format", om.valueToTree(this.getFormat()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ApiGatewayStageAccessLogSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayStageAccessLogSettings.Jsii$Proxy that = (ApiGatewayStageAccessLogSettings.Jsii$Proxy) o;

            if (!destinationArn.equals(that.destinationArn)) return false;
            return this.format.equals(that.format);
        }

        @Override
        public final int hashCode() {
            int result = this.destinationArn.hashCode();
            result = 31 * result + (this.format.hashCode());
            return result;
        }
    }
}
