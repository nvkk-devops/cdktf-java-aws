package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.938Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafRuleGroupActivatedRule")
@software.amazon.jsii.Jsii.Proxy(WafRuleGroupActivatedRule.Jsii$Proxy.class)
public interface WafRuleGroupActivatedRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * action block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafRuleGroupActivatedRuleAction> getAction();

    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    @org.jetbrains.annotations.NotNull java.lang.String getRuleId();

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WafRuleGroupActivatedRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafRuleGroupActivatedRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafRuleGroupActivatedRule> {
        private java.util.List<imports.aws.WafRuleGroupActivatedRuleAction> action;
        private java.lang.Number priority;
        private java.lang.String ruleId;
        private java.lang.String type;

        /**
         * Sets the value of {@link WafRuleGroupActivatedRule#getAction}
         * @param action action block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder action(java.util.List<? extends imports.aws.WafRuleGroupActivatedRuleAction> action) {
            this.action = (java.util.List<imports.aws.WafRuleGroupActivatedRuleAction>)action;
            return this;
        }

        /**
         * Sets the value of {@link WafRuleGroupActivatedRule#getPriority}
         * @param priority the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link WafRuleGroupActivatedRule#getRuleId}
         * @param ruleId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleId(java.lang.String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Sets the value of {@link WafRuleGroupActivatedRule#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WafRuleGroupActivatedRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafRuleGroupActivatedRule build() {
            return new Jsii$Proxy(action, priority, ruleId, type);
        }
    }

    /**
     * An implementation for {@link WafRuleGroupActivatedRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafRuleGroupActivatedRule {
        private final java.util.List<imports.aws.WafRuleGroupActivatedRuleAction> action;
        private final java.lang.Number priority;
        private final java.lang.String ruleId;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafRuleGroupActivatedRuleAction.class)));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ruleId = software.amazon.jsii.Kernel.get(this, "ruleId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.WafRuleGroupActivatedRuleAction> action, final java.lang.Number priority, final java.lang.String ruleId, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = (java.util.List<imports.aws.WafRuleGroupActivatedRuleAction>)java.util.Objects.requireNonNull(action, "action is required");
            this.priority = java.util.Objects.requireNonNull(priority, "priority is required");
            this.ruleId = java.util.Objects.requireNonNull(ruleId, "ruleId is required");
            this.type = type;
        }

        @Override
        public final java.util.List<imports.aws.WafRuleGroupActivatedRuleAction> getAction() {
            return this.action;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.lang.String getRuleId() {
            return this.ruleId;
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

            data.set("action", om.valueToTree(this.getAction()));
            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("ruleId", om.valueToTree(this.getRuleId()));
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.WafRuleGroupActivatedRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafRuleGroupActivatedRule.Jsii$Proxy that = (WafRuleGroupActivatedRule.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!priority.equals(that.priority)) return false;
            if (!ruleId.equals(that.ruleId)) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.ruleId.hashCode());
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
