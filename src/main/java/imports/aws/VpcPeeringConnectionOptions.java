package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.922Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcPeeringConnectionOptions")
public class VpcPeeringConnectionOptions extends com.hashicorp.cdktf.TerraformResource {

    protected VpcPeeringConnectionOptions(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpcPeeringConnectionOptions(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public VpcPeeringConnectionOptions(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.VpcPeeringConnectionOptionsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccepter() {
        software.amazon.jsii.Kernel.call(this, "resetAccepter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequester() {
        software.amazon.jsii.Kernel.call(this, "resetRequester", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcPeeringConnectionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcPeeringConnectionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter> getAccepterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter>)(software.amazon.jsii.Kernel.get(this, "accepterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionOptionsAccepter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester> getRequesterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester>)(software.amazon.jsii.Kernel.get(this, "requesterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionOptionsRequester.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter> getAccepter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accepter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionOptionsAccepter.class))));
    }

    public void setAccepter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter> value) {
        software.amazon.jsii.Kernel.set(this, "accepter", java.util.Objects.requireNonNull(value, "accepter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester> getRequester() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "requester", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionOptionsRequester.class))));
    }

    public void setRequester(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester> value) {
        software.amazon.jsii.Kernel.set(this, "requester", java.util.Objects.requireNonNull(value, "requester is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcPeeringConnectionId() {
        return software.amazon.jsii.Kernel.get(this, "vpcPeeringConnectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcPeeringConnectionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcPeeringConnectionId", java.util.Objects.requireNonNull(value, "vpcPeeringConnectionId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.VpcPeeringConnectionOptions}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.VpcPeeringConnectionOptions> {
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
        private final imports.aws.VpcPeeringConnectionOptionsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.VpcPeeringConnectionOptionsConfig.Builder();
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
         * @param vpcPeeringConnectionId This parameter is required.
         */
        public Builder vpcPeeringConnectionId(final java.lang.String vpcPeeringConnectionId) {
            this.config.vpcPeeringConnectionId(vpcPeeringConnectionId);
            return this;
        }

        /**
         * accepter block.
         * <p>
         * @return {@code this}
         * @param accepter accepter block. This parameter is required.
         */
        public Builder accepter(final java.util.List<? extends imports.aws.VpcPeeringConnectionOptionsAccepter> accepter) {
            this.config.accepter(accepter);
            return this;
        }

        /**
         * requester block.
         * <p>
         * @return {@code this}
         * @param requester requester block. This parameter is required.
         */
        public Builder requester(final java.util.List<? extends imports.aws.VpcPeeringConnectionOptionsRequester> requester) {
            this.config.requester(requester);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.VpcPeeringConnectionOptions}.
         */
        @Override
        public imports.aws.VpcPeeringConnectionOptions build() {
            return new imports.aws.VpcPeeringConnectionOptions(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
