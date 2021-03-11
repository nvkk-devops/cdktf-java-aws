package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.692Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateInstanceMarketOptions")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateInstanceMarketOptions.Jsii$Proxy.class)
public interface LaunchTemplateInstanceMarketOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getMarketType() {
        return null;
    }

    /**
     * spot_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions> getSpotOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateInstanceMarketOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateInstanceMarketOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateInstanceMarketOptions> {
        private java.lang.String marketType;
        private java.util.List<imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions> spotOptions;

        /**
         * Sets the value of {@link LaunchTemplateInstanceMarketOptions#getMarketType}
         * @param marketType the value to be set.
         * @return {@code this}
         */
        public Builder marketType(java.lang.String marketType) {
            this.marketType = marketType;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateInstanceMarketOptions#getSpotOptions}
         * @param spotOptions spot_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder spotOptions(java.util.List<? extends imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions> spotOptions) {
            this.spotOptions = (java.util.List<imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions>)spotOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateInstanceMarketOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateInstanceMarketOptions build() {
            return new Jsii$Proxy(marketType, spotOptions);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateInstanceMarketOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateInstanceMarketOptions {
        private final java.lang.String marketType;
        private final java.util.List<imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions> spotOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.marketType = software.amazon.jsii.Kernel.get(this, "marketType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotOptions = software.amazon.jsii.Kernel.get(this, "spotOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String marketType, final java.util.List<? extends imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions> spotOptions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.marketType = marketType;
            this.spotOptions = (java.util.List<imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions>)spotOptions;
        }

        @Override
        public final java.lang.String getMarketType() {
            return this.marketType;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateInstanceMarketOptionsSpotOptions> getSpotOptions() {
            return this.spotOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMarketType() != null) {
                data.set("marketType", om.valueToTree(this.getMarketType()));
            }
            if (this.getSpotOptions() != null) {
                data.set("spotOptions", om.valueToTree(this.getSpotOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateInstanceMarketOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateInstanceMarketOptions.Jsii$Proxy that = (LaunchTemplateInstanceMarketOptions.Jsii$Proxy) o;

            if (this.marketType != null ? !this.marketType.equals(that.marketType) : that.marketType != null) return false;
            return this.spotOptions != null ? this.spotOptions.equals(that.spotOptions) : that.spotOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.marketType != null ? this.marketType.hashCode() : 0;
            result = 31 * result + (this.spotOptions != null ? this.spotOptions.hashCode() : 0);
            return result;
        }
    }
}
