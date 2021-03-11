package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.663Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamRedshiftConfiguration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamRedshiftConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getClusterJdbcurl();

    @org.jetbrains.annotations.NotNull java.lang.String getDataTableName();

    @org.jetbrains.annotations.NotNull java.lang.String getPassword();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getUsername();

    /**
     * cloudwatch_logging_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCopyOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDataTableColumns() {
        return null;
    }

    /**
     * processing_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRetryDuration() {
        return null;
    }

    /**
     * s3_backup_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration> getS3BackupConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3BackupMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamRedshiftConfiguration> {
        private java.lang.String clusterJdbcurl;
        private java.lang.String dataTableName;
        private java.lang.String password;
        private java.lang.String roleArn;
        private java.lang.String username;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private java.lang.String copyOptions;
        private java.lang.String dataTableColumns;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> processingConfiguration;
        private java.lang.Number retryDuration;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration> s3BackupConfiguration;
        private java.lang.String s3BackupMode;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getClusterJdbcurl}
         * @param clusterJdbcurl the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterJdbcurl(java.lang.String clusterJdbcurl) {
            this.clusterJdbcurl = clusterJdbcurl;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getDataTableName}
         * @param dataTableName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder dataTableName(java.lang.String dataTableName) {
            this.dataTableName = dataTableName;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getPassword}
         * @param password the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getUsername}
         * @param username the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getCloudwatchLoggingOptions}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchLoggingOptions(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getCopyOptions}
         * @param copyOptions the value to be set.
         * @return {@code this}
         */
        public Builder copyOptions(java.lang.String copyOptions) {
            this.copyOptions = copyOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getDataTableColumns}
         * @param dataTableColumns the value to be set.
         * @return {@code this}
         */
        public Builder dataTableColumns(java.lang.String dataTableColumns) {
            this.dataTableColumns = dataTableColumns;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getProcessingConfiguration}
         * @param processingConfiguration processing_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder processingConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> processingConfiguration) {
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration>)processingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getRetryDuration}
         * @param retryDuration the value to be set.
         * @return {@code this}
         */
        public Builder retryDuration(java.lang.Number retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getS3BackupConfiguration}
         * @param s3BackupConfiguration s3_backup_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3BackupConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration> s3BackupConfiguration) {
            this.s3BackupConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration>)s3BackupConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration#getS3BackupMode}
         * @param s3BackupMode the value to be set.
         * @return {@code this}
         */
        public Builder s3BackupMode(java.lang.String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamRedshiftConfiguration build() {
            return new Jsii$Proxy(clusterJdbcurl, dataTableName, password, roleArn, username, cloudwatchLoggingOptions, copyOptions, dataTableColumns, processingConfiguration, retryDuration, s3BackupConfiguration, s3BackupMode);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamRedshiftConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamRedshiftConfiguration {
        private final java.lang.String clusterJdbcurl;
        private final java.lang.String dataTableName;
        private final java.lang.String password;
        private final java.lang.String roleArn;
        private final java.lang.String username;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions;
        private final java.lang.String copyOptions;
        private final java.lang.String dataTableColumns;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> processingConfiguration;
        private final java.lang.Number retryDuration;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration> s3BackupConfiguration;
        private final java.lang.String s3BackupMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clusterJdbcurl = software.amazon.jsii.Kernel.get(this, "clusterJdbcurl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataTableName = software.amazon.jsii.Kernel.get(this, "dataTableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLoggingOptions = software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions.class)));
            this.copyOptions = software.amazon.jsii.Kernel.get(this, "copyOptions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataTableColumns = software.amazon.jsii.Kernel.get(this, "dataTableColumns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.processingConfiguration = software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration.class)));
            this.retryDuration = software.amazon.jsii.Kernel.get(this, "retryDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.s3BackupConfiguration = software.amazon.jsii.Kernel.get(this, "s3BackupConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration.class)));
            this.s3BackupMode = software.amazon.jsii.Kernel.get(this, "s3BackupMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String clusterJdbcurl, final java.lang.String dataTableName, final java.lang.String password, final java.lang.String roleArn, final java.lang.String username, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions, final java.lang.String copyOptions, final java.lang.String dataTableColumns, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> processingConfiguration, final java.lang.Number retryDuration, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration> s3BackupConfiguration, final java.lang.String s3BackupMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterJdbcurl = java.util.Objects.requireNonNull(clusterJdbcurl, "clusterJdbcurl is required");
            this.dataTableName = java.util.Objects.requireNonNull(dataTableName, "dataTableName is required");
            this.password = java.util.Objects.requireNonNull(password, "password is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.username = java.util.Objects.requireNonNull(username, "username is required");
            this.cloudwatchLoggingOptions = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions>)cloudwatchLoggingOptions;
            this.copyOptions = copyOptions;
            this.dataTableColumns = dataTableColumns;
            this.processingConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration>)processingConfiguration;
            this.retryDuration = retryDuration;
            this.s3BackupConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration>)s3BackupConfiguration;
            this.s3BackupMode = s3BackupMode;
        }

        @Override
        public final java.lang.String getClusterJdbcurl() {
            return this.clusterJdbcurl;
        }

        @Override
        public final java.lang.String getDataTableName() {
            return this.dataTableName;
        }

        @Override
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getUsername() {
            return this.username;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
            return this.cloudwatchLoggingOptions;
        }

        @Override
        public final java.lang.String getCopyOptions() {
            return this.copyOptions;
        }

        @Override
        public final java.lang.String getDataTableColumns() {
            return this.dataTableColumns;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> getProcessingConfiguration() {
            return this.processingConfiguration;
        }

        @Override
        public final java.lang.Number getRetryDuration() {
            return this.retryDuration;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration> getS3BackupConfiguration() {
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

            data.set("clusterJdbcurl", om.valueToTree(this.getClusterJdbcurl()));
            data.set("dataTableName", om.valueToTree(this.getDataTableName()));
            data.set("password", om.valueToTree(this.getPassword()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("username", om.valueToTree(this.getUsername()));
            if (this.getCloudwatchLoggingOptions() != null) {
                data.set("cloudwatchLoggingOptions", om.valueToTree(this.getCloudwatchLoggingOptions()));
            }
            if (this.getCopyOptions() != null) {
                data.set("copyOptions", om.valueToTree(this.getCopyOptions()));
            }
            if (this.getDataTableColumns() != null) {
                data.set("dataTableColumns", om.valueToTree(this.getDataTableColumns()));
            }
            if (this.getProcessingConfiguration() != null) {
                data.set("processingConfiguration", om.valueToTree(this.getProcessingConfiguration()));
            }
            if (this.getRetryDuration() != null) {
                data.set("retryDuration", om.valueToTree(this.getRetryDuration()));
            }
            if (this.getS3BackupConfiguration() != null) {
                data.set("s3BackupConfiguration", om.valueToTree(this.getS3BackupConfiguration()));
            }
            if (this.getS3BackupMode() != null) {
                data.set("s3BackupMode", om.valueToTree(this.getS3BackupMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamRedshiftConfiguration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamRedshiftConfiguration.Jsii$Proxy) o;

            if (!clusterJdbcurl.equals(that.clusterJdbcurl)) return false;
            if (!dataTableName.equals(that.dataTableName)) return false;
            if (!password.equals(that.password)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (!username.equals(that.username)) return false;
            if (this.cloudwatchLoggingOptions != null ? !this.cloudwatchLoggingOptions.equals(that.cloudwatchLoggingOptions) : that.cloudwatchLoggingOptions != null) return false;
            if (this.copyOptions != null ? !this.copyOptions.equals(that.copyOptions) : that.copyOptions != null) return false;
            if (this.dataTableColumns != null ? !this.dataTableColumns.equals(that.dataTableColumns) : that.dataTableColumns != null) return false;
            if (this.processingConfiguration != null ? !this.processingConfiguration.equals(that.processingConfiguration) : that.processingConfiguration != null) return false;
            if (this.retryDuration != null ? !this.retryDuration.equals(that.retryDuration) : that.retryDuration != null) return false;
            if (this.s3BackupConfiguration != null ? !this.s3BackupConfiguration.equals(that.s3BackupConfiguration) : that.s3BackupConfiguration != null) return false;
            return this.s3BackupMode != null ? this.s3BackupMode.equals(that.s3BackupMode) : that.s3BackupMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clusterJdbcurl.hashCode();
            result = 31 * result + (this.dataTableName.hashCode());
            result = 31 * result + (this.password.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.username.hashCode());
            result = 31 * result + (this.cloudwatchLoggingOptions != null ? this.cloudwatchLoggingOptions.hashCode() : 0);
            result = 31 * result + (this.copyOptions != null ? this.copyOptions.hashCode() : 0);
            result = 31 * result + (this.dataTableColumns != null ? this.dataTableColumns.hashCode() : 0);
            result = 31 * result + (this.processingConfiguration != null ? this.processingConfiguration.hashCode() : 0);
            result = 31 * result + (this.retryDuration != null ? this.retryDuration.hashCode() : 0);
            result = 31 * result + (this.s3BackupConfiguration != null ? this.s3BackupConfiguration.hashCode() : 0);
            result = 31 * result + (this.s3BackupMode != null ? this.s3BackupMode.hashCode() : 0);
            return result;
        }
    }
}
