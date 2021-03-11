package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.859Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesActiveReceiptRuleSet")
public class SesActiveReceiptRuleSet extends com.hashicorp.cdktf.TerraformResource {

    protected SesActiveReceiptRuleSet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesActiveReceiptRuleSet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SesActiveReceiptRuleSet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SesActiveReceiptRuleSetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleSetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleSetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleSetName() {
        return software.amazon.jsii.Kernel.get(this, "ruleSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuleSetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ruleSetName", java.util.Objects.requireNonNull(value, "ruleSetName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SesActiveReceiptRuleSet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SesActiveReceiptRuleSet> {
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
        private final imports.aws.SesActiveReceiptRuleSetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SesActiveReceiptRuleSetConfig.Builder();
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
         * @return {@code this}
         * @param ruleSetName This parameter is required.
         */
        public Builder ruleSetName(final java.lang.String ruleSetName) {
            this.config.ruleSetName(ruleSetName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SesActiveReceiptRuleSet}.
         */
        @Override
        public imports.aws.SesActiveReceiptRuleSet build() {
            return new imports.aws.SesActiveReceiptRuleSet(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
