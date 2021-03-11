package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.879Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsTopicConfig")
@software.amazon.jsii.Jsii.Proxy(SnsTopicConfig.Jsii$Proxy.class)
public interface SnsTopicConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getApplicationFailureFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getApplicationSuccessFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getApplicationSuccessFeedbackSampleRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeliveryPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDisplayName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHttpFailureFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHttpSuccessFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHttpSuccessFeedbackSampleRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsMasterKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLambdaFailureFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLambdaSuccessFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getLambdaSuccessFeedbackSampleRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSqsFailureFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSqsSuccessFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getSqsSuccessFeedbackSampleRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SnsTopicConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SnsTopicConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SnsTopicConfig> {
        private java.lang.String applicationFailureFeedbackRoleArn;
        private java.lang.String applicationSuccessFeedbackRoleArn;
        private java.lang.Number applicationSuccessFeedbackSampleRate;
        private java.lang.String deliveryPolicy;
        private java.lang.String displayName;
        private java.lang.String httpFailureFeedbackRoleArn;
        private java.lang.String httpSuccessFeedbackRoleArn;
        private java.lang.Number httpSuccessFeedbackSampleRate;
        private java.lang.String kmsMasterKeyId;
        private java.lang.String lambdaFailureFeedbackRoleArn;
        private java.lang.String lambdaSuccessFeedbackRoleArn;
        private java.lang.Number lambdaSuccessFeedbackSampleRate;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.lang.String policy;
        private java.lang.String sqsFailureFeedbackRoleArn;
        private java.lang.String sqsSuccessFeedbackRoleArn;
        private java.lang.Number sqsSuccessFeedbackSampleRate;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SnsTopicConfig#getApplicationFailureFeedbackRoleArn}
         * @param applicationFailureFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder applicationFailureFeedbackRoleArn(java.lang.String applicationFailureFeedbackRoleArn) {
            this.applicationFailureFeedbackRoleArn = applicationFailureFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getApplicationSuccessFeedbackRoleArn}
         * @param applicationSuccessFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder applicationSuccessFeedbackRoleArn(java.lang.String applicationSuccessFeedbackRoleArn) {
            this.applicationSuccessFeedbackRoleArn = applicationSuccessFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getApplicationSuccessFeedbackSampleRate}
         * @param applicationSuccessFeedbackSampleRate the value to be set.
         * @return {@code this}
         */
        public Builder applicationSuccessFeedbackSampleRate(java.lang.Number applicationSuccessFeedbackSampleRate) {
            this.applicationSuccessFeedbackSampleRate = applicationSuccessFeedbackSampleRate;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getDeliveryPolicy}
         * @param deliveryPolicy the value to be set.
         * @return {@code this}
         */
        public Builder deliveryPolicy(java.lang.String deliveryPolicy) {
            this.deliveryPolicy = deliveryPolicy;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getDisplayName}
         * @param displayName the value to be set.
         * @return {@code this}
         */
        public Builder displayName(java.lang.String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getHttpFailureFeedbackRoleArn}
         * @param httpFailureFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder httpFailureFeedbackRoleArn(java.lang.String httpFailureFeedbackRoleArn) {
            this.httpFailureFeedbackRoleArn = httpFailureFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getHttpSuccessFeedbackRoleArn}
         * @param httpSuccessFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder httpSuccessFeedbackRoleArn(java.lang.String httpSuccessFeedbackRoleArn) {
            this.httpSuccessFeedbackRoleArn = httpSuccessFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getHttpSuccessFeedbackSampleRate}
         * @param httpSuccessFeedbackSampleRate the value to be set.
         * @return {@code this}
         */
        public Builder httpSuccessFeedbackSampleRate(java.lang.Number httpSuccessFeedbackSampleRate) {
            this.httpSuccessFeedbackSampleRate = httpSuccessFeedbackSampleRate;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getKmsMasterKeyId}
         * @param kmsMasterKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsMasterKeyId(java.lang.String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getLambdaFailureFeedbackRoleArn}
         * @param lambdaFailureFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder lambdaFailureFeedbackRoleArn(java.lang.String lambdaFailureFeedbackRoleArn) {
            this.lambdaFailureFeedbackRoleArn = lambdaFailureFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getLambdaSuccessFeedbackRoleArn}
         * @param lambdaSuccessFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder lambdaSuccessFeedbackRoleArn(java.lang.String lambdaSuccessFeedbackRoleArn) {
            this.lambdaSuccessFeedbackRoleArn = lambdaSuccessFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getLambdaSuccessFeedbackSampleRate}
         * @param lambdaSuccessFeedbackSampleRate the value to be set.
         * @return {@code this}
         */
        public Builder lambdaSuccessFeedbackSampleRate(java.lang.Number lambdaSuccessFeedbackSampleRate) {
            this.lambdaSuccessFeedbackSampleRate = lambdaSuccessFeedbackSampleRate;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getPolicy}
         * @param policy the value to be set.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getSqsFailureFeedbackRoleArn}
         * @param sqsFailureFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder sqsFailureFeedbackRoleArn(java.lang.String sqsFailureFeedbackRoleArn) {
            this.sqsFailureFeedbackRoleArn = sqsFailureFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getSqsSuccessFeedbackRoleArn}
         * @param sqsSuccessFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder sqsSuccessFeedbackRoleArn(java.lang.String sqsSuccessFeedbackRoleArn) {
            this.sqsSuccessFeedbackRoleArn = sqsSuccessFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getSqsSuccessFeedbackSampleRate}
         * @param sqsSuccessFeedbackSampleRate the value to be set.
         * @return {@code this}
         */
        public Builder sqsSuccessFeedbackSampleRate(java.lang.Number sqsSuccessFeedbackSampleRate) {
            this.sqsSuccessFeedbackSampleRate = sqsSuccessFeedbackSampleRate;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getDependsOn}
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
         * Sets the value of {@link SnsTopicConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SnsTopicConfig#getProvider}
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
         * @return a new instance of {@link SnsTopicConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SnsTopicConfig build() {
            return new Jsii$Proxy(applicationFailureFeedbackRoleArn, applicationSuccessFeedbackRoleArn, applicationSuccessFeedbackSampleRate, deliveryPolicy, displayName, httpFailureFeedbackRoleArn, httpSuccessFeedbackRoleArn, httpSuccessFeedbackSampleRate, kmsMasterKeyId, lambdaFailureFeedbackRoleArn, lambdaSuccessFeedbackRoleArn, lambdaSuccessFeedbackSampleRate, name, namePrefix, policy, sqsFailureFeedbackRoleArn, sqsSuccessFeedbackRoleArn, sqsSuccessFeedbackSampleRate, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SnsTopicConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SnsTopicConfig {
        private final java.lang.String applicationFailureFeedbackRoleArn;
        private final java.lang.String applicationSuccessFeedbackRoleArn;
        private final java.lang.Number applicationSuccessFeedbackSampleRate;
        private final java.lang.String deliveryPolicy;
        private final java.lang.String displayName;
        private final java.lang.String httpFailureFeedbackRoleArn;
        private final java.lang.String httpSuccessFeedbackRoleArn;
        private final java.lang.Number httpSuccessFeedbackSampleRate;
        private final java.lang.String kmsMasterKeyId;
        private final java.lang.String lambdaFailureFeedbackRoleArn;
        private final java.lang.String lambdaSuccessFeedbackRoleArn;
        private final java.lang.Number lambdaSuccessFeedbackSampleRate;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.String policy;
        private final java.lang.String sqsFailureFeedbackRoleArn;
        private final java.lang.String sqsSuccessFeedbackRoleArn;
        private final java.lang.Number sqsSuccessFeedbackSampleRate;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.applicationFailureFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "applicationFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.applicationSuccessFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "applicationSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.applicationSuccessFeedbackSampleRate = software.amazon.jsii.Kernel.get(this, "applicationSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.deliveryPolicy = software.amazon.jsii.Kernel.get(this, "deliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.displayName = software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpFailureFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "httpFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpSuccessFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "httpSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpSuccessFeedbackSampleRate = software.amazon.jsii.Kernel.get(this, "httpSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.kmsMasterKeyId = software.amazon.jsii.Kernel.get(this, "kmsMasterKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaFailureFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "lambdaFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaSuccessFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "lambdaSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaSuccessFeedbackSampleRate = software.amazon.jsii.Kernel.get(this, "lambdaSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sqsFailureFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "sqsFailureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sqsSuccessFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "sqsSuccessFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sqsSuccessFeedbackSampleRate = software.amazon.jsii.Kernel.get(this, "sqsSuccessFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String applicationFailureFeedbackRoleArn, final java.lang.String applicationSuccessFeedbackRoleArn, final java.lang.Number applicationSuccessFeedbackSampleRate, final java.lang.String deliveryPolicy, final java.lang.String displayName, final java.lang.String httpFailureFeedbackRoleArn, final java.lang.String httpSuccessFeedbackRoleArn, final java.lang.Number httpSuccessFeedbackSampleRate, final java.lang.String kmsMasterKeyId, final java.lang.String lambdaFailureFeedbackRoleArn, final java.lang.String lambdaSuccessFeedbackRoleArn, final java.lang.Number lambdaSuccessFeedbackSampleRate, final java.lang.String name, final java.lang.String namePrefix, final java.lang.String policy, final java.lang.String sqsFailureFeedbackRoleArn, final java.lang.String sqsSuccessFeedbackRoleArn, final java.lang.Number sqsSuccessFeedbackSampleRate, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.applicationFailureFeedbackRoleArn = applicationFailureFeedbackRoleArn;
            this.applicationSuccessFeedbackRoleArn = applicationSuccessFeedbackRoleArn;
            this.applicationSuccessFeedbackSampleRate = applicationSuccessFeedbackSampleRate;
            this.deliveryPolicy = deliveryPolicy;
            this.displayName = displayName;
            this.httpFailureFeedbackRoleArn = httpFailureFeedbackRoleArn;
            this.httpSuccessFeedbackRoleArn = httpSuccessFeedbackRoleArn;
            this.httpSuccessFeedbackSampleRate = httpSuccessFeedbackSampleRate;
            this.kmsMasterKeyId = kmsMasterKeyId;
            this.lambdaFailureFeedbackRoleArn = lambdaFailureFeedbackRoleArn;
            this.lambdaSuccessFeedbackRoleArn = lambdaSuccessFeedbackRoleArn;
            this.lambdaSuccessFeedbackSampleRate = lambdaSuccessFeedbackSampleRate;
            this.name = name;
            this.namePrefix = namePrefix;
            this.policy = policy;
            this.sqsFailureFeedbackRoleArn = sqsFailureFeedbackRoleArn;
            this.sqsSuccessFeedbackRoleArn = sqsSuccessFeedbackRoleArn;
            this.sqsSuccessFeedbackSampleRate = sqsSuccessFeedbackSampleRate;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getApplicationFailureFeedbackRoleArn() {
            return this.applicationFailureFeedbackRoleArn;
        }

        @Override
        public final java.lang.String getApplicationSuccessFeedbackRoleArn() {
            return this.applicationSuccessFeedbackRoleArn;
        }

        @Override
        public final java.lang.Number getApplicationSuccessFeedbackSampleRate() {
            return this.applicationSuccessFeedbackSampleRate;
        }

        @Override
        public final java.lang.String getDeliveryPolicy() {
            return this.deliveryPolicy;
        }

        @Override
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        @Override
        public final java.lang.String getHttpFailureFeedbackRoleArn() {
            return this.httpFailureFeedbackRoleArn;
        }

        @Override
        public final java.lang.String getHttpSuccessFeedbackRoleArn() {
            return this.httpSuccessFeedbackRoleArn;
        }

        @Override
        public final java.lang.Number getHttpSuccessFeedbackSampleRate() {
            return this.httpSuccessFeedbackSampleRate;
        }

        @Override
        public final java.lang.String getKmsMasterKeyId() {
            return this.kmsMasterKeyId;
        }

        @Override
        public final java.lang.String getLambdaFailureFeedbackRoleArn() {
            return this.lambdaFailureFeedbackRoleArn;
        }

        @Override
        public final java.lang.String getLambdaSuccessFeedbackRoleArn() {
            return this.lambdaSuccessFeedbackRoleArn;
        }

        @Override
        public final java.lang.Number getLambdaSuccessFeedbackSampleRate() {
            return this.lambdaSuccessFeedbackSampleRate;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.String getSqsFailureFeedbackRoleArn() {
            return this.sqsFailureFeedbackRoleArn;
        }

        @Override
        public final java.lang.String getSqsSuccessFeedbackRoleArn() {
            return this.sqsSuccessFeedbackRoleArn;
        }

        @Override
        public final java.lang.Number getSqsSuccessFeedbackSampleRate() {
            return this.sqsSuccessFeedbackSampleRate;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            if (this.getApplicationFailureFeedbackRoleArn() != null) {
                data.set("applicationFailureFeedbackRoleArn", om.valueToTree(this.getApplicationFailureFeedbackRoleArn()));
            }
            if (this.getApplicationSuccessFeedbackRoleArn() != null) {
                data.set("applicationSuccessFeedbackRoleArn", om.valueToTree(this.getApplicationSuccessFeedbackRoleArn()));
            }
            if (this.getApplicationSuccessFeedbackSampleRate() != null) {
                data.set("applicationSuccessFeedbackSampleRate", om.valueToTree(this.getApplicationSuccessFeedbackSampleRate()));
            }
            if (this.getDeliveryPolicy() != null) {
                data.set("deliveryPolicy", om.valueToTree(this.getDeliveryPolicy()));
            }
            if (this.getDisplayName() != null) {
                data.set("displayName", om.valueToTree(this.getDisplayName()));
            }
            if (this.getHttpFailureFeedbackRoleArn() != null) {
                data.set("httpFailureFeedbackRoleArn", om.valueToTree(this.getHttpFailureFeedbackRoleArn()));
            }
            if (this.getHttpSuccessFeedbackRoleArn() != null) {
                data.set("httpSuccessFeedbackRoleArn", om.valueToTree(this.getHttpSuccessFeedbackRoleArn()));
            }
            if (this.getHttpSuccessFeedbackSampleRate() != null) {
                data.set("httpSuccessFeedbackSampleRate", om.valueToTree(this.getHttpSuccessFeedbackSampleRate()));
            }
            if (this.getKmsMasterKeyId() != null) {
                data.set("kmsMasterKeyId", om.valueToTree(this.getKmsMasterKeyId()));
            }
            if (this.getLambdaFailureFeedbackRoleArn() != null) {
                data.set("lambdaFailureFeedbackRoleArn", om.valueToTree(this.getLambdaFailureFeedbackRoleArn()));
            }
            if (this.getLambdaSuccessFeedbackRoleArn() != null) {
                data.set("lambdaSuccessFeedbackRoleArn", om.valueToTree(this.getLambdaSuccessFeedbackRoleArn()));
            }
            if (this.getLambdaSuccessFeedbackSampleRate() != null) {
                data.set("lambdaSuccessFeedbackSampleRate", om.valueToTree(this.getLambdaSuccessFeedbackSampleRate()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getSqsFailureFeedbackRoleArn() != null) {
                data.set("sqsFailureFeedbackRoleArn", om.valueToTree(this.getSqsFailureFeedbackRoleArn()));
            }
            if (this.getSqsSuccessFeedbackRoleArn() != null) {
                data.set("sqsSuccessFeedbackRoleArn", om.valueToTree(this.getSqsSuccessFeedbackRoleArn()));
            }
            if (this.getSqsSuccessFeedbackSampleRate() != null) {
                data.set("sqsSuccessFeedbackSampleRate", om.valueToTree(this.getSqsSuccessFeedbackSampleRate()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.SnsTopicConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SnsTopicConfig.Jsii$Proxy that = (SnsTopicConfig.Jsii$Proxy) o;

            if (this.applicationFailureFeedbackRoleArn != null ? !this.applicationFailureFeedbackRoleArn.equals(that.applicationFailureFeedbackRoleArn) : that.applicationFailureFeedbackRoleArn != null) return false;
            if (this.applicationSuccessFeedbackRoleArn != null ? !this.applicationSuccessFeedbackRoleArn.equals(that.applicationSuccessFeedbackRoleArn) : that.applicationSuccessFeedbackRoleArn != null) return false;
            if (this.applicationSuccessFeedbackSampleRate != null ? !this.applicationSuccessFeedbackSampleRate.equals(that.applicationSuccessFeedbackSampleRate) : that.applicationSuccessFeedbackSampleRate != null) return false;
            if (this.deliveryPolicy != null ? !this.deliveryPolicy.equals(that.deliveryPolicy) : that.deliveryPolicy != null) return false;
            if (this.displayName != null ? !this.displayName.equals(that.displayName) : that.displayName != null) return false;
            if (this.httpFailureFeedbackRoleArn != null ? !this.httpFailureFeedbackRoleArn.equals(that.httpFailureFeedbackRoleArn) : that.httpFailureFeedbackRoleArn != null) return false;
            if (this.httpSuccessFeedbackRoleArn != null ? !this.httpSuccessFeedbackRoleArn.equals(that.httpSuccessFeedbackRoleArn) : that.httpSuccessFeedbackRoleArn != null) return false;
            if (this.httpSuccessFeedbackSampleRate != null ? !this.httpSuccessFeedbackSampleRate.equals(that.httpSuccessFeedbackSampleRate) : that.httpSuccessFeedbackSampleRate != null) return false;
            if (this.kmsMasterKeyId != null ? !this.kmsMasterKeyId.equals(that.kmsMasterKeyId) : that.kmsMasterKeyId != null) return false;
            if (this.lambdaFailureFeedbackRoleArn != null ? !this.lambdaFailureFeedbackRoleArn.equals(that.lambdaFailureFeedbackRoleArn) : that.lambdaFailureFeedbackRoleArn != null) return false;
            if (this.lambdaSuccessFeedbackRoleArn != null ? !this.lambdaSuccessFeedbackRoleArn.equals(that.lambdaSuccessFeedbackRoleArn) : that.lambdaSuccessFeedbackRoleArn != null) return false;
            if (this.lambdaSuccessFeedbackSampleRate != null ? !this.lambdaSuccessFeedbackSampleRate.equals(that.lambdaSuccessFeedbackSampleRate) : that.lambdaSuccessFeedbackSampleRate != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.sqsFailureFeedbackRoleArn != null ? !this.sqsFailureFeedbackRoleArn.equals(that.sqsFailureFeedbackRoleArn) : that.sqsFailureFeedbackRoleArn != null) return false;
            if (this.sqsSuccessFeedbackRoleArn != null ? !this.sqsSuccessFeedbackRoleArn.equals(that.sqsSuccessFeedbackRoleArn) : that.sqsSuccessFeedbackRoleArn != null) return false;
            if (this.sqsSuccessFeedbackSampleRate != null ? !this.sqsSuccessFeedbackSampleRate.equals(that.sqsSuccessFeedbackSampleRate) : that.sqsSuccessFeedbackSampleRate != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.applicationFailureFeedbackRoleArn != null ? this.applicationFailureFeedbackRoleArn.hashCode() : 0;
            result = 31 * result + (this.applicationSuccessFeedbackRoleArn != null ? this.applicationSuccessFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.applicationSuccessFeedbackSampleRate != null ? this.applicationSuccessFeedbackSampleRate.hashCode() : 0);
            result = 31 * result + (this.deliveryPolicy != null ? this.deliveryPolicy.hashCode() : 0);
            result = 31 * result + (this.displayName != null ? this.displayName.hashCode() : 0);
            result = 31 * result + (this.httpFailureFeedbackRoleArn != null ? this.httpFailureFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.httpSuccessFeedbackRoleArn != null ? this.httpSuccessFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.httpSuccessFeedbackSampleRate != null ? this.httpSuccessFeedbackSampleRate.hashCode() : 0);
            result = 31 * result + (this.kmsMasterKeyId != null ? this.kmsMasterKeyId.hashCode() : 0);
            result = 31 * result + (this.lambdaFailureFeedbackRoleArn != null ? this.lambdaFailureFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.lambdaSuccessFeedbackRoleArn != null ? this.lambdaSuccessFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.lambdaSuccessFeedbackSampleRate != null ? this.lambdaSuccessFeedbackSampleRate.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.sqsFailureFeedbackRoleArn != null ? this.sqsFailureFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.sqsSuccessFeedbackRoleArn != null ? this.sqsSuccessFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.sqsSuccessFeedbackSampleRate != null ? this.sqsSuccessFeedbackSampleRate.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
