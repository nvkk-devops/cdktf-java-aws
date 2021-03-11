package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.641Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleDynamodbv2PutItem")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleDynamodbv2PutItem.Jsii$Proxy.class)
public interface IotTopicRuleDynamodbv2PutItem extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getTableName();

    /**
     * @return a {@link Builder} of {@link IotTopicRuleDynamodbv2PutItem}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleDynamodbv2PutItem}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleDynamodbv2PutItem> {
        private java.lang.String tableName;

        /**
         * Sets the value of {@link IotTopicRuleDynamodbv2PutItem#getTableName}
         * @param tableName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder tableName(java.lang.String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleDynamodbv2PutItem}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleDynamodbv2PutItem build() {
            return new Jsii$Proxy(tableName);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleDynamodbv2PutItem}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleDynamodbv2PutItem {
        private final java.lang.String tableName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.tableName = software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String tableName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.tableName = java.util.Objects.requireNonNull(tableName, "tableName is required");
        }

        @Override
        public final java.lang.String getTableName() {
            return this.tableName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("tableName", om.valueToTree(this.getTableName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleDynamodbv2PutItem"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleDynamodbv2PutItem.Jsii$Proxy that = (IotTopicRuleDynamodbv2PutItem.Jsii$Proxy) o;

            return this.tableName.equals(that.tableName);
        }

        @Override
        public final int hashCode() {
            int result = this.tableName.hashCode();
            return result;
        }
    }
}
