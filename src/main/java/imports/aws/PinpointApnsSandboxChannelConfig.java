package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.782Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.PinpointApnsSandboxChannelConfig")
@software.amazon.jsii.Jsii.Proxy(PinpointApnsSandboxChannelConfig.Jsii$Proxy.class)
public interface PinpointApnsSandboxChannelConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApplicationId();

    default @org.jetbrains.annotations.Nullable java.lang.String getBundleId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultAuthenticationMethod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTeamId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTokenKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTokenKeyId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PinpointApnsSandboxChannelConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PinpointApnsSandboxChannelConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PinpointApnsSandboxChannelConfig> {
        private java.lang.String applicationId;
        private java.lang.String bundleId;
        private java.lang.String certificate;
        private java.lang.String defaultAuthenticationMethod;
        private java.lang.Boolean enabled;
        private java.lang.String privateKey;
        private java.lang.String teamId;
        private java.lang.String tokenKey;
        private java.lang.String tokenKeyId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getApplicationId}
         * @param applicationId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder applicationId(java.lang.String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getBundleId}
         * @param bundleId the value to be set.
         * @return {@code this}
         */
        public Builder bundleId(java.lang.String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getCertificate}
         * @param certificate the value to be set.
         * @return {@code this}
         */
        public Builder certificate(java.lang.String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getDefaultAuthenticationMethod}
         * @param defaultAuthenticationMethod the value to be set.
         * @return {@code this}
         */
        public Builder defaultAuthenticationMethod(java.lang.String defaultAuthenticationMethod) {
            this.defaultAuthenticationMethod = defaultAuthenticationMethod;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getPrivateKey}
         * @param privateKey the value to be set.
         * @return {@code this}
         */
        public Builder privateKey(java.lang.String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getTeamId}
         * @param teamId the value to be set.
         * @return {@code this}
         */
        public Builder teamId(java.lang.String teamId) {
            this.teamId = teamId;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getTokenKey}
         * @param tokenKey the value to be set.
         * @return {@code this}
         */
        public Builder tokenKey(java.lang.String tokenKey) {
            this.tokenKey = tokenKey;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getTokenKeyId}
         * @param tokenKeyId the value to be set.
         * @return {@code this}
         */
        public Builder tokenKeyId(java.lang.String tokenKeyId) {
            this.tokenKeyId = tokenKeyId;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getDependsOn}
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
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link PinpointApnsSandboxChannelConfig#getProvider}
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
         * @return a new instance of {@link PinpointApnsSandboxChannelConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PinpointApnsSandboxChannelConfig build() {
            return new Jsii$Proxy(applicationId, bundleId, certificate, defaultAuthenticationMethod, enabled, privateKey, teamId, tokenKey, tokenKeyId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link PinpointApnsSandboxChannelConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PinpointApnsSandboxChannelConfig {
        private final java.lang.String applicationId;
        private final java.lang.String bundleId;
        private final java.lang.String certificate;
        private final java.lang.String defaultAuthenticationMethod;
        private final java.lang.Boolean enabled;
        private final java.lang.String privateKey;
        private final java.lang.String teamId;
        private final java.lang.String tokenKey;
        private final java.lang.String tokenKeyId;
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
            this.applicationId = software.amazon.jsii.Kernel.get(this, "applicationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bundleId = software.amazon.jsii.Kernel.get(this, "bundleId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificate = software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultAuthenticationMethod = software.amazon.jsii.Kernel.get(this, "defaultAuthenticationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.privateKey = software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.teamId = software.amazon.jsii.Kernel.get(this, "teamId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tokenKey = software.amazon.jsii.Kernel.get(this, "tokenKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tokenKeyId = software.amazon.jsii.Kernel.get(this, "tokenKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String applicationId, final java.lang.String bundleId, final java.lang.String certificate, final java.lang.String defaultAuthenticationMethod, final java.lang.Boolean enabled, final java.lang.String privateKey, final java.lang.String teamId, final java.lang.String tokenKey, final java.lang.String tokenKeyId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.applicationId = java.util.Objects.requireNonNull(applicationId, "applicationId is required");
            this.bundleId = bundleId;
            this.certificate = certificate;
            this.defaultAuthenticationMethod = defaultAuthenticationMethod;
            this.enabled = enabled;
            this.privateKey = privateKey;
            this.teamId = teamId;
            this.tokenKey = tokenKey;
            this.tokenKeyId = tokenKeyId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getApplicationId() {
            return this.applicationId;
        }

        @Override
        public final java.lang.String getBundleId() {
            return this.bundleId;
        }

        @Override
        public final java.lang.String getCertificate() {
            return this.certificate;
        }

        @Override
        public final java.lang.String getDefaultAuthenticationMethod() {
            return this.defaultAuthenticationMethod;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getPrivateKey() {
            return this.privateKey;
        }

        @Override
        public final java.lang.String getTeamId() {
            return this.teamId;
        }

        @Override
        public final java.lang.String getTokenKey() {
            return this.tokenKey;
        }

        @Override
        public final java.lang.String getTokenKeyId() {
            return this.tokenKeyId;
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

            data.set("applicationId", om.valueToTree(this.getApplicationId()));
            if (this.getBundleId() != null) {
                data.set("bundleId", om.valueToTree(this.getBundleId()));
            }
            if (this.getCertificate() != null) {
                data.set("certificate", om.valueToTree(this.getCertificate()));
            }
            if (this.getDefaultAuthenticationMethod() != null) {
                data.set("defaultAuthenticationMethod", om.valueToTree(this.getDefaultAuthenticationMethod()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getPrivateKey() != null) {
                data.set("privateKey", om.valueToTree(this.getPrivateKey()));
            }
            if (this.getTeamId() != null) {
                data.set("teamId", om.valueToTree(this.getTeamId()));
            }
            if (this.getTokenKey() != null) {
                data.set("tokenKey", om.valueToTree(this.getTokenKey()));
            }
            if (this.getTokenKeyId() != null) {
                data.set("tokenKeyId", om.valueToTree(this.getTokenKeyId()));
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
            struct.set("fqn", om.valueToTree("aws.PinpointApnsSandboxChannelConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PinpointApnsSandboxChannelConfig.Jsii$Proxy that = (PinpointApnsSandboxChannelConfig.Jsii$Proxy) o;

            if (!applicationId.equals(that.applicationId)) return false;
            if (this.bundleId != null ? !this.bundleId.equals(that.bundleId) : that.bundleId != null) return false;
            if (this.certificate != null ? !this.certificate.equals(that.certificate) : that.certificate != null) return false;
            if (this.defaultAuthenticationMethod != null ? !this.defaultAuthenticationMethod.equals(that.defaultAuthenticationMethod) : that.defaultAuthenticationMethod != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.privateKey != null ? !this.privateKey.equals(that.privateKey) : that.privateKey != null) return false;
            if (this.teamId != null ? !this.teamId.equals(that.teamId) : that.teamId != null) return false;
            if (this.tokenKey != null ? !this.tokenKey.equals(that.tokenKey) : that.tokenKey != null) return false;
            if (this.tokenKeyId != null ? !this.tokenKeyId.equals(that.tokenKeyId) : that.tokenKeyId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.applicationId.hashCode();
            result = 31 * result + (this.bundleId != null ? this.bundleId.hashCode() : 0);
            result = 31 * result + (this.certificate != null ? this.certificate.hashCode() : 0);
            result = 31 * result + (this.defaultAuthenticationMethod != null ? this.defaultAuthenticationMethod.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.privateKey != null ? this.privateKey.hashCode() : 0);
            result = 31 * result + (this.teamId != null ? this.teamId.hashCode() : 0);
            result = 31 * result + (this.tokenKey != null ? this.tokenKey.hashCode() : 0);
            result = 31 * result + (this.tokenKeyId != null ? this.tokenKeyId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
