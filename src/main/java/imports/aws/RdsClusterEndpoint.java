package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.800Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RdsClusterEndpoint")
public class RdsClusterEndpoint extends com.hashicorp.cdktf.TerraformResource {

    protected RdsClusterEndpoint(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RdsClusterEndpoint(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public RdsClusterEndpoint(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.RdsClusterEndpointConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetExcludedMembers() {
        software.amazon.jsii.Kernel.call(this, "resetExcludedMembers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStaticMembers() {
        software.amazon.jsii.Kernel.call(this, "resetStaticMembers", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterEndpointIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterEndpointIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomEndpointTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "customEndpointTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcludedMembersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "excludedMembersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStaticMembersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "staticMembersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterEndpointIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "clusterEndpointIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterEndpointIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterEndpointIdentifier", java.util.Objects.requireNonNull(value, "clusterEndpointIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterIdentifier", java.util.Objects.requireNonNull(value, "clusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomEndpointType() {
        return software.amazon.jsii.Kernel.get(this, "customEndpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomEndpointType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customEndpointType", java.util.Objects.requireNonNull(value, "customEndpointType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExcludedMembers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "excludedMembers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExcludedMembers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "excludedMembers", java.util.Objects.requireNonNull(value, "excludedMembers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStaticMembers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "staticMembers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStaticMembers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "staticMembers", java.util.Objects.requireNonNull(value, "staticMembers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.RdsClusterEndpoint}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.RdsClusterEndpoint> {
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
        private final imports.aws.RdsClusterEndpointConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.RdsClusterEndpointConfig.Builder();
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
         * @param clusterEndpointIdentifier This parameter is required.
         */
        public Builder clusterEndpointIdentifier(final java.lang.String clusterEndpointIdentifier) {
            this.config.clusterEndpointIdentifier(clusterEndpointIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param clusterIdentifier This parameter is required.
         */
        public Builder clusterIdentifier(final java.lang.String clusterIdentifier) {
            this.config.clusterIdentifier(clusterIdentifier);
            return this;
        }

        /**
         * @return {@code this}
         * @param customEndpointType This parameter is required.
         */
        public Builder customEndpointType(final java.lang.String customEndpointType) {
            this.config.customEndpointType(customEndpointType);
            return this;
        }

        /**
         * @return {@code this}
         * @param excludedMembers This parameter is required.
         */
        public Builder excludedMembers(final java.util.List<java.lang.String> excludedMembers) {
            this.config.excludedMembers(excludedMembers);
            return this;
        }

        /**
         * @return {@code this}
         * @param staticMembers This parameter is required.
         */
        public Builder staticMembers(final java.util.List<java.lang.String> staticMembers) {
            this.config.staticMembers(staticMembers);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.RdsClusterEndpoint}.
         */
        @Override
        public imports.aws.RdsClusterEndpoint build() {
            return new imports.aws.RdsClusterEndpoint(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
