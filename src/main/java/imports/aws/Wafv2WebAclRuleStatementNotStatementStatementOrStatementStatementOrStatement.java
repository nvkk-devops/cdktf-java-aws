package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.131Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * statement block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement> getStatement();

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement> {
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement> statement;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement#getStatement}
         * @param statement statement block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder statement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement> statement) {
            this.statement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement>)statement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement build() {
            return new Jsii$Proxy(statement);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement {
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement> statement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.statement = software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement> statement) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.statement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement>)java.util.Objects.requireNonNull(statement, "statement is required");
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatement> getStatement() {
            return this.statement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("statement", om.valueToTree(this.getStatement()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement.Jsii$Proxy) o;

            return this.statement.equals(that.statement);
        }

        @Override
        public final int hashCode() {
            int result = this.statement.hashCode();
            return result;
        }
    }
}
