package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.039Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecServiceDiscoveryDns")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecServiceDiscoveryDns.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecServiceDiscoveryDns extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getHostname();

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecServiceDiscoveryDns}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecServiceDiscoveryDns}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecServiceDiscoveryDns> {
        private java.lang.String hostname;
        private java.lang.String serviceName;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscoveryDns#getHostname}
         * @param hostname the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscoveryDns#getServiceName}
         * @param serviceName the value to be set.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecServiceDiscoveryDns}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecServiceDiscoveryDns build() {
            return new Jsii$Proxy(hostname, serviceName);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecServiceDiscoveryDns}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecServiceDiscoveryDns {
        private final java.lang.String hostname;
        private final java.lang.String serviceName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hostname = software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String hostname, final java.lang.String serviceName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hostname = java.util.Objects.requireNonNull(hostname, "hostname is required");
            this.serviceName = serviceName;
        }

        @Override
        public final java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("hostname", om.valueToTree(this.getHostname()));
            if (this.getServiceName() != null) {
                data.set("serviceName", om.valueToTree(this.getServiceName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecServiceDiscoveryDns"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecServiceDiscoveryDns.Jsii$Proxy that = (AppmeshVirtualNodeSpecServiceDiscoveryDns.Jsii$Proxy) o;

            if (!hostname.equals(that.hostname)) return false;
            return this.serviceName != null ? this.serviceName.equals(that.serviceName) : that.serviceName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hostname.hashCode();
            result = 31 * result + (this.serviceName != null ? this.serviceName.hashCode() : 0);
            return result;
        }
    }
}
