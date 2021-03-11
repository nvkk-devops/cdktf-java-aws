package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.940Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbListenerDefaultActionFixedResponse")
@software.amazon.jsii.Jsii.Proxy(AlbListenerDefaultActionFixedResponse.Jsii$Proxy.class)
public interface AlbListenerDefaultActionFixedResponse extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getContentType();

    default @org.jetbrains.annotations.Nullable java.lang.String getMessageBody() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatusCode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbListenerDefaultActionFixedResponse}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbListenerDefaultActionFixedResponse}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbListenerDefaultActionFixedResponse> {
        private java.lang.String contentType;
        private java.lang.String messageBody;
        private java.lang.String statusCode;

        /**
         * Sets the value of {@link AlbListenerDefaultActionFixedResponse#getContentType}
         * @param contentType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionFixedResponse#getMessageBody}
         * @param messageBody the value to be set.
         * @return {@code this}
         */
        public Builder messageBody(java.lang.String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionFixedResponse#getStatusCode}
         * @param statusCode the value to be set.
         * @return {@code this}
         */
        public Builder statusCode(java.lang.String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbListenerDefaultActionFixedResponse}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbListenerDefaultActionFixedResponse build() {
            return new Jsii$Proxy(contentType, messageBody, statusCode);
        }
    }

    /**
     * An implementation for {@link AlbListenerDefaultActionFixedResponse}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbListenerDefaultActionFixedResponse {
        private final java.lang.String contentType;
        private final java.lang.String messageBody;
        private final java.lang.String statusCode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.messageBody = software.amazon.jsii.Kernel.get(this, "messageBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.statusCode = software.amazon.jsii.Kernel.get(this, "statusCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String contentType, final java.lang.String messageBody, final java.lang.String statusCode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.contentType = java.util.Objects.requireNonNull(contentType, "contentType is required");
            this.messageBody = messageBody;
            this.statusCode = statusCode;
        }

        @Override
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.String getMessageBody() {
            return this.messageBody;
        }

        @Override
        public final java.lang.String getStatusCode() {
            return this.statusCode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("contentType", om.valueToTree(this.getContentType()));
            if (this.getMessageBody() != null) {
                data.set("messageBody", om.valueToTree(this.getMessageBody()));
            }
            if (this.getStatusCode() != null) {
                data.set("statusCode", om.valueToTree(this.getStatusCode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AlbListenerDefaultActionFixedResponse"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbListenerDefaultActionFixedResponse.Jsii$Proxy that = (AlbListenerDefaultActionFixedResponse.Jsii$Proxy) o;

            if (!contentType.equals(that.contentType)) return false;
            if (this.messageBody != null ? !this.messageBody.equals(that.messageBody) : that.messageBody != null) return false;
            return this.statusCode != null ? this.statusCode.equals(that.statusCode) : that.statusCode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.contentType.hashCode();
            result = 31 * result + (this.messageBody != null ? this.messageBody.hashCode() : 0);
            result = 31 * result + (this.statusCode != null ? this.statusCode.hashCode() : 0);
            return result;
        }
    }
}
