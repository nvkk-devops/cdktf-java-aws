package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.620Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IamUserLoginProfileConfig")
@software.amazon.jsii.Jsii.Proxy(IamUserLoginProfileConfig.Jsii$Proxy.class)
public interface IamUserLoginProfileConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getPgpKey();

    @org.jetbrains.annotations.NotNull java.lang.String getUser();

    default @org.jetbrains.annotations.Nullable java.lang.Number getPasswordLength() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPasswordResetRequired() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IamUserLoginProfileConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IamUserLoginProfileConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IamUserLoginProfileConfig> {
        private java.lang.String pgpKey;
        private java.lang.String user;
        private java.lang.Number passwordLength;
        private java.lang.Boolean passwordResetRequired;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link IamUserLoginProfileConfig#getPgpKey}
         * @param pgpKey the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder pgpKey(java.lang.String pgpKey) {
            this.pgpKey = pgpKey;
            return this;
        }

        /**
         * Sets the value of {@link IamUserLoginProfileConfig#getUser}
         * @param user the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Sets the value of {@link IamUserLoginProfileConfig#getPasswordLength}
         * @param passwordLength the value to be set.
         * @return {@code this}
         */
        public Builder passwordLength(java.lang.Number passwordLength) {
            this.passwordLength = passwordLength;
            return this;
        }

        /**
         * Sets the value of {@link IamUserLoginProfileConfig#getPasswordResetRequired}
         * @param passwordResetRequired the value to be set.
         * @return {@code this}
         */
        public Builder passwordResetRequired(java.lang.Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }

        /**
         * Sets the value of {@link IamUserLoginProfileConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link IamUserLoginProfileConfig#getDependsOn}
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
         * Sets the value of {@link IamUserLoginProfileConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link IamUserLoginProfileConfig#getProvider}
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
         * @return a new instance of {@link IamUserLoginProfileConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IamUserLoginProfileConfig build() {
            return new Jsii$Proxy(pgpKey, user, passwordLength, passwordResetRequired, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link IamUserLoginProfileConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IamUserLoginProfileConfig {
        private final java.lang.String pgpKey;
        private final java.lang.String user;
        private final java.lang.Number passwordLength;
        private final java.lang.Boolean passwordResetRequired;
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
            this.pgpKey = software.amazon.jsii.Kernel.get(this, "pgpKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.passwordLength = software.amazon.jsii.Kernel.get(this, "passwordLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.passwordResetRequired = software.amazon.jsii.Kernel.get(this, "passwordResetRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String pgpKey, final java.lang.String user, final java.lang.Number passwordLength, final java.lang.Boolean passwordResetRequired, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pgpKey = java.util.Objects.requireNonNull(pgpKey, "pgpKey is required");
            this.user = java.util.Objects.requireNonNull(user, "user is required");
            this.passwordLength = passwordLength;
            this.passwordResetRequired = passwordResetRequired;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getPgpKey() {
            return this.pgpKey;
        }

        @Override
        public final java.lang.String getUser() {
            return this.user;
        }

        @Override
        public final java.lang.Number getPasswordLength() {
            return this.passwordLength;
        }

        @Override
        public final java.lang.Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
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

            data.set("pgpKey", om.valueToTree(this.getPgpKey()));
            data.set("user", om.valueToTree(this.getUser()));
            if (this.getPasswordLength() != null) {
                data.set("passwordLength", om.valueToTree(this.getPasswordLength()));
            }
            if (this.getPasswordResetRequired() != null) {
                data.set("passwordResetRequired", om.valueToTree(this.getPasswordResetRequired()));
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
            struct.set("fqn", om.valueToTree("aws.IamUserLoginProfileConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IamUserLoginProfileConfig.Jsii$Proxy that = (IamUserLoginProfileConfig.Jsii$Proxy) o;

            if (!pgpKey.equals(that.pgpKey)) return false;
            if (!user.equals(that.user)) return false;
            if (this.passwordLength != null ? !this.passwordLength.equals(that.passwordLength) : that.passwordLength != null) return false;
            if (this.passwordResetRequired != null ? !this.passwordResetRequired.equals(that.passwordResetRequired) : that.passwordResetRequired != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pgpKey.hashCode();
            result = 31 * result + (this.user.hashCode());
            result = 31 * result + (this.passwordLength != null ? this.passwordLength.hashCode() : 0);
            result = 31 * result + (this.passwordResetRequired != null ? this.passwordResetRequired.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
