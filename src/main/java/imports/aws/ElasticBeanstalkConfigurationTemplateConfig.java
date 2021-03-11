package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.543Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticBeanstalkConfigurationTemplateConfig")
@software.amazon.jsii.Jsii.Proxy(ElasticBeanstalkConfigurationTemplateConfig.Jsii$Proxy.class)
public interface ElasticBeanstalkConfigurationTemplateConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApplication();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEnvironmentId() {
        return null;
    }

    /**
     * setting block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticBeanstalkConfigurationTemplateSetting> getSetting() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSolutionStackName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticBeanstalkConfigurationTemplateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticBeanstalkConfigurationTemplateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticBeanstalkConfigurationTemplateConfig> {
        private java.lang.String application;
        private java.lang.String name;
        private java.lang.String description;
        private java.lang.String environmentId;
        private java.util.List<imports.aws.ElasticBeanstalkConfigurationTemplateSetting> setting;
        private java.lang.String solutionStackName;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getApplication}
         * @param application the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder application(java.lang.String application) {
            this.application = application;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getEnvironmentId}
         * @param environmentId the value to be set.
         * @return {@code this}
         */
        public Builder environmentId(java.lang.String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getSetting}
         * @param setting setting block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder setting(java.util.List<? extends imports.aws.ElasticBeanstalkConfigurationTemplateSetting> setting) {
            this.setting = (java.util.List<imports.aws.ElasticBeanstalkConfigurationTemplateSetting>)setting;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getSolutionStackName}
         * @param solutionStackName the value to be set.
         * @return {@code this}
         */
        public Builder solutionStackName(java.lang.String solutionStackName) {
            this.solutionStackName = solutionStackName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getDependsOn}
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
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkConfigurationTemplateConfig#getProvider}
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
         * @return a new instance of {@link ElasticBeanstalkConfigurationTemplateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticBeanstalkConfigurationTemplateConfig build() {
            return new Jsii$Proxy(application, name, description, environmentId, setting, solutionStackName, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ElasticBeanstalkConfigurationTemplateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticBeanstalkConfigurationTemplateConfig {
        private final java.lang.String application;
        private final java.lang.String name;
        private final java.lang.String description;
        private final java.lang.String environmentId;
        private final java.util.List<imports.aws.ElasticBeanstalkConfigurationTemplateSetting> setting;
        private final java.lang.String solutionStackName;
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
            this.application = software.amazon.jsii.Kernel.get(this, "application", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.environmentId = software.amazon.jsii.Kernel.get(this, "environmentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.setting = software.amazon.jsii.Kernel.get(this, "setting", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticBeanstalkConfigurationTemplateSetting.class)));
            this.solutionStackName = software.amazon.jsii.Kernel.get(this, "solutionStackName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String application, final java.lang.String name, final java.lang.String description, final java.lang.String environmentId, final java.util.List<? extends imports.aws.ElasticBeanstalkConfigurationTemplateSetting> setting, final java.lang.String solutionStackName, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.application = java.util.Objects.requireNonNull(application, "application is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.description = description;
            this.environmentId = environmentId;
            this.setting = (java.util.List<imports.aws.ElasticBeanstalkConfigurationTemplateSetting>)setting;
            this.solutionStackName = solutionStackName;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getApplication() {
            return this.application;
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
        public final java.lang.String getEnvironmentId() {
            return this.environmentId;
        }

        @Override
        public final java.util.List<imports.aws.ElasticBeanstalkConfigurationTemplateSetting> getSetting() {
            return this.setting;
        }

        @Override
        public final java.lang.String getSolutionStackName() {
            return this.solutionStackName;
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

            data.set("application", om.valueToTree(this.getApplication()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEnvironmentId() != null) {
                data.set("environmentId", om.valueToTree(this.getEnvironmentId()));
            }
            if (this.getSetting() != null) {
                data.set("setting", om.valueToTree(this.getSetting()));
            }
            if (this.getSolutionStackName() != null) {
                data.set("solutionStackName", om.valueToTree(this.getSolutionStackName()));
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
            struct.set("fqn", om.valueToTree("aws.ElasticBeanstalkConfigurationTemplateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticBeanstalkConfigurationTemplateConfig.Jsii$Proxy that = (ElasticBeanstalkConfigurationTemplateConfig.Jsii$Proxy) o;

            if (!application.equals(that.application)) return false;
            if (!name.equals(that.name)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.environmentId != null ? !this.environmentId.equals(that.environmentId) : that.environmentId != null) return false;
            if (this.setting != null ? !this.setting.equals(that.setting) : that.setting != null) return false;
            if (this.solutionStackName != null ? !this.solutionStackName.equals(that.solutionStackName) : that.solutionStackName != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.application.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.environmentId != null ? this.environmentId.hashCode() : 0);
            result = 31 * result + (this.setting != null ? this.setting.hashCode() : 0);
            result = 31 * result + (this.solutionStackName != null ? this.solutionStackName.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
