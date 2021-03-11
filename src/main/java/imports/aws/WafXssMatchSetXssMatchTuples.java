package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.941Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafXssMatchSetXssMatchTuples")
@software.amazon.jsii.Jsii.Proxy(WafXssMatchSetXssMatchTuples.Jsii$Proxy.class)
public interface WafXssMatchSetXssMatchTuples extends software.amazon.jsii.JsiiSerializable {

    /**
     * field_to_match block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch> getFieldToMatch();

    @org.jetbrains.annotations.NotNull java.lang.String getTextTransformation();

    /**
     * @return a {@link Builder} of {@link WafXssMatchSetXssMatchTuples}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafXssMatchSetXssMatchTuples}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafXssMatchSetXssMatchTuples> {
        private java.util.List<imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch> fieldToMatch;
        private java.lang.String textTransformation;

        /**
         * Sets the value of {@link WafXssMatchSetXssMatchTuples#getFieldToMatch}
         * @param fieldToMatch field_to_match block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fieldToMatch(java.util.List<? extends imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch> fieldToMatch) {
            this.fieldToMatch = (java.util.List<imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch>)fieldToMatch;
            return this;
        }

        /**
         * Sets the value of {@link WafXssMatchSetXssMatchTuples#getTextTransformation}
         * @param textTransformation the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder textTransformation(java.lang.String textTransformation) {
            this.textTransformation = textTransformation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WafXssMatchSetXssMatchTuples}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafXssMatchSetXssMatchTuples build() {
            return new Jsii$Proxy(fieldToMatch, textTransformation);
        }
    }

    /**
     * An implementation for {@link WafXssMatchSetXssMatchTuples}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafXssMatchSetXssMatchTuples {
        private final java.util.List<imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch> fieldToMatch;
        private final java.lang.String textTransformation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fieldToMatch = software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch.class)));
            this.textTransformation = software.amazon.jsii.Kernel.get(this, "textTransformation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch> fieldToMatch, final java.lang.String textTransformation) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fieldToMatch = (java.util.List<imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch>)java.util.Objects.requireNonNull(fieldToMatch, "fieldToMatch is required");
            this.textTransformation = java.util.Objects.requireNonNull(textTransformation, "textTransformation is required");
        }

        @Override
        public final java.util.List<imports.aws.WafXssMatchSetXssMatchTuplesFieldToMatch> getFieldToMatch() {
            return this.fieldToMatch;
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
            data.set("textTransformation", om.valueToTree(this.getTextTransformation()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.WafXssMatchSetXssMatchTuples"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafXssMatchSetXssMatchTuples.Jsii$Proxy that = (WafXssMatchSetXssMatchTuples.Jsii$Proxy) o;

            if (!fieldToMatch.equals(that.fieldToMatch)) return false;
            return this.textTransformation.equals(that.textTransformation);
        }

        @Override
        public final int hashCode() {
            int result = this.fieldToMatch.hashCode();
            result = 31 * result + (this.textTransformation.hashCode());
            return result;
        }
    }
}
