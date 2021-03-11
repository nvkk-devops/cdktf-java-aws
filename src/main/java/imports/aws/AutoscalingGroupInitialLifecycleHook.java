package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.063Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingGroupInitialLifecycleHook")
@software.amazon.jsii.Jsii.Proxy(AutoscalingGroupInitialLifecycleHook.Jsii$Proxy.class)
public interface AutoscalingGroupInitialLifecycleHook extends software.amazon.jsii.JsiiSerializable {

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
     * @return a {@link Builder} of {@link AutoscalingGroupInitialLifecycleHook}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingGroupInitialLifecycleHook}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingGroupInitialLifecycleHook> {
        private java.lang.String lifecycleTransition;
        private java.lang.String name;
        private java.lang.String defaultResult;
        private java.lang.Number heartbeatTimeout;
        private java.lang.String notificationMetadata;
        private java.lang.String notificationTargetArn;
        private java.lang.String roleArn;

        /**
         * Sets the value of {@link AutoscalingGroupInitialLifecycleHook#getLifecycleTransition}
         * @param lifecycleTransition the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder lifecycleTransition(java.lang.String lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInitialLifecycleHook#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInitialLifecycleHook#getDefaultResult}
         * @param defaultResult the value to be set.
         * @return {@code this}
         */
        public Builder defaultResult(java.lang.String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInitialLifecycleHook#getHeartbeatTimeout}
         * @param heartbeatTimeout the value to be set.
         * @return {@code this}
         */
        public Builder heartbeatTimeout(java.lang.Number heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInitialLifecycleHook#getNotificationMetadata}
         * @param notificationMetadata the value to be set.
         * @return {@code this}
         */
        public Builder notificationMetadata(java.lang.String notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInitialLifecycleHook#getNotificationTargetArn}
         * @param notificationTargetArn the value to be set.
         * @return {@code this}
         */
        public Builder notificationTargetArn(java.lang.String notificationTargetArn) {
            this.notificationTargetArn = notificationTargetArn;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInitialLifecycleHook#getRoleArn}
         * @param roleArn the value to be set.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AutoscalingGroupInitialLifecycleHook}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingGroupInitialLifecycleHook build() {
            return new Jsii$Proxy(lifecycleTransition, name, defaultResult, heartbeatTimeout, notificationMetadata, notificationTargetArn, roleArn);
        }
    }

    /**
     * An implementation for {@link AutoscalingGroupInitialLifecycleHook}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingGroupInitialLifecycleHook {
        private final java.lang.String lifecycleTransition;
        private final java.lang.String name;
        private final java.lang.String defaultResult;
        private final java.lang.Number heartbeatTimeout;
        private final java.lang.String notificationMetadata;
        private final java.lang.String notificationTargetArn;
        private final java.lang.String roleArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.lifecycleTransition = software.amazon.jsii.Kernel.get(this, "lifecycleTransition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultResult = software.amazon.jsii.Kernel.get(this, "defaultResult", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.heartbeatTimeout = software.amazon.jsii.Kernel.get(this, "heartbeatTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.notificationMetadata = software.amazon.jsii.Kernel.get(this, "notificationMetadata", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notificationTargetArn = software.amazon.jsii.Kernel.get(this, "notificationTargetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String lifecycleTransition, final java.lang.String name, final java.lang.String defaultResult, final java.lang.Number heartbeatTimeout, final java.lang.String notificationMetadata, final java.lang.String notificationTargetArn, final java.lang.String roleArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.lifecycleTransition = java.util.Objects.requireNonNull(lifecycleTransition, "lifecycleTransition is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.defaultResult = defaultResult;
            this.heartbeatTimeout = heartbeatTimeout;
            this.notificationMetadata = notificationMetadata;
            this.notificationTargetArn = notificationTargetArn;
            this.roleArn = roleArn;
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

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

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AutoscalingGroupInitialLifecycleHook"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingGroupInitialLifecycleHook.Jsii$Proxy that = (AutoscalingGroupInitialLifecycleHook.Jsii$Proxy) o;

            if (!lifecycleTransition.equals(that.lifecycleTransition)) return false;
            if (!name.equals(that.name)) return false;
            if (this.defaultResult != null ? !this.defaultResult.equals(that.defaultResult) : that.defaultResult != null) return false;
            if (this.heartbeatTimeout != null ? !this.heartbeatTimeout.equals(that.heartbeatTimeout) : that.heartbeatTimeout != null) return false;
            if (this.notificationMetadata != null ? !this.notificationMetadata.equals(that.notificationMetadata) : that.notificationMetadata != null) return false;
            if (this.notificationTargetArn != null ? !this.notificationTargetArn.equals(that.notificationTargetArn) : that.notificationTargetArn != null) return false;
            return this.roleArn != null ? this.roleArn.equals(that.roleArn) : that.roleArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.lifecycleTransition.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.defaultResult != null ? this.defaultResult.hashCode() : 0);
            result = 31 * result + (this.heartbeatTimeout != null ? this.heartbeatTimeout.hashCode() : 0);
            result = 31 * result + (this.notificationMetadata != null ? this.notificationMetadata.hashCode() : 0);
            result = 31 * result + (this.notificationTargetArn != null ? this.notificationTargetArn.hashCode() : 0);
            result = 31 * result + (this.roleArn != null ? this.roleArn.hashCode() : 0);
            return result;
        }
    }
}
