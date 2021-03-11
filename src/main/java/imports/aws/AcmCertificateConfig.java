package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.925Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AcmCertificateConfig")
@software.amazon.jsii.Jsii.Proxy(AcmCertificateConfig.Jsii$Proxy.class)
public interface AcmCertificateConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateAuthorityArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateBody() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateChain() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDomainName() {
        return null;
    }

    /**
     * options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AcmCertificateOptions> getOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubjectAlternativeNames() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getValidationMethod() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AcmCertificateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AcmCertificateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AcmCertificateConfig> {
        private java.lang.String certificateAuthorityArn;
        private java.lang.String certificateBody;
        private java.lang.String certificateChain;
        private java.lang.String domainName;
        private java.util.List<imports.aws.AcmCertificateOptions> options;
        private java.lang.String privateKey;
        private java.util.List<java.lang.String> subjectAlternativeNames;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String validationMethod;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AcmCertificateConfig#getCertificateAuthorityArn}
         * @param certificateAuthorityArn the value to be set.
         * @return {@code this}
         */
        public Builder certificateAuthorityArn(java.lang.String certificateAuthorityArn) {
            this.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getCertificateBody}
         * @param certificateBody the value to be set.
         * @return {@code this}
         */
        public Builder certificateBody(java.lang.String certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getCertificateChain}
         * @param certificateChain the value to be set.
         * @return {@code this}
         */
        public Builder certificateChain(java.lang.String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getDomainName}
         * @param domainName the value to be set.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getOptions}
         * @param options options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder options(java.util.List<? extends imports.aws.AcmCertificateOptions> options) {
            this.options = (java.util.List<imports.aws.AcmCertificateOptions>)options;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getPrivateKey}
         * @param privateKey the value to be set.
         * @return {@code this}
         */
        public Builder privateKey(java.lang.String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getSubjectAlternativeNames}
         * @param subjectAlternativeNames the value to be set.
         * @return {@code this}
         */
        public Builder subjectAlternativeNames(java.util.List<java.lang.String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getValidationMethod}
         * @param validationMethod the value to be set.
         * @return {@code this}
         */
        public Builder validationMethod(java.lang.String validationMethod) {
            this.validationMethod = validationMethod;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getDependsOn}
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
         * Sets the value of {@link AcmCertificateConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AcmCertificateConfig#getProvider}
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
         * @return a new instance of {@link AcmCertificateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AcmCertificateConfig build() {
            return new Jsii$Proxy(certificateAuthorityArn, certificateBody, certificateChain, domainName, options, privateKey, subjectAlternativeNames, tags, validationMethod, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AcmCertificateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AcmCertificateConfig {
        private final java.lang.String certificateAuthorityArn;
        private final java.lang.String certificateBody;
        private final java.lang.String certificateChain;
        private final java.lang.String domainName;
        private final java.util.List<imports.aws.AcmCertificateOptions> options;
        private final java.lang.String privateKey;
        private final java.util.List<java.lang.String> subjectAlternativeNames;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String validationMethod;
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
            this.certificateAuthorityArn = software.amazon.jsii.Kernel.get(this, "certificateAuthorityArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateBody = software.amazon.jsii.Kernel.get(this, "certificateBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateChain = software.amazon.jsii.Kernel.get(this, "certificateChain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.options = software.amazon.jsii.Kernel.get(this, "options", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AcmCertificateOptions.class)));
            this.privateKey = software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subjectAlternativeNames = software.amazon.jsii.Kernel.get(this, "subjectAlternativeNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.validationMethod = software.amazon.jsii.Kernel.get(this, "validationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String certificateAuthorityArn, final java.lang.String certificateBody, final java.lang.String certificateChain, final java.lang.String domainName, final java.util.List<? extends imports.aws.AcmCertificateOptions> options, final java.lang.String privateKey, final java.util.List<java.lang.String> subjectAlternativeNames, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String validationMethod, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificateAuthorityArn = certificateAuthorityArn;
            this.certificateBody = certificateBody;
            this.certificateChain = certificateChain;
            this.domainName = domainName;
            this.options = (java.util.List<imports.aws.AcmCertificateOptions>)options;
            this.privateKey = privateKey;
            this.subjectAlternativeNames = subjectAlternativeNames;
            this.tags = tags;
            this.validationMethod = validationMethod;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getCertificateAuthorityArn() {
            return this.certificateAuthorityArn;
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
        public final java.lang.String getDomainName() {
            return this.domainName;
        }

        @Override
        public final java.util.List<imports.aws.AcmCertificateOptions> getOptions() {
            return this.options;
        }

        @Override
        public final java.lang.String getPrivateKey() {
            return this.privateKey;
        }

        @Override
        public final java.util.List<java.lang.String> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getValidationMethod() {
            return this.validationMethod;
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

            if (this.getCertificateAuthorityArn() != null) {
                data.set("certificateAuthorityArn", om.valueToTree(this.getCertificateAuthorityArn()));
            }
            if (this.getCertificateBody() != null) {
                data.set("certificateBody", om.valueToTree(this.getCertificateBody()));
            }
            if (this.getCertificateChain() != null) {
                data.set("certificateChain", om.valueToTree(this.getCertificateChain()));
            }
            if (this.getDomainName() != null) {
                data.set("domainName", om.valueToTree(this.getDomainName()));
            }
            if (this.getOptions() != null) {
                data.set("options", om.valueToTree(this.getOptions()));
            }
            if (this.getPrivateKey() != null) {
                data.set("privateKey", om.valueToTree(this.getPrivateKey()));
            }
            if (this.getSubjectAlternativeNames() != null) {
                data.set("subjectAlternativeNames", om.valueToTree(this.getSubjectAlternativeNames()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getValidationMethod() != null) {
                data.set("validationMethod", om.valueToTree(this.getValidationMethod()));
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
            struct.set("fqn", om.valueToTree("aws.AcmCertificateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AcmCertificateConfig.Jsii$Proxy that = (AcmCertificateConfig.Jsii$Proxy) o;

            if (this.certificateAuthorityArn != null ? !this.certificateAuthorityArn.equals(that.certificateAuthorityArn) : that.certificateAuthorityArn != null) return false;
            if (this.certificateBody != null ? !this.certificateBody.equals(that.certificateBody) : that.certificateBody != null) return false;
            if (this.certificateChain != null ? !this.certificateChain.equals(that.certificateChain) : that.certificateChain != null) return false;
            if (this.domainName != null ? !this.domainName.equals(that.domainName) : that.domainName != null) return false;
            if (this.options != null ? !this.options.equals(that.options) : that.options != null) return false;
            if (this.privateKey != null ? !this.privateKey.equals(that.privateKey) : that.privateKey != null) return false;
            if (this.subjectAlternativeNames != null ? !this.subjectAlternativeNames.equals(that.subjectAlternativeNames) : that.subjectAlternativeNames != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.validationMethod != null ? !this.validationMethod.equals(that.validationMethod) : that.validationMethod != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.certificateAuthorityArn != null ? this.certificateAuthorityArn.hashCode() : 0;
            result = 31 * result + (this.certificateBody != null ? this.certificateBody.hashCode() : 0);
            result = 31 * result + (this.certificateChain != null ? this.certificateChain.hashCode() : 0);
            result = 31 * result + (this.domainName != null ? this.domainName.hashCode() : 0);
            result = 31 * result + (this.options != null ? this.options.hashCode() : 0);
            result = 31 * result + (this.privateKey != null ? this.privateKey.hashCode() : 0);
            result = 31 * result + (this.subjectAlternativeNames != null ? this.subjectAlternativeNames.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.validationMethod != null ? this.validationMethod.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
