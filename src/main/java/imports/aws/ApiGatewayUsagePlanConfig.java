package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.996Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayUsagePlanConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayUsagePlanConfig.Jsii$Proxy.class)
public interface ApiGatewayUsagePlanConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * api_stages block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayUsagePlanApiStages> getApiStages() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getProductCode() {
        return null;
    }

    /**
     * quota_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings> getQuotaSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * throttle_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings> getThrottleSettings() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayUsagePlanConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayUsagePlanConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayUsagePlanConfig> {
        private java.lang.String name;
        private java.util.List<imports.aws.ApiGatewayUsagePlanApiStages> apiStages;
        private java.lang.String description;
        private java.lang.String productCode;
        private java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings> quotaSettings;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings> throttleSettings;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getApiStages}
         * @param apiStages api_stages block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder apiStages(java.util.List<? extends imports.aws.ApiGatewayUsagePlanApiStages> apiStages) {
            this.apiStages = (java.util.List<imports.aws.ApiGatewayUsagePlanApiStages>)apiStages;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getProductCode}
         * @param productCode the value to be set.
         * @return {@code this}
         */
        public Builder productCode(java.lang.String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getQuotaSettings}
         * @param quotaSettings quota_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder quotaSettings(java.util.List<? extends imports.aws.ApiGatewayUsagePlanQuotaSettings> quotaSettings) {
            this.quotaSettings = (java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings>)quotaSettings;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getThrottleSettings}
         * @param throttleSettings throttle_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder throttleSettings(java.util.List<? extends imports.aws.ApiGatewayUsagePlanThrottleSettings> throttleSettings) {
            this.throttleSettings = (java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings>)throttleSettings;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getDependsOn}
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
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayUsagePlanConfig#getProvider}
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
         * @return a new instance of {@link ApiGatewayUsagePlanConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayUsagePlanConfig build() {
            return new Jsii$Proxy(name, apiStages, description, productCode, quotaSettings, tags, throttleSettings, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayUsagePlanConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayUsagePlanConfig {
        private final java.lang.String name;
        private final java.util.List<imports.aws.ApiGatewayUsagePlanApiStages> apiStages;
        private final java.lang.String description;
        private final java.lang.String productCode;
        private final java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings> quotaSettings;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings> throttleSettings;
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
            this.apiStages = software.amazon.jsii.Kernel.get(this, "apiStages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanApiStages.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.productCode = software.amazon.jsii.Kernel.get(this, "productCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.quotaSettings = software.amazon.jsii.Kernel.get(this, "quotaSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanQuotaSettings.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.throttleSettings = software.amazon.jsii.Kernel.get(this, "throttleSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayUsagePlanThrottleSettings.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.ApiGatewayUsagePlanApiStages> apiStages, final java.lang.String description, final java.lang.String productCode, final java.util.List<? extends imports.aws.ApiGatewayUsagePlanQuotaSettings> quotaSettings, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.ApiGatewayUsagePlanThrottleSettings> throttleSettings, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.apiStages = (java.util.List<imports.aws.ApiGatewayUsagePlanApiStages>)apiStages;
            this.description = description;
            this.productCode = productCode;
            this.quotaSettings = (java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings>)quotaSettings;
            this.tags = tags;
            this.throttleSettings = (java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings>)throttleSettings;
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
        public final java.util.List<imports.aws.ApiGatewayUsagePlanApiStages> getApiStages() {
            return this.apiStages;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getProductCode() {
            return this.productCode;
        }

        @Override
        public final java.util.List<imports.aws.ApiGatewayUsagePlanQuotaSettings> getQuotaSettings() {
            return this.quotaSettings;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.ApiGatewayUsagePlanThrottleSettings> getThrottleSettings() {
            return this.throttleSettings;
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
            if (this.getApiStages() != null) {
                data.set("apiStages", om.valueToTree(this.getApiStages()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getProductCode() != null) {
                data.set("productCode", om.valueToTree(this.getProductCode()));
            }
            if (this.getQuotaSettings() != null) {
                data.set("quotaSettings", om.valueToTree(this.getQuotaSettings()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getThrottleSettings() != null) {
                data.set("throttleSettings", om.valueToTree(this.getThrottleSettings()));
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
            struct.set("fqn", om.valueToTree("aws.ApiGatewayUsagePlanConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayUsagePlanConfig.Jsii$Proxy that = (ApiGatewayUsagePlanConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.apiStages != null ? !this.apiStages.equals(that.apiStages) : that.apiStages != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.productCode != null ? !this.productCode.equals(that.productCode) : that.productCode != null) return false;
            if (this.quotaSettings != null ? !this.quotaSettings.equals(that.quotaSettings) : that.quotaSettings != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.throttleSettings != null ? !this.throttleSettings.equals(that.throttleSettings) : that.throttleSettings != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.apiStages != null ? this.apiStages.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.productCode != null ? this.productCode.hashCode() : 0);
            result = 31 * result + (this.quotaSettings != null ? this.quotaSettings.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.throttleSettings != null ? this.throttleSettings.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
