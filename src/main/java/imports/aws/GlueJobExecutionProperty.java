package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.603Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueJobExecutionProperty")
@software.amazon.jsii.Jsii.Proxy(GlueJobExecutionProperty.Jsii$Proxy.class)
public interface GlueJobExecutionProperty extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxConcurrentRuns() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueJobExecutionProperty}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueJobExecutionProperty}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueJobExecutionProperty> {
        private java.lang.Number maxConcurrentRuns;

        /**
         * Sets the value of {@link GlueJobExecutionProperty#getMaxConcurrentRuns}
         * @param maxConcurrentRuns the value to be set.
         * @return {@code this}
         */
        public Builder maxConcurrentRuns(java.lang.Number maxConcurrentRuns) {
            this.maxConcurrentRuns = maxConcurrentRuns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueJobExecutionProperty}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueJobExecutionProperty build() {
            return new Jsii$Proxy(maxConcurrentRuns);
        }
    }

    /**
     * An implementation for {@link GlueJobExecutionProperty}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueJobExecutionProperty {
        private final java.lang.Number maxConcurrentRuns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxConcurrentRuns = software.amazon.jsii.Kernel.get(this, "maxConcurrentRuns", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number maxConcurrentRuns) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxConcurrentRuns = maxConcurrentRuns;
        }

        @Override
        public final java.lang.Number getMaxConcurrentRuns() {
            return this.maxConcurrentRuns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxConcurrentRuns() != null) {
                data.set("maxConcurrentRuns", om.valueToTree(this.getMaxConcurrentRuns()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueJobExecutionProperty"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueJobExecutionProperty.Jsii$Proxy that = (GlueJobExecutionProperty.Jsii$Proxy) o;

            return this.maxConcurrentRuns != null ? this.maxConcurrentRuns.equals(that.maxConcurrentRuns) : that.maxConcurrentRuns == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxConcurrentRuns != null ? this.maxConcurrentRuns.hashCode() : 0;
            return result;
        }
    }
}
