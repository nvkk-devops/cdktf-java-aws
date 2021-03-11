package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.907Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.StoragegatewayGatewaySmbActiveDirectorySettings")
@software.amazon.jsii.Jsii.Proxy(StoragegatewayGatewaySmbActiveDirectorySettings.Jsii$Proxy.class)
public interface StoragegatewayGatewaySmbActiveDirectorySettings extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDomainName();

    @org.jetbrains.annotations.NotNull java.lang.String getPassword();

    @org.jetbrains.annotations.NotNull java.lang.String getUsername();

    /**
     * @return a {@link Builder} of {@link StoragegatewayGatewaySmbActiveDirectorySettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StoragegatewayGatewaySmbActiveDirectorySettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StoragegatewayGatewaySmbActiveDirectorySettings> {
        private java.lang.String domainName;
        private java.lang.String password;
        private java.lang.String username;

        /**
         * Sets the value of {@link StoragegatewayGatewaySmbActiveDirectorySettings#getDomainName}
         * @param domainName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewaySmbActiveDirectorySettings#getPassword}
         * @param password the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewaySmbActiveDirectorySettings#getUsername}
         * @param username the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StoragegatewayGatewaySmbActiveDirectorySettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StoragegatewayGatewaySmbActiveDirectorySettings build() {
            return new Jsii$Proxy(domainName, password, username);
        }
    }

    /**
     * An implementation for {@link StoragegatewayGatewaySmbActiveDirectorySettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StoragegatewayGatewaySmbActiveDirectorySettings {
        private final java.lang.String domainName;
        private final java.lang.String password;
        private final java.lang.String username;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String domainName, final java.lang.String password, final java.lang.String username) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.domainName = java.util.Objects.requireNonNull(domainName, "domainName is required");
            this.password = java.util.Objects.requireNonNull(password, "password is required");
            this.username = java.util.Objects.requireNonNull(username, "username is required");
        }

        @Override
        public final java.lang.String getDomainName() {
            return this.domainName;
        }

        @Override
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.String getUsername() {
            return this.username;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("domainName", om.valueToTree(this.getDomainName()));
            data.set("password", om.valueToTree(this.getPassword()));
            data.set("username", om.valueToTree(this.getUsername()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.StoragegatewayGatewaySmbActiveDirectorySettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StoragegatewayGatewaySmbActiveDirectorySettings.Jsii$Proxy that = (StoragegatewayGatewaySmbActiveDirectorySettings.Jsii$Proxy) o;

            if (!domainName.equals(that.domainName)) return false;
            if (!password.equals(that.password)) return false;
            return this.username.equals(that.username);
        }

        @Override
        public final int hashCode() {
            int result = this.domainName.hashCode();
            result = 31 * result + (this.password.hashCode());
            result = 31 * result + (this.username.hashCode());
            return result;
        }
    }
}
