package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.652Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStream")
public class KinesisFirehoseDeliveryStream extends com.hashicorp.cdktf.TerraformResource {

    protected KinesisFirehoseDeliveryStream(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisFirehoseDeliveryStream(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public KinesisFirehoseDeliveryStream(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.KinesisFirehoseDeliveryStreamConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDestinationId() {
        software.amazon.jsii.Kernel.call(this, "resetDestinationId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearchConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearchConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExtendedS3Configuration() {
        software.amazon.jsii.Kernel.call(this, "resetExtendedS3Configuration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisSourceConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisSourceConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedshiftConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetRedshiftConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Configuration() {
        software.amazon.jsii.Kernel.call(this, "resetS3Configuration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryption() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSplunkConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSplunkConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersionId() {
        software.amazon.jsii.Kernel.call(this, "resetVersionId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationIdInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> getElasticsearchConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration>)(software.amazon.jsii.Kernel.get(this, "elasticsearchConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> getExtendedS3ConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration>)(software.amazon.jsii.Kernel.get(this, "extendedS3ConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> getKinesisSourceConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration>)(software.amazon.jsii.Kernel.get(this, "kinesisSourceConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> getRedshiftConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration>)(software.amazon.jsii.Kernel.get(this, "redshiftConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> getS3ConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration>)(software.amazon.jsii.Kernel.get(this, "s3ConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamS3Configuration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> getServerSideEncryptionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption>)(software.amazon.jsii.Kernel.get(this, "serverSideEncryptionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> getSplunkConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration>)(software.amazon.jsii.Kernel.get(this, "splunkConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "versionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestination() {
        return software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestination(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destination", java.util.Objects.requireNonNull(value, "destination is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationId() {
        return software.amazon.jsii.Kernel.get(this, "destinationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationId", java.util.Objects.requireNonNull(value, "destinationId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> getElasticsearchConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "elasticsearchConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration.class))));
    }

    public void setElasticsearchConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "elasticsearchConfiguration", java.util.Objects.requireNonNull(value, "elasticsearchConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> getExtendedS3Configuration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "extendedS3Configuration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration.class))));
    }

    public void setExtendedS3Configuration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> value) {
        software.amazon.jsii.Kernel.set(this, "extendedS3Configuration", java.util.Objects.requireNonNull(value, "extendedS3Configuration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> getKinesisSourceConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "kinesisSourceConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration.class))));
    }

    public void setKinesisSourceConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "kinesisSourceConfiguration", java.util.Objects.requireNonNull(value, "kinesisSourceConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> getRedshiftConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "redshiftConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration.class))));
    }

    public void setRedshiftConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "redshiftConfiguration", java.util.Objects.requireNonNull(value, "redshiftConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> getS3Configuration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "s3Configuration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamS3Configuration.class))));
    }

    public void setS3Configuration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> value) {
        software.amazon.jsii.Kernel.set(this, "s3Configuration", java.util.Objects.requireNonNull(value, "s3Configuration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> getServerSideEncryption() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption.class))));
    }

    public void setServerSideEncryption(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> value) {
        software.amazon.jsii.Kernel.set(this, "serverSideEncryption", java.util.Objects.requireNonNull(value, "serverSideEncryption is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> getSplunkConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "splunkConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration.class))));
    }

    public void setSplunkConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "splunkConfiguration", java.util.Objects.requireNonNull(value, "splunkConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionId() {
        return software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "versionId", java.util.Objects.requireNonNull(value, "versionId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.KinesisFirehoseDeliveryStream}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.KinesisFirehoseDeliveryStream> {
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
        private final imports.aws.KinesisFirehoseDeliveryStreamConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.KinesisFirehoseDeliveryStreamConfig.Builder();
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
         * @param destination This parameter is required.
         */
        public Builder destination(final java.lang.String destination) {
            this.config.destination(destination);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param destinationId This parameter is required.
         */
        public Builder destinationId(final java.lang.String destinationId) {
            this.config.destinationId(destinationId);
            return this;
        }

        /**
         * elasticsearch_configuration block.
         * <p>
         * @return {@code this}
         * @param elasticsearchConfiguration elasticsearch_configuration block. This parameter is required.
         */
        public Builder elasticsearchConfiguration(final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> elasticsearchConfiguration) {
            this.config.elasticsearchConfiguration(elasticsearchConfiguration);
            return this;
        }

        /**
         * extended_s3_configuration block.
         * <p>
         * @return {@code this}
         * @param extendedS3Configuration extended_s3_configuration block. This parameter is required.
         */
        public Builder extendedS3Configuration(final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> extendedS3Configuration) {
            this.config.extendedS3Configuration(extendedS3Configuration);
            return this;
        }

        /**
         * kinesis_source_configuration block.
         * <p>
         * @return {@code this}
         * @param kinesisSourceConfiguration kinesis_source_configuration block. This parameter is required.
         */
        public Builder kinesisSourceConfiguration(final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> kinesisSourceConfiguration) {
            this.config.kinesisSourceConfiguration(kinesisSourceConfiguration);
            return this;
        }

        /**
         * redshift_configuration block.
         * <p>
         * @return {@code this}
         * @param redshiftConfiguration redshift_configuration block. This parameter is required.
         */
        public Builder redshiftConfiguration(final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> redshiftConfiguration) {
            this.config.redshiftConfiguration(redshiftConfiguration);
            return this;
        }

        /**
         * s3_configuration block.
         * <p>
         * @return {@code this}
         * @param s3Configuration s3_configuration block. This parameter is required.
         */
        public Builder s3Configuration(final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> s3Configuration) {
            this.config.s3Configuration(s3Configuration);
            return this;
        }

        /**
         * server_side_encryption block.
         * <p>
         * @return {@code this}
         * @param serverSideEncryption server_side_encryption block. This parameter is required.
         */
        public Builder serverSideEncryption(final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> serverSideEncryption) {
            this.config.serverSideEncryption(serverSideEncryption);
            return this;
        }

        /**
         * splunk_configuration block.
         * <p>
         * @return {@code this}
         * @param splunkConfiguration splunk_configuration block. This parameter is required.
         */
        public Builder splunkConfiguration(final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> splunkConfiguration) {
            this.config.splunkConfiguration(splunkConfiguration);
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
         * @param versionId This parameter is required.
         */
        public Builder versionId(final java.lang.String versionId) {
            this.config.versionId(versionId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.KinesisFirehoseDeliveryStream}.
         */
        @Override
        public imports.aws.KinesisFirehoseDeliveryStream build() {
            return new imports.aws.KinesisFirehoseDeliveryStream(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
