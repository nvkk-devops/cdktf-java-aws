package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.398Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DatasyncLocationSmbMountOptions")
@software.amazon.jsii.Jsii.Proxy(DatasyncLocationSmbMountOptions.Jsii$Proxy.class)
public interface DatasyncLocationSmbMountOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DatasyncLocationSmbMountOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DatasyncLocationSmbMountOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DatasyncLocationSmbMountOptions> {
        private java.lang.String version;

        /**
         * Sets the value of {@link DatasyncLocationSmbMountOptions#getVersion}
         * @param version the value to be set.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DatasyncLocationSmbMountOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DatasyncLocationSmbMountOptions build() {
            return new Jsii$Proxy(version);
        }
    }

    /**
     * An implementation for {@link DatasyncLocationSmbMountOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DatasyncLocationSmbMountOptions {
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String version) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.version = version;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DatasyncLocationSmbMountOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DatasyncLocationSmbMountOptions.Jsii$Proxy that = (DatasyncLocationSmbMountOptions.Jsii$Proxy) o;

            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public final int hashCode() {
            int result = this.version != null ? this.version.hashCode() : 0;
            return result;
        }
    }
}
