package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.707Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LoadBalancerBackendServerPolicy")
public class LoadBalancerBackendServerPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected LoadBalancerBackendServerPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LoadBalancerBackendServerPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public LoadBalancerBackendServerPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.LoadBalancerBackendServerPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetPolicyNames() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyNames", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInstancePortInput() {
        return software.amazon.jsii.Kernel.get(this, "instancePortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "policyNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInstancePort() {
        return software.amazon.jsii.Kernel.get(this, "instancePort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInstancePort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "instancePort", java.util.Objects.requireNonNull(value, "instancePort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerName() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerName", java.util.Objects.requireNonNull(value, "loadBalancerName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPolicyNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "policyNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPolicyNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "policyNames", java.util.Objects.requireNonNull(value, "policyNames is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.LoadBalancerBackendServerPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.LoadBalancerBackendServerPolicy> {
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
        private final imports.aws.LoadBalancerBackendServerPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.LoadBalancerBackendServerPolicyConfig.Builder();
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
         * @param instancePort This parameter is required.
         */
        public Builder instancePort(final java.lang.Number instancePort) {
            this.config.instancePort(instancePort);
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
         * @param policyNames This parameter is required.
         */
        public Builder policyNames(final java.util.List<java.lang.String> policyNames) {
            this.config.policyNames(policyNames);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.LoadBalancerBackendServerPolicy}.
         */
        @Override
        public imports.aws.LoadBalancerBackendServerPolicy build() {
            return new imports.aws.LoadBalancerBackendServerPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
