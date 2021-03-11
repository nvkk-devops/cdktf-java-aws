package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.038Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getNamespaceName();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceName();

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap> {
        private java.lang.String namespaceName;
        private java.lang.String serviceName;
        private java.util.Map<java.lang.String, java.lang.String> attributes;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap#getNamespaceName}
         * @param namespaceName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder namespaceName(java.lang.String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap#getServiceName}
         * @param serviceName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap#getAttributes}
         * @param attributes the value to be set.
         * @return {@code this}
         */
        public Builder attributes(java.util.Map<java.lang.String, java.lang.String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap build() {
            return new Jsii$Proxy(namespaceName, serviceName, attributes);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap {
        private final java.lang.String namespaceName;
        private final java.lang.String serviceName;
        private final java.util.Map<java.lang.String, java.lang.String> attributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.namespaceName = software.amazon.jsii.Kernel.get(this, "namespaceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.attributes = software.amazon.jsii.Kernel.get(this, "attributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String namespaceName, final java.lang.String serviceName, final java.util.Map<java.lang.String, java.lang.String> attributes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.namespaceName = java.util.Objects.requireNonNull(namespaceName, "namespaceName is required");
            this.serviceName = java.util.Objects.requireNonNull(serviceName, "serviceName is required");
            this.attributes = attributes;
        }

        @Override
        public final java.lang.String getNamespaceName() {
            return this.namespaceName;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getAttributes() {
            return this.attributes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("namespaceName", om.valueToTree(this.getNamespaceName()));
            data.set("serviceName", om.valueToTree(this.getServiceName()));
            if (this.getAttributes() != null) {
                data.set("attributes", om.valueToTree(this.getAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap.Jsii$Proxy that = (AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap.Jsii$Proxy) o;

            if (!namespaceName.equals(that.namespaceName)) return false;
            if (!serviceName.equals(that.serviceName)) return false;
            return this.attributes != null ? this.attributes.equals(that.attributes) : that.attributes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.namespaceName.hashCode();
            result = 31 * result + (this.serviceName.hashCode());
            result = 31 * result + (this.attributes != null ? this.attributes.hashCode() : 0);
            return result;
        }
    }
}
