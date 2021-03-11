package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.676Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaFunctionFileSystemConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaFunctionFileSystemConfig.Jsii$Proxy.class)
public interface LambdaFunctionFileSystemConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getArn();

    @org.jetbrains.annotations.NotNull java.lang.String getLocalMountPath();

    /**
     * @return a {@link Builder} of {@link LambdaFunctionFileSystemConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaFunctionFileSystemConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaFunctionFileSystemConfig> {
        private java.lang.String arn;
        private java.lang.String localMountPath;

        /**
         * Sets the value of {@link LambdaFunctionFileSystemConfig#getArn}
         * @param arn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaFunctionFileSystemConfig#getLocalMountPath}
         * @param localMountPath the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder localMountPath(java.lang.String localMountPath) {
            this.localMountPath = localMountPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaFunctionFileSystemConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaFunctionFileSystemConfig build() {
            return new Jsii$Proxy(arn, localMountPath);
        }
    }

    /**
     * An implementation for {@link LambdaFunctionFileSystemConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaFunctionFileSystemConfig {
        private final java.lang.String arn;
        private final java.lang.String localMountPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.localMountPath = software.amazon.jsii.Kernel.get(this, "localMountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String arn, final java.lang.String localMountPath) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arn = java.util.Objects.requireNonNull(arn, "arn is required");
            this.localMountPath = java.util.Objects.requireNonNull(localMountPath, "localMountPath is required");
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final java.lang.String getLocalMountPath() {
            return this.localMountPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("arn", om.valueToTree(this.getArn()));
            data.set("localMountPath", om.valueToTree(this.getLocalMountPath()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LambdaFunctionFileSystemConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaFunctionFileSystemConfig.Jsii$Proxy that = (LambdaFunctionFileSystemConfig.Jsii$Proxy) o;

            if (!arn.equals(that.arn)) return false;
            return this.localMountPath.equals(that.localMountPath);
        }

        @Override
        public final int hashCode() {
            int result = this.arn.hashCode();
            result = 31 * result + (this.localMountPath.hashCode());
            return result;
        }
    }
}
