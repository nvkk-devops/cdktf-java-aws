package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.174Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodedeployDeploymentConfigMinimumHealthyHosts")
@software.amazon.jsii.Jsii.Proxy(CodedeployDeploymentConfigMinimumHealthyHosts.Jsii$Proxy.class)
public interface CodedeployDeploymentConfigMinimumHealthyHosts extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodedeployDeploymentConfigMinimumHealthyHosts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodedeployDeploymentConfigMinimumHealthyHosts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodedeployDeploymentConfigMinimumHealthyHosts> {
        private java.lang.String type;
        private java.lang.Number value;

        /**
         * Sets the value of {@link CodedeployDeploymentConfigMinimumHealthyHosts#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodedeployDeploymentConfigMinimumHealthyHosts#getValue}
         * @param value the value to be set.
         * @return {@code this}
         */
        public Builder value(java.lang.Number value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodedeployDeploymentConfigMinimumHealthyHosts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodedeployDeploymentConfigMinimumHealthyHosts build() {
            return new Jsii$Proxy(type, value);
        }
    }

    /**
     * An implementation for {@link CodedeployDeploymentConfigMinimumHealthyHosts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodedeployDeploymentConfigMinimumHealthyHosts {
        private final java.lang.String type;
        private final java.lang.Number value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String type, final java.lang.Number value) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = type;
            this.value = value;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodedeployDeploymentConfigMinimumHealthyHosts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodedeployDeploymentConfigMinimumHealthyHosts.Jsii$Proxy that = (CodedeployDeploymentConfigMinimumHealthyHosts.Jsii$Proxy) o;

            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type != null ? this.type.hashCode() : 0;
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
