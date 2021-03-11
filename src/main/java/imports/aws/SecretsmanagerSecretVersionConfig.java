package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.852Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SecretsmanagerSecretVersionConfig")
@software.amazon.jsii.Jsii.Proxy(SecretsmanagerSecretVersionConfig.Jsii$Proxy.class)
public interface SecretsmanagerSecretVersionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getSecretId();

    default @org.jetbrains.annotations.Nullable java.lang.String getSecretBinary() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecretString() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVersionStages() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretsmanagerSecretVersionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretsmanagerSecretVersionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecretsmanagerSecretVersionConfig> {
        private java.lang.String secretId;
        private java.lang.String secretBinary;
        private java.lang.String secretString;
        private java.util.List<java.lang.String> versionStages;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getSecretId}
         * @param secretId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder secretId(java.lang.String secretId) {
            this.secretId = secretId;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getSecretBinary}
         * @param secretBinary the value to be set.
         * @return {@code this}
         */
        public Builder secretBinary(java.lang.String secretBinary) {
            this.secretBinary = secretBinary;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getSecretString}
         * @param secretString the value to be set.
         * @return {@code this}
         */
        public Builder secretString(java.lang.String secretString) {
            this.secretString = secretString;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getVersionStages}
         * @param versionStages the value to be set.
         * @return {@code this}
         */
        public Builder versionStages(java.util.List<java.lang.String> versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getDependsOn}
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
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretVersionConfig#getProvider}
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
         * @return a new instance of {@link SecretsmanagerSecretVersionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecretsmanagerSecretVersionConfig build() {
            return new Jsii$Proxy(secretId, secretBinary, secretString, versionStages, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SecretsmanagerSecretVersionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretsmanagerSecretVersionConfig {
        private final java.lang.String secretId;
        private final java.lang.String secretBinary;
        private final java.lang.String secretString;
        private final java.util.List<java.lang.String> versionStages;
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
            this.secretId = software.amazon.jsii.Kernel.get(this, "secretId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretBinary = software.amazon.jsii.Kernel.get(this, "secretBinary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretString = software.amazon.jsii.Kernel.get(this, "secretString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.versionStages = software.amazon.jsii.Kernel.get(this, "versionStages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String secretId, final java.lang.String secretBinary, final java.lang.String secretString, final java.util.List<java.lang.String> versionStages, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.secretId = java.util.Objects.requireNonNull(secretId, "secretId is required");
            this.secretBinary = secretBinary;
            this.secretString = secretString;
            this.versionStages = versionStages;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getSecretId() {
            return this.secretId;
        }

        @Override
        public final java.lang.String getSecretBinary() {
            return this.secretBinary;
        }

        @Override
        public final java.lang.String getSecretString() {
            return this.secretString;
        }

        @Override
        public final java.util.List<java.lang.String> getVersionStages() {
            return this.versionStages;
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

            data.set("secretId", om.valueToTree(this.getSecretId()));
            if (this.getSecretBinary() != null) {
                data.set("secretBinary", om.valueToTree(this.getSecretBinary()));
            }
            if (this.getSecretString() != null) {
                data.set("secretString", om.valueToTree(this.getSecretString()));
            }
            if (this.getVersionStages() != null) {
                data.set("versionStages", om.valueToTree(this.getVersionStages()));
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
            struct.set("fqn", om.valueToTree("aws.SecretsmanagerSecretVersionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretsmanagerSecretVersionConfig.Jsii$Proxy that = (SecretsmanagerSecretVersionConfig.Jsii$Proxy) o;

            if (!secretId.equals(that.secretId)) return false;
            if (this.secretBinary != null ? !this.secretBinary.equals(that.secretBinary) : that.secretBinary != null) return false;
            if (this.secretString != null ? !this.secretString.equals(that.secretString) : that.secretString != null) return false;
            if (this.versionStages != null ? !this.versionStages.equals(that.versionStages) : that.versionStages != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.secretId.hashCode();
            result = 31 * result + (this.secretBinary != null ? this.secretBinary.hashCode() : 0);
            result = 31 * result + (this.secretString != null ? this.secretString.hashCode() : 0);
            result = 31 * result + (this.versionStages != null ? this.versionStages.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
