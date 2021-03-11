package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.180Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodepipelineArtifactStoreEncryptionKey")
@software.amazon.jsii.Jsii.Proxy(CodepipelineArtifactStoreEncryptionKey.Jsii$Proxy.class)
public interface CodepipelineArtifactStoreEncryptionKey extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getId();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link CodepipelineArtifactStoreEncryptionKey}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodepipelineArtifactStoreEncryptionKey}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodepipelineArtifactStoreEncryptionKey> {
        private java.lang.String id;
        private java.lang.String type;

        /**
         * Sets the value of {@link CodepipelineArtifactStoreEncryptionKey#getId}
         * @param id the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineArtifactStoreEncryptionKey#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodepipelineArtifactStoreEncryptionKey}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodepipelineArtifactStoreEncryptionKey build() {
            return new Jsii$Proxy(id, type);
        }
    }

    /**
     * An implementation for {@link CodepipelineArtifactStoreEncryptionKey}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodepipelineArtifactStoreEncryptionKey {
        private final java.lang.String id;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String id, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.id = java.util.Objects.requireNonNull(id, "id is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("id", om.valueToTree(this.getId()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodepipelineArtifactStoreEncryptionKey"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodepipelineArtifactStoreEncryptionKey.Jsii$Proxy that = (CodepipelineArtifactStoreEncryptionKey.Jsii$Proxy) o;

            if (!id.equals(that.id)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.id.hashCode();
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
