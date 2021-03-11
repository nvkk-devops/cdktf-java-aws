package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.700Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbListenerRuleActionForwardStickiness")
@software.amazon.jsii.Jsii.Proxy(LbListenerRuleActionForwardStickiness.Jsii$Proxy.class)
public interface LbListenerRuleActionForwardStickiness extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getDuration();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbListenerRuleActionForwardStickiness}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbListenerRuleActionForwardStickiness}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbListenerRuleActionForwardStickiness> {
        private java.lang.Number duration;
        private java.lang.Boolean enabled;

        /**
         * Sets the value of {@link LbListenerRuleActionForwardStickiness#getDuration}
         * @param duration the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder duration(java.lang.Number duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleActionForwardStickiness#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LbListenerRuleActionForwardStickiness}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbListenerRuleActionForwardStickiness build() {
            return new Jsii$Proxy(duration, enabled);
        }
    }

    /**
     * An implementation for {@link LbListenerRuleActionForwardStickiness}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbListenerRuleActionForwardStickiness {
        private final java.lang.Number duration;
        private final java.lang.Boolean enabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.duration = software.amazon.jsii.Kernel.get(this, "duration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number duration, final java.lang.Boolean enabled) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.duration = java.util.Objects.requireNonNull(duration, "duration is required");
            this.enabled = enabled;
        }

        @Override
        public final java.lang.Number getDuration() {
            return this.duration;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("duration", om.valueToTree(this.getDuration()));
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LbListenerRuleActionForwardStickiness"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbListenerRuleActionForwardStickiness.Jsii$Proxy that = (LbListenerRuleActionForwardStickiness.Jsii$Proxy) o;

            if (!duration.equals(that.duration)) return false;
            return this.enabled != null ? this.enabled.equals(that.enabled) : that.enabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.duration.hashCode();
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            return result;
        }
    }
}
