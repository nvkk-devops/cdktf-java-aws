package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.573Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EmrClusterKerberosAttributes")
@software.amazon.jsii.Jsii.Proxy(EmrClusterKerberosAttributes.Jsii$Proxy.class)
public interface EmrClusterKerberosAttributes extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getKdcAdminPassword();

    @org.jetbrains.annotations.NotNull java.lang.String getRealm();

    default @org.jetbrains.annotations.Nullable java.lang.String getAdDomainJoinPassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAdDomainJoinUser() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCrossRealmTrustPrincipalPassword() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrClusterKerberosAttributes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrClusterKerberosAttributes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrClusterKerberosAttributes> {
        private java.lang.String kdcAdminPassword;
        private java.lang.String realm;
        private java.lang.String adDomainJoinPassword;
        private java.lang.String adDomainJoinUser;
        private java.lang.String crossRealmTrustPrincipalPassword;

        /**
         * Sets the value of {@link EmrClusterKerberosAttributes#getKdcAdminPassword}
         * @param kdcAdminPassword the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder kdcAdminPassword(java.lang.String kdcAdminPassword) {
            this.kdcAdminPassword = kdcAdminPassword;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterKerberosAttributes#getRealm}
         * @param realm the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder realm(java.lang.String realm) {
            this.realm = realm;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterKerberosAttributes#getAdDomainJoinPassword}
         * @param adDomainJoinPassword the value to be set.
         * @return {@code this}
         */
        public Builder adDomainJoinPassword(java.lang.String adDomainJoinPassword) {
            this.adDomainJoinPassword = adDomainJoinPassword;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterKerberosAttributes#getAdDomainJoinUser}
         * @param adDomainJoinUser the value to be set.
         * @return {@code this}
         */
        public Builder adDomainJoinUser(java.lang.String adDomainJoinUser) {
            this.adDomainJoinUser = adDomainJoinUser;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterKerberosAttributes#getCrossRealmTrustPrincipalPassword}
         * @param crossRealmTrustPrincipalPassword the value to be set.
         * @return {@code this}
         */
        public Builder crossRealmTrustPrincipalPassword(java.lang.String crossRealmTrustPrincipalPassword) {
            this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrClusterKerberosAttributes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrClusterKerberosAttributes build() {
            return new Jsii$Proxy(kdcAdminPassword, realm, adDomainJoinPassword, adDomainJoinUser, crossRealmTrustPrincipalPassword);
        }
    }

    /**
     * An implementation for {@link EmrClusterKerberosAttributes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrClusterKerberosAttributes {
        private final java.lang.String kdcAdminPassword;
        private final java.lang.String realm;
        private final java.lang.String adDomainJoinPassword;
        private final java.lang.String adDomainJoinUser;
        private final java.lang.String crossRealmTrustPrincipalPassword;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kdcAdminPassword = software.amazon.jsii.Kernel.get(this, "kdcAdminPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.realm = software.amazon.jsii.Kernel.get(this, "realm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.adDomainJoinPassword = software.amazon.jsii.Kernel.get(this, "adDomainJoinPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.adDomainJoinUser = software.amazon.jsii.Kernel.get(this, "adDomainJoinUser", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.crossRealmTrustPrincipalPassword = software.amazon.jsii.Kernel.get(this, "crossRealmTrustPrincipalPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String kdcAdminPassword, final java.lang.String realm, final java.lang.String adDomainJoinPassword, final java.lang.String adDomainJoinUser, final java.lang.String crossRealmTrustPrincipalPassword) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kdcAdminPassword = java.util.Objects.requireNonNull(kdcAdminPassword, "kdcAdminPassword is required");
            this.realm = java.util.Objects.requireNonNull(realm, "realm is required");
            this.adDomainJoinPassword = adDomainJoinPassword;
            this.adDomainJoinUser = adDomainJoinUser;
            this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
        }

        @Override
        public final java.lang.String getKdcAdminPassword() {
            return this.kdcAdminPassword;
        }

        @Override
        public final java.lang.String getRealm() {
            return this.realm;
        }

        @Override
        public final java.lang.String getAdDomainJoinPassword() {
            return this.adDomainJoinPassword;
        }

        @Override
        public final java.lang.String getAdDomainJoinUser() {
            return this.adDomainJoinUser;
        }

        @Override
        public final java.lang.String getCrossRealmTrustPrincipalPassword() {
            return this.crossRealmTrustPrincipalPassword;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("kdcAdminPassword", om.valueToTree(this.getKdcAdminPassword()));
            data.set("realm", om.valueToTree(this.getRealm()));
            if (this.getAdDomainJoinPassword() != null) {
                data.set("adDomainJoinPassword", om.valueToTree(this.getAdDomainJoinPassword()));
            }
            if (this.getAdDomainJoinUser() != null) {
                data.set("adDomainJoinUser", om.valueToTree(this.getAdDomainJoinUser()));
            }
            if (this.getCrossRealmTrustPrincipalPassword() != null) {
                data.set("crossRealmTrustPrincipalPassword", om.valueToTree(this.getCrossRealmTrustPrincipalPassword()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EmrClusterKerberosAttributes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrClusterKerberosAttributes.Jsii$Proxy that = (EmrClusterKerberosAttributes.Jsii$Proxy) o;

            if (!kdcAdminPassword.equals(that.kdcAdminPassword)) return false;
            if (!realm.equals(that.realm)) return false;
            if (this.adDomainJoinPassword != null ? !this.adDomainJoinPassword.equals(that.adDomainJoinPassword) : that.adDomainJoinPassword != null) return false;
            if (this.adDomainJoinUser != null ? !this.adDomainJoinUser.equals(that.adDomainJoinUser) : that.adDomainJoinUser != null) return false;
            return this.crossRealmTrustPrincipalPassword != null ? this.crossRealmTrustPrincipalPassword.equals(that.crossRealmTrustPrincipalPassword) : that.crossRealmTrustPrincipalPassword == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kdcAdminPassword.hashCode();
            result = 31 * result + (this.realm.hashCode());
            result = 31 * result + (this.adDomainJoinPassword != null ? this.adDomainJoinPassword.hashCode() : 0);
            result = 31 * result + (this.adDomainJoinUser != null ? this.adDomainJoinUser.hashCode() : 0);
            result = 31 * result + (this.crossRealmTrustPrincipalPassword != null ? this.crossRealmTrustPrincipalPassword.hashCode() : 0);
            return result;
        }
    }
}
