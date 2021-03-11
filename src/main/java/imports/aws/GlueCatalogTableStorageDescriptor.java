package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.591Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueCatalogTableStorageDescriptor")
@software.amazon.jsii.Jsii.Proxy(GlueCatalogTableStorageDescriptor.Jsii$Proxy.class)
public interface GlueCatalogTableStorageDescriptor extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBucketColumns() {
        return null;
    }

    /**
     * columns block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTableStorageDescriptorColumns> getColumns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCompressed() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInputFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLocation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfBuckets() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOutputFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * ser_de_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo> getSerDeInfo() {
        return null;
    }

    /**
     * skewed_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo> getSkewedInfo() {
        return null;
    }

    /**
     * sort_columns block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSortColumns> getSortColumns() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStoredAsSubDirectories() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueCatalogTableStorageDescriptor}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCatalogTableStorageDescriptor}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCatalogTableStorageDescriptor> {
        private java.util.List<java.lang.String> bucketColumns;
        private java.util.List<imports.aws.GlueCatalogTableStorageDescriptorColumns> columns;
        private java.lang.Boolean compressed;
        private java.lang.String inputFormat;
        private java.lang.String location;
        private java.lang.Number numberOfBuckets;
        private java.lang.String outputFormat;
        private java.util.Map<java.lang.String, java.lang.String> parameters;
        private java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo> serDeInfo;
        private java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo> skewedInfo;
        private java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSortColumns> sortColumns;
        private java.lang.Boolean storedAsSubDirectories;

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getBucketColumns}
         * @param bucketColumns the value to be set.
         * @return {@code this}
         */
        public Builder bucketColumns(java.util.List<java.lang.String> bucketColumns) {
            this.bucketColumns = bucketColumns;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getColumns}
         * @param columns columns block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder columns(java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorColumns> columns) {
            this.columns = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorColumns>)columns;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getCompressed}
         * @param compressed the value to be set.
         * @return {@code this}
         */
        public Builder compressed(java.lang.Boolean compressed) {
            this.compressed = compressed;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getInputFormat}
         * @param inputFormat the value to be set.
         * @return {@code this}
         */
        public Builder inputFormat(java.lang.String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getLocation}
         * @param location the value to be set.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getNumberOfBuckets}
         * @param numberOfBuckets the value to be set.
         * @return {@code this}
         */
        public Builder numberOfBuckets(java.lang.Number numberOfBuckets) {
            this.numberOfBuckets = numberOfBuckets;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getOutputFormat}
         * @param outputFormat the value to be set.
         * @return {@code this}
         */
        public Builder outputFormat(java.lang.String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getParameters}
         * @param parameters the value to be set.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getSerDeInfo}
         * @param serDeInfo ser_de_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder serDeInfo(java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo> serDeInfo) {
            this.serDeInfo = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo>)serDeInfo;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getSkewedInfo}
         * @param skewedInfo skewed_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder skewedInfo(java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo> skewedInfo) {
            this.skewedInfo = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo>)skewedInfo;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getSortColumns}
         * @param sortColumns sort_columns block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sortColumns(java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorSortColumns> sortColumns) {
            this.sortColumns = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSortColumns>)sortColumns;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptor#getStoredAsSubDirectories}
         * @param storedAsSubDirectories the value to be set.
         * @return {@code this}
         */
        public Builder storedAsSubDirectories(java.lang.Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCatalogTableStorageDescriptor}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCatalogTableStorageDescriptor build() {
            return new Jsii$Proxy(bucketColumns, columns, compressed, inputFormat, location, numberOfBuckets, outputFormat, parameters, serDeInfo, skewedInfo, sortColumns, storedAsSubDirectories);
        }
    }

    /**
     * An implementation for {@link GlueCatalogTableStorageDescriptor}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCatalogTableStorageDescriptor {
        private final java.util.List<java.lang.String> bucketColumns;
        private final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorColumns> columns;
        private final java.lang.Boolean compressed;
        private final java.lang.String inputFormat;
        private final java.lang.String location;
        private final java.lang.Number numberOfBuckets;
        private final java.lang.String outputFormat;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo> serDeInfo;
        private final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo> skewedInfo;
        private final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSortColumns> sortColumns;
        private final java.lang.Boolean storedAsSubDirectories;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketColumns = software.amazon.jsii.Kernel.get(this, "bucketColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.columns = software.amazon.jsii.Kernel.get(this, "columns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTableStorageDescriptorColumns.class)));
            this.compressed = software.amazon.jsii.Kernel.get(this, "compressed", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.inputFormat = software.amazon.jsii.Kernel.get(this, "inputFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.numberOfBuckets = software.amazon.jsii.Kernel.get(this, "numberOfBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.outputFormat = software.amazon.jsii.Kernel.get(this, "outputFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.serDeInfo = software.amazon.jsii.Kernel.get(this, "serDeInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo.class)));
            this.skewedInfo = software.amazon.jsii.Kernel.get(this, "skewedInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo.class)));
            this.sortColumns = software.amazon.jsii.Kernel.get(this, "sortColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCatalogTableStorageDescriptorSortColumns.class)));
            this.storedAsSubDirectories = software.amazon.jsii.Kernel.get(this, "storedAsSubDirectories", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> bucketColumns, final java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorColumns> columns, final java.lang.Boolean compressed, final java.lang.String inputFormat, final java.lang.String location, final java.lang.Number numberOfBuckets, final java.lang.String outputFormat, final java.util.Map<java.lang.String, java.lang.String> parameters, final java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo> serDeInfo, final java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo> skewedInfo, final java.util.List<? extends imports.aws.GlueCatalogTableStorageDescriptorSortColumns> sortColumns, final java.lang.Boolean storedAsSubDirectories) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketColumns = bucketColumns;
            this.columns = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorColumns>)columns;
            this.compressed = compressed;
            this.inputFormat = inputFormat;
            this.location = location;
            this.numberOfBuckets = numberOfBuckets;
            this.outputFormat = outputFormat;
            this.parameters = parameters;
            this.serDeInfo = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo>)serDeInfo;
            this.skewedInfo = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo>)skewedInfo;
            this.sortColumns = (java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSortColumns>)sortColumns;
            this.storedAsSubDirectories = storedAsSubDirectories;
        }

        @Override
        public final java.util.List<java.lang.String> getBucketColumns() {
            return this.bucketColumns;
        }

        @Override
        public final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorColumns> getColumns() {
            return this.columns;
        }

        @Override
        public final java.lang.Boolean getCompressed() {
            return this.compressed;
        }

        @Override
        public final java.lang.String getInputFormat() {
            return this.inputFormat;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.lang.Number getNumberOfBuckets() {
            return this.numberOfBuckets;
        }

        @Override
        public final java.lang.String getOutputFormat() {
            return this.outputFormat;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSerDeInfo> getSerDeInfo() {
            return this.serDeInfo;
        }

        @Override
        public final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSkewedInfo> getSkewedInfo() {
            return this.skewedInfo;
        }

        @Override
        public final java.util.List<imports.aws.GlueCatalogTableStorageDescriptorSortColumns> getSortColumns() {
            return this.sortColumns;
        }

        @Override
        public final java.lang.Boolean getStoredAsSubDirectories() {
            return this.storedAsSubDirectories;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBucketColumns() != null) {
                data.set("bucketColumns", om.valueToTree(this.getBucketColumns()));
            }
            if (this.getColumns() != null) {
                data.set("columns", om.valueToTree(this.getColumns()));
            }
            if (this.getCompressed() != null) {
                data.set("compressed", om.valueToTree(this.getCompressed()));
            }
            if (this.getInputFormat() != null) {
                data.set("inputFormat", om.valueToTree(this.getInputFormat()));
            }
            if (this.getLocation() != null) {
                data.set("location", om.valueToTree(this.getLocation()));
            }
            if (this.getNumberOfBuckets() != null) {
                data.set("numberOfBuckets", om.valueToTree(this.getNumberOfBuckets()));
            }
            if (this.getOutputFormat() != null) {
                data.set("outputFormat", om.valueToTree(this.getOutputFormat()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getSerDeInfo() != null) {
                data.set("serDeInfo", om.valueToTree(this.getSerDeInfo()));
            }
            if (this.getSkewedInfo() != null) {
                data.set("skewedInfo", om.valueToTree(this.getSkewedInfo()));
            }
            if (this.getSortColumns() != null) {
                data.set("sortColumns", om.valueToTree(this.getSortColumns()));
            }
            if (this.getStoredAsSubDirectories() != null) {
                data.set("storedAsSubDirectories", om.valueToTree(this.getStoredAsSubDirectories()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueCatalogTableStorageDescriptor"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCatalogTableStorageDescriptor.Jsii$Proxy that = (GlueCatalogTableStorageDescriptor.Jsii$Proxy) o;

            if (this.bucketColumns != null ? !this.bucketColumns.equals(that.bucketColumns) : that.bucketColumns != null) return false;
            if (this.columns != null ? !this.columns.equals(that.columns) : that.columns != null) return false;
            if (this.compressed != null ? !this.compressed.equals(that.compressed) : that.compressed != null) return false;
            if (this.inputFormat != null ? !this.inputFormat.equals(that.inputFormat) : that.inputFormat != null) return false;
            if (this.location != null ? !this.location.equals(that.location) : that.location != null) return false;
            if (this.numberOfBuckets != null ? !this.numberOfBuckets.equals(that.numberOfBuckets) : that.numberOfBuckets != null) return false;
            if (this.outputFormat != null ? !this.outputFormat.equals(that.outputFormat) : that.outputFormat != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            if (this.serDeInfo != null ? !this.serDeInfo.equals(that.serDeInfo) : that.serDeInfo != null) return false;
            if (this.skewedInfo != null ? !this.skewedInfo.equals(that.skewedInfo) : that.skewedInfo != null) return false;
            if (this.sortColumns != null ? !this.sortColumns.equals(that.sortColumns) : that.sortColumns != null) return false;
            return this.storedAsSubDirectories != null ? this.storedAsSubDirectories.equals(that.storedAsSubDirectories) : that.storedAsSubDirectories == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketColumns != null ? this.bucketColumns.hashCode() : 0;
            result = 31 * result + (this.columns != null ? this.columns.hashCode() : 0);
            result = 31 * result + (this.compressed != null ? this.compressed.hashCode() : 0);
            result = 31 * result + (this.inputFormat != null ? this.inputFormat.hashCode() : 0);
            result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
            result = 31 * result + (this.numberOfBuckets != null ? this.numberOfBuckets.hashCode() : 0);
            result = 31 * result + (this.outputFormat != null ? this.outputFormat.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.serDeInfo != null ? this.serDeInfo.hashCode() : 0);
            result = 31 * result + (this.skewedInfo != null ? this.skewedInfo.hashCode() : 0);
            result = 31 * result + (this.sortColumns != null ? this.sortColumns.hashCode() : 0);
            result = 31 * result + (this.storedAsSubDirectories != null ? this.storedAsSubDirectories.hashCode() : 0);
            return result;
        }
    }
}
