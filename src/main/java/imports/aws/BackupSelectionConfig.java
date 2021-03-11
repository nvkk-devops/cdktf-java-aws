package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.103Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BackupSelectionConfig")
@software.amazon.jsii.Jsii.Proxy(BackupSelectionConfig.Jsii$Proxy.class)
public interface BackupSelectionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getIamRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getPlanId();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResources() {
        return null;
    }

    /**
     * selection_tag block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BackupSelectionSelectionTag> getSelectionTag() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BackupSelectionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BackupSelectionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BackupSelectionConfig> {
        private java.lang.String iamRoleArn;
        private java.lang.String name;
        private java.lang.String planId;
        private java.util.List<java.lang.String> resources;
        private java.util.List<imports.aws.BackupSelectionSelectionTag> selectionTag;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link BackupSelectionConfig#getIamRoleArn}
         * @param iamRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder iamRoleArn(java.lang.String iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link BackupSelectionConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link BackupSelectionConfig#getPlanId}
         * @param planId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder planId(java.lang.String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * Sets the value of {@link BackupSelectionConfig#getResources}
         * @param resources the value to be set.
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link BackupSelectionConfig#getSelectionTag}
         * @param selectionTag selection_tag block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder selectionTag(java.util.List<? extends imports.aws.BackupSelectionSelectionTag> selectionTag) {
            this.selectionTag = (java.util.List<imports.aws.BackupSelectionSelectionTag>)selectionTag;
            return this;
        }

        /**
         * Sets the value of {@link BackupSelectionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link BackupSelectionConfig#getDependsOn}
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
         * Sets the value of {@link BackupSelectionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link BackupSelectionConfig#getProvider}
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
         * @return a new instance of {@link BackupSelectionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BackupSelectionConfig build() {
            return new Jsii$Proxy(iamRoleArn, name, planId, resources, selectionTag, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link BackupSelectionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BackupSelectionConfig {
        private final java.lang.String iamRoleArn;
        private final java.lang.String name;
        private final java.lang.String planId;
        private final java.util.List<java.lang.String> resources;
        private final java.util.List<imports.aws.BackupSelectionSelectionTag> selectionTag;
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
            this.iamRoleArn = software.amazon.jsii.Kernel.get(this, "iamRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.planId = software.amazon.jsii.Kernel.get(this, "planId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.selectionTag = software.amazon.jsii.Kernel.get(this, "selectionTag", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BackupSelectionSelectionTag.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String iamRoleArn, final java.lang.String name, final java.lang.String planId, final java.util.List<java.lang.String> resources, final java.util.List<? extends imports.aws.BackupSelectionSelectionTag> selectionTag, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.iamRoleArn = java.util.Objects.requireNonNull(iamRoleArn, "iamRoleArn is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.planId = java.util.Objects.requireNonNull(planId, "planId is required");
            this.resources = resources;
            this.selectionTag = (java.util.List<imports.aws.BackupSelectionSelectionTag>)selectionTag;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getIamRoleArn() {
            return this.iamRoleArn;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getPlanId() {
            return this.planId;
        }

        @Override
        public final java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        public final java.util.List<imports.aws.BackupSelectionSelectionTag> getSelectionTag() {
            return this.selectionTag;
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

            data.set("iamRoleArn", om.valueToTree(this.getIamRoleArn()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("planId", om.valueToTree(this.getPlanId()));
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getSelectionTag() != null) {
                data.set("selectionTag", om.valueToTree(this.getSelectionTag()));
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
            struct.set("fqn", om.valueToTree("aws.BackupSelectionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BackupSelectionConfig.Jsii$Proxy that = (BackupSelectionConfig.Jsii$Proxy) o;

            if (!iamRoleArn.equals(that.iamRoleArn)) return false;
            if (!name.equals(that.name)) return false;
            if (!planId.equals(that.planId)) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            if (this.selectionTag != null ? !this.selectionTag.equals(that.selectionTag) : that.selectionTag != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.iamRoleArn.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.planId.hashCode());
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.selectionTag != null ? this.selectionTag.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
