package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.035Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpecHttpRouteMatchHeader")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteMatchHeader.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteMatchHeader extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInvert() {
        return null;
    }

    /**
     * match block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch> getMatch() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteMatchHeader}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteMatchHeader}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteMatchHeader> {
        private java.lang.String name;
        private java.lang.Boolean invert;
        private java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch> match;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeader#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeader#getInvert}
         * @param invert the value to be set.
         * @return {@code this}
         */
        public Builder invert(java.lang.Boolean invert) {
            this.invert = invert;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeader#getMatch}
         * @param match match block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder match(java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch> match) {
            this.match = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch>)match;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteMatchHeader}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteMatchHeader build() {
            return new Jsii$Proxy(name, invert, match);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteMatchHeader}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteMatchHeader {
        private final java.lang.String name;
        private final java.lang.Boolean invert;
        private final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch> match;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.invert = software.amazon.jsii.Kernel.get(this, "invert", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.match = software.amazon.jsii.Kernel.get(this, "match", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.Boolean invert, final java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch> match) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.invert = invert;
            this.match = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch>)match;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Boolean getInvert() {
            return this.invert;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatchHeaderMatch> getMatch() {
            return this.match;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getInvert() != null) {
                data.set("invert", om.valueToTree(this.getInvert()));
            }
            if (this.getMatch() != null) {
                data.set("match", om.valueToTree(this.getMatch()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpecHttpRouteMatchHeader"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteMatchHeader.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteMatchHeader.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.invert != null ? !this.invert.equals(that.invert) : that.invert != null) return false;
            return this.match != null ? this.match.equals(that.match) : that.match == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.invert != null ? this.invert.hashCode() : 0);
            result = 31 * result + (this.match != null ? this.match.hashCode() : 0);
            return result;
        }
    }
}
