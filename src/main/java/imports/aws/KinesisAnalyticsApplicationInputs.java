package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.650Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationInputs")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationInputs.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationInputs extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix();

    /**
     * schema block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchema> getSchema();

    /**
     * kinesis_firehose block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose> getKinesisFirehose() {
        return null;
    }

    /**
     * kinesis_stream block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisStream> getKinesisStream() {
        return null;
    }

    /**
     * parallelism block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputsParallelism> getParallelism() {
        return null;
    }

    /**
     * processing_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration> getProcessingConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationInputs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationInputs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationInputs> {
        private java.lang.String namePrefix;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchema> schema;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose> kinesisFirehose;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisStream> kinesisStream;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsParallelism> parallelism;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration> processingConfiguration;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputs#getNamePrefix}
         * @param namePrefix the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputs#getSchema}
         * @param schema schema block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schema(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchema> schema) {
            this.schema = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchema>)schema;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputs#getKinesisFirehose}
         * @param kinesisFirehose kinesis_firehose block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisFirehose(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose> kinesisFirehose) {
            this.kinesisFirehose = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose>)kinesisFirehose;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputs#getKinesisStream}
         * @param kinesisStream kinesis_stream block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisStream(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsKinesisStream> kinesisStream) {
            this.kinesisStream = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisStream>)kinesisStream;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputs#getParallelism}
         * @param parallelism parallelism block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder parallelism(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsParallelism> parallelism) {
            this.parallelism = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsParallelism>)parallelism;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationInputs#getProcessingConfiguration}
         * @param processingConfiguration processing_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder processingConfiguration(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration> processingConfiguration) {
            this.processingConfiguration = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration>)processingConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationInputs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationInputs build() {
            return new Jsii$Proxy(namePrefix, schema, kinesisFirehose, kinesisStream, parallelism, processingConfiguration);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationInputs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationInputs {
        private final java.lang.String namePrefix;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchema> schema;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose> kinesisFirehose;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisStream> kinesisStream;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsParallelism> parallelism;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration> processingConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsSchema.class)));
            this.kinesisFirehose = software.amazon.jsii.Kernel.get(this, "kinesisFirehose", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose.class)));
            this.kinesisStream = software.amazon.jsii.Kernel.get(this, "kinesisStream", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsKinesisStream.class)));
            this.parallelism = software.amazon.jsii.Kernel.get(this, "parallelism", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsParallelism.class)));
            this.processingConfiguration = software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String namePrefix, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsSchema> schema, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose> kinesisFirehose, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsKinesisStream> kinesisStream, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsParallelism> parallelism, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration> processingConfiguration) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.namePrefix = java.util.Objects.requireNonNull(namePrefix, "namePrefix is required");
            this.schema = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchema>)java.util.Objects.requireNonNull(schema, "schema is required");
            this.kinesisFirehose = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose>)kinesisFirehose;
            this.kinesisStream = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisStream>)kinesisStream;
            this.parallelism = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsParallelism>)parallelism;
            this.processingConfiguration = (java.util.List<imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration>)processingConfiguration;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsSchema> getSchema() {
            return this.schema;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisFirehose> getKinesisFirehose() {
            return this.kinesisFirehose;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsKinesisStream> getKinesisStream() {
            return this.kinesisStream;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsParallelism> getParallelism() {
            return this.parallelism;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationInputsProcessingConfiguration> getProcessingConfiguration() {
            return this.processingConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            data.set("schema", om.valueToTree(this.getSchema()));
            if (this.getKinesisFirehose() != null) {
                data.set("kinesisFirehose", om.valueToTree(this.getKinesisFirehose()));
            }
            if (this.getKinesisStream() != null) {
                data.set("kinesisStream", om.valueToTree(this.getKinesisStream()));
            }
            if (this.getParallelism() != null) {
                data.set("parallelism", om.valueToTree(this.getParallelism()));
            }
            if (this.getProcessingConfiguration() != null) {
                data.set("processingConfiguration", om.valueToTree(this.getProcessingConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationInputs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationInputs.Jsii$Proxy that = (KinesisAnalyticsApplicationInputs.Jsii$Proxy) o;

            if (!namePrefix.equals(that.namePrefix)) return false;
            if (!schema.equals(that.schema)) return false;
            if (this.kinesisFirehose != null ? !this.kinesisFirehose.equals(that.kinesisFirehose) : that.kinesisFirehose != null) return false;
            if (this.kinesisStream != null ? !this.kinesisStream.equals(that.kinesisStream) : that.kinesisStream != null) return false;
            if (this.parallelism != null ? !this.parallelism.equals(that.parallelism) : that.parallelism != null) return false;
            return this.processingConfiguration != null ? this.processingConfiguration.equals(that.processingConfiguration) : that.processingConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.namePrefix.hashCode();
            result = 31 * result + (this.schema.hashCode());
            result = 31 * result + (this.kinesisFirehose != null ? this.kinesisFirehose.hashCode() : 0);
            result = 31 * result + (this.kinesisStream != null ? this.kinesisStream.hashCode() : 0);
            result = 31 * result + (this.parallelism != null ? this.parallelism.hashCode() : 0);
            result = 31 * result + (this.processingConfiguration != null ? this.processingConfiguration.hashCode() : 0);
            return result;
        }
    }
}
