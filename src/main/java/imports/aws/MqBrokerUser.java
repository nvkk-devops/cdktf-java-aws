package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.719Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MqBrokerUser")
@software.amazon.jsii.Jsii.Proxy(MqBrokerUser.Jsii$Proxy.class)
public interface MqBrokerUser extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getPassword();

    @org.jetbrains.annotations.NotNull java.lang.String getUsername();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getConsoleAccess() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroups() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MqBrokerUser}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MqBrokerUser}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MqBrokerUser> {
        private java.lang.String password;
        private java.lang.String username;
        private java.lang.Boolean consoleAccess;
        private java.util.List<java.lang.String> groups;

        /**
         * Sets the value of {@link MqBrokerUser#getPassword}
         * @param password the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerUser#getUsername}
         * @param username the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerUser#getConsoleAccess}
         * @param consoleAccess the value to be set.
         * @return {@code this}
         */
        public Builder consoleAccess(java.lang.Boolean consoleAccess) {
            this.consoleAccess = consoleAccess;
            return this;
        }

        /**
         * Sets the value of {@link MqBrokerUser#getGroups}
         * @param groups the value to be set.
         * @return {@code this}
         */
        public Builder groups(java.util.List<java.lang.String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MqBrokerUser}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MqBrokerUser build() {
            return new Jsii$Proxy(password, username, consoleAccess, groups);
        }
    }

    /**
     * An implementation for {@link MqBrokerUser}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MqBrokerUser {
        private final java.lang.String password;
        private final java.lang.String username;
        private final java.lang.Boolean consoleAccess;
        private final java.util.List<java.lang.String> groups;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.consoleAccess = software.amazon.jsii.Kernel.get(this, "consoleAccess", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.groups = software.amazon.jsii.Kernel.get(this, "groups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String password, final java.lang.String username, final java.lang.Boolean consoleAccess, final java.util.List<java.lang.String> groups) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.password = java.util.Objects.requireNonNull(password, "password is required");
            this.username = java.util.Objects.requireNonNull(username, "username is required");
            this.consoleAccess = consoleAccess;
            this.groups = groups;
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
        public final java.lang.Boolean getConsoleAccess() {
            return this.consoleAccess;
        }

        @Override
        public final java.util.List<java.lang.String> getGroups() {
            return this.groups;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("password", om.valueToTree(this.getPassword()));
            data.set("username", om.valueToTree(this.getUsername()));
            if (this.getConsoleAccess() != null) {
                data.set("consoleAccess", om.valueToTree(this.getConsoleAccess()));
            }
            if (this.getGroups() != null) {
                data.set("groups", om.valueToTree(this.getGroups()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MqBrokerUser"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MqBrokerUser.Jsii$Proxy that = (MqBrokerUser.Jsii$Proxy) o;

            if (!password.equals(that.password)) return false;
            if (!username.equals(that.username)) return false;
            if (this.consoleAccess != null ? !this.consoleAccess.equals(that.consoleAccess) : that.consoleAccess != null) return false;
            return this.groups != null ? this.groups.equals(that.groups) : that.groups == null;
        }

        @Override
        public final int hashCode() {
            int result = this.password.hashCode();
            result = 31 * result + (this.username.hashCode());
            result = 31 * result + (this.consoleAccess != null ? this.consoleAccess.hashCode() : 0);
            result = 31 * result + (this.groups != null ? this.groups.hashCode() : 0);
            return result;
        }
    }
}
