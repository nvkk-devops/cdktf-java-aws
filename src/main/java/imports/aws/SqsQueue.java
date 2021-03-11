package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.889Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SqsQueue")
public class SqsQueue extends com.hashicorp.cdktf.TerraformResource {

    protected SqsQueue(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SqsQueue(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SqsQueue(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.SqsQueueConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public SqsQueue(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetContentBasedDeduplication() {
        software.amazon.jsii.Kernel.call(this, "resetContentBasedDeduplication", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDelaySeconds() {
        software.amazon.jsii.Kernel.call(this, "resetDelaySeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFifoQueue() {
        software.amazon.jsii.Kernel.call(this, "resetFifoQueue", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsDataKeyReusePeriodSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetKmsDataKeyReusePeriodSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsMasterKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsMasterKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxMessageSize() {
        software.amazon.jsii.Kernel.call(this, "resetMaxMessageSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMessageRetentionSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMessageRetentionSeconds", software.amazon.jsii.NativeType.VOID);
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

    public void resetReceiveWaitTimeSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetReceiveWaitTimeSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedrivePolicy() {
        software.amazon.jsii.Kernel.call(this, "resetRedrivePolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVisibilityTimeoutSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetVisibilityTimeoutSeconds", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getContentBasedDeduplicationInput() {
        return software.amazon.jsii.Kernel.get(this, "contentBasedDeduplicationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDelaySecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "delaySecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getFifoQueueInput() {
        return software.amazon.jsii.Kernel.get(this, "fifoQueueInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getKmsDataKeyReusePeriodSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsDataKeyReusePeriodSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsMasterKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsMasterKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxMessageSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "maxMessageSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMessageRetentionSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "messageRetentionSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.Number getReceiveWaitTimeSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "receiveWaitTimeSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRedrivePolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "redrivePolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getVisibilityTimeoutSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "visibilityTimeoutSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getContentBasedDeduplication() {
        return software.amazon.jsii.Kernel.get(this, "contentBasedDeduplication", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setContentBasedDeduplication(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "contentBasedDeduplication", java.util.Objects.requireNonNull(value, "contentBasedDeduplication is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDelaySeconds() {
        return software.amazon.jsii.Kernel.get(this, "delaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDelaySeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "delaySeconds", java.util.Objects.requireNonNull(value, "delaySeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getFifoQueue() {
        return software.amazon.jsii.Kernel.get(this, "fifoQueue", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setFifoQueue(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "fifoQueue", java.util.Objects.requireNonNull(value, "fifoQueue is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getKmsDataKeyReusePeriodSeconds() {
        return software.amazon.jsii.Kernel.get(this, "kmsDataKeyReusePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setKmsDataKeyReusePeriodSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "kmsDataKeyReusePeriodSeconds", java.util.Objects.requireNonNull(value, "kmsDataKeyReusePeriodSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsMasterKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsMasterKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsMasterKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsMasterKeyId", java.util.Objects.requireNonNull(value, "kmsMasterKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxMessageSize() {
        return software.amazon.jsii.Kernel.get(this, "maxMessageSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxMessageSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxMessageSize", java.util.Objects.requireNonNull(value, "maxMessageSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMessageRetentionSeconds() {
        return software.amazon.jsii.Kernel.get(this, "messageRetentionSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMessageRetentionSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "messageRetentionSeconds", java.util.Objects.requireNonNull(value, "messageRetentionSeconds is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Number getReceiveWaitTimeSeconds() {
        return software.amazon.jsii.Kernel.get(this, "receiveWaitTimeSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setReceiveWaitTimeSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "receiveWaitTimeSeconds", java.util.Objects.requireNonNull(value, "receiveWaitTimeSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRedrivePolicy() {
        return software.amazon.jsii.Kernel.get(this, "redrivePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRedrivePolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "redrivePolicy", java.util.Objects.requireNonNull(value, "redrivePolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVisibilityTimeoutSeconds() {
        return software.amazon.jsii.Kernel.get(this, "visibilityTimeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setVisibilityTimeoutSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "visibilityTimeoutSeconds", java.util.Objects.requireNonNull(value, "visibilityTimeoutSeconds is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SqsQueue}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SqsQueue> {
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
        private imports.aws.SqsQueueConfig.Builder config;

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
         * @param contentBasedDeduplication This parameter is required.
         */
        public Builder contentBasedDeduplication(final java.lang.Boolean contentBasedDeduplication) {
            this.config().contentBasedDeduplication(contentBasedDeduplication);
            return this;
        }

        /**
         * @return {@code this}
         * @param delaySeconds This parameter is required.
         */
        public Builder delaySeconds(final java.lang.Number delaySeconds) {
            this.config().delaySeconds(delaySeconds);
            return this;
        }

        /**
         * @return {@code this}
         * @param fifoQueue This parameter is required.
         */
        public Builder fifoQueue(final java.lang.Boolean fifoQueue) {
            this.config().fifoQueue(fifoQueue);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsDataKeyReusePeriodSeconds This parameter is required.
         */
        public Builder kmsDataKeyReusePeriodSeconds(final java.lang.Number kmsDataKeyReusePeriodSeconds) {
            this.config().kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds);
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
         * @param maxMessageSize This parameter is required.
         */
        public Builder maxMessageSize(final java.lang.Number maxMessageSize) {
            this.config().maxMessageSize(maxMessageSize);
            return this;
        }

        /**
         * @return {@code this}
         * @param messageRetentionSeconds This parameter is required.
         */
        public Builder messageRetentionSeconds(final java.lang.Number messageRetentionSeconds) {
            this.config().messageRetentionSeconds(messageRetentionSeconds);
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
         * @param receiveWaitTimeSeconds This parameter is required.
         */
        public Builder receiveWaitTimeSeconds(final java.lang.Number receiveWaitTimeSeconds) {
            this.config().receiveWaitTimeSeconds(receiveWaitTimeSeconds);
            return this;
        }

        /**
         * @return {@code this}
         * @param redrivePolicy This parameter is required.
         */
        public Builder redrivePolicy(final java.lang.String redrivePolicy) {
            this.config().redrivePolicy(redrivePolicy);
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
         * @return {@code this}
         * @param visibilityTimeoutSeconds This parameter is required.
         */
        public Builder visibilityTimeoutSeconds(final java.lang.Number visibilityTimeoutSeconds) {
            this.config().visibilityTimeoutSeconds(visibilityTimeoutSeconds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SqsQueue}.
         */
        @Override
        public imports.aws.SqsQueue build() {
            return new imports.aws.SqsQueue(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.SqsQueueConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.SqsQueueConfig.Builder();
            }
            return this.config;
        }
    }
}
