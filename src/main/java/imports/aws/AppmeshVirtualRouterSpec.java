package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.040Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualRouterSpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualRouterSpec.Jsii$Proxy.class)
public interface AppmeshVirtualRouterSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * listener block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppmeshVirtualRouterSpecListener> getListener();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getServiceNames() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualRouterSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualRouterSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualRouterSpec> {
        private java.util.List<imports.aws.AppmeshVirtualRouterSpecListener> listener;
        private java.util.List<java.lang.String> serviceNames;

        /**
         * Sets the value of {@link AppmeshVirtualRouterSpec#getListener}
         * @param listener listener block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder listener(java.util.List<? extends imports.aws.AppmeshVirtualRouterSpecListener> listener) {
            this.listener = (java.util.List<imports.aws.AppmeshVirtualRouterSpecListener>)listener;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualRouterSpec#getServiceNames}
         * @param serviceNames the value to be set.
         * @return {@code this}
         */
        public Builder serviceNames(java.util.List<java.lang.String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualRouterSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualRouterSpec build() {
            return new Jsii$Proxy(listener, serviceNames);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualRouterSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualRouterSpec {
        private final java.util.List<imports.aws.AppmeshVirtualRouterSpecListener> listener;
        private final java.util.List<java.lang.String> serviceNames;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.listener = software.amazon.jsii.Kernel.get(this, "listener", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualRouterSpecListener.class)));
            this.serviceNames = software.amazon.jsii.Kernel.get(this, "serviceNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualRouterSpecListener> listener, final java.util.List<java.lang.String> serviceNames) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.listener = (java.util.List<imports.aws.AppmeshVirtualRouterSpecListener>)java.util.Objects.requireNonNull(listener, "listener is required");
            this.serviceNames = serviceNames;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualRouterSpecListener> getListener() {
            return this.listener;
        }

        @Override
        public final java.util.List<java.lang.String> getServiceNames() {
            return this.serviceNames;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("listener", om.valueToTree(this.getListener()));
            if (this.getServiceNames() != null) {
                data.set("serviceNames", om.valueToTree(this.getServiceNames()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualRouterSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualRouterSpec.Jsii$Proxy that = (AppmeshVirtualRouterSpec.Jsii$Proxy) o;

            if (!listener.equals(that.listener)) return false;
            return this.serviceNames != null ? this.serviceNames.equals(that.serviceNames) : that.serviceNames == null;
        }

        @Override
        public final int hashCode() {
            int result = this.listener.hashCode();
            result = 31 * result + (this.serviceNames != null ? this.serviceNames.hashCode() : 0);
            return result;
        }
    }
}
