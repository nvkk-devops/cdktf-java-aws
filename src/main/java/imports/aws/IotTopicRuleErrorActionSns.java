package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.643Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleErrorActionSns")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleErrorActionSns.Jsii$Proxy.class)
public interface IotTopicRuleErrorActionSns extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getTargetArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getMessageFormat() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleErrorActionSns}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleErrorActionSns}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleErrorActionSns> {
        private java.lang.String roleArn;
        private java.lang.String targetArn;
        private java.lang.String messageFormat;

        /**
         * Sets the value of {@link IotTopicRuleErrorActionSns#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionSns#getTargetArn}
         * @param targetArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetArn(java.lang.String targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionSns#getMessageFormat}
         * @param messageFormat the value to be set.
         * @return {@code this}
         */
        public Builder messageFormat(java.lang.String messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleErrorActionSns}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleErrorActionSns build() {
            return new Jsii$Proxy(roleArn, targetArn, messageFormat);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleErrorActionSns}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleErrorActionSns {
        private final java.lang.String roleArn;
        private final java.lang.String targetArn;
        private final java.lang.String messageFormat;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetArn = software.amazon.jsii.Kernel.get(this, "targetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.messageFormat = software.amazon.jsii.Kernel.get(this, "messageFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String roleArn, final java.lang.String targetArn, final java.lang.String messageFormat) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.targetArn = java.util.Objects.requireNonNull(targetArn, "targetArn is required");
            this.messageFormat = messageFormat;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getTargetArn() {
            return this.targetArn;
        }

        @Override
        public final java.lang.String getMessageFormat() {
            return this.messageFormat;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("targetArn", om.valueToTree(this.getTargetArn()));
            if (this.getMessageFormat() != null) {
                data.set("messageFormat", om.valueToTree(this.getMessageFormat()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleErrorActionSns"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleErrorActionSns.Jsii$Proxy that = (IotTopicRuleErrorActionSns.Jsii$Proxy) o;

            if (!roleArn.equals(that.roleArn)) return false;
            if (!targetArn.equals(that.targetArn)) return false;
            return this.messageFormat != null ? this.messageFormat.equals(that.messageFormat) : that.messageFormat == null;
        }

        @Override
        public final int hashCode() {
            int result = this.roleArn.hashCode();
            result = 31 * result + (this.targetArn.hashCode());
            result = 31 * result + (this.messageFormat != null ? this.messageFormat.hashCode() : 0);
            return result;
        }
    }
}
