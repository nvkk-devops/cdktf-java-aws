package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.644Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleSqs")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleSqs.Jsii$Proxy.class)
public interface IotTopicRuleSqs extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getQueueUrl();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.Boolean getUseBase64();

    /**
     * @return a {@link Builder} of {@link IotTopicRuleSqs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleSqs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleSqs> {
        private java.lang.String queueUrl;
        private java.lang.String roleArn;
        private java.lang.Boolean useBase64;

        /**
         * Sets the value of {@link IotTopicRuleSqs#getQueueUrl}
         * @param queueUrl the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder queueUrl(java.lang.String queueUrl) {
            this.queueUrl = queueUrl;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleSqs#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleSqs#getUseBase64}
         * @param useBase64 the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder useBase64(java.lang.Boolean useBase64) {
            this.useBase64 = useBase64;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleSqs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleSqs build() {
            return new Jsii$Proxy(queueUrl, roleArn, useBase64);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleSqs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleSqs {
        private final java.lang.String queueUrl;
        private final java.lang.String roleArn;
        private final java.lang.Boolean useBase64;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.queueUrl = software.amazon.jsii.Kernel.get(this, "queueUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useBase64 = software.amazon.jsii.Kernel.get(this, "useBase64", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String queueUrl, final java.lang.String roleArn, final java.lang.Boolean useBase64) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.queueUrl = java.util.Objects.requireNonNull(queueUrl, "queueUrl is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.useBase64 = java.util.Objects.requireNonNull(useBase64, "useBase64 is required");
        }

        @Override
        public final java.lang.String getQueueUrl() {
            return this.queueUrl;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.Boolean getUseBase64() {
            return this.useBase64;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("queueUrl", om.valueToTree(this.getQueueUrl()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("useBase64", om.valueToTree(this.getUseBase64()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleSqs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleSqs.Jsii$Proxy that = (IotTopicRuleSqs.Jsii$Proxy) o;

            if (!queueUrl.equals(that.queueUrl)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            return this.useBase64.equals(that.useBase64);
        }

        @Override
        public final int hashCode() {
            int result = this.queueUrl.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.useBase64.hashCode());
            return result;
        }
    }
}
