package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.478Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DynamodbTableTtl")
@software.amazon.jsii.Jsii.Proxy(DynamodbTableTtl.Jsii$Proxy.class)
public interface DynamodbTableTtl extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAttributeName();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DynamodbTableTtl}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DynamodbTableTtl}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DynamodbTableTtl> {
        private java.lang.String attributeName;
        private java.lang.Boolean enabled;

        /**
         * Sets the value of {@link DynamodbTableTtl#getAttributeName}
         * @param attributeName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder attributeName(java.lang.String attributeName) {
            this.attributeName = attributeName;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableTtl#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DynamodbTableTtl}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DynamodbTableTtl build() {
            return new Jsii$Proxy(attributeName, enabled);
        }
    }

    /**
     * An implementation for {@link DynamodbTableTtl}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DynamodbTableTtl {
        private final java.lang.String attributeName;
        private final java.lang.Boolean enabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attributeName = software.amazon.jsii.Kernel.get(this, "attributeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String attributeName, final java.lang.Boolean enabled) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attributeName = java.util.Objects.requireNonNull(attributeName, "attributeName is required");
            this.enabled = enabled;
        }

        @Override
        public final java.lang.String getAttributeName() {
            return this.attributeName;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("attributeName", om.valueToTree(this.getAttributeName()));
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DynamodbTableTtl"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DynamodbTableTtl.Jsii$Proxy that = (DynamodbTableTtl.Jsii$Proxy) o;

            if (!attributeName.equals(that.attributeName)) return false;
            return this.enabled != null ? this.enabled.equals(that.enabled) : that.enabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attributeName.hashCode();
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            return result;
        }
    }
}
