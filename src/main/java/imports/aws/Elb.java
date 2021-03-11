package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.559Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Elb")
public class Elb extends com.hashicorp.cdktf.TerraformResource {

    protected Elb(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Elb(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Elb(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ElbConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccessLogs() {
        software.amazon.jsii.Kernel.call(this, "resetAccessLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAvailabilityZones() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZones", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionDraining() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionDraining", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionDrainingTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionDrainingTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCrossZoneLoadBalancing() {
        software.amazon.jsii.Kernel.call(this, "resetCrossZoneLoadBalancing", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheck() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheck", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdleTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetIdleTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstances() {
        software.amazon.jsii.Kernel.call(this, "resetInstances", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInternal() {
        software.amazon.jsii.Kernel.call(this, "resetInternal", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceSecurityGroup() {
        software.amazon.jsii.Kernel.call(this, "resetSourceSecurityGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnets() {
        software.amazon.jsii.Kernel.call(this, "resetSubnets", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbListener> getListenerInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "listenerInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbListener.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceSecurityGroupId() {
        return software.amazon.jsii.Kernel.get(this, "sourceSecurityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneId() {
        return software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElbAccessLogs> getAccessLogsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElbAccessLogs>)(software.amazon.jsii.Kernel.get(this, "accessLogsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbAccessLogs.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAvailabilityZonesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "availabilityZonesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getConnectionDrainingInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionDrainingInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getConnectionDrainingTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionDrainingTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCrossZoneLoadBalancingInput() {
        return software.amazon.jsii.Kernel.get(this, "crossZoneLoadBalancingInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElbHealthCheck> getHealthCheckInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElbHealthCheck>)(software.amazon.jsii.Kernel.get(this, "healthCheckInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbHealthCheck.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIdleTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "idleTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInstancesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "instancesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInternalInput() {
        return software.amazon.jsii.Kernel.get(this, "internalInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceSecurityGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceSecurityGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subnetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbAccessLogs> getAccessLogs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accessLogs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbAccessLogs.class))));
    }

    public void setAccessLogs(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbAccessLogs> value) {
        software.amazon.jsii.Kernel.set(this, "accessLogs", java.util.Objects.requireNonNull(value, "accessLogs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAvailabilityZones() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAvailabilityZones(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZones", java.util.Objects.requireNonNull(value, "availabilityZones is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getConnectionDraining() {
        return software.amazon.jsii.Kernel.get(this, "connectionDraining", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setConnectionDraining(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "connectionDraining", java.util.Objects.requireNonNull(value, "connectionDraining is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getConnectionDrainingTimeout() {
        return software.amazon.jsii.Kernel.get(this, "connectionDrainingTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setConnectionDrainingTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "connectionDrainingTimeout", java.util.Objects.requireNonNull(value, "connectionDrainingTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getCrossZoneLoadBalancing() {
        return software.amazon.jsii.Kernel.get(this, "crossZoneLoadBalancing", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCrossZoneLoadBalancing(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "crossZoneLoadBalancing", java.util.Objects.requireNonNull(value, "crossZoneLoadBalancing is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbHealthCheck> getHealthCheck() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "healthCheck", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbHealthCheck.class))));
    }

    public void setHealthCheck(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbHealthCheck> value) {
        software.amazon.jsii.Kernel.set(this, "healthCheck", java.util.Objects.requireNonNull(value, "healthCheck is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getIdleTimeout() {
        return software.amazon.jsii.Kernel.get(this, "idleTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setIdleTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "idleTimeout", java.util.Objects.requireNonNull(value, "idleTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getInstances() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "instances", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setInstances(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "instances", java.util.Objects.requireNonNull(value, "instances is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getInternal() {
        return software.amazon.jsii.Kernel.get(this, "internal", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setInternal(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "internal", java.util.Objects.requireNonNull(value, "internal is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbListener> getListener() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "listener", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbListener.class))));
    }

    public void setListener(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbListener> value) {
        software.amazon.jsii.Kernel.set(this, "listener", java.util.Objects.requireNonNull(value, "listener is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroups", java.util.Objects.requireNonNull(value, "securityGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceSecurityGroup() {
        return software.amazon.jsii.Kernel.get(this, "sourceSecurityGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceSecurityGroup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceSecurityGroup", java.util.Objects.requireNonNull(value, "sourceSecurityGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubnets(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subnets", java.util.Objects.requireNonNull(value, "subnets is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Elb}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Elb> {
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
        private final imports.aws.ElbConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ElbConfig.Builder();
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
         * listener block.
         * <p>
         * @return {@code this}
         * @param listener listener block. This parameter is required.
         */
        public Builder listener(final java.util.List<? extends imports.aws.ElbListener> listener) {
            this.config.listener(listener);
            return this;
        }

        /**
         * access_logs block.
         * <p>
         * @return {@code this}
         * @param accessLogs access_logs block. This parameter is required.
         */
        public Builder accessLogs(final java.util.List<? extends imports.aws.ElbAccessLogs> accessLogs) {
            this.config.accessLogs(accessLogs);
            return this;
        }

        /**
         * @return {@code this}
         * @param availabilityZones This parameter is required.
         */
        public Builder availabilityZones(final java.util.List<java.lang.String> availabilityZones) {
            this.config.availabilityZones(availabilityZones);
            return this;
        }

        /**
         * @return {@code this}
         * @param connectionDraining This parameter is required.
         */
        public Builder connectionDraining(final java.lang.Boolean connectionDraining) {
            this.config.connectionDraining(connectionDraining);
            return this;
        }

        /**
         * @return {@code this}
         * @param connectionDrainingTimeout This parameter is required.
         */
        public Builder connectionDrainingTimeout(final java.lang.Number connectionDrainingTimeout) {
            this.config.connectionDrainingTimeout(connectionDrainingTimeout);
            return this;
        }

        /**
         * @return {@code this}
         * @param crossZoneLoadBalancing This parameter is required.
         */
        public Builder crossZoneLoadBalancing(final java.lang.Boolean crossZoneLoadBalancing) {
            this.config.crossZoneLoadBalancing(crossZoneLoadBalancing);
            return this;
        }

        /**
         * health_check block.
         * <p>
         * @return {@code this}
         * @param healthCheck health_check block. This parameter is required.
         */
        public Builder healthCheck(final java.util.List<? extends imports.aws.ElbHealthCheck> healthCheck) {
            this.config.healthCheck(healthCheck);
            return this;
        }

        /**
         * @return {@code this}
         * @param idleTimeout This parameter is required.
         */
        public Builder idleTimeout(final java.lang.Number idleTimeout) {
            this.config.idleTimeout(idleTimeout);
            return this;
        }

        /**
         * @return {@code this}
         * @param instances This parameter is required.
         */
        public Builder instances(final java.util.List<java.lang.String> instances) {
            this.config.instances(instances);
            return this;
        }

        /**
         * @return {@code this}
         * @param internal This parameter is required.
         */
        public Builder internal(final java.lang.Boolean internal) {
            this.config.internal(internal);
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
         * @param namePrefix This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config.namePrefix(namePrefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param securityGroups This parameter is required.
         */
        public Builder securityGroups(final java.util.List<java.lang.String> securityGroups) {
            this.config.securityGroups(securityGroups);
            return this;
        }

        /**
         * @return {@code this}
         * @param sourceSecurityGroup This parameter is required.
         */
        public Builder sourceSecurityGroup(final java.lang.String sourceSecurityGroup) {
            this.config.sourceSecurityGroup(sourceSecurityGroup);
            return this;
        }

        /**
         * @return {@code this}
         * @param subnets This parameter is required.
         */
        public Builder subnets(final java.util.List<java.lang.String> subnets) {
            this.config.subnets(subnets);
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
         * @returns a newly built instance of {@link imports.aws.Elb}.
         */
        @Override
        public imports.aws.Elb build() {
            return new imports.aws.Elb(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
