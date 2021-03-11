package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.857Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ServiceDiscoveryServiceConfig")
@software.amazon.jsii.Jsii.Proxy(ServiceDiscoveryServiceConfig.Jsii$Proxy.class)
public interface ServiceDiscoveryServiceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * dns_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig> getDnsConfig() {
        return null;
    }

    /**
     * health_check_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig> getHealthCheckConfig() {
        return null;
    }

    /**
     * health_check_custom_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> getHealthCheckCustomConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamespaceId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceDiscoveryServiceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceDiscoveryServiceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceDiscoveryServiceConfig> {
        private java.lang.String name;
        private java.lang.String description;
        private java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig> dnsConfig;
        private java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig> healthCheckConfig;
        private java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> healthCheckCustomConfig;
        private java.lang.String namespaceId;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getDnsConfig}
         * @param dnsConfig dns_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dnsConfig(java.util.List<? extends imports.aws.ServiceDiscoveryServiceDnsConfig> dnsConfig) {
            this.dnsConfig = (java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig>)dnsConfig;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getHealthCheckConfig}
         * @param healthCheckConfig health_check_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder healthCheckConfig(java.util.List<? extends imports.aws.ServiceDiscoveryServiceHealthCheckConfig> healthCheckConfig) {
            this.healthCheckConfig = (java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig>)healthCheckConfig;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getHealthCheckCustomConfig}
         * @param healthCheckCustomConfig health_check_custom_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder healthCheckCustomConfig(java.util.List<? extends imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> healthCheckCustomConfig) {
            this.healthCheckCustomConfig = (java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig>)healthCheckCustomConfig;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getNamespaceId}
         * @param namespaceId the value to be set.
         * @return {@code this}
         */
        public Builder namespaceId(java.lang.String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getDependsOn}
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
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceConfig#getProvider}
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
         * @return a new instance of {@link ServiceDiscoveryServiceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceDiscoveryServiceConfig build() {
            return new Jsii$Proxy(name, description, dnsConfig, healthCheckConfig, healthCheckCustomConfig, namespaceId, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ServiceDiscoveryServiceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceDiscoveryServiceConfig {
        private final java.lang.String name;
        private final java.lang.String description;
        private final java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig> dnsConfig;
        private final java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig> healthCheckConfig;
        private final java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> healthCheckCustomConfig;
        private final java.lang.String namespaceId;
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
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dnsConfig = software.amazon.jsii.Kernel.get(this, "dnsConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceDnsConfig.class)));
            this.healthCheckConfig = software.amazon.jsii.Kernel.get(this, "healthCheckConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceHealthCheckConfig.class)));
            this.healthCheckCustomConfig = software.amazon.jsii.Kernel.get(this, "healthCheckCustomConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig.class)));
            this.namespaceId = software.amazon.jsii.Kernel.get(this, "namespaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String description, final java.util.List<? extends imports.aws.ServiceDiscoveryServiceDnsConfig> dnsConfig, final java.util.List<? extends imports.aws.ServiceDiscoveryServiceHealthCheckConfig> healthCheckConfig, final java.util.List<? extends imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> healthCheckCustomConfig, final java.lang.String namespaceId, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.description = description;
            this.dnsConfig = (java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig>)dnsConfig;
            this.healthCheckConfig = (java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig>)healthCheckConfig;
            this.healthCheckCustomConfig = (java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig>)healthCheckCustomConfig;
            this.namespaceId = namespaceId;
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
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig> getDnsConfig() {
            return this.dnsConfig;
        }

        @Override
        public final java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig> getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        @Override
        public final java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> getHealthCheckCustomConfig() {
            return this.healthCheckCustomConfig;
        }

        @Override
        public final java.lang.String getNamespaceId() {
            return this.namespaceId;
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
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDnsConfig() != null) {
                data.set("dnsConfig", om.valueToTree(this.getDnsConfig()));
            }
            if (this.getHealthCheckConfig() != null) {
                data.set("healthCheckConfig", om.valueToTree(this.getHealthCheckConfig()));
            }
            if (this.getHealthCheckCustomConfig() != null) {
                data.set("healthCheckCustomConfig", om.valueToTree(this.getHealthCheckCustomConfig()));
            }
            if (this.getNamespaceId() != null) {
                data.set("namespaceId", om.valueToTree(this.getNamespaceId()));
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
            struct.set("fqn", om.valueToTree("aws.ServiceDiscoveryServiceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceDiscoveryServiceConfig.Jsii$Proxy that = (ServiceDiscoveryServiceConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dnsConfig != null ? !this.dnsConfig.equals(that.dnsConfig) : that.dnsConfig != null) return false;
            if (this.healthCheckConfig != null ? !this.healthCheckConfig.equals(that.healthCheckConfig) : that.healthCheckConfig != null) return false;
            if (this.healthCheckCustomConfig != null ? !this.healthCheckCustomConfig.equals(that.healthCheckCustomConfig) : that.healthCheckCustomConfig != null) return false;
            if (this.namespaceId != null ? !this.namespaceId.equals(that.namespaceId) : that.namespaceId != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dnsConfig != null ? this.dnsConfig.hashCode() : 0);
            result = 31 * result + (this.healthCheckConfig != null ? this.healthCheckConfig.hashCode() : 0);
            result = 31 * result + (this.healthCheckCustomConfig != null ? this.healthCheckCustomConfig.hashCode() : 0);
            result = 31 * result + (this.namespaceId != null ? this.namespaceId.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
