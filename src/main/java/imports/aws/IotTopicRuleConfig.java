package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.640Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleConfig")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleConfig.Jsii$Proxy.class)
public interface IotTopicRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getSql();

    @org.jetbrains.annotations.NotNull java.lang.String getSqlVersion();

    /**
     * cloudwatch_alarm block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm> getCloudwatchAlarm() {
        return null;
    }

    /**
     * cloudwatch_metric block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleCloudwatchMetric> getCloudwatchMetric() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * dynamodb block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleDynamodb> getDynamodb() {
        return null;
    }

    /**
     * dynamodbv2 block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleDynamodbv2> getDynamodbv2() {
        return null;
    }

    /**
     * elasticsearch block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleElasticsearch> getElasticsearch() {
        return null;
    }

    /**
     * error_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorAction> getErrorAction() {
        return null;
    }

    /**
     * firehose block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleFirehose> getFirehose() {
        return null;
    }

    /**
     * iot_analytics block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleIotAnalytics> getIotAnalytics() {
        return null;
    }

    /**
     * iot_events block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleIotEvents> getIotEvents() {
        return null;
    }

    /**
     * kinesis block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleKinesis> getKinesis() {
        return null;
    }

    /**
     * lambda block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleLambda> getLambda() {
        return null;
    }

    /**
     * republish block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleRepublish> getRepublish() {
        return null;
    }

    /**
     * s3 block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleS3> getS3() {
        return null;
    }

    /**
     * sns block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleSns> getSns() {
        return null;
    }

    /**
     * sqs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleSqs> getSqs() {
        return null;
    }

    /**
     * step_functions block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleStepFunctions> getStepFunctions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleConfig> {
        private java.lang.Boolean enabled;
        private java.lang.String name;
        private java.lang.String sql;
        private java.lang.String sqlVersion;
        private java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm> cloudwatchAlarm;
        private java.util.List<imports.aws.IotTopicRuleCloudwatchMetric> cloudwatchMetric;
        private java.lang.String description;
        private java.util.List<imports.aws.IotTopicRuleDynamodb> dynamodb;
        private java.util.List<imports.aws.IotTopicRuleDynamodbv2> dynamodbv2;
        private java.util.List<imports.aws.IotTopicRuleElasticsearch> elasticsearch;
        private java.util.List<imports.aws.IotTopicRuleErrorAction> errorAction;
        private java.util.List<imports.aws.IotTopicRuleFirehose> firehose;
        private java.util.List<imports.aws.IotTopicRuleIotAnalytics> iotAnalytics;
        private java.util.List<imports.aws.IotTopicRuleIotEvents> iotEvents;
        private java.util.List<imports.aws.IotTopicRuleKinesis> kinesis;
        private java.util.List<imports.aws.IotTopicRuleLambda> lambda;
        private java.util.List<imports.aws.IotTopicRuleRepublish> republish;
        private java.util.List<imports.aws.IotTopicRuleS3> s3;
        private java.util.List<imports.aws.IotTopicRuleSns> sns;
        private java.util.List<imports.aws.IotTopicRuleSqs> sqs;
        private java.util.List<imports.aws.IotTopicRuleStepFunctions> stepFunctions;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link IotTopicRuleConfig#getEnabled}
         * @param enabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getSql}
         * @param sql the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sql(java.lang.String sql) {
            this.sql = sql;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getSqlVersion}
         * @param sqlVersion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sqlVersion(java.lang.String sqlVersion) {
            this.sqlVersion = sqlVersion;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getCloudwatchAlarm}
         * @param cloudwatchAlarm cloudwatch_alarm block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchAlarm(java.util.List<? extends imports.aws.IotTopicRuleCloudwatchAlarm> cloudwatchAlarm) {
            this.cloudwatchAlarm = (java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm>)cloudwatchAlarm;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getCloudwatchMetric}
         * @param cloudwatchMetric cloudwatch_metric block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchMetric(java.util.List<? extends imports.aws.IotTopicRuleCloudwatchMetric> cloudwatchMetric) {
            this.cloudwatchMetric = (java.util.List<imports.aws.IotTopicRuleCloudwatchMetric>)cloudwatchMetric;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getDynamodb}
         * @param dynamodb dynamodb block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dynamodb(java.util.List<? extends imports.aws.IotTopicRuleDynamodb> dynamodb) {
            this.dynamodb = (java.util.List<imports.aws.IotTopicRuleDynamodb>)dynamodb;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getDynamodbv2}
         * @param dynamodbv2 dynamodbv2 block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dynamodbv2(java.util.List<? extends imports.aws.IotTopicRuleDynamodbv2> dynamodbv2) {
            this.dynamodbv2 = (java.util.List<imports.aws.IotTopicRuleDynamodbv2>)dynamodbv2;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getElasticsearch}
         * @param elasticsearch elasticsearch block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elasticsearch(java.util.List<? extends imports.aws.IotTopicRuleElasticsearch> elasticsearch) {
            this.elasticsearch = (java.util.List<imports.aws.IotTopicRuleElasticsearch>)elasticsearch;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getErrorAction}
         * @param errorAction error_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder errorAction(java.util.List<? extends imports.aws.IotTopicRuleErrorAction> errorAction) {
            this.errorAction = (java.util.List<imports.aws.IotTopicRuleErrorAction>)errorAction;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getFirehose}
         * @param firehose firehose block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder firehose(java.util.List<? extends imports.aws.IotTopicRuleFirehose> firehose) {
            this.firehose = (java.util.List<imports.aws.IotTopicRuleFirehose>)firehose;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getIotAnalytics}
         * @param iotAnalytics iot_analytics block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder iotAnalytics(java.util.List<? extends imports.aws.IotTopicRuleIotAnalytics> iotAnalytics) {
            this.iotAnalytics = (java.util.List<imports.aws.IotTopicRuleIotAnalytics>)iotAnalytics;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getIotEvents}
         * @param iotEvents iot_events block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder iotEvents(java.util.List<? extends imports.aws.IotTopicRuleIotEvents> iotEvents) {
            this.iotEvents = (java.util.List<imports.aws.IotTopicRuleIotEvents>)iotEvents;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getKinesis}
         * @param kinesis kinesis block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesis(java.util.List<? extends imports.aws.IotTopicRuleKinesis> kinesis) {
            this.kinesis = (java.util.List<imports.aws.IotTopicRuleKinesis>)kinesis;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getLambda}
         * @param lambda lambda block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambda(java.util.List<? extends imports.aws.IotTopicRuleLambda> lambda) {
            this.lambda = (java.util.List<imports.aws.IotTopicRuleLambda>)lambda;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getRepublish}
         * @param republish republish block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder republish(java.util.List<? extends imports.aws.IotTopicRuleRepublish> republish) {
            this.republish = (java.util.List<imports.aws.IotTopicRuleRepublish>)republish;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getS3}
         * @param s3 s3 block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3(java.util.List<? extends imports.aws.IotTopicRuleS3> s3) {
            this.s3 = (java.util.List<imports.aws.IotTopicRuleS3>)s3;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getSns}
         * @param sns sns block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sns(java.util.List<? extends imports.aws.IotTopicRuleSns> sns) {
            this.sns = (java.util.List<imports.aws.IotTopicRuleSns>)sns;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getSqs}
         * @param sqs sqs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sqs(java.util.List<? extends imports.aws.IotTopicRuleSqs> sqs) {
            this.sqs = (java.util.List<imports.aws.IotTopicRuleSqs>)sqs;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getStepFunctions}
         * @param stepFunctions step_functions block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stepFunctions(java.util.List<? extends imports.aws.IotTopicRuleStepFunctions> stepFunctions) {
            this.stepFunctions = (java.util.List<imports.aws.IotTopicRuleStepFunctions>)stepFunctions;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getDependsOn}
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
         * Sets the value of {@link IotTopicRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleConfig#getProvider}
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
         * @return a new instance of {@link IotTopicRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleConfig build() {
            return new Jsii$Proxy(enabled, name, sql, sqlVersion, cloudwatchAlarm, cloudwatchMetric, description, dynamodb, dynamodbv2, elasticsearch, errorAction, firehose, iotAnalytics, iotEvents, kinesis, lambda, republish, s3, sns, sqs, stepFunctions, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleConfig {
        private final java.lang.Boolean enabled;
        private final java.lang.String name;
        private final java.lang.String sql;
        private final java.lang.String sqlVersion;
        private final java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm> cloudwatchAlarm;
        private final java.util.List<imports.aws.IotTopicRuleCloudwatchMetric> cloudwatchMetric;
        private final java.lang.String description;
        private final java.util.List<imports.aws.IotTopicRuleDynamodb> dynamodb;
        private final java.util.List<imports.aws.IotTopicRuleDynamodbv2> dynamodbv2;
        private final java.util.List<imports.aws.IotTopicRuleElasticsearch> elasticsearch;
        private final java.util.List<imports.aws.IotTopicRuleErrorAction> errorAction;
        private final java.util.List<imports.aws.IotTopicRuleFirehose> firehose;
        private final java.util.List<imports.aws.IotTopicRuleIotAnalytics> iotAnalytics;
        private final java.util.List<imports.aws.IotTopicRuleIotEvents> iotEvents;
        private final java.util.List<imports.aws.IotTopicRuleKinesis> kinesis;
        private final java.util.List<imports.aws.IotTopicRuleLambda> lambda;
        private final java.util.List<imports.aws.IotTopicRuleRepublish> republish;
        private final java.util.List<imports.aws.IotTopicRuleS3> s3;
        private final java.util.List<imports.aws.IotTopicRuleSns> sns;
        private final java.util.List<imports.aws.IotTopicRuleSqs> sqs;
        private final java.util.List<imports.aws.IotTopicRuleStepFunctions> stepFunctions;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sql = software.amazon.jsii.Kernel.get(this, "sql", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sqlVersion = software.amazon.jsii.Kernel.get(this, "sqlVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchAlarm = software.amazon.jsii.Kernel.get(this, "cloudwatchAlarm", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleCloudwatchAlarm.class)));
            this.cloudwatchMetric = software.amazon.jsii.Kernel.get(this, "cloudwatchMetric", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleCloudwatchMetric.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dynamodb = software.amazon.jsii.Kernel.get(this, "dynamodb", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleDynamodb.class)));
            this.dynamodbv2 = software.amazon.jsii.Kernel.get(this, "dynamodbv2", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleDynamodbv2.class)));
            this.elasticsearch = software.amazon.jsii.Kernel.get(this, "elasticsearch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleElasticsearch.class)));
            this.errorAction = software.amazon.jsii.Kernel.get(this, "errorAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorAction.class)));
            this.firehose = software.amazon.jsii.Kernel.get(this, "firehose", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleFirehose.class)));
            this.iotAnalytics = software.amazon.jsii.Kernel.get(this, "iotAnalytics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleIotAnalytics.class)));
            this.iotEvents = software.amazon.jsii.Kernel.get(this, "iotEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleIotEvents.class)));
            this.kinesis = software.amazon.jsii.Kernel.get(this, "kinesis", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleKinesis.class)));
            this.lambda = software.amazon.jsii.Kernel.get(this, "lambda", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleLambda.class)));
            this.republish = software.amazon.jsii.Kernel.get(this, "republish", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleRepublish.class)));
            this.s3 = software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleS3.class)));
            this.sns = software.amazon.jsii.Kernel.get(this, "sns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleSns.class)));
            this.sqs = software.amazon.jsii.Kernel.get(this, "sqs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleSqs.class)));
            this.stepFunctions = software.amazon.jsii.Kernel.get(this, "stepFunctions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleStepFunctions.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean enabled, final java.lang.String name, final java.lang.String sql, final java.lang.String sqlVersion, final java.util.List<? extends imports.aws.IotTopicRuleCloudwatchAlarm> cloudwatchAlarm, final java.util.List<? extends imports.aws.IotTopicRuleCloudwatchMetric> cloudwatchMetric, final java.lang.String description, final java.util.List<? extends imports.aws.IotTopicRuleDynamodb> dynamodb, final java.util.List<? extends imports.aws.IotTopicRuleDynamodbv2> dynamodbv2, final java.util.List<? extends imports.aws.IotTopicRuleElasticsearch> elasticsearch, final java.util.List<? extends imports.aws.IotTopicRuleErrorAction> errorAction, final java.util.List<? extends imports.aws.IotTopicRuleFirehose> firehose, final java.util.List<? extends imports.aws.IotTopicRuleIotAnalytics> iotAnalytics, final java.util.List<? extends imports.aws.IotTopicRuleIotEvents> iotEvents, final java.util.List<? extends imports.aws.IotTopicRuleKinesis> kinesis, final java.util.List<? extends imports.aws.IotTopicRuleLambda> lambda, final java.util.List<? extends imports.aws.IotTopicRuleRepublish> republish, final java.util.List<? extends imports.aws.IotTopicRuleS3> s3, final java.util.List<? extends imports.aws.IotTopicRuleSns> sns, final java.util.List<? extends imports.aws.IotTopicRuleSqs> sqs, final java.util.List<? extends imports.aws.IotTopicRuleStepFunctions> stepFunctions, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(enabled, "enabled is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.sql = java.util.Objects.requireNonNull(sql, "sql is required");
            this.sqlVersion = java.util.Objects.requireNonNull(sqlVersion, "sqlVersion is required");
            this.cloudwatchAlarm = (java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm>)cloudwatchAlarm;
            this.cloudwatchMetric = (java.util.List<imports.aws.IotTopicRuleCloudwatchMetric>)cloudwatchMetric;
            this.description = description;
            this.dynamodb = (java.util.List<imports.aws.IotTopicRuleDynamodb>)dynamodb;
            this.dynamodbv2 = (java.util.List<imports.aws.IotTopicRuleDynamodbv2>)dynamodbv2;
            this.elasticsearch = (java.util.List<imports.aws.IotTopicRuleElasticsearch>)elasticsearch;
            this.errorAction = (java.util.List<imports.aws.IotTopicRuleErrorAction>)errorAction;
            this.firehose = (java.util.List<imports.aws.IotTopicRuleFirehose>)firehose;
            this.iotAnalytics = (java.util.List<imports.aws.IotTopicRuleIotAnalytics>)iotAnalytics;
            this.iotEvents = (java.util.List<imports.aws.IotTopicRuleIotEvents>)iotEvents;
            this.kinesis = (java.util.List<imports.aws.IotTopicRuleKinesis>)kinesis;
            this.lambda = (java.util.List<imports.aws.IotTopicRuleLambda>)lambda;
            this.republish = (java.util.List<imports.aws.IotTopicRuleRepublish>)republish;
            this.s3 = (java.util.List<imports.aws.IotTopicRuleS3>)s3;
            this.sns = (java.util.List<imports.aws.IotTopicRuleSns>)sns;
            this.sqs = (java.util.List<imports.aws.IotTopicRuleSqs>)sqs;
            this.stepFunctions = (java.util.List<imports.aws.IotTopicRuleStepFunctions>)stepFunctions;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getSql() {
            return this.sql;
        }

        @Override
        public final java.lang.String getSqlVersion() {
            return this.sqlVersion;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleCloudwatchAlarm> getCloudwatchAlarm() {
            return this.cloudwatchAlarm;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleCloudwatchMetric> getCloudwatchMetric() {
            return this.cloudwatchMetric;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleDynamodb> getDynamodb() {
            return this.dynamodb;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleDynamodbv2> getDynamodbv2() {
            return this.dynamodbv2;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleElasticsearch> getElasticsearch() {
            return this.elasticsearch;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorAction> getErrorAction() {
            return this.errorAction;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleFirehose> getFirehose() {
            return this.firehose;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleIotAnalytics> getIotAnalytics() {
            return this.iotAnalytics;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleIotEvents> getIotEvents() {
            return this.iotEvents;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleKinesis> getKinesis() {
            return this.kinesis;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleLambda> getLambda() {
            return this.lambda;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleRepublish> getRepublish() {
            return this.republish;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleS3> getS3() {
            return this.s3;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleSns> getSns() {
            return this.sns;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleSqs> getSqs() {
            return this.sqs;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleStepFunctions> getStepFunctions() {
            return this.stepFunctions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("enabled", om.valueToTree(this.getEnabled()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("sql", om.valueToTree(this.getSql()));
            data.set("sqlVersion", om.valueToTree(this.getSqlVersion()));
            if (this.getCloudwatchAlarm() != null) {
                data.set("cloudwatchAlarm", om.valueToTree(this.getCloudwatchAlarm()));
            }
            if (this.getCloudwatchMetric() != null) {
                data.set("cloudwatchMetric", om.valueToTree(this.getCloudwatchMetric()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDynamodb() != null) {
                data.set("dynamodb", om.valueToTree(this.getDynamodb()));
            }
            if (this.getDynamodbv2() != null) {
                data.set("dynamodbv2", om.valueToTree(this.getDynamodbv2()));
            }
            if (this.getElasticsearch() != null) {
                data.set("elasticsearch", om.valueToTree(this.getElasticsearch()));
            }
            if (this.getErrorAction() != null) {
                data.set("errorAction", om.valueToTree(this.getErrorAction()));
            }
            if (this.getFirehose() != null) {
                data.set("firehose", om.valueToTree(this.getFirehose()));
            }
            if (this.getIotAnalytics() != null) {
                data.set("iotAnalytics", om.valueToTree(this.getIotAnalytics()));
            }
            if (this.getIotEvents() != null) {
                data.set("iotEvents", om.valueToTree(this.getIotEvents()));
            }
            if (this.getKinesis() != null) {
                data.set("kinesis", om.valueToTree(this.getKinesis()));
            }
            if (this.getLambda() != null) {
                data.set("lambda", om.valueToTree(this.getLambda()));
            }
            if (this.getRepublish() != null) {
                data.set("republish", om.valueToTree(this.getRepublish()));
            }
            if (this.getS3() != null) {
                data.set("s3", om.valueToTree(this.getS3()));
            }
            if (this.getSns() != null) {
                data.set("sns", om.valueToTree(this.getSns()));
            }
            if (this.getSqs() != null) {
                data.set("sqs", om.valueToTree(this.getSqs()));
            }
            if (this.getStepFunctions() != null) {
                data.set("stepFunctions", om.valueToTree(this.getStepFunctions()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleConfig.Jsii$Proxy that = (IotTopicRuleConfig.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            if (!name.equals(that.name)) return false;
            if (!sql.equals(that.sql)) return false;
            if (!sqlVersion.equals(that.sqlVersion)) return false;
            if (this.cloudwatchAlarm != null ? !this.cloudwatchAlarm.equals(that.cloudwatchAlarm) : that.cloudwatchAlarm != null) return false;
            if (this.cloudwatchMetric != null ? !this.cloudwatchMetric.equals(that.cloudwatchMetric) : that.cloudwatchMetric != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dynamodb != null ? !this.dynamodb.equals(that.dynamodb) : that.dynamodb != null) return false;
            if (this.dynamodbv2 != null ? !this.dynamodbv2.equals(that.dynamodbv2) : that.dynamodbv2 != null) return false;
            if (this.elasticsearch != null ? !this.elasticsearch.equals(that.elasticsearch) : that.elasticsearch != null) return false;
            if (this.errorAction != null ? !this.errorAction.equals(that.errorAction) : that.errorAction != null) return false;
            if (this.firehose != null ? !this.firehose.equals(that.firehose) : that.firehose != null) return false;
            if (this.iotAnalytics != null ? !this.iotAnalytics.equals(that.iotAnalytics) : that.iotAnalytics != null) return false;
            if (this.iotEvents != null ? !this.iotEvents.equals(that.iotEvents) : that.iotEvents != null) return false;
            if (this.kinesis != null ? !this.kinesis.equals(that.kinesis) : that.kinesis != null) return false;
            if (this.lambda != null ? !this.lambda.equals(that.lambda) : that.lambda != null) return false;
            if (this.republish != null ? !this.republish.equals(that.republish) : that.republish != null) return false;
            if (this.s3 != null ? !this.s3.equals(that.s3) : that.s3 != null) return false;
            if (this.sns != null ? !this.sns.equals(that.sns) : that.sns != null) return false;
            if (this.sqs != null ? !this.sqs.equals(that.sqs) : that.sqs != null) return false;
            if (this.stepFunctions != null ? !this.stepFunctions.equals(that.stepFunctions) : that.stepFunctions != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.sql.hashCode());
            result = 31 * result + (this.sqlVersion.hashCode());
            result = 31 * result + (this.cloudwatchAlarm != null ? this.cloudwatchAlarm.hashCode() : 0);
            result = 31 * result + (this.cloudwatchMetric != null ? this.cloudwatchMetric.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dynamodb != null ? this.dynamodb.hashCode() : 0);
            result = 31 * result + (this.dynamodbv2 != null ? this.dynamodbv2.hashCode() : 0);
            result = 31 * result + (this.elasticsearch != null ? this.elasticsearch.hashCode() : 0);
            result = 31 * result + (this.errorAction != null ? this.errorAction.hashCode() : 0);
            result = 31 * result + (this.firehose != null ? this.firehose.hashCode() : 0);
            result = 31 * result + (this.iotAnalytics != null ? this.iotAnalytics.hashCode() : 0);
            result = 31 * result + (this.iotEvents != null ? this.iotEvents.hashCode() : 0);
            result = 31 * result + (this.kinesis != null ? this.kinesis.hashCode() : 0);
            result = 31 * result + (this.lambda != null ? this.lambda.hashCode() : 0);
            result = 31 * result + (this.republish != null ? this.republish.hashCode() : 0);
            result = 31 * result + (this.s3 != null ? this.s3.hashCode() : 0);
            result = 31 * result + (this.sns != null ? this.sns.hashCode() : 0);
            result = 31 * result + (this.sqs != null ? this.sqs.hashCode() : 0);
            result = 31 * result + (this.stepFunctions != null ? this.stepFunctions.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
