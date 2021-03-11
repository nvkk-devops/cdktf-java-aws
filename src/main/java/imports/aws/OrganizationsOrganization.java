package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.777Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OrganizationsOrganization")
public class OrganizationsOrganization extends com.hashicorp.cdktf.TerraformResource {

    protected OrganizationsOrganization(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OrganizationsOrganization(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public OrganizationsOrganization(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.OrganizationsOrganizationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public OrganizationsOrganization(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.OrganizationsOrganizationAccounts accounts(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "accounts", software.amazon.jsii.NativeType.forClass(imports.aws.OrganizationsOrganizationAccounts.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.OrganizationsOrganizationNonMasterAccounts nonMasterAccounts(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "nonMasterAccounts", software.amazon.jsii.NativeType.forClass(imports.aws.OrganizationsOrganizationNonMasterAccounts.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    public void resetAwsServiceAccessPrincipals() {
        software.amazon.jsii.Kernel.call(this, "resetAwsServiceAccessPrincipals", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabledPolicyTypes() {
        software.amazon.jsii.Kernel.call(this, "resetEnabledPolicyTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFeatureSet() {
        software.amazon.jsii.Kernel.call(this, "resetFeatureSet", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.OrganizationsOrganizationRoots roots(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "roots", software.amazon.jsii.NativeType.forClass(imports.aws.OrganizationsOrganizationRoots.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterAccountArn() {
        return software.amazon.jsii.Kernel.get(this, "masterAccountArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterAccountEmail() {
        return software.amazon.jsii.Kernel.get(this, "masterAccountEmail", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMasterAccountId() {
        return software.amazon.jsii.Kernel.get(this, "masterAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAwsServiceAccessPrincipalsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "awsServiceAccessPrincipalsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledPolicyTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "enabledPolicyTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFeatureSetInput() {
        return software.amazon.jsii.Kernel.get(this, "featureSetInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAwsServiceAccessPrincipals() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "awsServiceAccessPrincipals", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAwsServiceAccessPrincipals(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "awsServiceAccessPrincipals", java.util.Objects.requireNonNull(value, "awsServiceAccessPrincipals is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEnabledPolicyTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "enabledPolicyTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setEnabledPolicyTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "enabledPolicyTypes", java.util.Objects.requireNonNull(value, "enabledPolicyTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFeatureSet() {
        return software.amazon.jsii.Kernel.get(this, "featureSet", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFeatureSet(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "featureSet", java.util.Objects.requireNonNull(value, "featureSet is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.OrganizationsOrganization}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.OrganizationsOrganization> {
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
        private imports.aws.OrganizationsOrganizationConfig.Builder config;

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
         * @param awsServiceAccessPrincipals This parameter is required.
         */
        public Builder awsServiceAccessPrincipals(final java.util.List<java.lang.String> awsServiceAccessPrincipals) {
            this.config().awsServiceAccessPrincipals(awsServiceAccessPrincipals);
            return this;
        }

        /**
         * @return {@code this}
         * @param enabledPolicyTypes This parameter is required.
         */
        public Builder enabledPolicyTypes(final java.util.List<java.lang.String> enabledPolicyTypes) {
            this.config().enabledPolicyTypes(enabledPolicyTypes);
            return this;
        }

        /**
         * @return {@code this}
         * @param featureSet This parameter is required.
         */
        public Builder featureSet(final java.lang.String featureSet) {
            this.config().featureSet(featureSet);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.OrganizationsOrganization}.
         */
        @Override
        public imports.aws.OrganizationsOrganization build() {
            return new imports.aws.OrganizationsOrganization(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.OrganizationsOrganizationConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.OrganizationsOrganizationConfig.Builder();
            }
            return this.config;
        }
    }
}
