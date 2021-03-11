package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.490Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2LocalGatewayRoute")
public class Ec2LocalGatewayRoute extends com.hashicorp.cdktf.TerraformResource {

    protected Ec2LocalGatewayRoute(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2LocalGatewayRoute(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Ec2LocalGatewayRoute(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Ec2LocalGatewayRouteConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
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

    public @org.jetbrains.annotations.NotNull java.lang.String getLocalGatewayRouteTableIdInput() {
        return software.amazon.jsii.Kernel.get(this, "localGatewayRouteTableIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocalGatewayVirtualInterfaceGroupIdInput() {
        return software.amazon.jsii.Kernel.get(this, "localGatewayVirtualInterfaceGroupIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "destinationCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationCidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationCidrBlock", java.util.Objects.requireNonNull(value, "destinationCidrBlock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocalGatewayRouteTableId() {
        return software.amazon.jsii.Kernel.get(this, "localGatewayRouteTableId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocalGatewayRouteTableId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "localGatewayRouteTableId", java.util.Objects.requireNonNull(value, "localGatewayRouteTableId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocalGatewayVirtualInterfaceGroupId() {
        return software.amazon.jsii.Kernel.get(this, "localGatewayVirtualInterfaceGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocalGatewayVirtualInterfaceGroupId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "localGatewayVirtualInterfaceGroupId", java.util.Objects.requireNonNull(value, "localGatewayVirtualInterfaceGroupId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Ec2LocalGatewayRoute}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Ec2LocalGatewayRoute> {
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
        private final imports.aws.Ec2LocalGatewayRouteConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Ec2LocalGatewayRouteConfig.Builder();
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
         * @param localGatewayRouteTableId This parameter is required.
         */
        public Builder localGatewayRouteTableId(final java.lang.String localGatewayRouteTableId) {
            this.config.localGatewayRouteTableId(localGatewayRouteTableId);
            return this;
        }

        /**
         * @return {@code this}
         * @param localGatewayVirtualInterfaceGroupId This parameter is required.
         */
        public Builder localGatewayVirtualInterfaceGroupId(final java.lang.String localGatewayVirtualInterfaceGroupId) {
            this.config.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Ec2LocalGatewayRoute}.
         */
        @Override
        public imports.aws.Ec2LocalGatewayRoute build() {
            return new imports.aws.Ec2LocalGatewayRoute(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
