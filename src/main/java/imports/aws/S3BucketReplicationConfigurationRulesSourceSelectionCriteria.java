package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.838Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria")
@software.amazon.jsii.Jsii.Proxy(S3BucketReplicationConfigurationRulesSourceSelectionCriteria.Jsii$Proxy.class)
public interface S3BucketReplicationConfigurationRulesSourceSelectionCriteria extends software.amazon.jsii.JsiiSerializable {

    /**
     * sse_kms_encrypted_objects block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects> getSseKmsEncryptedObjects() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketReplicationConfigurationRulesSourceSelectionCriteria}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketReplicationConfigurationRulesSourceSelectionCriteria}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketReplicationConfigurationRulesSourceSelectionCriteria> {
        private java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects> sseKmsEncryptedObjects;

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRulesSourceSelectionCriteria#getSseKmsEncryptedObjects}
         * @param sseKmsEncryptedObjects sse_kms_encrypted_objects block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sseKmsEncryptedObjects(java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects> sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects>)sseKmsEncryptedObjects;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketReplicationConfigurationRulesSourceSelectionCriteria}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketReplicationConfigurationRulesSourceSelectionCriteria build() {
            return new Jsii$Proxy(sseKmsEncryptedObjects);
        }
    }

    /**
     * An implementation for {@link S3BucketReplicationConfigurationRulesSourceSelectionCriteria}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketReplicationConfigurationRulesSourceSelectionCriteria {
        private final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects> sseKmsEncryptedObjects;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sseKmsEncryptedObjects = software.amazon.jsii.Kernel.get(this, "sseKmsEncryptedObjects", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects> sseKmsEncryptedObjects) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sseKmsEncryptedObjects = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects>)sseKmsEncryptedObjects;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects> getSseKmsEncryptedObjects() {
            return this.sseKmsEncryptedObjects;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSseKmsEncryptedObjects() != null) {
                data.set("sseKmsEncryptedObjects", om.valueToTree(this.getSseKmsEncryptedObjects()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketReplicationConfigurationRulesSourceSelectionCriteria.Jsii$Proxy that = (S3BucketReplicationConfigurationRulesSourceSelectionCriteria.Jsii$Proxy) o;

            return this.sseKmsEncryptedObjects != null ? this.sseKmsEncryptedObjects.equals(that.sseKmsEncryptedObjects) : that.sseKmsEncryptedObjects == null;
        }

        @Override
        public final int hashCode() {
            int result = this.sseKmsEncryptedObjects != null ? this.sseKmsEncryptedObjects.hashCode() : 0;
            return result;
        }
    }
}
