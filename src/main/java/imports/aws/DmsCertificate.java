package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.440Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsCertificate")
public class DmsCertificate extends com.hashicorp.cdktf.TerraformResource {

    protected DmsCertificate(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DmsCertificate(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DmsCertificate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DmsCertificateConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCertificatePem() {
        software.amazon.jsii.Kernel.call(this, "resetCertificatePem", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificateWallet() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateWallet", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateIdInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificatePemInput() {
        return software.amazon.jsii.Kernel.get(this, "certificatePemInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateWalletInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateWalletInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateId() {
        return software.amazon.jsii.Kernel.get(this, "certificateId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateId", java.util.Objects.requireNonNull(value, "certificateId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificatePem() {
        return software.amazon.jsii.Kernel.get(this, "certificatePem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificatePem(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificatePem", java.util.Objects.requireNonNull(value, "certificatePem is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateWallet() {
        return software.amazon.jsii.Kernel.get(this, "certificateWallet", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateWallet(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateWallet", java.util.Objects.requireNonNull(value, "certificateWallet is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DmsCertificate}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DmsCertificate> {
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
        private final imports.aws.DmsCertificateConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DmsCertificateConfig.Builder();
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
         * @param certificateId This parameter is required.
         */
        public Builder certificateId(final java.lang.String certificateId) {
            this.config.certificateId(certificateId);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificatePem This parameter is required.
         */
        public Builder certificatePem(final java.lang.String certificatePem) {
            this.config.certificatePem(certificatePem);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificateWallet This parameter is required.
         */
        public Builder certificateWallet(final java.lang.String certificateWallet) {
            this.config.certificateWallet(certificateWallet);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DmsCertificate}.
         */
        @Override
        public imports.aws.DmsCertificate build() {
            return new imports.aws.DmsCertificate(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
