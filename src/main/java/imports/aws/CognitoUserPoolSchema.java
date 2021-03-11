package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.200Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolSchema")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolSchema.Jsii$Proxy.class)
public interface CognitoUserPoolSchema extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAttributeDataType();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeveloperOnlyAttribute() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMutable() {
        return null;
    }

    /**
     * number_attribute_constraints block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints> getNumberAttributeConstraints() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequired() {
        return null;
    }

    /**
     * string_attribute_constraints block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolSchemaStringAttributeConstraints> getStringAttributeConstraints() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolSchema}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolSchema}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolSchema> {
        private java.lang.String attributeDataType;
        private java.lang.String name;
        private java.lang.Boolean developerOnlyAttribute;
        private java.lang.Boolean mutable;
        private java.util.List<imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints> numberAttributeConstraints;
        private java.lang.Boolean required;
        private java.util.List<imports.aws.CognitoUserPoolSchemaStringAttributeConstraints> stringAttributeConstraints;

        /**
         * Sets the value of {@link CognitoUserPoolSchema#getAttributeDataType}
         * @param attributeDataType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder attributeDataType(java.lang.String attributeDataType) {
            this.attributeDataType = attributeDataType;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchema#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchema#getDeveloperOnlyAttribute}
         * @param developerOnlyAttribute the value to be set.
         * @return {@code this}
         */
        public Builder developerOnlyAttribute(java.lang.Boolean developerOnlyAttribute) {
            this.developerOnlyAttribute = developerOnlyAttribute;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchema#getMutable}
         * @param mutable the value to be set.
         * @return {@code this}
         */
        public Builder mutable(java.lang.Boolean mutable) {
            this.mutable = mutable;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchema#getNumberAttributeConstraints}
         * @param numberAttributeConstraints number_attribute_constraints block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder numberAttributeConstraints(java.util.List<? extends imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints> numberAttributeConstraints) {
            this.numberAttributeConstraints = (java.util.List<imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints>)numberAttributeConstraints;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchema#getRequired}
         * @param required the value to be set.
         * @return {@code this}
         */
        public Builder required(java.lang.Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSchema#getStringAttributeConstraints}
         * @param stringAttributeConstraints string_attribute_constraints block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stringAttributeConstraints(java.util.List<? extends imports.aws.CognitoUserPoolSchemaStringAttributeConstraints> stringAttributeConstraints) {
            this.stringAttributeConstraints = (java.util.List<imports.aws.CognitoUserPoolSchemaStringAttributeConstraints>)stringAttributeConstraints;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolSchema}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolSchema build() {
            return new Jsii$Proxy(attributeDataType, name, developerOnlyAttribute, mutable, numberAttributeConstraints, required, stringAttributeConstraints);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolSchema}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolSchema {
        private final java.lang.String attributeDataType;
        private final java.lang.String name;
        private final java.lang.Boolean developerOnlyAttribute;
        private final java.lang.Boolean mutable;
        private final java.util.List<imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints> numberAttributeConstraints;
        private final java.lang.Boolean required;
        private final java.util.List<imports.aws.CognitoUserPoolSchemaStringAttributeConstraints> stringAttributeConstraints;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attributeDataType = software.amazon.jsii.Kernel.get(this, "attributeDataType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.developerOnlyAttribute = software.amazon.jsii.Kernel.get(this, "developerOnlyAttribute", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.mutable = software.amazon.jsii.Kernel.get(this, "mutable", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.numberAttributeConstraints = software.amazon.jsii.Kernel.get(this, "numberAttributeConstraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints.class)));
            this.required = software.amazon.jsii.Kernel.get(this, "required", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.stringAttributeConstraints = software.amazon.jsii.Kernel.get(this, "stringAttributeConstraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolSchemaStringAttributeConstraints.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String attributeDataType, final java.lang.String name, final java.lang.Boolean developerOnlyAttribute, final java.lang.Boolean mutable, final java.util.List<? extends imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints> numberAttributeConstraints, final java.lang.Boolean required, final java.util.List<? extends imports.aws.CognitoUserPoolSchemaStringAttributeConstraints> stringAttributeConstraints) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attributeDataType = java.util.Objects.requireNonNull(attributeDataType, "attributeDataType is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.developerOnlyAttribute = developerOnlyAttribute;
            this.mutable = mutable;
            this.numberAttributeConstraints = (java.util.List<imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints>)numberAttributeConstraints;
            this.required = required;
            this.stringAttributeConstraints = (java.util.List<imports.aws.CognitoUserPoolSchemaStringAttributeConstraints>)stringAttributeConstraints;
        }

        @Override
        public final java.lang.String getAttributeDataType() {
            return this.attributeDataType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Boolean getDeveloperOnlyAttribute() {
            return this.developerOnlyAttribute;
        }

        @Override
        public final java.lang.Boolean getMutable() {
            return this.mutable;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolSchemaNumberAttributeConstraints> getNumberAttributeConstraints() {
            return this.numberAttributeConstraints;
        }

        @Override
        public final java.lang.Boolean getRequired() {
            return this.required;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolSchemaStringAttributeConstraints> getStringAttributeConstraints() {
            return this.stringAttributeConstraints;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("attributeDataType", om.valueToTree(this.getAttributeDataType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDeveloperOnlyAttribute() != null) {
                data.set("developerOnlyAttribute", om.valueToTree(this.getDeveloperOnlyAttribute()));
            }
            if (this.getMutable() != null) {
                data.set("mutable", om.valueToTree(this.getMutable()));
            }
            if (this.getNumberAttributeConstraints() != null) {
                data.set("numberAttributeConstraints", om.valueToTree(this.getNumberAttributeConstraints()));
            }
            if (this.getRequired() != null) {
                data.set("required", om.valueToTree(this.getRequired()));
            }
            if (this.getStringAttributeConstraints() != null) {
                data.set("stringAttributeConstraints", om.valueToTree(this.getStringAttributeConstraints()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolSchema"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolSchema.Jsii$Proxy that = (CognitoUserPoolSchema.Jsii$Proxy) o;

            if (!attributeDataType.equals(that.attributeDataType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.developerOnlyAttribute != null ? !this.developerOnlyAttribute.equals(that.developerOnlyAttribute) : that.developerOnlyAttribute != null) return false;
            if (this.mutable != null ? !this.mutable.equals(that.mutable) : that.mutable != null) return false;
            if (this.numberAttributeConstraints != null ? !this.numberAttributeConstraints.equals(that.numberAttributeConstraints) : that.numberAttributeConstraints != null) return false;
            if (this.required != null ? !this.required.equals(that.required) : that.required != null) return false;
            return this.stringAttributeConstraints != null ? this.stringAttributeConstraints.equals(that.stringAttributeConstraints) : that.stringAttributeConstraints == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attributeDataType.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.developerOnlyAttribute != null ? this.developerOnlyAttribute.hashCode() : 0);
            result = 31 * result + (this.mutable != null ? this.mutable.hashCode() : 0);
            result = 31 * result + (this.numberAttributeConstraints != null ? this.numberAttributeConstraints.hashCode() : 0);
            result = 31 * result + (this.required != null ? this.required.hashCode() : 0);
            result = 31 * result + (this.stringAttributeConstraints != null ? this.stringAttributeConstraints.hashCode() : 0);
            return result;
        }
    }
}
