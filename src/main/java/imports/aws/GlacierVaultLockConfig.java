package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.585Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlacierVaultLockConfig")
@software.amazon.jsii.Jsii.Proxy(GlacierVaultLockConfig.Jsii$Proxy.class)
public interface GlacierVaultLockConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getCompleteLock();

    @org.jetbrains.annotations.NotNull java.lang.String getPolicy();

    @org.jetbrains.annotations.NotNull java.lang.String getVaultName();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreDeletionError() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlacierVaultLockConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlacierVaultLockConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlacierVaultLockConfig> {
        private java.lang.Boolean completeLock;
        private java.lang.String policy;
        private java.lang.String vaultName;
        private java.lang.Boolean ignoreDeletionError;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GlacierVaultLockConfig#getCompleteLock}
         * @param completeLock the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder completeLock(java.lang.Boolean completeLock) {
            this.completeLock = completeLock;
            return this;
        }

        /**
         * Sets the value of {@link GlacierVaultLockConfig#getPolicy}
         * @param policy the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link GlacierVaultLockConfig#getVaultName}
         * @param vaultName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder vaultName(java.lang.String vaultName) {
            this.vaultName = vaultName;
            return this;
        }

        /**
         * Sets the value of {@link GlacierVaultLockConfig#getIgnoreDeletionError}
         * @param ignoreDeletionError the value to be set.
         * @return {@code this}
         */
        public Builder ignoreDeletionError(java.lang.Boolean ignoreDeletionError) {
            this.ignoreDeletionError = ignoreDeletionError;
            return this;
        }

        /**
         * Sets the value of {@link GlacierVaultLockConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GlacierVaultLockConfig#getDependsOn}
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
         * Sets the value of {@link GlacierVaultLockConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GlacierVaultLockConfig#getProvider}
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
         * @return a new instance of {@link GlacierVaultLockConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlacierVaultLockConfig build() {
            return new Jsii$Proxy(completeLock, policy, vaultName, ignoreDeletionError, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GlacierVaultLockConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlacierVaultLockConfig {
        private final java.lang.Boolean completeLock;
        private final java.lang.String policy;
        private final java.lang.String vaultName;
        private final java.lang.Boolean ignoreDeletionError;
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
            this.completeLock = software.amazon.jsii.Kernel.get(this, "completeLock", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vaultName = software.amazon.jsii.Kernel.get(this, "vaultName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ignoreDeletionError = software.amazon.jsii.Kernel.get(this, "ignoreDeletionError", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean completeLock, final java.lang.String policy, final java.lang.String vaultName, final java.lang.Boolean ignoreDeletionError, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.completeLock = java.util.Objects.requireNonNull(completeLock, "completeLock is required");
            this.policy = java.util.Objects.requireNonNull(policy, "policy is required");
            this.vaultName = java.util.Objects.requireNonNull(vaultName, "vaultName is required");
            this.ignoreDeletionError = ignoreDeletionError;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Boolean getCompleteLock() {
            return this.completeLock;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.String getVaultName() {
            return this.vaultName;
        }

        @Override
        public final java.lang.Boolean getIgnoreDeletionError() {
            return this.ignoreDeletionError;
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

            data.set("completeLock", om.valueToTree(this.getCompleteLock()));
            data.set("policy", om.valueToTree(this.getPolicy()));
            data.set("vaultName", om.valueToTree(this.getVaultName()));
            if (this.getIgnoreDeletionError() != null) {
                data.set("ignoreDeletionError", om.valueToTree(this.getIgnoreDeletionError()));
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
            struct.set("fqn", om.valueToTree("aws.GlacierVaultLockConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlacierVaultLockConfig.Jsii$Proxy that = (GlacierVaultLockConfig.Jsii$Proxy) o;

            if (!completeLock.equals(that.completeLock)) return false;
            if (!policy.equals(that.policy)) return false;
            if (!vaultName.equals(that.vaultName)) return false;
            if (this.ignoreDeletionError != null ? !this.ignoreDeletionError.equals(that.ignoreDeletionError) : that.ignoreDeletionError != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.completeLock.hashCode();
            result = 31 * result + (this.policy.hashCode());
            result = 31 * result + (this.vaultName.hashCode());
            result = 31 * result + (this.ignoreDeletionError != null ? this.ignoreDeletionError.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
