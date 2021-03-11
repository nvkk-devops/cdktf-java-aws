package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.977Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayGatewayResponseConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayGatewayResponseConfig.Jsii$Proxy.class)
public interface ApiGatewayGatewayResponseConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getResponseType();

    @org.jetbrains.annotations.NotNull java.lang.String getRestApiId();

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getResponseParameters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getResponseTemplates() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatusCode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayGatewayResponseConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayGatewayResponseConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayGatewayResponseConfig> {
        private java.lang.String responseType;
        private java.lang.String restApiId;
        private java.util.Map<java.lang.String, java.lang.String> responseParameters;
        private java.util.Map<java.lang.String, java.lang.String> responseTemplates;
        private java.lang.String statusCode;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getResponseType}
         * @param responseType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder responseType(java.lang.String responseType) {
            this.responseType = responseType;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getRestApiId}
         * @param restApiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder restApiId(java.lang.String restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getResponseParameters}
         * @param responseParameters the value to be set.
         * @return {@code this}
         */
        public Builder responseParameters(java.util.Map<java.lang.String, java.lang.String> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getResponseTemplates}
         * @param responseTemplates the value to be set.
         * @return {@code this}
         */
        public Builder responseTemplates(java.util.Map<java.lang.String, java.lang.String> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getStatusCode}
         * @param statusCode the value to be set.
         * @return {@code this}
         */
        public Builder statusCode(java.lang.String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getDependsOn}
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
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayGatewayResponseConfig#getProvider}
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
         * @return a new instance of {@link ApiGatewayGatewayResponseConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayGatewayResponseConfig build() {
            return new Jsii$Proxy(responseType, restApiId, responseParameters, responseTemplates, statusCode, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayGatewayResponseConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayGatewayResponseConfig {
        private final java.lang.String responseType;
        private final java.lang.String restApiId;
        private final java.util.Map<java.lang.String, java.lang.String> responseParameters;
        private final java.util.Map<java.lang.String, java.lang.String> responseTemplates;
        private final java.lang.String statusCode;
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
            this.responseType = software.amazon.jsii.Kernel.get(this, "responseType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restApiId = software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.responseParameters = software.amazon.jsii.Kernel.get(this, "responseParameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.responseTemplates = software.amazon.jsii.Kernel.get(this, "responseTemplates", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.statusCode = software.amazon.jsii.Kernel.get(this, "statusCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String responseType, final java.lang.String restApiId, final java.util.Map<java.lang.String, java.lang.String> responseParameters, final java.util.Map<java.lang.String, java.lang.String> responseTemplates, final java.lang.String statusCode, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.responseType = java.util.Objects.requireNonNull(responseType, "responseType is required");
            this.restApiId = java.util.Objects.requireNonNull(restApiId, "restApiId is required");
            this.responseParameters = responseParameters;
            this.responseTemplates = responseTemplates;
            this.statusCode = statusCode;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getResponseType() {
            return this.responseType;
        }

        @Override
        public final java.lang.String getRestApiId() {
            return this.restApiId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getResponseParameters() {
            return this.responseParameters;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getResponseTemplates() {
            return this.responseTemplates;
        }

        @Override
        public final java.lang.String getStatusCode() {
            return this.statusCode;
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

            data.set("responseType", om.valueToTree(this.getResponseType()));
            data.set("restApiId", om.valueToTree(this.getRestApiId()));
            if (this.getResponseParameters() != null) {
                data.set("responseParameters", om.valueToTree(this.getResponseParameters()));
            }
            if (this.getResponseTemplates() != null) {
                data.set("responseTemplates", om.valueToTree(this.getResponseTemplates()));
            }
            if (this.getStatusCode() != null) {
                data.set("statusCode", om.valueToTree(this.getStatusCode()));
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
            struct.set("fqn", om.valueToTree("aws.ApiGatewayGatewayResponseConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayGatewayResponseConfig.Jsii$Proxy that = (ApiGatewayGatewayResponseConfig.Jsii$Proxy) o;

            if (!responseType.equals(that.responseType)) return false;
            if (!restApiId.equals(that.restApiId)) return false;
            if (this.responseParameters != null ? !this.responseParameters.equals(that.responseParameters) : that.responseParameters != null) return false;
            if (this.responseTemplates != null ? !this.responseTemplates.equals(that.responseTemplates) : that.responseTemplates != null) return false;
            if (this.statusCode != null ? !this.statusCode.equals(that.statusCode) : that.statusCode != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.responseType.hashCode();
            result = 31 * result + (this.restApiId.hashCode());
            result = 31 * result + (this.responseParameters != null ? this.responseParameters.hashCode() : 0);
            result = 31 * result + (this.responseTemplates != null ? this.responseTemplates.hashCode() : 0);
            result = 31 * result + (this.statusCode != null ? this.statusCode.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
