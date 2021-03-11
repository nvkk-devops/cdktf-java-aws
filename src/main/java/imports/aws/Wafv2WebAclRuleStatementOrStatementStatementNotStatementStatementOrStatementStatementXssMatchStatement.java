package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.167Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * text_transformation block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation> getTextTransformation();

    /**
     * field_to_match block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> getFieldToMatch() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement> {
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformation;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> fieldToMatch;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement#getTextTransformation}
         * @param textTransformation text_transformation block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder textTransformation(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformation) {
            this.textTransformation = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation>)textTransformation;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement#getFieldToMatch}
         * @param fieldToMatch field_to_match block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fieldToMatch(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> fieldToMatch) {
            this.fieldToMatch = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch>)fieldToMatch;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement build() {
            return new Jsii$Proxy(textTransformation, fieldToMatch);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement {
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformation;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> fieldToMatch;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.textTransformation = software.amazon.jsii.Kernel.get(this, "textTransformation", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation.class)));
            this.fieldToMatch = software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformation, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> fieldToMatch) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.textTransformation = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation>)java.util.Objects.requireNonNull(textTransformation, "textTransformation is required");
            this.fieldToMatch = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch>)fieldToMatch;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation> getTextTransformation() {
            return this.textTransformation;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> getFieldToMatch() {
            return this.fieldToMatch;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("textTransformation", om.valueToTree(this.getTextTransformation()));
            if (this.getFieldToMatch() != null) {
                data.set("fieldToMatch", om.valueToTree(this.getFieldToMatch()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatement.Jsii$Proxy) o;

            if (!textTransformation.equals(that.textTransformation)) return false;
            return this.fieldToMatch != null ? this.fieldToMatch.equals(that.fieldToMatch) : that.fieldToMatch == null;
        }

        @Override
        public final int hashCode() {
            int result = this.textTransformation.hashCode();
            result = 31 * result + (this.fieldToMatch != null ? this.fieldToMatch.hashCode() : 0);
            return result;
        }
    }
}