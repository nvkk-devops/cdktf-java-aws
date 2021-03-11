package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.493Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2TrafficMirrorFilterRuleConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2TrafficMirrorFilterRuleConfig.Jsii$Proxy.class)
public interface Ec2TrafficMirrorFilterRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDestinationCidrBlock();

    @org.jetbrains.annotations.NotNull java.lang.String getRuleAction();

    @org.jetbrains.annotations.NotNull java.lang.Number getRuleNumber();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceCidrBlock();

    @org.jetbrains.annotations.NotNull java.lang.String getTrafficDirection();

    @org.jetbrains.annotations.NotNull java.lang.String getTrafficMirrorFilterId();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * destination_port_range block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> getDestinationPortRange() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getProtocol() {
        return null;
    }

    /**
     * source_port_range block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> getSourcePortRange() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2TrafficMirrorFilterRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2TrafficMirrorFilterRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2TrafficMirrorFilterRuleConfig> {
        private java.lang.String destinationCidrBlock;
        private java.lang.String ruleAction;
        private java.lang.Number ruleNumber;
        private java.lang.String sourceCidrBlock;
        private java.lang.String trafficDirection;
        private java.lang.String trafficMirrorFilterId;
        private java.lang.String description;
        private java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> destinationPortRange;
        private java.lang.Number protocol;
        private java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> sourcePortRange;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getDestinationCidrBlock}
         * @param destinationCidrBlock the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationCidrBlock(java.lang.String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getRuleAction}
         * @param ruleAction the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleAction(java.lang.String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getRuleNumber}
         * @param ruleNumber the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleNumber(java.lang.Number ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getSourceCidrBlock}
         * @param sourceCidrBlock the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceCidrBlock(java.lang.String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getTrafficDirection}
         * @param trafficDirection the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder trafficDirection(java.lang.String trafficDirection) {
            this.trafficDirection = trafficDirection;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getTrafficMirrorFilterId}
         * @param trafficMirrorFilterId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder trafficMirrorFilterId(java.lang.String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getDestinationPortRange}
         * @param destinationPortRange destination_port_range block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder destinationPortRange(java.util.List<? extends imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> destinationPortRange) {
            this.destinationPortRange = (java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange>)destinationPortRange;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getProtocol}
         * @param protocol the value to be set.
         * @return {@code this}
         */
        public Builder protocol(java.lang.Number protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getSourcePortRange}
         * @param sourcePortRange source_port_range block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sourcePortRange(java.util.List<? extends imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> sourcePortRange) {
            this.sourcePortRange = (java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange>)sourcePortRange;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getDependsOn}
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
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TrafficMirrorFilterRuleConfig#getProvider}
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
         * @return a new instance of {@link Ec2TrafficMirrorFilterRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2TrafficMirrorFilterRuleConfig build() {
            return new Jsii$Proxy(destinationCidrBlock, ruleAction, ruleNumber, sourceCidrBlock, trafficDirection, trafficMirrorFilterId, description, destinationPortRange, protocol, sourcePortRange, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2TrafficMirrorFilterRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2TrafficMirrorFilterRuleConfig {
        private final java.lang.String destinationCidrBlock;
        private final java.lang.String ruleAction;
        private final java.lang.Number ruleNumber;
        private final java.lang.String sourceCidrBlock;
        private final java.lang.String trafficDirection;
        private final java.lang.String trafficMirrorFilterId;
        private final java.lang.String description;
        private final java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> destinationPortRange;
        private final java.lang.Number protocol;
        private final java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> sourcePortRange;
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
            this.destinationCidrBlock = software.amazon.jsii.Kernel.get(this, "destinationCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleAction = software.amazon.jsii.Kernel.get(this, "ruleAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleNumber = software.amazon.jsii.Kernel.get(this, "ruleNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.sourceCidrBlock = software.amazon.jsii.Kernel.get(this, "sourceCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.trafficDirection = software.amazon.jsii.Kernel.get(this, "trafficDirection", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.trafficMirrorFilterId = software.amazon.jsii.Kernel.get(this, "trafficMirrorFilterId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationPortRange = software.amazon.jsii.Kernel.get(this, "destinationPortRange", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange.class)));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.sourcePortRange = software.amazon.jsii.Kernel.get(this, "sourcePortRange", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String destinationCidrBlock, final java.lang.String ruleAction, final java.lang.Number ruleNumber, final java.lang.String sourceCidrBlock, final java.lang.String trafficDirection, final java.lang.String trafficMirrorFilterId, final java.lang.String description, final java.util.List<? extends imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> destinationPortRange, final java.lang.Number protocol, final java.util.List<? extends imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> sourcePortRange, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destinationCidrBlock = java.util.Objects.requireNonNull(destinationCidrBlock, "destinationCidrBlock is required");
            this.ruleAction = java.util.Objects.requireNonNull(ruleAction, "ruleAction is required");
            this.ruleNumber = java.util.Objects.requireNonNull(ruleNumber, "ruleNumber is required");
            this.sourceCidrBlock = java.util.Objects.requireNonNull(sourceCidrBlock, "sourceCidrBlock is required");
            this.trafficDirection = java.util.Objects.requireNonNull(trafficDirection, "trafficDirection is required");
            this.trafficMirrorFilterId = java.util.Objects.requireNonNull(trafficMirrorFilterId, "trafficMirrorFilterId is required");
            this.description = description;
            this.destinationPortRange = (java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange>)destinationPortRange;
            this.protocol = protocol;
            this.sourcePortRange = (java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange>)sourcePortRange;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        @Override
        public final java.lang.String getRuleAction() {
            return this.ruleAction;
        }

        @Override
        public final java.lang.Number getRuleNumber() {
            return this.ruleNumber;
        }

        @Override
        public final java.lang.String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        @Override
        public final java.lang.String getTrafficDirection() {
            return this.trafficDirection;
        }

        @Override
        public final java.lang.String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleDestinationPortRange> getDestinationPortRange() {
            return this.destinationPortRange;
        }

        @Override
        public final java.lang.Number getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.util.List<imports.aws.Ec2TrafficMirrorFilterRuleSourcePortRange> getSourcePortRange() {
            return this.sourcePortRange;
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

            data.set("destinationCidrBlock", om.valueToTree(this.getDestinationCidrBlock()));
            data.set("ruleAction", om.valueToTree(this.getRuleAction()));
            data.set("ruleNumber", om.valueToTree(this.getRuleNumber()));
            data.set("sourceCidrBlock", om.valueToTree(this.getSourceCidrBlock()));
            data.set("trafficDirection", om.valueToTree(this.getTrafficDirection()));
            data.set("trafficMirrorFilterId", om.valueToTree(this.getTrafficMirrorFilterId()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDestinationPortRange() != null) {
                data.set("destinationPortRange", om.valueToTree(this.getDestinationPortRange()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }
            if (this.getSourcePortRange() != null) {
                data.set("sourcePortRange", om.valueToTree(this.getSourcePortRange()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2TrafficMirrorFilterRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2TrafficMirrorFilterRuleConfig.Jsii$Proxy that = (Ec2TrafficMirrorFilterRuleConfig.Jsii$Proxy) o;

            if (!destinationCidrBlock.equals(that.destinationCidrBlock)) return false;
            if (!ruleAction.equals(that.ruleAction)) return false;
            if (!ruleNumber.equals(that.ruleNumber)) return false;
            if (!sourceCidrBlock.equals(that.sourceCidrBlock)) return false;
            if (!trafficDirection.equals(that.trafficDirection)) return false;
            if (!trafficMirrorFilterId.equals(that.trafficMirrorFilterId)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.destinationPortRange != null ? !this.destinationPortRange.equals(that.destinationPortRange) : that.destinationPortRange != null) return false;
            if (this.protocol != null ? !this.protocol.equals(that.protocol) : that.protocol != null) return false;
            if (this.sourcePortRange != null ? !this.sourcePortRange.equals(that.sourcePortRange) : that.sourcePortRange != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destinationCidrBlock.hashCode();
            result = 31 * result + (this.ruleAction.hashCode());
            result = 31 * result + (this.ruleNumber.hashCode());
            result = 31 * result + (this.sourceCidrBlock.hashCode());
            result = 31 * result + (this.trafficDirection.hashCode());
            result = 31 * result + (this.trafficMirrorFilterId.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.destinationPortRange != null ? this.destinationPortRange.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            result = 31 * result + (this.sourcePortRange != null ? this.sourcePortRange.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
