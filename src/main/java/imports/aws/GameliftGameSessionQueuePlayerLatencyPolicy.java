package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.584Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GameliftGameSessionQueuePlayerLatencyPolicy")
@software.amazon.jsii.Jsii.Proxy(GameliftGameSessionQueuePlayerLatencyPolicy.Jsii$Proxy.class)
public interface GameliftGameSessionQueuePlayerLatencyPolicy extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getMaximumIndividualPlayerLatencyMilliseconds();

    default @org.jetbrains.annotations.Nullable java.lang.Number getPolicyDurationSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GameliftGameSessionQueuePlayerLatencyPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GameliftGameSessionQueuePlayerLatencyPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GameliftGameSessionQueuePlayerLatencyPolicy> {
        private java.lang.Number maximumIndividualPlayerLatencyMilliseconds;
        private java.lang.Number policyDurationSeconds;

        /**
         * Sets the value of {@link GameliftGameSessionQueuePlayerLatencyPolicy#getMaximumIndividualPlayerLatencyMilliseconds}
         * @param maximumIndividualPlayerLatencyMilliseconds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder maximumIndividualPlayerLatencyMilliseconds(java.lang.Number maximumIndividualPlayerLatencyMilliseconds) {
            this.maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueuePlayerLatencyPolicy#getPolicyDurationSeconds}
         * @param policyDurationSeconds the value to be set.
         * @return {@code this}
         */
        public Builder policyDurationSeconds(java.lang.Number policyDurationSeconds) {
            this.policyDurationSeconds = policyDurationSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GameliftGameSessionQueuePlayerLatencyPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GameliftGameSessionQueuePlayerLatencyPolicy build() {
            return new Jsii$Proxy(maximumIndividualPlayerLatencyMilliseconds, policyDurationSeconds);
        }
    }

    /**
     * An implementation for {@link GameliftGameSessionQueuePlayerLatencyPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GameliftGameSessionQueuePlayerLatencyPolicy {
        private final java.lang.Number maximumIndividualPlayerLatencyMilliseconds;
        private final java.lang.Number policyDurationSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maximumIndividualPlayerLatencyMilliseconds = software.amazon.jsii.Kernel.get(this, "maximumIndividualPlayerLatencyMilliseconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.policyDurationSeconds = software.amazon.jsii.Kernel.get(this, "policyDurationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number maximumIndividualPlayerLatencyMilliseconds, final java.lang.Number policyDurationSeconds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maximumIndividualPlayerLatencyMilliseconds = java.util.Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds, "maximumIndividualPlayerLatencyMilliseconds is required");
            this.policyDurationSeconds = policyDurationSeconds;
        }

        @Override
        public final java.lang.Number getMaximumIndividualPlayerLatencyMilliseconds() {
            return this.maximumIndividualPlayerLatencyMilliseconds;
        }

        @Override
        public final java.lang.Number getPolicyDurationSeconds() {
            return this.policyDurationSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maximumIndividualPlayerLatencyMilliseconds", om.valueToTree(this.getMaximumIndividualPlayerLatencyMilliseconds()));
            if (this.getPolicyDurationSeconds() != null) {
                data.set("policyDurationSeconds", om.valueToTree(this.getPolicyDurationSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GameliftGameSessionQueuePlayerLatencyPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GameliftGameSessionQueuePlayerLatencyPolicy.Jsii$Proxy that = (GameliftGameSessionQueuePlayerLatencyPolicy.Jsii$Proxy) o;

            if (!maximumIndividualPlayerLatencyMilliseconds.equals(that.maximumIndividualPlayerLatencyMilliseconds)) return false;
            return this.policyDurationSeconds != null ? this.policyDurationSeconds.equals(that.policyDurationSeconds) : that.policyDurationSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maximumIndividualPlayerLatencyMilliseconds.hashCode();
            result = 31 * result + (this.policyDurationSeconds != null ? this.policyDurationSeconds.hashCode() : 0);
            return result;
        }
    }
}
