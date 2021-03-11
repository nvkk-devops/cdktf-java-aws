package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.160Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchLogMetricFilterMetricTransformation")
@software.amazon.jsii.Jsii.Proxy(CloudwatchLogMetricFilterMetricTransformation.Jsii$Proxy.class)
public interface CloudwatchLogMetricFilterMetricTransformation extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getNamespace();

    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchLogMetricFilterMetricTransformation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchLogMetricFilterMetricTransformation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchLogMetricFilterMetricTransformation> {
        private java.lang.String name;
        private java.lang.String namespace;
        private java.lang.String value;
        private java.lang.String defaultValue;

        /**
         * Sets the value of {@link CloudwatchLogMetricFilterMetricTransformation#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchLogMetricFilterMetricTransformation#getNamespace}
         * @param namespace the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchLogMetricFilterMetricTransformation#getValue}
         * @param value the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchLogMetricFilterMetricTransformation#getDefaultValue}
         * @param defaultValue the value to be set.
         * @return {@code this}
         */
        public Builder defaultValue(java.lang.String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchLogMetricFilterMetricTransformation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchLogMetricFilterMetricTransformation build() {
            return new Jsii$Proxy(name, namespace, value, defaultValue);
        }
    }

    /**
     * An implementation for {@link CloudwatchLogMetricFilterMetricTransformation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchLogMetricFilterMetricTransformation {
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.lang.String value;
        private final java.lang.String defaultValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultValue = software.amazon.jsii.Kernel.get(this, "defaultValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String namespace, final java.lang.String value, final java.lang.String defaultValue) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.namespace = java.util.Objects.requireNonNull(namespace, "namespace is required");
            this.value = java.util.Objects.requireNonNull(value, "value is required");
            this.defaultValue = defaultValue;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.String getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("namespace", om.valueToTree(this.getNamespace()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getDefaultValue() != null) {
                data.set("defaultValue", om.valueToTree(this.getDefaultValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudwatchLogMetricFilterMetricTransformation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchLogMetricFilterMetricTransformation.Jsii$Proxy that = (CloudwatchLogMetricFilterMetricTransformation.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!namespace.equals(that.namespace)) return false;
            if (!value.equals(that.value)) return false;
            return this.defaultValue != null ? this.defaultValue.equals(that.defaultValue) : that.defaultValue == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.namespace.hashCode());
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.defaultValue != null ? this.defaultValue.hashCode() : 0);
            return result;
        }
    }
}
