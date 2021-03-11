package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.526Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EfsFileSystem")
public class EfsFileSystem extends com.hashicorp.cdktf.TerraformResource {

    protected EfsFileSystem(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EfsFileSystem(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public EfsFileSystem(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.EfsFileSystemConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public EfsFileSystem(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetCreationToken() {
        software.amazon.jsii.Kernel.call(this, "resetCreationToken", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncrypted() {
        software.amazon.jsii.Kernel.call(this, "resetEncrypted", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLifecyclePolicy() {
        software.amazon.jsii.Kernel.call(this, "resetLifecyclePolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPerformanceMode() {
        software.amazon.jsii.Kernel.call(this, "resetPerformanceMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProvisionedThroughputInMibps() {
        software.amazon.jsii.Kernel.call(this, "resetProvisionedThroughputInMibps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReferenceName() {
        software.amazon.jsii.Kernel.call(this, "resetReferenceName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThroughputMode() {
        software.amazon.jsii.Kernel.call(this, "resetThroughputMode", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCreationTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "creationTokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EfsFileSystemLifecyclePolicy> getLifecyclePolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.EfsFileSystemLifecyclePolicy>)(software.amazon.jsii.Kernel.get(this, "lifecyclePolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EfsFileSystemLifecyclePolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPerformanceModeInput() {
        return software.amazon.jsii.Kernel.get(this, "performanceModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getProvisionedThroughputInMibpsInput() {
        return software.amazon.jsii.Kernel.get(this, "provisionedThroughputInMibpsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReferenceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "referenceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThroughputModeInput() {
        return software.amazon.jsii.Kernel.get(this, "throughputModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreationToken() {
        return software.amazon.jsii.Kernel.get(this, "creationToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCreationToken(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "creationToken", java.util.Objects.requireNonNull(value, "creationToken is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "encrypted", java.util.Objects.requireNonNull(value, "encrypted is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EfsFileSystemLifecyclePolicy> getLifecyclePolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lifecyclePolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EfsFileSystemLifecyclePolicy.class))));
    }

    public void setLifecyclePolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EfsFileSystemLifecyclePolicy> value) {
        software.amazon.jsii.Kernel.set(this, "lifecyclePolicy", java.util.Objects.requireNonNull(value, "lifecyclePolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPerformanceMode() {
        return software.amazon.jsii.Kernel.get(this, "performanceMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPerformanceMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "performanceMode", java.util.Objects.requireNonNull(value, "performanceMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getProvisionedThroughputInMibps() {
        return software.amazon.jsii.Kernel.get(this, "provisionedThroughputInMibps", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setProvisionedThroughputInMibps(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "provisionedThroughputInMibps", java.util.Objects.requireNonNull(value, "provisionedThroughputInMibps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReferenceName() {
        return software.amazon.jsii.Kernel.get(this, "referenceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReferenceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "referenceName", java.util.Objects.requireNonNull(value, "referenceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThroughputMode() {
        return software.amazon.jsii.Kernel.get(this, "throughputMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThroughputMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "throughputMode", java.util.Objects.requireNonNull(value, "throughputMode is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.EfsFileSystem}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.EfsFileSystem> {
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
        private imports.aws.EfsFileSystemConfig.Builder config;

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
         * @param creationToken This parameter is required.
         */
        public Builder creationToken(final java.lang.String creationToken) {
            this.config().creationToken(creationToken);
            return this;
        }

        /**
         * @return {@code this}
         * @param encrypted This parameter is required.
         */
        public Builder encrypted(final java.lang.Boolean encrypted) {
            this.config().encrypted(encrypted);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsKeyId This parameter is required.
         */
        public Builder kmsKeyId(final java.lang.String kmsKeyId) {
            this.config().kmsKeyId(kmsKeyId);
            return this;
        }

        /**
         * lifecycle_policy block.
         * <p>
         * @return {@code this}
         * @param lifecyclePolicy lifecycle_policy block. This parameter is required.
         */
        public Builder lifecyclePolicy(final java.util.List<? extends imports.aws.EfsFileSystemLifecyclePolicy> lifecyclePolicy) {
            this.config().lifecyclePolicy(lifecyclePolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param performanceMode This parameter is required.
         */
        public Builder performanceMode(final java.lang.String performanceMode) {
            this.config().performanceMode(performanceMode);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisionedThroughputInMibps This parameter is required.
         */
        public Builder provisionedThroughputInMibps(final java.lang.Number provisionedThroughputInMibps) {
            this.config().provisionedThroughputInMibps(provisionedThroughputInMibps);
            return this;
        }

        /**
         * @return {@code this}
         * @param referenceName This parameter is required.
         */
        public Builder referenceName(final java.lang.String referenceName) {
            this.config().referenceName(referenceName);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * @return {@code this}
         * @param throughputMode This parameter is required.
         */
        public Builder throughputMode(final java.lang.String throughputMode) {
            this.config().throughputMode(throughputMode);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.EfsFileSystem}.
         */
        @Override
        public imports.aws.EfsFileSystem build() {
            return new imports.aws.EfsFileSystem(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.EfsFileSystemConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.EfsFileSystemConfig.Builder();
            }
            return this.config;
        }
    }
}
