package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.198Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolDeviceConfiguration")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolDeviceConfiguration.Jsii$Proxy.class)
public interface CognitoUserPoolDeviceConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getChallengeRequiredOnNewDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDeviceOnlyRememberedOnUserPrompt() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolDeviceConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolDeviceConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolDeviceConfiguration> {
        private java.lang.Boolean challengeRequiredOnNewDevice;
        private java.lang.Boolean deviceOnlyRememberedOnUserPrompt;

        /**
         * Sets the value of {@link CognitoUserPoolDeviceConfiguration#getChallengeRequiredOnNewDevice}
         * @param challengeRequiredOnNewDevice the value to be set.
         * @return {@code this}
         */
        public Builder challengeRequiredOnNewDevice(java.lang.Boolean challengeRequiredOnNewDevice) {
            this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolDeviceConfiguration#getDeviceOnlyRememberedOnUserPrompt}
         * @param deviceOnlyRememberedOnUserPrompt the value to be set.
         * @return {@code this}
         */
        public Builder deviceOnlyRememberedOnUserPrompt(java.lang.Boolean deviceOnlyRememberedOnUserPrompt) {
            this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolDeviceConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolDeviceConfiguration build() {
            return new Jsii$Proxy(challengeRequiredOnNewDevice, deviceOnlyRememberedOnUserPrompt);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolDeviceConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolDeviceConfiguration {
        private final java.lang.Boolean challengeRequiredOnNewDevice;
        private final java.lang.Boolean deviceOnlyRememberedOnUserPrompt;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.challengeRequiredOnNewDevice = software.amazon.jsii.Kernel.get(this, "challengeRequiredOnNewDevice", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.deviceOnlyRememberedOnUserPrompt = software.amazon.jsii.Kernel.get(this, "deviceOnlyRememberedOnUserPrompt", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean challengeRequiredOnNewDevice, final java.lang.Boolean deviceOnlyRememberedOnUserPrompt) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
            this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
        }

        @Override
        public final java.lang.Boolean getChallengeRequiredOnNewDevice() {
            return this.challengeRequiredOnNewDevice;
        }

        @Override
        public final java.lang.Boolean getDeviceOnlyRememberedOnUserPrompt() {
            return this.deviceOnlyRememberedOnUserPrompt;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getChallengeRequiredOnNewDevice() != null) {
                data.set("challengeRequiredOnNewDevice", om.valueToTree(this.getChallengeRequiredOnNewDevice()));
            }
            if (this.getDeviceOnlyRememberedOnUserPrompt() != null) {
                data.set("deviceOnlyRememberedOnUserPrompt", om.valueToTree(this.getDeviceOnlyRememberedOnUserPrompt()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolDeviceConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolDeviceConfiguration.Jsii$Proxy that = (CognitoUserPoolDeviceConfiguration.Jsii$Proxy) o;

            if (this.challengeRequiredOnNewDevice != null ? !this.challengeRequiredOnNewDevice.equals(that.challengeRequiredOnNewDevice) : that.challengeRequiredOnNewDevice != null) return false;
            return this.deviceOnlyRememberedOnUserPrompt != null ? this.deviceOnlyRememberedOnUserPrompt.equals(that.deviceOnlyRememberedOnUserPrompt) : that.deviceOnlyRememberedOnUserPrompt == null;
        }

        @Override
        public final int hashCode() {
            int result = this.challengeRequiredOnNewDevice != null ? this.challengeRequiredOnNewDevice.hashCode() : 0;
            result = 31 * result + (this.deviceOnlyRememberedOnUserPrompt != null ? this.deviceOnlyRememberedOnUserPrompt.hashCode() : 0);
            return result;
        }
    }
}
