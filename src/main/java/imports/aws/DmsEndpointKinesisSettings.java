package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.443Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsEndpointKinesisSettings")
@software.amazon.jsii.Jsii.Proxy(DmsEndpointKinesisSettings.Jsii$Proxy.class)
public interface DmsEndpointKinesisSettings extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getMessageFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStreamArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsEndpointKinesisSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsEndpointKinesisSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsEndpointKinesisSettings> {
        private java.lang.String messageFormat;
        private java.lang.String serviceAccessRoleArn;
        private java.lang.String streamArn;

        /**
         * Sets the value of {@link DmsEndpointKinesisSettings#getMessageFormat}
         * @param messageFormat the value to be set.
         * @return {@code this}
         */
        public Builder messageFormat(java.lang.String messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointKinesisSettings#getServiceAccessRoleArn}
         * @param serviceAccessRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder serviceAccessRoleArn(java.lang.String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointKinesisSettings#getStreamArn}
         * @param streamArn the value to be set.
         * @return {@code this}
         */
        public Builder streamArn(java.lang.String streamArn) {
            this.streamArn = streamArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DmsEndpointKinesisSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsEndpointKinesisSettings build() {
            return new Jsii$Proxy(messageFormat, serviceAccessRoleArn, streamArn);
        }
    }

    /**
     * An implementation for {@link DmsEndpointKinesisSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsEndpointKinesisSettings {
        private final java.lang.String messageFormat;
        private final java.lang.String serviceAccessRoleArn;
        private final java.lang.String streamArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.messageFormat = software.amazon.jsii.Kernel.get(this, "messageFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceAccessRoleArn = software.amazon.jsii.Kernel.get(this, "serviceAccessRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.streamArn = software.amazon.jsii.Kernel.get(this, "streamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String messageFormat, final java.lang.String serviceAccessRoleArn, final java.lang.String streamArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.messageFormat = messageFormat;
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            this.streamArn = streamArn;
        }

        @Override
        public final java.lang.String getMessageFormat() {
            return this.messageFormat;
        }

        @Override
        public final java.lang.String getServiceAccessRoleArn() {
            return this.serviceAccessRoleArn;
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

            if (this.getMessageFormat() != null) {
                data.set("messageFormat", om.valueToTree(this.getMessageFormat()));
            }
            if (this.getServiceAccessRoleArn() != null) {
                data.set("serviceAccessRoleArn", om.valueToTree(this.getServiceAccessRoleArn()));
            }
            if (this.getStreamArn() != null) {
                data.set("streamArn", om.valueToTree(this.getStreamArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DmsEndpointKinesisSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsEndpointKinesisSettings.Jsii$Proxy that = (DmsEndpointKinesisSettings.Jsii$Proxy) o;

            if (this.messageFormat != null ? !this.messageFormat.equals(that.messageFormat) : that.messageFormat != null) return false;
            if (this.serviceAccessRoleArn != null ? !this.serviceAccessRoleArn.equals(that.serviceAccessRoleArn) : that.serviceAccessRoleArn != null) return false;
            return this.streamArn != null ? this.streamArn.equals(that.streamArn) : that.streamArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.messageFormat != null ? this.messageFormat.hashCode() : 0;
            result = 31 * result + (this.serviceAccessRoleArn != null ? this.serviceAccessRoleArn.hashCode() : 0);
            result = 31 * result + (this.streamArn != null ? this.streamArn.hashCode() : 0);
            return result;
        }
    }
}
