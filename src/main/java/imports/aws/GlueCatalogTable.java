package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.589Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueCatalogTable")
public class GlueCatalogTable extends com.hashicorp.cdktf.TerraformResource {

    protected GlueCatalogTable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCatalogTable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GlueCatalogTable(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GlueCatalogTableConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCatalogId() {
        software.amazon.jsii.Kernel.call(this, "resetCatalogId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOwner() {
        software.amazon.jsii.Kernel.call(this, "resetOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameters() {
        software.amazon.jsii.Kernel.call(this, "resetParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPartitionKeys() {
        software.amazon.jsii.Kernel.call(this, "resetPartitionKeys", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetention() {
        software.amazon.jsii.Kernel.call(this, "resetRetention", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageDescriptor() {
        software.amazon.jsii.Kernel.call(this, "resetStorageDescriptor", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTableType() {
        software.amazon.jsii.Kernel.call(this, "resetTableType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetViewExpandedText() {
        software.amazon.jsii.Kernel.call(this, "resetViewExpandedText", software.amazon.jsii.NativeType.VOID);
    }

    public void resetViewOriginalText() {
        software.amazon.jsii.Kernel.call(this, "resetViewOriginalText", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCatalogIdInput() {
        return software.amazon.jsii.Kernel.get(this, "catalogIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParametersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "parametersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTablePartitionKeys> getPartitionKeysInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueCatalogTablePartitionKeys>)(software.amazon.jsii.Kernel.get(this, "partitionKeysInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTablePartitionKeys.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRetentionInput() {
        return software.amazon.jsii.Kernel.get(this, "retentionInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTableStorageDescriptor> getStorageDescriptorInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueCatalogTableStorageDescriptor>)(software.amazon.jsii.Kernel.get(this, "storageDescriptorInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTableStorageDescriptor.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTableTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "tableTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getViewExpandedTextInput() {
        return software.amazon.jsii.Kernel.get(this, "viewExpandedTextInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getViewOriginalTextInput() {
        return software.amazon.jsii.Kernel.get(this, "viewOriginalTextInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCatalogId() {
        return software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCatalogId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "catalogId", java.util.Objects.requireNonNull(value, "catalogId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "databaseName", java.util.Objects.requireNonNull(value, "databaseName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwner() {
        return software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwner(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "owner", java.util.Objects.requireNonNull(value, "owner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setParameters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "parameters", java.util.Objects.requireNonNull(value, "parameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCatalogTablePartitionKeys> getPartitionKeys() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "partitionKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTablePartitionKeys.class))));
    }

    public void setPartitionKeys(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCatalogTablePartitionKeys> value) {
        software.amazon.jsii.Kernel.set(this, "partitionKeys", java.util.Objects.requireNonNull(value, "partitionKeys is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRetention() {
        return software.amazon.jsii.Kernel.get(this, "retention", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRetention(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "retention", java.util.Objects.requireNonNull(value, "retention is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCatalogTableStorageDescriptor> getStorageDescriptor() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "storageDescriptor", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTableStorageDescriptor.class))));
    }

    public void setStorageDescriptor(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCatalogTableStorageDescriptor> value) {
        software.amazon.jsii.Kernel.set(this, "storageDescriptor", java.util.Objects.requireNonNull(value, "storageDescriptor is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableType() {
        return software.amazon.jsii.Kernel.get(this, "tableType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTableType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tableType", java.util.Objects.requireNonNull(value, "tableType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getViewExpandedText() {
        return software.amazon.jsii.Kernel.get(this, "viewExpandedText", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setViewExpandedText(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "viewExpandedText", java.util.Objects.requireNonNull(value, "viewExpandedText is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getViewOriginalText() {
        return software.amazon.jsii.Kernel.get(this, "viewOriginalText", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setViewOriginalText(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "viewOriginalText", java.util.Objects.requireNonNull(value, "viewOriginalText is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GlueCatalogTable}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GlueCatalogTable> {
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
        private final imports.aws.GlueCatalogTableConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GlueCatalogTableConfig.Builder();
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
         * @param databaseName This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param catalogId This parameter is required.
         */
        public Builder catalogId(final java.lang.String catalogId) {
            this.config.catalogId(catalogId);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * @return {@code this}
         * @param owner This parameter is required.
         */
        public Builder owner(final java.lang.String owner) {
            this.config.owner(owner);
            return this;
        }

        /**
         * @return {@code this}
         * @param parameters This parameter is required.
         */
        public Builder parameters(final java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.config.parameters(parameters);
            return this;
        }

        /**
         * partition_keys block.
         * <p>
         * @return {@code this}
         * @param partitionKeys partition_keys block. This parameter is required.
         */
        public Builder partitionKeys(final java.util.List<? extends imports.aws.GlueCatalogTablePartitionKeys> partitionKeys) {
            this.config.partitionKeys(partitionKeys);
            return this;
        }

        /**
         * @return {@code this}
         * @param retention This parameter is required.
         */
        public Builder retention(final java.lang.Number retention) {
            this.config.retention(retention);
            return this;
        }

        /**
         * storage_descriptor block.
         * <p>
         * @return {@code this}
         * @param storageDescriptor storage_descriptor block. This parameter is required.
         */
        public Builder storageDescriptor(final java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptor> storageDescriptor) {
            this.config.storageDescriptor(storageDescriptor);
            return this;
        }

        /**
         * @return {@code this}
         * @param tableType This parameter is required.
         */
        public Builder tableType(final java.lang.String tableType) {
            this.config.tableType(tableType);
            return this;
        }

        /**
         * @return {@code this}
         * @param viewExpandedText This parameter is required.
         */
        public Builder viewExpandedText(final java.lang.String viewExpandedText) {
            this.config.viewExpandedText(viewExpandedText);
            return this;
        }

        /**
         * @return {@code this}
         * @param viewOriginalText This parameter is required.
         */
        public Builder viewOriginalText(final java.lang.String viewOriginalText) {
            this.config.viewOriginalText(viewOriginalText);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GlueCatalogTable}.
         */
        @Override
        public imports.aws.GlueCatalogTable build() {
            return new imports.aws.GlueCatalogTable(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
