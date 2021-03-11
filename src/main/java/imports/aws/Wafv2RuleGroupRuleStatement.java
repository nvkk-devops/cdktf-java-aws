package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.950Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2RuleGroupRuleStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRuleStatement.Jsii$Proxy.class)
public interface Wafv2RuleGroupRuleStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * and_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementAndStatement> getAndStatement() {
        return null;
    }

    /**
     * byte_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement> getByteMatchStatement() {
        return null;
    }

    /**
     * geo_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement> getGeoMatchStatement() {
        return null;
    }

    /**
     * ip_set_reference_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return null;
    }

    /**
     * not_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementNotStatement> getNotStatement() {
        return null;
    }

    /**
     * or_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatement> getOrStatement() {
        return null;
    }

    /**
     * regex_pattern_set_reference_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return null;
    }

    /**
     * size_constraint_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return null;
    }

    /**
     * sqli_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement> getSqliMatchStatement() {
        return null;
    }

    /**
     * xss_match_statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement> getXssMatchStatement() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRuleStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRuleStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRuleStatement> {
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementAndStatement> andStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement> byteMatchStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement> geoMatchStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement> ipSetReferenceStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementNotStatement> notStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatement> orStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement> sizeConstraintStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement> sqliMatchStatement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement> xssMatchStatement;

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getAndStatement}
         * @param andStatement and_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder andStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementAndStatement> andStatement) {
            this.andStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementAndStatement>)andStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getByteMatchStatement}
         * @param byteMatchStatement byte_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder byteMatchStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement> byteMatchStatement) {
            this.byteMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement>)byteMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getGeoMatchStatement}
         * @param geoMatchStatement geo_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder geoMatchStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement> geoMatchStatement) {
            this.geoMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement>)geoMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getIpSetReferenceStatement}
         * @param ipSetReferenceStatement ip_set_reference_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ipSetReferenceStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement>)ipSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getNotStatement}
         * @param notStatement not_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder notStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementNotStatement> notStatement) {
            this.notStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementNotStatement>)notStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getOrStatement}
         * @param orStatement or_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder orStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatement> orStatement) {
            this.orStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatement>)orStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getRegexPatternSetReferenceStatement}
         * @param regexPatternSetReferenceStatement regex_pattern_set_reference_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder regexPatternSetReferenceStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement>)regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getSizeConstraintStatement}
         * @param sizeConstraintStatement size_constraint_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sizeConstraintStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement> sizeConstraintStatement) {
            this.sizeConstraintStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement>)sizeConstraintStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getSqliMatchStatement}
         * @param sqliMatchStatement sqli_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sqliMatchStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement> sqliMatchStatement) {
            this.sqliMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement>)sqliMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getXssMatchStatement}
         * @param xssMatchStatement xss_match_statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder xssMatchStatement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement> xssMatchStatement) {
            this.xssMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement>)xssMatchStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRuleStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRuleStatement build() {
            return new Jsii$Proxy(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRuleStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRuleStatement {
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementAndStatement> andStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement> byteMatchStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement> geoMatchStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement> ipSetReferenceStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementNotStatement> notStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatement> orStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement> sizeConstraintStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement> sqliMatchStatement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement> xssMatchStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.andStatement = software.amazon.jsii.Kernel.get(this, "andStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementAndStatement.class)));
            this.byteMatchStatement = software.amazon.jsii.Kernel.get(this, "byteMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement.class)));
            this.geoMatchStatement = software.amazon.jsii.Kernel.get(this, "geoMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement.class)));
            this.ipSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "ipSetReferenceStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement.class)));
            this.notStatement = software.amazon.jsii.Kernel.get(this, "notStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementNotStatement.class)));
            this.orStatement = software.amazon.jsii.Kernel.get(this, "orStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatement.class)));
            this.regexPatternSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "regexPatternSetReferenceStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement.class)));
            this.sizeConstraintStatement = software.amazon.jsii.Kernel.get(this, "sizeConstraintStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement.class)));
            this.sqliMatchStatement = software.amazon.jsii.Kernel.get(this, "sqliMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement.class)));
            this.xssMatchStatement = software.amazon.jsii.Kernel.get(this, "xssMatchStatement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementAndStatement> andStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement> byteMatchStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement> geoMatchStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement> ipSetReferenceStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementNotStatement> notStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatement> orStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement> sizeConstraintStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement> sqliMatchStatement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement> xssMatchStatement) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.andStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementAndStatement>)andStatement;
            this.byteMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement>)byteMatchStatement;
            this.geoMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement>)geoMatchStatement;
            this.ipSetReferenceStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement>)ipSetReferenceStatement;
            this.notStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementNotStatement>)notStatement;
            this.orStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatement>)orStatement;
            this.regexPatternSetReferenceStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement>)regexPatternSetReferenceStatement;
            this.sizeConstraintStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement>)sizeConstraintStatement;
            this.sqliMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement>)sqliMatchStatement;
            this.xssMatchStatement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement>)xssMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementAndStatement> getAndStatement() {
            return this.andStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementByteMatchStatement> getByteMatchStatement() {
            return this.byteMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementGeoMatchStatement> getGeoMatchStatement() {
            return this.geoMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
            return this.ipSetReferenceStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementNotStatement> getNotStatement() {
            return this.notStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatement> getOrStatement() {
            return this.orStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
            return this.regexPatternSetReferenceStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSizeConstraintStatement> getSizeConstraintStatement() {
            return this.sizeConstraintStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementSqliMatchStatement> getSqliMatchStatement() {
            return this.sqliMatchStatement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementXssMatchStatement> getXssMatchStatement() {
            return this.xssMatchStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAndStatement() != null) {
                data.set("andStatement", om.valueToTree(this.getAndStatement()));
            }
            if (this.getByteMatchStatement() != null) {
                data.set("byteMatchStatement", om.valueToTree(this.getByteMatchStatement()));
            }
            if (this.getGeoMatchStatement() != null) {
                data.set("geoMatchStatement", om.valueToTree(this.getGeoMatchStatement()));
            }
            if (this.getIpSetReferenceStatement() != null) {
                data.set("ipSetReferenceStatement", om.valueToTree(this.getIpSetReferenceStatement()));
            }
            if (this.getNotStatement() != null) {
                data.set("notStatement", om.valueToTree(this.getNotStatement()));
            }
            if (this.getOrStatement() != null) {
                data.set("orStatement", om.valueToTree(this.getOrStatement()));
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
            struct.set("fqn", om.valueToTree("aws.Wafv2RuleGroupRuleStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRuleStatement.Jsii$Proxy that = (Wafv2RuleGroupRuleStatement.Jsii$Proxy) o;

            if (this.andStatement != null ? !this.andStatement.equals(that.andStatement) : that.andStatement != null) return false;
            if (this.byteMatchStatement != null ? !this.byteMatchStatement.equals(that.byteMatchStatement) : that.byteMatchStatement != null) return false;
            if (this.geoMatchStatement != null ? !this.geoMatchStatement.equals(that.geoMatchStatement) : that.geoMatchStatement != null) return false;
            if (this.ipSetReferenceStatement != null ? !this.ipSetReferenceStatement.equals(that.ipSetReferenceStatement) : that.ipSetReferenceStatement != null) return false;
            if (this.notStatement != null ? !this.notStatement.equals(that.notStatement) : that.notStatement != null) return false;
            if (this.orStatement != null ? !this.orStatement.equals(that.orStatement) : that.orStatement != null) return false;
            if (this.regexPatternSetReferenceStatement != null ? !this.regexPatternSetReferenceStatement.equals(that.regexPatternSetReferenceStatement) : that.regexPatternSetReferenceStatement != null) return false;
            if (this.sizeConstraintStatement != null ? !this.sizeConstraintStatement.equals(that.sizeConstraintStatement) : that.sizeConstraintStatement != null) return false;
            if (this.sqliMatchStatement != null ? !this.sqliMatchStatement.equals(that.sqliMatchStatement) : that.sqliMatchStatement != null) return false;
            return this.xssMatchStatement != null ? this.xssMatchStatement.equals(that.xssMatchStatement) : that.xssMatchStatement == null;
        }

        @Override
        public final int hashCode() {
            int result = this.andStatement != null ? this.andStatement.hashCode() : 0;
            result = 31 * result + (this.byteMatchStatement != null ? this.byteMatchStatement.hashCode() : 0);
            result = 31 * result + (this.geoMatchStatement != null ? this.geoMatchStatement.hashCode() : 0);
            result = 31 * result + (this.ipSetReferenceStatement != null ? this.ipSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.notStatement != null ? this.notStatement.hashCode() : 0);
            result = 31 * result + (this.orStatement != null ? this.orStatement.hashCode() : 0);
            result = 31 * result + (this.regexPatternSetReferenceStatement != null ? this.regexPatternSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.sizeConstraintStatement != null ? this.sizeConstraintStatement.hashCode() : 0);
            result = 31 * result + (this.sqliMatchStatement != null ? this.sqliMatchStatement.hashCode() : 0);
            result = 31 * result + (this.xssMatchStatement != null ? this.xssMatchStatement.hashCode() : 0);
            return result;
        }
    }
}
