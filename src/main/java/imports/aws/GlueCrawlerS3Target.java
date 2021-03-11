package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.602Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueCrawlerS3Target")
@software.amazon.jsii.Jsii.Proxy(GlueCrawlerS3Target.Jsii$Proxy.class)
public interface GlueCrawlerS3Target extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExclusions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueCrawlerS3Target}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCrawlerS3Target}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCrawlerS3Target> {
        private java.lang.String path;
        private java.util.List<java.lang.String> exclusions;

        /**
         * Sets the value of {@link GlueCrawlerS3Target#getPath}
         * @param path the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerS3Target#getExclusions}
         * @param exclusions the value to be set.
         * @return {@code this}
         */
        public Builder exclusions(java.util.List<java.lang.String> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCrawlerS3Target}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCrawlerS3Target build() {
            return new Jsii$Proxy(path, exclusions);
        }
    }

    /**
     * An implementation for {@link GlueCrawlerS3Target}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCrawlerS3Target {
        private final java.lang.String path;
        private final java.util.List<java.lang.String> exclusions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.exclusions = software.amazon.jsii.Kernel.get(this, "exclusions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String path, final java.util.List<java.lang.String> exclusions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(path, "path is required");
            this.exclusions = exclusions;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.util.List<java.lang.String> getExclusions() {
            return this.exclusions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getExclusions() != null) {
                data.set("exclusions", om.valueToTree(this.getExclusions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueCrawlerS3Target"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCrawlerS3Target.Jsii$Proxy that = (GlueCrawlerS3Target.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            return this.exclusions != null ? this.exclusions.equals(that.exclusions) : that.exclusions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.exclusions != null ? this.exclusions.hashCode() : 0);
            return result;
        }
    }
}
