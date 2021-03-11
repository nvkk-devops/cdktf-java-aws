package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.694Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Lb")
public class Lb extends com.hashicorp.cdktf.TerraformResource {

    protected Lb(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Lb(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Lb(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.LbConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public Lb(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAccessLogs() {
        software.amazon.jsii.Kernel.call(this, "resetAccessLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDropInvalidHeaderFields() {
        software.amazon.jsii.Kernel.call(this, "resetDropInvalidHeaderFields", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableCrossZoneLoadBalancing() {
        software.amazon.jsii.Kernel.call(this, "resetEnableCrossZoneLoadBalancing", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableDeletionProtection() {
        software.amazon.jsii.Kernel.call(this, "resetEnableDeletionProtection", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableHttp2() {
        software.amazon.jsii.Kernel.call(this, "resetEnableHttp2", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdleTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetIdleTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInternal() {
        software.amazon.jsii.Kernel.call(this, "resetInternal", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpAddressType() {
        software.amazon.jsii.Kernel.call(this, "resetIpAddressType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancerType() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancerType", software.amazon.jsii.NativeType.VOID);
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

    public void resetSubnetMapping() {
        software.amazon.jsii.Kernel.call(this, "resetSubnetMapping", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnets() {
        software.amazon.jsii.Kernel.call(this, "resetSubnets", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArnSuffix() {
        return software.amazon.jsii.Kernel.get(this, "arnSuffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneId() {
        return software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbAccessLogs> getAccessLogsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LbAccessLogs>)(software.amazon.jsii.Kernel.get(this, "accessLogsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbAccessLogs.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDropInvalidHeaderFieldsInput() {
        return software.amazon.jsii.Kernel.get(this, "dropInvalidHeaderFieldsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableCrossZoneLoadBalancingInput() {
        return software.amazon.jsii.Kernel.get(this, "enableCrossZoneLoadBalancingInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableDeletionProtectionInput() {
        return software.amazon.jsii.Kernel.get(this, "enableDeletionProtectionInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableHttp2Input() {
        return software.amazon.jsii.Kernel.get(this, "enableHttp2Input", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIdleTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "idleTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInternalInput() {
        return software.amazon.jsii.Kernel.get(this, "internalInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpAddressTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbSubnetMapping> getSubnetMappingInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LbSubnetMapping>)(software.amazon.jsii.Kernel.get(this, "subnetMappingInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbSubnetMapping.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subnetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.LbTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.LbTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbAccessLogs> getAccessLogs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accessLogs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbAccessLogs.class))));
    }

    public void setAccessLogs(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbAccessLogs> value) {
        software.amazon.jsii.Kernel.set(this, "accessLogs", java.util.Objects.requireNonNull(value, "accessLogs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getDropInvalidHeaderFields() {
        return software.amazon.jsii.Kernel.get(this, "dropInvalidHeaderFields", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDropInvalidHeaderFields(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "dropInvalidHeaderFields", java.util.Objects.requireNonNull(value, "dropInvalidHeaderFields is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableCrossZoneLoadBalancing() {
        return software.amazon.jsii.Kernel.get(this, "enableCrossZoneLoadBalancing", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableCrossZoneLoadBalancing(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableCrossZoneLoadBalancing", java.util.Objects.requireNonNull(value, "enableCrossZoneLoadBalancing is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableDeletionProtection() {
        return software.amazon.jsii.Kernel.get(this, "enableDeletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableDeletionProtection(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableDeletionProtection", java.util.Objects.requireNonNull(value, "enableDeletionProtection is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableHttp2() {
        return software.amazon.jsii.Kernel.get(this, "enableHttp2", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableHttp2(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableHttp2", java.util.Objects.requireNonNull(value, "enableHttp2 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getIdleTimeout() {
        return software.amazon.jsii.Kernel.get(this, "idleTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setIdleTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "idleTimeout", java.util.Objects.requireNonNull(value, "idleTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getInternal() {
        return software.amazon.jsii.Kernel.get(this, "internal", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setInternal(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "internal", java.util.Objects.requireNonNull(value, "internal is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpAddressType() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpAddressType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipAddressType", java.util.Objects.requireNonNull(value, "ipAddressType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerType() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerType", java.util.Objects.requireNonNull(value, "loadBalancerType is required"));
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

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbSubnetMapping> getSubnetMapping() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnetMapping", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbSubnetMapping.class))));
    }

    public void setSubnetMapping(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbSubnetMapping> value) {
        software.amazon.jsii.Kernel.set(this, "subnetMapping", java.util.Objects.requireNonNull(value, "subnetMapping is required"));
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

    public @org.jetbrains.annotations.NotNull imports.aws.LbTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.LbTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.LbTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Lb}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Lb> {
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
        private imports.aws.LbConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * access_logs block.
         * <p>
         * @return {@code this}
         * @param accessLogs access_logs block. This parameter is required.
         */
        public Builder accessLogs(final java.util.List<? extends imports.aws.LbAccessLogs> accessLogs) {
            this.config().accessLogs(accessLogs);
            return this;
        }

        /**
         * @return {@code this}
         * @param dropInvalidHeaderFields This parameter is required.
         */
        public Builder dropInvalidHeaderFields(final java.lang.Boolean dropInvalidHeaderFields) {
            this.config().dropInvalidHeaderFields(dropInvalidHeaderFields);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableCrossZoneLoadBalancing This parameter is required.
         */
        public Builder enableCrossZoneLoadBalancing(final java.lang.Boolean enableCrossZoneLoadBalancing) {
            this.config().enableCrossZoneLoadBalancing(enableCrossZoneLoadBalancing);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableDeletionProtection This parameter is required.
         */
        public Builder enableDeletionProtection(final java.lang.Boolean enableDeletionProtection) {
            this.config().enableDeletionProtection(enableDeletionProtection);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableHttp2 This parameter is required.
         */
        public Builder enableHttp2(final java.lang.Boolean enableHttp2) {
            this.config().enableHttp2(enableHttp2);
            return this;
        }

        /**
         * @return {@code this}
         * @param idleTimeout This parameter is required.
         */
        public Builder idleTimeout(final java.lang.Number idleTimeout) {
            this.config().idleTimeout(idleTimeout);
            return this;
        }

        /**
         * @return {@code this}
         * @param internal This parameter is required.
         */
        public Builder internal(final java.lang.Boolean internal) {
            this.config().internal(internal);
            return this;
        }

        /**
         * @return {@code this}
         * @param ipAddressType This parameter is required.
         */
        public Builder ipAddressType(final java.lang.String ipAddressType) {
            this.config().ipAddressType(ipAddressType);
            return this;
        }

        /**
         * @return {@code this}
         * @param loadBalancerType This parameter is required.
         */
        public Builder loadBalancerType(final java.lang.String loadBalancerType) {
            this.config().loadBalancerType(loadBalancerType);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param namePrefix This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config().namePrefix(namePrefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param securityGroups This parameter is required.
         */
        public Builder securityGroups(final java.util.List<java.lang.String> securityGroups) {
            this.config().securityGroups(securityGroups);
            return this;
        }

        /**
         * subnet_mapping block.
         * <p>
         * @return {@code this}
         * @param subnetMapping subnet_mapping block. This parameter is required.
         */
        public Builder subnetMapping(final java.util.List<? extends imports.aws.LbSubnetMapping> subnetMapping) {
            this.config().subnetMapping(subnetMapping);
            return this;
        }

        /**
         * @return {@code this}
         * @param subnets This parameter is required.
         */
        public Builder subnets(final java.util.List<java.lang.String> subnets) {
            this.config().subnets(subnets);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.LbTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Lb}.
         */
        @Override
        public imports.aws.Lb build() {
            return new imports.aws.Lb(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.LbConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.LbConfig.Builder();
            }
            return this.config;
        }
    }
}
