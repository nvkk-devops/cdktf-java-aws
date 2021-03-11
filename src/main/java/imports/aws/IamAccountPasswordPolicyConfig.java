package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.612Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IamAccountPasswordPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(IamAccountPasswordPolicyConfig.Jsii$Proxy.class)
public interface IamAccountPasswordPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowUsersToChangePassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHardExpiry() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxPasswordAge() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinimumPasswordLength() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPasswordReusePrevention() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireLowercaseCharacters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireNumbers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireSymbols() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireUppercaseCharacters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IamAccountPasswordPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IamAccountPasswordPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IamAccountPasswordPolicyConfig> {
        private java.lang.Boolean allowUsersToChangePassword;
        private java.lang.Boolean hardExpiry;
        private java.lang.Number maxPasswordAge;
        private java.lang.Number minimumPasswordLength;
        private java.lang.Number passwordReusePrevention;
        private java.lang.Boolean requireLowercaseCharacters;
        private java.lang.Boolean requireNumbers;
        private java.lang.Boolean requireSymbols;
        private java.lang.Boolean requireUppercaseCharacters;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getAllowUsersToChangePassword}
         * @param allowUsersToChangePassword the value to be set.
         * @return {@code this}
         */
        public Builder allowUsersToChangePassword(java.lang.Boolean allowUsersToChangePassword) {
            this.allowUsersToChangePassword = allowUsersToChangePassword;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getHardExpiry}
         * @param hardExpiry the value to be set.
         * @return {@code this}
         */
        public Builder hardExpiry(java.lang.Boolean hardExpiry) {
            this.hardExpiry = hardExpiry;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getMaxPasswordAge}
         * @param maxPasswordAge the value to be set.
         * @return {@code this}
         */
        public Builder maxPasswordAge(java.lang.Number maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getMinimumPasswordLength}
         * @param minimumPasswordLength the value to be set.
         * @return {@code this}
         */
        public Builder minimumPasswordLength(java.lang.Number minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getPasswordReusePrevention}
         * @param passwordReusePrevention the value to be set.
         * @return {@code this}
         */
        public Builder passwordReusePrevention(java.lang.Number passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getRequireLowercaseCharacters}
         * @param requireLowercaseCharacters the value to be set.
         * @return {@code this}
         */
        public Builder requireLowercaseCharacters(java.lang.Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getRequireNumbers}
         * @param requireNumbers the value to be set.
         * @return {@code this}
         */
        public Builder requireNumbers(java.lang.Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getRequireSymbols}
         * @param requireSymbols the value to be set.
         * @return {@code this}
         */
        public Builder requireSymbols(java.lang.Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getRequireUppercaseCharacters}
         * @param requireUppercaseCharacters the value to be set.
         * @return {@code this}
         */
        public Builder requireUppercaseCharacters(java.lang.Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getDependsOn}
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
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link IamAccountPasswordPolicyConfig#getProvider}
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
         * @return a new instance of {@link IamAccountPasswordPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IamAccountPasswordPolicyConfig build() {
            return new Jsii$Proxy(allowUsersToChangePassword, hardExpiry, maxPasswordAge, minimumPasswordLength, passwordReusePrevention, requireLowercaseCharacters, requireNumbers, requireSymbols, requireUppercaseCharacters, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link IamAccountPasswordPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IamAccountPasswordPolicyConfig {
        private final java.lang.Boolean allowUsersToChangePassword;
        private final java.lang.Boolean hardExpiry;
        private final java.lang.Number maxPasswordAge;
        private final java.lang.Number minimumPasswordLength;
        private final java.lang.Number passwordReusePrevention;
        private final java.lang.Boolean requireLowercaseCharacters;
        private final java.lang.Boolean requireNumbers;
        private final java.lang.Boolean requireSymbols;
        private final java.lang.Boolean requireUppercaseCharacters;
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
            this.allowUsersToChangePassword = software.amazon.jsii.Kernel.get(this, "allowUsersToChangePassword", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hardExpiry = software.amazon.jsii.Kernel.get(this, "hardExpiry", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.maxPasswordAge = software.amazon.jsii.Kernel.get(this, "maxPasswordAge", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minimumPasswordLength = software.amazon.jsii.Kernel.get(this, "minimumPasswordLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.passwordReusePrevention = software.amazon.jsii.Kernel.get(this, "passwordReusePrevention", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.requireLowercaseCharacters = software.amazon.jsii.Kernel.get(this, "requireLowercaseCharacters", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requireNumbers = software.amazon.jsii.Kernel.get(this, "requireNumbers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requireSymbols = software.amazon.jsii.Kernel.get(this, "requireSymbols", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requireUppercaseCharacters = software.amazon.jsii.Kernel.get(this, "requireUppercaseCharacters", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean allowUsersToChangePassword, final java.lang.Boolean hardExpiry, final java.lang.Number maxPasswordAge, final java.lang.Number minimumPasswordLength, final java.lang.Number passwordReusePrevention, final java.lang.Boolean requireLowercaseCharacters, final java.lang.Boolean requireNumbers, final java.lang.Boolean requireSymbols, final java.lang.Boolean requireUppercaseCharacters, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowUsersToChangePassword = allowUsersToChangePassword;
            this.hardExpiry = hardExpiry;
            this.maxPasswordAge = maxPasswordAge;
            this.minimumPasswordLength = minimumPasswordLength;
            this.passwordReusePrevention = passwordReusePrevention;
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            this.requireNumbers = requireNumbers;
            this.requireSymbols = requireSymbols;
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Boolean getAllowUsersToChangePassword() {
            return this.allowUsersToChangePassword;
        }

        @Override
        public final java.lang.Boolean getHardExpiry() {
            return this.hardExpiry;
        }

        @Override
        public final java.lang.Number getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        @Override
        public final java.lang.Number getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        @Override
        public final java.lang.Number getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        @Override
        public final java.lang.Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        @Override
        public final java.lang.Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        @Override
        public final java.lang.Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        @Override
        public final java.lang.Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
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

            if (this.getAllowUsersToChangePassword() != null) {
                data.set("allowUsersToChangePassword", om.valueToTree(this.getAllowUsersToChangePassword()));
            }
            if (this.getHardExpiry() != null) {
                data.set("hardExpiry", om.valueToTree(this.getHardExpiry()));
            }
            if (this.getMaxPasswordAge() != null) {
                data.set("maxPasswordAge", om.valueToTree(this.getMaxPasswordAge()));
            }
            if (this.getMinimumPasswordLength() != null) {
                data.set("minimumPasswordLength", om.valueToTree(this.getMinimumPasswordLength()));
            }
            if (this.getPasswordReusePrevention() != null) {
                data.set("passwordReusePrevention", om.valueToTree(this.getPasswordReusePrevention()));
            }
            if (this.getRequireLowercaseCharacters() != null) {
                data.set("requireLowercaseCharacters", om.valueToTree(this.getRequireLowercaseCharacters()));
            }
            if (this.getRequireNumbers() != null) {
                data.set("requireNumbers", om.valueToTree(this.getRequireNumbers()));
            }
            if (this.getRequireSymbols() != null) {
                data.set("requireSymbols", om.valueToTree(this.getRequireSymbols()));
            }
            if (this.getRequireUppercaseCharacters() != null) {
                data.set("requireUppercaseCharacters", om.valueToTree(this.getRequireUppercaseCharacters()));
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
            struct.set("fqn", om.valueToTree("aws.IamAccountPasswordPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IamAccountPasswordPolicyConfig.Jsii$Proxy that = (IamAccountPasswordPolicyConfig.Jsii$Proxy) o;

            if (this.allowUsersToChangePassword != null ? !this.allowUsersToChangePassword.equals(that.allowUsersToChangePassword) : that.allowUsersToChangePassword != null) return false;
            if (this.hardExpiry != null ? !this.hardExpiry.equals(that.hardExpiry) : that.hardExpiry != null) return false;
            if (this.maxPasswordAge != null ? !this.maxPasswordAge.equals(that.maxPasswordAge) : that.maxPasswordAge != null) return false;
            if (this.minimumPasswordLength != null ? !this.minimumPasswordLength.equals(that.minimumPasswordLength) : that.minimumPasswordLength != null) return false;
            if (this.passwordReusePrevention != null ? !this.passwordReusePrevention.equals(that.passwordReusePrevention) : that.passwordReusePrevention != null) return false;
            if (this.requireLowercaseCharacters != null ? !this.requireLowercaseCharacters.equals(that.requireLowercaseCharacters) : that.requireLowercaseCharacters != null) return false;
            if (this.requireNumbers != null ? !this.requireNumbers.equals(that.requireNumbers) : that.requireNumbers != null) return false;
            if (this.requireSymbols != null ? !this.requireSymbols.equals(that.requireSymbols) : that.requireSymbols != null) return false;
            if (this.requireUppercaseCharacters != null ? !this.requireUppercaseCharacters.equals(that.requireUppercaseCharacters) : that.requireUppercaseCharacters != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowUsersToChangePassword != null ? this.allowUsersToChangePassword.hashCode() : 0;
            result = 31 * result + (this.hardExpiry != null ? this.hardExpiry.hashCode() : 0);
            result = 31 * result + (this.maxPasswordAge != null ? this.maxPasswordAge.hashCode() : 0);
            result = 31 * result + (this.minimumPasswordLength != null ? this.minimumPasswordLength.hashCode() : 0);
            result = 31 * result + (this.passwordReusePrevention != null ? this.passwordReusePrevention.hashCode() : 0);
            result = 31 * result + (this.requireLowercaseCharacters != null ? this.requireLowercaseCharacters.hashCode() : 0);
            result = 31 * result + (this.requireNumbers != null ? this.requireNumbers.hashCode() : 0);
            result = 31 * result + (this.requireSymbols != null ? this.requireSymbols.hashCode() : 0);
            result = 31 * result + (this.requireUppercaseCharacters != null ? this.requireUppercaseCharacters.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
