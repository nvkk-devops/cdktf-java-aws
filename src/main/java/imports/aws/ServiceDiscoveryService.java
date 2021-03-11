package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.857Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ServiceDiscoveryService")
public class ServiceDiscoveryService extends com.hashicorp.cdktf.TerraformResource {

    protected ServiceDiscoveryService(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServiceDiscoveryService(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ServiceDiscoveryService(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ServiceDiscoveryServiceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDnsConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDnsConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckConfig() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckCustomConfig() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckCustomConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamespaceId() {
        software.amazon.jsii.Kernel.call(this, "resetNamespaceId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig> getDnsConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig>)(software.amazon.jsii.Kernel.get(this, "dnsConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceDnsConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig> getHealthCheckConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig>)(software.amazon.jsii.Kernel.get(this, "healthCheckConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceHealthCheckConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> getHealthCheckCustomConfigInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig>)(software.amazon.jsii.Kernel.get(this, "healthCheckCustomConfigInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamespaceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "namespaceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig> getDnsConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dnsConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceDnsConfig.class))));
    }

    public void setDnsConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ServiceDiscoveryServiceDnsConfig> value) {
        software.amazon.jsii.Kernel.set(this, "dnsConfig", java.util.Objects.requireNonNull(value, "dnsConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig> getHealthCheckConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "healthCheckConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceHealthCheckConfig.class))));
    }

    public void setHealthCheckConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckConfig> value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckConfig", java.util.Objects.requireNonNull(value, "healthCheckConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> getHealthCheckCustomConfig() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "healthCheckCustomConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig.class))));
    }

    public void setHealthCheckCustomConfig(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckCustomConfig", java.util.Objects.requireNonNull(value, "healthCheckCustomConfig is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamespaceId() {
        return software.amazon.jsii.Kernel.get(this, "namespaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamespaceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namespaceId", java.util.Objects.requireNonNull(value, "namespaceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ServiceDiscoveryService}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ServiceDiscoveryService> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.ServiceDiscoveryServiceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ServiceDiscoveryServiceConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * dns_config block.
         * <p>
         * @return {@code this}
         * @param dnsConfig dns_config block. This parameter is required.
         */
        public Builder dnsConfig(final java.util.List<? extends imports.aws.ServiceDiscoveryServiceDnsConfig> dnsConfig) {
            this.config.dnsConfig(dnsConfig);
            return this;
        }

        /**
         * health_check_config block.
         * <p>
         * @return {@code this}
         * @param healthCheckConfig health_check_config block. This parameter is required.
         */
        public Builder healthCheckConfig(final java.util.List<? extends imports.aws.ServiceDiscoveryServiceHealthCheckConfig> healthCheckConfig) {
            this.config.healthCheckConfig(healthCheckConfig);
            return this;
        }

        /**
         * health_check_custom_config block.
         * <p>
         * @return {@code this}
         * @param healthCheckCustomConfig health_check_custom_config block. This parameter is required.
         */
        public Builder healthCheckCustomConfig(final java.util.List<? extends imports.aws.ServiceDiscoveryServiceHealthCheckCustomConfig> healthCheckCustomConfig) {
            this.config.healthCheckCustomConfig(healthCheckCustomConfig);
            return this;
        }

        /**
         * @return {@code this}
         * @param namespaceId This parameter is required.
         */
        public Builder namespaceId(final java.lang.String namespaceId) {
            this.config.namespaceId(namespaceId);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ServiceDiscoveryService}.
         */
        @Override
        public imports.aws.ServiceDiscoveryService build() {
            return new imports.aws.ServiceDiscoveryService(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
