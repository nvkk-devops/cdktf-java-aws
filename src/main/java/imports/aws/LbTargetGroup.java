package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.702Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbTargetGroup")
public class LbTargetGroup extends com.hashicorp.cdktf.TerraformResource {

    protected LbTargetGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LbTargetGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LbTargetGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.LbTargetGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public LbTargetGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetDeregistrationDelay() {
        software.amazon.jsii.Kernel.call(this, "resetDeregistrationDelay", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheck() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheck", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaMultiValueHeadersEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaMultiValueHeadersEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancingAlgorithmType() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancingAlgorithmType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProtocol() {
        software.amazon.jsii.Kernel.call(this, "resetProtocol", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProxyProtocolV2() {
        software.amazon.jsii.Kernel.call(this, "resetProxyProtocolV2", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSlowStart() {
        software.amazon.jsii.Kernel.call(this, "resetSlowStart", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStickiness() {
        software.amazon.jsii.Kernel.call(this, "resetStickiness", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetType() {
        software.amazon.jsii.Kernel.call(this, "resetTargetType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcId() {
        software.amazon.jsii.Kernel.call(this, "resetVpcId", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeregistrationDelayInput() {
        return software.amazon.jsii.Kernel.get(this, "deregistrationDelayInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbTargetGroupHealthCheck> getHealthCheckInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LbTargetGroupHealthCheck>)(software.amazon.jsii.Kernel.get(this, "healthCheckInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbTargetGroupHealthCheck.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getLambdaMultiValueHeadersEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaMultiValueHeadersEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancingAlgorithmTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancingAlgorithmTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProtocolInput() {
        return software.amazon.jsii.Kernel.get(this, "protocolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getProxyProtocolV2Input() {
        return software.amazon.jsii.Kernel.get(this, "proxyProtocolV2Input", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSlowStartInput() {
        return software.amazon.jsii.Kernel.get(this, "slowStartInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbTargetGroupStickiness> getStickinessInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LbTargetGroupStickiness>)(software.amazon.jsii.Kernel.get(this, "stickinessInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbTargetGroupStickiness.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "targetTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeregistrationDelay() {
        return software.amazon.jsii.Kernel.get(this, "deregistrationDelay", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeregistrationDelay(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deregistrationDelay", java.util.Objects.requireNonNull(value, "deregistrationDelay is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbTargetGroupHealthCheck> getHealthCheck() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "healthCheck", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbTargetGroupHealthCheck.class))));
    }

    public void setHealthCheck(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbTargetGroupHealthCheck> value) {
        software.amazon.jsii.Kernel.set(this, "healthCheck", java.util.Objects.requireNonNull(value, "healthCheck is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getLambdaMultiValueHeadersEnabled() {
        return software.amazon.jsii.Kernel.get(this, "lambdaMultiValueHeadersEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setLambdaMultiValueHeadersEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "lambdaMultiValueHeadersEnabled", java.util.Objects.requireNonNull(value, "lambdaMultiValueHeadersEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancingAlgorithmType() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancingAlgorithmType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancingAlgorithmType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancingAlgorithmType", java.util.Objects.requireNonNull(value, "loadBalancingAlgorithmType is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "port", java.util.Objects.requireNonNull(value, "port is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProtocol() {
        return software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProtocol(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "protocol", java.util.Objects.requireNonNull(value, "protocol is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getProxyProtocolV2() {
        return software.amazon.jsii.Kernel.get(this, "proxyProtocolV2", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setProxyProtocolV2(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "proxyProtocolV2", java.util.Objects.requireNonNull(value, "proxyProtocolV2 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSlowStart() {
        return software.amazon.jsii.Kernel.get(this, "slowStart", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSlowStart(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "slowStart", java.util.Objects.requireNonNull(value, "slowStart is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbTargetGroupStickiness> getStickiness() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "stickiness", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbTargetGroupStickiness.class))));
    }

    public void setStickiness(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbTargetGroupStickiness> value) {
        software.amazon.jsii.Kernel.set(this, "stickiness", java.util.Objects.requireNonNull(value, "stickiness is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetType() {
        return software.amazon.jsii.Kernel.get(this, "targetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetType", java.util.Objects.requireNonNull(value, "targetType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.LbTargetGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LbTargetGroup> {
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
        private imports.aws.LbTargetGroupConfig.Builder config;

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
         * @return {@code this}
         * @param deregistrationDelay This parameter is required.
         */
        public Builder deregistrationDelay(final java.lang.Number deregistrationDelay) {
            this.config().deregistrationDelay(deregistrationDelay);
            return this;
        }

        /**
         * health_check block.
         * <p>
         * @return {@code this}
         * @param healthCheck health_check block. This parameter is required.
         */
        public Builder healthCheck(final java.util.List<? extends imports.aws.LbTargetGroupHealthCheck> healthCheck) {
            this.config().healthCheck(healthCheck);
            return this;
        }

        /**
         * @return {@code this}
         * @param lambdaMultiValueHeadersEnabled This parameter is required.
         */
        public Builder lambdaMultiValueHeadersEnabled(final java.lang.Boolean lambdaMultiValueHeadersEnabled) {
            this.config().lambdaMultiValueHeadersEnabled(lambdaMultiValueHeadersEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param loadBalancingAlgorithmType This parameter is required.
         */
        public Builder loadBalancingAlgorithmType(final java.lang.String loadBalancingAlgorithmType) {
            this.config().loadBalancingAlgorithmType(loadBalancingAlgorithmType);
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
         * @param port This parameter is required.
         */
        public Builder port(final java.lang.Number port) {
            this.config().port(port);
            return this;
        }

        /**
         * @return {@code this}
         * @param protocol This parameter is required.
         */
        public Builder protocol(final java.lang.String protocol) {
            this.config().protocol(protocol);
            return this;
        }

        /**
         * @return {@code this}
         * @param proxyProtocolV2 This parameter is required.
         */
        public Builder proxyProtocolV2(final java.lang.Boolean proxyProtocolV2) {
            this.config().proxyProtocolV2(proxyProtocolV2);
            return this;
        }

        /**
         * @return {@code this}
         * @param slowStart This parameter is required.
         */
        public Builder slowStart(final java.lang.Number slowStart) {
            this.config().slowStart(slowStart);
            return this;
        }

        /**
         * stickiness block.
         * <p>
         * @return {@code this}
         * @param stickiness stickiness block. This parameter is required.
         */
        public Builder stickiness(final java.util.List<? extends imports.aws.LbTargetGroupStickiness> stickiness) {
            this.config().stickiness(stickiness);
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
         * @return {@code this}
         * @param targetType This parameter is required.
         */
        public Builder targetType(final java.lang.String targetType) {
            this.config().targetType(targetType);
            return this;
        }

        /**
         * @return {@code this}
         * @param vpcId This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config().vpcId(vpcId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.LbTargetGroup}.
         */
        @Override
        public imports.aws.LbTargetGroup build() {
            return new imports.aws.LbTargetGroup(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.LbTargetGroupConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.LbTargetGroupConfig.Builder();
            }
            return this.config;
        }
    }
}
