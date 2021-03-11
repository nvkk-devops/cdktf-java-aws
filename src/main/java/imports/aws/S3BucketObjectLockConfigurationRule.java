package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.836Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketObjectLockConfigurationRule")
@software.amazon.jsii.Jsii.Proxy(S3BucketObjectLockConfigurationRule.Jsii$Proxy.class)
public interface S3BucketObjectLockConfigurationRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * default_retention block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention> getDefaultRetention();

    /**
     * @return a {@link Builder} of {@link S3BucketObjectLockConfigurationRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketObjectLockConfigurationRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketObjectLockConfigurationRule> {
        private java.util.List<imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention> defaultRetention;

        /**
         * Sets the value of {@link S3BucketObjectLockConfigurationRule#getDefaultRetention}
         * @param defaultRetention default_retention block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder defaultRetention(java.util.List<? extends imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention> defaultRetention) {
            this.defaultRetention = (java.util.List<imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention>)defaultRetention;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketObjectLockConfigurationRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketObjectLockConfigurationRule build() {
            return new Jsii$Proxy(defaultRetention);
        }
    }

    /**
     * An implementation for {@link S3BucketObjectLockConfigurationRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketObjectLockConfigurationRule {
        private final java.util.List<imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention> defaultRetention;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultRetention = software.amazon.jsii.Kernel.get(this, "defaultRetention", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention> defaultRetention) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultRetention = (java.util.List<imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention>)java.util.Objects.requireNonNull(defaultRetention, "defaultRetention is required");
        }

        @Override
        public final java.util.List<imports.aws.S3BucketObjectLockConfigurationRuleDefaultRetention> getDefaultRetention() {
            return this.defaultRetention;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("defaultRetention", om.valueToTree(this.getDefaultRetention()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketObjectLockConfigurationRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketObjectLockConfigurationRule.Jsii$Proxy that = (S3BucketObjectLockConfigurationRule.Jsii$Proxy) o;

            return this.defaultRetention.equals(that.defaultRetention);
        }

        @Override
        public final int hashCode() {
            int result = this.defaultRetention.hashCode();
            return result;
        }
    }
}
