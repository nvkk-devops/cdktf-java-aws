package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.684Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateCapacityReservationSpecification")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateCapacityReservationSpecification.Jsii$Proxy.class)
public interface LaunchTemplateCapacityReservationSpecification extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCapacityReservationPreference() {
        return null;
    }

    /**
     * capacity_reservation_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> getCapacityReservationTarget() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateCapacityReservationSpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateCapacityReservationSpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateCapacityReservationSpecification> {
        private java.lang.String capacityReservationPreference;
        private java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTarget;

        /**
         * Sets the value of {@link LaunchTemplateCapacityReservationSpecification#getCapacityReservationPreference}
         * @param capacityReservationPreference the value to be set.
         * @return {@code this}
         */
        public Builder capacityReservationPreference(java.lang.String capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateCapacityReservationSpecification#getCapacityReservationTarget}
         * @param capacityReservationTarget capacity_reservation_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder capacityReservationTarget(java.util.List<? extends imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTarget) {
            this.capacityReservationTarget = (java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget>)capacityReservationTarget;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateCapacityReservationSpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateCapacityReservationSpecification build() {
            return new Jsii$Proxy(capacityReservationPreference, capacityReservationTarget);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateCapacityReservationSpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateCapacityReservationSpecification {
        private final java.lang.String capacityReservationPreference;
        private final java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTarget;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.capacityReservationPreference = software.amazon.jsii.Kernel.get(this, "capacityReservationPreference", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.capacityReservationTarget = software.amazon.jsii.Kernel.get(this, "capacityReservationTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String capacityReservationPreference, final java.util.List<? extends imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTarget) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.capacityReservationPreference = capacityReservationPreference;
            this.capacityReservationTarget = (java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget>)capacityReservationTarget;
        }

        @Override
        public final java.lang.String getCapacityReservationPreference() {
            return this.capacityReservationPreference;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> getCapacityReservationTarget() {
            return this.capacityReservationTarget;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCapacityReservationPreference() != null) {
                data.set("capacityReservationPreference", om.valueToTree(this.getCapacityReservationPreference()));
            }
            if (this.getCapacityReservationTarget() != null) {
                data.set("capacityReservationTarget", om.valueToTree(this.getCapacityReservationTarget()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateCapacityReservationSpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateCapacityReservationSpecification.Jsii$Proxy that = (LaunchTemplateCapacityReservationSpecification.Jsii$Proxy) o;

            if (this.capacityReservationPreference != null ? !this.capacityReservationPreference.equals(that.capacityReservationPreference) : that.capacityReservationPreference != null) return false;
            return this.capacityReservationTarget != null ? this.capacityReservationTarget.equals(that.capacityReservationTarget) : that.capacityReservationTarget == null;
        }

        @Override
        public final int hashCode() {
            int result = this.capacityReservationPreference != null ? this.capacityReservationPreference.hashCode() : 0;
            result = 31 * result + (this.capacityReservationTarget != null ? this.capacityReservationTarget.hashCode() : 0);
            return result;
        }
    }
}
