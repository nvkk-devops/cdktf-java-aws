package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.431Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DirectoryServiceDirectoryConfig")
@software.amazon.jsii.Jsii.Proxy(DirectoryServiceDirectoryConfig.Jsii$Proxy.class)
public interface DirectoryServiceDirectoryConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getPassword();

    default @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return null;
    }

    /**
     * connect_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DirectoryServiceDirectoryConnectSettings> getConnectSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEdition() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableSso() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getShortName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * vpc_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DirectoryServiceDirectoryVpcSettings> getVpcSettings() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DirectoryServiceDirectoryConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DirectoryServiceDirectoryConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DirectoryServiceDirectoryConfig> {
        private java.lang.String name;
        private java.lang.String password;
        private java.lang.String alias;
        private java.util.List<imports.aws.DirectoryServiceDirectoryConnectSettings> connectSettings;
        private java.lang.String description;
        private java.lang.String edition;
        private java.lang.Boolean enableSso;
        private java.lang.String shortName;
        private java.lang.String size;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String type;
        private java.util.List<imports.aws.DirectoryServiceDirectoryVpcSettings> vpcSettings;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getPassword}
         * @param password the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getAlias}
         * @param alias the value to be set.
         * @return {@code this}
         */
        public Builder alias(java.lang.String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getConnectSettings}
         * @param connectSettings connect_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder connectSettings(java.util.List<? extends imports.aws.DirectoryServiceDirectoryConnectSettings> connectSettings) {
            this.connectSettings = (java.util.List<imports.aws.DirectoryServiceDirectoryConnectSettings>)connectSettings;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getEdition}
         * @param edition the value to be set.
         * @return {@code this}
         */
        public Builder edition(java.lang.String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getEnableSso}
         * @param enableSso the value to be set.
         * @return {@code this}
         */
        public Builder enableSso(java.lang.Boolean enableSso) {
            this.enableSso = enableSso;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getShortName}
         * @param shortName the value to be set.
         * @return {@code this}
         */
        public Builder shortName(java.lang.String shortName) {
            this.shortName = shortName;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getSize}
         * @param size the value to be set.
         * @return {@code this}
         */
        public Builder size(java.lang.String size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getVpcSettings}
         * @param vpcSettings vpc_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder vpcSettings(java.util.List<? extends imports.aws.DirectoryServiceDirectoryVpcSettings> vpcSettings) {
            this.vpcSettings = (java.util.List<imports.aws.DirectoryServiceDirectoryVpcSettings>)vpcSettings;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getDependsOn}
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
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DirectoryServiceDirectoryConfig#getProvider}
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
         * @return a new instance of {@link DirectoryServiceDirectoryConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DirectoryServiceDirectoryConfig build() {
            return new Jsii$Proxy(name, password, alias, connectSettings, description, edition, enableSso, shortName, size, tags, type, vpcSettings, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DirectoryServiceDirectoryConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DirectoryServiceDirectoryConfig {
        private final java.lang.String name;
        private final java.lang.String password;
        private final java.lang.String alias;
        private final java.util.List<imports.aws.DirectoryServiceDirectoryConnectSettings> connectSettings;
        private final java.lang.String description;
        private final java.lang.String edition;
        private final java.lang.Boolean enableSso;
        private final java.lang.String shortName;
        private final java.lang.String size;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String type;
        private final java.util.List<imports.aws.DirectoryServiceDirectoryVpcSettings> vpcSettings;
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
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectSettings = software.amazon.jsii.Kernel.get(this, "connectSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DirectoryServiceDirectoryConnectSettings.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.edition = software.amazon.jsii.Kernel.get(this, "edition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableSso = software.amazon.jsii.Kernel.get(this, "enableSso", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.shortName = software.amazon.jsii.Kernel.get(this, "shortName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.size = software.amazon.jsii.Kernel.get(this, "size", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcSettings = software.amazon.jsii.Kernel.get(this, "vpcSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DirectoryServiceDirectoryVpcSettings.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String password, final java.lang.String alias, final java.util.List<? extends imports.aws.DirectoryServiceDirectoryConnectSettings> connectSettings, final java.lang.String description, final java.lang.String edition, final java.lang.Boolean enableSso, final java.lang.String shortName, final java.lang.String size, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String type, final java.util.List<? extends imports.aws.DirectoryServiceDirectoryVpcSettings> vpcSettings, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.password = java.util.Objects.requireNonNull(password, "password is required");
            this.alias = alias;
            this.connectSettings = (java.util.List<imports.aws.DirectoryServiceDirectoryConnectSettings>)connectSettings;
            this.description = description;
            this.edition = edition;
            this.enableSso = enableSso;
            this.shortName = shortName;
            this.size = size;
            this.tags = tags;
            this.type = type;
            this.vpcSettings = (java.util.List<imports.aws.DirectoryServiceDirectoryVpcSettings>)vpcSettings;
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
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.String getAlias() {
            return this.alias;
        }

        @Override
        public final java.util.List<imports.aws.DirectoryServiceDirectoryConnectSettings> getConnectSettings() {
            return this.connectSettings;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getEdition() {
            return this.edition;
        }

        @Override
        public final java.lang.Boolean getEnableSso() {
            return this.enableSso;
        }

        @Override
        public final java.lang.String getShortName() {
            return this.shortName;
        }

        @Override
        public final java.lang.String getSize() {
            return this.size;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.DirectoryServiceDirectoryVpcSettings> getVpcSettings() {
            return this.vpcSettings;
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
            data.set("password", om.valueToTree(this.getPassword()));
            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getConnectSettings() != null) {
                data.set("connectSettings", om.valueToTree(this.getConnectSettings()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEdition() != null) {
                data.set("edition", om.valueToTree(this.getEdition()));
            }
            if (this.getEnableSso() != null) {
                data.set("enableSso", om.valueToTree(this.getEnableSso()));
            }
            if (this.getShortName() != null) {
                data.set("shortName", om.valueToTree(this.getShortName()));
            }
            if (this.getSize() != null) {
                data.set("size", om.valueToTree(this.getSize()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getVpcSettings() != null) {
                data.set("vpcSettings", om.valueToTree(this.getVpcSettings()));
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
            struct.set("fqn", om.valueToTree("aws.DirectoryServiceDirectoryConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DirectoryServiceDirectoryConfig.Jsii$Proxy that = (DirectoryServiceDirectoryConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!password.equals(that.password)) return false;
            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.connectSettings != null ? !this.connectSettings.equals(that.connectSettings) : that.connectSettings != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.edition != null ? !this.edition.equals(that.edition) : that.edition != null) return false;
            if (this.enableSso != null ? !this.enableSso.equals(that.enableSso) : that.enableSso != null) return false;
            if (this.shortName != null ? !this.shortName.equals(that.shortName) : that.shortName != null) return false;
            if (this.size != null ? !this.size.equals(that.size) : that.size != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.vpcSettings != null ? !this.vpcSettings.equals(that.vpcSettings) : that.vpcSettings != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.password.hashCode());
            result = 31 * result + (this.alias != null ? this.alias.hashCode() : 0);
            result = 31 * result + (this.connectSettings != null ? this.connectSettings.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.edition != null ? this.edition.hashCode() : 0);
            result = 31 * result + (this.enableSso != null ? this.enableSso.hashCode() : 0);
            result = 31 * result + (this.shortName != null ? this.shortName.hashCode() : 0);
            result = 31 * result + (this.size != null ? this.size.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.vpcSettings != null ? this.vpcSettings.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
