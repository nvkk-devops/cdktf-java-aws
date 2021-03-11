package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.399Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DatasyncTaskOptions")
@software.amazon.jsii.Jsii.Proxy(DatasyncTaskOptions.Jsii$Proxy.class)
public interface DatasyncTaskOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAtime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getBytesPerSecond() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGid() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMtime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPosixPermissions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreserveDeletedFiles() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreserveDevices() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVerifyMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DatasyncTaskOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DatasyncTaskOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DatasyncTaskOptions> {
        private java.lang.String atime;
        private java.lang.Number bytesPerSecond;
        private java.lang.String gid;
        private java.lang.String mtime;
        private java.lang.String posixPermissions;
        private java.lang.String preserveDeletedFiles;
        private java.lang.String preserveDevices;
        private java.lang.String uid;
        private java.lang.String verifyMode;

        /**
         * Sets the value of {@link DatasyncTaskOptions#getAtime}
         * @param atime the value to be set.
         * @return {@code this}
         */
        public Builder atime(java.lang.String atime) {
            this.atime = atime;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getBytesPerSecond}
         * @param bytesPerSecond the value to be set.
         * @return {@code this}
         */
        public Builder bytesPerSecond(java.lang.Number bytesPerSecond) {
            this.bytesPerSecond = bytesPerSecond;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getGid}
         * @param gid the value to be set.
         * @return {@code this}
         */
        public Builder gid(java.lang.String gid) {
            this.gid = gid;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getMtime}
         * @param mtime the value to be set.
         * @return {@code this}
         */
        public Builder mtime(java.lang.String mtime) {
            this.mtime = mtime;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getPosixPermissions}
         * @param posixPermissions the value to be set.
         * @return {@code this}
         */
        public Builder posixPermissions(java.lang.String posixPermissions) {
            this.posixPermissions = posixPermissions;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getPreserveDeletedFiles}
         * @param preserveDeletedFiles the value to be set.
         * @return {@code this}
         */
        public Builder preserveDeletedFiles(java.lang.String preserveDeletedFiles) {
            this.preserveDeletedFiles = preserveDeletedFiles;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getPreserveDevices}
         * @param preserveDevices the value to be set.
         * @return {@code this}
         */
        public Builder preserveDevices(java.lang.String preserveDevices) {
            this.preserveDevices = preserveDevices;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getUid}
         * @param uid the value to be set.
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskOptions#getVerifyMode}
         * @param verifyMode the value to be set.
         * @return {@code this}
         */
        public Builder verifyMode(java.lang.String verifyMode) {
            this.verifyMode = verifyMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DatasyncTaskOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DatasyncTaskOptions build() {
            return new Jsii$Proxy(atime, bytesPerSecond, gid, mtime, posixPermissions, preserveDeletedFiles, preserveDevices, uid, verifyMode);
        }
    }

    /**
     * An implementation for {@link DatasyncTaskOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DatasyncTaskOptions {
        private final java.lang.String atime;
        private final java.lang.Number bytesPerSecond;
        private final java.lang.String gid;
        private final java.lang.String mtime;
        private final java.lang.String posixPermissions;
        private final java.lang.String preserveDeletedFiles;
        private final java.lang.String preserveDevices;
        private final java.lang.String uid;
        private final java.lang.String verifyMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.atime = software.amazon.jsii.Kernel.get(this, "atime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bytesPerSecond = software.amazon.jsii.Kernel.get(this, "bytesPerSecond", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.gid = software.amazon.jsii.Kernel.get(this, "gid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mtime = software.amazon.jsii.Kernel.get(this, "mtime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.posixPermissions = software.amazon.jsii.Kernel.get(this, "posixPermissions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preserveDeletedFiles = software.amazon.jsii.Kernel.get(this, "preserveDeletedFiles", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preserveDevices = software.amazon.jsii.Kernel.get(this, "preserveDevices", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.uid = software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.verifyMode = software.amazon.jsii.Kernel.get(this, "verifyMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String atime, final java.lang.Number bytesPerSecond, final java.lang.String gid, final java.lang.String mtime, final java.lang.String posixPermissions, final java.lang.String preserveDeletedFiles, final java.lang.String preserveDevices, final java.lang.String uid, final java.lang.String verifyMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.atime = atime;
            this.bytesPerSecond = bytesPerSecond;
            this.gid = gid;
            this.mtime = mtime;
            this.posixPermissions = posixPermissions;
            this.preserveDeletedFiles = preserveDeletedFiles;
            this.preserveDevices = preserveDevices;
            this.uid = uid;
            this.verifyMode = verifyMode;
        }

        @Override
        public final java.lang.String getAtime() {
            return this.atime;
        }

        @Override
        public final java.lang.Number getBytesPerSecond() {
            return this.bytesPerSecond;
        }

        @Override
        public final java.lang.String getGid() {
            return this.gid;
        }

        @Override
        public final java.lang.String getMtime() {
            return this.mtime;
        }

        @Override
        public final java.lang.String getPosixPermissions() {
            return this.posixPermissions;
        }

        @Override
        public final java.lang.String getPreserveDeletedFiles() {
            return this.preserveDeletedFiles;
        }

        @Override
        public final java.lang.String getPreserveDevices() {
            return this.preserveDevices;
        }

        @Override
        public final java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public final java.lang.String getVerifyMode() {
            return this.verifyMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAtime() != null) {
                data.set("atime", om.valueToTree(this.getAtime()));
            }
            if (this.getBytesPerSecond() != null) {
                data.set("bytesPerSecond", om.valueToTree(this.getBytesPerSecond()));
            }
            if (this.getGid() != null) {
                data.set("gid", om.valueToTree(this.getGid()));
            }
            if (this.getMtime() != null) {
                data.set("mtime", om.valueToTree(this.getMtime()));
            }
            if (this.getPosixPermissions() != null) {
                data.set("posixPermissions", om.valueToTree(this.getPosixPermissions()));
            }
            if (this.getPreserveDeletedFiles() != null) {
                data.set("preserveDeletedFiles", om.valueToTree(this.getPreserveDeletedFiles()));
            }
            if (this.getPreserveDevices() != null) {
                data.set("preserveDevices", om.valueToTree(this.getPreserveDevices()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }
            if (this.getVerifyMode() != null) {
                data.set("verifyMode", om.valueToTree(this.getVerifyMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DatasyncTaskOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DatasyncTaskOptions.Jsii$Proxy that = (DatasyncTaskOptions.Jsii$Proxy) o;

            if (this.atime != null ? !this.atime.equals(that.atime) : that.atime != null) return false;
            if (this.bytesPerSecond != null ? !this.bytesPerSecond.equals(that.bytesPerSecond) : that.bytesPerSecond != null) return false;
            if (this.gid != null ? !this.gid.equals(that.gid) : that.gid != null) return false;
            if (this.mtime != null ? !this.mtime.equals(that.mtime) : that.mtime != null) return false;
            if (this.posixPermissions != null ? !this.posixPermissions.equals(that.posixPermissions) : that.posixPermissions != null) return false;
            if (this.preserveDeletedFiles != null ? !this.preserveDeletedFiles.equals(that.preserveDeletedFiles) : that.preserveDeletedFiles != null) return false;
            if (this.preserveDevices != null ? !this.preserveDevices.equals(that.preserveDevices) : that.preserveDevices != null) return false;
            if (this.uid != null ? !this.uid.equals(that.uid) : that.uid != null) return false;
            return this.verifyMode != null ? this.verifyMode.equals(that.verifyMode) : that.verifyMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.atime != null ? this.atime.hashCode() : 0;
            result = 31 * result + (this.bytesPerSecond != null ? this.bytesPerSecond.hashCode() : 0);
            result = 31 * result + (this.gid != null ? this.gid.hashCode() : 0);
            result = 31 * result + (this.mtime != null ? this.mtime.hashCode() : 0);
            result = 31 * result + (this.posixPermissions != null ? this.posixPermissions.hashCode() : 0);
            result = 31 * result + (this.preserveDeletedFiles != null ? this.preserveDeletedFiles.hashCode() : 0);
            result = 31 * result + (this.preserveDevices != null ? this.preserveDevices.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            result = 31 * result + (this.verifyMode != null ? this.verifyMode.hashCode() : 0);
            return result;
        }
    }
}
