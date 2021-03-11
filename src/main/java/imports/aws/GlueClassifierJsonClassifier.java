package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.593Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueClassifierJsonClassifier")
@software.amazon.jsii.Jsii.Proxy(GlueClassifierJsonClassifier.Jsii$Proxy.class)
public interface GlueClassifierJsonClassifier extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getJsonPath();

    /**
     * @return a {@link Builder} of {@link GlueClassifierJsonClassifier}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueClassifierJsonClassifier}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueClassifierJsonClassifier> {
        private java.lang.String jsonPath;

        /**
         * Sets the value of {@link GlueClassifierJsonClassifier#getJsonPath}
         * @param jsonPath the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder jsonPath(java.lang.String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueClassifierJsonClassifier}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueClassifierJsonClassifier build() {
            return new Jsii$Proxy(jsonPath);
        }
    }

    /**
     * An implementation for {@link GlueClassifierJsonClassifier}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueClassifierJsonClassifier {
        private final java.lang.String jsonPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jsonPath = software.amazon.jsii.Kernel.get(this, "jsonPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String jsonPath) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jsonPath = java.util.Objects.requireNonNull(jsonPath, "jsonPath is required");
        }

        @Override
        public final java.lang.String getJsonPath() {
            return this.jsonPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("jsonPath", om.valueToTree(this.getJsonPath()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueClassifierJsonClassifier"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueClassifierJsonClassifier.Jsii$Proxy that = (GlueClassifierJsonClassifier.Jsii$Proxy) o;

            return this.jsonPath.equals(that.jsonPath);
        }

        @Override
        public final int hashCode() {
            int result = this.jsonPath.hashCode();
            return result;
        }
    }
}
