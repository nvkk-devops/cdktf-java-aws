package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.441Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsEndpoint")
public class DmsEndpoint extends com.hashicorp.cdktf.TerraformResource {

    protected DmsEndpoint(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DmsEndpoint(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DmsEndpoint(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DmsEndpointConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCertificateArn() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDatabaseName() {
        software.amazon.jsii.Kernel.call(this, "resetDatabaseName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearchSettings() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearchSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExtraConnectionAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetExtraConnectionAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKafkaSettings() {
        software.amazon.jsii.Kernel.call(this, "resetKafkaSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisSettings() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMongodbSettings() {
        software.amazon.jsii.Kernel.call(this, "resetMongodbSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPassword() {
        software.amazon.jsii.Kernel.call(this, "resetPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Settings() {
        software.amazon.jsii.Kernel.call(this, "resetS3Settings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerName() {
        software.amazon.jsii.Kernel.call(this, "resetServerName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceAccessRole() {
        software.amazon.jsii.Kernel.call(this, "resetServiceAccessRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSslMode() {
        software.amazon.jsii.Kernel.call(this, "resetSslMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsername() {
        software.amazon.jsii.Kernel.call(this, "resetUsername", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointArn() {
        return software.amazon.jsii.Kernel.get(this, "endpointArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointIdInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineNameInput() {
        return software.amazon.jsii.Kernel.get(this, "engineNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateArnInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointElasticsearchSettings> getElasticsearchSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DmsEndpointElasticsearchSettings>)(software.amazon.jsii.Kernel.get(this, "elasticsearchSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointElasticsearchSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExtraConnectionAttributesInput() {
        return software.amazon.jsii.Kernel.get(this, "extraConnectionAttributesInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointKafkaSettings> getKafkaSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DmsEndpointKafkaSettings>)(software.amazon.jsii.Kernel.get(this, "kafkaSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointKafkaSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointKinesisSettings> getKinesisSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DmsEndpointKinesisSettings>)(software.amazon.jsii.Kernel.get(this, "kinesisSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointKinesisSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointMongodbSettings> getMongodbSettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DmsEndpointMongodbSettings>)(software.amazon.jsii.Kernel.get(this, "mongodbSettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointMongodbSettings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DmsEndpointS3Settings> getS3SettingsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DmsEndpointS3Settings>)(software.amazon.jsii.Kernel.get(this, "s3SettingsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointS3Settings.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serverNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccessRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSslModeInput() {
        return software.amazon.jsii.Kernel.get(this, "sslModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "usernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateArn", java.util.Objects.requireNonNull(value, "certificateArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "databaseName", java.util.Objects.requireNonNull(value, "databaseName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointElasticsearchSettings> getElasticsearchSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "elasticsearchSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointElasticsearchSettings.class))));
    }

    public void setElasticsearchSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointElasticsearchSettings> value) {
        software.amazon.jsii.Kernel.set(this, "elasticsearchSettings", java.util.Objects.requireNonNull(value, "elasticsearchSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointId() {
        return software.amazon.jsii.Kernel.get(this, "endpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointId", java.util.Objects.requireNonNull(value, "endpointId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointType() {
        return software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointType", java.util.Objects.requireNonNull(value, "endpointType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineName() {
        return software.amazon.jsii.Kernel.get(this, "engineName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngineName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engineName", java.util.Objects.requireNonNull(value, "engineName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExtraConnectionAttributes() {
        return software.amazon.jsii.Kernel.get(this, "extraConnectionAttributes", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExtraConnectionAttributes(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "extraConnectionAttributes", java.util.Objects.requireNonNull(value, "extraConnectionAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointKafkaSettings> getKafkaSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "kafkaSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointKafkaSettings.class))));
    }

    public void setKafkaSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointKafkaSettings> value) {
        software.amazon.jsii.Kernel.set(this, "kafkaSettings", java.util.Objects.requireNonNull(value, "kafkaSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointKinesisSettings> getKinesisSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "kinesisSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointKinesisSettings.class))));
    }

    public void setKinesisSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointKinesisSettings> value) {
        software.amazon.jsii.Kernel.set(this, "kinesisSettings", java.util.Objects.requireNonNull(value, "kinesisSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointMongodbSettings> getMongodbSettings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "mongodbSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointMongodbSettings.class))));
    }

    public void setMongodbSettings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointMongodbSettings> value) {
        software.amazon.jsii.Kernel.set(this, "mongodbSettings", java.util.Objects.requireNonNull(value, "mongodbSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassword() {
        return software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "password", java.util.Objects.requireNonNull(value, "password is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "port", java.util.Objects.requireNonNull(value, "port is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointS3Settings> getS3Settings() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "s3Settings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DmsEndpointS3Settings.class))));
    }

    public void setS3Settings(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DmsEndpointS3Settings> value) {
        software.amazon.jsii.Kernel.set(this, "s3Settings", java.util.Objects.requireNonNull(value, "s3Settings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerName() {
        return software.amazon.jsii.Kernel.get(this, "serverName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serverName", java.util.Objects.requireNonNull(value, "serverName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceAccessRole() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccessRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceAccessRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceAccessRole", java.util.Objects.requireNonNull(value, "serviceAccessRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSslMode() {
        return software.amazon.jsii.Kernel.get(this, "sslMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSslMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sslMode", java.util.Objects.requireNonNull(value, "sslMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUsername() {
        return software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "username", java.util.Objects.requireNonNull(value, "username is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DmsEndpoint}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DmsEndpoint> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.DmsEndpointConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DmsEndpointConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param endpointId This parameter is required.
         */
        public Builder endpointId(final java.lang.String endpointId) {
            this.config.endpointId(endpointId);
            return this;
        }

        /**
         * @return {@code this}
         * @param endpointType This parameter is required.
         */
        public Builder endpointType(final java.lang.String endpointType) {
            this.config.endpointType(endpointType);
            return this;
        }

        /**
         * @return {@code this}
         * @param engineName This parameter is required.
         */
        public Builder engineName(final java.lang.String engineName) {
            this.config.engineName(engineName);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificateArn This parameter is required.
         */
        public Builder certificateArn(final java.lang.String certificateArn) {
            this.config.certificateArn(certificateArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param databaseName This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * elasticsearch_settings block.
         * <p>
         * @return {@code this}
         * @param elasticsearchSettings elasticsearch_settings block. This parameter is required.
         */
        public Builder elasticsearchSettings(final java.util.List<? extends imports.aws.DmsEndpointElasticsearchSettings> elasticsearchSettings) {
            this.config.elasticsearchSettings(elasticsearchSettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param extraConnectionAttributes This parameter is required.
         */
        public Builder extraConnectionAttributes(final java.lang.String extraConnectionAttributes) {
            this.config.extraConnectionAttributes(extraConnectionAttributes);
            return this;
        }

        /**
         * kafka_settings block.
         * <p>
         * @return {@code this}
         * @param kafkaSettings kafka_settings block. This parameter is required.
         */
        public Builder kafkaSettings(final java.util.List<? extends imports.aws.DmsEndpointKafkaSettings> kafkaSettings) {
            this.config.kafkaSettings(kafkaSettings);
            return this;
        }

        /**
         * kinesis_settings block.
         * <p>
         * @return {@code this}
         * @param kinesisSettings kinesis_settings block. This parameter is required.
         */
        public Builder kinesisSettings(final java.util.List<? extends imports.aws.DmsEndpointKinesisSettings> kinesisSettings) {
            this.config.kinesisSettings(kinesisSettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsKeyArn This parameter is required.
         */
        public Builder kmsKeyArn(final java.lang.String kmsKeyArn) {
            this.config.kmsKeyArn(kmsKeyArn);
            return this;
        }

        /**
         * mongodb_settings block.
         * <p>
         * @return {@code this}
         * @param mongodbSettings mongodb_settings block. This parameter is required.
         */
        public Builder mongodbSettings(final java.util.List<? extends imports.aws.DmsEndpointMongodbSettings> mongodbSettings) {
            this.config.mongodbSettings(mongodbSettings);
            return this;
        }

        /**
         * @return {@code this}
         * @param password This parameter is required.
         */
        public Builder password(final java.lang.String password) {
            this.config.password(password);
            return this;
        }

        /**
         * @return {@code this}
         * @param port This parameter is required.
         */
        public Builder port(final java.lang.Number port) {
            this.config.port(port);
            return this;
        }

        /**
         * s3_settings block.
         * <p>
         * @return {@code this}
         * @param s3Settings s3_settings block. This parameter is required.
         */
        public Builder s3Settings(final java.util.List<? extends imports.aws.DmsEndpointS3Settings> s3Settings) {
            this.config.s3Settings(s3Settings);
            return this;
        }

        /**
         * @return {@code this}
         * @param serverName This parameter is required.
         */
        public Builder serverName(final java.lang.String serverName) {
            this.config.serverName(serverName);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceAccessRole This parameter is required.
         */
        public Builder serviceAccessRole(final java.lang.String serviceAccessRole) {
            this.config.serviceAccessRole(serviceAccessRole);
            return this;
        }

        /**
         * @return {@code this}
         * @param sslMode This parameter is required.
         */
        public Builder sslMode(final java.lang.String sslMode) {
            this.config.sslMode(sslMode);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @return {@code this}
         * @param username This parameter is required.
         */
        public Builder username(final java.lang.String username) {
            this.config.username(username);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DmsEndpoint}.
         */
        @Override
        public imports.aws.DmsEndpoint build() {
            return new imports.aws.DmsEndpoint(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
