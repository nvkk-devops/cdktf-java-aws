package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.153Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchEventTargetConfig")
@software.amazon.jsii.Jsii.Proxy(CloudwatchEventTargetConfig.Jsii$Proxy.class)
public interface CloudwatchEventTargetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getArn();

    @org.jetbrains.annotations.NotNull java.lang.String getRule();

    /**
     * batch_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetBatchTarget> getBatchTarget() {
        return null;
    }

    /**
     * ecs_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetEcsTarget> getEcsTarget() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInput() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInputPath() {
        return null;
    }

    /**
     * input_transformer block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetInputTransformer> getInputTransformer() {
        return null;
    }

    /**
     * kinesis_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget> getKinesisTarget() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRoleArn() {
        return null;
    }

    /**
     * run_command_targets block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets> getRunCommandTargets() {
        return null;
    }

    /**
     * sqs_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetSqsTarget> getSqsTarget() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTargetId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchEventTargetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchEventTargetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchEventTargetConfig> {
        private java.lang.String arn;
        private java.lang.String rule;
        private java.util.List<imports.aws.CloudwatchEventTargetBatchTarget> batchTarget;
        private java.util.List<imports.aws.CloudwatchEventTargetEcsTarget> ecsTarget;
        private java.lang.String input;
        private java.lang.String inputPath;
        private java.util.List<imports.aws.CloudwatchEventTargetInputTransformer> inputTransformer;
        private java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget> kinesisTarget;
        private java.lang.String roleArn;
        private java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets> runCommandTargets;
        private java.util.List<imports.aws.CloudwatchEventTargetSqsTarget> sqsTarget;
        private java.lang.String targetId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getArn}
         * @param arn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getRule}
         * @param rule the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getBatchTarget}
         * @param batchTarget batch_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder batchTarget(java.util.List<? extends imports.aws.CloudwatchEventTargetBatchTarget> batchTarget) {
            this.batchTarget = (java.util.List<imports.aws.CloudwatchEventTargetBatchTarget>)batchTarget;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getEcsTarget}
         * @param ecsTarget ecs_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ecsTarget(java.util.List<? extends imports.aws.CloudwatchEventTargetEcsTarget> ecsTarget) {
            this.ecsTarget = (java.util.List<imports.aws.CloudwatchEventTargetEcsTarget>)ecsTarget;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getInput}
         * @param input the value to be set.
         * @return {@code this}
         */
        public Builder input(java.lang.String input) {
            this.input = input;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getInputPath}
         * @param inputPath the value to be set.
         * @return {@code this}
         */
        public Builder inputPath(java.lang.String inputPath) {
            this.inputPath = inputPath;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getInputTransformer}
         * @param inputTransformer input_transformer block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder inputTransformer(java.util.List<? extends imports.aws.CloudwatchEventTargetInputTransformer> inputTransformer) {
            this.inputTransformer = (java.util.List<imports.aws.CloudwatchEventTargetInputTransformer>)inputTransformer;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getKinesisTarget}
         * @param kinesisTarget kinesis_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisTarget(java.util.List<? extends imports.aws.CloudwatchEventTargetKinesisTarget> kinesisTarget) {
            this.kinesisTarget = (java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget>)kinesisTarget;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getRoleArn}
         * @param roleArn the value to be set.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getRunCommandTargets}
         * @param runCommandTargets run_command_targets block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder runCommandTargets(java.util.List<? extends imports.aws.CloudwatchEventTargetRunCommandTargets> runCommandTargets) {
            this.runCommandTargets = (java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets>)runCommandTargets;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getSqsTarget}
         * @param sqsTarget sqs_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sqsTarget(java.util.List<? extends imports.aws.CloudwatchEventTargetSqsTarget> sqsTarget) {
            this.sqsTarget = (java.util.List<imports.aws.CloudwatchEventTargetSqsTarget>)sqsTarget;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getTargetId}
         * @param targetId the value to be set.
         * @return {@code this}
         */
        public Builder targetId(java.lang.String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getDependsOn}
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
         * Sets the value of {@link CloudwatchEventTargetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetConfig#getProvider}
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
         * @return a new instance of {@link CloudwatchEventTargetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchEventTargetConfig build() {
            return new Jsii$Proxy(arn, rule, batchTarget, ecsTarget, input, inputPath, inputTransformer, kinesisTarget, roleArn, runCommandTargets, sqsTarget, targetId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CloudwatchEventTargetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchEventTargetConfig {
        private final java.lang.String arn;
        private final java.lang.String rule;
        private final java.util.List<imports.aws.CloudwatchEventTargetBatchTarget> batchTarget;
        private final java.util.List<imports.aws.CloudwatchEventTargetEcsTarget> ecsTarget;
        private final java.lang.String input;
        private final java.lang.String inputPath;
        private final java.util.List<imports.aws.CloudwatchEventTargetInputTransformer> inputTransformer;
        private final java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget> kinesisTarget;
        private final java.lang.String roleArn;
        private final java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets> runCommandTargets;
        private final java.util.List<imports.aws.CloudwatchEventTargetSqsTarget> sqsTarget;
        private final java.lang.String targetId;
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
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.batchTarget = software.amazon.jsii.Kernel.get(this, "batchTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetBatchTarget.class)));
            this.ecsTarget = software.amazon.jsii.Kernel.get(this, "ecsTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetEcsTarget.class)));
            this.input = software.amazon.jsii.Kernel.get(this, "input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inputPath = software.amazon.jsii.Kernel.get(this, "inputPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inputTransformer = software.amazon.jsii.Kernel.get(this, "inputTransformer", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetInputTransformer.class)));
            this.kinesisTarget = software.amazon.jsii.Kernel.get(this, "kinesisTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetKinesisTarget.class)));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runCommandTargets = software.amazon.jsii.Kernel.get(this, "runCommandTargets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetRunCommandTargets.class)));
            this.sqsTarget = software.amazon.jsii.Kernel.get(this, "sqsTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetSqsTarget.class)));
            this.targetId = software.amazon.jsii.Kernel.get(this, "targetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String arn, final java.lang.String rule, final java.util.List<? extends imports.aws.CloudwatchEventTargetBatchTarget> batchTarget, final java.util.List<? extends imports.aws.CloudwatchEventTargetEcsTarget> ecsTarget, final java.lang.String input, final java.lang.String inputPath, final java.util.List<? extends imports.aws.CloudwatchEventTargetInputTransformer> inputTransformer, final java.util.List<? extends imports.aws.CloudwatchEventTargetKinesisTarget> kinesisTarget, final java.lang.String roleArn, final java.util.List<? extends imports.aws.CloudwatchEventTargetRunCommandTargets> runCommandTargets, final java.util.List<? extends imports.aws.CloudwatchEventTargetSqsTarget> sqsTarget, final java.lang.String targetId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arn = java.util.Objects.requireNonNull(arn, "arn is required");
            this.rule = java.util.Objects.requireNonNull(rule, "rule is required");
            this.batchTarget = (java.util.List<imports.aws.CloudwatchEventTargetBatchTarget>)batchTarget;
            this.ecsTarget = (java.util.List<imports.aws.CloudwatchEventTargetEcsTarget>)ecsTarget;
            this.input = input;
            this.inputPath = inputPath;
            this.inputTransformer = (java.util.List<imports.aws.CloudwatchEventTargetInputTransformer>)inputTransformer;
            this.kinesisTarget = (java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget>)kinesisTarget;
            this.roleArn = roleArn;
            this.runCommandTargets = (java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets>)runCommandTargets;
            this.sqsTarget = (java.util.List<imports.aws.CloudwatchEventTargetSqsTarget>)sqsTarget;
            this.targetId = targetId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchEventTargetBatchTarget> getBatchTarget() {
            return this.batchTarget;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchEventTargetEcsTarget> getEcsTarget() {
            return this.ecsTarget;
        }

        @Override
        public final java.lang.String getInput() {
            return this.input;
        }

        @Override
        public final java.lang.String getInputPath() {
            return this.inputPath;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchEventTargetInputTransformer> getInputTransformer() {
            return this.inputTransformer;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchEventTargetKinesisTarget> getKinesisTarget() {
            return this.kinesisTarget;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchEventTargetRunCommandTargets> getRunCommandTargets() {
            return this.runCommandTargets;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchEventTargetSqsTarget> getSqsTarget() {
            return this.sqsTarget;
        }

        @Override
        public final java.lang.String getTargetId() {
            return this.targetId;
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

            data.set("arn", om.valueToTree(this.getArn()));
            data.set("rule", om.valueToTree(this.getRule()));
            if (this.getBatchTarget() != null) {
                data.set("batchTarget", om.valueToTree(this.getBatchTarget()));
            }
            if (this.getEcsTarget() != null) {
                data.set("ecsTarget", om.valueToTree(this.getEcsTarget()));
            }
            if (this.getInput() != null) {
                data.set("input", om.valueToTree(this.getInput()));
            }
            if (this.getInputPath() != null) {
                data.set("inputPath", om.valueToTree(this.getInputPath()));
            }
            if (this.getInputTransformer() != null) {
                data.set("inputTransformer", om.valueToTree(this.getInputTransformer()));
            }
            if (this.getKinesisTarget() != null) {
                data.set("kinesisTarget", om.valueToTree(this.getKinesisTarget()));
            }
            if (this.getRoleArn() != null) {
                data.set("roleArn", om.valueToTree(this.getRoleArn()));
            }
            if (this.getRunCommandTargets() != null) {
                data.set("runCommandTargets", om.valueToTree(this.getRunCommandTargets()));
            }
            if (this.getSqsTarget() != null) {
                data.set("sqsTarget", om.valueToTree(this.getSqsTarget()));
            }
            if (this.getTargetId() != null) {
                data.set("targetId", om.valueToTree(this.getTargetId()));
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
            struct.set("fqn", om.valueToTree("aws.CloudwatchEventTargetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchEventTargetConfig.Jsii$Proxy that = (CloudwatchEventTargetConfig.Jsii$Proxy) o;

            if (!arn.equals(that.arn)) return false;
            if (!rule.equals(that.rule)) return false;
            if (this.batchTarget != null ? !this.batchTarget.equals(that.batchTarget) : that.batchTarget != null) return false;
            if (this.ecsTarget != null ? !this.ecsTarget.equals(that.ecsTarget) : that.ecsTarget != null) return false;
            if (this.input != null ? !this.input.equals(that.input) : that.input != null) return false;
            if (this.inputPath != null ? !this.inputPath.equals(that.inputPath) : that.inputPath != null) return false;
            if (this.inputTransformer != null ? !this.inputTransformer.equals(that.inputTransformer) : that.inputTransformer != null) return false;
            if (this.kinesisTarget != null ? !this.kinesisTarget.equals(that.kinesisTarget) : that.kinesisTarget != null) return false;
            if (this.roleArn != null ? !this.roleArn.equals(that.roleArn) : that.roleArn != null) return false;
            if (this.runCommandTargets != null ? !this.runCommandTargets.equals(that.runCommandTargets) : that.runCommandTargets != null) return false;
            if (this.sqsTarget != null ? !this.sqsTarget.equals(that.sqsTarget) : that.sqsTarget != null) return false;
            if (this.targetId != null ? !this.targetId.equals(that.targetId) : that.targetId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.arn.hashCode();
            result = 31 * result + (this.rule.hashCode());
            result = 31 * result + (this.batchTarget != null ? this.batchTarget.hashCode() : 0);
            result = 31 * result + (this.ecsTarget != null ? this.ecsTarget.hashCode() : 0);
            result = 31 * result + (this.input != null ? this.input.hashCode() : 0);
            result = 31 * result + (this.inputPath != null ? this.inputPath.hashCode() : 0);
            result = 31 * result + (this.inputTransformer != null ? this.inputTransformer.hashCode() : 0);
            result = 31 * result + (this.kinesisTarget != null ? this.kinesisTarget.hashCode() : 0);
            result = 31 * result + (this.roleArn != null ? this.roleArn.hashCode() : 0);
            result = 31 * result + (this.runCommandTargets != null ? this.runCommandTargets.hashCode() : 0);
            result = 31 * result + (this.sqsTarget != null ? this.sqsTarget.hashCode() : 0);
            result = 31 * result + (this.targetId != null ? this.targetId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
