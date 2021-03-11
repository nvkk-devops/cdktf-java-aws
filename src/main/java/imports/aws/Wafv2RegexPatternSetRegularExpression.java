package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.949Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2RegexPatternSetRegularExpression")
@software.amazon.jsii.Jsii.Proxy(Wafv2RegexPatternSetRegularExpression.Jsii$Proxy.class)
public interface Wafv2RegexPatternSetRegularExpression extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRegexString();

    /**
     * @return a {@link Builder} of {@link Wafv2RegexPatternSetRegularExpression}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RegexPatternSetRegularExpression}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RegexPatternSetRegularExpression> {
        private java.lang.String regexString;

        /**
         * Sets the value of {@link Wafv2RegexPatternSetRegularExpression#getRegexString}
         * @param regexString the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder regexString(java.lang.String regexString) {
            this.regexString = regexString;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RegexPatternSetRegularExpression}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RegexPatternSetRegularExpression build() {
            return new Jsii$Proxy(regexString);
        }
    }

    /**
     * An implementation for {@link Wafv2RegexPatternSetRegularExpression}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RegexPatternSetRegularExpression {
        private final java.lang.String regexString;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.regexString = software.amazon.jsii.Kernel.get(this, "regexString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String regexString) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.regexString = java.util.Objects.requireNonNull(regexString, "regexString is required");
        }

        @Override
        public final java.lang.String getRegexString() {
            return this.regexString;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("regexString", om.valueToTree(this.getRegexString()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2RegexPatternSetRegularExpression"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RegexPatternSetRegularExpression.Jsii$Proxy that = (Wafv2RegexPatternSetRegularExpression.Jsii$Proxy) o;

            return this.regexString.equals(that.regexString);
        }

        @Override
        public final int hashCode() {
            int result = this.regexString.hashCode();
            return result;
        }
    }
}
