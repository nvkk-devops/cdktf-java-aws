package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.865Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesReceiptRuleConfig")
@software.amazon.jsii.Jsii.Proxy(SesReceiptRuleConfig.Jsii$Proxy.class)
public interface SesReceiptRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getRuleSetName();

    /**
     * add_header_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleAddHeaderAction> getAddHeaderAction() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAfter() {
        return null;
    }

    /**
     * bounce_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleBounceAction> getBounceAction() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * lambda_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleLambdaAction> getLambdaAction() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRecipients() {
        return null;
    }

    /**
     * s3_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleS3Action> getS3Action() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getScanEnabled() {
        return null;
    }

    /**
     * sns_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleSnsAction> getSnsAction() {
        return null;
    }

    /**
     * stop_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleStopAction> getStopAction() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTlsPolicy() {
        return null;
    }

    /**
     * workmail_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesReceiptRuleWorkmailAction> getWorkmailAction() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SesReceiptRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesReceiptRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesReceiptRuleConfig> {
        private java.lang.String name;
        private java.lang.String ruleSetName;
        private java.util.List<imports.aws.SesReceiptRuleAddHeaderAction> addHeaderAction;
        private java.lang.String after;
        private java.util.List<imports.aws.SesReceiptRuleBounceAction> bounceAction;
        private java.lang.Boolean enabled;
        private java.util.List<imports.aws.SesReceiptRuleLambdaAction> lambdaAction;
        private java.util.List<java.lang.String> recipients;
        private java.util.List<imports.aws.SesReceiptRuleS3Action> s3Action;
        private java.lang.Boolean scanEnabled;
        private java.util.List<imports.aws.SesReceiptRuleSnsAction> snsAction;
        private java.util.List<imports.aws.SesReceiptRuleStopAction> stopAction;
        private java.lang.String tlsPolicy;
        private java.util.List<imports.aws.SesReceiptRuleWorkmailAction> workmailAction;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getRuleSetName}
         * @param ruleSetName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleSetName(java.lang.String ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getAddHeaderAction}
         * @param addHeaderAction add_header_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder addHeaderAction(java.util.List<? extends imports.aws.SesReceiptRuleAddHeaderAction> addHeaderAction) {
            this.addHeaderAction = (java.util.List<imports.aws.SesReceiptRuleAddHeaderAction>)addHeaderAction;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getAfter}
         * @param after the value to be set.
         * @return {@code this}
         */
        public Builder after(java.lang.String after) {
            this.after = after;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getBounceAction}
         * @param bounceAction bounce_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder bounceAction(java.util.List<? extends imports.aws.SesReceiptRuleBounceAction> bounceAction) {
            this.bounceAction = (java.util.List<imports.aws.SesReceiptRuleBounceAction>)bounceAction;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getLambdaAction}
         * @param lambdaAction lambda_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambdaAction(java.util.List<? extends imports.aws.SesReceiptRuleLambdaAction> lambdaAction) {
            this.lambdaAction = (java.util.List<imports.aws.SesReceiptRuleLambdaAction>)lambdaAction;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getRecipients}
         * @param recipients the value to be set.
         * @return {@code this}
         */
        public Builder recipients(java.util.List<java.lang.String> recipients) {
            this.recipients = recipients;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getS3Action}
         * @param s3Action s3_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Action(java.util.List<? extends imports.aws.SesReceiptRuleS3Action> s3Action) {
            this.s3Action = (java.util.List<imports.aws.SesReceiptRuleS3Action>)s3Action;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getScanEnabled}
         * @param scanEnabled the value to be set.
         * @return {@code this}
         */
        public Builder scanEnabled(java.lang.Boolean scanEnabled) {
            this.scanEnabled = scanEnabled;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getSnsAction}
         * @param snsAction sns_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder snsAction(java.util.List<? extends imports.aws.SesReceiptRuleSnsAction> snsAction) {
            this.snsAction = (java.util.List<imports.aws.SesReceiptRuleSnsAction>)snsAction;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getStopAction}
         * @param stopAction stop_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stopAction(java.util.List<? extends imports.aws.SesReceiptRuleStopAction> stopAction) {
            this.stopAction = (java.util.List<imports.aws.SesReceiptRuleStopAction>)stopAction;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getTlsPolicy}
         * @param tlsPolicy the value to be set.
         * @return {@code this}
         */
        public Builder tlsPolicy(java.lang.String tlsPolicy) {
            this.tlsPolicy = tlsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getWorkmailAction}
         * @param workmailAction workmail_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder workmailAction(java.util.List<? extends imports.aws.SesReceiptRuleWorkmailAction> workmailAction) {
            this.workmailAction = (java.util.List<imports.aws.SesReceiptRuleWorkmailAction>)workmailAction;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesReceiptRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesReceiptRuleConfig build() {
            return new Jsii$Proxy(name, ruleSetName, addHeaderAction, after, bounceAction, enabled, lambdaAction, recipients, s3Action, scanEnabled, snsAction, stopAction, tlsPolicy, workmailAction, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SesReceiptRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesReceiptRuleConfig {
        private final java.lang.String name;
        private final java.lang.String ruleSetName;
        private final java.util.List<imports.aws.SesReceiptRuleAddHeaderAction> addHeaderAction;
        private final java.lang.String after;
        private final java.util.List<imports.aws.SesReceiptRuleBounceAction> bounceAction;
        private final java.lang.Boolean enabled;
        private final java.util.List<imports.aws.SesReceiptRuleLambdaAction> lambdaAction;
        private final java.util.List<java.lang.String> recipients;
        private final java.util.List<imports.aws.SesReceiptRuleS3Action> s3Action;
        private final java.lang.Boolean scanEnabled;
        private final java.util.List<imports.aws.SesReceiptRuleSnsAction> snsAction;
        private final java.util.List<imports.aws.SesReceiptRuleStopAction> stopAction;
        private final java.lang.String tlsPolicy;
        private final java.util.List<imports.aws.SesReceiptRuleWorkmailAction> workmailAction;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleSetName = software.amazon.jsii.Kernel.get(this, "ruleSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.addHeaderAction = software.amazon.jsii.Kernel.get(this, "addHeaderAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleAddHeaderAction.class)));
            this.after = software.amazon.jsii.Kernel.get(this, "after", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bounceAction = software.amazon.jsii.Kernel.get(this, "bounceAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleBounceAction.class)));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.lambdaAction = software.amazon.jsii.Kernel.get(this, "lambdaAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleLambdaAction.class)));
            this.recipients = software.amazon.jsii.Kernel.get(this, "recipients", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.s3Action = software.amazon.jsii.Kernel.get(this, "s3Action", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleS3Action.class)));
            this.scanEnabled = software.amazon.jsii.Kernel.get(this, "scanEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.snsAction = software.amazon.jsii.Kernel.get(this, "snsAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleSnsAction.class)));
            this.stopAction = software.amazon.jsii.Kernel.get(this, "stopAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleStopAction.class)));
            this.tlsPolicy = software.amazon.jsii.Kernel.get(this, "tlsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.workmailAction = software.amazon.jsii.Kernel.get(this, "workmailAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesReceiptRuleWorkmailAction.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String ruleSetName, final java.util.List<? extends imports.aws.SesReceiptRuleAddHeaderAction> addHeaderAction, final java.lang.String after, final java.util.List<? extends imports.aws.SesReceiptRuleBounceAction> bounceAction, final java.lang.Boolean enabled, final java.util.List<? extends imports.aws.SesReceiptRuleLambdaAction> lambdaAction, final java.util.List<java.lang.String> recipients, final java.util.List<? extends imports.aws.SesReceiptRuleS3Action> s3Action, final java.lang.Boolean scanEnabled, final java.util.List<? extends imports.aws.SesReceiptRuleSnsAction> snsAction, final java.util.List<? extends imports.aws.SesReceiptRuleStopAction> stopAction, final java.lang.String tlsPolicy, final java.util.List<? extends imports.aws.SesReceiptRuleWorkmailAction> workmailAction, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.ruleSetName = java.util.Objects.requireNonNull(ruleSetName, "ruleSetName is required");
            this.addHeaderAction = (java.util.List<imports.aws.SesReceiptRuleAddHeaderAction>)addHeaderAction;
            this.after = after;
            this.bounceAction = (java.util.List<imports.aws.SesReceiptRuleBounceAction>)bounceAction;
            this.enabled = enabled;
            this.lambdaAction = (java.util.List<imports.aws.SesReceiptRuleLambdaAction>)lambdaAction;
            this.recipients = recipients;
            this.s3Action = (java.util.List<imports.aws.SesReceiptRuleS3Action>)s3Action;
            this.scanEnabled = scanEnabled;
            this.snsAction = (java.util.List<imports.aws.SesReceiptRuleSnsAction>)snsAction;
            this.stopAction = (java.util.List<imports.aws.SesReceiptRuleStopAction>)stopAction;
            this.tlsPolicy = tlsPolicy;
            this.workmailAction = (java.util.List<imports.aws.SesReceiptRuleWorkmailAction>)workmailAction;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRuleSetName() {
            return this.ruleSetName;
        }

        @Override
        public final java.util.List<imports.aws.SesReceiptRuleAddHeaderAction> getAddHeaderAction() {
            return this.addHeaderAction;
        }

        @Override
        public final java.lang.String getAfter() {
            return this.after;
        }

        @Override
        public final java.util.List<imports.aws.SesReceiptRuleBounceAction> getBounceAction() {
            return this.bounceAction;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.util.List<imports.aws.SesReceiptRuleLambdaAction> getLambdaAction() {
            return this.lambdaAction;
        }

        @Override
        public final java.util.List<java.lang.String> getRecipients() {
            return this.recipients;
        }

        @Override
        public final java.util.List<imports.aws.SesReceiptRuleS3Action> getS3Action() {
            return this.s3Action;
        }

        @Override
        public final java.lang.Boolean getScanEnabled() {
            return this.scanEnabled;
        }

        @Override
        public final java.util.List<imports.aws.SesReceiptRuleSnsAction> getSnsAction() {
            return this.snsAction;
        }

        @Override
        public final java.util.List<imports.aws.SesReceiptRuleStopAction> getStopAction() {
            return this.stopAction;
        }

        @Override
        public final java.lang.String getTlsPolicy() {
            return this.tlsPolicy;
        }

        @Override
        public final java.util.List<imports.aws.SesReceiptRuleWorkmailAction> getWorkmailAction() {
            return this.workmailAction;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("ruleSetName", om.valueToTree(this.getRuleSetName()));
            if (this.getAddHeaderAction() != null) {
                data.set("addHeaderAction", om.valueToTree(this.getAddHeaderAction()));
            }
            if (this.getAfter() != null) {
                data.set("after", om.valueToTree(this.getAfter()));
            }
            if (this.getBounceAction() != null) {
                data.set("bounceAction", om.valueToTree(this.getBounceAction()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getLambdaAction() != null) {
                data.set("lambdaAction", om.valueToTree(this.getLambdaAction()));
            }
            if (this.getRecipients() != null) {
                data.set("recipients", om.valueToTree(this.getRecipients()));
            }
            if (this.getS3Action() != null) {
                data.set("s3Action", om.valueToTree(this.getS3Action()));
            }
            if (this.getScanEnabled() != null) {
                data.set("scanEnabled", om.valueToTree(this.getScanEnabled()));
            }
            if (this.getSnsAction() != null) {
                data.set("snsAction", om.valueToTree(this.getSnsAction()));
            }
            if (this.getStopAction() != null) {
                data.set("stopAction", om.valueToTree(this.getStopAction()));
            }
            if (this.getTlsPolicy() != null) {
                data.set("tlsPolicy", om.valueToTree(this.getTlsPolicy()));
            }
            if (this.getWorkmailAction() != null) {
                data.set("workmailAction", om.valueToTree(this.getWorkmailAction()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SesReceiptRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesReceiptRuleConfig.Jsii$Proxy that = (SesReceiptRuleConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!ruleSetName.equals(that.ruleSetName)) return false;
            if (this.addHeaderAction != null ? !this.addHeaderAction.equals(that.addHeaderAction) : that.addHeaderAction != null) return false;
            if (this.after != null ? !this.after.equals(that.after) : that.after != null) return false;
            if (this.bounceAction != null ? !this.bounceAction.equals(that.bounceAction) : that.bounceAction != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.lambdaAction != null ? !this.lambdaAction.equals(that.lambdaAction) : that.lambdaAction != null) return false;
            if (this.recipients != null ? !this.recipients.equals(that.recipients) : that.recipients != null) return false;
            if (this.s3Action != null ? !this.s3Action.equals(that.s3Action) : that.s3Action != null) return false;
            if (this.scanEnabled != null ? !this.scanEnabled.equals(that.scanEnabled) : that.scanEnabled != null) return false;
            if (this.snsAction != null ? !this.snsAction.equals(that.snsAction) : that.snsAction != null) return false;
            if (this.stopAction != null ? !this.stopAction.equals(that.stopAction) : that.stopAction != null) return false;
            if (this.tlsPolicy != null ? !this.tlsPolicy.equals(that.tlsPolicy) : that.tlsPolicy != null) return false;
            if (this.workmailAction != null ? !this.workmailAction.equals(that.workmailAction) : that.workmailAction != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.ruleSetName.hashCode());
            result = 31 * result + (this.addHeaderAction != null ? this.addHeaderAction.hashCode() : 0);
            result = 31 * result + (this.after != null ? this.after.hashCode() : 0);
            result = 31 * result + (this.bounceAction != null ? this.bounceAction.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.lambdaAction != null ? this.lambdaAction.hashCode() : 0);
            result = 31 * result + (this.recipients != null ? this.recipients.hashCode() : 0);
            result = 31 * result + (this.s3Action != null ? this.s3Action.hashCode() : 0);
            result = 31 * result + (this.scanEnabled != null ? this.scanEnabled.hashCode() : 0);
            result = 31 * result + (this.snsAction != null ? this.snsAction.hashCode() : 0);
            result = 31 * result + (this.stopAction != null ? this.stopAction.hashCode() : 0);
            result = 31 * result + (this.tlsPolicy != null ? this.tlsPolicy.hashCode() : 0);
            result = 31 * result + (this.workmailAction != null ? this.workmailAction.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
