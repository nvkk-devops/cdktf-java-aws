package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.189Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoIdentityPoolConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoIdentityPoolConfig.Jsii$Proxy.class)
public interface CognitoIdentityPoolConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getIdentityPoolName();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowUnauthenticatedIdentities() {
        return null;
    }

    /**
     * cognito_identity_providers block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders> getCognitoIdentityProviders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeveloperProviderName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOpenidConnectProviderArns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSamlProviderArns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSupportedLoginProviders() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoIdentityPoolConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoIdentityPoolConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoIdentityPoolConfig> {
        private java.lang.String identityPoolName;
        private java.lang.Boolean allowUnauthenticatedIdentities;
        private java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders> cognitoIdentityProviders;
        private java.lang.String developerProviderName;
        private java.util.List<java.lang.String> openidConnectProviderArns;
        private java.util.List<java.lang.String> samlProviderArns;
        private java.util.Map<java.lang.String, java.lang.String> supportedLoginProviders;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getIdentityPoolName}
         * @param identityPoolName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder identityPoolName(java.lang.String identityPoolName) {
            this.identityPoolName = identityPoolName;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getAllowUnauthenticatedIdentities}
         * @param allowUnauthenticatedIdentities the value to be set.
         * @return {@code this}
         */
        public Builder allowUnauthenticatedIdentities(java.lang.Boolean allowUnauthenticatedIdentities) {
            this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getCognitoIdentityProviders}
         * @param cognitoIdentityProviders cognito_identity_providers block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cognitoIdentityProviders(java.util.List<? extends imports.aws.CognitoIdentityPoolCognitoIdentityProviders> cognitoIdentityProviders) {
            this.cognitoIdentityProviders = (java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders>)cognitoIdentityProviders;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getDeveloperProviderName}
         * @param developerProviderName the value to be set.
         * @return {@code this}
         */
        public Builder developerProviderName(java.lang.String developerProviderName) {
            this.developerProviderName = developerProviderName;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getOpenidConnectProviderArns}
         * @param openidConnectProviderArns the value to be set.
         * @return {@code this}
         */
        public Builder openidConnectProviderArns(java.util.List<java.lang.String> openidConnectProviderArns) {
            this.openidConnectProviderArns = openidConnectProviderArns;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getSamlProviderArns}
         * @param samlProviderArns the value to be set.
         * @return {@code this}
         */
        public Builder samlProviderArns(java.util.List<java.lang.String> samlProviderArns) {
            this.samlProviderArns = samlProviderArns;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getSupportedLoginProviders}
         * @param supportedLoginProviders the value to be set.
         * @return {@code this}
         */
        public Builder supportedLoginProviders(java.util.Map<java.lang.String, java.lang.String> supportedLoginProviders) {
            this.supportedLoginProviders = supportedLoginProviders;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getDependsOn}
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
         * Sets the value of {@link CognitoIdentityPoolConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolConfig#getProvider}
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
         * @return a new instance of {@link CognitoIdentityPoolConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoIdentityPoolConfig build() {
            return new Jsii$Proxy(identityPoolName, allowUnauthenticatedIdentities, cognitoIdentityProviders, developerProviderName, openidConnectProviderArns, samlProviderArns, supportedLoginProviders, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CognitoIdentityPoolConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoIdentityPoolConfig {
        private final java.lang.String identityPoolName;
        private final java.lang.Boolean allowUnauthenticatedIdentities;
        private final java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders> cognitoIdentityProviders;
        private final java.lang.String developerProviderName;
        private final java.util.List<java.lang.String> openidConnectProviderArns;
        private final java.util.List<java.lang.String> samlProviderArns;
        private final java.util.Map<java.lang.String, java.lang.String> supportedLoginProviders;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.identityPoolName = software.amazon.jsii.Kernel.get(this, "identityPoolName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowUnauthenticatedIdentities = software.amazon.jsii.Kernel.get(this, "allowUnauthenticatedIdentities", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.cognitoIdentityProviders = software.amazon.jsii.Kernel.get(this, "cognitoIdentityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoIdentityPoolCognitoIdentityProviders.class)));
            this.developerProviderName = software.amazon.jsii.Kernel.get(this, "developerProviderName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.openidConnectProviderArns = software.amazon.jsii.Kernel.get(this, "openidConnectProviderArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.samlProviderArns = software.amazon.jsii.Kernel.get(this, "samlProviderArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.supportedLoginProviders = software.amazon.jsii.Kernel.get(this, "supportedLoginProviders", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String identityPoolName, final java.lang.Boolean allowUnauthenticatedIdentities, final java.util.List<? extends imports.aws.CognitoIdentityPoolCognitoIdentityProviders> cognitoIdentityProviders, final java.lang.String developerProviderName, final java.util.List<java.lang.String> openidConnectProviderArns, final java.util.List<java.lang.String> samlProviderArns, final java.util.Map<java.lang.String, java.lang.String> supportedLoginProviders, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.identityPoolName = java.util.Objects.requireNonNull(identityPoolName, "identityPoolName is required");
            this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
            this.cognitoIdentityProviders = (java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders>)cognitoIdentityProviders;
            this.developerProviderName = developerProviderName;
            this.openidConnectProviderArns = openidConnectProviderArns;
            this.samlProviderArns = samlProviderArns;
            this.supportedLoginProviders = supportedLoginProviders;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getIdentityPoolName() {
            return this.identityPoolName;
        }

        @Override
        public final java.lang.Boolean getAllowUnauthenticatedIdentities() {
            return this.allowUnauthenticatedIdentities;
        }

        @Override
        public final java.util.List<imports.aws.CognitoIdentityPoolCognitoIdentityProviders> getCognitoIdentityProviders() {
            return this.cognitoIdentityProviders;
        }

        @Override
        public final java.lang.String getDeveloperProviderName() {
            return this.developerProviderName;
        }

        @Override
        public final java.util.List<java.lang.String> getOpenidConnectProviderArns() {
            return this.openidConnectProviderArns;
        }

        @Override
        public final java.util.List<java.lang.String> getSamlProviderArns() {
            return this.samlProviderArns;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getSupportedLoginProviders() {
            return this.supportedLoginProviders;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("identityPoolName", om.valueToTree(this.getIdentityPoolName()));
            if (this.getAllowUnauthenticatedIdentities() != null) {
                data.set("allowUnauthenticatedIdentities", om.valueToTree(this.getAllowUnauthenticatedIdentities()));
            }
            if (this.getCognitoIdentityProviders() != null) {
                data.set("cognitoIdentityProviders", om.valueToTree(this.getCognitoIdentityProviders()));
            }
            if (this.getDeveloperProviderName() != null) {
                data.set("developerProviderName", om.valueToTree(this.getDeveloperProviderName()));
            }
            if (this.getOpenidConnectProviderArns() != null) {
                data.set("openidConnectProviderArns", om.valueToTree(this.getOpenidConnectProviderArns()));
            }
            if (this.getSamlProviderArns() != null) {
                data.set("samlProviderArns", om.valueToTree(this.getSamlProviderArns()));
            }
            if (this.getSupportedLoginProviders() != null) {
                data.set("supportedLoginProviders", om.valueToTree(this.getSupportedLoginProviders()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.CognitoIdentityPoolConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoIdentityPoolConfig.Jsii$Proxy that = (CognitoIdentityPoolConfig.Jsii$Proxy) o;

            if (!identityPoolName.equals(that.identityPoolName)) return false;
            if (this.allowUnauthenticatedIdentities != null ? !this.allowUnauthenticatedIdentities.equals(that.allowUnauthenticatedIdentities) : that.allowUnauthenticatedIdentities != null) return false;
            if (this.cognitoIdentityProviders != null ? !this.cognitoIdentityProviders.equals(that.cognitoIdentityProviders) : that.cognitoIdentityProviders != null) return false;
            if (this.developerProviderName != null ? !this.developerProviderName.equals(that.developerProviderName) : that.developerProviderName != null) return false;
            if (this.openidConnectProviderArns != null ? !this.openidConnectProviderArns.equals(that.openidConnectProviderArns) : that.openidConnectProviderArns != null) return false;
            if (this.samlProviderArns != null ? !this.samlProviderArns.equals(that.samlProviderArns) : that.samlProviderArns != null) return false;
            if (this.supportedLoginProviders != null ? !this.supportedLoginProviders.equals(that.supportedLoginProviders) : that.supportedLoginProviders != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.identityPoolName.hashCode();
            result = 31 * result + (this.allowUnauthenticatedIdentities != null ? this.allowUnauthenticatedIdentities.hashCode() : 0);
            result = 31 * result + (this.cognitoIdentityProviders != null ? this.cognitoIdentityProviders.hashCode() : 0);
            result = 31 * result + (this.developerProviderName != null ? this.developerProviderName.hashCode() : 0);
            result = 31 * result + (this.openidConnectProviderArns != null ? this.openidConnectProviderArns.hashCode() : 0);
            result = 31 * result + (this.samlProviderArns != null ? this.samlProviderArns.hashCode() : 0);
            result = 31 * result + (this.supportedLoginProviders != null ? this.supportedLoginProviders.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
