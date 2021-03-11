package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.433Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DlmLifecyclePolicyPolicyDetailsSchedule")
@software.amazon.jsii.Jsii.Proxy(DlmLifecyclePolicyPolicyDetailsSchedule.Jsii$Proxy.class)
public interface DlmLifecyclePolicyPolicyDetailsSchedule extends software.amazon.jsii.JsiiSerializable {

    /**
     * create_rule block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule> getCreateRule();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * retain_rule block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule> getRetainRule();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCopyTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsToAdd() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DlmLifecyclePolicyPolicyDetailsSchedule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DlmLifecyclePolicyPolicyDetailsSchedule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DlmLifecyclePolicyPolicyDetailsSchedule> {
        private java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule> createRule;
        private java.lang.String name;
        private java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule> retainRule;
        private java.lang.Boolean copyTags;
        private java.util.Map<java.lang.String, java.lang.String> tagsToAdd;

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getCreateRule}
         * @param createRule create_rule block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder createRule(java.util.List<? extends imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule> createRule) {
            this.createRule = (java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule>)createRule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getRetainRule}
         * @param retainRule retain_rule block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder retainRule(java.util.List<? extends imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule> retainRule) {
            this.retainRule = (java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule>)retainRule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getCopyTags}
         * @param copyTags the value to be set.
         * @return {@code this}
         */
        public Builder copyTags(java.lang.Boolean copyTags) {
            this.copyTags = copyTags;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getTagsToAdd}
         * @param tagsToAdd the value to be set.
         * @return {@code this}
         */
        public Builder tagsToAdd(java.util.Map<java.lang.String, java.lang.String> tagsToAdd) {
            this.tagsToAdd = tagsToAdd;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DlmLifecyclePolicyPolicyDetailsSchedule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DlmLifecyclePolicyPolicyDetailsSchedule build() {
            return new Jsii$Proxy(createRule, name, retainRule, copyTags, tagsToAdd);
        }
    }

    /**
     * An implementation for {@link DlmLifecyclePolicyPolicyDetailsSchedule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DlmLifecyclePolicyPolicyDetailsSchedule {
        private final java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule> createRule;
        private final java.lang.String name;
        private final java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule> retainRule;
        private final java.lang.Boolean copyTags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsToAdd;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.createRule = software.amazon.jsii.Kernel.get(this, "createRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.retainRule = software.amazon.jsii.Kernel.get(this, "retainRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule.class)));
            this.copyTags = software.amazon.jsii.Kernel.get(this, "copyTags", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tagsToAdd = software.amazon.jsii.Kernel.get(this, "tagsToAdd", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule> createRule, final java.lang.String name, final java.util.List<? extends imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule> retainRule, final java.lang.Boolean copyTags, final java.util.Map<java.lang.String, java.lang.String> tagsToAdd) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.createRule = (java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule>)java.util.Objects.requireNonNull(createRule, "createRule is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.retainRule = (java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule>)java.util.Objects.requireNonNull(retainRule, "retainRule is required");
            this.copyTags = copyTags;
            this.tagsToAdd = tagsToAdd;
        }

        @Override
        public final java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule> getCreateRule() {
            return this.createRule;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule> getRetainRule() {
            return this.retainRule;
        }

        @Override
        public final java.lang.Boolean getCopyTags() {
            return this.copyTags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsToAdd() {
            return this.tagsToAdd;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("createRule", om.valueToTree(this.getCreateRule()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("retainRule", om.valueToTree(this.getRetainRule()));
            if (this.getCopyTags() != null) {
                data.set("copyTags", om.valueToTree(this.getCopyTags()));
            }
            if (this.getTagsToAdd() != null) {
                data.set("tagsToAdd", om.valueToTree(this.getTagsToAdd()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DlmLifecyclePolicyPolicyDetailsSchedule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DlmLifecyclePolicyPolicyDetailsSchedule.Jsii$Proxy that = (DlmLifecyclePolicyPolicyDetailsSchedule.Jsii$Proxy) o;

            if (!createRule.equals(that.createRule)) return false;
            if (!name.equals(that.name)) return false;
            if (!retainRule.equals(that.retainRule)) return false;
            if (this.copyTags != null ? !this.copyTags.equals(that.copyTags) : that.copyTags != null) return false;
            return this.tagsToAdd != null ? this.tagsToAdd.equals(that.tagsToAdd) : that.tagsToAdd == null;
        }

        @Override
        public final int hashCode() {
            int result = this.createRule.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.retainRule.hashCode());
            result = 31 * result + (this.copyTags != null ? this.copyTags.hashCode() : 0);
            result = 31 * result + (this.tagsToAdd != null ? this.tagsToAdd.hashCode() : 0);
            return result;
        }
    }
}
