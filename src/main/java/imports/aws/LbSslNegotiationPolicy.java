package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.701Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbSslNegotiationPolicy")
public class LbSslNegotiationPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected LbSslNegotiationPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LbSslNegotiationPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LbSslNegotiationPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.LbSslNegotiationPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAttribute() {
        software.amazon.jsii.Kernel.call(this, "resetAttribute", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLbPortInput() {
        return software.amazon.jsii.Kernel.get(this, "lbPortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbSslNegotiationPolicyAttribute> getAttributeInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LbSslNegotiationPolicyAttribute>)(software.amazon.jsii.Kernel.get(this, "attributeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbSslNegotiationPolicyAttribute.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbSslNegotiationPolicyAttribute> getAttribute() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "attribute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbSslNegotiationPolicyAttribute.class))));
    }

    public void setAttribute(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LbSslNegotiationPolicyAttribute> value) {
        software.amazon.jsii.Kernel.set(this, "attribute", java.util.Objects.requireNonNull(value, "attribute is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLbPort() {
        return software.amazon.jsii.Kernel.get(this, "lbPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setLbPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "lbPort", java.util.Objects.requireNonNull(value, "lbPort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancer() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancer", java.util.Objects.requireNonNull(value, "loadBalancer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.LbSslNegotiationPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LbSslNegotiationPolicy> {
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
        private final imports.aws.LbSslNegotiationPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.LbSslNegotiationPolicyConfig.Builder();
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
         * @param lbPort This parameter is required.
         */
        public Builder lbPort(final java.lang.Number lbPort) {
            this.config.lbPort(lbPort);
            return this;
        }

        /**
         * @return {@code this}
         * @param loadBalancer This parameter is required.
         */
        public Builder loadBalancer(final java.lang.String loadBalancer) {
            this.config.loadBalancer(loadBalancer);
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
         * attribute block.
         * <p>
         * @return {@code this}
         * @param attribute attribute block. This parameter is required.
         */
        public Builder attribute(final java.util.List<? extends imports.aws.LbSslNegotiationPolicyAttribute> attribute) {
            this.config.attribute(attribute);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.LbSslNegotiationPolicy}.
         */
        @Override
        public imports.aws.LbSslNegotiationPolicy build() {
            return new imports.aws.LbSslNegotiationPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
