package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.447Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsReplicationTask")
public class DmsReplicationTask extends com.hashicorp.cdktf.TerraformResource {

    protected DmsReplicationTask(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DmsReplicationTask(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DmsReplicationTask(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DmsReplicationTaskConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCdcStartTime() {
        software.amazon.jsii.Kernel.call(this, "resetCdcStartTime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplicationTaskSettings() {
        software.amazon.jsii.Kernel.call(this, "resetReplicationTaskSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMigrationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "migrationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicationInstanceArnInput() {
        return software.amazon.jsii.Kernel.get(this, "replicationInstanceArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicationTaskArn() {
        return software.amazon.jsii.Kernel.get(this, "replicationTaskArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicationTaskIdInput() {
        return software.amazon.jsii.Kernel.get(this, "replicationTaskIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceEndpointArnInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceEndpointArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableMappingsInput() {
        return software.amazon.jsii.Kernel.get(this, "tableMappingsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetEndpointArnInput() {
        return software.amazon.jsii.Kernel.get(this, "targetEndpointArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCdcStartTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "cdcStartTimeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReplicationTaskSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "replicationTaskSettingsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCdcStartTime() {
        return software.amazon.jsii.Kernel.get(this, "cdcStartTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCdcStartTime(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cdcStartTime", java.util.Objects.requireNonNull(value, "cdcStartTime is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMigrationType() {
        return software.amazon.jsii.Kernel.get(this, "migrationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMigrationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "migrationType", java.util.Objects.requireNonNull(value, "migrationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicationInstanceArn() {
        return software.amazon.jsii.Kernel.get(this, "replicationInstanceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReplicationInstanceArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "replicationInstanceArn", java.util.Objects.requireNonNull(value, "replicationInstanceArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicationTaskId() {
        return software.amazon.jsii.Kernel.get(this, "replicationTaskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReplicationTaskId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "replicationTaskId", java.util.Objects.requireNonNull(value, "replicationTaskId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicationTaskSettings() {
        return software.amazon.jsii.Kernel.get(this, "replicationTaskSettings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReplicationTaskSettings(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "replicationTaskSettings", java.util.Objects.requireNonNull(value, "replicationTaskSettings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceEndpointArn() {
        return software.amazon.jsii.Kernel.get(this, "sourceEndpointArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceEndpointArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceEndpointArn", java.util.Objects.requireNonNull(value, "sourceEndpointArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableMappings() {
        return software.amazon.jsii.Kernel.get(this, "tableMappings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTableMappings(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tableMappings", java.util.Objects.requireNonNull(value, "tableMappings is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetEndpointArn() {
        return software.amazon.jsii.Kernel.get(this, "targetEndpointArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetEndpointArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetEndpointArn", java.util.Objects.requireNonNull(value, "targetEndpointArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DmsReplicationTask}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DmsReplicationTask> {
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
        private final imports.aws.DmsReplicationTaskConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DmsReplicationTaskConfig.Builder();
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
         * @param migrationType This parameter is required.
         */
        public Builder migrationType(final java.lang.String migrationType) {
            this.config.migrationType(migrationType);
            return this;
        }

        /**
         * @return {@code this}
         * @param replicationInstanceArn This parameter is required.
         */
        public Builder replicationInstanceArn(final java.lang.String replicationInstanceArn) {
            this.config.replicationInstanceArn(replicationInstanceArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param replicationTaskId This parameter is required.
         */
        public Builder replicationTaskId(final java.lang.String replicationTaskId) {
            this.config.replicationTaskId(replicationTaskId);
            return this;
        }

        /**
         * @return {@code this}
         * @param sourceEndpointArn This parameter is required.
         */
        public Builder sourceEndpointArn(final java.lang.String sourceEndpointArn) {
            this.config.sourceEndpointArn(sourceEndpointArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param tableMappings This parameter is required.
         */
        public Builder tableMappings(final java.lang.String tableMappings) {
            this.config.tableMappings(tableMappings);
            return this;
        }

        /**
         * @return {@code this}
         * @param targetEndpointArn This parameter is required.
         */
        public Builder targetEndpointArn(final java.lang.String targetEndpointArn) {
            this.config.targetEndpointArn(targetEndpointArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param cdcStartTime This parameter is required.
         */
        public Builder cdcStartTime(final java.lang.String cdcStartTime) {
            this.config.cdcStartTime(cdcStartTime);
            return this;
        }

        /**
         * @return {@code this}
         * @param replicationTaskSettings This parameter is required.
         */
        public Builder replicationTaskSettings(final java.lang.String replicationTaskSettings) {
            this.config.replicationTaskSettings(replicationTaskSettings);
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
         * @returns a newly built instance of {@link imports.aws.DmsReplicationTask}.
         */
        @Override
        public imports.aws.DmsReplicationTask build() {
            return new imports.aws.DmsReplicationTask(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
