package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.655Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamExtendedS3Configuration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamExtendedS3Configuration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBucketArn();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.Number getBufferInterval() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBufferSize() {
        return null;
    }

    /**
     * cloudwatch_logging_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCompressionFormat() {
        return null;
    }

    /**
     * data_format_conversion_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> getDataFormatConversionConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getErrorOutputPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * processing_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return null;
    }

    /**
     * s3_backup_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> getS3BackupConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3BackupMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamExtendedS3Configuration> {
        private java.lang.String bucketArn;
        private java.lang.String roleArn;
        private java.lang.Number bufferInterval;
        private java.lang.Number bufferSize;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private java.lang.String compressionFormat;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> dataFormatConversionConfiguration;
        private java.lang.String errorOutputPrefix;
        private java.lang.String kmsKeyArn;
        private java.lang.String prefix;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> processingConfiguration;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> s3BackupConfiguration;
        private java.lang.String s3BackupMode;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getBucketArn}
         * @param bucketArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketArn(java.lang.String bucketArn) {
            this.bucketArn = bucketArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getBufferInterval}
         * @param bufferInterval the value to be set.
         * @return {@code this}
         */
        public Builder bufferInterval(java.lang.Number bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getBufferSize}
         * @param bufferSize the value to be set.
         * @return {@code this}
         */
        public Builder bufferSize(java.lang.Number bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getCloudwatchLoggingOptions}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLoggingOptions(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getCompressionFormat}
         * @param compressionFormat the value to be set.
         * @return {@code this}
         */
        public Builder compressionFormat(java.lang.String compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getDataFormatConversionConfiguration}
         * @param dataFormatConversionConfiguration data_format_conversion_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dataFormatConversionConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> dataFormatConversionConfiguration) {
            this.dataFormatConversionConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration>)dataFormatConversionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getErrorOutputPrefix}
         * @param errorOutputPrefix the value to be set.
         * @return {@code this}
         */
        public Builder errorOutputPrefix(java.lang.String errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getProcessingConfiguration}
         * @param processingConfiguration processing_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder processingConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> processingConfiguration) {
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration>)processingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getS3BackupConfiguration}
         * @param s3BackupConfiguration s3_backup_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3BackupConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> s3BackupConfiguration) {
            this.s3BackupConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration>)s3BackupConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration#getS3BackupMode}
         * @param s3BackupMode the value to be set.
         * @return {@code this}
         */
        public Builder s3BackupMode(java.lang.String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamExtendedS3Configuration build() {
            return new Jsii$Proxy(bucketArn, roleArn, bufferInterval, bufferSize, cloudwatchLoggingOptions, compressionFormat, dataFormatConversionConfiguration, errorOutputPrefix, kmsKeyArn, prefix, processingConfiguration, s3BackupConfiguration, s3BackupMode);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamExtendedS3Configuration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamExtendedS3Configuration {
        private final java.lang.String bucketArn;
        private final java.lang.String roleArn;
        private final java.lang.Number bufferInterval;
        private final java.lang.Number bufferSize;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private final java.lang.String compressionFormat;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> dataFormatConversionConfiguration;
        private final java.lang.String errorOutputPrefix;
        private final java.lang.String kmsKeyArn;
        private final java.lang.String prefix;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> processingConfiguration;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> s3BackupConfiguration;
        private final java.lang.String s3BackupMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketArn = software.amazon.jsii.Kernel.get(this, "bucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bufferInterval = software.amazon.jsii.Kernel.get(this, "bufferInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.bufferSize = software.amazon.jsii.Kernel.get(this, "bufferSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cloudwatchLoggingOptions = software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions.class)));
            this.compressionFormat = software.amazon.jsii.Kernel.get(this, "compressionFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataFormatConversionConfiguration = software.amazon.jsii.Kernel.get(this, "dataFormatConversionConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration.class)));
            this.errorOutputPrefix = software.amazon.jsii.Kernel.get(this, "errorOutputPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.processingConfiguration = software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration.class)));
            this.s3BackupConfiguration = software.amazon.jsii.Kernel.get(this, "s3BackupConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration.class)));
            this.s3BackupMode = software.amazon.jsii.Kernel.get(this, "s3BackupMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bucketArn, final java.lang.String roleArn, final java.lang.Number bufferInterval, final java.lang.Number bufferSize, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions, final java.lang.String compressionFormat, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> dataFormatConversionConfiguration, final java.lang.String errorOutputPrefix, final java.lang.String kmsKeyArn, final java.lang.String prefix, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> processingConfiguration, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> s3BackupConfiguration, final java.lang.String s3BackupMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketArn = java.util.Objects.requireNonNull(bucketArn, "bucketArn is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.bufferInterval = bufferInterval;
            this.bufferSize = bufferSize;
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            this.compressionFormat = compressionFormat;
            this.dataFormatConversionConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration>)dataFormatConversionConfiguration;
            this.errorOutputPrefix = errorOutputPrefix;
            this.kmsKeyArn = kmsKeyArn;
            this.prefix = prefix;
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration>)processingConfiguration;
            this.s3BackupConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration>)s3BackupConfiguration;
            this.s3BackupMode = s3BackupMode;
        }

        @Override
        public final java.lang.String getBucketArn() {
            return this.bucketArn;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.Number getBufferInterval() {
            return this.bufferInterval;
        }

        @Override
        public final java.lang.Number getBufferSize() {
            return this.bufferSize;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
            return this.cloudwatchLoggingOptions;
        }

        @Override
        public final java.lang.String getCompressionFormat() {
            return this.compressionFormat;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> getDataFormatConversionConfiguration() {
            return this.dataFormatConversionConfiguration;
        }

        @Override
        public final java.lang.String getErrorOutputPrefix() {
            return this.errorOutputPrefix;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> getProcessingConfiguration() {
            return this.processingConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> getS3BackupConfiguration() {
            return this.s3BackupConfiguration;
        }

        @Override
        public final java.lang.String getS3BackupMode() {
            return this.s3BackupMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucketArn", om.valueToTree(this.getBucketArn()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getBufferInterval() != null) {
                data.set("bufferInterval", om.valueToTree(this.getBufferInterval()));
            }
            if (this.getBufferSize() != null) {
                data.set("bufferSize", om.valueToTree(this.getBufferSize()));
            }
            if (this.getCloudwatchLoggingOptions() != null) {
                data.set("cloudwatchLoggingOptions", om.valueToTree(this.getCloudwatchLoggingOptions()));
            }
            if (this.getCompressionFormat() != null) {
                data.set("compressionFormat", om.valueToTree(this.getCompressionFormat()));
            }
            if (this.getDataFormatConversionConfiguration() != null) {
                data.set("dataFormatConversionConfiguration", om.valueToTree(this.getDataFormatConversionConfiguration()));
            }
            if (this.getErrorOutputPrefix() != null) {
                data.set("errorOutputPrefix", om.valueToTree(this.getErrorOutputPrefix()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getProcessingConfiguration() != null) {
                data.set("processingConfiguration", om.valueToTree(this.getProcessingConfiguration()));
            }
            if (this.getS3BackupConfiguration() != null) {
                data.set("s3BackupConfiguration", om.valueToTree(this.getS3BackupConfiguration()));
            }
            if (this.getS3BackupMode() != null) {
                data.set("s3BackupMode", om.valueToTree(this.getS3BackupMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamExtendedS3Configuration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamExtendedS3Configuration.Jsii$Proxy) o;

            if (!bucketArn.equals(that.bucketArn)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (this.bufferInterval != null ? !this.bufferInterval.equals(that.bufferInterval) : that.bufferInterval != null) return false;
            if (this.bufferSize != null ? !this.bufferSize.equals(that.bufferSize) : that.bufferSize != null) return false;
            if (this.cloudwatchLoggingOptions != null ? !this.cloudwatchLoggingOptions.equals(that.cloudwatchLoggingOptions) : that.cloudwatchLoggingOptions != null) return false;
            if (this.compressionFormat != null ? !this.compressionFormat.equals(that.compressionFormat) : that.compressionFormat != null) return false;
            if (this.dataFormatConversionConfiguration != null ? !this.dataFormatConversionConfiguration.equals(that.dataFormatConversionConfiguration) : that.dataFormatConversionConfiguration != null) return false;
            if (this.errorOutputPrefix != null ? !this.errorOutputPrefix.equals(that.errorOutputPrefix) : that.errorOutputPrefix != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            if (this.processingConfiguration != null ? !this.processingConfiguration.equals(that.processingConfiguration) : that.processingConfiguration != null) return false;
            if (this.s3BackupConfiguration != null ? !this.s3BackupConfiguration.equals(that.s3BackupConfiguration) : that.s3BackupConfiguration != null) return false;
            return this.s3BackupMode != null ? this.s3BackupMode.equals(that.s3BackupMode) : that.s3BackupMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketArn.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.bufferInterval != null ? this.bufferInterval.hashCode() : 0);
            result = 31 * result + (this.bufferSize != null ? this.bufferSize.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLoggingOptions != null ? this.cloudwatchLoggingOptions.hashCode() : 0);
            result = 31 * result + (this.compressionFormat != null ? this.compressionFormat.hashCode() : 0);
            result = 31 * result + (this.dataFormatConversionConfiguration != null ? this.dataFormatConversionConfiguration.hashCode() : 0);
            result = 31 * result + (this.errorOutputPrefix != null ? this.errorOutputPrefix.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.processingConfiguration != null ? this.processingConfiguration.hashCode() : 0);
            result = 31 * result + (this.s3BackupConfiguration != null ? this.s3BackupConfiguration.hashCode() : 0);
            result = 31 * result + (this.s3BackupMode != null ? this.s3BackupMode.hashCode() : 0);
            return result;
        }
    }
}
