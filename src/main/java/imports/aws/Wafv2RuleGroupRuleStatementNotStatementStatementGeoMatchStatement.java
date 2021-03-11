package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.988Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement.Jsii$Proxy.class)
public interface Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCountryCodes();

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement> {
        private java.util.List<java.lang.String> countryCodes;

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement#getCountryCodes}
         * @param countryCodes the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder countryCodes(java.util.List<java.lang.String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement build() {
            return new Jsii$Proxy(countryCodes);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement {
        private final java.util.List<java.lang.String> countryCodes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.countryCodes = software.amazon.jsii.Kernel.get(this, "countryCodes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> countryCodes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.countryCodes = java.util.Objects.requireNonNull(countryCodes, "countryCodes is required");
        }

        @Override
        public final java.util.List<java.lang.String> getCountryCodes() {
            return this.countryCodes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("countryCodes", om.valueToTree(this.getCountryCodes()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement.Jsii$Proxy that = (Wafv2RuleGroupRuleStatementNotStatementStatementGeoMatchStatement.Jsii$Proxy) o;

            return this.countryCodes.equals(that.countryCodes);
        }

        @Override
        public final int hashCode() {
            int result = this.countryCodes.hashCode();
            return result;
        }
    }
}
