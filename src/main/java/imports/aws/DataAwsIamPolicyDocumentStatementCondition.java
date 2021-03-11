package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.311Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsIamPolicyDocumentStatementCondition")
@software.amazon.jsii.Jsii.Proxy(DataAwsIamPolicyDocumentStatementCondition.Jsii$Proxy.class)
public interface DataAwsIamPolicyDocumentStatementCondition extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getTest();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValues();

    @org.jetbrains.annotations.NotNull java.lang.String getVariable();

    /**
     * @return a {@link Builder} of {@link DataAwsIamPolicyDocumentStatementCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsIamPolicyDocumentStatementCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsIamPolicyDocumentStatementCondition> {
        private java.lang.String test;
        private java.util.List<java.lang.String> values;
        private java.lang.String variable;

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatementCondition#getTest}
         * @param test the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder test(java.lang.String test) {
            this.test = test;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatementCondition#getValues}
         * @param values the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatementCondition#getVariable}
         * @param variable the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder variable(java.lang.String variable) {
            this.variable = variable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsIamPolicyDocumentStatementCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsIamPolicyDocumentStatementCondition build() {
            return new Jsii$Proxy(test, values, variable);
        }
    }

    /**
     * An implementation for {@link DataAwsIamPolicyDocumentStatementCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsIamPolicyDocumentStatementCondition {
        private final java.lang.String test;
        private final java.util.List<java.lang.String> values;
        private final java.lang.String variable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.test = software.amazon.jsii.Kernel.get(this, "test", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.variable = software.amazon.jsii.Kernel.get(this, "variable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String test, final java.util.List<java.lang.String> values, final java.lang.String variable) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.test = java.util.Objects.requireNonNull(test, "test is required");
            this.values = java.util.Objects.requireNonNull(values, "values is required");
            this.variable = java.util.Objects.requireNonNull(variable, "variable is required");
        }

        @Override
        public final java.lang.String getTest() {
            return this.test;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        public final java.lang.String getVariable() {
            return this.variable;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("test", om.valueToTree(this.getTest()));
            data.set("values", om.valueToTree(this.getValues()));
            data.set("variable", om.valueToTree(this.getVariable()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DataAwsIamPolicyDocumentStatementCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsIamPolicyDocumentStatementCondition.Jsii$Proxy that = (DataAwsIamPolicyDocumentStatementCondition.Jsii$Proxy) o;

            if (!test.equals(that.test)) return false;
            if (!values.equals(that.values)) return false;
            return this.variable.equals(that.variable);
        }

        @Override
        public final int hashCode() {
            int result = this.test.hashCode();
            result = 31 * result + (this.values.hashCode());
            result = 31 * result + (this.variable.hashCode());
            return result;
        }
    }
}
