package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.077Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingScheduleConfig")
@software.amazon.jsii.Jsii.Proxy(AutoscalingScheduleConfig.Jsii$Proxy.class)
public interface AutoscalingScheduleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingGroupName();

    @org.jetbrains.annotations.NotNull java.lang.String getScheduledActionName();

    default @org.jetbrains.annotations.Nullable java.lang.Number getDesiredCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEndTime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRecurrence() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStartTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingScheduleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingScheduleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingScheduleConfig> {
        private java.lang.String autoscalingGroupName;
        private java.lang.String scheduledActionName;
        private java.lang.Number desiredCapacity;
        private java.lang.String endTime;
        private java.lang.Number maxSize;
        private java.lang.Number minSize;
        private java.lang.String recurrence;
        private java.lang.String startTime;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getAutoscalingGroupName}
         * @param autoscalingGroupName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder autoscalingGroupName(java.lang.String autoscalingGroupName) {
            this.autoscalingGroupName = autoscalingGroupName;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getScheduledActionName}
         * @param scheduledActionName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder scheduledActionName(java.lang.String scheduledActionName) {
            this.scheduledActionName = scheduledActionName;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getDesiredCapacity}
         * @param desiredCapacity the value to be set.
         * @return {@code this}
         */
        public Builder desiredCapacity(java.lang.Number desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getEndTime}
         * @param endTime the value to be set.
         * @return {@code this}
         */
        public Builder endTime(java.lang.String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getMaxSize}
         * @param maxSize the value to be set.
         * @return {@code this}
         */
        public Builder maxSize(java.lang.Number maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getMinSize}
         * @param minSize the value to be set.
         * @return {@code this}
         */
        public Builder minSize(java.lang.Number minSize) {
            this.minSize = minSize;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getRecurrence}
         * @param recurrence the value to be set.
         * @return {@code this}
         */
        public Builder recurrence(java.lang.String recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getStartTime}
         * @param startTime the value to be set.
         * @return {@code this}
         */
        public Builder startTime(java.lang.String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getDependsOn}
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
         * Sets the value of {@link AutoscalingScheduleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingScheduleConfig#getProvider}
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
         * @return a new instance of {@link AutoscalingScheduleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingScheduleConfig build() {
            return new Jsii$Proxy(autoscalingGroupName, scheduledActionName, desiredCapacity, endTime, maxSize, minSize, recurrence, startTime, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AutoscalingScheduleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingScheduleConfig {
        private final java.lang.String autoscalingGroupName;
        private final java.lang.String scheduledActionName;
        private final java.lang.Number desiredCapacity;
        private final java.lang.String endTime;
        private final java.lang.Number maxSize;
        private final java.lang.Number minSize;
        private final java.lang.String recurrence;
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
            this.autoscalingGroupName = software.amazon.jsii.Kernel.get(this, "autoscalingGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scheduledActionName = software.amazon.jsii.Kernel.get(this, "scheduledActionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.desiredCapacity = software.amazon.jsii.Kernel.get(this, "desiredCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.endTime = software.amazon.jsii.Kernel.get(this, "endTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxSize = software.amazon.jsii.Kernel.get(this, "maxSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minSize = software.amazon.jsii.Kernel.get(this, "minSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.recurrence = software.amazon.jsii.Kernel.get(this, "recurrence", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String autoscalingGroupName, final java.lang.String scheduledActionName, final java.lang.Number desiredCapacity, final java.lang.String endTime, final java.lang.Number maxSize, final java.lang.Number minSize, final java.lang.String recurrence, final java.lang.String startTime, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoscalingGroupName = java.util.Objects.requireNonNull(autoscalingGroupName, "autoscalingGroupName is required");
            this.scheduledActionName = java.util.Objects.requireNonNull(scheduledActionName, "scheduledActionName is required");
            this.desiredCapacity = desiredCapacity;
            this.endTime = endTime;
            this.maxSize = maxSize;
            this.minSize = minSize;
            this.recurrence = recurrence;
            this.startTime = startTime;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAutoscalingGroupName() {
            return this.autoscalingGroupName;
        }

        @Override
        public final java.lang.String getScheduledActionName() {
            return this.scheduledActionName;
        }

        @Override
        public final java.lang.Number getDesiredCapacity() {
            return this.desiredCapacity;
        }

        @Override
        public final java.lang.String getEndTime() {
            return this.endTime;
        }

        @Override
        public final java.lang.Number getMaxSize() {
            return this.maxSize;
        }

        @Override
        public final java.lang.Number getMinSize() {
            return this.minSize;
        }

        @Override
        public final java.lang.String getRecurrence() {
            return this.recurrence;
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

            data.set("autoscalingGroupName", om.valueToTree(this.getAutoscalingGroupName()));
            data.set("scheduledActionName", om.valueToTree(this.getScheduledActionName()));
            if (this.getDesiredCapacity() != null) {
                data.set("desiredCapacity", om.valueToTree(this.getDesiredCapacity()));
            }
            if (this.getEndTime() != null) {
                data.set("endTime", om.valueToTree(this.getEndTime()));
            }
            if (this.getMaxSize() != null) {
                data.set("maxSize", om.valueToTree(this.getMaxSize()));
            }
            if (this.getMinSize() != null) {
                data.set("minSize", om.valueToTree(this.getMinSize()));
            }
            if (this.getRecurrence() != null) {
                data.set("recurrence", om.valueToTree(this.getRecurrence()));
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
            struct.set("fqn", om.valueToTree("aws.AutoscalingScheduleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingScheduleConfig.Jsii$Proxy that = (AutoscalingScheduleConfig.Jsii$Proxy) o;

            if (!autoscalingGroupName.equals(that.autoscalingGroupName)) return false;
            if (!scheduledActionName.equals(that.scheduledActionName)) return false;
            if (this.desiredCapacity != null ? !this.desiredCapacity.equals(that.desiredCapacity) : that.desiredCapacity != null) return false;
            if (this.endTime != null ? !this.endTime.equals(that.endTime) : that.endTime != null) return false;
            if (this.maxSize != null ? !this.maxSize.equals(that.maxSize) : that.maxSize != null) return false;
            if (this.minSize != null ? !this.minSize.equals(that.minSize) : that.minSize != null) return false;
            if (this.recurrence != null ? !this.recurrence.equals(that.recurrence) : that.recurrence != null) return false;
            if (this.startTime != null ? !this.startTime.equals(that.startTime) : that.startTime != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoscalingGroupName.hashCode();
            result = 31 * result + (this.scheduledActionName.hashCode());
            result = 31 * result + (this.desiredCapacity != null ? this.desiredCapacity.hashCode() : 0);
            result = 31 * result + (this.endTime != null ? this.endTime.hashCode() : 0);
            result = 31 * result + (this.maxSize != null ? this.maxSize.hashCode() : 0);
            result = 31 * result + (this.minSize != null ? this.minSize.hashCode() : 0);
            result = 31 * result + (this.recurrence != null ? this.recurrence.hashCode() : 0);
            result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
