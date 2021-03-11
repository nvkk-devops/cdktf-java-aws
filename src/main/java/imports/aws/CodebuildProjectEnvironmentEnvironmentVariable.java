package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.167Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectEnvironmentEnvironmentVariable")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectEnvironmentEnvironmentVariable.Jsii$Proxy.class)
public interface CodebuildProjectEnvironmentEnvironmentVariable extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectEnvironmentEnvironmentVariable}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectEnvironmentEnvironmentVariable}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectEnvironmentEnvironmentVariable> {
        private java.lang.String name;
        private java.lang.String value;
        private java.lang.String type;

        /**
         * Sets the value of {@link CodebuildProjectEnvironmentEnvironmentVariable#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironmentEnvironmentVariable#getValue}
         * @param value the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironmentEnvironmentVariable#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectEnvironmentEnvironmentVariable}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectEnvironmentEnvironmentVariable build() {
            return new Jsii$Proxy(name, value, type);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectEnvironmentEnvironmentVariable}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectEnvironmentEnvironmentVariable {
        private final java.lang.String name;
        private final java.lang.String value;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String value, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.value = java.util.Objects.requireNonNull(value, "value is required");
            this.type = type;
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
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectEnvironmentEnvironmentVariable"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectEnvironmentEnvironmentVariable.Jsii$Proxy that = (CodebuildProjectEnvironmentEnvironmentVariable.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!value.equals(that.value)) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
