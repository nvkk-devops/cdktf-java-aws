package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.642Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleErrorAction")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleErrorAction.Jsii$Proxy.class)
public interface IotTopicRuleErrorAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * cloudwatch_alarm block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchAlarm> getCloudwatchAlarm() {
        return null;
    }

    /**
     * cloudwatch_metric block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchMetric> getCloudwatchMetric() {
        return null;
    }

    /**
     * dynamodb block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionDynamodb> getDynamodb() {
        return null;
    }

    /**
     * dynamodbv2 block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2> getDynamodbv2() {
        return null;
    }

    /**
     * elasticsearch block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionElasticsearch> getElasticsearch() {
        return null;
    }

    /**
     * firehose block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionFirehose> getFirehose() {
        return null;
    }

    /**
     * iot_analytics block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionIotAnalytics> getIotAnalytics() {
        return null;
    }

    /**
     * iot_events block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionIotEvents> getIotEvents() {
        return null;
    }

    /**
     * kinesis block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionKinesis> getKinesis() {
        return null;
    }

    /**
     * lambda block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionLambda> getLambda() {
        return null;
    }

    /**
     * republish block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionRepublish> getRepublish() {
        return null;
    }

    /**
     * s3 block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionS3> getS3() {
        return null;
    }

    /**
     * sns block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionSns> getSns() {
        return null;
    }

    /**
     * sqs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionSqs> getSqs() {
        return null;
    }

    /**
     * step_functions block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotTopicRuleErrorActionStepFunctions> getStepFunctions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleErrorAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleErrorAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleErrorAction> {
        private java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchAlarm> cloudwatchAlarm;
        private java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchMetric> cloudwatchMetric;
        private java.util.List<imports.aws.IotTopicRuleErrorActionDynamodb> dynamodb;
        private java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2> dynamodbv2;
        private java.util.List<imports.aws.IotTopicRuleErrorActionElasticsearch> elasticsearch;
        private java.util.List<imports.aws.IotTopicRuleErrorActionFirehose> firehose;
        private java.util.List<imports.aws.IotTopicRuleErrorActionIotAnalytics> iotAnalytics;
        private java.util.List<imports.aws.IotTopicRuleErrorActionIotEvents> iotEvents;
        private java.util.List<imports.aws.IotTopicRuleErrorActionKinesis> kinesis;
        private java.util.List<imports.aws.IotTopicRuleErrorActionLambda> lambda;
        private java.util.List<imports.aws.IotTopicRuleErrorActionRepublish> republish;
        private java.util.List<imports.aws.IotTopicRuleErrorActionS3> s3;
        private java.util.List<imports.aws.IotTopicRuleErrorActionSns> sns;
        private java.util.List<imports.aws.IotTopicRuleErrorActionSqs> sqs;
        private java.util.List<imports.aws.IotTopicRuleErrorActionStepFunctions> stepFunctions;

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getCloudwatchAlarm}
         * @param cloudwatchAlarm cloudwatch_alarm block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchAlarm(java.util.List<? extends imports.aws.IotTopicRuleErrorActionCloudwatchAlarm> cloudwatchAlarm) {
            this.cloudwatchAlarm = (java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchAlarm>)cloudwatchAlarm;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getCloudwatchMetric}
         * @param cloudwatchMetric cloudwatch_metric block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchMetric(java.util.List<? extends imports.aws.IotTopicRuleErrorActionCloudwatchMetric> cloudwatchMetric) {
            this.cloudwatchMetric = (java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchMetric>)cloudwatchMetric;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getDynamodb}
         * @param dynamodb dynamodb block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dynamodb(java.util.List<? extends imports.aws.IotTopicRuleErrorActionDynamodb> dynamodb) {
            this.dynamodb = (java.util.List<imports.aws.IotTopicRuleErrorActionDynamodb>)dynamodb;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getDynamodbv2}
         * @param dynamodbv2 dynamodbv2 block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dynamodbv2(java.util.List<? extends imports.aws.IotTopicRuleErrorActionDynamodbv2> dynamodbv2) {
            this.dynamodbv2 = (java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2>)dynamodbv2;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getElasticsearch}
         * @param elasticsearch elasticsearch block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elasticsearch(java.util.List<? extends imports.aws.IotTopicRuleErrorActionElasticsearch> elasticsearch) {
            this.elasticsearch = (java.util.List<imports.aws.IotTopicRuleErrorActionElasticsearch>)elasticsearch;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getFirehose}
         * @param firehose firehose block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder firehose(java.util.List<? extends imports.aws.IotTopicRuleErrorActionFirehose> firehose) {
            this.firehose = (java.util.List<imports.aws.IotTopicRuleErrorActionFirehose>)firehose;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getIotAnalytics}
         * @param iotAnalytics iot_analytics block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder iotAnalytics(java.util.List<? extends imports.aws.IotTopicRuleErrorActionIotAnalytics> iotAnalytics) {
            this.iotAnalytics = (java.util.List<imports.aws.IotTopicRuleErrorActionIotAnalytics>)iotAnalytics;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getIotEvents}
         * @param iotEvents iot_events block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder iotEvents(java.util.List<? extends imports.aws.IotTopicRuleErrorActionIotEvents> iotEvents) {
            this.iotEvents = (java.util.List<imports.aws.IotTopicRuleErrorActionIotEvents>)iotEvents;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getKinesis}
         * @param kinesis kinesis block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesis(java.util.List<? extends imports.aws.IotTopicRuleErrorActionKinesis> kinesis) {
            this.kinesis = (java.util.List<imports.aws.IotTopicRuleErrorActionKinesis>)kinesis;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getLambda}
         * @param lambda lambda block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambda(java.util.List<? extends imports.aws.IotTopicRuleErrorActionLambda> lambda) {
            this.lambda = (java.util.List<imports.aws.IotTopicRuleErrorActionLambda>)lambda;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getRepublish}
         * @param republish republish block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder republish(java.util.List<? extends imports.aws.IotTopicRuleErrorActionRepublish> republish) {
            this.republish = (java.util.List<imports.aws.IotTopicRuleErrorActionRepublish>)republish;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getS3}
         * @param s3 s3 block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3(java.util.List<? extends imports.aws.IotTopicRuleErrorActionS3> s3) {
            this.s3 = (java.util.List<imports.aws.IotTopicRuleErrorActionS3>)s3;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getSns}
         * @param sns sns block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sns(java.util.List<? extends imports.aws.IotTopicRuleErrorActionSns> sns) {
            this.sns = (java.util.List<imports.aws.IotTopicRuleErrorActionSns>)sns;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getSqs}
         * @param sqs sqs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sqs(java.util.List<? extends imports.aws.IotTopicRuleErrorActionSqs> sqs) {
            this.sqs = (java.util.List<imports.aws.IotTopicRuleErrorActionSqs>)sqs;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorAction#getStepFunctions}
         * @param stepFunctions step_functions block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stepFunctions(java.util.List<? extends imports.aws.IotTopicRuleErrorActionStepFunctions> stepFunctions) {
            this.stepFunctions = (java.util.List<imports.aws.IotTopicRuleErrorActionStepFunctions>)stepFunctions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleErrorAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleErrorAction build() {
            return new Jsii$Proxy(cloudwatchAlarm, cloudwatchMetric, dynamodb, dynamodbv2, elasticsearch, firehose, iotAnalytics, iotEvents, kinesis, lambda, republish, s3, sns, sqs, stepFunctions);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleErrorAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleErrorAction {
        private final java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchAlarm> cloudwatchAlarm;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchMetric> cloudwatchMetric;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionDynamodb> dynamodb;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2> dynamodbv2;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionElasticsearch> elasticsearch;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionFirehose> firehose;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionIotAnalytics> iotAnalytics;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionIotEvents> iotEvents;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionKinesis> kinesis;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionLambda> lambda;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionRepublish> republish;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionS3> s3;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionSns> sns;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionSqs> sqs;
        private final java.util.List<imports.aws.IotTopicRuleErrorActionStepFunctions> stepFunctions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cloudwatchAlarm = software.amazon.jsii.Kernel.get(this, "cloudwatchAlarm", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionCloudwatchAlarm.class)));
            this.cloudwatchMetric = software.amazon.jsii.Kernel.get(this, "cloudwatchMetric", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionCloudwatchMetric.class)));
            this.dynamodb = software.amazon.jsii.Kernel.get(this, "dynamodb", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionDynamodb.class)));
            this.dynamodbv2 = software.amazon.jsii.Kernel.get(this, "dynamodbv2", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionDynamodbv2.class)));
            this.elasticsearch = software.amazon.jsii.Kernel.get(this, "elasticsearch", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionElasticsearch.class)));
            this.firehose = software.amazon.jsii.Kernel.get(this, "firehose", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionFirehose.class)));
            this.iotAnalytics = software.amazon.jsii.Kernel.get(this, "iotAnalytics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionIotAnalytics.class)));
            this.iotEvents = software.amazon.jsii.Kernel.get(this, "iotEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionIotEvents.class)));
            this.kinesis = software.amazon.jsii.Kernel.get(this, "kinesis", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionKinesis.class)));
            this.lambda = software.amazon.jsii.Kernel.get(this, "lambda", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionLambda.class)));
            this.republish = software.amazon.jsii.Kernel.get(this, "republish", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionRepublish.class)));
            this.s3 = software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionS3.class)));
            this.sns = software.amazon.jsii.Kernel.get(this, "sns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionSns.class)));
            this.sqs = software.amazon.jsii.Kernel.get(this, "sqs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionSqs.class)));
            this.stepFunctions = software.amazon.jsii.Kernel.get(this, "stepFunctions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotTopicRuleErrorActionStepFunctions.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.IotTopicRuleErrorActionCloudwatchAlarm> cloudwatchAlarm, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionCloudwatchMetric> cloudwatchMetric, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionDynamodb> dynamodb, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionDynamodbv2> dynamodbv2, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionElasticsearch> elasticsearch, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionFirehose> firehose, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionIotAnalytics> iotAnalytics, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionIotEvents> iotEvents, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionKinesis> kinesis, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionLambda> lambda, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionRepublish> republish, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionS3> s3, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionSns> sns, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionSqs> sqs, final java.util.List<? extends imports.aws.IotTopicRuleErrorActionStepFunctions> stepFunctions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cloudwatchAlarm = (java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchAlarm>)cloudwatchAlarm;
            this.cloudwatchMetric = (java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchMetric>)cloudwatchMetric;
            this.dynamodb = (java.util.List<imports.aws.IotTopicRuleErrorActionDynamodb>)dynamodb;
            this.dynamodbv2 = (java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2>)dynamodbv2;
            this.elasticsearch = (java.util.List<imports.aws.IotTopicRuleErrorActionElasticsearch>)elasticsearch;
            this.firehose = (java.util.List<imports.aws.IotTopicRuleErrorActionFirehose>)firehose;
            this.iotAnalytics = (java.util.List<imports.aws.IotTopicRuleErrorActionIotAnalytics>)iotAnalytics;
            this.iotEvents = (java.util.List<imports.aws.IotTopicRuleErrorActionIotEvents>)iotEvents;
            this.kinesis = (java.util.List<imports.aws.IotTopicRuleErrorActionKinesis>)kinesis;
            this.lambda = (java.util.List<imports.aws.IotTopicRuleErrorActionLambda>)lambda;
            this.republish = (java.util.List<imports.aws.IotTopicRuleErrorActionRepublish>)republish;
            this.s3 = (java.util.List<imports.aws.IotTopicRuleErrorActionS3>)s3;
            this.sns = (java.util.List<imports.aws.IotTopicRuleErrorActionSns>)sns;
            this.sqs = (java.util.List<imports.aws.IotTopicRuleErrorActionSqs>)sqs;
            this.stepFunctions = (java.util.List<imports.aws.IotTopicRuleErrorActionStepFunctions>)stepFunctions;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchAlarm> getCloudwatchAlarm() {
            return this.cloudwatchAlarm;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionCloudwatchMetric> getCloudwatchMetric() {
            return this.cloudwatchMetric;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionDynamodb> getDynamodb() {
            return this.dynamodb;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionDynamodbv2> getDynamodbv2() {
            return this.dynamodbv2;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionElasticsearch> getElasticsearch() {
            return this.elasticsearch;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionFirehose> getFirehose() {
            return this.firehose;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionIotAnalytics> getIotAnalytics() {
            return this.iotAnalytics;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionIotEvents> getIotEvents() {
            return this.iotEvents;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionKinesis> getKinesis() {
            return this.kinesis;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionLambda> getLambda() {
            return this.lambda;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionRepublish> getRepublish() {
            return this.republish;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionS3> getS3() {
            return this.s3;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionSns> getSns() {
            return this.sns;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionSqs> getSqs() {
            return this.sqs;
        }

        @Override
        public final java.util.List<imports.aws.IotTopicRuleErrorActionStepFunctions> getStepFunctions() {
            return this.stepFunctions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCloudwatchAlarm() != null) {
                data.set("cloudwatchAlarm", om.valueToTree(this.getCloudwatchAlarm()));
            }
            if (this.getCloudwatchMetric() != null) {
                data.set("cloudwatchMetric", om.valueToTree(this.getCloudwatchMetric()));
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

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleErrorAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleErrorAction.Jsii$Proxy that = (IotTopicRuleErrorAction.Jsii$Proxy) o;

            if (this.cloudwatchAlarm != null ? !this.cloudwatchAlarm.equals(that.cloudwatchAlarm) : that.cloudwatchAlarm != null) return false;
            if (this.cloudwatchMetric != null ? !this.cloudwatchMetric.equals(that.cloudwatchMetric) : that.cloudwatchMetric != null) return false;
            if (this.dynamodb != null ? !this.dynamodb.equals(that.dynamodb) : that.dynamodb != null) return false;
            if (this.dynamodbv2 != null ? !this.dynamodbv2.equals(that.dynamodbv2) : that.dynamodbv2 != null) return false;
            if (this.elasticsearch != null ? !this.elasticsearch.equals(that.elasticsearch) : that.elasticsearch != null) return false;
            if (this.firehose != null ? !this.firehose.equals(that.firehose) : that.firehose != null) return false;
            if (this.iotAnalytics != null ? !this.iotAnalytics.equals(that.iotAnalytics) : that.iotAnalytics != null) return false;
            if (this.iotEvents != null ? !this.iotEvents.equals(that.iotEvents) : that.iotEvents != null) return false;
            if (this.kinesis != null ? !this.kinesis.equals(that.kinesis) : that.kinesis != null) return false;
            if (this.lambda != null ? !this.lambda.equals(that.lambda) : that.lambda != null) return false;
            if (this.republish != null ? !this.republish.equals(that.republish) : that.republish != null) return false;
            if (this.s3 != null ? !this.s3.equals(that.s3) : that.s3 != null) return false;
            if (this.sns != null ? !this.sns.equals(that.sns) : that.sns != null) return false;
            if (this.sqs != null ? !this.sqs.equals(that.sqs) : that.sqs != null) return false;
            return this.stepFunctions != null ? this.stepFunctions.equals(that.stepFunctions) : that.stepFunctions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cloudwatchAlarm != null ? this.cloudwatchAlarm.hashCode() : 0;
            result = 31 * result + (this.cloudwatchMetric != null ? this.cloudwatchMetric.hashCode() : 0);
            result = 31 * result + (this.dynamodb != null ? this.dynamodb.hashCode() : 0);
            result = 31 * result + (this.dynamodbv2 != null ? this.dynamodbv2.hashCode() : 0);
            result = 31 * result + (this.elasticsearch != null ? this.elasticsearch.hashCode() : 0);
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
            return result;
        }
    }
}
