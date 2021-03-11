package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.594Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueConnectionPhysicalConnectionRequirements")
@software.amazon.jsii.Jsii.Proxy(GlueConnectionPhysicalConnectionRequirements.Jsii$Proxy.class)
public interface GlueConnectionPhysicalConnectionRequirements extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIdList() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueConnectionPhysicalConnectionRequirements}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueConnectionPhysicalConnectionRequirements}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueConnectionPhysicalConnectionRequirements> {
        private java.lang.String availabilityZone;
        private java.util.List<java.lang.String> securityGroupIdList;
        private java.lang.String subnetId;

        /**
         * Sets the value of {@link GlueConnectionPhysicalConnectionRequirements#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionPhysicalConnectionRequirements#getSecurityGroupIdList}
         * @param securityGroupIdList the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupIdList(java.util.List<java.lang.String> securityGroupIdList) {
            this.securityGroupIdList = securityGroupIdList;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionPhysicalConnectionRequirements#getSubnetId}
         * @param subnetId the value to be set.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueConnectionPhysicalConnectionRequirements}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueConnectionPhysicalConnectionRequirements build() {
            return new Jsii$Proxy(availabilityZone, securityGroupIdList, subnetId);
        }
    }

    /**
     * An implementation for {@link GlueConnectionPhysicalConnectionRequirements}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueConnectionPhysicalConnectionRequirements {
        private final java.lang.String availabilityZone;
        private final java.util.List<java.lang.String> securityGroupIdList;
        private final java.lang.String subnetId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroupIdList = software.amazon.jsii.Kernel.get(this, "securityGroupIdList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String availabilityZone, final java.util.List<java.lang.String> securityGroupIdList, final java.lang.String subnetId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.availabilityZone = availabilityZone;
            this.securityGroupIdList = securityGroupIdList;
            this.subnetId = subnetId;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupIdList() {
            return this.securityGroupIdList;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getSecurityGroupIdList() != null) {
                data.set("securityGroupIdList", om.valueToTree(this.getSecurityGroupIdList()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueConnectionPhysicalConnectionRequirements"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueConnectionPhysicalConnectionRequirements.Jsii$Proxy that = (GlueConnectionPhysicalConnectionRequirements.Jsii$Proxy) o;

            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.securityGroupIdList != null ? !this.securityGroupIdList.equals(that.securityGroupIdList) : that.securityGroupIdList != null) return false;
            return this.subnetId != null ? this.subnetId.equals(that.subnetId) : that.subnetId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.availabilityZone != null ? this.availabilityZone.hashCode() : 0;
            result = 31 * result + (this.securityGroupIdList != null ? this.securityGroupIdList.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            return result;
        }
    }
}
