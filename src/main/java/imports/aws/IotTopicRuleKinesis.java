package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.644Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleKinesis")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleKinesis.Jsii$Proxy.class)
public interface IotTopicRuleKinesis extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getStreamName();

    default @org.jetbrains.annotations.Nullable java.lang.String getPartitionKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleKinesis}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleKinesis}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleKinesis> {
        private java.lang.String roleArn;
        private java.lang.String streamName;
        private java.lang.String partitionKey;

        /**
         * Sets the value of {@link IotTopicRuleKinesis#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleKinesis#getStreamName}
         * @param streamName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder streamName(java.lang.String streamName) {
            this.streamName = streamName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleKinesis#getPartitionKey}
         * @param partitionKey the value to be set.
         * @return {@code this}
         */
        public Builder partitionKey(java.lang.String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleKinesis}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleKinesis build() {
            return new Jsii$Proxy(roleArn, streamName, partitionKey);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleKinesis}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleKinesis {
        private final java.lang.String roleArn;
        private final java.lang.String streamName;
        private final java.lang.String partitionKey;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.streamName = software.amazon.jsii.Kernel.get(this, "streamName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.partitionKey = software.amazon.jsii.Kernel.get(this, "partitionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String roleArn, final java.lang.String streamName, final java.lang.String partitionKey) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.streamName = java.util.Objects.requireNonNull(streamName, "streamName is required");
            this.partitionKey = partitionKey;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getStreamName() {
            return this.streamName;
        }

        @Override
        public final java.lang.String getPartitionKey() {
            return this.partitionKey;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("streamName", om.valueToTree(this.getStreamName()));
            if (this.getPartitionKey() != null) {
                data.set("partitionKey", om.valueToTree(this.getPartitionKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleKinesis"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleKinesis.Jsii$Proxy that = (IotTopicRuleKinesis.Jsii$Proxy) o;

            if (!roleArn.equals(that.roleArn)) return false;
            if (!streamName.equals(that.streamName)) return false;
            return this.partitionKey != null ? this.partitionKey.equals(that.partitionKey) : that.partitionKey == null;
        }

        @Override
        public final int hashCode() {
            int result = this.roleArn.hashCode();
            result = 31 * result + (this.streamName.hashCode());
            result = 31 * result + (this.partitionKey != null ? this.partitionKey.hashCode() : 0);
            return result;
        }
    }
}
