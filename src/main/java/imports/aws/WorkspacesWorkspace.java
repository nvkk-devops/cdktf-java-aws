package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.244Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WorkspacesWorkspace")
public class WorkspacesWorkspace extends com.hashicorp.cdktf.TerraformResource {

    protected WorkspacesWorkspace(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WorkspacesWorkspace(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public WorkspacesWorkspace(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.WorkspacesWorkspaceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetRootVolumeEncryptionEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetRootVolumeEncryptionEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserVolumeEncryptionEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetUserVolumeEncryptionEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeEncryptionKey() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeEncryptionKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWorkspaceProperties() {
        software.amazon.jsii.Kernel.call(this, "resetWorkspaceProperties", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBundleIdInput() {
        return software.amazon.jsii.Kernel.get(this, "bundleIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComputerName() {
        return software.amazon.jsii.Kernel.get(this, "computerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectoryIdInput() {
        return software.amazon.jsii.Kernel.get(this, "directoryIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "ipAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserNameInput() {
        return software.amazon.jsii.Kernel.get(this, "userNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRootVolumeEncryptionEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "rootVolumeEncryptionEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUserVolumeEncryptionEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "userVolumeEncryptionEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVolumeEncryptionKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeEncryptionKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties> getWorkspacePropertiesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties>)(software.amazon.jsii.Kernel.get(this, "workspacePropertiesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorkspacesWorkspaceWorkspaceProperties.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBundleId() {
        return software.amazon.jsii.Kernel.get(this, "bundleId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBundleId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bundleId", java.util.Objects.requireNonNull(value, "bundleId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectoryId() {
        return software.amazon.jsii.Kernel.get(this, "directoryId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDirectoryId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "directoryId", java.util.Objects.requireNonNull(value, "directoryId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRootVolumeEncryptionEnabled() {
        return software.amazon.jsii.Kernel.get(this, "rootVolumeEncryptionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRootVolumeEncryptionEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "rootVolumeEncryptionEnabled", java.util.Objects.requireNonNull(value, "rootVolumeEncryptionEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserName() {
        return software.amazon.jsii.Kernel.get(this, "userName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userName", java.util.Objects.requireNonNull(value, "userName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getUserVolumeEncryptionEnabled() {
        return software.amazon.jsii.Kernel.get(this, "userVolumeEncryptionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUserVolumeEncryptionEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "userVolumeEncryptionEnabled", java.util.Objects.requireNonNull(value, "userVolumeEncryptionEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeEncryptionKey() {
        return software.amazon.jsii.Kernel.get(this, "volumeEncryptionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVolumeEncryptionKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "volumeEncryptionKey", java.util.Objects.requireNonNull(value, "volumeEncryptionKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties> getWorkspaceProperties() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "workspaceProperties", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorkspacesWorkspaceWorkspaceProperties.class))));
    }

    public void setWorkspaceProperties(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties> value) {
        software.amazon.jsii.Kernel.set(this, "workspaceProperties", java.util.Objects.requireNonNull(value, "workspaceProperties is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.WorkspacesWorkspace}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.WorkspacesWorkspace> {
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
        private final imports.aws.WorkspacesWorkspaceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.WorkspacesWorkspaceConfig.Builder();
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
         * @param bundleId This parameter is required.
         */
        public Builder bundleId(final java.lang.String bundleId) {
            this.config.bundleId(bundleId);
            return this;
        }

        /**
         * @return {@code this}
         * @param directoryId This parameter is required.
         */
        public Builder directoryId(final java.lang.String directoryId) {
            this.config.directoryId(directoryId);
            return this;
        }

        /**
         * @return {@code this}
         * @param userName This parameter is required.
         */
        public Builder userName(final java.lang.String userName) {
            this.config.userName(userName);
            return this;
        }

        /**
         * @return {@code this}
         * @param rootVolumeEncryptionEnabled This parameter is required.
         */
        public Builder rootVolumeEncryptionEnabled(final java.lang.Boolean rootVolumeEncryptionEnabled) {
            this.config.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled);
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
         * @return {@code this}
         * @param userVolumeEncryptionEnabled This parameter is required.
         */
        public Builder userVolumeEncryptionEnabled(final java.lang.Boolean userVolumeEncryptionEnabled) {
            this.config.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param volumeEncryptionKey This parameter is required.
         */
        public Builder volumeEncryptionKey(final java.lang.String volumeEncryptionKey) {
            this.config.volumeEncryptionKey(volumeEncryptionKey);
            return this;
        }

        /**
         * workspace_properties block.
         * <p>
         * @return {@code this}
         * @param workspaceProperties workspace_properties block. This parameter is required.
         */
        public Builder workspaceProperties(final java.util.List<? extends imports.aws.WorkspacesWorkspaceWorkspaceProperties> workspaceProperties) {
            this.config.workspaceProperties(workspaceProperties);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.WorkspacesWorkspace}.
         */
        @Override
        public imports.aws.WorkspacesWorkspace build() {
            return new imports.aws.WorkspacesWorkspace(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
