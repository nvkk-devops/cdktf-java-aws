package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.864Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesReceiptRule")
public class SesReceiptRule extends com.hashicorp.cdktf.TerraformResource {

    protected SesReceiptRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesReceiptRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SesReceiptRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SesReceiptRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAddHeaderAction() {
        software.amazon.jsii.Kernel.call(this, "resetAddHeaderAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAfter() {
        software.amazon.jsii.Kernel.call(this, "resetAfter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBounceAction() {
        software.amazon.jsii.Kernel.call(this, "resetBounceAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaAction() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRecipients() {
        software.amazon.jsii.Kernel.call(this, "resetRecipients", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Action() {
        software.amazon.jsii.Kernel.call(this, "resetS3Action", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScanEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetScanEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnsAction() {
        software.amazon.jsii.Kernel.call(this, "resetSnsAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStopAction() {
        software.amazon.jsii.Kernel.call(this, "resetStopAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTlsPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetTlsPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWorkmailAction() {
        software.amazon.jsii.Kernel.call(this, "resetWorkmailAction", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleSetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleSetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleAddHeaderAction> getAddHeaderActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesReceiptRuleAddHeaderAction>)(software.amazon.jsii.Kernel.get(this, "addHeaderActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleAddHeaderAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAfterInput() {
        return software.amazon.jsii.Kernel.get(this, "afterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleBounceAction> getBounceActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesReceiptRuleBounceAction>)(software.amazon.jsii.Kernel.get(this, "bounceActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleBounceAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleLambdaAction> getLambdaActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesReceiptRuleLambdaAction>)(software.amazon.jsii.Kernel.get(this, "lambdaActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleLambdaAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRecipientsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "recipientsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleS3Action> getS3ActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesReceiptRuleS3Action>)(software.amazon.jsii.Kernel.get(this, "s3ActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleS3Action.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getScanEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "scanEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleSnsAction> getSnsActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesReceiptRuleSnsAction>)(software.amazon.jsii.Kernel.get(this, "snsActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleSnsAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleStopAction> getStopActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesReceiptRuleStopAction>)(software.amazon.jsii.Kernel.get(this, "stopActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleStopAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTlsPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "tlsPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleWorkmailAction> getWorkmailActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SesReceiptRuleWorkmailAction>)(software.amazon.jsii.Kernel.get(this, "workmailActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleWorkmailAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleAddHeaderAction> getAddHeaderAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "addHeaderAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleAddHeaderAction.class))));
    }

    public void setAddHeaderAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleAddHeaderAction> value) {
        software.amazon.jsii.Kernel.set(this, "addHeaderAction", java.util.Objects.requireNonNull(value, "addHeaderAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAfter() {
        return software.amazon.jsii.Kernel.get(this, "after", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAfter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "after", java.util.Objects.requireNonNull(value, "after is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleBounceAction> getBounceAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "bounceAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleBounceAction.class))));
    }

    public void setBounceAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleBounceAction> value) {
        software.amazon.jsii.Kernel.set(this, "bounceAction", java.util.Objects.requireNonNull(value, "bounceAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleLambdaAction> getLambdaAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lambdaAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleLambdaAction.class))));
    }

    public void setLambdaAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleLambdaAction> value) {
        software.amazon.jsii.Kernel.set(this, "lambdaAction", java.util.Objects.requireNonNull(value, "lambdaAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRecipients() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "recipients", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRecipients(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "recipients", java.util.Objects.requireNonNull(value, "recipients is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleSetName() {
        return software.amazon.jsii.Kernel.get(this, "ruleSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuleSetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ruleSetName", java.util.Objects.requireNonNull(value, "ruleSetName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleS3Action> getS3Action() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "s3Action", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleS3Action.class))));
    }

    public void setS3Action(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleS3Action> value) {
        software.amazon.jsii.Kernel.set(this, "s3Action", java.util.Objects.requireNonNull(value, "s3Action is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getScanEnabled() {
        return software.amazon.jsii.Kernel.get(this, "scanEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setScanEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "scanEnabled", java.util.Objects.requireNonNull(value, "scanEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleSnsAction> getSnsAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "snsAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleSnsAction.class))));
    }

    public void setSnsAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleSnsAction> value) {
        software.amazon.jsii.Kernel.set(this, "snsAction", java.util.Objects.requireNonNull(value, "snsAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleStopAction> getStopAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "stopAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleStopAction.class))));
    }

    public void setStopAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleStopAction> value) {
        software.amazon.jsii.Kernel.set(this, "stopAction", java.util.Objects.requireNonNull(value, "stopAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTlsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "tlsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTlsPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tlsPolicy", java.util.Objects.requireNonNull(value, "tlsPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleWorkmailAction> getWorkmailAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "workmailAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleWorkmailAction.class))));
    }

    public void setWorkmailAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SesReceiptRuleWorkmailAction> value) {
        software.amazon.jsii.Kernel.set(this, "workmailAction", java.util.Objects.requireNonNull(value, "workmailAction is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SesReceiptRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SesReceiptRule> {
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
        private final imports.aws.SesReceiptRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SesReceiptRuleConfig.Builder();
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
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param ruleSetName This parameter is required.
         */
        public Builder ruleSetName(final java.lang.String ruleSetName) {
            this.config.ruleSetName(ruleSetName);
            return this;
        }

        /**
         * add_header_action block.
         * <p>
         * @return {@code this}
         * @param addHeaderAction add_header_action block. This parameter is required.
         */
        public Builder addHeaderAction(final java.util.List<? extends imports.aws.SesReceiptRuleAddHeaderAction> addHeaderAction) {
            this.config.addHeaderAction(addHeaderAction);
            return this;
        }

        /**
         * @return {@code this}
         * @param after This parameter is required.
         */
        public Builder after(final java.lang.String after) {
            this.config.after(after);
            return this;
        }

        /**
         * bounce_action block.
         * <p>
         * @return {@code this}
         * @param bounceAction bounce_action block. This parameter is required.
         */
        public Builder bounceAction(final java.util.List<? extends imports.aws.SesReceiptRuleBounceAction> bounceAction) {
            this.config.bounceAction(bounceAction);
            return this;
        }

        /**
         * @return {@code this}
         * @param enabled This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * lambda_action block.
         * <p>
         * @return {@code this}
         * @param lambdaAction lambda_action block. This parameter is required.
         */
        public Builder lambdaAction(final java.util.List<? extends imports.aws.SesReceiptRuleLambdaAction> lambdaAction) {
            this.config.lambdaAction(lambdaAction);
            return this;
        }

        /**
         * @return {@code this}
         * @param recipients This parameter is required.
         */
        public Builder recipients(final java.util.List<java.lang.String> recipients) {
            this.config.recipients(recipients);
            return this;
        }

        /**
         * s3_action block.
         * <p>
         * @return {@code this}
         * @param s3Action s3_action block. This parameter is required.
         */
        public Builder s3Action(final java.util.List<? extends imports.aws.SesReceiptRuleS3Action> s3Action) {
            this.config.s3Action(s3Action);
            return this;
        }

        /**
         * @return {@code this}
         * @param scanEnabled This parameter is required.
         */
        public Builder scanEnabled(final java.lang.Boolean scanEnabled) {
            this.config.scanEnabled(scanEnabled);
            return this;
        }

        /**
         * sns_action block.
         * <p>
         * @return {@code this}
         * @param snsAction sns_action block. This parameter is required.
         */
        public Builder snsAction(final java.util.List<? extends imports.aws.SesReceiptRuleSnsAction> snsAction) {
            this.config.snsAction(snsAction);
            return this;
        }

        /**
         * stop_action block.
         * <p>
         * @return {@code this}
         * @param stopAction stop_action block. This parameter is required.
         */
        public Builder stopAction(final java.util.List<? extends imports.aws.SesReceiptRuleStopAction> stopAction) {
            this.config.stopAction(stopAction);
            return this;
        }

        /**
         * @return {@code this}
         * @param tlsPolicy This parameter is required.
         */
        public Builder tlsPolicy(final java.lang.String tlsPolicy) {
            this.config.tlsPolicy(tlsPolicy);
            return this;
        }

        /**
         * workmail_action block.
         * <p>
         * @return {@code this}
         * @param workmailAction workmail_action block. This parameter is required.
         */
        public Builder workmailAction(final java.util.List<? extends imports.aws.SesReceiptRuleWorkmailAction> workmailAction) {
            this.config.workmailAction(workmailAction);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SesReceiptRule}.
         */
        @Override
        public imports.aws.SesReceiptRule build() {
            return new imports.aws.SesReceiptRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
