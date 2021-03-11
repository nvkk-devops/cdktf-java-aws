package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.603Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueJobNotificationProperty")
@software.amazon.jsii.Jsii.Proxy(GlueJobNotificationProperty.Jsii$Proxy.class)
public interface GlueJobNotificationProperty extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getNotifyDelayAfter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueJobNotificationProperty}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueJobNotificationProperty}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueJobNotificationProperty> {
        private java.lang.Number notifyDelayAfter;

        /**
         * Sets the value of {@link GlueJobNotificationProperty#getNotifyDelayAfter}
         * @param notifyDelayAfter the value to be set.
         * @return {@code this}
         */
        public Builder notifyDelayAfter(java.lang.Number notifyDelayAfter) {
            this.notifyDelayAfter = notifyDelayAfter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueJobNotificationProperty}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueJobNotificationProperty build() {
            return new Jsii$Proxy(notifyDelayAfter);
        }
    }

    /**
     * An implementation for {@link GlueJobNotificationProperty}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueJobNotificationProperty {
        private final java.lang.Number notifyDelayAfter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.notifyDelayAfter = software.amazon.jsii.Kernel.get(this, "notifyDelayAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number notifyDelayAfter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.notifyDelayAfter = notifyDelayAfter;
        }

        @Override
        public final java.lang.Number getNotifyDelayAfter() {
            return this.notifyDelayAfter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNotifyDelayAfter() != null) {
                data.set("notifyDelayAfter", om.valueToTree(this.getNotifyDelayAfter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueJobNotificationProperty"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueJobNotificationProperty.Jsii$Proxy that = (GlueJobNotificationProperty.Jsii$Proxy) o;

            return this.notifyDelayAfter != null ? this.notifyDelayAfter.equals(that.notifyDelayAfter) : that.notifyDelayAfter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.notifyDelayAfter != null ? this.notifyDelayAfter.hashCode() : 0;
            return result;
        }
    }
}
