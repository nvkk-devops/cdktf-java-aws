package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.171Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getComparisonOperator();

    @org.jetbrains.annotations.NotNull java.lang.Number getSize();

    /**
     * text_transformation block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> getTextTransformation();

    /**
     * field_to_match block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> getFieldToMatch() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement> {
        private java.lang.String comparisonOperator;
        private java.lang.Number size;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformation;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> fieldToMatch;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement#getComparisonOperator}
         * @param comparisonOperator the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder comparisonOperator(java.lang.String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement#getSize}
         * @param size the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder size(java.lang.Number size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement#getTextTransformation}
         * @param textTransformation text_transformation block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder textTransformation(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformation) {
            this.textTransformation = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation>)textTransformation;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement#getFieldToMatch}
         * @param fieldToMatch field_to_match block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fieldToMatch(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> fieldToMatch) {
            this.fieldToMatch = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch>)fieldToMatch;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement build() {
            return new Jsii$Proxy(comparisonOperator, size, textTransformation, fieldToMatch);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement {
        private final java.lang.String comparisonOperator;
        private final java.lang.Number size;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformation;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> fieldToMatch;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.comparisonOperator = software.amazon.jsii.Kernel.get(this, "comparisonOperator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.size = software.amazon.jsii.Kernel.get(this, "size", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.textTransformation = software.amazon.jsii.Kernel.get(this, "textTransformation", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation.class)));
            this.fieldToMatch = software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String comparisonOperator, final java.lang.Number size, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformation, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> fieldToMatch) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.comparisonOperator = java.util.Objects.requireNonNull(comparisonOperator, "comparisonOperator is required");
            this.size = java.util.Objects.requireNonNull(size, "size is required");
            this.textTransformation = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation>)java.util.Objects.requireNonNull(textTransformation, "textTransformation is required");
            this.fieldToMatch = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch>)fieldToMatch;
        }

        @Override
        public final java.lang.String getComparisonOperator() {
            return this.comparisonOperator;
        }

        @Override
        public final java.lang.Number getSize() {
            return this.size;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> getTextTransformation() {
            return this.textTransformation;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> getFieldToMatch() {
            return this.fieldToMatch;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("comparisonOperator", om.valueToTree(this.getComparisonOperator()));
            data.set("size", om.valueToTree(this.getSize()));
            data.set("textTransformation", om.valueToTree(this.getTextTransformation()));
            if (this.getFieldToMatch() != null) {
                data.set("fieldToMatch", om.valueToTree(this.getFieldToMatch()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatement.Jsii$Proxy) o;

            if (!comparisonOperator.equals(that.comparisonOperator)) return false;
            if (!size.equals(that.size)) return false;
            if (!textTransformation.equals(that.textTransformation)) return false;
            return this.fieldToMatch != null ? this.fieldToMatch.equals(that.fieldToMatch) : that.fieldToMatch == null;
        }

        @Override
        public final int hashCode() {
            int result = this.comparisonOperator.hashCode();
            result = 31 * result + (this.size.hashCode());
            result = 31 * result + (this.textTransformation.hashCode());
            result = 31 * result + (this.fieldToMatch != null ? this.fieldToMatch.hashCode() : 0);
            return result;
        }
    }
}