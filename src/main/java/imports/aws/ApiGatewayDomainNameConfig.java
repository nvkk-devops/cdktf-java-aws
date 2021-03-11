package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.975Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayDomainNameConfig")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayDomainNameConfig.Jsii$Proxy.class)
public interface ApiGatewayDomainNameConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDomainName();

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateBody() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateChain() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificatePrivateKey() {
        return null;
    }

    /**
     * endpoint_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration> getEndpointConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegionalCertificateArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegionalCertificateName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecurityPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayDomainNameConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayDomainNameConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayDomainNameConfig> {
        private java.lang.String domainName;
        private java.lang.String certificateArn;
        private java.lang.String certificateBody;
        private java.lang.String certificateChain;
        private java.lang.String certificateName;
        private java.lang.String certificatePrivateKey;
        private java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration> endpointConfiguration;
        private java.lang.String regionalCertificateArn;
        private java.lang.String regionalCertificateName;
        private java.lang.String securityPolicy;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getDomainName}
         * @param domainName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getCertificateArn}
         * @param certificateArn the value to be set.
         * @return {@code this}
         */
        public Builder certificateArn(java.lang.String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getCertificateBody}
         * @param certificateBody the value to be set.
         * @return {@code this}
         */
        public Builder certificateBody(java.lang.String certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getCertificateChain}
         * @param certificateChain the value to be set.
         * @return {@code this}
         */
        public Builder certificateChain(java.lang.String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getCertificateName}
         * @param certificateName the value to be set.
         * @return {@code this}
         */
        public Builder certificateName(java.lang.String certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getCertificatePrivateKey}
         * @param certificatePrivateKey the value to be set.
         * @return {@code this}
         */
        public Builder certificatePrivateKey(java.lang.String certificatePrivateKey) {
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getEndpointConfiguration}
         * @param endpointConfiguration endpoint_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder endpointConfiguration(java.util.List<? extends imports.aws.ApiGatewayDomainNameEndpointConfiguration> endpointConfiguration) {
            this.endpointConfiguration = (java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration>)endpointConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getRegionalCertificateArn}
         * @param regionalCertificateArn the value to be set.
         * @return {@code this}
         */
        public Builder regionalCertificateArn(java.lang.String regionalCertificateArn) {
            this.regionalCertificateArn = regionalCertificateArn;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getRegionalCertificateName}
         * @param regionalCertificateName the value to be set.
         * @return {@code this}
         */
        public Builder regionalCertificateName(java.lang.String regionalCertificateName) {
            this.regionalCertificateName = regionalCertificateName;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getSecurityPolicy}
         * @param securityPolicy the value to be set.
         * @return {@code this}
         */
        public Builder securityPolicy(java.lang.String securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayDomainNameConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayDomainNameConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayDomainNameConfig build() {
            return new Jsii$Proxy(domainName, certificateArn, certificateBody, certificateChain, certificateName, certificatePrivateKey, endpointConfiguration, regionalCertificateArn, regionalCertificateName, securityPolicy, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ApiGatewayDomainNameConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayDomainNameConfig {
        private final java.lang.String domainName;
        private final java.lang.String certificateArn;
        private final java.lang.String certificateBody;
        private final java.lang.String certificateChain;
        private final java.lang.String certificateName;
        private final java.lang.String certificatePrivateKey;
        private final java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration> endpointConfiguration;
        private final java.lang.String regionalCertificateArn;
        private final java.lang.String regionalCertificateName;
        private final java.lang.String securityPolicy;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateArn = software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateBody = software.amazon.jsii.Kernel.get(this, "certificateBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateChain = software.amazon.jsii.Kernel.get(this, "certificateChain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateName = software.amazon.jsii.Kernel.get(this, "certificateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificatePrivateKey = software.amazon.jsii.Kernel.get(this, "certificatePrivateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpointConfiguration = software.amazon.jsii.Kernel.get(this, "endpointConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ApiGatewayDomainNameEndpointConfiguration.class)));
            this.regionalCertificateArn = software.amazon.jsii.Kernel.get(this, "regionalCertificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.regionalCertificateName = software.amazon.jsii.Kernel.get(this, "regionalCertificateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityPolicy = software.amazon.jsii.Kernel.get(this, "securityPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String domainName, final java.lang.String certificateArn, final java.lang.String certificateBody, final java.lang.String certificateChain, final java.lang.String certificateName, final java.lang.String certificatePrivateKey, final java.util.List<? extends imports.aws.ApiGatewayDomainNameEndpointConfiguration> endpointConfiguration, final java.lang.String regionalCertificateArn, final java.lang.String regionalCertificateName, final java.lang.String securityPolicy, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.domainName = java.util.Objects.requireNonNull(domainName, "domainName is required");
            this.certificateArn = certificateArn;
            this.certificateBody = certificateBody;
            this.certificateChain = certificateChain;
            this.certificateName = certificateName;
            this.certificatePrivateKey = certificatePrivateKey;
            this.endpointConfiguration = (java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration>)endpointConfiguration;
            this.regionalCertificateArn = regionalCertificateArn;
            this.regionalCertificateName = regionalCertificateName;
            this.securityPolicy = securityPolicy;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDomainName() {
            return this.domainName;
        }

        @Override
        public final java.lang.String getCertificateArn() {
            return this.certificateArn;
        }

        @Override
        public final java.lang.String getCertificateBody() {
            return this.certificateBody;
        }

        @Override
        public final java.lang.String getCertificateChain() {
            return this.certificateChain;
        }

        @Override
        public final java.lang.String getCertificateName() {
            return this.certificateName;
        }

        @Override
        public final java.lang.String getCertificatePrivateKey() {
            return this.certificatePrivateKey;
        }

        @Override
        public final java.util.List<imports.aws.ApiGatewayDomainNameEndpointConfiguration> getEndpointConfiguration() {
            return this.endpointConfiguration;
        }

        @Override
        public final java.lang.String getRegionalCertificateArn() {
            return this.regionalCertificateArn;
        }

        @Override
        public final java.lang.String getRegionalCertificateName() {
            return this.regionalCertificateName;
        }

        @Override
        public final java.lang.String getSecurityPolicy() {
            return this.securityPolicy;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("domainName", om.valueToTree(this.getDomainName()));
            if (this.getCertificateArn() != null) {
                data.set("certificateArn", om.valueToTree(this.getCertificateArn()));
            }
            if (this.getCertificateBody() != null) {
                data.set("certificateBody", om.valueToTree(this.getCertificateBody()));
            }
            if (this.getCertificateChain() != null) {
                data.set("certificateChain", om.valueToTree(this.getCertificateChain()));
            }
            if (this.getCertificateName() != null) {
                data.set("certificateName", om.valueToTree(this.getCertificateName()));
            }
            if (this.getCertificatePrivateKey() != null) {
                data.set("certificatePrivateKey", om.valueToTree(this.getCertificatePrivateKey()));
            }
            if (this.getEndpointConfiguration() != null) {
                data.set("endpointConfiguration", om.valueToTree(this.getEndpointConfiguration()));
            }
            if (this.getRegionalCertificateArn() != null) {
                data.set("regionalCertificateArn", om.valueToTree(this.getRegionalCertificateArn()));
            }
            if (this.getRegionalCertificateName() != null) {
                data.set("regionalCertificateName", om.valueToTree(this.getRegionalCertificateName()));
            }
            if (this.getSecurityPolicy() != null) {
                data.set("securityPolicy", om.valueToTree(this.getSecurityPolicy()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ApiGatewayDomainNameConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayDomainNameConfig.Jsii$Proxy that = (ApiGatewayDomainNameConfig.Jsii$Proxy) o;

            if (!domainName.equals(that.domainName)) return false;
            if (this.certificateArn != null ? !this.certificateArn.equals(that.certificateArn) : that.certificateArn != null) return false;
            if (this.certificateBody != null ? !this.certificateBody.equals(that.certificateBody) : that.certificateBody != null) return false;
            if (this.certificateChain != null ? !this.certificateChain.equals(that.certificateChain) : that.certificateChain != null) return false;
            if (this.certificateName != null ? !this.certificateName.equals(that.certificateName) : that.certificateName != null) return false;
            if (this.certificatePrivateKey != null ? !this.certificatePrivateKey.equals(that.certificatePrivateKey) : that.certificatePrivateKey != null) return false;
            if (this.endpointConfiguration != null ? !this.endpointConfiguration.equals(that.endpointConfiguration) : that.endpointConfiguration != null) return false;
            if (this.regionalCertificateArn != null ? !this.regionalCertificateArn.equals(that.regionalCertificateArn) : that.regionalCertificateArn != null) return false;
            if (this.regionalCertificateName != null ? !this.regionalCertificateName.equals(that.regionalCertificateName) : that.regionalCertificateName != null) return false;
            if (this.securityPolicy != null ? !this.securityPolicy.equals(that.securityPolicy) : that.securityPolicy != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.domainName.hashCode();
            result = 31 * result + (this.certificateArn != null ? this.certificateArn.hashCode() : 0);
            result = 31 * result + (this.certificateBody != null ? this.certificateBody.hashCode() : 0);
            result = 31 * result + (this.certificateChain != null ? this.certificateChain.hashCode() : 0);
            result = 31 * result + (this.certificateName != null ? this.certificateName.hashCode() : 0);
            result = 31 * result + (this.certificatePrivateKey != null ? this.certificatePrivateKey.hashCode() : 0);
            result = 31 * result + (this.endpointConfiguration != null ? this.endpointConfiguration.hashCode() : 0);
            result = 31 * result + (this.regionalCertificateArn != null ? this.regionalCertificateArn.hashCode() : 0);
            result = 31 * result + (this.regionalCertificateName != null ? this.regionalCertificateName.hashCode() : 0);
            result = 31 * result + (this.securityPolicy != null ? this.securityPolicy.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
