package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.104Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BatchComputeEnvironment")
public class BatchComputeEnvironment extends com.hashicorp.cdktf.TerraformResource {

    protected BatchComputeEnvironment(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BatchComputeEnvironment(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public BatchComputeEnvironment(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.BatchComputeEnvironmentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetComputeEnvironmentName() {
        software.amazon.jsii.Kernel.call(this, "resetComputeEnvironmentName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetComputeEnvironmentNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetComputeEnvironmentNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetComputeResources() {
        software.amazon.jsii.Kernel.call(this, "resetComputeResources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetState() {
        software.amazon.jsii.Kernel.call(this, "resetState", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEccClusterArn() {
        return software.amazon.jsii.Kernel.get(this, "eccClusterArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEcsClusterArn() {
        return software.amazon.jsii.Kernel.get(this, "ecsClusterArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatusReason() {
        return software.amazon.jsii.Kernel.get(this, "statusReason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getComputeEnvironmentNameInput() {
        return software.amazon.jsii.Kernel.get(this, "computeEnvironmentNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getComputeEnvironmentNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "computeEnvironmentNamePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BatchComputeEnvironmentComputeResources> getComputeResourcesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.BatchComputeEnvironmentComputeResources>)(software.amazon.jsii.Kernel.get(this, "computeResourcesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BatchComputeEnvironmentComputeResources.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStateInput() {
        return software.amazon.jsii.Kernel.get(this, "stateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComputeEnvironmentName() {
        return software.amazon.jsii.Kernel.get(this, "computeEnvironmentName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComputeEnvironmentName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "computeEnvironmentName", java.util.Objects.requireNonNull(value, "computeEnvironmentName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComputeEnvironmentNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "computeEnvironmentNamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComputeEnvironmentNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "computeEnvironmentNamePrefix", java.util.Objects.requireNonNull(value, "computeEnvironmentNamePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.BatchComputeEnvironmentComputeResources> getComputeResources() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "computeResources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BatchComputeEnvironmentComputeResources.class))));
    }

    public void setComputeResources(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.BatchComputeEnvironmentComputeResources> value) {
        software.amazon.jsii.Kernel.set(this, "computeResources", java.util.Objects.requireNonNull(value, "computeResources is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRole() {
        return software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRole", java.util.Objects.requireNonNull(value, "serviceRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setState(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "state", java.util.Objects.requireNonNull(value, "state is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.BatchComputeEnvironment}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.BatchComputeEnvironment> {
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
        private final imports.aws.BatchComputeEnvironmentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.BatchComputeEnvironmentConfig.Builder();
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
         * @param serviceRole This parameter is required.
         */
        public Builder serviceRole(final java.lang.String serviceRole) {
            this.config.serviceRole(serviceRole);
            return this;
        }

        /**
         * @return {@code this}
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @return {@code this}
         * @param computeEnvironmentName This parameter is required.
         */
        public Builder computeEnvironmentName(final java.lang.String computeEnvironmentName) {
            this.config.computeEnvironmentName(computeEnvironmentName);
            return this;
        }

        /**
         * @return {@code this}
         * @param computeEnvironmentNamePrefix This parameter is required.
         */
        public Builder computeEnvironmentNamePrefix(final java.lang.String computeEnvironmentNamePrefix) {
            this.config.computeEnvironmentNamePrefix(computeEnvironmentNamePrefix);
            return this;
        }

        /**
         * compute_resources block.
         * <p>
         * @return {@code this}
         * @param computeResources compute_resources block. This parameter is required.
         */
        public Builder computeResources(final java.util.List<? extends imports.aws.BatchComputeEnvironmentComputeResources> computeResources) {
            this.config.computeResources(computeResources);
            return this;
        }

        /**
         * @return {@code this}
         * @param state This parameter is required.
         */
        public Builder state(final java.lang.String state) {
            this.config.state(state);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.BatchComputeEnvironment}.
         */
        @Override
        public imports.aws.BatchComputeEnvironment build() {
            return new imports.aws.BatchComputeEnvironment(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
