package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.056Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AthenaDatabaseEncryptionConfiguration")
@software.amazon.jsii.Jsii.Proxy(AthenaDatabaseEncryptionConfiguration.Jsii$Proxy.class)
public interface AthenaDatabaseEncryptionConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getEncryptionOption();

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AthenaDatabaseEncryptionConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AthenaDatabaseEncryptionConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AthenaDatabaseEncryptionConfiguration> {
        private java.lang.String encryptionOption;
        private java.lang.String kmsKey;

        /**
         * Sets the value of {@link AthenaDatabaseEncryptionConfiguration#getEncryptionOption}
         * @param encryptionOption the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder encryptionOption(java.lang.String encryptionOption) {
            this.encryptionOption = encryptionOption;
            return this;
        }

        /**
         * Sets the value of {@link AthenaDatabaseEncryptionConfiguration#getKmsKey}
         * @param kmsKey the value to be set.
         * @return {@code this}
         */
        public Builder kmsKey(java.lang.String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AthenaDatabaseEncryptionConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AthenaDatabaseEncryptionConfiguration build() {
            return new Jsii$Proxy(encryptionOption, kmsKey);
        }
    }

    /**
     * An implementation for {@link AthenaDatabaseEncryptionConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AthenaDatabaseEncryptionConfiguration {
        private final java.lang.String encryptionOption;
        private final java.lang.String kmsKey;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.encryptionOption = software.amazon.jsii.Kernel.get(this, "encryptionOption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKey = software.amazon.jsii.Kernel.get(this, "kmsKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String encryptionOption, final java.lang.String kmsKey) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.encryptionOption = java.util.Objects.requireNonNull(encryptionOption, "encryptionOption is required");
            this.kmsKey = kmsKey;
        }

        @Override
        public final java.lang.String getEncryptionOption() {
            return this.encryptionOption;
        }

        @Override
        public final java.lang.String getKmsKey() {
            return this.kmsKey;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("encryptionOption", om.valueToTree(this.getEncryptionOption()));
            if (this.getKmsKey() != null) {
                data.set("kmsKey", om.valueToTree(this.getKmsKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AthenaDatabaseEncryptionConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AthenaDatabaseEncryptionConfiguration.Jsii$Proxy that = (AthenaDatabaseEncryptionConfiguration.Jsii$Proxy) o;

            if (!encryptionOption.equals(that.encryptionOption)) return false;
            return this.kmsKey != null ? this.kmsKey.equals(that.kmsKey) : that.kmsKey == null;
        }

        @Override
        public final int hashCode() {
            int result = this.encryptionOption.hashCode();
            result = 31 * result + (this.kmsKey != null ? this.kmsKey.hashCode() : 0);
            return result;
        }
    }
}
