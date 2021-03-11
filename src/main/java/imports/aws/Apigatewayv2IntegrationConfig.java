package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.014Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2IntegrationConfig")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2IntegrationConfig.Jsii$Proxy.class)
public interface Apigatewayv2IntegrationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getIntegrationType();

    default @org.jetbrains.annotations.Nullable java.lang.String getConnectionId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConnectionType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContentHandlingStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCredentialsArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIntegrationMethod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIntegrationUri() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPassthroughBehavior() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPayloadFormatVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequestTemplates() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTemplateSelectionExpression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutMilliseconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2IntegrationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2IntegrationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2IntegrationConfig> {
        private java.lang.String apiId;
        private java.lang.String integrationType;
        private java.lang.String connectionId;
        private java.lang.String connectionType;
        private java.lang.String contentHandlingStrategy;
        private java.lang.String credentialsArn;
        private java.lang.String description;
        private java.lang.String integrationMethod;
        private java.lang.String integrationUri;
        private java.lang.String passthroughBehavior;
        private java.lang.String payloadFormatVersion;
        private java.util.Map<java.lang.String, java.lang.String> requestTemplates;
        private java.lang.String templateSelectionExpression;
        private java.lang.Number timeoutMilliseconds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getIntegrationType}
         * @param integrationType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder integrationType(java.lang.String integrationType) {
            this.integrationType = integrationType;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getConnectionId}
         * @param connectionId the value to be set.
         * @return {@code this}
         */
        public Builder connectionId(java.lang.String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getConnectionType}
         * @param connectionType the value to be set.
         * @return {@code this}
         */
        public Builder connectionType(java.lang.String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getContentHandlingStrategy}
         * @param contentHandlingStrategy the value to be set.
         * @return {@code this}
         */
        public Builder contentHandlingStrategy(java.lang.String contentHandlingStrategy) {
            this.contentHandlingStrategy = contentHandlingStrategy;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getCredentialsArn}
         * @param credentialsArn the value to be set.
         * @return {@code this}
         */
        public Builder credentialsArn(java.lang.String credentialsArn) {
            this.credentialsArn = credentialsArn;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getIntegrationMethod}
         * @param integrationMethod the value to be set.
         * @return {@code this}
         */
        public Builder integrationMethod(java.lang.String integrationMethod) {
            this.integrationMethod = integrationMethod;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getIntegrationUri}
         * @param integrationUri the value to be set.
         * @return {@code this}
         */
        public Builder integrationUri(java.lang.String integrationUri) {
            this.integrationUri = integrationUri;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getPassthroughBehavior}
         * @param passthroughBehavior the value to be set.
         * @return {@code this}
         */
        public Builder passthroughBehavior(java.lang.String passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getPayloadFormatVersion}
         * @param payloadFormatVersion the value to be set.
         * @return {@code this}
         */
        public Builder payloadFormatVersion(java.lang.String payloadFormatVersion) {
            this.payloadFormatVersion = payloadFormatVersion;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getRequestTemplates}
         * @param requestTemplates the value to be set.
         * @return {@code this}
         */
        public Builder requestTemplates(java.util.Map<java.lang.String, java.lang.String> requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getTemplateSelectionExpression}
         * @param templateSelectionExpression the value to be set.
         * @return {@code this}
         */
        public Builder templateSelectionExpression(java.lang.String templateSelectionExpression) {
            this.templateSelectionExpression = templateSelectionExpression;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getTimeoutMilliseconds}
         * @param timeoutMilliseconds the value to be set.
         * @return {@code this}
         */
        public Builder timeoutMilliseconds(java.lang.Number timeoutMilliseconds) {
            this.timeoutMilliseconds = timeoutMilliseconds;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getDependsOn}
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
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationConfig#getProvider}
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
         * @return a new instance of {@link Apigatewayv2IntegrationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2IntegrationConfig build() {
            return new Jsii$Proxy(apiId, integrationType, connectionId, connectionType, contentHandlingStrategy, credentialsArn, description, integrationMethod, integrationUri, passthroughBehavior, payloadFormatVersion, requestTemplates, templateSelectionExpression, timeoutMilliseconds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2IntegrationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2IntegrationConfig {
        private final java.lang.String apiId;
        private final java.lang.String integrationType;
        private final java.lang.String connectionId;
        private final java.lang.String connectionType;
        private final java.lang.String contentHandlingStrategy;
        private final java.lang.String credentialsArn;
        private final java.lang.String description;
        private final java.lang.String integrationMethod;
        private final java.lang.String integrationUri;
        private final java.lang.String passthroughBehavior;
        private final java.lang.String payloadFormatVersion;
        private final java.util.Map<java.lang.String, java.lang.String> requestTemplates;
        private final java.lang.String templateSelectionExpression;
        private final java.lang.Number timeoutMilliseconds;
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
            this.integrationType = software.amazon.jsii.Kernel.get(this, "integrationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionId = software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionType = software.amazon.jsii.Kernel.get(this, "connectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentHandlingStrategy = software.amazon.jsii.Kernel.get(this, "contentHandlingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.credentialsArn = software.amazon.jsii.Kernel.get(this, "credentialsArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.integrationMethod = software.amazon.jsii.Kernel.get(this, "integrationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.integrationUri = software.amazon.jsii.Kernel.get(this, "integrationUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.passthroughBehavior = software.amazon.jsii.Kernel.get(this, "passthroughBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.payloadFormatVersion = software.amazon.jsii.Kernel.get(this, "payloadFormatVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requestTemplates = software.amazon.jsii.Kernel.get(this, "requestTemplates", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.templateSelectionExpression = software.amazon.jsii.Kernel.get(this, "templateSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeoutMilliseconds = software.amazon.jsii.Kernel.get(this, "timeoutMilliseconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String integrationType, final java.lang.String connectionId, final java.lang.String connectionType, final java.lang.String contentHandlingStrategy, final java.lang.String credentialsArn, final java.lang.String description, final java.lang.String integrationMethod, final java.lang.String integrationUri, final java.lang.String passthroughBehavior, final java.lang.String payloadFormatVersion, final java.util.Map<java.lang.String, java.lang.String> requestTemplates, final java.lang.String templateSelectionExpression, final java.lang.Number timeoutMilliseconds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.integrationType = java.util.Objects.requireNonNull(integrationType, "integrationType is required");
            this.connectionId = connectionId;
            this.connectionType = connectionType;
            this.contentHandlingStrategy = contentHandlingStrategy;
            this.credentialsArn = credentialsArn;
            this.description = description;
            this.integrationMethod = integrationMethod;
            this.integrationUri = integrationUri;
            this.passthroughBehavior = passthroughBehavior;
            this.payloadFormatVersion = payloadFormatVersion;
            this.requestTemplates = requestTemplates;
            this.templateSelectionExpression = templateSelectionExpression;
            this.timeoutMilliseconds = timeoutMilliseconds;
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
        public final java.lang.String getIntegrationType() {
            return this.integrationType;
        }

        @Override
        public final java.lang.String getConnectionId() {
            return this.connectionId;
        }

        @Override
        public final java.lang.String getConnectionType() {
            return this.connectionType;
        }

        @Override
        public final java.lang.String getContentHandlingStrategy() {
            return this.contentHandlingStrategy;
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
        public final java.lang.String getIntegrationMethod() {
            return this.integrationMethod;
        }

        @Override
        public final java.lang.String getIntegrationUri() {
            return this.integrationUri;
        }

        @Override
        public final java.lang.String getPassthroughBehavior() {
            return this.passthroughBehavior;
        }

        @Override
        public final java.lang.String getPayloadFormatVersion() {
            return this.payloadFormatVersion;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRequestTemplates() {
            return this.requestTemplates;
        }

        @Override
        public final java.lang.String getTemplateSelectionExpression() {
            return this.templateSelectionExpression;
        }

        @Override
        public final java.lang.Number getTimeoutMilliseconds() {
            return this.timeoutMilliseconds;
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
            data.set("integrationType", om.valueToTree(this.getIntegrationType()));
            if (this.getConnectionId() != null) {
                data.set("connectionId", om.valueToTree(this.getConnectionId()));
            }
            if (this.getConnectionType() != null) {
                data.set("connectionType", om.valueToTree(this.getConnectionType()));
            }
            if (this.getContentHandlingStrategy() != null) {
                data.set("contentHandlingStrategy", om.valueToTree(this.getContentHandlingStrategy()));
            }
            if (this.getCredentialsArn() != null) {
                data.set("credentialsArn", om.valueToTree(this.getCredentialsArn()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getIntegrationMethod() != null) {
                data.set("integrationMethod", om.valueToTree(this.getIntegrationMethod()));
            }
            if (this.getIntegrationUri() != null) {
                data.set("integrationUri", om.valueToTree(this.getIntegrationUri()));
            }
            if (this.getPassthroughBehavior() != null) {
                data.set("passthroughBehavior", om.valueToTree(this.getPassthroughBehavior()));
            }
            if (this.getPayloadFormatVersion() != null) {
                data.set("payloadFormatVersion", om.valueToTree(this.getPayloadFormatVersion()));
            }
            if (this.getRequestTemplates() != null) {
                data.set("requestTemplates", om.valueToTree(this.getRequestTemplates()));
            }
            if (this.getTemplateSelectionExpression() != null) {
                data.set("templateSelectionExpression", om.valueToTree(this.getTemplateSelectionExpression()));
            }
            if (this.getTimeoutMilliseconds() != null) {
                data.set("timeoutMilliseconds", om.valueToTree(this.getTimeoutMilliseconds()));
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
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2IntegrationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2IntegrationConfig.Jsii$Proxy that = (Apigatewayv2IntegrationConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!integrationType.equals(that.integrationType)) return false;
            if (this.connectionId != null ? !this.connectionId.equals(that.connectionId) : that.connectionId != null) return false;
            if (this.connectionType != null ? !this.connectionType.equals(that.connectionType) : that.connectionType != null) return false;
            if (this.contentHandlingStrategy != null ? !this.contentHandlingStrategy.equals(that.contentHandlingStrategy) : that.contentHandlingStrategy != null) return false;
            if (this.credentialsArn != null ? !this.credentialsArn.equals(that.credentialsArn) : that.credentialsArn != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.integrationMethod != null ? !this.integrationMethod.equals(that.integrationMethod) : that.integrationMethod != null) return false;
            if (this.integrationUri != null ? !this.integrationUri.equals(that.integrationUri) : that.integrationUri != null) return false;
            if (this.passthroughBehavior != null ? !this.passthroughBehavior.equals(that.passthroughBehavior) : that.passthroughBehavior != null) return false;
            if (this.payloadFormatVersion != null ? !this.payloadFormatVersion.equals(that.payloadFormatVersion) : that.payloadFormatVersion != null) return false;
            if (this.requestTemplates != null ? !this.requestTemplates.equals(that.requestTemplates) : that.requestTemplates != null) return false;
            if (this.templateSelectionExpression != null ? !this.templateSelectionExpression.equals(that.templateSelectionExpression) : that.templateSelectionExpression != null) return false;
            if (this.timeoutMilliseconds != null ? !this.timeoutMilliseconds.equals(that.timeoutMilliseconds) : that.timeoutMilliseconds != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.integrationType.hashCode());
            result = 31 * result + (this.connectionId != null ? this.connectionId.hashCode() : 0);
            result = 31 * result + (this.connectionType != null ? this.connectionType.hashCode() : 0);
            result = 31 * result + (this.contentHandlingStrategy != null ? this.contentHandlingStrategy.hashCode() : 0);
            result = 31 * result + (this.credentialsArn != null ? this.credentialsArn.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.integrationMethod != null ? this.integrationMethod.hashCode() : 0);
            result = 31 * result + (this.integrationUri != null ? this.integrationUri.hashCode() : 0);
            result = 31 * result + (this.passthroughBehavior != null ? this.passthroughBehavior.hashCode() : 0);
            result = 31 * result + (this.payloadFormatVersion != null ? this.payloadFormatVersion.hashCode() : 0);
            result = 31 * result + (this.requestTemplates != null ? this.requestTemplates.hashCode() : 0);
            result = 31 * result + (this.templateSelectionExpression != null ? this.templateSelectionExpression.hashCode() : 0);
            result = 31 * result + (this.timeoutMilliseconds != null ? this.timeoutMilliseconds.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
