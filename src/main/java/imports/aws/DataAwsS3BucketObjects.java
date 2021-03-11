package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.360Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsS3BucketObjects")
public class DataAwsS3BucketObjects extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsS3BucketObjects(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsS3BucketObjects(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsS3BucketObjects(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DataAwsS3BucketObjectsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDelimiter() {
        software.amazon.jsii.Kernel.call(this, "resetDelimiter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncodingType() {
        software.amazon.jsii.Kernel.call(this, "resetEncodingType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFetchOwner() {
        software.amazon.jsii.Kernel.call(this, "resetFetchOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxKeys() {
        software.amazon.jsii.Kernel.call(this, "resetMaxKeys", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartAfter() {
        software.amazon.jsii.Kernel.call(this, "resetStartAfter", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCommonPrefixes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "commonPrefixes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getKeys() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "keys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOwners() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "owners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDelimiterInput() {
        return software.amazon.jsii.Kernel.get(this, "delimiterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEncodingTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "encodingTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getFetchOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "fetchOwnerInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxKeysInput() {
        return software.amazon.jsii.Kernel.get(this, "maxKeysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStartAfterInput() {
        return software.amazon.jsii.Kernel.get(this, "startAfterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDelimiter() {
        return software.amazon.jsii.Kernel.get(this, "delimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDelimiter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "delimiter", java.util.Objects.requireNonNull(value, "delimiter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncodingType() {
        return software.amazon.jsii.Kernel.get(this, "encodingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEncodingType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "encodingType", java.util.Objects.requireNonNull(value, "encodingType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getFetchOwner() {
        return software.amazon.jsii.Kernel.get(this, "fetchOwner", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setFetchOwner(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "fetchOwner", java.util.Objects.requireNonNull(value, "fetchOwner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxKeys() {
        return software.amazon.jsii.Kernel.get(this, "maxKeys", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxKeys(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxKeys", java.util.Objects.requireNonNull(value, "maxKeys is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStartAfter() {
        return software.amazon.jsii.Kernel.get(this, "startAfter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStartAfter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "startAfter", java.util.Objects.requireNonNull(value, "startAfter is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsS3BucketObjects}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsS3BucketObjects> {
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
        private final imports.aws.DataAwsS3BucketObjectsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DataAwsS3BucketObjectsConfig.Builder();
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
         * @param bucket This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config.bucket(bucket);
            return this;
        }

        /**
         * @return {@code this}
         * @param delimiter This parameter is required.
         */
        public Builder delimiter(final java.lang.String delimiter) {
            this.config.delimiter(delimiter);
            return this;
        }

        /**
         * @return {@code this}
         * @param encodingType This parameter is required.
         */
        public Builder encodingType(final java.lang.String encodingType) {
            this.config.encodingType(encodingType);
            return this;
        }

        /**
         * @return {@code this}
         * @param fetchOwner This parameter is required.
         */
        public Builder fetchOwner(final java.lang.Boolean fetchOwner) {
            this.config.fetchOwner(fetchOwner);
            return this;
        }

        /**
         * @return {@code this}
         * @param maxKeys This parameter is required.
         */
        public Builder maxKeys(final java.lang.Number maxKeys) {
            this.config.maxKeys(maxKeys);
            return this;
        }

        /**
         * @return {@code this}
         * @param prefix This parameter is required.
         */
        public Builder prefix(final java.lang.String prefix) {
            this.config.prefix(prefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param startAfter This parameter is required.
         */
        public Builder startAfter(final java.lang.String startAfter) {
            this.config.startAfter(startAfter);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsS3BucketObjects}.
         */
        @Override
        public imports.aws.DataAwsS3BucketObjects build() {
            return new imports.aws.DataAwsS3BucketObjects(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
