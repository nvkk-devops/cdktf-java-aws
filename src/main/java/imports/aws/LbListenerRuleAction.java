package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.699Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbListenerRuleAction")
@software.amazon.jsii.Jsii.Proxy(LbListenerRuleAction.Jsii$Proxy.class)
public interface LbListenerRuleAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * authenticate_cognito block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleActionAuthenticateCognito> getAuthenticateCognito() {
        return null;
    }

    /**
     * authenticate_oidc block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleActionAuthenticateOidc> getAuthenticateOidc() {
        return null;
    }

    /**
     * fixed_response block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleActionFixedResponse> getFixedResponse() {
        return null;
    }

    /**
     * forward block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleActionForward> getForward() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getOrder() {
        return null;
    }

    /**
     * redirect block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbListenerRuleActionRedirect> getRedirect() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTargetGroupArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbListenerRuleAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbListenerRuleAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbListenerRuleAction> {
        private java.lang.String type;
        private java.util.List<imports.aws.LbListenerRuleActionAuthenticateCognito> authenticateCognito;
        private java.util.List<imports.aws.LbListenerRuleActionAuthenticateOidc> authenticateOidc;
        private java.util.List<imports.aws.LbListenerRuleActionFixedResponse> fixedResponse;
        private java.util.List<imports.aws.LbListenerRuleActionForward> forward;
        private java.lang.Number order;
        private java.util.List<imports.aws.LbListenerRuleActionRedirect> redirect;
        private java.lang.String targetGroupArn;

        /**
         * Sets the value of {@link LbListenerRuleAction#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleAction#getAuthenticateCognito}
         * @param authenticateCognito authenticate_cognito block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder authenticateCognito(java.util.List<? extends imports.aws.LbListenerRuleActionAuthenticateCognito> authenticateCognito) {
            this.authenticateCognito = (java.util.List<imports.aws.LbListenerRuleActionAuthenticateCognito>)authenticateCognito;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleAction#getAuthenticateOidc}
         * @param authenticateOidc authenticate_oidc block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder authenticateOidc(java.util.List<? extends imports.aws.LbListenerRuleActionAuthenticateOidc> authenticateOidc) {
            this.authenticateOidc = (java.util.List<imports.aws.LbListenerRuleActionAuthenticateOidc>)authenticateOidc;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleAction#getFixedResponse}
         * @param fixedResponse fixed_response block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fixedResponse(java.util.List<? extends imports.aws.LbListenerRuleActionFixedResponse> fixedResponse) {
            this.fixedResponse = (java.util.List<imports.aws.LbListenerRuleActionFixedResponse>)fixedResponse;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleAction#getForward}
         * @param forward forward block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder forward(java.util.List<? extends imports.aws.LbListenerRuleActionForward> forward) {
            this.forward = (java.util.List<imports.aws.LbListenerRuleActionForward>)forward;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleAction#getOrder}
         * @param order the value to be set.
         * @return {@code this}
         */
        public Builder order(java.lang.Number order) {
            this.order = order;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleAction#getRedirect}
         * @param redirect redirect block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder redirect(java.util.List<? extends imports.aws.LbListenerRuleActionRedirect> redirect) {
            this.redirect = (java.util.List<imports.aws.LbListenerRuleActionRedirect>)redirect;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleAction#getTargetGroupArn}
         * @param targetGroupArn the value to be set.
         * @return {@code this}
         */
        public Builder targetGroupArn(java.lang.String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LbListenerRuleAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbListenerRuleAction build() {
            return new Jsii$Proxy(type, authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn);
        }
    }

    /**
     * An implementation for {@link LbListenerRuleAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbListenerRuleAction {
        private final java.lang.String type;
        private final java.util.List<imports.aws.LbListenerRuleActionAuthenticateCognito> authenticateCognito;
        private final java.util.List<imports.aws.LbListenerRuleActionAuthenticateOidc> authenticateOidc;
        private final java.util.List<imports.aws.LbListenerRuleActionFixedResponse> fixedResponse;
        private final java.util.List<imports.aws.LbListenerRuleActionForward> forward;
        private final java.lang.Number order;
        private final java.util.List<imports.aws.LbListenerRuleActionRedirect> redirect;
        private final java.lang.String targetGroupArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authenticateCognito = software.amazon.jsii.Kernel.get(this, "authenticateCognito", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleActionAuthenticateCognito.class)));
            this.authenticateOidc = software.amazon.jsii.Kernel.get(this, "authenticateOidc", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleActionAuthenticateOidc.class)));
            this.fixedResponse = software.amazon.jsii.Kernel.get(this, "fixedResponse", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleActionFixedResponse.class)));
            this.forward = software.amazon.jsii.Kernel.get(this, "forward", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleActionForward.class)));
            this.order = software.amazon.jsii.Kernel.get(this, "order", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.redirect = software.amazon.jsii.Kernel.get(this, "redirect", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbListenerRuleActionRedirect.class)));
            this.targetGroupArn = software.amazon.jsii.Kernel.get(this, "targetGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String type, final java.util.List<? extends imports.aws.LbListenerRuleActionAuthenticateCognito> authenticateCognito, final java.util.List<? extends imports.aws.LbListenerRuleActionAuthenticateOidc> authenticateOidc, final java.util.List<? extends imports.aws.LbListenerRuleActionFixedResponse> fixedResponse, final java.util.List<? extends imports.aws.LbListenerRuleActionForward> forward, final java.lang.Number order, final java.util.List<? extends imports.aws.LbListenerRuleActionRedirect> redirect, final java.lang.String targetGroupArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.authenticateCognito = (java.util.List<imports.aws.LbListenerRuleActionAuthenticateCognito>)authenticateCognito;
            this.authenticateOidc = (java.util.List<imports.aws.LbListenerRuleActionAuthenticateOidc>)authenticateOidc;
            this.fixedResponse = (java.util.List<imports.aws.LbListenerRuleActionFixedResponse>)fixedResponse;
            this.forward = (java.util.List<imports.aws.LbListenerRuleActionForward>)forward;
            this.order = order;
            this.redirect = (java.util.List<imports.aws.LbListenerRuleActionRedirect>)redirect;
            this.targetGroupArn = targetGroupArn;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleActionAuthenticateCognito> getAuthenticateCognito() {
            return this.authenticateCognito;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleActionAuthenticateOidc> getAuthenticateOidc() {
            return this.authenticateOidc;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleActionFixedResponse> getFixedResponse() {
            return this.fixedResponse;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleActionForward> getForward() {
            return this.forward;
        }

        @Override
        public final java.lang.Number getOrder() {
            return this.order;
        }

        @Override
        public final java.util.List<imports.aws.LbListenerRuleActionRedirect> getRedirect() {
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
            struct.set("fqn", om.valueToTree("aws.LbListenerRuleAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbListenerRuleAction.Jsii$Proxy that = (LbListenerRuleAction.Jsii$Proxy) o;

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
