package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.804Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RdsClusterScalingConfiguration")
@software.amazon.jsii.Jsii.Proxy(RdsClusterScalingConfiguration.Jsii$Proxy.class)
public interface RdsClusterScalingConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoPause() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getSecondsUntilAutoPause() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTimeoutAction() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RdsClusterScalingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RdsClusterScalingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RdsClusterScalingConfiguration> {
        private java.lang.Boolean autoPause;
        private java.lang.Number maxCapacity;
        private java.lang.Number minCapacity;
        private java.lang.Number secondsUntilAutoPause;
        private java.lang.String timeoutAction;

        /**
         * Sets the value of {@link RdsClusterScalingConfiguration#getAutoPause}
         * @param autoPause the value to be set.
         * @return {@code this}
         */
        public Builder autoPause(java.lang.Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterScalingConfiguration#getMaxCapacity}
         * @param maxCapacity the value to be set.
         * @return {@code this}
         */
        public Builder maxCapacity(java.lang.Number maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterScalingConfiguration#getMinCapacity}
         * @param minCapacity the value to be set.
         * @return {@code this}
         */
        public Builder minCapacity(java.lang.Number minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterScalingConfiguration#getSecondsUntilAutoPause}
         * @param secondsUntilAutoPause the value to be set.
         * @return {@code this}
         */
        public Builder secondsUntilAutoPause(java.lang.Number secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterScalingConfiguration#getTimeoutAction}
         * @param timeoutAction the value to be set.
         * @return {@code this}
         */
        public Builder timeoutAction(java.lang.String timeoutAction) {
            this.timeoutAction = timeoutAction;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RdsClusterScalingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RdsClusterScalingConfiguration build() {
            return new Jsii$Proxy(autoPause, maxCapacity, minCapacity, secondsUntilAutoPause, timeoutAction);
        }
    }

    /**
     * An implementation for {@link RdsClusterScalingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RdsClusterScalingConfiguration {
        private final java.lang.Boolean autoPause;
        private final java.lang.Number maxCapacity;
        private final java.lang.Number minCapacity;
        private final java.lang.Number secondsUntilAutoPause;
        private final java.lang.String timeoutAction;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.autoPause = software.amazon.jsii.Kernel.get(this, "autoPause", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.maxCapacity = software.amazon.jsii.Kernel.get(this, "maxCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minCapacity = software.amazon.jsii.Kernel.get(this, "minCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.secondsUntilAutoPause = software.amazon.jsii.Kernel.get(this, "secondsUntilAutoPause", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeoutAction = software.amazon.jsii.Kernel.get(this, "timeoutAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean autoPause, final java.lang.Number maxCapacity, final java.lang.Number minCapacity, final java.lang.Number secondsUntilAutoPause, final java.lang.String timeoutAction) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoPause = autoPause;
            this.maxCapacity = maxCapacity;
            this.minCapacity = minCapacity;
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            this.timeoutAction = timeoutAction;
        }

        @Override
        public final java.lang.Boolean getAutoPause() {
            return this.autoPause;
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
        public final java.lang.Number getSecondsUntilAutoPause() {
            return this.secondsUntilAutoPause;
        }

        @Override
        public final java.lang.String getTimeoutAction() {
            return this.timeoutAction;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAutoPause() != null) {
                data.set("autoPause", om.valueToTree(this.getAutoPause()));
            }
            if (this.getMaxCapacity() != null) {
                data.set("maxCapacity", om.valueToTree(this.getMaxCapacity()));
            }
            if (this.getMinCapacity() != null) {
                data.set("minCapacity", om.valueToTree(this.getMinCapacity()));
            }
            if (this.getSecondsUntilAutoPause() != null) {
                data.set("secondsUntilAutoPause", om.valueToTree(this.getSecondsUntilAutoPause()));
            }
            if (this.getTimeoutAction() != null) {
                data.set("timeoutAction", om.valueToTree(this.getTimeoutAction()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.RdsClusterScalingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RdsClusterScalingConfiguration.Jsii$Proxy that = (RdsClusterScalingConfiguration.Jsii$Proxy) o;

            if (this.autoPause != null ? !this.autoPause.equals(that.autoPause) : that.autoPause != null) return false;
            if (this.maxCapacity != null ? !this.maxCapacity.equals(that.maxCapacity) : that.maxCapacity != null) return false;
            if (this.minCapacity != null ? !this.minCapacity.equals(that.minCapacity) : that.minCapacity != null) return false;
            if (this.secondsUntilAutoPause != null ? !this.secondsUntilAutoPause.equals(that.secondsUntilAutoPause) : that.secondsUntilAutoPause != null) return false;
            return this.timeoutAction != null ? this.timeoutAction.equals(that.timeoutAction) : that.timeoutAction == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoPause != null ? this.autoPause.hashCode() : 0;
            result = 31 * result + (this.maxCapacity != null ? this.maxCapacity.hashCode() : 0);
            result = 31 * result + (this.minCapacity != null ? this.minCapacity.hashCode() : 0);
            result = 31 * result + (this.secondsUntilAutoPause != null ? this.secondsUntilAutoPause.hashCode() : 0);
            result = 31 * result + (this.timeoutAction != null ? this.timeoutAction.hashCode() : 0);
            return result;
        }
    }
}
