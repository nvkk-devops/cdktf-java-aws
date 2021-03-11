package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.310Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsIamPolicyDocument")
public class DataAwsIamPolicyDocument extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsIamPolicyDocument(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsIamPolicyDocument(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsIamPolicyDocument(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsIamPolicyDocumentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsIamPolicyDocument(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetOverrideJson() {
        software.amazon.jsii.Kernel.call(this, "resetOverrideJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyId() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceJson() {
        software.amazon.jsii.Kernel.call(this, "resetSourceJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatement() {
        software.amazon.jsii.Kernel.call(this, "resetStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetVersion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getJson() {
        return software.amazon.jsii.Kernel.get(this, "json", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOverrideJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "overrideJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "policyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement> getStatementInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement>)(software.amazon.jsii.Kernel.get(this, "statementInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsIamPolicyDocumentStatement.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOverrideJson() {
        return software.amazon.jsii.Kernel.get(this, "overrideJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOverrideJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "overrideJson", java.util.Objects.requireNonNull(value, "overrideJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyId() {
        return software.amazon.jsii.Kernel.get(this, "policyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyId", java.util.Objects.requireNonNull(value, "policyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceJson() {
        return software.amazon.jsii.Kernel.get(this, "sourceJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceJson", java.util.Objects.requireNonNull(value, "sourceJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement> getStatement() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsIamPolicyDocumentStatement.class))));
    }

    public void setStatement(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement> value) {
        software.amazon.jsii.Kernel.set(this, "statement", java.util.Objects.requireNonNull(value, "statement is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsIamPolicyDocument}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsIamPolicyDocument> {
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
        private imports.aws.DataAwsIamPolicyDocumentConfig.Builder config;

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
         * @param overrideJson This parameter is required.
         */
        public Builder overrideJson(final java.lang.String overrideJson) {
            this.config().overrideJson(overrideJson);
            return this;
        }

        /**
         * @return {@code this}
         * @param policyId This parameter is required.
         */
        public Builder policyId(final java.lang.String policyId) {
            this.config().policyId(policyId);
            return this;
        }

        /**
         * @return {@code this}
         * @param sourceJson This parameter is required.
         */
        public Builder sourceJson(final java.lang.String sourceJson) {
            this.config().sourceJson(sourceJson);
            return this;
        }

        /**
         * statement block.
         * <p>
         * @return {@code this}
         * @param statement statement block. This parameter is required.
         */
        public Builder statement(final java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatement> statement) {
            this.config().statement(statement);
            return this;
        }

        /**
         * @return {@code this}
         * @param version This parameter is required.
         */
        public Builder version(final java.lang.String version) {
            this.config().version(version);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsIamPolicyDocument}.
         */
        @Override
        public imports.aws.DataAwsIamPolicyDocument build() {
            return new imports.aws.DataAwsIamPolicyDocument(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsIamPolicyDocumentConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsIamPolicyDocumentConfig.Builder();
            }
            return this.config;
        }
    }
}
