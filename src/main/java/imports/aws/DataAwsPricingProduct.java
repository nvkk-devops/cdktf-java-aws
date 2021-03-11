package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.346Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsPricingProduct")
public class DataAwsPricingProduct extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsPricingProduct(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsPricingProduct(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsPricingProduct(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DataAwsPricingProductConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsPricingProductFilters> getFiltersInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filtersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsPricingProductFilters.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResult() {
        return software.amazon.jsii.Kernel.get(this, "result", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceCodeInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceCodeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsPricingProductFilters> getFilters() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsPricingProductFilters.class))));
    }

    public void setFilters(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsPricingProductFilters> value) {
        software.amazon.jsii.Kernel.set(this, "filters", java.util.Objects.requireNonNull(value, "filters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceCode() {
        return software.amazon.jsii.Kernel.get(this, "serviceCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceCode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceCode", java.util.Objects.requireNonNull(value, "serviceCode is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsPricingProduct}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsPricingProduct> {
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
        private final imports.aws.DataAwsPricingProductConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DataAwsPricingProductConfig.Builder();
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
         * filters block.
         * <p>
         * @return {@code this}
         * @param filters filters block. This parameter is required.
         */
        public Builder filters(final java.util.List<? extends imports.aws.DataAwsPricingProductFilters> filters) {
            this.config.filters(filters);
            return this;
        }

        /**
         * @return {@code this}
         * @param serviceCode This parameter is required.
         */
        public Builder serviceCode(final java.lang.String serviceCode) {
            this.config.serviceCode(serviceCode);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsPricingProduct}.
         */
        @Override
        public imports.aws.DataAwsPricingProduct build() {
            return new imports.aws.DataAwsPricingProduct(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
