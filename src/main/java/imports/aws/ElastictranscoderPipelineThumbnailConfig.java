package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.556Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPipelineThumbnailConfig")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPipelineThumbnailConfig.Jsii$Proxy.class)
public interface ElastictranscoderPipelineThumbnailConfig extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getBucket() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClass() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPipelineThumbnailConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPipelineThumbnailConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPipelineThumbnailConfig> {
        private java.lang.String bucket;
        private java.lang.String storageClass;

        /**
         * Sets the value of {@link ElastictranscoderPipelineThumbnailConfig#getBucket}
         * @param bucket the value to be set.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineThumbnailConfig#getStorageClass}
         * @param storageClass the value to be set.
         * @return {@code this}
         */
        public Builder storageClass(java.lang.String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElastictranscoderPipelineThumbnailConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPipelineThumbnailConfig build() {
            return new Jsii$Proxy(bucket, storageClass);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPipelineThumbnailConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPipelineThumbnailConfig {
        private final java.lang.String bucket;
        private final java.lang.String storageClass;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageClass = software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String bucket, final java.lang.String storageClass) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucket = bucket;
            this.storageClass = storageClass;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getStorageClass() {
            return this.storageClass;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBucket() != null) {
                data.set("bucket", om.valueToTree(this.getBucket()));
            }
            if (this.getStorageClass() != null) {
                data.set("storageClass", om.valueToTree(this.getStorageClass()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPipelineThumbnailConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPipelineThumbnailConfig.Jsii$Proxy that = (ElastictranscoderPipelineThumbnailConfig.Jsii$Proxy) o;

            if (this.bucket != null ? !this.bucket.equals(that.bucket) : that.bucket != null) return false;
            return this.storageClass != null ? this.storageClass.equals(that.storageClass) : that.storageClass == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucket != null ? this.bucket.hashCode() : 0;
            result = 31 * result + (this.storageClass != null ? this.storageClass.hashCode() : 0);
            return result;
        }
    }
}
