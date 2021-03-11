package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.912Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.TransferServer")
public class TransferServer extends com.hashicorp.cdktf.TerraformResource {

    protected TransferServer(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TransferServer(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public TransferServer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.TransferServerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public TransferServer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetEndpointDetails() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointDetails", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpointType() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceDestroy() {
        software.amazon.jsii.Kernel.call(this, "resetForceDestroy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostKey() {
        software.amazon.jsii.Kernel.call(this, "resetHostKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdentityProviderType() {
        software.amazon.jsii.Kernel.call(this, "resetIdentityProviderType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInvocationRole() {
        software.amazon.jsii.Kernel.call(this, "resetInvocationRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoggingRole() {
        software.amazon.jsii.Kernel.call(this, "resetLoggingRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUrl() {
        software.amazon.jsii.Kernel.call(this, "resetUrl", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostKeyFingerprint() {
        return software.amazon.jsii.Kernel.get(this, "hostKeyFingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.TransferServerEndpointDetails> getEndpointDetailsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.TransferServerEndpointDetails>)(software.amazon.jsii.Kernel.get(this, "endpointDetailsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.TransferServerEndpointDetails.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroyInput() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroyInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "hostKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdentityProviderTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "identityProviderTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInvocationRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "invocationRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoggingRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "loggingRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "urlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.TransferServerEndpointDetails> getEndpointDetails() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "endpointDetails", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.TransferServerEndpointDetails.class))));
    }

    public void setEndpointDetails(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.TransferServerEndpointDetails> value) {
        software.amazon.jsii.Kernel.set(this, "endpointDetails", java.util.Objects.requireNonNull(value, "endpointDetails is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointType() {
        return software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointType", java.util.Objects.requireNonNull(value, "endpointType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getForceDestroy() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setForceDestroy(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceDestroy", java.util.Objects.requireNonNull(value, "forceDestroy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostKey() {
        return software.amazon.jsii.Kernel.get(this, "hostKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostKey", java.util.Objects.requireNonNull(value, "hostKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentityProviderType() {
        return software.amazon.jsii.Kernel.get(this, "identityProviderType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentityProviderType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identityProviderType", java.util.Objects.requireNonNull(value, "identityProviderType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInvocationRole() {
        return software.amazon.jsii.Kernel.get(this, "invocationRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInvocationRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "invocationRole", java.util.Objects.requireNonNull(value, "invocationRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoggingRole() {
        return software.amazon.jsii.Kernel.get(this, "loggingRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoggingRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loggingRole", java.util.Objects.requireNonNull(value, "loggingRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "url", java.util.Objects.requireNonNull(value, "url is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.TransferServer}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.TransferServer> {
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
        private imports.aws.TransferServerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * endpoint_details block.
         * <p>
         * @return {@code this}
         * @param endpointDetails endpoint_details block. This parameter is required.
         */
        public Builder endpointDetails(final java.util.List<? extends imports.aws.TransferServerEndpointDetails> endpointDetails) {
            this.config().endpointDetails(endpointDetails);
            return this;
        }

        /**
         * @return {@code this}
         * @param endpointType This parameter is required.
         */
        public Builder endpointType(final java.lang.String endpointType) {
            this.config().endpointType(endpointType);
            return this;
        }

        /**
         * @return {@code this}
         * @param forceDestroy This parameter is required.
         */
        public Builder forceDestroy(final java.lang.Boolean forceDestroy) {
            this.config().forceDestroy(forceDestroy);
            return this;
        }

        /**
         * @return {@code this}
         * @param hostKey This parameter is required.
         */
        public Builder hostKey(final java.lang.String hostKey) {
            this.config().hostKey(hostKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param identityProviderType This parameter is required.
         */
        public Builder identityProviderType(final java.lang.String identityProviderType) {
            this.config().identityProviderType(identityProviderType);
            return this;
        }

        /**
         * @return {@code this}
         * @param invocationRole This parameter is required.
         */
        public Builder invocationRole(final java.lang.String invocationRole) {
            this.config().invocationRole(invocationRole);
            return this;
        }

        /**
         * @return {@code this}
         * @param loggingRole This parameter is required.
         */
        public Builder loggingRole(final java.lang.String loggingRole) {
            this.config().loggingRole(loggingRole);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * @return {@code this}
         * @param url This parameter is required.
         */
        public Builder url(final java.lang.String url) {
            this.config().url(url);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.TransferServer}.
         */
        @Override
        public imports.aws.TransferServer build() {
            return new imports.aws.TransferServer(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.TransferServerConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.TransferServerConfig.Builder();
            }
            return this.config;
        }
    }
}
