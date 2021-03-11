package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.895Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmMaintenanceWindowTaskLoggingInfo")
@software.amazon.jsii.Jsii.Proxy(SsmMaintenanceWindowTaskLoggingInfo.Jsii$Proxy.class)
public interface SsmMaintenanceWindowTaskLoggingInfo extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getS3BucketName();

    @org.jetbrains.annotations.NotNull java.lang.String getS3Region();

    default @org.jetbrains.annotations.Nullable java.lang.String getS3BucketPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmMaintenanceWindowTaskLoggingInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmMaintenanceWindowTaskLoggingInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmMaintenanceWindowTaskLoggingInfo> {
        private java.lang.String s3BucketName;
        private java.lang.String s3Region;
        private java.lang.String s3BucketPrefix;

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskLoggingInfo#getS3BucketName}
         * @param s3BucketName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder s3BucketName(java.lang.String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskLoggingInfo#getS3Region}
         * @param s3Region the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder s3Region(java.lang.String s3Region) {
            this.s3Region = s3Region;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskLoggingInfo#getS3BucketPrefix}
         * @param s3BucketPrefix the value to be set.
         * @return {@code this}
         */
        public Builder s3BucketPrefix(java.lang.String s3BucketPrefix) {
            this.s3BucketPrefix = s3BucketPrefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SsmMaintenanceWindowTaskLoggingInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmMaintenanceWindowTaskLoggingInfo build() {
            return new Jsii$Proxy(s3BucketName, s3Region, s3BucketPrefix);
        }
    }

    /**
     * An implementation for {@link SsmMaintenanceWindowTaskLoggingInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmMaintenanceWindowTaskLoggingInfo {
        private final java.lang.String s3BucketName;
        private final java.lang.String s3Region;
        private final java.lang.String s3BucketPrefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3BucketName = software.amazon.jsii.Kernel.get(this, "s3BucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Region = software.amazon.jsii.Kernel.get(this, "s3Region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3BucketPrefix = software.amazon.jsii.Kernel.get(this, "s3BucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String s3BucketName, final java.lang.String s3Region, final java.lang.String s3BucketPrefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3BucketName = java.util.Objects.requireNonNull(s3BucketName, "s3BucketName is required");
            this.s3Region = java.util.Objects.requireNonNull(s3Region, "s3Region is required");
            this.s3BucketPrefix = s3BucketPrefix;
        }

        @Override
        public final java.lang.String getS3BucketName() {
            return this.s3BucketName;
        }

        @Override
        public final java.lang.String getS3Region() {
            return this.s3Region;
        }

        @Override
        public final java.lang.String getS3BucketPrefix() {
            return this.s3BucketPrefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("s3BucketName", om.valueToTree(this.getS3BucketName()));
            data.set("s3Region", om.valueToTree(this.getS3Region()));
            if (this.getS3BucketPrefix() != null) {
                data.set("s3BucketPrefix", om.valueToTree(this.getS3BucketPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SsmMaintenanceWindowTaskLoggingInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmMaintenanceWindowTaskLoggingInfo.Jsii$Proxy that = (SsmMaintenanceWindowTaskLoggingInfo.Jsii$Proxy) o;

            if (!s3BucketName.equals(that.s3BucketName)) return false;
            if (!s3Region.equals(that.s3Region)) return false;
            return this.s3BucketPrefix != null ? this.s3BucketPrefix.equals(that.s3BucketPrefix) : that.s3BucketPrefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.s3BucketName.hashCode();
            result = 31 * result + (this.s3Region.hashCode());
            result = 31 * result + (this.s3BucketPrefix != null ? this.s3BucketPrefix.hashCode() : 0);
            return result;
        }
    }
}
