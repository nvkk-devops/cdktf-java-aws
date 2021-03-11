package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.994Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayStageConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayStageConfig.Jsii$Proxy.class)
public interface ApiGatewayStageConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDeploymentId();

    @org.jetbrains.annotations.NotNull java.lang.String getRestApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getStageName();

    /**
     * access_log_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayStageAccessLogSettings> getAccessLogSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCacheClusterEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCacheClusterSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getClientCertificateId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDocumentationVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVariables() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getXrayTracingEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayStageConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayStageConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayStageConfig> {
        private java.lang.String deploymentId;
        private java.lang.String restApiId;
        private java.lang.String stageName;
        private java.util.List<imports.aws.ApiGatewayStageAccessLogSettings> accessLogSettings;
        private java.lang.Boolean cacheClusterEnabled;
        private java.lang.String cacheClusterSize;
        private java.lang.String clientCertificateId;
        private java.lang.String description;
        private java.lang.String documentationVersion;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.Map<java.lang.String, java.lang.String> variables;
        private java.lang.Boolean xrayTracingEnabled;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getDeploymentId}
         * @param deploymentId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder deploymentId(java.lang.String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getRestApiId}
         * @param restApiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder restApiId(java.lang.String restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getStageName}
         * @param stageName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stageName(java.lang.String stageName) {
            this.stageName = stageName;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getAccessLogSettings}
         * @param accessLogSettings access_log_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accessLogSettings(java.util.List<? extends imports.aws.ApiGatewayStageAccessLogSettings> accessLogSettings) {
            this.accessLogSettings = (java.util.List<imports.aws.ApiGatewayStageAccessLogSettings>)accessLogSettings;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getCacheClusterEnabled}
         * @param cacheClusterEnabled the value to be set.
         * @return {@code this}
         */
        public Builder cacheClusterEnabled(java.lang.Boolean cacheClusterEnabled) {
            this.cacheClusterEnabled = cacheClusterEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getCacheClusterSize}
         * @param cacheClusterSize the value to be set.
         * @return {@code this}
         */
        public Builder cacheClusterSize(java.lang.String cacheClusterSize) {
            this.cacheClusterSize = cacheClusterSize;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getClientCertificateId}
         * @param clientCertificateId the value to be set.
         * @return {@code this}
         */
        public Builder clientCertificateId(java.lang.String clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getDocumentationVersion}
         * @param documentationVersion the value to be set.
         * @return {@code this}
         */
        public Builder documentationVersion(java.lang.String documentationVersion) {
            this.documentationVersion = documentationVersion;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getVariables}
         * @param variables the value to be set.
         * @return {@code this}
         */
        public Builder variables(java.util.Map<java.lang.String, java.lang.String> variables) {
            this.variables = variables;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getXrayTracingEnabled}
         * @param xrayTracingEnabled the value to be set.
         * @return {@code this}
         */
        public Builder xrayTracingEnabled(java.lang.Boolean xrayTracingEnabled) {
            this.xrayTracingEnabled = xrayTracingEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getDependsOn}
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
         * Sets the value of {@link ApiGatewayStageConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageConfig#getProvider}
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
         * @return a new instance of {@link ApiGatewayStageConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayStageConfig build() {
            return new Jsii$Proxy(deploymentId, restApiId, stageName, accessLogSettings, cacheClusterEnabled, cacheClusterSize, clientCertificateId, description, documentationVersion, tags, variables, xrayTracingEnabled, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayStageConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayStageConfig {
        private final java.lang.String deploymentId;
        private final java.lang.String restApiId;
        private final java.lang.String stageName;
        private final java.util.List<imports.aws.ApiGatewayStageAccessLogSettings> accessLogSettings;
        private final java.lang.Boolean cacheClusterEnabled;
        private final java.lang.String cacheClusterSize;
        private final java.lang.String clientCertificateId;
        private final java.lang.String description;
        private final java.lang.String documentationVersion;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> variables;
        private final java.lang.Boolean xrayTracingEnabled;
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
            this.deploymentId = software.amazon.jsii.Kernel.get(this, "deploymentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restApiId = software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stageName = software.amazon.jsii.Kernel.get(this, "stageName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessLogSettings = software.amazon.jsii.Kernel.get(this, "accessLogSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayStageAccessLogSettings.class)));
            this.cacheClusterEnabled = software.amazon.jsii.Kernel.get(this, "cacheClusterEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.cacheClusterSize = software.amazon.jsii.Kernel.get(this, "cacheClusterSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientCertificateId = software.amazon.jsii.Kernel.get(this, "clientCertificateId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.documentationVersion = software.amazon.jsii.Kernel.get(this, "documentationVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.variables = software.amazon.jsii.Kernel.get(this, "variables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.xrayTracingEnabled = software.amazon.jsii.Kernel.get(this, "xrayTracingEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String deploymentId, final java.lang.String restApiId, final java.lang.String stageName, final java.util.List<? extends imports.aws.ApiGatewayStageAccessLogSettings> accessLogSettings, final java.lang.Boolean cacheClusterEnabled, final java.lang.String cacheClusterSize, final java.lang.String clientCertificateId, final java.lang.String description, final java.lang.String documentationVersion, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.Map<java.lang.String, java.lang.String> variables, final java.lang.Boolean xrayTracingEnabled, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deploymentId = java.util.Objects.requireNonNull(deploymentId, "deploymentId is required");
            this.restApiId = java.util.Objects.requireNonNull(restApiId, "restApiId is required");
            this.stageName = java.util.Objects.requireNonNull(stageName, "stageName is required");
            this.accessLogSettings = (java.util.List<imports.aws.ApiGatewayStageAccessLogSettings>)accessLogSettings;
            this.cacheClusterEnabled = cacheClusterEnabled;
            this.cacheClusterSize = cacheClusterSize;
            this.clientCertificateId = clientCertificateId;
            this.description = description;
            this.documentationVersion = documentationVersion;
            this.tags = tags;
            this.variables = variables;
            this.xrayTracingEnabled = xrayTracingEnabled;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDeploymentId() {
            return this.deploymentId;
        }

        @Override
        public final java.lang.String getRestApiId() {
            return this.restApiId;
        }

        @Override
        public final java.lang.String getStageName() {
            return this.stageName;
        }

        @Override
        public final java.util.List<imports.aws.ApiGatewayStageAccessLogSettings> getAccessLogSettings() {
            return this.accessLogSettings;
        }

        @Override
        public final java.lang.Boolean getCacheClusterEnabled() {
            return this.cacheClusterEnabled;
        }

        @Override
        public final java.lang.String getCacheClusterSize() {
            return this.cacheClusterSize;
        }

        @Override
        public final java.lang.String getClientCertificateId() {
            return this.clientCertificateId;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getDocumentationVersion() {
            return this.documentationVersion;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVariables() {
            return this.variables;
        }

        @Override
        public final java.lang.Boolean getXrayTracingEnabled() {
            return this.xrayTracingEnabled;
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

            data.set("deploymentId", om.valueToTree(this.getDeploymentId()));
            data.set("restApiId", om.valueToTree(this.getRestApiId()));
            data.set("stageName", om.valueToTree(this.getStageName()));
            if (this.getAccessLogSettings() != null) {
                data.set("accessLogSettings", om.valueToTree(this.getAccessLogSettings()));
            }
            if (this.getCacheClusterEnabled() != null) {
                data.set("cacheClusterEnabled", om.valueToTree(this.getCacheClusterEnabled()));
            }
            if (this.getCacheClusterSize() != null) {
                data.set("cacheClusterSize", om.valueToTree(this.getCacheClusterSize()));
            }
            if (this.getClientCertificateId() != null) {
                data.set("clientCertificateId", om.valueToTree(this.getClientCertificateId()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDocumentationVersion() != null) {
                data.set("documentationVersion", om.valueToTree(this.getDocumentationVersion()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVariables() != null) {
                data.set("variables", om.valueToTree(this.getVariables()));
            }
            if (this.getXrayTracingEnabled() != null) {
                data.set("xrayTracingEnabled", om.valueToTree(this.getXrayTracingEnabled()));
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
            struct.set("fqn", om.valueToTree("aws.ApiGatewayStageConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayStageConfig.Jsii$Proxy that = (ApiGatewayStageConfig.Jsii$Proxy) o;

            if (!deploymentId.equals(that.deploymentId)) return false;
            if (!restApiId.equals(that.restApiId)) return false;
            if (!stageName.equals(that.stageName)) return false;
            if (this.accessLogSettings != null ? !this.accessLogSettings.equals(that.accessLogSettings) : that.accessLogSettings != null) return false;
            if (this.cacheClusterEnabled != null ? !this.cacheClusterEnabled.equals(that.cacheClusterEnabled) : that.cacheClusterEnabled != null) return false;
            if (this.cacheClusterSize != null ? !this.cacheClusterSize.equals(that.cacheClusterSize) : that.cacheClusterSize != null) return false;
            if (this.clientCertificateId != null ? !this.clientCertificateId.equals(that.clientCertificateId) : that.clientCertificateId != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.documentationVersion != null ? !this.documentationVersion.equals(that.documentationVersion) : that.documentationVersion != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.variables != null ? !this.variables.equals(that.variables) : that.variables != null) return false;
            if (this.xrayTracingEnabled != null ? !this.xrayTracingEnabled.equals(that.xrayTracingEnabled) : that.xrayTracingEnabled != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deploymentId.hashCode();
            result = 31 * result + (this.restApiId.hashCode());
            result = 31 * result + (this.stageName.hashCode());
            result = 31 * result + (this.accessLogSettings != null ? this.accessLogSettings.hashCode() : 0);
            result = 31 * result + (this.cacheClusterEnabled != null ? this.cacheClusterEnabled.hashCode() : 0);
            result = 31 * result + (this.cacheClusterSize != null ? this.cacheClusterSize.hashCode() : 0);
            result = 31 * result + (this.clientCertificateId != null ? this.clientCertificateId.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.documentationVersion != null ? this.documentationVersion.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.variables != null ? this.variables.hashCode() : 0);
            result = 31 * result + (this.xrayTracingEnabled != null ? this.xrayTracingEnabled.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
