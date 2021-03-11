package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.657Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getBlockSizeBytes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCompression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableDictionaryCompression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxPaddingBytes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPageSizeBytes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWriterVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe> {
        private java.lang.Number blockSizeBytes;
        private java.lang.String compression;
        private java.lang.Boolean enableDictionaryCompression;
        private java.lang.Number maxPaddingBytes;
        private java.lang.Number pageSizeBytes;
        private java.lang.String writerVersion;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe#getBlockSizeBytes}
         * @param blockSizeBytes the value to be set.
         * @return {@code this}
         */
        public Builder blockSizeBytes(java.lang.Number blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe#getCompression}
         * @param compression the value to be set.
         * @return {@code this}
         */
        public Builder compression(java.lang.String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe#getEnableDictionaryCompression}
         * @param enableDictionaryCompression the value to be set.
         * @return {@code this}
         */
        public Builder enableDictionaryCompression(java.lang.Boolean enableDictionaryCompression) {
            this.enableDictionaryCompression = enableDictionaryCompression;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe#getMaxPaddingBytes}
         * @param maxPaddingBytes the value to be set.
         * @return {@code this}
         */
        public Builder maxPaddingBytes(java.lang.Number maxPaddingBytes) {
            this.maxPaddingBytes = maxPaddingBytes;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe#getPageSizeBytes}
         * @param pageSizeBytes the value to be set.
         * @return {@code this}
         */
        public Builder pageSizeBytes(java.lang.Number pageSizeBytes) {
            this.pageSizeBytes = pageSizeBytes;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe#getWriterVersion}
         * @param writerVersion the value to be set.
         * @return {@code this}
         */
        public Builder writerVersion(java.lang.String writerVersion) {
            this.writerVersion = writerVersion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe build() {
            return new Jsii$Proxy(blockSizeBytes, compression, enableDictionaryCompression, maxPaddingBytes, pageSizeBytes, writerVersion);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe {
        private final java.lang.Number blockSizeBytes;
        private final java.lang.String compression;
        private final java.lang.Boolean enableDictionaryCompression;
        private final java.lang.Number maxPaddingBytes;
        private final java.lang.Number pageSizeBytes;
        private final java.lang.String writerVersion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.blockSizeBytes = software.amazon.jsii.Kernel.get(this, "blockSizeBytes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.compression = software.amazon.jsii.Kernel.get(this, "compression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableDictionaryCompression = software.amazon.jsii.Kernel.get(this, "enableDictionaryCompression", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.maxPaddingBytes = software.amazon.jsii.Kernel.get(this, "maxPaddingBytes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.pageSizeBytes = software.amazon.jsii.Kernel.get(this, "pageSizeBytes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.writerVersion = software.amazon.jsii.Kernel.get(this, "writerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number blockSizeBytes, final java.lang.String compression, final java.lang.Boolean enableDictionaryCompression, final java.lang.Number maxPaddingBytes, final java.lang.Number pageSizeBytes, final java.lang.String writerVersion) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blockSizeBytes = blockSizeBytes;
            this.compression = compression;
            this.enableDictionaryCompression = enableDictionaryCompression;
            this.maxPaddingBytes = maxPaddingBytes;
            this.pageSizeBytes = pageSizeBytes;
            this.writerVersion = writerVersion;
        }

        @Override
        public final java.lang.Number getBlockSizeBytes() {
            return this.blockSizeBytes;
        }

        @Override
        public final java.lang.String getCompression() {
            return this.compression;
        }

        @Override
        public final java.lang.Boolean getEnableDictionaryCompression() {
            return this.enableDictionaryCompression;
        }

        @Override
        public final java.lang.Number getMaxPaddingBytes() {
            return this.maxPaddingBytes;
        }

        @Override
        public final java.lang.Number getPageSizeBytes() {
            return this.pageSizeBytes;
        }

        @Override
        public final java.lang.String getWriterVersion() {
            return this.writerVersion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBlockSizeBytes() != null) {
                data.set("blockSizeBytes", om.valueToTree(this.getBlockSizeBytes()));
            }
            if (this.getCompression() != null) {
                data.set("compression", om.valueToTree(this.getCompression()));
            }
            if (this.getEnableDictionaryCompression() != null) {
                data.set("enableDictionaryCompression", om.valueToTree(this.getEnableDictionaryCompression()));
            }
            if (this.getMaxPaddingBytes() != null) {
                data.set("maxPaddingBytes", om.valueToTree(this.getMaxPaddingBytes()));
            }
            if (this.getPageSizeBytes() != null) {
                data.set("pageSizeBytes", om.valueToTree(this.getPageSizeBytes()));
            }
            if (this.getWriterVersion() != null) {
                data.set("writerVersion", om.valueToTree(this.getWriterVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe.Jsii$Proxy) o;

            if (this.blockSizeBytes != null ? !this.blockSizeBytes.equals(that.blockSizeBytes) : that.blockSizeBytes != null) return false;
            if (this.compression != null ? !this.compression.equals(that.compression) : that.compression != null) return false;
            if (this.enableDictionaryCompression != null ? !this.enableDictionaryCompression.equals(that.enableDictionaryCompression) : that.enableDictionaryCompression != null) return false;
            if (this.maxPaddingBytes != null ? !this.maxPaddingBytes.equals(that.maxPaddingBytes) : that.maxPaddingBytes != null) return false;
            if (this.pageSizeBytes != null ? !this.pageSizeBytes.equals(that.pageSizeBytes) : that.pageSizeBytes != null) return false;
            return this.writerVersion != null ? this.writerVersion.equals(that.writerVersion) : that.writerVersion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blockSizeBytes != null ? this.blockSizeBytes.hashCode() : 0;
            result = 31 * result + (this.compression != null ? this.compression.hashCode() : 0);
            result = 31 * result + (this.enableDictionaryCompression != null ? this.enableDictionaryCompression.hashCode() : 0);
            result = 31 * result + (this.maxPaddingBytes != null ? this.maxPaddingBytes.hashCode() : 0);
            result = 31 * result + (this.pageSizeBytes != null ? this.pageSizeBytes.hashCode() : 0);
            result = 31 * result + (this.writerVersion != null ? this.writerVersion.hashCode() : 0);
            return result;
        }
    }
}
