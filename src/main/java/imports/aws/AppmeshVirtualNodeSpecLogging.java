package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.038Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecLogging")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecLogging.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecLogging extends software.amazon.jsii.JsiiSerializable {

    /**
     * access_log block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog> getAccessLog() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecLogging}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecLogging}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecLogging> {
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog> accessLog;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecLogging#getAccessLog}
         * @param accessLog access_log block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accessLog(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog> accessLog) {
            this.accessLog = (java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog>)accessLog;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecLogging}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecLogging build() {
            return new Jsii$Proxy(accessLog);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecLogging}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecLogging {
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog> accessLog;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessLog = software.amazon.jsii.Kernel.get(this, "accessLog", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog> accessLog) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessLog = (java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog>)accessLog;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecLoggingAccessLog> getAccessLog() {
            return this.accessLog;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessLog() != null) {
                data.set("accessLog", om.valueToTree(this.getAccessLog()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecLogging"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecLogging.Jsii$Proxy that = (AppmeshVirtualNodeSpecLogging.Jsii$Proxy) o;

            return this.accessLog != null ? this.accessLog.equals(that.accessLog) : that.accessLog == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessLog != null ? this.accessLog.hashCode() : 0;
            return result;
        }
    }
}
