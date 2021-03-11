package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.939Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbListenerDefaultActionAuthenticateOidc")
@software.amazon.jsii.Jsii.Proxy(AlbListenerDefaultActionAuthenticateOidc.Jsii$Proxy.class)
public interface AlbListenerDefaultActionAuthenticateOidc extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationEndpoint();

    @org.jetbrains.annotations.NotNull java.lang.String getClientId();

    @org.jetbrains.annotations.NotNull java.lang.String getClientSecret();

    @org.jetbrains.annotations.NotNull java.lang.String getIssuer();

    @org.jetbrains.annotations.NotNull java.lang.String getTokenEndpoint();

    @org.jetbrains.annotations.NotNull java.lang.String getUserInfoEndpoint();

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAuthenticationRequestExtraParams() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOnUnauthenticatedRequest() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getScope() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSessionCookieName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getSessionTimeout() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbListenerDefaultActionAuthenticateOidc}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbListenerDefaultActionAuthenticateOidc}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbListenerDefaultActionAuthenticateOidc> {
        private java.lang.String authorizationEndpoint;
        private java.lang.String clientId;
        private java.lang.String clientSecret;
        private java.lang.String issuer;
        private java.lang.String tokenEndpoint;
        private java.lang.String userInfoEndpoint;
        private java.util.Map<java.lang.String, java.lang.String> authenticationRequestExtraParams;
        private java.lang.String onUnauthenticatedRequest;
        private java.lang.String scope;
        private java.lang.String sessionCookieName;
        private java.lang.Number sessionTimeout;

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getAuthorizationEndpoint}
         * @param authorizationEndpoint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder authorizationEndpoint(java.lang.String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getClientId}
         * @param clientId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clientId(java.lang.String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getClientSecret}
         * @param clientSecret the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clientSecret(java.lang.String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getIssuer}
         * @param issuer the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder issuer(java.lang.String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getTokenEndpoint}
         * @param tokenEndpoint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder tokenEndpoint(java.lang.String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getUserInfoEndpoint}
         * @param userInfoEndpoint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userInfoEndpoint(java.lang.String userInfoEndpoint) {
            this.userInfoEndpoint = userInfoEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getAuthenticationRequestExtraParams}
         * @param authenticationRequestExtraParams the value to be set.
         * @return {@code this}
         */
        public Builder authenticationRequestExtraParams(java.util.Map<java.lang.String, java.lang.String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getOnUnauthenticatedRequest}
         * @param onUnauthenticatedRequest the value to be set.
         * @return {@code this}
         */
        public Builder onUnauthenticatedRequest(java.lang.String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getScope}
         * @param scope the value to be set.
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getSessionCookieName}
         * @param sessionCookieName the value to be set.
         * @return {@code this}
         */
        public Builder sessionCookieName(java.lang.String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateOidc#getSessionTimeout}
         * @param sessionTimeout the value to be set.
         * @return {@code this}
         */
        public Builder sessionTimeout(java.lang.Number sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbListenerDefaultActionAuthenticateOidc}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbListenerDefaultActionAuthenticateOidc build() {
            return new Jsii$Proxy(authorizationEndpoint, clientId, clientSecret, issuer, tokenEndpoint, userInfoEndpoint, authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout);
        }
    }

    /**
     * An implementation for {@link AlbListenerDefaultActionAuthenticateOidc}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbListenerDefaultActionAuthenticateOidc {
        private final java.lang.String authorizationEndpoint;
        private final java.lang.String clientId;
        private final java.lang.String clientSecret;
        private final java.lang.String issuer;
        private final java.lang.String tokenEndpoint;
        private final java.lang.String userInfoEndpoint;
        private final java.util.Map<java.lang.String, java.lang.String> authenticationRequestExtraParams;
        private final java.lang.String onUnauthenticatedRequest;
        private final java.lang.String scope;
        private final java.lang.String sessionCookieName;
        private final java.lang.Number sessionTimeout;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.authorizationEndpoint = software.amazon.jsii.Kernel.get(this, "authorizationEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientId = software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientSecret = software.amazon.jsii.Kernel.get(this, "clientSecret", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.issuer = software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tokenEndpoint = software.amazon.jsii.Kernel.get(this, "tokenEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userInfoEndpoint = software.amazon.jsii.Kernel.get(this, "userInfoEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authenticationRequestExtraParams = software.amazon.jsii.Kernel.get(this, "authenticationRequestExtraParams", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.onUnauthenticatedRequest = software.amazon.jsii.Kernel.get(this, "onUnauthenticatedRequest", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionCookieName = software.amazon.jsii.Kernel.get(this, "sessionCookieName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionTimeout = software.amazon.jsii.Kernel.get(this, "sessionTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String authorizationEndpoint, final java.lang.String clientId, final java.lang.String clientSecret, final java.lang.String issuer, final java.lang.String tokenEndpoint, final java.lang.String userInfoEndpoint, final java.util.Map<java.lang.String, java.lang.String> authenticationRequestExtraParams, final java.lang.String onUnauthenticatedRequest, final java.lang.String scope, final java.lang.String sessionCookieName, final java.lang.Number sessionTimeout) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authorizationEndpoint = java.util.Objects.requireNonNull(authorizationEndpoint, "authorizationEndpoint is required");
            this.clientId = java.util.Objects.requireNonNull(clientId, "clientId is required");
            this.clientSecret = java.util.Objects.requireNonNull(clientSecret, "clientSecret is required");
            this.issuer = java.util.Objects.requireNonNull(issuer, "issuer is required");
            this.tokenEndpoint = java.util.Objects.requireNonNull(tokenEndpoint, "tokenEndpoint is required");
            this.userInfoEndpoint = java.util.Objects.requireNonNull(userInfoEndpoint, "userInfoEndpoint is required");
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            this.scope = scope;
            this.sessionCookieName = sessionCookieName;
            this.sessionTimeout = sessionTimeout;
        }

        @Override
        public final java.lang.String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        @Override
        public final java.lang.String getClientId() {
            return this.clientId;
        }

        @Override
        public final java.lang.String getClientSecret() {
            return this.clientSecret;
        }

        @Override
        public final java.lang.String getIssuer() {
            return this.issuer;
        }

        @Override
        public final java.lang.String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        @Override
        public final java.lang.String getUserInfoEndpoint() {
            return this.userInfoEndpoint;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getAuthenticationRequestExtraParams() {
            return this.authenticationRequestExtraParams;
        }

        @Override
        public final java.lang.String getOnUnauthenticatedRequest() {
            return this.onUnauthenticatedRequest;
        }

        @Override
        public final java.lang.String getScope() {
            return this.scope;
        }

        @Override
        public final java.lang.String getSessionCookieName() {
            return this.sessionCookieName;
        }

        @Override
        public final java.lang.Number getSessionTimeout() {
            return this.sessionTimeout;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("authorizationEndpoint", om.valueToTree(this.getAuthorizationEndpoint()));
            data.set("clientId", om.valueToTree(this.getClientId()));
            data.set("clientSecret", om.valueToTree(this.getClientSecret()));
            data.set("issuer", om.valueToTree(this.getIssuer()));
            data.set("tokenEndpoint", om.valueToTree(this.getTokenEndpoint()));
            data.set("userInfoEndpoint", om.valueToTree(this.getUserInfoEndpoint()));
            if (this.getAuthenticationRequestExtraParams() != null) {
                data.set("authenticationRequestExtraParams", om.valueToTree(this.getAuthenticationRequestExtraParams()));
            }
            if (this.getOnUnauthenticatedRequest() != null) {
                data.set("onUnauthenticatedRequest", om.valueToTree(this.getOnUnauthenticatedRequest()));
            }
            if (this.getScope() != null) {
                data.set("scope", om.valueToTree(this.getScope()));
            }
            if (this.getSessionCookieName() != null) {
                data.set("sessionCookieName", om.valueToTree(this.getSessionCookieName()));
            }
            if (this.getSessionTimeout() != null) {
                data.set("sessionTimeout", om.valueToTree(this.getSessionTimeout()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AlbListenerDefaultActionAuthenticateOidc"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbListenerDefaultActionAuthenticateOidc.Jsii$Proxy that = (AlbListenerDefaultActionAuthenticateOidc.Jsii$Proxy) o;

            if (!authorizationEndpoint.equals(that.authorizationEndpoint)) return false;
            if (!clientId.equals(that.clientId)) return false;
            if (!clientSecret.equals(that.clientSecret)) return false;
            if (!issuer.equals(that.issuer)) return false;
            if (!tokenEndpoint.equals(that.tokenEndpoint)) return false;
            if (!userInfoEndpoint.equals(that.userInfoEndpoint)) return false;
            if (this.authenticationRequestExtraParams != null ? !this.authenticationRequestExtraParams.equals(that.authenticationRequestExtraParams) : that.authenticationRequestExtraParams != null) return false;
            if (this.onUnauthenticatedRequest != null ? !this.onUnauthenticatedRequest.equals(that.onUnauthenticatedRequest) : that.onUnauthenticatedRequest != null) return false;
            if (this.scope != null ? !this.scope.equals(that.scope) : that.scope != null) return false;
            if (this.sessionCookieName != null ? !this.sessionCookieName.equals(that.sessionCookieName) : that.sessionCookieName != null) return false;
            return this.sessionTimeout != null ? this.sessionTimeout.equals(that.sessionTimeout) : that.sessionTimeout == null;
        }

        @Override
        public final int hashCode() {
            int result = this.authorizationEndpoint.hashCode();
            result = 31 * result + (this.clientId.hashCode());
            result = 31 * result + (this.clientSecret.hashCode());
            result = 31 * result + (this.issuer.hashCode());
            result = 31 * result + (this.tokenEndpoint.hashCode());
            result = 31 * result + (this.userInfoEndpoint.hashCode());
            result = 31 * result + (this.authenticationRequestExtraParams != null ? this.authenticationRequestExtraParams.hashCode() : 0);
            result = 31 * result + (this.onUnauthenticatedRequest != null ? this.onUnauthenticatedRequest.hashCode() : 0);
            result = 31 * result + (this.scope != null ? this.scope.hashCode() : 0);
            result = 31 * result + (this.sessionCookieName != null ? this.sessionCookieName.hashCode() : 0);
            result = 31 * result + (this.sessionTimeout != null ? this.sessionTimeout.hashCode() : 0);
            return result;
        }
    }
}
