package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.268Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsDbSnapshot")
public class DataAwsDbSnapshot extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsDbSnapshot(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsDbSnapshot(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsDbSnapshot(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsDbSnapshotConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsDbSnapshot(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetDbInstanceIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetDbInstanceIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDbSnapshotIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetDbSnapshotIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludePublic() {
        software.amazon.jsii.Kernel.call(this, "resetIncludePublic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeShared() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeShared", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMostRecent() {
        software.amazon.jsii.Kernel.call(this, "resetMostRecent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotType() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotType", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAllocatedStorage() {
        return software.amazon.jsii.Kernel.get(this, "allocatedStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbSnapshotArn() {
        return software.amazon.jsii.Kernel.get(this, "dbSnapshotArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngine() {
        return software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getIops() {
        return software.amazon.jsii.Kernel.get(this, "iops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLicenseModel() {
        return software.amazon.jsii.Kernel.get(this, "licenseModel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOptionGroupName() {
        return software.amazon.jsii.Kernel.get(this, "optionGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotCreateTime() {
        return software.amazon.jsii.Kernel.get(this, "snapshotCreateTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceDbSnapshotIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "sourceDbSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceRegion() {
        return software.amazon.jsii.Kernel.get(this, "sourceRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageType() {
        return software.amazon.jsii.Kernel.get(this, "storageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDbInstanceIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "dbInstanceIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDbSnapshotIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "dbSnapshotIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludePublicInput() {
        return software.amazon.jsii.Kernel.get(this, "includePublicInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeSharedInput() {
        return software.amazon.jsii.Kernel.get(this, "includeSharedInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getMostRecentInput() {
        return software.amazon.jsii.Kernel.get(this, "mostRecentInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnapshotTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "snapshotTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbInstanceIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "dbInstanceIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDbInstanceIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dbInstanceIdentifier", java.util.Objects.requireNonNull(value, "dbInstanceIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbSnapshotIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "dbSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDbSnapshotIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dbSnapshotIdentifier", java.util.Objects.requireNonNull(value, "dbSnapshotIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIncludePublic() {
        return software.amazon.jsii.Kernel.get(this, "includePublic", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIncludePublic(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includePublic", java.util.Objects.requireNonNull(value, "includePublic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIncludeShared() {
        return software.amazon.jsii.Kernel.get(this, "includeShared", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIncludeShared(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeShared", java.util.Objects.requireNonNull(value, "includeShared is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getMostRecent() {
        return software.amazon.jsii.Kernel.get(this, "mostRecent", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setMostRecent(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "mostRecent", java.util.Objects.requireNonNull(value, "mostRecent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotType() {
        return software.amazon.jsii.Kernel.get(this, "snapshotType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnapshotType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snapshotType", java.util.Objects.requireNonNull(value, "snapshotType is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsDbSnapshot}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsDbSnapshot> {
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
        private imports.aws.DataAwsDbSnapshotConfig.Builder config;

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
         * @param dbInstanceIdentifier This parameter is required.
         */
        public Builder dbInstanceIdentifier(final java.lang.String dbInstanceIdentifier) {
            this.config().dbInstanceIdentifier(dbInstanceIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param dbSnapshotIdentifier This parameter is required.
         */
        public Builder dbSnapshotIdentifier(final java.lang.String dbSnapshotIdentifier) {
            this.config().dbSnapshotIdentifier(dbSnapshotIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param includePublic This parameter is required.
         */
        public Builder includePublic(final java.lang.Boolean includePublic) {
            this.config().includePublic(includePublic);
            return this;
        }

        /**
         * @return {@code this}
         * @param includeShared This parameter is required.
         */
        public Builder includeShared(final java.lang.Boolean includeShared) {
            this.config().includeShared(includeShared);
            return this;
        }

        /**
         * @return {@code this}
         * @param mostRecent This parameter is required.
         */
        public Builder mostRecent(final java.lang.Boolean mostRecent) {
            this.config().mostRecent(mostRecent);
            return this;
        }

        /**
         * @return {@code this}
         * @param snapshotType This parameter is required.
         */
        public Builder snapshotType(final java.lang.String snapshotType) {
            this.config().snapshotType(snapshotType);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsDbSnapshot}.
         */
        @Override
        public imports.aws.DataAwsDbSnapshot build() {
            return new imports.aws.DataAwsDbSnapshot(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsDbSnapshotConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsDbSnapshotConfig.Builder();
            }
            return this.config;
        }
    }
}
