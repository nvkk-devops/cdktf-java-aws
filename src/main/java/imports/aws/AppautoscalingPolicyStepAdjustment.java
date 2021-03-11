package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.028Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppautoscalingPolicyStepAdjustment")
@software.amazon.jsii.Jsii.Proxy(AppautoscalingPolicyStepAdjustment.Jsii$Proxy.class)
public interface AppautoscalingPolicyStepAdjustment extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getScalingAdjustment();

    default @org.jetbrains.annotations.Nullable java.lang.String getMetricIntervalLowerBound() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMetricIntervalUpperBound() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppautoscalingPolicyStepAdjustment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppautoscalingPolicyStepAdjustment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppautoscalingPolicyStepAdjustment> {
        private java.lang.Number scalingAdjustment;
        private java.lang.String metricIntervalLowerBound;
        private java.lang.String metricIntervalUpperBound;

        /**
         * Sets the value of {@link AppautoscalingPolicyStepAdjustment#getScalingAdjustment}
         * @param scalingAdjustment the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder scalingAdjustment(java.lang.Number scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyStepAdjustment#getMetricIntervalLowerBound}
         * @param metricIntervalLowerBound the value to be set.
         * @return {@code this}
         */
        public Builder metricIntervalLowerBound(java.lang.String metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyStepAdjustment#getMetricIntervalUpperBound}
         * @param metricIntervalUpperBound the value to be set.
         * @return {@code this}
         */
        public Builder metricIntervalUpperBound(java.lang.String metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppautoscalingPolicyStepAdjustment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppautoscalingPolicyStepAdjustment build() {
            return new Jsii$Proxy(scalingAdjustment, metricIntervalLowerBound, metricIntervalUpperBound);
        }
    }

    /**
     * An implementation for {@link AppautoscalingPolicyStepAdjustment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppautoscalingPolicyStepAdjustment {
        private final java.lang.Number scalingAdjustment;
        private final java.lang.String metricIntervalLowerBound;
        private final java.lang.String metricIntervalUpperBound;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.scalingAdjustment = software.amazon.jsii.Kernel.get(this, "scalingAdjustment", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.metricIntervalLowerBound = software.amazon.jsii.Kernel.get(this, "metricIntervalLowerBound", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricIntervalUpperBound = software.amazon.jsii.Kernel.get(this, "metricIntervalUpperBound", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number scalingAdjustment, final java.lang.String metricIntervalLowerBound, final java.lang.String metricIntervalUpperBound) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.scalingAdjustment = java.util.Objects.requireNonNull(scalingAdjustment, "scalingAdjustment is required");
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            this.metricIntervalUpperBound = metricIntervalUpperBound;
        }

        @Override
        public final java.lang.Number getScalingAdjustment() {
            return this.scalingAdjustment;
        }

        @Override
        public final java.lang.String getMetricIntervalLowerBound() {
            return this.metricIntervalLowerBound;
        }

        @Override
        public final java.lang.String getMetricIntervalUpperBound() {
            return this.metricIntervalUpperBound;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("scalingAdjustment", om.valueToTree(this.getScalingAdjustment()));
            if (this.getMetricIntervalLowerBound() != null) {
                data.set("metricIntervalLowerBound", om.valueToTree(this.getMetricIntervalLowerBound()));
            }
            if (this.getMetricIntervalUpperBound() != null) {
                data.set("metricIntervalUpperBound", om.valueToTree(this.getMetricIntervalUpperBound()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppautoscalingPolicyStepAdjustment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppautoscalingPolicyStepAdjustment.Jsii$Proxy that = (AppautoscalingPolicyStepAdjustment.Jsii$Proxy) o;

            if (!scalingAdjustment.equals(that.scalingAdjustment)) return false;
            if (this.metricIntervalLowerBound != null ? !this.metricIntervalLowerBound.equals(that.metricIntervalLowerBound) : that.metricIntervalLowerBound != null) return false;
            return this.metricIntervalUpperBound != null ? this.metricIntervalUpperBound.equals(that.metricIntervalUpperBound) : that.metricIntervalUpperBound == null;
        }

        @Override
        public final int hashCode() {
            int result = this.scalingAdjustment.hashCode();
            result = 31 * result + (this.metricIntervalLowerBound != null ? this.metricIntervalLowerBound.hashCode() : 0);
            result = 31 * result + (this.metricIntervalUpperBound != null ? this.metricIntervalUpperBound.hashCode() : 0);
            return result;
        }
    }
}
