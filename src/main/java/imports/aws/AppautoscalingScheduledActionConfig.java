package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.030Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppautoscalingScheduledActionConfig")
@software.amazon.jsii.Jsii.Proxy(AppautoscalingScheduledActionConfig.Jsii$Proxy.class)
public interface AppautoscalingScheduledActionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getResourceId();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceNamespace();

    default @org.jetbrains.annotations.Nullable java.lang.String getEndTime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getScalableDimension() {
        return null;
    }

    /**
     * scalable_target_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppautoscalingScheduledActionScalableTargetAction> getScalableTargetAction() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSchedule() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStartTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppautoscalingScheduledActionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppautoscalingScheduledActionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppautoscalingScheduledActionConfig> {
        private java.lang.String name;
        private java.lang.String resourceId;
        private java.lang.String serviceNamespace;
        private java.lang.String endTime;
        private java.lang.String scalableDimension;
        private java.util.List<imports.aws.AppautoscalingScheduledActionScalableTargetAction> scalableTargetAction;
        private java.lang.String schedule;
        private java.lang.String startTime;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getResourceId}
         * @param resourceId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceId(java.lang.String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getServiceNamespace}
         * @param serviceNamespace the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceNamespace(java.lang.String serviceNamespace) {
            this.serviceNamespace = serviceNamespace;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getEndTime}
         * @param endTime the value to be set.
         * @return {@code this}
         */
        public Builder endTime(java.lang.String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getScalableDimension}
         * @param scalableDimension the value to be set.
         * @return {@code this}
         */
        public Builder scalableDimension(java.lang.String scalableDimension) {
            this.scalableDimension = scalableDimension;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getScalableTargetAction}
         * @param scalableTargetAction scalable_target_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder scalableTargetAction(java.util.List<? extends imports.aws.AppautoscalingScheduledActionScalableTargetAction> scalableTargetAction) {
            this.scalableTargetAction = (java.util.List<imports.aws.AppautoscalingScheduledActionScalableTargetAction>)scalableTargetAction;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getSchedule}
         * @param schedule the value to be set.
         * @return {@code this}
         */
        public Builder schedule(java.lang.String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getStartTime}
         * @param startTime the value to be set.
         * @return {@code this}
         */
        public Builder startTime(java.lang.String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getDependsOn}
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
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingScheduledActionConfig#getProvider}
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
         * @return a new instance of {@link AppautoscalingScheduledActionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppautoscalingScheduledActionConfig build() {
            return new Jsii$Proxy(name, resourceId, serviceNamespace, endTime, scalableDimension, scalableTargetAction, schedule, startTime, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AppautoscalingScheduledActionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppautoscalingScheduledActionConfig {
        private final java.lang.String name;
        private final java.lang.String resourceId;
        private final java.lang.String serviceNamespace;
        private final java.lang.String endTime;
        private final java.lang.String scalableDimension;
        private final java.util.List<imports.aws.AppautoscalingScheduledActionScalableTargetAction> scalableTargetAction;
        private final java.lang.String schedule;
        private final java.lang.String startTime;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceId = software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceNamespace = software.amazon.jsii.Kernel.get(this, "serviceNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endTime = software.amazon.jsii.Kernel.get(this, "endTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scalableDimension = software.amazon.jsii.Kernel.get(this, "scalableDimension", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scalableTargetAction = software.amazon.jsii.Kernel.get(this, "scalableTargetAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppautoscalingScheduledActionScalableTargetAction.class)));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startTime = software.amazon.jsii.Kernel.get(this, "startTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String resourceId, final java.lang.String serviceNamespace, final java.lang.String endTime, final java.lang.String scalableDimension, final java.util.List<? extends imports.aws.AppautoscalingScheduledActionScalableTargetAction> scalableTargetAction, final java.lang.String schedule, final java.lang.String startTime, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.resourceId = java.util.Objects.requireNonNull(resourceId, "resourceId is required");
            this.serviceNamespace = java.util.Objects.requireNonNull(serviceNamespace, "serviceNamespace is required");
            this.endTime = endTime;
            this.scalableDimension = scalableDimension;
            this.scalableTargetAction = (java.util.List<imports.aws.AppautoscalingScheduledActionScalableTargetAction>)scalableTargetAction;
            this.schedule = schedule;
            this.startTime = startTime;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        @Override
        public final java.lang.String getServiceNamespace() {
            return this.serviceNamespace;
        }

        @Override
        public final java.lang.String getEndTime() {
            return this.endTime;
        }

        @Override
        public final java.lang.String getScalableDimension() {
            return this.scalableDimension;
        }

        @Override
        public final java.util.List<imports.aws.AppautoscalingScheduledActionScalableTargetAction> getScalableTargetAction() {
            return this.scalableTargetAction;
        }

        @Override
        public final java.lang.String getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.lang.String getStartTime() {
            return this.startTime;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("resourceId", om.valueToTree(this.getResourceId()));
            data.set("serviceNamespace", om.valueToTree(this.getServiceNamespace()));
            if (this.getEndTime() != null) {
                data.set("endTime", om.valueToTree(this.getEndTime()));
            }
            if (this.getScalableDimension() != null) {
                data.set("scalableDimension", om.valueToTree(this.getScalableDimension()));
            }
            if (this.getScalableTargetAction() != null) {
                data.set("scalableTargetAction", om.valueToTree(this.getScalableTargetAction()));
            }
            if (this.getSchedule() != null) {
                data.set("schedule", om.valueToTree(this.getSchedule()));
            }
            if (this.getStartTime() != null) {
                data.set("startTime", om.valueToTree(this.getStartTime()));
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
            struct.set("fqn", om.valueToTree("aws.AppautoscalingScheduledActionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppautoscalingScheduledActionConfig.Jsii$Proxy that = (AppautoscalingScheduledActionConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!resourceId.equals(that.resourceId)) return false;
            if (!serviceNamespace.equals(that.serviceNamespace)) return false;
            if (this.endTime != null ? !this.endTime.equals(that.endTime) : that.endTime != null) return false;
            if (this.scalableDimension != null ? !this.scalableDimension.equals(that.scalableDimension) : that.scalableDimension != null) return false;
            if (this.scalableTargetAction != null ? !this.scalableTargetAction.equals(that.scalableTargetAction) : that.scalableTargetAction != null) return false;
            if (this.schedule != null ? !this.schedule.equals(that.schedule) : that.schedule != null) return false;
            if (this.startTime != null ? !this.startTime.equals(that.startTime) : that.startTime != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.resourceId.hashCode());
            result = 31 * result + (this.serviceNamespace.hashCode());
            result = 31 * result + (this.endTime != null ? this.endTime.hashCode() : 0);
            result = 31 * result + (this.scalableDimension != null ? this.scalableDimension.hashCode() : 0);
            result = 31 * result + (this.scalableTargetAction != null ? this.scalableTargetAction.hashCode() : 0);
            result = 31 * result + (this.schedule != null ? this.schedule.hashCode() : 0);
            result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
