package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.200Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolSchemaNumberAttributeConstraints")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolSchemaNumberAttributeConstraints.Jsii$Proxy.class)
public interface CognitoUserPoolSchemaNumberAttributeConstraints extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxValue() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMinValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolSchemaNumberAttributeConstraints}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolSchemaNumberAttributeConstraints}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolSchemaNumberAttributeConstraints> {
        private java.lang.String maxValue;
        private java.lang.String minValue;

        /**
         * Sets the value of {@link CognitoUserPoolSchemaNumberAttributeConstraints#getMaxValue}
         * @param maxValue the value to be set.
         * @return {@code this}
         */
        public Builder maxValue(java.lang.String maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchemaNumberAttributeConstraints#getMinValue}
         * @param minValue the value to be set.
         * @return {@code this}
         */
        public Builder minValue(java.lang.String minValue) {
            this.minValue = minValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolSchemaNumberAttributeConstraints}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolSchemaNumberAttributeConstraints build() {
            return new Jsii$Proxy(maxValue, minValue);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolSchemaNumberAttributeConstraints}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolSchemaNumberAttributeConstraints {
        private final java.lang.String maxValue;
        private final java.lang.String minValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxValue = software.amazon.jsii.Kernel.get(this, "maxValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minValue = software.amazon.jsii.Kernel.get(this, "minValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String maxValue, final java.lang.String minValue) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxValue = maxValue;
            this.minValue = minValue;
        }

        @Override
        public final java.lang.String getMaxValue() {
            return this.maxValue;
        }

        @Override
        public final java.lang.String getMinValue() {
            return this.minValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxValue() != null) {
                data.set("maxValue", om.valueToTree(this.getMaxValue()));
            }
            if (this.getMinValue() != null) {
                data.set("minValue", om.valueToTree(this.getMinValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolSchemaNumberAttributeConstraints"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolSchemaNumberAttributeConstraints.Jsii$Proxy that = (CognitoUserPoolSchemaNumberAttributeConstraints.Jsii$Proxy) o;

            if (this.maxValue != null ? !this.maxValue.equals(that.maxValue) : that.maxValue != null) return false;
            return this.minValue != null ? this.minValue.equals(that.minValue) : that.minValue == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxValue != null ? this.maxValue.hashCode() : 0;
            result = 31 * result + (this.minValue != null ? this.minValue.hashCode() : 0);
            return result;
        }
    }
}
