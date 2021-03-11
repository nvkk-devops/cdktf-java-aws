package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.868Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsPlatformApplication")
public class SnsPlatformApplication extends com.hashicorp.cdktf.TerraformResource {

    protected SnsPlatformApplication(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SnsPlatformApplication(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SnsPlatformApplication(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SnsPlatformApplicationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetEventDeliveryFailureTopicArn() {
        software.amazon.jsii.Kernel.call(this, "resetEventDeliveryFailureTopicArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventEndpointCreatedTopicArn() {
        software.amazon.jsii.Kernel.call(this, "resetEventEndpointCreatedTopicArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventEndpointDeletedTopicArn() {
        software.amazon.jsii.Kernel.call(this, "resetEventEndpointDeletedTopicArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventEndpointUpdatedTopicArn() {
        software.amazon.jsii.Kernel.call(this, "resetEventEndpointUpdatedTopicArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFailureFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetFailureFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlatformPrincipal() {
        software.amazon.jsii.Kernel.call(this, "resetPlatformPrincipal", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuccessFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuccessFeedbackSampleRate() {
        software.amazon.jsii.Kernel.call(this, "resetSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformCredentialInput() {
        return software.amazon.jsii.Kernel.get(this, "platformCredentialInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformInput() {
        return software.amazon.jsii.Kernel.get(this, "platformInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventDeliveryFailureTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "eventDeliveryFailureTopicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventEndpointCreatedTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "eventEndpointCreatedTopicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventEndpointDeletedTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "eventEndpointDeletedTopicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventEndpointUpdatedTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "eventEndpointUpdatedTopicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFailureFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "failureFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlatformPrincipalInput() {
        return software.amazon.jsii.Kernel.get(this, "platformPrincipalInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSuccessFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "successFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSuccessFeedbackSampleRateInput() {
        return software.amazon.jsii.Kernel.get(this, "successFeedbackSampleRateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventDeliveryFailureTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "eventDeliveryFailureTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventDeliveryFailureTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventDeliveryFailureTopicArn", java.util.Objects.requireNonNull(value, "eventDeliveryFailureTopicArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventEndpointCreatedTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "eventEndpointCreatedTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventEndpointCreatedTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventEndpointCreatedTopicArn", java.util.Objects.requireNonNull(value, "eventEndpointCreatedTopicArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventEndpointDeletedTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "eventEndpointDeletedTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventEndpointDeletedTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventEndpointDeletedTopicArn", java.util.Objects.requireNonNull(value, "eventEndpointDeletedTopicArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventEndpointUpdatedTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "eventEndpointUpdatedTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventEndpointUpdatedTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventEndpointUpdatedTopicArn", java.util.Objects.requireNonNull(value, "eventEndpointUpdatedTopicArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFailureFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "failureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFailureFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "failureFeedbackRoleArn", java.util.Objects.requireNonNull(value, "failureFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatform() {
        return software.amazon.jsii.Kernel.get(this, "platform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlatform(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "platform", java.util.Objects.requireNonNull(value, "platform is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformCredential() {
        return software.amazon.jsii.Kernel.get(this, "platformCredential", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlatformCredential(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "platformCredential", java.util.Objects.requireNonNull(value, "platformCredential is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformPrincipal() {
        return software.amazon.jsii.Kernel.get(this, "platformPrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlatformPrincipal(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "platformPrincipal", java.util.Objects.requireNonNull(value, "platformPrincipal is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSuccessFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "successFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSuccessFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "successFeedbackRoleArn", java.util.Objects.requireNonNull(value, "successFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSuccessFeedbackSampleRate() {
        return software.amazon.jsii.Kernel.get(this, "successFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSuccessFeedbackSampleRate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "successFeedbackSampleRate", java.util.Objects.requireNonNull(value, "successFeedbackSampleRate is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SnsPlatformApplication}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SnsPlatformApplication> {
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
        private final imports.aws.SnsPlatformApplicationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SnsPlatformApplicationConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param platform This parameter is required.
         */
        public Builder platform(final java.lang.String platform) {
            this.config.platform(platform);
            return this;
        }

        /**
         * @return {@code this}
         * @param platformCredential This parameter is required.
         */
        public Builder platformCredential(final java.lang.String platformCredential) {
            this.config.platformCredential(platformCredential);
            return this;
        }

        /**
         * @return {@code this}
         * @param eventDeliveryFailureTopicArn This parameter is required.
         */
        public Builder eventDeliveryFailureTopicArn(final java.lang.String eventDeliveryFailureTopicArn) {
            this.config.eventDeliveryFailureTopicArn(eventDeliveryFailureTopicArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param eventEndpointCreatedTopicArn This parameter is required.
         */
        public Builder eventEndpointCreatedTopicArn(final java.lang.String eventEndpointCreatedTopicArn) {
            this.config.eventEndpointCreatedTopicArn(eventEndpointCreatedTopicArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param eventEndpointDeletedTopicArn This parameter is required.
         */
        public Builder eventEndpointDeletedTopicArn(final java.lang.String eventEndpointDeletedTopicArn) {
            this.config.eventEndpointDeletedTopicArn(eventEndpointDeletedTopicArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param eventEndpointUpdatedTopicArn This parameter is required.
         */
        public Builder eventEndpointUpdatedTopicArn(final java.lang.String eventEndpointUpdatedTopicArn) {
            this.config.eventEndpointUpdatedTopicArn(eventEndpointUpdatedTopicArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param failureFeedbackRoleArn This parameter is required.
         */
        public Builder failureFeedbackRoleArn(final java.lang.String failureFeedbackRoleArn) {
            this.config.failureFeedbackRoleArn(failureFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param platformPrincipal This parameter is required.
         */
        public Builder platformPrincipal(final java.lang.String platformPrincipal) {
            this.config.platformPrincipal(platformPrincipal);
            return this;
        }

        /**
         * @return {@code this}
         * @param successFeedbackRoleArn This parameter is required.
         */
        public Builder successFeedbackRoleArn(final java.lang.String successFeedbackRoleArn) {
            this.config.successFeedbackRoleArn(successFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param successFeedbackSampleRate This parameter is required.
         */
        public Builder successFeedbackSampleRate(final java.lang.String successFeedbackSampleRate) {
            this.config.successFeedbackSampleRate(successFeedbackSampleRate);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SnsPlatformApplication}.
         */
        @Override
        public imports.aws.SnsPlatformApplication build() {
            return new imports.aws.SnsPlatformApplication(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
