package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.195Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate.Jsii$Proxy.class)
public interface CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailMessage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailSubject() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSmsMessage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate> {
        private java.lang.String emailMessage;
        private java.lang.String emailSubject;
        private java.lang.String smsMessage;

        /**
         * Sets the value of {@link CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate#getEmailMessage}
         * @param emailMessage the value to be set.
         * @return {@code this}
         */
        public Builder emailMessage(java.lang.String emailMessage) {
            this.emailMessage = emailMessage;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate#getEmailSubject}
         * @param emailSubject the value to be set.
         * @return {@code this}
         */
        public Builder emailSubject(java.lang.String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate#getSmsMessage}
         * @param smsMessage the value to be set.
         * @return {@code this}
         */
        public Builder smsMessage(java.lang.String smsMessage) {
            this.smsMessage = smsMessage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate build() {
            return new Jsii$Proxy(emailMessage, emailSubject, smsMessage);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate {
        private final java.lang.String emailMessage;
        private final java.lang.String emailSubject;
        private final java.lang.String smsMessage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.emailMessage = software.amazon.jsii.Kernel.get(this, "emailMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailSubject = software.amazon.jsii.Kernel.get(this, "emailSubject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.smsMessage = software.amazon.jsii.Kernel.get(this, "smsMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String emailMessage, final java.lang.String emailSubject, final java.lang.String smsMessage) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.emailMessage = emailMessage;
            this.emailSubject = emailSubject;
            this.smsMessage = smsMessage;
        }

        @Override
        public final java.lang.String getEmailMessage() {
            return this.emailMessage;
        }

        @Override
        public final java.lang.String getEmailSubject() {
            return this.emailSubject;
        }

        @Override
        public final java.lang.String getSmsMessage() {
            return this.smsMessage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEmailMessage() != null) {
                data.set("emailMessage", om.valueToTree(this.getEmailMessage()));
            }
            if (this.getEmailSubject() != null) {
                data.set("emailSubject", om.valueToTree(this.getEmailSubject()));
            }
            if (this.getSmsMessage() != null) {
                data.set("smsMessage", om.valueToTree(this.getSmsMessage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate.Jsii$Proxy that = (CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate.Jsii$Proxy) o;

            if (this.emailMessage != null ? !this.emailMessage.equals(that.emailMessage) : that.emailMessage != null) return false;
            if (this.emailSubject != null ? !this.emailSubject.equals(that.emailSubject) : that.emailSubject != null) return false;
            return this.smsMessage != null ? this.smsMessage.equals(that.smsMessage) : that.smsMessage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.emailMessage != null ? this.emailMessage.hashCode() : 0;
            result = 31 * result + (this.emailSubject != null ? this.emailSubject.hashCode() : 0);
            result = 31 * result + (this.smsMessage != null ? this.smsMessage.hashCode() : 0);
            return result;
        }
    }
}
