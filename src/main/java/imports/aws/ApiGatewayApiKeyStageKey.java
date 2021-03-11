package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.965Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayApiKeyStageKey")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayApiKeyStageKey.Jsii$Proxy.class)
public interface ApiGatewayApiKeyStageKey extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRestApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getStageName();

    /**
     * @return a {@link Builder} of {@link ApiGatewayApiKeyStageKey}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayApiKeyStageKey}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayApiKeyStageKey> {
        private java.lang.String restApiId;
        private java.lang.String stageName;

        /**
         * Sets the value of {@link ApiGatewayApiKeyStageKey#getRestApiId}
         * @param restApiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder restApiId(java.lang.String restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayApiKeyStageKey#getStageName}
         * @param stageName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stageName(java.lang.String stageName) {
            this.stageName = stageName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayApiKeyStageKey}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayApiKeyStageKey build() {
            return new Jsii$Proxy(restApiId, stageName);
        }
    }

    /**
     * An implementation for {@link ApiGatewayApiKeyStageKey}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayApiKeyStageKey {
        private final java.lang.String restApiId;
        private final java.lang.String stageName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.restApiId = software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stageName = software.amazon.jsii.Kernel.get(this, "stageName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String restApiId, final java.lang.String stageName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.restApiId = java.util.Objects.requireNonNull(restApiId, "restApiId is required");
            this.stageName = java.util.Objects.requireNonNull(stageName, "stageName is required");
        }

        @Override
        public final java.lang.String getRestApiId() {
            return this.restApiId;
        }

        @Override
        public final java.lang.String getStageName() {
            return this.stageName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("restApiId", om.valueToTree(this.getRestApiId()));
            data.set("stageName", om.valueToTree(this.getStageName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ApiGatewayApiKeyStageKey"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayApiKeyStageKey.Jsii$Proxy that = (ApiGatewayApiKeyStageKey.Jsii$Proxy) o;

            if (!restApiId.equals(that.restApiId)) return false;
            return this.stageName.equals(that.stageName);
        }

        @Override
        public final int hashCode() {
            int result = this.restApiId.hashCode();
            result = 31 * result + (this.stageName.hashCode());
            return result;
        }
    }
}
