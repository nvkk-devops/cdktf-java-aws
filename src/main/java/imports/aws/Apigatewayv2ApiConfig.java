package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.999Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2ApiConfig")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2ApiConfig.Jsii$Proxy.class)
public interface Apigatewayv2ApiConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getProtocolType();

    default @org.jetbrains.annotations.Nullable java.lang.String getApiKeySelectionExpression() {
        return null;
    }

    /**
     * cors_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2ApiCorsConfiguration> getCorsConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCredentialsArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRouteKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRouteSelectionExpression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTarget() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2ApiConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2ApiConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2ApiConfig> {
        private java.lang.String name;
        private java.lang.String protocolType;
        private java.lang.String apiKeySelectionExpression;
        private java.util.List<imports.aws.Apigatewayv2ApiCorsConfiguration> corsConfiguration;
        private java.lang.String credentialsArn;
        private java.lang.String description;
        private java.lang.String routeKey;
        private java.lang.String routeSelectionExpression;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String target;
        private java.lang.String version;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getProtocolType}
         * @param protocolType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder protocolType(java.lang.String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getApiKeySelectionExpression}
         * @param apiKeySelectionExpression the value to be set.
         * @return {@code this}
         */
        public Builder apiKeySelectionExpression(java.lang.String apiKeySelectionExpression) {
            this.apiKeySelectionExpression = apiKeySelectionExpression;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getCorsConfiguration}
         * @param corsConfiguration cors_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder corsConfiguration(java.util.List<? extends imports.aws.Apigatewayv2ApiCorsConfiguration> corsConfiguration) {
            this.corsConfiguration = (java.util.List<imports.aws.Apigatewayv2ApiCorsConfiguration>)corsConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getCredentialsArn}
         * @param credentialsArn the value to be set.
         * @return {@code this}
         */
        public Builder credentialsArn(java.lang.String credentialsArn) {
            this.credentialsArn = credentialsArn;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getRouteKey}
         * @param routeKey the value to be set.
         * @return {@code this}
         */
        public Builder routeKey(java.lang.String routeKey) {
            this.routeKey = routeKey;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getRouteSelectionExpression}
         * @param routeSelectionExpression the value to be set.
         * @return {@code this}
         */
        public Builder routeSelectionExpression(java.lang.String routeSelectionExpression) {
            this.routeSelectionExpression = routeSelectionExpression;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getTarget}
         * @param target the value to be set.
         * @return {@code this}
         */
        public Builder target(java.lang.String target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getVersion}
         * @param version the value to be set.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getDependsOn}
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
         * Sets the value of {@link Apigatewayv2ApiConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2ApiConfig#getProvider}
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
         * @return a new instance of {@link Apigatewayv2ApiConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2ApiConfig build() {
            return new Jsii$Proxy(name, protocolType, apiKeySelectionExpression, corsConfiguration, credentialsArn, description, routeKey, routeSelectionExpression, tags, target, version, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2ApiConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2ApiConfig {
        private final java.lang.String name;
        private final java.lang.String protocolType;
        private final java.lang.String apiKeySelectionExpression;
        private final java.util.List<imports.aws.Apigatewayv2ApiCorsConfiguration> corsConfiguration;
        private final java.lang.String credentialsArn;
        private final java.lang.String description;
        private final java.lang.String routeKey;
        private final java.lang.String routeSelectionExpression;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String target;
        private final java.lang.String version;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocolType = software.amazon.jsii.Kernel.get(this, "protocolType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.apiKeySelectionExpression = software.amazon.jsii.Kernel.get(this, "apiKeySelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.corsConfiguration = software.amazon.jsii.Kernel.get(this, "corsConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2ApiCorsConfiguration.class)));
            this.credentialsArn = software.amazon.jsii.Kernel.get(this, "credentialsArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.routeKey = software.amazon.jsii.Kernel.get(this, "routeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.routeSelectionExpression = software.amazon.jsii.Kernel.get(this, "routeSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String protocolType, final java.lang.String apiKeySelectionExpression, final java.util.List<? extends imports.aws.Apigatewayv2ApiCorsConfiguration> corsConfiguration, final java.lang.String credentialsArn, final java.lang.String description, final java.lang.String routeKey, final java.lang.String routeSelectionExpression, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String target, final java.lang.String version, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.protocolType = java.util.Objects.requireNonNull(protocolType, "protocolType is required");
            this.apiKeySelectionExpression = apiKeySelectionExpression;
            this.corsConfiguration = (java.util.List<imports.aws.Apigatewayv2ApiCorsConfiguration>)corsConfiguration;
            this.credentialsArn = credentialsArn;
            this.description = description;
            this.routeKey = routeKey;
            this.routeSelectionExpression = routeSelectionExpression;
            this.tags = tags;
            this.target = target;
            this.version = version;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getProtocolType() {
            return this.protocolType;
        }

        @Override
        public final java.lang.String getApiKeySelectionExpression() {
            return this.apiKeySelectionExpression;
        }

        @Override
        public final java.util.List<imports.aws.Apigatewayv2ApiCorsConfiguration> getCorsConfiguration() {
            return this.corsConfiguration;
        }

        @Override
        public final java.lang.String getCredentialsArn() {
            return this.credentialsArn;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getRouteKey() {
            return this.routeKey;
        }

        @Override
        public final java.lang.String getRouteSelectionExpression() {
            return this.routeSelectionExpression;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTarget() {
            return this.target;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("protocolType", om.valueToTree(this.getProtocolType()));
            if (this.getApiKeySelectionExpression() != null) {
                data.set("apiKeySelectionExpression", om.valueToTree(this.getApiKeySelectionExpression()));
            }
            if (this.getCorsConfiguration() != null) {
                data.set("corsConfiguration", om.valueToTree(this.getCorsConfiguration()));
            }
            if (this.getCredentialsArn() != null) {
                data.set("credentialsArn", om.valueToTree(this.getCredentialsArn()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getRouteKey() != null) {
                data.set("routeKey", om.valueToTree(this.getRouteKey()));
            }
            if (this.getRouteSelectionExpression() != null) {
                data.set("routeSelectionExpression", om.valueToTree(this.getRouteSelectionExpression()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTarget() != null) {
                data.set("target", om.valueToTree(this.getTarget()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
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
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2ApiConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2ApiConfig.Jsii$Proxy that = (Apigatewayv2ApiConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!protocolType.equals(that.protocolType)) return false;
            if (this.apiKeySelectionExpression != null ? !this.apiKeySelectionExpression.equals(that.apiKeySelectionExpression) : that.apiKeySelectionExpression != null) return false;
            if (this.corsConfiguration != null ? !this.corsConfiguration.equals(that.corsConfiguration) : that.corsConfiguration != null) return false;
            if (this.credentialsArn != null ? !this.credentialsArn.equals(that.credentialsArn) : that.credentialsArn != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.routeKey != null ? !this.routeKey.equals(that.routeKey) : that.routeKey != null) return false;
            if (this.routeSelectionExpression != null ? !this.routeSelectionExpression.equals(that.routeSelectionExpression) : that.routeSelectionExpression != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.target != null ? !this.target.equals(that.target) : that.target != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.protocolType.hashCode());
            result = 31 * result + (this.apiKeySelectionExpression != null ? this.apiKeySelectionExpression.hashCode() : 0);
            result = 31 * result + (this.corsConfiguration != null ? this.corsConfiguration.hashCode() : 0);
            result = 31 * result + (this.credentialsArn != null ? this.credentialsArn.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.routeKey != null ? this.routeKey.hashCode() : 0);
            result = 31 * result + (this.routeSelectionExpression != null ? this.routeSelectionExpression.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.target != null ? this.target.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
