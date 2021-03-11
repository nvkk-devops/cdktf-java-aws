package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.072Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(AutoscalingPolicyConfig.Jsii$Proxy.class)
public interface AutoscalingPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingGroupName();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getAdjustmentType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getCooldown() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getEstimatedInstanceWarmup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMetricAggregationType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinAdjustmentMagnitude() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinAdjustmentStep() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getScalingAdjustment() {
        return null;
    }

    /**
     * step_adjustment block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingPolicyStepAdjustment> getStepAdjustment() {
        return null;
    }

    /**
     * target_tracking_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration> getTargetTrackingConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingPolicyConfig> {
        private java.lang.String autoscalingGroupName;
        private java.lang.String name;
        private java.lang.String adjustmentType;
        private java.lang.Number cooldown;
        private java.lang.Number estimatedInstanceWarmup;
        private java.lang.String metricAggregationType;
        private java.lang.Number minAdjustmentMagnitude;
        private java.lang.Number minAdjustmentStep;
        private java.lang.String policyType;
        private java.lang.Number scalingAdjustment;
        private java.util.List<imports.aws.AutoscalingPolicyStepAdjustment> stepAdjustment;
        private java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getAutoscalingGroupName}
         * @param autoscalingGroupName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder autoscalingGroupName(java.lang.String autoscalingGroupName) {
            this.autoscalingGroupName = autoscalingGroupName;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getAdjustmentType}
         * @param adjustmentType the value to be set.
         * @return {@code this}
         */
        public Builder adjustmentType(java.lang.String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getCooldown}
         * @param cooldown the value to be set.
         * @return {@code this}
         */
        public Builder cooldown(java.lang.Number cooldown) {
            this.cooldown = cooldown;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getEstimatedInstanceWarmup}
         * @param estimatedInstanceWarmup the value to be set.
         * @return {@code this}
         */
        public Builder estimatedInstanceWarmup(java.lang.Number estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getMetricAggregationType}
         * @param metricAggregationType the value to be set.
         * @return {@code this}
         */
        public Builder metricAggregationType(java.lang.String metricAggregationType) {
            this.metricAggregationType = metricAggregationType;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getMinAdjustmentMagnitude}
         * @param minAdjustmentMagnitude the value to be set.
         * @return {@code this}
         */
        public Builder minAdjustmentMagnitude(java.lang.Number minAdjustmentMagnitude) {
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getMinAdjustmentStep}
         * @param minAdjustmentStep the value to be set.
         * @return {@code this}
         */
        public Builder minAdjustmentStep(java.lang.Number minAdjustmentStep) {
            this.minAdjustmentStep = minAdjustmentStep;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getPolicyType}
         * @param policyType the value to be set.
         * @return {@code this}
         */
        public Builder policyType(java.lang.String policyType) {
            this.policyType = policyType;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getScalingAdjustment}
         * @param scalingAdjustment the value to be set.
         * @return {@code this}
         */
        public Builder scalingAdjustment(java.lang.Number scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getStepAdjustment}
         * @param stepAdjustment step_adjustment block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stepAdjustment(java.util.List<? extends imports.aws.AutoscalingPolicyStepAdjustment> stepAdjustment) {
            this.stepAdjustment = (java.util.List<imports.aws.AutoscalingPolicyStepAdjustment>)stepAdjustment;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getTargetTrackingConfiguration}
         * @param targetTrackingConfiguration target_tracking_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetTrackingConfiguration(java.util.List<? extends imports.aws.AutoscalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration) {
            this.targetTrackingConfiguration = (java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration>)targetTrackingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getDependsOn}
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
         * Sets the value of {@link AutoscalingPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyConfig#getProvider}
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
         * @return a new instance of {@link AutoscalingPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingPolicyConfig build() {
            return new Jsii$Proxy(autoscalingGroupName, name, adjustmentType, cooldown, estimatedInstanceWarmup, metricAggregationType, minAdjustmentMagnitude, minAdjustmentStep, policyType, scalingAdjustment, stepAdjustment, targetTrackingConfiguration, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AutoscalingPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingPolicyConfig {
        private final java.lang.String autoscalingGroupName;
        private final java.lang.String name;
        private final java.lang.String adjustmentType;
        private final java.lang.Number cooldown;
        private final java.lang.Number estimatedInstanceWarmup;
        private final java.lang.String metricAggregationType;
        private final java.lang.Number minAdjustmentMagnitude;
        private final java.lang.Number minAdjustmentStep;
        private final java.lang.String policyType;
        private final java.lang.Number scalingAdjustment;
        private final java.util.List<imports.aws.AutoscalingPolicyStepAdjustment> stepAdjustment;
        private final java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration;
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
            this.autoscalingGroupName = software.amazon.jsii.Kernel.get(this, "autoscalingGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.adjustmentType = software.amazon.jsii.Kernel.get(this, "adjustmentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cooldown = software.amazon.jsii.Kernel.get(this, "cooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.estimatedInstanceWarmup = software.amazon.jsii.Kernel.get(this, "estimatedInstanceWarmup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.metricAggregationType = software.amazon.jsii.Kernel.get(this, "metricAggregationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minAdjustmentMagnitude = software.amazon.jsii.Kernel.get(this, "minAdjustmentMagnitude", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minAdjustmentStep = software.amazon.jsii.Kernel.get(this, "minAdjustmentStep", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.policyType = software.amazon.jsii.Kernel.get(this, "policyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scalingAdjustment = software.amazon.jsii.Kernel.get(this, "scalingAdjustment", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.stepAdjustment = software.amazon.jsii.Kernel.get(this, "stepAdjustment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyStepAdjustment.class)));
            this.targetTrackingConfiguration = software.amazon.jsii.Kernel.get(this, "targetTrackingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyTargetTrackingConfiguration.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String autoscalingGroupName, final java.lang.String name, final java.lang.String adjustmentType, final java.lang.Number cooldown, final java.lang.Number estimatedInstanceWarmup, final java.lang.String metricAggregationType, final java.lang.Number minAdjustmentMagnitude, final java.lang.Number minAdjustmentStep, final java.lang.String policyType, final java.lang.Number scalingAdjustment, final java.util.List<? extends imports.aws.AutoscalingPolicyStepAdjustment> stepAdjustment, final java.util.List<? extends imports.aws.AutoscalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoscalingGroupName = java.util.Objects.requireNonNull(autoscalingGroupName, "autoscalingGroupName is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.adjustmentType = adjustmentType;
            this.cooldown = cooldown;
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            this.metricAggregationType = metricAggregationType;
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            this.minAdjustmentStep = minAdjustmentStep;
            this.policyType = policyType;
            this.scalingAdjustment = scalingAdjustment;
            this.stepAdjustment = (java.util.List<imports.aws.AutoscalingPolicyStepAdjustment>)stepAdjustment;
            this.targetTrackingConfiguration = (java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration>)targetTrackingConfiguration;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAutoscalingGroupName() {
            return this.autoscalingGroupName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getAdjustmentType() {
            return this.adjustmentType;
        }

        @Override
        public final java.lang.Number getCooldown() {
            return this.cooldown;
        }

        @Override
        public final java.lang.Number getEstimatedInstanceWarmup() {
            return this.estimatedInstanceWarmup;
        }

        @Override
        public final java.lang.String getMetricAggregationType() {
            return this.metricAggregationType;
        }

        @Override
        public final java.lang.Number getMinAdjustmentMagnitude() {
            return this.minAdjustmentMagnitude;
        }

        @Override
        public final java.lang.Number getMinAdjustmentStep() {
            return this.minAdjustmentStep;
        }

        @Override
        public final java.lang.String getPolicyType() {
            return this.policyType;
        }

        @Override
        public final java.lang.Number getScalingAdjustment() {
            return this.scalingAdjustment;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingPolicyStepAdjustment> getStepAdjustment() {
            return this.stepAdjustment;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfiguration> getTargetTrackingConfiguration() {
            return this.targetTrackingConfiguration;
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

            data.set("autoscalingGroupName", om.valueToTree(this.getAutoscalingGroupName()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAdjustmentType() != null) {
                data.set("adjustmentType", om.valueToTree(this.getAdjustmentType()));
            }
            if (this.getCooldown() != null) {
                data.set("cooldown", om.valueToTree(this.getCooldown()));
            }
            if (this.getEstimatedInstanceWarmup() != null) {
                data.set("estimatedInstanceWarmup", om.valueToTree(this.getEstimatedInstanceWarmup()));
            }
            if (this.getMetricAggregationType() != null) {
                data.set("metricAggregationType", om.valueToTree(this.getMetricAggregationType()));
            }
            if (this.getMinAdjustmentMagnitude() != null) {
                data.set("minAdjustmentMagnitude", om.valueToTree(this.getMinAdjustmentMagnitude()));
            }
            if (this.getMinAdjustmentStep() != null) {
                data.set("minAdjustmentStep", om.valueToTree(this.getMinAdjustmentStep()));
            }
            if (this.getPolicyType() != null) {
                data.set("policyType", om.valueToTree(this.getPolicyType()));
            }
            if (this.getScalingAdjustment() != null) {
                data.set("scalingAdjustment", om.valueToTree(this.getScalingAdjustment()));
            }
            if (this.getStepAdjustment() != null) {
                data.set("stepAdjustment", om.valueToTree(this.getStepAdjustment()));
            }
            if (this.getTargetTrackingConfiguration() != null) {
                data.set("targetTrackingConfiguration", om.valueToTree(this.getTargetTrackingConfiguration()));
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
            struct.set("fqn", om.valueToTree("aws.AutoscalingPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingPolicyConfig.Jsii$Proxy that = (AutoscalingPolicyConfig.Jsii$Proxy) o;

            if (!autoscalingGroupName.equals(that.autoscalingGroupName)) return false;
            if (!name.equals(that.name)) return false;
            if (this.adjustmentType != null ? !this.adjustmentType.equals(that.adjustmentType) : that.adjustmentType != null) return false;
            if (this.cooldown != null ? !this.cooldown.equals(that.cooldown) : that.cooldown != null) return false;
            if (this.estimatedInstanceWarmup != null ? !this.estimatedInstanceWarmup.equals(that.estimatedInstanceWarmup) : that.estimatedInstanceWarmup != null) return false;
            if (this.metricAggregationType != null ? !this.metricAggregationType.equals(that.metricAggregationType) : that.metricAggregationType != null) return false;
            if (this.minAdjustmentMagnitude != null ? !this.minAdjustmentMagnitude.equals(that.minAdjustmentMagnitude) : that.minAdjustmentMagnitude != null) return false;
            if (this.minAdjustmentStep != null ? !this.minAdjustmentStep.equals(that.minAdjustmentStep) : that.minAdjustmentStep != null) return false;
            if (this.policyType != null ? !this.policyType.equals(that.policyType) : that.policyType != null) return false;
            if (this.scalingAdjustment != null ? !this.scalingAdjustment.equals(that.scalingAdjustment) : that.scalingAdjustment != null) return false;
            if (this.stepAdjustment != null ? !this.stepAdjustment.equals(that.stepAdjustment) : that.stepAdjustment != null) return false;
            if (this.targetTrackingConfiguration != null ? !this.targetTrackingConfiguration.equals(that.targetTrackingConfiguration) : that.targetTrackingConfiguration != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoscalingGroupName.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.adjustmentType != null ? this.adjustmentType.hashCode() : 0);
            result = 31 * result + (this.cooldown != null ? this.cooldown.hashCode() : 0);
            result = 31 * result + (this.estimatedInstanceWarmup != null ? this.estimatedInstanceWarmup.hashCode() : 0);
            result = 31 * result + (this.metricAggregationType != null ? this.metricAggregationType.hashCode() : 0);
            result = 31 * result + (this.minAdjustmentMagnitude != null ? this.minAdjustmentMagnitude.hashCode() : 0);
            result = 31 * result + (this.minAdjustmentStep != null ? this.minAdjustmentStep.hashCode() : 0);
            result = 31 * result + (this.policyType != null ? this.policyType.hashCode() : 0);
            result = 31 * result + (this.scalingAdjustment != null ? this.scalingAdjustment.hashCode() : 0);
            result = 31 * result + (this.stepAdjustment != null ? this.stepAdjustment.hashCode() : 0);
            result = 31 * result + (this.targetTrackingConfiguration != null ? this.targetTrackingConfiguration.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
