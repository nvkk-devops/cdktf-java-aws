package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.018Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2RouteResponseConfig")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2RouteResponseConfig.Jsii$Proxy.class)
public interface Apigatewayv2RouteResponseConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getRouteId();

    @org.jetbrains.annotations.NotNull java.lang.String getRouteResponseKey();

    default @org.jetbrains.annotations.Nullable java.lang.String getModelSelectionExpression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getResponseModels() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2RouteResponseConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2RouteResponseConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2RouteResponseConfig> {
        private java.lang.String apiId;
        private java.lang.String routeId;
        private java.lang.String routeResponseKey;
        private java.lang.String modelSelectionExpression;
        private java.util.Map<java.lang.String, java.lang.String> responseModels;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getRouteId}
         * @param routeId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder routeId(java.lang.String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getRouteResponseKey}
         * @param routeResponseKey the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder routeResponseKey(java.lang.String routeResponseKey) {
            this.routeResponseKey = routeResponseKey;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getModelSelectionExpression}
         * @param modelSelectionExpression the value to be set.
         * @return {@code this}
         */
        public Builder modelSelectionExpression(java.lang.String modelSelectionExpression) {
            this.modelSelectionExpression = modelSelectionExpression;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getResponseModels}
         * @param responseModels the value to be set.
         * @return {@code this}
         */
        public Builder responseModels(java.util.Map<java.lang.String, java.lang.String> responseModels) {
            this.responseModels = responseModels;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteResponseConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Apigatewayv2RouteResponseConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2RouteResponseConfig build() {
            return new Jsii$Proxy(apiId, routeId, routeResponseKey, modelSelectionExpression, responseModels, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2RouteResponseConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2RouteResponseConfig {
        private final java.lang.String apiId;
        private final java.lang.String routeId;
        private final java.lang.String routeResponseKey;
        private final java.lang.String modelSelectionExpression;
        private final java.util.Map<java.lang.String, java.lang.String> responseModels;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiId = software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.routeId = software.amazon.jsii.Kernel.get(this, "routeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.routeResponseKey = software.amazon.jsii.Kernel.get(this, "routeResponseKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.modelSelectionExpression = software.amazon.jsii.Kernel.get(this, "modelSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.responseModels = software.amazon.jsii.Kernel.get(this, "responseModels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String routeId, final java.lang.String routeResponseKey, final java.lang.String modelSelectionExpression, final java.util.Map<java.lang.String, java.lang.String> responseModels, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.routeId = java.util.Objects.requireNonNull(routeId, "routeId is required");
            this.routeResponseKey = java.util.Objects.requireNonNull(routeResponseKey, "routeResponseKey is required");
            this.modelSelectionExpression = modelSelectionExpression;
            this.responseModels = responseModels;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getApiId() {
            return this.apiId;
        }

        @Override
        public final java.lang.String getRouteId() {
            return this.routeId;
        }

        @Override
        public final java.lang.String getRouteResponseKey() {
            return this.routeResponseKey;
        }

        @Override
        public final java.lang.String getModelSelectionExpression() {
            return this.modelSelectionExpression;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getResponseModels() {
            return this.responseModels;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiId", om.valueToTree(this.getApiId()));
            data.set("routeId", om.valueToTree(this.getRouteId()));
            data.set("routeResponseKey", om.valueToTree(this.getRouteResponseKey()));
            if (this.getModelSelectionExpression() != null) {
                data.set("modelSelectionExpression", om.valueToTree(this.getModelSelectionExpression()));
            }
            if (this.getResponseModels() != null) {
                data.set("responseModels", om.valueToTree(this.getResponseModels()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2RouteResponseConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2RouteResponseConfig.Jsii$Proxy that = (Apigatewayv2RouteResponseConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!routeId.equals(that.routeId)) return false;
            if (!routeResponseKey.equals(that.routeResponseKey)) return false;
            if (this.modelSelectionExpression != null ? !this.modelSelectionExpression.equals(that.modelSelectionExpression) : that.modelSelectionExpression != null) return false;
            if (this.responseModels != null ? !this.responseModels.equals(that.responseModels) : that.responseModels != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.routeId.hashCode());
            result = 31 * result + (this.routeResponseKey.hashCode());
            result = 31 * result + (this.modelSelectionExpression != null ? this.modelSelectionExpression.hashCode() : 0);
            result = 31 * result + (this.responseModels != null ? this.responseModels.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
