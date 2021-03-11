package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.974Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayDomainName")
public class ApiGatewayDomainName extends com.hashicorp.cdktf.TerraformResource {

    protected ApiGatewayDomainName(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayDomainName(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ApiGatewayDomainName(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ApiGatewayDomainNameConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCertificateArn() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificateBody() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateBody", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificateChain() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateChain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificateName() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificatePrivateKey() {
        software.amazon.jsii.Kernel.call(this, "resetCertificatePrivateKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpointConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegionalCertificateArn() {
        software.amazon.jsii.Kernel.call(this, "resetRegionalCertificateArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegionalCertificateName() {
        software.amazon.jsii.Kernel.call(this, "resetRegionalCertificateName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityPolicy", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateUploadDate() {
        return software.amazon.jsii.Kernel.get(this, "certificateUploadDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudfrontDomainName() {
        return software.amazon.jsii.Kernel.get(this, "cloudfrontDomainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudfrontZoneId() {
        return software.amazon.jsii.Kernel.get(this, "cloudfrontZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainNameInput() {
        return software.amazon.jsii.Kernel.get(this, "domainNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegionalDomainName() {
        return software.amazon.jsii.Kernel.get(this, "regionalDomainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegionalZoneId() {
        return software.amazon.jsii.Kernel.get(this, "regionalZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateArnInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateBodyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateChainInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateChainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateNameInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificatePrivateKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "certificatePrivateKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration> getEndpointConfigurationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration>)(software.amazon.jsii.Kernel.get(this, "endpointConfigurationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayDomainNameEndpointConfiguration.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionalCertificateArnInput() {
        return software.amazon.jsii.Kernel.get(this, "regionalCertificateArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionalCertificateNameInput() {
        return software.amazon.jsii.Kernel.get(this, "regionalCertificateNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecurityPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "securityPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateArn", java.util.Objects.requireNonNull(value, "certificateArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateBody() {
        return software.amazon.jsii.Kernel.get(this, "certificateBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateBody(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateBody", java.util.Objects.requireNonNull(value, "certificateBody is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateChain() {
        return software.amazon.jsii.Kernel.get(this, "certificateChain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateChain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateChain", java.util.Objects.requireNonNull(value, "certificateChain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateName() {
        return software.amazon.jsii.Kernel.get(this, "certificateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateName", java.util.Objects.requireNonNull(value, "certificateName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificatePrivateKey() {
        return software.amazon.jsii.Kernel.get(this, "certificatePrivateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificatePrivateKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificatePrivateKey", java.util.Objects.requireNonNull(value, "certificatePrivateKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainName", java.util.Objects.requireNonNull(value, "domainName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration> getEndpointConfiguration() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "endpointConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayDomainNameEndpointConfiguration.class))));
    }

    public void setEndpointConfiguration(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration> value) {
        software.amazon.jsii.Kernel.set(this, "endpointConfiguration", java.util.Objects.requireNonNull(value, "endpointConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegionalCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "regionalCertificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegionalCertificateArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "regionalCertificateArn", java.util.Objects.requireNonNull(value, "regionalCertificateArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegionalCertificateName() {
        return software.amazon.jsii.Kernel.get(this, "regionalCertificateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegionalCertificateName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "regionalCertificateName", java.util.Objects.requireNonNull(value, "regionalCertificateName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecurityPolicy() {
        return software.amazon.jsii.Kernel.get(this, "securityPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecurityPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "securityPolicy", java.util.Objects.requireNonNull(value, "securityPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ApiGatewayDomainName}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ApiGatewayDomainName> {
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
        private final imports.aws.ApiGatewayDomainNameConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ApiGatewayDomainNameConfig.Builder();
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
         * @param domainName This parameter is required.
         */
        public Builder domainName(final java.lang.String domainName) {
            this.config.domainName(domainName);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificateArn This parameter is required.
         */
        public Builder certificateArn(final java.lang.String certificateArn) {
            this.config.certificateArn(certificateArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificateBody This parameter is required.
         */
        public Builder certificateBody(final java.lang.String certificateBody) {
            this.config.certificateBody(certificateBody);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificateChain This parameter is required.
         */
        public Builder certificateChain(final java.lang.String certificateChain) {
            this.config.certificateChain(certificateChain);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificateName This parameter is required.
         */
        public Builder certificateName(final java.lang.String certificateName) {
            this.config.certificateName(certificateName);
            return this;
        }

        /**
         * @return {@code this}
         * @param certificatePrivateKey This parameter is required.
         */
        public Builder certificatePrivateKey(final java.lang.String certificatePrivateKey) {
            this.config.certificatePrivateKey(certificatePrivateKey);
            return this;
        }

        /**
         * endpoint_configuration block.
         * <p>
         * @return {@code this}
         * @param endpointConfiguration endpoint_configuration block. This parameter is required.
         */
        public Builder endpointConfiguration(final java.util.List<? extends imports.aws.ApiGatewayDomainNameEndpointConfiguration> endpointConfiguration) {
            this.config.endpointConfiguration(endpointConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param regionalCertificateArn This parameter is required.
         */
        public Builder regionalCertificateArn(final java.lang.String regionalCertificateArn) {
            this.config.regionalCertificateArn(regionalCertificateArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param regionalCertificateName This parameter is required.
         */
        public Builder regionalCertificateName(final java.lang.String regionalCertificateName) {
            this.config.regionalCertificateName(regionalCertificateName);
            return this;
        }

        /**
         * @return {@code this}
         * @param securityPolicy This parameter is required.
         */
        public Builder securityPolicy(final java.lang.String securityPolicy) {
            this.config.securityPolicy(securityPolicy);
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
         * @returns a newly built instance of {@link imports.aws.ApiGatewayDomainName}.
         */
        @Override
        public imports.aws.ApiGatewayDomainName build() {
            return new imports.aws.ApiGatewayDomainName(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
