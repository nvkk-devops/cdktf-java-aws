package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.642Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleErrorActionDynamodbv2")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleErrorActionDynamodbv2.Jsii$Proxy.class)
public interface IotTopicRuleErrorActionDynamodbv2 extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * put_item block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem> getPutItem() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleErrorActionDynamodbv2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleErrorActionDynamodbv2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleErrorActionDynamodbv2> {
        private java.lang.String roleArn;
        private java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem> putItem;

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodbv2#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodbv2#getPutItem}
         * @param putItem put_item block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder putItem(java.util.List<? extends imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem> putItem) {
            this.putItem = (java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem>)putItem;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleErrorActionDynamodbv2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleErrorActionDynamodbv2 build() {
            return new Jsii$Proxy(roleArn, putItem);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleErrorActionDynamodbv2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleErrorActionDynamodbv2 {
        private final java.lang.String roleArn;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem> putItem;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.putItem = software.amazon.jsii.Kernel.get(this, "putItem", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String roleArn, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem> putItem) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.putItem = (java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem>)putItem;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2PutItem> getPutItem() {
            return this.putItem;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getPutItem() != null) {
                data.set("putItem", om.valueToTree(this.getPutItem()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleErrorActionDynamodbv2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleErrorActionDynamodbv2.Jsii$Proxy that = (IotTopicRuleErrorActionDynamodbv2.Jsii$Proxy) o;

            if (!roleArn.equals(that.roleArn)) return false;
            return this.putItem != null ? this.putItem.equals(that.putItem) : that.putItem == null;
        }

        @Override
        public final int hashCode() {
            int result = this.roleArn.hashCode();
            result = 31 * result + (this.putItem != null ? this.putItem.hashCode() : 0);
            return result;
        }
    }
}
