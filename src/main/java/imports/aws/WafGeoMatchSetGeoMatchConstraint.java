package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.933Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafGeoMatchSetGeoMatchConstraint")
@software.amazon.jsii.Jsii.Proxy(WafGeoMatchSetGeoMatchConstraint.Jsii$Proxy.class)
public interface WafGeoMatchSetGeoMatchConstraint extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * @return a {@link Builder} of {@link WafGeoMatchSetGeoMatchConstraint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafGeoMatchSetGeoMatchConstraint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafGeoMatchSetGeoMatchConstraint> {
        private java.lang.String type;
        private java.lang.String value;

        /**
         * Sets the value of {@link WafGeoMatchSetGeoMatchConstraint#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link WafGeoMatchSetGeoMatchConstraint#getValue}
         * @param value the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WafGeoMatchSetGeoMatchConstraint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafGeoMatchSetGeoMatchConstraint build() {
            return new Jsii$Proxy(type, value);
        }
    }

    /**
     * An implementation for {@link WafGeoMatchSetGeoMatchConstraint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafGeoMatchSetGeoMatchConstraint {
        private final java.lang.String type;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String type, final java.lang.String value) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.value = java.util.Objects.requireNonNull(value, "value is required");
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            data.set("value", om.valueToTree(this.getValue()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.WafGeoMatchSetGeoMatchConstraint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafGeoMatchSetGeoMatchConstraint.Jsii$Proxy that = (WafGeoMatchSetGeoMatchConstraint.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.value.equals(that.value);
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.value.hashCode());
            return result;
        }
    }
}
