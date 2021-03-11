package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.643Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleErrorActionIotAnalytics")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleErrorActionIotAnalytics.Jsii$Proxy.class)
public interface IotTopicRuleErrorActionIotAnalytics extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getChannelName();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * @return a {@link Builder} of {@link IotTopicRuleErrorActionIotAnalytics}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleErrorActionIotAnalytics}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleErrorActionIotAnalytics> {
        private java.lang.String channelName;
        private java.lang.String roleArn;

        /**
         * Sets the value of {@link IotTopicRuleErrorActionIotAnalytics#getChannelName}
         * @param channelName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder channelName(java.lang.String channelName) {
            this.channelName = channelName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionIotAnalytics#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleErrorActionIotAnalytics}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleErrorActionIotAnalytics build() {
            return new Jsii$Proxy(channelName, roleArn);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleErrorActionIotAnalytics}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleErrorActionIotAnalytics {
        private final java.lang.String channelName;
        private final java.lang.String roleArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.channelName = software.amazon.jsii.Kernel.get(this, "channelName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String channelName, final java.lang.String roleArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.channelName = java.util.Objects.requireNonNull(channelName, "channelName is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
        }

        @Override
        public final java.lang.String getChannelName() {
            return this.channelName;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("channelName", om.valueToTree(this.getChannelName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleErrorActionIotAnalytics"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleErrorActionIotAnalytics.Jsii$Proxy that = (IotTopicRuleErrorActionIotAnalytics.Jsii$Proxy) o;

            if (!channelName.equals(that.channelName)) return false;
            return this.roleArn.equals(that.roleArn);
        }

        @Override
        public final int hashCode() {
            int result = this.channelName.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            return result;
        }
    }
}
