package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.029Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration")
@software.amazon.jsii.Jsii.Proxy(AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.Jsii$Proxy.class)
public interface AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getTargetValue();

    /**
     * customized_metric_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification> getCustomizedMetricSpecification() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableScaleIn() {
        return null;
    }

    /**
     * predefined_metric_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> getPredefinedMetricSpecification() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getScaleInCooldown() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getScaleOutCooldown() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration> {
        private java.lang.Number targetValue;
        private java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification> customizedMetricSpecification;
        private java.lang.Boolean disableScaleIn;
        private java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> predefinedMetricSpecification;
        private java.lang.Number scaleInCooldown;
        private java.lang.Number scaleOutCooldown;

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration#getTargetValue}
         * @param targetValue the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetValue(java.lang.Number targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration#getCustomizedMetricSpecification}
         * @param customizedMetricSpecification customized_metric_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder customizedMetricSpecification(java.util.List<? extends imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification> customizedMetricSpecification) {
            this.customizedMetricSpecification = (java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification>)customizedMetricSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration#getDisableScaleIn}
         * @param disableScaleIn the value to be set.
         * @return {@code this}
         */
        public Builder disableScaleIn(java.lang.Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration#getPredefinedMetricSpecification}
         * @param predefinedMetricSpecification predefined_metric_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder predefinedMetricSpecification(java.util.List<? extends imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> predefinedMetricSpecification) {
            this.predefinedMetricSpecification = (java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification>)predefinedMetricSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration#getScaleInCooldown}
         * @param scaleInCooldown the value to be set.
         * @return {@code this}
         */
        public Builder scaleInCooldown(java.lang.Number scaleInCooldown) {
            this.scaleInCooldown = scaleInCooldown;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration#getScaleOutCooldown}
         * @param scaleOutCooldown the value to be set.
         * @return {@code this}
         */
        public Builder scaleOutCooldown(java.lang.Number scaleOutCooldown) {
            this.scaleOutCooldown = scaleOutCooldown;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration build() {
            return new Jsii$Proxy(targetValue, customizedMetricSpecification, disableScaleIn, predefinedMetricSpecification, scaleInCooldown, scaleOutCooldown);
        }
    }

    /**
     * An implementation for {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration {
        private final java.lang.Number targetValue;
        private final java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification> customizedMetricSpecification;
        private final java.lang.Boolean disableScaleIn;
        private final java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> predefinedMetricSpecification;
        private final java.lang.Number scaleInCooldown;
        private final java.lang.Number scaleOutCooldown;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetValue = software.amazon.jsii.Kernel.get(this, "targetValue", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.customizedMetricSpecification = software.amazon.jsii.Kernel.get(this, "customizedMetricSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification.class)));
            this.disableScaleIn = software.amazon.jsii.Kernel.get(this, "disableScaleIn", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.predefinedMetricSpecification = software.amazon.jsii.Kernel.get(this, "predefinedMetricSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification.class)));
            this.scaleInCooldown = software.amazon.jsii.Kernel.get(this, "scaleInCooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.scaleOutCooldown = software.amazon.jsii.Kernel.get(this, "scaleOutCooldown", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number targetValue, final java.util.List<? extends imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification> customizedMetricSpecification, final java.lang.Boolean disableScaleIn, final java.util.List<? extends imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> predefinedMetricSpecification, final java.lang.Number scaleInCooldown, final java.lang.Number scaleOutCooldown) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetValue = java.util.Objects.requireNonNull(targetValue, "targetValue is required");
            this.customizedMetricSpecification = (java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification>)customizedMetricSpecification;
            this.disableScaleIn = disableScaleIn;
            this.predefinedMetricSpecification = (java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification>)predefinedMetricSpecification;
            this.scaleInCooldown = scaleInCooldown;
            this.scaleOutCooldown = scaleOutCooldown;
        }

        @Override
        public final java.lang.Number getTargetValue() {
            return this.targetValue;
        }

        @Override
        public final java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification> getCustomizedMetricSpecification() {
            return this.customizedMetricSpecification;
        }

        @Override
        public final java.lang.Boolean getDisableScaleIn() {
            return this.disableScaleIn;
        }

        @Override
        public final java.util.List<imports.aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> getPredefinedMetricSpecification() {
            return this.predefinedMetricSpecification;
        }

        @Override
        public final java.lang.Number getScaleInCooldown() {
            return this.scaleInCooldown;
        }

        @Override
        public final java.lang.Number getScaleOutCooldown() {
            return this.scaleOutCooldown;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("targetValue", om.valueToTree(this.getTargetValue()));
            if (this.getCustomizedMetricSpecification() != null) {
                data.set("customizedMetricSpecification", om.valueToTree(this.getCustomizedMetricSpecification()));
            }
            if (this.getDisableScaleIn() != null) {
                data.set("disableScaleIn", om.valueToTree(this.getDisableScaleIn()));
            }
            if (this.getPredefinedMetricSpecification() != null) {
                data.set("predefinedMetricSpecification", om.valueToTree(this.getPredefinedMetricSpecification()));
            }
            if (this.getScaleInCooldown() != null) {
                data.set("scaleInCooldown", om.valueToTree(this.getScaleInCooldown()));
            }
            if (this.getScaleOutCooldown() != null) {
                data.set("scaleOutCooldown", om.valueToTree(this.getScaleOutCooldown()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.Jsii$Proxy that = (AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.Jsii$Proxy) o;

            if (!targetValue.equals(that.targetValue)) return false;
            if (this.customizedMetricSpecification != null ? !this.customizedMetricSpecification.equals(that.customizedMetricSpecification) : that.customizedMetricSpecification != null) return false;
            if (this.disableScaleIn != null ? !this.disableScaleIn.equals(that.disableScaleIn) : that.disableScaleIn != null) return false;
            if (this.predefinedMetricSpecification != null ? !this.predefinedMetricSpecification.equals(that.predefinedMetricSpecification) : that.predefinedMetricSpecification != null) return false;
            if (this.scaleInCooldown != null ? !this.scaleInCooldown.equals(that.scaleInCooldown) : that.scaleInCooldown != null) return false;
            return this.scaleOutCooldown != null ? this.scaleOutCooldown.equals(that.scaleOutCooldown) : that.scaleOutCooldown == null;
        }

        @Override
        public final int hashCode() {
            int result = this.targetValue.hashCode();
            result = 31 * result + (this.customizedMetricSpecification != null ? this.customizedMetricSpecification.hashCode() : 0);
            result = 31 * result + (this.disableScaleIn != null ? this.disableScaleIn.hashCode() : 0);
            result = 31 * result + (this.predefinedMetricSpecification != null ? this.predefinedMetricSpecification.hashCode() : 0);
            result = 31 * result + (this.scaleInCooldown != null ? this.scaleInCooldown.hashCode() : 0);
            result = 31 * result + (this.scaleOutCooldown != null ? this.scaleOutCooldown.hashCode() : 0);
            return result;
        }
    }
}
