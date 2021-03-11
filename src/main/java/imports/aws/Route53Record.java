package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.814Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Route53Record")
public class Route53Record extends com.hashicorp.cdktf.TerraformResource {

    protected Route53Record(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Route53Record(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Route53Record(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Route53RecordConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAlias() {
        software.amazon.jsii.Kernel.call(this, "resetAlias", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowOverwrite() {
        software.amazon.jsii.Kernel.call(this, "resetAllowOverwrite", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFailoverRoutingPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetFailoverRoutingPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGeolocationRoutingPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetGeolocationRoutingPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckId() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLatencyRoutingPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetLatencyRoutingPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMultivalueAnswerRoutingPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetMultivalueAnswerRoutingPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRecords() {
        software.amazon.jsii.Kernel.call(this, "resetRecords", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSetIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetSetIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTtl() {
        software.amazon.jsii.Kernel.call(this, "resetTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWeightedRoutingPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetWeightedRoutingPolicy", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFqdn() {
        return software.amazon.jsii.Kernel.get(this, "fqdn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneIdInput() {
        return software.amazon.jsii.Kernel.get(this, "zoneIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordAlias> getAliasInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Route53RecordAlias>)(software.amazon.jsii.Kernel.get(this, "aliasInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordAlias.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowOverwriteInput() {
        return software.amazon.jsii.Kernel.get(this, "allowOverwriteInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy> getFailoverRoutingPolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy>)(software.amazon.jsii.Kernel.get(this, "failoverRoutingPolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordFailoverRoutingPolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy> getGeolocationRoutingPolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy>)(software.amazon.jsii.Kernel.get(this, "geolocationRoutingPolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordGeolocationRoutingPolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckIdInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy> getLatencyRoutingPolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy>)(software.amazon.jsii.Kernel.get(this, "latencyRoutingPolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordLatencyRoutingPolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getMultivalueAnswerRoutingPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "multivalueAnswerRoutingPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRecordsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "recordsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSetIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "setIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "ttlInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy> getWeightedRoutingPolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy>)(software.amazon.jsii.Kernel.get(this, "weightedRoutingPolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordWeightedRoutingPolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordAlias> getAlias() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordAlias.class))));
    }

    public void setAlias(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordAlias> value) {
        software.amazon.jsii.Kernel.set(this, "alias", java.util.Objects.requireNonNull(value, "alias is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllowOverwrite() {
        return software.amazon.jsii.Kernel.get(this, "allowOverwrite", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllowOverwrite(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowOverwrite", java.util.Objects.requireNonNull(value, "allowOverwrite is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy> getFailoverRoutingPolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "failoverRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordFailoverRoutingPolicy.class))));
    }

    public void setFailoverRoutingPolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy> value) {
        software.amazon.jsii.Kernel.set(this, "failoverRoutingPolicy", java.util.Objects.requireNonNull(value, "failoverRoutingPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy> getGeolocationRoutingPolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "geolocationRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordGeolocationRoutingPolicy.class))));
    }

    public void setGeolocationRoutingPolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy> value) {
        software.amazon.jsii.Kernel.set(this, "geolocationRoutingPolicy", java.util.Objects.requireNonNull(value, "geolocationRoutingPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthCheckId() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthCheckId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckId", java.util.Objects.requireNonNull(value, "healthCheckId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy> getLatencyRoutingPolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "latencyRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordLatencyRoutingPolicy.class))));
    }

    public void setLatencyRoutingPolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy> value) {
        software.amazon.jsii.Kernel.set(this, "latencyRoutingPolicy", java.util.Objects.requireNonNull(value, "latencyRoutingPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getMultivalueAnswerRoutingPolicy() {
        return software.amazon.jsii.Kernel.get(this, "multivalueAnswerRoutingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setMultivalueAnswerRoutingPolicy(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "multivalueAnswerRoutingPolicy", java.util.Objects.requireNonNull(value, "multivalueAnswerRoutingPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRecords() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "records", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRecords(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "records", java.util.Objects.requireNonNull(value, "records is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSetIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "setIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSetIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "setIdentifier", java.util.Objects.requireNonNull(value, "setIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTtl() {
        return software.amazon.jsii.Kernel.get(this, "ttl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTtl(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ttl", java.util.Objects.requireNonNull(value, "ttl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy> getWeightedRoutingPolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "weightedRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordWeightedRoutingPolicy.class))));
    }

    public void setWeightedRoutingPolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy> value) {
        software.amazon.jsii.Kernel.set(this, "weightedRoutingPolicy", java.util.Objects.requireNonNull(value, "weightedRoutingPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneId() {
        return software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setZoneId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "zoneId", java.util.Objects.requireNonNull(value, "zoneId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Route53Record}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Route53Record> {
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
        private final imports.aws.Route53RecordConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Route53RecordConfig.Builder();
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
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @return {@code this}
         * @param zoneId This parameter is required.
         */
        public Builder zoneId(final java.lang.String zoneId) {
            this.config.zoneId(zoneId);
            return this;
        }

        /**
         * alias block.
         * <p>
         * @return {@code this}
         * @param alias alias block. This parameter is required.
         */
        public Builder alias(final java.util.List<? extends imports.aws.Route53RecordAlias> alias) {
            this.config.alias(alias);
            return this;
        }

        /**
         * @return {@code this}
         * @param allowOverwrite This parameter is required.
         */
        public Builder allowOverwrite(final java.lang.Boolean allowOverwrite) {
            this.config.allowOverwrite(allowOverwrite);
            return this;
        }

        /**
         * failover_routing_policy block.
         * <p>
         * @return {@code this}
         * @param failoverRoutingPolicy failover_routing_policy block. This parameter is required.
         */
        public Builder failoverRoutingPolicy(final java.util.List<? extends imports.aws.Route53RecordFailoverRoutingPolicy> failoverRoutingPolicy) {
            this.config.failoverRoutingPolicy(failoverRoutingPolicy);
            return this;
        }

        /**
         * geolocation_routing_policy block.
         * <p>
         * @return {@code this}
         * @param geolocationRoutingPolicy geolocation_routing_policy block. This parameter is required.
         */
        public Builder geolocationRoutingPolicy(final java.util.List<? extends imports.aws.Route53RecordGeolocationRoutingPolicy> geolocationRoutingPolicy) {
            this.config.geolocationRoutingPolicy(geolocationRoutingPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param healthCheckId This parameter is required.
         */
        public Builder healthCheckId(final java.lang.String healthCheckId) {
            this.config.healthCheckId(healthCheckId);
            return this;
        }

        /**
         * latency_routing_policy block.
         * <p>
         * @return {@code this}
         * @param latencyRoutingPolicy latency_routing_policy block. This parameter is required.
         */
        public Builder latencyRoutingPolicy(final java.util.List<? extends imports.aws.Route53RecordLatencyRoutingPolicy> latencyRoutingPolicy) {
            this.config.latencyRoutingPolicy(latencyRoutingPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param multivalueAnswerRoutingPolicy This parameter is required.
         */
        public Builder multivalueAnswerRoutingPolicy(final java.lang.Boolean multivalueAnswerRoutingPolicy) {
            this.config.multivalueAnswerRoutingPolicy(multivalueAnswerRoutingPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param records This parameter is required.
         */
        public Builder records(final java.util.List<java.lang.String> records) {
            this.config.records(records);
            return this;
        }

        /**
         * @return {@code this}
         * @param setIdentifier This parameter is required.
         */
        public Builder setIdentifier(final java.lang.String setIdentifier) {
            this.config.setIdentifier(setIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param ttl This parameter is required.
         */
        public Builder ttl(final java.lang.Number ttl) {
            this.config.ttl(ttl);
            return this;
        }

        /**
         * weighted_routing_policy block.
         * <p>
         * @return {@code this}
         * @param weightedRoutingPolicy weighted_routing_policy block. This parameter is required.
         */
        public Builder weightedRoutingPolicy(final java.util.List<? extends imports.aws.Route53RecordWeightedRoutingPolicy> weightedRoutingPolicy) {
            this.config.weightedRoutingPolicy(weightedRoutingPolicy);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Route53Record}.
         */
        @Override
        public imports.aws.Route53Record build() {
            return new imports.aws.Route53Record(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
