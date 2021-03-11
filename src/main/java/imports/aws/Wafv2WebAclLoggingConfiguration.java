package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.022Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclLoggingConfiguration")
public class Wafv2WebAclLoggingConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected Wafv2WebAclLoggingConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclLoggingConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Wafv2WebAclLoggingConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.Wafv2WebAclLoggingConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetRedactedFields() {
        software.amazon.jsii.Kernel.call(this, "resetRedactedFields", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLogDestinationConfigsInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logDestinationConfigsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceArnInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> getRedactedFieldsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields>)(software.amazon.jsii.Kernel.get(this, "redactedFieldsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLogDestinationConfigs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "logDestinationConfigs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLogDestinationConfigs(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "logDestinationConfigs", java.util.Objects.requireNonNull(value, "logDestinationConfigs is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> getRedactedFields() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "redactedFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields.class))));
    }

    public void setRedactedFields(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> value) {
        software.amazon.jsii.Kernel.set(this, "redactedFields", java.util.Objects.requireNonNull(value, "redactedFields is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceArn() {
        return software.amazon.jsii.Kernel.get(this, "resourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceArn", java.util.Objects.requireNonNull(value, "resourceArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Wafv2WebAclLoggingConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Wafv2WebAclLoggingConfiguration> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.Wafv2WebAclLoggingConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.Wafv2WebAclLoggingConfigurationConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * AWS Kinesis Firehose Delivery Stream ARNs.
         * <p>
         * @return {@code this}
         * @param logDestinationConfigs AWS Kinesis Firehose Delivery Stream ARNs. This parameter is required.
         */
        public Builder logDestinationConfigs(final java.util.List<java.lang.String> logDestinationConfigs) {
            this.config.logDestinationConfigs(logDestinationConfigs);
            return this;
        }

        /**
         * AWS WebACL ARN.
         * <p>
         * @return {@code this}
         * @param resourceArn AWS WebACL ARN. This parameter is required.
         */
        public Builder resourceArn(final java.lang.String resourceArn) {
            this.config.resourceArn(resourceArn);
            return this;
        }

        /**
         * redacted_fields block.
         * <p>
         * @return {@code this}
         * @param redactedFields redacted_fields block. This parameter is required.
         */
        public Builder redactedFields(final java.util.List<? extends imports.aws.Wafv2WebAclLoggingConfigurationRedactedFields> redactedFields) {
            this.config.redactedFields(redactedFields);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Wafv2WebAclLoggingConfiguration}.
         */
        @Override
        public imports.aws.Wafv2WebAclLoggingConfiguration build() {
            return new imports.aws.Wafv2WebAclLoggingConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
