package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.276Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsEc2InstanceTypeOfferings")
public class DataAwsEc2InstanceTypeOfferings extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsEc2InstanceTypeOfferings(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsEc2InstanceTypeOfferings(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsEc2InstanceTypeOfferings(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsEc2InstanceTypeOfferingsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsEc2InstanceTypeOfferings(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocationType() {
        software.amazon.jsii.Kernel.call(this, "resetLocationType", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getInstanceTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "instanceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsEc2InstanceTypeOfferingsFilter> getFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DataAwsEc2InstanceTypeOfferingsFilter>)(software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsEc2InstanceTypeOfferingsFilter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "locationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsEc2InstanceTypeOfferingsFilter> getFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsEc2InstanceTypeOfferingsFilter.class))));
    }

    public void setFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsEc2InstanceTypeOfferingsFilter> value) {
        software.amazon.jsii.Kernel.set(this, "filter", java.util.Objects.requireNonNull(value, "filter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocationType() {
        return software.amazon.jsii.Kernel.get(this, "locationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "locationType", java.util.Objects.requireNonNull(value, "locationType is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsEc2InstanceTypeOfferings}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsEc2InstanceTypeOfferings> {
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
        private imports.aws.DataAwsEc2InstanceTypeOfferingsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * filter block.
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.DataAwsEc2InstanceTypeOfferingsFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * @return {@code this}
         * @param locationType This parameter is required.
         */
        public Builder locationType(final java.lang.String locationType) {
            this.config().locationType(locationType);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsEc2InstanceTypeOfferings}.
         */
        @Override
        public imports.aws.DataAwsEc2InstanceTypeOfferings build() {
            return new imports.aws.DataAwsEc2InstanceTypeOfferings(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsEc2InstanceTypeOfferingsConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsEc2InstanceTypeOfferingsConfig.Builder();
            }
            return this.config;
        }
    }
}
