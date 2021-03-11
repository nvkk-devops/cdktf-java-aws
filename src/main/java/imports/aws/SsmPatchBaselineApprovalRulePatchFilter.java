package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.898Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmPatchBaselineApprovalRulePatchFilter")
@software.amazon.jsii.Jsii.Proxy(SsmPatchBaselineApprovalRulePatchFilter.Jsii$Proxy.class)
public interface SsmPatchBaselineApprovalRulePatchFilter extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValues();

    /**
     * @return a {@link Builder} of {@link SsmPatchBaselineApprovalRulePatchFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmPatchBaselineApprovalRulePatchFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmPatchBaselineApprovalRulePatchFilter> {
        private java.lang.String key;
        private java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link SsmPatchBaselineApprovalRulePatchFilter#getKey}
         * @param key the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link SsmPatchBaselineApprovalRulePatchFilter#getValues}
         * @param values the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SsmPatchBaselineApprovalRulePatchFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmPatchBaselineApprovalRulePatchFilter build() {
            return new Jsii$Proxy(key, values);
        }
    }

    /**
     * An implementation for {@link SsmPatchBaselineApprovalRulePatchFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmPatchBaselineApprovalRulePatchFilter {
        private final java.lang.String key;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String key, final java.util.List<java.lang.String> values) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(key, "key is required");
            this.values = java.util.Objects.requireNonNull(values, "values is required");
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("values", om.valueToTree(this.getValues()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SsmPatchBaselineApprovalRulePatchFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmPatchBaselineApprovalRulePatchFilter.Jsii$Proxy that = (SsmPatchBaselineApprovalRulePatchFilter.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            return this.values.equals(that.values);
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.values.hashCode());
            return result;
        }
    }
}
