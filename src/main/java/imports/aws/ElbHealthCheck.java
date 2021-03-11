package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.561Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElbHealthCheck")
@software.amazon.jsii.Jsii.Proxy(ElbHealthCheck.Jsii$Proxy.class)
public interface ElbHealthCheck extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getHealthyThreshold();

    @org.jetbrains.annotations.NotNull java.lang.Number getInterval();

    @org.jetbrains.annotations.NotNull java.lang.String getTarget();

    @org.jetbrains.annotations.NotNull java.lang.Number getTimeout();

    @org.jetbrains.annotations.NotNull java.lang.Number getUnhealthyThreshold();

    /**
     * @return a {@link Builder} of {@link ElbHealthCheck}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElbHealthCheck}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElbHealthCheck> {
        private java.lang.Number healthyThreshold;
        private java.lang.Number interval;
        private java.lang.String target;
        private java.lang.Number timeout;
        private java.lang.Number unhealthyThreshold;

        /**
         * Sets the value of {@link ElbHealthCheck#getHealthyThreshold}
         * @param healthyThreshold the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder healthyThreshold(java.lang.Number healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * Sets the value of {@link ElbHealthCheck#getInterval}
         * @param interval the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder interval(java.lang.Number interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Sets the value of {@link ElbHealthCheck#getTarget}
         * @param target the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder target(java.lang.String target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link ElbHealthCheck#getTimeout}
         * @param timeout the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets the value of {@link ElbHealthCheck#getUnhealthyThreshold}
         * @param unhealthyThreshold the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder unhealthyThreshold(java.lang.Number unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElbHealthCheck}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElbHealthCheck build() {
            return new Jsii$Proxy(healthyThreshold, interval, target, timeout, unhealthyThreshold);
        }
    }

    /**
     * An implementation for {@link ElbHealthCheck}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElbHealthCheck {
        private final java.lang.Number healthyThreshold;
        private final java.lang.Number interval;
        private final java.lang.String target;
        private final java.lang.Number timeout;
        private final java.lang.Number unhealthyThreshold;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.healthyThreshold = software.amazon.jsii.Kernel.get(this, "healthyThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.interval = software.amazon.jsii.Kernel.get(this, "interval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.unhealthyThreshold = software.amazon.jsii.Kernel.get(this, "unhealthyThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number healthyThreshold, final java.lang.Number interval, final java.lang.String target, final java.lang.Number timeout, final java.lang.Number unhealthyThreshold) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.healthyThreshold = java.util.Objects.requireNonNull(healthyThreshold, "healthyThreshold is required");
            this.interval = java.util.Objects.requireNonNull(interval, "interval is required");
            this.target = java.util.Objects.requireNonNull(target, "target is required");
            this.timeout = java.util.Objects.requireNonNull(timeout, "timeout is required");
            this.unhealthyThreshold = java.util.Objects.requireNonNull(unhealthyThreshold, "unhealthyThreshold is required");
        }

        @Override
        public final java.lang.Number getHealthyThreshold() {
            return this.healthyThreshold;
        }

        @Override
        public final java.lang.Number getInterval() {
            return this.interval;
        }

        @Override
        public final java.lang.String getTarget() {
            return this.target;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        public final java.lang.Number getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("healthyThreshold", om.valueToTree(this.getHealthyThreshold()));
            data.set("interval", om.valueToTree(this.getInterval()));
            data.set("target", om.valueToTree(this.getTarget()));
            data.set("timeout", om.valueToTree(this.getTimeout()));
            data.set("unhealthyThreshold", om.valueToTree(this.getUnhealthyThreshold()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElbHealthCheck"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElbHealthCheck.Jsii$Proxy that = (ElbHealthCheck.Jsii$Proxy) o;

            if (!healthyThreshold.equals(that.healthyThreshold)) return false;
            if (!interval.equals(that.interval)) return false;
            if (!target.equals(that.target)) return false;
            if (!timeout.equals(that.timeout)) return false;
            return this.unhealthyThreshold.equals(that.unhealthyThreshold);
        }

        @Override
        public final int hashCode() {
            int result = this.healthyThreshold.hashCode();
            result = 31 * result + (this.interval.hashCode());
            result = 31 * result + (this.target.hashCode());
            result = 31 * result + (this.timeout.hashCode());
            result = 31 * result + (this.unhealthyThreshold.hashCode());
            return result;
        }
    }
}
