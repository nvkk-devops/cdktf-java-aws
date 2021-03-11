package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.163Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchMetricAlarmConfig")
@software.amazon.jsii.Jsii.Proxy(CloudwatchMetricAlarmConfig.Jsii$Proxy.class)
public interface CloudwatchMetricAlarmConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAlarmName();

    @org.jetbrains.annotations.NotNull java.lang.String getComparisonOperator();

    @org.jetbrains.annotations.NotNull java.lang.Number getEvaluationPeriods();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getActionsEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAlarmActions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAlarmDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDatapointsToAlarm() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDimensions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEvaluateLowSampleCountPercentiles() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getExtendedStatistic() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInsufficientDataActions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMetricName() {
        return null;
    }

    /**
     * metric_query block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery> getMetricQuery() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOkActions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPeriod() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatistic() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getThreshold() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getThresholdMetricId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTreatMissingData() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUnit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchMetricAlarmConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchMetricAlarmConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchMetricAlarmConfig> {
        private java.lang.String alarmName;
        private java.lang.String comparisonOperator;
        private java.lang.Number evaluationPeriods;
        private java.lang.Boolean actionsEnabled;
        private java.util.List<java.lang.String> alarmActions;
        private java.lang.String alarmDescription;
        private java.lang.Number datapointsToAlarm;
        private java.util.Map<java.lang.String, java.lang.String> dimensions;
        private java.lang.String evaluateLowSampleCountPercentiles;
        private java.lang.String extendedStatistic;
        private java.util.List<java.lang.String> insufficientDataActions;
        private java.lang.String metricName;
        private java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery> metricQuery;
        private java.lang.String namespace;
        private java.util.List<java.lang.String> okActions;
        private java.lang.Number period;
        private java.lang.String statistic;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number threshold;
        private java.lang.String thresholdMetricId;
        private java.lang.String treatMissingData;
        private java.lang.String unit;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getAlarmName}
         * @param alarmName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder alarmName(java.lang.String alarmName) {
            this.alarmName = alarmName;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getComparisonOperator}
         * @param comparisonOperator the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder comparisonOperator(java.lang.String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getEvaluationPeriods}
         * @param evaluationPeriods the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder evaluationPeriods(java.lang.Number evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getActionsEnabled}
         * @param actionsEnabled the value to be set.
         * @return {@code this}
         */
        public Builder actionsEnabled(java.lang.Boolean actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getAlarmActions}
         * @param alarmActions the value to be set.
         * @return {@code this}
         */
        public Builder alarmActions(java.util.List<java.lang.String> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getAlarmDescription}
         * @param alarmDescription the value to be set.
         * @return {@code this}
         */
        public Builder alarmDescription(java.lang.String alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getDatapointsToAlarm}
         * @param datapointsToAlarm the value to be set.
         * @return {@code this}
         */
        public Builder datapointsToAlarm(java.lang.Number datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getDimensions}
         * @param dimensions the value to be set.
         * @return {@code this}
         */
        public Builder dimensions(java.util.Map<java.lang.String, java.lang.String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getEvaluateLowSampleCountPercentiles}
         * @param evaluateLowSampleCountPercentiles the value to be set.
         * @return {@code this}
         */
        public Builder evaluateLowSampleCountPercentiles(java.lang.String evaluateLowSampleCountPercentiles) {
            this.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getExtendedStatistic}
         * @param extendedStatistic the value to be set.
         * @return {@code this}
         */
        public Builder extendedStatistic(java.lang.String extendedStatistic) {
            this.extendedStatistic = extendedStatistic;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getInsufficientDataActions}
         * @param insufficientDataActions the value to be set.
         * @return {@code this}
         */
        public Builder insufficientDataActions(java.util.List<java.lang.String> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getMetricName}
         * @param metricName the value to be set.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getMetricQuery}
         * @param metricQuery metric_query block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder metricQuery(java.util.List<? extends imports.aws.CloudwatchMetricAlarmMetricQuery> metricQuery) {
            this.metricQuery = (java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery>)metricQuery;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getNamespace}
         * @param namespace the value to be set.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getOkActions}
         * @param okActions the value to be set.
         * @return {@code this}
         */
        public Builder okActions(java.util.List<java.lang.String> okActions) {
            this.okActions = okActions;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getPeriod}
         * @param period the value to be set.
         * @return {@code this}
         */
        public Builder period(java.lang.Number period) {
            this.period = period;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getStatistic}
         * @param statistic the value to be set.
         * @return {@code this}
         */
        public Builder statistic(java.lang.String statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getThreshold}
         * @param threshold the value to be set.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getThresholdMetricId}
         * @param thresholdMetricId the value to be set.
         * @return {@code this}
         */
        public Builder thresholdMetricId(java.lang.String thresholdMetricId) {
            this.thresholdMetricId = thresholdMetricId;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getTreatMissingData}
         * @param treatMissingData the value to be set.
         * @return {@code this}
         */
        public Builder treatMissingData(java.lang.String treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getUnit}
         * @param unit the value to be set.
         * @return {@code this}
         */
        public Builder unit(java.lang.String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getDependsOn}
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
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchMetricAlarmConfig#getProvider}
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
         * @return a new instance of {@link CloudwatchMetricAlarmConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchMetricAlarmConfig build() {
            return new Jsii$Proxy(alarmName, comparisonOperator, evaluationPeriods, actionsEnabled, alarmActions, alarmDescription, datapointsToAlarm, dimensions, evaluateLowSampleCountPercentiles, extendedStatistic, insufficientDataActions, metricName, metricQuery, namespace, okActions, period, statistic, tags, threshold, thresholdMetricId, treatMissingData, unit, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CloudwatchMetricAlarmConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchMetricAlarmConfig {
        private final java.lang.String alarmName;
        private final java.lang.String comparisonOperator;
        private final java.lang.Number evaluationPeriods;
        private final java.lang.Boolean actionsEnabled;
        private final java.util.List<java.lang.String> alarmActions;
        private final java.lang.String alarmDescription;
        private final java.lang.Number datapointsToAlarm;
        private final java.util.Map<java.lang.String, java.lang.String> dimensions;
        private final java.lang.String evaluateLowSampleCountPercentiles;
        private final java.lang.String extendedStatistic;
        private final java.util.List<java.lang.String> insufficientDataActions;
        private final java.lang.String metricName;
        private final java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery> metricQuery;
        private final java.lang.String namespace;
        private final java.util.List<java.lang.String> okActions;
        private final java.lang.Number period;
        private final java.lang.String statistic;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number threshold;
        private final java.lang.String thresholdMetricId;
        private final java.lang.String treatMissingData;
        private final java.lang.String unit;
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
            this.alarmName = software.amazon.jsii.Kernel.get(this, "alarmName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.comparisonOperator = software.amazon.jsii.Kernel.get(this, "comparisonOperator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.evaluationPeriods = software.amazon.jsii.Kernel.get(this, "evaluationPeriods", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.actionsEnabled = software.amazon.jsii.Kernel.get(this, "actionsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.alarmActions = software.amazon.jsii.Kernel.get(this, "alarmActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.alarmDescription = software.amazon.jsii.Kernel.get(this, "alarmDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.datapointsToAlarm = software.amazon.jsii.Kernel.get(this, "datapointsToAlarm", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dimensions = software.amazon.jsii.Kernel.get(this, "dimensions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.evaluateLowSampleCountPercentiles = software.amazon.jsii.Kernel.get(this, "evaluateLowSampleCountPercentiles", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.extendedStatistic = software.amazon.jsii.Kernel.get(this, "extendedStatistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.insufficientDataActions = software.amazon.jsii.Kernel.get(this, "insufficientDataActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricQuery = software.amazon.jsii.Kernel.get(this, "metricQuery", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchMetricAlarmMetricQuery.class)));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.okActions = software.amazon.jsii.Kernel.get(this, "okActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.period = software.amazon.jsii.Kernel.get(this, "period", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.statistic = software.amazon.jsii.Kernel.get(this, "statistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.thresholdMetricId = software.amazon.jsii.Kernel.get(this, "thresholdMetricId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.treatMissingData = software.amazon.jsii.Kernel.get(this, "treatMissingData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.unit = software.amazon.jsii.Kernel.get(this, "unit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String alarmName, final java.lang.String comparisonOperator, final java.lang.Number evaluationPeriods, final java.lang.Boolean actionsEnabled, final java.util.List<java.lang.String> alarmActions, final java.lang.String alarmDescription, final java.lang.Number datapointsToAlarm, final java.util.Map<java.lang.String, java.lang.String> dimensions, final java.lang.String evaluateLowSampleCountPercentiles, final java.lang.String extendedStatistic, final java.util.List<java.lang.String> insufficientDataActions, final java.lang.String metricName, final java.util.List<? extends imports.aws.CloudwatchMetricAlarmMetricQuery> metricQuery, final java.lang.String namespace, final java.util.List<java.lang.String> okActions, final java.lang.Number period, final java.lang.String statistic, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number threshold, final java.lang.String thresholdMetricId, final java.lang.String treatMissingData, final java.lang.String unit, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.alarmName = java.util.Objects.requireNonNull(alarmName, "alarmName is required");
            this.comparisonOperator = java.util.Objects.requireNonNull(comparisonOperator, "comparisonOperator is required");
            this.evaluationPeriods = java.util.Objects.requireNonNull(evaluationPeriods, "evaluationPeriods is required");
            this.actionsEnabled = actionsEnabled;
            this.alarmActions = alarmActions;
            this.alarmDescription = alarmDescription;
            this.datapointsToAlarm = datapointsToAlarm;
            this.dimensions = dimensions;
            this.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
            this.extendedStatistic = extendedStatistic;
            this.insufficientDataActions = insufficientDataActions;
            this.metricName = metricName;
            this.metricQuery = (java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery>)metricQuery;
            this.namespace = namespace;
            this.okActions = okActions;
            this.period = period;
            this.statistic = statistic;
            this.tags = tags;
            this.threshold = threshold;
            this.thresholdMetricId = thresholdMetricId;
            this.treatMissingData = treatMissingData;
            this.unit = unit;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAlarmName() {
            return this.alarmName;
        }

        @Override
        public final java.lang.String getComparisonOperator() {
            return this.comparisonOperator;
        }

        @Override
        public final java.lang.Number getEvaluationPeriods() {
            return this.evaluationPeriods;
        }

        @Override
        public final java.lang.Boolean getActionsEnabled() {
            return this.actionsEnabled;
        }

        @Override
        public final java.util.List<java.lang.String> getAlarmActions() {
            return this.alarmActions;
        }

        @Override
        public final java.lang.String getAlarmDescription() {
            return this.alarmDescription;
        }

        @Override
        public final java.lang.Number getDatapointsToAlarm() {
            return this.datapointsToAlarm;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getDimensions() {
            return this.dimensions;
        }

        @Override
        public final java.lang.String getEvaluateLowSampleCountPercentiles() {
            return this.evaluateLowSampleCountPercentiles;
        }

        @Override
        public final java.lang.String getExtendedStatistic() {
            return this.extendedStatistic;
        }

        @Override
        public final java.util.List<java.lang.String> getInsufficientDataActions() {
            return this.insufficientDataActions;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery> getMetricQuery() {
            return this.metricQuery;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.util.List<java.lang.String> getOkActions() {
            return this.okActions;
        }

        @Override
        public final java.lang.Number getPeriod() {
            return this.period;
        }

        @Override
        public final java.lang.String getStatistic() {
            return this.statistic;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        public final java.lang.String getThresholdMetricId() {
            return this.thresholdMetricId;
        }

        @Override
        public final java.lang.String getTreatMissingData() {
            return this.treatMissingData;
        }

        @Override
        public final java.lang.String getUnit() {
            return this.unit;
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

            data.set("alarmName", om.valueToTree(this.getAlarmName()));
            data.set("comparisonOperator", om.valueToTree(this.getComparisonOperator()));
            data.set("evaluationPeriods", om.valueToTree(this.getEvaluationPeriods()));
            if (this.getActionsEnabled() != null) {
                data.set("actionsEnabled", om.valueToTree(this.getActionsEnabled()));
            }
            if (this.getAlarmActions() != null) {
                data.set("alarmActions", om.valueToTree(this.getAlarmActions()));
            }
            if (this.getAlarmDescription() != null) {
                data.set("alarmDescription", om.valueToTree(this.getAlarmDescription()));
            }
            if (this.getDatapointsToAlarm() != null) {
                data.set("datapointsToAlarm", om.valueToTree(this.getDatapointsToAlarm()));
            }
            if (this.getDimensions() != null) {
                data.set("dimensions", om.valueToTree(this.getDimensions()));
            }
            if (this.getEvaluateLowSampleCountPercentiles() != null) {
                data.set("evaluateLowSampleCountPercentiles", om.valueToTree(this.getEvaluateLowSampleCountPercentiles()));
            }
            if (this.getExtendedStatistic() != null) {
                data.set("extendedStatistic", om.valueToTree(this.getExtendedStatistic()));
            }
            if (this.getInsufficientDataActions() != null) {
                data.set("insufficientDataActions", om.valueToTree(this.getInsufficientDataActions()));
            }
            if (this.getMetricName() != null) {
                data.set("metricName", om.valueToTree(this.getMetricName()));
            }
            if (this.getMetricQuery() != null) {
                data.set("metricQuery", om.valueToTree(this.getMetricQuery()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getOkActions() != null) {
                data.set("okActions", om.valueToTree(this.getOkActions()));
            }
            if (this.getPeriod() != null) {
                data.set("period", om.valueToTree(this.getPeriod()));
            }
            if (this.getStatistic() != null) {
                data.set("statistic", om.valueToTree(this.getStatistic()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }
            if (this.getThresholdMetricId() != null) {
                data.set("thresholdMetricId", om.valueToTree(this.getThresholdMetricId()));
            }
            if (this.getTreatMissingData() != null) {
                data.set("treatMissingData", om.valueToTree(this.getTreatMissingData()));
            }
            if (this.getUnit() != null) {
                data.set("unit", om.valueToTree(this.getUnit()));
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
            struct.set("fqn", om.valueToTree("aws.CloudwatchMetricAlarmConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchMetricAlarmConfig.Jsii$Proxy that = (CloudwatchMetricAlarmConfig.Jsii$Proxy) o;

            if (!alarmName.equals(that.alarmName)) return false;
            if (!comparisonOperator.equals(that.comparisonOperator)) return false;
            if (!evaluationPeriods.equals(that.evaluationPeriods)) return false;
            if (this.actionsEnabled != null ? !this.actionsEnabled.equals(that.actionsEnabled) : that.actionsEnabled != null) return false;
            if (this.alarmActions != null ? !this.alarmActions.equals(that.alarmActions) : that.alarmActions != null) return false;
            if (this.alarmDescription != null ? !this.alarmDescription.equals(that.alarmDescription) : that.alarmDescription != null) return false;
            if (this.datapointsToAlarm != null ? !this.datapointsToAlarm.equals(that.datapointsToAlarm) : that.datapointsToAlarm != null) return false;
            if (this.dimensions != null ? !this.dimensions.equals(that.dimensions) : that.dimensions != null) return false;
            if (this.evaluateLowSampleCountPercentiles != null ? !this.evaluateLowSampleCountPercentiles.equals(that.evaluateLowSampleCountPercentiles) : that.evaluateLowSampleCountPercentiles != null) return false;
            if (this.extendedStatistic != null ? !this.extendedStatistic.equals(that.extendedStatistic) : that.extendedStatistic != null) return false;
            if (this.insufficientDataActions != null ? !this.insufficientDataActions.equals(that.insufficientDataActions) : that.insufficientDataActions != null) return false;
            if (this.metricName != null ? !this.metricName.equals(that.metricName) : that.metricName != null) return false;
            if (this.metricQuery != null ? !this.metricQuery.equals(that.metricQuery) : that.metricQuery != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.okActions != null ? !this.okActions.equals(that.okActions) : that.okActions != null) return false;
            if (this.period != null ? !this.period.equals(that.period) : that.period != null) return false;
            if (this.statistic != null ? !this.statistic.equals(that.statistic) : that.statistic != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.threshold != null ? !this.threshold.equals(that.threshold) : that.threshold != null) return false;
            if (this.thresholdMetricId != null ? !this.thresholdMetricId.equals(that.thresholdMetricId) : that.thresholdMetricId != null) return false;
            if (this.treatMissingData != null ? !this.treatMissingData.equals(that.treatMissingData) : that.treatMissingData != null) return false;
            if (this.unit != null ? !this.unit.equals(that.unit) : that.unit != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.alarmName.hashCode();
            result = 31 * result + (this.comparisonOperator.hashCode());
            result = 31 * result + (this.evaluationPeriods.hashCode());
            result = 31 * result + (this.actionsEnabled != null ? this.actionsEnabled.hashCode() : 0);
            result = 31 * result + (this.alarmActions != null ? this.alarmActions.hashCode() : 0);
            result = 31 * result + (this.alarmDescription != null ? this.alarmDescription.hashCode() : 0);
            result = 31 * result + (this.datapointsToAlarm != null ? this.datapointsToAlarm.hashCode() : 0);
            result = 31 * result + (this.dimensions != null ? this.dimensions.hashCode() : 0);
            result = 31 * result + (this.evaluateLowSampleCountPercentiles != null ? this.evaluateLowSampleCountPercentiles.hashCode() : 0);
            result = 31 * result + (this.extendedStatistic != null ? this.extendedStatistic.hashCode() : 0);
            result = 31 * result + (this.insufficientDataActions != null ? this.insufficientDataActions.hashCode() : 0);
            result = 31 * result + (this.metricName != null ? this.metricName.hashCode() : 0);
            result = 31 * result + (this.metricQuery != null ? this.metricQuery.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.okActions != null ? this.okActions.hashCode() : 0);
            result = 31 * result + (this.period != null ? this.period.hashCode() : 0);
            result = 31 * result + (this.statistic != null ? this.statistic.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            result = 31 * result + (this.thresholdMetricId != null ? this.thresholdMetricId.hashCode() : 0);
            result = 31 * result + (this.treatMissingData != null ? this.treatMissingData.hashCode() : 0);
            result = 31 * result + (this.unit != null ? this.unit.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
