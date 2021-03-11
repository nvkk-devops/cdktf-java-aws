package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.202Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigConfigRuleSourceSourceDetail")
@software.amazon.jsii.Jsii.Proxy(ConfigConfigRuleSourceSourceDetail.Jsii$Proxy.class)
public interface ConfigConfigRuleSourceSourceDetail extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getEventSource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaximumExecutionFrequency() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMessageType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigConfigRuleSourceSourceDetail}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigConfigRuleSourceSourceDetail}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigConfigRuleSourceSourceDetail> {
        private java.lang.String eventSource;
        private java.lang.String maximumExecutionFrequency;
        private java.lang.String messageType;

        /**
         * Sets the value of {@link ConfigConfigRuleSourceSourceDetail#getEventSource}
         * @param eventSource the value to be set.
         * @return {@code this}
         */
        public Builder eventSource(java.lang.String eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleSourceSourceDetail#getMaximumExecutionFrequency}
         * @param maximumExecutionFrequency the value to be set.
         * @return {@code this}
         */
        public Builder maximumExecutionFrequency(java.lang.String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleSourceSourceDetail#getMessageType}
         * @param messageType the value to be set.
         * @return {@code this}
         */
        public Builder messageType(java.lang.String messageType) {
            this.messageType = messageType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigConfigRuleSourceSourceDetail}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigConfigRuleSourceSourceDetail build() {
            return new Jsii$Proxy(eventSource, maximumExecutionFrequency, messageType);
        }
    }

    /**
     * An implementation for {@link ConfigConfigRuleSourceSourceDetail}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigConfigRuleSourceSourceDetail {
        private final java.lang.String eventSource;
        private final java.lang.String maximumExecutionFrequency;
        private final java.lang.String messageType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.eventSource = software.amazon.jsii.Kernel.get(this, "eventSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maximumExecutionFrequency = software.amazon.jsii.Kernel.get(this, "maximumExecutionFrequency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.messageType = software.amazon.jsii.Kernel.get(this, "messageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String eventSource, final java.lang.String maximumExecutionFrequency, final java.lang.String messageType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eventSource = eventSource;
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            this.messageType = messageType;
        }

        @Override
        public final java.lang.String getEventSource() {
            return this.eventSource;
        }

        @Override
        public final java.lang.String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        @Override
        public final java.lang.String getMessageType() {
            return this.messageType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEventSource() != null) {
                data.set("eventSource", om.valueToTree(this.getEventSource()));
            }
            if (this.getMaximumExecutionFrequency() != null) {
                data.set("maximumExecutionFrequency", om.valueToTree(this.getMaximumExecutionFrequency()));
            }
            if (this.getMessageType() != null) {
                data.set("messageType", om.valueToTree(this.getMessageType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ConfigConfigRuleSourceSourceDetail"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigConfigRuleSourceSourceDetail.Jsii$Proxy that = (ConfigConfigRuleSourceSourceDetail.Jsii$Proxy) o;

            if (this.eventSource != null ? !this.eventSource.equals(that.eventSource) : that.eventSource != null) return false;
            if (this.maximumExecutionFrequency != null ? !this.maximumExecutionFrequency.equals(that.maximumExecutionFrequency) : that.maximumExecutionFrequency != null) return false;
            return this.messageType != null ? this.messageType.equals(that.messageType) : that.messageType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.eventSource != null ? this.eventSource.hashCode() : 0;
            result = 31 * result + (this.maximumExecutionFrequency != null ? this.maximumExecutionFrequency.hashCode() : 0);
            result = 31 * result + (this.messageType != null ? this.messageType.hashCode() : 0);
            return result;
        }
    }
}
