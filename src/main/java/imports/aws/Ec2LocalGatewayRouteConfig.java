package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.490Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2LocalGatewayRouteConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2LocalGatewayRouteConfig.Jsii$Proxy.class)
public interface Ec2LocalGatewayRouteConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDestinationCidrBlock();

    @org.jetbrains.annotations.NotNull java.lang.String getLocalGatewayRouteTableId();

    @org.jetbrains.annotations.NotNull java.lang.String getLocalGatewayVirtualInterfaceGroupId();

    /**
     * @return a {@link Builder} of {@link Ec2LocalGatewayRouteConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2LocalGatewayRouteConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2LocalGatewayRouteConfig> {
        private java.lang.String destinationCidrBlock;
        private java.lang.String localGatewayRouteTableId;
        private java.lang.String localGatewayVirtualInterfaceGroupId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2LocalGatewayRouteConfig#getDestinationCidrBlock}
         * @param destinationCidrBlock the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationCidrBlock(java.lang.String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link Ec2LocalGatewayRouteConfig#getLocalGatewayRouteTableId}
         * @param localGatewayRouteTableId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder localGatewayRouteTableId(java.lang.String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2LocalGatewayRouteConfig#getLocalGatewayVirtualInterfaceGroupId}
         * @param localGatewayVirtualInterfaceGroupId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder localGatewayVirtualInterfaceGroupId(java.lang.String localGatewayVirtualInterfaceGroupId) {
            this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2LocalGatewayRouteConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2LocalGatewayRouteConfig#getDependsOn}
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
         * Sets the value of {@link Ec2LocalGatewayRouteConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2LocalGatewayRouteConfig#getProvider}
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
         * @return a new instance of {@link Ec2LocalGatewayRouteConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2LocalGatewayRouteConfig build() {
            return new Jsii$Proxy(destinationCidrBlock, localGatewayRouteTableId, localGatewayVirtualInterfaceGroupId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2LocalGatewayRouteConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2LocalGatewayRouteConfig {
        private final java.lang.String destinationCidrBlock;
        private final java.lang.String localGatewayRouteTableId;
        private final java.lang.String localGatewayVirtualInterfaceGroupId;
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
            this.localGatewayRouteTableId = software.amazon.jsii.Kernel.get(this, "localGatewayRouteTableId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.localGatewayVirtualInterfaceGroupId = software.amazon.jsii.Kernel.get(this, "localGatewayVirtualInterfaceGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String destinationCidrBlock, final java.lang.String localGatewayRouteTableId, final java.lang.String localGatewayVirtualInterfaceGroupId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destinationCidrBlock = java.util.Objects.requireNonNull(destinationCidrBlock, "destinationCidrBlock is required");
            this.localGatewayRouteTableId = java.util.Objects.requireNonNull(localGatewayRouteTableId, "localGatewayRouteTableId is required");
            this.localGatewayVirtualInterfaceGroupId = java.util.Objects.requireNonNull(localGatewayVirtualInterfaceGroupId, "localGatewayVirtualInterfaceGroupId is required");
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
        public final java.lang.String getLocalGatewayRouteTableId() {
            return this.localGatewayRouteTableId;
        }

        @Override
        public final java.lang.String getLocalGatewayVirtualInterfaceGroupId() {
            return this.localGatewayVirtualInterfaceGroupId;
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
            data.set("localGatewayRouteTableId", om.valueToTree(this.getLocalGatewayRouteTableId()));
            data.set("localGatewayVirtualInterfaceGroupId", om.valueToTree(this.getLocalGatewayVirtualInterfaceGroupId()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2LocalGatewayRouteConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2LocalGatewayRouteConfig.Jsii$Proxy that = (Ec2LocalGatewayRouteConfig.Jsii$Proxy) o;

            if (!destinationCidrBlock.equals(that.destinationCidrBlock)) return false;
            if (!localGatewayRouteTableId.equals(that.localGatewayRouteTableId)) return false;
            if (!localGatewayVirtualInterfaceGroupId.equals(that.localGatewayVirtualInterfaceGroupId)) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destinationCidrBlock.hashCode();
            result = 31 * result + (this.localGatewayRouteTableId.hashCode());
            result = 31 * result + (this.localGatewayVirtualInterfaceGroupId.hashCode());
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
