package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.676Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess")
@software.amazon.jsii.Jsii.Proxy(LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess.Jsii$Proxy.class)
public interface LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDestination();

    /**
     * @return a {@link Builder} of {@link LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess> {
        private java.lang.String destination;

        /**
         * Sets the value of {@link LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess#getDestination}
         * @param destination the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destination(java.lang.String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess build() {
            return new Jsii$Proxy(destination);
        }
    }

    /**
     * An implementation for {@link LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess {
        private final java.lang.String destination;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String destination) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = java.util.Objects.requireNonNull(destination, "destination is required");
        }

        @Override
        public final java.lang.String getDestination() {
            return this.destination;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destination", om.valueToTree(this.getDestination()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess.Jsii$Proxy that = (LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess.Jsii$Proxy) o;

            return this.destination.equals(that.destination);
        }

        @Override
        public final int hashCode() {
            int result = this.destination.hashCode();
            return result;
        }
    }
}
