package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.587Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlobalacceleratorListener")
public class GlobalacceleratorListener extends com.hashicorp.cdktf.TerraformResource {

    protected GlobalacceleratorListener(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlobalacceleratorListener(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GlobalacceleratorListener(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GlobalacceleratorListenerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetClientAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetClientAffinity", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcceleratorArnInput() {
        return software.amazon.jsii.Kernel.get(this, "acceleratorArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlobalacceleratorListenerPortRange> getPortRangeInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "portRangeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlobalacceleratorListenerPortRange.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProtocolInput() {
        return software.amazon.jsii.Kernel.get(this, "protocolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "clientAffinityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcceleratorArn() {
        return software.amazon.jsii.Kernel.get(this, "acceleratorArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAcceleratorArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "acceleratorArn", java.util.Objects.requireNonNull(value, "acceleratorArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientAffinity() {
        return software.amazon.jsii.Kernel.get(this, "clientAffinity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientAffinity(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientAffinity", java.util.Objects.requireNonNull(value, "clientAffinity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlobalacceleratorListenerPortRange> getPortRange() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "portRange", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlobalacceleratorListenerPortRange.class))));
    }

    public void setPortRange(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlobalacceleratorListenerPortRange> value) {
        software.amazon.jsii.Kernel.set(this, "portRange", java.util.Objects.requireNonNull(value, "portRange is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProtocol() {
        return software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProtocol(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "protocol", java.util.Objects.requireNonNull(value, "protocol is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GlobalacceleratorListener}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GlobalacceleratorListener> {
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
        private final imports.aws.GlobalacceleratorListenerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GlobalacceleratorListenerConfig.Builder();
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
         * @param acceleratorArn This parameter is required.
         */
        public Builder acceleratorArn(final java.lang.String acceleratorArn) {
            this.config.acceleratorArn(acceleratorArn);
            return this;
        }

        /**
         * port_range block.
         * <p>
         * @return {@code this}
         * @param portRange port_range block. This parameter is required.
         */
        public Builder portRange(final java.util.List<? extends imports.aws.GlobalacceleratorListenerPortRange> portRange) {
            this.config.portRange(portRange);
            return this;
        }

        /**
         * @return {@code this}
         * @param protocol This parameter is required.
         */
        public Builder protocol(final java.lang.String protocol) {
            this.config.protocol(protocol);
            return this;
        }

        /**
         * @return {@code this}
         * @param clientAffinity This parameter is required.
         */
        public Builder clientAffinity(final java.lang.String clientAffinity) {
            this.config.clientAffinity(clientAffinity);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GlobalacceleratorListener}.
         */
        @Override
        public imports.aws.GlobalacceleratorListener build() {
            return new imports.aws.GlobalacceleratorListener(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
