package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.896Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters")
@software.amazon.jsii.Jsii.Proxy(SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters.Jsii$Proxy.class)
public interface SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getComment() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDocumentHash() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDocumentHashType() {
        return null;
    }

    /**
     * notification_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> getNotificationConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOutputS3Bucket() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOutputS3KeyPrefix() {
        return null;
    }

    /**
     * parameter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> getParameter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters> {
        private java.lang.String comment;
        private java.lang.String documentHash;
        private java.lang.String documentHashType;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> notificationConfig;
        private java.lang.String outputS3Bucket;
        private java.lang.String outputS3KeyPrefix;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameter;
        private java.lang.String serviceRoleArn;
        private java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getComment}
         * @param comment the value to be set.
         * @return {@code this}
         */
        public Builder comment(java.lang.String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getDocumentHash}
         * @param documentHash the value to be set.
         * @return {@code this}
         */
        public Builder documentHash(java.lang.String documentHash) {
            this.documentHash = documentHash;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getDocumentHashType}
         * @param documentHashType the value to be set.
         * @return {@code this}
         */
        public Builder documentHashType(java.lang.String documentHashType) {
            this.documentHashType = documentHashType;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getNotificationConfig}
         * @param notificationConfig notification_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder notificationConfig(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> notificationConfig) {
            this.notificationConfig = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig>)notificationConfig;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getOutputS3Bucket}
         * @param outputS3Bucket the value to be set.
         * @return {@code this}
         */
        public Builder outputS3Bucket(java.lang.String outputS3Bucket) {
            this.outputS3Bucket = outputS3Bucket;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getOutputS3KeyPrefix}
         * @param outputS3KeyPrefix the value to be set.
         * @return {@code this}
         */
        public Builder outputS3KeyPrefix(java.lang.String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getParameter}
         * @param parameter parameter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder parameter(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameter) {
            this.parameter = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter>)parameter;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getServiceRoleArn}
         * @param serviceRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder serviceRoleArn(java.lang.String serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters#getTimeoutSeconds}
         * @param timeoutSeconds the value to be set.
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters build() {
            return new Jsii$Proxy(comment, documentHash, documentHashType, notificationConfig, outputS3Bucket, outputS3KeyPrefix, parameter, serviceRoleArn, timeoutSeconds);
        }
    }

    /**
     * An implementation for {@link SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters {
        private final java.lang.String comment;
        private final java.lang.String documentHash;
        private final java.lang.String documentHashType;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> notificationConfig;
        private final java.lang.String outputS3Bucket;
        private final java.lang.String outputS3KeyPrefix;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameter;
        private final java.lang.String serviceRoleArn;
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.comment = software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.documentHash = software.amazon.jsii.Kernel.get(this, "documentHash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.documentHashType = software.amazon.jsii.Kernel.get(this, "documentHashType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notificationConfig = software.amazon.jsii.Kernel.get(this, "notificationConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig.class)));
            this.outputS3Bucket = software.amazon.jsii.Kernel.get(this, "outputS3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.outputS3KeyPrefix = software.amazon.jsii.Kernel.get(this, "outputS3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameter = software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter.class)));
            this.serviceRoleArn = software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeoutSeconds = software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String comment, final java.lang.String documentHash, final java.lang.String documentHashType, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> notificationConfig, final java.lang.String outputS3Bucket, final java.lang.String outputS3KeyPrefix, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameter, final java.lang.String serviceRoleArn, final java.lang.Number timeoutSeconds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.comment = comment;
            this.documentHash = documentHash;
            this.documentHashType = documentHashType;
            this.notificationConfig = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig>)notificationConfig;
            this.outputS3Bucket = outputS3Bucket;
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            this.parameter = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter>)parameter;
            this.serviceRoleArn = serviceRoleArn;
            this.timeoutSeconds = timeoutSeconds;
        }

        @Override
        public final java.lang.String getComment() {
            return this.comment;
        }

        @Override
        public final java.lang.String getDocumentHash() {
            return this.documentHash;
        }

        @Override
        public final java.lang.String getDocumentHashType() {
            return this.documentHashType;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> getNotificationConfig() {
            return this.notificationConfig;
        }

        @Override
        public final java.lang.String getOutputS3Bucket() {
            return this.outputS3Bucket;
        }

        @Override
        public final java.lang.String getOutputS3KeyPrefix() {
            return this.outputS3KeyPrefix;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> getParameter() {
            return this.parameter;
        }

        @Override
        public final java.lang.String getServiceRoleArn() {
            return this.serviceRoleArn;
        }

        @Override
        public final java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getComment() != null) {
                data.set("comment", om.valueToTree(this.getComment()));
            }
            if (this.getDocumentHash() != null) {
                data.set("documentHash", om.valueToTree(this.getDocumentHash()));
            }
            if (this.getDocumentHashType() != null) {
                data.set("documentHashType", om.valueToTree(this.getDocumentHashType()));
            }
            if (this.getNotificationConfig() != null) {
                data.set("notificationConfig", om.valueToTree(this.getNotificationConfig()));
            }
            if (this.getOutputS3Bucket() != null) {
                data.set("outputS3Bucket", om.valueToTree(this.getOutputS3Bucket()));
            }
            if (this.getOutputS3KeyPrefix() != null) {
                data.set("outputS3KeyPrefix", om.valueToTree(this.getOutputS3KeyPrefix()));
            }
            if (this.getParameter() != null) {
                data.set("parameter", om.valueToTree(this.getParameter()));
            }
            if (this.getServiceRoleArn() != null) {
                data.set("serviceRoleArn", om.valueToTree(this.getServiceRoleArn()));
            }
            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters.Jsii$Proxy that = (SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParameters.Jsii$Proxy) o;

            if (this.comment != null ? !this.comment.equals(that.comment) : that.comment != null) return false;
            if (this.documentHash != null ? !this.documentHash.equals(that.documentHash) : that.documentHash != null) return false;
            if (this.documentHashType != null ? !this.documentHashType.equals(that.documentHashType) : that.documentHashType != null) return false;
            if (this.notificationConfig != null ? !this.notificationConfig.equals(that.notificationConfig) : that.notificationConfig != null) return false;
            if (this.outputS3Bucket != null ? !this.outputS3Bucket.equals(that.outputS3Bucket) : that.outputS3Bucket != null) return false;
            if (this.outputS3KeyPrefix != null ? !this.outputS3KeyPrefix.equals(that.outputS3KeyPrefix) : that.outputS3KeyPrefix != null) return false;
            if (this.parameter != null ? !this.parameter.equals(that.parameter) : that.parameter != null) return false;
            if (this.serviceRoleArn != null ? !this.serviceRoleArn.equals(that.serviceRoleArn) : that.serviceRoleArn != null) return false;
            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.comment != null ? this.comment.hashCode() : 0;
            result = 31 * result + (this.documentHash != null ? this.documentHash.hashCode() : 0);
            result = 31 * result + (this.documentHashType != null ? this.documentHashType.hashCode() : 0);
            result = 31 * result + (this.notificationConfig != null ? this.notificationConfig.hashCode() : 0);
            result = 31 * result + (this.outputS3Bucket != null ? this.outputS3Bucket.hashCode() : 0);
            result = 31 * result + (this.outputS3KeyPrefix != null ? this.outputS3KeyPrefix.hashCode() : 0);
            result = 31 * result + (this.parameter != null ? this.parameter.hashCode() : 0);
            result = 31 * result + (this.serviceRoleArn != null ? this.serviceRoleArn.hashCode() : 0);
            result = 31 * result + (this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0);
            return result;
        }
    }
}
