package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.939Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbListenerDefaultActionAuthenticateCognito")
@software.amazon.jsii.Jsii.Proxy(AlbListenerDefaultActionAuthenticateCognito.Jsii$Proxy.class)
public interface AlbListenerDefaultActionAuthenticateCognito extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getUserPoolArn();

    @org.jetbrains.annotations.NotNull java.lang.String getUserPoolClientId();

    @org.jetbrains.annotations.NotNull java.lang.String getUserPoolDomain();

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
     * @return a {@link Builder} of {@link AlbListenerDefaultActionAuthenticateCognito}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbListenerDefaultActionAuthenticateCognito}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbListenerDefaultActionAuthenticateCognito> {
        private java.lang.String userPoolArn;
        private java.lang.String userPoolClientId;
        private java.lang.String userPoolDomain;
        private java.util.Map<java.lang.String, java.lang.String> authenticationRequestExtraParams;
        private java.lang.String onUnauthenticatedRequest;
        private java.lang.String scope;
        private java.lang.String sessionCookieName;
        private java.lang.Number sessionTimeout;

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getUserPoolArn}
         * @param userPoolArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userPoolArn(java.lang.String userPoolArn) {
            this.userPoolArn = userPoolArn;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getUserPoolClientId}
         * @param userPoolClientId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userPoolClientId(java.lang.String userPoolClientId) {
            this.userPoolClientId = userPoolClientId;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getUserPoolDomain}
         * @param userPoolDomain the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userPoolDomain(java.lang.String userPoolDomain) {
            this.userPoolDomain = userPoolDomain;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getAuthenticationRequestExtraParams}
         * @param authenticationRequestExtraParams the value to be set.
         * @return {@code this}
         */
        public Builder authenticationRequestExtraParams(java.util.Map<java.lang.String, java.lang.String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getOnUnauthenticatedRequest}
         * @param onUnauthenticatedRequest the value to be set.
         * @return {@code this}
         */
        public Builder onUnauthenticatedRequest(java.lang.String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getScope}
         * @param scope the value to be set.
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getSessionCookieName}
         * @param sessionCookieName the value to be set.
         * @return {@code this}
         */
        public Builder sessionCookieName(java.lang.String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionAuthenticateCognito#getSessionTimeout}
         * @param sessionTimeout the value to be set.
         * @return {@code this}
         */
        public Builder sessionTimeout(java.lang.Number sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbListenerDefaultActionAuthenticateCognito}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbListenerDefaultActionAuthenticateCognito build() {
            return new Jsii$Proxy(userPoolArn, userPoolClientId, userPoolDomain, authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout);
        }
    }

    /**
     * An implementation for {@link AlbListenerDefaultActionAuthenticateCognito}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbListenerDefaultActionAuthenticateCognito {
        private final java.lang.String userPoolArn;
        private final java.lang.String userPoolClientId;
        private final java.lang.String userPoolDomain;
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
            this.userPoolArn = software.amazon.jsii.Kernel.get(this, "userPoolArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userPoolClientId = software.amazon.jsii.Kernel.get(this, "userPoolClientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userPoolDomain = software.amazon.jsii.Kernel.get(this, "userPoolDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authenticationRequestExtraParams = software.amazon.jsii.Kernel.get(this, "authenticationRequestExtraParams", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.onUnauthenticatedRequest = software.amazon.jsii.Kernel.get(this, "onUnauthenticatedRequest", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionCookieName = software.amazon.jsii.Kernel.get(this, "sessionCookieName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionTimeout = software.amazon.jsii.Kernel.get(this, "sessionTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String userPoolArn, final java.lang.String userPoolClientId, final java.lang.String userPoolDomain, final java.util.Map<java.lang.String, java.lang.String> authenticationRequestExtraParams, final java.lang.String onUnauthenticatedRequest, final java.lang.String scope, final java.lang.String sessionCookieName, final java.lang.Number sessionTimeout) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.userPoolArn = java.util.Objects.requireNonNull(userPoolArn, "userPoolArn is required");
            this.userPoolClientId = java.util.Objects.requireNonNull(userPoolClientId, "userPoolClientId is required");
            this.userPoolDomain = java.util.Objects.requireNonNull(userPoolDomain, "userPoolDomain is required");
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            this.scope = scope;
            this.sessionCookieName = sessionCookieName;
            this.sessionTimeout = sessionTimeout;
        }

        @Override
        public final java.lang.String getUserPoolArn() {
            return this.userPoolArn;
        }

        @Override
        public final java.lang.String getUserPoolClientId() {
            return this.userPoolClientId;
        }

        @Override
        public final java.lang.String getUserPoolDomain() {
            return this.userPoolDomain;
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

            data.set("userPoolArn", om.valueToTree(this.getUserPoolArn()));
            data.set("userPoolClientId", om.valueToTree(this.getUserPoolClientId()));
            data.set("userPoolDomain", om.valueToTree(this.getUserPoolDomain()));
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
            struct.set("fqn", om.valueToTree("aws.AlbListenerDefaultActionAuthenticateCognito"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbListenerDefaultActionAuthenticateCognito.Jsii$Proxy that = (AlbListenerDefaultActionAuthenticateCognito.Jsii$Proxy) o;

            if (!userPoolArn.equals(that.userPoolArn)) return false;
            if (!userPoolClientId.equals(that.userPoolClientId)) return false;
            if (!userPoolDomain.equals(that.userPoolDomain)) return false;
            if (this.authenticationRequestExtraParams != null ? !this.authenticationRequestExtraParams.equals(that.authenticationRequestExtraParams) : that.authenticationRequestExtraParams != null) return false;
            if (this.onUnauthenticatedRequest != null ? !this.onUnauthenticatedRequest.equals(that.onUnauthenticatedRequest) : that.onUnauthenticatedRequest != null) return false;
            if (this.scope != null ? !this.scope.equals(that.scope) : that.scope != null) return false;
            if (this.sessionCookieName != null ? !this.sessionCookieName.equals(that.sessionCookieName) : that.sessionCookieName != null) return false;
            return this.sessionTimeout != null ? this.sessionTimeout.equals(that.sessionTimeout) : that.sessionTimeout == null;
        }

        @Override
        public final int hashCode() {
            int result = this.userPoolArn.hashCode();
            result = 31 * result + (this.userPoolClientId.hashCode());
            result = 31 * result + (this.userPoolDomain.hashCode());
            result = 31 * result + (this.authenticationRequestExtraParams != null ? this.authenticationRequestExtraParams.hashCode() : 0);
            result = 31 * result + (this.onUnauthenticatedRequest != null ? this.onUnauthenticatedRequest.hashCode() : 0);
            result = 31 * result + (this.scope != null ? this.scope.hashCode() : 0);
            result = 31 * result + (this.sessionCookieName != null ? this.sessionCookieName.hashCode() : 0);
            result = 31 * result + (this.sessionTimeout != null ? this.sessionTimeout.hashCode() : 0);
            return result;
        }
    }
}
