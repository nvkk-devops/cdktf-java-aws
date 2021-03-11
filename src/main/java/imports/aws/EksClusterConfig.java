package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.532Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksClusterConfig")
@software.amazon.jsii.Jsii.Proxy(EksClusterConfig.Jsii$Proxy.class)
public interface EksClusterConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * vpc_config block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksClusterVpcConfig> getVpcConfig();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledClusterLogTypes() {
        return null;
    }

    /**
     * encryption_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EksClusterEncryptionConfig> getEncryptionConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.EksClusterTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EksClusterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksClusterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksClusterConfig> {
        private java.lang.String name;
        private java.lang.String roleArn;
        private java.util.List<imports.aws.EksClusterVpcConfig> vpcConfig;
        private java.util.List<java.lang.String> enabledClusterLogTypes;
        private java.util.List<imports.aws.EksClusterEncryptionConfig> encryptionConfig;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.EksClusterTimeouts timeouts;
        private java.lang.String version;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EksClusterConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getVpcConfig}
         * @param vpcConfig vpc_config block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder vpcConfig(java.util.List<? extends imports.aws.EksClusterVpcConfig> vpcConfig) {
            this.vpcConfig = (java.util.List<imports.aws.EksClusterVpcConfig>)vpcConfig;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getEnabledClusterLogTypes}
         * @param enabledClusterLogTypes the value to be set.
         * @return {@code this}
         */
        public Builder enabledClusterLogTypes(java.util.List<java.lang.String> enabledClusterLogTypes) {
            this.enabledClusterLogTypes = enabledClusterLogTypes;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getEncryptionConfig}
         * @param encryptionConfig encryption_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder encryptionConfig(java.util.List<? extends imports.aws.EksClusterEncryptionConfig> encryptionConfig) {
            this.encryptionConfig = (java.util.List<imports.aws.EksClusterEncryptionConfig>)encryptionConfig;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.EksClusterTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getVersion}
         * @param version the value to be set.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getDependsOn}
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
         * Sets the value of {@link EksClusterConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EksClusterConfig#getProvider}
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
         * @return a new instance of {@link EksClusterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksClusterConfig build() {
            return new Jsii$Proxy(name, roleArn, vpcConfig, enabledClusterLogTypes, encryptionConfig, tags, timeouts, version, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EksClusterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksClusterConfig {
        private final java.lang.String name;
        private final java.lang.String roleArn;
        private final java.util.List<imports.aws.EksClusterVpcConfig> vpcConfig;
        private final java.util.List<java.lang.String> enabledClusterLogTypes;
        private final java.util.List<imports.aws.EksClusterEncryptionConfig> encryptionConfig;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.EksClusterTimeouts timeouts;
        private final java.lang.String version;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcConfig = software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksClusterVpcConfig.class)));
            this.enabledClusterLogTypes = software.amazon.jsii.Kernel.get(this, "enabledClusterLogTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.encryptionConfig = software.amazon.jsii.Kernel.get(this, "encryptionConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksClusterEncryptionConfig.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.EksClusterTimeouts.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String roleArn, final java.util.List<? extends imports.aws.EksClusterVpcConfig> vpcConfig, final java.util.List<java.lang.String> enabledClusterLogTypes, final java.util.List<? extends imports.aws.EksClusterEncryptionConfig> encryptionConfig, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.EksClusterTimeouts timeouts, final java.lang.String version, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.vpcConfig = (java.util.List<imports.aws.EksClusterVpcConfig>)java.util.Objects.requireNonNull(vpcConfig, "vpcConfig is required");
            this.enabledClusterLogTypes = enabledClusterLogTypes;
            this.encryptionConfig = (java.util.List<imports.aws.EksClusterEncryptionConfig>)encryptionConfig;
            this.tags = tags;
            this.timeouts = timeouts;
            this.version = version;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.util.List<imports.aws.EksClusterVpcConfig> getVpcConfig() {
            return this.vpcConfig;
        }

        @Override
        public final java.util.List<java.lang.String> getEnabledClusterLogTypes() {
            return this.enabledClusterLogTypes;
        }

        @Override
        public final java.util.List<imports.aws.EksClusterEncryptionConfig> getEncryptionConfig() {
            return this.encryptionConfig;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.EksClusterTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("vpcConfig", om.valueToTree(this.getVpcConfig()));
            if (this.getEnabledClusterLogTypes() != null) {
                data.set("enabledClusterLogTypes", om.valueToTree(this.getEnabledClusterLogTypes()));
            }
            if (this.getEncryptionConfig() != null) {
                data.set("encryptionConfig", om.valueToTree(this.getEncryptionConfig()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
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
            struct.set("fqn", om.valueToTree("aws.EksClusterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksClusterConfig.Jsii$Proxy that = (EksClusterConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (!vpcConfig.equals(that.vpcConfig)) return false;
            if (this.enabledClusterLogTypes != null ? !this.enabledClusterLogTypes.equals(that.enabledClusterLogTypes) : that.enabledClusterLogTypes != null) return false;
            if (this.encryptionConfig != null ? !this.encryptionConfig.equals(that.encryptionConfig) : that.encryptionConfig != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.vpcConfig.hashCode());
            result = 31 * result + (this.enabledClusterLogTypes != null ? this.enabledClusterLogTypes.hashCode() : 0);
            result = 31 * result + (this.encryptionConfig != null ? this.encryptionConfig.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
