package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.167Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectEnvironmentRegistryCredential")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectEnvironmentRegistryCredential.Jsii$Proxy.class)
public interface CodebuildProjectEnvironmentRegistryCredential extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getCredential();

    @org.jetbrains.annotations.NotNull java.lang.String getCredentialProvider();

    /**
     * @return a {@link Builder} of {@link CodebuildProjectEnvironmentRegistryCredential}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectEnvironmentRegistryCredential}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectEnvironmentRegistryCredential> {
        private java.lang.String credential;
        private java.lang.String credentialProvider;

        /**
         * Sets the value of {@link CodebuildProjectEnvironmentRegistryCredential#getCredential}
         * @param credential the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder credential(java.lang.String credential) {
            this.credential = credential;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironmentRegistryCredential#getCredentialProvider}
         * @param credentialProvider the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder credentialProvider(java.lang.String credentialProvider) {
            this.credentialProvider = credentialProvider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectEnvironmentRegistryCredential}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectEnvironmentRegistryCredential build() {
            return new Jsii$Proxy(credential, credentialProvider);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectEnvironmentRegistryCredential}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectEnvironmentRegistryCredential {
        private final java.lang.String credential;
        private final java.lang.String credentialProvider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.credential = software.amazon.jsii.Kernel.get(this, "credential", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.credentialProvider = software.amazon.jsii.Kernel.get(this, "credentialProvider", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String credential, final java.lang.String credentialProvider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.credential = java.util.Objects.requireNonNull(credential, "credential is required");
            this.credentialProvider = java.util.Objects.requireNonNull(credentialProvider, "credentialProvider is required");
        }

        @Override
        public final java.lang.String getCredential() {
            return this.credential;
        }

        @Override
        public final java.lang.String getCredentialProvider() {
            return this.credentialProvider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("credential", om.valueToTree(this.getCredential()));
            data.set("credentialProvider", om.valueToTree(this.getCredentialProvider()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectEnvironmentRegistryCredential"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectEnvironmentRegistryCredential.Jsii$Proxy that = (CodebuildProjectEnvironmentRegistryCredential.Jsii$Proxy) o;

            if (!credential.equals(that.credential)) return false;
            return this.credentialProvider.equals(that.credentialProvider);
        }

        @Override
        public final int hashCode() {
            int result = this.credential.hashCode();
            result = 31 * result + (this.credentialProvider.hashCode());
            return result;
        }
    }
}
