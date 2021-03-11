package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.881Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsTopicSubscriptionConfig")
@software.amazon.jsii.Jsii.Proxy(SnsTopicSubscriptionConfig.Jsii$Proxy.class)
public interface SnsTopicSubscriptionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getEndpoint();

    @org.jetbrains.annotations.NotNull java.lang.String getProtocol();

    @org.jetbrains.annotations.NotNull java.lang.String getTopicArn();

    default @org.jetbrains.annotations.Nullable java.lang.Number getConfirmationTimeoutInMinutes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeliveryPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEndpointAutoConfirms() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFilterPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRawMessageDelivery() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SnsTopicSubscriptionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SnsTopicSubscriptionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SnsTopicSubscriptionConfig> {
        private java.lang.String endpoint;
        private java.lang.String protocol;
        private java.lang.String topicArn;
        private java.lang.Number confirmationTimeoutInMinutes;
        private java.lang.String deliveryPolicy;
        private java.lang.Boolean endpointAutoConfirms;
        private java.lang.String filterPolicy;
        private java.lang.Boolean rawMessageDelivery;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getEndpoint}
         * @param endpoint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder endpoint(java.lang.String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getProtocol}
         * @param protocol the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getTopicArn}
         * @param topicArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder topicArn(java.lang.String topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getConfirmationTimeoutInMinutes}
         * @param confirmationTimeoutInMinutes the value to be set.
         * @return {@code this}
         */
        public Builder confirmationTimeoutInMinutes(java.lang.Number confirmationTimeoutInMinutes) {
            this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getDeliveryPolicy}
         * @param deliveryPolicy the value to be set.
         * @return {@code this}
         */
        public Builder deliveryPolicy(java.lang.String deliveryPolicy) {
            this.deliveryPolicy = deliveryPolicy;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getEndpointAutoConfirms}
         * @param endpointAutoConfirms the value to be set.
         * @return {@code this}
         */
        public Builder endpointAutoConfirms(java.lang.Boolean endpointAutoConfirms) {
            this.endpointAutoConfirms = endpointAutoConfirms;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getFilterPolicy}
         * @param filterPolicy the value to be set.
         * @return {@code this}
         */
        public Builder filterPolicy(java.lang.String filterPolicy) {
            this.filterPolicy = filterPolicy;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getRawMessageDelivery}
         * @param rawMessageDelivery the value to be set.
         * @return {@code this}
         */
        public Builder rawMessageDelivery(java.lang.Boolean rawMessageDelivery) {
            this.rawMessageDelivery = rawMessageDelivery;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getDependsOn}
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
         * Sets the value of {@link SnsTopicSubscriptionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicSubscriptionConfig#getProvider}
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
         * @return a new instance of {@link SnsTopicSubscriptionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SnsTopicSubscriptionConfig build() {
            return new Jsii$Proxy(endpoint, protocol, topicArn, confirmationTimeoutInMinutes, deliveryPolicy, endpointAutoConfirms, filterPolicy, rawMessageDelivery, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SnsTopicSubscriptionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SnsTopicSubscriptionConfig {
        private final java.lang.String endpoint;
        private final java.lang.String protocol;
        private final java.lang.String topicArn;
        private final java.lang.Number confirmationTimeoutInMinutes;
        private final java.lang.String deliveryPolicy;
        private final java.lang.Boolean endpointAutoConfirms;
        private final java.lang.String filterPolicy;
        private final java.lang.Boolean rawMessageDelivery;
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
            this.endpoint = software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.topicArn = software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.confirmationTimeoutInMinutes = software.amazon.jsii.Kernel.get(this, "confirmationTimeoutInMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.deliveryPolicy = software.amazon.jsii.Kernel.get(this, "deliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpointAutoConfirms = software.amazon.jsii.Kernel.get(this, "endpointAutoConfirms", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.filterPolicy = software.amazon.jsii.Kernel.get(this, "filterPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rawMessageDelivery = software.amazon.jsii.Kernel.get(this, "rawMessageDelivery", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String endpoint, final java.lang.String protocol, final java.lang.String topicArn, final java.lang.Number confirmationTimeoutInMinutes, final java.lang.String deliveryPolicy, final java.lang.Boolean endpointAutoConfirms, final java.lang.String filterPolicy, final java.lang.Boolean rawMessageDelivery, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint is required");
            this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
            this.topicArn = java.util.Objects.requireNonNull(topicArn, "topicArn is required");
            this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
            this.deliveryPolicy = deliveryPolicy;
            this.endpointAutoConfirms = endpointAutoConfirms;
            this.filterPolicy = filterPolicy;
            this.rawMessageDelivery = rawMessageDelivery;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getEndpoint() {
            return this.endpoint;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.String getTopicArn() {
            return this.topicArn;
        }

        @Override
        public final java.lang.Number getConfirmationTimeoutInMinutes() {
            return this.confirmationTimeoutInMinutes;
        }

        @Override
        public final java.lang.String getDeliveryPolicy() {
            return this.deliveryPolicy;
        }

        @Override
        public final java.lang.Boolean getEndpointAutoConfirms() {
            return this.endpointAutoConfirms;
        }

        @Override
        public final java.lang.String getFilterPolicy() {
            return this.filterPolicy;
        }

        @Override
        public final java.lang.Boolean getRawMessageDelivery() {
            return this.rawMessageDelivery;
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

            data.set("endpoint", om.valueToTree(this.getEndpoint()));
            data.set("protocol", om.valueToTree(this.getProtocol()));
            data.set("topicArn", om.valueToTree(this.getTopicArn()));
            if (this.getConfirmationTimeoutInMinutes() != null) {
                data.set("confirmationTimeoutInMinutes", om.valueToTree(this.getConfirmationTimeoutInMinutes()));
            }
            if (this.getDeliveryPolicy() != null) {
                data.set("deliveryPolicy", om.valueToTree(this.getDeliveryPolicy()));
            }
            if (this.getEndpointAutoConfirms() != null) {
                data.set("endpointAutoConfirms", om.valueToTree(this.getEndpointAutoConfirms()));
            }
            if (this.getFilterPolicy() != null) {
                data.set("filterPolicy", om.valueToTree(this.getFilterPolicy()));
            }
            if (this.getRawMessageDelivery() != null) {
                data.set("rawMessageDelivery", om.valueToTree(this.getRawMessageDelivery()));
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
            struct.set("fqn", om.valueToTree("aws.SnsTopicSubscriptionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SnsTopicSubscriptionConfig.Jsii$Proxy that = (SnsTopicSubscriptionConfig.Jsii$Proxy) o;

            if (!endpoint.equals(that.endpoint)) return false;
            if (!protocol.equals(that.protocol)) return false;
            if (!topicArn.equals(that.topicArn)) return false;
            if (this.confirmationTimeoutInMinutes != null ? !this.confirmationTimeoutInMinutes.equals(that.confirmationTimeoutInMinutes) : that.confirmationTimeoutInMinutes != null) return false;
            if (this.deliveryPolicy != null ? !this.deliveryPolicy.equals(that.deliveryPolicy) : that.deliveryPolicy != null) return false;
            if (this.endpointAutoConfirms != null ? !this.endpointAutoConfirms.equals(that.endpointAutoConfirms) : that.endpointAutoConfirms != null) return false;
            if (this.filterPolicy != null ? !this.filterPolicy.equals(that.filterPolicy) : that.filterPolicy != null) return false;
            if (this.rawMessageDelivery != null ? !this.rawMessageDelivery.equals(that.rawMessageDelivery) : that.rawMessageDelivery != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endpoint.hashCode();
            result = 31 * result + (this.protocol.hashCode());
            result = 31 * result + (this.topicArn.hashCode());
            result = 31 * result + (this.confirmationTimeoutInMinutes != null ? this.confirmationTimeoutInMinutes.hashCode() : 0);
            result = 31 * result + (this.deliveryPolicy != null ? this.deliveryPolicy.hashCode() : 0);
            result = 31 * result + (this.endpointAutoConfirms != null ? this.endpointAutoConfirms.hashCode() : 0);
            result = 31 * result + (this.filterPolicy != null ? this.filterPolicy.hashCode() : 0);
            result = 31 * result + (this.rawMessageDelivery != null ? this.rawMessageDelivery.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
