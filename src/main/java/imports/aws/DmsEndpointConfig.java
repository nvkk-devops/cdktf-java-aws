package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.442Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsEndpointConfig")
@software.amazon.jsii.Jsii.Proxy(DmsEndpointConfig.Jsii$Proxy.class)
public interface DmsEndpointConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getEndpointId();

    @org.jetbrains.annotations.NotNull java.lang.String getEndpointType();

    @org.jetbrains.annotations.NotNull java.lang.String getEngineName();

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDatabaseName() {
        return null;
    }

    /**
     * elasticsearch_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointElasticsearchSettings> getElasticsearchSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getExtraConnectionAttributes() {
        return null;
    }

    /**
     * kafka_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointKafkaSettings> getKafkaSettings() {
        return null;
    }

    /**
     * kinesis_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointKinesisSettings> getKinesisSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    /**
     * mongodb_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointMongodbSettings> getMongodbSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * s3_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointS3Settings> getS3Settings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServerName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessRole() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSslMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsEndpointConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsEndpointConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsEndpointConfig> {
        private java.lang.String endpointId;
        private java.lang.String endpointType;
        private java.lang.String engineName;
        private java.lang.String certificateArn;
        private java.lang.String databaseName;
        private java.util.List<imports.aws.DmsEndpointElasticsearchSettings> elasticsearchSettings;
        private java.lang.String extraConnectionAttributes;
        private java.util.List<imports.aws.DmsEndpointKafkaSettings> kafkaSettings;
        private java.util.List<imports.aws.DmsEndpointKinesisSettings> kinesisSettings;
        private java.lang.String kmsKeyArn;
        private java.util.List<imports.aws.DmsEndpointMongodbSettings> mongodbSettings;
        private java.lang.String password;
        private java.lang.Number port;
        private java.util.List<imports.aws.DmsEndpointS3Settings> s3Settings;
        private java.lang.String serverName;
        private java.lang.String serviceAccessRole;
        private java.lang.String sslMode;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String username;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DmsEndpointConfig#getEndpointId}
         * @param endpointId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder endpointId(java.lang.String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getEndpointType}
         * @param endpointType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder endpointType(java.lang.String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getEngineName}
         * @param engineName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder engineName(java.lang.String engineName) {
            this.engineName = engineName;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getCertificateArn}
         * @param certificateArn the value to be set.
         * @return {@code this}
         */
        public Builder certificateArn(java.lang.String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getDatabaseName}
         * @param databaseName the value to be set.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getElasticsearchSettings}
         * @param elasticsearchSettings elasticsearch_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elasticsearchSettings(java.util.List<? extends imports.aws.DmsEndpointElasticsearchSettings> elasticsearchSettings) {
            this.elasticsearchSettings = (java.util.List<imports.aws.DmsEndpointElasticsearchSettings>)elasticsearchSettings;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getExtraConnectionAttributes}
         * @param extraConnectionAttributes the value to be set.
         * @return {@code this}
         */
        public Builder extraConnectionAttributes(java.lang.String extraConnectionAttributes) {
            this.extraConnectionAttributes = extraConnectionAttributes;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getKafkaSettings}
         * @param kafkaSettings kafka_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kafkaSettings(java.util.List<? extends imports.aws.DmsEndpointKafkaSettings> kafkaSettings) {
            this.kafkaSettings = (java.util.List<imports.aws.DmsEndpointKafkaSettings>)kafkaSettings;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getKinesisSettings}
         * @param kinesisSettings kinesis_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisSettings(java.util.List<? extends imports.aws.DmsEndpointKinesisSettings> kinesisSettings) {
            this.kinesisSettings = (java.util.List<imports.aws.DmsEndpointKinesisSettings>)kinesisSettings;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getMongodbSettings}
         * @param mongodbSettings mongodb_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder mongodbSettings(java.util.List<? extends imports.aws.DmsEndpointMongodbSettings> mongodbSettings) {
            this.mongodbSettings = (java.util.List<imports.aws.DmsEndpointMongodbSettings>)mongodbSettings;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getPassword}
         * @param password the value to be set.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getS3Settings}
         * @param s3Settings s3_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Settings(java.util.List<? extends imports.aws.DmsEndpointS3Settings> s3Settings) {
            this.s3Settings = (java.util.List<imports.aws.DmsEndpointS3Settings>)s3Settings;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getServerName}
         * @param serverName the value to be set.
         * @return {@code this}
         */
        public Builder serverName(java.lang.String serverName) {
            this.serverName = serverName;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getServiceAccessRole}
         * @param serviceAccessRole the value to be set.
         * @return {@code this}
         */
        public Builder serviceAccessRole(java.lang.String serviceAccessRole) {
            this.serviceAccessRole = serviceAccessRole;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getSslMode}
         * @param sslMode the value to be set.
         * @return {@code this}
         */
        public Builder sslMode(java.lang.String sslMode) {
            this.sslMode = sslMode;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getUsername}
         * @param username the value to be set.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DmsEndpointConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsEndpointConfig build() {
            return new Jsii$Proxy(endpointId, endpointType, engineName, certificateArn, databaseName, elasticsearchSettings, extraConnectionAttributes, kafkaSettings, kinesisSettings, kmsKeyArn, mongodbSettings, password, port, s3Settings, serverName, serviceAccessRole, sslMode, tags, username, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DmsEndpointConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsEndpointConfig {
        private final java.lang.String endpointId;
        private final java.lang.String endpointType;
        private final java.lang.String engineName;
        private final java.lang.String certificateArn;
        private final java.lang.String databaseName;
        private final java.util.List<imports.aws.DmsEndpointElasticsearchSettings> elasticsearchSettings;
        private final java.lang.String extraConnectionAttributes;
        private final java.util.List<imports.aws.DmsEndpointKafkaSettings> kafkaSettings;
        private final java.util.List<imports.aws.DmsEndpointKinesisSettings> kinesisSettings;
        private final java.lang.String kmsKeyArn;
        private final java.util.List<imports.aws.DmsEndpointMongodbSettings> mongodbSettings;
        private final java.lang.String password;
        private final java.lang.Number port;
        private final java.util.List<imports.aws.DmsEndpointS3Settings> s3Settings;
        private final java.lang.String serverName;
        private final java.lang.String serviceAccessRole;
        private final java.lang.String sslMode;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String username;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpointId = software.amazon.jsii.Kernel.get(this, "endpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpointType = software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineName = software.amazon.jsii.Kernel.get(this, "engineName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateArn = software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.elasticsearchSettings = software.amazon.jsii.Kernel.get(this, "elasticsearchSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointElasticsearchSettings.class)));
            this.extraConnectionAttributes = software.amazon.jsii.Kernel.get(this, "extraConnectionAttributes", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kafkaSettings = software.amazon.jsii.Kernel.get(this, "kafkaSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointKafkaSettings.class)));
            this.kinesisSettings = software.amazon.jsii.Kernel.get(this, "kinesisSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointKinesisSettings.class)));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mongodbSettings = software.amazon.jsii.Kernel.get(this, "mongodbSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointMongodbSettings.class)));
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.s3Settings = software.amazon.jsii.Kernel.get(this, "s3Settings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointS3Settings.class)));
            this.serverName = software.amazon.jsii.Kernel.get(this, "serverName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceAccessRole = software.amazon.jsii.Kernel.get(this, "serviceAccessRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sslMode = software.amazon.jsii.Kernel.get(this, "sslMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String endpointId, final java.lang.String endpointType, final java.lang.String engineName, final java.lang.String certificateArn, final java.lang.String databaseName, final java.util.List<? extends imports.aws.DmsEndpointElasticsearchSettings> elasticsearchSettings, final java.lang.String extraConnectionAttributes, final java.util.List<? extends imports.aws.DmsEndpointKafkaSettings> kafkaSettings, final java.util.List<? extends imports.aws.DmsEndpointKinesisSettings> kinesisSettings, final java.lang.String kmsKeyArn, final java.util.List<? extends imports.aws.DmsEndpointMongodbSettings> mongodbSettings, final java.lang.String password, final java.lang.Number port, final java.util.List<? extends imports.aws.DmsEndpointS3Settings> s3Settings, final java.lang.String serverName, final java.lang.String serviceAccessRole, final java.lang.String sslMode, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String username, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpointId = java.util.Objects.requireNonNull(endpointId, "endpointId is required");
            this.endpointType = java.util.Objects.requireNonNull(endpointType, "endpointType is required");
            this.engineName = java.util.Objects.requireNonNull(engineName, "engineName is required");
            this.certificateArn = certificateArn;
            this.databaseName = databaseName;
            this.elasticsearchSettings = (java.util.List<imports.aws.DmsEndpointElasticsearchSettings>)elasticsearchSettings;
            this.extraConnectionAttributes = extraConnectionAttributes;
            this.kafkaSettings = (java.util.List<imports.aws.DmsEndpointKafkaSettings>)kafkaSettings;
            this.kinesisSettings = (java.util.List<imports.aws.DmsEndpointKinesisSettings>)kinesisSettings;
            this.kmsKeyArn = kmsKeyArn;
            this.mongodbSettings = (java.util.List<imports.aws.DmsEndpointMongodbSettings>)mongodbSettings;
            this.password = password;
            this.port = port;
            this.s3Settings = (java.util.List<imports.aws.DmsEndpointS3Settings>)s3Settings;
            this.serverName = serverName;
            this.serviceAccessRole = serviceAccessRole;
            this.sslMode = sslMode;
            this.tags = tags;
            this.username = username;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getEndpointId() {
            return this.endpointId;
        }

        @Override
        public final java.lang.String getEndpointType() {
            return this.endpointType;
        }

        @Override
        public final java.lang.String getEngineName() {
            return this.engineName;
        }

        @Override
        public final java.lang.String getCertificateArn() {
            return this.certificateArn;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.util.List<imports.aws.DmsEndpointElasticsearchSettings> getElasticsearchSettings() {
            return this.elasticsearchSettings;
        }

        @Override
        public final java.lang.String getExtraConnectionAttributes() {
            return this.extraConnectionAttributes;
        }

        @Override
        public final java.util.List<imports.aws.DmsEndpointKafkaSettings> getKafkaSettings() {
            return this.kafkaSettings;
        }

        @Override
        public final java.util.List<imports.aws.DmsEndpointKinesisSettings> getKinesisSettings() {
            return this.kinesisSettings;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.util.List<imports.aws.DmsEndpointMongodbSettings> getMongodbSettings() {
            return this.mongodbSettings;
        }

        @Override
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.util.List<imports.aws.DmsEndpointS3Settings> getS3Settings() {
            return this.s3Settings;
        }

        @Override
        public final java.lang.String getServerName() {
            return this.serverName;
        }

        @Override
        public final java.lang.String getServiceAccessRole() {
            return this.serviceAccessRole;
        }

        @Override
        public final java.lang.String getSslMode() {
            return this.sslMode;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getUsername() {
            return this.username;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("endpointId", om.valueToTree(this.getEndpointId()));
            data.set("endpointType", om.valueToTree(this.getEndpointType()));
            data.set("engineName", om.valueToTree(this.getEngineName()));
            if (this.getCertificateArn() != null) {
                data.set("certificateArn", om.valueToTree(this.getCertificateArn()));
            }
            if (this.getDatabaseName() != null) {
                data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            }
            if (this.getElasticsearchSettings() != null) {
                data.set("elasticsearchSettings", om.valueToTree(this.getElasticsearchSettings()));
            }
            if (this.getExtraConnectionAttributes() != null) {
                data.set("extraConnectionAttributes", om.valueToTree(this.getExtraConnectionAttributes()));
            }
            if (this.getKafkaSettings() != null) {
                data.set("kafkaSettings", om.valueToTree(this.getKafkaSettings()));
            }
            if (this.getKinesisSettings() != null) {
                data.set("kinesisSettings", om.valueToTree(this.getKinesisSettings()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getMongodbSettings() != null) {
                data.set("mongodbSettings", om.valueToTree(this.getMongodbSettings()));
            }
            if (this.getPassword() != null) {
                data.set("password", om.valueToTree(this.getPassword()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getS3Settings() != null) {
                data.set("s3Settings", om.valueToTree(this.getS3Settings()));
            }
            if (this.getServerName() != null) {
                data.set("serverName", om.valueToTree(this.getServerName()));
            }
            if (this.getServiceAccessRole() != null) {
                data.set("serviceAccessRole", om.valueToTree(this.getServiceAccessRole()));
            }
            if (this.getSslMode() != null) {
                data.set("sslMode", om.valueToTree(this.getSslMode()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUsername() != null) {
                data.set("username", om.valueToTree(this.getUsername()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DmsEndpointConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsEndpointConfig.Jsii$Proxy that = (DmsEndpointConfig.Jsii$Proxy) o;

            if (!endpointId.equals(that.endpointId)) return false;
            if (!endpointType.equals(that.endpointType)) return false;
            if (!engineName.equals(that.engineName)) return false;
            if (this.certificateArn != null ? !this.certificateArn.equals(that.certificateArn) : that.certificateArn != null) return false;
            if (this.databaseName != null ? !this.databaseName.equals(that.databaseName) : that.databaseName != null) return false;
            if (this.elasticsearchSettings != null ? !this.elasticsearchSettings.equals(that.elasticsearchSettings) : that.elasticsearchSettings != null) return false;
            if (this.extraConnectionAttributes != null ? !this.extraConnectionAttributes.equals(that.extraConnectionAttributes) : that.extraConnectionAttributes != null) return false;
            if (this.kafkaSettings != null ? !this.kafkaSettings.equals(that.kafkaSettings) : that.kafkaSettings != null) return false;
            if (this.kinesisSettings != null ? !this.kinesisSettings.equals(that.kinesisSettings) : that.kinesisSettings != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.mongodbSettings != null ? !this.mongodbSettings.equals(that.mongodbSettings) : that.mongodbSettings != null) return false;
            if (this.password != null ? !this.password.equals(that.password) : that.password != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.s3Settings != null ? !this.s3Settings.equals(that.s3Settings) : that.s3Settings != null) return false;
            if (this.serverName != null ? !this.serverName.equals(that.serverName) : that.serverName != null) return false;
            if (this.serviceAccessRole != null ? !this.serviceAccessRole.equals(that.serviceAccessRole) : that.serviceAccessRole != null) return false;
            if (this.sslMode != null ? !this.sslMode.equals(that.sslMode) : that.sslMode != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.username != null ? !this.username.equals(that.username) : that.username != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endpointId.hashCode();
            result = 31 * result + (this.endpointType.hashCode());
            result = 31 * result + (this.engineName.hashCode());
            result = 31 * result + (this.certificateArn != null ? this.certificateArn.hashCode() : 0);
            result = 31 * result + (this.databaseName != null ? this.databaseName.hashCode() : 0);
            result = 31 * result + (this.elasticsearchSettings != null ? this.elasticsearchSettings.hashCode() : 0);
            result = 31 * result + (this.extraConnectionAttributes != null ? this.extraConnectionAttributes.hashCode() : 0);
            result = 31 * result + (this.kafkaSettings != null ? this.kafkaSettings.hashCode() : 0);
            result = 31 * result + (this.kinesisSettings != null ? this.kinesisSettings.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.mongodbSettings != null ? this.mongodbSettings.hashCode() : 0);
            result = 31 * result + (this.password != null ? this.password.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.s3Settings != null ? this.s3Settings.hashCode() : 0);
            result = 31 * result + (this.serverName != null ? this.serverName.hashCode() : 0);
            result = 31 * result + (this.serviceAccessRole != null ? this.serviceAccessRole.hashCode() : 0);
            result = 31 * result + (this.sslMode != null ? this.sslMode.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
