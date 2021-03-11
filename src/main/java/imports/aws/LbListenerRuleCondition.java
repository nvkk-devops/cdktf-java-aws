package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.700Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbListenerRuleCondition")
@software.amazon.jsii.Jsii.Proxy(LbListenerRuleCondition.Jsii$Proxy.class)
public interface LbListenerRuleCondition extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getField() {
        return null;
    }

    /**
     * host_header block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleConditionHostHeader> getHostHeader() {
        return null;
    }

    /**
     * http_header block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleConditionHttpHeader> getHttpHeader() {
        return null;
    }

    /**
     * http_request_method block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleConditionHttpRequestMethod> getHttpRequestMethod() {
        return null;
    }

    /**
     * path_pattern block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleConditionPathPattern> getPathPattern() {
        return null;
    }

    /**
     * query_string block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleConditionQueryString> getQueryString() {
        return null;
    }

    /**
     * source_ip block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleConditionSourceIp> getSourceIp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValues() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbListenerRuleCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbListenerRuleCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbListenerRuleCondition> {
        private java.lang.String field;
        private java.util.List<imports.aws.LbListenerRuleConditionHostHeader> hostHeader;
        private java.util.List<imports.aws.LbListenerRuleConditionHttpHeader> httpHeader;
        private java.util.List<imports.aws.LbListenerRuleConditionHttpRequestMethod> httpRequestMethod;
        private java.util.List<imports.aws.LbListenerRuleConditionPathPattern> pathPattern;
        private java.util.List<imports.aws.LbListenerRuleConditionQueryString> queryString;
        private java.util.List<imports.aws.LbListenerRuleConditionSourceIp> sourceIp;
        private java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link LbListenerRuleCondition#getField}
         * @param field the value to be set.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getHostHeader}
         * @param hostHeader host_header block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder hostHeader(java.util.List<? extends imports.aws.LbListenerRuleConditionHostHeader> hostHeader) {
            this.hostHeader = (java.util.List<imports.aws.LbListenerRuleConditionHostHeader>)hostHeader;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getHttpHeader}
         * @param httpHeader http_header block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder httpHeader(java.util.List<? extends imports.aws.LbListenerRuleConditionHttpHeader> httpHeader) {
            this.httpHeader = (java.util.List<imports.aws.LbListenerRuleConditionHttpHeader>)httpHeader;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getHttpRequestMethod}
         * @param httpRequestMethod http_request_method block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder httpRequestMethod(java.util.List<? extends imports.aws.LbListenerRuleConditionHttpRequestMethod> httpRequestMethod) {
            this.httpRequestMethod = (java.util.List<imports.aws.LbListenerRuleConditionHttpRequestMethod>)httpRequestMethod;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getPathPattern}
         * @param pathPattern path_pattern block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder pathPattern(java.util.List<? extends imports.aws.LbListenerRuleConditionPathPattern> pathPattern) {
            this.pathPattern = (java.util.List<imports.aws.LbListenerRuleConditionPathPattern>)pathPattern;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getQueryString}
         * @param queryString query_string block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder queryString(java.util.List<? extends imports.aws.LbListenerRuleConditionQueryString> queryString) {
            this.queryString = (java.util.List<imports.aws.LbListenerRuleConditionQueryString>)queryString;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getSourceIp}
         * @param sourceIp source_ip block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sourceIp(java.util.List<? extends imports.aws.LbListenerRuleConditionSourceIp> sourceIp) {
            this.sourceIp = (java.util.List<imports.aws.LbListenerRuleConditionSourceIp>)sourceIp;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getValues}
         * @param values the value to be set.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LbListenerRuleCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbListenerRuleCondition build() {
            return new Jsii$Proxy(field, hostHeader, httpHeader, httpRequestMethod, pathPattern, queryString, sourceIp, values);
        }
    }

    /**
     * An implementation for {@link LbListenerRuleCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbListenerRuleCondition {
        private final java.lang.String field;
        private final java.util.List<imports.aws.LbListenerRuleConditionHostHeader> hostHeader;
        private final java.util.List<imports.aws.LbListenerRuleConditionHttpHeader> httpHeader;
        private final java.util.List<imports.aws.LbListenerRuleConditionHttpRequestMethod> httpRequestMethod;
        private final java.util.List<imports.aws.LbListenerRuleConditionPathPattern> pathPattern;
        private final java.util.List<imports.aws.LbListenerRuleConditionQueryString> queryString;
        private final java.util.List<imports.aws.LbListenerRuleConditionSourceIp> sourceIp;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hostHeader = software.amazon.jsii.Kernel.get(this, "hostHeader", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleConditionHostHeader.class)));
            this.httpHeader = software.amazon.jsii.Kernel.get(this, "httpHeader", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleConditionHttpHeader.class)));
            this.httpRequestMethod = software.amazon.jsii.Kernel.get(this, "httpRequestMethod", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleConditionHttpRequestMethod.class)));
            this.pathPattern = software.amazon.jsii.Kernel.get(this, "pathPattern", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleConditionPathPattern.class)));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleConditionQueryString.class)));
            this.sourceIp = software.amazon.jsii.Kernel.get(this, "sourceIp", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleConditionSourceIp.class)));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String field, final java.util.List<? extends imports.aws.LbListenerRuleConditionHostHeader> hostHeader, final java.util.List<? extends imports.aws.LbListenerRuleConditionHttpHeader> httpHeader, final java.util.List<? extends imports.aws.LbListenerRuleConditionHttpRequestMethod> httpRequestMethod, final java.util.List<? extends imports.aws.LbListenerRuleConditionPathPattern> pathPattern, final java.util.List<? extends imports.aws.LbListenerRuleConditionQueryString> queryString, final java.util.List<? extends imports.aws.LbListenerRuleConditionSourceIp> sourceIp, final java.util.List<java.lang.String> values) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.field = field;
            this.hostHeader = (java.util.List<imports.aws.LbListenerRuleConditionHostHeader>)hostHeader;
            this.httpHeader = (java.util.List<imports.aws.LbListenerRuleConditionHttpHeader>)httpHeader;
            this.httpRequestMethod = (java.util.List<imports.aws.LbListenerRuleConditionHttpRequestMethod>)httpRequestMethod;
            this.pathPattern = (java.util.List<imports.aws.LbListenerRuleConditionPathPattern>)pathPattern;
            this.queryString = (java.util.List<imports.aws.LbListenerRuleConditionQueryString>)queryString;
            this.sourceIp = (java.util.List<imports.aws.LbListenerRuleConditionSourceIp>)sourceIp;
            this.values = values;
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleConditionHostHeader> getHostHeader() {
            return this.hostHeader;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleConditionHttpHeader> getHttpHeader() {
            return this.httpHeader;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleConditionHttpRequestMethod> getHttpRequestMethod() {
            return this.httpRequestMethod;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleConditionPathPattern> getPathPattern() {
            return this.pathPattern;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleConditionQueryString> getQueryString() {
            return this.queryString;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleConditionSourceIp> getSourceIp() {
            return this.sourceIp;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getField() != null) {
                data.set("field", om.valueToTree(this.getField()));
            }
            if (this.getHostHeader() != null) {
                data.set("hostHeader", om.valueToTree(this.getHostHeader()));
            }
            if (this.getHttpHeader() != null) {
                data.set("httpHeader", om.valueToTree(this.getHttpHeader()));
            }
            if (this.getHttpRequestMethod() != null) {
                data.set("httpRequestMethod", om.valueToTree(this.getHttpRequestMethod()));
            }
            if (this.getPathPattern() != null) {
                data.set("pathPattern", om.valueToTree(this.getPathPattern()));
            }
            if (this.getQueryString() != null) {
                data.set("queryString", om.valueToTree(this.getQueryString()));
            }
            if (this.getSourceIp() != null) {
                data.set("sourceIp", om.valueToTree(this.getSourceIp()));
            }
            if (this.getValues() != null) {
                data.set("values", om.valueToTree(this.getValues()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LbListenerRuleCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbListenerRuleCondition.Jsii$Proxy that = (LbListenerRuleCondition.Jsii$Proxy) o;

            if (this.field != null ? !this.field.equals(that.field) : that.field != null) return false;
            if (this.hostHeader != null ? !this.hostHeader.equals(that.hostHeader) : that.hostHeader != null) return false;
            if (this.httpHeader != null ? !this.httpHeader.equals(that.httpHeader) : that.httpHeader != null) return false;
            if (this.httpRequestMethod != null ? !this.httpRequestMethod.equals(that.httpRequestMethod) : that.httpRequestMethod != null) return false;
            if (this.pathPattern != null ? !this.pathPattern.equals(that.pathPattern) : that.pathPattern != null) return false;
            if (this.queryString != null ? !this.queryString.equals(that.queryString) : that.queryString != null) return false;
            if (this.sourceIp != null ? !this.sourceIp.equals(that.sourceIp) : that.sourceIp != null) return false;
            return this.values != null ? this.values.equals(that.values) : that.values == null;
        }

        @Override
        public final int hashCode() {
            int result = this.field != null ? this.field.hashCode() : 0;
            result = 31 * result + (this.hostHeader != null ? this.hostHeader.hashCode() : 0);
            result = 31 * result + (this.httpHeader != null ? this.httpHeader.hashCode() : 0);
            result = 31 * result + (this.httpRequestMethod != null ? this.httpRequestMethod.hashCode() : 0);
            result = 31 * result + (this.pathPattern != null ? this.pathPattern.hashCode() : 0);
            result = 31 * result + (this.queryString != null ? this.queryString.hashCode() : 0);
            result = 31 * result + (this.sourceIp != null ? this.sourceIp.hashCode() : 0);
            result = 31 * result + (this.values != null ? this.values.hashCode() : 0);
            return result;
        }
    }
}
