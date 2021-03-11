package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.532Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksClusterEncryptionConfig")
@software.amazon.jsii.Jsii.Proxy(EksClusterEncryptionConfig.Jsii$Proxy.class)
public interface EksClusterEncryptionConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * provider block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksClusterEncryptionConfigProvider> getProvider();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResources();

    /**
     * @return a {@link Builder} of {@link EksClusterEncryptionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksClusterEncryptionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksClusterEncryptionConfig> {
        private java.util.List<imports.aws.EksClusterEncryptionConfigProvider> provider;
        private java.util.List<java.lang.String> resources;

        /**
         * Sets the value of {@link EksClusterEncryptionConfig#getProvider}
         * @param provider provider block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder provider(java.util.List<? extends imports.aws.EksClusterEncryptionConfigProvider> provider) {
            this.provider = (java.util.List<imports.aws.EksClusterEncryptionConfigProvider>)provider;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterEncryptionConfig#getResources}
         * @param resources the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EksClusterEncryptionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksClusterEncryptionConfig build() {
            return new Jsii$Proxy(provider, resources);
        }
    }

    /**
     * An implementation for {@link EksClusterEncryptionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksClusterEncryptionConfig {
        private final java.util.List<imports.aws.EksClusterEncryptionConfigProvider> provider;
        private final java.util.List<java.lang.String> resources;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksClusterEncryptionConfigProvider.class)));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.EksClusterEncryptionConfigProvider> provider, final java.util.List<java.lang.String> resources) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.provider = (java.util.List<imports.aws.EksClusterEncryptionConfigProvider>)java.util.Objects.requireNonNull(provider, "provider is required");
            this.resources = java.util.Objects.requireNonNull(resources, "resources is required");
        }

        @Override
        public final java.util.List<imports.aws.EksClusterEncryptionConfigProvider> getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("provider", om.valueToTree(this.getProvider()));
            data.set("resources", om.valueToTree(this.getResources()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EksClusterEncryptionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksClusterEncryptionConfig.Jsii$Proxy that = (EksClusterEncryptionConfig.Jsii$Proxy) o;

            if (!provider.equals(that.provider)) return false;
            return this.resources.equals(that.resources);
        }

        @Override
        public final int hashCode() {
            int result = this.provider.hashCode();
            result = 31 * result + (this.resources.hashCode());
            return result;
        }
    }
}
