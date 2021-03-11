package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.898Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmPatchBaselineConfig")
@software.amazon.jsii.Jsii.Proxy(SsmPatchBaselineConfig.Jsii$Proxy.class)
public interface SsmPatchBaselineConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * approval_rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmPatchBaselineApprovalRule> getApprovalRule() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApprovedPatches() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getApprovedPatchesComplianceLevel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * global_filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmPatchBaselineGlobalFilter> getGlobalFilter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOperatingSystem() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRejectedPatches() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmPatchBaselineConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmPatchBaselineConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmPatchBaselineConfig> {
        private java.lang.String name;
        private java.util.List<imports.aws.SsmPatchBaselineApprovalRule> approvalRule;
        private java.util.List<java.lang.String> approvedPatches;
        private java.lang.String approvedPatchesComplianceLevel;
        private java.lang.String description;
        private java.util.List<imports.aws.SsmPatchBaselineGlobalFilter> globalFilter;
        private java.lang.String operatingSystem;
        private java.util.List<java.lang.String> rejectedPatches;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getApprovalRule}
         * @param approvalRule approval_rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder approvalRule(java.util.List<? extends imports.aws.SsmPatchBaselineApprovalRule> approvalRule) {
            this.approvalRule = (java.util.List<imports.aws.SsmPatchBaselineApprovalRule>)approvalRule;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getApprovedPatches}
         * @param approvedPatches the value to be set.
         * @return {@code this}
         */
        public Builder approvedPatches(java.util.List<java.lang.String> approvedPatches) {
            this.approvedPatches = approvedPatches;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getApprovedPatchesComplianceLevel}
         * @param approvedPatchesComplianceLevel the value to be set.
         * @return {@code this}
         */
        public Builder approvedPatchesComplianceLevel(java.lang.String approvedPatchesComplianceLevel) {
            this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getGlobalFilter}
         * @param globalFilter global_filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder globalFilter(java.util.List<? extends imports.aws.SsmPatchBaselineGlobalFilter> globalFilter) {
            this.globalFilter = (java.util.List<imports.aws.SsmPatchBaselineGlobalFilter>)globalFilter;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getOperatingSystem}
         * @param operatingSystem the value to be set.
         * @return {@code this}
         */
        public Builder operatingSystem(java.lang.String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getRejectedPatches}
         * @param rejectedPatches the value to be set.
         * @return {@code this}
         */
        public Builder rejectedPatches(java.util.List<java.lang.String> rejectedPatches) {
            this.rejectedPatches = rejectedPatches;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getDependsOn}
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
         * Sets the value of {@link SsmPatchBaselineConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineConfig#getProvider}
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
         * @return a new instance of {@link SsmPatchBaselineConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmPatchBaselineConfig build() {
            return new Jsii$Proxy(name, approvalRule, approvedPatches, approvedPatchesComplianceLevel, description, globalFilter, operatingSystem, rejectedPatches, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SsmPatchBaselineConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmPatchBaselineConfig {
        private final java.lang.String name;
        private final java.util.List<imports.aws.SsmPatchBaselineApprovalRule> approvalRule;
        private final java.util.List<java.lang.String> approvedPatches;
        private final java.lang.String approvedPatchesComplianceLevel;
        private final java.lang.String description;
        private final java.util.List<imports.aws.SsmPatchBaselineGlobalFilter> globalFilter;
        private final java.lang.String operatingSystem;
        private final java.util.List<java.lang.String> rejectedPatches;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.approvalRule = software.amazon.jsii.Kernel.get(this, "approvalRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmPatchBaselineApprovalRule.class)));
            this.approvedPatches = software.amazon.jsii.Kernel.get(this, "approvedPatches", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.approvedPatchesComplianceLevel = software.amazon.jsii.Kernel.get(this, "approvedPatchesComplianceLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.globalFilter = software.amazon.jsii.Kernel.get(this, "globalFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmPatchBaselineGlobalFilter.class)));
            this.operatingSystem = software.amazon.jsii.Kernel.get(this, "operatingSystem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rejectedPatches = software.amazon.jsii.Kernel.get(this, "rejectedPatches", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.SsmPatchBaselineApprovalRule> approvalRule, final java.util.List<java.lang.String> approvedPatches, final java.lang.String approvedPatchesComplianceLevel, final java.lang.String description, final java.util.List<? extends imports.aws.SsmPatchBaselineGlobalFilter> globalFilter, final java.lang.String operatingSystem, final java.util.List<java.lang.String> rejectedPatches, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.approvalRule = (java.util.List<imports.aws.SsmPatchBaselineApprovalRule>)approvalRule;
            this.approvedPatches = approvedPatches;
            this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
            this.description = description;
            this.globalFilter = (java.util.List<imports.aws.SsmPatchBaselineGlobalFilter>)globalFilter;
            this.operatingSystem = operatingSystem;
            this.rejectedPatches = rejectedPatches;
            this.tags = tags;
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
        public final java.util.List<imports.aws.SsmPatchBaselineApprovalRule> getApprovalRule() {
            return this.approvalRule;
        }

        @Override
        public final java.util.List<java.lang.String> getApprovedPatches() {
            return this.approvedPatches;
        }

        @Override
        public final java.lang.String getApprovedPatchesComplianceLevel() {
            return this.approvedPatchesComplianceLevel;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.SsmPatchBaselineGlobalFilter> getGlobalFilter() {
            return this.globalFilter;
        }

        @Override
        public final java.lang.String getOperatingSystem() {
            return this.operatingSystem;
        }

        @Override
        public final java.util.List<java.lang.String> getRejectedPatches() {
            return this.rejectedPatches;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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
            if (this.getApprovalRule() != null) {
                data.set("approvalRule", om.valueToTree(this.getApprovalRule()));
            }
            if (this.getApprovedPatches() != null) {
                data.set("approvedPatches", om.valueToTree(this.getApprovedPatches()));
            }
            if (this.getApprovedPatchesComplianceLevel() != null) {
                data.set("approvedPatchesComplianceLevel", om.valueToTree(this.getApprovedPatchesComplianceLevel()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getGlobalFilter() != null) {
                data.set("globalFilter", om.valueToTree(this.getGlobalFilter()));
            }
            if (this.getOperatingSystem() != null) {
                data.set("operatingSystem", om.valueToTree(this.getOperatingSystem()));
            }
            if (this.getRejectedPatches() != null) {
                data.set("rejectedPatches", om.valueToTree(this.getRejectedPatches()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.SsmPatchBaselineConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmPatchBaselineConfig.Jsii$Proxy that = (SsmPatchBaselineConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.approvalRule != null ? !this.approvalRule.equals(that.approvalRule) : that.approvalRule != null) return false;
            if (this.approvedPatches != null ? !this.approvedPatches.equals(that.approvedPatches) : that.approvedPatches != null) return false;
            if (this.approvedPatchesComplianceLevel != null ? !this.approvedPatchesComplianceLevel.equals(that.approvedPatchesComplianceLevel) : that.approvedPatchesComplianceLevel != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.globalFilter != null ? !this.globalFilter.equals(that.globalFilter) : that.globalFilter != null) return false;
            if (this.operatingSystem != null ? !this.operatingSystem.equals(that.operatingSystem) : that.operatingSystem != null) return false;
            if (this.rejectedPatches != null ? !this.rejectedPatches.equals(that.rejectedPatches) : that.rejectedPatches != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.approvalRule != null ? this.approvalRule.hashCode() : 0);
            result = 31 * result + (this.approvedPatches != null ? this.approvedPatches.hashCode() : 0);
            result = 31 * result + (this.approvedPatchesComplianceLevel != null ? this.approvedPatchesComplianceLevel.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.globalFilter != null ? this.globalFilter.hashCode() : 0);
            result = 31 * result + (this.operatingSystem != null ? this.operatingSystem.hashCode() : 0);
            result = 31 * result + (this.rejectedPatches != null ? this.rejectedPatches.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
