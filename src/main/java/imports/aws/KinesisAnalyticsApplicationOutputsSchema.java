package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisAnalyticsApplicationOutputsSchema")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationOutputsSchema.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationOutputsSchema extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getRecordFormatType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationOutputsSchema}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationOutputsSchema}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationOutputsSchema> {
        private java.lang.String recordFormatType;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationOutputsSchema#getRecordFormatType}
         * @param recordFormatType the value to be set.
         * @return {@code this}
         */
        public Builder recordFormatType(java.lang.String recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationOutputsSchema}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationOutputsSchema build() {
            return new Jsii$Proxy(recordFormatType);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationOutputsSchema}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationOutputsSchema {
        private final java.lang.String recordFormatType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.recordFormatType = software.amazon.jsii.Kernel.get(this, "recordFormatType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String recordFormatType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.recordFormatType = recordFormatType;
        }

        @Override
        public final java.lang.String getRecordFormatType() {
            return this.recordFormatType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRecordFormatType() != null) {
                data.set("recordFormatType", om.valueToTree(this.getRecordFormatType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.KinesisAnalyticsApplicationOutputsSchema"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationOutputsSchema.Jsii$Proxy that = (KinesisAnalyticsApplicationOutputsSchema.Jsii$Proxy) o;

            return this.recordFormatType != null ? this.recordFormatType.equals(that.recordFormatType) : that.recordFormatType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.recordFormatType != null ? this.recordFormatType.hashCode() : 0;
            return result;
        }
    }
}
