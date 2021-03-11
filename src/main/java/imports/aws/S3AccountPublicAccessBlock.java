package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.829Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3AccountPublicAccessBlock")
public class S3AccountPublicAccessBlock extends com.hashicorp.cdktf.TerraformResource {

    protected S3AccountPublicAccessBlock(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3AccountPublicAccessBlock(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public S3AccountPublicAccessBlock(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.S3AccountPublicAccessBlockConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public S3AccountPublicAccessBlock(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlockPublicAcls() {
        software.amazon.jsii.Kernel.call(this, "resetBlockPublicAcls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlockPublicPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetBlockPublicPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIgnorePublicAcls() {
        software.amazon.jsii.Kernel.call(this, "resetIgnorePublicAcls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRestrictPublicBuckets() {
        software.amazon.jsii.Kernel.call(this, "resetRestrictPublicBuckets", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "accountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicAclsInput() {
        return software.amazon.jsii.Kernel.get(this, "blockPublicAclsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "blockPublicPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnorePublicAclsInput() {
        return software.amazon.jsii.Kernel.get(this, "ignorePublicAclsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRestrictPublicBucketsInput() {
        return software.amazon.jsii.Kernel.get(this, "restrictPublicBucketsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccountId() {
        return software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accountId", java.util.Objects.requireNonNull(value, "accountId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getBlockPublicAcls() {
        return software.amazon.jsii.Kernel.get(this, "blockPublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBlockPublicAcls(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "blockPublicAcls", java.util.Objects.requireNonNull(value, "blockPublicAcls is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getBlockPublicPolicy() {
        return software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBlockPublicPolicy(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "blockPublicPolicy", java.util.Objects.requireNonNull(value, "blockPublicPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIgnorePublicAcls() {
        return software.amazon.jsii.Kernel.get(this, "ignorePublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIgnorePublicAcls(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ignorePublicAcls", java.util.Objects.requireNonNull(value, "ignorePublicAcls is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRestrictPublicBuckets() {
        return software.amazon.jsii.Kernel.get(this, "restrictPublicBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRestrictPublicBuckets(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "restrictPublicBuckets", java.util.Objects.requireNonNull(value, "restrictPublicBuckets is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.S3AccountPublicAccessBlock}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.S3AccountPublicAccessBlock> {
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
        private imports.aws.S3AccountPublicAccessBlockConfig.Builder config;

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
         * @param accountId This parameter is required.
         */
        public Builder accountId(final java.lang.String accountId) {
            this.config().accountId(accountId);
            return this;
        }

        /**
         * @return {@code this}
         * @param blockPublicAcls This parameter is required.
         */
        public Builder blockPublicAcls(final java.lang.Boolean blockPublicAcls) {
            this.config().blockPublicAcls(blockPublicAcls);
            return this;
        }

        /**
         * @return {@code this}
         * @param blockPublicPolicy This parameter is required.
         */
        public Builder blockPublicPolicy(final java.lang.Boolean blockPublicPolicy) {
            this.config().blockPublicPolicy(blockPublicPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param ignorePublicAcls This parameter is required.
         */
        public Builder ignorePublicAcls(final java.lang.Boolean ignorePublicAcls) {
            this.config().ignorePublicAcls(ignorePublicAcls);
            return this;
        }

        /**
         * @return {@code this}
         * @param restrictPublicBuckets This parameter is required.
         */
        public Builder restrictPublicBuckets(final java.lang.Boolean restrictPublicBuckets) {
            this.config().restrictPublicBuckets(restrictPublicBuckets);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.S3AccountPublicAccessBlock}.
         */
        @Override
        public imports.aws.S3AccountPublicAccessBlock build() {
            return new imports.aws.S3AccountPublicAccessBlock(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.S3AccountPublicAccessBlockConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.S3AccountPublicAccessBlockConfig.Builder();
            }
            return this.config;
        }
    }
}
