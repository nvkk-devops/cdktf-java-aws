package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.544Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticBeanstalkEnvironmentConfig")
@software.amazon.jsii.Jsii.Proxy(ElasticBeanstalkEnvironmentConfig.Jsii$Proxy.class)
public interface ElasticBeanstalkEnvironmentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getApplication();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getCnamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlatformArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPollInterval() {
        return null;
    }

    /**
     * setting block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting> getSetting() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSolutionStackName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTemplateName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVersionLabel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWaitForReadyTimeout() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticBeanstalkEnvironmentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticBeanstalkEnvironmentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticBeanstalkEnvironmentConfig> {
        private java.lang.String application;
        private java.lang.String name;
        private java.lang.String cnamePrefix;
        private java.lang.String description;
        private java.lang.String platformArn;
        private java.lang.String pollInterval;
        private java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting> setting;
        private java.lang.String solutionStackName;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String templateName;
        private java.lang.String tier;
        private java.lang.String versionLabel;
        private java.lang.String waitForReadyTimeout;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getApplication}
         * @param application the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder application(java.lang.String application) {
            this.application = application;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getCnamePrefix}
         * @param cnamePrefix the value to be set.
         * @return {@code this}
         */
        public Builder cnamePrefix(java.lang.String cnamePrefix) {
            this.cnamePrefix = cnamePrefix;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getPlatformArn}
         * @param platformArn the value to be set.
         * @return {@code this}
         */
        public Builder platformArn(java.lang.String platformArn) {
            this.platformArn = platformArn;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getPollInterval}
         * @param pollInterval the value to be set.
         * @return {@code this}
         */
        public Builder pollInterval(java.lang.String pollInterval) {
            this.pollInterval = pollInterval;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getSetting}
         * @param setting setting block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder setting(java.util.List<? extends imports.aws.ElasticBeanstalkEnvironmentSetting> setting) {
            this.setting = (java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting>)setting;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getSolutionStackName}
         * @param solutionStackName the value to be set.
         * @return {@code this}
         */
        public Builder solutionStackName(java.lang.String solutionStackName) {
            this.solutionStackName = solutionStackName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getTemplateName}
         * @param templateName the value to be set.
         * @return {@code this}
         */
        public Builder templateName(java.lang.String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getTier}
         * @param tier the value to be set.
         * @return {@code this}
         */
        public Builder tier(java.lang.String tier) {
            this.tier = tier;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getVersionLabel}
         * @param versionLabel the value to be set.
         * @return {@code this}
         */
        public Builder versionLabel(java.lang.String versionLabel) {
            this.versionLabel = versionLabel;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getWaitForReadyTimeout}
         * @param waitForReadyTimeout the value to be set.
         * @return {@code this}
         */
        public Builder waitForReadyTimeout(java.lang.String waitForReadyTimeout) {
            this.waitForReadyTimeout = waitForReadyTimeout;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getDependsOn}
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
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ElasticBeanstalkEnvironmentConfig#getProvider}
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
         * @return a new instance of {@link ElasticBeanstalkEnvironmentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticBeanstalkEnvironmentConfig build() {
            return new Jsii$Proxy(application, name, cnamePrefix, description, platformArn, pollInterval, setting, solutionStackName, tags, templateName, tier, versionLabel, waitForReadyTimeout, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ElasticBeanstalkEnvironmentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticBeanstalkEnvironmentConfig {
        private final java.lang.String application;
        private final java.lang.String name;
        private final java.lang.String cnamePrefix;
        private final java.lang.String description;
        private final java.lang.String platformArn;
        private final java.lang.String pollInterval;
        private final java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting> setting;
        private final java.lang.String solutionStackName;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String templateName;
        private final java.lang.String tier;
        private final java.lang.String versionLabel;
        private final java.lang.String waitForReadyTimeout;
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
            this.cnamePrefix = software.amazon.jsii.Kernel.get(this, "cnamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.platformArn = software.amazon.jsii.Kernel.get(this, "platformArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pollInterval = software.amazon.jsii.Kernel.get(this, "pollInterval", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.setting = software.amazon.jsii.Kernel.get(this, "setting", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticBeanstalkEnvironmentSetting.class)));
            this.solutionStackName = software.amazon.jsii.Kernel.get(this, "solutionStackName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.templateName = software.amazon.jsii.Kernel.get(this, "templateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tier = software.amazon.jsii.Kernel.get(this, "tier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.versionLabel = software.amazon.jsii.Kernel.get(this, "versionLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.waitForReadyTimeout = software.amazon.jsii.Kernel.get(this, "waitForReadyTimeout", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String application, final java.lang.String name, final java.lang.String cnamePrefix, final java.lang.String description, final java.lang.String platformArn, final java.lang.String pollInterval, final java.util.List<? extends imports.aws.ElasticBeanstalkEnvironmentSetting> setting, final java.lang.String solutionStackName, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String templateName, final java.lang.String tier, final java.lang.String versionLabel, final java.lang.String waitForReadyTimeout, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.application = java.util.Objects.requireNonNull(application, "application is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.cnamePrefix = cnamePrefix;
            this.description = description;
            this.platformArn = platformArn;
            this.pollInterval = pollInterval;
            this.setting = (java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting>)setting;
            this.solutionStackName = solutionStackName;
            this.tags = tags;
            this.templateName = templateName;
            this.tier = tier;
            this.versionLabel = versionLabel;
            this.waitForReadyTimeout = waitForReadyTimeout;
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
        public final java.lang.String getCnamePrefix() {
            return this.cnamePrefix;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getPlatformArn() {
            return this.platformArn;
        }

        @Override
        public final java.lang.String getPollInterval() {
            return this.pollInterval;
        }

        @Override
        public final java.util.List<imports.aws.ElasticBeanstalkEnvironmentSetting> getSetting() {
            return this.setting;
        }

        @Override
        public final java.lang.String getSolutionStackName() {
            return this.solutionStackName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTemplateName() {
            return this.templateName;
        }

        @Override
        public final java.lang.String getTier() {
            return this.tier;
        }

        @Override
        public final java.lang.String getVersionLabel() {
            return this.versionLabel;
        }

        @Override
        public final java.lang.String getWaitForReadyTimeout() {
            return this.waitForReadyTimeout;
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
            if (this.getCnamePrefix() != null) {
                data.set("cnamePrefix", om.valueToTree(this.getCnamePrefix()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getPlatformArn() != null) {
                data.set("platformArn", om.valueToTree(this.getPlatformArn()));
            }
            if (this.getPollInterval() != null) {
                data.set("pollInterval", om.valueToTree(this.getPollInterval()));
            }
            if (this.getSetting() != null) {
                data.set("setting", om.valueToTree(this.getSetting()));
            }
            if (this.getSolutionStackName() != null) {
                data.set("solutionStackName", om.valueToTree(this.getSolutionStackName()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTemplateName() != null) {
                data.set("templateName", om.valueToTree(this.getTemplateName()));
            }
            if (this.getTier() != null) {
                data.set("tier", om.valueToTree(this.getTier()));
            }
            if (this.getVersionLabel() != null) {
                data.set("versionLabel", om.valueToTree(this.getVersionLabel()));
            }
            if (this.getWaitForReadyTimeout() != null) {
                data.set("waitForReadyTimeout", om.valueToTree(this.getWaitForReadyTimeout()));
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
            struct.set("fqn", om.valueToTree("aws.ElasticBeanstalkEnvironmentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticBeanstalkEnvironmentConfig.Jsii$Proxy that = (ElasticBeanstalkEnvironmentConfig.Jsii$Proxy) o;

            if (!application.equals(that.application)) return false;
            if (!name.equals(that.name)) return false;
            if (this.cnamePrefix != null ? !this.cnamePrefix.equals(that.cnamePrefix) : that.cnamePrefix != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.platformArn != null ? !this.platformArn.equals(that.platformArn) : that.platformArn != null) return false;
            if (this.pollInterval != null ? !this.pollInterval.equals(that.pollInterval) : that.pollInterval != null) return false;
            if (this.setting != null ? !this.setting.equals(that.setting) : that.setting != null) return false;
            if (this.solutionStackName != null ? !this.solutionStackName.equals(that.solutionStackName) : that.solutionStackName != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.templateName != null ? !this.templateName.equals(that.templateName) : that.templateName != null) return false;
            if (this.tier != null ? !this.tier.equals(that.tier) : that.tier != null) return false;
            if (this.versionLabel != null ? !this.versionLabel.equals(that.versionLabel) : that.versionLabel != null) return false;
            if (this.waitForReadyTimeout != null ? !this.waitForReadyTimeout.equals(that.waitForReadyTimeout) : that.waitForReadyTimeout != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.application.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.cnamePrefix != null ? this.cnamePrefix.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.platformArn != null ? this.platformArn.hashCode() : 0);
            result = 31 * result + (this.pollInterval != null ? this.pollInterval.hashCode() : 0);
            result = 31 * result + (this.setting != null ? this.setting.hashCode() : 0);
            result = 31 * result + (this.solutionStackName != null ? this.solutionStackName.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.templateName != null ? this.templateName.hashCode() : 0);
            result = 31 * result + (this.tier != null ? this.tier.hashCode() : 0);
            result = 31 * result + (this.versionLabel != null ? this.versionLabel.hashCode() : 0);
            result = 31 * result + (this.waitForReadyTimeout != null ? this.waitForReadyTimeout.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
