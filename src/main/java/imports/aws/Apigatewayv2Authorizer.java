package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.001Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2Authorizer")
public class Apigatewayv2Authorizer extends com.hashicorp.cdktf.TerraformResource {

    protected Apigatewayv2Authorizer(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2Authorizer(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Apigatewayv2Authorizer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Apigatewayv2AuthorizerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAuthorizerCredentialsArn() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerCredentialsArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizerUri() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerUri", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJwtConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetJwtConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIdentitySourcesInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "identitySourcesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerCredentialsArnInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerCredentialsArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerUriInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration> getJwtConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration>)(software.amazon.jsii.Kernel.get(this, "jwtConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2AuthorizerJwtConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerCredentialsArn() {
        return software.amazon.jsii.Kernel.get(this, "authorizerCredentialsArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerCredentialsArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerCredentialsArn", java.util.Objects.requireNonNull(value, "authorizerCredentialsArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerType() {
        return software.amazon.jsii.Kernel.get(this, "authorizerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerType", java.util.Objects.requireNonNull(value, "authorizerType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerUri() {
        return software.amazon.jsii.Kernel.get(this, "authorizerUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerUri", java.util.Objects.requireNonNull(value, "authorizerUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIdentitySources() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "identitySources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIdentitySources(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "identitySources", java.util.Objects.requireNonNull(value, "identitySources is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration> getJwtConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "jwtConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2AuthorizerJwtConfiguration.class))));
    }

    public void setJwtConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Apigatewayv2AuthorizerJwtConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "jwtConfiguration", java.util.Objects.requireNonNull(value, "jwtConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Apigatewayv2Authorizer}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Apigatewayv2Authorizer> {
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
        private final imports.aws.Apigatewayv2AuthorizerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Apigatewayv2AuthorizerConfig.Builder();
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
         * @param apiId This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
            return this;
        }

        /**
         * @return {@code this}
         * @param authorizerType This parameter is required.
         */
        public Builder authorizerType(final java.lang.String authorizerType) {
            this.config.authorizerType(authorizerType);
            return this;
        }

        /**
         * @return {@code this}
         * @param identitySources This parameter is required.
         */
        public Builder identitySources(final java.util.List<java.lang.String> identitySources) {
            this.config.identitySources(identitySources);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param authorizerCredentialsArn This parameter is required.
         */
        public Builder authorizerCredentialsArn(final java.lang.String authorizerCredentialsArn) {
            this.config.authorizerCredentialsArn(authorizerCredentialsArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param authorizerUri This parameter is required.
         */
        public Builder authorizerUri(final java.lang.String authorizerUri) {
            this.config.authorizerUri(authorizerUri);
            return this;
        }

        /**
         * jwt_configuration block.
         * <p>
         * @return {@code this}
         * @param jwtConfiguration jwt_configuration block. This parameter is required.
         */
        public Builder jwtConfiguration(final java.util.List<? extends imports.aws.Apigatewayv2AuthorizerJwtConfiguration> jwtConfiguration) {
            this.config.jwtConfiguration(jwtConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Apigatewayv2Authorizer}.
         */
        @Override
        public imports.aws.Apigatewayv2Authorizer build() {
            return new imports.aws.Apigatewayv2Authorizer(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
