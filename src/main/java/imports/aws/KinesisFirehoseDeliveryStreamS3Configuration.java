package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.665Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamS3Configuration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamS3Configuration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamS3Configuration extends software.amazon.jsii.JsiiSerializable {

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
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCompressionFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamS3Configuration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamS3Configuration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamS3Configuration> {
        private java.lang.String bucketArn;
        private java.lang.String roleArn;
        private java.lang.Number bufferInterval;
        private java.lang.Number bufferSize;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private java.lang.String compressionFormat;
        private java.lang.String kmsKeyArn;
        private java.lang.String prefix;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getBucketArn}
         * @param bucketArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketArn(java.lang.String bucketArn) {
            this.bucketArn = bucketArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getBufferInterval}
         * @param bufferInterval the value to be set.
         * @return {@code this}
         */
        public Builder bufferInterval(java.lang.Number bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getBufferSize}
         * @param bufferSize the value to be set.
         * @return {@code this}
         */
        public Builder bufferSize(java.lang.Number bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getCloudwatchLoggingOptions}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLoggingOptions(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getCompressionFormat}
         * @param compressionFormat the value to be set.
         * @return {@code this}
         */
        public Builder compressionFormat(java.lang.String compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamS3Configuration#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamS3Configuration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamS3Configuration build() {
            return new Jsii$Proxy(bucketArn, roleArn, bufferInterval, bufferSize, cloudwatchLoggingOptions, compressionFormat, kmsKeyArn, prefix);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamS3Configuration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamS3Configuration {
        private final java.lang.String bucketArn;
        private final java.lang.String roleArn;
        private final java.lang.Number bufferInterval;
        private final java.lang.Number bufferSize;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private final java.lang.String compressionFormat;
        private final java.lang.String kmsKeyArn;
        private final java.lang.String prefix;

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
            this.cloudwatchLoggingOptions = software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions.class)));
            this.compressionFormat = software.amazon.jsii.Kernel.get(this, "compressionFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bucketArn, final java.lang.String roleArn, final java.lang.Number bufferInterval, final java.lang.Number bufferSize, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions, final java.lang.String compressionFormat, final java.lang.String kmsKeyArn, final java.lang.String prefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketArn = java.util.Objects.requireNonNull(bucketArn, "bucketArn is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.bufferInterval = bufferInterval;
            this.bufferSize = bufferSize;
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            this.compressionFormat = compressionFormat;
            this.kmsKeyArn = kmsKeyArn;
            this.prefix = prefix;
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
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
            return this.cloudwatchLoggingOptions;
        }

        @Override
        public final java.lang.String getCompressionFormat() {
            return this.compressionFormat;
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
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamS3Configuration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamS3Configuration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamS3Configuration.Jsii$Proxy) o;

            if (!bucketArn.equals(that.bucketArn)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (this.bufferInterval != null ? !this.bufferInterval.equals(that.bufferInterval) : that.bufferInterval != null) return false;
            if (this.bufferSize != null ? !this.bufferSize.equals(that.bufferSize) : that.bufferSize != null) return false;
            if (this.cloudwatchLoggingOptions != null ? !this.cloudwatchLoggingOptions.equals(that.cloudwatchLoggingOptions) : that.cloudwatchLoggingOptions != null) return false;
            if (this.compressionFormat != null ? !this.compressionFormat.equals(that.compressionFormat) : that.compressionFormat != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            return this.prefix != null ? this.prefix.equals(that.prefix) : that.prefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketArn.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.bufferInterval != null ? this.bufferInterval.hashCode() : 0);
            result = 31 * result + (this.bufferSize != null ? this.bufferSize.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLoggingOptions != null ? this.cloudwatchLoggingOptions.hashCode() : 0);
            result = 31 * result + (this.compressionFormat != null ? this.compressionFormat.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            return result;
        }
    }
}
