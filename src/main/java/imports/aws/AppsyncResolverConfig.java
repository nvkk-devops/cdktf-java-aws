package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.055Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncResolverConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncResolverConfig.Jsii$Proxy.class)
public interface AppsyncResolverConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApiId();

    @org.jetbrains.annotations.NotNull java.lang.String getField();

    @org.jetbrains.annotations.NotNull java.lang.String getRequestTemplate();

    @org.jetbrains.annotations.NotNull java.lang.String getResponseTemplate();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * caching_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncResolverCachingConfig> getCachingConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDataSource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * pipeline_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncResolverPipelineConfig> getPipelineConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncResolverConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncResolverConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncResolverConfig> {
        private java.lang.String apiId;
        private java.lang.String field;
        private java.lang.String requestTemplate;
        private java.lang.String responseTemplate;
        private java.lang.String type;
        private java.util.List<imports.aws.AppsyncResolverCachingConfig> cachingConfig;
        private java.lang.String dataSource;
        private java.lang.String kind;
        private java.util.List<imports.aws.AppsyncResolverPipelineConfig> pipelineConfig;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AppsyncResolverConfig#getApiId}
         * @param apiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder apiId(java.lang.String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getField}
         * @param field the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getRequestTemplate}
         * @param requestTemplate the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder requestTemplate(java.lang.String requestTemplate) {
            this.requestTemplate = requestTemplate;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getResponseTemplate}
         * @param responseTemplate the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder responseTemplate(java.lang.String responseTemplate) {
            this.responseTemplate = responseTemplate;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getCachingConfig}
         * @param cachingConfig caching_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cachingConfig(java.util.List<? extends imports.aws.AppsyncResolverCachingConfig> cachingConfig) {
            this.cachingConfig = (java.util.List<imports.aws.AppsyncResolverCachingConfig>)cachingConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getDataSource}
         * @param dataSource the value to be set.
         * @return {@code this}
         */
        public Builder dataSource(java.lang.String dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getKind}
         * @param kind the value to be set.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getPipelineConfig}
         * @param pipelineConfig pipeline_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder pipelineConfig(java.util.List<? extends imports.aws.AppsyncResolverPipelineConfig> pipelineConfig) {
            this.pipelineConfig = (java.util.List<imports.aws.AppsyncResolverPipelineConfig>)pipelineConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getDependsOn}
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
         * Sets the value of {@link AppsyncResolverConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncResolverConfig#getProvider}
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
         * @return a new instance of {@link AppsyncResolverConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncResolverConfig build() {
            return new Jsii$Proxy(apiId, field, requestTemplate, responseTemplate, type, cachingConfig, dataSource, kind, pipelineConfig, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AppsyncResolverConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncResolverConfig {
        private final java.lang.String apiId;
        private final java.lang.String field;
        private final java.lang.String requestTemplate;
        private final java.lang.String responseTemplate;
        private final java.lang.String type;
        private final java.util.List<imports.aws.AppsyncResolverCachingConfig> cachingConfig;
        private final java.lang.String dataSource;
        private final java.lang.String kind;
        private final java.util.List<imports.aws.AppsyncResolverPipelineConfig> pipelineConfig;
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
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requestTemplate = software.amazon.jsii.Kernel.get(this, "requestTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.responseTemplate = software.amazon.jsii.Kernel.get(this, "responseTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cachingConfig = software.amazon.jsii.Kernel.get(this, "cachingConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncResolverCachingConfig.class)));
            this.dataSource = software.amazon.jsii.Kernel.get(this, "dataSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pipelineConfig = software.amazon.jsii.Kernel.get(this, "pipelineConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncResolverPipelineConfig.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String apiId, final java.lang.String field, final java.lang.String requestTemplate, final java.lang.String responseTemplate, final java.lang.String type, final java.util.List<? extends imports.aws.AppsyncResolverCachingConfig> cachingConfig, final java.lang.String dataSource, final java.lang.String kind, final java.util.List<? extends imports.aws.AppsyncResolverPipelineConfig> pipelineConfig, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiId = java.util.Objects.requireNonNull(apiId, "apiId is required");
            this.field = java.util.Objects.requireNonNull(field, "field is required");
            this.requestTemplate = java.util.Objects.requireNonNull(requestTemplate, "requestTemplate is required");
            this.responseTemplate = java.util.Objects.requireNonNull(responseTemplate, "responseTemplate is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.cachingConfig = (java.util.List<imports.aws.AppsyncResolverCachingConfig>)cachingConfig;
            this.dataSource = dataSource;
            this.kind = kind;
            this.pipelineConfig = (java.util.List<imports.aws.AppsyncResolverPipelineConfig>)pipelineConfig;
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
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final java.lang.String getRequestTemplate() {
            return this.requestTemplate;
        }

        @Override
        public final java.lang.String getResponseTemplate() {
            return this.responseTemplate;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncResolverCachingConfig> getCachingConfig() {
            return this.cachingConfig;
        }

        @Override
        public final java.lang.String getDataSource() {
            return this.dataSource;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncResolverPipelineConfig> getPipelineConfig() {
            return this.pipelineConfig;
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
            data.set("field", om.valueToTree(this.getField()));
            data.set("requestTemplate", om.valueToTree(this.getRequestTemplate()));
            data.set("responseTemplate", om.valueToTree(this.getResponseTemplate()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getCachingConfig() != null) {
                data.set("cachingConfig", om.valueToTree(this.getCachingConfig()));
            }
            if (this.getDataSource() != null) {
                data.set("dataSource", om.valueToTree(this.getDataSource()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getPipelineConfig() != null) {
                data.set("pipelineConfig", om.valueToTree(this.getPipelineConfig()));
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
            struct.set("fqn", om.valueToTree("aws.AppsyncResolverConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncResolverConfig.Jsii$Proxy that = (AppsyncResolverConfig.Jsii$Proxy) o;

            if (!apiId.equals(that.apiId)) return false;
            if (!field.equals(that.field)) return false;
            if (!requestTemplate.equals(that.requestTemplate)) return false;
            if (!responseTemplate.equals(that.responseTemplate)) return false;
            if (!type.equals(that.type)) return false;
            if (this.cachingConfig != null ? !this.cachingConfig.equals(that.cachingConfig) : that.cachingConfig != null) return false;
            if (this.dataSource != null ? !this.dataSource.equals(that.dataSource) : that.dataSource != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            if (this.pipelineConfig != null ? !this.pipelineConfig.equals(that.pipelineConfig) : that.pipelineConfig != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiId.hashCode();
            result = 31 * result + (this.field.hashCode());
            result = 31 * result + (this.requestTemplate.hashCode());
            result = 31 * result + (this.responseTemplate.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.cachingConfig != null ? this.cachingConfig.hashCode() : 0);
            result = 31 * result + (this.dataSource != null ? this.dataSource.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.pipelineConfig != null ? this.pipelineConfig.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
