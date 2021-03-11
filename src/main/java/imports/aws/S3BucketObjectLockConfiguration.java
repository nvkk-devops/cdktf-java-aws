package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.836Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketObjectLockConfiguration")
@software.amazon.jsii.Jsii.Proxy(S3BucketObjectLockConfiguration.Jsii$Proxy.class)
public interface S3BucketObjectLockConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getObjectLockEnabled();

    /**
     * rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketObjectLockConfigurationRule> getRule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketObjectLockConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketObjectLockConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketObjectLockConfiguration> {
        private java.lang.String objectLockEnabled;
        private java.util.List<imports.aws.S3BucketObjectLockConfigurationRule> rule;

        /**
         * Sets the value of {@link S3BucketObjectLockConfiguration#getObjectLockEnabled}
         * @param objectLockEnabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder objectLockEnabled(java.lang.String objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectLockConfiguration#getRule}
         * @param rule rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rule(java.util.List<? extends imports.aws.S3BucketObjectLockConfigurationRule> rule) {
            this.rule = (java.util.List<imports.aws.S3BucketObjectLockConfigurationRule>)rule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketObjectLockConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketObjectLockConfiguration build() {
            return new Jsii$Proxy(objectLockEnabled, rule);
        }
    }

    /**
     * An implementation for {@link S3BucketObjectLockConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketObjectLockConfiguration {
        private final java.lang.String objectLockEnabled;
        private final java.util.List<imports.aws.S3BucketObjectLockConfigurationRule> rule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.objectLockEnabled = software.amazon.jsii.Kernel.get(this, "objectLockEnabled", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketObjectLockConfigurationRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String objectLockEnabled, final java.util.List<? extends imports.aws.S3BucketObjectLockConfigurationRule> rule) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.objectLockEnabled = java.util.Objects.requireNonNull(objectLockEnabled, "objectLockEnabled is required");
            this.rule = (java.util.List<imports.aws.S3BucketObjectLockConfigurationRule>)rule;
        }

        @Override
        public final java.lang.String getObjectLockEnabled() {
            return this.objectLockEnabled;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketObjectLockConfigurationRule> getRule() {
            return this.rule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("objectLockEnabled", om.valueToTree(this.getObjectLockEnabled()));
            if (this.getRule() != null) {
                data.set("rule", om.valueToTree(this.getRule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketObjectLockConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketObjectLockConfiguration.Jsii$Proxy that = (S3BucketObjectLockConfiguration.Jsii$Proxy) o;

            if (!objectLockEnabled.equals(that.objectLockEnabled)) return false;
            return this.rule != null ? this.rule.equals(that.rule) : that.rule == null;
        }

        @Override
        public final int hashCode() {
            int result = this.objectLockEnabled.hashCode();
            result = 31 * result + (this.rule != null ? this.rule.hashCode() : 0);
            return result;
        }
    }
}
