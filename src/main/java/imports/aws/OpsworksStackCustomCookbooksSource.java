package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.770Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksStackCustomCookbooksSource")
@software.amazon.jsii.Jsii.Proxy(OpsworksStackCustomCookbooksSource.Jsii$Proxy.class)
public interface OpsworksStackCustomCookbooksSource extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    @org.jetbrains.annotations.NotNull java.lang.String getUrl();

    default @org.jetbrains.annotations.Nullable java.lang.String getPassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRevision() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSshKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksStackCustomCookbooksSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksStackCustomCookbooksSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksStackCustomCookbooksSource> {
        private java.lang.String type;
        private java.lang.String url;
        private java.lang.String password;
        private java.lang.String revision;
        private java.lang.String sshKey;
        private java.lang.String username;

        /**
         * Sets the value of {@link OpsworksStackCustomCookbooksSource#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackCustomCookbooksSource#getUrl}
         * @param url the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder url(java.lang.String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackCustomCookbooksSource#getPassword}
         * @param password the value to be set.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackCustomCookbooksSource#getRevision}
         * @param revision the value to be set.
         * @return {@code this}
         */
        public Builder revision(java.lang.String revision) {
            this.revision = revision;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackCustomCookbooksSource#getSshKey}
         * @param sshKey the value to be set.
         * @return {@code this}
         */
        public Builder sshKey(java.lang.String sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStackCustomCookbooksSource#getUsername}
         * @param username the value to be set.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OpsworksStackCustomCookbooksSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksStackCustomCookbooksSource build() {
            return new Jsii$Proxy(type, url, password, revision, sshKey, username);
        }
    }

    /**
     * An implementation for {@link OpsworksStackCustomCookbooksSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksStackCustomCookbooksSource {
        private final java.lang.String type;
        private final java.lang.String url;
        private final java.lang.String password;
        private final java.lang.String revision;
        private final java.lang.String sshKey;
        private final java.lang.String username;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.url = software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.revision = software.amazon.jsii.Kernel.get(this, "revision", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sshKey = software.amazon.jsii.Kernel.get(this, "sshKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String type, final java.lang.String url, final java.lang.String password, final java.lang.String revision, final java.lang.String sshKey, final java.lang.String username) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.url = java.util.Objects.requireNonNull(url, "url is required");
            this.password = password;
            this.revision = revision;
            this.sshKey = sshKey;
            this.username = username;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.String getRevision() {
            return this.revision;
        }

        @Override
        public final java.lang.String getSshKey() {
            return this.sshKey;
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

            data.set("type", om.valueToTree(this.getType()));
            data.set("url", om.valueToTree(this.getUrl()));
            if (this.getPassword() != null) {
                data.set("password", om.valueToTree(this.getPassword()));
            }
            if (this.getRevision() != null) {
                data.set("revision", om.valueToTree(this.getRevision()));
            }
            if (this.getSshKey() != null) {
                data.set("sshKey", om.valueToTree(this.getSshKey()));
            }
            if (this.getUsername() != null) {
                data.set("username", om.valueToTree(this.getUsername()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.OpsworksStackCustomCookbooksSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksStackCustomCookbooksSource.Jsii$Proxy that = (OpsworksStackCustomCookbooksSource.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (!url.equals(that.url)) return false;
            if (this.password != null ? !this.password.equals(that.password) : that.password != null) return false;
            if (this.revision != null ? !this.revision.equals(that.revision) : that.revision != null) return false;
            if (this.sshKey != null ? !this.sshKey.equals(that.sshKey) : that.sshKey != null) return false;
            return this.username != null ? this.username.equals(that.username) : that.username == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.url.hashCode());
            result = 31 * result + (this.password != null ? this.password.hashCode() : 0);
            result = 31 * result + (this.revision != null ? this.revision.hashCode() : 0);
            result = 31 * result + (this.sshKey != null ? this.sshKey.hashCode() : 0);
            result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
            return result;
        }
    }
}
