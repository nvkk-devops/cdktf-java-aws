package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.721Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterEncryptionInfo")
@software.amazon.jsii.Jsii.Proxy(MskClusterEncryptionInfo.Jsii$Proxy.class)
public interface MskClusterEncryptionInfo extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getEncryptionAtRestKmsKeyArn() {
        return null;
    }

    /**
     * encryption_in_transit block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.MskClusterEncryptionInfoEncryptionInTransit> getEncryptionInTransit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterEncryptionInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterEncryptionInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterEncryptionInfo> {
        private java.lang.String encryptionAtRestKmsKeyArn;
        private java.util.List<imports.aws.MskClusterEncryptionInfoEncryptionInTransit> encryptionInTransit;

        /**
         * Sets the value of {@link MskClusterEncryptionInfo#getEncryptionAtRestKmsKeyArn}
         * @param encryptionAtRestKmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder encryptionAtRestKmsKeyArn(java.lang.String encryptionAtRestKmsKeyArn) {
            this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterEncryptionInfo#getEncryptionInTransit}
         * @param encryptionInTransit encryption_in_transit block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryptionInTransit(java.util.List<? extends imports.aws.MskClusterEncryptionInfoEncryptionInTransit> encryptionInTransit) {
            this.encryptionInTransit = (java.util.List<imports.aws.MskClusterEncryptionInfoEncryptionInTransit>)encryptionInTransit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterEncryptionInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterEncryptionInfo build() {
            return new Jsii$Proxy(encryptionAtRestKmsKeyArn, encryptionInTransit);
        }
    }

    /**
     * An implementation for {@link MskClusterEncryptionInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterEncryptionInfo {
        private final java.lang.String encryptionAtRestKmsKeyArn;
        private final java.util.List<imports.aws.MskClusterEncryptionInfoEncryptionInTransit> encryptionInTransit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.encryptionAtRestKmsKeyArn = software.amazon.jsii.Kernel.get(this, "encryptionAtRestKmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryptionInTransit = software.amazon.jsii.Kernel.get(this, "encryptionInTransit", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.MskClusterEncryptionInfoEncryptionInTransit.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String encryptionAtRestKmsKeyArn, final java.util.List<? extends imports.aws.MskClusterEncryptionInfoEncryptionInTransit> encryptionInTransit) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
            this.encryptionInTransit = (java.util.List<imports.aws.MskClusterEncryptionInfoEncryptionInTransit>)encryptionInTransit;
        }

        @Override
        public final java.lang.String getEncryptionAtRestKmsKeyArn() {
            return this.encryptionAtRestKmsKeyArn;
        }

        @Override
        public final java.util.List<imports.aws.MskClusterEncryptionInfoEncryptionInTransit> getEncryptionInTransit() {
            return this.encryptionInTransit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEncryptionAtRestKmsKeyArn() != null) {
                data.set("encryptionAtRestKmsKeyArn", om.valueToTree(this.getEncryptionAtRestKmsKeyArn()));
            }
            if (this.getEncryptionInTransit() != null) {
                data.set("encryptionInTransit", om.valueToTree(this.getEncryptionInTransit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterEncryptionInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterEncryptionInfo.Jsii$Proxy that = (MskClusterEncryptionInfo.Jsii$Proxy) o;

            if (this.encryptionAtRestKmsKeyArn != null ? !this.encryptionAtRestKmsKeyArn.equals(that.encryptionAtRestKmsKeyArn) : that.encryptionAtRestKmsKeyArn != null) return false;
            return this.encryptionInTransit != null ? this.encryptionInTransit.equals(that.encryptionInTransit) : that.encryptionInTransit == null;
        }

        @Override
        public final int hashCode() {
            int result = this.encryptionAtRestKmsKeyArn != null ? this.encryptionAtRestKmsKeyArn.hashCode() : 0;
            result = 31 * result + (this.encryptionInTransit != null ? this.encryptionInTransit.hashCode() : 0);
            return result;
        }
    }
}
