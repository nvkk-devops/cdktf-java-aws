package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.710Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MediaConvertQueueReservationPlanSettings")
@software.amazon.jsii.Jsii.Proxy(MediaConvertQueueReservationPlanSettings.Jsii$Proxy.class)
public interface MediaConvertQueueReservationPlanSettings extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getCommitment();

    @org.jetbrains.annotations.NotNull java.lang.String getRenewalType();

    @org.jetbrains.annotations.NotNull java.lang.Number getReservedSlots();

    /**
     * @return a {@link Builder} of {@link MediaConvertQueueReservationPlanSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MediaConvertQueueReservationPlanSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MediaConvertQueueReservationPlanSettings> {
        private java.lang.String commitment;
        private java.lang.String renewalType;
        private java.lang.Number reservedSlots;

        /**
         * Sets the value of {@link MediaConvertQueueReservationPlanSettings#getCommitment}
         * @param commitment the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder commitment(java.lang.String commitment) {
            this.commitment = commitment;
            return this;
        }

        /**
         * Sets the value of {@link MediaConvertQueueReservationPlanSettings#getRenewalType}
         * @param renewalType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder renewalType(java.lang.String renewalType) {
            this.renewalType = renewalType;
            return this;
        }

        /**
         * Sets the value of {@link MediaConvertQueueReservationPlanSettings#getReservedSlots}
         * @param reservedSlots the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder reservedSlots(java.lang.Number reservedSlots) {
            this.reservedSlots = reservedSlots;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MediaConvertQueueReservationPlanSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MediaConvertQueueReservationPlanSettings build() {
            return new Jsii$Proxy(commitment, renewalType, reservedSlots);
        }
    }

    /**
     * An implementation for {@link MediaConvertQueueReservationPlanSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MediaConvertQueueReservationPlanSettings {
        private final java.lang.String commitment;
        private final java.lang.String renewalType;
        private final java.lang.Number reservedSlots;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.commitment = software.amazon.jsii.Kernel.get(this, "commitment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.renewalType = software.amazon.jsii.Kernel.get(this, "renewalType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reservedSlots = software.amazon.jsii.Kernel.get(this, "reservedSlots", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String commitment, final java.lang.String renewalType, final java.lang.Number reservedSlots) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.commitment = java.util.Objects.requireNonNull(commitment, "commitment is required");
            this.renewalType = java.util.Objects.requireNonNull(renewalType, "renewalType is required");
            this.reservedSlots = java.util.Objects.requireNonNull(reservedSlots, "reservedSlots is required");
        }

        @Override
        public final java.lang.String getCommitment() {
            return this.commitment;
        }

        @Override
        public final java.lang.String getRenewalType() {
            return this.renewalType;
        }

        @Override
        public final java.lang.Number getReservedSlots() {
            return this.reservedSlots;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("commitment", om.valueToTree(this.getCommitment()));
            data.set("renewalType", om.valueToTree(this.getRenewalType()));
            data.set("reservedSlots", om.valueToTree(this.getReservedSlots()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MediaConvertQueueReservationPlanSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MediaConvertQueueReservationPlanSettings.Jsii$Proxy that = (MediaConvertQueueReservationPlanSettings.Jsii$Proxy) o;

            if (!commitment.equals(that.commitment)) return false;
            if (!renewalType.equals(that.renewalType)) return false;
            return this.reservedSlots.equals(that.reservedSlots);
        }

        @Override
        public final int hashCode() {
            int result = this.commitment.hashCode();
            result = 31 * result + (this.renewalType.hashCode());
            result = 31 * result + (this.reservedSlots.hashCode());
            return result;
        }
    }
}
