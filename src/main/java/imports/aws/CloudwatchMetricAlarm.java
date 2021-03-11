package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.162Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchMetricAlarm")
public class CloudwatchMetricAlarm extends com.hashicorp.cdktf.TerraformResource {

    protected CloudwatchMetricAlarm(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchMetricAlarm(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public CloudwatchMetricAlarm(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CloudwatchMetricAlarmConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetActionsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetActionsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAlarmActions() {
        software.amazon.jsii.Kernel.call(this, "resetAlarmActions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAlarmDescription() {
        software.amazon.jsii.Kernel.call(this, "resetAlarmDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDatapointsToAlarm() {
        software.amazon.jsii.Kernel.call(this, "resetDatapointsToAlarm", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDimensions() {
        software.amazon.jsii.Kernel.call(this, "resetDimensions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEvaluateLowSampleCountPercentiles() {
        software.amazon.jsii.Kernel.call(this, "resetEvaluateLowSampleCountPercentiles", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExtendedStatistic() {
        software.amazon.jsii.Kernel.call(this, "resetExtendedStatistic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInsufficientDataActions() {
        software.amazon.jsii.Kernel.call(this, "resetInsufficientDataActions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricName() {
        software.amazon.jsii.Kernel.call(this, "resetMetricName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricQuery() {
        software.amazon.jsii.Kernel.call(this, "resetMetricQuery", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamespace() {
        software.amazon.jsii.Kernel.call(this, "resetNamespace", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOkActions() {
        software.amazon.jsii.Kernel.call(this, "resetOkActions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeriod() {
        software.amazon.jsii.Kernel.call(this, "resetPeriod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatistic() {
        software.amazon.jsii.Kernel.call(this, "resetStatistic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThresholdMetricId() {
        software.amazon.jsii.Kernel.call(this, "resetThresholdMetricId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTreatMissingData() {
        software.amazon.jsii.Kernel.call(this, "resetTreatMissingData", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUnit() {
        software.amazon.jsii.Kernel.call(this, "resetUnit", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAlarmNameInput() {
        return software.amazon.jsii.Kernel.get(this, "alarmNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComparisonOperatorInput() {
        return software.amazon.jsii.Kernel.get(this, "comparisonOperatorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEvaluationPeriodsInput() {
        return software.amazon.jsii.Kernel.get(this, "evaluationPeriodsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getActionsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "actionsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAlarmActionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "alarmActionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAlarmDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "alarmDescriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDatapointsToAlarmInput() {
        return software.amazon.jsii.Kernel.get(this, "datapointsToAlarmInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDimensionsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "dimensionsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEvaluateLowSampleCountPercentilesInput() {
        return software.amazon.jsii.Kernel.get(this, "evaluateLowSampleCountPercentilesInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExtendedStatisticInput() {
        return software.amazon.jsii.Kernel.get(this, "extendedStatisticInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInsufficientDataActionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "insufficientDataActionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricNameInput() {
        return software.amazon.jsii.Kernel.get(this, "metricNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery> getMetricQueryInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery>)(software.amazon.jsii.Kernel.get(this, "metricQueryInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchMetricAlarmMetricQuery.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "namespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOkActionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "okActionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPeriodInput() {
        return software.amazon.jsii.Kernel.get(this, "periodInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatisticInput() {
        return software.amazon.jsii.Kernel.get(this, "statisticInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThresholdMetricIdInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdMetricIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTreatMissingDataInput() {
        return software.amazon.jsii.Kernel.get(this, "treatMissingDataInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "unitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getActionsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "actionsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setActionsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "actionsEnabled", java.util.Objects.requireNonNull(value, "actionsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAlarmActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "alarmActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAlarmActions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "alarmActions", java.util.Objects.requireNonNull(value, "alarmActions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAlarmDescription() {
        return software.amazon.jsii.Kernel.get(this, "alarmDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAlarmDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alarmDescription", java.util.Objects.requireNonNull(value, "alarmDescription is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAlarmName() {
        return software.amazon.jsii.Kernel.get(this, "alarmName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAlarmName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alarmName", java.util.Objects.requireNonNull(value, "alarmName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComparisonOperator() {
        return software.amazon.jsii.Kernel.get(this, "comparisonOperator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComparisonOperator(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "comparisonOperator", java.util.Objects.requireNonNull(value, "comparisonOperator is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDatapointsToAlarm() {
        return software.amazon.jsii.Kernel.get(this, "datapointsToAlarm", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDatapointsToAlarm(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "datapointsToAlarm", java.util.Objects.requireNonNull(value, "datapointsToAlarm is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getDimensions() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "dimensions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDimensions(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "dimensions", java.util.Objects.requireNonNull(value, "dimensions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEvaluateLowSampleCountPercentiles() {
        return software.amazon.jsii.Kernel.get(this, "evaluateLowSampleCountPercentiles", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEvaluateLowSampleCountPercentiles(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "evaluateLowSampleCountPercentiles", java.util.Objects.requireNonNull(value, "evaluateLowSampleCountPercentiles is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEvaluationPeriods() {
        return software.amazon.jsii.Kernel.get(this, "evaluationPeriods", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEvaluationPeriods(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "evaluationPeriods", java.util.Objects.requireNonNull(value, "evaluationPeriods is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExtendedStatistic() {
        return software.amazon.jsii.Kernel.get(this, "extendedStatistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExtendedStatistic(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "extendedStatistic", java.util.Objects.requireNonNull(value, "extendedStatistic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getInsufficientDataActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "insufficientDataActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setInsufficientDataActions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "insufficientDataActions", java.util.Objects.requireNonNull(value, "insufficientDataActions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMetricName() {
        return software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetricName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metricName", java.util.Objects.requireNonNull(value, "metricName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery> getMetricQuery() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "metricQuery", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudwatchMetricAlarmMetricQuery.class))));
    }

    public void setMetricQuery(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudwatchMetricAlarmMetricQuery> value) {
        software.amazon.jsii.Kernel.set(this, "metricQuery", java.util.Objects.requireNonNull(value, "metricQuery is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamespace() {
        return software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamespace(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namespace", java.util.Objects.requireNonNull(value, "namespace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOkActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "okActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setOkActions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "okActions", java.util.Objects.requireNonNull(value, "okActions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPeriod() {
        return software.amazon.jsii.Kernel.get(this, "period", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPeriod(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "period", java.util.Objects.requireNonNull(value, "period is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatistic() {
        return software.amazon.jsii.Kernel.get(this, "statistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatistic(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "statistic", java.util.Objects.requireNonNull(value, "statistic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getThreshold() {
        return software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "threshold", java.util.Objects.requireNonNull(value, "threshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThresholdMetricId() {
        return software.amazon.jsii.Kernel.get(this, "thresholdMetricId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThresholdMetricId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thresholdMetricId", java.util.Objects.requireNonNull(value, "thresholdMetricId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTreatMissingData() {
        return software.amazon.jsii.Kernel.get(this, "treatMissingData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTreatMissingData(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "treatMissingData", java.util.Objects.requireNonNull(value, "treatMissingData is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUnit() {
        return software.amazon.jsii.Kernel.get(this, "unit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "unit", java.util.Objects.requireNonNull(value, "unit is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.CloudwatchMetricAlarm}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.CloudwatchMetricAlarm> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.CloudwatchMetricAlarmConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CloudwatchMetricAlarmConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param alarmName This parameter is required.
         */
        public Builder alarmName(final java.lang.String alarmName) {
            this.config.alarmName(alarmName);
            return this;
        }

        /**
         * @return {@code this}
         * @param comparisonOperator This parameter is required.
         */
        public Builder comparisonOperator(final java.lang.String comparisonOperator) {
            this.config.comparisonOperator(comparisonOperator);
            return this;
        }

        /**
         * @return {@code this}
         * @param evaluationPeriods This parameter is required.
         */
        public Builder evaluationPeriods(final java.lang.Number evaluationPeriods) {
            this.config.evaluationPeriods(evaluationPeriods);
            return this;
        }

        /**
         * @return {@code this}
         * @param actionsEnabled This parameter is required.
         */
        public Builder actionsEnabled(final java.lang.Boolean actionsEnabled) {
            this.config.actionsEnabled(actionsEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param alarmActions This parameter is required.
         */
        public Builder alarmActions(final java.util.List<java.lang.String> alarmActions) {
            this.config.alarmActions(alarmActions);
            return this;
        }

        /**
         * @return {@code this}
         * @param alarmDescription This parameter is required.
         */
        public Builder alarmDescription(final java.lang.String alarmDescription) {
            this.config.alarmDescription(alarmDescription);
            return this;
        }

        /**
         * @return {@code this}
         * @param datapointsToAlarm This parameter is required.
         */
        public Builder datapointsToAlarm(final java.lang.Number datapointsToAlarm) {
            this.config.datapointsToAlarm(datapointsToAlarm);
            return this;
        }

        /**
         * @return {@code this}
         * @param dimensions This parameter is required.
         */
        public Builder dimensions(final java.util.Map<java.lang.String, java.lang.String> dimensions) {
            this.config.dimensions(dimensions);
            return this;
        }

        /**
         * @return {@code this}
         * @param evaluateLowSampleCountPercentiles This parameter is required.
         */
        public Builder evaluateLowSampleCountPercentiles(final java.lang.String evaluateLowSampleCountPercentiles) {
            this.config.evaluateLowSampleCountPercentiles(evaluateLowSampleCountPercentiles);
            return this;
        }

        /**
         * @return {@code this}
         * @param extendedStatistic This parameter is required.
         */
        public Builder extendedStatistic(final java.lang.String extendedStatistic) {
            this.config.extendedStatistic(extendedStatistic);
            return this;
        }

        /**
         * @return {@code this}
         * @param insufficientDataActions This parameter is required.
         */
        public Builder insufficientDataActions(final java.util.List<java.lang.String> insufficientDataActions) {
            this.config.insufficientDataActions(insufficientDataActions);
            return this;
        }

        /**
         * @return {@code this}
         * @param metricName This parameter is required.
         */
        public Builder metricName(final java.lang.String metricName) {
            this.config.metricName(metricName);
            return this;
        }

        /**
         * metric_query block.
         * <p>
         * @return {@code this}
         * @param metricQuery metric_query block. This parameter is required.
         */
        public Builder metricQuery(final java.util.List<? extends imports.aws.CloudwatchMetricAlarmMetricQuery> metricQuery) {
            this.config.metricQuery(metricQuery);
            return this;
        }

        /**
         * @return {@code this}
         * @param namespace This parameter is required.
         */
        public Builder namespace(final java.lang.String namespace) {
            this.config.namespace(namespace);
            return this;
        }

        /**
         * @return {@code this}
         * @param okActions This parameter is required.
         */
        public Builder okActions(final java.util.List<java.lang.String> okActions) {
            this.config.okActions(okActions);
            return this;
        }

        /**
         * @return {@code this}
         * @param period This parameter is required.
         */
        public Builder period(final java.lang.Number period) {
            this.config.period(period);
            return this;
        }

        /**
         * @return {@code this}
         * @param statistic This parameter is required.
         */
        public Builder statistic(final java.lang.String statistic) {
            this.config.statistic(statistic);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @return {@code this}
         * @param threshold This parameter is required.
         */
        public Builder threshold(final java.lang.Number threshold) {
            this.config.threshold(threshold);
            return this;
        }

        /**
         * @return {@code this}
         * @param thresholdMetricId This parameter is required.
         */
        public Builder thresholdMetricId(final java.lang.String thresholdMetricId) {
            this.config.thresholdMetricId(thresholdMetricId);
            return this;
        }

        /**
         * @return {@code this}
         * @param treatMissingData This parameter is required.
         */
        public Builder treatMissingData(final java.lang.String treatMissingData) {
            this.config.treatMissingData(treatMissingData);
            return this;
        }

        /**
         * @return {@code this}
         * @param unit This parameter is required.
         */
        public Builder unit(final java.lang.String unit) {
            this.config.unit(unit);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.CloudwatchMetricAlarm}.
         */
        @Override
        public imports.aws.CloudwatchMetricAlarm build() {
            return new imports.aws.CloudwatchMetricAlarm(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
