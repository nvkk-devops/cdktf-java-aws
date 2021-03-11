package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.152Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchEventTarget")
public class CloudwatchEventTarget extends com.hashicorp.cdktf.TerraformResource {

    protected CloudwatchEventTarget(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchEventTarget(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CloudwatchEventTarget(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CloudwatchEventTargetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBatchTarget() {
        software.amazon.jsii.Kernel.call(this, "resetBatchTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEcsTarget() {
        software.amazon.jsii.Kernel.call(this, "resetEcsTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInput() {
        software.amazon.jsii.Kernel.call(this, "resetInput", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInputPath() {
        software.amazon.jsii.Kernel.call(this, "resetInputPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInputTransformer() {
        software.amazon.jsii.Kernel.call(this, "resetInputTransformer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisTarget() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRunCommandTargets() {
        software.amazon.jsii.Kernel.call(this, "resetRunCommandTargets", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqsTarget() {
        software.amazon.jsii.Kernel.call(this, "resetSqsTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetId() {
        software.amazon.jsii.Kernel.call(this, "resetTargetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArnInput() {
        return software.amazon.jsii.Kernel.get(this, "arnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetBatchTarget> getBatchTargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudwatchEventTargetBatchTarget>)(software.amazon.jsii.Kernel.get(this, "batchTargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetBatchTarget.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetEcsTarget> getEcsTargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudwatchEventTargetEcsTarget>)(software.amazon.jsii.Kernel.get(this, "ecsTargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetEcsTarget.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputInput() {
        return software.amazon.jsii.Kernel.get(this, "inputInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputPathInput() {
        return software.amazon.jsii.Kernel.get(this, "inputPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetInputTransformer> getInputTransformerInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudwatchEventTargetInputTransformer>)(software.amazon.jsii.Kernel.get(this, "inputTransformerInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetInputTransformer.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget> getKinesisTargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget>)(software.amazon.jsii.Kernel.get(this, "kinesisTargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetKinesisTarget.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets> getRunCommandTargetsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets>)(software.amazon.jsii.Kernel.get(this, "runCommandTargetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetRunCommandTargets.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetSqsTarget> getSqsTargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudwatchEventTargetSqsTarget>)(software.amazon.jsii.Kernel.get(this, "sqsTargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetSqsTarget.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "targetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "arn", java.util.Objects.requireNonNull(value, "arn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetBatchTarget> getBatchTarget() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "batchTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetBatchTarget.class))));
    }

    public void setBatchTarget(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetBatchTarget> value) {
        software.amazon.jsii.Kernel.set(this, "batchTarget", java.util.Objects.requireNonNull(value, "batchTarget is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetEcsTarget> getEcsTarget() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ecsTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetEcsTarget.class))));
    }

    public void setEcsTarget(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetEcsTarget> value) {
        software.amazon.jsii.Kernel.set(this, "ecsTarget", java.util.Objects.requireNonNull(value, "ecsTarget is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInput() {
        return software.amazon.jsii.Kernel.get(this, "input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInput(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "input", java.util.Objects.requireNonNull(value, "input is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputPath() {
        return software.amazon.jsii.Kernel.get(this, "inputPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInputPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inputPath", java.util.Objects.requireNonNull(value, "inputPath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetInputTransformer> getInputTransformer() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "inputTransformer", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetInputTransformer.class))));
    }

    public void setInputTransformer(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetInputTransformer> value) {
        software.amazon.jsii.Kernel.set(this, "inputTransformer", java.util.Objects.requireNonNull(value, "inputTransformer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget> getKinesisTarget() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "kinesisTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetKinesisTarget.class))));
    }

    public void setKinesisTarget(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget> value) {
        software.amazon.jsii.Kernel.set(this, "kinesisTarget", java.util.Objects.requireNonNull(value, "kinesisTarget is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRule(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rule", java.util.Objects.requireNonNull(value, "rule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets> getRunCommandTargets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "runCommandTargets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetRunCommandTargets.class))));
    }

    public void setRunCommandTargets(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets> value) {
        software.amazon.jsii.Kernel.set(this, "runCommandTargets", java.util.Objects.requireNonNull(value, "runCommandTargets is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetSqsTarget> getSqsTarget() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "sqsTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetSqsTarget.class))));
    }

    public void setSqsTarget(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchEventTargetSqsTarget> value) {
        software.amazon.jsii.Kernel.set(this, "sqsTarget", java.util.Objects.requireNonNull(value, "sqsTarget is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetId() {
        return software.amazon.jsii.Kernel.get(this, "targetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetId", java.util.Objects.requireNonNull(value, "targetId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CloudwatchEventTarget}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CloudwatchEventTarget> {
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
        private final imports.aws.CloudwatchEventTargetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CloudwatchEventTargetConfig.Builder();
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
         * @param arn This parameter is required.
         */
        public Builder arn(final java.lang.String arn) {
            this.config.arn(arn);
            return this;
        }

        /**
         * @return {@code this}
         * @param rule This parameter is required.
         */
        public Builder rule(final java.lang.String rule) {
            this.config.rule(rule);
            return this;
        }

        /**
         * batch_target block.
         * <p>
         * @return {@code this}
         * @param batchTarget batch_target block. This parameter is required.
         */
        public Builder batchTarget(final java.util.List<? extends imports.aws.CloudwatchEventTargetBatchTarget> batchTarget) {
            this.config.batchTarget(batchTarget);
            return this;
        }

        /**
         * ecs_target block.
         * <p>
         * @return {@code this}
         * @param ecsTarget ecs_target block. This parameter is required.
         */
        public Builder ecsTarget(final java.util.List<? extends imports.aws.CloudwatchEventTargetEcsTarget> ecsTarget) {
            this.config.ecsTarget(ecsTarget);
            return this;
        }

        /**
         * @return {@code this}
         * @param input This parameter is required.
         */
        public Builder input(final java.lang.String input) {
            this.config.input(input);
            return this;
        }

        /**
         * @return {@code this}
         * @param inputPath This parameter is required.
         */
        public Builder inputPath(final java.lang.String inputPath) {
            this.config.inputPath(inputPath);
            return this;
        }

        /**
         * input_transformer block.
         * <p>
         * @return {@code this}
         * @param inputTransformer input_transformer block. This parameter is required.
         */
        public Builder inputTransformer(final java.util.List<? extends imports.aws.CloudwatchEventTargetInputTransformer> inputTransformer) {
            this.config.inputTransformer(inputTransformer);
            return this;
        }

        /**
         * kinesis_target block.
         * <p>
         * @return {@code this}
         * @param kinesisTarget kinesis_target block. This parameter is required.
         */
        public Builder kinesisTarget(final java.util.List<? extends imports.aws.CloudwatchEventTargetKinesisTarget> kinesisTarget) {
            this.config.kinesisTarget(kinesisTarget);
            return this;
        }

        /**
         * @return {@code this}
         * @param roleArn This parameter is required.
         */
        public Builder roleArn(final java.lang.String roleArn) {
            this.config.roleArn(roleArn);
            return this;
        }

        /**
         * run_command_targets block.
         * <p>
         * @return {@code this}
         * @param runCommandTargets run_command_targets block. This parameter is required.
         */
        public Builder runCommandTargets(final java.util.List<? extends imports.aws.CloudwatchEventTargetRunCommandTargets> runCommandTargets) {
            this.config.runCommandTargets(runCommandTargets);
            return this;
        }

        /**
         * sqs_target block.
         * <p>
         * @return {@code this}
         * @param sqsTarget sqs_target block. This parameter is required.
         */
        public Builder sqsTarget(final java.util.List<? extends imports.aws.CloudwatchEventTargetSqsTarget> sqsTarget) {
            this.config.sqsTarget(sqsTarget);
            return this;
        }

        /**
         * @return {@code this}
         * @param targetId This parameter is required.
         */
        public Builder targetId(final java.lang.String targetId) {
            this.config.targetId(targetId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CloudwatchEventTarget}.
         */
        @Override
        public imports.aws.CloudwatchEventTarget build() {
            return new imports.aws.CloudwatchEventTarget(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
