package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.864Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesReceiptRuleAddHeaderAction")
@software.amazon.jsii.Jsii.Proxy(SesReceiptRuleAddHeaderAction.Jsii$Proxy.class)
public interface SesReceiptRuleAddHeaderAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getHeaderName();

    @org.jetbrains.annotations.NotNull java.lang.String getHeaderValue();

    @org.jetbrains.annotations.NotNull java.lang.Number getPosition();

    /**
     * @return a {@link Builder} of {@link SesReceiptRuleAddHeaderAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesReceiptRuleAddHeaderAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesReceiptRuleAddHeaderAction> {
        private java.lang.String headerName;
        private java.lang.String headerValue;
        private java.lang.Number position;

        /**
         * Sets the value of {@link SesReceiptRuleAddHeaderAction#getHeaderName}
         * @param headerName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder headerName(java.lang.String headerName) {
            this.headerName = headerName;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleAddHeaderAction#getHeaderValue}
         * @param headerValue the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder headerValue(java.lang.String headerValue) {
            this.headerValue = headerValue;
            return this;
        }

        /**
         * Sets the value of {@link SesReceiptRuleAddHeaderAction#getPosition}
         * @param position the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder position(java.lang.Number position) {
            this.position = position;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesReceiptRuleAddHeaderAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesReceiptRuleAddHeaderAction build() {
            return new Jsii$Proxy(headerName, headerValue, position);
        }
    }

    /**
     * An implementation for {@link SesReceiptRuleAddHeaderAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesReceiptRuleAddHeaderAction {
        private final java.lang.String headerName;
        private final java.lang.String headerValue;
        private final java.lang.Number position;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.headerName = software.amazon.jsii.Kernel.get(this, "headerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.headerValue = software.amazon.jsii.Kernel.get(this, "headerValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.position = software.amazon.jsii.Kernel.get(this, "position", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String headerName, final java.lang.String headerValue, final java.lang.Number position) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.headerName = java.util.Objects.requireNonNull(headerName, "headerName is required");
            this.headerValue = java.util.Objects.requireNonNull(headerValue, "headerValue is required");
            this.position = java.util.Objects.requireNonNull(position, "position is required");
        }

        @Override
        public final java.lang.String getHeaderName() {
            return this.headerName;
        }

        @Override
        public final java.lang.String getHeaderValue() {
            return this.headerValue;
        }

        @Override
        public final java.lang.Number getPosition() {
            return this.position;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("headerName", om.valueToTree(this.getHeaderName()));
            data.set("headerValue", om.valueToTree(this.getHeaderValue()));
            data.set("position", om.valueToTree(this.getPosition()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SesReceiptRuleAddHeaderAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesReceiptRuleAddHeaderAction.Jsii$Proxy that = (SesReceiptRuleAddHeaderAction.Jsii$Proxy) o;

            if (!headerName.equals(that.headerName)) return false;
            if (!headerValue.equals(that.headerValue)) return false;
            return this.position.equals(that.position);
        }

        @Override
        public final int hashCode() {
            int result = this.headerName.hashCode();
            result = 31 * result + (this.headerValue.hashCode());
            result = 31 * result + (this.position.hashCode());
            return result;
        }
    }
}
