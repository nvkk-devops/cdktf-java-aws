package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.708Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LoadBalancerPolicy")
public class LoadBalancerPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected LoadBalancerPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LoadBalancerPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LoadBalancerPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.LoadBalancerPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetPolicyAttribute() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyAttribute", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyNameInput() {
        return software.amazon.jsii.Kernel.get(this, "policyNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyTypeNameInput() {
        return software.amazon.jsii.Kernel.get(this, "policyTypeNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute> getPolicyAttributeInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute>)(software.amazon.jsii.Kernel.get(this, "policyAttributeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LoadBalancerPolicyPolicyAttribute.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerName() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerName", java.util.Objects.requireNonNull(value, "loadBalancerName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute> getPolicyAttribute() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "policyAttribute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LoadBalancerPolicyPolicyAttribute.class))));
    }

    public void setPolicyAttribute(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.LoadBalancerPolicyPolicyAttribute> value) {
        software.amazon.jsii.Kernel.set(this, "policyAttribute", java.util.Objects.requireNonNull(value, "policyAttribute is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyName() {
        return software.amazon.jsii.Kernel.get(this, "policyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyName", java.util.Objects.requireNonNull(value, "policyName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyTypeName() {
        return software.amazon.jsii.Kernel.get(this, "policyTypeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyTypeName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyTypeName", java.util.Objects.requireNonNull(value, "policyTypeName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.LoadBalancerPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LoadBalancerPolicy> {
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
        private final imports.aws.LoadBalancerPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.LoadBalancerPolicyConfig.Builder();
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
         * @param loadBalancerName This parameter is required.
         */
        public Builder loadBalancerName(final java.lang.String loadBalancerName) {
            this.config.loadBalancerName(loadBalancerName);
            return this;
        }

        /**
         * @return {@code this}
         * @param policyName This parameter is required.
         */
        public Builder policyName(final java.lang.String policyName) {
            this.config.policyName(policyName);
            return this;
        }

        /**
         * @return {@code this}
         * @param policyTypeName This parameter is required.
         */
        public Builder policyTypeName(final java.lang.String policyTypeName) {
            this.config.policyTypeName(policyTypeName);
            return this;
        }

        /**
         * policy_attribute block.
         * <p>
         * @return {@code this}
         * @param policyAttribute policy_attribute block. This parameter is required.
         */
        public Builder policyAttribute(final java.util.List<? extends imports.aws.LoadBalancerPolicyPolicyAttribute> policyAttribute) {
            this.config.policyAttribute(policyAttribute);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.LoadBalancerPolicy}.
         */
        @Override
        public imports.aws.LoadBalancerPolicy build() {
            return new imports.aws.LoadBalancerPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
