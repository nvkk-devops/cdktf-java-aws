package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.035Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteMatchHeaderMatch.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteMatchHeaderMatch extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getExact() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * range block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange> getRange() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegex() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSuffix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteMatchHeaderMatch> {
        private java.lang.String exact;
        private java.lang.String prefix;
        private java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange> range;
        private java.lang.String regex;
        private java.lang.String suffix;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch#getExact}
         * @param exact the value to be set.
         * @return {@code this}
         */
        public Builder exact(java.lang.String exact) {
            this.exact = exact;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch#getRange}
         * @param range range block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder range(java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange> range) {
            this.range = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange>)range;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch#getRegex}
         * @param regex the value to be set.
         * @return {@code this}
         */
        public Builder regex(java.lang.String regex) {
            this.regex = regex;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch#getSuffix}
         * @param suffix the value to be set.
         * @return {@code this}
         */
        public Builder suffix(java.lang.String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteMatchHeaderMatch build() {
            return new Jsii$Proxy(exact, prefix, range, regex, suffix);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteMatchHeaderMatch}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteMatchHeaderMatch {
        private final java.lang.String exact;
        private final java.lang.String prefix;
        private final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange> range;
        private final java.lang.String regex;
        private final java.lang.String suffix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exact = software.amazon.jsii.Kernel.get(this, "exact", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.range = software.amazon.jsii.Kernel.get(this, "range", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange.class)));
            this.regex = software.amazon.jsii.Kernel.get(this, "regex", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.suffix = software.amazon.jsii.Kernel.get(this, "suffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String exact, final java.lang.String prefix, final java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange> range, final java.lang.String regex, final java.lang.String suffix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exact = exact;
            this.prefix = prefix;
            this.range = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange>)range;
            this.regex = regex;
            this.suffix = suffix;
        }

        @Override
        public final java.lang.String getExact() {
            return this.exact;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange> getRange() {
            return this.range;
        }

        @Override
        public final java.lang.String getRegex() {
            return this.regex;
        }

        @Override
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExact() != null) {
                data.set("exact", om.valueToTree(this.getExact()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getRange() != null) {
                data.set("range", om.valueToTree(this.getRange()));
            }
            if (this.getRegex() != null) {
                data.set("regex", om.valueToTree(this.getRegex()));
            }
            if (this.getSuffix() != null) {
                data.set("suffix", om.valueToTree(this.getSuffix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteMatchHeaderMatch.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteMatchHeaderMatch.Jsii$Proxy) o;

            if (this.exact != null ? !this.exact.equals(that.exact) : that.exact != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            if (this.range != null ? !this.range.equals(that.range) : that.range != null) return false;
            if (this.regex != null ? !this.regex.equals(that.regex) : that.regex != null) return false;
            return this.suffix != null ? this.suffix.equals(that.suffix) : that.suffix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.exact != null ? this.exact.hashCode() : 0;
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.range != null ? this.range.hashCode() : 0);
            result = 31 * result + (this.regex != null ? this.regex.hashCode() : 0);
            result = 31 * result + (this.suffix != null ? this.suffix.hashCode() : 0);
            return result;
        }
    }
}
