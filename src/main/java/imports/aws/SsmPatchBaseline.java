package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.897Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmPatchBaseline")
public class SsmPatchBaseline extends com.hashicorp.cdktf.TerraformResource {

    protected SsmPatchBaseline(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SsmPatchBaseline(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SsmPatchBaseline(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SsmPatchBaselineConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetApprovalRule() {
        software.amazon.jsii.Kernel.call(this, "resetApprovalRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetApprovedPatches() {
        software.amazon.jsii.Kernel.call(this, "resetApprovedPatches", software.amazon.jsii.NativeType.VOID);
    }

    public void resetApprovedPatchesComplianceLevel() {
        software.amazon.jsii.Kernel.call(this, "resetApprovedPatchesComplianceLevel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGlobalFilter() {
        software.amazon.jsii.Kernel.call(this, "resetGlobalFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOperatingSystem() {
        software.amazon.jsii.Kernel.call(this, "resetOperatingSystem", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRejectedPatches() {
        software.amazon.jsii.Kernel.call(this, "resetRejectedPatches", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmPatchBaselineApprovalRule> getApprovalRuleInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SsmPatchBaselineApprovalRule>)(software.amazon.jsii.Kernel.get(this, "approvalRuleInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmPatchBaselineApprovalRule.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApprovedPatchesComplianceLevelInput() {
        return software.amazon.jsii.Kernel.get(this, "approvedPatchesComplianceLevelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApprovedPatchesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "approvedPatchesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmPatchBaselineGlobalFilter> getGlobalFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SsmPatchBaselineGlobalFilter>)(software.amazon.jsii.Kernel.get(this, "globalFilterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmPatchBaselineGlobalFilter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOperatingSystemInput() {
        return software.amazon.jsii.Kernel.get(this, "operatingSystemInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRejectedPatchesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "rejectedPatchesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmPatchBaselineApprovalRule> getApprovalRule() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "approvalRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmPatchBaselineApprovalRule.class))));
    }

    public void setApprovalRule(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmPatchBaselineApprovalRule> value) {
        software.amazon.jsii.Kernel.set(this, "approvalRule", java.util.Objects.requireNonNull(value, "approvalRule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getApprovedPatches() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "approvedPatches", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setApprovedPatches(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "approvedPatches", java.util.Objects.requireNonNull(value, "approvedPatches is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApprovedPatchesComplianceLevel() {
        return software.amazon.jsii.Kernel.get(this, "approvedPatchesComplianceLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApprovedPatchesComplianceLevel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "approvedPatchesComplianceLevel", java.util.Objects.requireNonNull(value, "approvedPatchesComplianceLevel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmPatchBaselineGlobalFilter> getGlobalFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "globalFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmPatchBaselineGlobalFilter.class))));
    }

    public void setGlobalFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmPatchBaselineGlobalFilter> value) {
        software.amazon.jsii.Kernel.set(this, "globalFilter", java.util.Objects.requireNonNull(value, "globalFilter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOperatingSystem() {
        return software.amazon.jsii.Kernel.get(this, "operatingSystem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOperatingSystem(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "operatingSystem", java.util.Objects.requireNonNull(value, "operatingSystem is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRejectedPatches() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "rejectedPatches", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRejectedPatches(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "rejectedPatches", java.util.Objects.requireNonNull(value, "rejectedPatches is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SsmPatchBaseline}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SsmPatchBaseline> {
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
        private final imports.aws.SsmPatchBaselineConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SsmPatchBaselineConfig.Builder();
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
         * approval_rule block.
         * <p>
         * @return {@code this}
         * @param approvalRule approval_rule block. This parameter is required.
         */
        public Builder approvalRule(final java.util.List<? extends imports.aws.SsmPatchBaselineApprovalRule> approvalRule) {
            this.config.approvalRule(approvalRule);
            return this;
        }

        /**
         * @return {@code this}
         * @param approvedPatches This parameter is required.
         */
        public Builder approvedPatches(final java.util.List<java.lang.String> approvedPatches) {
            this.config.approvedPatches(approvedPatches);
            return this;
        }

        /**
         * @return {@code this}
         * @param approvedPatchesComplianceLevel This parameter is required.
         */
        public Builder approvedPatchesComplianceLevel(final java.lang.String approvedPatchesComplianceLevel) {
            this.config.approvedPatchesComplianceLevel(approvedPatchesComplianceLevel);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * global_filter block.
         * <p>
         * @return {@code this}
         * @param globalFilter global_filter block. This parameter is required.
         */
        public Builder globalFilter(final java.util.List<? extends imports.aws.SsmPatchBaselineGlobalFilter> globalFilter) {
            this.config.globalFilter(globalFilter);
            return this;
        }

        /**
         * @return {@code this}
         * @param operatingSystem This parameter is required.
         */
        public Builder operatingSystem(final java.lang.String operatingSystem) {
            this.config.operatingSystem(operatingSystem);
            return this;
        }

        /**
         * @return {@code this}
         * @param rejectedPatches This parameter is required.
         */
        public Builder rejectedPatches(final java.util.List<java.lang.String> rejectedPatches) {
            this.config.rejectedPatches(rejectedPatches);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SsmPatchBaseline}.
         */
        @Override
        public imports.aws.SsmPatchBaseline build() {
            return new imports.aws.SsmPatchBaseline(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
