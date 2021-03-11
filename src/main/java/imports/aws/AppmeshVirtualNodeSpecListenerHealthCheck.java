package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.038Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecListenerHealthCheck")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerHealthCheck.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerHealthCheck extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getHealthyThreshold();

    @org.jetbrains.annotations.NotNull java.lang.Number getIntervalMillis();

    @org.jetbrains.annotations.NotNull java.lang.String getProtocol();

    @org.jetbrains.annotations.NotNull java.lang.Number getTimeoutMillis();

    @org.jetbrains.annotations.NotNull java.lang.Number getUnhealthyThreshold();

    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerHealthCheck}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerHealthCheck}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerHealthCheck> {
        private java.lang.Number healthyThreshold;
        private java.lang.Number intervalMillis;
        private java.lang.String protocol;
        private java.lang.Number timeoutMillis;
        private java.lang.Number unhealthyThreshold;
        private java.lang.String path;
        private java.lang.Number port;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerHealthCheck#getHealthyThreshold}
         * @param healthyThreshold the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder healthyThreshold(java.lang.Number healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerHealthCheck#getIntervalMillis}
         * @param intervalMillis the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder intervalMillis(java.lang.Number intervalMillis) {
            this.intervalMillis = intervalMillis;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerHealthCheck#getProtocol}
         * @param protocol the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerHealthCheck#getTimeoutMillis}
         * @param timeoutMillis the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder timeoutMillis(java.lang.Number timeoutMillis) {
            this.timeoutMillis = timeoutMillis;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerHealthCheck#getUnhealthyThreshold}
         * @param unhealthyThreshold the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder unhealthyThreshold(java.lang.Number unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerHealthCheck#getPath}
         * @param path the value to be set.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerHealthCheck#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerHealthCheck}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerHealthCheck build() {
            return new Jsii$Proxy(healthyThreshold, intervalMillis, protocol, timeoutMillis, unhealthyThreshold, path, port);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerHealthCheck}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerHealthCheck {
        private final java.lang.Number healthyThreshold;
        private final java.lang.Number intervalMillis;
        private final java.lang.String protocol;
        private final java.lang.Number timeoutMillis;
        private final java.lang.Number unhealthyThreshold;
        private final java.lang.String path;
        private final java.lang.Number port;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.healthyThreshold = software.amazon.jsii.Kernel.get(this, "healthyThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.intervalMillis = software.amazon.jsii.Kernel.get(this, "intervalMillis", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeoutMillis = software.amazon.jsii.Kernel.get(this, "timeoutMillis", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.unhealthyThreshold = software.amazon.jsii.Kernel.get(this, "unhealthyThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number healthyThreshold, final java.lang.Number intervalMillis, final java.lang.String protocol, final java.lang.Number timeoutMillis, final java.lang.Number unhealthyThreshold, final java.lang.String path, final java.lang.Number port) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.healthyThreshold = java.util.Objects.requireNonNull(healthyThreshold, "healthyThreshold is required");
            this.intervalMillis = java.util.Objects.requireNonNull(intervalMillis, "intervalMillis is required");
            this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
            this.timeoutMillis = java.util.Objects.requireNonNull(timeoutMillis, "timeoutMillis is required");
            this.unhealthyThreshold = java.util.Objects.requireNonNull(unhealthyThreshold, "unhealthyThreshold is required");
            this.path = path;
            this.port = port;
        }

        @Override
        public final java.lang.Number getHealthyThreshold() {
            return this.healthyThreshold;
        }

        @Override
        public final java.lang.Number getIntervalMillis() {
            return this.intervalMillis;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.Number getTimeoutMillis() {
            return this.timeoutMillis;
        }

        @Override
        public final java.lang.Number getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
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

            data.set("healthyThreshold", om.valueToTree(this.getHealthyThreshold()));
            data.set("intervalMillis", om.valueToTree(this.getIntervalMillis()));
            data.set("protocol", om.valueToTree(this.getProtocol()));
            data.set("timeoutMillis", om.valueToTree(this.getTimeoutMillis()));
            data.set("unhealthyThreshold", om.valueToTree(this.getUnhealthyThreshold()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecListenerHealthCheck"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerHealthCheck.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerHealthCheck.Jsii$Proxy) o;

            if (!healthyThreshold.equals(that.healthyThreshold)) return false;
            if (!intervalMillis.equals(that.intervalMillis)) return false;
            if (!protocol.equals(that.protocol)) return false;
            if (!timeoutMillis.equals(that.timeoutMillis)) return false;
            if (!unhealthyThreshold.equals(that.unhealthyThreshold)) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            return this.port != null ? this.port.equals(that.port) : that.port == null;
        }

        @Override
        public final int hashCode() {
            int result = this.healthyThreshold.hashCode();
            result = 31 * result + (this.intervalMillis.hashCode());
            result = 31 * result + (this.protocol.hashCode());
            result = 31 * result + (this.timeoutMillis.hashCode());
            result = 31 * result + (this.unhealthyThreshold.hashCode());
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            return result;
        }
    }
}
