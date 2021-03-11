package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.073Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingPolicyTargetTrackingConfiguration")
@software.amazon.jsii.Jsii.Proxy(AutoscalingPolicyTargetTrackingConfiguration.Jsii$Proxy.class)
public interface AutoscalingPolicyTargetTrackingConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getTargetValue();

    /**
     * customized_metric_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification> getCustomizedMetricSpecification() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableScaleIn() {
        return null;
    }

    /**
     * predefined_metric_specification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification> getPredefinedMetricSpecification() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingPolicyTargetTrackingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingPolicyTargetTrackingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingPolicyTargetTrackingConfiguration> {
        private java.lang.Number targetValue;
        private java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification> customizedMetricSpecification;
        private java.lang.Boolean disableScaleIn;
        private java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification> predefinedMetricSpecification;

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfiguration#getTargetValue}
         * @param targetValue the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetValue(java.lang.Number targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfiguration#getCustomizedMetricSpecification}
         * @param customizedMetricSpecification customized_metric_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder customizedMetricSpecification(java.util.List<? extends imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification> customizedMetricSpecification) {
            this.customizedMetricSpecification = (java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification>)customizedMetricSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfiguration#getDisableScaleIn}
         * @param disableScaleIn the value to be set.
         * @return {@code this}
         */
        public Builder disableScaleIn(java.lang.Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfiguration#getPredefinedMetricSpecification}
         * @param predefinedMetricSpecification predefined_metric_specification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder predefinedMetricSpecification(java.util.List<? extends imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification> predefinedMetricSpecification) {
            this.predefinedMetricSpecification = (java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification>)predefinedMetricSpecification;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AutoscalingPolicyTargetTrackingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingPolicyTargetTrackingConfiguration build() {
            return new Jsii$Proxy(targetValue, customizedMetricSpecification, disableScaleIn, predefinedMetricSpecification);
        }
    }

    /**
     * An implementation for {@link AutoscalingPolicyTargetTrackingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingPolicyTargetTrackingConfiguration {
        private final java.lang.Number targetValue;
        private final java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification> customizedMetricSpecification;
        private final java.lang.Boolean disableScaleIn;
        private final java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification> predefinedMetricSpecification;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetValue = software.amazon.jsii.Kernel.get(this, "targetValue", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.customizedMetricSpecification = software.amazon.jsii.Kernel.get(this, "customizedMetricSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification.class)));
            this.disableScaleIn = software.amazon.jsii.Kernel.get(this, "disableScaleIn", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.predefinedMetricSpecification = software.amazon.jsii.Kernel.get(this, "predefinedMetricSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number targetValue, final java.util.List<? extends imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification> customizedMetricSpecification, final java.lang.Boolean disableScaleIn, final java.util.List<? extends imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification> predefinedMetricSpecification) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetValue = java.util.Objects.requireNonNull(targetValue, "targetValue is required");
            this.customizedMetricSpecification = (java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification>)customizedMetricSpecification;
            this.disableScaleIn = disableScaleIn;
            this.predefinedMetricSpecification = (java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification>)predefinedMetricSpecification;
        }

        @Override
        public final java.lang.Number getTargetValue() {
            return this.targetValue;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification> getCustomizedMetricSpecification() {
            return this.customizedMetricSpecification;
        }

        @Override
        public final java.lang.Boolean getDisableScaleIn() {
            return this.disableScaleIn;
        }

        @Override
        public final java.util.List<imports.aws.AutoscalingPolicyTargetTrackingConfigurationPredefinedMetricSpecification> getPredefinedMetricSpecification() {
            return this.predefinedMetricSpecification;
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

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AutoscalingPolicyTargetTrackingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingPolicyTargetTrackingConfiguration.Jsii$Proxy that = (AutoscalingPolicyTargetTrackingConfiguration.Jsii$Proxy) o;

            if (!targetValue.equals(that.targetValue)) return false;
            if (this.customizedMetricSpecification != null ? !this.customizedMetricSpecification.equals(that.customizedMetricSpecification) : that.customizedMetricSpecification != null) return false;
            if (this.disableScaleIn != null ? !this.disableScaleIn.equals(that.disableScaleIn) : that.disableScaleIn != null) return false;
            return this.predefinedMetricSpecification != null ? this.predefinedMetricSpecification.equals(that.predefinedMetricSpecification) : that.predefinedMetricSpecification == null;
        }

        @Override
        public final int hashCode() {
            int result = this.targetValue.hashCode();
            result = 31 * result + (this.customizedMetricSpecification != null ? this.customizedMetricSpecification.hashCode() : 0);
            result = 31 * result + (this.disableScaleIn != null ? this.disableScaleIn.hashCode() : 0);
            result = 31 * result + (this.predefinedMetricSpecification != null ? this.predefinedMetricSpecification.hashCode() : 0);
            return result;
        }
    }
}
