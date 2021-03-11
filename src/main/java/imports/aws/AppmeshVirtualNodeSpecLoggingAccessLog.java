package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.038Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecLoggingAccessLog")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecLoggingAccessLog.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecLoggingAccessLog extends software.amazon.jsii.JsiiSerializable {

    /**
     * file block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile> getFile() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecLoggingAccessLog}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecLoggingAccessLog}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecLoggingAccessLog> {
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile> file;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecLoggingAccessLog#getFile}
         * @param file file block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder file(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile> file) {
            this.file = (java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile>)file;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecLoggingAccessLog}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecLoggingAccessLog build() {
            return new Jsii$Proxy(file);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecLoggingAccessLog}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecLoggingAccessLog {
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile> file;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.file = software.amazon.jsii.Kernel.get(this, "file", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile> file) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.file = (java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile>)file;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLogFile> getFile() {
            return this.file;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFile() != null) {
                data.set("file", om.valueToTree(this.getFile()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecLoggingAccessLog"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecLoggingAccessLog.Jsii$Proxy that = (AppmeshVirtualNodeSpecLoggingAccessLog.Jsii$Proxy) o;

            return this.file != null ? this.file.equals(that.file) : that.file == null;
        }

        @Override
        public final int hashCode() {
            int result = this.file != null ? this.file.hashCode() : 0;
            return result;
        }
    }
}
