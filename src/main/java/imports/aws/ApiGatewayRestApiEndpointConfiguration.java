package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.993Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayRestApiEndpointConfiguration")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayRestApiEndpointConfiguration.Jsii$Proxy.class)
public interface ApiGatewayRestApiEndpointConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTypes();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcEndpointIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayRestApiEndpointConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayRestApiEndpointConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayRestApiEndpointConfiguration> {
        private java.util.List<java.lang.String> types;
        private java.util.List<java.lang.String> vpcEndpointIds;

        /**
         * Sets the value of {@link ApiGatewayRestApiEndpointConfiguration#getTypes}
         * @param types the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder types(java.util.List<java.lang.String> types) {
            this.types = types;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiEndpointConfiguration#getVpcEndpointIds}
         * @param vpcEndpointIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcEndpointIds(java.util.List<java.lang.String> vpcEndpointIds) {
            this.vpcEndpointIds = vpcEndpointIds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayRestApiEndpointConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayRestApiEndpointConfiguration build() {
            return new Jsii$Proxy(types, vpcEndpointIds);
        }
    }

    /**
     * An implementation for {@link ApiGatewayRestApiEndpointConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayRestApiEndpointConfiguration {
        private final java.util.List<java.lang.String> types;
        private final java.util.List<java.lang.String> vpcEndpointIds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.types = software.amazon.jsii.Kernel.get(this, "types", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcEndpointIds = software.amazon.jsii.Kernel.get(this, "vpcEndpointIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> types, final java.util.List<java.lang.String> vpcEndpointIds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.types = java.util.Objects.requireNonNull(types, "types is required");
            this.vpcEndpointIds = vpcEndpointIds;
        }

        @Override
        public final java.util.List<java.lang.String> getTypes() {
            return this.types;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcEndpointIds() {
            return this.vpcEndpointIds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("types", om.valueToTree(this.getTypes()));
            if (this.getVpcEndpointIds() != null) {
                data.set("vpcEndpointIds", om.valueToTree(this.getVpcEndpointIds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ApiGatewayRestApiEndpointConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayRestApiEndpointConfiguration.Jsii$Proxy that = (ApiGatewayRestApiEndpointConfiguration.Jsii$Proxy) o;

            if (!types.equals(that.types)) return false;
            return this.vpcEndpointIds != null ? this.vpcEndpointIds.equals(that.vpcEndpointIds) : that.vpcEndpointIds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.types.hashCode();
            result = 31 * result + (this.vpcEndpointIds != null ? this.vpcEndpointIds.hashCode() : 0);
            return result;
        }
    }
}
