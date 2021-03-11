package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.979Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayIntegrationConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayIntegrationConfig.Jsii$Proxy.class)
public interface ApiGatewayIntegrationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getHttpMethod();

    @org.jetbrains.annotations.NotNull java.lang.String getResourceId();

    @org.jetbrains.annotations.NotNull java.lang.String getRestApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCacheKeyParameters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCacheNamespace() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConnectionId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConnectionType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContentHandling() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCredentials() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIntegrationHttpMethod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPassthroughBehavior() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestParameters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRequestParametersInJson() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestTemplates() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutMilliseconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUri() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayIntegrationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayIntegrationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayIntegrationConfig> {
        private java.lang.String httpMethod;
        private java.lang.String resourceId;
        private java.lang.String restApiId;
        private java.lang.String type;
        private java.util.List<java.lang.String> cacheKeyParameters;
        private java.lang.String cacheNamespace;
        private java.lang.String connectionId;
        private java.lang.String connectionType;
        private java.lang.String contentHandling;
        private java.lang.String credentials;
        private java.lang.String integrationHttpMethod;
        private java.lang.String passthroughBehavior;
        private java.util.Map<java.lang.String, java.lang.String> requestParameters;
        private java.lang.String requestParametersInJson;
        private java.util.Map<java.lang.String, java.lang.String> requestTemplates;
        private java.lang.Number timeoutMilliseconds;
        private java.lang.String uri;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getHttpMethod}
         * @param httpMethod the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder httpMethod(java.lang.String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getResourceId}
         * @param resourceId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceId(java.lang.String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getRestApiId}
         * @param restApiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder restApiId(java.lang.String restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getCacheKeyParameters}
         * @param cacheKeyParameters the value to be set.
         * @return {@code this}
         */
        public Builder cacheKeyParameters(java.util.List<java.lang.String> cacheKeyParameters) {
            this.cacheKeyParameters = cacheKeyParameters;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getCacheNamespace}
         * @param cacheNamespace the value to be set.
         * @return {@code this}
         */
        public Builder cacheNamespace(java.lang.String cacheNamespace) {
            this.cacheNamespace = cacheNamespace;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getConnectionId}
         * @param connectionId the value to be set.
         * @return {@code this}
         */
        public Builder connectionId(java.lang.String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getConnectionType}
         * @param connectionType the value to be set.
         * @return {@code this}
         */
        public Builder connectionType(java.lang.String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getContentHandling}
         * @param contentHandling the value to be set.
         * @return {@code this}
         */
        public Builder contentHandling(java.lang.String contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getCredentials}
         * @param credentials the value to be set.
         * @return {@code this}
         */
        public Builder credentials(java.lang.String credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getIntegrationHttpMethod}
         * @param integrationHttpMethod the value to be set.
         * @return {@code this}
         */
        public Builder integrationHttpMethod(java.lang.String integrationHttpMethod) {
            this.integrationHttpMethod = integrationHttpMethod;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getPassthroughBehavior}
         * @param passthroughBehavior the value to be set.
         * @return {@code this}
         */
        public Builder passthroughBehavior(java.lang.String passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getRequestParameters}
         * @param requestParameters the value to be set.
         * @return {@code this}
         */
        public Builder requestParameters(java.util.Map<java.lang.String, java.lang.String> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getRequestParametersInJson}
         * @param requestParametersInJson the value to be set.
         * @return {@code this}
         */
        public Builder requestParametersInJson(java.lang.String requestParametersInJson) {
            this.requestParametersInJson = requestParametersInJson;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getRequestTemplates}
         * @param requestTemplates the value to be set.
         * @return {@code this}
         */
        public Builder requestTemplates(java.util.Map<java.lang.String, java.lang.String> requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getTimeoutMilliseconds}
         * @param timeoutMilliseconds the value to be set.
         * @return {@code this}
         */
        public Builder timeoutMilliseconds(java.lang.Number timeoutMilliseconds) {
            this.timeoutMilliseconds = timeoutMilliseconds;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getUri}
         * @param uri the value to be set.
         * @return {@code this}
         */
        public Builder uri(java.lang.String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getDependsOn}
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
         * Sets the value of {@link ApiGatewayIntegrationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayIntegrationConfig#getProvider}
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
         * @return a new instance of {@link ApiGatewayIntegrationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayIntegrationConfig build() {
            return new Jsii$Proxy(httpMethod, resourceId, restApiId, type, cacheKeyParameters, cacheNamespace, connectionId, connectionType, contentHandling, credentials, integrationHttpMethod, passthroughBehavior, requestParameters, requestParametersInJson, requestTemplates, timeoutMilliseconds, uri, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayIntegrationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayIntegrationConfig {
        private final java.lang.String httpMethod;
        private final java.lang.String resourceId;
        private final java.lang.String restApiId;
        private final java.lang.String type;
        private final java.util.List<java.lang.String> cacheKeyParameters;
        private final java.lang.String cacheNamespace;
        private final java.lang.String connectionId;
        private final java.lang.String connectionType;
        private final java.lang.String contentHandling;
        private final java.lang.String credentials;
        private final java.lang.String integrationHttpMethod;
        private final java.lang.String passthroughBehavior;
        private final java.util.Map<java.lang.String, java.lang.String> requestParameters;
        private final java.lang.String requestParametersInJson;
        private final java.util.Map<java.lang.String, java.lang.String> requestTemplates;
        private final java.lang.Number timeoutMilliseconds;
        private final java.lang.String uri;
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
            this.httpMethod = software.amazon.jsii.Kernel.get(this, "httpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceId = software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restApiId = software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cacheKeyParameters = software.amazon.jsii.Kernel.get(this, "cacheKeyParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.cacheNamespace = software.amazon.jsii.Kernel.get(this, "cacheNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionId = software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionType = software.amazon.jsii.Kernel.get(this, "connectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentHandling = software.amazon.jsii.Kernel.get(this, "contentHandling", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.credentials = software.amazon.jsii.Kernel.get(this, "credentials", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.integrationHttpMethod = software.amazon.jsii.Kernel.get(this, "integrationHttpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.passthroughBehavior = software.amazon.jsii.Kernel.get(this, "passthroughBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requestParameters = software.amazon.jsii.Kernel.get(this, "requestParameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.requestParametersInJson = software.amazon.jsii.Kernel.get(this, "requestParametersInJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requestTemplates = software.amazon.jsii.Kernel.get(this, "requestTemplates", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeoutMilliseconds = software.amazon.jsii.Kernel.get(this, "timeoutMilliseconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.uri = software.amazon.jsii.Kernel.get(this, "uri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String httpMethod, final java.lang.String resourceId, final java.lang.String restApiId, final java.lang.String type, final java.util.List<java.lang.String> cacheKeyParameters, final java.lang.String cacheNamespace, final java.lang.String connectionId, final java.lang.String connectionType, final java.lang.String contentHandling, final java.lang.String credentials, final java.lang.String integrationHttpMethod, final java.lang.String passthroughBehavior, final java.util.Map<java.lang.String, java.lang.String> requestParameters, final java.lang.String requestParametersInJson, final java.util.Map<java.lang.String, java.lang.String> requestTemplates, final java.lang.Number timeoutMilliseconds, final java.lang.String uri, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.httpMethod = java.util.Objects.requireNonNull(httpMethod, "httpMethod is required");
            this.resourceId = java.util.Objects.requireNonNull(resourceId, "resourceId is required");
            this.restApiId = java.util.Objects.requireNonNull(restApiId, "restApiId is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.cacheKeyParameters = cacheKeyParameters;
            this.cacheNamespace = cacheNamespace;
            this.connectionId = connectionId;
            this.connectionType = connectionType;
            this.contentHandling = contentHandling;
            this.credentials = credentials;
            this.integrationHttpMethod = integrationHttpMethod;
            this.passthroughBehavior = passthroughBehavior;
            this.requestParameters = requestParameters;
            this.requestParametersInJson = requestParametersInJson;
            this.requestTemplates = requestTemplates;
            this.timeoutMilliseconds = timeoutMilliseconds;
            this.uri = uri;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getHttpMethod() {
            return this.httpMethod;
        }

        @Override
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        @Override
        public final java.lang.String getRestApiId() {
            return this.restApiId;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<java.lang.String> getCacheKeyParameters() {
            return this.cacheKeyParameters;
        }

        @Override
        public final java.lang.String getCacheNamespace() {
            return this.cacheNamespace;
        }

        @Override
        public final java.lang.String getConnectionId() {
            return this.connectionId;
        }

        @Override
        public final java.lang.String getConnectionType() {
            return this.connectionType;
        }

        @Override
        public final java.lang.String getContentHandling() {
            return this.contentHandling;
        }

        @Override
        public final java.lang.String getCredentials() {
            return this.credentials;
        }

        @Override
        public final java.lang.String getIntegrationHttpMethod() {
            return this.integrationHttpMethod;
        }

        @Override
        public final java.lang.String getPassthroughBehavior() {
            return this.passthroughBehavior;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRequestParameters() {
            return this.requestParameters;
        }

        @Override
        public final java.lang.String getRequestParametersInJson() {
            return this.requestParametersInJson;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRequestTemplates() {
            return this.requestTemplates;
        }

        @Override
        public final java.lang.Number getTimeoutMilliseconds() {
            return this.timeoutMilliseconds;
        }

        @Override
        public final java.lang.String getUri() {
            return this.uri;
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

            data.set("httpMethod", om.valueToTree(this.getHttpMethod()));
            data.set("resourceId", om.valueToTree(this.getResourceId()));
            data.set("restApiId", om.valueToTree(this.getRestApiId()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getCacheKeyParameters() != null) {
                data.set("cacheKeyParameters", om.valueToTree(this.getCacheKeyParameters()));
            }
            if (this.getCacheNamespace() != null) {
                data.set("cacheNamespace", om.valueToTree(this.getCacheNamespace()));
            }
            if (this.getConnectionId() != null) {
                data.set("connectionId", om.valueToTree(this.getConnectionId()));
            }
            if (this.getConnectionType() != null) {
                data.set("connectionType", om.valueToTree(this.getConnectionType()));
            }
            if (this.getContentHandling() != null) {
                data.set("contentHandling", om.valueToTree(this.getContentHandling()));
            }
            if (this.getCredentials() != null) {
                data.set("credentials", om.valueToTree(this.getCredentials()));
            }
            if (this.getIntegrationHttpMethod() != null) {
                data.set("integrationHttpMethod", om.valueToTree(this.getIntegrationHttpMethod()));
            }
            if (this.getPassthroughBehavior() != null) {
                data.set("passthroughBehavior", om.valueToTree(this.getPassthroughBehavior()));
            }
            if (this.getRequestParameters() != null) {
                data.set("requestParameters", om.valueToTree(this.getRequestParameters()));
            }
            if (this.getRequestParametersInJson() != null) {
                data.set("requestParametersInJson", om.valueToTree(this.getRequestParametersInJson()));
            }
            if (this.getRequestTemplates() != null) {
                data.set("requestTemplates", om.valueToTree(this.getRequestTemplates()));
            }
            if (this.getTimeoutMilliseconds() != null) {
                data.set("timeoutMilliseconds", om.valueToTree(this.getTimeoutMilliseconds()));
            }
            if (this.getUri() != null) {
                data.set("uri", om.valueToTree(this.getUri()));
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
            struct.set("fqn", om.valueToTree("aws.ApiGatewayIntegrationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayIntegrationConfig.Jsii$Proxy that = (ApiGatewayIntegrationConfig.Jsii$Proxy) o;

            if (!httpMethod.equals(that.httpMethod)) return false;
            if (!resourceId.equals(that.resourceId)) return false;
            if (!restApiId.equals(that.restApiId)) return false;
            if (!type.equals(that.type)) return false;
            if (this.cacheKeyParameters != null ? !this.cacheKeyParameters.equals(that.cacheKeyParameters) : that.cacheKeyParameters != null) return false;
            if (this.cacheNamespace != null ? !this.cacheNamespace.equals(that.cacheNamespace) : that.cacheNamespace != null) return false;
            if (this.connectionId != null ? !this.connectionId.equals(that.connectionId) : that.connectionId != null) return false;
            if (this.connectionType != null ? !this.connectionType.equals(that.connectionType) : that.connectionType != null) return false;
            if (this.contentHandling != null ? !this.contentHandling.equals(that.contentHandling) : that.contentHandling != null) return false;
            if (this.credentials != null ? !this.credentials.equals(that.credentials) : that.credentials != null) return false;
            if (this.integrationHttpMethod != null ? !this.integrationHttpMethod.equals(that.integrationHttpMethod) : that.integrationHttpMethod != null) return false;
            if (this.passthroughBehavior != null ? !this.passthroughBehavior.equals(that.passthroughBehavior) : that.passthroughBehavior != null) return false;
            if (this.requestParameters != null ? !this.requestParameters.equals(that.requestParameters) : that.requestParameters != null) return false;
            if (this.requestParametersInJson != null ? !this.requestParametersInJson.equals(that.requestParametersInJson) : that.requestParametersInJson != null) return false;
            if (this.requestTemplates != null ? !this.requestTemplates.equals(that.requestTemplates) : that.requestTemplates != null) return false;
            if (this.timeoutMilliseconds != null ? !this.timeoutMilliseconds.equals(that.timeoutMilliseconds) : that.timeoutMilliseconds != null) return false;
            if (this.uri != null ? !this.uri.equals(that.uri) : that.uri != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.httpMethod.hashCode();
            result = 31 * result + (this.resourceId.hashCode());
            result = 31 * result + (this.restApiId.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.cacheKeyParameters != null ? this.cacheKeyParameters.hashCode() : 0);
            result = 31 * result + (this.cacheNamespace != null ? this.cacheNamespace.hashCode() : 0);
            result = 31 * result + (this.connectionId != null ? this.connectionId.hashCode() : 0);
            result = 31 * result + (this.connectionType != null ? this.connectionType.hashCode() : 0);
            result = 31 * result + (this.contentHandling != null ? this.contentHandling.hashCode() : 0);
            result = 31 * result + (this.credentials != null ? this.credentials.hashCode() : 0);
            result = 31 * result + (this.integrationHttpMethod != null ? this.integrationHttpMethod.hashCode() : 0);
            result = 31 * result + (this.passthroughBehavior != null ? this.passthroughBehavior.hashCode() : 0);
            result = 31 * result + (this.requestParameters != null ? this.requestParameters.hashCode() : 0);
            result = 31 * result + (this.requestParametersInJson != null ? this.requestParametersInJson.hashCode() : 0);
            result = 31 * result + (this.requestTemplates != null ? this.requestTemplates.hashCode() : 0);
            result = 31 * result + (this.timeoutMilliseconds != null ? this.timeoutMilliseconds.hashCode() : 0);
            result = 31 * result + (this.uri != null ? this.uri.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
