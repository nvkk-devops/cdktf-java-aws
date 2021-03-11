package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.504Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2TransitGatewayRouteConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2TransitGatewayRouteConfig.Jsii$Proxy.class)
public interface Ec2TransitGatewayRouteConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDestinationCidrBlock();

    @org.jetbrains.annotations.NotNull java.lang.String getTransitGatewayRouteTableId();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlackhole() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTransitGatewayAttachmentId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2TransitGatewayRouteConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2TransitGatewayRouteConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2TransitGatewayRouteConfig> {
        private java.lang.String destinationCidrBlock;
        private java.lang.String transitGatewayRouteTableId;
        private java.lang.Boolean blackhole;
        private java.lang.String transitGatewayAttachmentId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getDestinationCidrBlock}
         * @param destinationCidrBlock the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationCidrBlock(java.lang.String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getTransitGatewayRouteTableId}
         * @param transitGatewayRouteTableId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder transitGatewayRouteTableId(java.lang.String transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = transitGatewayRouteTableId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getBlackhole}
         * @param blackhole the value to be set.
         * @return {@code this}
         */
        public Builder blackhole(java.lang.Boolean blackhole) {
            this.blackhole = blackhole;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getTransitGatewayAttachmentId}
         * @param transitGatewayAttachmentId the value to be set.
         * @return {@code this}
         */
        public Builder transitGatewayAttachmentId(java.lang.String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getDependsOn}
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
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getProvider}
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
         * @return a new instance of {@link Ec2TransitGatewayRouteConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2TransitGatewayRouteConfig build() {
            return new Jsii$Proxy(destinationCidrBlock, transitGatewayRouteTableId, blackhole, transitGatewayAttachmentId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2TransitGatewayRouteConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2TransitGatewayRouteConfig {
        private final java.lang.String destinationCidrBlock;
        private final java.lang.String transitGatewayRouteTableId;
        private final java.lang.Boolean blackhole;
        private final java.lang.String transitGatewayAttachmentId;
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
            this.transitGatewayRouteTableId = software.amazon.jsii.Kernel.get(this, "transitGatewayRouteTableId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.blackhole = software.amazon.jsii.Kernel.get(this, "blackhole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.transitGatewayAttachmentId = software.amazon.jsii.Kernel.get(this, "transitGatewayAttachmentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String destinationCidrBlock, final java.lang.String transitGatewayRouteTableId, final java.lang.Boolean blackhole, final java.lang.String transitGatewayAttachmentId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destinationCidrBlock = java.util.Objects.requireNonNull(destinationCidrBlock, "destinationCidrBlock is required");
            this.transitGatewayRouteTableId = java.util.Objects.requireNonNull(transitGatewayRouteTableId, "transitGatewayRouteTableId is required");
            this.blackhole = blackhole;
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
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
        public final java.lang.String getTransitGatewayRouteTableId() {
            return this.transitGatewayRouteTableId;
        }

        @Override
        public final java.lang.Boolean getBlackhole() {
            return this.blackhole;
        }

        @Override
        public final java.lang.String getTransitGatewayAttachmentId() {
            return this.transitGatewayAttachmentId;
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
            data.set("transitGatewayRouteTableId", om.valueToTree(this.getTransitGatewayRouteTableId()));
            if (this.getBlackhole() != null) {
                data.set("blackhole", om.valueToTree(this.getBlackhole()));
            }
            if (this.getTransitGatewayAttachmentId() != null) {
                data.set("transitGatewayAttachmentId", om.valueToTree(this.getTransitGatewayAttachmentId()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2TransitGatewayRouteConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2TransitGatewayRouteConfig.Jsii$Proxy that = (Ec2TransitGatewayRouteConfig.Jsii$Proxy) o;

            if (!destinationCidrBlock.equals(that.destinationCidrBlock)) return false;
            if (!transitGatewayRouteTableId.equals(that.transitGatewayRouteTableId)) return false;
            if (this.blackhole != null ? !this.blackhole.equals(that.blackhole) : that.blackhole != null) return false;
            if (this.transitGatewayAttachmentId != null ? !this.transitGatewayAttachmentId.equals(that.transitGatewayAttachmentId) : that.transitGatewayAttachmentId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destinationCidrBlock.hashCode();
            result = 31 * result + (this.transitGatewayRouteTableId.hashCode());
            result = 31 * result + (this.blackhole != null ? this.blackhole.hashCode() : 0);
            result = 31 * result + (this.transitGatewayAttachmentId != null ? this.transitGatewayAttachmentId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
