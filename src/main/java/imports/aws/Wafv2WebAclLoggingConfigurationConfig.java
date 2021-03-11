package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.022Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclLoggingConfigurationConfig")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclLoggingConfigurationConfig.Jsii$Proxy.class)
public interface Wafv2WebAclLoggingConfigurationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * AWS Kinesis Firehose Delivery Stream ARNs.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLogDestinationConfigs();

    /**
     * AWS WebACL ARN.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResourceArn();

    /**
     * redacted_fields block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> getRedactedFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclLoggingConfigurationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclLoggingConfigurationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclLoggingConfigurationConfig> {
        private java.util.List<java.lang.String> logDestinationConfigs;
        private java.lang.String resourceArn;
        private java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> redactedFields;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationConfig#getLogDestinationConfigs}
         * @param logDestinationConfigs AWS Kinesis Firehose Delivery Stream ARNs. This parameter is required.
         * @return {@code this}
         */
        public Builder logDestinationConfigs(java.util.List<java.lang.String> logDestinationConfigs) {
            this.logDestinationConfigs = logDestinationConfigs;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationConfig#getResourceArn}
         * @param resourceArn AWS WebACL ARN. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceArn(java.lang.String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationConfig#getRedactedFields}
         * @param redactedFields redacted_fields block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder redactedFields(java.util.List<? extends imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> redactedFields) {
            this.redactedFields = (java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields>)redactedFields;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclLoggingConfigurationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclLoggingConfigurationConfig build() {
            return new Jsii$Proxy(logDestinationConfigs, resourceArn, redactedFields, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclLoggingConfigurationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclLoggingConfigurationConfig {
        private final java.util.List<java.lang.String> logDestinationConfigs;
        private final java.lang.String resourceArn;
        private final java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> redactedFields;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.logDestinationConfigs = software.amazon.jsii.Kernel.get(this, "logDestinationConfigs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resourceArn = software.amazon.jsii.Kernel.get(this, "resourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.redactedFields = software.amazon.jsii.Kernel.get(this, "redactedFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> logDestinationConfigs, final java.lang.String resourceArn, final java.util.List<? extends imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> redactedFields, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.logDestinationConfigs = java.util.Objects.requireNonNull(logDestinationConfigs, "logDestinationConfigs is required");
            this.resourceArn = java.util.Objects.requireNonNull(resourceArn, "resourceArn is required");
            this.redactedFields = (java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields>)redactedFields;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getLogDestinationConfigs() {
            return this.logDestinationConfigs;
        }

        @Override
        public final java.lang.String getResourceArn() {
            return this.resourceArn;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> getRedactedFields() {
            return this.redactedFields;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("logDestinationConfigs", om.valueToTree(this.getLogDestinationConfigs()));
            data.set("resourceArn", om.valueToTree(this.getResourceArn()));
            if (this.getRedactedFields() != null) {
                data.set("redactedFields", om.valueToTree(this.getRedactedFields()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclLoggingConfigurationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclLoggingConfigurationConfig.Jsii$Proxy that = (Wafv2WebAclLoggingConfigurationConfig.Jsii$Proxy) o;

            if (!logDestinationConfigs.equals(that.logDestinationConfigs)) return false;
            if (!resourceArn.equals(that.resourceArn)) return false;
            if (this.redactedFields != null ? !this.redactedFields.equals(that.redactedFields) : that.redactedFields != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.logDestinationConfigs.hashCode();
            result = 31 * result + (this.resourceArn.hashCode());
            result = 31 * result + (this.redactedFields != null ? this.redactedFields.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
