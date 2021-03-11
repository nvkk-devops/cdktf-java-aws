package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.042Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncDatasourceConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncDatasourceConfig.Jsii$Proxy.class)
public interface AppsyncDatasourceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * dynamodb_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig> getDynamodbConfig() {
        return null;
    }

    /**
     * elasticsearch_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig> getElasticsearchConfig() {
        return null;
    }

    /**
     * http_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceHttpConfig> getHttpConfig() {
        return null;
    }

    /**
     * lambda_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncDatasourceLambdaConfig> getLambdaConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceRoleArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncDatasourceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncDatasourceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncDatasourceConfig> {
        private java.lang.String apiId;
        private java.lang.String name;
        private java.lang.String type;
        private java.lang.String description;
        private java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig> dynamodbConfig;
        private java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig> elasticsearchConfig;
        private java.util.List<imports.aws.AppsyncDatasourceHttpConfig> httpConfig;
        private java.util.List<imports.aws.AppsyncDatasourceLambdaConfig> lambdaConfig;
        private java.lang.String serviceRoleArn;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getDynamodbConfig}
         * @param dynamodbConfig dynamodb_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dynamodbConfig(java.util.List<? extends imports.aws.AppsyncDatasourceDynamodbConfig> dynamodbConfig) {
            this.dynamodbConfig = (java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig>)dynamodbConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getElasticsearchConfig}
         * @param elasticsearchConfig elasticsearch_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elasticsearchConfig(java.util.List<? extends imports.aws.AppsyncDatasourceElasticsearchConfig> elasticsearchConfig) {
            this.elasticsearchConfig = (java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig>)elasticsearchConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getHttpConfig}
         * @param httpConfig http_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder httpConfig(java.util.List<? extends imports.aws.AppsyncDatasourceHttpConfig> httpConfig) {
            this.httpConfig = (java.util.List<imports.aws.AppsyncDatasourceHttpConfig>)httpConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getLambdaConfig}
         * @param lambdaConfig lambda_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambdaConfig(java.util.List<? extends imports.aws.AppsyncDatasourceLambdaConfig> lambdaConfig) {
            this.lambdaConfig = (java.util.List<imports.aws.AppsyncDatasourceLambdaConfig>)lambdaConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getServiceRoleArn}
         * @param serviceRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder serviceRoleArn(java.lang.String serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getDependsOn}
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
         * Sets the value of {@link AppsyncDatasourceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncDatasourceConfig#getProvider}
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
         * @return a new instance of {@link AppsyncDatasourceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncDatasourceConfig build() {
            return new Jsii$Proxy(apiId, name, type, description, dynamodbConfig, elasticsearchConfig, httpConfig, lambdaConfig, serviceRoleArn, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AppsyncDatasourceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncDatasourceConfig {
        private final java.lang.String apiId;
        private final java.lang.String name;
        private final java.lang.String type;
        private final java.lang.String description;
        private final java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig> dynamodbConfig;
        private final java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig> elasticsearchConfig;
        private final java.util.List<imports.aws.AppsyncDatasourceHttpConfig> httpConfig;
        private final java.util.List<imports.aws.AppsyncDatasourceLambdaConfig> lambdaConfig;
        private final java.lang.String serviceRoleArn;
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
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dynamodbConfig = software.amazon.jsii.Kernel.get(this, "dynamodbConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceDynamodbConfig.class)));
            this.elasticsearchConfig = software.amazon.jsii.Kernel.get(this, "elasticsearchConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceElasticsearchConfig.class)));
            this.httpConfig = software.amazon.jsii.Kernel.get(this, "httpConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceHttpConfig.class)));
            this.lambdaConfig = software.amazon.jsii.Kernel.get(this, "lambdaConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncDatasourceLambdaConfig.class)));
            this.serviceRoleArn = software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String name, final java.lang.String type, final java.lang.String description, final java.util.List<? extends imports.aws.AppsyncDatasourceDynamodbConfig> dynamodbConfig, final java.util.List<? extends imports.aws.AppsyncDatasourceElasticsearchConfig> elasticsearchConfig, final java.util.List<? extends imports.aws.AppsyncDatasourceHttpConfig> httpConfig, final java.util.List<? extends imports.aws.AppsyncDatasourceLambdaConfig> lambdaConfig, final java.lang.String serviceRoleArn, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.description = description;
            this.dynamodbConfig = (java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig>)dynamodbConfig;
            this.elasticsearchConfig = (java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig>)elasticsearchConfig;
            this.httpConfig = (java.util.List<imports.aws.AppsyncDatasourceHttpConfig>)httpConfig;
            this.lambdaConfig = (java.util.List<imports.aws.AppsyncDatasourceLambdaConfig>)lambdaConfig;
            this.serviceRoleArn = serviceRoleArn;
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
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncDatasourceDynamodbConfig> getDynamodbConfig() {
            return this.dynamodbConfig;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncDatasourceElasticsearchConfig> getElasticsearchConfig() {
            return this.elasticsearchConfig;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncDatasourceHttpConfig> getHttpConfig() {
            return this.httpConfig;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncDatasourceLambdaConfig> getLambdaConfig() {
            return this.lambdaConfig;
        }

        @Override
        public final java.lang.String getServiceRoleArn() {
            return this.serviceRoleArn;
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
            data.set("type", om.valueToTree(this.getType()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDynamodbConfig() != null) {
                data.set("dynamodbConfig", om.valueToTree(this.getDynamodbConfig()));
            }
            if (this.getElasticsearchConfig() != null) {
                data.set("elasticsearchConfig", om.valueToTree(this.getElasticsearchConfig()));
            }
            if (this.getHttpConfig() != null) {
                data.set("httpConfig", om.valueToTree(this.getHttpConfig()));
            }
            if (this.getLambdaConfig() != null) {
                data.set("lambdaConfig", om.valueToTree(this.getLambdaConfig()));
            }
            if (this.getServiceRoleArn() != null) {
                data.set("serviceRoleArn", om.valueToTree(this.getServiceRoleArn()));
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
            struct.set("fqn", om.valueToTree("aws.AppsyncDatasourceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncDatasourceConfig.Jsii$Proxy that = (AppsyncDatasourceConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!name.equals(that.name)) return false;
            if (!type.equals(that.type)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dynamodbConfig != null ? !this.dynamodbConfig.equals(that.dynamodbConfig) : that.dynamodbConfig != null) return false;
            if (this.elasticsearchConfig != null ? !this.elasticsearchConfig.equals(that.elasticsearchConfig) : that.elasticsearchConfig != null) return false;
            if (this.httpConfig != null ? !this.httpConfig.equals(that.httpConfig) : that.httpConfig != null) return false;
            if (this.lambdaConfig != null ? !this.lambdaConfig.equals(that.lambdaConfig) : that.lambdaConfig != null) return false;
            if (this.serviceRoleArn != null ? !this.serviceRoleArn.equals(that.serviceRoleArn) : that.serviceRoleArn != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dynamodbConfig != null ? this.dynamodbConfig.hashCode() : 0);
            result = 31 * result + (this.elasticsearchConfig != null ? this.elasticsearchConfig.hashCode() : 0);
            result = 31 * result + (this.httpConfig != null ? this.httpConfig.hashCode() : 0);
            result = 31 * result + (this.lambdaConfig != null ? this.lambdaConfig.hashCode() : 0);
            result = 31 * result + (this.serviceRoleArn != null ? this.serviceRoleArn.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
