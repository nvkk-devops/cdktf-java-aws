package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.037Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpec.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * backend block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecBackend> getBackend() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBackends() {
        return null;
    }

    /**
     * listener block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecListener> getListener() {
        return null;
    }

    /**
     * logging block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecLogging> getLogging() {
        return null;
    }

    /**
     * service_discovery block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscovery> getServiceDiscovery() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpec> {
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecBackend> backend;
        private java.util.List<java.lang.String> backends;
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecListener> listener;
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecLogging> logging;
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscovery> serviceDiscovery;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpec#getBackend}
         * @param backend backend block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder backend(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecBackend> backend) {
            this.backend = (java.util.List<imports.aws.AppmeshVirtualNodeSpecBackend>)backend;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpec#getBackends}
         * @param backends the value to be set.
         * @return {@code this}
         */
        public Builder backends(java.util.List<java.lang.String> backends) {
            this.backends = backends;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpec#getListener}
         * @param listener listener block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder listener(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecListener> listener) {
            this.listener = (java.util.List<imports.aws.AppmeshVirtualNodeSpecListener>)listener;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpec#getLogging}
         * @param logging logging block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder logging(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecLogging> logging) {
            this.logging = (java.util.List<imports.aws.AppmeshVirtualNodeSpecLogging>)logging;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpec#getServiceDiscovery}
         * @param serviceDiscovery service_discovery block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder serviceDiscovery(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecServiceDiscovery> serviceDiscovery) {
            this.serviceDiscovery = (java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscovery>)serviceDiscovery;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpec build() {
            return new Jsii$Proxy(backend, backends, listener, logging, serviceDiscovery);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpec {
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecBackend> backend;
        private final java.util.List<java.lang.String> backends;
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecListener> listener;
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecLogging> logging;
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscovery> serviceDiscovery;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.backend = software.amazon.jsii.Kernel.get(this, "backend", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecBackend.class)));
            this.backends = software.amazon.jsii.Kernel.get(this, "backends", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.listener = software.amazon.jsii.Kernel.get(this, "listener", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecListener.class)));
            this.logging = software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecLogging.class)));
            this.serviceDiscovery = software.amazon.jsii.Kernel.get(this, "serviceDiscovery", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecServiceDiscovery.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecBackend> backend, final java.util.List<java.lang.String> backends, final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecListener> listener, final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecLogging> logging, final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecServiceDiscovery> serviceDiscovery) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.backend = (java.util.List<imports.aws.AppmeshVirtualNodeSpecBackend>)backend;
            this.backends = backends;
            this.listener = (java.util.List<imports.aws.AppmeshVirtualNodeSpecListener>)listener;
            this.logging = (java.util.List<imports.aws.AppmeshVirtualNodeSpecLogging>)logging;
            this.serviceDiscovery = (java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscovery>)serviceDiscovery;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecBackend> getBackend() {
            return this.backend;
        }

        @Override
        public final java.util.List<java.lang.String> getBackends() {
            return this.backends;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecListener> getListener() {
            return this.listener;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecLogging> getLogging() {
            return this.logging;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecServiceDiscovery> getServiceDiscovery() {
            return this.serviceDiscovery;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBackend() != null) {
                data.set("backend", om.valueToTree(this.getBackend()));
            }
            if (this.getBackends() != null) {
                data.set("backends", om.valueToTree(this.getBackends()));
            }
            if (this.getListener() != null) {
                data.set("listener", om.valueToTree(this.getListener()));
            }
            if (this.getLogging() != null) {
                data.set("logging", om.valueToTree(this.getLogging()));
            }
            if (this.getServiceDiscovery() != null) {
                data.set("serviceDiscovery", om.valueToTree(this.getServiceDiscovery()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpec.Jsii$Proxy that = (AppmeshVirtualNodeSpec.Jsii$Proxy) o;

            if (this.backend != null ? !this.backend.equals(that.backend) : that.backend != null) return false;
            if (this.backends != null ? !this.backends.equals(that.backends) : that.backends != null) return false;
            if (this.listener != null ? !this.listener.equals(that.listener) : that.listener != null) return false;
            if (this.logging != null ? !this.logging.equals(that.logging) : that.logging != null) return false;
            return this.serviceDiscovery != null ? this.serviceDiscovery.equals(that.serviceDiscovery) : that.serviceDiscovery == null;
        }

        @Override
        public final int hashCode() {
            int result = this.backend != null ? this.backend.hashCode() : 0;
            result = 31 * result + (this.backends != null ? this.backends.hashCode() : 0);
            result = 31 * result + (this.listener != null ? this.listener.hashCode() : 0);
            result = 31 * result + (this.logging != null ? this.logging.hashCode() : 0);
            result = 31 * result + (this.serviceDiscovery != null ? this.serviceDiscovery.hashCode() : 0);
            return result;
        }
    }
}
