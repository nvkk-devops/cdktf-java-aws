package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.905Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmResourceDataSyncS3Destination")
@software.amazon.jsii.Jsii.Proxy(SsmResourceDataSyncS3Destination.Jsii$Proxy.class)
public interface SsmResourceDataSyncS3Destination extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBucketName();

    @org.jetbrains.annotations.NotNull java.lang.String getRegion();

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSyncFormat() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmResourceDataSyncS3Destination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmResourceDataSyncS3Destination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmResourceDataSyncS3Destination> {
        private java.lang.String bucketName;
        private java.lang.String region;
        private java.lang.String kmsKeyArn;
        private java.lang.String prefix;
        private java.lang.String syncFormat;

        /**
         * Sets the value of {@link SsmResourceDataSyncS3Destination#getBucketName}
         * @param bucketName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link SsmResourceDataSyncS3Destination#getRegion}
         * @param region the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link SsmResourceDataSyncS3Destination#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link SsmResourceDataSyncS3Destination#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link SsmResourceDataSyncS3Destination#getSyncFormat}
         * @param syncFormat the value to be set.
         * @return {@code this}
         */
        public Builder syncFormat(java.lang.String syncFormat) {
            this.syncFormat = syncFormat;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SsmResourceDataSyncS3Destination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmResourceDataSyncS3Destination build() {
            return new Jsii$Proxy(bucketName, region, kmsKeyArn, prefix, syncFormat);
        }
    }

    /**
     * An implementation for {@link SsmResourceDataSyncS3Destination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmResourceDataSyncS3Destination {
        private final java.lang.String bucketName;
        private final java.lang.String region;
        private final java.lang.String kmsKeyArn;
        private final java.lang.String prefix;
        private final java.lang.String syncFormat;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.syncFormat = software.amazon.jsii.Kernel.get(this, "syncFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String bucketName, final java.lang.String region, final java.lang.String kmsKeyArn, final java.lang.String prefix, final java.lang.String syncFormat) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketName = java.util.Objects.requireNonNull(bucketName, "bucketName is required");
            this.region = java.util.Objects.requireNonNull(region, "region is required");
            this.kmsKeyArn = kmsKeyArn;
            this.prefix = prefix;
            this.syncFormat = syncFormat;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.lang.String getSyncFormat() {
            return this.syncFormat;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucketName", om.valueToTree(this.getBucketName()));
            data.set("region", om.valueToTree(this.getRegion()));
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getSyncFormat() != null) {
                data.set("syncFormat", om.valueToTree(this.getSyncFormat()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SsmResourceDataSyncS3Destination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmResourceDataSyncS3Destination.Jsii$Proxy that = (SsmResourceDataSyncS3Destination.Jsii$Proxy) o;

            if (!bucketName.equals(that.bucketName)) return false;
            if (!region.equals(that.region)) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            return this.syncFormat != null ? this.syncFormat.equals(that.syncFormat) : that.syncFormat == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketName.hashCode();
            result = 31 * result + (this.region.hashCode());
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.syncFormat != null ? this.syncFormat.hashCode() : 0);
            return result;
        }
    }
}
