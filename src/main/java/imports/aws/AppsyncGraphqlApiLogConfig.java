package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.053Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncGraphqlApiLogConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncGraphqlApiLogConfig.Jsii$Proxy.class)
public interface AppsyncGraphqlApiLogConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchLogsRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getFieldLogLevel();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExcludeVerboseContent() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncGraphqlApiLogConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncGraphqlApiLogConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncGraphqlApiLogConfig> {
        private java.lang.String cloudwatchLogsRoleArn;
        private java.lang.String fieldLogLevel;
        private java.lang.Boolean excludeVerboseContent;

        /**
         * Sets the value of {@link AppsyncGraphqlApiLogConfig#getCloudwatchLogsRoleArn}
         * @param cloudwatchLogsRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder cloudwatchLogsRoleArn(java.lang.String cloudwatchLogsRoleArn) {
            this.cloudwatchLogsRoleArn = cloudwatchLogsRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiLogConfig#getFieldLogLevel}
         * @param fieldLogLevel the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder fieldLogLevel(java.lang.String fieldLogLevel) {
            this.fieldLogLevel = fieldLogLevel;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiLogConfig#getExcludeVerboseContent}
         * @param excludeVerboseContent the value to be set.
         * @return {@code this}
         */
        public Builder excludeVerboseContent(java.lang.Boolean excludeVerboseContent) {
            this.excludeVerboseContent = excludeVerboseContent;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppsyncGraphqlApiLogConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncGraphqlApiLogConfig build() {
            return new Jsii$Proxy(cloudwatchLogsRoleArn, fieldLogLevel, excludeVerboseContent);
        }
    }

    /**
     * An implementation for {@link AppsyncGraphqlApiLogConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncGraphqlApiLogConfig {
        private final java.lang.String cloudwatchLogsRoleArn;
        private final java.lang.String fieldLogLevel;
        private final java.lang.Boolean excludeVerboseContent;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cloudwatchLogsRoleArn = software.amazon.jsii.Kernel.get(this, "cloudwatchLogsRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldLogLevel = software.amazon.jsii.Kernel.get(this, "fieldLogLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excludeVerboseContent = software.amazon.jsii.Kernel.get(this, "excludeVerboseContent", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String cloudwatchLogsRoleArn, final java.lang.String fieldLogLevel, final java.lang.Boolean excludeVerboseContent) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cloudwatchLogsRoleArn = java.util.Objects.requireNonNull(cloudwatchLogsRoleArn, "cloudwatchLogsRoleArn is required");
            this.fieldLogLevel = java.util.Objects.requireNonNull(fieldLogLevel, "fieldLogLevel is required");
            this.excludeVerboseContent = excludeVerboseContent;
        }

        @Override
        public final java.lang.String getCloudwatchLogsRoleArn() {
            return this.cloudwatchLogsRoleArn;
        }

        @Override
        public final java.lang.String getFieldLogLevel() {
            return this.fieldLogLevel;
        }

        @Override
        public final java.lang.Boolean getExcludeVerboseContent() {
            return this.excludeVerboseContent;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cloudwatchLogsRoleArn", om.valueToTree(this.getCloudwatchLogsRoleArn()));
            data.set("fieldLogLevel", om.valueToTree(this.getFieldLogLevel()));
            if (this.getExcludeVerboseContent() != null) {
                data.set("excludeVerboseContent", om.valueToTree(this.getExcludeVerboseContent()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppsyncGraphqlApiLogConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncGraphqlApiLogConfig.Jsii$Proxy that = (AppsyncGraphqlApiLogConfig.Jsii$Proxy) o;

            if (!cloudwatchLogsRoleArn.equals(that.cloudwatchLogsRoleArn)) return false;
            if (!fieldLogLevel.equals(that.fieldLogLevel)) return false;
            return this.excludeVerboseContent != null ? this.excludeVerboseContent.equals(that.excludeVerboseContent) : that.excludeVerboseContent == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cloudwatchLogsRoleArn.hashCode();
            result = 31 * result + (this.fieldLogLevel.hashCode());
            result = 31 * result + (this.excludeVerboseContent != null ? this.excludeVerboseContent.hashCode() : 0);
            return result;
        }
    }
}
