package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.838Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketReplicationConfigurationRulesDestination")
@software.amazon.jsii.Jsii.Proxy(S3BucketReplicationConfigurationRulesDestination.Jsii$Proxy.class)
public interface S3BucketReplicationConfigurationRulesDestination extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBucket();

    /**
     * access_control_translation block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation> getAccessControlTranslation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAccountId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReplicaKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClass() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketReplicationConfigurationRulesDestination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketReplicationConfigurationRulesDestination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketReplicationConfigurationRulesDestination> {
        private java.lang.String bucket;
        private java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation> accessControlTranslation;
        private java.lang.String accountId;
        private java.lang.String replicaKmsKeyId;
        private java.lang.String storageClass;

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRulesDestination#getBucket}
         * @param bucket the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRulesDestination#getAccessControlTranslation}
         * @param accessControlTranslation access_control_translation block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accessControlTranslation(java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation> accessControlTranslation) {
            this.accessControlTranslation = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation>)accessControlTranslation;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRulesDestination#getAccountId}
         * @param accountId the value to be set.
         * @return {@code this}
         */
        public Builder accountId(java.lang.String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRulesDestination#getReplicaKmsKeyId}
         * @param replicaKmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder replicaKmsKeyId(java.lang.String replicaKmsKeyId) {
            this.replicaKmsKeyId = replicaKmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRulesDestination#getStorageClass}
         * @param storageClass the value to be set.
         * @return {@code this}
         */
        public Builder storageClass(java.lang.String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketReplicationConfigurationRulesDestination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketReplicationConfigurationRulesDestination build() {
            return new Jsii$Proxy(bucket, accessControlTranslation, accountId, replicaKmsKeyId, storageClass);
        }
    }

    /**
     * An implementation for {@link S3BucketReplicationConfigurationRulesDestination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketReplicationConfigurationRulesDestination {
        private final java.lang.String bucket;
        private final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation> accessControlTranslation;
        private final java.lang.String accountId;
        private final java.lang.String replicaKmsKeyId;
        private final java.lang.String storageClass;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessControlTranslation = software.amazon.jsii.Kernel.get(this, "accessControlTranslation", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation.class)));
            this.accountId = software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicaKmsKeyId = software.amazon.jsii.Kernel.get(this, "replicaKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageClass = software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bucket, final java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation> accessControlTranslation, final java.lang.String accountId, final java.lang.String replicaKmsKeyId, final java.lang.String storageClass) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucket = java.util.Objects.requireNonNull(bucket, "bucket is required");
            this.accessControlTranslation = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation>)accessControlTranslation;
            this.accountId = accountId;
            this.replicaKmsKeyId = replicaKmsKeyId;
            this.storageClass = storageClass;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestinationAccessControlTranslation> getAccessControlTranslation() {
            return this.accessControlTranslation;
        }

        @Override
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        @Override
        public final java.lang.String getReplicaKmsKeyId() {
            return this.replicaKmsKeyId;
        }

        @Override
        public final java.lang.String getStorageClass() {
            return this.storageClass;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucket", om.valueToTree(this.getBucket()));
            if (this.getAccessControlTranslation() != null) {
                data.set("accessControlTranslation", om.valueToTree(this.getAccessControlTranslation()));
            }
            if (this.getAccountId() != null) {
                data.set("accountId", om.valueToTree(this.getAccountId()));
            }
            if (this.getReplicaKmsKeyId() != null) {
                data.set("replicaKmsKeyId", om.valueToTree(this.getReplicaKmsKeyId()));
            }
            if (this.getStorageClass() != null) {
                data.set("storageClass", om.valueToTree(this.getStorageClass()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketReplicationConfigurationRulesDestination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketReplicationConfigurationRulesDestination.Jsii$Proxy that = (S3BucketReplicationConfigurationRulesDestination.Jsii$Proxy) o;

            if (!bucket.equals(that.bucket)) return false;
            if (this.accessControlTranslation != null ? !this.accessControlTranslation.equals(that.accessControlTranslation) : that.accessControlTranslation != null) return false;
            if (this.accountId != null ? !this.accountId.equals(that.accountId) : that.accountId != null) return false;
            if (this.replicaKmsKeyId != null ? !this.replicaKmsKeyId.equals(that.replicaKmsKeyId) : that.replicaKmsKeyId != null) return false;
            return this.storageClass != null ? this.storageClass.equals(that.storageClass) : that.storageClass == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucket.hashCode();
            result = 31 * result + (this.accessControlTranslation != null ? this.accessControlTranslation.hashCode() : 0);
            result = 31 * result + (this.accountId != null ? this.accountId.hashCode() : 0);
            result = 31 * result + (this.replicaKmsKeyId != null ? this.replicaKmsKeyId.hashCode() : 0);
            result = 31 * result + (this.storageClass != null ? this.storageClass.hashCode() : 0);
            return result;
        }
    }
}
