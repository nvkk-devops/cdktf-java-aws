package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.031Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppautoscalingScheduledActionScalableTargetAction")
@software.amazon.jsii.Jsii.Proxy(AppautoscalingScheduledActionScalableTargetAction.Jsii$Proxy.class)
public interface AppautoscalingScheduledActionScalableTargetAction extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppautoscalingScheduledActionScalableTargetAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppautoscalingScheduledActionScalableTargetAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppautoscalingScheduledActionScalableTargetAction> {
        private java.lang.Number maxCapacity;
        private java.lang.Number minCapacity;

        /**
         * Sets the value of {@link AppautoscalingScheduledActionScalableTargetAction#getMaxCapacity}
         * @param maxCapacity the value to be set.
         * @return {@code this}
         */
        public Builder maxCapacity(java.lang.Number maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionScalableTargetAction#getMinCapacity}
         * @param minCapacity the value to be set.
         * @return {@code this}
         */
        public Builder minCapacity(java.lang.Number minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppautoscalingScheduledActionScalableTargetAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppautoscalingScheduledActionScalableTargetAction build() {
            return new Jsii$Proxy(maxCapacity, minCapacity);
        }
    }

    /**
     * An implementation for {@link AppautoscalingScheduledActionScalableTargetAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppautoscalingScheduledActionScalableTargetAction {
        private final java.lang.Number maxCapacity;
        private final java.lang.Number minCapacity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxCapacity = software.amazon.jsii.Kernel.get(this, "maxCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minCapacity = software.amazon.jsii.Kernel.get(this, "minCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number maxCapacity, final java.lang.Number minCapacity) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxCapacity = maxCapacity;
            this.minCapacity = minCapacity;
        }

        @Override
        public final java.lang.Number getMaxCapacity() {
            return this.maxCapacity;
        }

        @Override
        public final java.lang.Number getMinCapacity() {
            return this.minCapacity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxCapacity() != null) {
                data.set("maxCapacity", om.valueToTree(this.getMaxCapacity()));
            }
            if (this.getMinCapacity() != null) {
                data.set("minCapacity", om.valueToTree(this.getMinCapacity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppautoscalingScheduledActionScalableTargetAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppautoscalingScheduledActionScalableTargetAction.Jsii$Proxy that = (AppautoscalingScheduledActionScalableTargetAction.Jsii$Proxy) o;

            if (this.maxCapacity != null ? !this.maxCapacity.equals(that.maxCapacity) : that.maxCapacity != null) return false;
            return this.minCapacity != null ? this.minCapacity.equals(that.minCapacity) : that.minCapacity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxCapacity != null ? this.maxCapacity.hashCode() : 0;
            result = 31 * result + (this.minCapacity != null ? this.minCapacity.hashCode() : 0);
            return result;
        }
    }
}
