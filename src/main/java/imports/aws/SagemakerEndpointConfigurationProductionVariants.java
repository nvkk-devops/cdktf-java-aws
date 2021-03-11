package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.840Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SagemakerEndpointConfigurationProductionVariants")
@software.amazon.jsii.Jsii.Proxy(SagemakerEndpointConfigurationProductionVariants.Jsii$Proxy.class)
public interface SagemakerEndpointConfigurationProductionVariants extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getInitialInstanceCount();

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    @org.jetbrains.annotations.NotNull java.lang.String getModelName();

    default @org.jetbrains.annotations.Nullable java.lang.String getAcceleratorType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getInitialVariantWeight() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVariantName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerEndpointConfigurationProductionVariants}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerEndpointConfigurationProductionVariants}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerEndpointConfigurationProductionVariants> {
        private java.lang.Number initialInstanceCount;
        private java.lang.String instanceType;
        private java.lang.String modelName;
        private java.lang.String acceleratorType;
        private java.lang.Number initialVariantWeight;
        private java.lang.String variantName;

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getInitialInstanceCount}
         * @param initialInstanceCount the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder initialInstanceCount(java.lang.Number initialInstanceCount) {
            this.initialInstanceCount = initialInstanceCount;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getInstanceType}
         * @param instanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getModelName}
         * @param modelName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder modelName(java.lang.String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getAcceleratorType}
         * @param acceleratorType the value to be set.
         * @return {@code this}
         */
        public Builder acceleratorType(java.lang.String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getInitialVariantWeight}
         * @param initialVariantWeight the value to be set.
         * @return {@code this}
         */
        public Builder initialVariantWeight(java.lang.Number initialVariantWeight) {
            this.initialVariantWeight = initialVariantWeight;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getVariantName}
         * @param variantName the value to be set.
         * @return {@code this}
         */
        public Builder variantName(java.lang.String variantName) {
            this.variantName = variantName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerEndpointConfigurationProductionVariants}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerEndpointConfigurationProductionVariants build() {
            return new Jsii$Proxy(initialInstanceCount, instanceType, modelName, acceleratorType, initialVariantWeight, variantName);
        }
    }

    /**
     * An implementation for {@link SagemakerEndpointConfigurationProductionVariants}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerEndpointConfigurationProductionVariants {
        private final java.lang.Number initialInstanceCount;
        private final java.lang.String instanceType;
        private final java.lang.String modelName;
        private final java.lang.String acceleratorType;
        private final java.lang.Number initialVariantWeight;
        private final java.lang.String variantName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.initialInstanceCount = software.amazon.jsii.Kernel.get(this, "initialInstanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.modelName = software.amazon.jsii.Kernel.get(this, "modelName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.acceleratorType = software.amazon.jsii.Kernel.get(this, "acceleratorType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.initialVariantWeight = software.amazon.jsii.Kernel.get(this, "initialVariantWeight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.variantName = software.amazon.jsii.Kernel.get(this, "variantName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number initialInstanceCount, final java.lang.String instanceType, final java.lang.String modelName, final java.lang.String acceleratorType, final java.lang.Number initialVariantWeight, final java.lang.String variantName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.initialInstanceCount = java.util.Objects.requireNonNull(initialInstanceCount, "initialInstanceCount is required");
            this.instanceType = java.util.Objects.requireNonNull(instanceType, "instanceType is required");
            this.modelName = java.util.Objects.requireNonNull(modelName, "modelName is required");
            this.acceleratorType = acceleratorType;
            this.initialVariantWeight = initialVariantWeight;
            this.variantName = variantName;
        }

        @Override
        public final java.lang.Number getInitialInstanceCount() {
            return this.initialInstanceCount;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.String getModelName() {
            return this.modelName;
        }

        @Override
        public final java.lang.String getAcceleratorType() {
            return this.acceleratorType;
        }

        @Override
        public final java.lang.Number getInitialVariantWeight() {
            return this.initialVariantWeight;
        }

        @Override
        public final java.lang.String getVariantName() {
            return this.variantName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("initialInstanceCount", om.valueToTree(this.getInitialInstanceCount()));
            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            data.set("modelName", om.valueToTree(this.getModelName()));
            if (this.getAcceleratorType() != null) {
                data.set("acceleratorType", om.valueToTree(this.getAcceleratorType()));
            }
            if (this.getInitialVariantWeight() != null) {
                data.set("initialVariantWeight", om.valueToTree(this.getInitialVariantWeight()));
            }
            if (this.getVariantName() != null) {
                data.set("variantName", om.valueToTree(this.getVariantName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SagemakerEndpointConfigurationProductionVariants"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerEndpointConfigurationProductionVariants.Jsii$Proxy that = (SagemakerEndpointConfigurationProductionVariants.Jsii$Proxy) o;

            if (!initialInstanceCount.equals(that.initialInstanceCount)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (!modelName.equals(that.modelName)) return false;
            if (this.acceleratorType != null ? !this.acceleratorType.equals(that.acceleratorType) : that.acceleratorType != null) return false;
            if (this.initialVariantWeight != null ? !this.initialVariantWeight.equals(that.initialVariantWeight) : that.initialVariantWeight != null) return false;
            return this.variantName != null ? this.variantName.equals(that.variantName) : that.variantName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.initialInstanceCount.hashCode();
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.modelName.hashCode());
            result = 31 * result + (this.acceleratorType != null ? this.acceleratorType.hashCode() : 0);
            result = 31 * result + (this.initialVariantWeight != null ? this.initialVariantWeight.hashCode() : 0);
            result = 31 * result + (this.variantName != null ? this.variantName.hashCode() : 0);
            return result;
        }
    }
}
