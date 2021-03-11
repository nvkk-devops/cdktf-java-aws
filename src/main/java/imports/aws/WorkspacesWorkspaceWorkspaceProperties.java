package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.244Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WorkspacesWorkspaceWorkspaceProperties")
@software.amazon.jsii.Jsii.Proxy(WorkspacesWorkspaceWorkspaceProperties.Jsii$Proxy.class)
public interface WorkspacesWorkspaceWorkspaceProperties extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getComputeTypeName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRootVolumeSizeGib() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRunningMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRunningModeAutoStopTimeoutInMinutes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getUserVolumeSizeGib() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WorkspacesWorkspaceWorkspaceProperties}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WorkspacesWorkspaceWorkspaceProperties}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WorkspacesWorkspaceWorkspaceProperties> {
        private java.lang.String computeTypeName;
        private java.lang.Number rootVolumeSizeGib;
        private java.lang.String runningMode;
        private java.lang.Number runningModeAutoStopTimeoutInMinutes;
        private java.lang.Number userVolumeSizeGib;

        /**
         * Sets the value of {@link WorkspacesWorkspaceWorkspaceProperties#getComputeTypeName}
         * @param computeTypeName the value to be set.
         * @return {@code this}
         */
        public Builder computeTypeName(java.lang.String computeTypeName) {
            this.computeTypeName = computeTypeName;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceWorkspaceProperties#getRootVolumeSizeGib}
         * @param rootVolumeSizeGib the value to be set.
         * @return {@code this}
         */
        public Builder rootVolumeSizeGib(java.lang.Number rootVolumeSizeGib) {
            this.rootVolumeSizeGib = rootVolumeSizeGib;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceWorkspaceProperties#getRunningMode}
         * @param runningMode the value to be set.
         * @return {@code this}
         */
        public Builder runningMode(java.lang.String runningMode) {
            this.runningMode = runningMode;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceWorkspaceProperties#getRunningModeAutoStopTimeoutInMinutes}
         * @param runningModeAutoStopTimeoutInMinutes the value to be set.
         * @return {@code this}
         */
        public Builder runningModeAutoStopTimeoutInMinutes(java.lang.Number runningModeAutoStopTimeoutInMinutes) {
            this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
            return this;
        }

        /**
         * Sets the value of {@link WorkspacesWorkspaceWorkspaceProperties#getUserVolumeSizeGib}
         * @param userVolumeSizeGib the value to be set.
         * @return {@code this}
         */
        public Builder userVolumeSizeGib(java.lang.Number userVolumeSizeGib) {
            this.userVolumeSizeGib = userVolumeSizeGib;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WorkspacesWorkspaceWorkspaceProperties}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WorkspacesWorkspaceWorkspaceProperties build() {
            return new Jsii$Proxy(computeTypeName, rootVolumeSizeGib, runningMode, runningModeAutoStopTimeoutInMinutes, userVolumeSizeGib);
        }
    }

    /**
     * An implementation for {@link WorkspacesWorkspaceWorkspaceProperties}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WorkspacesWorkspaceWorkspaceProperties {
        private final java.lang.String computeTypeName;
        private final java.lang.Number rootVolumeSizeGib;
        private final java.lang.String runningMode;
        private final java.lang.Number runningModeAutoStopTimeoutInMinutes;
        private final java.lang.Number userVolumeSizeGib;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.computeTypeName = software.amazon.jsii.Kernel.get(this, "computeTypeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootVolumeSizeGib = software.amazon.jsii.Kernel.get(this, "rootVolumeSizeGib", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.runningMode = software.amazon.jsii.Kernel.get(this, "runningMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runningModeAutoStopTimeoutInMinutes = software.amazon.jsii.Kernel.get(this, "runningModeAutoStopTimeoutInMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.userVolumeSizeGib = software.amazon.jsii.Kernel.get(this, "userVolumeSizeGib", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String computeTypeName, final java.lang.Number rootVolumeSizeGib, final java.lang.String runningMode, final java.lang.Number runningModeAutoStopTimeoutInMinutes, final java.lang.Number userVolumeSizeGib) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.computeTypeName = computeTypeName;
            this.rootVolumeSizeGib = rootVolumeSizeGib;
            this.runningMode = runningMode;
            this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
            this.userVolumeSizeGib = userVolumeSizeGib;
        }

        @Override
        public final java.lang.String getComputeTypeName() {
            return this.computeTypeName;
        }

        @Override
        public final java.lang.Number getRootVolumeSizeGib() {
            return this.rootVolumeSizeGib;
        }

        @Override
        public final java.lang.String getRunningMode() {
            return this.runningMode;
        }

        @Override
        public final java.lang.Number getRunningModeAutoStopTimeoutInMinutes() {
            return this.runningModeAutoStopTimeoutInMinutes;
        }

        @Override
        public final java.lang.Number getUserVolumeSizeGib() {
            return this.userVolumeSizeGib;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getComputeTypeName() != null) {
                data.set("computeTypeName", om.valueToTree(this.getComputeTypeName()));
            }
            if (this.getRootVolumeSizeGib() != null) {
                data.set("rootVolumeSizeGib", om.valueToTree(this.getRootVolumeSizeGib()));
            }
            if (this.getRunningMode() != null) {
                data.set("runningMode", om.valueToTree(this.getRunningMode()));
            }
            if (this.getRunningModeAutoStopTimeoutInMinutes() != null) {
                data.set("runningModeAutoStopTimeoutInMinutes", om.valueToTree(this.getRunningModeAutoStopTimeoutInMinutes()));
            }
            if (this.getUserVolumeSizeGib() != null) {
                data.set("userVolumeSizeGib", om.valueToTree(this.getUserVolumeSizeGib()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.WorkspacesWorkspaceWorkspaceProperties"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WorkspacesWorkspaceWorkspaceProperties.Jsii$Proxy that = (WorkspacesWorkspaceWorkspaceProperties.Jsii$Proxy) o;

            if (this.computeTypeName != null ? !this.computeTypeName.equals(that.computeTypeName) : that.computeTypeName != null) return false;
            if (this.rootVolumeSizeGib != null ? !this.rootVolumeSizeGib.equals(that.rootVolumeSizeGib) : that.rootVolumeSizeGib != null) return false;
            if (this.runningMode != null ? !this.runningMode.equals(that.runningMode) : that.runningMode != null) return false;
            if (this.runningModeAutoStopTimeoutInMinutes != null ? !this.runningModeAutoStopTimeoutInMinutes.equals(that.runningModeAutoStopTimeoutInMinutes) : that.runningModeAutoStopTimeoutInMinutes != null) return false;
            return this.userVolumeSizeGib != null ? this.userVolumeSizeGib.equals(that.userVolumeSizeGib) : that.userVolumeSizeGib == null;
        }

        @Override
        public final int hashCode() {
            int result = this.computeTypeName != null ? this.computeTypeName.hashCode() : 0;
            result = 31 * result + (this.rootVolumeSizeGib != null ? this.rootVolumeSizeGib.hashCode() : 0);
            result = 31 * result + (this.runningMode != null ? this.runningMode.hashCode() : 0);
            result = 31 * result + (this.runningModeAutoStopTimeoutInMinutes != null ? this.runningModeAutoStopTimeoutInMinutes.hashCode() : 0);
            result = 31 * result + (this.userVolumeSizeGib != null ? this.userVolumeSizeGib.hashCode() : 0);
            return result;
        }
    }
}
