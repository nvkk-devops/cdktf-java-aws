package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.826Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Route53ZoneVpc")
@software.amazon.jsii.Jsii.Proxy(Route53ZoneVpc.Jsii$Proxy.class)
public interface Route53ZoneVpc extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getVpcId();

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcRegion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Route53ZoneVpc}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53ZoneVpc}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53ZoneVpc> {
        private java.lang.String vpcId;
        private java.lang.String vpcRegion;

        /**
         * Sets the value of {@link Route53ZoneVpc#getVpcId}
         * @param vpcId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link Route53ZoneVpc#getVpcRegion}
         * @param vpcRegion the value to be set.
         * @return {@code this}
         */
        public Builder vpcRegion(java.lang.String vpcRegion) {
            this.vpcRegion = vpcRegion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Route53ZoneVpc}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53ZoneVpc build() {
            return new Jsii$Proxy(vpcId, vpcRegion);
        }
    }

    /**
     * An implementation for {@link Route53ZoneVpc}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53ZoneVpc {
        private final java.lang.String vpcId;
        private final java.lang.String vpcRegion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.vpcId = software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcRegion = software.amazon.jsii.Kernel.get(this, "vpcRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String vpcId, final java.lang.String vpcRegion) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.vpcId = java.util.Objects.requireNonNull(vpcId, "vpcId is required");
            this.vpcRegion = vpcRegion;
        }

        @Override
        public final java.lang.String getVpcId() {
            return this.vpcId;
        }

        @Override
        public final java.lang.String getVpcRegion() {
            return this.vpcRegion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("vpcId", om.valueToTree(this.getVpcId()));
            if (this.getVpcRegion() != null) {
                data.set("vpcRegion", om.valueToTree(this.getVpcRegion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Route53ZoneVpc"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53ZoneVpc.Jsii$Proxy that = (Route53ZoneVpc.Jsii$Proxy) o;

            if (!vpcId.equals(that.vpcId)) return false;
            return this.vpcRegion != null ? this.vpcRegion.equals(that.vpcRegion) : that.vpcRegion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.vpcId.hashCode();
            result = 31 * result + (this.vpcRegion != null ? this.vpcRegion.hashCode() : 0);
            return result;
        }
    }
}
