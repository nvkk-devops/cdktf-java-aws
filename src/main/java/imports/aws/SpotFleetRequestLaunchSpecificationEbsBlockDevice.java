package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.884Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice")
@software.amazon.jsii.Jsii.Proxy(SpotFleetRequestLaunchSpecificationEbsBlockDevice.Jsii$Proxy.class)
public interface SpotFleetRequestLaunchSpecificationEbsBlockDevice extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDeviceName();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeleteOnTermination() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIops() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getVolumeSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotFleetRequestLaunchSpecificationEbsBlockDevice> {
        private java.lang.String deviceName;
        private java.lang.Boolean deleteOnTermination;
        private java.lang.Boolean encrypted;
        private java.lang.Number iops;
        private java.lang.String kmsKeyId;
        private java.lang.String snapshotId;
        private java.lang.Number volumeSize;
        private java.lang.String volumeType;

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getDeviceName}
         * @param deviceName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder deviceName(java.lang.String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getDeleteOnTermination}
         * @param deleteOnTermination the value to be set.
         * @return {@code this}
         */
        public Builder deleteOnTermination(java.lang.Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getEncrypted}
         * @param encrypted the value to be set.
         * @return {@code this}
         */
        public Builder encrypted(java.lang.Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getIops}
         * @param iops the value to be set.
         * @return {@code this}
         */
        public Builder iops(java.lang.Number iops) {
            this.iops = iops;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getSnapshotId}
         * @param snapshotId the value to be set.
         * @return {@code this}
         */
        public Builder snapshotId(java.lang.String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getVolumeSize}
         * @param volumeSize the value to be set.
         * @return {@code this}
         */
        public Builder volumeSize(java.lang.Number volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice#getVolumeType}
         * @param volumeType the value to be set.
         * @return {@code this}
         */
        public Builder volumeType(java.lang.String volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotFleetRequestLaunchSpecificationEbsBlockDevice build() {
            return new Jsii$Proxy(deviceName, deleteOnTermination, encrypted, iops, kmsKeyId, snapshotId, volumeSize, volumeType);
        }
    }

    /**
     * An implementation for {@link SpotFleetRequestLaunchSpecificationEbsBlockDevice}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotFleetRequestLaunchSpecificationEbsBlockDevice {
        private final java.lang.String deviceName;
        private final java.lang.Boolean deleteOnTermination;
        private final java.lang.Boolean encrypted;
        private final java.lang.Number iops;
        private final java.lang.String kmsKeyId;
        private final java.lang.String snapshotId;
        private final java.lang.Number volumeSize;
        private final java.lang.String volumeType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deviceName = software.amazon.jsii.Kernel.get(this, "deviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deleteOnTermination = software.amazon.jsii.Kernel.get(this, "deleteOnTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.encrypted = software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.iops = software.amazon.jsii.Kernel.get(this, "iops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.snapshotId = software.amazon.jsii.Kernel.get(this, "snapshotId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeSize = software.amazon.jsii.Kernel.get(this, "volumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.volumeType = software.amazon.jsii.Kernel.get(this, "volumeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String deviceName, final java.lang.Boolean deleteOnTermination, final java.lang.Boolean encrypted, final java.lang.Number iops, final java.lang.String kmsKeyId, final java.lang.String snapshotId, final java.lang.Number volumeSize, final java.lang.String volumeType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deviceName = java.util.Objects.requireNonNull(deviceName, "deviceName is required");
            this.deleteOnTermination = deleteOnTermination;
            this.encrypted = encrypted;
            this.iops = iops;
            this.kmsKeyId = kmsKeyId;
            this.snapshotId = snapshotId;
            this.volumeSize = volumeSize;
            this.volumeType = volumeType;
        }

        @Override
        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        @Override
        public final java.lang.Boolean getDeleteOnTermination() {
            return this.deleteOnTermination;
        }

        @Override
        public final java.lang.Boolean getEncrypted() {
            return this.encrypted;
        }

        @Override
        public final java.lang.Number getIops() {
            return this.iops;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.String getSnapshotId() {
            return this.snapshotId;
        }

        @Override
        public final java.lang.Number getVolumeSize() {
            return this.volumeSize;
        }

        @Override
        public final java.lang.String getVolumeType() {
            return this.volumeType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("deviceName", om.valueToTree(this.getDeviceName()));
            if (this.getDeleteOnTermination() != null) {
                data.set("deleteOnTermination", om.valueToTree(this.getDeleteOnTermination()));
            }
            if (this.getEncrypted() != null) {
                data.set("encrypted", om.valueToTree(this.getEncrypted()));
            }
            if (this.getIops() != null) {
                data.set("iops", om.valueToTree(this.getIops()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getSnapshotId() != null) {
                data.set("snapshotId", om.valueToTree(this.getSnapshotId()));
            }
            if (this.getVolumeSize() != null) {
                data.set("volumeSize", om.valueToTree(this.getVolumeSize()));
            }
            if (this.getVolumeType() != null) {
                data.set("volumeType", om.valueToTree(this.getVolumeType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SpotFleetRequestLaunchSpecificationEbsBlockDevice"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotFleetRequestLaunchSpecificationEbsBlockDevice.Jsii$Proxy that = (SpotFleetRequestLaunchSpecificationEbsBlockDevice.Jsii$Proxy) o;

            if (!deviceName.equals(that.deviceName)) return false;
            if (this.deleteOnTermination != null ? !this.deleteOnTermination.equals(that.deleteOnTermination) : that.deleteOnTermination != null) return false;
            if (this.encrypted != null ? !this.encrypted.equals(that.encrypted) : that.encrypted != null) return false;
            if (this.iops != null ? !this.iops.equals(that.iops) : that.iops != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.snapshotId != null ? !this.snapshotId.equals(that.snapshotId) : that.snapshotId != null) return false;
            if (this.volumeSize != null ? !this.volumeSize.equals(that.volumeSize) : that.volumeSize != null) return false;
            return this.volumeType != null ? this.volumeType.equals(that.volumeType) : that.volumeType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deviceName.hashCode();
            result = 31 * result + (this.deleteOnTermination != null ? this.deleteOnTermination.hashCode() : 0);
            result = 31 * result + (this.encrypted != null ? this.encrypted.hashCode() : 0);
            result = 31 * result + (this.iops != null ? this.iops.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.snapshotId != null ? this.snapshotId.hashCode() : 0);
            result = 31 * result + (this.volumeSize != null ? this.volumeSize.hashCode() : 0);
            result = 31 * result + (this.volumeType != null ? this.volumeType.hashCode() : 0);
            return result;
        }
    }
}
