package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.023Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRule")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRule.Jsii$Proxy.class)
public interface Wafv2WebAclRule extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    /**
     * statement block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2WebAclRuleStatement> getStatement();

    /**
     * visibility_config block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2WebAclRuleVisibilityConfig> getVisibilityConfig();

    /**
     * action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleAction> getAction() {
        return null;
    }

    /**
     * override_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleOverrideAction> getOverrideAction() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRule> {
        private java.lang.String name;
        private java.lang.Number priority;
        private java.util.List<imports.aws.Wafv2WebAclRuleStatement> statement;
        private java.util.List<imports.aws.Wafv2WebAclRuleVisibilityConfig> visibilityConfig;
        private java.util.List<imports.aws.Wafv2WebAclRuleAction> action;
        private java.util.List<imports.aws.Wafv2WebAclRuleOverrideAction> overrideAction;

        /**
         * Sets the value of {@link Wafv2WebAclRule#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getPriority}
         * @param priority the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getStatement}
         * @param statement statement block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder statement(java.util.List<? extends imports.aws.Wafv2WebAclRuleStatement> statement) {
            this.statement = (java.util.List<imports.aws.Wafv2WebAclRuleStatement>)statement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getVisibilityConfig}
         * @param visibilityConfig visibility_config block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder visibilityConfig(java.util.List<? extends imports.aws.Wafv2WebAclRuleVisibilityConfig> visibilityConfig) {
            this.visibilityConfig = (java.util.List<imports.aws.Wafv2WebAclRuleVisibilityConfig>)visibilityConfig;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getAction}
         * @param action action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder action(java.util.List<? extends imports.aws.Wafv2WebAclRuleAction> action) {
            this.action = (java.util.List<imports.aws.Wafv2WebAclRuleAction>)action;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getOverrideAction}
         * @param overrideAction override_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder overrideAction(java.util.List<? extends imports.aws.Wafv2WebAclRuleOverrideAction> overrideAction) {
            this.overrideAction = (java.util.List<imports.aws.Wafv2WebAclRuleOverrideAction>)overrideAction;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRule build() {
            return new Jsii$Proxy(name, priority, statement, visibilityConfig, action, overrideAction);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRule {
        private final java.lang.String name;
        private final java.lang.Number priority;
        private final java.util.List<imports.aws.Wafv2WebAclRuleStatement> statement;
        private final java.util.List<imports.aws.Wafv2WebAclRuleVisibilityConfig> visibilityConfig;
        private final java.util.List<imports.aws.Wafv2WebAclRuleAction> action;
        private final java.util.List<imports.aws.Wafv2WebAclRuleOverrideAction> overrideAction;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.statement = software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleStatement.class)));
            this.visibilityConfig = software.amazon.jsii.Kernel.get(this, "visibilityConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleVisibilityConfig.class)));
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleAction.class)));
            this.overrideAction = software.amazon.jsii.Kernel.get(this, "overrideAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleOverrideAction.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.Number priority, final java.util.List<? extends imports.aws.Wafv2WebAclRuleStatement> statement, final java.util.List<? extends imports.aws.Wafv2WebAclRuleVisibilityConfig> visibilityConfig, final java.util.List<? extends imports.aws.Wafv2WebAclRuleAction> action, final java.util.List<? extends imports.aws.Wafv2WebAclRuleOverrideAction> overrideAction) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.priority = java.util.Objects.requireNonNull(priority, "priority is required");
            this.statement = (java.util.List<imports.aws.Wafv2WebAclRuleStatement>)java.util.Objects.requireNonNull(statement, "statement is required");
            this.visibilityConfig = (java.util.List<imports.aws.Wafv2WebAclRuleVisibilityConfig>)java.util.Objects.requireNonNull(visibilityConfig, "visibilityConfig is required");
            this.action = (java.util.List<imports.aws.Wafv2WebAclRuleAction>)action;
            this.overrideAction = (java.util.List<imports.aws.Wafv2WebAclRuleOverrideAction>)overrideAction;
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
        public final java.util.List<imports.aws.Wafv2WebAclRuleStatement> getStatement() {
            return this.statement;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleVisibilityConfig> getVisibilityConfig() {
            return this.visibilityConfig;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleAction> getAction() {
            return this.action;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleOverrideAction> getOverrideAction() {
            return this.overrideAction;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("statement", om.valueToTree(this.getStatement()));
            data.set("visibilityConfig", om.valueToTree(this.getVisibilityConfig()));
            if (this.getAction() != null) {
                data.set("action", om.valueToTree(this.getAction()));
            }
            if (this.getOverrideAction() != null) {
                data.set("overrideAction", om.valueToTree(this.getOverrideAction()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRule.Jsii$Proxy that = (Wafv2WebAclRule.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!priority.equals(that.priority)) return false;
            if (!statement.equals(that.statement)) return false;
            if (!visibilityConfig.equals(that.visibilityConfig)) return false;
            if (this.action != null ? !this.action.equals(that.action) : that.action != null) return false;
            return this.overrideAction != null ? this.overrideAction.equals(that.overrideAction) : that.overrideAction == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.statement.hashCode());
            result = 31 * result + (this.visibilityConfig.hashCode());
            result = 31 * result + (this.action != null ? this.action.hashCode() : 0);
            result = 31 * result + (this.overrideAction != null ? this.overrideAction.hashCode() : 0);
            return result;
        }
    }
}
