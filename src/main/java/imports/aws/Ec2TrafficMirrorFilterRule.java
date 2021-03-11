package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.492Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2TrafficMirrorFilterRule")
public class Ec2TrafficMirrorFilterRule extends com.hashicorp.cdktf.TerraformResource {

    protected Ec2TrafficMirrorFilterRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2TrafficMirrorFilterRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Ec2TrafficMirrorFilterRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Ec2TrafficMirrorFilterRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDestinationPortRange() {
        software.amazon.jsii.Kernel.call(this, "resetDestinationPortRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProtocol() {
        software.amazon.jsii.Kernel.call(this, "resetProtocol", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourcePortRange() {
        software.amazon.jsii.Kernel.call(this, "resetSourcePortRange", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationCidrBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationCidrBlockInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleActionInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleActionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRuleNumberInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleNumberInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceCidrBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceCidrBlockInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTrafficDirectionInput() {
        return software.amazon.jsii.Kernel.get(this, "trafficDirectionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTrafficMirrorFilterIdInput() {
        return software.amazon.jsii.Kernel.get(this, "trafficMirrorFilterIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> getDestinationPortRangeInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange>)(software.amazon.jsii.Kernel.get(this, "destinationPortRangeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getProtocolInput() {
        return software.amazon.jsii.Kernel.get(this, "protocolInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> getSourcePortRangeInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange>)(software.amazon.jsii.Kernel.get(this, "sourcePortRangeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "destinationCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationCidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationCidrBlock", java.util.Objects.requireNonNull(value, "destinationCidrBlock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> getDestinationPortRange() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "destinationPortRange", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange.class))));
    }

    public void setDestinationPortRange(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> value) {
        software.amazon.jsii.Kernel.set(this, "destinationPortRange", java.util.Objects.requireNonNull(value, "destinationPortRange is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getProtocol() {
        return software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setProtocol(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "protocol", java.util.Objects.requireNonNull(value, "protocol is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleAction() {
        return software.amazon.jsii.Kernel.get(this, "ruleAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuleAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ruleAction", java.util.Objects.requireNonNull(value, "ruleAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRuleNumber() {
        return software.amazon.jsii.Kernel.get(this, "ruleNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRuleNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ruleNumber", java.util.Objects.requireNonNull(value, "ruleNumber is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "sourceCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceCidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceCidrBlock", java.util.Objects.requireNonNull(value, "sourceCidrBlock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> getSourcePortRange() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "sourcePortRange", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange.class))));
    }

    public void setSourcePortRange(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> value) {
        software.amazon.jsii.Kernel.set(this, "sourcePortRange", java.util.Objects.requireNonNull(value, "sourcePortRange is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTrafficDirection() {
        return software.amazon.jsii.Kernel.get(this, "trafficDirection", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTrafficDirection(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "trafficDirection", java.util.Objects.requireNonNull(value, "trafficDirection is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTrafficMirrorFilterId() {
        return software.amazon.jsii.Kernel.get(this, "trafficMirrorFilterId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTrafficMirrorFilterId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "trafficMirrorFilterId", java.util.Objects.requireNonNull(value, "trafficMirrorFilterId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Ec2TrafficMirrorFilterRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Ec2TrafficMirrorFilterRule> {
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
        private final imports.aws.Ec2TrafficMirrorFilterRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Ec2TrafficMirrorFilterRuleConfig.Builder();
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
         * @param destinationCidrBlock This parameter is required.
         */
        public Builder destinationCidrBlock(final java.lang.String destinationCidrBlock) {
            this.config.destinationCidrBlock(destinationCidrBlock);
            return this;
        }

        /**
         * @return {@code this}
         * @param ruleAction This parameter is required.
         */
        public Builder ruleAction(final java.lang.String ruleAction) {
            this.config.ruleAction(ruleAction);
            return this;
        }

        /**
         * @return {@code this}
         * @param ruleNumber This parameter is required.
         */
        public Builder ruleNumber(final java.lang.Number ruleNumber) {
            this.config.ruleNumber(ruleNumber);
            return this;
        }

        /**
         * @return {@code this}
         * @param sourceCidrBlock This parameter is required.
         */
        public Builder sourceCidrBlock(final java.lang.String sourceCidrBlock) {
            this.config.sourceCidrBlock(sourceCidrBlock);
            return this;
        }

        /**
         * @return {@code this}
         * @param trafficDirection This parameter is required.
         */
        public Builder trafficDirection(final java.lang.String trafficDirection) {
            this.config.trafficDirection(trafficDirection);
            return this;
        }

        /**
         * @return {@code this}
         * @param trafficMirrorFilterId This parameter is required.
         */
        public Builder trafficMirrorFilterId(final java.lang.String trafficMirrorFilterId) {
            this.config.trafficMirrorFilterId(trafficMirrorFilterId);
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
         * destination_port_range block.
         * <p>
         * @return {@code this}
         * @param destinationPortRange destination_port_range block. This parameter is required.
         */
        public Builder destinationPortRange(final java.util.List<? extends imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> destinationPortRange) {
            this.config.destinationPortRange(destinationPortRange);
            return this;
        }

        /**
         * @return {@code this}
         * @param protocol This parameter is required.
         */
        public Builder protocol(final java.lang.Number protocol) {
            this.config.protocol(protocol);
            return this;
        }

        /**
         * source_port_range block.
         * <p>
         * @return {@code this}
         * @param sourcePortRange source_port_range block. This parameter is required.
         */
        public Builder sourcePortRange(final java.util.List<? extends imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> sourcePortRange) {
            this.config.sourcePortRange(sourcePortRange);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Ec2TrafficMirrorFilterRule}.
         */
        @Override
        public imports.aws.Ec2TrafficMirrorFilterRule build() {
            return new imports.aws.Ec2TrafficMirrorFilterRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
