package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.704Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LicensemanagerLicenseConfigurationConfig")
@software.amazon.jsii.Jsii.Proxy(LicensemanagerLicenseConfigurationConfig.Jsii$Proxy.class)
public interface LicensemanagerLicenseConfigurationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getLicenseCountingType();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getLicenseCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getLicenseCountHardLimit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLicenseRules() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LicensemanagerLicenseConfigurationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LicensemanagerLicenseConfigurationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LicensemanagerLicenseConfigurationConfig> {
        private java.lang.String licenseCountingType;
        private java.lang.String name;
        private java.lang.String description;
        private java.lang.Number licenseCount;
        private java.lang.Boolean licenseCountHardLimit;
        private java.util.List<java.lang.String> licenseRules;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getLicenseCountingType}
         * @param licenseCountingType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder licenseCountingType(java.lang.String licenseCountingType) {
            this.licenseCountingType = licenseCountingType;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getLicenseCount}
         * @param licenseCount the value to be set.
         * @return {@code this}
         */
        public Builder licenseCount(java.lang.Number licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getLicenseCountHardLimit}
         * @param licenseCountHardLimit the value to be set.
         * @return {@code this}
         */
        public Builder licenseCountHardLimit(java.lang.Boolean licenseCountHardLimit) {
            this.licenseCountHardLimit = licenseCountHardLimit;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getLicenseRules}
         * @param licenseRules the value to be set.
         * @return {@code this}
         */
        public Builder licenseRules(java.util.List<java.lang.String> licenseRules) {
            this.licenseRules = licenseRules;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getDependsOn}
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
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LicensemanagerLicenseConfigurationConfig#getProvider}
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
         * @return a new instance of {@link LicensemanagerLicenseConfigurationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LicensemanagerLicenseConfigurationConfig build() {
            return new Jsii$Proxy(licenseCountingType, name, description, licenseCount, licenseCountHardLimit, licenseRules, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LicensemanagerLicenseConfigurationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LicensemanagerLicenseConfigurationConfig {
        private final java.lang.String licenseCountingType;
        private final java.lang.String name;
        private final java.lang.String description;
        private final java.lang.Number licenseCount;
        private final java.lang.Boolean licenseCountHardLimit;
        private final java.util.List<java.lang.String> licenseRules;
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
            this.licenseCountingType = software.amazon.jsii.Kernel.get(this, "licenseCountingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.licenseCount = software.amazon.jsii.Kernel.get(this, "licenseCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.licenseCountHardLimit = software.amazon.jsii.Kernel.get(this, "licenseCountHardLimit", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.licenseRules = software.amazon.jsii.Kernel.get(this, "licenseRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
        protected Jsii$Proxy(final java.lang.String licenseCountingType, final java.lang.String name, final java.lang.String description, final java.lang.Number licenseCount, final java.lang.Boolean licenseCountHardLimit, final java.util.List<java.lang.String> licenseRules, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.licenseCountingType = java.util.Objects.requireNonNull(licenseCountingType, "licenseCountingType is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.description = description;
            this.licenseCount = licenseCount;
            this.licenseCountHardLimit = licenseCountHardLimit;
            this.licenseRules = licenseRules;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getLicenseCountingType() {
            return this.licenseCountingType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Number getLicenseCount() {
            return this.licenseCount;
        }

        @Override
        public final java.lang.Boolean getLicenseCountHardLimit() {
            return this.licenseCountHardLimit;
        }

        @Override
        public final java.util.List<java.lang.String> getLicenseRules() {
            return this.licenseRules;
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

            data.set("licenseCountingType", om.valueToTree(this.getLicenseCountingType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getLicenseCount() != null) {
                data.set("licenseCount", om.valueToTree(this.getLicenseCount()));
            }
            if (this.getLicenseCountHardLimit() != null) {
                data.set("licenseCountHardLimit", om.valueToTree(this.getLicenseCountHardLimit()));
            }
            if (this.getLicenseRules() != null) {
                data.set("licenseRules", om.valueToTree(this.getLicenseRules()));
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
            struct.set("fqn", om.valueToTree("aws.LicensemanagerLicenseConfigurationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LicensemanagerLicenseConfigurationConfig.Jsii$Proxy that = (LicensemanagerLicenseConfigurationConfig.Jsii$Proxy) o;

            if (!licenseCountingType.equals(that.licenseCountingType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.licenseCount != null ? !this.licenseCount.equals(that.licenseCount) : that.licenseCount != null) return false;
            if (this.licenseCountHardLimit != null ? !this.licenseCountHardLimit.equals(that.licenseCountHardLimit) : that.licenseCountHardLimit != null) return false;
            if (this.licenseRules != null ? !this.licenseRules.equals(that.licenseRules) : that.licenseRules != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.licenseCountingType.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.licenseCount != null ? this.licenseCount.hashCode() : 0);
            result = 31 * result + (this.licenseCountHardLimit != null ? this.licenseCountHardLimit.hashCode() : 0);
            result = 31 * result + (this.licenseRules != null ? this.licenseRules.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
