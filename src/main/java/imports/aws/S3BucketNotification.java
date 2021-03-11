package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.834Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketNotification")
public class S3BucketNotification extends com.hashicorp.cdktf.TerraformResource {

    protected S3BucketNotification(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketNotification(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public S3BucketNotification(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.S3BucketNotificationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetLambdaFunction() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaFunction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueue() {
        software.amazon.jsii.Kernel.call(this, "resetQueue", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTopic() {
        software.amazon.jsii.Kernel.call(this, "resetTopic", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketNotificationLambdaFunction> getLambdaFunctionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketNotificationLambdaFunction>)(software.amazon.jsii.Kernel.get(this, "lambdaFunctionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketNotificationLambdaFunction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketNotificationQueue> getQueueInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketNotificationQueue>)(software.amazon.jsii.Kernel.get(this, "queueInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketNotificationQueue.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketNotificationTopic> getTopicInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.S3BucketNotificationTopic>)(software.amazon.jsii.Kernel.get(this, "topicInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketNotificationTopic.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketNotificationLambdaFunction> getLambdaFunction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lambdaFunction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketNotificationLambdaFunction.class))));
    }

    public void setLambdaFunction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketNotificationLambdaFunction> value) {
        software.amazon.jsii.Kernel.set(this, "lambdaFunction", java.util.Objects.requireNonNull(value, "lambdaFunction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketNotificationQueue> getQueue() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "queue", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketNotificationQueue.class))));
    }

    public void setQueue(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketNotificationQueue> value) {
        software.amazon.jsii.Kernel.set(this, "queue", java.util.Objects.requireNonNull(value, "queue is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketNotificationTopic> getTopic() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "topic", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketNotificationTopic.class))));
    }

    public void setTopic(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketNotificationTopic> value) {
        software.amazon.jsii.Kernel.set(this, "topic", java.util.Objects.requireNonNull(value, "topic is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.S3BucketNotification}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.S3BucketNotification> {
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
        private final imports.aws.S3BucketNotificationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.S3BucketNotificationConfig.Builder();
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
         * @param bucket This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config.bucket(bucket);
            return this;
        }

        /**
         * lambda_function block.
         * <p>
         * @return {@code this}
         * @param lambdaFunction lambda_function block. This parameter is required.
         */
        public Builder lambdaFunction(final java.util.List<? extends imports.aws.S3BucketNotificationLambdaFunction> lambdaFunction) {
            this.config.lambdaFunction(lambdaFunction);
            return this;
        }

        /**
         * queue block.
         * <p>
         * @return {@code this}
         * @param queue queue block. This parameter is required.
         */
        public Builder queue(final java.util.List<? extends imports.aws.S3BucketNotificationQueue> queue) {
            this.config.queue(queue);
            return this;
        }

        /**
         * topic block.
         * <p>
         * @return {@code this}
         * @param topic topic block. This parameter is required.
         */
        public Builder topic(final java.util.List<? extends imports.aws.S3BucketNotificationTopic> topic) {
            this.config.topic(topic);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.S3BucketNotification}.
         */
        @Override
        public imports.aws.S3BucketNotification build() {
            return new imports.aws.S3BucketNotification(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
