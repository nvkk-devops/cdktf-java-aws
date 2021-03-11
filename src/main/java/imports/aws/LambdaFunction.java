package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.674Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaFunction")
public class LambdaFunction extends com.hashicorp.cdktf.TerraformResource {

    protected LambdaFunction(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaFunction(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LambdaFunction(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.LambdaFunctionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDeadLetterConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDeadLetterConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnvironment() {
        software.amazon.jsii.Kernel.call(this, "resetEnvironment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilename() {
        software.amazon.jsii.Kernel.call(this, "resetFilename", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFileSystemConfig() {
        software.amazon.jsii.Kernel.call(this, "resetFileSystemConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLayers() {
        software.amazon.jsii.Kernel.call(this, "resetLayers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMemorySize() {
        software.amazon.jsii.Kernel.call(this, "resetMemorySize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPublish() {
        software.amazon.jsii.Kernel.call(this, "resetPublish", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReservedConcurrentExecutions() {
        software.amazon.jsii.Kernel.call(this, "resetReservedConcurrentExecutions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Bucket() {
        software.amazon.jsii.Kernel.call(this, "resetS3Bucket", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Key() {
        software.amazon.jsii.Kernel.call(this, "resetS3Key", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3ObjectVersion() {
        software.amazon.jsii.Kernel.call(this, "resetS3ObjectVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceCodeHash() {
        software.amazon.jsii.Kernel.call(this, "resetSourceCodeHash", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTracingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetTracingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcConfig() {
        software.amazon.jsii.Kernel.call(this, "resetVpcConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionNameInput() {
        return software.amazon.jsii.Kernel.get(this, "functionNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHandlerInput() {
        return software.amazon.jsii.Kernel.get(this, "handlerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInvokeArn() {
        return software.amazon.jsii.Kernel.get(this, "invokeArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModified() {
        return software.amazon.jsii.Kernel.get(this, "lastModified", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQualifiedArn() {
        return software.amazon.jsii.Kernel.get(this, "qualifiedArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "roleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuntimeInput() {
        return software.amazon.jsii.Kernel.get(this, "runtimeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSourceCodeSize() {
        return software.amazon.jsii.Kernel.get(this, "sourceCodeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionDeadLetterConfig> getDeadLetterConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LambdaFunctionDeadLetterConfig>)(software.amazon.jsii.Kernel.get(this, "deadLetterConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionDeadLetterConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionEnvironment> getEnvironmentInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LambdaFunctionEnvironment>)(software.amazon.jsii.Kernel.get(this, "environmentInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionEnvironment.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFilenameInput() {
        return software.amazon.jsii.Kernel.get(this, "filenameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionFileSystemConfig> getFileSystemConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LambdaFunctionFileSystemConfig>)(software.amazon.jsii.Kernel.get(this, "fileSystemConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionFileSystemConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLayersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "layersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMemorySizeInput() {
        return software.amazon.jsii.Kernel.get(this, "memorySizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPublishInput() {
        return software.amazon.jsii.Kernel.get(this, "publishInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getReservedConcurrentExecutionsInput() {
        return software.amazon.jsii.Kernel.get(this, "reservedConcurrentExecutionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3BucketInput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3KeyInput() {
        return software.amazon.jsii.Kernel.get(this, "s3KeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3ObjectVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceCodeHashInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceCodeHashInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.LambdaFunctionTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionTracingConfig> getTracingConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LambdaFunctionTracingConfig>)(software.amazon.jsii.Kernel.get(this, "tracingConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionTracingConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionVpcConfig> getVpcConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LambdaFunctionVpcConfig>)(software.amazon.jsii.Kernel.get(this, "vpcConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionVpcConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionDeadLetterConfig> getDeadLetterConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "deadLetterConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionDeadLetterConfig.class))));
    }

    public void setDeadLetterConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionDeadLetterConfig> value) {
        software.amazon.jsii.Kernel.set(this, "deadLetterConfig", java.util.Objects.requireNonNull(value, "deadLetterConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionEnvironment> getEnvironment() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionEnvironment.class))));
    }

    public void setEnvironment(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionEnvironment> value) {
        software.amazon.jsii.Kernel.set(this, "environment", java.util.Objects.requireNonNull(value, "environment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFilename() {
        return software.amazon.jsii.Kernel.get(this, "filename", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFilename(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "filename", java.util.Objects.requireNonNull(value, "filename is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionFileSystemConfig> getFileSystemConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "fileSystemConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionFileSystemConfig.class))));
    }

    public void setFileSystemConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionFileSystemConfig> value) {
        software.amazon.jsii.Kernel.set(this, "fileSystemConfig", java.util.Objects.requireNonNull(value, "fileSystemConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionName() {
        return software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFunctionName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "functionName", java.util.Objects.requireNonNull(value, "functionName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHandler() {
        return software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHandler(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "handler", java.util.Objects.requireNonNull(value, "handler is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLayers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "layers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLayers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "layers", java.util.Objects.requireNonNull(value, "layers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMemorySize() {
        return software.amazon.jsii.Kernel.get(this, "memorySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMemorySize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "memorySize", java.util.Objects.requireNonNull(value, "memorySize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getPublish() {
        return software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPublish(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publish", java.util.Objects.requireNonNull(value, "publish is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getReservedConcurrentExecutions() {
        return software.amazon.jsii.Kernel.get(this, "reservedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setReservedConcurrentExecutions(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "reservedConcurrentExecutions", java.util.Objects.requireNonNull(value, "reservedConcurrentExecutions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRole() {
        return software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "role", java.util.Objects.requireNonNull(value, "role is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuntime() {
        return software.amazon.jsii.Kernel.get(this, "runtime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuntime(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "runtime", java.util.Objects.requireNonNull(value, "runtime is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3Bucket() {
        return software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Bucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Bucket", java.util.Objects.requireNonNull(value, "s3Bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3Key() {
        return software.amazon.jsii.Kernel.get(this, "s3Key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Key(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Key", java.util.Objects.requireNonNull(value, "s3Key is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3ObjectVersion() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3ObjectVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectVersion", java.util.Objects.requireNonNull(value, "s3ObjectVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceCodeHash() {
        return software.amazon.jsii.Kernel.get(this, "sourceCodeHash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceCodeHash(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceCodeHash", java.util.Objects.requireNonNull(value, "sourceCodeHash is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeout() {
        return software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeout", java.util.Objects.requireNonNull(value, "timeout is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.LambdaFunctionTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.LambdaFunctionTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionTracingConfig> getTracingConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "tracingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionTracingConfig.class))));
    }

    public void setTracingConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionTracingConfig> value) {
        software.amazon.jsii.Kernel.set(this, "tracingConfig", java.util.Objects.requireNonNull(value, "tracingConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionVpcConfig> getVpcConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionVpcConfig.class))));
    }

    public void setVpcConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaFunctionVpcConfig> value) {
        software.amazon.jsii.Kernel.set(this, "vpcConfig", java.util.Objects.requireNonNull(value, "vpcConfig is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.LambdaFunction}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LambdaFunction> {
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
        private final imports.aws.LambdaFunctionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.LambdaFunctionConfig.Builder();
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
         * @param functionName This parameter is required.
         */
        public Builder functionName(final java.lang.String functionName) {
            this.config.functionName(functionName);
            return this;
        }

        /**
         * @return {@code this}
         * @param handler This parameter is required.
         */
        public Builder handler(final java.lang.String handler) {
            this.config.handler(handler);
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
         * @param runtime This parameter is required.
         */
        public Builder runtime(final java.lang.String runtime) {
            this.config.runtime(runtime);
            return this;
        }

        /**
         * dead_letter_config block.
         * <p>
         * @return {@code this}
         * @param deadLetterConfig dead_letter_config block. This parameter is required.
         */
        public Builder deadLetterConfig(final java.util.List<? extends imports.aws.LambdaFunctionDeadLetterConfig> deadLetterConfig) {
            this.config.deadLetterConfig(deadLetterConfig);
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
         * environment block.
         * <p>
         * @return {@code this}
         * @param environment environment block. This parameter is required.
         */
        public Builder environment(final java.util.List<? extends imports.aws.LambdaFunctionEnvironment> environment) {
            this.config.environment(environment);
            return this;
        }

        /**
         * @return {@code this}
         * @param filename This parameter is required.
         */
        public Builder filename(final java.lang.String filename) {
            this.config.filename(filename);
            return this;
        }

        /**
         * file_system_config block.
         * <p>
         * @return {@code this}
         * @param fileSystemConfig file_system_config block. This parameter is required.
         */
        public Builder fileSystemConfig(final java.util.List<? extends imports.aws.LambdaFunctionFileSystemConfig> fileSystemConfig) {
            this.config.fileSystemConfig(fileSystemConfig);
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
         * @return {@code this}
         * @param layers This parameter is required.
         */
        public Builder layers(final java.util.List<java.lang.String> layers) {
            this.config.layers(layers);
            return this;
        }

        /**
         * @return {@code this}
         * @param memorySize This parameter is required.
         */
        public Builder memorySize(final java.lang.Number memorySize) {
            this.config.memorySize(memorySize);
            return this;
        }

        /**
         * @return {@code this}
         * @param publish This parameter is required.
         */
        public Builder publish(final java.lang.Boolean publish) {
            this.config.publish(publish);
            return this;
        }

        /**
         * @return {@code this}
         * @param reservedConcurrentExecutions This parameter is required.
         */
        public Builder reservedConcurrentExecutions(final java.lang.Number reservedConcurrentExecutions) {
            this.config.reservedConcurrentExecutions(reservedConcurrentExecutions);
            return this;
        }

        /**
         * @return {@code this}
         * @param s3Bucket This parameter is required.
         */
        public Builder s3Bucket(final java.lang.String s3Bucket) {
            this.config.s3Bucket(s3Bucket);
            return this;
        }

        /**
         * @return {@code this}
         * @param s3Key This parameter is required.
         */
        public Builder s3Key(final java.lang.String s3Key) {
            this.config.s3Key(s3Key);
            return this;
        }

        /**
         * @return {@code this}
         * @param s3ObjectVersion This parameter is required.
         */
        public Builder s3ObjectVersion(final java.lang.String s3ObjectVersion) {
            this.config.s3ObjectVersion(s3ObjectVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param sourceCodeHash This parameter is required.
         */
        public Builder sourceCodeHash(final java.lang.String sourceCodeHash) {
            this.config.sourceCodeHash(sourceCodeHash);
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
         * @param timeout This parameter is required.
         */
        public Builder timeout(final java.lang.Number timeout) {
            this.config.timeout(timeout);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.LambdaFunctionTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * tracing_config block.
         * <p>
         * @return {@code this}
         * @param tracingConfig tracing_config block. This parameter is required.
         */
        public Builder tracingConfig(final java.util.List<? extends imports.aws.LambdaFunctionTracingConfig> tracingConfig) {
            this.config.tracingConfig(tracingConfig);
            return this;
        }

        /**
         * vpc_config block.
         * <p>
         * @return {@code this}
         * @param vpcConfig vpc_config block. This parameter is required.
         */
        public Builder vpcConfig(final java.util.List<? extends imports.aws.LambdaFunctionVpcConfig> vpcConfig) {
            this.config.vpcConfig(vpcConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.LambdaFunction}.
         */
        @Override
        public imports.aws.LambdaFunction build() {
            return new imports.aws.LambdaFunction(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
