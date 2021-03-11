package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.065Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingLifecycleHookConfig")
@software.amazon.jsii.Jsii.Proxy(AutoscalingLifecycleHookConfig.Jsii$Proxy.class)
public interface AutoscalingLifecycleHookConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAutoscalingGroupName();

    @org.jetbrains.annotations.NotNull java.lang.String getLifecycleTransition();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultResult() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHeartbeatTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNotificationMetadata() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNotificationTargetArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRoleArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingLifecycleHookConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingLifecycleHookConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingLifecycleHookConfig> {
        private java.lang.String autoscalingGroupName;
        private java.lang.String lifecycleTransition;
        private java.lang.String name;
        private java.lang.String defaultResult;
        private java.lang.Number heartbeatTimeout;
        private java.lang.String notificationMetadata;
        private java.lang.String notificationTargetArn;
        private java.lang.String roleArn;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getAutoscalingGroupName}
         * @param autoscalingGroupName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder autoscalingGroupName(java.lang.String autoscalingGroupName) {
            this.autoscalingGroupName = autoscalingGroupName;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getLifecycleTransition}
         * @param lifecycleTransition the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder lifecycleTransition(java.lang.String lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getDefaultResult}
         * @param defaultResult the value to be set.
         * @return {@code this}
         */
        public Builder defaultResult(java.lang.String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getHeartbeatTimeout}
         * @param heartbeatTimeout the value to be set.
         * @return {@code this}
         */
        public Builder heartbeatTimeout(java.lang.Number heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getNotificationMetadata}
         * @param notificationMetadata the value to be set.
         * @return {@code this}
         */
        public Builder notificationMetadata(java.lang.String notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getNotificationTargetArn}
         * @param notificationTargetArn the value to be set.
         * @return {@code this}
         */
        public Builder notificationTargetArn(java.lang.String notificationTargetArn) {
            this.notificationTargetArn = notificationTargetArn;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getRoleArn}
         * @param roleArn the value to be set.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getDependsOn}
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
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingLifecycleHookConfig#getProvider}
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
         * @return a new instance of {@link AutoscalingLifecycleHookConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingLifecycleHookConfig build() {
            return new Jsii$Proxy(autoscalingGroupName, lifecycleTransition, name, defaultResult, heartbeatTimeout, notificationMetadata, notificationTargetArn, roleArn, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AutoscalingLifecycleHookConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingLifecycleHookConfig {
        private final java.lang.String autoscalingGroupName;
        private final java.lang.String lifecycleTransition;
        private final java.lang.String name;
        private final java.lang.String defaultResult;
        private final java.lang.Number heartbeatTimeout;
        private final java.lang.String notificationMetadata;
        private final java.lang.String notificationTargetArn;
        private final java.lang.String roleArn;
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
            this.lifecycleTransition = software.amazon.jsii.Kernel.get(this, "lifecycleTransition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultResult = software.amazon.jsii.Kernel.get(this, "defaultResult", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.heartbeatTimeout = software.amazon.jsii.Kernel.get(this, "heartbeatTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.notificationMetadata = software.amazon.jsii.Kernel.get(this, "notificationMetadata", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notificationTargetArn = software.amazon.jsii.Kernel.get(this, "notificationTargetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String autoscalingGroupName, final java.lang.String lifecycleTransition, final java.lang.String name, final java.lang.String defaultResult, final java.lang.Number heartbeatTimeout, final java.lang.String notificationMetadata, final java.lang.String notificationTargetArn, final java.lang.String roleArn, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoscalingGroupName = java.util.Objects.requireNonNull(autoscalingGroupName, "autoscalingGroupName is required");
            this.lifecycleTransition = java.util.Objects.requireNonNull(lifecycleTransition, "lifecycleTransition is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.defaultResult = defaultResult;
            this.heartbeatTimeout = heartbeatTimeout;
            this.notificationMetadata = notificationMetadata;
            this.notificationTargetArn = notificationTargetArn;
            this.roleArn = roleArn;
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
        public final java.lang.String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getDefaultResult() {
            return this.defaultResult;
        }

        @Override
        public final java.lang.Number getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

        @Override
        public final java.lang.String getNotificationMetadata() {
            return this.notificationMetadata;
        }

        @Override
        public final java.lang.String getNotificationTargetArn() {
            return this.notificationTargetArn;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
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
            data.set("lifecycleTransition", om.valueToTree(this.getLifecycleTransition()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDefaultResult() != null) {
                data.set("defaultResult", om.valueToTree(this.getDefaultResult()));
            }
            if (this.getHeartbeatTimeout() != null) {
                data.set("heartbeatTimeout", om.valueToTree(this.getHeartbeatTimeout()));
            }
            if (this.getNotificationMetadata() != null) {
                data.set("notificationMetadata", om.valueToTree(this.getNotificationMetadata()));
            }
            if (this.getNotificationTargetArn() != null) {
                data.set("notificationTargetArn", om.valueToTree(this.getNotificationTargetArn()));
            }
            if (this.getRoleArn() != null) {
                data.set("roleArn", om.valueToTree(this.getRoleArn()));
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
            struct.set("fqn", om.valueToTree("aws.AutoscalingLifecycleHookConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingLifecycleHookConfig.Jsii$Proxy that = (AutoscalingLifecycleHookConfig.Jsii$Proxy) o;

            if (!autoscalingGroupName.equals(that.autoscalingGroupName)) return false;
            if (!lifecycleTransition.equals(that.lifecycleTransition)) return false;
            if (!name.equals(that.name)) return false;
            if (this.defaultResult != null ? !this.defaultResult.equals(that.defaultResult) : that.defaultResult != null) return false;
            if (this.heartbeatTimeout != null ? !this.heartbeatTimeout.equals(that.heartbeatTimeout) : that.heartbeatTimeout != null) return false;
            if (this.notificationMetadata != null ? !this.notificationMetadata.equals(that.notificationMetadata) : that.notificationMetadata != null) return false;
            if (this.notificationTargetArn != null ? !this.notificationTargetArn.equals(that.notificationTargetArn) : that.notificationTargetArn != null) return false;
            if (this.roleArn != null ? !this.roleArn.equals(that.roleArn) : that.roleArn != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoscalingGroupName.hashCode();
            result = 31 * result + (this.lifecycleTransition.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.defaultResult != null ? this.defaultResult.hashCode() : 0);
            result = 31 * result + (this.heartbeatTimeout != null ? this.heartbeatTimeout.hashCode() : 0);
            result = 31 * result + (this.notificationMetadata != null ? this.notificationMetadata.hashCode() : 0);
            result = 31 * result + (this.notificationTargetArn != null ? this.notificationTargetArn.hashCode() : 0);
            result = 31 * result + (this.roleArn != null ? this.roleArn.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
