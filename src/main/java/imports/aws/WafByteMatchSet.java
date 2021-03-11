package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.932Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafByteMatchSet")
public class WafByteMatchSet extends com.hashicorp.cdktf.TerraformResource {

    protected WafByteMatchSet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WafByteMatchSet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public WafByteMatchSet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.WafByteMatchSetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetByteMatchTuples() {
        software.amazon.jsii.Kernel.call(this, "resetByteMatchTuples", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WafByteMatchSetByteMatchTuples> getByteMatchTuplesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.WafByteMatchSetByteMatchTuples>)(software.amazon.jsii.Kernel.get(this, "byteMatchTuplesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafByteMatchSetByteMatchTuples.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafByteMatchSetByteMatchTuples> getByteMatchTuples() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "byteMatchTuples", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafByteMatchSetByteMatchTuples.class))));
    }

    public void setByteMatchTuples(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafByteMatchSetByteMatchTuples> value) {
        software.amazon.jsii.Kernel.set(this, "byteMatchTuples", java.util.Objects.requireNonNull(value, "byteMatchTuples is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.WafByteMatchSet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.WafByteMatchSet> {
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
        private final imports.aws.WafByteMatchSetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.WafByteMatchSetConfig.Builder();
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
         * byte_match_tuples block.
         * <p>
         * @return {@code this}
         * @param byteMatchTuples byte_match_tuples block. This parameter is required.
         */
        public Builder byteMatchTuples(final java.util.List<? extends imports.aws.WafByteMatchSetByteMatchTuples> byteMatchTuples) {
            this.config.byteMatchTuples(byteMatchTuples);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.WafByteMatchSet}.
         */
        @Override
        public imports.aws.WafByteMatchSet build() {
            return new imports.aws.WafByteMatchSet(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
