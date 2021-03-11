package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.789Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.QuicksightUserConfig")
@software.amazon.jsii.Jsii.Proxy(QuicksightUserConfig.Jsii$Proxy.class)
public interface QuicksightUserConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getEmail();

    @org.jetbrains.annotations.NotNull java.lang.String getIdentityType();

    @org.jetbrains.annotations.NotNull java.lang.String getUserRole();

    default @org.jetbrains.annotations.Nullable java.lang.String getAwsAccountId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIamArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSessionName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link QuicksightUserConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link QuicksightUserConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<QuicksightUserConfig> {
        private java.lang.String email;
        private java.lang.String identityType;
        private java.lang.String userRole;
        private java.lang.String awsAccountId;
        private java.lang.String iamArn;
        private java.lang.String namespace;
        private java.lang.String sessionName;
        private java.lang.String userName;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link QuicksightUserConfig#getEmail}
         * @param email the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder email(java.lang.String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getIdentityType}
         * @param identityType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder identityType(java.lang.String identityType) {
            this.identityType = identityType;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getUserRole}
         * @param userRole the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userRole(java.lang.String userRole) {
            this.userRole = userRole;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getAwsAccountId}
         * @param awsAccountId the value to be set.
         * @return {@code this}
         */
        public Builder awsAccountId(java.lang.String awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getIamArn}
         * @param iamArn the value to be set.
         * @return {@code this}
         */
        public Builder iamArn(java.lang.String iamArn) {
            this.iamArn = iamArn;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getNamespace}
         * @param namespace the value to be set.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getSessionName}
         * @param sessionName the value to be set.
         * @return {@code this}
         */
        public Builder sessionName(java.lang.String sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getUserName}
         * @param userName the value to be set.
         * @return {@code this}
         */
        public Builder userName(java.lang.String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightUserConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link QuicksightUserConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public QuicksightUserConfig build() {
            return new Jsii$Proxy(email, identityType, userRole, awsAccountId, iamArn, namespace, sessionName, userName, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link QuicksightUserConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements QuicksightUserConfig {
        private final java.lang.String email;
        private final java.lang.String identityType;
        private final java.lang.String userRole;
        private final java.lang.String awsAccountId;
        private final java.lang.String iamArn;
        private final java.lang.String namespace;
        private final java.lang.String sessionName;
        private final java.lang.String userName;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.email = software.amazon.jsii.Kernel.get(this, "email", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identityType = software.amazon.jsii.Kernel.get(this, "identityType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userRole = software.amazon.jsii.Kernel.get(this, "userRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.awsAccountId = software.amazon.jsii.Kernel.get(this, "awsAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamArn = software.amazon.jsii.Kernel.get(this, "iamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionName = software.amazon.jsii.Kernel.get(this, "sessionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userName = software.amazon.jsii.Kernel.get(this, "userName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String email, final java.lang.String identityType, final java.lang.String userRole, final java.lang.String awsAccountId, final java.lang.String iamArn, final java.lang.String namespace, final java.lang.String sessionName, final java.lang.String userName, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.email = java.util.Objects.requireNonNull(email, "email is required");
            this.identityType = java.util.Objects.requireNonNull(identityType, "identityType is required");
            this.userRole = java.util.Objects.requireNonNull(userRole, "userRole is required");
            this.awsAccountId = awsAccountId;
            this.iamArn = iamArn;
            this.namespace = namespace;
            this.sessionName = sessionName;
            this.userName = userName;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getEmail() {
            return this.email;
        }

        @Override
        public final java.lang.String getIdentityType() {
            return this.identityType;
        }

        @Override
        public final java.lang.String getUserRole() {
            return this.userRole;
        }

        @Override
        public final java.lang.String getAwsAccountId() {
            return this.awsAccountId;
        }

        @Override
        public final java.lang.String getIamArn() {
            return this.iamArn;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getSessionName() {
            return this.sessionName;
        }

        @Override
        public final java.lang.String getUserName() {
            return this.userName;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("email", om.valueToTree(this.getEmail()));
            data.set("identityType", om.valueToTree(this.getIdentityType()));
            data.set("userRole", om.valueToTree(this.getUserRole()));
            if (this.getAwsAccountId() != null) {
                data.set("awsAccountId", om.valueToTree(this.getAwsAccountId()));
            }
            if (this.getIamArn() != null) {
                data.set("iamArn", om.valueToTree(this.getIamArn()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getSessionName() != null) {
                data.set("sessionName", om.valueToTree(this.getSessionName()));
            }
            if (this.getUserName() != null) {
                data.set("userName", om.valueToTree(this.getUserName()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.QuicksightUserConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            QuicksightUserConfig.Jsii$Proxy that = (QuicksightUserConfig.Jsii$Proxy) o;

            if (!email.equals(that.email)) return false;
            if (!identityType.equals(that.identityType)) return false;
            if (!userRole.equals(that.userRole)) return false;
            if (this.awsAccountId != null ? !this.awsAccountId.equals(that.awsAccountId) : that.awsAccountId != null) return false;
            if (this.iamArn != null ? !this.iamArn.equals(that.iamArn) : that.iamArn != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.sessionName != null ? !this.sessionName.equals(that.sessionName) : that.sessionName != null) return false;
            if (this.userName != null ? !this.userName.equals(that.userName) : that.userName != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.email.hashCode();
            result = 31 * result + (this.identityType.hashCode());
            result = 31 * result + (this.userRole.hashCode());
            result = 31 * result + (this.awsAccountId != null ? this.awsAccountId.hashCode() : 0);
            result = 31 * result + (this.iamArn != null ? this.iamArn.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.sessionName != null ? this.sessionName.hashCode() : 0);
            result = 31 * result + (this.userName != null ? this.userName.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
