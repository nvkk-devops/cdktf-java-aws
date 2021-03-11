package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.680Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaProvisionedConcurrencyConfigTimeouts")
@software.amazon.jsii.Jsii.Proxy(LambdaProvisionedConcurrencyConfigTimeouts.Jsii$Proxy.class)
public interface LambdaProvisionedConcurrencyConfigTimeouts extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCreate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUpdate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaProvisionedConcurrencyConfigTimeouts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaProvisionedConcurrencyConfigTimeouts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaProvisionedConcurrencyConfigTimeouts> {
        private java.lang.String create;
        private java.lang.String update;

        /**
         * Sets the value of {@link LambdaProvisionedConcurrencyConfigTimeouts#getCreate}
         * @param create the value to be set.
         * @return {@code this}
         */
        public Builder create(java.lang.String create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link LambdaProvisionedConcurrencyConfigTimeouts#getUpdate}
         * @param update the value to be set.
         * @return {@code this}
         */
        public Builder update(java.lang.String update) {
            this.update = update;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaProvisionedConcurrencyConfigTimeouts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaProvisionedConcurrencyConfigTimeouts build() {
            return new Jsii$Proxy(create, update);
        }
    }

    /**
     * An implementation for {@link LambdaProvisionedConcurrencyConfigTimeouts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaProvisionedConcurrencyConfigTimeouts {
        private final java.lang.String create;
        private final java.lang.String update;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.update = software.amazon.jsii.Kernel.get(this, "update", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String create, final java.lang.String update) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.create = create;
            this.update = update;
        }

        @Override
        public final java.lang.String getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.String getUpdate() {
            return this.update;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getUpdate() != null) {
                data.set("update", om.valueToTree(this.getUpdate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LambdaProvisionedConcurrencyConfigTimeouts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaProvisionedConcurrencyConfigTimeouts.Jsii$Proxy that = (LambdaProvisionedConcurrencyConfigTimeouts.Jsii$Proxy) o;

            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            return this.update != null ? this.update.equals(that.update) : that.update == null;
        }

        @Override
        public final int hashCode() {
            int result = this.create != null ? this.create.hashCode() : 0;
            result = 31 * result + (this.update != null ? this.update.hashCode() : 0);
            return result;
        }
    }
}
