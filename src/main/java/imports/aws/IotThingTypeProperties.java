package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.639Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotThingTypeProperties")
@software.amazon.jsii.Jsii.Proxy(IotThingTypeProperties.Jsii$Proxy.class)
public interface IotThingTypeProperties extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSearchableAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotThingTypeProperties}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotThingTypeProperties}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotThingTypeProperties> {
        private java.lang.String description;
        private java.util.List<java.lang.String> searchableAttributes;

        /**
         * Sets the value of {@link IotThingTypeProperties#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link IotThingTypeProperties#getSearchableAttributes}
         * @param searchableAttributes the value to be set.
         * @return {@code this}
         */
        public Builder searchableAttributes(java.util.List<java.lang.String> searchableAttributes) {
            this.searchableAttributes = searchableAttributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotThingTypeProperties}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotThingTypeProperties build() {
            return new Jsii$Proxy(description, searchableAttributes);
        }
    }

    /**
     * An implementation for {@link IotThingTypeProperties}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotThingTypeProperties {
        private final java.lang.String description;
        private final java.util.List<java.lang.String> searchableAttributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.searchableAttributes = software.amazon.jsii.Kernel.get(this, "searchableAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String description, final java.util.List<java.lang.String> searchableAttributes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.description = description;
            this.searchableAttributes = searchableAttributes;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<java.lang.String> getSearchableAttributes() {
            return this.searchableAttributes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getSearchableAttributes() != null) {
                data.set("searchableAttributes", om.valueToTree(this.getSearchableAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotThingTypeProperties"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotThingTypeProperties.Jsii$Proxy that = (IotThingTypeProperties.Jsii$Proxy) o;

            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            return this.searchableAttributes != null ? this.searchableAttributes.equals(that.searchableAttributes) : that.searchableAttributes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.description != null ? this.description.hashCode() : 0;
            result = 31 * result + (this.searchableAttributes != null ? this.searchableAttributes.hashCode() : 0);
            return result;
        }
    }
}
