package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.196Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolClientAnalyticsConfiguration")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolClientAnalyticsConfiguration.Jsii$Proxy.class)
public interface CognitoUserPoolClientAnalyticsConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getApplicationId();

    @org.jetbrains.annotations.NotNull java.lang.String getExternalId();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUserDataShared() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolClientAnalyticsConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolClientAnalyticsConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolClientAnalyticsConfiguration> {
        private java.lang.String applicationId;
        private java.lang.String externalId;
        private java.lang.String roleArn;
        private java.lang.Boolean userDataShared;

        /**
         * Sets the value of {@link CognitoUserPoolClientAnalyticsConfiguration#getApplicationId}
         * @param applicationId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder applicationId(java.lang.String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientAnalyticsConfiguration#getExternalId}
         * @param externalId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder externalId(java.lang.String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientAnalyticsConfiguration#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientAnalyticsConfiguration#getUserDataShared}
         * @param userDataShared the value to be set.
         * @return {@code this}
         */
        public Builder userDataShared(java.lang.Boolean userDataShared) {
            this.userDataShared = userDataShared;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolClientAnalyticsConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolClientAnalyticsConfiguration build() {
            return new Jsii$Proxy(applicationId, externalId, roleArn, userDataShared);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolClientAnalyticsConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolClientAnalyticsConfiguration {
        private final java.lang.String applicationId;
        private final java.lang.String externalId;
        private final java.lang.String roleArn;
        private final java.lang.Boolean userDataShared;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.applicationId = software.amazon.jsii.Kernel.get(this, "applicationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.externalId = software.amazon.jsii.Kernel.get(this, "externalId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userDataShared = software.amazon.jsii.Kernel.get(this, "userDataShared", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String applicationId, final java.lang.String externalId, final java.lang.String roleArn, final java.lang.Boolean userDataShared) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.applicationId = java.util.Objects.requireNonNull(applicationId, "applicationId is required");
            this.externalId = java.util.Objects.requireNonNull(externalId, "externalId is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.userDataShared = userDataShared;
        }

        @Override
        public final java.lang.String getApplicationId() {
            return this.applicationId;
        }

        @Override
        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.Boolean getUserDataShared() {
            return this.userDataShared;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("applicationId", om.valueToTree(this.getApplicationId()));
            data.set("externalId", om.valueToTree(this.getExternalId()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getUserDataShared() != null) {
                data.set("userDataShared", om.valueToTree(this.getUserDataShared()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolClientAnalyticsConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolClientAnalyticsConfiguration.Jsii$Proxy that = (CognitoUserPoolClientAnalyticsConfiguration.Jsii$Proxy) o;

            if (!applicationId.equals(that.applicationId)) return false;
            if (!externalId.equals(that.externalId)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            return this.userDataShared != null ? this.userDataShared.equals(that.userDataShared) : that.userDataShared == null;
        }

        @Override
        public final int hashCode() {
            int result = this.applicationId.hashCode();
            result = 31 * result + (this.externalId.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.userDataShared != null ? this.userDataShared.hashCode() : 0);
            return result;
        }
    }
}
