package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.894Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmMaintenanceWindowTask")
public class SsmMaintenanceWindowTask extends com.hashicorp.cdktf.TerraformResource {

    protected SsmMaintenanceWindowTask(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SsmMaintenanceWindowTask(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SsmMaintenanceWindowTask(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SsmMaintenanceWindowTaskConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoggingInfo() {
        software.amazon.jsii.Kernel.call(this, "resetLoggingInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPriority() {
        software.amazon.jsii.Kernel.call(this, "resetPriority", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTaskInvocationParameters() {
        software.amazon.jsii.Kernel.call(this, "resetTaskInvocationParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTaskParameters() {
        software.amazon.jsii.Kernel.call(this, "resetTaskParameters", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxConcurrencyInput() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrencyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxErrorsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxErrorsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets> getTargetsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTargets.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTaskArnInput() {
        return software.amazon.jsii.Kernel.get(this, "taskArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTaskTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "taskTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWindowIdInput() {
        return software.amazon.jsii.Kernel.get(this, "windowIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo> getLoggingInfoInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo>)(software.amazon.jsii.Kernel.get(this, "loggingInfoInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskLoggingInfo.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPriorityInput() {
        return software.amazon.jsii.Kernel.get(this, "priorityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> getTaskInvocationParametersInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters>)(software.amazon.jsii.Kernel.get(this, "taskInvocationParametersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters> getTaskParametersInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters>)(software.amazon.jsii.Kernel.get(this, "taskParametersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskParameters.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo> getLoggingInfo() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loggingInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskLoggingInfo.class))));
    }

    public void setLoggingInfo(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo> value) {
        software.amazon.jsii.Kernel.set(this, "loggingInfo", java.util.Objects.requireNonNull(value, "loggingInfo is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxConcurrency() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxConcurrency(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxConcurrency", java.util.Objects.requireNonNull(value, "maxConcurrency is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxErrors() {
        return software.amazon.jsii.Kernel.get(this, "maxErrors", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxErrors(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxErrors", java.util.Objects.requireNonNull(value, "maxErrors is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPriority() {
        return software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPriority(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "priority", java.util.Objects.requireNonNull(value, "priority is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRoleArn", java.util.Objects.requireNonNull(value, "serviceRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets> getTargets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTargets.class))));
    }

    public void setTargets(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets> value) {
        software.amazon.jsii.Kernel.set(this, "targets", java.util.Objects.requireNonNull(value, "targets is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTaskArn() {
        return software.amazon.jsii.Kernel.get(this, "taskArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTaskArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "taskArn", java.util.Objects.requireNonNull(value, "taskArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> getTaskInvocationParameters() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "taskInvocationParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters.class))));
    }

    public void setTaskInvocationParameters(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> value) {
        software.amazon.jsii.Kernel.set(this, "taskInvocationParameters", java.util.Objects.requireNonNull(value, "taskInvocationParameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters> getTaskParameters() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "taskParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskParameters.class))));
    }

    public void setTaskParameters(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters> value) {
        software.amazon.jsii.Kernel.set(this, "taskParameters", java.util.Objects.requireNonNull(value, "taskParameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTaskType() {
        return software.amazon.jsii.Kernel.get(this, "taskType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTaskType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "taskType", java.util.Objects.requireNonNull(value, "taskType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWindowId() {
        return software.amazon.jsii.Kernel.get(this, "windowId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWindowId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "windowId", java.util.Objects.requireNonNull(value, "windowId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SsmMaintenanceWindowTask}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SsmMaintenanceWindowTask> {
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
        private final imports.aws.SsmMaintenanceWindowTaskConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SsmMaintenanceWindowTaskConfig.Builder();
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
         * @param maxConcurrency This parameter is required.
         */
        public Builder maxConcurrency(final java.lang.String maxConcurrency) {
            this.config.maxConcurrency(maxConcurrency);
            return this;
        }

        /**
         * @return {@code this}
         * @param maxErrors This parameter is required.
         */
        public Builder maxErrors(final java.lang.String maxErrors) {
            this.config.maxErrors(maxErrors);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceRoleArn This parameter is required.
         */
        public Builder serviceRoleArn(final java.lang.String serviceRoleArn) {
            this.config.serviceRoleArn(serviceRoleArn);
            return this;
        }

        /**
         * targets block.
         * <p>
         * @return {@code this}
         * @param targets targets block. This parameter is required.
         */
        public Builder targets(final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTargets> targets) {
            this.config.targets(targets);
            return this;
        }

        /**
         * @return {@code this}
         * @param taskArn This parameter is required.
         */
        public Builder taskArn(final java.lang.String taskArn) {
            this.config.taskArn(taskArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param taskType This parameter is required.
         */
        public Builder taskType(final java.lang.String taskType) {
            this.config.taskType(taskType);
            return this;
        }

        /**
         * @return {@code this}
         * @param windowId This parameter is required.
         */
        public Builder windowId(final java.lang.String windowId) {
            this.config.windowId(windowId);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * logging_info block.
         * <p>
         * @return {@code this}
         * @param loggingInfo logging_info block. This parameter is required.
         */
        public Builder loggingInfo(final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskLoggingInfo> loggingInfo) {
            this.config.loggingInfo(loggingInfo);
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
         * @param priority This parameter is required.
         */
        public Builder priority(final java.lang.Number priority) {
            this.config.priority(priority);
            return this;
        }

        /**
         * task_invocation_parameters block.
         * <p>
         * @return {@code this}
         * @param taskInvocationParameters task_invocation_parameters block. This parameter is required.
         */
        public Builder taskInvocationParameters(final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters) {
            this.config.taskInvocationParameters(taskInvocationParameters);
            return this;
        }

        /**
         * task_parameters block.
         * <p>
         * @return {@code this}
         * @param taskParameters task_parameters block. This parameter is required.
         */
        public Builder taskParameters(final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskParameters> taskParameters) {
            this.config.taskParameters(taskParameters);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SsmMaintenanceWindowTask}.
         */
        @Override
        public imports.aws.SsmMaintenanceWindowTask build() {
            return new imports.aws.SsmMaintenanceWindowTask(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
