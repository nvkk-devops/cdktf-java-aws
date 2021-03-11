package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.244Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WorkspacesWorkspaceConfig")
@software.amazon.jsii.Jsii.Proxy(WorkspacesWorkspaceConfig.Jsii$Proxy.class)
public interface WorkspacesWorkspaceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getBundleId();

    @org.jetbrains.annotations.NotNull java.lang.String getDirectoryId();

    @org.jetbrains.annotations.NotNull java.lang.String getUserName();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRootVolumeEncryptionEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUserVolumeEncryptionEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeEncryptionKey() {
        return null;
    }

    /**
     * workspace_properties block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties> getWorkspaceProperties() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WorkspacesWorkspaceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WorkspacesWorkspaceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WorkspacesWorkspaceConfig> {
        private java.lang.String bundleId;
        private java.lang.String directoryId;
        private java.lang.String userName;
        private java.lang.Boolean rootVolumeEncryptionEnabled;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean userVolumeEncryptionEnabled;
        private java.lang.String volumeEncryptionKey;
        private java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties> workspaceProperties;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getBundleId}
         * @param bundleId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bundleId(java.lang.String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getDirectoryId}
         * @param directoryId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder directoryId(java.lang.String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getUserName}
         * @param userName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userName(java.lang.String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getRootVolumeEncryptionEnabled}
         * @param rootVolumeEncryptionEnabled the value to be set.
         * @return {@code this}
         */
        public Builder rootVolumeEncryptionEnabled(java.lang.Boolean rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getUserVolumeEncryptionEnabled}
         * @param userVolumeEncryptionEnabled the value to be set.
         * @return {@code this}
         */
        public Builder userVolumeEncryptionEnabled(java.lang.Boolean userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getVolumeEncryptionKey}
         * @param volumeEncryptionKey the value to be set.
         * @return {@code this}
         */
        public Builder volumeEncryptionKey(java.lang.String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getWorkspaceProperties}
         * @param workspaceProperties workspace_properties block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder workspaceProperties(java.util.List<? extends imports.aws.WorkspacesWorkspaceWorkspaceProperties> workspaceProperties) {
            this.workspaceProperties = (java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties>)workspaceProperties;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getDependsOn}
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
         * Sets the value of {@link WorkspacesWorkspaceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceConfig#getProvider}
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
         * @return a new instance of {@link WorkspacesWorkspaceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WorkspacesWorkspaceConfig build() {
            return new Jsii$Proxy(bundleId, directoryId, userName, rootVolumeEncryptionEnabled, tags, userVolumeEncryptionEnabled, volumeEncryptionKey, workspaceProperties, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link WorkspacesWorkspaceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WorkspacesWorkspaceConfig {
        private final java.lang.String bundleId;
        private final java.lang.String directoryId;
        private final java.lang.String userName;
        private final java.lang.Boolean rootVolumeEncryptionEnabled;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Boolean userVolumeEncryptionEnabled;
        private final java.lang.String volumeEncryptionKey;
        private final java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties> workspaceProperties;
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
            this.bundleId = software.amazon.jsii.Kernel.get(this, "bundleId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.directoryId = software.amazon.jsii.Kernel.get(this, "directoryId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userName = software.amazon.jsii.Kernel.get(this, "userName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootVolumeEncryptionEnabled = software.amazon.jsii.Kernel.get(this, "rootVolumeEncryptionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.userVolumeEncryptionEnabled = software.amazon.jsii.Kernel.get(this, "userVolumeEncryptionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.volumeEncryptionKey = software.amazon.jsii.Kernel.get(this, "volumeEncryptionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.workspaceProperties = software.amazon.jsii.Kernel.get(this, "workspaceProperties", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorkspacesWorkspaceWorkspaceProperties.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bundleId, final java.lang.String directoryId, final java.lang.String userName, final java.lang.Boolean rootVolumeEncryptionEnabled, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean userVolumeEncryptionEnabled, final java.lang.String volumeEncryptionKey, final java.util.List<? extends imports.aws.WorkspacesWorkspaceWorkspaceProperties> workspaceProperties, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bundleId = java.util.Objects.requireNonNull(bundleId, "bundleId is required");
            this.directoryId = java.util.Objects.requireNonNull(directoryId, "directoryId is required");
            this.userName = java.util.Objects.requireNonNull(userName, "userName is required");
            this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
            this.tags = tags;
            this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
            this.volumeEncryptionKey = volumeEncryptionKey;
            this.workspaceProperties = (java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties>)workspaceProperties;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getBundleId() {
            return this.bundleId;
        }

        @Override
        public final java.lang.String getDirectoryId() {
            return this.directoryId;
        }

        @Override
        public final java.lang.String getUserName() {
            return this.userName;
        }

        @Override
        public final java.lang.Boolean getRootVolumeEncryptionEnabled() {
            return this.rootVolumeEncryptionEnabled;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Boolean getUserVolumeEncryptionEnabled() {
            return this.userVolumeEncryptionEnabled;
        }

        @Override
        public final java.lang.String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        @Override
        public final java.util.List<imports.aws.WorkspacesWorkspaceWorkspaceProperties> getWorkspaceProperties() {
            return this.workspaceProperties;
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

            data.set("bundleId", om.valueToTree(this.getBundleId()));
            data.set("directoryId", om.valueToTree(this.getDirectoryId()));
            data.set("userName", om.valueToTree(this.getUserName()));
            if (this.getRootVolumeEncryptionEnabled() != null) {
                data.set("rootVolumeEncryptionEnabled", om.valueToTree(this.getRootVolumeEncryptionEnabled()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUserVolumeEncryptionEnabled() != null) {
                data.set("userVolumeEncryptionEnabled", om.valueToTree(this.getUserVolumeEncryptionEnabled()));
            }
            if (this.getVolumeEncryptionKey() != null) {
                data.set("volumeEncryptionKey", om.valueToTree(this.getVolumeEncryptionKey()));
            }
            if (this.getWorkspaceProperties() != null) {
                data.set("workspaceProperties", om.valueToTree(this.getWorkspaceProperties()));
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
            struct.set("fqn", om.valueToTree("aws.WorkspacesWorkspaceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WorkspacesWorkspaceConfig.Jsii$Proxy that = (WorkspacesWorkspaceConfig.Jsii$Proxy) o;

            if (!bundleId.equals(that.bundleId)) return false;
            if (!directoryId.equals(that.directoryId)) return false;
            if (!userName.equals(that.userName)) return false;
            if (this.rootVolumeEncryptionEnabled != null ? !this.rootVolumeEncryptionEnabled.equals(that.rootVolumeEncryptionEnabled) : that.rootVolumeEncryptionEnabled != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.userVolumeEncryptionEnabled != null ? !this.userVolumeEncryptionEnabled.equals(that.userVolumeEncryptionEnabled) : that.userVolumeEncryptionEnabled != null) return false;
            if (this.volumeEncryptionKey != null ? !this.volumeEncryptionKey.equals(that.volumeEncryptionKey) : that.volumeEncryptionKey != null) return false;
            if (this.workspaceProperties != null ? !this.workspaceProperties.equals(that.workspaceProperties) : that.workspaceProperties != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bundleId.hashCode();
            result = 31 * result + (this.directoryId.hashCode());
            result = 31 * result + (this.userName.hashCode());
            result = 31 * result + (this.rootVolumeEncryptionEnabled != null ? this.rootVolumeEncryptionEnabled.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.userVolumeEncryptionEnabled != null ? this.userVolumeEncryptionEnabled.hashCode() : 0);
            result = 31 * result + (this.volumeEncryptionKey != null ? this.volumeEncryptionKey.hashCode() : 0);
            result = 31 * result + (this.workspaceProperties != null ? this.workspaceProperties.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
