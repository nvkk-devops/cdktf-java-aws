package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.037Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecBackendVirtualService")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecBackendVirtualService.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecBackendVirtualService extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getVirtualServiceName();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecBackendVirtualService}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecBackendVirtualService}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecBackendVirtualService> {
        private java.lang.String virtualServiceName;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecBackendVirtualService#getVirtualServiceName}
         * @param virtualServiceName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder virtualServiceName(java.lang.String virtualServiceName) {
            this.virtualServiceName = virtualServiceName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecBackendVirtualService}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecBackendVirtualService build() {
            return new Jsii$Proxy(virtualServiceName);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecBackendVirtualService}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecBackendVirtualService {
        private final java.lang.String virtualServiceName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.virtualServiceName = software.amazon.jsii.Kernel.get(this, "virtualServiceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String virtualServiceName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.virtualServiceName = java.util.Objects.requireNonNull(virtualServiceName, "virtualServiceName is required");
        }

        @Override
        public final java.lang.String getVirtualServiceName() {
            return this.virtualServiceName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("virtualServiceName", om.valueToTree(this.getVirtualServiceName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecBackendVirtualService"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecBackendVirtualService.Jsii$Proxy that = (AppmeshVirtualNodeSpecBackendVirtualService.Jsii$Proxy) o;

            return this.virtualServiceName.equals(that.virtualServiceName);
        }

        @Override
        public final int hashCode() {
            int result = this.virtualServiceName.hashCode();
            return result;
        }
    }
}
