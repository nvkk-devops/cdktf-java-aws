package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.510Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling")
@software.amazon.jsii.Jsii.Proxy(EcsCapacityProviderAutoScalingGroupProviderManagedScaling.Jsii$Proxy.class)
public interface EcsCapacityProviderAutoScalingGroupProviderManagedScaling extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumScalingStepSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinimumScalingStepSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTargetCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsCapacityProviderAutoScalingGroupProviderManagedScaling> {
        private java.lang.Number maximumScalingStepSize;
        private java.lang.Number minimumScalingStepSize;
        private java.lang.String status;
        private java.lang.Number targetCapacity;

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling#getMaximumScalingStepSize}
         * @param maximumScalingStepSize the value to be set.
         * @return {@code this}
         */
        public Builder maximumScalingStepSize(java.lang.Number maximumScalingStepSize) {
            this.maximumScalingStepSize = maximumScalingStepSize;
            return this;
        }

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling#getMinimumScalingStepSize}
         * @param minimumScalingStepSize the value to be set.
         * @return {@code this}
         */
        public Builder minimumScalingStepSize(java.lang.Number minimumScalingStepSize) {
            this.minimumScalingStepSize = minimumScalingStepSize;
            return this;
        }

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling#getTargetCapacity}
         * @param targetCapacity the value to be set.
         * @return {@code this}
         */
        public Builder targetCapacity(java.lang.Number targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsCapacityProviderAutoScalingGroupProviderManagedScaling build() {
            return new Jsii$Proxy(maximumScalingStepSize, minimumScalingStepSize, status, targetCapacity);
        }
    }

    /**
     * An implementation for {@link EcsCapacityProviderAutoScalingGroupProviderManagedScaling}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsCapacityProviderAutoScalingGroupProviderManagedScaling {
        private final java.lang.Number maximumScalingStepSize;
        private final java.lang.Number minimumScalingStepSize;
        private final java.lang.String status;
        private final java.lang.Number targetCapacity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maximumScalingStepSize = software.amazon.jsii.Kernel.get(this, "maximumScalingStepSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minimumScalingStepSize = software.amazon.jsii.Kernel.get(this, "minimumScalingStepSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetCapacity = software.amazon.jsii.Kernel.get(this, "targetCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number maximumScalingStepSize, final java.lang.Number minimumScalingStepSize, final java.lang.String status, final java.lang.Number targetCapacity) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maximumScalingStepSize = maximumScalingStepSize;
            this.minimumScalingStepSize = minimumScalingStepSize;
            this.status = status;
            this.targetCapacity = targetCapacity;
        }

        @Override
        public final java.lang.Number getMaximumScalingStepSize() {
            return this.maximumScalingStepSize;
        }

        @Override
        public final java.lang.Number getMinimumScalingStepSize() {
            return this.minimumScalingStepSize;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.lang.Number getTargetCapacity() {
            return this.targetCapacity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaximumScalingStepSize() != null) {
                data.set("maximumScalingStepSize", om.valueToTree(this.getMaximumScalingStepSize()));
            }
            if (this.getMinimumScalingStepSize() != null) {
                data.set("minimumScalingStepSize", om.valueToTree(this.getMinimumScalingStepSize()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getTargetCapacity() != null) {
                data.set("targetCapacity", om.valueToTree(this.getTargetCapacity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsCapacityProviderAutoScalingGroupProviderManagedScaling.Jsii$Proxy that = (EcsCapacityProviderAutoScalingGroupProviderManagedScaling.Jsii$Proxy) o;

            if (this.maximumScalingStepSize != null ? !this.maximumScalingStepSize.equals(that.maximumScalingStepSize) : that.maximumScalingStepSize != null) return false;
            if (this.minimumScalingStepSize != null ? !this.minimumScalingStepSize.equals(that.minimumScalingStepSize) : that.minimumScalingStepSize != null) return false;
            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            return this.targetCapacity != null ? this.targetCapacity.equals(that.targetCapacity) : that.targetCapacity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maximumScalingStepSize != null ? this.maximumScalingStepSize.hashCode() : 0;
            result = 31 * result + (this.minimumScalingStepSize != null ? this.minimumScalingStepSize.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            result = 31 * result + (this.targetCapacity != null ? this.targetCapacity.hashCode() : 0);
            return result;
        }
    }
}
