package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.593Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueClassifierXmlClassifier")
@software.amazon.jsii.Jsii.Proxy(GlueClassifierXmlClassifier.Jsii$Proxy.class)
public interface GlueClassifierXmlClassifier extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getClassification();

    @org.jetbrains.annotations.NotNull java.lang.String getRowTag();

    /**
     * @return a {@link Builder} of {@link GlueClassifierXmlClassifier}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueClassifierXmlClassifier}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueClassifierXmlClassifier> {
        private java.lang.String classification;
        private java.lang.String rowTag;

        /**
         * Sets the value of {@link GlueClassifierXmlClassifier#getClassification}
         * @param classification the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder classification(java.lang.String classification) {
            this.classification = classification;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierXmlClassifier#getRowTag}
         * @param rowTag the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder rowTag(java.lang.String rowTag) {
            this.rowTag = rowTag;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueClassifierXmlClassifier}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueClassifierXmlClassifier build() {
            return new Jsii$Proxy(classification, rowTag);
        }
    }

    /**
     * An implementation for {@link GlueClassifierXmlClassifier}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueClassifierXmlClassifier {
        private final java.lang.String classification;
        private final java.lang.String rowTag;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.classification = software.amazon.jsii.Kernel.get(this, "classification", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rowTag = software.amazon.jsii.Kernel.get(this, "rowTag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String classification, final java.lang.String rowTag) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.classification = java.util.Objects.requireNonNull(classification, "classification is required");
            this.rowTag = java.util.Objects.requireNonNull(rowTag, "rowTag is required");
        }

        @Override
        public final java.lang.String getClassification() {
            return this.classification;
        }

        @Override
        public final java.lang.String getRowTag() {
            return this.rowTag;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("classification", om.valueToTree(this.getClassification()));
            data.set("rowTag", om.valueToTree(this.getRowTag()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueClassifierXmlClassifier"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueClassifierXmlClassifier.Jsii$Proxy that = (GlueClassifierXmlClassifier.Jsii$Proxy) o;

            if (!classification.equals(that.classification)) return false;
            return this.rowTag.equals(that.rowTag);
        }

        @Override
        public final int hashCode() {
            int result = this.classification.hashCode();
            result = 31 * result + (this.rowTag.hashCode());
            return result;
        }
    }
}
