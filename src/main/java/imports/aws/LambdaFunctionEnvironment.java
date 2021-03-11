package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.675Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaFunctionEnvironment")
@software.amazon.jsii.Jsii.Proxy(LambdaFunctionEnvironment.Jsii$Proxy.class)
public interface LambdaFunctionEnvironment extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVariables() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaFunctionEnvironment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaFunctionEnvironment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaFunctionEnvironment> {
        private java.util.Map<java.lang.String, java.lang.String> variables;

        /**
         * Sets the value of {@link LambdaFunctionEnvironment#getVariables}
         * @param variables the value to be set.
         * @return {@code this}
         */
        public Builder variables(java.util.Map<java.lang.String, java.lang.String> variables) {
            this.variables = variables;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaFunctionEnvironment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaFunctionEnvironment build() {
            return new Jsii$Proxy(variables);
        }
    }

    /**
     * An implementation for {@link LambdaFunctionEnvironment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaFunctionEnvironment {
        private final java.util.Map<java.lang.String, java.lang.String> variables;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.variables = software.amazon.jsii.Kernel.get(this, "variables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> variables) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.variables = variables;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVariables() {
            return this.variables;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getVariables() != null) {
                data.set("variables", om.valueToTree(this.getVariables()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LambdaFunctionEnvironment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaFunctionEnvironment.Jsii$Proxy that = (LambdaFunctionEnvironment.Jsii$Proxy) o;

            return this.variables != null ? this.variables.equals(that.variables) : that.variables == null;
        }

        @Override
        public final int hashCode() {
            int result = this.variables != null ? this.variables.hashCode() : 0;
            return result;
        }
    }
}
