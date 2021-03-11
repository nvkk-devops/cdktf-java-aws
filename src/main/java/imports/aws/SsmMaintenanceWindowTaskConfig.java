package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.895Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmMaintenanceWindowTaskConfig")
@software.amazon.jsii.Jsii.Proxy(SsmMaintenanceWindowTaskConfig.Jsii$Proxy.class)
public interface SsmMaintenanceWindowTaskConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getMaxConcurrency();

    @org.jetbrains.annotations.NotNull java.lang.String getMaxErrors();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn();

    /**
     * targets block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets> getTargets();

    @org.jetbrains.annotations.NotNull java.lang.String getTaskArn();

    @org.jetbrains.annotations.NotNull java.lang.String getTaskType();

    @org.jetbrains.annotations.NotNull java.lang.String getWindowId();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * logging_info block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo> getLoggingInfo() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPriority() {
        return null;
    }

    /**
     * task_invocation_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> getTaskInvocationParameters() {
        return null;
    }

    /**
     * task_parameters block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters> getTaskParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmMaintenanceWindowTaskConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmMaintenanceWindowTaskConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmMaintenanceWindowTaskConfig> {
        private java.lang.String maxConcurrency;
        private java.lang.String maxErrors;
        private java.lang.String serviceRoleArn;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets> targets;
        private java.lang.String taskArn;
        private java.lang.String taskType;
        private java.lang.String windowId;
        private java.lang.String description;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo> loggingInfo;
        private java.lang.String name;
        private java.lang.Number priority;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters;
        private java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters> taskParameters;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getMaxConcurrency}
         * @param maxConcurrency the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder maxConcurrency(java.lang.String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getMaxErrors}
         * @param maxErrors the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder maxErrors(java.lang.String maxErrors) {
            this.maxErrors = maxErrors;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getServiceRoleArn}
         * @param serviceRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceRoleArn(java.lang.String serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getTargets}
         * @param targets targets block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targets(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTargets> targets) {
            this.targets = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets>)targets;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getTaskArn}
         * @param taskArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder taskArn(java.lang.String taskArn) {
            this.taskArn = taskArn;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getTaskType}
         * @param taskType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder taskType(java.lang.String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getWindowId}
         * @param windowId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder windowId(java.lang.String windowId) {
            this.windowId = windowId;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getLoggingInfo}
         * @param loggingInfo logging_info block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder loggingInfo(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskLoggingInfo> loggingInfo) {
            this.loggingInfo = (java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo>)loggingInfo;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getPriority}
         * @param priority the value to be set.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getTaskInvocationParameters}
         * @param taskInvocationParameters task_invocation_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder taskInvocationParameters(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters) {
            this.taskInvocationParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters>)taskInvocationParameters;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getTaskParameters}
         * @param taskParameters task_parameters block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder taskParameters(java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskParameters> taskParameters) {
            this.taskParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters>)taskParameters;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getDependsOn}
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
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowTaskConfig#getProvider}
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
         * @return a new instance of {@link SsmMaintenanceWindowTaskConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmMaintenanceWindowTaskConfig build() {
            return new Jsii$Proxy(maxConcurrency, maxErrors, serviceRoleArn, targets, taskArn, taskType, windowId, description, loggingInfo, name, priority, taskInvocationParameters, taskParameters, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SsmMaintenanceWindowTaskConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmMaintenanceWindowTaskConfig {
        private final java.lang.String maxConcurrency;
        private final java.lang.String maxErrors;
        private final java.lang.String serviceRoleArn;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets> targets;
        private final java.lang.String taskArn;
        private final java.lang.String taskType;
        private final java.lang.String windowId;
        private final java.lang.String description;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo> loggingInfo;
        private final java.lang.String name;
        private final java.lang.Number priority;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters;
        private final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters> taskParameters;
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
            this.maxConcurrency = software.amazon.jsii.Kernel.get(this, "maxConcurrency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxErrors = software.amazon.jsii.Kernel.get(this, "maxErrors", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceRoleArn = software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targets = software.amazon.jsii.Kernel.get(this, "targets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTargets.class)));
            this.taskArn = software.amazon.jsii.Kernel.get(this, "taskArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.taskType = software.amazon.jsii.Kernel.get(this, "taskType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.windowId = software.amazon.jsii.Kernel.get(this, "windowId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingInfo = software.amazon.jsii.Kernel.get(this, "loggingInfo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskLoggingInfo.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.taskInvocationParameters = software.amazon.jsii.Kernel.get(this, "taskInvocationParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters.class)));
            this.taskParameters = software.amazon.jsii.Kernel.get(this, "taskParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmMaintenanceWindowTaskTaskParameters.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String maxConcurrency, final java.lang.String maxErrors, final java.lang.String serviceRoleArn, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTargets> targets, final java.lang.String taskArn, final java.lang.String taskType, final java.lang.String windowId, final java.lang.String description, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskLoggingInfo> loggingInfo, final java.lang.String name, final java.lang.Number priority, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters, final java.util.List<? extends imports.aws.SsmMaintenanceWindowTaskTaskParameters> taskParameters, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxConcurrency = java.util.Objects.requireNonNull(maxConcurrency, "maxConcurrency is required");
            this.maxErrors = java.util.Objects.requireNonNull(maxErrors, "maxErrors is required");
            this.serviceRoleArn = java.util.Objects.requireNonNull(serviceRoleArn, "serviceRoleArn is required");
            this.targets = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets>)java.util.Objects.requireNonNull(targets, "targets is required");
            this.taskArn = java.util.Objects.requireNonNull(taskArn, "taskArn is required");
            this.taskType = java.util.Objects.requireNonNull(taskType, "taskType is required");
            this.windowId = java.util.Objects.requireNonNull(windowId, "windowId is required");
            this.description = description;
            this.loggingInfo = (java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo>)loggingInfo;
            this.name = name;
            this.priority = priority;
            this.taskInvocationParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters>)taskInvocationParameters;
            this.taskParameters = (java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters>)taskParameters;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        @Override
        public final java.lang.String getMaxErrors() {
            return this.maxErrors;
        }

        @Override
        public final java.lang.String getServiceRoleArn() {
            return this.serviceRoleArn;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTargets> getTargets() {
            return this.targets;
        }

        @Override
        public final java.lang.String getTaskArn() {
            return this.taskArn;
        }

        @Override
        public final java.lang.String getTaskType() {
            return this.taskType;
        }

        @Override
        public final java.lang.String getWindowId() {
            return this.windowId;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskLoggingInfo> getLoggingInfo() {
            return this.loggingInfo;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskInvocationParameters> getTaskInvocationParameters() {
            return this.taskInvocationParameters;
        }

        @Override
        public final java.util.List<imports.aws.SsmMaintenanceWindowTaskTaskParameters> getTaskParameters() {
            return this.taskParameters;
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

            data.set("maxConcurrency", om.valueToTree(this.getMaxConcurrency()));
            data.set("maxErrors", om.valueToTree(this.getMaxErrors()));
            data.set("serviceRoleArn", om.valueToTree(this.getServiceRoleArn()));
            data.set("targets", om.valueToTree(this.getTargets()));
            data.set("taskArn", om.valueToTree(this.getTaskArn()));
            data.set("taskType", om.valueToTree(this.getTaskType()));
            data.set("windowId", om.valueToTree(this.getWindowId()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getLoggingInfo() != null) {
                data.set("loggingInfo", om.valueToTree(this.getLoggingInfo()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getPriority() != null) {
                data.set("priority", om.valueToTree(this.getPriority()));
            }
            if (this.getTaskInvocationParameters() != null) {
                data.set("taskInvocationParameters", om.valueToTree(this.getTaskInvocationParameters()));
            }
            if (this.getTaskParameters() != null) {
                data.set("taskParameters", om.valueToTree(this.getTaskParameters()));
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
            struct.set("fqn", om.valueToTree("aws.SsmMaintenanceWindowTaskConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmMaintenanceWindowTaskConfig.Jsii$Proxy that = (SsmMaintenanceWindowTaskConfig.Jsii$Proxy) o;

            if (!maxConcurrency.equals(that.maxConcurrency)) return false;
            if (!maxErrors.equals(that.maxErrors)) return false;
            if (!serviceRoleArn.equals(that.serviceRoleArn)) return false;
            if (!targets.equals(that.targets)) return false;
            if (!taskArn.equals(that.taskArn)) return false;
            if (!taskType.equals(that.taskType)) return false;
            if (!windowId.equals(that.windowId)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.loggingInfo != null ? !this.loggingInfo.equals(that.loggingInfo) : that.loggingInfo != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.priority != null ? !this.priority.equals(that.priority) : that.priority != null) return false;
            if (this.taskInvocationParameters != null ? !this.taskInvocationParameters.equals(that.taskInvocationParameters) : that.taskInvocationParameters != null) return false;
            if (this.taskParameters != null ? !this.taskParameters.equals(that.taskParameters) : that.taskParameters != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxConcurrency.hashCode();
            result = 31 * result + (this.maxErrors.hashCode());
            result = 31 * result + (this.serviceRoleArn.hashCode());
            result = 31 * result + (this.targets.hashCode());
            result = 31 * result + (this.taskArn.hashCode());
            result = 31 * result + (this.taskType.hashCode());
            result = 31 * result + (this.windowId.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.loggingInfo != null ? this.loggingInfo.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
            result = 31 * result + (this.taskInvocationParameters != null ? this.taskInvocationParameters.hashCode() : 0);
            result = 31 * result + (this.taskParameters != null ? this.taskParameters.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
