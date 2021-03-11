package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.026Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppautoscalingPolicy")
public class AppautoscalingPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected AppautoscalingPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppautoscalingPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AppautoscalingPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AppautoscalingPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAdjustmentType() {
        software.amazon.jsii.Kernel.call(this, "resetAdjustmentType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCooldown() {
        software.amazon.jsii.Kernel.call(this, "resetCooldown", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricAggregationType() {
        software.amazon.jsii.Kernel.call(this, "resetMetricAggregationType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinAdjustmentMagnitude() {
        software.amazon.jsii.Kernel.call(this, "resetMinAdjustmentMagnitude", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyType() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStepAdjustment() {
        software.amazon.jsii.Kernel.call(this, "resetStepAdjustment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStepScalingPolicyConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetStepScalingPolicyConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetTrackingScalingPolicyConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetTargetTrackingScalingPolicyConfiguration", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScalableDimensionInput() {
        return software.amazon.jsii.Kernel.get(this, "scalableDimensionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNamespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAdjustmentTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "adjustmentTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCooldownInput() {
        return software.amazon.jsii.Kernel.get(this, "cooldownInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricAggregationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "metricAggregationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinAdjustmentMagnitudeInput() {
        return software.amazon.jsii.Kernel.get(this, "minAdjustmentMagnitudeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "policyTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment> getStepAdjustmentInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment>)(software.amazon.jsii.Kernel.get(this, "stepAdjustmentInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyStepAdjustment.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> getStepScalingPolicyConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration>)(software.amazon.jsii.Kernel.get(this, "stepScalingPolicyConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> getTargetTrackingScalingPolicyConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration>)(software.amazon.jsii.Kernel.get(this, "targetTrackingScalingPolicyConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAdjustmentType() {
        return software.amazon.jsii.Kernel.get(this, "adjustmentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAdjustmentType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "adjustmentType", java.util.Objects.requireNonNull(value, "adjustmentType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCooldown() {
        return software.amazon.jsii.Kernel.get(this, "cooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCooldown(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cooldown", java.util.Objects.requireNonNull(value, "cooldown is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceId() {
        return software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceId", java.util.Objects.requireNonNull(value, "resourceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScalableDimension() {
        return software.amazon.jsii.Kernel.get(this, "scalableDimension", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setScalableDimension(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "scalableDimension", java.util.Objects.requireNonNull(value, "scalableDimension is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceNamespace() {
        return software.amazon.jsii.Kernel.get(this, "serviceNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceNamespace(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceNamespace", java.util.Objects.requireNonNull(value, "serviceNamespace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment> getStepAdjustment() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "stepAdjustment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyStepAdjustment.class))));
    }

    public void setStepAdjustment(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment> value) {
        software.amazon.jsii.Kernel.set(this, "stepAdjustment", java.util.Objects.requireNonNull(value, "stepAdjustment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> getStepScalingPolicyConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "stepScalingPolicyConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration.class))));
    }

    public void setStepScalingPolicyConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "stepScalingPolicyConfiguration", java.util.Objects.requireNonNull(value, "stepScalingPolicyConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> getTargetTrackingScalingPolicyConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetTrackingScalingPolicyConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.class))));
    }

    public void setTargetTrackingScalingPolicyConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "targetTrackingScalingPolicyConfiguration", java.util.Objects.requireNonNull(value, "targetTrackingScalingPolicyConfiguration is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AppautoscalingPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AppautoscalingPolicy> {
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
        private final imports.aws.AppautoscalingPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AppautoscalingPolicyConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param resourceId This parameter is required.
         */
        public Builder resourceId(final java.lang.String resourceId) {
            this.config.resourceId(resourceId);
            return this;
        }

        /**
         * @return {@code this}
         * @param scalableDimension This parameter is required.
         */
        public Builder scalableDimension(final java.lang.String scalableDimension) {
            this.config.scalableDimension(scalableDimension);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceNamespace This parameter is required.
         */
        public Builder serviceNamespace(final java.lang.String serviceNamespace) {
            this.config.serviceNamespace(serviceNamespace);
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
         * @param policyType This parameter is required.
         */
        public Builder policyType(final java.lang.String policyType) {
            this.config.policyType(policyType);
            return this;
        }

        /**
         * step_adjustment block.
         * <p>
         * @return {@code this}
         * @param stepAdjustment step_adjustment block. This parameter is required.
         */
        public Builder stepAdjustment(final java.util.List<? extends imports.aws.AppautoscalingPolicyStepAdjustment> stepAdjustment) {
            this.config.stepAdjustment(stepAdjustment);
            return this;
        }

        /**
         * step_scaling_policy_configuration block.
         * <p>
         * @return {@code this}
         * @param stepScalingPolicyConfiguration step_scaling_policy_configuration block. This parameter is required.
         */
        public Builder stepScalingPolicyConfiguration(final java.util.List<? extends imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration) {
            this.config.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration);
            return this;
        }

        /**
         * target_tracking_scaling_policy_configuration block.
         * <p>
         * @return {@code this}
         * @param targetTrackingScalingPolicyConfiguration target_tracking_scaling_policy_configuration block. This parameter is required.
         */
        public Builder targetTrackingScalingPolicyConfiguration(final java.util.List<? extends imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration) {
            this.config.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AppautoscalingPolicy}.
         */
        @Override
        public imports.aws.AppautoscalingPolicy build() {
            return new imports.aws.AppautoscalingPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
