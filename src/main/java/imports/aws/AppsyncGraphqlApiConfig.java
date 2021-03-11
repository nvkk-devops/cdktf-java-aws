package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.046Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncGraphqlApiConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncGraphqlApiConfig.Jsii$Proxy.class)
public interface AppsyncGraphqlApiConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * additional_authentication_provider block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> getAdditionalAuthenticationProvider() {
        return null;
    }

    /**
     * log_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiLogConfig> getLogConfig() {
        return null;
    }

    /**
     * openid_connect_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig> getOpenidConnectConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSchema() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * user_pool_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig> getUserPoolConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getXrayEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncGraphqlApiConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncGraphqlApiConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncGraphqlApiConfig> {
        private java.lang.String authenticationType;
        private java.lang.String name;
        private java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> additionalAuthenticationProvider;
        private java.util.List<imports.aws.AppsyncGraphqlApiLogConfig> logConfig;
        private java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig> openidConnectConfig;
        private java.lang.String schema;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig> userPoolConfig;
        private java.lang.Boolean xrayEnabled;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getAuthenticationType}
         * @param authenticationType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder authenticationType(java.lang.String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getAdditionalAuthenticationProvider}
         * @param additionalAuthenticationProvider additional_authentication_provider block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder additionalAuthenticationProvider(java.util.List<? extends imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> additionalAuthenticationProvider) {
            this.additionalAuthenticationProvider = (java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider>)additionalAuthenticationProvider;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getLogConfig}
         * @param logConfig log_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder logConfig(java.util.List<? extends imports.aws.AppsyncGraphqlApiLogConfig> logConfig) {
            this.logConfig = (java.util.List<imports.aws.AppsyncGraphqlApiLogConfig>)logConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getOpenidConnectConfig}
         * @param openidConnectConfig openid_connect_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder openidConnectConfig(java.util.List<? extends imports.aws.AppsyncGraphqlApiOpenidConnectConfig> openidConnectConfig) {
            this.openidConnectConfig = (java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig>)openidConnectConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getSchema}
         * @param schema the value to be set.
         * @return {@code this}
         */
        public Builder schema(java.lang.String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getUserPoolConfig}
         * @param userPoolConfig user_pool_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder userPoolConfig(java.util.List<? extends imports.aws.AppsyncGraphqlApiUserPoolConfig> userPoolConfig) {
            this.userPoolConfig = (java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig>)userPoolConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getXrayEnabled}
         * @param xrayEnabled the value to be set.
         * @return {@code this}
         */
        public Builder xrayEnabled(java.lang.Boolean xrayEnabled) {
            this.xrayEnabled = xrayEnabled;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getDependsOn}
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
         * Sets the value of {@link AppsyncGraphqlApiConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getProvider}
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
         * @return a new instance of {@link AppsyncGraphqlApiConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncGraphqlApiConfig build() {
            return new Jsii$Proxy(authenticationType, name, additionalAuthenticationProvider, logConfig, openidConnectConfig, schema, tags, userPoolConfig, xrayEnabled, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AppsyncGraphqlApiConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncGraphqlApiConfig {
        private final java.lang.String authenticationType;
        private final java.lang.String name;
        private final java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> additionalAuthenticationProvider;
        private final java.util.List<imports.aws.AppsyncGraphqlApiLogConfig> logConfig;
        private final java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig> openidConnectConfig;
        private final java.lang.String schema;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig> userPoolConfig;
        private final java.lang.Boolean xrayEnabled;
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
            this.authenticationType = software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalAuthenticationProvider = software.amazon.jsii.Kernel.get(this, "additionalAuthenticationProvider", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider.class)));
            this.logConfig = software.amazon.jsii.Kernel.get(this, "logConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiLogConfig.class)));
            this.openidConnectConfig = software.amazon.jsii.Kernel.get(this, "openidConnectConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiOpenidConnectConfig.class)));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.userPoolConfig = software.amazon.jsii.Kernel.get(this, "userPoolConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiUserPoolConfig.class)));
            this.xrayEnabled = software.amazon.jsii.Kernel.get(this, "xrayEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String authenticationType, final java.lang.String name, final java.util.List<? extends imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> additionalAuthenticationProvider, final java.util.List<? extends imports.aws.AppsyncGraphqlApiLogConfig> logConfig, final java.util.List<? extends imports.aws.AppsyncGraphqlApiOpenidConnectConfig> openidConnectConfig, final java.lang.String schema, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.AppsyncGraphqlApiUserPoolConfig> userPoolConfig, final java.lang.Boolean xrayEnabled, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authenticationType = java.util.Objects.requireNonNull(authenticationType, "authenticationType is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.additionalAuthenticationProvider = (java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider>)additionalAuthenticationProvider;
            this.logConfig = (java.util.List<imports.aws.AppsyncGraphqlApiLogConfig>)logConfig;
            this.openidConnectConfig = (java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig>)openidConnectConfig;
            this.schema = schema;
            this.tags = tags;
            this.userPoolConfig = (java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig>)userPoolConfig;
            this.xrayEnabled = xrayEnabled;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAuthenticationType() {
            return this.authenticationType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProvider> getAdditionalAuthenticationProvider() {
            return this.additionalAuthenticationProvider;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncGraphqlApiLogConfig> getLogConfig() {
            return this.logConfig;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncGraphqlApiOpenidConnectConfig> getOpenidConnectConfig() {
            return this.openidConnectConfig;
        }

        @Override
        public final java.lang.String getSchema() {
            return this.schema;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncGraphqlApiUserPoolConfig> getUserPoolConfig() {
            return this.userPoolConfig;
        }

        @Override
        public final java.lang.Boolean getXrayEnabled() {
            return this.xrayEnabled;
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

            data.set("authenticationType", om.valueToTree(this.getAuthenticationType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAdditionalAuthenticationProvider() != null) {
                data.set("additionalAuthenticationProvider", om.valueToTree(this.getAdditionalAuthenticationProvider()));
            }
            if (this.getLogConfig() != null) {
                data.set("logConfig", om.valueToTree(this.getLogConfig()));
            }
            if (this.getOpenidConnectConfig() != null) {
                data.set("openidConnectConfig", om.valueToTree(this.getOpenidConnectConfig()));
            }
            if (this.getSchema() != null) {
                data.set("schema", om.valueToTree(this.getSchema()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUserPoolConfig() != null) {
                data.set("userPoolConfig", om.valueToTree(this.getUserPoolConfig()));
            }
            if (this.getXrayEnabled() != null) {
                data.set("xrayEnabled", om.valueToTree(this.getXrayEnabled()));
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
            struct.set("fqn", om.valueToTree("aws.AppsyncGraphqlApiConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncGraphqlApiConfig.Jsii$Proxy that = (AppsyncGraphqlApiConfig.Jsii$Proxy) o;

            if (!authenticationType.equals(that.authenticationType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.additionalAuthenticationProvider != null ? !this.additionalAuthenticationProvider.equals(that.additionalAuthenticationProvider) : that.additionalAuthenticationProvider != null) return false;
            if (this.logConfig != null ? !this.logConfig.equals(that.logConfig) : that.logConfig != null) return false;
            if (this.openidConnectConfig != null ? !this.openidConnectConfig.equals(that.openidConnectConfig) : that.openidConnectConfig != null) return false;
            if (this.schema != null ? !this.schema.equals(that.schema) : that.schema != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.userPoolConfig != null ? !this.userPoolConfig.equals(that.userPoolConfig) : that.userPoolConfig != null) return false;
            if (this.xrayEnabled != null ? !this.xrayEnabled.equals(that.xrayEnabled) : that.xrayEnabled != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.authenticationType.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.additionalAuthenticationProvider != null ? this.additionalAuthenticationProvider.hashCode() : 0);
            result = 31 * result + (this.logConfig != null ? this.logConfig.hashCode() : 0);
            result = 31 * result + (this.openidConnectConfig != null ? this.openidConnectConfig.hashCode() : 0);
            result = 31 * result + (this.schema != null ? this.schema.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.userPoolConfig != null ? this.userPoolConfig.hashCode() : 0);
            result = 31 * result + (this.xrayEnabled != null ? this.xrayEnabled.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
