package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.433Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DlmLifecyclePolicyPolicyDetails")
@software.amazon.jsii.Jsii.Proxy(DlmLifecyclePolicyPolicyDetails.Jsii$Proxy.class)
public interface DlmLifecyclePolicyPolicyDetails extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResourceTypes();

    /**
     * schedule block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule> getSchedule();

    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTargetTags();

    /**
     * @return a {@link Builder} of {@link DlmLifecyclePolicyPolicyDetails}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DlmLifecyclePolicyPolicyDetails}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DlmLifecyclePolicyPolicyDetails> {
        private java.util.List<java.lang.String> resourceTypes;
        private java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule> schedule;
        private java.util.Map<java.lang.String, java.lang.String> targetTags;

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetails#getResourceTypes}
         * @param resourceTypes the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceTypes(java.util.List<java.lang.String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetails#getSchedule}
         * @param schedule schedule block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schedule(java.util.List<? extends imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule> schedule) {
            this.schedule = (java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule>)schedule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetails#getTargetTags}
         * @param targetTags the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetTags(java.util.Map<java.lang.String, java.lang.String> targetTags) {
            this.targetTags = targetTags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DlmLifecyclePolicyPolicyDetails}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DlmLifecyclePolicyPolicyDetails build() {
            return new Jsii$Proxy(resourceTypes, schedule, targetTags);
        }
    }

    /**
     * An implementation for {@link DlmLifecyclePolicyPolicyDetails}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DlmLifecyclePolicyPolicyDetails {
        private final java.util.List<java.lang.String> resourceTypes;
        private final java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule> schedule;
        private final java.util.Map<java.lang.String, java.lang.String> targetTags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resourceTypes = software.amazon.jsii.Kernel.get(this, "resourceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule.class)));
            this.targetTags = software.amazon.jsii.Kernel.get(this, "targetTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> resourceTypes, final java.util.List<? extends imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule> schedule, final java.util.Map<java.lang.String, java.lang.String> targetTags) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resourceTypes = java.util.Objects.requireNonNull(resourceTypes, "resourceTypes is required");
            this.schedule = (java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule>)java.util.Objects.requireNonNull(schedule, "schedule is required");
            this.targetTags = java.util.Objects.requireNonNull(targetTags, "targetTags is required");
        }

        @Override
        public final java.util.List<java.lang.String> getResourceTypes() {
            return this.resourceTypes;
        }

        @Override
        public final java.util.List<imports.aws.DlmLifecyclePolicyPolicyDetailsSchedule> getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTargetTags() {
            return this.targetTags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resourceTypes", om.valueToTree(this.getResourceTypes()));
            data.set("schedule", om.valueToTree(this.getSchedule()));
            data.set("targetTags", om.valueToTree(this.getTargetTags()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DlmLifecyclePolicyPolicyDetails"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DlmLifecyclePolicyPolicyDetails.Jsii$Proxy that = (DlmLifecyclePolicyPolicyDetails.Jsii$Proxy) o;

            if (!resourceTypes.equals(that.resourceTypes)) return false;
            if (!schedule.equals(that.schedule)) return false;
            return this.targetTags.equals(that.targetTags);
        }

        @Override
        public final int hashCode() {
            int result = this.resourceTypes.hashCode();
            result = 31 * result + (this.schedule.hashCode());
            result = 31 * result + (this.targetTags.hashCode());
            return result;
        }
    }
}
