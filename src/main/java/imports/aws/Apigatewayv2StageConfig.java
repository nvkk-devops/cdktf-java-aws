package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.021Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2StageConfig")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2StageConfig.Jsii$Proxy.class)
public interface Apigatewayv2StageConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * access_log_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings> getAccessLogSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoDeploy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClientCertificateId() {
        return null;
    }

    /**
     * default_route_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings> getDefaultRouteSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeploymentId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * route_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Apigatewayv2StageRouteSettings> getRouteSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getStageVariables() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2StageConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2StageConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2StageConfig> {
        private java.lang.String apiId;
        private java.lang.String name;
        private java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings> accessLogSettings;
        private java.lang.Boolean autoDeploy;
        private java.lang.String clientCertificateId;
        private java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings> defaultRouteSettings;
        private java.lang.String deploymentId;
        private java.lang.String description;
        private java.util.List<imports.aws.Apigatewayv2StageRouteSettings> routeSettings;
        private java.util.Map<java.lang.String, java.lang.String> stageVariables;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getAccessLogSettings}
         * @param accessLogSettings access_log_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accessLogSettings(java.util.List<? extends imports.aws.Apigatewayv2StageAccessLogSettings> accessLogSettings) {
            this.accessLogSettings = (java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings>)accessLogSettings;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getAutoDeploy}
         * @param autoDeploy the value to be set.
         * @return {@code this}
         */
        public Builder autoDeploy(java.lang.Boolean autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getClientCertificateId}
         * @param clientCertificateId the value to be set.
         * @return {@code this}
         */
        public Builder clientCertificateId(java.lang.String clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getDefaultRouteSettings}
         * @param defaultRouteSettings default_route_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder defaultRouteSettings(java.util.List<? extends imports.aws.Apigatewayv2StageDefaultRouteSettings> defaultRouteSettings) {
            this.defaultRouteSettings = (java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings>)defaultRouteSettings;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getDeploymentId}
         * @param deploymentId the value to be set.
         * @return {@code this}
         */
        public Builder deploymentId(java.lang.String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getRouteSettings}
         * @param routeSettings route_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder routeSettings(java.util.List<? extends imports.aws.Apigatewayv2StageRouteSettings> routeSettings) {
            this.routeSettings = (java.util.List<imports.aws.Apigatewayv2StageRouteSettings>)routeSettings;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getStageVariables}
         * @param stageVariables the value to be set.
         * @return {@code this}
         */
        public Builder stageVariables(java.util.Map<java.lang.String, java.lang.String> stageVariables) {
            this.stageVariables = stageVariables;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getDependsOn}
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
         * Sets the value of {@link Apigatewayv2StageConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageConfig#getProvider}
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
         * @return a new instance of {@link Apigatewayv2StageConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2StageConfig build() {
            return new Jsii$Proxy(apiId, name, accessLogSettings, autoDeploy, clientCertificateId, defaultRouteSettings, deploymentId, description, routeSettings, stageVariables, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2StageConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2StageConfig {
        private final java.lang.String apiId;
        private final java.lang.String name;
        private final java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings> accessLogSettings;
        private final java.lang.Boolean autoDeploy;
        private final java.lang.String clientCertificateId;
        private final java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings> defaultRouteSettings;
        private final java.lang.String deploymentId;
        private final java.lang.String description;
        private final java.util.List<imports.aws.Apigatewayv2StageRouteSettings> routeSettings;
        private final java.util.Map<java.lang.String, java.lang.String> stageVariables;
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
            this.apiId = software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessLogSettings = software.amazon.jsii.Kernel.get(this, "accessLogSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageAccessLogSettings.class)));
            this.autoDeploy = software.amazon.jsii.Kernel.get(this, "autoDeploy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.clientCertificateId = software.amazon.jsii.Kernel.get(this, "clientCertificateId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultRouteSettings = software.amazon.jsii.Kernel.get(this, "defaultRouteSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageDefaultRouteSettings.class)));
            this.deploymentId = software.amazon.jsii.Kernel.get(this, "deploymentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.routeSettings = software.amazon.jsii.Kernel.get(this, "routeSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Apigatewayv2StageRouteSettings.class)));
            this.stageVariables = software.amazon.jsii.Kernel.get(this, "stageVariables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String name, final java.util.List<? extends imports.aws.Apigatewayv2StageAccessLogSettings> accessLogSettings, final java.lang.Boolean autoDeploy, final java.lang.String clientCertificateId, final java.util.List<? extends imports.aws.Apigatewayv2StageDefaultRouteSettings> defaultRouteSettings, final java.lang.String deploymentId, final java.lang.String description, final java.util.List<? extends imports.aws.Apigatewayv2StageRouteSettings> routeSettings, final java.util.Map<java.lang.String, java.lang.String> stageVariables, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.accessLogSettings = (java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings>)accessLogSettings;
            this.autoDeploy = autoDeploy;
            this.clientCertificateId = clientCertificateId;
            this.defaultRouteSettings = (java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings>)defaultRouteSettings;
            this.deploymentId = deploymentId;
            this.description = description;
            this.routeSettings = (java.util.List<imports.aws.Apigatewayv2StageRouteSettings>)routeSettings;
            this.stageVariables = stageVariables;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getApiId() {
            return this.apiId;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.Apigatewayv2StageAccessLogSettings> getAccessLogSettings() {
            return this.accessLogSettings;
        }

        @Override
        public final java.lang.Boolean getAutoDeploy() {
            return this.autoDeploy;
        }

        @Override
        public final java.lang.String getClientCertificateId() {
            return this.clientCertificateId;
        }

        @Override
        public final java.util.List<imports.aws.Apigatewayv2StageDefaultRouteSettings> getDefaultRouteSettings() {
            return this.defaultRouteSettings;
        }

        @Override
        public final java.lang.String getDeploymentId() {
            return this.deploymentId;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.Apigatewayv2StageRouteSettings> getRouteSettings() {
            return this.routeSettings;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getStageVariables() {
            return this.stageVariables;
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

            data.set("apiId", om.valueToTree(this.getApiId()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAccessLogSettings() != null) {
                data.set("accessLogSettings", om.valueToTree(this.getAccessLogSettings()));
            }
            if (this.getAutoDeploy() != null) {
                data.set("autoDeploy", om.valueToTree(this.getAutoDeploy()));
            }
            if (this.getClientCertificateId() != null) {
                data.set("clientCertificateId", om.valueToTree(this.getClientCertificateId()));
            }
            if (this.getDefaultRouteSettings() != null) {
                data.set("defaultRouteSettings", om.valueToTree(this.getDefaultRouteSettings()));
            }
            if (this.getDeploymentId() != null) {
                data.set("deploymentId", om.valueToTree(this.getDeploymentId()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getRouteSettings() != null) {
                data.set("routeSettings", om.valueToTree(this.getRouteSettings()));
            }
            if (this.getStageVariables() != null) {
                data.set("stageVariables", om.valueToTree(this.getStageVariables()));
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
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2StageConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2StageConfig.Jsii$Proxy that = (Apigatewayv2StageConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!name.equals(that.name)) return false;
            if (this.accessLogSettings != null ? !this.accessLogSettings.equals(that.accessLogSettings) : that.accessLogSettings != null) return false;
            if (this.autoDeploy != null ? !this.autoDeploy.equals(that.autoDeploy) : that.autoDeploy != null) return false;
            if (this.clientCertificateId != null ? !this.clientCertificateId.equals(that.clientCertificateId) : that.clientCertificateId != null) return false;
            if (this.defaultRouteSettings != null ? !this.defaultRouteSettings.equals(that.defaultRouteSettings) : that.defaultRouteSettings != null) return false;
            if (this.deploymentId != null ? !this.deploymentId.equals(that.deploymentId) : that.deploymentId != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.routeSettings != null ? !this.routeSettings.equals(that.routeSettings) : that.routeSettings != null) return false;
            if (this.stageVariables != null ? !this.stageVariables.equals(that.stageVariables) : that.stageVariables != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.accessLogSettings != null ? this.accessLogSettings.hashCode() : 0);
            result = 31 * result + (this.autoDeploy != null ? this.autoDeploy.hashCode() : 0);
            result = 31 * result + (this.clientCertificateId != null ? this.clientCertificateId.hashCode() : 0);
            result = 31 * result + (this.defaultRouteSettings != null ? this.defaultRouteSettings.hashCode() : 0);
            result = 31 * result + (this.deploymentId != null ? this.deploymentId.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.routeSettings != null ? this.routeSettings.hashCode() : 0);
            result = 31 * result + (this.stageVariables != null ? this.stageVariables.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
