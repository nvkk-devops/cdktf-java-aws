package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.239Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementRuleGroupReferenceStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementRuleGroupReferenceStatement extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getArn();

    /**
     * excluded_rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> getExcludedRule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementRuleGroupReferenceStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementRuleGroupReferenceStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementRuleGroupReferenceStatement> {
        private java.lang.String arn;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRule;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRuleGroupReferenceStatement#getArn}
         * @param arn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRuleGroupReferenceStatement#getExcludedRule}
         * @param excludedRule excluded_rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder excludedRule(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRule) {
            this.excludedRule = (java.util.List<imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule>)excludedRule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementRuleGroupReferenceStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementRuleGroupReferenceStatement build() {
            return new Jsii$Proxy(arn, excludedRule);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementRuleGroupReferenceStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementRuleGroupReferenceStatement {
        private final java.lang.String arn;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excludedRule = software.amazon.jsii.Kernel.get(this, "excludedRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String arn, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRule) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arn = java.util.Objects.requireNonNull(arn, "arn is required");
            this.excludedRule = (java.util.List<imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule>)excludedRule;
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> getExcludedRule() {
            return this.excludedRule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("arn", om.valueToTree(this.getArn()));
            if (this.getExcludedRule() != null) {
                data.set("excludedRule", om.valueToTree(this.getExcludedRule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementRuleGroupReferenceStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementRuleGroupReferenceStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementRuleGroupReferenceStatement.Jsii$Proxy) o;

            if (!arn.equals(that.arn)) return false;
            return this.excludedRule != null ? this.excludedRule.equals(that.excludedRule) : that.excludedRule == null;
        }

        @Override
        public final int hashCode() {
            int result = this.arn.hashCode();
            result = 31 * result + (this.excludedRule != null ? this.excludedRule.hashCode() : 0);
            return result;
        }
    }
}
