package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.945Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbListenerRuleConditionQueryString")
@software.amazon.jsii.Jsii.Proxy(AlbListenerRuleConditionQueryString.Jsii$Proxy.class)
public interface AlbListenerRuleConditionQueryString extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbListenerRuleConditionQueryString}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbListenerRuleConditionQueryString}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbListenerRuleConditionQueryString> {
        private java.lang.String value;
        private java.lang.String key;

        /**
         * Sets the value of {@link AlbListenerRuleConditionQueryString#getValue}
         * @param value the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleConditionQueryString#getKey}
         * @param key the value to be set.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbListenerRuleConditionQueryString}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbListenerRuleConditionQueryString build() {
            return new Jsii$Proxy(value, key);
        }
    }

    /**
     * An implementation for {@link AlbListenerRuleConditionQueryString}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbListenerRuleConditionQueryString {
        private final java.lang.String value;
        private final java.lang.String key;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String value, final java.lang.String key) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.value = java.util.Objects.requireNonNull(value, "value is required");
            this.key = key;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("value", om.valueToTree(this.getValue()));
            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AlbListenerRuleConditionQueryString"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbListenerRuleConditionQueryString.Jsii$Proxy that = (AlbListenerRuleConditionQueryString.Jsii$Proxy) o;

            if (!value.equals(that.value)) return false;
            return this.key != null ? this.key.equals(that.key) : that.key == null;
        }

        @Override
        public final int hashCode() {
            int result = this.value.hashCode();
            result = 31 * result + (this.key != null ? this.key.hashCode() : 0);
            return result;
        }
    }
}
