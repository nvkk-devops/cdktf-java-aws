package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DbClusterSnapshotTimeouts")
@software.amazon.jsii.Jsii.Proxy(DbClusterSnapshotTimeouts.Jsii$Proxy.class)
public interface DbClusterSnapshotTimeouts extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCreate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DbClusterSnapshotTimeouts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DbClusterSnapshotTimeouts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DbClusterSnapshotTimeouts> {
        private java.lang.String create;

        /**
         * Sets the value of {@link DbClusterSnapshotTimeouts#getCreate}
         * @param create the value to be set.
         * @return {@code this}
         */
        public Builder create(java.lang.String create) {
            this.create = create;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DbClusterSnapshotTimeouts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DbClusterSnapshotTimeouts build() {
            return new Jsii$Proxy(create);
        }
    }

    /**
     * An implementation for {@link DbClusterSnapshotTimeouts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DbClusterSnapshotTimeouts {
        private final java.lang.String create;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String create) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.create = create;
        }

        @Override
        public final java.lang.String getCreate() {
            return this.create;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DbClusterSnapshotTimeouts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DbClusterSnapshotTimeouts.Jsii$Proxy that = (DbClusterSnapshotTimeouts.Jsii$Proxy) o;

            return this.create != null ? this.create.equals(that.create) : that.create == null;
        }

        @Override
        public final int hashCode() {
            int result = this.create != null ? this.create.hashCode() : 0;
            return result;
        }
    }
}
