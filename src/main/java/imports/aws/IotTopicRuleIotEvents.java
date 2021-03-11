package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.643Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleIotEvents")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleIotEvents.Jsii$Proxy.class)
public interface IotTopicRuleIotEvents extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getInputName();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getMessageId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleIotEvents}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleIotEvents}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleIotEvents> {
        private java.lang.String inputName;
        private java.lang.String roleArn;
        private java.lang.String messageId;

        /**
         * Sets the value of {@link IotTopicRuleIotEvents#getInputName}
         * @param inputName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder inputName(java.lang.String inputName) {
            this.inputName = inputName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleIotEvents#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleIotEvents#getMessageId}
         * @param messageId the value to be set.
         * @return {@code this}
         */
        public Builder messageId(java.lang.String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleIotEvents}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleIotEvents build() {
            return new Jsii$Proxy(inputName, roleArn, messageId);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleIotEvents}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleIotEvents {
        private final java.lang.String inputName;
        private final java.lang.String roleArn;
        private final java.lang.String messageId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.inputName = software.amazon.jsii.Kernel.get(this, "inputName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.messageId = software.amazon.jsii.Kernel.get(this, "messageId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String inputName, final java.lang.String roleArn, final java.lang.String messageId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.inputName = java.util.Objects.requireNonNull(inputName, "inputName is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.messageId = messageId;
        }

        @Override
        public final java.lang.String getInputName() {
            return this.inputName;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getMessageId() {
            return this.messageId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("inputName", om.valueToTree(this.getInputName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getMessageId() != null) {
                data.set("messageId", om.valueToTree(this.getMessageId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleIotEvents"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleIotEvents.Jsii$Proxy that = (IotTopicRuleIotEvents.Jsii$Proxy) o;

            if (!inputName.equals(that.inputName)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            return this.messageId != null ? this.messageId.equals(that.messageId) : that.messageId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.inputName.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.messageId != null ? this.messageId.hashCode() : 0);
            return result;
        }
    }
}
