package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.106Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BatchJobDefinitionRetryStrategy")
@software.amazon.jsii.Jsii.Proxy(BatchJobDefinitionRetryStrategy.Jsii$Proxy.class)
public interface BatchJobDefinitionRetryStrategy extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getAttempts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BatchJobDefinitionRetryStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BatchJobDefinitionRetryStrategy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BatchJobDefinitionRetryStrategy> {
        private java.lang.Number attempts;

        /**
         * Sets the value of {@link BatchJobDefinitionRetryStrategy#getAttempts}
         * @param attempts the value to be set.
         * @return {@code this}
         */
        public Builder attempts(java.lang.Number attempts) {
            this.attempts = attempts;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BatchJobDefinitionRetryStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BatchJobDefinitionRetryStrategy build() {
            return new Jsii$Proxy(attempts);
        }
    }

    /**
     * An implementation for {@link BatchJobDefinitionRetryStrategy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BatchJobDefinitionRetryStrategy {
        private final java.lang.Number attempts;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attempts = software.amazon.jsii.Kernel.get(this, "attempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number attempts) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attempts = attempts;
        }

        @Override
        public final java.lang.Number getAttempts() {
            return this.attempts;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAttempts() != null) {
                data.set("attempts", om.valueToTree(this.getAttempts()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.BatchJobDefinitionRetryStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BatchJobDefinitionRetryStrategy.Jsii$Proxy that = (BatchJobDefinitionRetryStrategy.Jsii$Proxy) o;

            return this.attempts != null ? this.attempts.equals(that.attempts) : that.attempts == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attempts != null ? this.attempts.hashCode() : 0;
            return result;
        }
    }
}
