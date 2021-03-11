package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.908Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.StoragegatewayNfsFileShare")
public class StoragegatewayNfsFileShare extends com.hashicorp.cdktf.TerraformResource {

    protected StoragegatewayNfsFileShare(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StoragegatewayNfsFileShare(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public StoragegatewayNfsFileShare(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.StoragegatewayNfsFileShareConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDefaultStorageClass() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultStorageClass", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGuessMimeTypeEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetGuessMimeTypeEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsEncrypted() {
        software.amazon.jsii.Kernel.call(this, "resetKmsEncrypted", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNfsFileShareDefaults() {
        software.amazon.jsii.Kernel.call(this, "resetNfsFileShareDefaults", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectAcl() {
        software.amazon.jsii.Kernel.call(this, "resetObjectAcl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadOnly() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnly", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequesterPays() {
        software.amazon.jsii.Kernel.call(this, "resetRequesterPays", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSquash() {
        software.amazon.jsii.Kernel.call(this, "resetSquash", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClientListInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "clientListInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileshareId() {
        return software.amazon.jsii.Kernel.get(this, "fileshareId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayArnInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocationArnInput() {
        return software.amazon.jsii.Kernel.get(this, "locationArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPath() {
        return software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultStorageClassInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultStorageClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getGuessMimeTypeEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "guessMimeTypeEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getKmsEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsEncryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> getNfsFileShareDefaultsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults>)(software.amazon.jsii.Kernel.get(this, "nfsFileShareDefaultsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectAclInput() {
        return software.amazon.jsii.Kernel.get(this, "objectAclInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRequesterPaysInput() {
        return software.amazon.jsii.Kernel.get(this, "requesterPaysInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSquashInput() {
        return software.amazon.jsii.Kernel.get(this, "squashInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.StoragegatewayNfsFileShareTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayNfsFileShareTimeouts.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClientList() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "clientList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setClientList(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "clientList", java.util.Objects.requireNonNull(value, "clientList is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultStorageClass() {
        return software.amazon.jsii.Kernel.get(this, "defaultStorageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultStorageClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultStorageClass", java.util.Objects.requireNonNull(value, "defaultStorageClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayArn() {
        return software.amazon.jsii.Kernel.get(this, "gatewayArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGatewayArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "gatewayArn", java.util.Objects.requireNonNull(value, "gatewayArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getGuessMimeTypeEnabled() {
        return software.amazon.jsii.Kernel.get(this, "guessMimeTypeEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setGuessMimeTypeEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "guessMimeTypeEnabled", java.util.Objects.requireNonNull(value, "guessMimeTypeEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getKmsEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "kmsEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setKmsEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "kmsEncrypted", java.util.Objects.requireNonNull(value, "kmsEncrypted is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocationArn() {
        return software.amazon.jsii.Kernel.get(this, "locationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocationArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "locationArn", java.util.Objects.requireNonNull(value, "locationArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> getNfsFileShareDefaults() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "nfsFileShareDefaults", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults.class))));
    }

    public void setNfsFileShareDefaults(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> value) {
        software.amazon.jsii.Kernel.set(this, "nfsFileShareDefaults", java.util.Objects.requireNonNull(value, "nfsFileShareDefaults is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectAcl() {
        return software.amazon.jsii.Kernel.get(this, "objectAcl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectAcl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectAcl", java.util.Objects.requireNonNull(value, "objectAcl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getReadOnly() {
        return software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setReadOnly(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "readOnly", java.util.Objects.requireNonNull(value, "readOnly is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRequesterPays() {
        return software.amazon.jsii.Kernel.get(this, "requesterPays", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRequesterPays(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requesterPays", java.util.Objects.requireNonNull(value, "requesterPays is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSquash() {
        return software.amazon.jsii.Kernel.get(this, "squash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSquash(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "squash", java.util.Objects.requireNonNull(value, "squash is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.StoragegatewayNfsFileShareTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayNfsFileShareTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.StoragegatewayNfsFileShareTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.StoragegatewayNfsFileShare}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.StoragegatewayNfsFileShare> {
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
        private final imports.aws.StoragegatewayNfsFileShareConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.StoragegatewayNfsFileShareConfig.Builder();
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
         * @param clientList This parameter is required.
         */
        public Builder clientList(final java.util.List<java.lang.String> clientList) {
            this.config.clientList(clientList);
            return this;
        }

        /**
         * @return {@code this}
         * @param gatewayArn This parameter is required.
         */
        public Builder gatewayArn(final java.lang.String gatewayArn) {
            this.config.gatewayArn(gatewayArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param locationArn This parameter is required.
         */
        public Builder locationArn(final java.lang.String locationArn) {
            this.config.locationArn(locationArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param roleArn This parameter is required.
         */
        public Builder roleArn(final java.lang.String roleArn) {
            this.config.roleArn(roleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultStorageClass This parameter is required.
         */
        public Builder defaultStorageClass(final java.lang.String defaultStorageClass) {
            this.config.defaultStorageClass(defaultStorageClass);
            return this;
        }

        /**
         * @return {@code this}
         * @param guessMimeTypeEnabled This parameter is required.
         */
        public Builder guessMimeTypeEnabled(final java.lang.Boolean guessMimeTypeEnabled) {
            this.config.guessMimeTypeEnabled(guessMimeTypeEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsEncrypted This parameter is required.
         */
        public Builder kmsEncrypted(final java.lang.Boolean kmsEncrypted) {
            this.config.kmsEncrypted(kmsEncrypted);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsKeyArn This parameter is required.
         */
        public Builder kmsKeyArn(final java.lang.String kmsKeyArn) {
            this.config.kmsKeyArn(kmsKeyArn);
            return this;
        }

        /**
         * nfs_file_share_defaults block.
         * <p>
         * @return {@code this}
         * @param nfsFileShareDefaults nfs_file_share_defaults block. This parameter is required.
         */
        public Builder nfsFileShareDefaults(final java.util.List<? extends imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> nfsFileShareDefaults) {
            this.config.nfsFileShareDefaults(nfsFileShareDefaults);
            return this;
        }

        /**
         * @return {@code this}
         * @param objectAcl This parameter is required.
         */
        public Builder objectAcl(final java.lang.String objectAcl) {
            this.config.objectAcl(objectAcl);
            return this;
        }

        /**
         * @return {@code this}
         * @param readOnly This parameter is required.
         */
        public Builder readOnly(final java.lang.Boolean readOnly) {
            this.config.readOnly(readOnly);
            return this;
        }

        /**
         * @return {@code this}
         * @param requesterPays This parameter is required.
         */
        public Builder requesterPays(final java.lang.Boolean requesterPays) {
            this.config.requesterPays(requesterPays);
            return this;
        }

        /**
         * @return {@code this}
         * @param squash This parameter is required.
         */
        public Builder squash(final java.lang.String squash) {
            this.config.squash(squash);
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
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.StoragegatewayNfsFileShareTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.StoragegatewayNfsFileShare}.
         */
        @Override
        public imports.aws.StoragegatewayNfsFileShare build() {
            return new imports.aws.StoragegatewayNfsFileShare(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
