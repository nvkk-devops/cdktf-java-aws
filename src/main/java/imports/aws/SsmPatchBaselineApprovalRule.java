package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.898Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmPatchBaselineApprovalRule")
@software.amazon.jsii.Jsii.Proxy(SsmPatchBaselineApprovalRule.Jsii$Proxy.class)
public interface SsmPatchBaselineApprovalRule extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getApproveAfterDays();

    /**
     * patch_filter block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmPatchBaselineApprovalRulePatchFilter> getPatchFilter();

    default @org.jetbrains.annotations.Nullable java.lang.String getComplianceLevel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableNonSecurity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmPatchBaselineApprovalRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmPatchBaselineApprovalRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmPatchBaselineApprovalRule> {
        private java.lang.Number approveAfterDays;
        private java.util.List<imports.aws.SsmPatchBaselineApprovalRulePatchFilter> patchFilter;
        private java.lang.String complianceLevel;
        private java.lang.Boolean enableNonSecurity;

        /**
         * Sets the value of {@link SsmPatchBaselineApprovalRule#getApproveAfterDays}
         * @param approveAfterDays the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder approveAfterDays(java.lang.Number approveAfterDays) {
            this.approveAfterDays = approveAfterDays;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineApprovalRule#getPatchFilter}
         * @param patchFilter patch_filter block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder patchFilter(java.util.List<? extends imports.aws.SsmPatchBaselineApprovalRulePatchFilter> patchFilter) {
            this.patchFilter = (java.util.List<imports.aws.SsmPatchBaselineApprovalRulePatchFilter>)patchFilter;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineApprovalRule#getComplianceLevel}
         * @param complianceLevel the value to be set.
         * @return {@code this}
         */
        public Builder complianceLevel(java.lang.String complianceLevel) {
            this.complianceLevel = complianceLevel;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineApprovalRule#getEnableNonSecurity}
         * @param enableNonSecurity the value to be set.
         * @return {@code this}
         */
        public Builder enableNonSecurity(java.lang.Boolean enableNonSecurity) {
            this.enableNonSecurity = enableNonSecurity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SsmPatchBaselineApprovalRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmPatchBaselineApprovalRule build() {
            return new Jsii$Proxy(approveAfterDays, patchFilter, complianceLevel, enableNonSecurity);
        }
    }

    /**
     * An implementation for {@link SsmPatchBaselineApprovalRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmPatchBaselineApprovalRule {
        private final java.lang.Number approveAfterDays;
        private final java.util.List<imports.aws.SsmPatchBaselineApprovalRulePatchFilter> patchFilter;
        private final java.lang.String complianceLevel;
        private final java.lang.Boolean enableNonSecurity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.approveAfterDays = software.amazon.jsii.Kernel.get(this, "approveAfterDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.patchFilter = software.amazon.jsii.Kernel.get(this, "patchFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmPatchBaselineApprovalRulePatchFilter.class)));
            this.complianceLevel = software.amazon.jsii.Kernel.get(this, "complianceLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableNonSecurity = software.amazon.jsii.Kernel.get(this, "enableNonSecurity", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number approveAfterDays, final java.util.List<? extends imports.aws.SsmPatchBaselineApprovalRulePatchFilter> patchFilter, final java.lang.String complianceLevel, final java.lang.Boolean enableNonSecurity) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.approveAfterDays = java.util.Objects.requireNonNull(approveAfterDays, "approveAfterDays is required");
            this.patchFilter = (java.util.List<imports.aws.SsmPatchBaselineApprovalRulePatchFilter>)java.util.Objects.requireNonNull(patchFilter, "patchFilter is required");
            this.complianceLevel = complianceLevel;
            this.enableNonSecurity = enableNonSecurity;
        }

        @Override
        public final java.lang.Number getApproveAfterDays() {
            return this.approveAfterDays;
        }

        @Override
        public final java.util.List<imports.aws.SsmPatchBaselineApprovalRulePatchFilter> getPatchFilter() {
            return this.patchFilter;
        }

        @Override
        public final java.lang.String getComplianceLevel() {
            return this.complianceLevel;
        }

        @Override
        public final java.lang.Boolean getEnableNonSecurity() {
            return this.enableNonSecurity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("approveAfterDays", om.valueToTree(this.getApproveAfterDays()));
            data.set("patchFilter", om.valueToTree(this.getPatchFilter()));
            if (this.getComplianceLevel() != null) {
                data.set("complianceLevel", om.valueToTree(this.getComplianceLevel()));
            }
            if (this.getEnableNonSecurity() != null) {
                data.set("enableNonSecurity", om.valueToTree(this.getEnableNonSecurity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SsmPatchBaselineApprovalRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmPatchBaselineApprovalRule.Jsii$Proxy that = (SsmPatchBaselineApprovalRule.Jsii$Proxy) o;

            if (!approveAfterDays.equals(that.approveAfterDays)) return false;
            if (!patchFilter.equals(that.patchFilter)) return false;
            if (this.complianceLevel != null ? !this.complianceLevel.equals(that.complianceLevel) : that.complianceLevel != null) return false;
            return this.enableNonSecurity != null ? this.enableNonSecurity.equals(that.enableNonSecurity) : that.enableNonSecurity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.approveAfterDays.hashCode();
            result = 31 * result + (this.patchFilter.hashCode());
            result = 31 * result + (this.complianceLevel != null ? this.complianceLevel.hashCode() : 0);
            result = 31 * result + (this.enableNonSecurity != null ? this.enableNonSecurity.hashCode() : 0);
            return result;
        }
    }
}
