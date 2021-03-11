package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.041Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualServiceSpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualServiceSpec.Jsii$Proxy.class)
public interface AppmeshVirtualServiceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * provider block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualServiceSpecProvider> getProvider() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualServiceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualServiceSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualServiceSpec> {
        private java.util.List<imports.aws.AppmeshVirtualServiceSpecProvider> provider;

        /**
         * Sets the value of {@link AppmeshVirtualServiceSpec#getProvider}
         * @param provider provider block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder provider(java.util.List<? extends imports.aws.AppmeshVirtualServiceSpecProvider> provider) {
            this.provider = (java.util.List<imports.aws.AppmeshVirtualServiceSpecProvider>)provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualServiceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualServiceSpec build() {
            return new Jsii$Proxy(provider);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualServiceSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualServiceSpec {
        private final java.util.List<imports.aws.AppmeshVirtualServiceSpecProvider> provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualServiceSpecProvider.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualServiceSpecProvider> provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.provider = (java.util.List<imports.aws.AppmeshVirtualServiceSpecProvider>)provider;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualServiceSpecProvider> getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualServiceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualServiceSpec.Jsii$Proxy that = (AppmeshVirtualServiceSpec.Jsii$Proxy) o;

            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.provider != null ? this.provider.hashCode() : 0;
            return result;
        }
    }
}
