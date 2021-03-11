package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.441Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsCertificateConfig")
@software.amazon.jsii.Jsii.Proxy(DmsCertificateConfig.Jsii$Proxy.class)
public interface DmsCertificateConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getCertificateId();

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificatePem() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateWallet() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsCertificateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsCertificateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsCertificateConfig> {
        private java.lang.String certificateId;
        private java.lang.String certificatePem;
        private java.lang.String certificateWallet;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DmsCertificateConfig#getCertificateId}
         * @param certificateId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder certificateId(java.lang.String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * Sets the value of {@link DmsCertificateConfig#getCertificatePem}
         * @param certificatePem the value to be set.
         * @return {@code this}
         */
        public Builder certificatePem(java.lang.String certificatePem) {
            this.certificatePem = certificatePem;
            return this;
        }

        /**
         * Sets the value of {@link DmsCertificateConfig#getCertificateWallet}
         * @param certificateWallet the value to be set.
         * @return {@code this}
         */
        public Builder certificateWallet(java.lang.String certificateWallet) {
            this.certificateWallet = certificateWallet;
            return this;
        }

        /**
         * Sets the value of {@link DmsCertificateConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DmsCertificateConfig#getDependsOn}
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
         * Sets the value of {@link DmsCertificateConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DmsCertificateConfig#getProvider}
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
         * @return a new instance of {@link DmsCertificateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsCertificateConfig build() {
            return new Jsii$Proxy(certificateId, certificatePem, certificateWallet, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DmsCertificateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsCertificateConfig {
        private final java.lang.String certificateId;
        private final java.lang.String certificatePem;
        private final java.lang.String certificateWallet;
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
            this.certificateId = software.amazon.jsii.Kernel.get(this, "certificateId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificatePem = software.amazon.jsii.Kernel.get(this, "certificatePem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateWallet = software.amazon.jsii.Kernel.get(this, "certificateWallet", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String certificateId, final java.lang.String certificatePem, final java.lang.String certificateWallet, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificateId = java.util.Objects.requireNonNull(certificateId, "certificateId is required");
            this.certificatePem = certificatePem;
            this.certificateWallet = certificateWallet;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getCertificateId() {
            return this.certificateId;
        }

        @Override
        public final java.lang.String getCertificatePem() {
            return this.certificatePem;
        }

        @Override
        public final java.lang.String getCertificateWallet() {
            return this.certificateWallet;
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

            data.set("certificateId", om.valueToTree(this.getCertificateId()));
            if (this.getCertificatePem() != null) {
                data.set("certificatePem", om.valueToTree(this.getCertificatePem()));
            }
            if (this.getCertificateWallet() != null) {
                data.set("certificateWallet", om.valueToTree(this.getCertificateWallet()));
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
            struct.set("fqn", om.valueToTree("aws.DmsCertificateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsCertificateConfig.Jsii$Proxy that = (DmsCertificateConfig.Jsii$Proxy) o;

            if (!certificateId.equals(that.certificateId)) return false;
            if (this.certificatePem != null ? !this.certificatePem.equals(that.certificatePem) : that.certificatePem != null) return false;
            if (this.certificateWallet != null ? !this.certificateWallet.equals(that.certificateWallet) : that.certificateWallet != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.certificateId.hashCode();
            result = 31 * result + (this.certificatePem != null ? this.certificatePem.hashCode() : 0);
            result = 31 * result + (this.certificateWallet != null ? this.certificateWallet.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
