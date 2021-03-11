package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.862Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesIdentityNotificationTopic")
public class SesIdentityNotificationTopic extends com.hashicorp.cdktf.TerraformResource {

    protected SesIdentityNotificationTopic(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesIdentityNotificationTopic(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SesIdentityNotificationTopic(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SesIdentityNotificationTopicConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetIncludeOriginalHeaders() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeOriginalHeaders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTopicArn() {
        software.amazon.jsii.Kernel.call(this, "resetTopicArn", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentityInput() {
        return software.amazon.jsii.Kernel.get(this, "identityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeOriginalHeadersInput() {
        return software.amazon.jsii.Kernel.get(this, "includeOriginalHeadersInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "topicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentity() {
        return software.amazon.jsii.Kernel.get(this, "identity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentity(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identity", java.util.Objects.requireNonNull(value, "identity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIncludeOriginalHeaders() {
        return software.amazon.jsii.Kernel.get(this, "includeOriginalHeaders", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIncludeOriginalHeaders(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeOriginalHeaders", java.util.Objects.requireNonNull(value, "includeOriginalHeaders is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationType() {
        return software.amazon.jsii.Kernel.get(this, "notificationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationType", java.util.Objects.requireNonNull(value, "notificationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "topicArn", java.util.Objects.requireNonNull(value, "topicArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SesIdentityNotificationTopic}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SesIdentityNotificationTopic> {
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
        private final imports.aws.SesIdentityNotificationTopicConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SesIdentityNotificationTopicConfig.Builder();
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
         * @param identity This parameter is required.
         */
        public Builder identity(final java.lang.String identity) {
            this.config.identity(identity);
            return this;
        }

        /**
         * @return {@code this}
         * @param notificationType This parameter is required.
         */
        public Builder notificationType(final java.lang.String notificationType) {
            this.config.notificationType(notificationType);
            return this;
        }

        /**
         * @return {@code this}
         * @param includeOriginalHeaders This parameter is required.
         */
        public Builder includeOriginalHeaders(final java.lang.Boolean includeOriginalHeaders) {
            this.config.includeOriginalHeaders(includeOriginalHeaders);
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
         * @returns a newly built instance of {@link imports.aws.SesIdentityNotificationTopic}.
         */
        @Override
        public imports.aws.SesIdentityNotificationTopic build() {
            return new imports.aws.SesIdentityNotificationTopic(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
