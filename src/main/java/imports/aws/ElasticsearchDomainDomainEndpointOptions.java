package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.554Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomainDomainEndpointOptions")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainDomainEndpointOptions.Jsii$Proxy.class)
public interface ElasticsearchDomainDomainEndpointOptions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnforceHttps();

    default @org.jetbrains.annotations.Nullable java.lang.String getTlsSecurityPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainDomainEndpointOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainDomainEndpointOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainDomainEndpointOptions> {
        private java.lang.Boolean enforceHttps;
        private java.lang.String tlsSecurityPolicy;

        /**
         * Sets the value of {@link ElasticsearchDomainDomainEndpointOptions#getEnforceHttps}
         * @param enforceHttps the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enforceHttps(java.lang.Boolean enforceHttps) {
            this.enforceHttps = enforceHttps;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainDomainEndpointOptions#getTlsSecurityPolicy}
         * @param tlsSecurityPolicy the value to be set.
         * @return {@code this}
         */
        public Builder tlsSecurityPolicy(java.lang.String tlsSecurityPolicy) {
            this.tlsSecurityPolicy = tlsSecurityPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchDomainDomainEndpointOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainDomainEndpointOptions build() {
            return new Jsii$Proxy(enforceHttps, tlsSecurityPolicy);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainDomainEndpointOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainDomainEndpointOptions {
        private final java.lang.Boolean enforceHttps;
        private final java.lang.String tlsSecurityPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enforceHttps = software.amazon.jsii.Kernel.get(this, "enforceHttps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tlsSecurityPolicy = software.amazon.jsii.Kernel.get(this, "tlsSecurityPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean enforceHttps, final java.lang.String tlsSecurityPolicy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enforceHttps = java.util.Objects.requireNonNull(enforceHttps, "enforceHttps is required");
            this.tlsSecurityPolicy = tlsSecurityPolicy;
        }

        @Override
        public final java.lang.Boolean getEnforceHttps() {
            return this.enforceHttps;
        }

        @Override
        public final java.lang.String getTlsSecurityPolicy() {
            return this.tlsSecurityPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enforceHttps", om.valueToTree(this.getEnforceHttps()));
            if (this.getTlsSecurityPolicy() != null) {
                data.set("tlsSecurityPolicy", om.valueToTree(this.getTlsSecurityPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElasticsearchDomainDomainEndpointOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainDomainEndpointOptions.Jsii$Proxy that = (ElasticsearchDomainDomainEndpointOptions.Jsii$Proxy) o;

            if (!enforceHttps.equals(that.enforceHttps)) return false;
            return this.tlsSecurityPolicy != null ? this.tlsSecurityPolicy.equals(that.tlsSecurityPolicy) : that.tlsSecurityPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enforceHttps.hashCode();
            result = 31 * result + (this.tlsSecurityPolicy != null ? this.tlsSecurityPolicy.hashCode() : 0);
            return result;
        }
    }
}
