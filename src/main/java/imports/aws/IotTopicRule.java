package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.639Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRule")
public class IotTopicRule extends com.hashicorp.cdktf.TerraformResource {

    protected IotTopicRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotTopicRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public IotTopicRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.IotTopicRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCloudwatchAlarm() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchAlarm", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchMetric() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchMetric", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodb() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodb", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodbv2() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodbv2", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearch() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearch", software.amazon.jsii.NativeType.VOID);
    }

    public void resetErrorAction() {
        software.amazon.jsii.Kernel.call(this, "resetErrorAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFirehose() {
        software.amazon.jsii.Kernel.call(this, "resetFirehose", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIotAnalytics() {
        software.amazon.jsii.Kernel.call(this, "resetIotAnalytics", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIotEvents() {
        software.amazon.jsii.Kernel.call(this, "resetIotEvents", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesis() {
        software.amazon.jsii.Kernel.call(this, "resetKinesis", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambda() {
        software.amazon.jsii.Kernel.call(this, "resetLambda", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepublish() {
        software.amazon.jsii.Kernel.call(this, "resetRepublish", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3() {
        software.amazon.jsii.Kernel.call(this, "resetS3", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSns() {
        software.amazon.jsii.Kernel.call(this, "resetSns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqs() {
        software.amazon.jsii.Kernel.call(this, "resetSqs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStepFunctions() {
        software.amazon.jsii.Kernel.call(this, "resetStepFunctions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSqlInput() {
        return software.amazon.jsii.Kernel.get(this, "sqlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSqlVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "sqlVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm> getCloudwatchAlarmInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm>)(software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleCloudwatchAlarm.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleCloudwatchMetric> getCloudwatchMetricInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleCloudwatchMetric>)(software.amazon.jsii.Kernel.get(this, "cloudwatchMetricInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleCloudwatchMetric.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleDynamodb> getDynamodbInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleDynamodb>)(software.amazon.jsii.Kernel.get(this, "dynamodbInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleDynamodb.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleDynamodbv2> getDynamodbv2Input() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleDynamodbv2>)(software.amazon.jsii.Kernel.get(this, "dynamodbv2Input", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleDynamodbv2.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleElasticsearch> getElasticsearchInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleElasticsearch>)(software.amazon.jsii.Kernel.get(this, "elasticsearchInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleElasticsearch.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorAction> getErrorActionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleErrorAction>)(software.amazon.jsii.Kernel.get(this, "errorActionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorAction.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleFirehose> getFirehoseInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleFirehose>)(software.amazon.jsii.Kernel.get(this, "firehoseInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleFirehose.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleIotAnalytics> getIotAnalyticsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleIotAnalytics>)(software.amazon.jsii.Kernel.get(this, "iotAnalyticsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleIotAnalytics.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleIotEvents> getIotEventsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleIotEvents>)(software.amazon.jsii.Kernel.get(this, "iotEventsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleIotEvents.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleKinesis> getKinesisInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleKinesis>)(software.amazon.jsii.Kernel.get(this, "kinesisInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleKinesis.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleLambda> getLambdaInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleLambda>)(software.amazon.jsii.Kernel.get(this, "lambdaInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleLambda.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleRepublish> getRepublishInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleRepublish>)(software.amazon.jsii.Kernel.get(this, "republishInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleRepublish.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleS3> getS3Input() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleS3>)(software.amazon.jsii.Kernel.get(this, "s3Input", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleS3.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleSns> getSnsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleSns>)(software.amazon.jsii.Kernel.get(this, "snsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleSns.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleSqs> getSqsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleSqs>)(software.amazon.jsii.Kernel.get(this, "sqsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleSqs.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleStepFunctions> getStepFunctionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotTopicRuleStepFunctions>)(software.amazon.jsii.Kernel.get(this, "stepFunctionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleStepFunctions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm> getCloudwatchAlarm() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cloudwatchAlarm", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleCloudwatchAlarm.class))));
    }

    public void setCloudwatchAlarm(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchAlarm", java.util.Objects.requireNonNull(value, "cloudwatchAlarm is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleCloudwatchMetric> getCloudwatchMetric() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cloudwatchMetric", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleCloudwatchMetric.class))));
    }

    public void setCloudwatchMetric(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleCloudwatchMetric> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchMetric", java.util.Objects.requireNonNull(value, "cloudwatchMetric is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleDynamodb> getDynamodb() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dynamodb", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleDynamodb.class))));
    }

    public void setDynamodb(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleDynamodb> value) {
        software.amazon.jsii.Kernel.set(this, "dynamodb", java.util.Objects.requireNonNull(value, "dynamodb is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleDynamodbv2> getDynamodbv2() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dynamodbv2", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleDynamodbv2.class))));
    }

    public void setDynamodbv2(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleDynamodbv2> value) {
        software.amazon.jsii.Kernel.set(this, "dynamodbv2", java.util.Objects.requireNonNull(value, "dynamodbv2 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleElasticsearch> getElasticsearch() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "elasticsearch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleElasticsearch.class))));
    }

    public void setElasticsearch(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleElasticsearch> value) {
        software.amazon.jsii.Kernel.set(this, "elasticsearch", java.util.Objects.requireNonNull(value, "elasticsearch is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleErrorAction> getErrorAction() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "errorAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorAction.class))));
    }

    public void setErrorAction(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleErrorAction> value) {
        software.amazon.jsii.Kernel.set(this, "errorAction", java.util.Objects.requireNonNull(value, "errorAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleFirehose> getFirehose() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "firehose", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleFirehose.class))));
    }

    public void setFirehose(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleFirehose> value) {
        software.amazon.jsii.Kernel.set(this, "firehose", java.util.Objects.requireNonNull(value, "firehose is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleIotAnalytics> getIotAnalytics() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "iotAnalytics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleIotAnalytics.class))));
    }

    public void setIotAnalytics(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleIotAnalytics> value) {
        software.amazon.jsii.Kernel.set(this, "iotAnalytics", java.util.Objects.requireNonNull(value, "iotAnalytics is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleIotEvents> getIotEvents() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "iotEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleIotEvents.class))));
    }

    public void setIotEvents(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleIotEvents> value) {
        software.amazon.jsii.Kernel.set(this, "iotEvents", java.util.Objects.requireNonNull(value, "iotEvents is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleKinesis> getKinesis() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "kinesis", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleKinesis.class))));
    }

    public void setKinesis(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleKinesis> value) {
        software.amazon.jsii.Kernel.set(this, "kinesis", java.util.Objects.requireNonNull(value, "kinesis is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleLambda> getLambda() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lambda", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleLambda.class))));
    }

    public void setLambda(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleLambda> value) {
        software.amazon.jsii.Kernel.set(this, "lambda", java.util.Objects.requireNonNull(value, "lambda is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleRepublish> getRepublish() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "republish", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleRepublish.class))));
    }

    public void setRepublish(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleRepublish> value) {
        software.amazon.jsii.Kernel.set(this, "republish", java.util.Objects.requireNonNull(value, "republish is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleS3> getS3() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleS3.class))));
    }

    public void setS3(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleS3> value) {
        software.amazon.jsii.Kernel.set(this, "s3", java.util.Objects.requireNonNull(value, "s3 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleSns> getSns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "sns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleSns.class))));
    }

    public void setSns(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleSns> value) {
        software.amazon.jsii.Kernel.set(this, "sns", java.util.Objects.requireNonNull(value, "sns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSql() {
        return software.amazon.jsii.Kernel.get(this, "sql", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSql(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sql", java.util.Objects.requireNonNull(value, "sql is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSqlVersion() {
        return software.amazon.jsii.Kernel.get(this, "sqlVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSqlVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sqlVersion", java.util.Objects.requireNonNull(value, "sqlVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleSqs> getSqs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "sqs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleSqs.class))));
    }

    public void setSqs(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleSqs> value) {
        software.amazon.jsii.Kernel.set(this, "sqs", java.util.Objects.requireNonNull(value, "sqs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleStepFunctions> getStepFunctions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "stepFunctions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleStepFunctions.class))));
    }

    public void setStepFunctions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotTopicRuleStepFunctions> value) {
        software.amazon.jsii.Kernel.set(this, "stepFunctions", java.util.Objects.requireNonNull(value, "stepFunctions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.IotTopicRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.IotTopicRule> {
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
        private final imports.aws.IotTopicRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.IotTopicRuleConfig.Builder();
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
         * @param enabled This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param sql This parameter is required.
         */
        public Builder sql(final java.lang.String sql) {
            this.config.sql(sql);
            return this;
        }

        /**
         * @return {@code this}
         * @param sqlVersion This parameter is required.
         */
        public Builder sqlVersion(final java.lang.String sqlVersion) {
            this.config.sqlVersion(sqlVersion);
            return this;
        }

        /**
         * cloudwatch_alarm block.
         * <p>
         * @return {@code this}
         * @param cloudwatchAlarm cloudwatch_alarm block. This parameter is required.
         */
        public Builder cloudwatchAlarm(final java.util.List<? extends imports.aws.IotTopicRuleCloudwatchAlarm> cloudwatchAlarm) {
            this.config.cloudwatchAlarm(cloudwatchAlarm);
            return this;
        }

        /**
         * cloudwatch_metric block.
         * <p>
         * @return {@code this}
         * @param cloudwatchMetric cloudwatch_metric block. This parameter is required.
         */
        public Builder cloudwatchMetric(final java.util.List<? extends imports.aws.IotTopicRuleCloudwatchMetric> cloudwatchMetric) {
            this.config.cloudwatchMetric(cloudwatchMetric);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * dynamodb block.
         * <p>
         * @return {@code this}
         * @param dynamodb dynamodb block. This parameter is required.
         */
        public Builder dynamodb(final java.util.List<? extends imports.aws.IotTopicRuleDynamodb> dynamodb) {
            this.config.dynamodb(dynamodb);
            return this;
        }

        /**
         * dynamodbv2 block.
         * <p>
         * @return {@code this}
         * @param dynamodbv2 dynamodbv2 block. This parameter is required.
         */
        public Builder dynamodbv2(final java.util.List<? extends imports.aws.IotTopicRuleDynamodbv2> dynamodbv2) {
            this.config.dynamodbv2(dynamodbv2);
            return this;
        }

        /**
         * elasticsearch block.
         * <p>
         * @return {@code this}
         * @param elasticsearch elasticsearch block. This parameter is required.
         */
        public Builder elasticsearch(final java.util.List<? extends imports.aws.IotTopicRuleElasticsearch> elasticsearch) {
            this.config.elasticsearch(elasticsearch);
            return this;
        }

        /**
         * error_action block.
         * <p>
         * @return {@code this}
         * @param errorAction error_action block. This parameter is required.
         */
        public Builder errorAction(final java.util.List<? extends imports.aws.IotTopicRuleErrorAction> errorAction) {
            this.config.errorAction(errorAction);
            return this;
        }

        /**
         * firehose block.
         * <p>
         * @return {@code this}
         * @param firehose firehose block. This parameter is required.
         */
        public Builder firehose(final java.util.List<? extends imports.aws.IotTopicRuleFirehose> firehose) {
            this.config.firehose(firehose);
            return this;
        }

        /**
         * iot_analytics block.
         * <p>
         * @return {@code this}
         * @param iotAnalytics iot_analytics block. This parameter is required.
         */
        public Builder iotAnalytics(final java.util.List<? extends imports.aws.IotTopicRuleIotAnalytics> iotAnalytics) {
            this.config.iotAnalytics(iotAnalytics);
            return this;
        }

        /**
         * iot_events block.
         * <p>
         * @return {@code this}
         * @param iotEvents iot_events block. This parameter is required.
         */
        public Builder iotEvents(final java.util.List<? extends imports.aws.IotTopicRuleIotEvents> iotEvents) {
            this.config.iotEvents(iotEvents);
            return this;
        }

        /**
         * kinesis block.
         * <p>
         * @return {@code this}
         * @param kinesis kinesis block. This parameter is required.
         */
        public Builder kinesis(final java.util.List<? extends imports.aws.IotTopicRuleKinesis> kinesis) {
            this.config.kinesis(kinesis);
            return this;
        }

        /**
         * lambda block.
         * <p>
         * @return {@code this}
         * @param lambda lambda block. This parameter is required.
         */
        public Builder lambda(final java.util.List<? extends imports.aws.IotTopicRuleLambda> lambda) {
            this.config.lambda(lambda);
            return this;
        }

        /**
         * republish block.
         * <p>
         * @return {@code this}
         * @param republish republish block. This parameter is required.
         */
        public Builder republish(final java.util.List<? extends imports.aws.IotTopicRuleRepublish> republish) {
            this.config.republish(republish);
            return this;
        }

        /**
         * s3 block.
         * <p>
         * @return {@code this}
         * @param s3 s3 block. This parameter is required.
         */
        public Builder s3(final java.util.List<? extends imports.aws.IotTopicRuleS3> s3) {
            this.config.s3(s3);
            return this;
        }

        /**
         * sns block.
         * <p>
         * @return {@code this}
         * @param sns sns block. This parameter is required.
         */
        public Builder sns(final java.util.List<? extends imports.aws.IotTopicRuleSns> sns) {
            this.config.sns(sns);
            return this;
        }

        /**
         * sqs block.
         * <p>
         * @return {@code this}
         * @param sqs sqs block. This parameter is required.
         */
        public Builder sqs(final java.util.List<? extends imports.aws.IotTopicRuleSqs> sqs) {
            this.config.sqs(sqs);
            return this;
        }

        /**
         * step_functions block.
         * <p>
         * @return {@code this}
         * @param stepFunctions step_functions block. This parameter is required.
         */
        public Builder stepFunctions(final java.util.List<? extends imports.aws.IotTopicRuleStepFunctions> stepFunctions) {
            this.config.stepFunctions(stepFunctions);
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
         * @returns a newly built instance of {@link imports.aws.IotTopicRule}.
         */
        @Override
        public imports.aws.IotTopicRule build() {
            return new imports.aws.IotTopicRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
