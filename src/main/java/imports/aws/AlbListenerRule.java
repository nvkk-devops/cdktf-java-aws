package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.941Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbListenerRule")
public class AlbListenerRule extends com.hashicorp.cdktf.TerraformResource {

    protected AlbListenerRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AlbListenerRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AlbListenerRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AlbListenerRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetPriority() {
        software.amazon.jsii.Kernel.call(this, "resetPriority", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AlbListenerRuleAction> getActionInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "actionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleAction.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AlbListenerRuleCondition> getConditionInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "conditionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleCondition.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getListenerArnInput() {
        return software.amazon.jsii.Kernel.get(this, "listenerArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPriorityInput() {
        return software.amazon.jsii.Kernel.get(this, "priorityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AlbListenerRuleAction> getAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleAction.class))));
    }

    public void setAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AlbListenerRuleAction> value) {
        software.amazon.jsii.Kernel.set(this, "action", java.util.Objects.requireNonNull(value, "action is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AlbListenerRuleCondition> getCondition() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "condition", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleCondition.class))));
    }

    public void setCondition(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AlbListenerRuleCondition> value) {
        software.amazon.jsii.Kernel.set(this, "condition", java.util.Objects.requireNonNull(value, "condition is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getListenerArn() {
        return software.amazon.jsii.Kernel.get(this, "listenerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setListenerArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "listenerArn", java.util.Objects.requireNonNull(value, "listenerArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPriority() {
        return software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPriority(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "priority", java.util.Objects.requireNonNull(value, "priority is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AlbListenerRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AlbListenerRule> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.AlbListenerRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AlbListenerRuleConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * action block.
         * <p>
         * @return {@code this}
         * @param action action block. This parameter is required.
         */
        public Builder action(final java.util.List<? extends imports.aws.AlbListenerRuleAction> action) {
            this.config.action(action);
            return this;
        }

        /**
         * condition block.
         * <p>
         * @return {@code this}
         * @param condition condition block. This parameter is required.
         */
        public Builder condition(final java.util.List<? extends imports.aws.AlbListenerRuleCondition> condition) {
            this.config.condition(condition);
            return this;
        }

        /**
         * @return {@code this}
         * @param listenerArn This parameter is required.
         */
        public Builder listenerArn(final java.lang.String listenerArn) {
            this.config.listenerArn(listenerArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param priority This parameter is required.
         */
        public Builder priority(final java.lang.Number priority) {
            this.config.priority(priority);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AlbListenerRule}.
         */
        @Override
        public imports.aws.AlbListenerRule build() {
            return new imports.aws.AlbListenerRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
