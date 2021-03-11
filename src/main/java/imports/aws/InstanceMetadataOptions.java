package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.634Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.InstanceMetadataOptions")
@software.amazon.jsii.Jsii.Proxy(InstanceMetadataOptions.Jsii$Proxy.class)
public interface InstanceMetadataOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getHttpEndpoint() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHttpPutResponseHopLimit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHttpTokens() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link InstanceMetadataOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link InstanceMetadataOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<InstanceMetadataOptions> {
        private java.lang.String httpEndpoint;
        private java.lang.Number httpPutResponseHopLimit;
        private java.lang.String httpTokens;

        /**
         * Sets the value of {@link InstanceMetadataOptions#getHttpEndpoint}
         * @param httpEndpoint the value to be set.
         * @return {@code this}
         */
        public Builder httpEndpoint(java.lang.String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link InstanceMetadataOptions#getHttpPutResponseHopLimit}
         * @param httpPutResponseHopLimit the value to be set.
         * @return {@code this}
         */
        public Builder httpPutResponseHopLimit(java.lang.Number httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * Sets the value of {@link InstanceMetadataOptions#getHttpTokens}
         * @param httpTokens the value to be set.
         * @return {@code this}
         */
        public Builder httpTokens(java.lang.String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link InstanceMetadataOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public InstanceMetadataOptions build() {
            return new Jsii$Proxy(httpEndpoint, httpPutResponseHopLimit, httpTokens);
        }
    }

    /**
     * An implementation for {@link InstanceMetadataOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements InstanceMetadataOptions {
        private final java.lang.String httpEndpoint;
        private final java.lang.Number httpPutResponseHopLimit;
        private final java.lang.String httpTokens;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.httpEndpoint = software.amazon.jsii.Kernel.get(this, "httpEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpPutResponseHopLimit = software.amazon.jsii.Kernel.get(this, "httpPutResponseHopLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.httpTokens = software.amazon.jsii.Kernel.get(this, "httpTokens", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String httpEndpoint, final java.lang.Number httpPutResponseHopLimit, final java.lang.String httpTokens) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.httpEndpoint = httpEndpoint;
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            this.httpTokens = httpTokens;
        }

        @Override
        public final java.lang.String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        @Override
        public final java.lang.Number getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        @Override
        public final java.lang.String getHttpTokens() {
            return this.httpTokens;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHttpEndpoint() != null) {
                data.set("httpEndpoint", om.valueToTree(this.getHttpEndpoint()));
            }
            if (this.getHttpPutResponseHopLimit() != null) {
                data.set("httpPutResponseHopLimit", om.valueToTree(this.getHttpPutResponseHopLimit()));
            }
            if (this.getHttpTokens() != null) {
                data.set("httpTokens", om.valueToTree(this.getHttpTokens()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.InstanceMetadataOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            InstanceMetadataOptions.Jsii$Proxy that = (InstanceMetadataOptions.Jsii$Proxy) o;

            if (this.httpEndpoint != null ? !this.httpEndpoint.equals(that.httpEndpoint) : that.httpEndpoint != null) return false;
            if (this.httpPutResponseHopLimit != null ? !this.httpPutResponseHopLimit.equals(that.httpPutResponseHopLimit) : that.httpPutResponseHopLimit != null) return false;
            return this.httpTokens != null ? this.httpTokens.equals(that.httpTokens) : that.httpTokens == null;
        }

        @Override
        public final int hashCode() {
            int result = this.httpEndpoint != null ? this.httpEndpoint.hashCode() : 0;
            result = 31 * result + (this.httpPutResponseHopLimit != null ? this.httpPutResponseHopLimit.hashCode() : 0);
            result = 31 * result + (this.httpTokens != null ? this.httpTokens.hashCode() : 0);
            return result;
        }
    }
}
