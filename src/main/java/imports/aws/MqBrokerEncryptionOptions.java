package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.719Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MqBrokerEncryptionOptions")
@software.amazon.jsii.Jsii.Proxy(MqBrokerEncryptionOptions.Jsii$Proxy.class)
public interface MqBrokerEncryptionOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseAwsOwnedKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MqBrokerEncryptionOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MqBrokerEncryptionOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MqBrokerEncryptionOptions> {
        private java.lang.String kmsKeyId;
        private java.lang.Boolean useAwsOwnedKey;

        /**
         * Sets the value of {@link MqBrokerEncryptionOptions#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerEncryptionOptions#getUseAwsOwnedKey}
         * @param useAwsOwnedKey the value to be set.
         * @return {@code this}
         */
        public Builder useAwsOwnedKey(java.lang.Boolean useAwsOwnedKey) {
            this.useAwsOwnedKey = useAwsOwnedKey;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MqBrokerEncryptionOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MqBrokerEncryptionOptions build() {
            return new Jsii$Proxy(kmsKeyId, useAwsOwnedKey);
        }
    }

    /**
     * An implementation for {@link MqBrokerEncryptionOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MqBrokerEncryptionOptions {
        private final java.lang.String kmsKeyId;
        private final java.lang.Boolean useAwsOwnedKey;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useAwsOwnedKey = software.amazon.jsii.Kernel.get(this, "useAwsOwnedKey", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String kmsKeyId, final java.lang.Boolean useAwsOwnedKey) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kmsKeyId = kmsKeyId;
            this.useAwsOwnedKey = useAwsOwnedKey;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.Boolean getUseAwsOwnedKey() {
            return this.useAwsOwnedKey;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getUseAwsOwnedKey() != null) {
                data.set("useAwsOwnedKey", om.valueToTree(this.getUseAwsOwnedKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MqBrokerEncryptionOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MqBrokerEncryptionOptions.Jsii$Proxy that = (MqBrokerEncryptionOptions.Jsii$Proxy) o;

            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            return this.useAwsOwnedKey != null ? this.useAwsOwnedKey.equals(that.useAwsOwnedKey) : that.useAwsOwnedKey == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0;
            result = 31 * result + (this.useAwsOwnedKey != null ? this.useAwsOwnedKey.hashCode() : 0);
            return result;
        }
    }
}
