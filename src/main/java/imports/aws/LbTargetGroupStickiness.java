package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.703Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbTargetGroupStickiness")
@software.amazon.jsii.Jsii.Proxy(LbTargetGroupStickiness.Jsii$Proxy.class)
public interface LbTargetGroupStickiness extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.Number getCookieDuration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbTargetGroupStickiness}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbTargetGroupStickiness}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbTargetGroupStickiness> {
        private java.lang.String type;
        private java.lang.Number cookieDuration;
        private java.lang.Boolean enabled;

        /**
         * Sets the value of {@link LbTargetGroupStickiness#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupStickiness#getCookieDuration}
         * @param cookieDuration the value to be set.
         * @return {@code this}
         */
        public Builder cookieDuration(java.lang.Number cookieDuration) {
            this.cookieDuration = cookieDuration;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupStickiness#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LbTargetGroupStickiness}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbTargetGroupStickiness build() {
            return new Jsii$Proxy(type, cookieDuration, enabled);
        }
    }

    /**
     * An implementation for {@link LbTargetGroupStickiness}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbTargetGroupStickiness {
        private final java.lang.String type;
        private final java.lang.Number cookieDuration;
        private final java.lang.Boolean enabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cookieDuration = software.amazon.jsii.Kernel.get(this, "cookieDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String type, final java.lang.Number cookieDuration, final java.lang.Boolean enabled) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.cookieDuration = cookieDuration;
            this.enabled = enabled;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getCookieDuration() {
            return this.cookieDuration;
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

            data.set("type", om.valueToTree(this.getType()));
            if (this.getCookieDuration() != null) {
                data.set("cookieDuration", om.valueToTree(this.getCookieDuration()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LbTargetGroupStickiness"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbTargetGroupStickiness.Jsii$Proxy that = (LbTargetGroupStickiness.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.cookieDuration != null ? !this.cookieDuration.equals(that.cookieDuration) : that.cookieDuration != null) return false;
            return this.enabled != null ? this.enabled.equals(that.enabled) : that.enabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.cookieDuration != null ? this.cookieDuration.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            return result;
        }
    }
}
