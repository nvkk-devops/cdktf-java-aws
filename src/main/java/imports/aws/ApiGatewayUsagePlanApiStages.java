package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.996Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayUsagePlanApiStages")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayUsagePlanApiStages.Jsii$Proxy.class)
public interface ApiGatewayUsagePlanApiStages extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getStage();

    /**
     * @return a {@link Builder} of {@link ApiGatewayUsagePlanApiStages}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayUsagePlanApiStages}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayUsagePlanApiStages> {
        private java.lang.String apiId;
        private java.lang.String stage;

        /**
         * Sets the value of {@link ApiGatewayUsagePlanApiStages#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanApiStages#getStage}
         * @param stage the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stage(java.lang.String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayUsagePlanApiStages}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayUsagePlanApiStages build() {
            return new Jsii$Proxy(apiId, stage);
        }
    }

    /**
     * An implementation for {@link ApiGatewayUsagePlanApiStages}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayUsagePlanApiStages {
        private final java.lang.String apiId;
        private final java.lang.String stage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiId = software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stage = software.amazon.jsii.Kernel.get(this, "stage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String stage) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.stage = java.util.Objects.requireNonNull(stage, "stage is required");
        }

        @Override
        public final java.lang.String getApiId() {
            return this.apiId;
        }

        @Override
        public final java.lang.String getStage() {
            return this.stage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiId", om.valueToTree(this.getApiId()));
            data.set("stage", om.valueToTree(this.getStage()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ApiGatewayUsagePlanApiStages"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayUsagePlanApiStages.Jsii$Proxy that = (ApiGatewayUsagePlanApiStages.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            return this.stage.equals(that.stage);
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.stage.hashCode());
            return result;
        }
    }
}
