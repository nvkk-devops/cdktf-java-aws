package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.721Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterLoggingInfoBrokerLogs")
@software.amazon.jsii.Jsii.Proxy(MskClusterLoggingInfoBrokerLogs.Jsii$Proxy.class)
public interface MskClusterLoggingInfoBrokerLogs extends software.amazon.jsii.JsiiSerializable {

    /**
     * cloudwatch_logs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs> getCloudwatchLogs() {
        return null;
    }

    /**
     * firehose block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsFirehose> getFirehose() {
        return null;
    }

    /**
     * s3 block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsS3> getS3() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterLoggingInfoBrokerLogs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterLoggingInfoBrokerLogs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterLoggingInfoBrokerLogs> {
        private java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs> cloudwatchLogs;
        private java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsFirehose> firehose;
        private java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsS3> s3;

        /**
         * Sets the value of {@link MskClusterLoggingInfoBrokerLogs#getCloudwatchLogs}
         * @param cloudwatchLogs cloudwatch_logs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLogs(java.util.List<? extends imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs> cloudwatchLogs) {
            this.cloudwatchLogs = (java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs>)cloudwatchLogs;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterLoggingInfoBrokerLogs#getFirehose}
         * @param firehose firehose block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder firehose(java.util.List<? extends imports.aws.MskClusterLoggingInfoBrokerLogsFirehose> firehose) {
            this.firehose = (java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsFirehose>)firehose;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterLoggingInfoBrokerLogs#getS3}
         * @param s3 s3 block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3(java.util.List<? extends imports.aws.MskClusterLoggingInfoBrokerLogsS3> s3) {
            this.s3 = (java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsS3>)s3;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterLoggingInfoBrokerLogs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterLoggingInfoBrokerLogs build() {
            return new Jsii$Proxy(cloudwatchLogs, firehose, s3);
        }
    }

    /**
     * An implementation for {@link MskClusterLoggingInfoBrokerLogs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterLoggingInfoBrokerLogs {
        private final java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs> cloudwatchLogs;
        private final java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsFirehose> firehose;
        private final java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsS3> s3;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cloudwatchLogs = software.amazon.jsii.Kernel.get(this, "cloudwatchLogs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs.class)));
            this.firehose = software.amazon.jsii.Kernel.get(this, "firehose", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterLoggingInfoBrokerLogsFirehose.class)));
            this.s3 = software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterLoggingInfoBrokerLogsS3.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs> cloudwatchLogs, final java.util.List<? extends imports.aws.MskClusterLoggingInfoBrokerLogsFirehose> firehose, final java.util.List<? extends imports.aws.MskClusterLoggingInfoBrokerLogsS3> s3) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cloudwatchLogs = (java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs>)cloudwatchLogs;
            this.firehose = (java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsFirehose>)firehose;
            this.s3 = (java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsS3>)s3;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsCloudwatchLogs> getCloudwatchLogs() {
            return this.cloudwatchLogs;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsFirehose> getFirehose() {
            return this.firehose;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterLoggingInfoBrokerLogsS3> getS3() {
            return this.s3;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCloudwatchLogs() != null) {
                data.set("cloudwatchLogs", om.valueToTree(this.getCloudwatchLogs()));
            }
            if (this.getFirehose() != null) {
                data.set("firehose", om.valueToTree(this.getFirehose()));
            }
            if (this.getS3() != null) {
                data.set("s3", om.valueToTree(this.getS3()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterLoggingInfoBrokerLogs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterLoggingInfoBrokerLogs.Jsii$Proxy that = (MskClusterLoggingInfoBrokerLogs.Jsii$Proxy) o;

            if (this.cloudwatchLogs != null ? !this.cloudwatchLogs.equals(that.cloudwatchLogs) : that.cloudwatchLogs != null) return false;
            if (this.firehose != null ? !this.firehose.equals(that.firehose) : that.firehose != null) return false;
            return this.s3 != null ? this.s3.equals(that.s3) : that.s3 == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cloudwatchLogs != null ? this.cloudwatchLogs.hashCode() : 0;
            result = 31 * result + (this.firehose != null ? this.firehose.hashCode() : 0);
            result = 31 * result + (this.s3 != null ? this.s3.hashCode() : 0);
            return result;
        }
    }
}
