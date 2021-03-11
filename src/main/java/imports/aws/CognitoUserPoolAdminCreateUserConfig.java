package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.195Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolAdminCreateUserConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolAdminCreateUserConfig.Jsii$Proxy.class)
public interface CognitoUserPoolAdminCreateUserConfig extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowAdminCreateUserOnly() {
        return null;
    }

    /**
     * invite_message_template block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate> getInviteMessageTemplate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getUnusedAccountValidityDays() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolAdminCreateUserConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolAdminCreateUserConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolAdminCreateUserConfig> {
        private java.lang.Boolean allowAdminCreateUserOnly;
        private java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate> inviteMessageTemplate;
        private java.lang.Number unusedAccountValidityDays;

        /**
         * Sets the value of {@link CognitoUserPoolAdminCreateUserConfig#getAllowAdminCreateUserOnly}
         * @param allowAdminCreateUserOnly the value to be set.
         * @return {@code this}
         */
        public Builder allowAdminCreateUserOnly(java.lang.Boolean allowAdminCreateUserOnly) {
            this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolAdminCreateUserConfig#getInviteMessageTemplate}
         * @param inviteMessageTemplate invite_message_template block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder inviteMessageTemplate(java.util.List<? extends imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate> inviteMessageTemplate) {
            this.inviteMessageTemplate = (java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate>)inviteMessageTemplate;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolAdminCreateUserConfig#getUnusedAccountValidityDays}
         * @param unusedAccountValidityDays the value to be set.
         * @return {@code this}
         */
        public Builder unusedAccountValidityDays(java.lang.Number unusedAccountValidityDays) {
            this.unusedAccountValidityDays = unusedAccountValidityDays;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolAdminCreateUserConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolAdminCreateUserConfig build() {
            return new Jsii$Proxy(allowAdminCreateUserOnly, inviteMessageTemplate, unusedAccountValidityDays);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolAdminCreateUserConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolAdminCreateUserConfig {
        private final java.lang.Boolean allowAdminCreateUserOnly;
        private final java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate> inviteMessageTemplate;
        private final java.lang.Number unusedAccountValidityDays;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowAdminCreateUserOnly = software.amazon.jsii.Kernel.get(this, "allowAdminCreateUserOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.inviteMessageTemplate = software.amazon.jsii.Kernel.get(this, "inviteMessageTemplate", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate.class)));
            this.unusedAccountValidityDays = software.amazon.jsii.Kernel.get(this, "unusedAccountValidityDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean allowAdminCreateUserOnly, final java.util.List<? extends imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate> inviteMessageTemplate, final java.lang.Number unusedAccountValidityDays) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
            this.inviteMessageTemplate = (java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate>)inviteMessageTemplate;
            this.unusedAccountValidityDays = unusedAccountValidityDays;
        }

        @Override
        public final java.lang.Boolean getAllowAdminCreateUserOnly() {
            return this.allowAdminCreateUserOnly;
        }

        @Override
        public final java.util.List<imports.aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate> getInviteMessageTemplate() {
            return this.inviteMessageTemplate;
        }

        @Override
        public final java.lang.Number getUnusedAccountValidityDays() {
            return this.unusedAccountValidityDays;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowAdminCreateUserOnly() != null) {
                data.set("allowAdminCreateUserOnly", om.valueToTree(this.getAllowAdminCreateUserOnly()));
            }
            if (this.getInviteMessageTemplate() != null) {
                data.set("inviteMessageTemplate", om.valueToTree(this.getInviteMessageTemplate()));
            }
            if (this.getUnusedAccountValidityDays() != null) {
                data.set("unusedAccountValidityDays", om.valueToTree(this.getUnusedAccountValidityDays()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolAdminCreateUserConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolAdminCreateUserConfig.Jsii$Proxy that = (CognitoUserPoolAdminCreateUserConfig.Jsii$Proxy) o;

            if (this.allowAdminCreateUserOnly != null ? !this.allowAdminCreateUserOnly.equals(that.allowAdminCreateUserOnly) : that.allowAdminCreateUserOnly != null) return false;
            if (this.inviteMessageTemplate != null ? !this.inviteMessageTemplate.equals(that.inviteMessageTemplate) : that.inviteMessageTemplate != null) return false;
            return this.unusedAccountValidityDays != null ? this.unusedAccountValidityDays.equals(that.unusedAccountValidityDays) : that.unusedAccountValidityDays == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowAdminCreateUserOnly != null ? this.allowAdminCreateUserOnly.hashCode() : 0;
            result = 31 * result + (this.inviteMessageTemplate != null ? this.inviteMessageTemplate.hashCode() : 0);
            result = 31 * result + (this.unusedAccountValidityDays != null ? this.unusedAccountValidityDays.hashCode() : 0);
            return result;
        }
    }
}
