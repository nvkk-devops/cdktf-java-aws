package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.440Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule")
@software.amazon.jsii.Jsii.Proxy(DlmLifecyclePolicyPolicyDetailsScheduleCreateRule.Jsii$Proxy.class)
public interface DlmLifecyclePolicyPolicyDetailsScheduleCreateRule extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getInterval();

    default @org.jetbrains.annotations.Nullable java.lang.String getIntervalUnit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTimes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DlmLifecyclePolicyPolicyDetailsScheduleCreateRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DlmLifecyclePolicyPolicyDetailsScheduleCreateRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DlmLifecyclePolicyPolicyDetailsScheduleCreateRule> {
        private java.lang.Number interval;
        private java.lang.String intervalUnit;
        private java.util.List<java.lang.String> times;

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsScheduleCreateRule#getInterval}
         * @param interval the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder interval(java.lang.Number interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsScheduleCreateRule#getIntervalUnit}
         * @param intervalUnit the value to be set.
         * @return {@code this}
         */
        public Builder intervalUnit(java.lang.String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsScheduleCreateRule#getTimes}
         * @param times the value to be set.
         * @return {@code this}
         */
        public Builder times(java.util.List<java.lang.String> times) {
            this.times = times;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DlmLifecyclePolicyPolicyDetailsScheduleCreateRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DlmLifecyclePolicyPolicyDetailsScheduleCreateRule build() {
            return new Jsii$Proxy(interval, intervalUnit, times);
        }
    }

    /**
     * An implementation for {@link DlmLifecyclePolicyPolicyDetailsScheduleCreateRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DlmLifecyclePolicyPolicyDetailsScheduleCreateRule {
        private final java.lang.Number interval;
        private final java.lang.String intervalUnit;
        private final java.util.List<java.lang.String> times;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.interval = software.amazon.jsii.Kernel.get(this, "interval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.intervalUnit = software.amazon.jsii.Kernel.get(this, "intervalUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.times = software.amazon.jsii.Kernel.get(this, "times", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number interval, final java.lang.String intervalUnit, final java.util.List<java.lang.String> times) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.interval = java.util.Objects.requireNonNull(interval, "interval is required");
            this.intervalUnit = intervalUnit;
            this.times = times;
        }

        @Override
        public final java.lang.Number getInterval() {
            return this.interval;
        }

        @Override
        public final java.lang.String getIntervalUnit() {
            return this.intervalUnit;
        }

        @Override
        public final java.util.List<java.lang.String> getTimes() {
            return this.times;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("interval", om.valueToTree(this.getInterval()));
            if (this.getIntervalUnit() != null) {
                data.set("intervalUnit", om.valueToTree(this.getIntervalUnit()));
            }
            if (this.getTimes() != null) {
                data.set("times", om.valueToTree(this.getTimes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DlmLifecyclePolicyPolicyDetailsScheduleCreateRule.Jsii$Proxy that = (DlmLifecyclePolicyPolicyDetailsScheduleCreateRule.Jsii$Proxy) o;

            if (!interval.equals(that.interval)) return false;
            if (this.intervalUnit != null ? !this.intervalUnit.equals(that.intervalUnit) : that.intervalUnit != null) return false;
            return this.times != null ? this.times.equals(that.times) : that.times == null;
        }

        @Override
        public final int hashCode() {
            int result = this.interval.hashCode();
            result = 31 * result + (this.intervalUnit != null ? this.intervalUnit.hashCode() : 0);
            result = 31 * result + (this.times != null ? this.times.hashCode() : 0);
            return result;
        }
    }
}
