package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.727Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.NeptuneClusterParameterGroupParameter")
@software.amazon.jsii.Jsii.Proxy(NeptuneClusterParameterGroupParameter.Jsii$Proxy.class)
public interface NeptuneClusterParameterGroupParameter extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    default @org.jetbrains.annotations.Nullable java.lang.String getApplyMethod() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NeptuneClusterParameterGroupParameter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NeptuneClusterParameterGroupParameter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NeptuneClusterParameterGroupParameter> {
        private java.lang.String name;
        private java.lang.String value;
        private java.lang.String applyMethod;

        /**
         * Sets the value of {@link NeptuneClusterParameterGroupParameter#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterParameterGroupParameter#getValue}
         * @param value the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link NeptuneClusterParameterGroupParameter#getApplyMethod}
         * @param applyMethod the value to be set.
         * @return {@code this}
         */
        public Builder applyMethod(java.lang.String applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NeptuneClusterParameterGroupParameter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NeptuneClusterParameterGroupParameter build() {
            return new Jsii$Proxy(name, value, applyMethod);
        }
    }

    /**
     * An implementation for {@link NeptuneClusterParameterGroupParameter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NeptuneClusterParameterGroupParameter {
        private final java.lang.String name;
        private final java.lang.String value;
        private final java.lang.String applyMethod;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.applyMethod = software.amazon.jsii.Kernel.get(this, "applyMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String value, final java.lang.String applyMethod) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.value = java.util.Objects.requireNonNull(value, "value is required");
            this.applyMethod = applyMethod;
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
        public final java.lang.String getApplyMethod() {
            return this.applyMethod;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getApplyMethod() != null) {
                data.set("applyMethod", om.valueToTree(this.getApplyMethod()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.NeptuneClusterParameterGroupParameter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NeptuneClusterParameterGroupParameter.Jsii$Proxy that = (NeptuneClusterParameterGroupParameter.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!value.equals(that.value)) return false;
            return this.applyMethod != null ? this.applyMethod.equals(that.applyMethod) : that.applyMethod == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.applyMethod != null ? this.applyMethod.hashCode() : 0);
            return result;
        }
    }
}
