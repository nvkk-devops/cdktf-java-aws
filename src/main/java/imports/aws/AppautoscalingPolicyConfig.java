package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.027Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppautoscalingPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(AppautoscalingPolicyConfig.Jsii$Proxy.class)
public interface AppautoscalingPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getResourceId();

    @org.jetbrains.annotations.NotNull java.lang.String getScalableDimension();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceNamespace();

    default @org.jetbrains.annotations.Nullable java.lang.String getAdjustmentType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getCooldown() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMetricAggregationType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinAdjustmentMagnitude() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyType() {
        return null;
    }

    /**
     * step_adjustment block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment> getStepAdjustment() {
        return null;
    }

    /**
     * step_scaling_policy_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> getStepScalingPolicyConfiguration() {
        return null;
    }

    /**
     * target_tracking_scaling_policy_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> getTargetTrackingScalingPolicyConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppautoscalingPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppautoscalingPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppautoscalingPolicyConfig> {
        private java.lang.String name;
        private java.lang.String resourceId;
        private java.lang.String scalableDimension;
        private java.lang.String serviceNamespace;
        private java.lang.String adjustmentType;
        private java.lang.Number cooldown;
        private java.lang.String metricAggregationType;
        private java.lang.Number minAdjustmentMagnitude;
        private java.lang.String policyType;
        private java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment> stepAdjustment;
        private java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration;
        private java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getResourceId}
         * @param resourceId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceId(java.lang.String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getScalableDimension}
         * @param scalableDimension the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder scalableDimension(java.lang.String scalableDimension) {
            this.scalableDimension = scalableDimension;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getServiceNamespace}
         * @param serviceNamespace the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceNamespace(java.lang.String serviceNamespace) {
            this.serviceNamespace = serviceNamespace;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getAdjustmentType}
         * @param adjustmentType the value to be set.
         * @return {@code this}
         */
        public Builder adjustmentType(java.lang.String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getCooldown}
         * @param cooldown the value to be set.
         * @return {@code this}
         */
        public Builder cooldown(java.lang.Number cooldown) {
            this.cooldown = cooldown;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getMetricAggregationType}
         * @param metricAggregationType the value to be set.
         * @return {@code this}
         */
        public Builder metricAggregationType(java.lang.String metricAggregationType) {
            this.metricAggregationType = metricAggregationType;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getMinAdjustmentMagnitude}
         * @param minAdjustmentMagnitude the value to be set.
         * @return {@code this}
         */
        public Builder minAdjustmentMagnitude(java.lang.Number minAdjustmentMagnitude) {
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getPolicyType}
         * @param policyType the value to be set.
         * @return {@code this}
         */
        public Builder policyType(java.lang.String policyType) {
            this.policyType = policyType;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getStepAdjustment}
         * @param stepAdjustment step_adjustment block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stepAdjustment(java.util.List<? extends imports.aws.AppautoscalingPolicyStepAdjustment> stepAdjustment) {
            this.stepAdjustment = (java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment>)stepAdjustment;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getStepScalingPolicyConfiguration}
         * @param stepScalingPolicyConfiguration step_scaling_policy_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stepScalingPolicyConfiguration(java.util.List<? extends imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration) {
            this.stepScalingPolicyConfiguration = (java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration>)stepScalingPolicyConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getTargetTrackingScalingPolicyConfiguration}
         * @param targetTrackingScalingPolicyConfiguration target_tracking_scaling_policy_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetTrackingScalingPolicyConfiguration(java.util.List<? extends imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration) {
            this.targetTrackingScalingPolicyConfiguration = (java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration>)targetTrackingScalingPolicyConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getDependsOn}
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
         * Sets the value of {@link AppautoscalingPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getProvider}
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
         * @return a new instance of {@link AppautoscalingPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppautoscalingPolicyConfig build() {
            return new Jsii$Proxy(name, resourceId, scalableDimension, serviceNamespace, adjustmentType, cooldown, metricAggregationType, minAdjustmentMagnitude, policyType, stepAdjustment, stepScalingPolicyConfiguration, targetTrackingScalingPolicyConfiguration, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AppautoscalingPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppautoscalingPolicyConfig {
        private final java.lang.String name;
        private final java.lang.String resourceId;
        private final java.lang.String scalableDimension;
        private final java.lang.String serviceNamespace;
        private final java.lang.String adjustmentType;
        private final java.lang.Number cooldown;
        private final java.lang.String metricAggregationType;
        private final java.lang.Number minAdjustmentMagnitude;
        private final java.lang.String policyType;
        private final java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment> stepAdjustment;
        private final java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration;
        private final java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceId = software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scalableDimension = software.amazon.jsii.Kernel.get(this, "scalableDimension", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceNamespace = software.amazon.jsii.Kernel.get(this, "serviceNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.adjustmentType = software.amazon.jsii.Kernel.get(this, "adjustmentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cooldown = software.amazon.jsii.Kernel.get(this, "cooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.metricAggregationType = software.amazon.jsii.Kernel.get(this, "metricAggregationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minAdjustmentMagnitude = software.amazon.jsii.Kernel.get(this, "minAdjustmentMagnitude", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.policyType = software.amazon.jsii.Kernel.get(this, "policyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stepAdjustment = software.amazon.jsii.Kernel.get(this, "stepAdjustment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyStepAdjustment.class)));
            this.stepScalingPolicyConfiguration = software.amazon.jsii.Kernel.get(this, "stepScalingPolicyConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration.class)));
            this.targetTrackingScalingPolicyConfiguration = software.amazon.jsii.Kernel.get(this, "targetTrackingScalingPolicyConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String resourceId, final java.lang.String scalableDimension, final java.lang.String serviceNamespace, final java.lang.String adjustmentType, final java.lang.Number cooldown, final java.lang.String metricAggregationType, final java.lang.Number minAdjustmentMagnitude, final java.lang.String policyType, final java.util.List<? extends imports.aws.AppautoscalingPolicyStepAdjustment> stepAdjustment, final java.util.List<? extends imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration, final java.util.List<? extends imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.resourceId = java.util.Objects.requireNonNull(resourceId, "resourceId is required");
            this.scalableDimension = java.util.Objects.requireNonNull(scalableDimension, "scalableDimension is required");
            this.serviceNamespace = java.util.Objects.requireNonNull(serviceNamespace, "serviceNamespace is required");
            this.adjustmentType = adjustmentType;
            this.cooldown = cooldown;
            this.metricAggregationType = metricAggregationType;
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            this.policyType = policyType;
            this.stepAdjustment = (java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment>)stepAdjustment;
            this.stepScalingPolicyConfiguration = (java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration>)stepScalingPolicyConfiguration;
            this.targetTrackingScalingPolicyConfiguration = (java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration>)targetTrackingScalingPolicyConfiguration;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        @Override
        public final java.lang.String getScalableDimension() {
            return this.scalableDimension;
        }

        @Override
        public final java.lang.String getServiceNamespace() {
            return this.serviceNamespace;
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
        public final java.lang.String getMetricAggregationType() {
            return this.metricAggregationType;
        }

        @Override
        public final java.lang.Number getMinAdjustmentMagnitude() {
            return this.minAdjustmentMagnitude;
        }

        @Override
        public final java.lang.String getPolicyType() {
            return this.policyType;
        }

        @Override
        public final java.util.List<imports.aws.AppautoscalingPolicyStepAdjustment> getStepAdjustment() {
            return this.stepAdjustment;
        }

        @Override
        public final java.util.List<imports.aws.AppautoscalingPolicyStepScalingPolicyConfiguration> getStepScalingPolicyConfiguration() {
            return this.stepScalingPolicyConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> getTargetTrackingScalingPolicyConfiguration() {
            return this.targetTrackingScalingPolicyConfiguration;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("resourceId", om.valueToTree(this.getResourceId()));
            data.set("scalableDimension", om.valueToTree(this.getScalableDimension()));
            data.set("serviceNamespace", om.valueToTree(this.getServiceNamespace()));
            if (this.getAdjustmentType() != null) {
                data.set("adjustmentType", om.valueToTree(this.getAdjustmentType()));
            }
            if (this.getCooldown() != null) {
                data.set("cooldown", om.valueToTree(this.getCooldown()));
            }
            if (this.getMetricAggregationType() != null) {
                data.set("metricAggregationType", om.valueToTree(this.getMetricAggregationType()));
            }
            if (this.getMinAdjustmentMagnitude() != null) {
                data.set("minAdjustmentMagnitude", om.valueToTree(this.getMinAdjustmentMagnitude()));
            }
            if (this.getPolicyType() != null) {
                data.set("policyType", om.valueToTree(this.getPolicyType()));
            }
            if (this.getStepAdjustment() != null) {
                data.set("stepAdjustment", om.valueToTree(this.getStepAdjustment()));
            }
            if (this.getStepScalingPolicyConfiguration() != null) {
                data.set("stepScalingPolicyConfiguration", om.valueToTree(this.getStepScalingPolicyConfiguration()));
            }
            if (this.getTargetTrackingScalingPolicyConfiguration() != null) {
                data.set("targetTrackingScalingPolicyConfiguration", om.valueToTree(this.getTargetTrackingScalingPolicyConfiguration()));
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
            struct.set("fqn", om.valueToTree("aws.AppautoscalingPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppautoscalingPolicyConfig.Jsii$Proxy that = (AppautoscalingPolicyConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!resourceId.equals(that.resourceId)) return false;
            if (!scalableDimension.equals(that.scalableDimension)) return false;
            if (!serviceNamespace.equals(that.serviceNamespace)) return false;
            if (this.adjustmentType != null ? !this.adjustmentType.equals(that.adjustmentType) : that.adjustmentType != null) return false;
            if (this.cooldown != null ? !this.cooldown.equals(that.cooldown) : that.cooldown != null) return false;
            if (this.metricAggregationType != null ? !this.metricAggregationType.equals(that.metricAggregationType) : that.metricAggregationType != null) return false;
            if (this.minAdjustmentMagnitude != null ? !this.minAdjustmentMagnitude.equals(that.minAdjustmentMagnitude) : that.minAdjustmentMagnitude != null) return false;
            if (this.policyType != null ? !this.policyType.equals(that.policyType) : that.policyType != null) return false;
            if (this.stepAdjustment != null ? !this.stepAdjustment.equals(that.stepAdjustment) : that.stepAdjustment != null) return false;
            if (this.stepScalingPolicyConfiguration != null ? !this.stepScalingPolicyConfiguration.equals(that.stepScalingPolicyConfiguration) : that.stepScalingPolicyConfiguration != null) return false;
            if (this.targetTrackingScalingPolicyConfiguration != null ? !this.targetTrackingScalingPolicyConfiguration.equals(that.targetTrackingScalingPolicyConfiguration) : that.targetTrackingScalingPolicyConfiguration != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.resourceId.hashCode());
            result = 31 * result + (this.scalableDimension.hashCode());
            result = 31 * result + (this.serviceNamespace.hashCode());
            result = 31 * result + (this.adjustmentType != null ? this.adjustmentType.hashCode() : 0);
            result = 31 * result + (this.cooldown != null ? this.cooldown.hashCode() : 0);
            result = 31 * result + (this.metricAggregationType != null ? this.metricAggregationType.hashCode() : 0);
            result = 31 * result + (this.minAdjustmentMagnitude != null ? this.minAdjustmentMagnitude.hashCode() : 0);
            result = 31 * result + (this.policyType != null ? this.policyType.hashCode() : 0);
            result = 31 * result + (this.stepAdjustment != null ? this.stepAdjustment.hashCode() : 0);
            result = 31 * result + (this.stepScalingPolicyConfiguration != null ? this.stepScalingPolicyConfiguration.hashCode() : 0);
            result = 31 * result + (this.targetTrackingScalingPolicyConfiguration != null ? this.targetTrackingScalingPolicyConfiguration.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
