package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.978Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayIntegration")
public class ApiGatewayIntegration extends com.hashicorp.cdktf.TerraformResource {

    protected ApiGatewayIntegration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayIntegration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ApiGatewayIntegration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ApiGatewayIntegrationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCacheKeyParameters() {
        software.amazon.jsii.Kernel.call(this, "resetCacheKeyParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCacheNamespace() {
        software.amazon.jsii.Kernel.call(this, "resetCacheNamespace", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionId() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionType() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentHandling() {
        software.amazon.jsii.Kernel.call(this, "resetContentHandling", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCredentials() {
        software.amazon.jsii.Kernel.call(this, "resetCredentials", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIntegrationHttpMethod() {
        software.amazon.jsii.Kernel.call(this, "resetIntegrationHttpMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPassthroughBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetPassthroughBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestParameters() {
        software.amazon.jsii.Kernel.call(this, "resetRequestParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestParametersInJson() {
        software.amazon.jsii.Kernel.call(this, "resetRequestParametersInJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestTemplates() {
        software.amazon.jsii.Kernel.call(this, "resetRequestTemplates", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeoutMilliseconds() {
        software.amazon.jsii.Kernel.call(this, "resetTimeoutMilliseconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUri() {
        software.amazon.jsii.Kernel.call(this, "resetUri", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "httpMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "restApiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCacheKeyParametersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "cacheKeyParametersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCacheNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "cacheNamespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentHandlingInput() {
        return software.amazon.jsii.Kernel.get(this, "contentHandlingInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCredentialsInput() {
        return software.amazon.jsii.Kernel.get(this, "credentialsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIntegrationHttpMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "integrationHttpMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPassthroughBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "passthroughBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRequestParametersInJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "requestParametersInJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestParametersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "requestParametersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestTemplatesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "requestTemplatesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutMillisecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutMillisecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUriInput() {
        return software.amazon.jsii.Kernel.get(this, "uriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCacheKeyParameters() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cacheKeyParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCacheKeyParameters(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "cacheKeyParameters", java.util.Objects.requireNonNull(value, "cacheKeyParameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCacheNamespace() {
        return software.amazon.jsii.Kernel.get(this, "cacheNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCacheNamespace(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cacheNamespace", java.util.Objects.requireNonNull(value, "cacheNamespace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionId() {
        return software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectionId", java.util.Objects.requireNonNull(value, "connectionId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionType() {
        return software.amazon.jsii.Kernel.get(this, "connectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectionType", java.util.Objects.requireNonNull(value, "connectionType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentHandling() {
        return software.amazon.jsii.Kernel.get(this, "contentHandling", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentHandling(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentHandling", java.util.Objects.requireNonNull(value, "contentHandling is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCredentials() {
        return software.amazon.jsii.Kernel.get(this, "credentials", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCredentials(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "credentials", java.util.Objects.requireNonNull(value, "credentials is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpMethod() {
        return software.amazon.jsii.Kernel.get(this, "httpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpMethod", java.util.Objects.requireNonNull(value, "httpMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntegrationHttpMethod() {
        return software.amazon.jsii.Kernel.get(this, "integrationHttpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIntegrationHttpMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "integrationHttpMethod", java.util.Objects.requireNonNull(value, "integrationHttpMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassthroughBehavior() {
        return software.amazon.jsii.Kernel.get(this, "passthroughBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassthroughBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "passthroughBehavior", java.util.Objects.requireNonNull(value, "passthroughBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRequestParameters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "requestParameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRequestParameters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "requestParameters", java.util.Objects.requireNonNull(value, "requestParameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestParametersInJson() {
        return software.amazon.jsii.Kernel.get(this, "requestParametersInJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestParametersInJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestParametersInJson", java.util.Objects.requireNonNull(value, "requestParametersInJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRequestTemplates() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "requestTemplates", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRequestTemplates(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "requestTemplates", java.util.Objects.requireNonNull(value, "requestTemplates is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceId() {
        return software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceId", java.util.Objects.requireNonNull(value, "resourceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestApiId() {
        return software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restApiId", java.util.Objects.requireNonNull(value, "restApiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeoutMilliseconds() {
        return software.amazon.jsii.Kernel.get(this, "timeoutMilliseconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeoutMilliseconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeoutMilliseconds", java.util.Objects.requireNonNull(value, "timeoutMilliseconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUri() {
        return software.amazon.jsii.Kernel.get(this, "uri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "uri", java.util.Objects.requireNonNull(value, "uri is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ApiGatewayIntegration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ApiGatewayIntegration> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.ApiGatewayIntegrationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ApiGatewayIntegrationConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param httpMethod This parameter is required.
         */
        public Builder httpMethod(final java.lang.String httpMethod) {
            this.config.httpMethod(httpMethod);
            return this;
        }

        /**
         * @return {@code this}
         * @param resourceId This parameter is required.
         */
        public Builder resourceId(final java.lang.String resourceId) {
            this.config.resourceId(resourceId);
            return this;
        }

        /**
         * @return {@code this}
         * @param restApiId This parameter is required.
         */
        public Builder restApiId(final java.lang.String restApiId) {
            this.config.restApiId(restApiId);
            return this;
        }

        /**
         * @return {@code this}
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @return {@code this}
         * @param cacheKeyParameters This parameter is required.
         */
        public Builder cacheKeyParameters(final java.util.List<java.lang.String> cacheKeyParameters) {
            this.config.cacheKeyParameters(cacheKeyParameters);
            return this;
        }

        /**
         * @return {@code this}
         * @param cacheNamespace This parameter is required.
         */
        public Builder cacheNamespace(final java.lang.String cacheNamespace) {
            this.config.cacheNamespace(cacheNamespace);
            return this;
        }

        /**
         * @return {@code this}
         * @param connectionId This parameter is required.
         */
        public Builder connectionId(final java.lang.String connectionId) {
            this.config.connectionId(connectionId);
            return this;
        }

        /**
         * @return {@code this}
         * @param connectionType This parameter is required.
         */
        public Builder connectionType(final java.lang.String connectionType) {
            this.config.connectionType(connectionType);
            return this;
        }

        /**
         * @return {@code this}
         * @param contentHandling This parameter is required.
         */
        public Builder contentHandling(final java.lang.String contentHandling) {
            this.config.contentHandling(contentHandling);
            return this;
        }

        /**
         * @return {@code this}
         * @param credentials This parameter is required.
         */
        public Builder credentials(final java.lang.String credentials) {
            this.config.credentials(credentials);
            return this;
        }

        /**
         * @return {@code this}
         * @param integrationHttpMethod This parameter is required.
         */
        public Builder integrationHttpMethod(final java.lang.String integrationHttpMethod) {
            this.config.integrationHttpMethod(integrationHttpMethod);
            return this;
        }

        /**
         * @return {@code this}
         * @param passthroughBehavior This parameter is required.
         */
        public Builder passthroughBehavior(final java.lang.String passthroughBehavior) {
            this.config.passthroughBehavior(passthroughBehavior);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestParameters This parameter is required.
         */
        public Builder requestParameters(final java.util.Map<java.lang.String, java.lang.String> requestParameters) {
            this.config.requestParameters(requestParameters);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestParametersInJson This parameter is required.
         */
        public Builder requestParametersInJson(final java.lang.String requestParametersInJson) {
            this.config.requestParametersInJson(requestParametersInJson);
            return this;
        }

        /**
         * @return {@code this}
         * @param requestTemplates This parameter is required.
         */
        public Builder requestTemplates(final java.util.Map<java.lang.String, java.lang.String> requestTemplates) {
            this.config.requestTemplates(requestTemplates);
            return this;
        }

        /**
         * @return {@code this}
         * @param timeoutMilliseconds This parameter is required.
         */
        public Builder timeoutMilliseconds(final java.lang.Number timeoutMilliseconds) {
            this.config.timeoutMilliseconds(timeoutMilliseconds);
            return this;
        }

        /**
         * @return {@code this}
         * @param uri This parameter is required.
         */
        public Builder uri(final java.lang.String uri) {
            this.config.uri(uri);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ApiGatewayIntegration}.
         */
        @Override
        public imports.aws.ApiGatewayIntegration build() {
            return new imports.aws.ApiGatewayIntegration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
