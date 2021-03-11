package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.064Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingLifecycleHook")
public class AutoscalingLifecycleHook extends com.hashicorp.cdktf.TerraformResource {

    protected AutoscalingLifecycleHook(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingLifecycleHook(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public AutoscalingLifecycleHook(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AutoscalingLifecycleHookConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDefaultResult() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultResult", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHeartbeatTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetHeartbeatTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotificationMetadata() {
        software.amazon.jsii.Kernel.call(this, "resetNotificationMetadata", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotificationTargetArn() {
        software.amazon.jsii.Kernel.call(this, "resetNotificationTargetArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "autoscalingGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLifecycleTransitionInput() {
        return software.amazon.jsii.Kernel.get(this, "lifecycleTransitionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultResultInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultResultInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHeartbeatTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "heartbeatTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNotificationMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationMetadataInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNotificationTargetArnInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationTargetArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingGroupName() {
        return software.amazon.jsii.Kernel.get(this, "autoscalingGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutoscalingGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "autoscalingGroupName", java.util.Objects.requireNonNull(value, "autoscalingGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultResult() {
        return software.amazon.jsii.Kernel.get(this, "defaultResult", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultResult(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultResult", java.util.Objects.requireNonNull(value, "defaultResult is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHeartbeatTimeout() {
        return software.amazon.jsii.Kernel.get(this, "heartbeatTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHeartbeatTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "heartbeatTimeout", java.util.Objects.requireNonNull(value, "heartbeatTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLifecycleTransition() {
        return software.amazon.jsii.Kernel.get(this, "lifecycleTransition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLifecycleTransition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lifecycleTransition", java.util.Objects.requireNonNull(value, "lifecycleTransition is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationMetadata() {
        return software.amazon.jsii.Kernel.get(this, "notificationMetadata", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationMetadata(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationMetadata", java.util.Objects.requireNonNull(value, "notificationMetadata is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationTargetArn() {
        return software.amazon.jsii.Kernel.get(this, "notificationTargetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationTargetArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationTargetArn", java.util.Objects.requireNonNull(value, "notificationTargetArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.AutoscalingLifecycleHook}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AutoscalingLifecycleHook> {
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
        private final imports.aws.AutoscalingLifecycleHookConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AutoscalingLifecycleHookConfig.Builder();
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
         * @param autoscalingGroupName This parameter is required.
         */
        public Builder autoscalingGroupName(final java.lang.String autoscalingGroupName) {
            this.config.autoscalingGroupName(autoscalingGroupName);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycleTransition This parameter is required.
         */
        public Builder lifecycleTransition(final java.lang.String lifecycleTransition) {
            this.config.lifecycleTransition(lifecycleTransition);
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
         * @param defaultResult This parameter is required.
         */
        public Builder defaultResult(final java.lang.String defaultResult) {
            this.config.defaultResult(defaultResult);
            return this;
        }

        /**
         * @return {@code this}
         * @param heartbeatTimeout This parameter is required.
         */
        public Builder heartbeatTimeout(final java.lang.Number heartbeatTimeout) {
            this.config.heartbeatTimeout(heartbeatTimeout);
            return this;
        }

        /**
         * @return {@code this}
         * @param notificationMetadata This parameter is required.
         */
        public Builder notificationMetadata(final java.lang.String notificationMetadata) {
            this.config.notificationMetadata(notificationMetadata);
            return this;
        }

        /**
         * @return {@code this}
         * @param notificationTargetArn This parameter is required.
         */
        public Builder notificationTargetArn(final java.lang.String notificationTargetArn) {
            this.config.notificationTargetArn(notificationTargetArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param roleArn This parameter is required.
         */
        public Builder roleArn(final java.lang.String roleArn) {
            this.config.roleArn(roleArn);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AutoscalingLifecycleHook}.
         */
        @Override
        public imports.aws.AutoscalingLifecycleHook build() {
            return new imports.aws.AutoscalingLifecycleHook(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
