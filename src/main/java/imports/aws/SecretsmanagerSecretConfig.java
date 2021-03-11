package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.842Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SecretsmanagerSecretConfig")
@software.amazon.jsii.Jsii.Proxy(SecretsmanagerSecretConfig.Jsii$Proxy.class)
public interface SecretsmanagerSecretConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRecoveryWindowInDays() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRotationLambdaArn() {
        return null;
    }

    /**
     * rotation_rules block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SecretsmanagerSecretRotationRules> getRotationRules() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretsmanagerSecretConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretsmanagerSecretConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecretsmanagerSecretConfig> {
        private java.lang.String description;
        private java.lang.String kmsKeyId;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.lang.String policy;
        private java.lang.Number recoveryWindowInDays;
        private java.lang.String rotationLambdaArn;
        private java.util.List<imports.aws.SecretsmanagerSecretRotationRules> rotationRules;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getPolicy}
         * @param policy the value to be set.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getRecoveryWindowInDays}
         * @param recoveryWindowInDays the value to be set.
         * @return {@code this}
         */
        public Builder recoveryWindowInDays(java.lang.Number recoveryWindowInDays) {
            this.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getRotationLambdaArn}
         * @param rotationLambdaArn the value to be set.
         * @return {@code this}
         */
        public Builder rotationLambdaArn(java.lang.String rotationLambdaArn) {
            this.rotationLambdaArn = rotationLambdaArn;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getRotationRules}
         * @param rotationRules rotation_rules block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rotationRules(java.util.List<? extends imports.aws.SecretsmanagerSecretRotationRules> rotationRules) {
            this.rotationRules = (java.util.List<imports.aws.SecretsmanagerSecretRotationRules>)rotationRules;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getDependsOn}
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
         * Sets the value of {@link SecretsmanagerSecretConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerSecretConfig#getProvider}
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
         * @return a new instance of {@link SecretsmanagerSecretConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecretsmanagerSecretConfig build() {
            return new Jsii$Proxy(description, kmsKeyId, name, namePrefix, policy, recoveryWindowInDays, rotationLambdaArn, rotationRules, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SecretsmanagerSecretConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretsmanagerSecretConfig {
        private final java.lang.String description;
        private final java.lang.String kmsKeyId;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.String policy;
        private final java.lang.Number recoveryWindowInDays;
        private final java.lang.String rotationLambdaArn;
        private final java.util.List<imports.aws.SecretsmanagerSecretRotationRules> rotationRules;
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
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.recoveryWindowInDays = software.amazon.jsii.Kernel.get(this, "recoveryWindowInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.rotationLambdaArn = software.amazon.jsii.Kernel.get(this, "rotationLambdaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rotationRules = software.amazon.jsii.Kernel.get(this, "rotationRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SecretsmanagerSecretRotationRules.class)));
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
        protected Jsii$Proxy(final java.lang.String description, final java.lang.String kmsKeyId, final java.lang.String name, final java.lang.String namePrefix, final java.lang.String policy, final java.lang.Number recoveryWindowInDays, final java.lang.String rotationLambdaArn, final java.util.List<? extends imports.aws.SecretsmanagerSecretRotationRules> rotationRules, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.description = description;
            this.kmsKeyId = kmsKeyId;
            this.name = name;
            this.namePrefix = namePrefix;
            this.policy = policy;
            this.recoveryWindowInDays = recoveryWindowInDays;
            this.rotationLambdaArn = rotationLambdaArn;
            this.rotationRules = (java.util.List<imports.aws.SecretsmanagerSecretRotationRules>)rotationRules;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.Number getRecoveryWindowInDays() {
            return this.recoveryWindowInDays;
        }

        @Override
        public final java.lang.String getRotationLambdaArn() {
            return this.rotationLambdaArn;
        }

        @Override
        public final java.util.List<imports.aws.SecretsmanagerSecretRotationRules> getRotationRules() {
            return this.rotationRules;
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

            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getRecoveryWindowInDays() != null) {
                data.set("recoveryWindowInDays", om.valueToTree(this.getRecoveryWindowInDays()));
            }
            if (this.getRotationLambdaArn() != null) {
                data.set("rotationLambdaArn", om.valueToTree(this.getRotationLambdaArn()));
            }
            if (this.getRotationRules() != null) {
                data.set("rotationRules", om.valueToTree(this.getRotationRules()));
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
            struct.set("fqn", om.valueToTree("aws.SecretsmanagerSecretConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretsmanagerSecretConfig.Jsii$Proxy that = (SecretsmanagerSecretConfig.Jsii$Proxy) o;

            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.recoveryWindowInDays != null ? !this.recoveryWindowInDays.equals(that.recoveryWindowInDays) : that.recoveryWindowInDays != null) return false;
            if (this.rotationLambdaArn != null ? !this.rotationLambdaArn.equals(that.rotationLambdaArn) : that.rotationLambdaArn != null) return false;
            if (this.rotationRules != null ? !this.rotationRules.equals(that.rotationRules) : that.rotationRules != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.description != null ? this.description.hashCode() : 0;
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.recoveryWindowInDays != null ? this.recoveryWindowInDays.hashCode() : 0);
            result = 31 * result + (this.rotationLambdaArn != null ? this.rotationLambdaArn.hashCode() : 0);
            result = 31 * result + (this.rotationRules != null ? this.rotationRules.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
