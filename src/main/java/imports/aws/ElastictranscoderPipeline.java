package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.555Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPipeline")
public class ElastictranscoderPipeline extends com.hashicorp.cdktf.TerraformResource {

    protected ElastictranscoderPipeline(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElastictranscoderPipeline(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ElastictranscoderPipeline(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ElastictranscoderPipelineConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAwsKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetAwsKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentConfig() {
        software.amazon.jsii.Kernel.call(this, "resetContentConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentConfigPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetContentConfigPermissions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotifications() {
        software.amazon.jsii.Kernel.call(this, "resetNotifications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutputBucket() {
        software.amazon.jsii.Kernel.call(this, "resetOutputBucket", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThumbnailConfig() {
        software.amazon.jsii.Kernel.call(this, "resetThumbnailConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThumbnailConfigPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetThumbnailConfigPermissions", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "inputBucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "roleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAwsKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "awsKmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineContentConfig> getContentConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPipelineContentConfig>)(software.amazon.jsii.Kernel.get(this, "contentConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineContentConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions> getContentConfigPermissionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions>)(software.amazon.jsii.Kernel.get(this, "contentConfigPermissionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineContentConfigPermissions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineNotifications> getNotificationsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPipelineNotifications>)(software.amazon.jsii.Kernel.get(this, "notificationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineNotifications.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOutputBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "outputBucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig> getThumbnailConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig>)(software.amazon.jsii.Kernel.get(this, "thumbnailConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineThumbnailConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> getThumbnailConfigPermissionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions>)(software.amazon.jsii.Kernel.get(this, "thumbnailConfigPermissionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAwsKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "awsKmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAwsKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "awsKmsKeyArn", java.util.Objects.requireNonNull(value, "awsKmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineContentConfig> getContentConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "contentConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineContentConfig.class))));
    }

    public void setContentConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineContentConfig> value) {
        software.amazon.jsii.Kernel.set(this, "contentConfig", java.util.Objects.requireNonNull(value, "contentConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions> getContentConfigPermissions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "contentConfigPermissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineContentConfigPermissions.class))));
    }

    public void setContentConfigPermissions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions> value) {
        software.amazon.jsii.Kernel.set(this, "contentConfigPermissions", java.util.Objects.requireNonNull(value, "contentConfigPermissions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputBucket() {
        return software.amazon.jsii.Kernel.get(this, "inputBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInputBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inputBucket", java.util.Objects.requireNonNull(value, "inputBucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineNotifications> getNotifications() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "notifications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineNotifications.class))));
    }

    public void setNotifications(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineNotifications> value) {
        software.amazon.jsii.Kernel.set(this, "notifications", java.util.Objects.requireNonNull(value, "notifications is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutputBucket() {
        return software.amazon.jsii.Kernel.get(this, "outputBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOutputBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "outputBucket", java.util.Objects.requireNonNull(value, "outputBucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRole() {
        return software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "role", java.util.Objects.requireNonNull(value, "role is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig> getThumbnailConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "thumbnailConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineThumbnailConfig.class))));
    }

    public void setThumbnailConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig> value) {
        software.amazon.jsii.Kernel.set(this, "thumbnailConfig", java.util.Objects.requireNonNull(value, "thumbnailConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> getThumbnailConfigPermissions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "thumbnailConfigPermissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions.class))));
    }

    public void setThumbnailConfigPermissions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> value) {
        software.amazon.jsii.Kernel.set(this, "thumbnailConfigPermissions", java.util.Objects.requireNonNull(value, "thumbnailConfigPermissions is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ElastictranscoderPipeline}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ElastictranscoderPipeline> {
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
        private final imports.aws.ElastictranscoderPipelineConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ElastictranscoderPipelineConfig.Builder();
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
         * @param inputBucket This parameter is required.
         */
        public Builder inputBucket(final java.lang.String inputBucket) {
            this.config.inputBucket(inputBucket);
            return this;
        }

        /**
         * @return {@code this}
         * @param role This parameter is required.
         */
        public Builder role(final java.lang.String role) {
            this.config.role(role);
            return this;
        }

        /**
         * @return {@code this}
         * @param awsKmsKeyArn This parameter is required.
         */
        public Builder awsKmsKeyArn(final java.lang.String awsKmsKeyArn) {
            this.config.awsKmsKeyArn(awsKmsKeyArn);
            return this;
        }

        /**
         * content_config block.
         * <p>
         * @return {@code this}
         * @param contentConfig content_config block. This parameter is required.
         */
        public Builder contentConfig(final java.util.List<? extends imports.aws.ElastictranscoderPipelineContentConfig> contentConfig) {
            this.config.contentConfig(contentConfig);
            return this;
        }

        /**
         * content_config_permissions block.
         * <p>
         * @return {@code this}
         * @param contentConfigPermissions content_config_permissions block. This parameter is required.
         */
        public Builder contentConfigPermissions(final java.util.List<? extends imports.aws.ElastictranscoderPipelineContentConfigPermissions> contentConfigPermissions) {
            this.config.contentConfigPermissions(contentConfigPermissions);
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
         * notifications block.
         * <p>
         * @return {@code this}
         * @param notifications notifications block. This parameter is required.
         */
        public Builder notifications(final java.util.List<? extends imports.aws.ElastictranscoderPipelineNotifications> notifications) {
            this.config.notifications(notifications);
            return this;
        }

        /**
         * @return {@code this}
         * @param outputBucket This parameter is required.
         */
        public Builder outputBucket(final java.lang.String outputBucket) {
            this.config.outputBucket(outputBucket);
            return this;
        }

        /**
         * thumbnail_config block.
         * <p>
         * @return {@code this}
         * @param thumbnailConfig thumbnail_config block. This parameter is required.
         */
        public Builder thumbnailConfig(final java.util.List<? extends imports.aws.ElastictranscoderPipelineThumbnailConfig> thumbnailConfig) {
            this.config.thumbnailConfig(thumbnailConfig);
            return this;
        }

        /**
         * thumbnail_config_permissions block.
         * <p>
         * @return {@code this}
         * @param thumbnailConfigPermissions thumbnail_config_permissions block. This parameter is required.
         */
        public Builder thumbnailConfigPermissions(final java.util.List<? extends imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> thumbnailConfigPermissions) {
            this.config.thumbnailConfigPermissions(thumbnailConfigPermissions);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ElastictranscoderPipeline}.
         */
        @Override
        public imports.aws.ElastictranscoderPipeline build() {
            return new imports.aws.ElastictranscoderPipeline(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
