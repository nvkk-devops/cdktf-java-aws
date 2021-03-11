package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.045Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppsyncGraphqlApiAdditionalAuthenticationProvider")
@software.amazon.jsii.Jsii.Proxy(AppsyncGraphqlApiAdditionalAuthenticationProvider.Jsii$Proxy.class)
public interface AppsyncGraphqlApiAdditionalAuthenticationProvider extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType();

    /**
     * openid_connect_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig> getOpenidConnectConfig() {
        return null;
    }

    /**
     * user_pool_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig> getUserPoolConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncGraphqlApiAdditionalAuthenticationProvider}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncGraphqlApiAdditionalAuthenticationProvider}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncGraphqlApiAdditionalAuthenticationProvider> {
        private java.lang.String authenticationType;
        private java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig> openidConnectConfig;
        private java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig> userPoolConfig;

        /**
         * Sets the value of {@link AppsyncGraphqlApiAdditionalAuthenticationProvider#getAuthenticationType}
         * @param authenticationType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder authenticationType(java.lang.String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiAdditionalAuthenticationProvider#getOpenidConnectConfig}
         * @param openidConnectConfig openid_connect_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder openidConnectConfig(java.util.List<? extends imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig> openidConnectConfig) {
            this.openidConnectConfig = (java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig>)openidConnectConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiAdditionalAuthenticationProvider#getUserPoolConfig}
         * @param userPoolConfig user_pool_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder userPoolConfig(java.util.List<? extends imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig> userPoolConfig) {
            this.userPoolConfig = (java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig>)userPoolConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppsyncGraphqlApiAdditionalAuthenticationProvider}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncGraphqlApiAdditionalAuthenticationProvider build() {
            return new Jsii$Proxy(authenticationType, openidConnectConfig, userPoolConfig);
        }
    }

    /**
     * An implementation for {@link AppsyncGraphqlApiAdditionalAuthenticationProvider}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncGraphqlApiAdditionalAuthenticationProvider {
        private final java.lang.String authenticationType;
        private final java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig> openidConnectConfig;
        private final java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig> userPoolConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.authenticationType = software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.openidConnectConfig = software.amazon.jsii.Kernel.get(this, "openidConnectConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig.class)));
            this.userPoolConfig = software.amazon.jsii.Kernel.get(this, "userPoolConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String authenticationType, final java.util.List<? extends imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig> openidConnectConfig, final java.util.List<? extends imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig> userPoolConfig) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authenticationType = java.util.Objects.requireNonNull(authenticationType, "authenticationType is required");
            this.openidConnectConfig = (java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig>)openidConnectConfig;
            this.userPoolConfig = (java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig>)userPoolConfig;
        }

        @Override
        public final java.lang.String getAuthenticationType() {
            return this.authenticationType;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig> getOpenidConnectConfig() {
            return this.openidConnectConfig;
        }

        @Override
        public final java.util.List<imports.aws.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig> getUserPoolConfig() {
            return this.userPoolConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("authenticationType", om.valueToTree(this.getAuthenticationType()));
            if (this.getOpenidConnectConfig() != null) {
                data.set("openidConnectConfig", om.valueToTree(this.getOpenidConnectConfig()));
            }
            if (this.getUserPoolConfig() != null) {
                data.set("userPoolConfig", om.valueToTree(this.getUserPoolConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppsyncGraphqlApiAdditionalAuthenticationProvider"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncGraphqlApiAdditionalAuthenticationProvider.Jsii$Proxy that = (AppsyncGraphqlApiAdditionalAuthenticationProvider.Jsii$Proxy) o;

            if (!authenticationType.equals(that.authenticationType)) return false;
            if (this.openidConnectConfig != null ? !this.openidConnectConfig.equals(that.openidConnectConfig) : that.openidConnectConfig != null) return false;
            return this.userPoolConfig != null ? this.userPoolConfig.equals(that.userPoolConfig) : that.userPoolConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.authenticationType.hashCode();
            result = 31 * result + (this.openidConnectConfig != null ? this.openidConnectConfig.hashCode() : 0);
            result = 31 * result + (this.userPoolConfig != null ? this.userPoolConfig.hashCode() : 0);
            return result;
        }
    }
}
