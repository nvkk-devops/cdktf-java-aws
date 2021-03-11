package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.663Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamKinesisSourceConfiguration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamKinesisSourceConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getKinesisStreamArn();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamKinesisSourceConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamKinesisSourceConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> {
        private java.lang.String kinesisStreamArn;
        private java.lang.String roleArn;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamKinesisSourceConfiguration#getKinesisStreamArn}
         * @param kinesisStreamArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder kinesisStreamArn(java.lang.String kinesisStreamArn) {
            this.kinesisStreamArn = kinesisStreamArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamKinesisSourceConfiguration#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamKinesisSourceConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamKinesisSourceConfiguration build() {
            return new Jsii$Proxy(kinesisStreamArn, roleArn);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamKinesisSourceConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamKinesisSourceConfiguration {
        private final java.lang.String kinesisStreamArn;
        private final java.lang.String roleArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kinesisStreamArn = software.amazon.jsii.Kernel.get(this, "kinesisStreamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String kinesisStreamArn, final java.lang.String roleArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kinesisStreamArn = java.util.Objects.requireNonNull(kinesisStreamArn, "kinesisStreamArn is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
        }

        @Override
        public final java.lang.String getKinesisStreamArn() {
            return this.kinesisStreamArn;
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

            data.set("kinesisStreamArn", om.valueToTree(this.getKinesisStreamArn()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamKinesisSourceConfiguration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamKinesisSourceConfiguration.Jsii$Proxy) o;

            if (!kinesisStreamArn.equals(that.kinesisStreamArn)) return false;
            return this.roleArn.equals(that.roleArn);
        }

        @Override
        public final int hashCode() {
            int result = this.kinesisStreamArn.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            return result;
        }
    }
}
