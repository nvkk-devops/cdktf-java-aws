package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.316Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsInternetGateway")
public class DataAwsInternetGateway extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsInternetGateway(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsInternetGateway(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsInternetGateway(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsInternetGatewayConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsInternetGateway(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DataAwsInternetGatewayAttachments attachments(final @org.jetbrains.annotations.NotNull java.lang.String index) {
        return software.amazon.jsii.Kernel.call(this, "attachments", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsInternetGatewayAttachments.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInternetGatewayId() {
        software.amazon.jsii.Kernel.call(this, "resetInternetGatewayId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsInternetGatewayFilter> getFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DataAwsInternetGatewayFilter>)(software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsInternetGatewayFilter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInternetGatewayIdInput() {
        return software.amazon.jsii.Kernel.get(this, "internetGatewayIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsInternetGatewayFilter> getFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsInternetGatewayFilter.class))));
    }

    public void setFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsInternetGatewayFilter> value) {
        software.amazon.jsii.Kernel.set(this, "filter", java.util.Objects.requireNonNull(value, "filter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInternetGatewayId() {
        return software.amazon.jsii.Kernel.get(this, "internetGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInternetGatewayId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "internetGatewayId", java.util.Objects.requireNonNull(value, "internetGatewayId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsInternetGateway}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsInternetGateway> {
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
        private imports.aws.DataAwsInternetGatewayConfig.Builder config;

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
        public Builder filter(final java.util.List<? extends imports.aws.DataAwsInternetGatewayFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * @return {@code this}
         * @param internetGatewayId This parameter is required.
         */
        public Builder internetGatewayId(final java.lang.String internetGatewayId) {
            this.config().internetGatewayId(internetGatewayId);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsInternetGateway}.
         */
        @Override
        public imports.aws.DataAwsInternetGateway build() {
            return new imports.aws.DataAwsInternetGateway(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsInternetGatewayConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsInternetGatewayConfig.Builder();
            }
            return this.config;
        }
    }
}
