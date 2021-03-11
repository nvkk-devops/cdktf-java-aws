package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.171Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildWebhookFilterGroup")
@software.amazon.jsii.Jsii.Proxy(CodebuildWebhookFilterGroup.Jsii$Proxy.class)
public interface CodebuildWebhookFilterGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildWebhookFilterGroupFilter> getFilter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildWebhookFilterGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildWebhookFilterGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildWebhookFilterGroup> {
        private java.util.List<imports.aws.CodebuildWebhookFilterGroupFilter> filter;

        /**
         * Sets the value of {@link CodebuildWebhookFilterGroup#getFilter}
         * @param filter filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filter(java.util.List<? extends imports.aws.CodebuildWebhookFilterGroupFilter> filter) {
            this.filter = (java.util.List<imports.aws.CodebuildWebhookFilterGroupFilter>)filter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildWebhookFilterGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildWebhookFilterGroup build() {
            return new Jsii$Proxy(filter);
        }
    }

    /**
     * An implementation for {@link CodebuildWebhookFilterGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildWebhookFilterGroup {
        private final java.util.List<imports.aws.CodebuildWebhookFilterGroupFilter> filter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildWebhookFilterGroupFilter.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CodebuildWebhookFilterGroupFilter> filter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filter = (java.util.List<imports.aws.CodebuildWebhookFilterGroupFilter>)filter;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildWebhookFilterGroupFilter> getFilter() {
            return this.filter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildWebhookFilterGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildWebhookFilterGroup.Jsii$Proxy that = (CodebuildWebhookFilterGroup.Jsii$Proxy) o;

            return this.filter != null ? this.filter.equals(that.filter) : that.filter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filter != null ? this.filter.hashCode() : 0;
            return result;
        }
    }
}
