package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.171Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildWebhookConfig")
@software.amazon.jsii.Jsii.Proxy(CodebuildWebhookConfig.Jsii$Proxy.class)
public interface CodebuildWebhookConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getProjectName();

    default @org.jetbrains.annotations.Nullable java.lang.String getBranchFilter() {
        return null;
    }

    /**
     * filter_group block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildWebhookFilterGroup> getFilterGroup() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildWebhookConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildWebhookConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildWebhookConfig> {
        private java.lang.String projectName;
        private java.lang.String branchFilter;
        private java.util.List<imports.aws.CodebuildWebhookFilterGroup> filterGroup;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CodebuildWebhookConfig#getProjectName}
         * @param projectName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder projectName(java.lang.String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookConfig#getBranchFilter}
         * @param branchFilter the value to be set.
         * @return {@code this}
         */
        public Builder branchFilter(java.lang.String branchFilter) {
            this.branchFilter = branchFilter;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookConfig#getFilterGroup}
         * @param filterGroup filter_group block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filterGroup(java.util.List<? extends imports.aws.CodebuildWebhookFilterGroup> filterGroup) {
            this.filterGroup = (java.util.List<imports.aws.CodebuildWebhookFilterGroup>)filterGroup;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookConfig#getDependsOn}
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
         * Sets the value of {@link CodebuildWebhookConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookConfig#getProvider}
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
         * @return a new instance of {@link CodebuildWebhookConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildWebhookConfig build() {
            return new Jsii$Proxy(projectName, branchFilter, filterGroup, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CodebuildWebhookConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildWebhookConfig {
        private final java.lang.String projectName;
        private final java.lang.String branchFilter;
        private final java.util.List<imports.aws.CodebuildWebhookFilterGroup> filterGroup;
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
            this.projectName = software.amazon.jsii.Kernel.get(this, "projectName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.branchFilter = software.amazon.jsii.Kernel.get(this, "branchFilter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filterGroup = software.amazon.jsii.Kernel.get(this, "filterGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildWebhookFilterGroup.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String projectName, final java.lang.String branchFilter, final java.util.List<? extends imports.aws.CodebuildWebhookFilterGroup> filterGroup, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.projectName = java.util.Objects.requireNonNull(projectName, "projectName is required");
            this.branchFilter = branchFilter;
            this.filterGroup = (java.util.List<imports.aws.CodebuildWebhookFilterGroup>)filterGroup;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getProjectName() {
            return this.projectName;
        }

        @Override
        public final java.lang.String getBranchFilter() {
            return this.branchFilter;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildWebhookFilterGroup> getFilterGroup() {
            return this.filterGroup;
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

            data.set("projectName", om.valueToTree(this.getProjectName()));
            if (this.getBranchFilter() != null) {
                data.set("branchFilter", om.valueToTree(this.getBranchFilter()));
            }
            if (this.getFilterGroup() != null) {
                data.set("filterGroup", om.valueToTree(this.getFilterGroup()));
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
            struct.set("fqn", om.valueToTree("aws.CodebuildWebhookConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildWebhookConfig.Jsii$Proxy that = (CodebuildWebhookConfig.Jsii$Proxy) o;

            if (!projectName.equals(that.projectName)) return false;
            if (this.branchFilter != null ? !this.branchFilter.equals(that.branchFilter) : that.branchFilter != null) return false;
            if (this.filterGroup != null ? !this.filterGroup.equals(that.filterGroup) : that.filterGroup != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.projectName.hashCode();
            result = 31 * result + (this.branchFilter != null ? this.branchFilter.hashCode() : 0);
            result = 31 * result + (this.filterGroup != null ? this.filterGroup.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
