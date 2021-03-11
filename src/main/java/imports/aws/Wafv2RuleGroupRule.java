package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.950Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2RuleGroupRule")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRule.Jsii$Proxy.class)
public interface Wafv2RuleGroupRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * action block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2RuleGroupRuleAction> getAction();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    /**
     * statement block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2RuleGroupRuleStatement> getStatement();

    /**
     * visibility_config block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2RuleGroupRuleVisibilityConfig> getVisibilityConfig();

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRule> {
        private java.util.List<imports.aws.Wafv2RuleGroupRuleAction> action;
        private java.lang.String name;
        private java.lang.Number priority;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleStatement> statement;
        private java.util.List<imports.aws.Wafv2RuleGroupRuleVisibilityConfig> visibilityConfig;

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getAction}
         * @param action action block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder action(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleAction> action) {
            this.action = (java.util.List<imports.aws.Wafv2RuleGroupRuleAction>)action;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getPriority}
         * @param priority the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getStatement}
         * @param statement statement block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder statement(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatement> statement) {
            this.statement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatement>)statement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getVisibilityConfig}
         * @param visibilityConfig visibility_config block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder visibilityConfig(java.util.List<? extends imports.aws.Wafv2RuleGroupRuleVisibilityConfig> visibilityConfig) {
            this.visibilityConfig = (java.util.List<imports.aws.Wafv2RuleGroupRuleVisibilityConfig>)visibilityConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRule build() {
            return new Jsii$Proxy(action, name, priority, statement, visibilityConfig);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRule {
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleAction> action;
        private final java.lang.String name;
        private final java.lang.Number priority;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleStatement> statement;
        private final java.util.List<imports.aws.Wafv2RuleGroupRuleVisibilityConfig> visibilityConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleAction.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.statement = software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleStatement.class)));
            this.visibilityConfig = software.amazon.jsii.Kernel.get(this, "visibilityConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2RuleGroupRuleVisibilityConfig.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleAction> action, final java.lang.String name, final java.lang.Number priority, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleStatement> statement, final java.util.List<? extends imports.aws.Wafv2RuleGroupRuleVisibilityConfig> visibilityConfig) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = (java.util.List<imports.aws.Wafv2RuleGroupRuleAction>)java.util.Objects.requireNonNull(action, "action is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.priority = java.util.Objects.requireNonNull(priority, "priority is required");
            this.statement = (java.util.List<imports.aws.Wafv2RuleGroupRuleStatement>)java.util.Objects.requireNonNull(statement, "statement is required");
            this.visibilityConfig = (java.util.List<imports.aws.Wafv2RuleGroupRuleVisibilityConfig>)java.util.Objects.requireNonNull(visibilityConfig, "visibilityConfig is required");
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleAction> getAction() {
            return this.action;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleStatement> getStatement() {
            return this.statement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2RuleGroupRuleVisibilityConfig> getVisibilityConfig() {
            return this.visibilityConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("statement", om.valueToTree(this.getStatement()));
            data.set("visibilityConfig", om.valueToTree(this.getVisibilityConfig()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2RuleGroupRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRule.Jsii$Proxy that = (Wafv2RuleGroupRule.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!name.equals(that.name)) return false;
            if (!priority.equals(that.priority)) return false;
            if (!statement.equals(that.statement)) return false;
            return this.visibilityConfig.equals(that.visibilityConfig);
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.statement.hashCode());
            result = 31 * result + (this.visibilityConfig.hashCode());
            return result;
        }
    }
}
