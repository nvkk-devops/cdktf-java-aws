package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.136Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath build() {
            return new Jsii$Proxy();
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath {

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy() {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();


            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
