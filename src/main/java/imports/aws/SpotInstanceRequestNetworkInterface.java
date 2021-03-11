package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.888Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotInstanceRequestNetworkInterface")
@software.amazon.jsii.Jsii.Proxy(SpotInstanceRequestNetworkInterface.Jsii$Proxy.class)
public interface SpotInstanceRequestNetworkInterface extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getDeviceIndex();

    @org.jetbrains.annotations.NotNull java.lang.String getNetworkInterfaceId();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteOnTermination() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotInstanceRequestNetworkInterface}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotInstanceRequestNetworkInterface}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotInstanceRequestNetworkInterface> {
        private java.lang.Number deviceIndex;
        private java.lang.String networkInterfaceId;
        private java.lang.Boolean deleteOnTermination;

        /**
         * Sets the value of {@link SpotInstanceRequestNetworkInterface#getDeviceIndex}
         * @param deviceIndex the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder deviceIndex(java.lang.Number deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestNetworkInterface#getNetworkInterfaceId}
         * @param networkInterfaceId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder networkInterfaceId(java.lang.String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestNetworkInterface#getDeleteOnTermination}
         * @param deleteOnTermination the value to be set.
         * @return {@code this}
         */
        public Builder deleteOnTermination(java.lang.Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SpotInstanceRequestNetworkInterface}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotInstanceRequestNetworkInterface build() {
            return new Jsii$Proxy(deviceIndex, networkInterfaceId, deleteOnTermination);
        }
    }

    /**
     * An implementation for {@link SpotInstanceRequestNetworkInterface}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotInstanceRequestNetworkInterface {
        private final java.lang.Number deviceIndex;
        private final java.lang.String networkInterfaceId;
        private final java.lang.Boolean deleteOnTermination;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deviceIndex = software.amazon.jsii.Kernel.get(this, "deviceIndex", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.networkInterfaceId = software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deleteOnTermination = software.amazon.jsii.Kernel.get(this, "deleteOnTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number deviceIndex, final java.lang.String networkInterfaceId, final java.lang.Boolean deleteOnTermination) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deviceIndex = java.util.Objects.requireNonNull(deviceIndex, "deviceIndex is required");
            this.networkInterfaceId = java.util.Objects.requireNonNull(networkInterfaceId, "networkInterfaceId is required");
            this.deleteOnTermination = deleteOnTermination;
        }

        @Override
        public final java.lang.Number getDeviceIndex() {
            return this.deviceIndex;
        }

        @Override
        public final java.lang.String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        @Override
        public final java.lang.Boolean getDeleteOnTermination() {
            return this.deleteOnTermination;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("deviceIndex", om.valueToTree(this.getDeviceIndex()));
            data.set("networkInterfaceId", om.valueToTree(this.getNetworkInterfaceId()));
            if (this.getDeleteOnTermination() != null) {
                data.set("deleteOnTermination", om.valueToTree(this.getDeleteOnTermination()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SpotInstanceRequestNetworkInterface"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotInstanceRequestNetworkInterface.Jsii$Proxy that = (SpotInstanceRequestNetworkInterface.Jsii$Proxy) o;

            if (!deviceIndex.equals(that.deviceIndex)) return false;
            if (!networkInterfaceId.equals(that.networkInterfaceId)) return false;
            return this.deleteOnTermination != null ? this.deleteOnTermination.equals(that.deleteOnTermination) : that.deleteOnTermination == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deviceIndex.hashCode();
            result = 31 * result + (this.networkInterfaceId.hashCode());
            result = 31 * result + (this.deleteOnTermination != null ? this.deleteOnTermination.hashCode() : 0);
            return result;
        }
    }
}
