package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.485Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2ClientVpnEndpoint")
public class Ec2ClientVpnEndpoint extends com.hashicorp.cdktf.TerraformResource {

    protected Ec2ClientVpnEndpoint(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2ClientVpnEndpoint(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Ec2ClientVpnEndpoint(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Ec2ClientVpnEndpointConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDnsServers() {
        software.amazon.jsii.Kernel.call(this, "resetDnsServers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSplitTunnel() {
        software.amazon.jsii.Kernel.call(this, "resetSplitTunnel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTransportProtocol() {
        software.amazon.jsii.Kernel.call(this, "resetTransportProtocol", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> getAuthenticationOptionsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "authenticationOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2ClientVpnEndpointAuthenticationOptions.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientCidrBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "clientCidrBlockInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> getConnectionLogOptionsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "connectionLogOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2ClientVpnEndpointConnectionLogOptions.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerCertificateArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serverCertificateArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDnsServersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "dnsServersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSplitTunnelInput() {
        return software.amazon.jsii.Kernel.get(this, "splitTunnelInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTransportProtocolInput() {
        return software.amazon.jsii.Kernel.get(this, "transportProtocolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> getAuthenticationOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "authenticationOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2ClientVpnEndpointAuthenticationOptions.class))));
    }

    public void setAuthenticationOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> value) {
        software.amazon.jsii.Kernel.set(this, "authenticationOptions", java.util.Objects.requireNonNull(value, "authenticationOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "clientCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientCidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientCidrBlock", java.util.Objects.requireNonNull(value, "clientCidrBlock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> getConnectionLogOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "connectionLogOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2ClientVpnEndpointConnectionLogOptions.class))));
    }

    public void setConnectionLogOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> value) {
        software.amazon.jsii.Kernel.set(this, "connectionLogOptions", java.util.Objects.requireNonNull(value, "connectionLogOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDnsServers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dnsServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDnsServers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "dnsServers", java.util.Objects.requireNonNull(value, "dnsServers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "serverCertificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServerCertificateArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serverCertificateArn", java.util.Objects.requireNonNull(value, "serverCertificateArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getSplitTunnel() {
        return software.amazon.jsii.Kernel.get(this, "splitTunnel", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSplitTunnel(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "splitTunnel", java.util.Objects.requireNonNull(value, "splitTunnel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTransportProtocol() {
        return software.amazon.jsii.Kernel.get(this, "transportProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTransportProtocol(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "transportProtocol", java.util.Objects.requireNonNull(value, "transportProtocol is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Ec2ClientVpnEndpoint}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Ec2ClientVpnEndpoint> {
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
        private final imports.aws.Ec2ClientVpnEndpointConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Ec2ClientVpnEndpointConfig.Builder();
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
         * authentication_options block.
         * <p>
         * @return {@code this}
         * @param authenticationOptions authentication_options block. This parameter is required.
         */
        public Builder authenticationOptions(final java.util.List<? extends imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> authenticationOptions) {
            this.config.authenticationOptions(authenticationOptions);
            return this;
        }

        /**
         * @return {@code this}
         * @param clientCidrBlock This parameter is required.
         */
        public Builder clientCidrBlock(final java.lang.String clientCidrBlock) {
            this.config.clientCidrBlock(clientCidrBlock);
            return this;
        }

        /**
         * connection_log_options block.
         * <p>
         * @return {@code this}
         * @param connectionLogOptions connection_log_options block. This parameter is required.
         */
        public Builder connectionLogOptions(final java.util.List<? extends imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> connectionLogOptions) {
            this.config.connectionLogOptions(connectionLogOptions);
            return this;
        }

        /**
         * @return {@code this}
         * @param serverCertificateArn This parameter is required.
         */
        public Builder serverCertificateArn(final java.lang.String serverCertificateArn) {
            this.config.serverCertificateArn(serverCertificateArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * @return {@code this}
         * @param dnsServers This parameter is required.
         */
        public Builder dnsServers(final java.util.List<java.lang.String> dnsServers) {
            this.config.dnsServers(dnsServers);
            return this;
        }

        /**
         * @return {@code this}
         * @param splitTunnel This parameter is required.
         */
        public Builder splitTunnel(final java.lang.Boolean splitTunnel) {
            this.config.splitTunnel(splitTunnel);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @return {@code this}
         * @param transportProtocol This parameter is required.
         */
        public Builder transportProtocol(final java.lang.String transportProtocol) {
            this.config.transportProtocol(transportProtocol);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Ec2ClientVpnEndpoint}.
         */
        @Override
        public imports.aws.Ec2ClientVpnEndpoint build() {
            return new imports.aws.Ec2ClientVpnEndpoint(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
