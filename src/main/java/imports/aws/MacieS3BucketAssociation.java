package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.709Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MacieS3BucketAssociation")
public class MacieS3BucketAssociation extends com.hashicorp.cdktf.TerraformResource {

    protected MacieS3BucketAssociation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MacieS3BucketAssociation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public MacieS3BucketAssociation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.MacieS3BucketAssociationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetClassificationType() {
        software.amazon.jsii.Kernel.call(this, "resetClassificationType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMemberAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetMemberAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketNameInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MacieS3BucketAssociationClassificationType> getClassificationTypeInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.MacieS3BucketAssociationClassificationType>)(software.amazon.jsii.Kernel.get(this, "classificationTypeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MacieS3BucketAssociationClassificationType.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMemberAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "memberAccountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketName() {
        return software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketName", java.util.Objects.requireNonNull(value, "bucketName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MacieS3BucketAssociationClassificationType> getClassificationType() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "classificationType", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MacieS3BucketAssociationClassificationType.class))));
    }

    public void setClassificationType(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.MacieS3BucketAssociationClassificationType> value) {
        software.amazon.jsii.Kernel.set(this, "classificationType", java.util.Objects.requireNonNull(value, "classificationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMemberAccountId() {
        return software.amazon.jsii.Kernel.get(this, "memberAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMemberAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "memberAccountId", java.util.Objects.requireNonNull(value, "memberAccountId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.MacieS3BucketAssociation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.MacieS3BucketAssociation> {
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
        private final imports.aws.MacieS3BucketAssociationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.MacieS3BucketAssociationConfig.Builder();
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
         * @param bucketName This parameter is required.
         */
        public Builder bucketName(final java.lang.String bucketName) {
            this.config.bucketName(bucketName);
            return this;
        }

        /**
         * classification_type block.
         * <p>
         * @return {@code this}
         * @param classificationType classification_type block. This parameter is required.
         */
        public Builder classificationType(final java.util.List<? extends imports.aws.MacieS3BucketAssociationClassificationType> classificationType) {
            this.config.classificationType(classificationType);
            return this;
        }

        /**
         * @return {@code this}
         * @param memberAccountId This parameter is required.
         */
        public Builder memberAccountId(final java.lang.String memberAccountId) {
            this.config.memberAccountId(memberAccountId);
            return this;
        }

        /**
         * @return {@code this}
         * @param prefix This parameter is required.
         */
        public Builder prefix(final java.lang.String prefix) {
            this.config.prefix(prefix);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.MacieS3BucketAssociation}.
         */
        @Override
        public imports.aws.MacieS3BucketAssociation build() {
            return new imports.aws.MacieS3BucketAssociation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
