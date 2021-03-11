package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.167Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectLogsConfig")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectLogsConfig.Jsii$Proxy.class)
public interface CodebuildProjectLogsConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * cloudwatch_logs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectLogsConfigCloudwatchLogs> getCloudwatchLogs() {
        return null;
    }

    /**
     * s3_logs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectLogsConfigS3Logs> getS3Logs() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectLogsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectLogsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectLogsConfig> {
        private java.util.List<imports.aws.CodebuildProjectLogsConfigCloudwatchLogs> cloudwatchLogs;
        private java.util.List<imports.aws.CodebuildProjectLogsConfigS3Logs> s3Logs;

        /**
         * Sets the value of {@link CodebuildProjectLogsConfig#getCloudwatchLogs}
         * @param cloudwatchLogs cloudwatch_logs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLogs(java.util.List<? extends imports.aws.CodebuildProjectLogsConfigCloudwatchLogs> cloudwatchLogs) {
            this.cloudwatchLogs = (java.util.List<imports.aws.CodebuildProjectLogsConfigCloudwatchLogs>)cloudwatchLogs;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectLogsConfig#getS3Logs}
         * @param s3Logs s3_logs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Logs(java.util.List<? extends imports.aws.CodebuildProjectLogsConfigS3Logs> s3Logs) {
            this.s3Logs = (java.util.List<imports.aws.CodebuildProjectLogsConfigS3Logs>)s3Logs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectLogsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectLogsConfig build() {
            return new Jsii$Proxy(cloudwatchLogs, s3Logs);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectLogsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectLogsConfig {
        private final java.util.List<imports.aws.CodebuildProjectLogsConfigCloudwatchLogs> cloudwatchLogs;
        private final java.util.List<imports.aws.CodebuildProjectLogsConfigS3Logs> s3Logs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cloudwatchLogs = software.amazon.jsii.Kernel.get(this, "cloudwatchLogs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectLogsConfigCloudwatchLogs.class)));
            this.s3Logs = software.amazon.jsii.Kernel.get(this, "s3Logs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectLogsConfigS3Logs.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CodebuildProjectLogsConfigCloudwatchLogs> cloudwatchLogs, final java.util.List<? extends imports.aws.CodebuildProjectLogsConfigS3Logs> s3Logs) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cloudwatchLogs = (java.util.List<imports.aws.CodebuildProjectLogsConfigCloudwatchLogs>)cloudwatchLogs;
            this.s3Logs = (java.util.List<imports.aws.CodebuildProjectLogsConfigS3Logs>)s3Logs;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectLogsConfigCloudwatchLogs> getCloudwatchLogs() {
            return this.cloudwatchLogs;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectLogsConfigS3Logs> getS3Logs() {
            return this.s3Logs;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCloudwatchLogs() != null) {
                data.set("cloudwatchLogs", om.valueToTree(this.getCloudwatchLogs()));
            }
            if (this.getS3Logs() != null) {
                data.set("s3Logs", om.valueToTree(this.getS3Logs()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectLogsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectLogsConfig.Jsii$Proxy that = (CodebuildProjectLogsConfig.Jsii$Proxy) o;

            if (this.cloudwatchLogs != null ? !this.cloudwatchLogs.equals(that.cloudwatchLogs) : that.cloudwatchLogs != null) return false;
            return this.s3Logs != null ? this.s3Logs.equals(that.s3Logs) : that.s3Logs == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cloudwatchLogs != null ? this.cloudwatchLogs.hashCode() : 0;
            result = 31 * result + (this.s3Logs != null ? this.s3Logs.hashCode() : 0);
            return result;
        }
    }
}
