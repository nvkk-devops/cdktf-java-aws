package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.832Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketCorsRule")
@software.amazon.jsii.Jsii.Proxy(S3BucketCorsRule.Jsii$Proxy.class)
public interface S3BucketCorsRule extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedMethods();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedOrigins();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedHeaders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExposeHeaders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxAgeSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketCorsRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketCorsRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketCorsRule> {
        private java.util.List<java.lang.String> allowedMethods;
        private java.util.List<java.lang.String> allowedOrigins;
        private java.util.List<java.lang.String> allowedHeaders;
        private java.util.List<java.lang.String> exposeHeaders;
        private java.lang.Number maxAgeSeconds;

        /**
         * Sets the value of {@link S3BucketCorsRule#getAllowedMethods}
         * @param allowedMethods the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder allowedMethods(java.util.List<java.lang.String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketCorsRule#getAllowedOrigins}
         * @param allowedOrigins the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder allowedOrigins(java.util.List<java.lang.String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketCorsRule#getAllowedHeaders}
         * @param allowedHeaders the value to be set.
         * @return {@code this}
         */
        public Builder allowedHeaders(java.util.List<java.lang.String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketCorsRule#getExposeHeaders}
         * @param exposeHeaders the value to be set.
         * @return {@code this}
         */
        public Builder exposeHeaders(java.util.List<java.lang.String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketCorsRule#getMaxAgeSeconds}
         * @param maxAgeSeconds the value to be set.
         * @return {@code this}
         */
        public Builder maxAgeSeconds(java.lang.Number maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketCorsRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketCorsRule build() {
            return new Jsii$Proxy(allowedMethods, allowedOrigins, allowedHeaders, exposeHeaders, maxAgeSeconds);
        }
    }

    /**
     * An implementation for {@link S3BucketCorsRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketCorsRule {
        private final java.util.List<java.lang.String> allowedMethods;
        private final java.util.List<java.lang.String> allowedOrigins;
        private final java.util.List<java.lang.String> allowedHeaders;
        private final java.util.List<java.lang.String> exposeHeaders;
        private final java.lang.Number maxAgeSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowedMethods = software.amazon.jsii.Kernel.get(this, "allowedMethods", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedOrigins = software.amazon.jsii.Kernel.get(this, "allowedOrigins", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedHeaders = software.amazon.jsii.Kernel.get(this, "allowedHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.exposeHeaders = software.amazon.jsii.Kernel.get(this, "exposeHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.maxAgeSeconds = software.amazon.jsii.Kernel.get(this, "maxAgeSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> allowedMethods, final java.util.List<java.lang.String> allowedOrigins, final java.util.List<java.lang.String> allowedHeaders, final java.util.List<java.lang.String> exposeHeaders, final java.lang.Number maxAgeSeconds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowedMethods = java.util.Objects.requireNonNull(allowedMethods, "allowedMethods is required");
            this.allowedOrigins = java.util.Objects.requireNonNull(allowedOrigins, "allowedOrigins is required");
            this.allowedHeaders = allowedHeaders;
            this.exposeHeaders = exposeHeaders;
            this.maxAgeSeconds = maxAgeSeconds;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedMethods() {
            return this.allowedMethods;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedOrigins() {
            return this.allowedOrigins;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedHeaders() {
            return this.allowedHeaders;
        }

        @Override
        public final java.util.List<java.lang.String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        @Override
        public final java.lang.Number getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("allowedMethods", om.valueToTree(this.getAllowedMethods()));
            data.set("allowedOrigins", om.valueToTree(this.getAllowedOrigins()));
            if (this.getAllowedHeaders() != null) {
                data.set("allowedHeaders", om.valueToTree(this.getAllowedHeaders()));
            }
            if (this.getExposeHeaders() != null) {
                data.set("exposeHeaders", om.valueToTree(this.getExposeHeaders()));
            }
            if (this.getMaxAgeSeconds() != null) {
                data.set("maxAgeSeconds", om.valueToTree(this.getMaxAgeSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketCorsRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketCorsRule.Jsii$Proxy that = (S3BucketCorsRule.Jsii$Proxy) o;

            if (!allowedMethods.equals(that.allowedMethods)) return false;
            if (!allowedOrigins.equals(that.allowedOrigins)) return false;
            if (this.allowedHeaders != null ? !this.allowedHeaders.equals(that.allowedHeaders) : that.allowedHeaders != null) return false;
            if (this.exposeHeaders != null ? !this.exposeHeaders.equals(that.exposeHeaders) : that.exposeHeaders != null) return false;
            return this.maxAgeSeconds != null ? this.maxAgeSeconds.equals(that.maxAgeSeconds) : that.maxAgeSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowedMethods.hashCode();
            result = 31 * result + (this.allowedOrigins.hashCode());
            result = 31 * result + (this.allowedHeaders != null ? this.allowedHeaders.hashCode() : 0);
            result = 31 * result + (this.exposeHeaders != null ? this.exposeHeaders.hashCode() : 0);
            result = 31 * result + (this.maxAgeSeconds != null ? this.maxAgeSeconds.hashCode() : 0);
            return result;
        }
    }
}
