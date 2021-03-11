package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.838Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketServerSideEncryptionConfiguration")
@software.amazon.jsii.Jsii.Proxy(S3BucketServerSideEncryptionConfiguration.Jsii$Proxy.class)
public interface S3BucketServerSideEncryptionConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * rule block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketServerSideEncryptionConfigurationRule> getRule();

    /**
     * @return a {@link Builder} of {@link S3BucketServerSideEncryptionConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketServerSideEncryptionConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketServerSideEncryptionConfiguration> {
        private java.util.List<imports.aws.S3BucketServerSideEncryptionConfigurationRule> rule;

        /**
         * Sets the value of {@link S3BucketServerSideEncryptionConfiguration#getRule}
         * @param rule rule block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rule(java.util.List<? extends imports.aws.S3BucketServerSideEncryptionConfigurationRule> rule) {
            this.rule = (java.util.List<imports.aws.S3BucketServerSideEncryptionConfigurationRule>)rule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketServerSideEncryptionConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketServerSideEncryptionConfiguration build() {
            return new Jsii$Proxy(rule);
        }
    }

    /**
     * An implementation for {@link S3BucketServerSideEncryptionConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketServerSideEncryptionConfiguration {
        private final java.util.List<imports.aws.S3BucketServerSideEncryptionConfigurationRule> rule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketServerSideEncryptionConfigurationRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.S3BucketServerSideEncryptionConfigurationRule> rule) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rule = (java.util.List<imports.aws.S3BucketServerSideEncryptionConfigurationRule>)java.util.Objects.requireNonNull(rule, "rule is required");
        }

        @Override
        public final java.util.List<imports.aws.S3BucketServerSideEncryptionConfigurationRule> getRule() {
            return this.rule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rule", om.valueToTree(this.getRule()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketServerSideEncryptionConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketServerSideEncryptionConfiguration.Jsii$Proxy that = (S3BucketServerSideEncryptionConfiguration.Jsii$Proxy) o;

            return this.rule.equals(that.rule);
        }

        @Override
        public final int hashCode() {
            int result = this.rule.hashCode();
            return result;
        }
    }
}
