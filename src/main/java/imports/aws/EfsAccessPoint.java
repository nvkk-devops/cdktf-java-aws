package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.520Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EfsAccessPoint")
public class EfsAccessPoint extends com.hashicorp.cdktf.TerraformResource {

    protected EfsAccessPoint(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EfsAccessPoint(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public EfsAccessPoint(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.EfsAccessPointConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetPosixUser() {
        software.amazon.jsii.Kernel.call(this, "resetPosixUser", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRootDirectory() {
        software.amazon.jsii.Kernel.call(this, "resetRootDirectory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileSystemArn() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileSystemIdInput() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EfsAccessPointPosixUser> getPosixUserInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EfsAccessPointPosixUser>)(software.amazon.jsii.Kernel.get(this, "posixUserInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EfsAccessPointPosixUser.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EfsAccessPointRootDirectory> getRootDirectoryInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EfsAccessPointRootDirectory>)(software.amazon.jsii.Kernel.get(this, "rootDirectoryInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EfsAccessPointRootDirectory.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileSystemId() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFileSystemId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fileSystemId", java.util.Objects.requireNonNull(value, "fileSystemId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EfsAccessPointPosixUser> getPosixUser() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "posixUser", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EfsAccessPointPosixUser.class))));
    }

    public void setPosixUser(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EfsAccessPointPosixUser> value) {
        software.amazon.jsii.Kernel.set(this, "posixUser", java.util.Objects.requireNonNull(value, "posixUser is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EfsAccessPointRootDirectory> getRootDirectory() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "rootDirectory", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EfsAccessPointRootDirectory.class))));
    }

    public void setRootDirectory(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EfsAccessPointRootDirectory> value) {
        software.amazon.jsii.Kernel.set(this, "rootDirectory", java.util.Objects.requireNonNull(value, "rootDirectory is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.EfsAccessPoint}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.EfsAccessPoint> {
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
        private final imports.aws.EfsAccessPointConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.EfsAccessPointConfig.Builder();
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
         * @param fileSystemId This parameter is required.
         */
        public Builder fileSystemId(final java.lang.String fileSystemId) {
            this.config.fileSystemId(fileSystemId);
            return this;
        }

        /**
         * posix_user block.
         * <p>
         * @return {@code this}
         * @param posixUser posix_user block. This parameter is required.
         */
        public Builder posixUser(final java.util.List<? extends imports.aws.EfsAccessPointPosixUser> posixUser) {
            this.config.posixUser(posixUser);
            return this;
        }

        /**
         * root_directory block.
         * <p>
         * @return {@code this}
         * @param rootDirectory root_directory block. This parameter is required.
         */
        public Builder rootDirectory(final java.util.List<? extends imports.aws.EfsAccessPointRootDirectory> rootDirectory) {
            this.config.rootDirectory(rootDirectory);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.EfsAccessPoint}.
         */
        @Override
        public imports.aws.EfsAccessPoint build() {
            return new imports.aws.EfsAccessPoint(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
