package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.553Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomainCognitoOptions")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainCognitoOptions.Jsii$Proxy.class)
public interface ElasticsearchDomainCognitoOptions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getIdentityPoolId();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getUserPoolId();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainCognitoOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainCognitoOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainCognitoOptions> {
        private java.lang.String identityPoolId;
        private java.lang.String roleArn;
        private java.lang.String userPoolId;
        private java.lang.Boolean enabled;

        /**
         * Sets the value of {@link ElasticsearchDomainCognitoOptions#getIdentityPoolId}
         * @param identityPoolId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder identityPoolId(java.lang.String identityPoolId) {
            this.identityPoolId = identityPoolId;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainCognitoOptions#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainCognitoOptions#getUserPoolId}
         * @param userPoolId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userPoolId(java.lang.String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainCognitoOptions#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchDomainCognitoOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainCognitoOptions build() {
            return new Jsii$Proxy(identityPoolId, roleArn, userPoolId, enabled);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainCognitoOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainCognitoOptions {
        private final java.lang.String identityPoolId;
        private final java.lang.String roleArn;
        private final java.lang.String userPoolId;
        private final java.lang.Boolean enabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.identityPoolId = software.amazon.jsii.Kernel.get(this, "identityPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userPoolId = software.amazon.jsii.Kernel.get(this, "userPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String identityPoolId, final java.lang.String roleArn, final java.lang.String userPoolId, final java.lang.Boolean enabled) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.identityPoolId = java.util.Objects.requireNonNull(identityPoolId, "identityPoolId is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.userPoolId = java.util.Objects.requireNonNull(userPoolId, "userPoolId is required");
            this.enabled = enabled;
        }

        @Override
        public final java.lang.String getIdentityPoolId() {
            return this.identityPoolId;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getUserPoolId() {
            return this.userPoolId;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("identityPoolId", om.valueToTree(this.getIdentityPoolId()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("userPoolId", om.valueToTree(this.getUserPoolId()));
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElasticsearchDomainCognitoOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainCognitoOptions.Jsii$Proxy that = (ElasticsearchDomainCognitoOptions.Jsii$Proxy) o;

            if (!identityPoolId.equals(that.identityPoolId)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (!userPoolId.equals(that.userPoolId)) return false;
            return this.enabled != null ? this.enabled.equals(that.enabled) : that.enabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.identityPoolId.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.userPoolId.hashCode());
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            return result;
        }
    }
}
