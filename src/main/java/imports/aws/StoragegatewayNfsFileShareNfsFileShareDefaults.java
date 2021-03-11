package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.909Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.StoragegatewayNfsFileShareNfsFileShareDefaults")
@software.amazon.jsii.Jsii.Proxy(StoragegatewayNfsFileShareNfsFileShareDefaults.Jsii$Proxy.class)
public interface StoragegatewayNfsFileShareNfsFileShareDefaults extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getDirectoryMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFileMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getGroupId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getOwnerId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StoragegatewayNfsFileShareNfsFileShareDefaults}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StoragegatewayNfsFileShareNfsFileShareDefaults}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StoragegatewayNfsFileShareNfsFileShareDefaults> {
        private java.lang.String directoryMode;
        private java.lang.String fileMode;
        private java.lang.Number groupId;
        private java.lang.Number ownerId;

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareNfsFileShareDefaults#getDirectoryMode}
         * @param directoryMode the value to be set.
         * @return {@code this}
         */
        public Builder directoryMode(java.lang.String directoryMode) {
            this.directoryMode = directoryMode;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareNfsFileShareDefaults#getFileMode}
         * @param fileMode the value to be set.
         * @return {@code this}
         */
        public Builder fileMode(java.lang.String fileMode) {
            this.fileMode = fileMode;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareNfsFileShareDefaults#getGroupId}
         * @param groupId the value to be set.
         * @return {@code this}
         */
        public Builder groupId(java.lang.Number groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareNfsFileShareDefaults#getOwnerId}
         * @param ownerId the value to be set.
         * @return {@code this}
         */
        public Builder ownerId(java.lang.Number ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StoragegatewayNfsFileShareNfsFileShareDefaults}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StoragegatewayNfsFileShareNfsFileShareDefaults build() {
            return new Jsii$Proxy(directoryMode, fileMode, groupId, ownerId);
        }
    }

    /**
     * An implementation for {@link StoragegatewayNfsFileShareNfsFileShareDefaults}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StoragegatewayNfsFileShareNfsFileShareDefaults {
        private final java.lang.String directoryMode;
        private final java.lang.String fileMode;
        private final java.lang.Number groupId;
        private final java.lang.Number ownerId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.directoryMode = software.amazon.jsii.Kernel.get(this, "directoryMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fileMode = software.amazon.jsii.Kernel.get(this, "fileMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupId = software.amazon.jsii.Kernel.get(this, "groupId", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ownerId = software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String directoryMode, final java.lang.String fileMode, final java.lang.Number groupId, final java.lang.Number ownerId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.directoryMode = directoryMode;
            this.fileMode = fileMode;
            this.groupId = groupId;
            this.ownerId = ownerId;
        }

        @Override
        public final java.lang.String getDirectoryMode() {
            return this.directoryMode;
        }

        @Override
        public final java.lang.String getFileMode() {
            return this.fileMode;
        }

        @Override
        public final java.lang.Number getGroupId() {
            return this.groupId;
        }

        @Override
        public final java.lang.Number getOwnerId() {
            return this.ownerId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDirectoryMode() != null) {
                data.set("directoryMode", om.valueToTree(this.getDirectoryMode()));
            }
            if (this.getFileMode() != null) {
                data.set("fileMode", om.valueToTree(this.getFileMode()));
            }
            if (this.getGroupId() != null) {
                data.set("groupId", om.valueToTree(this.getGroupId()));
            }
            if (this.getOwnerId() != null) {
                data.set("ownerId", om.valueToTree(this.getOwnerId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.StoragegatewayNfsFileShareNfsFileShareDefaults"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StoragegatewayNfsFileShareNfsFileShareDefaults.Jsii$Proxy that = (StoragegatewayNfsFileShareNfsFileShareDefaults.Jsii$Proxy) o;

            if (this.directoryMode != null ? !this.directoryMode.equals(that.directoryMode) : that.directoryMode != null) return false;
            if (this.fileMode != null ? !this.fileMode.equals(that.fileMode) : that.fileMode != null) return false;
            if (this.groupId != null ? !this.groupId.equals(that.groupId) : that.groupId != null) return false;
            return this.ownerId != null ? this.ownerId.equals(that.ownerId) : that.ownerId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.directoryMode != null ? this.directoryMode.hashCode() : 0;
            result = 31 * result + (this.fileMode != null ? this.fileMode.hashCode() : 0);
            result = 31 * result + (this.groupId != null ? this.groupId.hashCode() : 0);
            result = 31 * result + (this.ownerId != null ? this.ownerId.hashCode() : 0);
            return result;
        }
    }
}
