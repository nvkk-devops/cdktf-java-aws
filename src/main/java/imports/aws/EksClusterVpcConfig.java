package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.532Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksClusterVpcConfig")
@software.amazon.jsii.Jsii.Proxy(EksClusterVpcConfig.Jsii$Proxy.class)
public interface EksClusterVpcConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEndpointPrivateAccess() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEndpointPublicAccess() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPublicAccessCidrs() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EksClusterVpcConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksClusterVpcConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksClusterVpcConfig> {
        private java.util.List<java.lang.String> subnetIds;
        private java.lang.Boolean endpointPrivateAccess;
        private java.lang.Boolean endpointPublicAccess;
        private java.util.List<java.lang.String> publicAccessCidrs;
        private java.util.List<java.lang.String> securityGroupIds;

        /**
         * Sets the value of {@link EksClusterVpcConfig#getSubnetIds}
         * @param subnetIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetIds(java.util.List<java.lang.String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterVpcConfig#getEndpointPrivateAccess}
         * @param endpointPrivateAccess the value to be set.
         * @return {@code this}
         */
        public Builder endpointPrivateAccess(java.lang.Boolean endpointPrivateAccess) {
            this.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterVpcConfig#getEndpointPublicAccess}
         * @param endpointPublicAccess the value to be set.
         * @return {@code this}
         */
        public Builder endpointPublicAccess(java.lang.Boolean endpointPublicAccess) {
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterVpcConfig#getPublicAccessCidrs}
         * @param publicAccessCidrs the value to be set.
         * @return {@code this}
         */
        public Builder publicAccessCidrs(java.util.List<java.lang.String> publicAccessCidrs) {
            this.publicAccessCidrs = publicAccessCidrs;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterVpcConfig#getSecurityGroupIds}
         * @param securityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupIds(java.util.List<java.lang.String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EksClusterVpcConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksClusterVpcConfig build() {
            return new Jsii$Proxy(subnetIds, endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds);
        }
    }

    /**
     * An implementation for {@link EksClusterVpcConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksClusterVpcConfig {
        private final java.util.List<java.lang.String> subnetIds;
        private final java.lang.Boolean endpointPrivateAccess;
        private final java.lang.Boolean endpointPublicAccess;
        private final java.util.List<java.lang.String> publicAccessCidrs;
        private final java.util.List<java.lang.String> securityGroupIds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.subnetIds = software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.endpointPrivateAccess = software.amazon.jsii.Kernel.get(this, "endpointPrivateAccess", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.endpointPublicAccess = software.amazon.jsii.Kernel.get(this, "endpointPublicAccess", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.publicAccessCidrs = software.amazon.jsii.Kernel.get(this, "publicAccessCidrs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.securityGroupIds = software.amazon.jsii.Kernel.get(this, "securityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> subnetIds, final java.lang.Boolean endpointPrivateAccess, final java.lang.Boolean endpointPublicAccess, final java.util.List<java.lang.String> publicAccessCidrs, final java.util.List<java.lang.String> securityGroupIds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subnetIds = java.util.Objects.requireNonNull(subnetIds, "subnetIds is required");
            this.endpointPrivateAccess = endpointPrivateAccess;
            this.endpointPublicAccess = endpointPublicAccess;
            this.publicAccessCidrs = publicAccessCidrs;
            this.securityGroupIds = securityGroupIds;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetIds() {
            return this.subnetIds;
        }

        @Override
        public final java.lang.Boolean getEndpointPrivateAccess() {
            return this.endpointPrivateAccess;
        }

        @Override
        public final java.lang.Boolean getEndpointPublicAccess() {
            return this.endpointPublicAccess;
        }

        @Override
        public final java.util.List<java.lang.String> getPublicAccessCidrs() {
            return this.publicAccessCidrs;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("subnetIds", om.valueToTree(this.getSubnetIds()));
            if (this.getEndpointPrivateAccess() != null) {
                data.set("endpointPrivateAccess", om.valueToTree(this.getEndpointPrivateAccess()));
            }
            if (this.getEndpointPublicAccess() != null) {
                data.set("endpointPublicAccess", om.valueToTree(this.getEndpointPublicAccess()));
            }
            if (this.getPublicAccessCidrs() != null) {
                data.set("publicAccessCidrs", om.valueToTree(this.getPublicAccessCidrs()));
            }
            if (this.getSecurityGroupIds() != null) {
                data.set("securityGroupIds", om.valueToTree(this.getSecurityGroupIds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EksClusterVpcConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksClusterVpcConfig.Jsii$Proxy that = (EksClusterVpcConfig.Jsii$Proxy) o;

            if (!subnetIds.equals(that.subnetIds)) return false;
            if (this.endpointPrivateAccess != null ? !this.endpointPrivateAccess.equals(that.endpointPrivateAccess) : that.endpointPrivateAccess != null) return false;
            if (this.endpointPublicAccess != null ? !this.endpointPublicAccess.equals(that.endpointPublicAccess) : that.endpointPublicAccess != null) return false;
            if (this.publicAccessCidrs != null ? !this.publicAccessCidrs.equals(that.publicAccessCidrs) : that.publicAccessCidrs != null) return false;
            return this.securityGroupIds != null ? this.securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.subnetIds.hashCode();
            result = 31 * result + (this.endpointPrivateAccess != null ? this.endpointPrivateAccess.hashCode() : 0);
            result = 31 * result + (this.endpointPublicAccess != null ? this.endpointPublicAccess.hashCode() : 0);
            result = 31 * result + (this.publicAccessCidrs != null ? this.publicAccessCidrs.hashCode() : 0);
            result = 31 * result + (this.securityGroupIds != null ? this.securityGroupIds.hashCode() : 0);
            return result;
        }
    }
}
