package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.654Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamElasticsearchConfiguration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamElasticsearchConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDomainArn();

    @org.jetbrains.annotations.NotNull java.lang.String getIndexName();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.Number getBufferingInterval() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBufferingSize() {
        return null;
    }

    /**
     * cloudwatch_logging_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIndexRotationPeriod() {
        return null;
    }

    /**
     * processing_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRetryDuration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3BackupMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTypeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamElasticsearchConfiguration> {
        private java.lang.String domainArn;
        private java.lang.String indexName;
        private java.lang.String roleArn;
        private java.lang.Number bufferingInterval;
        private java.lang.Number bufferingSize;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private java.lang.String indexRotationPeriod;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> processingConfiguration;
        private java.lang.Number retryDuration;
        private java.lang.String s3BackupMode;
        private java.lang.String typeName;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getDomainArn}
         * @param domainArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder domainArn(java.lang.String domainArn) {
            this.domainArn = domainArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getIndexName}
         * @param indexName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder indexName(java.lang.String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getBufferingInterval}
         * @param bufferingInterval the value to be set.
         * @return {@code this}
         */
        public Builder bufferingInterval(java.lang.Number bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getBufferingSize}
         * @param bufferingSize the value to be set.
         * @return {@code this}
         */
        public Builder bufferingSize(java.lang.Number bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getCloudwatchLoggingOptions}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLoggingOptions(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getIndexRotationPeriod}
         * @param indexRotationPeriod the value to be set.
         * @return {@code this}
         */
        public Builder indexRotationPeriod(java.lang.String indexRotationPeriod) {
            this.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getProcessingConfiguration}
         * @param processingConfiguration processing_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder processingConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> processingConfiguration) {
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration>)processingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getRetryDuration}
         * @param retryDuration the value to be set.
         * @return {@code this}
         */
        public Builder retryDuration(java.lang.Number retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getS3BackupMode}
         * @param s3BackupMode the value to be set.
         * @return {@code this}
         */
        public Builder s3BackupMode(java.lang.String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration#getTypeName}
         * @param typeName the value to be set.
         * @return {@code this}
         */
        public Builder typeName(java.lang.String typeName) {
            this.typeName = typeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamElasticsearchConfiguration build() {
            return new Jsii$Proxy(domainArn, indexName, roleArn, bufferingInterval, bufferingSize, cloudwatchLoggingOptions, indexRotationPeriod, processingConfiguration, retryDuration, s3BackupMode, typeName);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamElasticsearchConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamElasticsearchConfiguration {
        private final java.lang.String domainArn;
        private final java.lang.String indexName;
        private final java.lang.String roleArn;
        private final java.lang.Number bufferingInterval;
        private final java.lang.Number bufferingSize;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private final java.lang.String indexRotationPeriod;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> processingConfiguration;
        private final java.lang.Number retryDuration;
        private final java.lang.String s3BackupMode;
        private final java.lang.String typeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.domainArn = software.amazon.jsii.Kernel.get(this, "domainArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.indexName = software.amazon.jsii.Kernel.get(this, "indexName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bufferingInterval = software.amazon.jsii.Kernel.get(this, "bufferingInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.bufferingSize = software.amazon.jsii.Kernel.get(this, "bufferingSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cloudwatchLoggingOptions = software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions.class)));
            this.indexRotationPeriod = software.amazon.jsii.Kernel.get(this, "indexRotationPeriod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.processingConfiguration = software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration.class)));
            this.retryDuration = software.amazon.jsii.Kernel.get(this, "retryDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.s3BackupMode = software.amazon.jsii.Kernel.get(this, "s3BackupMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.typeName = software.amazon.jsii.Kernel.get(this, "typeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String domainArn, final java.lang.String indexName, final java.lang.String roleArn, final java.lang.Number bufferingInterval, final java.lang.Number bufferingSize, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions, final java.lang.String indexRotationPeriod, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> processingConfiguration, final java.lang.Number retryDuration, final java.lang.String s3BackupMode, final java.lang.String typeName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.domainArn = java.util.Objects.requireNonNull(domainArn, "domainArn is required");
            this.indexName = java.util.Objects.requireNonNull(indexName, "indexName is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.bufferingInterval = bufferingInterval;
            this.bufferingSize = bufferingSize;
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            this.indexRotationPeriod = indexRotationPeriod;
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration>)processingConfiguration;
            this.retryDuration = retryDuration;
            this.s3BackupMode = s3BackupMode;
            this.typeName = typeName;
        }

        @Override
        public final java.lang.String getDomainArn() {
            return this.domainArn;
        }

        @Override
        public final java.lang.String getIndexName() {
            return this.indexName;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.Number getBufferingInterval() {
            return this.bufferingInterval;
        }

        @Override
        public final java.lang.Number getBufferingSize() {
            return this.bufferingSize;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
            return this.cloudwatchLoggingOptions;
        }

        @Override
        public final java.lang.String getIndexRotationPeriod() {
            return this.indexRotationPeriod;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> getProcessingConfiguration() {
            return this.processingConfiguration;
        }

        @Override
        public final java.lang.Number getRetryDuration() {
            return this.retryDuration;
        }

        @Override
        public final java.lang.String getS3BackupMode() {
            return this.s3BackupMode;
        }

        @Override
        public final java.lang.String getTypeName() {
            return this.typeName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("domainArn", om.valueToTree(this.getDomainArn()));
            data.set("indexName", om.valueToTree(this.getIndexName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getBufferingInterval() != null) {
                data.set("bufferingInterval", om.valueToTree(this.getBufferingInterval()));
            }
            if (this.getBufferingSize() != null) {
                data.set("bufferingSize", om.valueToTree(this.getBufferingSize()));
            }
            if (this.getCloudwatchLoggingOptions() != null) {
                data.set("cloudwatchLoggingOptions", om.valueToTree(this.getCloudwatchLoggingOptions()));
            }
            if (this.getIndexRotationPeriod() != null) {
                data.set("indexRotationPeriod", om.valueToTree(this.getIndexRotationPeriod()));
            }
            if (this.getProcessingConfiguration() != null) {
                data.set("processingConfiguration", om.valueToTree(this.getProcessingConfiguration()));
            }
            if (this.getRetryDuration() != null) {
                data.set("retryDuration", om.valueToTree(this.getRetryDuration()));
            }
            if (this.getS3BackupMode() != null) {
                data.set("s3BackupMode", om.valueToTree(this.getS3BackupMode()));
            }
            if (this.getTypeName() != null) {
                data.set("typeName", om.valueToTree(this.getTypeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamElasticsearchConfiguration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamElasticsearchConfiguration.Jsii$Proxy) o;

            if (!domainArn.equals(that.domainArn)) return false;
            if (!indexName.equals(that.indexName)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (this.bufferingInterval != null ? !this.bufferingInterval.equals(that.bufferingInterval) : that.bufferingInterval != null) return false;
            if (this.bufferingSize != null ? !this.bufferingSize.equals(that.bufferingSize) : that.bufferingSize != null) return false;
            if (this.cloudwatchLoggingOptions != null ? !this.cloudwatchLoggingOptions.equals(that.cloudwatchLoggingOptions) : that.cloudwatchLoggingOptions != null) return false;
            if (this.indexRotationPeriod != null ? !this.indexRotationPeriod.equals(that.indexRotationPeriod) : that.indexRotationPeriod != null) return false;
            if (this.processingConfiguration != null ? !this.processingConfiguration.equals(that.processingConfiguration) : that.processingConfiguration != null) return false;
            if (this.retryDuration != null ? !this.retryDuration.equals(that.retryDuration) : that.retryDuration != null) return false;
            if (this.s3BackupMode != null ? !this.s3BackupMode.equals(that.s3BackupMode) : that.s3BackupMode != null) return false;
            return this.typeName != null ? this.typeName.equals(that.typeName) : that.typeName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.domainArn.hashCode();
            result = 31 * result + (this.indexName.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.bufferingInterval != null ? this.bufferingInterval.hashCode() : 0);
            result = 31 * result + (this.bufferingSize != null ? this.bufferingSize.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLoggingOptions != null ? this.cloudwatchLoggingOptions.hashCode() : 0);
            result = 31 * result + (this.indexRotationPeriod != null ? this.indexRotationPeriod.hashCode() : 0);
            result = 31 * result + (this.processingConfiguration != null ? this.processingConfiguration.hashCode() : 0);
            result = 31 * result + (this.retryDuration != null ? this.retryDuration.hashCode() : 0);
            result = 31 * result + (this.s3BackupMode != null ? this.s3BackupMode.hashCode() : 0);
            result = 31 * result + (this.typeName != null ? this.typeName.hashCode() : 0);
            return result;
        }
    }
}
