package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.583Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GameliftFleetRuntimeConfiguration")
@software.amazon.jsii.Jsii.Proxy(GameliftFleetRuntimeConfiguration.Jsii$Proxy.class)
public interface GameliftFleetRuntimeConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getGameSessionActivationTimeoutSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxConcurrentGameSessionActivations() {
        return null;
    }

    /**
     * server_process block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftFleetRuntimeConfigurationServerProcess> getServerProcess() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GameliftFleetRuntimeConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GameliftFleetRuntimeConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GameliftFleetRuntimeConfiguration> {
        private java.lang.Number gameSessionActivationTimeoutSeconds;
        private java.lang.Number maxConcurrentGameSessionActivations;
        private java.util.List<imports.aws.GameliftFleetRuntimeConfigurationServerProcess> serverProcess;

        /**
         * Sets the value of {@link GameliftFleetRuntimeConfiguration#getGameSessionActivationTimeoutSeconds}
         * @param gameSessionActivationTimeoutSeconds the value to be set.
         * @return {@code this}
         */
        public Builder gameSessionActivationTimeoutSeconds(java.lang.Number gameSessionActivationTimeoutSeconds) {
            this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetRuntimeConfiguration#getMaxConcurrentGameSessionActivations}
         * @param maxConcurrentGameSessionActivations the value to be set.
         * @return {@code this}
         */
        public Builder maxConcurrentGameSessionActivations(java.lang.Number maxConcurrentGameSessionActivations) {
            this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetRuntimeConfiguration#getServerProcess}
         * @param serverProcess server_process block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder serverProcess(java.util.List<? extends imports.aws.GameliftFleetRuntimeConfigurationServerProcess> serverProcess) {
            this.serverProcess = (java.util.List<imports.aws.GameliftFleetRuntimeConfigurationServerProcess>)serverProcess;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GameliftFleetRuntimeConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GameliftFleetRuntimeConfiguration build() {
            return new Jsii$Proxy(gameSessionActivationTimeoutSeconds, maxConcurrentGameSessionActivations, serverProcess);
        }
    }

    /**
     * An implementation for {@link GameliftFleetRuntimeConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GameliftFleetRuntimeConfiguration {
        private final java.lang.Number gameSessionActivationTimeoutSeconds;
        private final java.lang.Number maxConcurrentGameSessionActivations;
        private final java.util.List<imports.aws.GameliftFleetRuntimeConfigurationServerProcess> serverProcess;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.gameSessionActivationTimeoutSeconds = software.amazon.jsii.Kernel.get(this, "gameSessionActivationTimeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxConcurrentGameSessionActivations = software.amazon.jsii.Kernel.get(this, "maxConcurrentGameSessionActivations", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.serverProcess = software.amazon.jsii.Kernel.get(this, "serverProcess", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetRuntimeConfigurationServerProcess.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number gameSessionActivationTimeoutSeconds, final java.lang.Number maxConcurrentGameSessionActivations, final java.util.List<? extends imports.aws.GameliftFleetRuntimeConfigurationServerProcess> serverProcess) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
            this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
            this.serverProcess = (java.util.List<imports.aws.GameliftFleetRuntimeConfigurationServerProcess>)serverProcess;
        }

        @Override
        public final java.lang.Number getGameSessionActivationTimeoutSeconds() {
            return this.gameSessionActivationTimeoutSeconds;
        }

        @Override
        public final java.lang.Number getMaxConcurrentGameSessionActivations() {
            return this.maxConcurrentGameSessionActivations;
        }

        @Override
        public final java.util.List<imports.aws.GameliftFleetRuntimeConfigurationServerProcess> getServerProcess() {
            return this.serverProcess;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGameSessionActivationTimeoutSeconds() != null) {
                data.set("gameSessionActivationTimeoutSeconds", om.valueToTree(this.getGameSessionActivationTimeoutSeconds()));
            }
            if (this.getMaxConcurrentGameSessionActivations() != null) {
                data.set("maxConcurrentGameSessionActivations", om.valueToTree(this.getMaxConcurrentGameSessionActivations()));
            }
            if (this.getServerProcess() != null) {
                data.set("serverProcess", om.valueToTree(this.getServerProcess()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GameliftFleetRuntimeConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GameliftFleetRuntimeConfiguration.Jsii$Proxy that = (GameliftFleetRuntimeConfiguration.Jsii$Proxy) o;

            if (this.gameSessionActivationTimeoutSeconds != null ? !this.gameSessionActivationTimeoutSeconds.equals(that.gameSessionActivationTimeoutSeconds) : that.gameSessionActivationTimeoutSeconds != null) return false;
            if (this.maxConcurrentGameSessionActivations != null ? !this.maxConcurrentGameSessionActivations.equals(that.maxConcurrentGameSessionActivations) : that.maxConcurrentGameSessionActivations != null) return false;
            return this.serverProcess != null ? this.serverProcess.equals(that.serverProcess) : that.serverProcess == null;
        }

        @Override
        public final int hashCode() {
            int result = this.gameSessionActivationTimeoutSeconds != null ? this.gameSessionActivationTimeoutSeconds.hashCode() : 0;
            result = 31 * result + (this.maxConcurrentGameSessionActivations != null ? this.maxConcurrentGameSessionActivations.hashCode() : 0);
            result = 31 * result + (this.serverProcess != null ? this.serverProcess.hashCode() : 0);
            return result;
        }
    }
}
