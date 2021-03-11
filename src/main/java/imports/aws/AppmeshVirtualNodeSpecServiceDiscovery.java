package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.038Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecServiceDiscovery")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecServiceDiscovery.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecServiceDiscovery extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_cloud_map block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap> getAwsCloudMap() {
        return null;
    }

    /**
     * dns block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns> getDns() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecServiceDiscovery}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecServiceDiscovery}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecServiceDiscovery> {
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap> awsCloudMap;
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns> dns;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscovery#getAwsCloudMap}
         * @param awsCloudMap aws_cloud_map block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder awsCloudMap(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap> awsCloudMap) {
            this.awsCloudMap = (java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap>)awsCloudMap;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscovery#getDns}
         * @param dns dns block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dns(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns> dns) {
            this.dns = (java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns>)dns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecServiceDiscovery}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecServiceDiscovery build() {
            return new Jsii$Proxy(awsCloudMap, dns);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecServiceDiscovery}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecServiceDiscovery {
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap> awsCloudMap;
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns> dns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsCloudMap = software.amazon.jsii.Kernel.get(this, "awsCloudMap", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap.class)));
            this.dns = software.amazon.jsii.Kernel.get(this, "dns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap> awsCloudMap, final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns> dns) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.awsCloudMap = (java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap>)awsCloudMap;
            this.dns = (java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns>)dns;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap> getAwsCloudMap() {
            return this.awsCloudMap;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscoveryDns> getDns() {
            return this.dns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAwsCloudMap() != null) {
                data.set("awsCloudMap", om.valueToTree(this.getAwsCloudMap()));
            }
            if (this.getDns() != null) {
                data.set("dns", om.valueToTree(this.getDns()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecServiceDiscovery"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecServiceDiscovery.Jsii$Proxy that = (AppmeshVirtualNodeSpecServiceDiscovery.Jsii$Proxy) o;

            if (this.awsCloudMap != null ? !this.awsCloudMap.equals(that.awsCloudMap) : that.awsCloudMap != null) return false;
            return this.dns != null ? this.dns.equals(that.dns) : that.dns == null;
        }

        @Override
        public final int hashCode() {
            int result = this.awsCloudMap != null ? this.awsCloudMap.hashCode() : 0;
            result = 31 * result + (this.dns != null ? this.dns.hashCode() : 0);
            return result;
        }
    }
}
