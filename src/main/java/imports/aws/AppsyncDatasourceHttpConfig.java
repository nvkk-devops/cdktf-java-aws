package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.043Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncDatasourceHttpConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncDatasourceHttpConfig.Jsii$Proxy.class)
public interface AppsyncDatasourceHttpConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getEndpoint();

    /**
     * @return a {@link Builder} of {@link AppsyncDatasourceHttpConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncDatasourceHttpConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncDatasourceHttpConfig> {
        private java.lang.String endpoint;

        /**
         * Sets the value of {@link AppsyncDatasourceHttpConfig#getEndpoint}
         * @param endpoint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder endpoint(java.lang.String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppsyncDatasourceHttpConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncDatasourceHttpConfig build() {
            return new Jsii$Proxy(endpoint);
        }
    }

    /**
     * An implementation for {@link AppsyncDatasourceHttpConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncDatasourceHttpConfig {
        private final java.lang.String endpoint;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpoint = software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String endpoint) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint is required");
        }

        @Override
        public final java.lang.String getEndpoint() {
            return this.endpoint;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("endpoint", om.valueToTree(this.getEndpoint()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppsyncDatasourceHttpConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncDatasourceHttpConfig.Jsii$Proxy that = (AppsyncDatasourceHttpConfig.Jsii$Proxy) o;

            return this.endpoint.equals(that.endpoint);
        }

        @Override
        public final int hashCode() {
            int result = this.endpoint.hashCode();
            return result;
        }
    }
}
