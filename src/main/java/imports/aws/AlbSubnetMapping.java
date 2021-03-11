package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.945Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbSubnetMapping")
@software.amazon.jsii.Jsii.Proxy(AlbSubnetMapping.Jsii$Proxy.class)
public interface AlbSubnetMapping extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getSubnetId();

    default @org.jetbrains.annotations.Nullable java.lang.String getAllocationId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbSubnetMapping}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbSubnetMapping}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbSubnetMapping> {
        private java.lang.String subnetId;
        private java.lang.String allocationId;

        /**
         * Sets the value of {@link AlbSubnetMapping#getSubnetId}
         * @param subnetId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link AlbSubnetMapping#getAllocationId}
         * @param allocationId the value to be set.
         * @return {@code this}
         */
        public Builder allocationId(java.lang.String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbSubnetMapping}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbSubnetMapping build() {
            return new Jsii$Proxy(subnetId, allocationId);
        }
    }

    /**
     * An implementation for {@link AlbSubnetMapping}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbSubnetMapping {
        private final java.lang.String subnetId;
        private final java.lang.String allocationId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allocationId = software.amazon.jsii.Kernel.get(this, "allocationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String subnetId, final java.lang.String allocationId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subnetId = java.util.Objects.requireNonNull(subnetId, "subnetId is required");
            this.allocationId = allocationId;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        public final java.lang.String getAllocationId() {
            return this.allocationId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("subnetId", om.valueToTree(this.getSubnetId()));
            if (this.getAllocationId() != null) {
                data.set("allocationId", om.valueToTree(this.getAllocationId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AlbSubnetMapping"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbSubnetMapping.Jsii$Proxy that = (AlbSubnetMapping.Jsii$Proxy) o;

            if (!subnetId.equals(that.subnetId)) return false;
            return this.allocationId != null ? this.allocationId.equals(that.allocationId) : that.allocationId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.subnetId.hashCode();
            result = 31 * result + (this.allocationId != null ? this.allocationId.hashCode() : 0);
            return result;
        }
    }
}
