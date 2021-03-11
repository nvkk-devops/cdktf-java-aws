package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.171Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildWebhookFilterGroupFilter")
@software.amazon.jsii.Jsii.Proxy(CodebuildWebhookFilterGroupFilter.Jsii$Proxy.class)
public interface CodebuildWebhookFilterGroupFilter extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getPattern();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExcludeMatchedPattern() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildWebhookFilterGroupFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildWebhookFilterGroupFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildWebhookFilterGroupFilter> {
        private java.lang.String pattern;
        private java.lang.String type;
        private java.lang.Boolean excludeMatchedPattern;

        /**
         * Sets the value of {@link CodebuildWebhookFilterGroupFilter#getPattern}
         * @param pattern the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder pattern(java.lang.String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookFilterGroupFilter#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookFilterGroupFilter#getExcludeMatchedPattern}
         * @param excludeMatchedPattern the value to be set.
         * @return {@code this}
         */
        public Builder excludeMatchedPattern(java.lang.Boolean excludeMatchedPattern) {
            this.excludeMatchedPattern = excludeMatchedPattern;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildWebhookFilterGroupFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildWebhookFilterGroupFilter build() {
            return new Jsii$Proxy(pattern, type, excludeMatchedPattern);
        }
    }

    /**
     * An implementation for {@link CodebuildWebhookFilterGroupFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildWebhookFilterGroupFilter {
        private final java.lang.String pattern;
        private final java.lang.String type;
        private final java.lang.Boolean excludeMatchedPattern;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pattern = software.amazon.jsii.Kernel.get(this, "pattern", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excludeMatchedPattern = software.amazon.jsii.Kernel.get(this, "excludeMatchedPattern", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String pattern, final java.lang.String type, final java.lang.Boolean excludeMatchedPattern) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pattern = java.util.Objects.requireNonNull(pattern, "pattern is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.excludeMatchedPattern = excludeMatchedPattern;
        }

        @Override
        public final java.lang.String getPattern() {
            return this.pattern;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Boolean getExcludeMatchedPattern() {
            return this.excludeMatchedPattern;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("pattern", om.valueToTree(this.getPattern()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getExcludeMatchedPattern() != null) {
                data.set("excludeMatchedPattern", om.valueToTree(this.getExcludeMatchedPattern()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildWebhookFilterGroupFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildWebhookFilterGroupFilter.Jsii$Proxy that = (CodebuildWebhookFilterGroupFilter.Jsii$Proxy) o;

            if (!pattern.equals(that.pattern)) return false;
            if (!type.equals(that.type)) return false;
            return this.excludeMatchedPattern != null ? this.excludeMatchedPattern.equals(that.excludeMatchedPattern) : that.excludeMatchedPattern == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pattern.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.excludeMatchedPattern != null ? this.excludeMatchedPattern.hashCode() : 0);
            return result;
        }
    }
}
