package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.180Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodepipelineArtifactStore")
@software.amazon.jsii.Jsii.Proxy(CodepipelineArtifactStore.Jsii$Proxy.class)
public interface CodepipelineArtifactStore extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getLocation();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * encryption_key block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodepipelineArtifactStoreEncryptionKey> getEncryptionKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodepipelineArtifactStore}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodepipelineArtifactStore}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodepipelineArtifactStore> {
        private java.lang.String location;
        private java.lang.String type;
        private java.util.List<imports.aws.CodepipelineArtifactStoreEncryptionKey> encryptionKey;
        private java.lang.String region;

        /**
         * Sets the value of {@link CodepipelineArtifactStore#getLocation}
         * @param location the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineArtifactStore#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineArtifactStore#getEncryptionKey}
         * @param encryptionKey encryption_key block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryptionKey(java.util.List<? extends imports.aws.CodepipelineArtifactStoreEncryptionKey> encryptionKey) {
            this.encryptionKey = (java.util.List<imports.aws.CodepipelineArtifactStoreEncryptionKey>)encryptionKey;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineArtifactStore#getRegion}
         * @param region the value to be set.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodepipelineArtifactStore}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodepipelineArtifactStore build() {
            return new Jsii$Proxy(location, type, encryptionKey, region);
        }
    }

    /**
     * An implementation for {@link CodepipelineArtifactStore}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodepipelineArtifactStore {
        private final java.lang.String location;
        private final java.lang.String type;
        private final java.util.List<imports.aws.CodepipelineArtifactStoreEncryptionKey> encryptionKey;
        private final java.lang.String region;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryptionKey = software.amazon.jsii.Kernel.get(this, "encryptionKey", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodepipelineArtifactStoreEncryptionKey.class)));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String location, final java.lang.String type, final java.util.List<? extends imports.aws.CodepipelineArtifactStoreEncryptionKey> encryptionKey, final java.lang.String region) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.location = java.util.Objects.requireNonNull(location, "location is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.encryptionKey = (java.util.List<imports.aws.CodepipelineArtifactStoreEncryptionKey>)encryptionKey;
            this.region = region;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.CodepipelineArtifactStoreEncryptionKey> getEncryptionKey() {
            return this.encryptionKey;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("location", om.valueToTree(this.getLocation()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getEncryptionKey() != null) {
                data.set("encryptionKey", om.valueToTree(this.getEncryptionKey()));
            }
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodepipelineArtifactStore"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodepipelineArtifactStore.Jsii$Proxy that = (CodepipelineArtifactStore.Jsii$Proxy) o;

            if (!location.equals(that.location)) return false;
            if (!type.equals(that.type)) return false;
            if (this.encryptionKey != null ? !this.encryptionKey.equals(that.encryptionKey) : that.encryptionKey != null) return false;
            return this.region != null ? this.region.equals(that.region) : that.region == null;
        }

        @Override
        public final int hashCode() {
            int result = this.location.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.encryptionKey != null ? this.encryptionKey.hashCode() : 0);
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            return result;
        }
    }
}
