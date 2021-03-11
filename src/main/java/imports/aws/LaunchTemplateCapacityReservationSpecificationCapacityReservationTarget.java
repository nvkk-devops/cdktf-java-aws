package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.684Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget.Jsii$Proxy.class)
public interface LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCapacityReservationId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> {
        private java.lang.String capacityReservationId;

        /**
         * Sets the value of {@link LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget#getCapacityReservationId}
         * @param capacityReservationId the value to be set.
         * @return {@code this}
         */
        public Builder capacityReservationId(java.lang.String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget build() {
            return new Jsii$Proxy(capacityReservationId);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget {
        private final java.lang.String capacityReservationId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.capacityReservationId = software.amazon.jsii.Kernel.get(this, "capacityReservationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String capacityReservationId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.capacityReservationId = capacityReservationId;
        }

        @Override
        public final java.lang.String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCapacityReservationId() != null) {
                data.set("capacityReservationId", om.valueToTree(this.getCapacityReservationId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget.Jsii$Proxy that = (LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget.Jsii$Proxy) o;

            return this.capacityReservationId != null ? this.capacityReservationId.equals(that.capacityReservationId) : that.capacityReservationId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.capacityReservationId != null ? this.capacityReservationId.hashCode() : 0;
            return result;
        }
    }
}
