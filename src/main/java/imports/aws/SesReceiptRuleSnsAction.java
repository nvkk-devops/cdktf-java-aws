package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.866Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesReceiptRuleSnsAction")
@software.amazon.jsii.Jsii.Proxy(SesReceiptRuleSnsAction.Jsii$Proxy.class)
public interface SesReceiptRuleSnsAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getPosition();

    @org.jetbrains.annotations.NotNull java.lang.String getTopicArn();

    /**
     * @return a {@link Builder} of {@link SesReceiptRuleSnsAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesReceiptRuleSnsAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesReceiptRuleSnsAction> {
        private java.lang.Number position;
        private java.lang.String topicArn;

        /**
         * Sets the value of {@link SesReceiptRuleSnsAction#getPosition}
         * @param position the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder position(java.lang.Number position) {
            this.position = position;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleSnsAction#getTopicArn}
         * @param topicArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder topicArn(java.lang.String topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesReceiptRuleSnsAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesReceiptRuleSnsAction build() {
            return new Jsii$Proxy(position, topicArn);
        }
    }

    /**
     * An implementation for {@link SesReceiptRuleSnsAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesReceiptRuleSnsAction {
        private final java.lang.Number position;
        private final java.lang.String topicArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.position = software.amazon.jsii.Kernel.get(this, "position", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.topicArn = software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number position, final java.lang.String topicArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.position = java.util.Objects.requireNonNull(position, "position is required");
            this.topicArn = java.util.Objects.requireNonNull(topicArn, "topicArn is required");
        }

        @Override
        public final java.lang.Number getPosition() {
            return this.position;
        }

        @Override
        public final java.lang.String getTopicArn() {
            return this.topicArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("position", om.valueToTree(this.getPosition()));
            data.set("topicArn", om.valueToTree(this.getTopicArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SesReceiptRuleSnsAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesReceiptRuleSnsAction.Jsii$Proxy that = (SesReceiptRuleSnsAction.Jsii$Proxy) o;

            if (!position.equals(that.position)) return false;
            return this.topicArn.equals(that.topicArn);
        }

        @Override
        public final int hashCode() {
            int result = this.position.hashCode();
            result = 31 * result + (this.topicArn.hashCode());
            return result;
        }
    }
}
