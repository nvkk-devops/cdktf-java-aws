package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.675Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaFunctionConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaFunctionConfig.Jsii$Proxy.class)
public interface LambdaFunctionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getFunctionName();

    @org.jetbrains.annotations.NotNull java.lang.String getHandler();

    @org.jetbrains.annotations.NotNull java.lang.String getRole();

    @org.jetbrains.annotations.NotNull java.lang.String getRuntime();

    /**
     * dead_letter_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionDeadLetterConfig> getDeadLetterConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * environment block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionEnvironment> getEnvironment() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFilename() {
        return null;
    }

    /**
     * file_system_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionFileSystemConfig> getFileSystemConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLayers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMemorySize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPublish() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getReservedConcurrentExecutions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3Bucket() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3Key() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3ObjectVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceCodeHash() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.LambdaFunctionTimeouts getTimeouts() {
        return null;
    }

    /**
     * tracing_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionTracingConfig> getTracingConfig() {
        return null;
    }

    /**
     * vpc_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionVpcConfig> getVpcConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaFunctionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaFunctionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaFunctionConfig> {
        private java.lang.String functionName;
        private java.lang.String handler;
        private java.lang.String role;
        private java.lang.String runtime;
        private java.util.List<imports.aws.LambdaFunctionDeadLetterConfig> deadLetterConfig;
        private java.lang.String description;
        private java.util.List<imports.aws.LambdaFunctionEnvironment> environment;
        private java.lang.String filename;
        private java.util.List<imports.aws.LambdaFunctionFileSystemConfig> fileSystemConfig;
        private java.lang.String kmsKeyArn;
        private java.util.List<java.lang.String> layers;
        private java.lang.Number memorySize;
        private java.lang.Boolean publish;
        private java.lang.Number reservedConcurrentExecutions;
        private java.lang.String s3Bucket;
        private java.lang.String s3Key;
        private java.lang.String s3ObjectVersion;
        private java.lang.String sourceCodeHash;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number timeout;
        private imports.aws.LambdaFunctionTimeouts timeouts;
        private java.util.List<imports.aws.LambdaFunctionTracingConfig> tracingConfig;
        private java.util.List<imports.aws.LambdaFunctionVpcConfig> vpcConfig;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LambdaFunctionConfig#getFunctionName}
         * @param functionName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder functionName(java.lang.String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getHandler}
         * @param handler the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder handler(java.lang.String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getRole}
         * @param role the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getRuntime}
         * @param runtime the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder runtime(java.lang.String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getDeadLetterConfig}
         * @param deadLetterConfig dead_letter_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder deadLetterConfig(java.util.List<? extends imports.aws.LambdaFunctionDeadLetterConfig> deadLetterConfig) {
            this.deadLetterConfig = (java.util.List<imports.aws.LambdaFunctionDeadLetterConfig>)deadLetterConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getEnvironment}
         * @param environment environment block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder environment(java.util.List<? extends imports.aws.LambdaFunctionEnvironment> environment) {
            this.environment = (java.util.List<imports.aws.LambdaFunctionEnvironment>)environment;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getFilename}
         * @param filename the value to be set.
         * @return {@code this}
         */
        public Builder filename(java.lang.String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getFileSystemConfig}
         * @param fileSystemConfig file_system_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fileSystemConfig(java.util.List<? extends imports.aws.LambdaFunctionFileSystemConfig> fileSystemConfig) {
            this.fileSystemConfig = (java.util.List<imports.aws.LambdaFunctionFileSystemConfig>)fileSystemConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getLayers}
         * @param layers the value to be set.
         * @return {@code this}
         */
        public Builder layers(java.util.List<java.lang.String> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getMemorySize}
         * @param memorySize the value to be set.
         * @return {@code this}
         */
        public Builder memorySize(java.lang.Number memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getPublish}
         * @param publish the value to be set.
         * @return {@code this}
         */
        public Builder publish(java.lang.Boolean publish) {
            this.publish = publish;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getReservedConcurrentExecutions}
         * @param reservedConcurrentExecutions the value to be set.
         * @return {@code this}
         */
        public Builder reservedConcurrentExecutions(java.lang.Number reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getS3Bucket}
         * @param s3Bucket the value to be set.
         * @return {@code this}
         */
        public Builder s3Bucket(java.lang.String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getS3Key}
         * @param s3Key the value to be set.
         * @return {@code this}
         */
        public Builder s3Key(java.lang.String s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getS3ObjectVersion}
         * @param s3ObjectVersion the value to be set.
         * @return {@code this}
         */
        public Builder s3ObjectVersion(java.lang.String s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getSourceCodeHash}
         * @param sourceCodeHash the value to be set.
         * @return {@code this}
         */
        public Builder sourceCodeHash(java.lang.String sourceCodeHash) {
            this.sourceCodeHash = sourceCodeHash;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getTimeout}
         * @param timeout the value to be set.
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.LambdaFunctionTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getTracingConfig}
         * @param tracingConfig tracing_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tracingConfig(java.util.List<? extends imports.aws.LambdaFunctionTracingConfig> tracingConfig) {
            this.tracingConfig = (java.util.List<imports.aws.LambdaFunctionTracingConfig>)tracingConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getVpcConfig}
         * @param vpcConfig vpc_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder vpcConfig(java.util.List<? extends imports.aws.LambdaFunctionVpcConfig> vpcConfig) {
            this.vpcConfig = (java.util.List<imports.aws.LambdaFunctionVpcConfig>)vpcConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getDependsOn}
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
         * Sets the value of {@link LambdaFunctionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionConfig#getProvider}
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
         * @return a new instance of {@link LambdaFunctionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaFunctionConfig build() {
            return new Jsii$Proxy(functionName, handler, role, runtime, deadLetterConfig, description, environment, filename, fileSystemConfig, kmsKeyArn, layers, memorySize, publish, reservedConcurrentExecutions, s3Bucket, s3Key, s3ObjectVersion, sourceCodeHash, tags, timeout, timeouts, tracingConfig, vpcConfig, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LambdaFunctionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaFunctionConfig {
        private final java.lang.String functionName;
        private final java.lang.String handler;
        private final java.lang.String role;
        private final java.lang.String runtime;
        private final java.util.List<imports.aws.LambdaFunctionDeadLetterConfig> deadLetterConfig;
        private final java.lang.String description;
        private final java.util.List<imports.aws.LambdaFunctionEnvironment> environment;
        private final java.lang.String filename;
        private final java.util.List<imports.aws.LambdaFunctionFileSystemConfig> fileSystemConfig;
        private final java.lang.String kmsKeyArn;
        private final java.util.List<java.lang.String> layers;
        private final java.lang.Number memorySize;
        private final java.lang.Boolean publish;
        private final java.lang.Number reservedConcurrentExecutions;
        private final java.lang.String s3Bucket;
        private final java.lang.String s3Key;
        private final java.lang.String s3ObjectVersion;
        private final java.lang.String sourceCodeHash;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number timeout;
        private final imports.aws.LambdaFunctionTimeouts timeouts;
        private final java.util.List<imports.aws.LambdaFunctionTracingConfig> tracingConfig;
        private final java.util.List<imports.aws.LambdaFunctionVpcConfig> vpcConfig;
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
            this.functionName = software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.handler = software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.role = software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runtime = software.amazon.jsii.Kernel.get(this, "runtime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deadLetterConfig = software.amazon.jsii.Kernel.get(this, "deadLetterConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionDeadLetterConfig.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.environment = software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionEnvironment.class)));
            this.filename = software.amazon.jsii.Kernel.get(this, "filename", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fileSystemConfig = software.amazon.jsii.Kernel.get(this, "fileSystemConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionFileSystemConfig.class)));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.layers = software.amazon.jsii.Kernel.get(this, "layers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.memorySize = software.amazon.jsii.Kernel.get(this, "memorySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.publish = software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.reservedConcurrentExecutions = software.amazon.jsii.Kernel.get(this, "reservedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.s3Bucket = software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Key = software.amazon.jsii.Kernel.get(this, "s3Key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ObjectVersion = software.amazon.jsii.Kernel.get(this, "s3ObjectVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceCodeHash = software.amazon.jsii.Kernel.get(this, "sourceCodeHash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionTimeouts.class));
            this.tracingConfig = software.amazon.jsii.Kernel.get(this, "tracingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionTracingConfig.class)));
            this.vpcConfig = software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionVpcConfig.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String functionName, final java.lang.String handler, final java.lang.String role, final java.lang.String runtime, final java.util.List<? extends imports.aws.LambdaFunctionDeadLetterConfig> deadLetterConfig, final java.lang.String description, final java.util.List<? extends imports.aws.LambdaFunctionEnvironment> environment, final java.lang.String filename, final java.util.List<? extends imports.aws.LambdaFunctionFileSystemConfig> fileSystemConfig, final java.lang.String kmsKeyArn, final java.util.List<java.lang.String> layers, final java.lang.Number memorySize, final java.lang.Boolean publish, final java.lang.Number reservedConcurrentExecutions, final java.lang.String s3Bucket, final java.lang.String s3Key, final java.lang.String s3ObjectVersion, final java.lang.String sourceCodeHash, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number timeout, final imports.aws.LambdaFunctionTimeouts timeouts, final java.util.List<? extends imports.aws.LambdaFunctionTracingConfig> tracingConfig, final java.util.List<? extends imports.aws.LambdaFunctionVpcConfig> vpcConfig, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.functionName = java.util.Objects.requireNonNull(functionName, "functionName is required");
            this.handler = java.util.Objects.requireNonNull(handler, "handler is required");
            this.role = java.util.Objects.requireNonNull(role, "role is required");
            this.runtime = java.util.Objects.requireNonNull(runtime, "runtime is required");
            this.deadLetterConfig = (java.util.List<imports.aws.LambdaFunctionDeadLetterConfig>)deadLetterConfig;
            this.description = description;
            this.environment = (java.util.List<imports.aws.LambdaFunctionEnvironment>)environment;
            this.filename = filename;
            this.fileSystemConfig = (java.util.List<imports.aws.LambdaFunctionFileSystemConfig>)fileSystemConfig;
            this.kmsKeyArn = kmsKeyArn;
            this.layers = layers;
            this.memorySize = memorySize;
            this.publish = publish;
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            this.s3Bucket = s3Bucket;
            this.s3Key = s3Key;
            this.s3ObjectVersion = s3ObjectVersion;
            this.sourceCodeHash = sourceCodeHash;
            this.tags = tags;
            this.timeout = timeout;
            this.timeouts = timeouts;
            this.tracingConfig = (java.util.List<imports.aws.LambdaFunctionTracingConfig>)tracingConfig;
            this.vpcConfig = (java.util.List<imports.aws.LambdaFunctionVpcConfig>)vpcConfig;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getFunctionName() {
            return this.functionName;
        }

        @Override
        public final java.lang.String getHandler() {
            return this.handler;
        }

        @Override
        public final java.lang.String getRole() {
            return this.role;
        }

        @Override
        public final java.lang.String getRuntime() {
            return this.runtime;
        }

        @Override
        public final java.util.List<imports.aws.LambdaFunctionDeadLetterConfig> getDeadLetterConfig() {
            return this.deadLetterConfig;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.LambdaFunctionEnvironment> getEnvironment() {
            return this.environment;
        }

        @Override
        public final java.lang.String getFilename() {
            return this.filename;
        }

        @Override
        public final java.util.List<imports.aws.LambdaFunctionFileSystemConfig> getFileSystemConfig() {
            return this.fileSystemConfig;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.util.List<java.lang.String> getLayers() {
            return this.layers;
        }

        @Override
        public final java.lang.Number getMemorySize() {
            return this.memorySize;
        }

        @Override
        public final java.lang.Boolean getPublish() {
            return this.publish;
        }

        @Override
        public final java.lang.Number getReservedConcurrentExecutions() {
            return this.reservedConcurrentExecutions;
        }

        @Override
        public final java.lang.String getS3Bucket() {
            return this.s3Bucket;
        }

        @Override
        public final java.lang.String getS3Key() {
            return this.s3Key;
        }

        @Override
        public final java.lang.String getS3ObjectVersion() {
            return this.s3ObjectVersion;
        }

        @Override
        public final java.lang.String getSourceCodeHash() {
            return this.sourceCodeHash;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        public final imports.aws.LambdaFunctionTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.util.List<imports.aws.LambdaFunctionTracingConfig> getTracingConfig() {
            return this.tracingConfig;
        }

        @Override
        public final java.util.List<imports.aws.LambdaFunctionVpcConfig> getVpcConfig() {
            return this.vpcConfig;
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

            data.set("functionName", om.valueToTree(this.getFunctionName()));
            data.set("handler", om.valueToTree(this.getHandler()));
            data.set("role", om.valueToTree(this.getRole()));
            data.set("runtime", om.valueToTree(this.getRuntime()));
            if (this.getDeadLetterConfig() != null) {
                data.set("deadLetterConfig", om.valueToTree(this.getDeadLetterConfig()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEnvironment() != null) {
                data.set("environment", om.valueToTree(this.getEnvironment()));
            }
            if (this.getFilename() != null) {
                data.set("filename", om.valueToTree(this.getFilename()));
            }
            if (this.getFileSystemConfig() != null) {
                data.set("fileSystemConfig", om.valueToTree(this.getFileSystemConfig()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getLayers() != null) {
                data.set("layers", om.valueToTree(this.getLayers()));
            }
            if (this.getMemorySize() != null) {
                data.set("memorySize", om.valueToTree(this.getMemorySize()));
            }
            if (this.getPublish() != null) {
                data.set("publish", om.valueToTree(this.getPublish()));
            }
            if (this.getReservedConcurrentExecutions() != null) {
                data.set("reservedConcurrentExecutions", om.valueToTree(this.getReservedConcurrentExecutions()));
            }
            if (this.getS3Bucket() != null) {
                data.set("s3Bucket", om.valueToTree(this.getS3Bucket()));
            }
            if (this.getS3Key() != null) {
                data.set("s3Key", om.valueToTree(this.getS3Key()));
            }
            if (this.getS3ObjectVersion() != null) {
                data.set("s3ObjectVersion", om.valueToTree(this.getS3ObjectVersion()));
            }
            if (this.getSourceCodeHash() != null) {
                data.set("sourceCodeHash", om.valueToTree(this.getSourceCodeHash()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getTracingConfig() != null) {
                data.set("tracingConfig", om.valueToTree(this.getTracingConfig()));
            }
            if (this.getVpcConfig() != null) {
                data.set("vpcConfig", om.valueToTree(this.getVpcConfig()));
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
            struct.set("fqn", om.valueToTree("aws.LambdaFunctionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaFunctionConfig.Jsii$Proxy that = (LambdaFunctionConfig.Jsii$Proxy) o;

            if (!functionName.equals(that.functionName)) return false;
            if (!handler.equals(that.handler)) return false;
            if (!role.equals(that.role)) return false;
            if (!runtime.equals(that.runtime)) return false;
            if (this.deadLetterConfig != null ? !this.deadLetterConfig.equals(that.deadLetterConfig) : that.deadLetterConfig != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.environment != null ? !this.environment.equals(that.environment) : that.environment != null) return false;
            if (this.filename != null ? !this.filename.equals(that.filename) : that.filename != null) return false;
            if (this.fileSystemConfig != null ? !this.fileSystemConfig.equals(that.fileSystemConfig) : that.fileSystemConfig != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.layers != null ? !this.layers.equals(that.layers) : that.layers != null) return false;
            if (this.memorySize != null ? !this.memorySize.equals(that.memorySize) : that.memorySize != null) return false;
            if (this.publish != null ? !this.publish.equals(that.publish) : that.publish != null) return false;
            if (this.reservedConcurrentExecutions != null ? !this.reservedConcurrentExecutions.equals(that.reservedConcurrentExecutions) : that.reservedConcurrentExecutions != null) return false;
            if (this.s3Bucket != null ? !this.s3Bucket.equals(that.s3Bucket) : that.s3Bucket != null) return false;
            if (this.s3Key != null ? !this.s3Key.equals(that.s3Key) : that.s3Key != null) return false;
            if (this.s3ObjectVersion != null ? !this.s3ObjectVersion.equals(that.s3ObjectVersion) : that.s3ObjectVersion != null) return false;
            if (this.sourceCodeHash != null ? !this.sourceCodeHash.equals(that.sourceCodeHash) : that.sourceCodeHash != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeout != null ? !this.timeout.equals(that.timeout) : that.timeout != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.tracingConfig != null ? !this.tracingConfig.equals(that.tracingConfig) : that.tracingConfig != null) return false;
            if (this.vpcConfig != null ? !this.vpcConfig.equals(that.vpcConfig) : that.vpcConfig != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.functionName.hashCode();
            result = 31 * result + (this.handler.hashCode());
            result = 31 * result + (this.role.hashCode());
            result = 31 * result + (this.runtime.hashCode());
            result = 31 * result + (this.deadLetterConfig != null ? this.deadLetterConfig.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.environment != null ? this.environment.hashCode() : 0);
            result = 31 * result + (this.filename != null ? this.filename.hashCode() : 0);
            result = 31 * result + (this.fileSystemConfig != null ? this.fileSystemConfig.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.layers != null ? this.layers.hashCode() : 0);
            result = 31 * result + (this.memorySize != null ? this.memorySize.hashCode() : 0);
            result = 31 * result + (this.publish != null ? this.publish.hashCode() : 0);
            result = 31 * result + (this.reservedConcurrentExecutions != null ? this.reservedConcurrentExecutions.hashCode() : 0);
            result = 31 * result + (this.s3Bucket != null ? this.s3Bucket.hashCode() : 0);
            result = 31 * result + (this.s3Key != null ? this.s3Key.hashCode() : 0);
            result = 31 * result + (this.s3ObjectVersion != null ? this.s3ObjectVersion.hashCode() : 0);
            result = 31 * result + (this.sourceCodeHash != null ? this.sourceCodeHash.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.tracingConfig != null ? this.tracingConfig.hashCode() : 0);
            result = 31 * result + (this.vpcConfig != null ? this.vpcConfig.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
