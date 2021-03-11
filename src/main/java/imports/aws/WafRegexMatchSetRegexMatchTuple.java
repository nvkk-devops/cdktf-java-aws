package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.937Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafRegexMatchSetRegexMatchTuple")
@software.amazon.jsii.Jsii.Proxy(WafRegexMatchSetRegexMatchTuple.Jsii$Proxy.class)
public interface WafRegexMatchSetRegexMatchTuple extends software.amazon.jsii.JsiiSerializable {

    /**
     * field_to_match block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch> getFieldToMatch();

    @org.jetbrains.annotations.NotNull java.lang.String getRegexPatternSetId();

    @org.jetbrains.annotations.NotNull java.lang.String getTextTransformation();

    /**
     * @return a {@link Builder} of {@link WafRegexMatchSetRegexMatchTuple}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafRegexMatchSetRegexMatchTuple}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafRegexMatchSetRegexMatchTuple> {
        private java.util.List<imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch> fieldToMatch;
        private java.lang.String regexPatternSetId;
        private java.lang.String textTransformation;

        /**
         * Sets the value of {@link WafRegexMatchSetRegexMatchTuple#getFieldToMatch}
         * @param fieldToMatch field_to_match block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fieldToMatch(java.util.List<? extends imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch> fieldToMatch) {
            this.fieldToMatch = (java.util.List<imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch>)fieldToMatch;
            return this;
        }

        /**
         * Sets the value of {@link WafRegexMatchSetRegexMatchTuple#getRegexPatternSetId}
         * @param regexPatternSetId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder regexPatternSetId(java.lang.String regexPatternSetId) {
            this.regexPatternSetId = regexPatternSetId;
            return this;
        }

        /**
         * Sets the value of {@link WafRegexMatchSetRegexMatchTuple#getTextTransformation}
         * @param textTransformation the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder textTransformation(java.lang.String textTransformation) {
            this.textTransformation = textTransformation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WafRegexMatchSetRegexMatchTuple}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafRegexMatchSetRegexMatchTuple build() {
            return new Jsii$Proxy(fieldToMatch, regexPatternSetId, textTransformation);
        }
    }

    /**
     * An implementation for {@link WafRegexMatchSetRegexMatchTuple}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafRegexMatchSetRegexMatchTuple {
        private final java.util.List<imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch> fieldToMatch;
        private final java.lang.String regexPatternSetId;
        private final java.lang.String textTransformation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fieldToMatch = software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch.class)));
            this.regexPatternSetId = software.amazon.jsii.Kernel.get(this, "regexPatternSetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.textTransformation = software.amazon.jsii.Kernel.get(this, "textTransformation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch> fieldToMatch, final java.lang.String regexPatternSetId, final java.lang.String textTransformation) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fieldToMatch = (java.util.List<imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch>)java.util.Objects.requireNonNull(fieldToMatch, "fieldToMatch is required");
            this.regexPatternSetId = java.util.Objects.requireNonNull(regexPatternSetId, "regexPatternSetId is required");
            this.textTransformation = java.util.Objects.requireNonNull(textTransformation, "textTransformation is required");
        }

        @Override
        public final java.util.List<imports.aws.WafRegexMatchSetRegexMatchTupleFieldToMatch> getFieldToMatch() {
            return this.fieldToMatch;
        }

        @Override
        public final java.lang.String getRegexPatternSetId() {
            return this.regexPatternSetId;
        }

        @Override
        public final java.lang.String getTextTransformation() {
            return this.textTransformation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fieldToMatch", om.valueToTree(this.getFieldToMatch()));
            data.set("regexPatternSetId", om.valueToTree(this.getRegexPatternSetId()));
            data.set("textTransformation", om.valueToTree(this.getTextTransformation()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.WafRegexMatchSetRegexMatchTuple"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafRegexMatchSetRegexMatchTuple.Jsii$Proxy that = (WafRegexMatchSetRegexMatchTuple.Jsii$Proxy) o;

            if (!fieldToMatch.equals(that.fieldToMatch)) return false;
            if (!regexPatternSetId.equals(that.regexPatternSetId)) return false;
            return this.textTransformation.equals(that.textTransformation);
        }

        @Override
        public final int hashCode() {
            int result = this.fieldToMatch.hashCode();
            result = 31 * result + (this.regexPatternSetId.hashCode());
            result = 31 * result + (this.textTransformation.hashCode());
            return result;
        }
    }
}
