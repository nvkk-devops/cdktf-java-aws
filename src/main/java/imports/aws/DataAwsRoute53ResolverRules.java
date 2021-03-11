package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.352Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsRoute53ResolverRules")
public class DataAwsRoute53ResolverRules extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsRoute53ResolverRules(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsRoute53ResolverRules(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsRoute53ResolverRules(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsRoute53ResolverRulesConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsRoute53ResolverRules(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetOwnerId() {
        software.amazon.jsii.Kernel.call(this, "resetOwnerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResolverEndpointId() {
        software.amazon.jsii.Kernel.call(this, "resetResolverEndpointId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRuleType() {
        software.amazon.jsii.Kernel.call(this, "resetRuleType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetShareStatus() {
        software.amazon.jsii.Kernel.call(this, "resetShareStatus", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResolverRuleIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "resolverRuleIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResolverEndpointIdInput() {
        return software.amazon.jsii.Kernel.get(this, "resolverEndpointIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRuleTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getShareStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "shareStatusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwnerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ownerId", java.util.Objects.requireNonNull(value, "ownerId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResolverEndpointId() {
        return software.amazon.jsii.Kernel.get(this, "resolverEndpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResolverEndpointId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resolverEndpointId", java.util.Objects.requireNonNull(value, "resolverEndpointId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleType() {
        return software.amazon.jsii.Kernel.get(this, "ruleType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuleType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ruleType", java.util.Objects.requireNonNull(value, "ruleType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getShareStatus() {
        return software.amazon.jsii.Kernel.get(this, "shareStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setShareStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "shareStatus", java.util.Objects.requireNonNull(value, "shareStatus is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsRoute53ResolverRules}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsRoute53ResolverRules> {
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
        private imports.aws.DataAwsRoute53ResolverRulesConfig.Builder config;

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
         * @param ownerId This parameter is required.
         */
        public Builder ownerId(final java.lang.String ownerId) {
            this.config().ownerId(ownerId);
            return this;
        }

        /**
         * @return {@code this}
         * @param resolverEndpointId This parameter is required.
         */
        public Builder resolverEndpointId(final java.lang.String resolverEndpointId) {
            this.config().resolverEndpointId(resolverEndpointId);
            return this;
        }

        /**
         * @return {@code this}
         * @param ruleType This parameter is required.
         */
        public Builder ruleType(final java.lang.String ruleType) {
            this.config().ruleType(ruleType);
            return this;
        }

        /**
         * @return {@code this}
         * @param shareStatus This parameter is required.
         */
        public Builder shareStatus(final java.lang.String shareStatus) {
            this.config().shareStatus(shareStatus);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsRoute53ResolverRules}.
         */
        @Override
        public imports.aws.DataAwsRoute53ResolverRules build() {
            return new imports.aws.DataAwsRoute53ResolverRules(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsRoute53ResolverRulesConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsRoute53ResolverRulesConfig.Builder();
            }
            return this.config;
        }
    }
}
