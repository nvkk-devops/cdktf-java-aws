package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.189Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodestarnotificationsNotificationRuleTarget")
@software.amazon.jsii.Jsii.Proxy(CodestarnotificationsNotificationRuleTarget.Jsii$Proxy.class)
public interface CodestarnotificationsNotificationRuleTarget extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAddress();

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodestarnotificationsNotificationRuleTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodestarnotificationsNotificationRuleTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodestarnotificationsNotificationRuleTarget> {
        private java.lang.String address;
        private java.lang.String type;

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleTarget#getAddress}
         * @param address the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder address(java.lang.String address) {
            this.address = address;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleTarget#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodestarnotificationsNotificationRuleTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodestarnotificationsNotificationRuleTarget build() {
            return new Jsii$Proxy(address, type);
        }
    }

    /**
     * An implementation for {@link CodestarnotificationsNotificationRuleTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodestarnotificationsNotificationRuleTarget {
        private final java.lang.String address;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.address = software.amazon.jsii.Kernel.get(this, "address", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String address, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.address = java.util.Objects.requireNonNull(address, "address is required");
            this.type = type;
        }

        @Override
        public final java.lang.String getAddress() {
            return this.address;
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

            data.set("address", om.valueToTree(this.getAddress()));
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodestarnotificationsNotificationRuleTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodestarnotificationsNotificationRuleTarget.Jsii$Proxy that = (CodestarnotificationsNotificationRuleTarget.Jsii$Proxy) o;

            if (!address.equals(that.address)) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.address.hashCode();
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
