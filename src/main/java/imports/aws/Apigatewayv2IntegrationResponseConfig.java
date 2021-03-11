package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.015Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2IntegrationResponseConfig")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2IntegrationResponseConfig.Jsii$Proxy.class)
public interface Apigatewayv2IntegrationResponseConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getIntegrationId();

    @org.jetbrains.annotations.NotNull java.lang.String getIntegrationResponseKey();

    default @org.jetbrains.annotations.Nullable java.lang.String getContentHandlingStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getResponseTemplates() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTemplateSelectionExpression() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2IntegrationResponseConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2IntegrationResponseConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2IntegrationResponseConfig> {
        private java.lang.String apiId;
        private java.lang.String integrationId;
        private java.lang.String integrationResponseKey;
        private java.lang.String contentHandlingStrategy;
        private java.util.Map<java.lang.String, java.lang.String> responseTemplates;
        private java.lang.String templateSelectionExpression;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getIntegrationId}
         * @param integrationId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder integrationId(java.lang.String integrationId) {
            this.integrationId = integrationId;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getIntegrationResponseKey}
         * @param integrationResponseKey the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder integrationResponseKey(java.lang.String integrationResponseKey) {
            this.integrationResponseKey = integrationResponseKey;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getContentHandlingStrategy}
         * @param contentHandlingStrategy the value to be set.
         * @return {@code this}
         */
        public Builder contentHandlingStrategy(java.lang.String contentHandlingStrategy) {
            this.contentHandlingStrategy = contentHandlingStrategy;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getResponseTemplates}
         * @param responseTemplates the value to be set.
         * @return {@code this}
         */
        public Builder responseTemplates(java.util.Map<java.lang.String, java.lang.String> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getTemplateSelectionExpression}
         * @param templateSelectionExpression the value to be set.
         * @return {@code this}
         */
        public Builder templateSelectionExpression(java.lang.String templateSelectionExpression) {
            this.templateSelectionExpression = templateSelectionExpression;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getDependsOn}
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
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2IntegrationResponseConfig#getProvider}
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
         * @return a new instance of {@link Apigatewayv2IntegrationResponseConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2IntegrationResponseConfig build() {
            return new Jsii$Proxy(apiId, integrationId, integrationResponseKey, contentHandlingStrategy, responseTemplates, templateSelectionExpression, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2IntegrationResponseConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2IntegrationResponseConfig {
        private final java.lang.String apiId;
        private final java.lang.String integrationId;
        private final java.lang.String integrationResponseKey;
        private final java.lang.String contentHandlingStrategy;
        private final java.util.Map<java.lang.String, java.lang.String> responseTemplates;
        private final java.lang.String templateSelectionExpression;
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
            this.integrationId = software.amazon.jsii.Kernel.get(this, "integrationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.integrationResponseKey = software.amazon.jsii.Kernel.get(this, "integrationResponseKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentHandlingStrategy = software.amazon.jsii.Kernel.get(this, "contentHandlingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.responseTemplates = software.amazon.jsii.Kernel.get(this, "responseTemplates", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.templateSelectionExpression = software.amazon.jsii.Kernel.get(this, "templateSelectionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String integrationId, final java.lang.String integrationResponseKey, final java.lang.String contentHandlingStrategy, final java.util.Map<java.lang.String, java.lang.String> responseTemplates, final java.lang.String templateSelectionExpression, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.integrationId = java.util.Objects.requireNonNull(integrationId, "integrationId is required");
            this.integrationResponseKey = java.util.Objects.requireNonNull(integrationResponseKey, "integrationResponseKey is required");
            this.contentHandlingStrategy = contentHandlingStrategy;
            this.responseTemplates = responseTemplates;
            this.templateSelectionExpression = templateSelectionExpression;
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
        public final java.lang.String getIntegrationId() {
            return this.integrationId;
        }

        @Override
        public final java.lang.String getIntegrationResponseKey() {
            return this.integrationResponseKey;
        }

        @Override
        public final java.lang.String getContentHandlingStrategy() {
            return this.contentHandlingStrategy;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getResponseTemplates() {
            return this.responseTemplates;
        }

        @Override
        public final java.lang.String getTemplateSelectionExpression() {
            return this.templateSelectionExpression;
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
            data.set("integrationId", om.valueToTree(this.getIntegrationId()));
            data.set("integrationResponseKey", om.valueToTree(this.getIntegrationResponseKey()));
            if (this.getContentHandlingStrategy() != null) {
                data.set("contentHandlingStrategy", om.valueToTree(this.getContentHandlingStrategy()));
            }
            if (this.getResponseTemplates() != null) {
                data.set("responseTemplates", om.valueToTree(this.getResponseTemplates()));
            }
            if (this.getTemplateSelectionExpression() != null) {
                data.set("templateSelectionExpression", om.valueToTree(this.getTemplateSelectionExpression()));
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
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2IntegrationResponseConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2IntegrationResponseConfig.Jsii$Proxy that = (Apigatewayv2IntegrationResponseConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!integrationId.equals(that.integrationId)) return false;
            if (!integrationResponseKey.equals(that.integrationResponseKey)) return false;
            if (this.contentHandlingStrategy != null ? !this.contentHandlingStrategy.equals(that.contentHandlingStrategy) : that.contentHandlingStrategy != null) return false;
            if (this.responseTemplates != null ? !this.responseTemplates.equals(that.responseTemplates) : that.responseTemplates != null) return false;
            if (this.templateSelectionExpression != null ? !this.templateSelectionExpression.equals(that.templateSelectionExpression) : that.templateSelectionExpression != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.integrationId.hashCode());
            result = 31 * result + (this.integrationResponseKey.hashCode());
            result = 31 * result + (this.contentHandlingStrategy != null ? this.contentHandlingStrategy.hashCode() : 0);
            result = 31 * result + (this.responseTemplates != null ? this.responseTemplates.hashCode() : 0);
            result = 31 * result + (this.templateSelectionExpression != null ? this.templateSelectionExpression.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
