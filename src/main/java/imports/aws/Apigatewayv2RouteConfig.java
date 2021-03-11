package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.017Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2RouteConfig")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2RouteConfig.Jsii$Proxy.class)
public interface Apigatewayv2RouteConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getRouteKey();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApiKeyRequired() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAuthorizationScopes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getModelSelectionExpression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOperationName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestModels() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRouteResponseSelectionExpression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTarget() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2RouteConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2RouteConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2RouteConfig> {
        private java.lang.String apiId;
        private java.lang.String routeKey;
        private java.lang.Boolean apiKeyRequired;
        private java.util.List<java.lang.String> authorizationScopes;
        private java.lang.String authorizationType;
        private java.lang.String authorizerId;
        private java.lang.String modelSelectionExpression;
        private java.lang.String operationName;
        private java.util.Map<java.lang.String, java.lang.String> requestModels;
        private java.lang.String routeResponseSelectionExpression;
        private java.lang.String target;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getRouteKey}
         * @param routeKey the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder routeKey(java.lang.String routeKey) {
            this.routeKey = routeKey;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getApiKeyRequired}
         * @param apiKeyRequired the value to be set.
         * @return {@code this}
         */
        public Builder apiKeyRequired(java.lang.Boolean apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getAuthorizationScopes}
         * @param authorizationScopes the value to be set.
         * @return {@code this}
         */
        public Builder authorizationScopes(java.util.List<java.lang.String> authorizationScopes) {
            this.authorizationScopes = authorizationScopes;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getAuthorizationType}
         * @param authorizationType the value to be set.
         * @return {@code this}
         */
        public Builder authorizationType(java.lang.String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getAuthorizerId}
         * @param authorizerId the value to be set.
         * @return {@code this}
         */
        public Builder authorizerId(java.lang.String authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getModelSelectionExpression}
         * @param modelSelectionExpression the value to be set.
         * @return {@code this}
         */
        public Builder modelSelectionExpression(java.lang.String modelSelectionExpression) {
            this.modelSelectionExpression = modelSelectionExpression;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getOperationName}
         * @param operationName the value to be set.
         * @return {@code this}
         */
        public Builder operationName(java.lang.String operationName) {
            this.operationName = operationName;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getRequestModels}
         * @param requestModels the value to be set.
         * @return {@code this}
         */
        public Builder requestModels(java.util.Map<java.lang.String, java.lang.String> requestModels) {
            this.requestModels = requestModels;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getRouteResponseSelectionExpression}
         * @param routeResponseSelectionExpression the value to be set.
         * @return {@code this}
         */
        public Builder routeResponseSelectionExpression(java.lang.String routeResponseSelectionExpression) {
            this.routeResponseSelectionExpression = routeResponseSelectionExpression;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getTarget}
         * @param target the value to be set.
         * @return {@code this}
         */
        public Builder target(java.lang.String target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getDependsOn}
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
         * Sets the value of {@link Apigatewayv2RouteConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2RouteConfig#getProvider}
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
         * @return a new instance of {@link Apigatewayv2RouteConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2RouteConfig build() {
            return new Jsii$Proxy(apiId, routeKey, apiKeyRequired, authorizationScopes, authorizationType, authorizerId, modelSelectionExpression, operationName, requestModels, routeResponseSelectionExpression, target, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2RouteConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2RouteConfig {
        private final java.lang.String apiId;
        private final java.lang.String routeKey;
        private final java.lang.Boolean apiKeyRequired;
        private final java.util.List<java.lang.String> authorizationScopes;
        private final java.lang.String authorizationType;
        private final java.lang.String authorizerId;
        private final java.lang.String modelSelectionExpression;
        private final java.lang.String operationName;
        private final java.util.Map<java.lang.String, java.lang.String> requestModels;
        private final java.lang.String routeResponseSelectionExpression;
        private final java.lang.String target;
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
            this.routeKey = software.amazon.jsii.Kernel.get(this, "routeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.apiKeyRequired = software.amazon.jsii.Kernel.get(this, "apiKeyRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.authorizationScopes = software.amazon.jsii.Kernel.get(this, "authorizationScopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.authorizationType = software.amazon.jsii.Kernel.get(this, "authorizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authorizerId = software.amazon.jsii.Kernel.get(this, "authorizerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.modelSelectionExpression = software.amazon.jsii.Kernel.get(this, "modelSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operationName = software.amazon.jsii.Kernel.get(this, "operationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requestModels = software.amazon.jsii.Kernel.get(this, "requestModels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.routeResponseSelectionExpression = software.amazon.jsii.Kernel.get(this, "routeResponseSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String routeKey, final java.lang.Boolean apiKeyRequired, final java.util.List<java.lang.String> authorizationScopes, final java.lang.String authorizationType, final java.lang.String authorizerId, final java.lang.String modelSelectionExpression, final java.lang.String operationName, final java.util.Map<java.lang.String, java.lang.String> requestModels, final java.lang.String routeResponseSelectionExpression, final java.lang.String target, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.routeKey = java.util.Objects.requireNonNull(routeKey, "routeKey is required");
            this.apiKeyRequired = apiKeyRequired;
            this.authorizationScopes = authorizationScopes;
            this.authorizationType = authorizationType;
            this.authorizerId = authorizerId;
            this.modelSelectionExpression = modelSelectionExpression;
            this.operationName = operationName;
            this.requestModels = requestModels;
            this.routeResponseSelectionExpression = routeResponseSelectionExpression;
            this.target = target;
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
        public final java.lang.String getRouteKey() {
            return this.routeKey;
        }

        @Override
        public final java.lang.Boolean getApiKeyRequired() {
            return this.apiKeyRequired;
        }

        @Override
        public final java.util.List<java.lang.String> getAuthorizationScopes() {
            return this.authorizationScopes;
        }

        @Override
        public final java.lang.String getAuthorizationType() {
            return this.authorizationType;
        }

        @Override
        public final java.lang.String getAuthorizerId() {
            return this.authorizerId;
        }

        @Override
        public final java.lang.String getModelSelectionExpression() {
            return this.modelSelectionExpression;
        }

        @Override
        public final java.lang.String getOperationName() {
            return this.operationName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRequestModels() {
            return this.requestModels;
        }

        @Override
        public final java.lang.String getRouteResponseSelectionExpression() {
            return this.routeResponseSelectionExpression;
        }

        @Override
        public final java.lang.String getTarget() {
            return this.target;
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
            data.set("routeKey", om.valueToTree(this.getRouteKey()));
            if (this.getApiKeyRequired() != null) {
                data.set("apiKeyRequired", om.valueToTree(this.getApiKeyRequired()));
            }
            if (this.getAuthorizationScopes() != null) {
                data.set("authorizationScopes", om.valueToTree(this.getAuthorizationScopes()));
            }
            if (this.getAuthorizationType() != null) {
                data.set("authorizationType", om.valueToTree(this.getAuthorizationType()));
            }
            if (this.getAuthorizerId() != null) {
                data.set("authorizerId", om.valueToTree(this.getAuthorizerId()));
            }
            if (this.getModelSelectionExpression() != null) {
                data.set("modelSelectionExpression", om.valueToTree(this.getModelSelectionExpression()));
            }
            if (this.getOperationName() != null) {
                data.set("operationName", om.valueToTree(this.getOperationName()));
            }
            if (this.getRequestModels() != null) {
                data.set("requestModels", om.valueToTree(this.getRequestModels()));
            }
            if (this.getRouteResponseSelectionExpression() != null) {
                data.set("routeResponseSelectionExpression", om.valueToTree(this.getRouteResponseSelectionExpression()));
            }
            if (this.getTarget() != null) {
                data.set("target", om.valueToTree(this.getTarget()));
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
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2RouteConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2RouteConfig.Jsii$Proxy that = (Apigatewayv2RouteConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!routeKey.equals(that.routeKey)) return false;
            if (this.apiKeyRequired != null ? !this.apiKeyRequired.equals(that.apiKeyRequired) : that.apiKeyRequired != null) return false;
            if (this.authorizationScopes != null ? !this.authorizationScopes.equals(that.authorizationScopes) : that.authorizationScopes != null) return false;
            if (this.authorizationType != null ? !this.authorizationType.equals(that.authorizationType) : that.authorizationType != null) return false;
            if (this.authorizerId != null ? !this.authorizerId.equals(that.authorizerId) : that.authorizerId != null) return false;
            if (this.modelSelectionExpression != null ? !this.modelSelectionExpression.equals(that.modelSelectionExpression) : that.modelSelectionExpression != null) return false;
            if (this.operationName != null ? !this.operationName.equals(that.operationName) : that.operationName != null) return false;
            if (this.requestModels != null ? !this.requestModels.equals(that.requestModels) : that.requestModels != null) return false;
            if (this.routeResponseSelectionExpression != null ? !this.routeResponseSelectionExpression.equals(that.routeResponseSelectionExpression) : that.routeResponseSelectionExpression != null) return false;
            if (this.target != null ? !this.target.equals(that.target) : that.target != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.routeKey.hashCode());
            result = 31 * result + (this.apiKeyRequired != null ? this.apiKeyRequired.hashCode() : 0);
            result = 31 * result + (this.authorizationScopes != null ? this.authorizationScopes.hashCode() : 0);
            result = 31 * result + (this.authorizationType != null ? this.authorizationType.hashCode() : 0);
            result = 31 * result + (this.authorizerId != null ? this.authorizerId.hashCode() : 0);
            result = 31 * result + (this.modelSelectionExpression != null ? this.modelSelectionExpression.hashCode() : 0);
            result = 31 * result + (this.operationName != null ? this.operationName.hashCode() : 0);
            result = 31 * result + (this.requestModels != null ? this.requestModels.hashCode() : 0);
            result = 31 * result + (this.routeResponseSelectionExpression != null ? this.routeResponseSelectionExpression.hashCode() : 0);
            result = 31 * result + (this.target != null ? this.target.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
