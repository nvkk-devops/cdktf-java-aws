package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.164Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchMetricAlarmMetricQuery")
@software.amazon.jsii.Jsii.Proxy(CloudwatchMetricAlarmMetricQuery.Jsii$Proxy.class)
public interface CloudwatchMetricAlarmMetricQuery extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getId();

    default @org.jetbrains.annotations.Nullable java.lang.String getExpression() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLabel() {
        return null;
    }

    /**
     * metric block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchMetricAlarmMetricQueryMetric> getMetric() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReturnData() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchMetricAlarmMetricQuery}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchMetricAlarmMetricQuery}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchMetricAlarmMetricQuery> {
        private java.lang.String id;
        private java.lang.String expression;
        private java.lang.String label;
        private java.util.List<imports.aws.CloudwatchMetricAlarmMetricQueryMetric> metric;
        private java.lang.Boolean returnData;

        /**
         * Sets the value of {@link CloudwatchMetricAlarmMetricQuery#getId}
         * @param id the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmMetricQuery#getExpression}
         * @param expression the value to be set.
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmMetricQuery#getLabel}
         * @param label the value to be set.
         * @return {@code this}
         */
        public Builder label(java.lang.String label) {
            this.label = label;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmMetricQuery#getMetric}
         * @param metric metric block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder metric(java.util.List<? extends imports.aws.CloudwatchMetricAlarmMetricQueryMetric> metric) {
            this.metric = (java.util.List<imports.aws.CloudwatchMetricAlarmMetricQueryMetric>)metric;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmMetricQuery#getReturnData}
         * @param returnData the value to be set.
         * @return {@code this}
         */
        public Builder returnData(java.lang.Boolean returnData) {
            this.returnData = returnData;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchMetricAlarmMetricQuery}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchMetricAlarmMetricQuery build() {
            return new Jsii$Proxy(id, expression, label, metric, returnData);
        }
    }

    /**
     * An implementation for {@link CloudwatchMetricAlarmMetricQuery}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchMetricAlarmMetricQuery {
        private final java.lang.String id;
        private final java.lang.String expression;
        private final java.lang.String label;
        private final java.util.List<imports.aws.CloudwatchMetricAlarmMetricQueryMetric> metric;
        private final java.lang.Boolean returnData;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expression = software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.label = software.amazon.jsii.Kernel.get(this, "label", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metric = software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchMetricAlarmMetricQueryMetric.class)));
            this.returnData = software.amazon.jsii.Kernel.get(this, "returnData", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String id, final java.lang.String expression, final java.lang.String label, final java.util.List<? extends imports.aws.CloudwatchMetricAlarmMetricQueryMetric> metric, final java.lang.Boolean returnData) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.id = java.util.Objects.requireNonNull(id, "id is required");
            this.expression = expression;
            this.label = label;
            this.metric = (java.util.List<imports.aws.CloudwatchMetricAlarmMetricQueryMetric>)metric;
            this.returnData = returnData;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getExpression() {
            return this.expression;
        }

        @Override
        public final java.lang.String getLabel() {
            return this.label;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchMetricAlarmMetricQueryMetric> getMetric() {
            return this.metric;
        }

        @Override
        public final java.lang.Boolean getReturnData() {
            return this.returnData;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("id", om.valueToTree(this.getId()));
            if (this.getExpression() != null) {
                data.set("expression", om.valueToTree(this.getExpression()));
            }
            if (this.getLabel() != null) {
                data.set("label", om.valueToTree(this.getLabel()));
            }
            if (this.getMetric() != null) {
                data.set("metric", om.valueToTree(this.getMetric()));
            }
            if (this.getReturnData() != null) {
                data.set("returnData", om.valueToTree(this.getReturnData()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudwatchMetricAlarmMetricQuery"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchMetricAlarmMetricQuery.Jsii$Proxy that = (CloudwatchMetricAlarmMetricQuery.Jsii$Proxy) o;

            if (!id.equals(that.id)) return false;
            if (this.expression != null ? !this.expression.equals(that.expression) : that.expression != null) return false;
            if (this.label != null ? !this.label.equals(that.label) : that.label != null) return false;
            if (this.metric != null ? !this.metric.equals(that.metric) : that.metric != null) return false;
            return this.returnData != null ? this.returnData.equals(that.returnData) : that.returnData == null;
        }

        @Override
        public final int hashCode() {
            int result = this.id.hashCode();
            result = 31 * result + (this.expression != null ? this.expression.hashCode() : 0);
            result = 31 * result + (this.label != null ? this.label.hashCode() : 0);
            result = 31 * result + (this.metric != null ? this.metric.hashCode() : 0);
            result = 31 * result + (this.returnData != null ? this.returnData.hashCode() : 0);
            return result;
        }
    }
}
