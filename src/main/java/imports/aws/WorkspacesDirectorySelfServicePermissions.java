package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.243Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WorkspacesDirectorySelfServicePermissions")
@software.amazon.jsii.Jsii.Proxy(WorkspacesDirectorySelfServicePermissions.Jsii$Proxy.class)
public interface WorkspacesDirectorySelfServicePermissions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getChangeComputeType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncreaseVolumeSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRebuildWorkspace() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRestartWorkspace() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSwitchRunningMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WorkspacesDirectorySelfServicePermissions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WorkspacesDirectorySelfServicePermissions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WorkspacesDirectorySelfServicePermissions> {
        private java.lang.Boolean changeComputeType;
        private java.lang.Boolean increaseVolumeSize;
        private java.lang.Boolean rebuildWorkspace;
        private java.lang.Boolean restartWorkspace;
        private java.lang.Boolean switchRunningMode;

        /**
         * Sets the value of {@link WorkspacesDirectorySelfServicePermissions#getChangeComputeType}
         * @param changeComputeType the value to be set.
         * @return {@code this}
         */
        public Builder changeComputeType(java.lang.Boolean changeComputeType) {
            this.changeComputeType = changeComputeType;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesDirectorySelfServicePermissions#getIncreaseVolumeSize}
         * @param increaseVolumeSize the value to be set.
         * @return {@code this}
         */
        public Builder increaseVolumeSize(java.lang.Boolean increaseVolumeSize) {
            this.increaseVolumeSize = increaseVolumeSize;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesDirectorySelfServicePermissions#getRebuildWorkspace}
         * @param rebuildWorkspace the value to be set.
         * @return {@code this}
         */
        public Builder rebuildWorkspace(java.lang.Boolean rebuildWorkspace) {
            this.rebuildWorkspace = rebuildWorkspace;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesDirectorySelfServicePermissions#getRestartWorkspace}
         * @param restartWorkspace the value to be set.
         * @return {@code this}
         */
        public Builder restartWorkspace(java.lang.Boolean restartWorkspace) {
            this.restartWorkspace = restartWorkspace;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesDirectorySelfServicePermissions#getSwitchRunningMode}
         * @param switchRunningMode the value to be set.
         * @return {@code this}
         */
        public Builder switchRunningMode(java.lang.Boolean switchRunningMode) {
            this.switchRunningMode = switchRunningMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WorkspacesDirectorySelfServicePermissions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WorkspacesDirectorySelfServicePermissions build() {
            return new Jsii$Proxy(changeComputeType, increaseVolumeSize, rebuildWorkspace, restartWorkspace, switchRunningMode);
        }
    }

    /**
     * An implementation for {@link WorkspacesDirectorySelfServicePermissions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WorkspacesDirectorySelfServicePermissions {
        private final java.lang.Boolean changeComputeType;
        private final java.lang.Boolean increaseVolumeSize;
        private final java.lang.Boolean rebuildWorkspace;
        private final java.lang.Boolean restartWorkspace;
        private final java.lang.Boolean switchRunningMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.changeComputeType = software.amazon.jsii.Kernel.get(this, "changeComputeType", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.increaseVolumeSize = software.amazon.jsii.Kernel.get(this, "increaseVolumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.rebuildWorkspace = software.amazon.jsii.Kernel.get(this, "rebuildWorkspace", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.restartWorkspace = software.amazon.jsii.Kernel.get(this, "restartWorkspace", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.switchRunningMode = software.amazon.jsii.Kernel.get(this, "switchRunningMode", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean changeComputeType, final java.lang.Boolean increaseVolumeSize, final java.lang.Boolean rebuildWorkspace, final java.lang.Boolean restartWorkspace, final java.lang.Boolean switchRunningMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.changeComputeType = changeComputeType;
            this.increaseVolumeSize = increaseVolumeSize;
            this.rebuildWorkspace = rebuildWorkspace;
            this.restartWorkspace = restartWorkspace;
            this.switchRunningMode = switchRunningMode;
        }

        @Override
        public final java.lang.Boolean getChangeComputeType() {
            return this.changeComputeType;
        }

        @Override
        public final java.lang.Boolean getIncreaseVolumeSize() {
            return this.increaseVolumeSize;
        }

        @Override
        public final java.lang.Boolean getRebuildWorkspace() {
            return this.rebuildWorkspace;
        }

        @Override
        public final java.lang.Boolean getRestartWorkspace() {
            return this.restartWorkspace;
        }

        @Override
        public final java.lang.Boolean getSwitchRunningMode() {
            return this.switchRunningMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getChangeComputeType() != null) {
                data.set("changeComputeType", om.valueToTree(this.getChangeComputeType()));
            }
            if (this.getIncreaseVolumeSize() != null) {
                data.set("increaseVolumeSize", om.valueToTree(this.getIncreaseVolumeSize()));
            }
            if (this.getRebuildWorkspace() != null) {
                data.set("rebuildWorkspace", om.valueToTree(this.getRebuildWorkspace()));
            }
            if (this.getRestartWorkspace() != null) {
                data.set("restartWorkspace", om.valueToTree(this.getRestartWorkspace()));
            }
            if (this.getSwitchRunningMode() != null) {
                data.set("switchRunningMode", om.valueToTree(this.getSwitchRunningMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.WorkspacesDirectorySelfServicePermissions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WorkspacesDirectorySelfServicePermissions.Jsii$Proxy that = (WorkspacesDirectorySelfServicePermissions.Jsii$Proxy) o;

            if (this.changeComputeType != null ? !this.changeComputeType.equals(that.changeComputeType) : that.changeComputeType != null) return false;
            if (this.increaseVolumeSize != null ? !this.increaseVolumeSize.equals(that.increaseVolumeSize) : that.increaseVolumeSize != null) return false;
            if (this.rebuildWorkspace != null ? !this.rebuildWorkspace.equals(that.rebuildWorkspace) : that.rebuildWorkspace != null) return false;
            if (this.restartWorkspace != null ? !this.restartWorkspace.equals(that.restartWorkspace) : that.restartWorkspace != null) return false;
            return this.switchRunningMode != null ? this.switchRunningMode.equals(that.switchRunningMode) : that.switchRunningMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.changeComputeType != null ? this.changeComputeType.hashCode() : 0;
            result = 31 * result + (this.increaseVolumeSize != null ? this.increaseVolumeSize.hashCode() : 0);
            result = 31 * result + (this.rebuildWorkspace != null ? this.rebuildWorkspace.hashCode() : 0);
            result = 31 * result + (this.restartWorkspace != null ? this.restartWorkspace.hashCode() : 0);
            result = 31 * result + (this.switchRunningMode != null ? this.switchRunningMode.hashCode() : 0);
            return result;
        }
    }
}
