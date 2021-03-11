package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.157Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchEventTargetEcsTarget")
@software.amazon.jsii.Jsii.Proxy(CloudwatchEventTargetEcsTarget.Jsii$Proxy.class)
public interface CloudwatchEventTargetEcsTarget extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getTaskDefinitionArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLaunchType() {
        return null;
    }

    /**
     * network_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration> getNetworkConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlatformVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTaskCount() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchEventTargetEcsTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchEventTargetEcsTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchEventTargetEcsTarget> {
        private java.lang.String taskDefinitionArn;
        private java.lang.String group;
        private java.lang.String launchType;
        private java.util.List<imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration> networkConfiguration;
        private java.lang.String platformVersion;
        private java.lang.Number taskCount;

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getTaskDefinitionArn}
         * @param taskDefinitionArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder taskDefinitionArn(java.lang.String taskDefinitionArn) {
            this.taskDefinitionArn = taskDefinitionArn;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getGroup}
         * @param group the value to be set.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getLaunchType}
         * @param launchType the value to be set.
         * @return {@code this}
         */
        public Builder launchType(java.lang.String launchType) {
            this.launchType = launchType;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getNetworkConfiguration}
         * @param networkConfiguration network_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder networkConfiguration(java.util.List<? extends imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration> networkConfiguration) {
            this.networkConfiguration = (java.util.List<imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration>)networkConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getPlatformVersion}
         * @param platformVersion the value to be set.
         * @return {@code this}
         */
        public Builder platformVersion(java.lang.String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getTaskCount}
         * @param taskCount the value to be set.
         * @return {@code this}
         */
        public Builder taskCount(java.lang.Number taskCount) {
            this.taskCount = taskCount;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchEventTargetEcsTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchEventTargetEcsTarget build() {
            return new Jsii$Proxy(taskDefinitionArn, group, launchType, networkConfiguration, platformVersion, taskCount);
        }
    }

    /**
     * An implementation for {@link CloudwatchEventTargetEcsTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchEventTargetEcsTarget {
        private final java.lang.String taskDefinitionArn;
        private final java.lang.String group;
        private final java.lang.String launchType;
        private final java.util.List<imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration> networkConfiguration;
        private final java.lang.String platformVersion;
        private final java.lang.Number taskCount;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.taskDefinitionArn = software.amazon.jsii.Kernel.get(this, "taskDefinitionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchType = software.amazon.jsii.Kernel.get(this, "launchType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkConfiguration = software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration.class)));
            this.platformVersion = software.amazon.jsii.Kernel.get(this, "platformVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.taskCount = software.amazon.jsii.Kernel.get(this, "taskCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String taskDefinitionArn, final java.lang.String group, final java.lang.String launchType, final java.util.List<? extends imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration> networkConfiguration, final java.lang.String platformVersion, final java.lang.Number taskCount) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.taskDefinitionArn = java.util.Objects.requireNonNull(taskDefinitionArn, "taskDefinitionArn is required");
            this.group = group;
            this.launchType = launchType;
            this.networkConfiguration = (java.util.List<imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration>)networkConfiguration;
            this.platformVersion = platformVersion;
            this.taskCount = taskCount;
        }

        @Override
        public final java.lang.String getTaskDefinitionArn() {
            return this.taskDefinitionArn;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getLaunchType() {
            return this.launchType;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchEventTargetEcsTargetNetworkConfiguration> getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        @Override
        public final java.lang.String getPlatformVersion() {
            return this.platformVersion;
        }

        @Override
        public final java.lang.Number getTaskCount() {
            return this.taskCount;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("taskDefinitionArn", om.valueToTree(this.getTaskDefinitionArn()));
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getLaunchType() != null) {
                data.set("launchType", om.valueToTree(this.getLaunchType()));
            }
            if (this.getNetworkConfiguration() != null) {
                data.set("networkConfiguration", om.valueToTree(this.getNetworkConfiguration()));
            }
            if (this.getPlatformVersion() != null) {
                data.set("platformVersion", om.valueToTree(this.getPlatformVersion()));
            }
            if (this.getTaskCount() != null) {
                data.set("taskCount", om.valueToTree(this.getTaskCount()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudwatchEventTargetEcsTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchEventTargetEcsTarget.Jsii$Proxy that = (CloudwatchEventTargetEcsTarget.Jsii$Proxy) o;

            if (!taskDefinitionArn.equals(that.taskDefinitionArn)) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.launchType != null ? !this.launchType.equals(that.launchType) : that.launchType != null) return false;
            if (this.networkConfiguration != null ? !this.networkConfiguration.equals(that.networkConfiguration) : that.networkConfiguration != null) return false;
            if (this.platformVersion != null ? !this.platformVersion.equals(that.platformVersion) : that.platformVersion != null) return false;
            return this.taskCount != null ? this.taskCount.equals(that.taskCount) : that.taskCount == null;
        }

        @Override
        public final int hashCode() {
            int result = this.taskDefinitionArn.hashCode();
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.launchType != null ? this.launchType.hashCode() : 0);
            result = 31 * result + (this.networkConfiguration != null ? this.networkConfiguration.hashCode() : 0);
            result = 31 * result + (this.platformVersion != null ? this.platformVersion.hashCode() : 0);
            result = 31 * result + (this.taskCount != null ? this.taskCount.hashCode() : 0);
            return result;
        }
    }
}
