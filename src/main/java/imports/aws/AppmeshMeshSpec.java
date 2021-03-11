package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.033Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshMeshSpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshMeshSpec.Jsii$Proxy.class)
public interface AppmeshMeshSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * egress_filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshMeshSpecEgressFilter> getEgressFilter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshMeshSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshMeshSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshMeshSpec> {
        private java.util.List<imports.aws.AppmeshMeshSpecEgressFilter> egressFilter;

        /**
         * Sets the value of {@link AppmeshMeshSpec#getEgressFilter}
         * @param egressFilter egress_filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder egressFilter(java.util.List<? extends imports.aws.AppmeshMeshSpecEgressFilter> egressFilter) {
            this.egressFilter = (java.util.List<imports.aws.AppmeshMeshSpecEgressFilter>)egressFilter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshMeshSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshMeshSpec build() {
            return new Jsii$Proxy(egressFilter);
        }
    }

    /**
     * An implementation for {@link AppmeshMeshSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshMeshSpec {
        private final java.util.List<imports.aws.AppmeshMeshSpecEgressFilter> egressFilter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.egressFilter = software.amazon.jsii.Kernel.get(this, "egressFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshMeshSpecEgressFilter.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshMeshSpecEgressFilter> egressFilter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.egressFilter = (java.util.List<imports.aws.AppmeshMeshSpecEgressFilter>)egressFilter;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshMeshSpecEgressFilter> getEgressFilter() {
            return this.egressFilter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEgressFilter() != null) {
                data.set("egressFilter", om.valueToTree(this.getEgressFilter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshMeshSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshMeshSpec.Jsii$Proxy that = (AppmeshMeshSpec.Jsii$Proxy) o;

            return this.egressFilter != null ? this.egressFilter.equals(that.egressFilter) : that.egressFilter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.egressFilter != null ? this.egressFilter.hashCode() : 0;
            return result;
        }
    }
}
