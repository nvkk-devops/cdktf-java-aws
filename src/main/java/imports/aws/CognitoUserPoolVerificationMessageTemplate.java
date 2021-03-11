package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.200Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolVerificationMessageTemplate")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolVerificationMessageTemplate.Jsii$Proxy.class)
public interface CognitoUserPoolVerificationMessageTemplate extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultEmailOption() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailMessage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailMessageByLink() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailSubject() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailSubjectByLink() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSmsMessage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolVerificationMessageTemplate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolVerificationMessageTemplate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolVerificationMessageTemplate> {
        private java.lang.String defaultEmailOption;
        private java.lang.String emailMessage;
        private java.lang.String emailMessageByLink;
        private java.lang.String emailSubject;
        private java.lang.String emailSubjectByLink;
        private java.lang.String smsMessage;

        /**
         * Sets the value of {@link CognitoUserPoolVerificationMessageTemplate#getDefaultEmailOption}
         * @param defaultEmailOption the value to be set.
         * @return {@code this}
         */
        public Builder defaultEmailOption(java.lang.String defaultEmailOption) {
            this.defaultEmailOption = defaultEmailOption;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolVerificationMessageTemplate#getEmailMessage}
         * @param emailMessage the value to be set.
         * @return {@code this}
         */
        public Builder emailMessage(java.lang.String emailMessage) {
            this.emailMessage = emailMessage;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolVerificationMessageTemplate#getEmailMessageByLink}
         * @param emailMessageByLink the value to be set.
         * @return {@code this}
         */
        public Builder emailMessageByLink(java.lang.String emailMessageByLink) {
            this.emailMessageByLink = emailMessageByLink;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolVerificationMessageTemplate#getEmailSubject}
         * @param emailSubject the value to be set.
         * @return {@code this}
         */
        public Builder emailSubject(java.lang.String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolVerificationMessageTemplate#getEmailSubjectByLink}
         * @param emailSubjectByLink the value to be set.
         * @return {@code this}
         */
        public Builder emailSubjectByLink(java.lang.String emailSubjectByLink) {
            this.emailSubjectByLink = emailSubjectByLink;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolVerificationMessageTemplate#getSmsMessage}
         * @param smsMessage the value to be set.
         * @return {@code this}
         */
        public Builder smsMessage(java.lang.String smsMessage) {
            this.smsMessage = smsMessage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolVerificationMessageTemplate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolVerificationMessageTemplate build() {
            return new Jsii$Proxy(defaultEmailOption, emailMessage, emailMessageByLink, emailSubject, emailSubjectByLink, smsMessage);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolVerificationMessageTemplate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolVerificationMessageTemplate {
        private final java.lang.String defaultEmailOption;
        private final java.lang.String emailMessage;
        private final java.lang.String emailMessageByLink;
        private final java.lang.String emailSubject;
        private final java.lang.String emailSubjectByLink;
        private final java.lang.String smsMessage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultEmailOption = software.amazon.jsii.Kernel.get(this, "defaultEmailOption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailMessage = software.amazon.jsii.Kernel.get(this, "emailMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailMessageByLink = software.amazon.jsii.Kernel.get(this, "emailMessageByLink", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailSubject = software.amazon.jsii.Kernel.get(this, "emailSubject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailSubjectByLink = software.amazon.jsii.Kernel.get(this, "emailSubjectByLink", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.smsMessage = software.amazon.jsii.Kernel.get(this, "smsMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String defaultEmailOption, final java.lang.String emailMessage, final java.lang.String emailMessageByLink, final java.lang.String emailSubject, final java.lang.String emailSubjectByLink, final java.lang.String smsMessage) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultEmailOption = defaultEmailOption;
            this.emailMessage = emailMessage;
            this.emailMessageByLink = emailMessageByLink;
            this.emailSubject = emailSubject;
            this.emailSubjectByLink = emailSubjectByLink;
            this.smsMessage = smsMessage;
        }

        @Override
        public final java.lang.String getDefaultEmailOption() {
            return this.defaultEmailOption;
        }

        @Override
        public final java.lang.String getEmailMessage() {
            return this.emailMessage;
        }

        @Override
        public final java.lang.String getEmailMessageByLink() {
            return this.emailMessageByLink;
        }

        @Override
        public final java.lang.String getEmailSubject() {
            return this.emailSubject;
        }

        @Override
        public final java.lang.String getEmailSubjectByLink() {
            return this.emailSubjectByLink;
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

            if (this.getDefaultEmailOption() != null) {
                data.set("defaultEmailOption", om.valueToTree(this.getDefaultEmailOption()));
            }
            if (this.getEmailMessage() != null) {
                data.set("emailMessage", om.valueToTree(this.getEmailMessage()));
            }
            if (this.getEmailMessageByLink() != null) {
                data.set("emailMessageByLink", om.valueToTree(this.getEmailMessageByLink()));
            }
            if (this.getEmailSubject() != null) {
                data.set("emailSubject", om.valueToTree(this.getEmailSubject()));
            }
            if (this.getEmailSubjectByLink() != null) {
                data.set("emailSubjectByLink", om.valueToTree(this.getEmailSubjectByLink()));
            }
            if (this.getSmsMessage() != null) {
                data.set("smsMessage", om.valueToTree(this.getSmsMessage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolVerificationMessageTemplate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolVerificationMessageTemplate.Jsii$Proxy that = (CognitoUserPoolVerificationMessageTemplate.Jsii$Proxy) o;

            if (this.defaultEmailOption != null ? !this.defaultEmailOption.equals(that.defaultEmailOption) : that.defaultEmailOption != null) return false;
            if (this.emailMessage != null ? !this.emailMessage.equals(that.emailMessage) : that.emailMessage != null) return false;
            if (this.emailMessageByLink != null ? !this.emailMessageByLink.equals(that.emailMessageByLink) : that.emailMessageByLink != null) return false;
            if (this.emailSubject != null ? !this.emailSubject.equals(that.emailSubject) : that.emailSubject != null) return false;
            if (this.emailSubjectByLink != null ? !this.emailSubjectByLink.equals(that.emailSubjectByLink) : that.emailSubjectByLink != null) return false;
            return this.smsMessage != null ? this.smsMessage.equals(that.smsMessage) : that.smsMessage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultEmailOption != null ? this.defaultEmailOption.hashCode() : 0;
            result = 31 * result + (this.emailMessage != null ? this.emailMessage.hashCode() : 0);
            result = 31 * result + (this.emailMessageByLink != null ? this.emailMessageByLink.hashCode() : 0);
            result = 31 * result + (this.emailSubject != null ? this.emailSubject.hashCode() : 0);
            result = 31 * result + (this.emailSubjectByLink != null ? this.emailSubjectByLink.hashCode() : 0);
            result = 31 * result + (this.smsMessage != null ? this.smsMessage.hashCode() : 0);
            return result;
        }
    }
}
