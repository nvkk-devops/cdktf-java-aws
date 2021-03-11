package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.608Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GuarddutyMemberConfig")
@software.amazon.jsii.Jsii.Proxy(GuarddutyMemberConfig.Jsii$Proxy.class)
public interface GuarddutyMemberConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAccountId();

    @org.jetbrains.annotations.NotNull java.lang.String getDetectorId();

    @org.jetbrains.annotations.NotNull java.lang.String getEmail();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableEmailNotification() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInvitationMessage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInvite() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.GuarddutyMemberTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GuarddutyMemberConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GuarddutyMemberConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GuarddutyMemberConfig> {
        private java.lang.String accountId;
        private java.lang.String detectorId;
        private java.lang.String email;
        private java.lang.Boolean disableEmailNotification;
        private java.lang.String invitationMessage;
        private java.lang.Boolean invite;
        private imports.aws.GuarddutyMemberTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getAccountId}
         * @param accountId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder accountId(java.lang.String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getDetectorId}
         * @param detectorId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder detectorId(java.lang.String detectorId) {
            this.detectorId = detectorId;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getEmail}
         * @param email the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder email(java.lang.String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getDisableEmailNotification}
         * @param disableEmailNotification the value to be set.
         * @return {@code this}
         */
        public Builder disableEmailNotification(java.lang.Boolean disableEmailNotification) {
            this.disableEmailNotification = disableEmailNotification;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getInvitationMessage}
         * @param invitationMessage the value to be set.
         * @return {@code this}
         */
        public Builder invitationMessage(java.lang.String invitationMessage) {
            this.invitationMessage = invitationMessage;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getInvite}
         * @param invite the value to be set.
         * @return {@code this}
         */
        public Builder invite(java.lang.Boolean invite) {
            this.invite = invite;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.GuarddutyMemberTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getDependsOn}
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
         * Sets the value of {@link GuarddutyMemberConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GuarddutyMemberConfig#getProvider}
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
         * @return a new instance of {@link GuarddutyMemberConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GuarddutyMemberConfig build() {
            return new Jsii$Proxy(accountId, detectorId, email, disableEmailNotification, invitationMessage, invite, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GuarddutyMemberConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GuarddutyMemberConfig {
        private final java.lang.String accountId;
        private final java.lang.String detectorId;
        private final java.lang.String email;
        private final java.lang.Boolean disableEmailNotification;
        private final java.lang.String invitationMessage;
        private final java.lang.Boolean invite;
        private final imports.aws.GuarddutyMemberTimeouts timeouts;
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
            this.accountId = software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.detectorId = software.amazon.jsii.Kernel.get(this, "detectorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.email = software.amazon.jsii.Kernel.get(this, "email", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.disableEmailNotification = software.amazon.jsii.Kernel.get(this, "disableEmailNotification", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.invitationMessage = software.amazon.jsii.Kernel.get(this, "invitationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.invite = software.amazon.jsii.Kernel.get(this, "invite", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.GuarddutyMemberTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String accountId, final java.lang.String detectorId, final java.lang.String email, final java.lang.Boolean disableEmailNotification, final java.lang.String invitationMessage, final java.lang.Boolean invite, final imports.aws.GuarddutyMemberTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accountId = java.util.Objects.requireNonNull(accountId, "accountId is required");
            this.detectorId = java.util.Objects.requireNonNull(detectorId, "detectorId is required");
            this.email = java.util.Objects.requireNonNull(email, "email is required");
            this.disableEmailNotification = disableEmailNotification;
            this.invitationMessage = invitationMessage;
            this.invite = invite;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        @Override
        public final java.lang.String getDetectorId() {
            return this.detectorId;
        }

        @Override
        public final java.lang.String getEmail() {
            return this.email;
        }

        @Override
        public final java.lang.Boolean getDisableEmailNotification() {
            return this.disableEmailNotification;
        }

        @Override
        public final java.lang.String getInvitationMessage() {
            return this.invitationMessage;
        }

        @Override
        public final java.lang.Boolean getInvite() {
            return this.invite;
        }

        @Override
        public final imports.aws.GuarddutyMemberTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("accountId", om.valueToTree(this.getAccountId()));
            data.set("detectorId", om.valueToTree(this.getDetectorId()));
            data.set("email", om.valueToTree(this.getEmail()));
            if (this.getDisableEmailNotification() != null) {
                data.set("disableEmailNotification", om.valueToTree(this.getDisableEmailNotification()));
            }
            if (this.getInvitationMessage() != null) {
                data.set("invitationMessage", om.valueToTree(this.getInvitationMessage()));
            }
            if (this.getInvite() != null) {
                data.set("invite", om.valueToTree(this.getInvite()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
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
            struct.set("fqn", om.valueToTree("aws.GuarddutyMemberConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GuarddutyMemberConfig.Jsii$Proxy that = (GuarddutyMemberConfig.Jsii$Proxy) o;

            if (!accountId.equals(that.accountId)) return false;
            if (!detectorId.equals(that.detectorId)) return false;
            if (!email.equals(that.email)) return false;
            if (this.disableEmailNotification != null ? !this.disableEmailNotification.equals(that.disableEmailNotification) : that.disableEmailNotification != null) return false;
            if (this.invitationMessage != null ? !this.invitationMessage.equals(that.invitationMessage) : that.invitationMessage != null) return false;
            if (this.invite != null ? !this.invite.equals(that.invite) : that.invite != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accountId.hashCode();
            result = 31 * result + (this.detectorId.hashCode());
            result = 31 * result + (this.email.hashCode());
            result = 31 * result + (this.disableEmailNotification != null ? this.disableEmailNotification.hashCode() : 0);
            result = 31 * result + (this.invitationMessage != null ? this.invitationMessage.hashCode() : 0);
            result = 31 * result + (this.invite != null ? this.invite.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
