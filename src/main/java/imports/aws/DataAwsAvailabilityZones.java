package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.236Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsAvailabilityZones")
public class DataAwsAvailabilityZones extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsAvailabilityZones(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsAvailabilityZones(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsAvailabilityZones(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsAvailabilityZonesConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public DataAwsAvailabilityZones(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAllAvailabilityZones() {
        software.amazon.jsii.Kernel.call(this, "resetAllAvailabilityZones", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlacklistedNames() {
        software.amazon.jsii.Kernel.call(this, "resetBlacklistedNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlacklistedZoneIds() {
        software.amazon.jsii.Kernel.call(this, "resetBlacklistedZoneIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExcludeNames() {
        software.amazon.jsii.Kernel.call(this, "resetExcludeNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExcludeZoneIds() {
        software.amazon.jsii.Kernel.call(this, "resetExcludeZoneIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGroupNames() {
        software.amazon.jsii.Kernel.call(this, "resetGroupNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetState() {
        software.amazon.jsii.Kernel.call(this, "resetState", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "names", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getZoneIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "zoneIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAllAvailabilityZonesInput() {
        return software.amazon.jsii.Kernel.get(this, "allAvailabilityZonesInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBlacklistedNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "blacklistedNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBlacklistedZoneIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "blacklistedZoneIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcludeNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "excludeNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcludeZoneIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "excludeZoneIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsAvailabilityZonesFilter> getFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DataAwsAvailabilityZonesFilter>)(software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsAvailabilityZonesFilter.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroupNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "groupNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStateInput() {
        return software.amazon.jsii.Kernel.get(this, "stateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getAllAvailabilityZones() {
        return software.amazon.jsii.Kernel.get(this, "allAvailabilityZones", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAllAvailabilityZones(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allAvailabilityZones", java.util.Objects.requireNonNull(value, "allAvailabilityZones is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getBlacklistedNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "blacklistedNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setBlacklistedNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "blacklistedNames", java.util.Objects.requireNonNull(value, "blacklistedNames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getBlacklistedZoneIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "blacklistedZoneIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setBlacklistedZoneIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "blacklistedZoneIds", java.util.Objects.requireNonNull(value, "blacklistedZoneIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExcludeNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "excludeNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExcludeNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "excludeNames", java.util.Objects.requireNonNull(value, "excludeNames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExcludeZoneIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "excludeZoneIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExcludeZoneIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "excludeZoneIds", java.util.Objects.requireNonNull(value, "excludeZoneIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsAvailabilityZonesFilter> getFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsAvailabilityZonesFilter.class))));
    }

    public void setFilter(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsAvailabilityZonesFilter> value) {
        software.amazon.jsii.Kernel.set(this, "filter", java.util.Objects.requireNonNull(value, "filter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getGroupNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "groupNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setGroupNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "groupNames", java.util.Objects.requireNonNull(value, "groupNames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setState(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "state", java.util.Objects.requireNonNull(value, "state is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsAvailabilityZones}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsAvailabilityZones> {
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
        private imports.aws.DataAwsAvailabilityZonesConfig.Builder config;

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
         * @return {@code this}
         * @param allAvailabilityZones This parameter is required.
         */
        public Builder allAvailabilityZones(final java.lang.Boolean allAvailabilityZones) {
            this.config().allAvailabilityZones(allAvailabilityZones);
            return this;
        }

        /**
         * @return {@code this}
         * @param blacklistedNames This parameter is required.
         */
        public Builder blacklistedNames(final java.util.List<java.lang.String> blacklistedNames) {
            this.config().blacklistedNames(blacklistedNames);
            return this;
        }

        /**
         * @return {@code this}
         * @param blacklistedZoneIds This parameter is required.
         */
        public Builder blacklistedZoneIds(final java.util.List<java.lang.String> blacklistedZoneIds) {
            this.config().blacklistedZoneIds(blacklistedZoneIds);
            return this;
        }

        /**
         * @return {@code this}
         * @param excludeNames This parameter is required.
         */
        public Builder excludeNames(final java.util.List<java.lang.String> excludeNames) {
            this.config().excludeNames(excludeNames);
            return this;
        }

        /**
         * @return {@code this}
         * @param excludeZoneIds This parameter is required.
         */
        public Builder excludeZoneIds(final java.util.List<java.lang.String> excludeZoneIds) {
            this.config().excludeZoneIds(excludeZoneIds);
            return this;
        }

        /**
         * filter block.
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.DataAwsAvailabilityZonesFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * @return {@code this}
         * @param groupNames This parameter is required.
         */
        public Builder groupNames(final java.util.List<java.lang.String> groupNames) {
            this.config().groupNames(groupNames);
            return this;
        }

        /**
         * @return {@code this}
         * @param state This parameter is required.
         */
        public Builder state(final java.lang.String state) {
            this.config().state(state);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsAvailabilityZones}.
         */
        @Override
        public imports.aws.DataAwsAvailabilityZones build() {
            return new imports.aws.DataAwsAvailabilityZones(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsAvailabilityZonesConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsAvailabilityZonesConfig.Builder();
            }
            return this.config;
        }
    }
}
