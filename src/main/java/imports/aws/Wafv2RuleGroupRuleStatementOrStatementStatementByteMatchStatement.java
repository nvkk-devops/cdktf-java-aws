package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.008Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement.Jsii$Proxy.class)
public interface Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getPositionalConstraint();

    @org.jetbrains.annotations.NotNull java.lang.String getSearchString();

    /**
     * text_transformation block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation> getTextTransformation();

    /**
     * field_to_match block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch> getFieldToMatch() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement> {
        private java.lang.String positionalConstraint;
        private java.lang.String searchString;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformation;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch> fieldToMatch;

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement#getPositionalConstraint}
         * @param positionalConstraint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder positionalConstraint(java.lang.String positionalConstraint) {
            this.positionalConstraint = positionalConstraint;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement#getSearchString}
         * @param searchString the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder searchString(java.lang.String searchString) {
            this.searchString = searchString;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement#getTextTransformation}
         * @param textTransformation text_transformation block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder textTransformation(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformation) {
            this.textTransformation = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation>)textTransformation;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement#getFieldToMatch}
         * @param fieldToMatch field_to_match block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fieldToMatch(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch> fieldToMatch) {
            this.fieldToMatch = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch>)fieldToMatch;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement build() {
            return new Jsii$Proxy(positionalConstraint, searchString, textTransformation, fieldToMatch);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement {
        private final java.lang.String positionalConstraint;
        private final java.lang.String searchString;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformation;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch> fieldToMatch;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.positionalConstraint = software.amazon.jsii.Kernel.get(this, "positionalConstraint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.searchString = software.amazon.jsii.Kernel.get(this, "searchString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.textTransformation = software.amazon.jsii.Kernel.get(this, "textTransformation", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation.class)));
            this.fieldToMatch = software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String positionalConstraint, final java.lang.String searchString, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformation, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch> fieldToMatch) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.positionalConstraint = java.util.Objects.requireNonNull(positionalConstraint, "positionalConstraint is required");
            this.searchString = java.util.Objects.requireNonNull(searchString, "searchString is required");
            this.textTransformation = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation>)java.util.Objects.requireNonNull(textTransformation, "textTransformation is required");
            this.fieldToMatch = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch>)fieldToMatch;
        }

        @Override
        public final java.lang.String getPositionalConstraint() {
            return this.positionalConstraint;
        }

        @Override
        public final java.lang.String getSearchString() {
            return this.searchString;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementTextTransformation> getTextTransformation() {
            return this.textTransformation;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatementFieldToMatch> getFieldToMatch() {
            return this.fieldToMatch;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("positionalConstraint", om.valueToTree(this.getPositionalConstraint()));
            data.set("searchString", om.valueToTree(this.getSearchString()));
            data.set("textTransformation", om.valueToTree(this.getTextTransformation()));
            if (this.getFieldToMatch() != null) {
                data.set("fieldToMatch", om.valueToTree(this.getFieldToMatch()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement.Jsii$Proxy that = (Wafv2RuleGroupRuleStatementOrStatementStatementByteMatchStatement.Jsii$Proxy) o;

            if (!positionalConstraint.equals(that.positionalConstraint)) return false;
            if (!searchString.equals(that.searchString)) return false;
            if (!textTransformation.equals(that.textTransformation)) return false;
            return this.fieldToMatch != null ? this.fieldToMatch.equals(that.fieldToMatch) : that.fieldToMatch == null;
        }

        @Override
        public final int hashCode() {
            int result = this.positionalConstraint.hashCode();
            result = 31 * result + (this.searchString.hashCode());
            result = 31 * result + (this.textTransformation.hashCode());
            result = 31 * result + (this.fieldToMatch != null ? this.fieldToMatch.hashCode() : 0);
            return result;
        }
    }
}
