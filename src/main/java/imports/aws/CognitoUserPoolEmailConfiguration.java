package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.199Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolEmailConfiguration")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolEmailConfiguration.Jsii$Proxy.class)
public interface CognitoUserPoolEmailConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getEmailSendingAccount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFromEmailAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReplyToEmailAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolEmailConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolEmailConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolEmailConfiguration> {
        private java.lang.String emailSendingAccount;
        private java.lang.String fromEmailAddress;
        private java.lang.String replyToEmailAddress;
        private java.lang.String sourceArn;

        /**
         * Sets the value of {@link CognitoUserPoolEmailConfiguration#getEmailSendingAccount}
         * @param emailSendingAccount the value to be set.
         * @return {@code this}
         */
        public Builder emailSendingAccount(java.lang.String emailSendingAccount) {
            this.emailSendingAccount = emailSendingAccount;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolEmailConfiguration#getFromEmailAddress}
         * @param fromEmailAddress the value to be set.
         * @return {@code this}
         */
        public Builder fromEmailAddress(java.lang.String fromEmailAddress) {
            this.fromEmailAddress = fromEmailAddress;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolEmailConfiguration#getReplyToEmailAddress}
         * @param replyToEmailAddress the value to be set.
         * @return {@code this}
         */
        public Builder replyToEmailAddress(java.lang.String replyToEmailAddress) {
            this.replyToEmailAddress = replyToEmailAddress;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolEmailConfiguration#getSourceArn}
         * @param sourceArn the value to be set.
         * @return {@code this}
         */
        public Builder sourceArn(java.lang.String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolEmailConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolEmailConfiguration build() {
            return new Jsii$Proxy(emailSendingAccount, fromEmailAddress, replyToEmailAddress, sourceArn);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolEmailConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolEmailConfiguration {
        private final java.lang.String emailSendingAccount;
        private final java.lang.String fromEmailAddress;
        private final java.lang.String replyToEmailAddress;
        private final java.lang.String sourceArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.emailSendingAccount = software.amazon.jsii.Kernel.get(this, "emailSendingAccount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fromEmailAddress = software.amazon.jsii.Kernel.get(this, "fromEmailAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replyToEmailAddress = software.amazon.jsii.Kernel.get(this, "replyToEmailAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceArn = software.amazon.jsii.Kernel.get(this, "sourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String emailSendingAccount, final java.lang.String fromEmailAddress, final java.lang.String replyToEmailAddress, final java.lang.String sourceArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.emailSendingAccount = emailSendingAccount;
            this.fromEmailAddress = fromEmailAddress;
            this.replyToEmailAddress = replyToEmailAddress;
            this.sourceArn = sourceArn;
        }

        @Override
        public final java.lang.String getEmailSendingAccount() {
            return this.emailSendingAccount;
        }

        @Override
        public final java.lang.String getFromEmailAddress() {
            return this.fromEmailAddress;
        }

        @Override
        public final java.lang.String getReplyToEmailAddress() {
            return this.replyToEmailAddress;
        }

        @Override
        public final java.lang.String getSourceArn() {
            return this.sourceArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEmailSendingAccount() != null) {
                data.set("emailSendingAccount", om.valueToTree(this.getEmailSendingAccount()));
            }
            if (this.getFromEmailAddress() != null) {
                data.set("fromEmailAddress", om.valueToTree(this.getFromEmailAddress()));
            }
            if (this.getReplyToEmailAddress() != null) {
                data.set("replyToEmailAddress", om.valueToTree(this.getReplyToEmailAddress()));
            }
            if (this.getSourceArn() != null) {
                data.set("sourceArn", om.valueToTree(this.getSourceArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolEmailConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolEmailConfiguration.Jsii$Proxy that = (CognitoUserPoolEmailConfiguration.Jsii$Proxy) o;

            if (this.emailSendingAccount != null ? !this.emailSendingAccount.equals(that.emailSendingAccount) : that.emailSendingAccount != null) return false;
            if (this.fromEmailAddress != null ? !this.fromEmailAddress.equals(that.fromEmailAddress) : that.fromEmailAddress != null) return false;
            if (this.replyToEmailAddress != null ? !this.replyToEmailAddress.equals(that.replyToEmailAddress) : that.replyToEmailAddress != null) return false;
            return this.sourceArn != null ? this.sourceArn.equals(that.sourceArn) : that.sourceArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.emailSendingAccount != null ? this.emailSendingAccount.hashCode() : 0;
            result = 31 * result + (this.fromEmailAddress != null ? this.fromEmailAddress.hashCode() : 0);
            result = 31 * result + (this.replyToEmailAddress != null ? this.replyToEmailAddress.hashCode() : 0);
            result = 31 * result + (this.sourceArn != null ? this.sourceArn.hashCode() : 0);
            return result;
        }
    }
}
