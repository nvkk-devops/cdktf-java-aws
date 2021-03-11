package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.396Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DatasyncLocationEfsEc2Config")
@software.amazon.jsii.Jsii.Proxy(DatasyncLocationEfsEc2Config.Jsii$Proxy.class)
public interface DatasyncLocationEfsEc2Config extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroupArns();

    @org.jetbrains.annotations.NotNull java.lang.String getSubnetArn();

    /**
     * @return a {@link Builder} of {@link DatasyncLocationEfsEc2Config}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DatasyncLocationEfsEc2Config}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DatasyncLocationEfsEc2Config> {
        private java.util.List<java.lang.String> securityGroupArns;
        private java.lang.String subnetArn;

        /**
         * Sets the value of {@link DatasyncLocationEfsEc2Config#getSecurityGroupArns}
         * @param securityGroupArns the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder securityGroupArns(java.util.List<java.lang.String> securityGroupArns) {
            this.securityGroupArns = securityGroupArns;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncLocationEfsEc2Config#getSubnetArn}
         * @param subnetArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetArn(java.lang.String subnetArn) {
            this.subnetArn = subnetArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DatasyncLocationEfsEc2Config}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DatasyncLocationEfsEc2Config build() {
            return new Jsii$Proxy(securityGroupArns, subnetArn);
        }
    }

    /**
     * An implementation for {@link DatasyncLocationEfsEc2Config}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DatasyncLocationEfsEc2Config {
        private final java.util.List<java.lang.String> securityGroupArns;
        private final java.lang.String subnetArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.securityGroupArns = software.amazon.jsii.Kernel.get(this, "securityGroupArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.subnetArn = software.amazon.jsii.Kernel.get(this, "subnetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> securityGroupArns, final java.lang.String subnetArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.securityGroupArns = java.util.Objects.requireNonNull(securityGroupArns, "securityGroupArns is required");
            this.subnetArn = java.util.Objects.requireNonNull(subnetArn, "subnetArn is required");
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupArns() {
            return this.securityGroupArns;
        }

        @Override
        public final java.lang.String getSubnetArn() {
            return this.subnetArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("securityGroupArns", om.valueToTree(this.getSecurityGroupArns()));
            data.set("subnetArn", om.valueToTree(this.getSubnetArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DatasyncLocationEfsEc2Config"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DatasyncLocationEfsEc2Config.Jsii$Proxy that = (DatasyncLocationEfsEc2Config.Jsii$Proxy) o;

            if (!securityGroupArns.equals(that.securityGroupArns)) return false;
            return this.subnetArn.equals(that.subnetArn);
        }

        @Override
        public final int hashCode() {
            int result = this.securityGroupArns.hashCode();
            result = 31 * result + (this.subnetArn.hashCode());
            return result;
        }
    }
}
