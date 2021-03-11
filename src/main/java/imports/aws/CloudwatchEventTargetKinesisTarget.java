package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.157Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchEventTargetKinesisTarget")
@software.amazon.jsii.Jsii.Proxy(CloudwatchEventTargetKinesisTarget.Jsii$Proxy.class)
public interface CloudwatchEventTargetKinesisTarget extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getPartitionKeyPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchEventTargetKinesisTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchEventTargetKinesisTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchEventTargetKinesisTarget> {
        private java.lang.String partitionKeyPath;

        /**
         * Sets the value of {@link CloudwatchEventTargetKinesisTarget#getPartitionKeyPath}
         * @param partitionKeyPath the value to be set.
         * @return {@code this}
         */
        public Builder partitionKeyPath(java.lang.String partitionKeyPath) {
            this.partitionKeyPath = partitionKeyPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchEventTargetKinesisTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchEventTargetKinesisTarget build() {
            return new Jsii$Proxy(partitionKeyPath);
        }
    }

    /**
     * An implementation for {@link CloudwatchEventTargetKinesisTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchEventTargetKinesisTarget {
        private final java.lang.String partitionKeyPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.partitionKeyPath = software.amazon.jsii.Kernel.get(this, "partitionKeyPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String partitionKeyPath) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.partitionKeyPath = partitionKeyPath;
        }

        @Override
        public final java.lang.String getPartitionKeyPath() {
            return this.partitionKeyPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPartitionKeyPath() != null) {
                data.set("partitionKeyPath", om.valueToTree(this.getPartitionKeyPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudwatchEventTargetKinesisTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchEventTargetKinesisTarget.Jsii$Proxy that = (CloudwatchEventTargetKinesisTarget.Jsii$Proxy) o;

            return this.partitionKeyPath != null ? this.partitionKeyPath.equals(that.partitionKeyPath) : that.partitionKeyPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.partitionKeyPath != null ? this.partitionKeyPath.hashCode() : 0;
            return result;
        }
    }
}
