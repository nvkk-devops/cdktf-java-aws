package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.947Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafregionalWebAclLoggingConfiguration")
@software.amazon.jsii.Jsii.Proxy(WafregionalWebAclLoggingConfiguration.Jsii$Proxy.class)
public interface WafregionalWebAclLoggingConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getLogDestination();

    /**
     * redacted_fields block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields> getRedactedFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WafregionalWebAclLoggingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafregionalWebAclLoggingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafregionalWebAclLoggingConfiguration> {
        private java.lang.String logDestination;
        private java.util.List<imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields> redactedFields;

        /**
         * Sets the value of {@link WafregionalWebAclLoggingConfiguration#getLogDestination}
         * @param logDestination the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder logDestination(java.lang.String logDestination) {
            this.logDestination = logDestination;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclLoggingConfiguration#getRedactedFields}
         * @param redactedFields redacted_fields block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder redactedFields(java.util.List<? extends imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields> redactedFields) {
            this.redactedFields = (java.util.List<imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields>)redactedFields;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WafregionalWebAclLoggingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafregionalWebAclLoggingConfiguration build() {
            return new Jsii$Proxy(logDestination, redactedFields);
        }
    }

    /**
     * An implementation for {@link WafregionalWebAclLoggingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafregionalWebAclLoggingConfiguration {
        private final java.lang.String logDestination;
        private final java.util.List<imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields> redactedFields;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.logDestination = software.amazon.jsii.Kernel.get(this, "logDestination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.redactedFields = software.amazon.jsii.Kernel.get(this, "redactedFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String logDestination, final java.util.List<? extends imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields> redactedFields) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.logDestination = java.util.Objects.requireNonNull(logDestination, "logDestination is required");
            this.redactedFields = (java.util.List<imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields>)redactedFields;
        }

        @Override
        public final java.lang.String getLogDestination() {
            return this.logDestination;
        }

        @Override
        public final java.util.List<imports.aws.WafregionalWebAclLoggingConfigurationRedactedFields> getRedactedFields() {
            return this.redactedFields;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("logDestination", om.valueToTree(this.getLogDestination()));
            if (this.getRedactedFields() != null) {
                data.set("redactedFields", om.valueToTree(this.getRedactedFields()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.WafregionalWebAclLoggingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafregionalWebAclLoggingConfiguration.Jsii$Proxy that = (WafregionalWebAclLoggingConfiguration.Jsii$Proxy) o;

            if (!logDestination.equals(that.logDestination)) return false;
            return this.redactedFields != null ? this.redactedFields.equals(that.redactedFields) : that.redactedFields == null;
        }

        @Override
        public final int hashCode() {
            int result = this.logDestination.hashCode();
            result = 31 * result + (this.redactedFields != null ? this.redactedFields.hashCode() : 0);
            return result;
        }
    }
}
