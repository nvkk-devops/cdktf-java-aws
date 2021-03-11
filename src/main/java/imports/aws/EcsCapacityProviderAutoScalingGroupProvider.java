package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.510Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsCapacityProviderAutoScalingGroupProvider")
@software.amazon.jsii.Jsii.Proxy(EcsCapacityProviderAutoScalingGroupProvider.Jsii$Proxy.class)
public interface EcsCapacityProviderAutoScalingGroupProvider extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAutoScalingGroupArn();

    /**
     * managed_scaling block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling> getManagedScaling() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getManagedTerminationProtection() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsCapacityProviderAutoScalingGroupProvider}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsCapacityProviderAutoScalingGroupProvider}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsCapacityProviderAutoScalingGroupProvider> {
        private java.lang.String autoScalingGroupArn;
        private java.util.List<imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling> managedScaling;
        private java.lang.String managedTerminationProtection;

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProvider#getAutoScalingGroupArn}
         * @param autoScalingGroupArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder autoScalingGroupArn(java.lang.String autoScalingGroupArn) {
            this.autoScalingGroupArn = autoScalingGroupArn;
            return this;
        }

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProvider#getManagedScaling}
         * @param managedScaling managed_scaling block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder managedScaling(java.util.List<? extends imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling> managedScaling) {
            this.managedScaling = (java.util.List<imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling>)managedScaling;
            return this;
        }

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProvider#getManagedTerminationProtection}
         * @param managedTerminationProtection the value to be set.
         * @return {@code this}
         */
        public Builder managedTerminationProtection(java.lang.String managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsCapacityProviderAutoScalingGroupProvider}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsCapacityProviderAutoScalingGroupProvider build() {
            return new Jsii$Proxy(autoScalingGroupArn, managedScaling, managedTerminationProtection);
        }
    }

    /**
     * An implementation for {@link EcsCapacityProviderAutoScalingGroupProvider}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsCapacityProviderAutoScalingGroupProvider {
        private final java.lang.String autoScalingGroupArn;
        private final java.util.List<imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling> managedScaling;
        private final java.lang.String managedTerminationProtection;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.autoScalingGroupArn = software.amazon.jsii.Kernel.get(this, "autoScalingGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.managedScaling = software.amazon.jsii.Kernel.get(this, "managedScaling", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling.class)));
            this.managedTerminationProtection = software.amazon.jsii.Kernel.get(this, "managedTerminationProtection", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String autoScalingGroupArn, final java.util.List<? extends imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling> managedScaling, final java.lang.String managedTerminationProtection) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoScalingGroupArn = java.util.Objects.requireNonNull(autoScalingGroupArn, "autoScalingGroupArn is required");
            this.managedScaling = (java.util.List<imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling>)managedScaling;
            this.managedTerminationProtection = managedTerminationProtection;
        }

        @Override
        public final java.lang.String getAutoScalingGroupArn() {
            return this.autoScalingGroupArn;
        }

        @Override
        public final java.util.List<imports.aws.EcsCapacityProviderAutoScalingGroupProviderManagedScaling> getManagedScaling() {
            return this.managedScaling;
        }

        @Override
        public final java.lang.String getManagedTerminationProtection() {
            return this.managedTerminationProtection;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("autoScalingGroupArn", om.valueToTree(this.getAutoScalingGroupArn()));
            if (this.getManagedScaling() != null) {
                data.set("managedScaling", om.valueToTree(this.getManagedScaling()));
            }
            if (this.getManagedTerminationProtection() != null) {
                data.set("managedTerminationProtection", om.valueToTree(this.getManagedTerminationProtection()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EcsCapacityProviderAutoScalingGroupProvider"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsCapacityProviderAutoScalingGroupProvider.Jsii$Proxy that = (EcsCapacityProviderAutoScalingGroupProvider.Jsii$Proxy) o;

            if (!autoScalingGroupArn.equals(that.autoScalingGroupArn)) return false;
            if (this.managedScaling != null ? !this.managedScaling.equals(that.managedScaling) : that.managedScaling != null) return false;
            return this.managedTerminationProtection != null ? this.managedTerminationProtection.equals(that.managedTerminationProtection) : that.managedTerminationProtection == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoScalingGroupArn.hashCode();
            result = 31 * result + (this.managedScaling != null ? this.managedScaling.hashCode() : 0);
            result = 31 * result + (this.managedTerminationProtection != null ? this.managedTerminationProtection.hashCode() : 0);
            return result;
        }
    }
}
