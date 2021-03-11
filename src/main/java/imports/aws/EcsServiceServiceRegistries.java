package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.516Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsServiceServiceRegistries")
@software.amazon.jsii.Jsii.Proxy(EcsServiceServiceRegistries.Jsii$Proxy.class)
public interface EcsServiceServiceRegistries extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRegistryArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getContainerName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getContainerPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsServiceServiceRegistries}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsServiceServiceRegistries}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsServiceServiceRegistries> {
        private java.lang.String registryArn;
        private java.lang.String containerName;
        private java.lang.Number containerPort;
        private java.lang.Number port;

        /**
         * Sets the value of {@link EcsServiceServiceRegistries#getRegistryArn}
         * @param registryArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder registryArn(java.lang.String registryArn) {
            this.registryArn = registryArn;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceServiceRegistries#getContainerName}
         * @param containerName the value to be set.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceServiceRegistries#getContainerPort}
         * @param containerPort the value to be set.
         * @return {@code this}
         */
        public Builder containerPort(java.lang.Number containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceServiceRegistries#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsServiceServiceRegistries}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsServiceServiceRegistries build() {
            return new Jsii$Proxy(registryArn, containerName, containerPort, port);
        }
    }

    /**
     * An implementation for {@link EcsServiceServiceRegistries}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsServiceServiceRegistries {
        private final java.lang.String registryArn;
        private final java.lang.String containerName;
        private final java.lang.Number containerPort;
        private final java.lang.Number port;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.registryArn = software.amazon.jsii.Kernel.get(this, "registryArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerName = software.amazon.jsii.Kernel.get(this, "containerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerPort = software.amazon.jsii.Kernel.get(this, "containerPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String registryArn, final java.lang.String containerName, final java.lang.Number containerPort, final java.lang.Number port) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.registryArn = java.util.Objects.requireNonNull(registryArn, "registryArn is required");
            this.containerName = containerName;
            this.containerPort = containerPort;
            this.port = port;
        }

        @Override
        public final java.lang.String getRegistryArn() {
            return this.registryArn;
        }

        @Override
        public final java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public final java.lang.Number getContainerPort() {
            return this.containerPort;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("registryArn", om.valueToTree(this.getRegistryArn()));
            if (this.getContainerName() != null) {
                data.set("containerName", om.valueToTree(this.getContainerName()));
            }
            if (this.getContainerPort() != null) {
                data.set("containerPort", om.valueToTree(this.getContainerPort()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EcsServiceServiceRegistries"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsServiceServiceRegistries.Jsii$Proxy that = (EcsServiceServiceRegistries.Jsii$Proxy) o;

            if (!registryArn.equals(that.registryArn)) return false;
            if (this.containerName != null ? !this.containerName.equals(that.containerName) : that.containerName != null) return false;
            if (this.containerPort != null ? !this.containerPort.equals(that.containerPort) : that.containerPort != null) return false;
            return this.port != null ? this.port.equals(that.port) : that.port == null;
        }

        @Override
        public final int hashCode() {
            int result = this.registryArn.hashCode();
            result = 31 * result + (this.containerName != null ? this.containerName.hashCode() : 0);
            result = 31 * result + (this.containerPort != null ? this.containerPort.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            return result;
        }
    }
}
