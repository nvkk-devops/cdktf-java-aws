package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.665Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamSplunkConfiguration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamSplunkConfiguration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamSplunkConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getHecEndpoint();

    @org.jetbrains.annotations.NotNull java.lang.String getHecToken();

    /**
     * cloudwatch_logging_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHecAcknowledgmentTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHecEndpointType() {
        return null;
    }

    /**
     * processing_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRetryDuration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3BackupMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamSplunkConfiguration> {
        private java.lang.String hecEndpoint;
        private java.lang.String hecToken;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private java.lang.Number hecAcknowledgmentTimeout;
        private java.lang.String hecEndpointType;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration> processingConfiguration;
        private java.lang.Number retryDuration;
        private java.lang.String s3BackupMode;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecEndpoint}
         * @param hecEndpoint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hecEndpoint(java.lang.String hecEndpoint) {
            this.hecEndpoint = hecEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecToken}
         * @param hecToken the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hecToken(java.lang.String hecToken) {
            this.hecToken = hecToken;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getCloudwatchLoggingOptions}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLoggingOptions(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecAcknowledgmentTimeout}
         * @param hecAcknowledgmentTimeout the value to be set.
         * @return {@code this}
         */
        public Builder hecAcknowledgmentTimeout(java.lang.Number hecAcknowledgmentTimeout) {
            this.hecAcknowledgmentTimeout = hecAcknowledgmentTimeout;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecEndpointType}
         * @param hecEndpointType the value to be set.
         * @return {@code this}
         */
        public Builder hecEndpointType(java.lang.String hecEndpointType) {
            this.hecEndpointType = hecEndpointType;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getProcessingConfiguration}
         * @param processingConfiguration processing_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder processingConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration> processingConfiguration) {
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration>)processingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getRetryDuration}
         * @param retryDuration the value to be set.
         * @return {@code this}
         */
        public Builder retryDuration(java.lang.Number retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getS3BackupMode}
         * @param s3BackupMode the value to be set.
         * @return {@code this}
         */
        public Builder s3BackupMode(java.lang.String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamSplunkConfiguration build() {
            return new Jsii$Proxy(hecEndpoint, hecToken, cloudwatchLoggingOptions, hecAcknowledgmentTimeout, hecEndpointType, processingConfiguration, retryDuration, s3BackupMode);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamSplunkConfiguration {
        private final java.lang.String hecEndpoint;
        private final java.lang.String hecToken;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private final java.lang.Number hecAcknowledgmentTimeout;
        private final java.lang.String hecEndpointType;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration> processingConfiguration;
        private final java.lang.Number retryDuration;
        private final java.lang.String s3BackupMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hecEndpoint = software.amazon.jsii.Kernel.get(this, "hecEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hecToken = software.amazon.jsii.Kernel.get(this, "hecToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLoggingOptions = software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions.class)));
            this.hecAcknowledgmentTimeout = software.amazon.jsii.Kernel.get(this, "hecAcknowledgmentTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.hecEndpointType = software.amazon.jsii.Kernel.get(this, "hecEndpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.processingConfiguration = software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration.class)));
            this.retryDuration = software.amazon.jsii.Kernel.get(this, "retryDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.s3BackupMode = software.amazon.jsii.Kernel.get(this, "s3BackupMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String hecEndpoint, final java.lang.String hecToken, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions, final java.lang.Number hecAcknowledgmentTimeout, final java.lang.String hecEndpointType, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration> processingConfiguration, final java.lang.Number retryDuration, final java.lang.String s3BackupMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hecEndpoint = java.util.Objects.requireNonNull(hecEndpoint, "hecEndpoint is required");
            this.hecToken = java.util.Objects.requireNonNull(hecToken, "hecToken is required");
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            this.hecAcknowledgmentTimeout = hecAcknowledgmentTimeout;
            this.hecEndpointType = hecEndpointType;
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration>)processingConfiguration;
            this.retryDuration = retryDuration;
            this.s3BackupMode = s3BackupMode;
        }

        @Override
        public final java.lang.String getHecEndpoint() {
            return this.hecEndpoint;
        }

        @Override
        public final java.lang.String getHecToken() {
            return this.hecToken;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
            return this.cloudwatchLoggingOptions;
        }

        @Override
        public final java.lang.Number getHecAcknowledgmentTimeout() {
            return this.hecAcknowledgmentTimeout;
        }

        @Override
        public final java.lang.String getHecEndpointType() {
            return this.hecEndpointType;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration> getProcessingConfiguration() {
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("hecEndpoint", om.valueToTree(this.getHecEndpoint()));
            data.set("hecToken", om.valueToTree(this.getHecToken()));
            if (this.getCloudwatchLoggingOptions() != null) {
                data.set("cloudwatchLoggingOptions", om.valueToTree(this.getCloudwatchLoggingOptions()));
            }
            if (this.getHecAcknowledgmentTimeout() != null) {
                data.set("hecAcknowledgmentTimeout", om.valueToTree(this.getHecAcknowledgmentTimeout()));
            }
            if (this.getHecEndpointType() != null) {
                data.set("hecEndpointType", om.valueToTree(this.getHecEndpointType()));
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

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamSplunkConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamSplunkConfiguration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamSplunkConfiguration.Jsii$Proxy) o;

            if (!hecEndpoint.equals(that.hecEndpoint)) return false;
            if (!hecToken.equals(that.hecToken)) return false;
            if (this.cloudwatchLoggingOptions != null ? !this.cloudwatchLoggingOptions.equals(that.cloudwatchLoggingOptions) : that.cloudwatchLoggingOptions != null) return false;
            if (this.hecAcknowledgmentTimeout != null ? !this.hecAcknowledgmentTimeout.equals(that.hecAcknowledgmentTimeout) : that.hecAcknowledgmentTimeout != null) return false;
            if (this.hecEndpointType != null ? !this.hecEndpointType.equals(that.hecEndpointType) : that.hecEndpointType != null) return false;
            if (this.processingConfiguration != null ? !this.processingConfiguration.equals(that.processingConfiguration) : that.processingConfiguration != null) return false;
            if (this.retryDuration != null ? !this.retryDuration.equals(that.retryDuration) : that.retryDuration != null) return false;
            return this.s3BackupMode != null ? this.s3BackupMode.equals(that.s3BackupMode) : that.s3BackupMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hecEndpoint.hashCode();
            result = 31 * result + (this.hecToken.hashCode());
            result = 31 * result + (this.cloudwatchLoggingOptions != null ? this.cloudwatchLoggingOptions.hashCode() : 0);
            result = 31 * result + (this.hecAcknowledgmentTimeout != null ? this.hecAcknowledgmentTimeout.hashCode() : 0);
            result = 31 * result + (this.hecEndpointType != null ? this.hecEndpointType.hashCode() : 0);
            result = 31 * result + (this.processingConfiguration != null ? this.processingConfiguration.hashCode() : 0);
            result = 31 * result + (this.retryDuration != null ? this.retryDuration.hashCode() : 0);
            result = 31 * result + (this.s3BackupMode != null ? this.s3BackupMode.hashCode() : 0);
            return result;
        }
    }
}
