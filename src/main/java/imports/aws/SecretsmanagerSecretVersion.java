package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.851Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SecretsmanagerSecretVersion")
public class SecretsmanagerSecretVersion extends com.hashicorp.cdktf.TerraformResource {

    protected SecretsmanagerSecretVersion(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SecretsmanagerSecretVersion(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SecretsmanagerSecretVersion(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SecretsmanagerSecretVersionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetSecretBinary() {
        software.amazon.jsii.Kernel.call(this, "resetSecretBinary", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretString() {
        software.amazon.jsii.Kernel.call(this, "resetSecretString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersionStages() {
        software.amazon.jsii.Kernel.call(this, "resetVersionStages", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretIdInput() {
        return software.amazon.jsii.Kernel.get(this, "secretIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionId() {
        return software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretBinaryInput() {
        return software.amazon.jsii.Kernel.get(this, "secretBinaryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretStringInput() {
        return software.amazon.jsii.Kernel.get(this, "secretStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVersionStagesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "versionStagesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretBinary() {
        return software.amazon.jsii.Kernel.get(this, "secretBinary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretBinary(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretBinary", java.util.Objects.requireNonNull(value, "secretBinary is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretId() {
        return software.amazon.jsii.Kernel.get(this, "secretId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretId", java.util.Objects.requireNonNull(value, "secretId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretString() {
        return software.amazon.jsii.Kernel.get(this, "secretString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretString", java.util.Objects.requireNonNull(value, "secretString is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVersionStages() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "versionStages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVersionStages(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "versionStages", java.util.Objects.requireNonNull(value, "versionStages is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SecretsmanagerSecretVersion}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SecretsmanagerSecretVersion> {
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
        private final imports.aws.SecretsmanagerSecretVersionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SecretsmanagerSecretVersionConfig.Builder();
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
         * @param secretId This parameter is required.
         */
        public Builder secretId(final java.lang.String secretId) {
            this.config.secretId(secretId);
            return this;
        }

        /**
         * @return {@code this}
         * @param secretBinary This parameter is required.
         */
        public Builder secretBinary(final java.lang.String secretBinary) {
            this.config.secretBinary(secretBinary);
            return this;
        }

        /**
         * @return {@code this}
         * @param secretString This parameter is required.
         */
        public Builder secretString(final java.lang.String secretString) {
            this.config.secretString(secretString);
            return this;
        }

        /**
         * @return {@code this}
         * @param versionStages This parameter is required.
         */
        public Builder versionStages(final java.util.List<java.lang.String> versionStages) {
            this.config.versionStages(versionStages);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SecretsmanagerSecretVersion}.
         */
        @Override
        public imports.aws.SecretsmanagerSecretVersion build() {
            return new imports.aws.SecretsmanagerSecretVersion(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
