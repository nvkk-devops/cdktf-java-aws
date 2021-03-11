package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.838Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault")
@software.amazon.jsii.Jsii.Proxy(S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault.Jsii$Proxy.class)
public interface S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getSseAlgorithm();

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsMasterKeyId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault> {
        private java.lang.String sseAlgorithm;
        private java.lang.String kmsMasterKeyId;

        /**
         * Sets the value of {@link S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault#getSseAlgorithm}
         * @param sseAlgorithm the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sseAlgorithm(java.lang.String sseAlgorithm) {
            this.sseAlgorithm = sseAlgorithm;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault#getKmsMasterKeyId}
         * @param kmsMasterKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsMasterKeyId(java.lang.String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault build() {
            return new Jsii$Proxy(sseAlgorithm, kmsMasterKeyId);
        }
    }

    /**
     * An implementation for {@link S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault {
        private final java.lang.String sseAlgorithm;
        private final java.lang.String kmsMasterKeyId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sseAlgorithm = software.amazon.jsii.Kernel.get(this, "sseAlgorithm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsMasterKeyId = software.amazon.jsii.Kernel.get(this, "kmsMasterKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String sseAlgorithm, final java.lang.String kmsMasterKeyId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sseAlgorithm = java.util.Objects.requireNonNull(sseAlgorithm, "sseAlgorithm is required");
            this.kmsMasterKeyId = kmsMasterKeyId;
        }

        @Override
        public final java.lang.String getSseAlgorithm() {
            return this.sseAlgorithm;
        }

        @Override
        public final java.lang.String getKmsMasterKeyId() {
            return this.kmsMasterKeyId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("sseAlgorithm", om.valueToTree(this.getSseAlgorithm()));
            if (this.getKmsMasterKeyId() != null) {
                data.set("kmsMasterKeyId", om.valueToTree(this.getKmsMasterKeyId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault.Jsii$Proxy that = (S3BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault.Jsii$Proxy) o;

            if (!sseAlgorithm.equals(that.sseAlgorithm)) return false;
            return this.kmsMasterKeyId != null ? this.kmsMasterKeyId.equals(that.kmsMasterKeyId) : that.kmsMasterKeyId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.sseAlgorithm.hashCode();
            result = 31 * result + (this.kmsMasterKeyId != null ? this.kmsMasterKeyId.hashCode() : 0);
            return result;
        }
    }
}
