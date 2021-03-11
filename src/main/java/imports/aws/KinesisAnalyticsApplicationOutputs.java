package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationOutputs")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationOutputs.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationOutputs extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * schema block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsSchema> getSchema();

    /**
     * kinesis_firehose block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose> getKinesisFirehose() {
        return null;
    }

    /**
     * kinesis_stream block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream> getKinesisStream() {
        return null;
    }

    /**
     * lambda block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsLambda> getLambda() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationOutputs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationOutputs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationOutputs> {
        private java.lang.String name;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsSchema> schema;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose> kinesisFirehose;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream> kinesisStream;
        private java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsLambda> lambda;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationOutputs#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationOutputs#getSchema}
         * @param schema schema block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schema(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsSchema> schema) {
            this.schema = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsSchema>)schema;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationOutputs#getKinesisFirehose}
         * @param kinesisFirehose kinesis_firehose block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisFirehose(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose> kinesisFirehose) {
            this.kinesisFirehose = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose>)kinesisFirehose;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationOutputs#getKinesisStream}
         * @param kinesisStream kinesis_stream block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisStream(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream> kinesisStream) {
            this.kinesisStream = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream>)kinesisStream;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationOutputs#getLambda}
         * @param lambda lambda block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambda(java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsLambda> lambda) {
            this.lambda = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsLambda>)lambda;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationOutputs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationOutputs build() {
            return new Jsii$Proxy(name, schema, kinesisFirehose, kinesisStream, lambda);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationOutputs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationOutputs {
        private final java.lang.String name;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsSchema> schema;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose> kinesisFirehose;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream> kinesisStream;
        private final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsLambda> lambda;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationOutputsSchema.class)));
            this.kinesisFirehose = software.amazon.jsii.Kernel.get(this, "kinesisFirehose", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose.class)));
            this.kinesisStream = software.amazon.jsii.Kernel.get(this, "kinesisStream", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream.class)));
            this.lambda = software.amazon.jsii.Kernel.get(this, "lambda", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisAnalyticsApplicationOutputsLambda.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsSchema> schema, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose> kinesisFirehose, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream> kinesisStream, final java.util.List<? extends imports.aws.KinesisAnalyticsApplicationOutputsLambda> lambda) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.schema = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsSchema>)java.util.Objects.requireNonNull(schema, "schema is required");
            this.kinesisFirehose = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose>)kinesisFirehose;
            this.kinesisStream = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream>)kinesisStream;
            this.lambda = (java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsLambda>)lambda;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsSchema> getSchema() {
            return this.schema;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisFirehose> getKinesisFirehose() {
            return this.kinesisFirehose;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsKinesisStream> getKinesisStream() {
            return this.kinesisStream;
        }

        @Override
        public final java.util.List<imports.aws.KinesisAnalyticsApplicationOutputsLambda> getLambda() {
            return this.lambda;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("schema", om.valueToTree(this.getSchema()));
            if (this.getKinesisFirehose() != null) {
                data.set("kinesisFirehose", om.valueToTree(this.getKinesisFirehose()));
            }
            if (this.getKinesisStream() != null) {
                data.set("kinesisStream", om.valueToTree(this.getKinesisStream()));
            }
            if (this.getLambda() != null) {
                data.set("lambda", om.valueToTree(this.getLambda()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationOutputs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationOutputs.Jsii$Proxy that = (KinesisAnalyticsApplicationOutputs.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!schema.equals(that.schema)) return false;
            if (this.kinesisFirehose != null ? !this.kinesisFirehose.equals(that.kinesisFirehose) : that.kinesisFirehose != null) return false;
            if (this.kinesisStream != null ? !this.kinesisStream.equals(that.kinesisStream) : that.kinesisStream != null) return false;
            return this.lambda != null ? this.lambda.equals(that.lambda) : that.lambda == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.schema.hashCode());
            result = 31 * result + (this.kinesisFirehose != null ? this.kinesisFirehose.hashCode() : 0);
            result = 31 * result + (this.kinesisStream != null ? this.kinesisStream.hashCode() : 0);
            result = 31 * result + (this.lambda != null ? this.lambda.hashCode() : 0);
            return result;
        }
    }
}
