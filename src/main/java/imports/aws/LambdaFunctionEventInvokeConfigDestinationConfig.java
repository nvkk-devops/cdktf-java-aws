package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.676Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaFunctionEventInvokeConfigDestinationConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaFunctionEventInvokeConfigDestinationConfig.Jsii$Proxy.class)
public interface LambdaFunctionEventInvokeConfigDestinationConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * on_failure block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure> getOnFailure() {
        return null;
    }

    /**
     * on_success block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess> getOnSuccess() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaFunctionEventInvokeConfigDestinationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaFunctionEventInvokeConfigDestinationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaFunctionEventInvokeConfigDestinationConfig> {
        private java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure> onFailure;
        private java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess> onSuccess;

        /**
         * Sets the value of {@link LambdaFunctionEventInvokeConfigDestinationConfig#getOnFailure}
         * @param onFailure on_failure block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder onFailure(java.util.List<? extends imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure> onFailure) {
            this.onFailure = (java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure>)onFailure;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionEventInvokeConfigDestinationConfig#getOnSuccess}
         * @param onSuccess on_success block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder onSuccess(java.util.List<? extends imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess> onSuccess) {
            this.onSuccess = (java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess>)onSuccess;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaFunctionEventInvokeConfigDestinationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaFunctionEventInvokeConfigDestinationConfig build() {
            return new Jsii$Proxy(onFailure, onSuccess);
        }
    }

    /**
     * An implementation for {@link LambdaFunctionEventInvokeConfigDestinationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaFunctionEventInvokeConfigDestinationConfig {
        private final java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure> onFailure;
        private final java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess> onSuccess;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.onFailure = software.amazon.jsii.Kernel.get(this, "onFailure", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure.class)));
            this.onSuccess = software.amazon.jsii.Kernel.get(this, "onSuccess", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure> onFailure, final java.util.List<? extends imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess> onSuccess) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.onFailure = (java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure>)onFailure;
            this.onSuccess = (java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess>)onSuccess;
        }

        @Override
        public final java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure> getOnFailure() {
            return this.onFailure;
        }

        @Override
        public final java.util.List<imports.aws.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess> getOnSuccess() {
            return this.onSuccess;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOnFailure() != null) {
                data.set("onFailure", om.valueToTree(this.getOnFailure()));
            }
            if (this.getOnSuccess() != null) {
                data.set("onSuccess", om.valueToTree(this.getOnSuccess()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LambdaFunctionEventInvokeConfigDestinationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaFunctionEventInvokeConfigDestinationConfig.Jsii$Proxy that = (LambdaFunctionEventInvokeConfigDestinationConfig.Jsii$Proxy) o;

            if (this.onFailure != null ? !this.onFailure.equals(that.onFailure) : that.onFailure != null) return false;
            return this.onSuccess != null ? this.onSuccess.equals(that.onSuccess) : that.onSuccess == null;
        }

        @Override
        public final int hashCode() {
            int result = this.onFailure != null ? this.onFailure.hashCode() : 0;
            result = 31 * result + (this.onSuccess != null ? this.onSuccess.hashCode() : 0);
            return result;
        }
    }
}
