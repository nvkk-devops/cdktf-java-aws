package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.186Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementRateBasedStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementRateBasedStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementRateBasedStatement extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getLimit();

    default @org.jetbrains.annotations.Nullable java.lang.String getAggregateKeyType() {
        return null;
    }

    /**
     * scope_down_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement> getScopeDownStatement() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementRateBasedStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementRateBasedStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementRateBasedStatement> {
        private java.lang.Number limit;
        private java.lang.String aggregateKeyType;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement> scopeDownStatement;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatement#getLimit}
         * @param limit the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder limit(java.lang.Number limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatement#getAggregateKeyType}
         * @param aggregateKeyType the value to be set.
         * @return {@code this}
         */
        public Builder aggregateKeyType(java.lang.String aggregateKeyType) {
            this.aggregateKeyType = aggregateKeyType;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatement#getScopeDownStatement}
         * @param scopeDownStatement scope_down_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder scopeDownStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement> scopeDownStatement) {
            this.scopeDownStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement>)scopeDownStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementRateBasedStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementRateBasedStatement build() {
            return new Jsii$Proxy(limit, aggregateKeyType, scopeDownStatement);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementRateBasedStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementRateBasedStatement {
        private final java.lang.Number limit;
        private final java.lang.String aggregateKeyType;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement> scopeDownStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limit = software.amazon.jsii.Kernel.get(this, "limit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.aggregateKeyType = software.amazon.jsii.Kernel.get(this, "aggregateKeyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scopeDownStatement = software.amazon.jsii.Kernel.get(this, "scopeDownStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number limit, final java.lang.String aggregateKeyType, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement> scopeDownStatement) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limit = java.util.Objects.requireNonNull(limit, "limit is required");
            this.aggregateKeyType = aggregateKeyType;
            this.scopeDownStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement>)scopeDownStatement;
        }

        @Override
        public final java.lang.Number getLimit() {
            return this.limit;
        }

        @Override
        public final java.lang.String getAggregateKeyType() {
            return this.aggregateKeyType;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement> getScopeDownStatement() {
            return this.scopeDownStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("limit", om.valueToTree(this.getLimit()));
            if (this.getAggregateKeyType() != null) {
                data.set("aggregateKeyType", om.valueToTree(this.getAggregateKeyType()));
            }
            if (this.getScopeDownStatement() != null) {
                data.set("scopeDownStatement", om.valueToTree(this.getScopeDownStatement()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementRateBasedStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementRateBasedStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementRateBasedStatement.Jsii$Proxy) o;

            if (!limit.equals(that.limit)) return false;
            if (this.aggregateKeyType != null ? !this.aggregateKeyType.equals(that.aggregateKeyType) : that.aggregateKeyType != null) return false;
            return this.scopeDownStatement != null ? this.scopeDownStatement.equals(that.scopeDownStatement) : that.scopeDownStatement == null;
        }

        @Override
        public final int hashCode() {
            int result = this.limit.hashCode();
            result = 31 * result + (this.aggregateKeyType != null ? this.aggregateKeyType.hashCode() : 0);
            result = 31 * result + (this.scopeDownStatement != null ? this.scopeDownStatement.hashCode() : 0);
            return result;
        }
    }
}
