package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.088Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BackupPlanRule")
@software.amazon.jsii.Jsii.Proxy(BackupPlanRule.Jsii$Proxy.class)
public interface BackupPlanRule extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRuleName();

    @org.jetbrains.annotations.NotNull java.lang.String getTargetVaultName();

    default @org.jetbrains.annotations.Nullable java.lang.Number getCompletionWindow() {
        return null;
    }

    /**
     * copy_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BackupPlanRuleCopyAction> getCopyAction() {
        return null;
    }

    /**
     * lifecycle block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BackupPlanRuleLifecycle> getLifecycle() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRecoveryPointTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSchedule() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getStartWindow() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BackupPlanRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BackupPlanRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BackupPlanRule> {
        private java.lang.String ruleName;
        private java.lang.String targetVaultName;
        private java.lang.Number completionWindow;
        private java.util.List<imports.aws.BackupPlanRuleCopyAction> copyAction;
        private java.util.List<imports.aws.BackupPlanRuleLifecycle> lifecycle;
        private java.util.Map<java.lang.String, java.lang.String> recoveryPointTags;
        private java.lang.String schedule;
        private java.lang.Number startWindow;

        /**
         * Sets the value of {@link BackupPlanRule#getRuleName}
         * @param ruleName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleName(java.lang.String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRule#getTargetVaultName}
         * @param targetVaultName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetVaultName(java.lang.String targetVaultName) {
            this.targetVaultName = targetVaultName;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRule#getCompletionWindow}
         * @param completionWindow the value to be set.
         * @return {@code this}
         */
        public Builder completionWindow(java.lang.Number completionWindow) {
            this.completionWindow = completionWindow;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRule#getCopyAction}
         * @param copyAction copy_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder copyAction(java.util.List<? extends imports.aws.BackupPlanRuleCopyAction> copyAction) {
            this.copyAction = (java.util.List<imports.aws.BackupPlanRuleCopyAction>)copyAction;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRule#getLifecycle}
         * @param lifecycle lifecycle block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lifecycle(java.util.List<? extends imports.aws.BackupPlanRuleLifecycle> lifecycle) {
            this.lifecycle = (java.util.List<imports.aws.BackupPlanRuleLifecycle>)lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRule#getRecoveryPointTags}
         * @param recoveryPointTags the value to be set.
         * @return {@code this}
         */
        public Builder recoveryPointTags(java.util.Map<java.lang.String, java.lang.String> recoveryPointTags) {
            this.recoveryPointTags = recoveryPointTags;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRule#getSchedule}
         * @param schedule the value to be set.
         * @return {@code this}
         */
        public Builder schedule(java.lang.String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRule#getStartWindow}
         * @param startWindow the value to be set.
         * @return {@code this}
         */
        public Builder startWindow(java.lang.Number startWindow) {
            this.startWindow = startWindow;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BackupPlanRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BackupPlanRule build() {
            return new Jsii$Proxy(ruleName, targetVaultName, completionWindow, copyAction, lifecycle, recoveryPointTags, schedule, startWindow);
        }
    }

    /**
     * An implementation for {@link BackupPlanRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BackupPlanRule {
        private final java.lang.String ruleName;
        private final java.lang.String targetVaultName;
        private final java.lang.Number completionWindow;
        private final java.util.List<imports.aws.BackupPlanRuleCopyAction> copyAction;
        private final java.util.List<imports.aws.BackupPlanRuleLifecycle> lifecycle;
        private final java.util.Map<java.lang.String, java.lang.String> recoveryPointTags;
        private final java.lang.String schedule;
        private final java.lang.Number startWindow;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ruleName = software.amazon.jsii.Kernel.get(this, "ruleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetVaultName = software.amazon.jsii.Kernel.get(this, "targetVaultName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.completionWindow = software.amazon.jsii.Kernel.get(this, "completionWindow", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.copyAction = software.amazon.jsii.Kernel.get(this, "copyAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BackupPlanRuleCopyAction.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BackupPlanRuleLifecycle.class)));
            this.recoveryPointTags = software.amazon.jsii.Kernel.get(this, "recoveryPointTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startWindow = software.amazon.jsii.Kernel.get(this, "startWindow", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String ruleName, final java.lang.String targetVaultName, final java.lang.Number completionWindow, final java.util.List<? extends imports.aws.BackupPlanRuleCopyAction> copyAction, final java.util.List<? extends imports.aws.BackupPlanRuleLifecycle> lifecycle, final java.util.Map<java.lang.String, java.lang.String> recoveryPointTags, final java.lang.String schedule, final java.lang.Number startWindow) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ruleName = java.util.Objects.requireNonNull(ruleName, "ruleName is required");
            this.targetVaultName = java.util.Objects.requireNonNull(targetVaultName, "targetVaultName is required");
            this.completionWindow = completionWindow;
            this.copyAction = (java.util.List<imports.aws.BackupPlanRuleCopyAction>)copyAction;
            this.lifecycle = (java.util.List<imports.aws.BackupPlanRuleLifecycle>)lifecycle;
            this.recoveryPointTags = recoveryPointTags;
            this.schedule = schedule;
            this.startWindow = startWindow;
        }

        @Override
        public final java.lang.String getRuleName() {
            return this.ruleName;
        }

        @Override
        public final java.lang.String getTargetVaultName() {
            return this.targetVaultName;
        }

        @Override
        public final java.lang.Number getCompletionWindow() {
            return this.completionWindow;
        }

        @Override
        public final java.util.List<imports.aws.BackupPlanRuleCopyAction> getCopyAction() {
            return this.copyAction;
        }

        @Override
        public final java.util.List<imports.aws.BackupPlanRuleLifecycle> getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRecoveryPointTags() {
            return this.recoveryPointTags;
        }

        @Override
        public final java.lang.String getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.lang.Number getStartWindow() {
            return this.startWindow;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("ruleName", om.valueToTree(this.getRuleName()));
            data.set("targetVaultName", om.valueToTree(this.getTargetVaultName()));
            if (this.getCompletionWindow() != null) {
                data.set("completionWindow", om.valueToTree(this.getCompletionWindow()));
            }
            if (this.getCopyAction() != null) {
                data.set("copyAction", om.valueToTree(this.getCopyAction()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getRecoveryPointTags() != null) {
                data.set("recoveryPointTags", om.valueToTree(this.getRecoveryPointTags()));
            }
            if (this.getSchedule() != null) {
                data.set("schedule", om.valueToTree(this.getSchedule()));
            }
            if (this.getStartWindow() != null) {
                data.set("startWindow", om.valueToTree(this.getStartWindow()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.BackupPlanRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BackupPlanRule.Jsii$Proxy that = (BackupPlanRule.Jsii$Proxy) o;

            if (!ruleName.equals(that.ruleName)) return false;
            if (!targetVaultName.equals(that.targetVaultName)) return false;
            if (this.completionWindow != null ? !this.completionWindow.equals(that.completionWindow) : that.completionWindow != null) return false;
            if (this.copyAction != null ? !this.copyAction.equals(that.copyAction) : that.copyAction != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.recoveryPointTags != null ? !this.recoveryPointTags.equals(that.recoveryPointTags) : that.recoveryPointTags != null) return false;
            if (this.schedule != null ? !this.schedule.equals(that.schedule) : that.schedule != null) return false;
            return this.startWindow != null ? this.startWindow.equals(that.startWindow) : that.startWindow == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ruleName.hashCode();
            result = 31 * result + (this.targetVaultName.hashCode());
            result = 31 * result + (this.completionWindow != null ? this.completionWindow.hashCode() : 0);
            result = 31 * result + (this.copyAction != null ? this.copyAction.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.recoveryPointTags != null ? this.recoveryPointTags.hashCode() : 0);
            result = 31 * result + (this.schedule != null ? this.schedule.hashCode() : 0);
            result = 31 * result + (this.startWindow != null ? this.startWindow.hashCode() : 0);
            return result;
        }
    }
}
