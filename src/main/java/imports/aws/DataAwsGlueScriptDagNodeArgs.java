package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.308Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsGlueScriptDagNodeArgs")
@software.amazon.jsii.Jsii.Proxy(DataAwsGlueScriptDagNodeArgs.Jsii$Proxy.class)
public interface DataAwsGlueScriptDagNodeArgs extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getParam() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsGlueScriptDagNodeArgs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsGlueScriptDagNodeArgs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsGlueScriptDagNodeArgs> {
        private java.lang.String name;
        private java.lang.String value;
        private java.lang.Boolean param;

        /**
         * Sets the value of {@link DataAwsGlueScriptDagNodeArgs#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsGlueScriptDagNodeArgs#getValue}
         * @param value the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsGlueScriptDagNodeArgs#getParam}
         * @param param the value to be set.
         * @return {@code this}
         */
        public Builder param(java.lang.Boolean param) {
            this.param = param;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsGlueScriptDagNodeArgs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsGlueScriptDagNodeArgs build() {
            return new Jsii$Proxy(name, value, param);
        }
    }

    /**
     * An implementation for {@link DataAwsGlueScriptDagNodeArgs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsGlueScriptDagNodeArgs {
        private final java.lang.String name;
        private final java.lang.String value;
        private final java.lang.Boolean param;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.param = software.amazon.jsii.Kernel.get(this, "param", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String value, final java.lang.Boolean param) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.value = java.util.Objects.requireNonNull(value, "value is required");
            this.param = param;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.Boolean getParam() {
            return this.param;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getParam() != null) {
                data.set("param", om.valueToTree(this.getParam()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DataAwsGlueScriptDagNodeArgs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsGlueScriptDagNodeArgs.Jsii$Proxy that = (DataAwsGlueScriptDagNodeArgs.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!value.equals(that.value)) return false;
            return this.param != null ? this.param.equals(that.param) : that.param == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.param != null ? this.param.hashCode() : 0);
            return result;
        }
    }
}
