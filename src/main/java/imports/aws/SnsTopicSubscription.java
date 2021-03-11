package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.880Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsTopicSubscription")
public class SnsTopicSubscription extends com.hashicorp.cdktf.TerraformResource {

    protected SnsTopicSubscription(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SnsTopicSubscription(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SnsTopicSubscription(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SnsTopicSubscriptionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetConfirmationTimeoutInMinutes() {
        software.amazon.jsii.Kernel.call(this, "resetConfirmationTimeoutInMinutes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeliveryPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetDeliveryPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpointAutoConfirms() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointAutoConfirms", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilterPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetFilterPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRawMessageDelivery() {
        software.amazon.jsii.Kernel.call(this, "resetRawMessageDelivery", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProtocolInput() {
        return software.amazon.jsii.Kernel.get(this, "protocolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "topicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getConfirmationTimeoutInMinutesInput() {
        return software.amazon.jsii.Kernel.get(this, "confirmationTimeoutInMinutesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeliveryPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "deliveryPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEndpointAutoConfirmsInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointAutoConfirmsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFilterPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "filterPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRawMessageDeliveryInput() {
        return software.amazon.jsii.Kernel.get(this, "rawMessageDeliveryInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getConfirmationTimeoutInMinutes() {
        return software.amazon.jsii.Kernel.get(this, "confirmationTimeoutInMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setConfirmationTimeoutInMinutes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "confirmationTimeoutInMinutes", java.util.Objects.requireNonNull(value, "confirmationTimeoutInMinutes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeliveryPolicy() {
        return software.amazon.jsii.Kernel.get(this, "deliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeliveryPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deliveryPolicy", java.util.Objects.requireNonNull(value, "deliveryPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpoint", java.util.Objects.requireNonNull(value, "endpoint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEndpointAutoConfirms() {
        return software.amazon.jsii.Kernel.get(this, "endpointAutoConfirms", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEndpointAutoConfirms(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "endpointAutoConfirms", java.util.Objects.requireNonNull(value, "endpointAutoConfirms is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFilterPolicy() {
        return software.amazon.jsii.Kernel.get(this, "filterPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFilterPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "filterPolicy", java.util.Objects.requireNonNull(value, "filterPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProtocol() {
        return software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProtocol(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "protocol", java.util.Objects.requireNonNull(value, "protocol is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getRawMessageDelivery() {
        return software.amazon.jsii.Kernel.get(this, "rawMessageDelivery", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRawMessageDelivery(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "rawMessageDelivery", java.util.Objects.requireNonNull(value, "rawMessageDelivery is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "topicArn", java.util.Objects.requireNonNull(value, "topicArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SnsTopicSubscription}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SnsTopicSubscription> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.SnsTopicSubscriptionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SnsTopicSubscriptionConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param endpoint This parameter is required.
         */
        public Builder endpoint(final java.lang.String endpoint) {
            this.config.endpoint(endpoint);
            return this;
        }

        /**
         * @return {@code this}
         * @param protocol This parameter is required.
         */
        public Builder protocol(final java.lang.String protocol) {
            this.config.protocol(protocol);
            return this;
        }

        /**
         * @return {@code this}
         * @param topicArn This parameter is required.
         */
        public Builder topicArn(final java.lang.String topicArn) {
            this.config.topicArn(topicArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param confirmationTimeoutInMinutes This parameter is required.
         */
        public Builder confirmationTimeoutInMinutes(final java.lang.Number confirmationTimeoutInMinutes) {
            this.config.confirmationTimeoutInMinutes(confirmationTimeoutInMinutes);
            return this;
        }

        /**
         * @return {@code this}
         * @param deliveryPolicy This parameter is required.
         */
        public Builder deliveryPolicy(final java.lang.String deliveryPolicy) {
            this.config.deliveryPolicy(deliveryPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param endpointAutoConfirms This parameter is required.
         */
        public Builder endpointAutoConfirms(final java.lang.Boolean endpointAutoConfirms) {
            this.config.endpointAutoConfirms(endpointAutoConfirms);
            return this;
        }

        /**
         * @return {@code this}
         * @param filterPolicy This parameter is required.
         */
        public Builder filterPolicy(final java.lang.String filterPolicy) {
            this.config.filterPolicy(filterPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param rawMessageDelivery This parameter is required.
         */
        public Builder rawMessageDelivery(final java.lang.Boolean rawMessageDelivery) {
            this.config.rawMessageDelivery(rawMessageDelivery);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SnsTopicSubscription}.
         */
        @Override
        public imports.aws.SnsTopicSubscription build() {
            return new imports.aws.SnsTopicSubscription(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
