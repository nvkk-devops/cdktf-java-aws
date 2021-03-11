package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.121Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionDefaultCacheBehaviorForwardedValues.Jsii$Proxy.class)
public interface CloudfrontDistributionDefaultCacheBehaviorForwardedValues extends software.amazon.jsii.JsiiSerializable {

    /**
     * cookies block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies> getCookies();

    @org.jetbrains.annotations.NotNull java.lang.Boolean getQueryString();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHeaders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getQueryStringCacheKeys() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionDefaultCacheBehaviorForwardedValues> {
        private java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies> cookies;
        private java.lang.Boolean queryString;
        private java.util.List<java.lang.String> headers;
        private java.util.List<java.lang.String> queryStringCacheKeys;

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getCookies}
         * @param cookies cookies block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cookies(java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies> cookies) {
            this.cookies = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies>)cookies;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getQueryString}
         * @param queryString the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder queryString(java.lang.Boolean queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getHeaders}
         * @param headers the value to be set.
         * @return {@code this}
         */
        public Builder headers(java.util.List<java.lang.String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getQueryStringCacheKeys}
         * @param queryStringCacheKeys the value to be set.
         * @return {@code this}
         */
        public Builder queryStringCacheKeys(java.util.List<java.lang.String> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionDefaultCacheBehaviorForwardedValues build() {
            return new Jsii$Proxy(cookies, queryString, headers, queryStringCacheKeys);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionDefaultCacheBehaviorForwardedValues {
        private final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies> cookies;
        private final java.lang.Boolean queryString;
        private final java.util.List<java.lang.String> headers;
        private final java.util.List<java.lang.String> queryStringCacheKeys;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cookies = software.amazon.jsii.Kernel.get(this, "cookies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies.class)));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.headers = software.amazon.jsii.Kernel.get(this, "headers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.queryStringCacheKeys = software.amazon.jsii.Kernel.get(this, "queryStringCacheKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies> cookies, final java.lang.Boolean queryString, final java.util.List<java.lang.String> headers, final java.util.List<java.lang.String> queryStringCacheKeys) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cookies = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies>)java.util.Objects.requireNonNull(cookies, "cookies is required");
            this.queryString = java.util.Objects.requireNonNull(queryString, "queryString is required");
            this.headers = headers;
            this.queryStringCacheKeys = queryStringCacheKeys;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies> getCookies() {
            return this.cookies;
        }

        @Override
        public final java.lang.Boolean getQueryString() {
            return this.queryString;
        }

        @Override
        public final java.util.List<java.lang.String> getHeaders() {
            return this.headers;
        }

        @Override
        public final java.util.List<java.lang.String> getQueryStringCacheKeys() {
            return this.queryStringCacheKeys;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cookies", om.valueToTree(this.getCookies()));
            data.set("queryString", om.valueToTree(this.getQueryString()));
            if (this.getHeaders() != null) {
                data.set("headers", om.valueToTree(this.getHeaders()));
            }
            if (this.getQueryStringCacheKeys() != null) {
                data.set("queryStringCacheKeys", om.valueToTree(this.getQueryStringCacheKeys()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionDefaultCacheBehaviorForwardedValues.Jsii$Proxy that = (CloudfrontDistributionDefaultCacheBehaviorForwardedValues.Jsii$Proxy) o;

            if (!cookies.equals(that.cookies)) return false;
            if (!queryString.equals(that.queryString)) return false;
            if (this.headers != null ? !this.headers.equals(that.headers) : that.headers != null) return false;
            return this.queryStringCacheKeys != null ? this.queryStringCacheKeys.equals(that.queryStringCacheKeys) : that.queryStringCacheKeys == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cookies.hashCode();
            result = 31 * result + (this.queryString.hashCode());
            result = 31 * result + (this.headers != null ? this.headers.hashCode() : 0);
            result = 31 * result + (this.queryStringCacheKeys != null ? this.queryStringCacheKeys.hashCode() : 0);
            return result;
        }
    }
}
