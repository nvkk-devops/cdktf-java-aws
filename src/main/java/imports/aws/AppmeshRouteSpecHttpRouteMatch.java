package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.035Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpecHttpRouteMatch")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteMatch.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteMatch extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getPrefix();

    /**
     * header block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeader> getHeader() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMethod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getScheme() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteMatch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteMatch}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteMatch> {
        private java.lang.String prefix;
        private java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeader> header;
        private java.lang.String method;
        private java.lang.String scheme;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getPrefix}
         * @param prefix the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getHeader}
         * @param header header block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder header(java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatchHeader> header) {
            this.header = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeader>)header;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getMethod}
         * @param method the value to be set.
         * @return {@code this}
         */
        public Builder method(java.lang.String method) {
            this.method = method;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getScheme}
         * @param scheme the value to be set.
         * @return {@code this}
         */
        public Builder scheme(java.lang.String scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteMatch}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteMatch build() {
            return new Jsii$Proxy(prefix, header, method, scheme);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteMatch}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteMatch {
        private final java.lang.String prefix;
        private final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeader> header;
        private final java.lang.String method;
        private final java.lang.String scheme;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.header = software.amazon.jsii.Kernel.get(this, "header", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecHttpRouteMatchHeader.class)));
            this.method = software.amazon.jsii.Kernel.get(this, "method", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scheme = software.amazon.jsii.Kernel.get(this, "scheme", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String prefix, final java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatchHeader> header, final java.lang.String method, final java.lang.String scheme) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.prefix = java.util.Objects.requireNonNull(prefix, "prefix is required");
            this.header = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeader>)header;
            this.method = method;
            this.scheme = scheme;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeader> getHeader() {
            return this.header;
        }

        @Override
        public final java.lang.String getMethod() {
            return this.method;
        }

        @Override
        public final java.lang.String getScheme() {
            return this.scheme;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("prefix", om.valueToTree(this.getPrefix()));
            if (this.getHeader() != null) {
                data.set("header", om.valueToTree(this.getHeader()));
            }
            if (this.getMethod() != null) {
                data.set("method", om.valueToTree(this.getMethod()));
            }
            if (this.getScheme() != null) {
                data.set("scheme", om.valueToTree(this.getScheme()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpecHttpRouteMatch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteMatch.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteMatch.Jsii$Proxy) o;

            if (!prefix.equals(that.prefix)) return false;
            if (this.header != null ? !this.header.equals(that.header) : that.header != null) return false;
            if (this.method != null ? !this.method.equals(that.method) : that.method != null) return false;
            return this.scheme != null ? this.scheme.equals(that.scheme) : that.scheme == null;
        }

        @Override
        public final int hashCode() {
            int result = this.prefix.hashCode();
            result = 31 * result + (this.header != null ? this.header.hashCode() : 0);
            result = 31 * result + (this.method != null ? this.method.hashCode() : 0);
            result = 31 * result + (this.scheme != null ? this.scheme.hashCode() : 0);
            return result;
        }
    }
}
