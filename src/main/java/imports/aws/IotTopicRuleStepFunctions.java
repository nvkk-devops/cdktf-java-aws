package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.644Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleStepFunctions")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleStepFunctions.Jsii$Proxy.class)
public interface IotTopicRuleStepFunctions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getStateMachineName();

    default @org.jetbrains.annotations.Nullable java.lang.String getExecutionNamePrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleStepFunctions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleStepFunctions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleStepFunctions> {
        private java.lang.String roleArn;
        private java.lang.String stateMachineName;
        private java.lang.String executionNamePrefix;

        /**
         * Sets the value of {@link IotTopicRuleStepFunctions#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleStepFunctions#getStateMachineName}
         * @param stateMachineName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stateMachineName(java.lang.String stateMachineName) {
            this.stateMachineName = stateMachineName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleStepFunctions#getExecutionNamePrefix}
         * @param executionNamePrefix the value to be set.
         * @return {@code this}
         */
        public Builder executionNamePrefix(java.lang.String executionNamePrefix) {
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleStepFunctions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleStepFunctions build() {
            return new Jsii$Proxy(roleArn, stateMachineName, executionNamePrefix);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleStepFunctions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleStepFunctions {
        private final java.lang.String roleArn;
        private final java.lang.String stateMachineName;
        private final java.lang.String executionNamePrefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stateMachineName = software.amazon.jsii.Kernel.get(this, "stateMachineName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.executionNamePrefix = software.amazon.jsii.Kernel.get(this, "executionNamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String roleArn, final java.lang.String stateMachineName, final java.lang.String executionNamePrefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.stateMachineName = java.util.Objects.requireNonNull(stateMachineName, "stateMachineName is required");
            this.executionNamePrefix = executionNamePrefix;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getStateMachineName() {
            return this.stateMachineName;
        }

        @Override
        public final java.lang.String getExecutionNamePrefix() {
            return this.executionNamePrefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("stateMachineName", om.valueToTree(this.getStateMachineName()));
            if (this.getExecutionNamePrefix() != null) {
                data.set("executionNamePrefix", om.valueToTree(this.getExecutionNamePrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleStepFunctions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleStepFunctions.Jsii$Proxy that = (IotTopicRuleStepFunctions.Jsii$Proxy) o;

            if (!roleArn.equals(that.roleArn)) return false;
            if (!stateMachineName.equals(that.stateMachineName)) return false;
            return this.executionNamePrefix != null ? this.executionNamePrefix.equals(that.executionNamePrefix) : that.executionNamePrefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.roleArn.hashCode();
            result = 31 * result + (this.stateMachineName.hashCode());
            result = 31 * result + (this.executionNamePrefix != null ? this.executionNamePrefix.hashCode() : 0);
            return result;
        }
    }
}
