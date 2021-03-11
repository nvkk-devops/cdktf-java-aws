package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.002Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch.Jsii$Proxy.class)
public interface Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch extends software.amazon.jsii.JsiiSerializable {

    /**
     * all_query_arguments block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return null;
    }

    /**
     * body block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> getBody() {
        return null;
    }

    /**
     * method block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> getMethod() {
        return null;
    }

    /**
     * query_string block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> getQueryString() {
        return null;
    }

    /**
     * single_header block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return null;
    }

    /**
     * single_query_argument block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return null;
    }

    /**
     * uri_path block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> getUriPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch> {
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> allQueryArguments;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> body;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> method;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> queryString;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> singleHeader;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> uriPath;

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch#getAllQueryArguments}
         * @param allQueryArguments all_query_arguments block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder allQueryArguments(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> allQueryArguments) {
            this.allQueryArguments = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments>)allQueryArguments;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch#getBody}
         * @param body body block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder body(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> body) {
            this.body = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody>)body;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch#getMethod}
         * @param method method block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder method(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> method) {
            this.method = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod>)method;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch#getQueryString}
         * @param queryString query_string block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder queryString(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> queryString) {
            this.queryString = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString>)queryString;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch#getSingleHeader}
         * @param singleHeader single_header block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder singleHeader(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> singleHeader) {
            this.singleHeader = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader>)singleHeader;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch#getSingleQueryArgument}
         * @param singleQueryArgument single_query_argument block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder singleQueryArgument(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument) {
            this.singleQueryArgument = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument>)singleQueryArgument;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch#getUriPath}
         * @param uriPath uri_path block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder uriPath(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> uriPath) {
            this.uriPath = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath>)uriPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch build() {
            return new Jsii$Proxy(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch {
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> allQueryArguments;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> body;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> method;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> queryString;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> singleHeader;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> uriPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allQueryArguments = software.amazon.jsii.Kernel.get(this, "allQueryArguments", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments.class)));
            this.body = software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody.class)));
            this.method = software.amazon.jsii.Kernel.get(this, "method", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod.class)));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString.class)));
            this.singleHeader = software.amazon.jsii.Kernel.get(this, "singleHeader", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader.class)));
            this.singleQueryArgument = software.amazon.jsii.Kernel.get(this, "singleQueryArgument", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument.class)));
            this.uriPath = software.amazon.jsii.Kernel.get(this, "uriPath", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> allQueryArguments, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> body, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> method, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> queryString, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> singleHeader, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> uriPath) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allQueryArguments = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments>)allQueryArguments;
            this.body = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody>)body;
            this.method = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod>)method;
            this.queryString = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString>)queryString;
            this.singleHeader = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader>)singleHeader;
            this.singleQueryArgument = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument>)singleQueryArgument;
            this.uriPath = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath>)uriPath;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
            return this.allQueryArguments;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> getBody() {
            return this.body;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> getMethod() {
            return this.method;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> getQueryString() {
            return this.queryString;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
            return this.singleHeader;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
            return this.singleQueryArgument;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> getUriPath() {
            return this.uriPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllQueryArguments() != null) {
                data.set("allQueryArguments", om.valueToTree(this.getAllQueryArguments()));
            }
            if (this.getBody() != null) {
                data.set("body", om.valueToTree(this.getBody()));
            }
            if (this.getMethod() != null) {
                data.set("method", om.valueToTree(this.getMethod()));
            }
            if (this.getQueryString() != null) {
                data.set("queryString", om.valueToTree(this.getQueryString()));
            }
            if (this.getSingleHeader() != null) {
                data.set("singleHeader", om.valueToTree(this.getSingleHeader()));
            }
            if (this.getSingleQueryArgument() != null) {
                data.set("singleQueryArgument", om.valueToTree(this.getSingleQueryArgument()));
            }
            if (this.getUriPath() != null) {
                data.set("uriPath", om.valueToTree(this.getUriPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch.Jsii$Proxy that = (Wafv2RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch.Jsii$Proxy) o;

            if (this.allQueryArguments != null ? !this.allQueryArguments.equals(that.allQueryArguments) : that.allQueryArguments != null) return false;
            if (this.body != null ? !this.body.equals(that.body) : that.body != null) return false;
            if (this.method != null ? !this.method.equals(that.method) : that.method != null) return false;
            if (this.queryString != null ? !this.queryString.equals(that.queryString) : that.queryString != null) return false;
            if (this.singleHeader != null ? !this.singleHeader.equals(that.singleHeader) : that.singleHeader != null) return false;
            if (this.singleQueryArgument != null ? !this.singleQueryArgument.equals(that.singleQueryArgument) : that.singleQueryArgument != null) return false;
            return this.uriPath != null ? this.uriPath.equals(that.uriPath) : that.uriPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allQueryArguments != null ? this.allQueryArguments.hashCode() : 0;
            result = 31 * result + (this.body != null ? this.body.hashCode() : 0);
            result = 31 * result + (this.method != null ? this.method.hashCode() : 0);
            result = 31 * result + (this.queryString != null ? this.queryString.hashCode() : 0);
            result = 31 * result + (this.singleHeader != null ? this.singleHeader.hashCode() : 0);
            result = 31 * result + (this.singleQueryArgument != null ? this.singleQueryArgument.hashCode() : 0);
            result = 31 * result + (this.uriPath != null ? this.uriPath.hashCode() : 0);
            return result;
        }
    }
}
