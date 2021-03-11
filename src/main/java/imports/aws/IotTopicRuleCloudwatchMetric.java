package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.640Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleCloudwatchMetric")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleCloudwatchMetric.Jsii$Proxy.class)
public interface IotTopicRuleCloudwatchMetric extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getMetricName();

    @org.jetbrains.annotations.NotNull java.lang.String getMetricNamespace();

    @org.jetbrains.annotations.NotNull java.lang.String getMetricUnit();

    @org.jetbrains.annotations.NotNull java.lang.String getMetricValue();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getMetricTimestamp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleCloudwatchMetric}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleCloudwatchMetric}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleCloudwatchMetric> {
        private java.lang.String metricName;
        private java.lang.String metricNamespace;
        private java.lang.String metricUnit;
        private java.lang.String metricValue;
        private java.lang.String roleArn;
        private java.lang.String metricTimestamp;

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchMetric#getMetricName}
         * @param metricName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchMetric#getMetricNamespace}
         * @param metricNamespace the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder metricNamespace(java.lang.String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchMetric#getMetricUnit}
         * @param metricUnit the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder metricUnit(java.lang.String metricUnit) {
            this.metricUnit = metricUnit;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchMetric#getMetricValue}
         * @param metricValue the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder metricValue(java.lang.String metricValue) {
            this.metricValue = metricValue;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchMetric#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchMetric#getMetricTimestamp}
         * @param metricTimestamp the value to be set.
         * @return {@code this}
         */
        public Builder metricTimestamp(java.lang.String metricTimestamp) {
            this.metricTimestamp = metricTimestamp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleCloudwatchMetric}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleCloudwatchMetric build() {
            return new Jsii$Proxy(metricName, metricNamespace, metricUnit, metricValue, roleArn, metricTimestamp);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleCloudwatchMetric}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleCloudwatchMetric {
        private final java.lang.String metricName;
        private final java.lang.String metricNamespace;
        private final java.lang.String metricUnit;
        private final java.lang.String metricValue;
        private final java.lang.String roleArn;
        private final java.lang.String metricTimestamp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricNamespace = software.amazon.jsii.Kernel.get(this, "metricNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricUnit = software.amazon.jsii.Kernel.get(this, "metricUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricValue = software.amazon.jsii.Kernel.get(this, "metricValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricTimestamp = software.amazon.jsii.Kernel.get(this, "metricTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String metricName, final java.lang.String metricNamespace, final java.lang.String metricUnit, final java.lang.String metricValue, final java.lang.String roleArn, final java.lang.String metricTimestamp) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metricName = java.util.Objects.requireNonNull(metricName, "metricName is required");
            this.metricNamespace = java.util.Objects.requireNonNull(metricNamespace, "metricNamespace is required");
            this.metricUnit = java.util.Objects.requireNonNull(metricUnit, "metricUnit is required");
            this.metricValue = java.util.Objects.requireNonNull(metricValue, "metricValue is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.metricTimestamp = metricTimestamp;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final java.lang.String getMetricNamespace() {
            return this.metricNamespace;
        }

        @Override
        public final java.lang.String getMetricUnit() {
            return this.metricUnit;
        }

        @Override
        public final java.lang.String getMetricValue() {
            return this.metricValue;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getMetricTimestamp() {
            return this.metricTimestamp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metricName", om.valueToTree(this.getMetricName()));
            data.set("metricNamespace", om.valueToTree(this.getMetricNamespace()));
            data.set("metricUnit", om.valueToTree(this.getMetricUnit()));
            data.set("metricValue", om.valueToTree(this.getMetricValue()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getMetricTimestamp() != null) {
                data.set("metricTimestamp", om.valueToTree(this.getMetricTimestamp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleCloudwatchMetric"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleCloudwatchMetric.Jsii$Proxy that = (IotTopicRuleCloudwatchMetric.Jsii$Proxy) o;

            if (!metricName.equals(that.metricName)) return false;
            if (!metricNamespace.equals(that.metricNamespace)) return false;
            if (!metricUnit.equals(that.metricUnit)) return false;
            if (!metricValue.equals(that.metricValue)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            return this.metricTimestamp != null ? this.metricTimestamp.equals(that.metricTimestamp) : that.metricTimestamp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metricName.hashCode();
            result = 31 * result + (this.metricNamespace.hashCode());
            result = 31 * result + (this.metricUnit.hashCode());
            result = 31 * result + (this.metricValue.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.metricTimestamp != null ? this.metricTimestamp.hashCode() : 0);
            return result;
        }
    }
}
