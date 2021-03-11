package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.592Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueCatalogTableStorageDescriptorSortColumns")
@software.amazon.jsii.Jsii.Proxy(GlueCatalogTableStorageDescriptorSortColumns.Jsii$Proxy.class)
public interface GlueCatalogTableStorageDescriptorSortColumns extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getColumn();

    @org.jetbrains.annotations.NotNull java.lang.Number getSortOrder();

    /**
     * @return a {@link Builder} of {@link GlueCatalogTableStorageDescriptorSortColumns}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCatalogTableStorageDescriptorSortColumns}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCatalogTableStorageDescriptorSortColumns> {
        private java.lang.String column;
        private java.lang.Number sortOrder;

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptorSortColumns#getColumn}
         * @param column the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder column(java.lang.String column) {
            this.column = column;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTableStorageDescriptorSortColumns#getSortOrder}
         * @param sortOrder the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sortOrder(java.lang.Number sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCatalogTableStorageDescriptorSortColumns}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCatalogTableStorageDescriptorSortColumns build() {
            return new Jsii$Proxy(column, sortOrder);
        }
    }

    /**
     * An implementation for {@link GlueCatalogTableStorageDescriptorSortColumns}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCatalogTableStorageDescriptorSortColumns {
        private final java.lang.String column;
        private final java.lang.Number sortOrder;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.column = software.amazon.jsii.Kernel.get(this, "column", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sortOrder = software.amazon.jsii.Kernel.get(this, "sortOrder", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String column, final java.lang.Number sortOrder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.column = java.util.Objects.requireNonNull(column, "column is required");
            this.sortOrder = java.util.Objects.requireNonNull(sortOrder, "sortOrder is required");
        }

        @Override
        public final java.lang.String getColumn() {
            return this.column;
        }

        @Override
        public final java.lang.Number getSortOrder() {
            return this.sortOrder;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("column", om.valueToTree(this.getColumn()));
            data.set("sortOrder", om.valueToTree(this.getSortOrder()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueCatalogTableStorageDescriptorSortColumns"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCatalogTableStorageDescriptorSortColumns.Jsii$Proxy that = (GlueCatalogTableStorageDescriptorSortColumns.Jsii$Proxy) o;

            if (!column.equals(that.column)) return false;
            return this.sortOrder.equals(that.sortOrder);
        }

        @Override
        public final int hashCode() {
            int result = this.column.hashCode();
            result = 31 * result + (this.sortOrder.hashCode());
            return result;
        }
    }
}
