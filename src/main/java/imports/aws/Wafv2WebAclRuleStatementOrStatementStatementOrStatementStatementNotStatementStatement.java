package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.173Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * byte_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement> getByteMatchStatement() {
        return null;
    }

    /**
     * geo_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return null;
    }

    /**
     * ip_set_reference_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return null;
    }

    /**
     * regex_pattern_set_reference_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return null;
    }

    /**
     * size_constraint_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return null;
    }

    /**
     * sqli_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return null;
    }

    /**
     * xss_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement> getXssMatchStatement() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement> {
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement> byteMatchStatement;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement> geoMatchStatement;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement> ipSetReferenceStatement;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement> sizeConstraintStatement;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement> sqliMatchStatement;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement> xssMatchStatement;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement#getByteMatchStatement}
         * @param byteMatchStatement byte_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder byteMatchStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement> byteMatchStatement) {
            this.byteMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement>)byteMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement#getGeoMatchStatement}
         * @param geoMatchStatement geo_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder geoMatchStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement> geoMatchStatement) {
            this.geoMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement>)geoMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement#getIpSetReferenceStatement}
         * @param ipSetReferenceStatement ip_set_reference_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ipSetReferenceStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement>)ipSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement#getRegexPatternSetReferenceStatement}
         * @param regexPatternSetReferenceStatement regex_pattern_set_reference_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder regexPatternSetReferenceStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement>)regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement#getSizeConstraintStatement}
         * @param sizeConstraintStatement size_constraint_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sizeConstraintStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement> sizeConstraintStatement) {
            this.sizeConstraintStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement>)sizeConstraintStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement#getSqliMatchStatement}
         * @param sqliMatchStatement sqli_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sqliMatchStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement> sqliMatchStatement) {
            this.sqliMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement>)sqliMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement#getXssMatchStatement}
         * @param xssMatchStatement xss_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder xssMatchStatement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement> xssMatchStatement) {
            this.xssMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement>)xssMatchStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement build() {
            return new Jsii$Proxy(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement {
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement> byteMatchStatement;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement> geoMatchStatement;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement> ipSetReferenceStatement;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement> sizeConstraintStatement;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement> sqliMatchStatement;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement> xssMatchStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.byteMatchStatement = software.amazon.jsii.Kernel.get(this, "byteMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement.class)));
            this.geoMatchStatement = software.amazon.jsii.Kernel.get(this, "geoMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement.class)));
            this.ipSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "ipSetReferenceStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement.class)));
            this.regexPatternSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "regexPatternSetReferenceStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement.class)));
            this.sizeConstraintStatement = software.amazon.jsii.Kernel.get(this, "sizeConstraintStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement.class)));
            this.sqliMatchStatement = software.amazon.jsii.Kernel.get(this, "sqliMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement.class)));
            this.xssMatchStatement = software.amazon.jsii.Kernel.get(this, "xssMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement> byteMatchStatement, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement> geoMatchStatement, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement> ipSetReferenceStatement, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement> sizeConstraintStatement, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement> sqliMatchStatement, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement> xssMatchStatement) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.byteMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement>)byteMatchStatement;
            this.geoMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement>)geoMatchStatement;
            this.ipSetReferenceStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement>)ipSetReferenceStatement;
            this.regexPatternSetReferenceStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement>)regexPatternSetReferenceStatement;
            this.sizeConstraintStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement>)sizeConstraintStatement;
            this.sqliMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement>)sqliMatchStatement;
            this.xssMatchStatement = (java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement>)xssMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementByteMatchStatement> getByteMatchStatement() {
            return this.byteMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement> getGeoMatchStatement() {
            return this.geoMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
            return this.ipSetReferenceStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
            return this.regexPatternSetReferenceStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
            return this.sizeConstraintStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatement> getSqliMatchStatement() {
            return this.sqliMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement> getXssMatchStatement() {
            return this.xssMatchStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getByteMatchStatement() != null) {
                data.set("byteMatchStatement", om.valueToTree(this.getByteMatchStatement()));
            }
            if (this.getGeoMatchStatement() != null) {
                data.set("geoMatchStatement", om.valueToTree(this.getGeoMatchStatement()));
            }
            if (this.getIpSetReferenceStatement() != null) {
                data.set("ipSetReferenceStatement", om.valueToTree(this.getIpSetReferenceStatement()));
            }
            if (this.getRegexPatternSetReferenceStatement() != null) {
                data.set("regexPatternSetReferenceStatement", om.valueToTree(this.getRegexPatternSetReferenceStatement()));
            }
            if (this.getSizeConstraintStatement() != null) {
                data.set("sizeConstraintStatement", om.valueToTree(this.getSizeConstraintStatement()));
            }
            if (this.getSqliMatchStatement() != null) {
                data.set("sqliMatchStatement", om.valueToTree(this.getSqliMatchStatement()));
            }
            if (this.getXssMatchStatement() != null) {
                data.set("xssMatchStatement", om.valueToTree(this.getXssMatchStatement()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement.Jsii$Proxy) o;

            if (this.byteMatchStatement != null ? !this.byteMatchStatement.equals(that.byteMatchStatement) : that.byteMatchStatement != null) return false;
            if (this.geoMatchStatement != null ? !this.geoMatchStatement.equals(that.geoMatchStatement) : that.geoMatchStatement != null) return false;
            if (this.ipSetReferenceStatement != null ? !this.ipSetReferenceStatement.equals(that.ipSetReferenceStatement) : that.ipSetReferenceStatement != null) return false;
            if (this.regexPatternSetReferenceStatement != null ? !this.regexPatternSetReferenceStatement.equals(that.regexPatternSetReferenceStatement) : that.regexPatternSetReferenceStatement != null) return false;
            if (this.sizeConstraintStatement != null ? !this.sizeConstraintStatement.equals(that.sizeConstraintStatement) : that.sizeConstraintStatement != null) return false;
            if (this.sqliMatchStatement != null ? !this.sqliMatchStatement.equals(that.sqliMatchStatement) : that.sqliMatchStatement != null) return false;
            return this.xssMatchStatement != null ? this.xssMatchStatement.equals(that.xssMatchStatement) : that.xssMatchStatement == null;
        }

        @Override
        public final int hashCode() {
            int result = this.byteMatchStatement != null ? this.byteMatchStatement.hashCode() : 0;
            result = 31 * result + (this.geoMatchStatement != null ? this.geoMatchStatement.hashCode() : 0);
            result = 31 * result + (this.ipSetReferenceStatement != null ? this.ipSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.regexPatternSetReferenceStatement != null ? this.regexPatternSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.sizeConstraintStatement != null ? this.sizeConstraintStatement.hashCode() : 0);
            result = 31 * result + (this.sqliMatchStatement != null ? this.sqliMatchStatement.hashCode() : 0);
            result = 31 * result + (this.xssMatchStatement != null ? this.xssMatchStatement.hashCode() : 0);
            return result;
        }
    }
}
