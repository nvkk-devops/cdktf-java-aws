package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.189Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoIdentityPoolCognitoIdentityProviders")
@software.amazon.jsii.Jsii.Proxy(CognitoIdentityPoolCognitoIdentityProviders.Jsii$Proxy.class)
public interface CognitoIdentityPoolCognitoIdentityProviders extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getClientId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getProviderName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getServerSideTokenCheck() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoIdentityPoolCognitoIdentityProviders}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoIdentityPoolCognitoIdentityProviders}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoIdentityPoolCognitoIdentityProviders> {
        private java.lang.String clientId;
        private java.lang.String providerName;
        private java.lang.Boolean serverSideTokenCheck;

        /**
         * Sets the value of {@link CognitoIdentityPoolCognitoIdentityProviders#getClientId}
         * @param clientId the value to be set.
         * @return {@code this}
         */
        public Builder clientId(java.lang.String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolCognitoIdentityProviders#getProviderName}
         * @param providerName the value to be set.
         * @return {@code this}
         */
        public Builder providerName(java.lang.String providerName) {
            this.providerName = providerName;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolCognitoIdentityProviders#getServerSideTokenCheck}
         * @param serverSideTokenCheck the value to be set.
         * @return {@code this}
         */
        public Builder serverSideTokenCheck(java.lang.Boolean serverSideTokenCheck) {
            this.serverSideTokenCheck = serverSideTokenCheck;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoIdentityPoolCognitoIdentityProviders}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoIdentityPoolCognitoIdentityProviders build() {
            return new Jsii$Proxy(clientId, providerName, serverSideTokenCheck);
        }
    }

    /**
     * An implementation for {@link CognitoIdentityPoolCognitoIdentityProviders}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoIdentityPoolCognitoIdentityProviders {
        private final java.lang.String clientId;
        private final java.lang.String providerName;
        private final java.lang.Boolean serverSideTokenCheck;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientId = software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.providerName = software.amazon.jsii.Kernel.get(this, "providerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serverSideTokenCheck = software.amazon.jsii.Kernel.get(this, "serverSideTokenCheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String clientId, final java.lang.String providerName, final java.lang.Boolean serverSideTokenCheck) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientId = clientId;
            this.providerName = providerName;
            this.serverSideTokenCheck = serverSideTokenCheck;
        }

        @Override
        public final java.lang.String getClientId() {
            return this.clientId;
        }

        @Override
        public final java.lang.String getProviderName() {
            return this.providerName;
        }

        @Override
        public final java.lang.Boolean getServerSideTokenCheck() {
            return this.serverSideTokenCheck;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientId() != null) {
                data.set("clientId", om.valueToTree(this.getClientId()));
            }
            if (this.getProviderName() != null) {
                data.set("providerName", om.valueToTree(this.getProviderName()));
            }
            if (this.getServerSideTokenCheck() != null) {
                data.set("serverSideTokenCheck", om.valueToTree(this.getServerSideTokenCheck()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoIdentityPoolCognitoIdentityProviders"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoIdentityPoolCognitoIdentityProviders.Jsii$Proxy that = (CognitoIdentityPoolCognitoIdentityProviders.Jsii$Proxy) o;

            if (this.clientId != null ? !this.clientId.equals(that.clientId) : that.clientId != null) return false;
            if (this.providerName != null ? !this.providerName.equals(that.providerName) : that.providerName != null) return false;
            return this.serverSideTokenCheck != null ? this.serverSideTokenCheck.equals(that.serverSideTokenCheck) : that.serverSideTokenCheck == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientId != null ? this.clientId.hashCode() : 0;
            result = 31 * result + (this.providerName != null ? this.providerName.hashCode() : 0);
            result = 31 * result + (this.serverSideTokenCheck != null ? this.serverSideTokenCheck.hashCode() : 0);
            return result;
        }
    }
}
