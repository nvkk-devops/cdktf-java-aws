package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.066Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingPolicy")
public class AutoscalingPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected AutoscalingPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AutoscalingPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AutoscalingPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAdjustmentType() {
        software.amazon.jsii.Kernel.call(this, "resetAdjustmentType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCooldown() {
        software.amazon.jsii.Kernel.call(this, "resetCooldown", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEstimatedInstanceWarmup() {
        software.amazon.jsii.Kernel.call(this, "resetEstimatedInstanceWarmup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricAggregationType() {
        software.amazon.jsii.Kernel.call(this, "resetMetricAggregationType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinAdjustmentMagnitude() {
        software.amazon.jsii.Kernel.call(this, "resetMinAdjustmentMagnitude", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinAdjustmentStep() {
        software.amazon.jsii.Kernel.call(this, "resetMinAdjustmentStep", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyType() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScalingAdjustment() {
        software.amazon.jsii.Kernel.call(this, "resetScalingAdjustment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStepAdjustment() {
        software.amazon.jsii.Kernel.call(this, "resetStepAdjustment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetTrackingConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetTargetTrackingConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "autoscalingGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAdjustmentTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "adjustmentTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCooldownInput() {
        return software.amazon.jsii.Kernel.get(this, "cooldownInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getEstimatedInstanceWarmupInput() {
        return software.amazon.jsii.Kernel.get(this, "estimatedInstanceWarmupInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricAggregationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "metricAggregationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinAdjustmentMagnitudeInput() {
        return software.amazon.jsii.Kernel.get(this, "minAdjustmentMagnitudeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinAdjustmentStepInput() {
        return software.amazon.jsii.Kernel.get(this, "minAdjustmentStepInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "policyTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getScalingAdjustmentInput() {
        return software.amazon.jsii.Kernel.get(this, "scalingAdjustmentInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingPolicyStepAdjustment> getStepAdjustmentInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AutoscalingPolicyStepAdjustment>)(software.amazon.jsii.Kernel.get(this, "stepAdjustmentInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyStepAdjustment.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration> getTargetTrackingConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration>)(software.amazon.jsii.Kernel.get(this, "targetTrackingConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyTargetTrackingConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAdjustmentType() {
        return software.amazon.jsii.Kernel.get(this, "adjustmentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAdjustmentType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "adjustmentType", java.util.Objects.requireNonNull(value, "adjustmentType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingGroupName() {
        return software.amazon.jsii.Kernel.get(this, "autoscalingGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutoscalingGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "autoscalingGroupName", java.util.Objects.requireNonNull(value, "autoscalingGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCooldown() {
        return software.amazon.jsii.Kernel.get(this, "cooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCooldown(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cooldown", java.util.Objects.requireNonNull(value, "cooldown is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEstimatedInstanceWarmup() {
        return software.amazon.jsii.Kernel.get(this, "estimatedInstanceWarmup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEstimatedInstanceWarmup(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "estimatedInstanceWarmup", java.util.Objects.requireNonNull(value, "estimatedInstanceWarmup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMetricAggregationType() {
        return software.amazon.jsii.Kernel.get(this, "metricAggregationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetricAggregationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metricAggregationType", java.util.Objects.requireNonNull(value, "metricAggregationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinAdjustmentMagnitude() {
        return software.amazon.jsii.Kernel.get(this, "minAdjustmentMagnitude", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinAdjustmentMagnitude(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minAdjustmentMagnitude", java.util.Objects.requireNonNull(value, "minAdjustmentMagnitude is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinAdjustmentStep() {
        return software.amazon.jsii.Kernel.get(this, "minAdjustmentStep", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinAdjustmentStep(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minAdjustmentStep", java.util.Objects.requireNonNull(value, "minAdjustmentStep is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyType() {
        return software.amazon.jsii.Kernel.get(this, "policyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyType", java.util.Objects.requireNonNull(value, "policyType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getScalingAdjustment() {
        return software.amazon.jsii.Kernel.get(this, "scalingAdjustment", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setScalingAdjustment(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "scalingAdjustment", java.util.Objects.requireNonNull(value, "scalingAdjustment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingPolicyStepAdjustment> getStepAdjustment() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "stepAdjustment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyStepAdjustment.class))));
    }

    public void setStepAdjustment(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingPolicyStepAdjustment> value) {
        software.amazon.jsii.Kernel.set(this, "stepAdjustment", java.util.Objects.requireNonNull(value, "stepAdjustment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration> getTargetTrackingConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetTrackingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyTargetTrackingConfiguration.class))));
    }

    public void setTargetTrackingConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "targetTrackingConfiguration", java.util.Objects.requireNonNull(value, "targetTrackingConfiguration is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AutoscalingPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AutoscalingPolicy> {
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
        private final imports.aws.AutoscalingPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AutoscalingPolicyConfig.Builder();
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
         * @param autoscalingGroupName This parameter is required.
         */
        public Builder autoscalingGroupName(final java.lang.String autoscalingGroupName) {
            this.config.autoscalingGroupName(autoscalingGroupName);
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
         * @param adjustmentType This parameter is required.
         */
        public Builder adjustmentType(final java.lang.String adjustmentType) {
            this.config.adjustmentType(adjustmentType);
            return this;
        }

        /**
         * @return {@code this}
         * @param cooldown This parameter is required.
         */
        public Builder cooldown(final java.lang.Number cooldown) {
            this.config.cooldown(cooldown);
            return this;
        }

        /**
         * @return {@code this}
         * @param estimatedInstanceWarmup This parameter is required.
         */
        public Builder estimatedInstanceWarmup(final java.lang.Number estimatedInstanceWarmup) {
            this.config.estimatedInstanceWarmup(estimatedInstanceWarmup);
            return this;
        }

        /**
         * @return {@code this}
         * @param metricAggregationType This parameter is required.
         */
        public Builder metricAggregationType(final java.lang.String metricAggregationType) {
            this.config.metricAggregationType(metricAggregationType);
            return this;
        }

        /**
         * @return {@code this}
         * @param minAdjustmentMagnitude This parameter is required.
         */
        public Builder minAdjustmentMagnitude(final java.lang.Number minAdjustmentMagnitude) {
            this.config.minAdjustmentMagnitude(minAdjustmentMagnitude);
            return this;
        }

        /**
         * @return {@code this}
         * @param minAdjustmentStep This parameter is required.
         */
        public Builder minAdjustmentStep(final java.lang.Number minAdjustmentStep) {
            this.config.minAdjustmentStep(minAdjustmentStep);
            return this;
        }

        /**
         * @return {@code this}
         * @param policyType This parameter is required.
         */
        public Builder policyType(final java.lang.String policyType) {
            this.config.policyType(policyType);
            return this;
        }

        /**
         * @return {@code this}
         * @param scalingAdjustment This parameter is required.
         */
        public Builder scalingAdjustment(final java.lang.Number scalingAdjustment) {
            this.config.scalingAdjustment(scalingAdjustment);
            return this;
        }

        /**
         * step_adjustment block.
         * <p>
         * @return {@code this}
         * @param stepAdjustment step_adjustment block. This parameter is required.
         */
        public Builder stepAdjustment(final java.util.List<? extends imports.aws.AutoscalingPolicyStepAdjustment> stepAdjustment) {
            this.config.stepAdjustment(stepAdjustment);
            return this;
        }

        /**
         * target_tracking_configuration block.
         * <p>
         * @return {@code this}
         * @param targetTrackingConfiguration target_tracking_configuration block. This parameter is required.
         */
        public Builder targetTrackingConfiguration(final java.util.List<? extends imports.aws.AutoscalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration) {
            this.config.targetTrackingConfiguration(targetTrackingConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AutoscalingPolicy}.
         */
        @Override
        public imports.aws.AutoscalingPolicy build() {
            return new imports.aws.AutoscalingPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
