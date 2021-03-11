package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.486Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2ClientVpnEndpointConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2ClientVpnEndpointConfig.Jsii$Proxy.class)
public interface Ec2ClientVpnEndpointConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * authentication_options block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> getAuthenticationOptions();

    @org.jetbrains.annotations.NotNull java.lang.String getClientCidrBlock();

    /**
     * connection_log_options block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> getConnectionLogOptions();

    @org.jetbrains.annotations.NotNull java.lang.String getServerCertificateArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDnsServers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSplitTunnel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTransportProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2ClientVpnEndpointConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2ClientVpnEndpointConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2ClientVpnEndpointConfig> {
        private java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> authenticationOptions;
        private java.lang.String clientCidrBlock;
        private java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> connectionLogOptions;
        private java.lang.String serverCertificateArn;
        private java.lang.String description;
        private java.util.List<java.lang.String> dnsServers;
        private java.lang.Boolean splitTunnel;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String transportProtocol;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getAuthenticationOptions}
         * @param authenticationOptions authentication_options block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder authenticationOptions(java.util.List<? extends imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> authenticationOptions) {
            this.authenticationOptions = (java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions>)authenticationOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getClientCidrBlock}
         * @param clientCidrBlock the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clientCidrBlock(java.lang.String clientCidrBlock) {
            this.clientCidrBlock = clientCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getConnectionLogOptions}
         * @param connectionLogOptions connection_log_options block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder connectionLogOptions(java.util.List<? extends imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> connectionLogOptions) {
            this.connectionLogOptions = (java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions>)connectionLogOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getServerCertificateArn}
         * @param serverCertificateArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serverCertificateArn(java.lang.String serverCertificateArn) {
            this.serverCertificateArn = serverCertificateArn;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getDnsServers}
         * @param dnsServers the value to be set.
         * @return {@code this}
         */
        public Builder dnsServers(java.util.List<java.lang.String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getSplitTunnel}
         * @param splitTunnel the value to be set.
         * @return {@code this}
         */
        public Builder splitTunnel(java.lang.Boolean splitTunnel) {
            this.splitTunnel = splitTunnel;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getTransportProtocol}
         * @param transportProtocol the value to be set.
         * @return {@code this}
         */
        public Builder transportProtocol(java.lang.String transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getDependsOn}
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
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getProvider}
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
         * @return a new instance of {@link Ec2ClientVpnEndpointConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2ClientVpnEndpointConfig build() {
            return new Jsii$Proxy(authenticationOptions, clientCidrBlock, connectionLogOptions, serverCertificateArn, description, dnsServers, splitTunnel, tags, transportProtocol, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2ClientVpnEndpointConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2ClientVpnEndpointConfig {
        private final java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> authenticationOptions;
        private final java.lang.String clientCidrBlock;
        private final java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> connectionLogOptions;
        private final java.lang.String serverCertificateArn;
        private final java.lang.String description;
        private final java.util.List<java.lang.String> dnsServers;
        private final java.lang.Boolean splitTunnel;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String transportProtocol;
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
            this.authenticationOptions = software.amazon.jsii.Kernel.get(this, "authenticationOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2ClientVpnEndpointAuthenticationOptions.class)));
            this.clientCidrBlock = software.amazon.jsii.Kernel.get(this, "clientCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionLogOptions = software.amazon.jsii.Kernel.get(this, "connectionLogOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2ClientVpnEndpointConnectionLogOptions.class)));
            this.serverCertificateArn = software.amazon.jsii.Kernel.get(this, "serverCertificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dnsServers = software.amazon.jsii.Kernel.get(this, "dnsServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.splitTunnel = software.amazon.jsii.Kernel.get(this, "splitTunnel", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.transportProtocol = software.amazon.jsii.Kernel.get(this, "transportProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> authenticationOptions, final java.lang.String clientCidrBlock, final java.util.List<? extends imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> connectionLogOptions, final java.lang.String serverCertificateArn, final java.lang.String description, final java.util.List<java.lang.String> dnsServers, final java.lang.Boolean splitTunnel, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String transportProtocol, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authenticationOptions = (java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions>)java.util.Objects.requireNonNull(authenticationOptions, "authenticationOptions is required");
            this.clientCidrBlock = java.util.Objects.requireNonNull(clientCidrBlock, "clientCidrBlock is required");
            this.connectionLogOptions = (java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions>)java.util.Objects.requireNonNull(connectionLogOptions, "connectionLogOptions is required");
            this.serverCertificateArn = java.util.Objects.requireNonNull(serverCertificateArn, "serverCertificateArn is required");
            this.description = description;
            this.dnsServers = dnsServers;
            this.splitTunnel = splitTunnel;
            this.tags = tags;
            this.transportProtocol = transportProtocol;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.Ec2ClientVpnEndpointAuthenticationOptions> getAuthenticationOptions() {
            return this.authenticationOptions;
        }

        @Override
        public final java.lang.String getClientCidrBlock() {
            return this.clientCidrBlock;
        }

        @Override
        public final java.util.List<imports.aws.Ec2ClientVpnEndpointConnectionLogOptions> getConnectionLogOptions() {
            return this.connectionLogOptions;
        }

        @Override
        public final java.lang.String getServerCertificateArn() {
            return this.serverCertificateArn;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<java.lang.String> getDnsServers() {
            return this.dnsServers;
        }

        @Override
        public final java.lang.Boolean getSplitTunnel() {
            return this.splitTunnel;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTransportProtocol() {
            return this.transportProtocol;
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

            data.set("authenticationOptions", om.valueToTree(this.getAuthenticationOptions()));
            data.set("clientCidrBlock", om.valueToTree(this.getClientCidrBlock()));
            data.set("connectionLogOptions", om.valueToTree(this.getConnectionLogOptions()));
            data.set("serverCertificateArn", om.valueToTree(this.getServerCertificateArn()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDnsServers() != null) {
                data.set("dnsServers", om.valueToTree(this.getDnsServers()));
            }
            if (this.getSplitTunnel() != null) {
                data.set("splitTunnel", om.valueToTree(this.getSplitTunnel()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTransportProtocol() != null) {
                data.set("transportProtocol", om.valueToTree(this.getTransportProtocol()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2ClientVpnEndpointConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2ClientVpnEndpointConfig.Jsii$Proxy that = (Ec2ClientVpnEndpointConfig.Jsii$Proxy) o;

            if (!authenticationOptions.equals(that.authenticationOptions)) return false;
            if (!clientCidrBlock.equals(that.clientCidrBlock)) return false;
            if (!connectionLogOptions.equals(that.connectionLogOptions)) return false;
            if (!serverCertificateArn.equals(that.serverCertificateArn)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dnsServers != null ? !this.dnsServers.equals(that.dnsServers) : that.dnsServers != null) return false;
            if (this.splitTunnel != null ? !this.splitTunnel.equals(that.splitTunnel) : that.splitTunnel != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.transportProtocol != null ? !this.transportProtocol.equals(that.transportProtocol) : that.transportProtocol != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.authenticationOptions.hashCode();
            result = 31 * result + (this.clientCidrBlock.hashCode());
            result = 31 * result + (this.connectionLogOptions.hashCode());
            result = 31 * result + (this.serverCertificateArn.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dnsServers != null ? this.dnsServers.hashCode() : 0);
            result = 31 * result + (this.splitTunnel != null ? this.splitTunnel.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.transportProtocol != null ? this.transportProtocol.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}