package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.734Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksApplicationConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksApplicationConfig.Jsii$Proxy.class)
public interface OpsworksApplicationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getStackId();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * app_source block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksApplicationAppSource> getAppSource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAutoBundleOnDeploy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAwsFlowRubySettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDataSourceArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDataSourceDatabaseName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDataSourceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDocumentRoot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDomains() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableSsl() {
        return null;
    }

    /**
     * environment block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksApplicationEnvironment> getEnvironment() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRailsEnv() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getShortName() {
        return null;
    }

    /**
     * ssl_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.OpsworksApplicationSslConfiguration> getSslConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksApplicationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksApplicationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksApplicationConfig> {
        private java.lang.String name;
        private java.lang.String stackId;
        private java.lang.String type;
        private java.util.List<imports.aws.OpsworksApplicationAppSource> appSource;
        private java.lang.String autoBundleOnDeploy;
        private java.lang.String awsFlowRubySettings;
        private java.lang.String dataSourceArn;
        private java.lang.String dataSourceDatabaseName;
        private java.lang.String dataSourceType;
        private java.lang.String description;
        private java.lang.String documentRoot;
        private java.util.List<java.lang.String> domains;
        private java.lang.Boolean enableSsl;
        private java.util.List<imports.aws.OpsworksApplicationEnvironment> environment;
        private java.lang.String railsEnv;
        private java.lang.String shortName;
        private java.util.List<imports.aws.OpsworksApplicationSslConfiguration> sslConfiguration;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getStackId}
         * @param stackId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stackId(java.lang.String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getAppSource}
         * @param appSource app_source block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder appSource(java.util.List<? extends imports.aws.OpsworksApplicationAppSource> appSource) {
            this.appSource = (java.util.List<imports.aws.OpsworksApplicationAppSource>)appSource;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getAutoBundleOnDeploy}
         * @param autoBundleOnDeploy the value to be set.
         * @return {@code this}
         */
        public Builder autoBundleOnDeploy(java.lang.String autoBundleOnDeploy) {
            this.autoBundleOnDeploy = autoBundleOnDeploy;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getAwsFlowRubySettings}
         * @param awsFlowRubySettings the value to be set.
         * @return {@code this}
         */
        public Builder awsFlowRubySettings(java.lang.String awsFlowRubySettings) {
            this.awsFlowRubySettings = awsFlowRubySettings;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getDataSourceArn}
         * @param dataSourceArn the value to be set.
         * @return {@code this}
         */
        public Builder dataSourceArn(java.lang.String dataSourceArn) {
            this.dataSourceArn = dataSourceArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getDataSourceDatabaseName}
         * @param dataSourceDatabaseName the value to be set.
         * @return {@code this}
         */
        public Builder dataSourceDatabaseName(java.lang.String dataSourceDatabaseName) {
            this.dataSourceDatabaseName = dataSourceDatabaseName;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getDataSourceType}
         * @param dataSourceType the value to be set.
         * @return {@code this}
         */
        public Builder dataSourceType(java.lang.String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getDocumentRoot}
         * @param documentRoot the value to be set.
         * @return {@code this}
         */
        public Builder documentRoot(java.lang.String documentRoot) {
            this.documentRoot = documentRoot;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getDomains}
         * @param domains the value to be set.
         * @return {@code this}
         */
        public Builder domains(java.util.List<java.lang.String> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getEnableSsl}
         * @param enableSsl the value to be set.
         * @return {@code this}
         */
        public Builder enableSsl(java.lang.Boolean enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getEnvironment}
         * @param environment environment block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder environment(java.util.List<? extends imports.aws.OpsworksApplicationEnvironment> environment) {
            this.environment = (java.util.List<imports.aws.OpsworksApplicationEnvironment>)environment;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getRailsEnv}
         * @param railsEnv the value to be set.
         * @return {@code this}
         */
        public Builder railsEnv(java.lang.String railsEnv) {
            this.railsEnv = railsEnv;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getShortName}
         * @param shortName the value to be set.
         * @return {@code this}
         */
        public Builder shortName(java.lang.String shortName) {
            this.shortName = shortName;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getSslConfiguration}
         * @param sslConfiguration ssl_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sslConfiguration(java.util.List<? extends imports.aws.OpsworksApplicationSslConfiguration> sslConfiguration) {
            this.sslConfiguration = (java.util.List<imports.aws.OpsworksApplicationSslConfiguration>)sslConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksApplicationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksApplicationConfig#getProvider}
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
         * @return a new instance of {@link OpsworksApplicationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksApplicationConfig build() {
            return new Jsii$Proxy(name, stackId, type, appSource, autoBundleOnDeploy, awsFlowRubySettings, dataSourceArn, dataSourceDatabaseName, dataSourceType, description, documentRoot, domains, enableSsl, environment, railsEnv, shortName, sslConfiguration, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OpsworksApplicationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksApplicationConfig {
        private final java.lang.String name;
        private final java.lang.String stackId;
        private final java.lang.String type;
        private final java.util.List<imports.aws.OpsworksApplicationAppSource> appSource;
        private final java.lang.String autoBundleOnDeploy;
        private final java.lang.String awsFlowRubySettings;
        private final java.lang.String dataSourceArn;
        private final java.lang.String dataSourceDatabaseName;
        private final java.lang.String dataSourceType;
        private final java.lang.String description;
        private final java.lang.String documentRoot;
        private final java.util.List<java.lang.String> domains;
        private final java.lang.Boolean enableSsl;
        private final java.util.List<imports.aws.OpsworksApplicationEnvironment> environment;
        private final java.lang.String railsEnv;
        private final java.lang.String shortName;
        private final java.util.List<imports.aws.OpsworksApplicationSslConfiguration> sslConfiguration;
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
            this.stackId = software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.appSource = software.amazon.jsii.Kernel.get(this, "appSource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationAppSource.class)));
            this.autoBundleOnDeploy = software.amazon.jsii.Kernel.get(this, "autoBundleOnDeploy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.awsFlowRubySettings = software.amazon.jsii.Kernel.get(this, "awsFlowRubySettings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataSourceArn = software.amazon.jsii.Kernel.get(this, "dataSourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataSourceDatabaseName = software.amazon.jsii.Kernel.get(this, "dataSourceDatabaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataSourceType = software.amazon.jsii.Kernel.get(this, "dataSourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.documentRoot = software.amazon.jsii.Kernel.get(this, "documentRoot", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.domains = software.amazon.jsii.Kernel.get(this, "domains", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.enableSsl = software.amazon.jsii.Kernel.get(this, "enableSsl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.environment = software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationEnvironment.class)));
            this.railsEnv = software.amazon.jsii.Kernel.get(this, "railsEnv", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.shortName = software.amazon.jsii.Kernel.get(this, "shortName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sslConfiguration = software.amazon.jsii.Kernel.get(this, "sslConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.OpsworksApplicationSslConfiguration.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String stackId, final java.lang.String type, final java.util.List<? extends imports.aws.OpsworksApplicationAppSource> appSource, final java.lang.String autoBundleOnDeploy, final java.lang.String awsFlowRubySettings, final java.lang.String dataSourceArn, final java.lang.String dataSourceDatabaseName, final java.lang.String dataSourceType, final java.lang.String description, final java.lang.String documentRoot, final java.util.List<java.lang.String> domains, final java.lang.Boolean enableSsl, final java.util.List<? extends imports.aws.OpsworksApplicationEnvironment> environment, final java.lang.String railsEnv, final java.lang.String shortName, final java.util.List<? extends imports.aws.OpsworksApplicationSslConfiguration> sslConfiguration, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.stackId = java.util.Objects.requireNonNull(stackId, "stackId is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.appSource = (java.util.List<imports.aws.OpsworksApplicationAppSource>)appSource;
            this.autoBundleOnDeploy = autoBundleOnDeploy;
            this.awsFlowRubySettings = awsFlowRubySettings;
            this.dataSourceArn = dataSourceArn;
            this.dataSourceDatabaseName = dataSourceDatabaseName;
            this.dataSourceType = dataSourceType;
            this.description = description;
            this.documentRoot = documentRoot;
            this.domains = domains;
            this.enableSsl = enableSsl;
            this.environment = (java.util.List<imports.aws.OpsworksApplicationEnvironment>)environment;
            this.railsEnv = railsEnv;
            this.shortName = shortName;
            this.sslConfiguration = (java.util.List<imports.aws.OpsworksApplicationSslConfiguration>)sslConfiguration;
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
        public final java.lang.String getStackId() {
            return this.stackId;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksApplicationAppSource> getAppSource() {
            return this.appSource;
        }

        @Override
        public final java.lang.String getAutoBundleOnDeploy() {
            return this.autoBundleOnDeploy;
        }

        @Override
        public final java.lang.String getAwsFlowRubySettings() {
            return this.awsFlowRubySettings;
        }

        @Override
        public final java.lang.String getDataSourceArn() {
            return this.dataSourceArn;
        }

        @Override
        public final java.lang.String getDataSourceDatabaseName() {
            return this.dataSourceDatabaseName;
        }

        @Override
        public final java.lang.String getDataSourceType() {
            return this.dataSourceType;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getDocumentRoot() {
            return this.documentRoot;
        }

        @Override
        public final java.util.List<java.lang.String> getDomains() {
            return this.domains;
        }

        @Override
        public final java.lang.Boolean getEnableSsl() {
            return this.enableSsl;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksApplicationEnvironment> getEnvironment() {
            return this.environment;
        }

        @Override
        public final java.lang.String getRailsEnv() {
            return this.railsEnv;
        }

        @Override
        public final java.lang.String getShortName() {
            return this.shortName;
        }

        @Override
        public final java.util.List<imports.aws.OpsworksApplicationSslConfiguration> getSslConfiguration() {
            return this.sslConfiguration;
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
            data.set("stackId", om.valueToTree(this.getStackId()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getAppSource() != null) {
                data.set("appSource", om.valueToTree(this.getAppSource()));
            }
            if (this.getAutoBundleOnDeploy() != null) {
                data.set("autoBundleOnDeploy", om.valueToTree(this.getAutoBundleOnDeploy()));
            }
            if (this.getAwsFlowRubySettings() != null) {
                data.set("awsFlowRubySettings", om.valueToTree(this.getAwsFlowRubySettings()));
            }
            if (this.getDataSourceArn() != null) {
                data.set("dataSourceArn", om.valueToTree(this.getDataSourceArn()));
            }
            if (this.getDataSourceDatabaseName() != null) {
                data.set("dataSourceDatabaseName", om.valueToTree(this.getDataSourceDatabaseName()));
            }
            if (this.getDataSourceType() != null) {
                data.set("dataSourceType", om.valueToTree(this.getDataSourceType()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDocumentRoot() != null) {
                data.set("documentRoot", om.valueToTree(this.getDocumentRoot()));
            }
            if (this.getDomains() != null) {
                data.set("domains", om.valueToTree(this.getDomains()));
            }
            if (this.getEnableSsl() != null) {
                data.set("enableSsl", om.valueToTree(this.getEnableSsl()));
            }
            if (this.getEnvironment() != null) {
                data.set("environment", om.valueToTree(this.getEnvironment()));
            }
            if (this.getRailsEnv() != null) {
                data.set("railsEnv", om.valueToTree(this.getRailsEnv()));
            }
            if (this.getShortName() != null) {
                data.set("shortName", om.valueToTree(this.getShortName()));
            }
            if (this.getSslConfiguration() != null) {
                data.set("sslConfiguration", om.valueToTree(this.getSslConfiguration()));
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
            struct.set("fqn", om.valueToTree("aws.OpsworksApplicationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksApplicationConfig.Jsii$Proxy that = (OpsworksApplicationConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!stackId.equals(that.stackId)) return false;
            if (!type.equals(that.type)) return false;
            if (this.appSource != null ? !this.appSource.equals(that.appSource) : that.appSource != null) return false;
            if (this.autoBundleOnDeploy != null ? !this.autoBundleOnDeploy.equals(that.autoBundleOnDeploy) : that.autoBundleOnDeploy != null) return false;
            if (this.awsFlowRubySettings != null ? !this.awsFlowRubySettings.equals(that.awsFlowRubySettings) : that.awsFlowRubySettings != null) return false;
            if (this.dataSourceArn != null ? !this.dataSourceArn.equals(that.dataSourceArn) : that.dataSourceArn != null) return false;
            if (this.dataSourceDatabaseName != null ? !this.dataSourceDatabaseName.equals(that.dataSourceDatabaseName) : that.dataSourceDatabaseName != null) return false;
            if (this.dataSourceType != null ? !this.dataSourceType.equals(that.dataSourceType) : that.dataSourceType != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.documentRoot != null ? !this.documentRoot.equals(that.documentRoot) : that.documentRoot != null) return false;
            if (this.domains != null ? !this.domains.equals(that.domains) : that.domains != null) return false;
            if (this.enableSsl != null ? !this.enableSsl.equals(that.enableSsl) : that.enableSsl != null) return false;
            if (this.environment != null ? !this.environment.equals(that.environment) : that.environment != null) return false;
            if (this.railsEnv != null ? !this.railsEnv.equals(that.railsEnv) : that.railsEnv != null) return false;
            if (this.shortName != null ? !this.shortName.equals(that.shortName) : that.shortName != null) return false;
            if (this.sslConfiguration != null ? !this.sslConfiguration.equals(that.sslConfiguration) : that.sslConfiguration != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.stackId.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.appSource != null ? this.appSource.hashCode() : 0);
            result = 31 * result + (this.autoBundleOnDeploy != null ? this.autoBundleOnDeploy.hashCode() : 0);
            result = 31 * result + (this.awsFlowRubySettings != null ? this.awsFlowRubySettings.hashCode() : 0);
            result = 31 * result + (this.dataSourceArn != null ? this.dataSourceArn.hashCode() : 0);
            result = 31 * result + (this.dataSourceDatabaseName != null ? this.dataSourceDatabaseName.hashCode() : 0);
            result = 31 * result + (this.dataSourceType != null ? this.dataSourceType.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.documentRoot != null ? this.documentRoot.hashCode() : 0);
            result = 31 * result + (this.domains != null ? this.domains.hashCode() : 0);
            result = 31 * result + (this.enableSsl != null ? this.enableSsl.hashCode() : 0);
            result = 31 * result + (this.environment != null ? this.environment.hashCode() : 0);
            result = 31 * result + (this.railsEnv != null ? this.railsEnv.hashCode() : 0);
            result = 31 * result + (this.shortName != null ? this.shortName.hashCode() : 0);
            result = 31 * result + (this.sslConfiguration != null ? this.sslConfiguration.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
