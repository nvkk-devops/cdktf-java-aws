package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.944Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafregionalRegexMatchSet")
public class WafregionalRegexMatchSet extends com.hashicorp.cdktf.TerraformResource {

    protected WafregionalRegexMatchSet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WafregionalRegexMatchSet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public WafregionalRegexMatchSet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.WafregionalRegexMatchSetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetRegexMatchTuple() {
        software.amazon.jsii.Kernel.call(this, "resetRegexMatchTuple", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WafregionalRegexMatchSetRegexMatchTuple> getRegexMatchTupleInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.WafregionalRegexMatchSetRegexMatchTuple>)(software.amazon.jsii.Kernel.get(this, "regexMatchTupleInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalRegexMatchSetRegexMatchTuple.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafregionalRegexMatchSetRegexMatchTuple> getRegexMatchTuple() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "regexMatchTuple", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalRegexMatchSetRegexMatchTuple.class))));
    }

    public void setRegexMatchTuple(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafregionalRegexMatchSetRegexMatchTuple> value) {
        software.amazon.jsii.Kernel.set(this, "regexMatchTuple", java.util.Objects.requireNonNull(value, "regexMatchTuple is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.WafregionalRegexMatchSet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.WafregionalRegexMatchSet> {
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
        private final imports.aws.WafregionalRegexMatchSetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.WafregionalRegexMatchSetConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * regex_match_tuple block.
         * <p>
         * @return {@code this}
         * @param regexMatchTuple regex_match_tuple block. This parameter is required.
         */
        public Builder regexMatchTuple(final java.util.List<? extends imports.aws.WafregionalRegexMatchSetRegexMatchTuple> regexMatchTuple) {
            this.config.regexMatchTuple(regexMatchTuple);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.WafregionalRegexMatchSet}.
         */
        @Override
        public imports.aws.WafregionalRegexMatchSet build() {
            return new imports.aws.WafregionalRegexMatchSet(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
