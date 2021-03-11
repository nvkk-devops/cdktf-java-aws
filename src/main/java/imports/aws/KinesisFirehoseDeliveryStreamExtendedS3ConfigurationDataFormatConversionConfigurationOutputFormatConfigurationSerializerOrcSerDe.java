package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.657Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getBlockSizeBytes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBloomFilterColumns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBloomFilterFalsePositiveProbability() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCompression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDictionaryKeyThreshold() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnablePadding() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFormatVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPaddingTolerance() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRowIndexStride() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getStripeSizeBytes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe> {
        private java.lang.Number blockSizeBytes;
        private java.util.List<java.lang.String> bloomFilterColumns;
        private java.lang.Number bloomFilterFalsePositiveProbability;
        private java.lang.String compression;
        private java.lang.Number dictionaryKeyThreshold;
        private java.lang.Boolean enablePadding;
        private java.lang.String formatVersion;
        private java.lang.Number paddingTolerance;
        private java.lang.Number rowIndexStride;
        private java.lang.Number stripeSizeBytes;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getBlockSizeBytes}
         * @param blockSizeBytes the value to be set.
         * @return {@code this}
         */
        public Builder blockSizeBytes(java.lang.Number blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getBloomFilterColumns}
         * @param bloomFilterColumns the value to be set.
         * @return {@code this}
         */
        public Builder bloomFilterColumns(java.util.List<java.lang.String> bloomFilterColumns) {
            this.bloomFilterColumns = bloomFilterColumns;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getBloomFilterFalsePositiveProbability}
         * @param bloomFilterFalsePositiveProbability the value to be set.
         * @return {@code this}
         */
        public Builder bloomFilterFalsePositiveProbability(java.lang.Number bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getCompression}
         * @param compression the value to be set.
         * @return {@code this}
         */
        public Builder compression(java.lang.String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getDictionaryKeyThreshold}
         * @param dictionaryKeyThreshold the value to be set.
         * @return {@code this}
         */
        public Builder dictionaryKeyThreshold(java.lang.Number dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getEnablePadding}
         * @param enablePadding the value to be set.
         * @return {@code this}
         */
        public Builder enablePadding(java.lang.Boolean enablePadding) {
            this.enablePadding = enablePadding;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getFormatVersion}
         * @param formatVersion the value to be set.
         * @return {@code this}
         */
        public Builder formatVersion(java.lang.String formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getPaddingTolerance}
         * @param paddingTolerance the value to be set.
         * @return {@code this}
         */
        public Builder paddingTolerance(java.lang.Number paddingTolerance) {
            this.paddingTolerance = paddingTolerance;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getRowIndexStride}
         * @param rowIndexStride the value to be set.
         * @return {@code this}
         */
        public Builder rowIndexStride(java.lang.Number rowIndexStride) {
            this.rowIndexStride = rowIndexStride;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe#getStripeSizeBytes}
         * @param stripeSizeBytes the value to be set.
         * @return {@code this}
         */
        public Builder stripeSizeBytes(java.lang.Number stripeSizeBytes) {
            this.stripeSizeBytes = stripeSizeBytes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe build() {
            return new Jsii$Proxy(blockSizeBytes, bloomFilterColumns, bloomFilterFalsePositiveProbability, compression, dictionaryKeyThreshold, enablePadding, formatVersion, paddingTolerance, rowIndexStride, stripeSizeBytes);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe {
        private final java.lang.Number blockSizeBytes;
        private final java.util.List<java.lang.String> bloomFilterColumns;
        private final java.lang.Number bloomFilterFalsePositiveProbability;
        private final java.lang.String compression;
        private final java.lang.Number dictionaryKeyThreshold;
        private final java.lang.Boolean enablePadding;
        private final java.lang.String formatVersion;
        private final java.lang.Number paddingTolerance;
        private final java.lang.Number rowIndexStride;
        private final java.lang.Number stripeSizeBytes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.blockSizeBytes = software.amazon.jsii.Kernel.get(this, "blockSizeBytes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.bloomFilterColumns = software.amazon.jsii.Kernel.get(this, "bloomFilterColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.bloomFilterFalsePositiveProbability = software.amazon.jsii.Kernel.get(this, "bloomFilterFalsePositiveProbability", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.compression = software.amazon.jsii.Kernel.get(this, "compression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dictionaryKeyThreshold = software.amazon.jsii.Kernel.get(this, "dictionaryKeyThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.enablePadding = software.amazon.jsii.Kernel.get(this, "enablePadding", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.formatVersion = software.amazon.jsii.Kernel.get(this, "formatVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.paddingTolerance = software.amazon.jsii.Kernel.get(this, "paddingTolerance", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.rowIndexStride = software.amazon.jsii.Kernel.get(this, "rowIndexStride", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.stripeSizeBytes = software.amazon.jsii.Kernel.get(this, "stripeSizeBytes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number blockSizeBytes, final java.util.List<java.lang.String> bloomFilterColumns, final java.lang.Number bloomFilterFalsePositiveProbability, final java.lang.String compression, final java.lang.Number dictionaryKeyThreshold, final java.lang.Boolean enablePadding, final java.lang.String formatVersion, final java.lang.Number paddingTolerance, final java.lang.Number rowIndexStride, final java.lang.Number stripeSizeBytes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blockSizeBytes = blockSizeBytes;
            this.bloomFilterColumns = bloomFilterColumns;
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            this.compression = compression;
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            this.enablePadding = enablePadding;
            this.formatVersion = formatVersion;
            this.paddingTolerance = paddingTolerance;
            this.rowIndexStride = rowIndexStride;
            this.stripeSizeBytes = stripeSizeBytes;
        }

        @Override
        public final java.lang.Number getBlockSizeBytes() {
            return this.blockSizeBytes;
        }

        @Override
        public final java.util.List<java.lang.String> getBloomFilterColumns() {
            return this.bloomFilterColumns;
        }

        @Override
        public final java.lang.Number getBloomFilterFalsePositiveProbability() {
            return this.bloomFilterFalsePositiveProbability;
        }

        @Override
        public final java.lang.String getCompression() {
            return this.compression;
        }

        @Override
        public final java.lang.Number getDictionaryKeyThreshold() {
            return this.dictionaryKeyThreshold;
        }

        @Override
        public final java.lang.Boolean getEnablePadding() {
            return this.enablePadding;
        }

        @Override
        public final java.lang.String getFormatVersion() {
            return this.formatVersion;
        }

        @Override
        public final java.lang.Number getPaddingTolerance() {
            return this.paddingTolerance;
        }

        @Override
        public final java.lang.Number getRowIndexStride() {
            return this.rowIndexStride;
        }

        @Override
        public final java.lang.Number getStripeSizeBytes() {
            return this.stripeSizeBytes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBlockSizeBytes() != null) {
                data.set("blockSizeBytes", om.valueToTree(this.getBlockSizeBytes()));
            }
            if (this.getBloomFilterColumns() != null) {
                data.set("bloomFilterColumns", om.valueToTree(this.getBloomFilterColumns()));
            }
            if (this.getBloomFilterFalsePositiveProbability() != null) {
                data.set("bloomFilterFalsePositiveProbability", om.valueToTree(this.getBloomFilterFalsePositiveProbability()));
            }
            if (this.getCompression() != null) {
                data.set("compression", om.valueToTree(this.getCompression()));
            }
            if (this.getDictionaryKeyThreshold() != null) {
                data.set("dictionaryKeyThreshold", om.valueToTree(this.getDictionaryKeyThreshold()));
            }
            if (this.getEnablePadding() != null) {
                data.set("enablePadding", om.valueToTree(this.getEnablePadding()));
            }
            if (this.getFormatVersion() != null) {
                data.set("formatVersion", om.valueToTree(this.getFormatVersion()));
            }
            if (this.getPaddingTolerance() != null) {
                data.set("paddingTolerance", om.valueToTree(this.getPaddingTolerance()));
            }
            if (this.getRowIndexStride() != null) {
                data.set("rowIndexStride", om.valueToTree(this.getRowIndexStride()));
            }
            if (this.getStripeSizeBytes() != null) {
                data.set("stripeSizeBytes", om.valueToTree(this.getStripeSizeBytes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe.Jsii$Proxy) o;

            if (this.blockSizeBytes != null ? !this.blockSizeBytes.equals(that.blockSizeBytes) : that.blockSizeBytes != null) return false;
            if (this.bloomFilterColumns != null ? !this.bloomFilterColumns.equals(that.bloomFilterColumns) : that.bloomFilterColumns != null) return false;
            if (this.bloomFilterFalsePositiveProbability != null ? !this.bloomFilterFalsePositiveProbability.equals(that.bloomFilterFalsePositiveProbability) : that.bloomFilterFalsePositiveProbability != null) return false;
            if (this.compression != null ? !this.compression.equals(that.compression) : that.compression != null) return false;
            if (this.dictionaryKeyThreshold != null ? !this.dictionaryKeyThreshold.equals(that.dictionaryKeyThreshold) : that.dictionaryKeyThreshold != null) return false;
            if (this.enablePadding != null ? !this.enablePadding.equals(that.enablePadding) : that.enablePadding != null) return false;
            if (this.formatVersion != null ? !this.formatVersion.equals(that.formatVersion) : that.formatVersion != null) return false;
            if (this.paddingTolerance != null ? !this.paddingTolerance.equals(that.paddingTolerance) : that.paddingTolerance != null) return false;
            if (this.rowIndexStride != null ? !this.rowIndexStride.equals(that.rowIndexStride) : that.rowIndexStride != null) return false;
            return this.stripeSizeBytes != null ? this.stripeSizeBytes.equals(that.stripeSizeBytes) : that.stripeSizeBytes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blockSizeBytes != null ? this.blockSizeBytes.hashCode() : 0;
            result = 31 * result + (this.bloomFilterColumns != null ? this.bloomFilterColumns.hashCode() : 0);
            result = 31 * result + (this.bloomFilterFalsePositiveProbability != null ? this.bloomFilterFalsePositiveProbability.hashCode() : 0);
            result = 31 * result + (this.compression != null ? this.compression.hashCode() : 0);
            result = 31 * result + (this.dictionaryKeyThreshold != null ? this.dictionaryKeyThreshold.hashCode() : 0);
            result = 31 * result + (this.enablePadding != null ? this.enablePadding.hashCode() : 0);
            result = 31 * result + (this.formatVersion != null ? this.formatVersion.hashCode() : 0);
            result = 31 * result + (this.paddingTolerance != null ? this.paddingTolerance.hashCode() : 0);
            result = 31 * result + (this.rowIndexStride != null ? this.rowIndexStride.hashCode() : 0);
            result = 31 * result + (this.stripeSizeBytes != null ? this.stripeSizeBytes.hashCode() : 0);
            return result;
        }
    }
}
