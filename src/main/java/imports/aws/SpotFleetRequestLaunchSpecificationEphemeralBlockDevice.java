package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.884Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice")
@software.amazon.jsii.Jsii.Proxy(SpotFleetRequestLaunchSpecificationEphemeralBlockDevice.Jsii$Proxy.class)
public interface SpotFleetRequestLaunchSpecificationEphemeralBlockDevice extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDeviceName();

    @org.jetbrains.annotations.NotNull java.lang.String getVirtualName();

    /**
     * @return a {@link Builder} of {@link SpotFleetRequestLaunchSpecificationEphemeralBlockDevice}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotFleetRequestLaunchSpecificationEphemeralBlockDevice}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> {
        private java.lang.String deviceName;
        private java.lang.String virtualName;

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEphemeralBlockDevice#getDeviceName}
         * @param deviceName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder deviceName(java.lang.String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEphemeralBlockDevice#getVirtualName}
         * @param virtualName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder virtualName(java.lang.String virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SpotFleetRequestLaunchSpecificationEphemeralBlockDevice}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotFleetRequestLaunchSpecificationEphemeralBlockDevice build() {
            return new Jsii$Proxy(deviceName, virtualName);
        }
    }

    /**
     * An implementation for {@link SpotFleetRequestLaunchSpecificationEphemeralBlockDevice}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotFleetRequestLaunchSpecificationEphemeralBlockDevice {
        private final java.lang.String deviceName;
        private final java.lang.String virtualName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deviceName = software.amazon.jsii.Kernel.get(this, "deviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.virtualName = software.amazon.jsii.Kernel.get(this, "virtualName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String deviceName, final java.lang.String virtualName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deviceName = java.util.Objects.requireNonNull(deviceName, "deviceName is required");
            this.virtualName = java.util.Objects.requireNonNull(virtualName, "virtualName is required");
        }

        @Override
        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        @Override
        public final java.lang.String getVirtualName() {
            return this.virtualName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("deviceName", om.valueToTree(this.getDeviceName()));
            data.set("virtualName", om.valueToTree(this.getVirtualName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotFleetRequestLaunchSpecificationEphemeralBlockDevice.Jsii$Proxy that = (SpotFleetRequestLaunchSpecificationEphemeralBlockDevice.Jsii$Proxy) o;

            if (!deviceName.equals(that.deviceName)) return false;
            return this.virtualName.equals(that.virtualName);
        }

        @Override
        public final int hashCode() {
            int result = this.deviceName.hashCode();
            result = 31 * result + (this.virtualName.hashCode());
            return result;
        }
    }
}
