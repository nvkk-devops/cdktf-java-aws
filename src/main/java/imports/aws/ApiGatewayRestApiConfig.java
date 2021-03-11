package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.992Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayRestApiConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayRestApiConfig.Jsii$Proxy.class)
public interface ApiGatewayRestApiConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getApiKeySource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBinaryMediaTypes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBody() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * endpoint_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayRestApiEndpointConfiguration> getEndpointConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinimumCompressionSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayRestApiConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayRestApiConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayRestApiConfig> {
        private java.lang.String name;
        private java.lang.String apiKeySource;
        private java.util.List<java.lang.String> binaryMediaTypes;
        private java.lang.String body;
        private java.lang.String description;
        private java.util.List<imports.aws.ApiGatewayRestApiEndpointConfiguration> endpointConfiguration;
        private java.lang.Number minimumCompressionSize;
        private java.lang.String policy;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getApiKeySource}
         * @param apiKeySource the value to be set.
         * @return {@code this}
         */
        public Builder apiKeySource(java.lang.String apiKeySource) {
            this.apiKeySource = apiKeySource;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getBinaryMediaTypes}
         * @param binaryMediaTypes the value to be set.
         * @return {@code this}
         */
        public Builder binaryMediaTypes(java.util.List<java.lang.String> binaryMediaTypes) {
            this.binaryMediaTypes = binaryMediaTypes;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getBody}
         * @param body the value to be set.
         * @return {@code this}
         */
        public Builder body(java.lang.String body) {
            this.body = body;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getEndpointConfiguration}
         * @param endpointConfiguration endpoint_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder endpointConfiguration(java.util.List<? extends imports.aws.ApiGatewayRestApiEndpointConfiguration> endpointConfiguration) {
            this.endpointConfiguration = (java.util.List<imports.aws.ApiGatewayRestApiEndpointConfiguration>)endpointConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getMinimumCompressionSize}
         * @param minimumCompressionSize the value to be set.
         * @return {@code this}
         */
        public Builder minimumCompressionSize(java.lang.Number minimumCompressionSize) {
            this.minimumCompressionSize = minimumCompressionSize;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getPolicy}
         * @param policy the value to be set.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getDependsOn}
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
         * Sets the value of {@link ApiGatewayRestApiConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiConfig#getProvider}
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
         * @return a new instance of {@link ApiGatewayRestApiConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayRestApiConfig build() {
            return new Jsii$Proxy(name, apiKeySource, binaryMediaTypes, body, description, endpointConfiguration, minimumCompressionSize, policy, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayRestApiConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayRestApiConfig {
        private final java.lang.String name;
        private final java.lang.String apiKeySource;
        private final java.util.List<java.lang.String> binaryMediaTypes;
        private final java.lang.String body;
        private final java.lang.String description;
        private final java.util.List<imports.aws.ApiGatewayRestApiEndpointConfiguration> endpointConfiguration;
        private final java.lang.Number minimumCompressionSize;
        private final java.lang.String policy;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.apiKeySource = software.amazon.jsii.Kernel.get(this, "apiKeySource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.binaryMediaTypes = software.amazon.jsii.Kernel.get(this, "binaryMediaTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.body = software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpointConfiguration = software.amazon.jsii.Kernel.get(this, "endpointConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayRestApiEndpointConfiguration.class)));
            this.minimumCompressionSize = software.amazon.jsii.Kernel.get(this, "minimumCompressionSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String apiKeySource, final java.util.List<java.lang.String> binaryMediaTypes, final java.lang.String body, final java.lang.String description, final java.util.List<? extends imports.aws.ApiGatewayRestApiEndpointConfiguration> endpointConfiguration, final java.lang.Number minimumCompressionSize, final java.lang.String policy, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.apiKeySource = apiKeySource;
            this.binaryMediaTypes = binaryMediaTypes;
            this.body = body;
            this.description = description;
            this.endpointConfiguration = (java.util.List<imports.aws.ApiGatewayRestApiEndpointConfiguration>)endpointConfiguration;
            this.minimumCompressionSize = minimumCompressionSize;
            this.policy = policy;
            this.tags = tags;
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
        public final java.lang.String getApiKeySource() {
            return this.apiKeySource;
        }

        @Override
        public final java.util.List<java.lang.String> getBinaryMediaTypes() {
            return this.binaryMediaTypes;
        }

        @Override
        public final java.lang.String getBody() {
            return this.body;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.ApiGatewayRestApiEndpointConfiguration> getEndpointConfiguration() {
            return this.endpointConfiguration;
        }

        @Override
        public final java.lang.Number getMinimumCompressionSize() {
            return this.minimumCompressionSize;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getApiKeySource() != null) {
                data.set("apiKeySource", om.valueToTree(this.getApiKeySource()));
            }
            if (this.getBinaryMediaTypes() != null) {
                data.set("binaryMediaTypes", om.valueToTree(this.getBinaryMediaTypes()));
            }
            if (this.getBody() != null) {
                data.set("body", om.valueToTree(this.getBody()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEndpointConfiguration() != null) {
                data.set("endpointConfiguration", om.valueToTree(this.getEndpointConfiguration()));
            }
            if (this.getMinimumCompressionSize() != null) {
                data.set("minimumCompressionSize", om.valueToTree(this.getMinimumCompressionSize()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
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
            struct.set("fqn", om.valueToTree("aws.ApiGatewayRestApiConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayRestApiConfig.Jsii$Proxy that = (ApiGatewayRestApiConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.apiKeySource != null ? !this.apiKeySource.equals(that.apiKeySource) : that.apiKeySource != null) return false;
            if (this.binaryMediaTypes != null ? !this.binaryMediaTypes.equals(that.binaryMediaTypes) : that.binaryMediaTypes != null) return false;
            if (this.body != null ? !this.body.equals(that.body) : that.body != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.endpointConfiguration != null ? !this.endpointConfiguration.equals(that.endpointConfiguration) : that.endpointConfiguration != null) return false;
            if (this.minimumCompressionSize != null ? !this.minimumCompressionSize.equals(that.minimumCompressionSize) : that.minimumCompressionSize != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.apiKeySource != null ? this.apiKeySource.hashCode() : 0);
            result = 31 * result + (this.binaryMediaTypes != null ? this.binaryMediaTypes.hashCode() : 0);
            result = 31 * result + (this.body != null ? this.body.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.endpointConfiguration != null ? this.endpointConfiguration.hashCode() : 0);
            result = 31 * result + (this.minimumCompressionSize != null ? this.minimumCompressionSize.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
