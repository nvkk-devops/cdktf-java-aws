package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.866Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesReceiptRuleWorkmailAction")
@software.amazon.jsii.Jsii.Proxy(SesReceiptRuleWorkmailAction.Jsii$Proxy.class)
public interface SesReceiptRuleWorkmailAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getOrganizationArn();

    @org.jetbrains.annotations.NotNull java.lang.Number getPosition();

    default @org.jetbrains.annotations.Nullable java.lang.String getTopicArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SesReceiptRuleWorkmailAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesReceiptRuleWorkmailAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesReceiptRuleWorkmailAction> {
        private java.lang.String organizationArn;
        private java.lang.Number position;
        private java.lang.String topicArn;

        /**
         * Sets the value of {@link SesReceiptRuleWorkmailAction#getOrganizationArn}
         * @param organizationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder organizationArn(java.lang.String organizationArn) {
            this.organizationArn = organizationArn;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleWorkmailAction#getPosition}
         * @param position the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder position(java.lang.Number position) {
            this.position = position;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleWorkmailAction#getTopicArn}
         * @param topicArn the value to be set.
         * @return {@code this}
         */
        public Builder topicArn(java.lang.String topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesReceiptRuleWorkmailAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesReceiptRuleWorkmailAction build() {
            return new Jsii$Proxy(organizationArn, position, topicArn);
        }
    }

    /**
     * An implementation for {@link SesReceiptRuleWorkmailAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesReceiptRuleWorkmailAction {
        private final java.lang.String organizationArn;
        private final java.lang.Number position;
        private final java.lang.String topicArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.organizationArn = software.amazon.jsii.Kernel.get(this, "organizationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.position = software.amazon.jsii.Kernel.get(this, "position", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.topicArn = software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String organizationArn, final java.lang.Number position, final java.lang.String topicArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.organizationArn = java.util.Objects.requireNonNull(organizationArn, "organizationArn is required");
            this.position = java.util.Objects.requireNonNull(position, "position is required");
            this.topicArn = topicArn;
        }

        @Override
        public final java.lang.String getOrganizationArn() {
            return this.organizationArn;
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

            data.set("organizationArn", om.valueToTree(this.getOrganizationArn()));
            data.set("position", om.valueToTree(this.getPosition()));
            if (this.getTopicArn() != null) {
                data.set("topicArn", om.valueToTree(this.getTopicArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SesReceiptRuleWorkmailAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesReceiptRuleWorkmailAction.Jsii$Proxy that = (SesReceiptRuleWorkmailAction.Jsii$Proxy) o;

            if (!organizationArn.equals(that.organizationArn)) return false;
            if (!position.equals(that.position)) return false;
            return this.topicArn != null ? this.topicArn.equals(that.topicArn) : that.topicArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.organizationArn.hashCode();
            result = 31 * result + (this.position.hashCode());
            result = 31 * result + (this.topicArn != null ? this.topicArn.hashCode() : 0);
            return result;
        }
    }
}
