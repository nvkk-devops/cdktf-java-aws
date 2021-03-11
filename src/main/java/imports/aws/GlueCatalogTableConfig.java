package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.590Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueCatalogTableConfig")
@software.amazon.jsii.Jsii.Proxy(GlueCatalogTableConfig.Jsii$Proxy.class)
public interface GlueCatalogTableConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getCatalogId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOwner() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * partition_keys block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTablePartitionKeys> getPartitionKeys() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRetention() {
        return null;
    }

    /**
     * storage_descriptor block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTableStorageDescriptor> getStorageDescriptor() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTableType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getViewExpandedText() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getViewOriginalText() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueCatalogTableConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCatalogTableConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCatalogTableConfig> {
        private java.lang.String databaseName;
        private java.lang.String name;
        private java.lang.String catalogId;
        private java.lang.String description;
        private java.lang.String owner;
        private java.util.Map<java.lang.String, java.lang.String> parameters;
        private java.util.List<imports.aws.GlueCatalogTablePartitionKeys> partitionKeys;
        private java.lang.Number retention;
        private java.util.List<imports.aws.GlueCatalogTableStorageDescriptor> storageDescriptor;
        private java.lang.String tableType;
        private java.lang.String viewExpandedText;
        private java.lang.String viewOriginalText;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getDatabaseName}
         * @param databaseName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getCatalogId}
         * @param catalogId the value to be set.
         * @return {@code this}
         */
        public Builder catalogId(java.lang.String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getOwner}
         * @param owner the value to be set.
         * @return {@code this}
         */
        public Builder owner(java.lang.String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getParameters}
         * @param parameters the value to be set.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getPartitionKeys}
         * @param partitionKeys partition_keys block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder partitionKeys(java.util.List<? extends imports.aws.GlueCatalogTablePartitionKeys> partitionKeys) {
            this.partitionKeys = (java.util.List<imports.aws.GlueCatalogTablePartitionKeys>)partitionKeys;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getRetention}
         * @param retention the value to be set.
         * @return {@code this}
         */
        public Builder retention(java.lang.Number retention) {
            this.retention = retention;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getStorageDescriptor}
         * @param storageDescriptor storage_descriptor block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder storageDescriptor(java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptor> storageDescriptor) {
            this.storageDescriptor = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptor>)storageDescriptor;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getTableType}
         * @param tableType the value to be set.
         * @return {@code this}
         */
        public Builder tableType(java.lang.String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getViewExpandedText}
         * @param viewExpandedText the value to be set.
         * @return {@code this}
         */
        public Builder viewExpandedText(java.lang.String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getViewOriginalText}
         * @param viewOriginalText the value to be set.
         * @return {@code this}
         */
        public Builder viewOriginalText(java.lang.String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCatalogTableConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCatalogTableConfig build() {
            return new Jsii$Proxy(databaseName, name, catalogId, description, owner, parameters, partitionKeys, retention, storageDescriptor, tableType, viewExpandedText, viewOriginalText, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GlueCatalogTableConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCatalogTableConfig {
        private final java.lang.String databaseName;
        private final java.lang.String name;
        private final java.lang.String catalogId;
        private final java.lang.String description;
        private final java.lang.String owner;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final java.util.List<imports.aws.GlueCatalogTablePartitionKeys> partitionKeys;
        private final java.lang.Number retention;
        private final java.util.List<imports.aws.GlueCatalogTableStorageDescriptor> storageDescriptor;
        private final java.lang.String tableType;
        private final java.lang.String viewExpandedText;
        private final java.lang.String viewOriginalText;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.catalogId = software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.partitionKeys = software.amazon.jsii.Kernel.get(this, "partitionKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTablePartitionKeys.class)));
            this.retention = software.amazon.jsii.Kernel.get(this, "retention", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.storageDescriptor = software.amazon.jsii.Kernel.get(this, "storageDescriptor", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTableStorageDescriptor.class)));
            this.tableType = software.amazon.jsii.Kernel.get(this, "tableType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.viewExpandedText = software.amazon.jsii.Kernel.get(this, "viewExpandedText", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.viewOriginalText = software.amazon.jsii.Kernel.get(this, "viewOriginalText", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String databaseName, final java.lang.String name, final java.lang.String catalogId, final java.lang.String description, final java.lang.String owner, final java.util.Map<java.lang.String, java.lang.String> parameters, final java.util.List<? extends imports.aws.GlueCatalogTablePartitionKeys> partitionKeys, final java.lang.Number retention, final java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptor> storageDescriptor, final java.lang.String tableType, final java.lang.String viewExpandedText, final java.lang.String viewOriginalText, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.databaseName = java.util.Objects.requireNonNull(databaseName, "databaseName is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.catalogId = catalogId;
            this.description = description;
            this.owner = owner;
            this.parameters = parameters;
            this.partitionKeys = (java.util.List<imports.aws.GlueCatalogTablePartitionKeys>)partitionKeys;
            this.retention = retention;
            this.storageDescriptor = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptor>)storageDescriptor;
            this.tableType = tableType;
            this.viewExpandedText = viewExpandedText;
            this.viewOriginalText = viewOriginalText;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getCatalogId() {
            return this.catalogId;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getOwner() {
            return this.owner;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public final java.util.List<imports.aws.GlueCatalogTablePartitionKeys> getPartitionKeys() {
            return this.partitionKeys;
        }

        @Override
        public final java.lang.Number getRetention() {
            return this.retention;
        }

        @Override
        public final java.util.List<imports.aws.GlueCatalogTableStorageDescriptor> getStorageDescriptor() {
            return this.storageDescriptor;
        }

        @Override
        public final java.lang.String getTableType() {
            return this.tableType;
        }

        @Override
        public final java.lang.String getViewExpandedText() {
            return this.viewExpandedText;
        }

        @Override
        public final java.lang.String getViewOriginalText() {
            return this.viewOriginalText;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getCatalogId() != null) {
                data.set("catalogId", om.valueToTree(this.getCatalogId()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getOwner() != null) {
                data.set("owner", om.valueToTree(this.getOwner()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getPartitionKeys() != null) {
                data.set("partitionKeys", om.valueToTree(this.getPartitionKeys()));
            }
            if (this.getRetention() != null) {
                data.set("retention", om.valueToTree(this.getRetention()));
            }
            if (this.getStorageDescriptor() != null) {
                data.set("storageDescriptor", om.valueToTree(this.getStorageDescriptor()));
            }
            if (this.getTableType() != null) {
                data.set("tableType", om.valueToTree(this.getTableType()));
            }
            if (this.getViewExpandedText() != null) {
                data.set("viewExpandedText", om.valueToTree(this.getViewExpandedText()));
            }
            if (this.getViewOriginalText() != null) {
                data.set("viewOriginalText", om.valueToTree(this.getViewOriginalText()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueCatalogTableConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCatalogTableConfig.Jsii$Proxy that = (GlueCatalogTableConfig.Jsii$Proxy) o;

            if (!databaseName.equals(that.databaseName)) return false;
            if (!name.equals(that.name)) return false;
            if (this.catalogId != null ? !this.catalogId.equals(that.catalogId) : that.catalogId != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.owner != null ? !this.owner.equals(that.owner) : that.owner != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            if (this.partitionKeys != null ? !this.partitionKeys.equals(that.partitionKeys) : that.partitionKeys != null) return false;
            if (this.retention != null ? !this.retention.equals(that.retention) : that.retention != null) return false;
            if (this.storageDescriptor != null ? !this.storageDescriptor.equals(that.storageDescriptor) : that.storageDescriptor != null) return false;
            if (this.tableType != null ? !this.tableType.equals(that.tableType) : that.tableType != null) return false;
            if (this.viewExpandedText != null ? !this.viewExpandedText.equals(that.viewExpandedText) : that.viewExpandedText != null) return false;
            if (this.viewOriginalText != null ? !this.viewOriginalText.equals(that.viewOriginalText) : that.viewOriginalText != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.databaseName.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.catalogId != null ? this.catalogId.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.owner != null ? this.owner.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.partitionKeys != null ? this.partitionKeys.hashCode() : 0);
            result = 31 * result + (this.retention != null ? this.retention.hashCode() : 0);
            result = 31 * result + (this.storageDescriptor != null ? this.storageDescriptor.hashCode() : 0);
            result = 31 * result + (this.tableType != null ? this.tableType.hashCode() : 0);
            result = 31 * result + (this.viewExpandedText != null ? this.viewExpandedText.hashCode() : 0);
            result = 31 * result + (this.viewOriginalText != null ? this.viewOriginalText.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
