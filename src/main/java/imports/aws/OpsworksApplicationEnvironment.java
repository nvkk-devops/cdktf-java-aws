package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.734Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksApplicationEnvironment")
@software.amazon.jsii.Jsii.Proxy(OpsworksApplicationEnvironment.Jsii$Proxy.class)
public interface OpsworksApplicationEnvironment extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSecure() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksApplicationEnvironment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksApplicationEnvironment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksApplicationEnvironment> {
        private java.lang.String key;
        private java.lang.String value;
        private java.lang.Boolean secure;

        /**
         * Sets the value of {@link OpsworksApplicationEnvironment#getKey}
         * @param key the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationEnvironment#getValue}
         * @param value the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationEnvironment#getSecure}
         * @param secure the value to be set.
         * @return {@code this}
         */
        public Builder secure(java.lang.Boolean secure) {
            this.secure = secure;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OpsworksApplicationEnvironment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksApplicationEnvironment build() {
            return new Jsii$Proxy(key, value, secure);
        }
    }

    /**
     * An implementation for {@link OpsworksApplicationEnvironment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksApplicationEnvironment {
        private final java.lang.String key;
        private final java.lang.String value;
        private final java.lang.Boolean secure;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secure = software.amazon.jsii.Kernel.get(this, "secure", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String key, final java.lang.String value, final java.lang.Boolean secure) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(key, "key is required");
            this.value = java.util.Objects.requireNonNull(value, "value is required");
            this.secure = secure;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.Boolean getSecure() {
            return this.secure;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getSecure() != null) {
                data.set("secure", om.valueToTree(this.getSecure()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.OpsworksApplicationEnvironment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksApplicationEnvironment.Jsii$Proxy that = (OpsworksApplicationEnvironment.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (!value.equals(that.value)) return false;
            return this.secure != null ? this.secure.equals(that.secure) : that.secure == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.secure != null ? this.secure.hashCode() : 0);
            return result;
        }
    }
}
