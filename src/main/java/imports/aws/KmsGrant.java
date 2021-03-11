package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.669Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KmsGrant")
public class KmsGrant extends com.hashicorp.cdktf.TerraformResource {

    protected KmsGrant(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KmsGrant(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public KmsGrant(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.KmsGrantConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetConstraints() {
        software.amazon.jsii.Kernel.call(this, "resetConstraints", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGrantCreationTokens() {
        software.amazon.jsii.Kernel.call(this, "resetGrantCreationTokens", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetireOnDelete() {
        software.amazon.jsii.Kernel.call(this, "resetRetireOnDelete", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetiringPrincipal() {
        software.amazon.jsii.Kernel.call(this, "resetRetiringPrincipal", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGranteePrincipalInput() {
        return software.amazon.jsii.Kernel.get(this, "granteePrincipalInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGrantId() {
        return software.amazon.jsii.Kernel.get(this, "grantId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGrantToken() {
        return software.amazon.jsii.Kernel.get(this, "grantToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "keyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOperationsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "operationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KmsGrantConstraints> getConstraintsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.KmsGrantConstraints>)(software.amazon.jsii.Kernel.get(this, "constraintsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KmsGrantConstraints.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGrantCreationTokensInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "grantCreationTokensInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRetireOnDeleteInput() {
        return software.amazon.jsii.Kernel.get(this, "retireOnDeleteInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRetiringPrincipalInput() {
        return software.amazon.jsii.Kernel.get(this, "retiringPrincipalInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KmsGrantConstraints> getConstraints() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "constraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KmsGrantConstraints.class))));
    }

    public void setConstraints(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KmsGrantConstraints> value) {
        software.amazon.jsii.Kernel.set(this, "constraints", java.util.Objects.requireNonNull(value, "constraints is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getGrantCreationTokens() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "grantCreationTokens", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setGrantCreationTokens(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "grantCreationTokens", java.util.Objects.requireNonNull(value, "grantCreationTokens is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGranteePrincipal() {
        return software.amazon.jsii.Kernel.get(this, "granteePrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGranteePrincipal(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "granteePrincipal", java.util.Objects.requireNonNull(value, "granteePrincipal is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyId() {
        return software.amazon.jsii.Kernel.get(this, "keyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyId", java.util.Objects.requireNonNull(value, "keyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOperations() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "operations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setOperations(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "operations", java.util.Objects.requireNonNull(value, "operations is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRetireOnDelete() {
        return software.amazon.jsii.Kernel.get(this, "retireOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRetireOnDelete(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "retireOnDelete", java.util.Objects.requireNonNull(value, "retireOnDelete is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRetiringPrincipal() {
        return software.amazon.jsii.Kernel.get(this, "retiringPrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRetiringPrincipal(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "retiringPrincipal", java.util.Objects.requireNonNull(value, "retiringPrincipal is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.KmsGrant}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.KmsGrant> {
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
        private final imports.aws.KmsGrantConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.KmsGrantConfig.Builder();
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
         * @param granteePrincipal This parameter is required.
         */
        public Builder granteePrincipal(final java.lang.String granteePrincipal) {
            this.config.granteePrincipal(granteePrincipal);
            return this;
        }

        /**
         * @return {@code this}
         * @param keyId This parameter is required.
         */
        public Builder keyId(final java.lang.String keyId) {
            this.config.keyId(keyId);
            return this;
        }

        /**
         * @return {@code this}
         * @param operations This parameter is required.
         */
        public Builder operations(final java.util.List<java.lang.String> operations) {
            this.config.operations(operations);
            return this;
        }

        /**
         * constraints block.
         * <p>
         * @return {@code this}
         * @param constraints constraints block. This parameter is required.
         */
        public Builder constraints(final java.util.List<? extends imports.aws.KmsGrantConstraints> constraints) {
            this.config.constraints(constraints);
            return this;
        }

        /**
         * @return {@code this}
         * @param grantCreationTokens This parameter is required.
         */
        public Builder grantCreationTokens(final java.util.List<java.lang.String> grantCreationTokens) {
            this.config.grantCreationTokens(grantCreationTokens);
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
         * @return {@code this}
         * @param retireOnDelete This parameter is required.
         */
        public Builder retireOnDelete(final java.lang.Boolean retireOnDelete) {
            this.config.retireOnDelete(retireOnDelete);
            return this;
        }

        /**
         * @return {@code this}
         * @param retiringPrincipal This parameter is required.
         */
        public Builder retiringPrincipal(final java.lang.String retiringPrincipal) {
            this.config.retiringPrincipal(retiringPrincipal);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.KmsGrant}.
         */
        @Override
        public imports.aws.KmsGrant build() {
            return new imports.aws.KmsGrant(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
