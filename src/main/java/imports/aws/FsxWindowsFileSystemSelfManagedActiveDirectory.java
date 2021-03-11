package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.580Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.FsxWindowsFileSystemSelfManagedActiveDirectory")
@software.amazon.jsii.Jsii.Proxy(FsxWindowsFileSystemSelfManagedActiveDirectory.Jsii$Proxy.class)
public interface FsxWindowsFileSystemSelfManagedActiveDirectory extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDnsIps();

    @org.jetbrains.annotations.NotNull java.lang.String getDomainName();

    @org.jetbrains.annotations.NotNull java.lang.String getPassword();

    @org.jetbrains.annotations.NotNull java.lang.String getUsername();

    default @org.jetbrains.annotations.Nullable java.lang.String getFileSystemAdministratorsGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOrganizationalUnitDistinguishedName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FsxWindowsFileSystemSelfManagedActiveDirectory}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FsxWindowsFileSystemSelfManagedActiveDirectory}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FsxWindowsFileSystemSelfManagedActiveDirectory> {
        private java.util.List<java.lang.String> dnsIps;
        private java.lang.String domainName;
        private java.lang.String password;
        private java.lang.String username;
        private java.lang.String fileSystemAdministratorsGroup;
        private java.lang.String organizationalUnitDistinguishedName;

        /**
         * Sets the value of {@link FsxWindowsFileSystemSelfManagedActiveDirectory#getDnsIps}
         * @param dnsIps the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder dnsIps(java.util.List<java.lang.String> dnsIps) {
            this.dnsIps = dnsIps;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemSelfManagedActiveDirectory#getDomainName}
         * @param domainName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemSelfManagedActiveDirectory#getPassword}
         * @param password the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemSelfManagedActiveDirectory#getUsername}
         * @param username the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemSelfManagedActiveDirectory#getFileSystemAdministratorsGroup}
         * @param fileSystemAdministratorsGroup the value to be set.
         * @return {@code this}
         */
        public Builder fileSystemAdministratorsGroup(java.lang.String fileSystemAdministratorsGroup) {
            this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            return this;
        }

        /**
         * Sets the value of {@link FsxWindowsFileSystemSelfManagedActiveDirectory#getOrganizationalUnitDistinguishedName}
         * @param organizationalUnitDistinguishedName the value to be set.
         * @return {@code this}
         */
        public Builder organizationalUnitDistinguishedName(java.lang.String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FsxWindowsFileSystemSelfManagedActiveDirectory}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FsxWindowsFileSystemSelfManagedActiveDirectory build() {
            return new Jsii$Proxy(dnsIps, domainName, password, username, fileSystemAdministratorsGroup, organizationalUnitDistinguishedName);
        }
    }

    /**
     * An implementation for {@link FsxWindowsFileSystemSelfManagedActiveDirectory}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FsxWindowsFileSystemSelfManagedActiveDirectory {
        private final java.util.List<java.lang.String> dnsIps;
        private final java.lang.String domainName;
        private final java.lang.String password;
        private final java.lang.String username;
        private final java.lang.String fileSystemAdministratorsGroup;
        private final java.lang.String organizationalUnitDistinguishedName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dnsIps = software.amazon.jsii.Kernel.get(this, "dnsIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fileSystemAdministratorsGroup = software.amazon.jsii.Kernel.get(this, "fileSystemAdministratorsGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.organizationalUnitDistinguishedName = software.amazon.jsii.Kernel.get(this, "organizationalUnitDistinguishedName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> dnsIps, final java.lang.String domainName, final java.lang.String password, final java.lang.String username, final java.lang.String fileSystemAdministratorsGroup, final java.lang.String organizationalUnitDistinguishedName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dnsIps = java.util.Objects.requireNonNull(dnsIps, "dnsIps is required");
            this.domainName = java.util.Objects.requireNonNull(domainName, "domainName is required");
            this.password = java.util.Objects.requireNonNull(password, "password is required");
            this.username = java.util.Objects.requireNonNull(username, "username is required");
            this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        }

        @Override
        public final java.util.List<java.lang.String> getDnsIps() {
            return this.dnsIps;
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
        public final java.lang.String getFileSystemAdministratorsGroup() {
            return this.fileSystemAdministratorsGroup;
        }

        @Override
        public final java.lang.String getOrganizationalUnitDistinguishedName() {
            return this.organizationalUnitDistinguishedName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("dnsIps", om.valueToTree(this.getDnsIps()));
            data.set("domainName", om.valueToTree(this.getDomainName()));
            data.set("password", om.valueToTree(this.getPassword()));
            data.set("username", om.valueToTree(this.getUsername()));
            if (this.getFileSystemAdministratorsGroup() != null) {
                data.set("fileSystemAdministratorsGroup", om.valueToTree(this.getFileSystemAdministratorsGroup()));
            }
            if (this.getOrganizationalUnitDistinguishedName() != null) {
                data.set("organizationalUnitDistinguishedName", om.valueToTree(this.getOrganizationalUnitDistinguishedName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.FsxWindowsFileSystemSelfManagedActiveDirectory"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FsxWindowsFileSystemSelfManagedActiveDirectory.Jsii$Proxy that = (FsxWindowsFileSystemSelfManagedActiveDirectory.Jsii$Proxy) o;

            if (!dnsIps.equals(that.dnsIps)) return false;
            if (!domainName.equals(that.domainName)) return false;
            if (!password.equals(that.password)) return false;
            if (!username.equals(that.username)) return false;
            if (this.fileSystemAdministratorsGroup != null ? !this.fileSystemAdministratorsGroup.equals(that.fileSystemAdministratorsGroup) : that.fileSystemAdministratorsGroup != null) return false;
            return this.organizationalUnitDistinguishedName != null ? this.organizationalUnitDistinguishedName.equals(that.organizationalUnitDistinguishedName) : that.organizationalUnitDistinguishedName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dnsIps.hashCode();
            result = 31 * result + (this.domainName.hashCode());
            result = 31 * result + (this.password.hashCode());
            result = 31 * result + (this.username.hashCode());
            result = 31 * result + (this.fileSystemAdministratorsGroup != null ? this.fileSystemAdministratorsGroup.hashCode() : 0);
            result = 31 * result + (this.organizationalUnitDistinguishedName != null ? this.organizationalUnitDistinguishedName.hashCode() : 0);
            return result;
        }
    }
}
