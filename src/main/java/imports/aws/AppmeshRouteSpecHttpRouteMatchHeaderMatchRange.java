package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.035Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteMatchHeaderMatchRange.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteMatchHeaderMatchRange extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getEnd();

    @org.jetbrains.annotations.NotNull java.lang.Number getStart();

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatchRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteMatchHeaderMatchRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteMatchHeaderMatchRange> {
        private java.lang.Number end;
        private java.lang.Number start;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatchRange#getEnd}
         * @param end the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder end(java.lang.Number end) {
            this.end = end;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatchRange#getStart}
         * @param start the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder start(java.lang.Number start) {
            this.start = start;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteMatchHeaderMatchRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteMatchHeaderMatchRange build() {
            return new Jsii$Proxy(end, start);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteMatchHeaderMatchRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteMatchHeaderMatchRange {
        private final java.lang.Number end;
        private final java.lang.Number start;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.end = software.amazon.jsii.Kernel.get(this, "end", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.start = software.amazon.jsii.Kernel.get(this, "start", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number end, final java.lang.Number start) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.end = java.util.Objects.requireNonNull(end, "end is required");
            this.start = java.util.Objects.requireNonNull(start, "start is required");
        }

        @Override
        public final java.lang.Number getEnd() {
            return this.end;
        }

        @Override
        public final java.lang.Number getStart() {
            return this.start;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("end", om.valueToTree(this.getEnd()));
            data.set("start", om.valueToTree(this.getStart()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpecHttpRouteMatchHeaderMatchRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteMatchHeaderMatchRange.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteMatchHeaderMatchRange.Jsii$Proxy) o;

            if (!end.equals(that.end)) return false;
            return this.start.equals(that.start);
        }

        @Override
        public final int hashCode() {
            int result = this.end.hashCode();
            result = 31 * result + (this.start.hashCode());
            return result;
        }
    }
}
