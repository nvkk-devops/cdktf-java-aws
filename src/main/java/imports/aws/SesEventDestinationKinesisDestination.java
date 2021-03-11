package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.862Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesEventDestinationKinesisDestination")
@software.amazon.jsii.Jsii.Proxy(SesEventDestinationKinesisDestination.Jsii$Proxy.class)
public interface SesEventDestinationKinesisDestination extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getStreamArn();

    /**
     * @return a {@link Builder} of {@link SesEventDestinationKinesisDestination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesEventDestinationKinesisDestination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesEventDestinationKinesisDestination> {
        private java.lang.String roleArn;
        private java.lang.String streamArn;

        /**
         * Sets the value of {@link SesEventDestinationKinesisDestination#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationKinesisDestination#getStreamArn}
         * @param streamArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder streamArn(java.lang.String streamArn) {
            this.streamArn = streamArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesEventDestinationKinesisDestination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesEventDestinationKinesisDestination build() {
            return new Jsii$Proxy(roleArn, streamArn);
        }
    }

    /**
     * An implementation for {@link SesEventDestinationKinesisDestination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesEventDestinationKinesisDestination {
        private final java.lang.String roleArn;
        private final java.lang.String streamArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.streamArn = software.amazon.jsii.Kernel.get(this, "streamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String roleArn, final java.lang.String streamArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.streamArn = java.util.Objects.requireNonNull(streamArn, "streamArn is required");
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getStreamArn() {
            return this.streamArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("streamArn", om.valueToTree(this.getStreamArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SesEventDestinationKinesisDestination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesEventDestinationKinesisDestination.Jsii$Proxy that = (SesEventDestinationKinesisDestination.Jsii$Proxy) o;

            if (!roleArn.equals(that.roleArn)) return false;
            return this.streamArn.equals(that.streamArn);
        }

        @Override
        public final int hashCode() {
            int result = this.roleArn.hashCode();
            result = 31 * result + (this.streamArn.hashCode());
            return result;
        }
    }
}
