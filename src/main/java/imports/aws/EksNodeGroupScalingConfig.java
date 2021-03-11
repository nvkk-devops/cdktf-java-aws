package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.541Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksNodeGroupScalingConfig")
@software.amazon.jsii.Jsii.Proxy(EksNodeGroupScalingConfig.Jsii$Proxy.class)
public interface EksNodeGroupScalingConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getDesiredSize();

    @org.jetbrains.annotations.NotNull java.lang.Number getMaxSize();

    @org.jetbrains.annotations.NotNull java.lang.Number getMinSize();

    /**
     * @return a {@link Builder} of {@link EksNodeGroupScalingConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksNodeGroupScalingConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksNodeGroupScalingConfig> {
        private java.lang.Number desiredSize;
        private java.lang.Number maxSize;
        private java.lang.Number minSize;

        /**
         * Sets the value of {@link EksNodeGroupScalingConfig#getDesiredSize}
         * @param desiredSize the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder desiredSize(java.lang.Number desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupScalingConfig#getMaxSize}
         * @param maxSize the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder maxSize(java.lang.Number maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupScalingConfig#getMinSize}
         * @param minSize the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder minSize(java.lang.Number minSize) {
            this.minSize = minSize;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EksNodeGroupScalingConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksNodeGroupScalingConfig build() {
            return new Jsii$Proxy(desiredSize, maxSize, minSize);
        }
    }

    /**
     * An implementation for {@link EksNodeGroupScalingConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksNodeGroupScalingConfig {
        private final java.lang.Number desiredSize;
        private final java.lang.Number maxSize;
        private final java.lang.Number minSize;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.desiredSize = software.amazon.jsii.Kernel.get(this, "desiredSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxSize = software.amazon.jsii.Kernel.get(this, "maxSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minSize = software.amazon.jsii.Kernel.get(this, "minSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number desiredSize, final java.lang.Number maxSize, final java.lang.Number minSize) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.desiredSize = java.util.Objects.requireNonNull(desiredSize, "desiredSize is required");
            this.maxSize = java.util.Objects.requireNonNull(maxSize, "maxSize is required");
            this.minSize = java.util.Objects.requireNonNull(minSize, "minSize is required");
        }

        @Override
        public final java.lang.Number getDesiredSize() {
            return this.desiredSize;
        }

        @Override
        public final java.lang.Number getMaxSize() {
            return this.maxSize;
        }

        @Override
        public final java.lang.Number getMinSize() {
            return this.minSize;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("desiredSize", om.valueToTree(this.getDesiredSize()));
            data.set("maxSize", om.valueToTree(this.getMaxSize()));
            data.set("minSize", om.valueToTree(this.getMinSize()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EksNodeGroupScalingConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksNodeGroupScalingConfig.Jsii$Proxy that = (EksNodeGroupScalingConfig.Jsii$Proxy) o;

            if (!desiredSize.equals(that.desiredSize)) return false;
            if (!maxSize.equals(that.maxSize)) return false;
            return this.minSize.equals(that.minSize);
        }

        @Override
        public final int hashCode() {
            int result = this.desiredSize.hashCode();
            result = 31 * result + (this.maxSize.hashCode());
            result = 31 * result + (this.minSize.hashCode());
            return result;
        }
    }
}
