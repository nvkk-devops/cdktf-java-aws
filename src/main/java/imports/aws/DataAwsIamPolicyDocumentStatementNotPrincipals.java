package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.311Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsIamPolicyDocumentStatementNotPrincipals")
@software.amazon.jsii.Jsii.Proxy(DataAwsIamPolicyDocumentStatementNotPrincipals.Jsii$Proxy.class)
public interface DataAwsIamPolicyDocumentStatementNotPrincipals extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIdentifiers();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link DataAwsIamPolicyDocumentStatementNotPrincipals}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsIamPolicyDocumentStatementNotPrincipals}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsIamPolicyDocumentStatementNotPrincipals> {
        private java.util.List<java.lang.String> identifiers;
        private java.lang.String type;

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatementNotPrincipals#getIdentifiers}
         * @param identifiers the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder identifiers(java.util.List<java.lang.String> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatementNotPrincipals#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsIamPolicyDocumentStatementNotPrincipals}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsIamPolicyDocumentStatementNotPrincipals build() {
            return new Jsii$Proxy(identifiers, type);
        }
    }

    /**
     * An implementation for {@link DataAwsIamPolicyDocumentStatementNotPrincipals}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsIamPolicyDocumentStatementNotPrincipals {
        private final java.util.List<java.lang.String> identifiers;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.identifiers = software.amazon.jsii.Kernel.get(this, "identifiers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> identifiers, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.identifiers = java.util.Objects.requireNonNull(identifiers, "identifiers is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
        }

        @Override
        public final java.util.List<java.lang.String> getIdentifiers() {
            return this.identifiers;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("identifiers", om.valueToTree(this.getIdentifiers()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DataAwsIamPolicyDocumentStatementNotPrincipals"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsIamPolicyDocumentStatementNotPrincipals.Jsii$Proxy that = (DataAwsIamPolicyDocumentStatementNotPrincipals.Jsii$Proxy) o;

            if (!identifiers.equals(that.identifiers)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.identifiers.hashCode();
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
