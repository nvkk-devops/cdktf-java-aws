package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.864Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesReceiptRuleBounceAction")
@software.amazon.jsii.Jsii.Proxy(SesReceiptRuleBounceAction.Jsii$Proxy.class)
public interface SesReceiptRuleBounceAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getMessage();

    @org.jetbrains.annotations.NotNull java.lang.Number getPosition();

    @org.jetbrains.annotations.NotNull java.lang.String getSender();

    @org.jetbrains.annotations.NotNull java.lang.String getSmtpReplyCode();

    default @org.jetbrains.annotations.Nullable java.lang.String getStatusCode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTopicArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SesReceiptRuleBounceAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesReceiptRuleBounceAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesReceiptRuleBounceAction> {
        private java.lang.String message;
        private java.lang.Number position;
        private java.lang.String sender;
        private java.lang.String smtpReplyCode;
        private java.lang.String statusCode;
        private java.lang.String topicArn;

        /**
         * Sets the value of {@link SesReceiptRuleBounceAction#getMessage}
         * @param message the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleBounceAction#getPosition}
         * @param position the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder position(java.lang.Number position) {
            this.position = position;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleBounceAction#getSender}
         * @param sender the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sender(java.lang.String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleBounceAction#getSmtpReplyCode}
         * @param smtpReplyCode the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder smtpReplyCode(java.lang.String smtpReplyCode) {
            this.smtpReplyCode = smtpReplyCode;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleBounceAction#getStatusCode}
         * @param statusCode the value to be set.
         * @return {@code this}
         */
        public Builder statusCode(java.lang.String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleBounceAction#getTopicArn}
         * @param topicArn the value to be set.
         * @return {@code this}
         */
        public Builder topicArn(java.lang.String topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesReceiptRuleBounceAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesReceiptRuleBounceAction build() {
            return new Jsii$Proxy(message, position, sender, smtpReplyCode, statusCode, topicArn);
        }
    }

    /**
     * An implementation for {@link SesReceiptRuleBounceAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesReceiptRuleBounceAction {
        private final java.lang.String message;
        private final java.lang.Number position;
        private final java.lang.String sender;
        private final java.lang.String smtpReplyCode;
        private final java.lang.String statusCode;
        private final java.lang.String topicArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.position = software.amazon.jsii.Kernel.get(this, "position", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.sender = software.amazon.jsii.Kernel.get(this, "sender", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.smtpReplyCode = software.amazon.jsii.Kernel.get(this, "smtpReplyCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.statusCode = software.amazon.jsii.Kernel.get(this, "statusCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.topicArn = software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String message, final java.lang.Number position, final java.lang.String sender, final java.lang.String smtpReplyCode, final java.lang.String statusCode, final java.lang.String topicArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.message = java.util.Objects.requireNonNull(message, "message is required");
            this.position = java.util.Objects.requireNonNull(position, "position is required");
            this.sender = java.util.Objects.requireNonNull(sender, "sender is required");
            this.smtpReplyCode = java.util.Objects.requireNonNull(smtpReplyCode, "smtpReplyCode is required");
            this.statusCode = statusCode;
            this.topicArn = topicArn;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public final java.lang.Number getPosition() {
            return this.position;
        }

        @Override
        public final java.lang.String getSender() {
            return this.sender;
        }

        @Override
        public final java.lang.String getSmtpReplyCode() {
            return this.smtpReplyCode;
        }

        @Override
        public final java.lang.String getStatusCode() {
            return this.statusCode;
        }

        @Override
        public final java.lang.String getTopicArn() {
            return this.topicArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("message", om.valueToTree(this.getMessage()));
            data.set("position", om.valueToTree(this.getPosition()));
            data.set("sender", om.valueToTree(this.getSender()));
            data.set("smtpReplyCode", om.valueToTree(this.getSmtpReplyCode()));
            if (this.getStatusCode() != null) {
                data.set("statusCode", om.valueToTree(this.getStatusCode()));
            }
            if (this.getTopicArn() != null) {
                data.set("topicArn", om.valueToTree(this.getTopicArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SesReceiptRuleBounceAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesReceiptRuleBounceAction.Jsii$Proxy that = (SesReceiptRuleBounceAction.Jsii$Proxy) o;

            if (!message.equals(that.message)) return false;
            if (!position.equals(that.position)) return false;
            if (!sender.equals(that.sender)) return false;
            if (!smtpReplyCode.equals(that.smtpReplyCode)) return false;
            if (this.statusCode != null ? !this.statusCode.equals(that.statusCode) : that.statusCode != null) return false;
            return this.topicArn != null ? this.topicArn.equals(that.topicArn) : that.topicArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.message.hashCode();
            result = 31 * result + (this.position.hashCode());
            result = 31 * result + (this.sender.hashCode());
            result = 31 * result + (this.smtpReplyCode.hashCode());
            result = 31 * result + (this.statusCode != null ? this.statusCode.hashCode() : 0);
            result = 31 * result + (this.topicArn != null ? this.topicArn.hashCode() : 0);
            return result;
        }
    }
}
