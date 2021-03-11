package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.042Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncDatasource")
public class AppsyncDatasource extends com.hashicorp.cdktf.TerraformResource {

    protected AppsyncDatasource(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncDatasource(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AppsyncDatasource(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AppsyncDatasourceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodbConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodbConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearchConfig() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearchConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpConfig() {
        software.amazon.jsii.Kernel.call(this, "resetHttpConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetServiceRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig> getDynamodbConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig>)(software.amazon.jsii.Kernel.get(this, "dynamodbConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceDynamodbConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig> getElasticsearchConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig>)(software.amazon.jsii.Kernel.get(this, "elasticsearchConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceElasticsearchConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceHttpConfig> getHttpConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncDatasourceHttpConfig>)(software.amazon.jsii.Kernel.get(this, "httpConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceHttpConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceLambdaConfig> getLambdaConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppsyncDatasourceLambdaConfig>)(software.amazon.jsii.Kernel.get(this, "lambdaConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceLambdaConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig> getDynamodbConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dynamodbConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceDynamodbConfig.class))));
    }

    public void setDynamodbConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig> value) {
        software.amazon.jsii.Kernel.set(this, "dynamodbConfig", java.util.Objects.requireNonNull(value, "dynamodbConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig> getElasticsearchConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "elasticsearchConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceElasticsearchConfig.class))));
    }

    public void setElasticsearchConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig> value) {
        software.amazon.jsii.Kernel.set(this, "elasticsearchConfig", java.util.Objects.requireNonNull(value, "elasticsearchConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceHttpConfig> getHttpConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "httpConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceHttpConfig.class))));
    }

    public void setHttpConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceHttpConfig> value) {
        software.amazon.jsii.Kernel.set(this, "httpConfig", java.util.Objects.requireNonNull(value, "httpConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceLambdaConfig> getLambdaConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lambdaConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceLambdaConfig.class))));
    }

    public void setLambdaConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppsyncDatasourceLambdaConfig> value) {
        software.amazon.jsii.Kernel.set(this, "lambdaConfig", java.util.Objects.requireNonNull(value, "lambdaConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRoleArn", java.util.Objects.requireNonNull(value, "serviceRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AppsyncDatasource}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AppsyncDatasource> {
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
        private final imports.aws.AppsyncDatasourceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AppsyncDatasourceConfig.Builder();
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
         * @param apiId This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
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
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * dynamodb_config block.
         * <p>
         * @return {@code this}
         * @param dynamodbConfig dynamodb_config block. This parameter is required.
         */
        public Builder dynamodbConfig(final java.util.List<? extends imports.aws.AppsyncDatasourceDynamodbConfig> dynamodbConfig) {
            this.config.dynamodbConfig(dynamodbConfig);
            return this;
        }

        /**
         * elasticsearch_config block.
         * <p>
         * @return {@code this}
         * @param elasticsearchConfig elasticsearch_config block. This parameter is required.
         */
        public Builder elasticsearchConfig(final java.util.List<? extends imports.aws.AppsyncDatasourceElasticsearchConfig> elasticsearchConfig) {
            this.config.elasticsearchConfig(elasticsearchConfig);
            return this;
        }

        /**
         * http_config block.
         * <p>
         * @return {@code this}
         * @param httpConfig http_config block. This parameter is required.
         */
        public Builder httpConfig(final java.util.List<? extends imports.aws.AppsyncDatasourceHttpConfig> httpConfig) {
            this.config.httpConfig(httpConfig);
            return this;
        }

        /**
         * lambda_config block.
         * <p>
         * @return {@code this}
         * @param lambdaConfig lambda_config block. This parameter is required.
         */
        public Builder lambdaConfig(final java.util.List<? extends imports.aws.AppsyncDatasourceLambdaConfig> lambdaConfig) {
            this.config.lambdaConfig(lambdaConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceRoleArn This parameter is required.
         */
        public Builder serviceRoleArn(final java.lang.String serviceRoleArn) {
            this.config.serviceRoleArn(serviceRoleArn);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AppsyncDatasource}.
         */
        @Override
        public imports.aws.AppsyncDatasource build() {
            return new imports.aws.AppsyncDatasource(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
