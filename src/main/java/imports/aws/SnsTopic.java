package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.870Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsTopic")
public class SnsTopic extends com.hashicorp.cdktf.TerraformResource {

    protected SnsTopic(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SnsTopic(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SnsTopic(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.SnsTopicConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public SnsTopic(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetApplicationFailureFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetApplicationFailureFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetApplicationSuccessFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetApplicationSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetApplicationSuccessFeedbackSampleRate() {
        software.amazon.jsii.Kernel.call(this, "resetApplicationSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeliveryPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetDeliveryPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisplayName() {
        software.amazon.jsii.Kernel.call(this, "resetDisplayName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpFailureFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetHttpFailureFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpSuccessFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetHttpSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpSuccessFeedbackSampleRate() {
        software.amazon.jsii.Kernel.call(this, "resetHttpSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsMasterKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsMasterKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaFailureFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaFailureFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaSuccessFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaSuccessFeedbackSampleRate() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqsFailureFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetSqsFailureFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqsSuccessFeedbackRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetSqsSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqsSuccessFeedbackSampleRate() {
        software.amazon.jsii.Kernel.call(this, "resetSqsSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getApplicationFailureFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationFailureFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApplicationSuccessFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationSuccessFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getApplicationSuccessFeedbackSampleRateInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationSuccessFeedbackSampleRateInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeliveryPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "deliveryPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDisplayNameInput() {
        return software.amazon.jsii.Kernel.get(this, "displayNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpFailureFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "httpFailureFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpSuccessFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "httpSuccessFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHttpSuccessFeedbackSampleRateInput() {
        return software.amazon.jsii.Kernel.get(this, "httpSuccessFeedbackSampleRateInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsMasterKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsMasterKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaFailureFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFailureFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaSuccessFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaSuccessFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getLambdaSuccessFeedbackSampleRateInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaSuccessFeedbackSampleRateInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "policyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSqsFailureFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "sqsFailureFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSqsSuccessFeedbackRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "sqsSuccessFeedbackRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSqsSuccessFeedbackSampleRateInput() {
        return software.amazon.jsii.Kernel.get(this, "sqsSuccessFeedbackSampleRateInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationFailureFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "applicationFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplicationFailureFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "applicationFailureFeedbackRoleArn", java.util.Objects.requireNonNull(value, "applicationFailureFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationSuccessFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "applicationSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplicationSuccessFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "applicationSuccessFeedbackRoleArn", java.util.Objects.requireNonNull(value, "applicationSuccessFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getApplicationSuccessFeedbackSampleRate() {
        return software.amazon.jsii.Kernel.get(this, "applicationSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setApplicationSuccessFeedbackSampleRate(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "applicationSuccessFeedbackSampleRate", java.util.Objects.requireNonNull(value, "applicationSuccessFeedbackSampleRate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeliveryPolicy() {
        return software.amazon.jsii.Kernel.get(this, "deliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeliveryPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deliveryPolicy", java.util.Objects.requireNonNull(value, "deliveryPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDisplayName() {
        return software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDisplayName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "displayName", java.util.Objects.requireNonNull(value, "displayName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpFailureFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "httpFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpFailureFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpFailureFeedbackRoleArn", java.util.Objects.requireNonNull(value, "httpFailureFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpSuccessFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "httpSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpSuccessFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpSuccessFeedbackRoleArn", java.util.Objects.requireNonNull(value, "httpSuccessFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHttpSuccessFeedbackSampleRate() {
        return software.amazon.jsii.Kernel.get(this, "httpSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHttpSuccessFeedbackSampleRate(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "httpSuccessFeedbackSampleRate", java.util.Objects.requireNonNull(value, "httpSuccessFeedbackSampleRate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsMasterKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsMasterKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsMasterKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsMasterKeyId", java.util.Objects.requireNonNull(value, "kmsMasterKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFailureFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaFailureFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaFailureFeedbackRoleArn", java.util.Objects.requireNonNull(value, "lambdaFailureFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaSuccessFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "lambdaSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaSuccessFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaSuccessFeedbackRoleArn", java.util.Objects.requireNonNull(value, "lambdaSuccessFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLambdaSuccessFeedbackSampleRate() {
        return software.amazon.jsii.Kernel.get(this, "lambdaSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setLambdaSuccessFeedbackSampleRate(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "lambdaSuccessFeedbackSampleRate", java.util.Objects.requireNonNull(value, "lambdaSuccessFeedbackSampleRate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", java.util.Objects.requireNonNull(value, "policy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSqsFailureFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "sqsFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSqsFailureFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sqsFailureFeedbackRoleArn", java.util.Objects.requireNonNull(value, "sqsFailureFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSqsSuccessFeedbackRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "sqsSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSqsSuccessFeedbackRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sqsSuccessFeedbackRoleArn", java.util.Objects.requireNonNull(value, "sqsSuccessFeedbackRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSqsSuccessFeedbackSampleRate() {
        return software.amazon.jsii.Kernel.get(this, "sqsSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSqsSuccessFeedbackSampleRate(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "sqsSuccessFeedbackSampleRate", java.util.Objects.requireNonNull(value, "sqsSuccessFeedbackSampleRate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SnsTopic}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SnsTopic> {
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
        private imports.aws.SnsTopicConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param applicationFailureFeedbackRoleArn This parameter is required.
         */
        public Builder applicationFailureFeedbackRoleArn(final java.lang.String applicationFailureFeedbackRoleArn) {
            this.config().applicationFailureFeedbackRoleArn(applicationFailureFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param applicationSuccessFeedbackRoleArn This parameter is required.
         */
        public Builder applicationSuccessFeedbackRoleArn(final java.lang.String applicationSuccessFeedbackRoleArn) {
            this.config().applicationSuccessFeedbackRoleArn(applicationSuccessFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param applicationSuccessFeedbackSampleRate This parameter is required.
         */
        public Builder applicationSuccessFeedbackSampleRate(final java.lang.Number applicationSuccessFeedbackSampleRate) {
            this.config().applicationSuccessFeedbackSampleRate(applicationSuccessFeedbackSampleRate);
            return this;
        }

        /**
         * @return {@code this}
         * @param deliveryPolicy This parameter is required.
         */
        public Builder deliveryPolicy(final java.lang.String deliveryPolicy) {
            this.config().deliveryPolicy(deliveryPolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param displayName This parameter is required.
         */
        public Builder displayName(final java.lang.String displayName) {
            this.config().displayName(displayName);
            return this;
        }

        /**
         * @return {@code this}
         * @param httpFailureFeedbackRoleArn This parameter is required.
         */
        public Builder httpFailureFeedbackRoleArn(final java.lang.String httpFailureFeedbackRoleArn) {
            this.config().httpFailureFeedbackRoleArn(httpFailureFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param httpSuccessFeedbackRoleArn This parameter is required.
         */
        public Builder httpSuccessFeedbackRoleArn(final java.lang.String httpSuccessFeedbackRoleArn) {
            this.config().httpSuccessFeedbackRoleArn(httpSuccessFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param httpSuccessFeedbackSampleRate This parameter is required.
         */
        public Builder httpSuccessFeedbackSampleRate(final java.lang.Number httpSuccessFeedbackSampleRate) {
            this.config().httpSuccessFeedbackSampleRate(httpSuccessFeedbackSampleRate);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsMasterKeyId This parameter is required.
         */
        public Builder kmsMasterKeyId(final java.lang.String kmsMasterKeyId) {
            this.config().kmsMasterKeyId(kmsMasterKeyId);
            return this;
        }

        /**
         * @return {@code this}
         * @param lambdaFailureFeedbackRoleArn This parameter is required.
         */
        public Builder lambdaFailureFeedbackRoleArn(final java.lang.String lambdaFailureFeedbackRoleArn) {
            this.config().lambdaFailureFeedbackRoleArn(lambdaFailureFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lambdaSuccessFeedbackRoleArn This parameter is required.
         */
        public Builder lambdaSuccessFeedbackRoleArn(final java.lang.String lambdaSuccessFeedbackRoleArn) {
            this.config().lambdaSuccessFeedbackRoleArn(lambdaSuccessFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lambdaSuccessFeedbackSampleRate This parameter is required.
         */
        public Builder lambdaSuccessFeedbackSampleRate(final java.lang.Number lambdaSuccessFeedbackSampleRate) {
            this.config().lambdaSuccessFeedbackSampleRate(lambdaSuccessFeedbackSampleRate);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param namePrefix This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config().namePrefix(namePrefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param policy This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config().policy(policy);
            return this;
        }

        /**
         * @return {@code this}
         * @param sqsFailureFeedbackRoleArn This parameter is required.
         */
        public Builder sqsFailureFeedbackRoleArn(final java.lang.String sqsFailureFeedbackRoleArn) {
            this.config().sqsFailureFeedbackRoleArn(sqsFailureFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param sqsSuccessFeedbackRoleArn This parameter is required.
         */
        public Builder sqsSuccessFeedbackRoleArn(final java.lang.String sqsSuccessFeedbackRoleArn) {
            this.config().sqsSuccessFeedbackRoleArn(sqsSuccessFeedbackRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param sqsSuccessFeedbackSampleRate This parameter is required.
         */
        public Builder sqsSuccessFeedbackSampleRate(final java.lang.Number sqsSuccessFeedbackSampleRate) {
            this.config().sqsSuccessFeedbackSampleRate(sqsSuccessFeedbackSampleRate);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SnsTopic}.
         */
        @Override
        public imports.aws.SnsTopic build() {
            return new imports.aws.SnsTopic(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.SnsTopicConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.SnsTopicConfig.Builder();
            }
            return this.config;
        }
    }
}
