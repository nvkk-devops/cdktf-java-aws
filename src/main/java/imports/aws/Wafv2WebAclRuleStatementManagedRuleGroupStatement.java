package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.086Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementManagedRuleGroupStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementManagedRuleGroupStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementManagedRuleGroupStatement extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getVendorName();

    /**
     * excluded_rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule> getExcludedRule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementManagedRuleGroupStatement> {
        private java.lang.String name;
        private java.lang.String vendorName;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRule;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getVendorName}
         * @param vendorName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder vendorName(java.lang.String vendorName) {
            this.vendorName = vendorName;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getExcludedRule}
         * @param excludedRule excluded_rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder excludedRule(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRule) {
            this.excludedRule = (java.util.List<imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule>)excludedRule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementManagedRuleGroupStatement build() {
            return new Jsii$Proxy(name, vendorName, excludedRule);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementManagedRuleGroupStatement {
        private final java.lang.String name;
        private final java.lang.String vendorName;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vendorName = software.amazon.jsii.Kernel.get(this, "vendorName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excludedRule = software.amazon.jsii.Kernel.get(this, "excludedRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String vendorName, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRule) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.vendorName = java.util.Objects.requireNonNull(vendorName, "vendorName is required");
            this.excludedRule = (java.util.List<imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule>)excludedRule;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getVendorName() {
            return this.vendorName;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule> getExcludedRule() {
            return this.excludedRule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("vendorName", om.valueToTree(this.getVendorName()));
            if (this.getExcludedRule() != null) {
                data.set("excludedRule", om.valueToTree(this.getExcludedRule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementManagedRuleGroupStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementManagedRuleGroupStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementManagedRuleGroupStatement.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!vendorName.equals(that.vendorName)) return false;
            return this.excludedRule != null ? this.excludedRule.equals(that.excludedRule) : that.excludedRule == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.vendorName.hashCode());
            result = 31 * result + (this.excludedRule != null ? this.excludedRule.hashCode() : 0);
            return result;
        }
    }
}
