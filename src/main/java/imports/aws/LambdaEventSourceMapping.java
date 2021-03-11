package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.672Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaEventSourceMapping")
public class LambdaEventSourceMapping extends com.hashicorp.cdktf.TerraformResource {

    protected LambdaEventSourceMapping(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaEventSourceMapping(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LambdaEventSourceMapping(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.LambdaEventSourceMappingConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBatchSize() {
        software.amazon.jsii.Kernel.call(this, "resetBatchSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBisectBatchOnFunctionError() {
        software.amazon.jsii.Kernel.call(this, "resetBisectBatchOnFunctionError", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDestinationConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDestinationConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumBatchingWindowInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumBatchingWindowInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumRecordAgeInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumRecordAgeInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumRetryAttempts() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumRetryAttempts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParallelizationFactor() {
        software.amazon.jsii.Kernel.call(this, "resetParallelizationFactor", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartingPosition() {
        software.amazon.jsii.Kernel.call(this, "resetStartingPosition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartingPositionTimestamp() {
        software.amazon.jsii.Kernel.call(this, "resetStartingPositionTimestamp", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventSourceArnInput() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionArn() {
        return software.amazon.jsii.Kernel.get(this, "functionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionNameInput() {
        return software.amazon.jsii.Kernel.get(this, "functionNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModified() {
        return software.amazon.jsii.Kernel.get(this, "lastModified", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastProcessingResult() {
        return software.amazon.jsii.Kernel.get(this, "lastProcessingResult", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateTransitionReason() {
        return software.amazon.jsii.Kernel.get(this, "stateTransitionReason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUuid() {
        return software.amazon.jsii.Kernel.get(this, "uuid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBatchSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "batchSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBisectBatchOnFunctionErrorInput() {
        return software.amazon.jsii.Kernel.get(this, "bisectBatchOnFunctionErrorInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig> getDestinationConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig>)(software.amazon.jsii.Kernel.get(this, "destinationConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaEventSourceMappingDestinationConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumBatchingWindowInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumBatchingWindowInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRecordAgeInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumRecordAgeInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRetryAttemptsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumRetryAttemptsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getParallelizationFactorInput() {
        return software.amazon.jsii.Kernel.get(this, "parallelizationFactorInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStartingPositionInput() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStartingPositionTimestampInput() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionTimestampInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBatchSize() {
        return software.amazon.jsii.Kernel.get(this, "batchSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBatchSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "batchSize", java.util.Objects.requireNonNull(value, "batchSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getBisectBatchOnFunctionError() {
        return software.amazon.jsii.Kernel.get(this, "bisectBatchOnFunctionError", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBisectBatchOnFunctionError(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "bisectBatchOnFunctionError", java.util.Objects.requireNonNull(value, "bisectBatchOnFunctionError is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig> getDestinationConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "destinationConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaEventSourceMappingDestinationConfig.class))));
    }

    public void setDestinationConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig> value) {
        software.amazon.jsii.Kernel.set(this, "destinationConfig", java.util.Objects.requireNonNull(value, "destinationConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventSourceArn() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventSourceArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventSourceArn", java.util.Objects.requireNonNull(value, "eventSourceArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionName() {
        return software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFunctionName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "functionName", java.util.Objects.requireNonNull(value, "functionName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumBatchingWindowInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "maximumBatchingWindowInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumBatchingWindowInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumBatchingWindowInSeconds", java.util.Objects.requireNonNull(value, "maximumBatchingWindowInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumRecordAgeInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "maximumRecordAgeInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumRecordAgeInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumRecordAgeInSeconds", java.util.Objects.requireNonNull(value, "maximumRecordAgeInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumRetryAttempts() {
        return software.amazon.jsii.Kernel.get(this, "maximumRetryAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumRetryAttempts(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumRetryAttempts", java.util.Objects.requireNonNull(value, "maximumRetryAttempts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getParallelizationFactor() {
        return software.amazon.jsii.Kernel.get(this, "parallelizationFactor", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setParallelizationFactor(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "parallelizationFactor", java.util.Objects.requireNonNull(value, "parallelizationFactor is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStartingPosition() {
        return software.amazon.jsii.Kernel.get(this, "startingPosition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStartingPosition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "startingPosition", java.util.Objects.requireNonNull(value, "startingPosition is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStartingPositionTimestamp() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStartingPositionTimestamp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "startingPositionTimestamp", java.util.Objects.requireNonNull(value, "startingPositionTimestamp is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.LambdaEventSourceMapping}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LambdaEventSourceMapping> {
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
        private final imports.aws.LambdaEventSourceMappingConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.LambdaEventSourceMappingConfig.Builder();
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
         * @param eventSourceArn This parameter is required.
         */
        public Builder eventSourceArn(final java.lang.String eventSourceArn) {
            this.config.eventSourceArn(eventSourceArn);
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
         * @param batchSize This parameter is required.
         */
        public Builder batchSize(final java.lang.Number batchSize) {
            this.config.batchSize(batchSize);
            return this;
        }

        /**
         * @return {@code this}
         * @param bisectBatchOnFunctionError This parameter is required.
         */
        public Builder bisectBatchOnFunctionError(final java.lang.Boolean bisectBatchOnFunctionError) {
            this.config.bisectBatchOnFunctionError(bisectBatchOnFunctionError);
            return this;
        }

        /**
         * destination_config block.
         * <p>
         * @return {@code this}
         * @param destinationConfig destination_config block. This parameter is required.
         */
        public Builder destinationConfig(final java.util.List<? extends imports.aws.LambdaEventSourceMappingDestinationConfig> destinationConfig) {
            this.config.destinationConfig(destinationConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param enabled This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param maximumBatchingWindowInSeconds This parameter is required.
         */
        public Builder maximumBatchingWindowInSeconds(final java.lang.Number maximumBatchingWindowInSeconds) {
            this.config.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
            return this;
        }

        /**
         * @return {@code this}
         * @param maximumRecordAgeInSeconds This parameter is required.
         */
        public Builder maximumRecordAgeInSeconds(final java.lang.Number maximumRecordAgeInSeconds) {
            this.config.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds);
            return this;
        }

        /**
         * @return {@code this}
         * @param maximumRetryAttempts This parameter is required.
         */
        public Builder maximumRetryAttempts(final java.lang.Number maximumRetryAttempts) {
            this.config.maximumRetryAttempts(maximumRetryAttempts);
            return this;
        }

        /**
         * @return {@code this}
         * @param parallelizationFactor This parameter is required.
         */
        public Builder parallelizationFactor(final java.lang.Number parallelizationFactor) {
            this.config.parallelizationFactor(parallelizationFactor);
            return this;
        }

        /**
         * @return {@code this}
         * @param startingPosition This parameter is required.
         */
        public Builder startingPosition(final java.lang.String startingPosition) {
            this.config.startingPosition(startingPosition);
            return this;
        }

        /**
         * @return {@code this}
         * @param startingPositionTimestamp This parameter is required.
         */
        public Builder startingPositionTimestamp(final java.lang.String startingPositionTimestamp) {
            this.config.startingPositionTimestamp(startingPositionTimestamp);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.LambdaEventSourceMapping}.
         */
        @Override
        public imports.aws.LambdaEventSourceMapping build() {
            return new imports.aws.LambdaEventSourceMapping(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
