package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.698Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbListenerDefaultActionForwardTargetGroup")
@software.amazon.jsii.Jsii.Proxy(LbListenerDefaultActionForwardTargetGroup.Jsii$Proxy.class)
public interface LbListenerDefaultActionForwardTargetGroup extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getArn();

    default @org.jetbrains.annotations.Nullable java.lang.Number getWeight() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbListenerDefaultActionForwardTargetGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbListenerDefaultActionForwardTargetGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbListenerDefaultActionForwardTargetGroup> {
        private java.lang.String arn;
        private java.lang.Number weight;

        /**
         * Sets the value of {@link LbListenerDefaultActionForwardTargetGroup#getArn}
         * @param arn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerDefaultActionForwardTargetGroup#getWeight}
         * @param weight the value to be set.
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LbListenerDefaultActionForwardTargetGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbListenerDefaultActionForwardTargetGroup build() {
            return new Jsii$Proxy(arn, weight);
        }
    }

    /**
     * An implementation for {@link LbListenerDefaultActionForwardTargetGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbListenerDefaultActionForwardTargetGroup {
        private final java.lang.String arn;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.weight = software.amazon.jsii.Kernel.get(this, "weight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String arn, final java.lang.Number weight) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arn = java.util.Objects.requireNonNull(arn, "arn is required");
            this.weight = weight;
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final java.lang.Number getWeight() {
            return this.weight;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("arn", om.valueToTree(this.getArn()));
            if (this.getWeight() != null) {
                data.set("weight", om.valueToTree(this.getWeight()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LbListenerDefaultActionForwardTargetGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbListenerDefaultActionForwardTargetGroup.Jsii$Proxy that = (LbListenerDefaultActionForwardTargetGroup.Jsii$Proxy) o;

            if (!arn.equals(that.arn)) return false;
            return this.weight != null ? this.weight.equals(that.weight) : that.weight == null;
        }

        @Override
        public final int hashCode() {
            int result = this.arn.hashCode();
            result = 31 * result + (this.weight != null ? this.weight.hashCode() : 0);
            return result;
        }
    }
}
