package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.643Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleFirehose")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleFirehose.Jsii$Proxy.class)
public interface IotTopicRuleFirehose extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDeliveryStreamName();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getSeparator() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleFirehose}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleFirehose}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleFirehose> {
        private java.lang.String deliveryStreamName;
        private java.lang.String roleArn;
        private java.lang.String separator;

        /**
         * Sets the value of {@link IotTopicRuleFirehose#getDeliveryStreamName}
         * @param deliveryStreamName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder deliveryStreamName(java.lang.String deliveryStreamName) {
            this.deliveryStreamName = deliveryStreamName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleFirehose#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleFirehose#getSeparator}
         * @param separator the value to be set.
         * @return {@code this}
         */
        public Builder separator(java.lang.String separator) {
            this.separator = separator;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleFirehose}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleFirehose build() {
            return new Jsii$Proxy(deliveryStreamName, roleArn, separator);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleFirehose}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleFirehose {
        private final java.lang.String deliveryStreamName;
        private final java.lang.String roleArn;
        private final java.lang.String separator;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deliveryStreamName = software.amazon.jsii.Kernel.get(this, "deliveryStreamName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.separator = software.amazon.jsii.Kernel.get(this, "separator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String deliveryStreamName, final java.lang.String roleArn, final java.lang.String separator) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deliveryStreamName = java.util.Objects.requireNonNull(deliveryStreamName, "deliveryStreamName is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.separator = separator;
        }

        @Override
        public final java.lang.String getDeliveryStreamName() {
            return this.deliveryStreamName;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getSeparator() {
            return this.separator;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("deliveryStreamName", om.valueToTree(this.getDeliveryStreamName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getSeparator() != null) {
                data.set("separator", om.valueToTree(this.getSeparator()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleFirehose"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleFirehose.Jsii$Proxy that = (IotTopicRuleFirehose.Jsii$Proxy) o;

            if (!deliveryStreamName.equals(that.deliveryStreamName)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            return this.separator != null ? this.separator.equals(that.separator) : that.separator == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deliveryStreamName.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.separator != null ? this.separator.hashCode() : 0);
            return result;
        }
    }
}
