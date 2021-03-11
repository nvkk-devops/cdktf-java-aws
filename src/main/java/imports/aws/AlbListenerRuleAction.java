package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.941Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbListenerRuleAction")
@software.amazon.jsii.Jsii.Proxy(AlbListenerRuleAction.Jsii$Proxy.class)
public interface AlbListenerRuleAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * authenticate_cognito block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbListenerRuleActionAuthenticateCognito> getAuthenticateCognito() {
        return null;
    }

    /**
     * authenticate_oidc block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbListenerRuleActionAuthenticateOidc> getAuthenticateOidc() {
        return null;
    }

    /**
     * fixed_response block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbListenerRuleActionFixedResponse> getFixedResponse() {
        return null;
    }

    /**
     * forward block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbListenerRuleActionForward> getForward() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getOrder() {
        return null;
    }

    /**
     * redirect block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbListenerRuleActionRedirect> getRedirect() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTargetGroupArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbListenerRuleAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbListenerRuleAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbListenerRuleAction> {
        private java.lang.String type;
        private java.util.List<imports.aws.AlbListenerRuleActionAuthenticateCognito> authenticateCognito;
        private java.util.List<imports.aws.AlbListenerRuleActionAuthenticateOidc> authenticateOidc;
        private java.util.List<imports.aws.AlbListenerRuleActionFixedResponse> fixedResponse;
        private java.util.List<imports.aws.AlbListenerRuleActionForward> forward;
        private java.lang.Number order;
        private java.util.List<imports.aws.AlbListenerRuleActionRedirect> redirect;
        private java.lang.String targetGroupArn;

        /**
         * Sets the value of {@link AlbListenerRuleAction#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleAction#getAuthenticateCognito}
         * @param authenticateCognito authenticate_cognito block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder authenticateCognito(java.util.List<? extends imports.aws.AlbListenerRuleActionAuthenticateCognito> authenticateCognito) {
            this.authenticateCognito = (java.util.List<imports.aws.AlbListenerRuleActionAuthenticateCognito>)authenticateCognito;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleAction#getAuthenticateOidc}
         * @param authenticateOidc authenticate_oidc block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder authenticateOidc(java.util.List<? extends imports.aws.AlbListenerRuleActionAuthenticateOidc> authenticateOidc) {
            this.authenticateOidc = (java.util.List<imports.aws.AlbListenerRuleActionAuthenticateOidc>)authenticateOidc;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleAction#getFixedResponse}
         * @param fixedResponse fixed_response block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fixedResponse(java.util.List<? extends imports.aws.AlbListenerRuleActionFixedResponse> fixedResponse) {
            this.fixedResponse = (java.util.List<imports.aws.AlbListenerRuleActionFixedResponse>)fixedResponse;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleAction#getForward}
         * @param forward forward block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder forward(java.util.List<? extends imports.aws.AlbListenerRuleActionForward> forward) {
            this.forward = (java.util.List<imports.aws.AlbListenerRuleActionForward>)forward;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleAction#getOrder}
         * @param order the value to be set.
         * @return {@code this}
         */
        public Builder order(java.lang.Number order) {
            this.order = order;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleAction#getRedirect}
         * @param redirect redirect block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder redirect(java.util.List<? extends imports.aws.AlbListenerRuleActionRedirect> redirect) {
            this.redirect = (java.util.List<imports.aws.AlbListenerRuleActionRedirect>)redirect;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerRuleAction#getTargetGroupArn}
         * @param targetGroupArn the value to be set.
         * @return {@code this}
         */
        public Builder targetGroupArn(java.lang.String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbListenerRuleAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbListenerRuleAction build() {
            return new Jsii$Proxy(type, authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn);
        }
    }

    /**
     * An implementation for {@link AlbListenerRuleAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbListenerRuleAction {
        private final java.lang.String type;
        private final java.util.List<imports.aws.AlbListenerRuleActionAuthenticateCognito> authenticateCognito;
        private final java.util.List<imports.aws.AlbListenerRuleActionAuthenticateOidc> authenticateOidc;
        private final java.util.List<imports.aws.AlbListenerRuleActionFixedResponse> fixedResponse;
        private final java.util.List<imports.aws.AlbListenerRuleActionForward> forward;
        private final java.lang.Number order;
        private final java.util.List<imports.aws.AlbListenerRuleActionRedirect> redirect;
        private final java.lang.String targetGroupArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authenticateCognito = software.amazon.jsii.Kernel.get(this, "authenticateCognito", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleActionAuthenticateCognito.class)));
            this.authenticateOidc = software.amazon.jsii.Kernel.get(this, "authenticateOidc", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleActionAuthenticateOidc.class)));
            this.fixedResponse = software.amazon.jsii.Kernel.get(this, "fixedResponse", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleActionFixedResponse.class)));
            this.forward = software.amazon.jsii.Kernel.get(this, "forward", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleActionForward.class)));
            this.order = software.amazon.jsii.Kernel.get(this, "order", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.redirect = software.amazon.jsii.Kernel.get(this, "redirect", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerRuleActionRedirect.class)));
            this.targetGroupArn = software.amazon.jsii.Kernel.get(this, "targetGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String type, final java.util.List<? extends imports.aws.AlbListenerRuleActionAuthenticateCognito> authenticateCognito, final java.util.List<? extends imports.aws.AlbListenerRuleActionAuthenticateOidc> authenticateOidc, final java.util.List<? extends imports.aws.AlbListenerRuleActionFixedResponse> fixedResponse, final java.util.List<? extends imports.aws.AlbListenerRuleActionForward> forward, final java.lang.Number order, final java.util.List<? extends imports.aws.AlbListenerRuleActionRedirect> redirect, final java.lang.String targetGroupArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.authenticateCognito = (java.util.List<imports.aws.AlbListenerRuleActionAuthenticateCognito>)authenticateCognito;
            this.authenticateOidc = (java.util.List<imports.aws.AlbListenerRuleActionAuthenticateOidc>)authenticateOidc;
            this.fixedResponse = (java.util.List<imports.aws.AlbListenerRuleActionFixedResponse>)fixedResponse;
            this.forward = (java.util.List<imports.aws.AlbListenerRuleActionForward>)forward;
            this.order = order;
            this.redirect = (java.util.List<imports.aws.AlbListenerRuleActionRedirect>)redirect;
            this.targetGroupArn = targetGroupArn;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.AlbListenerRuleActionAuthenticateCognito> getAuthenticateCognito() {
            return this.authenticateCognito;
        }

        @Override
        public final java.util.List<imports.aws.AlbListenerRuleActionAuthenticateOidc> getAuthenticateOidc() {
            return this.authenticateOidc;
        }

        @Override
        public final java.util.List<imports.aws.AlbListenerRuleActionFixedResponse> getFixedResponse() {
            return this.fixedResponse;
        }

        @Override
        public final java.util.List<imports.aws.AlbListenerRuleActionForward> getForward() {
            return this.forward;
        }

        @Override
        public final java.lang.Number getOrder() {
            return this.order;
        }

        @Override
        public final java.util.List<imports.aws.AlbListenerRuleActionRedirect> getRedirect() {
            return this.redirect;
        }

        @Override
        public final java.lang.String getTargetGroupArn() {
            return this.targetGroupArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getAuthenticateCognito() != null) {
                data.set("authenticateCognito", om.valueToTree(this.getAuthenticateCognito()));
            }
            if (this.getAuthenticateOidc() != null) {
                data.set("authenticateOidc", om.valueToTree(this.getAuthenticateOidc()));
            }
            if (this.getFixedResponse() != null) {
                data.set("fixedResponse", om.valueToTree(this.getFixedResponse()));
            }
            if (this.getForward() != null) {
                data.set("forward", om.valueToTree(this.getForward()));
            }
            if (this.getOrder() != null) {
                data.set("order", om.valueToTree(this.getOrder()));
            }
            if (this.getRedirect() != null) {
                data.set("redirect", om.valueToTree(this.getRedirect()));
            }
            if (this.getTargetGroupArn() != null) {
                data.set("targetGroupArn", om.valueToTree(this.getTargetGroupArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AlbListenerRuleAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbListenerRuleAction.Jsii$Proxy that = (AlbListenerRuleAction.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.authenticateCognito != null ? !this.authenticateCognito.equals(that.authenticateCognito) : that.authenticateCognito != null) return false;
            if (this.authenticateOidc != null ? !this.authenticateOidc.equals(that.authenticateOidc) : that.authenticateOidc != null) return false;
            if (this.fixedResponse != null ? !this.fixedResponse.equals(that.fixedResponse) : that.fixedResponse != null) return false;
            if (this.forward != null ? !this.forward.equals(that.forward) : that.forward != null) return false;
            if (this.order != null ? !this.order.equals(that.order) : that.order != null) return false;
            if (this.redirect != null ? !this.redirect.equals(that.redirect) : that.redirect != null) return false;
            return this.targetGroupArn != null ? this.targetGroupArn.equals(that.targetGroupArn) : that.targetGroupArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.authenticateCognito != null ? this.authenticateCognito.hashCode() : 0);
            result = 31 * result + (this.authenticateOidc != null ? this.authenticateOidc.hashCode() : 0);
            result = 31 * result + (this.fixedResponse != null ? this.fixedResponse.hashCode() : 0);
            result = 31 * result + (this.forward != null ? this.forward.hashCode() : 0);
            result = 31 * result + (this.order != null ? this.order.hashCode() : 0);
            result = 31 * result + (this.redirect != null ? this.redirect.hashCode() : 0);
            result = 31 * result + (this.targetGroupArn != null ? this.targetGroupArn.hashCode() : 0);
            return result;
        }
    }
}
