package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.639Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotThingType")
public class IotThingType extends com.hashicorp.cdktf.TerraformResource {

    protected IotThingType(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotThingType(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public IotThingType(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.IotThingTypeConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDeprecated() {
        software.amazon.jsii.Kernel.call(this, "resetDeprecated", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProperties() {
        software.amazon.jsii.Kernel.call(this, "resetProperties", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDeprecatedInput() {
        return software.amazon.jsii.Kernel.get(this, "deprecatedInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.IotThingTypeProperties> getPropertiesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.IotThingTypeProperties>)(software.amazon.jsii.Kernel.get(this, "propertiesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotThingTypeProperties.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getDeprecated() {
        return software.amazon.jsii.Kernel.get(this, "deprecated", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDeprecated(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deprecated", java.util.Objects.requireNonNull(value, "deprecated is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotThingTypeProperties> getProperties() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "properties", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.IotThingTypeProperties.class))));
    }

    public void setProperties(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.IotThingTypeProperties> value) {
        software.amazon.jsii.Kernel.set(this, "properties", java.util.Objects.requireNonNull(value, "properties is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.IotThingType}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.IotThingType> {
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
        private final imports.aws.IotThingTypeConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.IotThingTypeConfig.Builder();
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
         * @return {@code this}
         * @param deprecated This parameter is required.
         */
        public Builder deprecated(final java.lang.Boolean deprecated) {
            this.config.deprecated(deprecated);
            return this;
        }

        /**
         * properties block.
         * <p>
         * @return {@code this}
         * @param properties properties block. This parameter is required.
         */
        public Builder properties(final java.util.List<? extends imports.aws.IotThingTypeProperties> properties) {
            this.config.properties(properties);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.IotThingType}.
         */
        @Override
        public imports.aws.IotThingType build() {
            return new imports.aws.IotThingType(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
