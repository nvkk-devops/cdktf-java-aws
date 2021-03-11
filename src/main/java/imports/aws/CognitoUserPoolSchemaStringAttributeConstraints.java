package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.200Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolSchemaStringAttributeConstraints")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolSchemaStringAttributeConstraints.Jsii$Proxy.class)
public interface CognitoUserPoolSchemaStringAttributeConstraints extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxLength() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMinLength() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolSchemaStringAttributeConstraints}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolSchemaStringAttributeConstraints}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolSchemaStringAttributeConstraints> {
        private java.lang.String maxLength;
        private java.lang.String minLength;

        /**
         * Sets the value of {@link CognitoUserPoolSchemaStringAttributeConstraints#getMaxLength}
         * @param maxLength the value to be set.
         * @return {@code this}
         */
        public Builder maxLength(java.lang.String maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchemaStringAttributeConstraints#getMinLength}
         * @param minLength the value to be set.
         * @return {@code this}
         */
        public Builder minLength(java.lang.String minLength) {
            this.minLength = minLength;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolSchemaStringAttributeConstraints}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolSchemaStringAttributeConstraints build() {
            return new Jsii$Proxy(maxLength, minLength);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolSchemaStringAttributeConstraints}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolSchemaStringAttributeConstraints {
        private final java.lang.String maxLength;
        private final java.lang.String minLength;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxLength = software.amazon.jsii.Kernel.get(this, "maxLength", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minLength = software.amazon.jsii.Kernel.get(this, "minLength", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String maxLength, final java.lang.String minLength) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxLength = maxLength;
            this.minLength = minLength;
        }

        @Override
        public final java.lang.String getMaxLength() {
            return this.maxLength;
        }

        @Override
        public final java.lang.String getMinLength() {
            return this.minLength;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxLength() != null) {
                data.set("maxLength", om.valueToTree(this.getMaxLength()));
            }
            if (this.getMinLength() != null) {
                data.set("minLength", om.valueToTree(this.getMinLength()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolSchemaStringAttributeConstraints"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolSchemaStringAttributeConstraints.Jsii$Proxy that = (CognitoUserPoolSchemaStringAttributeConstraints.Jsii$Proxy) o;

            if (this.maxLength != null ? !this.maxLength.equals(that.maxLength) : that.maxLength != null) return false;
            return this.minLength != null ? this.minLength.equals(that.minLength) : that.minLength == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxLength != null ? this.maxLength.hashCode() : 0;
            result = 31 * result + (this.minLength != null ? this.minLength.hashCode() : 0);
            return result;
        }
    }
}
